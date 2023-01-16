package com.ruoyi.quartz.async;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.core.domain.entity.SysDictData;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.NumFormatUtil;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.http.HttpUtils;
import com.ruoyi.investment.domain.*;
import com.ruoyi.investment.mapper.*;
import com.ruoyi.quartz.task.RyTask;
import com.ruoyi.quartz.util.TaskUtils;
import com.ruoyi.system.domain.SysArea;
import com.ruoyi.system.mapper.SysAreaMapper;
import com.ruoyi.system.mapper.SysDictDataMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.Field;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;


/**
 * @describe:@Async注解开启异步线程示例
 * @author: weny.yang
 * @date: 2021-08-22 13:53
 */
@Slf4j
@Component
@Async("investmentDataThreadPoolTaskExecutor")
public class InvestmentDataAsyncTask {

    @Resource
    private InvStockMapper invStockMapper;
    @Resource
    private InvCompanyMapper invCompanyMapper;
    @Resource
    private InvCompanyIndustryMapper invCompanyIndustryMapper;
    @Resource
    private InvCompanyAddressMapper invCompanyAddressMapper;
    @Resource
    private InvFinanceReportDateMapper invFinanceReportDateMapper;
    @Resource
    private InvFinanceZyzbMapper invFinanceZyzbMapper;
    @Resource
    private InvFinanceDbfxMapper invFinanceDbfxMapper;
    @Resource
    private InvFinanceZcfzMapper invFinanceZcfzMapper;
    @Resource
    private InvFinanceLrMapper invFinanceLrMapper;
    @Resource
    private InvFinanceXjllMapper invFinanceXjllMapper;
    @Resource
    private InvFinanceBfbMapper invFinanceBfbMapper;


