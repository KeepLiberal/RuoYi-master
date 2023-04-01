package com.ruoyi.quartz.async.invData;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.core.domain.entity.SysDictData;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.NumFormatUtil;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.http.HttpUtils;
import com.ruoyi.investment.domain.*;
import com.ruoyi.investment.mapper.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.Field;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
@Component
@Async("invDataThreadPoolTaskExecutor")
public class InvDataFinanceAsyncTask {
    @Resource
    private InvStockMapper invStockMapper;
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
                if (StringUtils.isNotEmpty(result) && !result.contains("<title>无F10资料</title>")) {
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
                    url = url.replace("companyType=", "companyType=" + i);
                    String result = HttpUtils.sendGet(url, new AtomicInteger(10));
                    //调用完接口链接后回退到原始链接
                    url = urlStr;
                    if (StringUtils.isNotEmpty(result) && !result.contains("<title>无F10资料</title>")) {
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
            if (StringUtils.isNotEmpty(result) && !result.contains("<title>无F10资料</title>")) {
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
                                InvFinanceZyzb entity = new InvFinanceZyzb(stock.getCode(), reportType);
                                Class<? extends InvFinanceZyzb> clazz = entity.getClass();
                                Field[] declaredFields = clazz.getDeclaredFields();
                                for (Field field : declaredFields) {
                                    field.setAccessible(true);
                                    String genericType = field.getGenericType().toString();
                                    String fieldName = field.getName();
                                    if (!"reportType".equals(fieldName)) {
                                        String valueString = next.getString(StringUtils.toUnderScoreCase(fieldName).toUpperCase());
                                        valueString = StringUtils.isNotEmpty(valueString) ? valueString.trim() : null;
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
                                if (entityMap.containsKey(entity.getReportDate().toString())) {
                                    InvFinanceZyzb compare = entityMap.get(entity.getReportDate().toString());
                                    if (!compare.equals(entity)) {
                                        entity.setId(compare.getId());
                                        invFinanceZyzbMapper.updateInvFinanceZyzb(entity);
                                    }
                                } else {
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
            if (StringUtils.isNotEmpty(result) && !result.contains("<title>无F10资料</title>")) {
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
                            InvFinanceDbfx entity = new InvFinanceDbfx(stock.getCode(), reportType);
                            Class<? extends InvFinanceDbfx> clazz = entity.getClass();
                            Field[] declaredFields = clazz.getDeclaredFields();
                            for (Field field : declaredFields) {
                                field.setAccessible(true);
                                String genericType = field.getGenericType().toString();
                                String fieldName = field.getName();
                                if (!"reportType".equals(fieldName)) {
                                    String valueString = next.getString(StringUtils.toUnderScoreCase(fieldName).toUpperCase());
                                    valueString = StringUtils.isNotEmpty(valueString) ? valueString.trim() : null;
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
                            if (entityMap.containsKey(entity.getReportDate().toString())) {
                                InvFinanceDbfx compare = entityMap.get(entity.getReportDate().toString());
                                if (!compare.equals(entity)) {
                                    entity.setId(compare.getId());
                                    invFinanceDbfxMapper.updateInvFinanceDbfx(entity);
                                }
                            } else {
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
            List<String> dateList = new ArrayList<>();
            List<InvFinanceReportDate> reportDateList = invFinanceReportDateMapper.selectInvFinanceReportDateList(new InvFinanceReportDate(stock.getCode(), financeType, reportType));
            for (InvFinanceReportDate reportDate : reportDateList) {
                dateList.add(DateUtils.dateTime(reportDate.getReportDate()));
            }
            if (null != companyType && dateList.size() > 0) {
                List<InvFinanceZcfz> entityList = new ArrayList<>();
                entityList.addAll(invFinanceZcfzMapper.selectInvFinanceZcfzList(new InvFinanceZcfz(stock.getCode(), reportType)));
                Map<String, InvFinanceZcfz> entityMap = new HashMap<>();
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
                    url = urlStr;
                    if (StringUtils.isNotEmpty(result) && !result.contains("<title>无F10资料</title>")) {
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
                                    if (StringUtils.isEmpty(stock.getOrgType())) {
                                        stock.setOrgType(jsonObj.getString("ORG_TYPE"));
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
                                                valueString = StringUtils.isNotEmpty(valueString) ? valueString.trim() : null;
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
                                        if (entityMap.containsKey(entity.getReportDate().toString())) {
                                            InvFinanceZcfz compare = entityMap.get(entity.getReportDate().toString());
                                            if (!compare.equals(entity)) {
                                                entity.setId(compare.getId());
                                                invFinanceZcfzMapper.updateInvFinanceZcfz(entity);
                                            }
                                        } else {
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
            List<String> dateList = new ArrayList<>();
            List<InvFinanceReportDate> reportDateList = invFinanceReportDateMapper.selectInvFinanceReportDateList(new InvFinanceReportDate(stock.getCode(), financeType, reportType));
            for (InvFinanceReportDate reportDate : reportDateList) {
                dateList.add(DateUtils.dateTime(reportDate.getReportDate()));
            }
            if (null != companyType && dateList.size() > 0) {
                List<InvFinanceLr> entityList = new ArrayList<>();
                entityList.addAll(invFinanceLrMapper.selectInvFinanceLrList(new InvFinanceLr(stock.getCode(), reportType)));
                Map<String, InvFinanceLr> entityMap = new HashMap<>();
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
                    url = urlStr;
                    if (StringUtils.isNotEmpty(result) && !result.contains("<title>无F10资料</title>")) {
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
                                    if (StringUtils.isEmpty(stock.getOrgType())) {
                                        stock.setOrgType(jsonObj.getString("ORG_TYPE"));
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
                                                valueString = StringUtils.isNotEmpty(valueString) ? valueString.trim() : null;
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
                                        if (entityMap.containsKey(entity.getReportDate().toString())) {
                                            InvFinanceLr compare = entityMap.get(entity.getReportDate().toString());
                                            if (!compare.equals(entity)) {
                                                entity.setId(compare.getId());
                                                invFinanceLrMapper.updateInvFinanceLr(entity);
                                            }
                                        } else {
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
            List<String> dateList = new ArrayList<>();
            List<InvFinanceReportDate> reportDateList = invFinanceReportDateMapper.selectInvFinanceReportDateList(new InvFinanceReportDate(stock.getCode(), financeType, reportType));
            for (InvFinanceReportDate reportDate : reportDateList) {
                dateList.add(DateUtils.dateTime(reportDate.getReportDate()));
            }
            if (null != companyType && dateList.size() > 0) {
                List<InvFinanceXjll> entityList = new ArrayList<>();
                entityList.addAll(invFinanceXjllMapper.selectInvFinanceXjllList(new InvFinanceXjll(stock.getCode(), reportType)));
                Map<String, InvFinanceXjll> entityMap = new HashMap<>();
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
                    url = urlStr;
                    if (StringUtils.isNotEmpty(result) && !result.contains("<title>无F10资料</title>")) {
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
                                    if (StringUtils.isEmpty(stock.getOrgType())) {
                                        stock.setOrgType(jsonObj.getString("ORG_TYPE"));
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
                                                valueString = StringUtils.isNotEmpty(valueString) ? valueString.trim() : null;
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
                                        if (entityMap.containsKey(entity.getReportDate().toString())) {
                                            InvFinanceXjll compare = entityMap.get(entity.getReportDate().toString());
                                            if (!compare.equals(entity)) {
                                                entity.setId(compare.getId());
                                                invFinanceXjllMapper.updateInvFinanceXjll(entity);
                                            }
                                        } else {
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
            if (StringUtils.isNotEmpty(result) && !result.contains("<title>无F10资料</title>")) {
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
                                        valueString = StringUtils.isNotEmpty(valueString) ? valueString.trim() : null;
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
                                if (entityMap.containsKey(ent.getReportDate().toString())) {
                                    InvFinanceBfb compare = entityMap.get(ent.getReportDate().toString());
                                    if (!compare.equals(ent)) {
                                        ent.setId(compare.getId());
                                        invFinanceBfbMapper.updateInvFinanceBfb(ent);
                                    }
                                } else {
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

}
