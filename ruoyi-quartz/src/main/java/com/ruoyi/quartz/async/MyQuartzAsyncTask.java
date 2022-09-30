package com.ruoyi.quartz.async;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
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
    private InvFinanceZyzbPeriodMapper invFinanceZyzbPeriodMapper;
    @Resource
    private InvFinanceZyzbQuarterMapper invFinanceZyzbQuarterMapper;
    @Resource
    private InvFinanceZyzbYearMapper invFinanceZyzbYearMapper;

    @Resource
    private InvFinanceZcfzSecuritiesPeriodMapper invFinanceZcfzSecuritiesPeriodMapper;
    @Resource
    private InvFinanceZcfzInsurancePeriodMapper invFinanceZcfzInsurancePeriodMapper;
    @Resource
    private InvFinanceZcfzBankPeriodMapper invFinanceZcfzBankPeriodMapper;
    @Resource
    private InvFinanceZcfzCommonPeriodMapper invFinanceZcfzCommonPeriodMapper;

    private static List<String> mdList = new ArrayList<>();

    static{
        mdList.add("-03-31");
        mdList.add("-06-30");
        mdList.add("-09-30");
        mdList.add("-12-31");
    }

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
                url = url.replace("'companyType'", stock.getCompanyType());
            }
            if (url.contains("'dates'")) {
                url = url.replace("'dates'", "2021-12-31");
            }

            if ("ym".equals(type)) {
                url += stock.getMarket() + stock.getCode();
            } else if ("nm".equals(type)) {
                url += stock.getCode();
            }
            String jsonStr = HttpUtils.sendGet(url, new AtomicInteger(3));
            if (null != jsonStr && !"".equals(jsonStr)) {
                JSONArray dataArray = JSONObject.parseObject(jsonStr).getJSONArray("data");
                if (null != dataArray && !dataArray.isEmpty()) {
                    Iterator<Object> iterator = dataArray.iterator();
                    if (iterator.hasNext()) {
                        JSONObject jsonObject = (JSONObject) iterator.next();
                        RyTask.keySet.addAll(jsonObject.keySet());
                    }
                }
            }
        } catch (Exception e) {
            log.error(">>>getInterfaceAllKey(" + stock.getCode() + ")异常" + e);
        }
    }

    /**
     * @Title: 异步执行invFinanceZyzbQuarterTask任务
     * @Description:
     * @author weny.yang
     * @date Sep 9, 2020
     */
    @Async("threadPoolTaskExecutor")
    public void invFinanceZyzbPeriodTask(InvStock stock) {
        try {
            String url = ev.getProperty("investment.finance-zyzb-period") + stock.getMarket() + stock.getCode();
            String jsonStr = HttpUtils.sendGet(url, new AtomicInteger(3));
            if (null != jsonStr && !"".equals(jsonStr)) {
                JSONArray dataArray = JSONObject.parseObject(jsonStr).getJSONArray("data");
                if (null != dataArray && !dataArray.isEmpty()) {
                    List<InvFinanceZyzbPeriod> invFinanceZyzbPeriodList = invFinanceZyzbPeriodMapper.selectInvFinanceZyzbPeriodList(new InvFinanceZyzbPeriod(stock.getCode()));
                    Map<String, InvFinanceZyzbPeriod> zyzbPeriodMap = new HashMap<>();
                    for (InvFinanceZyzbPeriod zyzbPeriod : invFinanceZyzbPeriodList) {
                        zyzbPeriodMap.put(zyzbPeriod.getReportDate().toString(), zyzbPeriod);
                    }
                    Iterator<Object> iterator = dataArray.iterator();
                    while (iterator.hasNext()) {
                        JSONObject jsonObject = (JSONObject) iterator.next();
                        //反射赋值
                        InvFinanceZyzbPeriod zyzbPeriod = new InvFinanceZyzbPeriod(stock.getCode());
                        Class<? extends InvFinanceZyzbPeriod> clazz = zyzbPeriod.getClass();
                        Field[] declaredFields = clazz.getDeclaredFields();
                        for (Field field : declaredFields) {
                            field.setAccessible(true);
                            String genericType = field.getGenericType().toString();
                            String valueString = jsonObject.getString(StringUtils.toUnderScoreCase(field.getName()).toUpperCase());
                            if ("class java.lang.Double".equals(genericType)) {
                                Double value = NumFormatUtil.toDouble(valueString);
                                field.set(zyzbPeriod, value);
                            } else if ("class java.util.Date".equals(genericType)) {
                                Date value = DateUtils.parseDate(valueString);
                                field.set(zyzbPeriod, value);
                            }
                        }

                        if (zyzbPeriodMap.containsKey(zyzbPeriod.getReportDate().toString())) {//数据库已有code指定日期报告
                            InvFinanceZyzbPeriod companies = zyzbPeriodMap.get(zyzbPeriod.getReportDate().toString());
                            companies.setId(null);
                            if (!companies.equals(zyzbPeriod)) {//报告数据不相同，以最新获取为准更新数据库
                                invFinanceZyzbPeriodMapper.updateInvFinanceZyzbPeriod(zyzbPeriod);
                            }
                        } else {//数据库没有code指定日期报告，插入
                            invFinanceZyzbPeriodMapper.insertInvFinanceZyzbPeriod(zyzbPeriod);
                        }
                    }
                }
            }
        } catch (Exception e) {
            log.error(">>>MyQuartzAsyncTask.invFinanceZyzbPeriodTask(" + stock.getCode() + ")异常" + e);
        }
    }

    /**
     * @Title: 异步执行invFinanceZyzbYearTask任务
     * @Description:
     * @author weny.yang
     * @date Sep 9, 2020
     */
    @Async("threadPoolTaskExecutor")
    public void invFinanceZyzbYearTask(InvStock stock) {
        try {
            String url = ev.getProperty("investment.finance-zyzb-year") + stock.getMarket() + stock.getCode();
            String jsonStr = HttpUtils.sendGet(url, new AtomicInteger(3));
            if (null != jsonStr && !"".equals(jsonStr)) {
                JSONArray dataArray = JSONObject.parseObject(jsonStr).getJSONArray("data");
                if (null != dataArray && !dataArray.isEmpty()) {
                    List<InvFinanceZyzbYear> invFinanceZyzbYearList = invFinanceZyzbYearMapper.selectInvFinanceZyzbYearList(new InvFinanceZyzbYear(stock.getCode()));
                    Map<String, InvFinanceZyzbYear> zyzbYearMap = new HashMap<>();
                    for (InvFinanceZyzbYear zyzbYear : invFinanceZyzbYearList) {
                        zyzbYearMap.put(zyzbYear.getReportDate().toString(), zyzbYear);
                    }
                    Iterator<Object> iterator = dataArray.iterator();
                    while (iterator.hasNext()) {
                        JSONObject jsonObject = (JSONObject) iterator.next();
                        //反射赋值
                        InvFinanceZyzbYear zyzbYear = new InvFinanceZyzbYear(stock.getCode());
                        Class<? extends InvFinanceZyzbYear> clazz = zyzbYear.getClass();
                        Field[] declaredFields = clazz.getDeclaredFields();
                        for (Field field : declaredFields) {
                            field.setAccessible(true);
                            String genericType = field.getGenericType().toString();
                            String valueString = jsonObject.getString(StringUtils.toUnderScoreCase(field.getName()).toUpperCase());
                            if ("class java.lang.Double".equals(genericType)) {
                                Double value = NumFormatUtil.toDouble(valueString);
                                field.set(zyzbYear, value);
                            } else if ("class java.util.Date".equals(genericType)) {
                                Date value = DateUtils.parseDate(valueString);
                                field.set(zyzbYear, value);
                            }
                        }

                        if (zyzbYearMap.containsKey(zyzbYear.getReportDate().toString())) {//数据库已有code指定日期报告
                            InvFinanceZyzbYear companies = zyzbYearMap.get(zyzbYear.getReportDate().toString());
                            companies.setId(null);
                            if (!companies.equals(zyzbYear)) {//报告数据不相同，以最新获取为准更新数据库
                                invFinanceZyzbYearMapper.updateInvFinanceZyzbYear(zyzbYear);
                            }
                        } else {//数据库没有code指定日期报告，插入
                            invFinanceZyzbYearMapper.insertInvFinanceZyzbYear(zyzbYear);
                        }
                    }
                }
            }
        } catch (Exception e) {
            log.error(">>>MyQuartzAsyncTask.invFinanceZyzbYearTask(" + stock.getCode() + ")异常" + e);
        }
    }


    /**
     * @Title: 异步执行invFinanceZyzbQuarterTask任务
     * @Description:
     * @author weny.yang
     * @date Sep 9, 2020
     */
    @Async("threadPoolTaskExecutor")
    public void invFinanceZyzbQuarterTask(InvStock stock) {
        try {
            String url = ev.getProperty("investment.finance-zyzb-quarter") + stock.getMarket() + stock.getCode();
            String jsonStr = HttpUtils.sendGet(url, new AtomicInteger(3));
            if (null != jsonStr && !"".equals(jsonStr)) {
                JSONArray dataArray = JSONObject.parseObject(jsonStr).getJSONArray("data");
                if (null != dataArray && !dataArray.isEmpty()) {
                    List<InvFinanceZyzbQuarter> invFinanceZyzbQuarterList = invFinanceZyzbQuarterMapper.selectInvFinanceZyzbQuarterList(new InvFinanceZyzbQuarter(stock.getCode()));
                    Map<String, InvFinanceZyzbQuarter> zyzbQuarterMap = new HashMap<>();
                    for (InvFinanceZyzbQuarter zyzbQuarter : invFinanceZyzbQuarterList) {
                        zyzbQuarterMap.put(zyzbQuarter.getReportDate().toString(), zyzbQuarter);
                    }
                    Iterator<Object> iterator = dataArray.iterator();
                    while (iterator.hasNext()) {
                        JSONObject jsonObject = (JSONObject) iterator.next();
                        //反射赋值
                        InvFinanceZyzbQuarter zyzbQuarter = new InvFinanceZyzbQuarter(stock.getCode());
                        Class<? extends InvFinanceZyzbQuarter> clazz = zyzbQuarter.getClass();
                        Field[] declaredFields = clazz.getDeclaredFields();
                        for (Field field : declaredFields) {
                            field.setAccessible(true);
                            String genericType = field.getGenericType().toString();
                            String valueString = jsonObject.getString(StringUtils.toUnderScoreCase(field.getName()).toUpperCase());
                            if ("class java.lang.Double".equals(genericType)) {
                                Double value = NumFormatUtil.toDouble(valueString);
                                field.set(zyzbQuarter, value);
                            } else if ("class java.util.Date".equals(genericType)) {
                                Date value = DateUtils.parseDate(valueString);
                                field.set(zyzbQuarter, value);
                            }
                        }

                        if (zyzbQuarterMap.containsKey(zyzbQuarter.getReportDate().toString())) {//数据库已有code指定日期报告
                            InvFinanceZyzbQuarter companies = zyzbQuarterMap.get(zyzbQuarter.getReportDate().toString());
                            companies.setId(null);
                            if (!companies.equals(zyzbQuarter)) {//报告数据不相同，以最新获取为准更新数据库
                                invFinanceZyzbQuarterMapper.updateInvFinanceZyzbQuarter(zyzbQuarter);
                            }
                        } else {//数据库没有code指定日期报告，插入
                            invFinanceZyzbQuarterMapper.insertInvFinanceZyzbQuarter(zyzbQuarter);
                        }
                    }
                }
            }
        } catch (Exception e) {
            log.error(">>>MyQuartzAsyncTask.invFinanceZyzbQuarterTask(" + stock.getCode() + ")异常" + e);
        }
    }


    /**
     * @Title: 异步执行invFinanceZcfzPeriodTask任务
     * @Description:
     * @author weny.yang
     * @date Sep 9, 2020
     */
    @Async("threadPoolTaskExecutor")
    public void invFinanceZcfzPeriodTask(InvStock stock) {
        try {
            /*
            1.如果公司类型为空，先初始化公司类型
            2.获取报告期的日期
            3.根据报告期获取资产负债信息
             */
            List<String> dateList = new ArrayList<String>();
            String companyType = stock.getCompanyType();
            Date zcfzPeriodStart = stock.getZcfzPeriodStart();
            if (null != companyType && null != zcfzPeriodStart) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(zcfzPeriodStart);
                int startYear = calendar.get(Calendar.YEAR);
                Date now = new Date();
                calendar.setTime(now);
                int nowYear = calendar.get(Calendar.YEAR);
                while(startYear<=nowYear){
                    for(String md : mdList){
                        Date date = DateUtils.parseDate(startYear + md);
                        if(now.getTime() - date.getTime()>=0  ){
                            dateList.add(startYear + md);
                        }
                    }
                    startYear++;
                }
            } else {
                for (int i = 1; i < 20; i++) {//目前财富通为1-4类
                    String dateUrl = ev.getProperty("investment.finance-zcfz-date-period").replace("'companyType'", String.valueOf(i)) + stock.getMarket() + stock.getCode();
                    String jsonStr = HttpUtils.sendGet(dateUrl, new AtomicInteger(3));
                    if (null != jsonStr && !"".equals(jsonStr)) {
                        JSONArray dataArray = JSONObject.parseObject(jsonStr).getJSONArray("data");
                        if (null != dataArray && !dataArray.isEmpty()) {
                            companyType = String.valueOf(i);
                            Iterator<Object> iterator = dataArray.iterator();
                            while (iterator.hasNext()) {
                                dateList.add(((JSONObject) iterator.next()).getString("REPORT_DATE").substring(0, 10));
                            }
                            //设置公司类型
                            stock.setCompanyType(companyType);
                            //设置资产负债报告期起始日期
                            stock.setZcfzPeriodStart(DateUtils.parseDate(dateList.get(dateList.size()-1)));
                            invStockMapper.updateInvStock(stock);
                            break;
                        }
                    }
                }
            }

            //按时间顺序进行落库
            Collections.reverse(dateList);
            if (null != companyType && dateList.size() > 0) {
                if("1".equals(companyType)){
                    invFinanceZcfzSecuritiesPeriodTask(stock, dateList);
                }if("2".equals(companyType)){
                    invFinanceZcfzInsurancePeriodTask(stock, dateList);
                }if("3".equals(companyType)){
                    invFinanceZcfzBankPeriodTask(stock, dateList);
                }if("4".equals(companyType)){
                    invFinanceZcfzCommonPeriodTask(stock, dateList);
                }
            }
        } catch (Exception e) {
            log.error(">>>MyQuartzAsyncTask.invFinanceZyzbPeriodTask(" + stock.getCode() + ")异常" + e);
        }
    }


    /**
     * @Title: invFinanceZcfzSecuritiesPeriodTask 资产负债-证劵类-报告期任务
     * @Description:
     * @author weny.yang
     * @date Sep 9, 2020
     */
    private void invFinanceZcfzSecuritiesPeriodTask(InvStock stock, List<String> dateList) {
        try {
            List<InvFinanceZcfzSecuritiesPeriod> zcfzList = invFinanceZcfzSecuritiesPeriodMapper.selectInvFinanceZcfzSecuritiesPeriodList(new InvFinanceZcfzSecuritiesPeriod(stock.getCode()));
            for (InvFinanceZcfzSecuritiesPeriod zcfz : zcfzList) {
                dateList.remove(DateUtils.parseDateToStr(DateUtils.YYYY_MM_DD, zcfz.getReportDate()));
            }
            //每次从dateList中取5条
            int toIndex = 5;
            for (int i = 0; i < dateList.size(); i += 5) {
                if (i + 5 > dateList.size()) {
                    // 注意下标问题
                    toIndex = dateList.size() - i;
                }
                //将取出的5条数据拼接
                StringBuilder datesSb = new StringBuilder();
                for (String date : dateList.subList(i, i + toIndex)) {
                    if (datesSb.length() > 0) {
                        datesSb.append("%2C").append(date);
                    } else {
                        datesSb.append(date);
                    }
                }
                String ajaxUrl = ev.getProperty("investment.finance-zcfz-ajax-period").replace("'companyType'", stock.getCompanyType()).replace("'dates'", datesSb.toString()) + stock.getMarket() + stock.getCode();
                String jsonStr = HttpUtils.sendGet(ajaxUrl, new AtomicInteger(3));
                if (null != jsonStr && !"".equals(jsonStr)) {
                    JSONArray dataArray = JSONObject.parseObject(jsonStr).getJSONArray("data");
                    if (null != dataArray && !dataArray.isEmpty()) {
                        Iterator<Object> iterator = dataArray.iterator();
                        while (iterator.hasNext()) {
                            JSONObject jsonObject = (JSONObject) iterator.next();
                            //反射赋值
                            InvFinanceZcfzSecuritiesPeriod zcfz = new InvFinanceZcfzSecuritiesPeriod(stock.getCode());
                            Class<? extends InvFinanceZcfzSecuritiesPeriod> clazz = zcfz.getClass();
                            Field[] declaredFields = clazz.getDeclaredFields();
                            for (Field field : declaredFields) {
                                field.setAccessible(true);
                                String genericType = field.getGenericType().toString();
                                String valueString = jsonObject.getString(StringUtils.toUnderScoreCase(field.getName()).toUpperCase());
                                if ("class java.lang.Double".equals(genericType)) {
                                    Double value = NumFormatUtil.toDouble(valueString);
                                    field.set(zcfz, value);
                                } else if ("class java.util.Date".equals(genericType)) {
                                    Date value = DateUtils.parseDate(valueString);
                                    field.set(zcfz, value);
                                }
                            }
                            invFinanceZcfzSecuritiesPeriodMapper.insertInvFinanceZcfzSecuritiesPeriod(zcfz);
                        }
                    }
                }
            }
        } catch (Exception e) {
            log.error(">>>MyQuartzAsyncTask.invFinanceZcfzSecuritiesPeriodTask(" + stock.getCode() + ")异常" + e);
        }
    }


    /**
     * @Title: invFinanceZcfzInsurancePeriodTask 资产负债-保险类-报告期任务
     * @Description:
     * @author weny.yang
     * @date Sep 9, 2020
     */
    private void invFinanceZcfzInsurancePeriodTask(InvStock stock, List<String> dateList) {
        try {
            List<InvFinanceZcfzInsurancePeriod> zcfzList = invFinanceZcfzInsurancePeriodMapper.selectInvFinanceZcfzInsurancePeriodList(new InvFinanceZcfzInsurancePeriod(stock.getCode()));
            for (InvFinanceZcfzInsurancePeriod zcfz : zcfzList) {
                dateList.remove(DateUtils.parseDateToStr(DateUtils.YYYY_MM_DD, zcfz.getReportDate()));
            }
            //每次从dateList中取5条
            int toIndex = 5;
            for (int i = 0; i < dateList.size(); i += 5) {
                if (i + 5 > dateList.size()) {
                    // 注意下标问题
                    toIndex = dateList.size() - i;
                }
                //将取出的5条数据拼接
                StringBuilder datesSb = new StringBuilder();
                for (String date : dateList.subList(i, i + toIndex)) {
                    if (datesSb.length() > 0) {
                        datesSb.append("%2C").append(date);
                    } else {
                        datesSb.append(date);
                    }
                }
                String ajaxUrl = ev.getProperty("investment.finance-zcfz-ajax-period").replace("'companyType'", stock.getCompanyType()).replace("'dates'", datesSb.toString()) + stock.getMarket() + stock.getCode();
                String jsonStr = HttpUtils.sendGet(ajaxUrl, new AtomicInteger(3));
                if (null != jsonStr && !"".equals(jsonStr)) {
                    JSONArray dataArray = JSONObject.parseObject(jsonStr).getJSONArray("data");
                    if (null != dataArray && !dataArray.isEmpty()) {
                        Iterator<Object> iterator = dataArray.iterator();
                        while (iterator.hasNext()) {
                            JSONObject jsonObject = (JSONObject) iterator.next();
                            //反射赋值
                            InvFinanceZcfzInsurancePeriod zcfz = new InvFinanceZcfzInsurancePeriod(stock.getCode());
                            Class<? extends InvFinanceZcfzInsurancePeriod> clazz = zcfz.getClass();
                            Field[] declaredFields = clazz.getDeclaredFields();
                            for (Field field : declaredFields) {
                                field.setAccessible(true);
                                String genericType = field.getGenericType().toString();
                                String valueString = jsonObject.getString(StringUtils.toUnderScoreCase(field.getName()).toUpperCase());
                                if ("class java.lang.Double".equals(genericType)) {
                                    Double value = NumFormatUtil.toDouble(valueString);
                                    field.set(zcfz, value);
                                } else if ("class java.util.Date".equals(genericType)) {
                                    Date value = DateUtils.parseDate(valueString);
                                    field.set(zcfz, value);
                                }
                            }
                            invFinanceZcfzInsurancePeriodMapper.insertInvFinanceZcfzInsurancePeriod(zcfz);
                        }
                    }
                }
            }
        } catch (Exception e) {
            log.error(">>>MyQuartzAsyncTask.invFinanceZcfzInsurancePeriodTask(" + stock.getCode() + ")异常" + e);
        }
    }


    /**
     * @Title: invFinanceZcfzBankPeriodTask 资产负债-银行类-报告期任务
     * @Description:
     * @author weny.yang
     * @date Sep 9, 2020
     */
    private void invFinanceZcfzBankPeriodTask(InvStock stock, List<String> dateList) {
        try {
            List<InvFinanceZcfzBankPeriod> zcfzList = invFinanceZcfzBankPeriodMapper.selectInvFinanceZcfzBankPeriodList(new InvFinanceZcfzBankPeriod(stock.getCode()));
            for (InvFinanceZcfzBankPeriod zcfz : zcfzList) {
                dateList.remove(DateUtils.parseDateToStr(DateUtils.YYYY_MM_DD, zcfz.getReportDate()));
            }
            //每次从dateList中取5条
            int toIndex = 5;
            for (int i = 0; i < dateList.size(); i += 5) {
                if (i + 5 > dateList.size()) {
                    // 注意下标问题
                    toIndex = dateList.size() - i;
                }
                //将取出的5条数据拼接
                StringBuilder datesSb = new StringBuilder();
                for (String date : dateList.subList(i, i + toIndex)) {
                    if (datesSb.length() > 0) {
                        datesSb.append("%2C").append(date);
                    } else {
                        datesSb.append(date);
                    }
                }
                String ajaxUrl = ev.getProperty("investment.finance-zcfz-ajax-period").replace("'companyType'", stock.getCompanyType()).replace("'dates'", datesSb.toString()) + stock.getMarket() + stock.getCode();
                String jsonStr = HttpUtils.sendGet(ajaxUrl, new AtomicInteger(3));
                if (null != jsonStr && !"".equals(jsonStr)) {
                    JSONArray dataArray = JSONObject.parseObject(jsonStr).getJSONArray("data");
                    if (null != dataArray && !dataArray.isEmpty()) {
                        Iterator<Object> iterator = dataArray.iterator();
                        while (iterator.hasNext()) {
                            JSONObject jsonObject = (JSONObject) iterator.next();
                            //反射赋值
                            InvFinanceZcfzBankPeriod zcfz = new InvFinanceZcfzBankPeriod(stock.getCode());
                            Class<? extends InvFinanceZcfzBankPeriod> clazz = zcfz.getClass();
                            Field[] declaredFields = clazz.getDeclaredFields();
                            for (Field field : declaredFields) {
                                field.setAccessible(true);
                                String genericType = field.getGenericType().toString();
                                String valueString = jsonObject.getString(StringUtils.toUnderScoreCase(field.getName()).toUpperCase());
                                if ("class java.lang.Double".equals(genericType)) {
                                    Double value = NumFormatUtil.toDouble(valueString);
                                    field.set(zcfz, value);
                                } else if ("class java.util.Date".equals(genericType)) {
                                    Date value = DateUtils.parseDate(valueString);
                                    field.set(zcfz, value);
                                }
                            }
                            invFinanceZcfzBankPeriodMapper.insertInvFinanceZcfzBankPeriod(zcfz);
                        }
                    }
                }
            }
        } catch (Exception e) {
            log.error(">>>MyQuartzAsyncTask.invFinanceZcfzBankPeriodTask(" + stock.getCode() + ")异常" + e);
        }
    }


    /**
     * @Title: invFinanceZcfzCommonPeriodTask 资产负债-普通类-报告期任务
     * @Description:
     * @author weny.yang
     * @date Sep 9, 2020
     */
    private void invFinanceZcfzCommonPeriodTask(InvStock stock, List<String> dateList) {
        try {
            List<InvFinanceZcfzCommonPeriod> zcfzList = invFinanceZcfzCommonPeriodMapper.selectInvFinanceZcfzCommonPeriodList(new InvFinanceZcfzCommonPeriod(stock.getCode()));
            for (InvFinanceZcfzCommonPeriod zcfz : zcfzList) {
                dateList.remove(DateUtils.parseDateToStr(DateUtils.YYYY_MM_DD, zcfz.getReportDate()));
            }
            //每次从dateList中取5条
            int toIndex = 5;
            for (int i = 0; i < dateList.size(); i += 5) {
                if (i + 5 > dateList.size()) {
                    // 注意下标问题
                    toIndex = dateList.size() - i;
                }
                //将取出的5条数据拼接
                StringBuilder datesSb = new StringBuilder();
                for (String date : dateList.subList(i, i + toIndex)) {
                    if (datesSb.length() > 0) {
                        datesSb.append("%2C").append(date);
                    } else {
                        datesSb.append(date);
                    }
                }
                String ajaxUrl = ev.getProperty("investment.finance-zcfz-ajax-period").replace("'companyType'", stock.getCompanyType()).replace("'dates'", datesSb.toString()) + stock.getMarket() + stock.getCode();
                String jsonStr = HttpUtils.sendGet(ajaxUrl, new AtomicInteger(3));
                if (null != jsonStr && !"".equals(jsonStr)) {
                    JSONArray dataArray = JSONObject.parseObject(jsonStr).getJSONArray("data");
                    if (null != dataArray && !dataArray.isEmpty()) {
                        Iterator<Object> iterator = dataArray.iterator();
                        while (iterator.hasNext()) {
                            JSONObject jsonObject = (JSONObject) iterator.next();
                            //反射赋值
                            InvFinanceZcfzCommonPeriod zcfz = new InvFinanceZcfzCommonPeriod(stock.getCode());
                            Class<? extends InvFinanceZcfzCommonPeriod> clazz = zcfz.getClass();
                            Field[] declaredFields = clazz.getDeclaredFields();
                            for (Field field : declaredFields) {
                                field.setAccessible(true);
                                String genericType = field.getGenericType().toString();
                                String valueString = jsonObject.getString(StringUtils.toUnderScoreCase(field.getName()).toUpperCase());
                                if ("class java.lang.Double".equals(genericType)) {
                                    Double value = NumFormatUtil.toDouble(valueString);
                                    field.set(zcfz, value);
                                } else if ("class java.util.Date".equals(genericType)) {
                                    Date value = DateUtils.parseDate(valueString);
                                    field.set(zcfz, value);
                                }
                            }
                            invFinanceZcfzCommonPeriodMapper.insertInvFinanceZcfzCommonPeriod(zcfz);
                        }
                    }
                }
            }
        } catch (Exception e) {
            log.error(">>>MyQuartzAsyncTask.invFinanceZcfzCommonPeriodTask(" + stock.getCode() + ")异常" + e);
        }
    }



}
