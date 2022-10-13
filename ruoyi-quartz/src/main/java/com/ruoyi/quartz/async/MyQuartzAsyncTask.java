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
    private InvFinanceReportDateMapper invFinanceReportDateMapper;
    @Resource
    private InvFinanceZcfzMapper invFinanceZcfzMapper;

    private static List<String> mdList = new ArrayList<>();

    static {
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
     * @Title: 获取接口所有字段
     * @Description:
     * @author weny.yang
     * @date Sep 9, 2020
     */
    @Async("threadPoolTaskExecutor")
    public void getInterfaceKeyDes(String url, String key) {
        String jsonStr = HttpUtils.sendGet(url, new AtomicInteger(3));
        if (jsonStr.contains(key)) {
            System.out.println(url);
        }
    }

    /**
     * @Title: 异步执行invFinanceZyzbQuarterTask任务
     * @Description:
     * @author weny.yang
     * @date Sep 9, 2020
     */
        /*
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
    */


    /**
     * @Title: 异步执行invFinanceReportDateTask任务
     * @Description:
     * @author weny.yang
     * @date Sep 9, 2020
     */
    @Async("threadPoolTaskExecutor")
    public void invFinanceReportDateTask(InvStock stock) {
        try {
            /*
            1.如果公司类型为空，先初始化公司类型
            2.初始化报告日期
             */
            String companyType = stock.getCompanyType();
            if (null != companyType) {
                String dateUrl = ev.getProperty("investment.finance-zcfz-date").replace("'companyType'", companyType) + stock.getMarket() + stock.getCode();
                String jsonStr = HttpUtils.sendGet(dateUrl, new AtomicInteger(3));
                if (null != jsonStr && !"".equals(jsonStr)) {
                    JSONObject jsonObject = JSONObject.parseObject(jsonStr);
                    if (jsonObject.containsKey("data")) {
                        //1.查询当前股票已经落数的报告日期集合
                        List<InvFinanceReportDate> invFinanceReportDateList = invFinanceReportDateMapper.selectInvFinanceReportDateList(new InvFinanceReportDate(stock.getCode()));
                        List<String> dateList = new ArrayList<>();
                        for (InvFinanceReportDate reportDate : invFinanceReportDateList) {
                            dateList.add(DateUtils.dateTime(reportDate.getReportDate()));
                        }
                        //2.保存报告日期
                        Iterator<Object> iterator = jsonObject.getJSONArray("data").iterator();
                        while (iterator.hasNext()) {
                            String report_date = ((JSONObject) iterator.next()).getString("REPORT_DATE").substring(0, 10);
                            if(!dateList.contains(report_date)){
                                invFinanceReportDateMapper.insertInvFinanceReportDate(new InvFinanceReportDate(stock.getCode(),"zcfz",DateUtils.dateTime(DateUtils.YYYY_MM_DD, report_date)));
                            }
                        }
                    }
                }
            } else {
                for (int i = 1; i < 20; i++) {//目前财富通为1-4类
                    String dateUrl = ev.getProperty("investment.finance-zcfz-date").replace("'companyType'", String.valueOf(i)) + stock.getMarket() + stock.getCode();
                    String jsonStr = HttpUtils.sendGet(dateUrl, new AtomicInteger(3));
                    if (null != jsonStr && !"".equals(jsonStr)) {
                        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
                        if (jsonObject.containsKey("data")) {
                            //1.查询当前股票已经落数的报告日期集合
                            List<InvFinanceReportDate> invFinanceReportDateList = invFinanceReportDateMapper.selectInvFinanceReportDateList(new InvFinanceReportDate(stock.getCode()));
                            List<String> dateList = new ArrayList<>();
                            for (InvFinanceReportDate reportDate : invFinanceReportDateList) {
                                dateList.add(DateUtils.dateTime(reportDate.getReportDate()));
                            }
                            //2.更新公司类型
                            stock.setCompanyType(String.valueOf(i));
                            invStockMapper.updateInvStock(stock);
                            //3.保存报告日期
                            Iterator<Object> iterator = jsonObject.getJSONArray("data").iterator();
                            while (iterator.hasNext()) {
                                String report_date = ((JSONObject) iterator.next()).getString("REPORT_DATE").substring(0, 10);
                                if(!dateList.contains(report_date)){
                                    invFinanceReportDateMapper.insertInvFinanceReportDate(new InvFinanceReportDate(stock.getCode(),"zcfz",DateUtils.dateTime(DateUtils.YYYY_MM_DD, report_date)));
                                }
                            }
                            break;
                        }
                    }
                }
            }
        } catch (Exception e) {
            log.error(">>>MyQuartzAsyncTask.invFinanceReportDateTask(" + stock.getCode() + ")异常" + e);
        }
    }



    /**
     * @Title: 异步执行invFinanceZcfzTask任务
     * @Description:
     * @author weny.yang
     * @date Sep 9, 2020
     */
    @Async("threadPoolTaskExecutor")
    public void invFinanceZcfzTask(InvStock stock) {
        try {
            /*
            1.最近的5期进行数据同步，如果和数据库一致则跳过，不一致则更新
            2.超过5期的其他的如果数据库不存在则新增，如果存在则不再同步
             */
            String companyType = stock.getCompanyType();
            List<String> dateList = new ArrayList<String>();
            List<InvFinanceReportDate> invFinanceReportDateList = invFinanceReportDateMapper.selectInvFinanceReportDateList(new InvFinanceReportDate(stock.getCode()));
            for(InvFinanceReportDate reportDate : invFinanceReportDateList){
                dateList.add(DateUtils.dateTime(reportDate.getReportDate()));
            }
            if (null != companyType && dateList.size() > 0) {
                List<InvFinanceZcfz> zcfzList = new ArrayList<InvFinanceZcfz>();
                zcfzList.addAll(invFinanceZcfzMapper.selectInvFinanceZcfzList(new InvFinanceZcfz(stock.getCode())));
                Map<String, InvFinanceZcfz> zcfzMap = new HashMap<String, InvFinanceZcfz>();
                for (int i=0;i<zcfzList.size();i++) {
                    InvFinanceZcfz zcfz = zcfzList.get(i);
                    if(i<5){
                        zcfzMap.put(zcfz.getReportDate().toString(), zcfz);
                    }else{
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
                    String ajaxUrl = ev.getProperty("investment.finance-zcfz-ajax").replace("'companyType'", stock.getCompanyType()).replace("'dates'", datesSb.toString()) + stock.getMarket() + stock.getCode();
                    String jsonStr = HttpUtils.sendGet(ajaxUrl, new AtomicInteger(3));
                    if (null != jsonStr && !"".equals(jsonStr)) {
                        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
                        if (jsonObject.containsKey("data")) {
                            Iterator<Object> iterator = jsonObject.getJSONArray("data").iterator();
                            while (iterator.hasNext()) {
                                //反射赋值
                                InvFinanceZcfz zcfz = new InvFinanceZcfz(stock.getCode());
                                Class<? extends InvFinanceZcfz> clazz = zcfz.getClass();
                                Field[] declaredFields = clazz.getDeclaredFields();
                                JSONObject next = (JSONObject)iterator.next();
                                for (Field field : declaredFields) {
                                    field.setAccessible(true);
                                    String genericType = field.getGenericType().toString();
                                    String elementName = StringUtils.toUnderScoreCase(field.getName()).toUpperCase();
                                    if(next.containsKey(elementName)){
                                        String valueString = next.getString(elementName);
                                        if ("class java.lang.Double".equals(genericType)) {
                                            Double value = NumFormatUtil.toDouble(valueString);
                                            field.set(zcfz, value);
                                        } else if ("class java.util.Date".equals(genericType)) {
                                            Date value = DateUtils.parseDate(valueString);
                                            field.set(zcfz, value);
                                        } else if ("class java.lang.String".equals(genericType)) {
                                            field.set(zcfz, valueString);
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
        } catch (Exception e) {
            log.error(">>>MyQuartzAsyncTask.invFinanceZcfzTask(" + stock.getCode() + ")异常" + e);
        }
    }


}
