package com.ruoyi.quartz.async;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.enums.OpinionTypeEnu;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.NumFormatUtil;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.http.HttpUtils;
import com.ruoyi.investment.domain.*;
import com.ruoyi.investment.mapper.*;
import com.ruoyi.quartz.task.RyTask;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
public class MyQuartzAsyncTask {
    @Resource
    private Environment ev;
    @Resource
    private InvStockMapper invStockMapper;

    @Resource
    private InvFinanceZyzbMapper invFinanceZyzbMapper;
    @Resource
    private InvFinanceDbfxMapper invFinanceDbfxMapper;
    @Resource
    private InvFinanceReportDateMapper invFinanceReportDateMapper;
    @Resource
    private InvFinanceZcfzMapper invFinanceZcfzMapper;
    @Resource
    private InvFinanceLrMapper invFinanceLrMapper;



    /**
     * @Title: 获取接口所有字段
     * @Description:
     * @author weny.yang
     * @date Sep 9, 2020
     */
    @Async("threadPoolTaskExecutor")
    public void getInterfaceAllKey(InvStock stock, String urlStr, String type) {

        try {
            String url = ev.getProperty(urlStr);
            if (url.contains("'companyType'")) {
                url = url.replace("'companyType'", stock.getStockType());
            }
            if (url.contains("'dates'")) {
                url = url.replace("'dates'", "2021-12-31");
            }

            if ("ym".equals(type)) {
                url += stock.getMarket() + stock.getCode();
            } else if ("nm".equals(type)) {
                url += stock.getCode();
            }
            String jsonStr = HttpUtils.sendGet(url, new AtomicInteger(10));
            if (StringUtils.isNotEmpty(jsonStr)) {
                JSONObject jsonObject = JSONObject.parseObject(jsonStr);
                if (jsonObject.containsKey("data")) {
                    JSONArray dataArray = jsonObject.getJSONArray("data");
                    if (!dataArray.isEmpty()) {
                        Iterator<Object> iterator = dataArray.iterator();
                        if (iterator.hasNext()) {
                            JSONObject next = (JSONObject) iterator.next();
                            RyTask.keySet.addAll(next.keySet());
                        }
                    }
                }
                if (jsonObject.containsKey("")) {
                    JSONArray dataArray = jsonObject.getJSONArray("");
                    if (!dataArray.isEmpty()) {
                        Iterator<Object> iterator = dataArray.iterator();
                        if (iterator.hasNext()) {
                            JSONObject next = (JSONObject) iterator.next();
                            RyTask.keySet.addAll(next.keySet());
                        }
                    }
                }
//                if (jsonObject.containsKey("nd")) {
//                    JSONArray dataArray = jsonObject.getJSONArray("nd");
//                    if (!dataArray.isEmpty()) {
//                        Iterator<Object> iterator = dataArray.iterator();
//                        if (iterator.hasNext()) {
//                            JSONObject next = (JSONObject) iterator.next();
//                            RyTask.keySet.addAll(next.keySet());
//                        }
//                    }
//                }
            }
        } catch (Exception e) {
            log.error(">>>getInterfaceAllKey(" + stock.getCode() + ")异常:", e);
        }
    }