    /**
     * 公司概况 任务
     */
    public void invCompanyTask(InvStock stock, String url, AtomicInteger count) {
        String urlStr = url;
        try {
            url = url.replace("code=", "code=" + stock.getMarket() + stock.getCode());
            String result = HttpUtils.sendGet(url, new AtomicInteger(10));
            if (StringUtils.isNotEmpty(result)) {
                JSONObject jsonObject = JSONObject.parseObject(result);
                Set<String> keySetOut = jsonObject.keySet();
                Map<String, String> map = new HashMap<>();
                for (String keyOut : keySetOut) {
                    Object obj = jsonObject.get(keyOut);
                    if (obj instanceof JSONArray) {
                        JSONArray jsonArray = (JSONArray) obj;
                        Iterator<Object> iterator = jsonArray.iterator();
                        while (iterator.hasNext()) {
                            JSONObject next = (JSONObject) iterator.next();
                            Set<String> keySetInner = next.keySet();
                            for (String keyInner : keySetInner) {
                                String value = String.valueOf(next.get(keyInner));
                                if (StringUtils.isNotEmpty(value) && !"null".equals(value)) {
                                    map.put(keyInner, value);
                                }
                            }
                        }
                    }
                }

                InvCompany invCompany = new InvCompany(stock.getCode());
                Class<? extends InvCompany> invCompanyClass = invCompany.getClass();
                Field[] declaredFields = invCompanyClass.getDeclaredFields();
                for (Field field : declaredFields) {
                    field.setAccessible(true);
                    String genericType = field.getGenericType().toString();
                    String fieldName = field.getName();
                    String valueString = map.get(StringUtils.toUnderScoreCase(fieldName).toUpperCase());
                    if (!"code".equals(fieldName) && StringUtils.isNotEmpty(valueString)) {
                        if ("class java.lang.Double".equals(genericType)) {
                            Double value = NumFormatUtil.toDouble(valueString);
                            field.set(invCompany, value);
                        }
                        if ("class java.util.Date".equals(genericType)) {
                            Date value = DateUtils.parseDate(valueString);
                            field.set(invCompany, value);
                        }
                        if ("class java.lang.String".equals(genericType)) {
                            field.set(invCompany, valueString);
                        }
                    }
                }
                InvCompany compare = invCompanyMapper.selectInvCompanyByCode(stock.getCode());
                if (null == compare) {
                    invCompanyMapper.insertInvCompany(invCompany);
                } else {
                    if (!invCompany.equals(compare)) {
                        invCompanyMapper.updateInvCompany(invCompany);
                    }
                }
            }
        } catch (Exception e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                invCompanyTask(stock, urlStr, count);
            } else {
                log.error(">>>异常:", e);
            }
        }
    }

    /**
     * 行业
     */
    public void invIndustryTask(InvCompany company, String type, AtomicInteger count) {
        try {
            String industry = null;
            if ("csrc".equals(type)) {
                industry = company.getIndustrycsrc1();
            }
            if ("em".equals(type)) {
                industry = company.getEm2016();
            }
            if (StringUtils.isNotEmpty(industry)) {
                String[] industrys = industry.split("-");
                for (int i = 0; i < industrys.length; i++) {
                    int level = i + 1;
                    String name = industrys[i];
                    String shortName = name.replace("业", "");
                    String mergeName = "";
                    for (int j = 0; j <= i; j++) {
                        if (StringUtils.isNotEmpty(mergeName)) {
                            mergeName = mergeName + "-" + industrys[j];
                        } else {
                            mergeName = industrys[j];
                        }
                    }
                    InvIndustry invIndustry = new InvIndustry();
                    invIndustry.setShortName(shortName);
                    invIndustry.setName(name);
                    invIndustry.setType(type);
                    invIndustry.setLevel(level);
                    invIndustry.setMergeName(mergeName);
                    RyTask.invIndustrySet.add(invIndustry);
                }
            }
        } catch (Exception e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                invIndustryTask(company, type, count);
            } else {
                log.error(">>>异常:", e);
            }
        }
    }

    /**
     * 公司所属行业
     */
    public void invCompanyIndustry(InvCompany company, Map<String, InvIndustry> invIndustryMap, String type, AtomicInteger count) {
        try {
            String industry = null;
            if ("csrc".equals(type)) {
                industry = company.getIndustrycsrc1();
            }
            if ("em".equals(type)) {
                industry = company.getEm2016();
            }
            if (StringUtils.isNotEmpty(industry)) {
                InvCompanyIndustry invCompanyIndustry = new InvCompanyIndustry();
                invCompanyIndustry.setCode(company.getCode());
                invCompanyIndustry.setType(type);
                List<InvCompanyIndustry> invCompanyIndustries = invCompanyIndustryMapper.selectInvCompanyIndustryList(invCompanyIndustry);

                String[] industryCsrcs = industry.split("-");
                for (int i = 0; i < industryCsrcs.length; i++) {
                    int level = i + 1;
                    String mergeName = "";
                    for (int j = 0; j <= i; j++) {
                        if (StringUtils.isNotEmpty(mergeName)) {
                            mergeName = mergeName + "-" + industryCsrcs[j];
                        } else {
                            mergeName = industryCsrcs[j];
                        }
                    }

                    String key = mergeName + type + level;
                    if (invIndustryMap.containsKey(key)) {
                        Integer invIndustryId = invIndustryMap.get(key).getId();
                        if (level == 1) {
                            invCompanyIndustry.setLevel1(invIndustryId);
                        }
                        if (level == 2) {
                            invCompanyIndustry.setLevel2(invIndustryId);
                        }
                        if (level == 3) {
                            invCompanyIndustry.setLevel3(invIndustryId);
                        }
                        if (level == 4) {
                            invCompanyIndustry.setLevel4(invIndustryId);
                        }
                    }
                }

                if (null==invCompanyIndustries || invCompanyIndustries.size()==0){
                    invCompanyIndustryMapper.insertInvCompanyIndustry(invCompanyIndustry);
                }else{
                    InvCompanyIndustry has = invCompanyIndustries.get(0);
                    if (!has.equals(invCompanyIndustry)){
                        has.setLevel1(invCompanyIndustry.getLevel1());
                        has.setLevel2(invCompanyIndustry.getLevel2());
                        has.setLevel3(invCompanyIndustry.getLevel3());
                        has.setLevel4(invCompanyIndustry.getLevel4());
                        invCompanyIndustryMapper.updateInvCompanyIndustry(has);
                    }
                }
            }
        } catch (Exception e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                invCompanyIndustry(company, invIndustryMap, type, count);
            } else {
                log.error(">>>异常:", e);
            }
        }
    }

    /**
     * 公司办公地址、注册地址
     */
    public void invCompanyAddress(InvCompany company, Map<String, SysArea> sysAreasMap, AtomicInteger count) {
        try {
            InvCompanyAddress invCompanyAddress = new InvCompanyAddress();
            invCompanyAddress.setCode(company.getCode());
            invCompanyAddress.setType("W");
            List<InvCompanyAddress> invCompanyAddresses = invCompanyAddressMapper.selectInvCompanyAddressList(invCompanyAddress);

            String provinceName = company.getProvince();
            String provinceShortKey = provinceName + "1";
            if (sysAreasMap.containsKey(provinceShortKey)){
                SysArea sysArea = sysAreasMap.get(provinceShortKey);
                invCompanyAddress.setProvince(sysArea.getId());
            }
            if (null==invCompanyAddresses || invCompanyAddresses.size()==0){
                invCompanyAddressMapper.insertInvCompanyAddress(invCompanyAddress);
            }else{
                InvCompanyAddress has = invCompanyAddresses.get(0);
                if (!has.equals(invCompanyAddress)){
                    has.setProvince(invCompanyAddress.getProvince());
                    invCompanyAddressMapper.updateInvCompanyAddress(has);
                }
            }
        } catch (Exception e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                invCompanyAddress(company, sysAreasMap, count);
            } else {
                log.error(">>>异常:" + company.getCode(), e);
            }
        }
    }

    /**
     * 财务分析-报告日期 任务
     */
    public void invFinanceReportDateTask(InvStock stock, String url, String financeType, String reportType, AtomicInteger count) {
        String urlStr = url;
        try {
            /*
            1.如果公司类型为空，先初始化公司类型
            2.初始化报告日期
             */
            String companyType = stock.getStockType();
            if (null != companyType) {
                url = url.replace("code=", "code=" + stock.getMarket() + stock.getCode());
                url = url.replace("companyType=", "companyType=" + companyType);
                String result = HttpUtils.sendGet(url, new AtomicInteger(10));
                if (StringUtils.isNotEmpty(result)) {
                    JSONObject jsonObject = JSONObject.parseObject(result);
                    Set<String> keySet = jsonObject.keySet();
                    for (String key : keySet) {
                        Object obj = jsonObject.get(key);
                        if (obj instanceof JSONArray) {
                            JSONArray jsonArray = (JSONArray) obj;
                            if (!jsonArray.isEmpty()) {
                                //1.查询当前股票已经落数的报告日期集合
                                List<InvFinanceReportDate> reportDateList = invFinanceReportDateMapper.selectInvFinanceReportDateList(new InvFinanceReportDate(stock.getCode(), financeType, reportType));
                                List<String> dateList = new ArrayList<>();
                                for (InvFinanceReportDate reportDate : reportDateList) {
                                    dateList.add(DateUtils.dateTime(reportDate.getReportDate()));
                                }
                                //2.保存报告日期
                                Iterator<Object> iterator = jsonArray.iterator();
                                while (iterator.hasNext()) {
                                    String report_date = ((JSONObject) iterator.next()).getString("REPORT_DATE").substring(0, 10);
                                    if (!dateList.contains(report_date)) {
                                        invFinanceReportDateMapper.insertInvFinanceReportDate(new InvFinanceReportDate(stock.getCode(), financeType, reportType, DateUtils.dateTime(DateUtils.YYYY_MM_DD, report_date)));
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                for (int i = 1; i < 20; i++) {//目前财富通为1-4类
                    url = url.replace("code=", "code=" + stock.getMarket() + stock.getCode());
                    url = url.replace("companyType=", "companyType=" + String.valueOf(i));
                    String result = HttpUtils.sendGet(url, new AtomicInteger(10));
                    //调用完接口链接后回退到原始链接
                    url = url.replace("companyType=" + i, "companyType=");
                    if (StringUtils.isNotEmpty(result)) {
                        JSONObject jsonObject = JSONObject.parseObject(result);
                        Set<String> keySet = jsonObject.keySet();
                        for (String key : keySet) {
                            Object obj = jsonObject.get(key);
                            if (obj instanceof JSONArray) {
                                JSONArray jsonArray = (JSONArray) obj;
                                if (!jsonArray.isEmpty()) {
                                    //1.查询当前股票已经落数的报告日期集合
                                    List<InvFinanceReportDate> reportDateList = invFinanceReportDateMapper.selectInvFinanceReportDateList(new InvFinanceReportDate(stock.getCode(), financeType, reportType));
                                    List<String> dateList = new ArrayList<>();
                                    for (InvFinanceReportDate reportDate : reportDateList) {
                                        dateList.add(DateUtils.dateTime(reportDate.getReportDate()));
                                    }
                                    //2.更新股票类型
                                    stock.setStockType(String.valueOf(i));
                                    invStockMapper.updateInvStock(stock);
                                    //3.保存报告日期
                                    Iterator<Object> iterator = jsonArray.iterator();
                                    while (iterator.hasNext()) {
                                        String report_date = ((JSONObject) iterator.next()).getString("REPORT_DATE").substring(0, 10);
                                        if (!dateList.contains(report_date)) {
                                            invFinanceReportDateMapper.insertInvFinanceReportDate(new InvFinanceReportDate(stock.getCode(), financeType, reportType, DateUtils.dateTime(DateUtils.YYYY_MM_DD, report_date)));
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                invFinanceReportDateTask(stock, urlStr, financeType, reportType, count);
            } else {
                log.error(">>>异常:", e);
            }
        }
    }

    /**
     * 财务分析-重要指标 任务
     */
    public void invFinanceZyzbTask(InvStock stock, String url, String reportType, AtomicInteger count) {
        String urlStr = url;
        try {
            url = url.replace("code=", "code=" + stock.getMarket() + stock.getCode());
            String result = HttpUtils.sendGet(url, new AtomicInteger(10));
            if (StringUtils.isNotEmpty(result)) {
                JSONObject jsonObject = JSONObject.parseObject(result);
                Set<String> keySet = jsonObject.keySet();
                for (String key : keySet) {
                    Object obj = jsonObject.get(key);
                    if (obj instanceof JSONArray) {
                        JSONArray jsonArray = (JSONArray) obj;
                        if (!jsonArray.isEmpty()) {
                            List<InvFinanceZyzb> entityList = invFinanceZyzbMapper.selectInvFinanceZyzbList(new InvFinanceZyzb(stock.getCode(), reportType));
                            Map<String, InvFinanceZyzb> entityMap = new HashMap<>();
                            for (InvFinanceZyzb entity : entityList) {
                                entityMap.put(entity.getReportDate().toString(), entity);
                            }
                            Iterator<Object> iterator = jsonArray.iterator();
                            while (iterator.hasNext()) {
                                JSONObject next = (JSONObject) iterator.next();
                                //反射赋值
                                InvFinanceZyzb entity = new InvFinanceZyzb(stock.getCode(), reportType);
                                Class<? extends InvFinanceZyzb> clazz = entity.getClass();
                                Field[] declaredFields = clazz.getDeclaredFields();
                                for (Field field : declaredFields) {
                                    field.setAccessible(true);
                                    String genericType = field.getGenericType().toString();
                                    String fieldName = field.getName();
                                    if (!"reportType".equals(fieldName)) {
                                        String valueString = next.getString(StringUtils.toUnderScoreCase(fieldName).toUpperCase());
                                        if ("class java.lang.Double".equals(genericType)) {
                                            Double value = NumFormatUtil.toDouble(valueString);
                                            field.set(entity, value);
                                        }
                                        if ("class java.util.Date".equals(genericType)) {
                                            Date value = DateUtils.parseDate(valueString);
                                            field.set(entity, value);
                                        }
                                        if ("class java.lang.String".equals(genericType)) {
                                            field.set(entity, valueString);
                                        }
                                    }
                                }
                                if (entityMap.containsKey(entity.getReportDate().toString())) {//数据库已有code指定日期报告
                                    InvFinanceZyzb companies = entityMap.get(entity.getReportDate().toString());
                                    if (!companies.equals(entity)) {//报告数据不相同，以最新获取为准更新数据库
                                        entity.setId(companies.getId());
                                        invFinanceZyzbMapper.updateInvFinanceZyzb(entity);
                                    }
                                } else {//数据库没有code指定日期报告，插入
                                    invFinanceZyzbMapper.insertInvFinanceZyzb(entity);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                invFinanceZyzbTask(stock, urlStr, reportType, count);
            } else {
                log.error(">>>异常:", e);
            }
        }
    }

    /**
     * 财务分析-杜邦分析 任务
     */
    public void invFinanceDbfxTask(InvStock stock, String url, AtomicInteger count) {
        String urlStr = url;
        try {
            url = url.replace("code=", "code=" + stock.getMarket() + stock.getCode());
            String result = HttpUtils.sendGet(url, new AtomicInteger(10));
            if (StringUtils.isNotEmpty(result)) {
                JSONObject jsonObject = JSONObject.parseObject(result);
                Set<String> reportTypes = jsonObject.keySet();
                for (String reportType : reportTypes) {
                    JSONArray jsonArray = jsonObject.getJSONArray(reportType);
                    if (!jsonArray.isEmpty()) {
                        List<InvFinanceDbfx> entityList = invFinanceDbfxMapper.selectInvFinanceDbfxList(new InvFinanceDbfx(stock.getCode(), reportType));
                        Map<String, InvFinanceDbfx> entityMap = new HashMap<>();
                        for (InvFinanceDbfx entity : entityList) {
                            entityMap.put(entity.getReportDate().toString(), entity);
                        }
                        Iterator<Object> iterator = jsonArray.iterator();
                        while (iterator.hasNext()) {
                            JSONObject next = (JSONObject) iterator.next();
                            //反射赋值
                            InvFinanceDbfx entity = new InvFinanceDbfx(stock.getCode(), reportType);
                            Class<? extends InvFinanceDbfx> clazz = entity.getClass();
                            Field[] declaredFields = clazz.getDeclaredFields();
                            for (Field field : declaredFields) {
                                field.setAccessible(true);
                                String genericType = field.getGenericType().toString();
                                String fieldName = field.getName();
                                if (!"reportType".equals(fieldName)) {
                                    String valueString = next.getString(StringUtils.toUnderScoreCase(fieldName).toUpperCase());
                                    if ("class java.lang.Double".equals(genericType)) {
                                        Double value = NumFormatUtil.toDouble(valueString);
                                        field.set(entity, value);
                                    }
                                    if ("class java.util.Date".equals(genericType)) {
                                        Date value = DateUtils.parseDate(valueString);
                                        field.set(entity, value);
                                    }
                                    if ("class java.lang.String".equals(genericType)) {
                                        field.set(entity, valueString);
                                    }
                                }
                            }
                            if (entityMap.containsKey(entity.getReportDate().toString())) {//数据库已有code指定日期报告
                                InvFinanceDbfx companies = entityMap.get(entity.getReportDate().toString());
                                if (!companies.equals(entity)) {//报告数据不相同，以最新获取为准更新数据库
                                    entity.setId(companies.getId());
                                    invFinanceDbfxMapper.updateInvFinanceDbfx(entity);
                                }
                            } else {//数据库没有code指定日期报告，插入
                                invFinanceDbfxMapper.insertInvFinanceDbfx(entity);
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                invFinanceDbfxTask(stock, urlStr, count);
            } else {
                log.error(">>>异常:", e);
            }
        }
    }

    /**
     * 财务分析-资产负债 任务
     */
    public void invFinanceZcfzTask(InvStock stock, String url, String financeType, String reportType, List<SysDictData> dictDatas, AtomicInteger count) {
        String urlStr = url;
        try {
            /*
            1.最近的5期进行数据同步，如果和数据库一致则跳过，不一致则更新
            2.超过5期的其他的如果数据库不存在则新增，如果存在则不再同步
            */
            String companyType = stock.getStockType();
            List<String> dateList = new ArrayList<String>();
            List<InvFinanceReportDate> reportDateList = invFinanceReportDateMapper.selectInvFinanceReportDateList(new InvFinanceReportDate(stock.getCode(), financeType, reportType));
            for (InvFinanceReportDate reportDate : reportDateList) {
                dateList.add(DateUtils.dateTime(reportDate.getReportDate()));
            }
            if (null != companyType && dateList.size() > 0) {
                List<InvFinanceZcfz> entityList = new ArrayList<InvFinanceZcfz>();
                entityList.addAll(invFinanceZcfzMapper.selectInvFinanceZcfzList(new InvFinanceZcfz(stock.getCode(), reportType)));
                Map<String, InvFinanceZcfz> entityMap = new HashMap<String, InvFinanceZcfz>();
                for (int i = 0; i < entityList.size(); i++) {
                    InvFinanceZcfz zcfz = entityList.get(i);
                    if (i < 5) {
                        entityMap.put(zcfz.getReportDate().toString(), zcfz);
                    } else {
                        dateList.remove(DateUtils.parseDateToStr(DateUtils.YYYY_MM_DD, zcfz.getReportDate()));
                    }
                }
                //每次从dateList中取5条数据拼接
                int toIndex = 5;
                for (int i = 0; i < dateList.size(); i += 5) {
                    if (i + 5 > dateList.size()) {
                        toIndex = dateList.size() - i;
                    }
                    StringBuilder datesSb = new StringBuilder();
                    for (String date : dateList.subList(i, i + toIndex)) {
                        if (datesSb.length() > 0) {
                            datesSb.append("%2C").append(date);
                        } else {
                            datesSb.append(date);
                        }
                    }
                    url = url.replace("code=", "code=" + stock.getMarket() + stock.getCode());
                    url = url.replace("companyType=", "companyType=" + stock.getStockType());
                    url = url.replace("dates=", "dates=" + datesSb);
                    String result = HttpUtils.sendGet(url, new AtomicInteger(10));
                    //调用完接口链接后回退到原始链接
                    url = url.replace("dates=" + datesSb, "dates=");
                    if (StringUtils.isNotEmpty(result)) {
                        JSONObject jsonObject = JSONObject.parseObject(result);
                        Set<String> keySet = jsonObject.keySet();
                        for (String key : keySet) {
                            Object obj = jsonObject.get(key);
                            if (obj instanceof JSONArray) {
                                JSONArray jsonArray = (JSONArray) obj;
                                if (!jsonArray.isEmpty()) {
                                    //1.更新Stock 的 组织代码orgCode 组织简称orgType 股票分类代码securityTypeCode
                                    boolean updateStockFlag = false;
                                    JSONObject jsonObj = (JSONObject) jsonArray.get(0);
                                    if (StringUtils.isEmpty(stock.getOrgCode())) {
                                        stock.setOrgCode(jsonObj.getString("ORG_CODE"));
                                        updateStockFlag = true;
                                    }
                                    if (StringUtils.isEmpty(stock.getSecurityTypeCode())) {
                                        stock.setSecurityTypeCode(jsonObj.getString("SECURITY_TYPE_CODE"));
                                        updateStockFlag = true;
                                    }
                                    if (updateStockFlag) {
                                        invStockMapper.updateInvStock(stock);
                                    }

                                    //2.保存资产负债数据
                                    Iterator<Object> iterator = jsonArray.iterator();
                                    while (iterator.hasNext()) {
                                        //反射赋值
                                        InvFinanceZcfz entity = new InvFinanceZcfz(stock.getCode(), reportType);
                                        Class<? extends InvFinanceZcfz> clazz = entity.getClass();
                                        Field[] declaredFields = clazz.getDeclaredFields();
                                        JSONObject next = (JSONObject) iterator.next();
                                        for (Field field : declaredFields) {
                                            field.setAccessible(true);
                                            String genericType = field.getGenericType().toString();
                                            String fieldName = field.getName();
                                            if (!"reportType".equals(fieldName)) {
                                                String valueString = next.getString(StringUtils.toUnderScoreCase(fieldName).toUpperCase());
                                                if ("class java.lang.Double".equals(genericType)) {
                                                    Double value = NumFormatUtil.toDouble(valueString);
                                                    field.set(entity, value);
                                                }
                                                if ("class java.util.Date".equals(genericType)) {
                                                    Date value = DateUtils.parseDate(valueString);
                                                    field.set(entity, value);
                                                }
                                                if ("class java.lang.String".equals(genericType)) {
                                                    //审计意见字典数据匹配
                                                    if (StringUtils.isNotEmpty(valueString) && ("opinionType".equals(fieldName) || "osopinionType".equals(fieldName))) {
                                                        for (SysDictData dict : dictDatas) {
                                                            if (dict.getDictLabel().equals(valueString)) {
                                                                field.set(entity, dict.getDictValue());
                                                            }
                                                        }
                                                        if (StringUtils.isEmpty((String) field.get(entity))) {
                                                            log.error(">>>invFinanceZcfzTask任务:" + entity.getSecurityCode() + " " + entity.getReportType() + " " + entity.getReportDate() + " 对应的审计意见:" + valueString + " 不在字典表opinion_type内，请添加");
                                                        }
                                                    } else {
                                                        field.set(entity, valueString);
                                                    }
                                                }
                                            }
                                        }
                                        if (entityMap.containsKey(entity.getReportDate().toString())) {//数据库已有code指定日期报告
                                            InvFinanceZcfz companies = entityMap.get(entity.getReportDate().toString());
                                            if (!companies.equals(entity)) {//报告数据不相同，以最新获取为准更新数据库
                                                entity.setId(companies.getId());
                                                invFinanceZcfzMapper.updateInvFinanceZcfz(entity);
                                            }
                                        } else {//数据库没有code指定日期报告，插入
                                            invFinanceZcfzMapper.insertInvFinanceZcfz(entity);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                invFinanceZcfzTask(stock, urlStr, financeType, reportType, dictDatas, count);
            } else {
                log.error(">>>异常:", e);
            }
        }
    }

    /**
     * 财务分析-利润 任务
     */
    public void invFinanceLrTask(InvStock stock, String url, String financeType, String reportType, List<SysDictData> dictDatas, AtomicInteger count) {
        String urlStr = url;
        try {
            /*
            1.最近的5期进行数据同步，如果和数据库一致则跳过，不一致则更新
            2.超过5期的其他的如果数据库不存在则新增，如果存在则不再同步
            */
            String companyType = stock.getStockType();
            List<String> dateList = new ArrayList<String>();
            List<InvFinanceReportDate> reportDateList = invFinanceReportDateMapper.selectInvFinanceReportDateList(new InvFinanceReportDate(stock.getCode(), financeType, reportType));
            for (InvFinanceReportDate reportDate : reportDateList) {
                dateList.add(DateUtils.dateTime(reportDate.getReportDate()));
            }
            if (null != companyType && dateList.size() > 0) {
                List<InvFinanceLr> entityList = new ArrayList<InvFinanceLr>();
                entityList.addAll(invFinanceLrMapper.selectInvFinanceLrList(new InvFinanceLr(stock.getCode(), reportType)));
                Map<String, InvFinanceLr> entityMap = new HashMap<String, InvFinanceLr>();
                for (int i = 0; i < entityList.size(); i++) {
                    InvFinanceLr lr = entityList.get(i);
                    if (i < 5) {
                        entityMap.put(lr.getReportDate().toString(), lr);
                    } else {
                        dateList.remove(DateUtils.parseDateToStr(DateUtils.YYYY_MM_DD, lr.getReportDate()));
                    }
                }
                //每次从dateList中取5条数据拼接
                int toIndex = 5;
                for (int i = 0; i < dateList.size(); i += 5) {
                    if (i + 5 > dateList.size()) {
                        toIndex = dateList.size() - i;
                    }
                    StringBuilder datesSb = new StringBuilder();
                    for (String date : dateList.subList(i, i + toIndex)) {
                        if (datesSb.length() > 0) {
                            datesSb.append("%2C").append(date);
                        } else {
                            datesSb.append(date);
                        }
                    }
                    url = url.replace("code=", "code=" + stock.getMarket() + stock.getCode());
                    url = url.replace("companyType=", "companyType=" + stock.getStockType());
                    url = url.replace("dates=", "dates=" + datesSb);
                    String result = HttpUtils.sendGet(url, new AtomicInteger(10));
                    //调用完接口链接后回退到原始链接
                    url = url.replace("dates=" + datesSb, "dates=");
                    if (StringUtils.isNotEmpty(result)) {
                        JSONObject jsonObject = JSONObject.parseObject(result);
                        Set<String> keySet = jsonObject.keySet();
                        for (String key : keySet) {
                            Object obj = jsonObject.get(key);
                            if (obj instanceof JSONArray) {
                                JSONArray jsonArray = (JSONArray) obj;
                                if (!jsonArray.isEmpty()) {
                                    //1.更新Stock 的 组织代码orgCode 组织简称orgType 股票分类代码securityTypeCode
                                    boolean updateStockFlag = false;
                                    JSONObject jsonObj = (JSONObject) jsonArray.get(0);
                                    if (StringUtils.isEmpty(stock.getOrgCode())) {
                                        stock.setOrgCode(jsonObj.getString("ORG_CODE"));
                                        updateStockFlag = true;
                                    }
                                    if (StringUtils.isEmpty(stock.getSecurityTypeCode())) {
                                        stock.setSecurityTypeCode(jsonObj.getString("SECURITY_TYPE_CODE"));
                                        updateStockFlag = true;
                                    }
                                    if (updateStockFlag) {
                                        invStockMapper.updateInvStock(stock);
                                    }

                                    //2.保存利润数据
                                    Iterator<Object> iterator = jsonArray.iterator();
                                    while (iterator.hasNext()) {
                                        //反射赋值
                                        InvFinanceLr entity = new InvFinanceLr(stock.getCode(), reportType);
                                        Class<? extends InvFinanceLr> clazz = entity.getClass();
                                        Field[] declaredFields = clazz.getDeclaredFields();
                                        JSONObject next = (JSONObject) iterator.next();
                                        for (Field field : declaredFields) {
                                            field.setAccessible(true);
                                            String genericType = field.getGenericType().toString();
                                            String fieldName = field.getName();
                                            if (!"reportType".equals(fieldName)) {
                                                String valueString = next.getString(StringUtils.toUnderScoreCase(fieldName).toUpperCase());
                                                if ("class java.lang.Double".equals(genericType)) {
                                                    Double value = NumFormatUtil.toDouble(valueString);
                                                    field.set(entity, value);
                                                }
                                                if ("class java.util.Date".equals(genericType)) {
                                                    Date value = DateUtils.parseDate(valueString);
                                                    field.set(entity, value);
                                                }
                                                if ("class java.lang.String".equals(genericType)) {
                                                    //审计意见字典匹配
                                                    if (StringUtils.isNotEmpty(valueString) && ("opinionType".equals(fieldName) || "osopinionType".equals(fieldName))) {
                                                        for (SysDictData dict : dictDatas) {
                                                            if (dict.getDictLabel().equals(valueString)) {
                                                                field.set(entity, dict.getDictValue());
                                                            }
                                                        }
                                                        if (StringUtils.isEmpty((String) field.get(entity))) {
                                                            log.error(">>>invFinanceLrTask任务:" + entity.getSecurityCode() + " " + entity.getReportType() + " " + entity.getReportDate() + " 对应的审计意见:" + valueString + " 不在字典表opinion_type内，请添加");
                                                        }
                                                    } else {
                                                        field.set(entity, valueString);
                                                    }
                                                }
                                            }
                                        }
                                        if (entityMap.containsKey(entity.getReportDate().toString())) {//数据库已有code指定日期报告
                                            InvFinanceLr companies = entityMap.get(entity.getReportDate().toString());
                                            if (!companies.equals(entity)) {//报告数据不相同，以最新获取为准更新数据库
                                                entity.setId(companies.getId());
                                                invFinanceLrMapper.updateInvFinanceLr(entity);
                                            }
                                        } else {//数据库没有code指定日期报告，插入
                                            invFinanceLrMapper.insertInvFinanceLr(entity);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                invFinanceLrTask(stock, urlStr, financeType, reportType, dictDatas, count);
            } else {
                log.error(">>>异常:", e);
            }
        }
    }

    /**
     * 财务分析-现金流量 任务
     */
    public void invFinanceXjllTask(InvStock stock, String url, String financeType, String reportType, List<SysDictData> dictDatas, AtomicInteger count) {
        String urlStr = url;
        try {
            /*
            1.最近的5期进行数据同步，如果和数据库一致则跳过，不一致则更新
            2.超过5期的其他的如果数据库不存在则新增，如果存在则不再同步
            */
            String companyType = stock.getStockType();
            List<String> dateList = new ArrayList<String>();
            List<InvFinanceReportDate> reportDateList = invFinanceReportDateMapper.selectInvFinanceReportDateList(new InvFinanceReportDate(stock.getCode(), financeType, reportType));
            for (InvFinanceReportDate reportDate : reportDateList) {
                dateList.add(DateUtils.dateTime(reportDate.getReportDate()));
            }
            if (null != companyType && dateList.size() > 0) {
                List<InvFinanceXjll> entityList = new ArrayList<InvFinanceXjll>();
                entityList.addAll(invFinanceXjllMapper.selectInvFinanceXjllList(new InvFinanceXjll(stock.getCode(), reportType)));
                Map<String, InvFinanceXjll> entityMap = new HashMap<String, InvFinanceXjll>();
                for (int i = 0; i < entityList.size(); i++) {
                    InvFinanceXjll xjll = entityList.get(i);
                    if (i < 5) {
                        entityMap.put(xjll.getReportDate().toString(), xjll);
                    } else {
                        dateList.remove(DateUtils.parseDateToStr(DateUtils.YYYY_MM_DD, xjll.getReportDate()));
                    }
                }
                //每次从dateList中取5条数据拼接
                int toIndex = 5;
                for (int i = 0; i < dateList.size(); i += 5) {
                    if (i + 5 > dateList.size()) {
                        toIndex = dateList.size() - i;
                    }
                    StringBuilder datesSb = new StringBuilder();
                    for (String date : dateList.subList(i, i + toIndex)) {
                        if (datesSb.length() > 0) {
                            datesSb.append("%2C").append(date);
                        } else {
                            datesSb.append(date);
                        }
                    }
                    url = url.replace("code=", "code=" + stock.getMarket() + stock.getCode());
                    url = url.replace("companyType=", "companyType=" + stock.getStockType());
                    url = url.replace("dates=", "dates=" + datesSb);
                    String result = HttpUtils.sendGet(url, new AtomicInteger(10));
                    //调用完接口链接后回退到原始链接
                    url = url.replace("dates=" + datesSb, "dates=");
                    if (StringUtils.isNotEmpty(result)) {
                        JSONObject jsonObject = JSONObject.parseObject(result);
                        Set<String> keySet = jsonObject.keySet();
                        for (String key : keySet) {
                            Object obj = jsonObject.get(key);
                            if (obj instanceof JSONArray) {
                                JSONArray jsonArray = (JSONArray) obj;
                                if (!jsonArray.isEmpty()) {
                                    //1.更新Stock 的 组织代码orgCode 组织简称orgType 股票分类代码securityTypeCode
                                    boolean updateStockFlag = false;
                                    JSONObject jsonObj = (JSONObject) jsonArray.get(0);
                                    if (StringUtils.isEmpty(stock.getOrgCode())) {
                                        stock.setOrgCode(jsonObj.getString("ORG_CODE"));
                                        updateStockFlag = true;
                                    }
                                    if (StringUtils.isEmpty(stock.getSecurityTypeCode())) {
                                        stock.setSecurityTypeCode(jsonObj.getString("SECURITY_TYPE_CODE"));
                                        updateStockFlag = true;
                                    }
                                    if (updateStockFlag) {
                                        invStockMapper.updateInvStock(stock);
                                    }

                                    //2.保存利润数据
                                    Iterator<Object> iterator = jsonArray.iterator();
                                    while (iterator.hasNext()) {
                                        //反射赋值
                                        InvFinanceXjll entity = new InvFinanceXjll(stock.getCode(), reportType);
                                        Class<? extends InvFinanceXjll> clazz = entity.getClass();
                                        Field[] declaredFields = clazz.getDeclaredFields();
                                        JSONObject next = (JSONObject) iterator.next();
                                        for (Field field : declaredFields) {
                                            field.setAccessible(true);
                                            String genericType = field.getGenericType().toString();
                                            String fieldName = field.getName();
                                            if (!"reportType".equals(fieldName)) {
                                                String valueString = next.getString(StringUtils.toUnderScoreCase(fieldName).toUpperCase());
                                                if ("class java.lang.Double".equals(genericType)) {
                                                    Double value = NumFormatUtil.toDouble(valueString);
                                                    field.set(entity, value);
                                                }
                                                if ("class java.util.Date".equals(genericType)) {
                                                    Date value = DateUtils.parseDate(valueString);
                                                    field.set(entity, value);
                                                }
                                                if ("class java.lang.String".equals(genericType)) {
                                                    //审计意见字典匹配
                                                    if (StringUtils.isNotEmpty(valueString) && ("opinionType".equals(fieldName) || "osopinionType".equals(fieldName))) {
                                                        for (SysDictData dict : dictDatas) {
                                                            if (dict.getDictLabel().equals(valueString)) {
                                                                field.set(entity, dict.getDictValue());
                                                            }
                                                        }
                                                        if (StringUtils.isEmpty((String) field.get(entity))) {
                                                            log.error(">>>invFinanceXjllTask任务:" + entity.getSecurityCode() + " " + entity.getReportType() + " " + entity.getReportDate() + " 对应的审计意见:" + valueString + " 不在字典表opinion_type内，请添加");
                                                        }
                                                    } else {
                                                        field.set(entity, valueString);
                                                    }
                                                }
                                            }
                                        }
                                        if (entityMap.containsKey(entity.getReportDate().toString())) {//数据库已有code指定日期报告
                                            InvFinanceXjll companies = entityMap.get(entity.getReportDate().toString());
                                            if (!companies.equals(entity)) {//报告数据不相同，以最新获取为准更新数据库
                                                entity.setId(companies.getId());
                                                invFinanceXjllMapper.updateInvFinanceXjll(entity);
                                            }
                                        } else {//数据库没有code指定日期报告，插入
                                            invFinanceXjllMapper.insertInvFinanceXjll(entity);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                invFinanceXjllTask(stock, urlStr, financeType, reportType, dictDatas, count);
            } else {
                log.error(">>>异常:", e);
            }
        }
    }

    /**
     * 财务分析-百分比 任务
     */
    public void invFinanceBfbTask(InvStock stock, String url, String reportType, AtomicInteger count) {
        String urlStr = url;
        try {
            url = url.replace("code=", "code=" + stock.getMarket() + stock.getCode());
            url = url.replace("ctype=", "ctype=" + stock.getStockType());
            String result = HttpUtils.sendGet(url, new AtomicInteger(10));
            if (StringUtils.isNotEmpty(result)) {
                JSONObject jsonObject = JSONObject.parseObject(result);
                Set<String> keySet = jsonObject.keySet();
                for (String key : keySet) {
                    Object obj = jsonObject.get(key);
                    if (obj instanceof JSONArray) {
                        JSONArray jsonArray = (JSONArray) obj;
                        if (!jsonArray.isEmpty()) {
                            List<InvFinanceBfb> entitys = invFinanceBfbMapper.selectInvFinanceBfbList(new InvFinanceBfb(stock.getCode(), reportType));
                            Map<String, InvFinanceBfb> entityMap = new HashMap<>();
                            for (InvFinanceBfb entity : entitys) {
                                entityMap.put(entity.getReportDate().toString(), entity);
                            }
                            //反射赋值
                            List<InvFinanceBfb> entityList = new ArrayList<>();
                            for (int i = 0; i < jsonArray.size() - 1; i += 2) {
                                InvFinanceBfb entity = new InvFinanceBfb(stock.getCode(), reportType);
                                Class<? extends InvFinanceBfb> clazz = entity.getClass();

                                JSONObject next1 = jsonArray.getJSONObject(i);
                                JSONObject next2 = jsonArray.getJSONObject(i + 1);
                                Field[] declaredFields = clazz.getDeclaredFields();
                                for (Field field : declaredFields) {
                                    field.setAccessible(true);
                                    String genericType = field.getGenericType().toString();
                                    String fieldName = field.getName();
                                    fieldName = StringUtils.toUnderScoreCase(fieldName).toUpperCase();
                                    String valueString = null;
                                    if (!"REPORT_TYPE".equals(fieldName)) {
                                        if (!fieldName.endsWith("_YOY")) {//数据
                                            valueString = next1.getString(fieldName);
                                        }
                                        if (fieldName.endsWith("_YOY")) {//占比
                                            valueString = next2.getString(fieldName.replace("_YOY", ""));
                                        }
                                        if ("class java.lang.Double".equals(genericType)) {
                                            Double value = NumFormatUtil.toDouble(valueString);
                                            field.set(entity, value);
                                        }
                                        if ("class java.util.Date".equals(genericType)) {
                                            Date value = DateUtils.parseDate(valueString);
                                            field.set(entity, value);
                                        }
                                        if ("class java.lang.String".equals(genericType)) {
                                            field.set(entity, valueString);
                                        }
                                    }
                                }
                                entityList.add(entity);
                            }
                            for (InvFinanceBfb ent : entityList) {
                                if (entityMap.containsKey(ent.getReportDate().toString())) {//数据库已有code指定日期报告
                                    InvFinanceBfb companies = entityMap.get(ent.getReportDate().toString());
                                    if (!companies.equals(ent)) {//报告数据不相同，以最新获取为准更新数据库
                                        ent.setId(companies.getId());
                                        invFinanceBfbMapper.updateInvFinanceBfb(ent);
                                    }
                                } else {//数据库没有code指定日期报告，插入
                                    invFinanceBfbMapper.insertInvFinanceBfb(ent);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                invFinanceBfbTask(stock, urlStr, reportType, count);
            } else {
                log.error(">>>异常:", e);
            }
        }
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * 多线程获取接口字段
     */
    public void getInterfaceKey(InvStock stock, String dataUrl) {
        if (StringUtils.isNotEmpty(dataUrl)) TaskUtils.getInterfaceKey(stock, dataUrl);
    }

    /**
     * 多线程获取接口字段
     */
    public void getHtmlKey(InvStock stock, String htmlUrl, String name) {
        if (StringUtils.isNotEmpty(htmlUrl)) TaskUtils.getHtmlKey(stock, htmlUrl, name);
    }

    public static void main(String[] args) {
        String address = "北京市海淀区宝盛南路一号院奥北科技园26号楼领智中心A座7层;江苏省苏州市工业园区星海街200号星海国际广场12层";

        int 省 = address.indexOf("省");
        int 市 = address.indexOf("市");

        String province = address.substring(0, address.indexOf("省") + 1).replace("中国", "");
        String city = address.substring(address.indexOf("省") + 1, address.indexOf("市") + 1);
        System.out.println(province);
        System.out.println(city);
    }
}