    /**
     * @Title: 下载html
     * @Description:
     * @author weny.yang
     * @date Sep 9, 2020
     */
    @Async("threadPoolTaskExecutor")
    public void downHtml(String url, String code) throws IOException {
        String jsonStr = HttpUtils.sendGet(url, new AtomicInteger(10));
        if (StringUtils.isNotEmpty(jsonStr)) {
            File file = new File("/Users/yay/WorkSpace/RuoYi/RuoYi-master/ruoyi-investment/src/main/resources/html/" + code + ".html");
            // 判断文件是否存在
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write(jsonStr);
            bw.flush();
            bw.close();
        }
    }


    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * @Title: 异步执行 财务分析-重要指标-报告期 任务
     * @Description:
     * @author weny.yang
     * @date Sep 9, 2020
     */
    @Async("threadPoolTaskExecutor")
    public void invFinanceZyzbTask(InvStock stock, String url, String reportType, AtomicInteger count) {
        try {
            String jsonStr = HttpUtils.sendGet(url, new AtomicInteger(10));
            if (StringUtils.isNotEmpty(jsonStr)) {
                JSONObject jsonObject = JSONObject.parseObject(jsonStr);
                if (jsonObject.containsKey("data")) {
                    JSONArray dataArray = jsonObject.getJSONArray("data");
                    if (!dataArray.isEmpty()) {
                        List<InvFinanceZyzb> invFinanceZyzbList = invFinanceZyzbMapper.selectInvFinanceZyzbList(new InvFinanceZyzb(stock.getCode(), reportType));
                        Map<String, InvFinanceZyzb> zyzbMap = new HashMap<>();
                        for (InvFinanceZyzb zyzb : invFinanceZyzbList) {
                            zyzbMap.put(zyzb.getReportDate().toString(), zyzb);
                        }
                        Iterator<Object> iterator = dataArray.iterator();
                        while (iterator.hasNext()) {
                            JSONObject next = (JSONObject) iterator.next();
                            //反射赋值
                            InvFinanceZyzb zyzb = new InvFinanceZyzb(stock.getCode(), reportType);
                            Class<? extends InvFinanceZyzb> clazz = zyzb.getClass();
                            Field[] declaredFields = clazz.getDeclaredFields();
                            for (Field field : declaredFields) {
                                field.setAccessible(true);
                                String genericType = field.getGenericType().toString();
                                String fieldName = field.getName();
                                if (!"reportType".equals(fieldName)) {
                                    String valueString = next.getString(StringUtils.toUnderScoreCase(fieldName).toUpperCase());
                                    if ("class java.lang.Double".equals(genericType)) {
                                        Double value = NumFormatUtil.toDouble(valueString);
                                        field.set(zyzb, value);
                                    } else if ("class java.util.Date".equals(genericType)) {
                                        Date value = DateUtils.parseDate(valueString);
                                        field.set(zyzb, value);
                                    } else if ("class java.lang.String".equals(genericType)) {
                                        field.set(zyzb, valueString);
                                    }
                                }
                            }
                            if (zyzbMap.containsKey(zyzb.getReportDate().toString())) {//数据库已有code指定日期报告
                                InvFinanceZyzb companies = zyzbMap.get(zyzb.getReportDate().toString());
                                if (!companies.equals(zyzb)) {//报告数据不相同，以最新获取为准更新数据库
                                    invFinanceZyzbMapper.updateInvFinanceZyzb(zyzb);
                                }
                            } else {//数据库没有code指定日期报告，插入
                                invFinanceZyzbMapper.insertInvFinanceZyzb(zyzb);
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                invFinanceZyzbTask(stock, url, reportType, count);
            } else {
                log.error(">>>MyQuartzAsyncTask.invFinanceZyzbTask(" + url + ")异常:", e);
            }
        }
    }
    



    /**
     * @Title: 异步执行invFinanceDbfxTask任务
     * @Description:
     * @author weny.yang
     * @date Sep 9, 2020
     */
    @Async("threadPoolTaskExecutor")
    public void invFinanceDbfxTask(InvStock stock, String url, AtomicInteger count) {
        try {
            String jsonStr = HttpUtils.sendGet(url, new AtomicInteger(10));
            if (StringUtils.isNotEmpty(jsonStr)) {
                JSONObject jsonObject = JSONObject.parseObject(jsonStr);
                List<String> reportTypeList = new ArrayList<String>();
                if (jsonObject.containsKey("bgq")) {
                    reportTypeList.add("bgq");
                }
                if (jsonObject.containsKey("nd")) {
                    reportTypeList.add("nd");
                }
                if (jsonObject.containsKey("jd")) {
                    reportTypeList.add("jd");
                }
                for (String reportType : reportTypeList){
                    JSONArray jsonArray = jsonObject.getJSONArray(reportType);
                    if (!jsonArray.isEmpty()) {
                        List<InvFinanceDbfx> invFinanceDbfxList = invFinanceDbfxMapper.selectInvFinanceDbfxList(new InvFinanceDbfx(stock.getCode(), reportType));
                        Map<String, InvFinanceDbfx> dbfxMap = new HashMap<>();
                        for (InvFinanceDbfx dbfx : invFinanceDbfxList) {
                            dbfxMap.put(dbfx.getReportDate().toString(), dbfx);
                        }
                        Iterator<Object> iterator = jsonArray.iterator();
                        while (iterator.hasNext()) {
                            JSONObject next = (JSONObject) iterator.next();
                            //反射赋值
                            InvFinanceDbfx dbfx = new InvFinanceDbfx(stock.getCode(), reportType);
                            Class<? extends InvFinanceDbfx> clazz = dbfx.getClass();
                            Field[] declaredFields = clazz.getDeclaredFields();
                            for (Field field : declaredFields) {
                                field.setAccessible(true);
                                String genericType = field.getGenericType().toString();
                                String fieldName = field.getName();
                                if (!"reportType".equals(fieldName)) {
                                    String valueString = next.getString(StringUtils.toUnderScoreCase(fieldName).toUpperCase());
                                    if ("class java.lang.Double".equals(genericType)) {
                                        Double value = NumFormatUtil.toDouble(valueString);
                                        field.set(dbfx, value);
                                    } else if ("class java.util.Date".equals(genericType)) {
                                        Date value = DateUtils.parseDate(valueString);
                                        field.set(dbfx, value);
                                    } else if ("class java.lang.String".equals(genericType)) {
                                        field.set(dbfx, valueString);
                                    }
                                }
                            }
                            if (dbfxMap.containsKey(dbfx.getReportDate().toString())) {//数据库已有code指定日期报告
                                InvFinanceDbfx companies = dbfxMap.get(dbfx.getReportDate().toString());
                                if (!companies.equals(dbfx)) {//报告数据不相同，以最新获取为准更新数据库
                                    invFinanceDbfxMapper.updateInvFinanceDbfx(dbfx);
                                }
                            } else {//数据库没有code指定日期报告，插入
                                invFinanceDbfxMapper.insertInvFinanceDbfx(dbfx);
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                invFinanceDbfxTask(stock, url, count);
            } else {
                log.error(">>>MyQuartzAsyncTask.invFinanceDbfxTask(" + url + ")异常:", e);
            }
        }
    }


    /**
     * @Title: 异步执行invFinanceReportDateTask任务
     * @Description:
     * @author weny.yang
     * @date Sep 9, 2020
     */
    @Async("threadPoolTaskExecutor")
    public void invFinanceReportDateTask(InvStock stock, String url, String financeType, String reportType, AtomicInteger count) {
        try {
            /*
            1.如果公司类型为空，先初始化公司类型
            2.初始化报告日期
             */
            String companyType = stock.getStockType();
            if (null != companyType) {
                url = url.replace("'companyType'", companyType);
                String jsonStr = HttpUtils.sendGet(url, new AtomicInteger(10));
                if (StringUtils.isNotEmpty(jsonStr)) {
                    JSONObject jsonObject = JSONObject.parseObject(jsonStr);
                    if (jsonObject.containsKey("data")) {
                        //1.查询当前股票已经落数的报告日期集合
                        List<InvFinanceReportDate> invFinanceReportDateList = invFinanceReportDateMapper.selectInvFinanceReportDateList(new InvFinanceReportDate(stock.getCode(), financeType, reportType));
                        List<String> dateList = new ArrayList<>();
                        for (InvFinanceReportDate reportDate : invFinanceReportDateList) {
                            dateList.add(DateUtils.dateTime(reportDate.getReportDate()));
                        }
                        //2.保存报告日期
                        JSONArray dataArray = jsonObject.getJSONArray("data");
                        if(!dataArray.isEmpty()){
                            Iterator<Object> iterator = dataArray.iterator();
                            while (iterator.hasNext()) {
                                String report_date = ((JSONObject) iterator.next()).getString("REPORT_DATE").substring(0, 10);
                                if (!dateList.contains(report_date)) {
                                    invFinanceReportDateMapper.insertInvFinanceReportDate(new InvFinanceReportDate(stock.getCode(), financeType, reportType, DateUtils.dateTime(DateUtils.YYYY_MM_DD, report_date)));
                                }
                            }
                        }
                    }
                }
            } else {
                for (int i = 1; i < 20; i++) {//目前财富通为1-4类
                    url = url.replace("'companyType'", String.valueOf(i));
                    String jsonStr = HttpUtils.sendGet(url, new AtomicInteger(10));
                    //调用完接口链接后回退到原始链接
                    url = url.replace("companyType=" + String.valueOf(i), "companyType='companyType'");
                    if (StringUtils.isNotEmpty(jsonStr)) {
                        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
                        if (jsonObject.containsKey("data")) {
                            //1.查询当前股票已经落数的报告日期集合
                            List<InvFinanceReportDate> invFinanceReportDateList = invFinanceReportDateMapper.selectInvFinanceReportDateList(new InvFinanceReportDate(stock.getCode(), financeType, reportType));
                            List<String> dateList = new ArrayList<>();
                            for (InvFinanceReportDate reportDate : invFinanceReportDateList) {
                                dateList.add(DateUtils.dateTime(reportDate.getReportDate()));
                            }
                            //2.更新股票类型
                            stock.setStockType(String.valueOf(i));
                            invStockMapper.updateInvStock(stock);
                            //3.保存报告日期
                            JSONArray dataArray = jsonObject.getJSONArray("data");
                            if(!dataArray.isEmpty()){
                                Iterator<Object> iterator = dataArray.iterator();
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
        } catch (Exception e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                invFinanceReportDateTask(stock, url, financeType, reportType, count);
            } else {
                log.error(">>>MyQuartzAsyncTask.invFinanceReportDateTask(" + url + ")异常:", e);
            }
        }
    }


    /**
     * @Title: 异步执行invFinanceZcfzTask任务
     * @Description:
     * @author weny.yang
     * @date Sep 9, 2020
     */
    @Async("threadPoolTaskExecutor")
    public void invFinanceZcfzTask(InvStock stock, String url, String financeType, String reportType, AtomicInteger count) {
        try {
            /*
            1.最近的5期进行数据同步，如果和数据库一致则跳过，不一致则更新
            2.超过5期的其他的如果数据库不存在则新增，如果存在则不再同步
             */
            String companyType = stock.getStockType();
            List<String> dateList = new ArrayList<String>();
            List<InvFinanceReportDate> invFinanceReportDateList = invFinanceReportDateMapper.selectInvFinanceReportDateList(new InvFinanceReportDate(stock.getCode(), financeType, reportType));
            for (InvFinanceReportDate reportDate : invFinanceReportDateList) {
                dateList.add(DateUtils.dateTime(reportDate.getReportDate()));
            }
            if (null != companyType && dateList.size() > 0) {
                List<InvFinanceZcfz> zcfzList = new ArrayList<InvFinanceZcfz>();
                zcfzList.addAll(invFinanceZcfzMapper.selectInvFinanceZcfzList(new InvFinanceZcfz(stock.getCode(),reportType)));
                Map<String, InvFinanceZcfz> zcfzMap = new HashMap<String, InvFinanceZcfz>();
                for (int i = 0; i < zcfzList.size(); i++) {
                    InvFinanceZcfz zcfz = zcfzList.get(i);
                    if (i < 5) {
                        zcfzMap.put(zcfz.getReportDate().toString(), zcfz);
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
                    url = url.replace("'companyType'", companyType).replace("'dates'", datesSb.toString());
                    String jsonStr = HttpUtils.sendGet(url, new AtomicInteger(10));
                    //调用完接口链接后回退到原始链接
                    url = url.replace("dates=" + datesSb.toString(), "dates='dates'");
                    if (StringUtils.isNotEmpty(jsonStr)) {
                        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
                        if (jsonObject.containsKey("data")) {
                            JSONArray dataArray = jsonObject.getJSONArray("data");
                            if (!dataArray.isEmpty()) {
                                //1.更新Stock 的 组织代码orgCode 组织简称orgType 股票分类代码securityTypeCode
                                boolean updateStockFlag = false;
                                JSONObject jsonObj = (JSONObject) dataArray.get(0);
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
                                Iterator<Object> iterator = dataArray.iterator();
                                while (iterator.hasNext()) {
                                    //反射赋值
                                    InvFinanceZcfz zcfz = new InvFinanceZcfz(stock.getCode(),reportType);
                                    Class<? extends InvFinanceZcfz> clazz = zcfz.getClass();
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
                                                field.set(zcfz, value);
                                            } else if ("class java.util.Date".equals(genericType)) {
                                                Date value = DateUtils.parseDate(valueString);
                                                field.set(zcfz, value);
                                            } else if ("class java.lang.String".equals(genericType)) {
                                                //审计意见枚举赋值
                                                if ("opinionType".equals(fieldName) || "osopinionType".equals(fieldName)) {
                                                    if (StringUtils.isNotEmpty(valueString)){
                                                        for(OpinionTypeEnu value : OpinionTypeEnu.values()){
                                                            if (value.getChineseStr().equals(valueString)){
                                                                field.set(zcfz, value.getDict());
                                                            }
                                                        }
                                                        //没有找到已定义枚举匹配项
                                                        if (StringUtils.isEmpty((String)field.get(zcfz))){
                                                            field.set(zcfz, valueString);
                                                            log.error(">>>invFinanceZcfzTask任务:"+zcfz.getSecurityCode()+" "+zcfz.getReportType()+" "+zcfz.getReportDate()+" 审计意见("+fieldName+")：" + valueString + " 不在预定枚举类");
                                                        }
                                                    }
                                                }else{
                                                    field.set(zcfz, valueString);
                                                }
                                            }
                                        }
                                    }
                                    if (zcfzMap.containsKey(zcfz.getReportDate().toString())) {//数据库已有code指定日期报告
                                        InvFinanceZcfz companies = zcfzMap.get(zcfz.getReportDate().toString());
                                        if (!companies.equals(zcfz)) {//报告数据不相同，以最新获取为准更新数据库
                                            invFinanceZcfzMapper.updateInvFinanceZcfz(zcfz);
                                        }
                                    } else {//数据库没有code指定日期报告，插入
                                        invFinanceZcfzMapper.insertInvFinanceZcfz(zcfz);
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
                invFinanceZcfzTask(stock, url, financeType, reportType, count);
            } else {
                log.error(">>>MyQuartzAsyncTask.invFinanceZcfzTask(" + url + ")异常:", e);
            }
        }
    }



    /**
     * @Title: 异步执行invFinanceLrTask任务
     * @Description:
     * @author weny.yang
     * @date Sep 9, 2020
     */
    @Async("threadPoolTaskExecutor")
    public void invFinanceLrTask(InvStock stock, String url, String financeType, String reportType, AtomicInteger count) {
        try {
            /*
            1.最近的5期进行数据同步，如果和数据库一致则跳过，不一致则更新
            2.超过5期的其他的如果数据库不存在则新增，如果存在则不再同步
             */
            String companyType = stock.getStockType();
            List<String> dateList = new ArrayList<String>();
            List<InvFinanceReportDate> invFinanceReportDateList = invFinanceReportDateMapper.selectInvFinanceReportDateList(new InvFinanceReportDate(stock.getCode(), financeType, reportType));
            for (InvFinanceReportDate reportDate : invFinanceReportDateList) {
                dateList.add(DateUtils.dateTime(reportDate.getReportDate()));
            }
            if (null != companyType && dateList.size() > 0) {
                List<InvFinanceLr> lrList = new ArrayList<InvFinanceLr>();
                lrList.addAll(invFinanceLrMapper.selectInvFinanceLrList(new InvFinanceLr(stock.getCode(),reportType)));
                Map<String, InvFinanceLr> lrMap = new HashMap<String, InvFinanceLr>();
                for (int i = 0; i < lrList.size(); i++) {
                    InvFinanceLr lr = lrList.get(i);
                    if (i < 5) {
                        lrMap.put(lr.getReportDate().toString(), lr);
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
                    url = url.replace("'companyType'", companyType).replace("'dates'", datesSb.toString());
                    String jsonStr = HttpUtils.sendGet(url, new AtomicInteger(10));
                    //调用完接口链接后回退到原始链接
                    url = url.replace("dates=" + datesSb.toString(), "dates='dates'");
                    if (StringUtils.isNotEmpty(jsonStr)) {
                        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
                        if (jsonObject.containsKey("data")) {
                            JSONArray dataArray = jsonObject.getJSONArray("data");
                            if (!dataArray.isEmpty()) {
                                //1.更新Stock 的 组织代码orgCode 组织简称orgType 股票分类代码securityTypeCode
                                boolean updateStockFlag = false;
                                JSONObject jsonObj = (JSONObject) dataArray.get(0);
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
                                Iterator<Object> iterator = dataArray.iterator();
                                while (iterator.hasNext()) {
                                    //反射赋值
                                    InvFinanceLr lr = new InvFinanceLr(stock.getCode(),reportType);
                                    Class<? extends InvFinanceLr> clazz = lr.getClass();
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
                                                field.set(lr, value);
                                            } else if ("class java.util.Date".equals(genericType)) {
                                                Date value = DateUtils.parseDate(valueString);
                                                field.set(lr, value);
                                            } else if ("class java.lang.String".equals(genericType)) {
                                                //审计意见枚举赋值
                                                if ("opinionType".equals(fieldName) || "osopinionType".equals(fieldName)) {
                                                    if (StringUtils.isNotEmpty(valueString)){
                                                        for(OpinionTypeEnu enu : OpinionTypeEnu.values()){
                                                            if (enu.getChineseStr().equals(valueString)){
                                                                field.set(lr, enu.getDict());
                                                            }
                                                        }
                                                        //没有找到已定义枚举匹配项
                                                        if (StringUtils.isEmpty((String)field.get(lr))){
                                                            field.set(lr, valueString);
                                                            log.error(">>>invFinanceLrTask任务:"+lr.getSecurityCode()+" "+lr.getReportType()+" "+lr.getReportDate()+" 审计意见("+fieldName+")：" + valueString + " 不在预定枚举类");
                                                        }
                                                    }
                                                }else{
                                                    field.set(lr, valueString);
                                                }
                                            }
                                        }
                                    }
                                    if (lrMap.containsKey(lr.getReportDate().toString())) {//数据库已有code指定日期报告
                                        InvFinanceLr companies = lrMap.get(lr.getReportDate().toString());
                                        if (!companies.equals(lr)) {//报告数据不相同，以最新获取为准更新数据库
                                            invFinanceLrMapper.updateInvFinanceLr(lr);
                                        }
                                    } else {//数据库没有code指定日期报告，插入
                                        invFinanceLrMapper.insertInvFinanceLr(lr);
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
                invFinanceLrTask(stock, url, financeType, reportType, count);
            } else {
                log.error(">>>MyQuartzAsyncTask.invFinanceLrTask(" + url + ")异常:", e);
            }
        }
    }


}
