package com.ruoyi.quartz.async;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.NumFormatUtil;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.http.HttpUtils;
import com.ruoyi.investment.domain.InvFinanceZyzbPeriod;
import com.ruoyi.investment.domain.InvFinanceZyzbQuarter;
import com.ruoyi.investment.domain.InvFinanceZyzbYear;
import com.ruoyi.investment.domain.InvStock;
import com.ruoyi.investment.mapper.InvFinanceZyzbPeriodMapper;
import com.ruoyi.investment.mapper.InvFinanceZyzbQuarterMapper;
import com.ruoyi.investment.mapper.InvFinanceZyzbYearMapper;
import com.ruoyi.investment.mapper.InvStockMapper;
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

    /**
     * @Title: 获取接口所有字段
     * @Description:
     * @author weny.yang
     * @date Sep 9, 2020
     */
    @Async("threadPoolTaskExecutor")
    public void getInterfaceAllKey(InvStock stock, String urlStr, String type) {

        try{
            String url = ev.getProperty(urlStr);
            if ("ym".equals(type)) {
                url += stock.getMarket() + stock.getCode();
            } else if ("nm".equals(type)) {
                url += stock.getCode();
            }
            String jsonStr = HttpUtils.sendGet(url, new AtomicInteger(3));
            if (null != jsonStr && !"".equals(jsonStr)) {
                JSONArray dataArray = JSONObject.parseObject(jsonStr).getJSONArray("data");
                if(null!=dataArray){
                    Iterator<Object> iterator = dataArray.iterator();
                    if (iterator.hasNext()){
                        JSONObject jsonObject = (JSONObject)iterator.next();
                        RyTask.keySet.addAll(jsonObject.keySet());
                    }
                }
            }
        } catch (Exception e) {
            log.error(">>>getInterfaceAllKey("+stock.getCode()+")异常" + e);
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
        try{
            String url = ev.getProperty("investment.finance-zyzb-period") + stock.getMarket() + stock.getCode();
            String jsonStr = HttpUtils.sendGet(url, new AtomicInteger(3));
            if (null != jsonStr && !"".equals(jsonStr)) {
                List<InvFinanceZyzbPeriod> invFinanceZyzbPeriodList = invFinanceZyzbPeriodMapper.selectInvFinanceZyzbPeriodList(new InvFinanceZyzbPeriod(stock.getCode()));
                Map<String, InvFinanceZyzbPeriod> zyzbPeriodMap = new HashMap<>();
                for (InvFinanceZyzbPeriod zyzbPeriod : invFinanceZyzbPeriodList) {
                    zyzbPeriodMap.put(zyzbPeriod.getReportDate().toString(), zyzbPeriod);
                }
                JSONArray dataArray = JSONObject.parseObject(jsonStr).getJSONArray("data");
                if(null!=dataArray){
                    Iterator<Object> iterator = dataArray.iterator();
                    while(iterator.hasNext()){
                        JSONObject jsonObject = (JSONObject)iterator.next();
                        //反射赋值
                        InvFinanceZyzbPeriod zyzbPeriod = new InvFinanceZyzbPeriod(stock.getCode());
                        Class<? extends InvFinanceZyzbPeriod> clazz = zyzbPeriod.getClass();
                        Field[] declaredFields = clazz.getDeclaredFields();
                        for(Field field : declaredFields){
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

                        if(zyzbPeriodMap.containsKey(zyzbPeriod.getReportDate().toString())){//数据库已有code指定日期报告
                            InvFinanceZyzbPeriod companies = zyzbPeriodMap.get(zyzbPeriod.getReportDate().toString());
                            companies.setId(null);
                            if(!companies.equals(zyzbPeriod)){//报告数据不相同，以最新获取为准更新数据库
                                invFinanceZyzbPeriodMapper.updateInvFinanceZyzbPeriod(zyzbPeriod);
                            }
                        }else{//数据库没有code指定日期报告，插入
                            invFinanceZyzbPeriodMapper.insertInvFinanceZyzbPeriod(zyzbPeriod);
                        }
                    }
                }
            }
        } catch (Exception e) {
            log.error(">>>MyQuartzAsyncTask.invFinanceZyzbPeriodTask("+stock.getCode()+")异常" + e);
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
        try{
            String url = ev.getProperty("investment.finance-zyzb-year") + stock.getMarket() + stock.getCode();
            String jsonStr = HttpUtils.sendGet(url, new AtomicInteger(3));
            if (null != jsonStr && !"".equals(jsonStr)) {
                List<InvFinanceZyzbYear> invFinanceZyzbYearList = invFinanceZyzbYearMapper.selectInvFinanceZyzbYearList(new InvFinanceZyzbYear(stock.getCode()));
                Map<String, InvFinanceZyzbYear> zyzbYearMap = new HashMap<>();
                for (InvFinanceZyzbYear zyzbYear : invFinanceZyzbYearList) {
                    zyzbYearMap.put(zyzbYear.getReportDate().toString(), zyzbYear);
                }
                JSONArray dataArray = JSONObject.parseObject(jsonStr).getJSONArray("data");
                if(null!=dataArray){
                    Iterator<Object> iterator = dataArray.iterator();
                    while(iterator.hasNext()){
                        JSONObject jsonObject = (JSONObject)iterator.next();
                        //反射赋值
                        InvFinanceZyzbYear zyzbYear = new InvFinanceZyzbYear(stock.getCode());
                        Class<? extends InvFinanceZyzbYear> clazz = zyzbYear.getClass();
                        Field[] declaredFields = clazz.getDeclaredFields();
                        for(Field field : declaredFields){
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

                        if(zyzbYearMap.containsKey(zyzbYear.getReportDate().toString())){//数据库已有code指定日期报告
                            InvFinanceZyzbYear companies = zyzbYearMap.get(zyzbYear.getReportDate().toString());
                            companies.setId(null);
                            if(!companies.equals(zyzbYear)){//报告数据不相同，以最新获取为准更新数据库
                                invFinanceZyzbYearMapper.updateInvFinanceZyzbYear(zyzbYear);
                            }
                        }else{//数据库没有code指定日期报告，插入
                            invFinanceZyzbYearMapper.insertInvFinanceZyzbYear(zyzbYear);
                        }
                    }
                }
            }
        } catch (Exception e) {
            log.error(">>>MyQuartzAsyncTask.invFinanceZyzbYearTask("+stock.getCode()+")异常" + e);
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
        try{
            String url = ev.getProperty("investment.finance-zyzb-quarter") + stock.getMarket() + stock.getCode();
            String jsonStr = HttpUtils.sendGet(url, new AtomicInteger(3));
            if (null != jsonStr && !"".equals(jsonStr)) {
                List<InvFinanceZyzbQuarter> invFinanceZyzbQuarterList = invFinanceZyzbQuarterMapper.selectInvFinanceZyzbQuarterList(new InvFinanceZyzbQuarter(stock.getCode()));
                Map<String, InvFinanceZyzbQuarter> zyzbQuarterMap = new HashMap<>();
                for (InvFinanceZyzbQuarter zyzbQuarter : invFinanceZyzbQuarterList) {
                    zyzbQuarterMap.put(zyzbQuarter.getReportDate().toString(), zyzbQuarter);
                }
                JSONArray dataArray = JSONObject.parseObject(jsonStr).getJSONArray("data");
                if(null!=dataArray){
                    Iterator<Object> iterator = dataArray.iterator();
                    while(iterator.hasNext()){
                        JSONObject jsonObject = (JSONObject)iterator.next();
                        //反射赋值
                        InvFinanceZyzbQuarter zyzbQuarter = new InvFinanceZyzbQuarter(stock.getCode());
                        Class<? extends InvFinanceZyzbQuarter> clazz = zyzbQuarter.getClass();
                        Field[] declaredFields = clazz.getDeclaredFields();
                        for(Field field : declaredFields){
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

                        if(zyzbQuarterMap.containsKey(zyzbQuarter.getReportDate().toString())){//数据库已有code指定日期报告
                            InvFinanceZyzbQuarter companies = zyzbQuarterMap.get(zyzbQuarter.getReportDate().toString());
                            companies.setId(null);
                            if(!companies.equals(zyzbQuarter)){//报告数据不相同，以最新获取为准更新数据库
                                invFinanceZyzbQuarterMapper.updateInvFinanceZyzbQuarter(zyzbQuarter);
                            }
                        }else{//数据库没有code指定日期报告，插入
                            invFinanceZyzbQuarterMapper.insertInvFinanceZyzbQuarter(zyzbQuarter);
                        }
                    }
                }
            }
        } catch (Exception e) {
            log.error(">>>MyQuartzAsyncTask.invFinanceZyzbQuarterTask("+stock.getCode()+")异常" + e);
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
        try{
            /*
            1.如果公司类型为空，先初始化公司类型
            2.获取报告期的日期
            3.根据报告期获取资产负债信息
             */
            String companyType = stock.getCompanyType();
            String dates = null;
            if(null!=companyType){
                String dateUrl = ev.getProperty("investment.finance-zcfz-date-period").replace("'companyType'", companyType) + stock.getMarket() + stock.getCode();
                String jsonStr = HttpUtils.sendGet(dateUrl, new AtomicInteger(3));
                if (null != jsonStr && !"".equals(jsonStr)) {
                    JSONArray dataArray = JSONObject.parseObject(jsonStr).getJSONArray("data");
                    if(null!=dataArray && !dataArray.isEmpty()) {
                        Iterator<Object> iterator = dataArray.iterator();
                        while(iterator.hasNext()){
                            if(null==dates){
                                dates = ((JSONObject)iterator.next()).getString("REPORT_DATE").substring(0,10);
                            }else{
                                dates += "%"+((JSONObject)iterator.next()).getString("REPORT_DATE").substring(0,10);
                            }
                        }
                    }
                }
            }else{
                for (int i = 0; i < 10; i++) {
                    String dateUrl = ev.getProperty("investment.finance-zcfz-date-period").replace("'companyType'", String.valueOf(i)) + stock.getMarket() + stock.getCode();
                    String jsonStr = HttpUtils.sendGet(dateUrl, new AtomicInteger(3));
                    if (null != jsonStr && !"".equals(jsonStr)) {
                        JSONArray dataArray = JSONObject.parseObject(jsonStr).getJSONArray("data");
                        if(null!=dataArray && !dataArray.isEmpty()) {
                            companyType = String.valueOf(i);
                            Iterator<Object> iterator = dataArray.iterator();
                            while(iterator.hasNext()){
                                if(null==dates){
                                    dates = ((JSONObject)iterator.next()).getString("REPORT_DATE").substring(0,10);
                                }else{
                                    dates += "%"+((JSONObject)iterator.next()).getString("REPORT_DATE").substring(0,10);
                                }
                            }
                            //更新公司类型
                            stock.setCompanyType(companyType);
                            invStockMapper.updateInvStock(stock);
                            break;
                        }
                    }
                }
            }

            /*

            if (null != companyType && null != dates) {
                String ajaxUrl = ev.getProperty("investment.finance-zcfz-ajax-period").replace("'companyType'", companyType).replace("'dates'", dates) + stock.getMarket() + stock.getCode();

                String jsonStr = HttpUtils.sendGet(ajaxUrl, new AtomicInteger(3));
                if (null != jsonStr && !"".equals(jsonStr)) {
                    List<InvFinanceZyzbPeriod> invFinanceZyzbPeriodList = invFinanceZyzbPeriodMapper.selectInvFinanceZyzbPeriodList(new InvFinanceZyzbPeriod(stock.getCode()));
                    Map<String, InvFinanceZyzbPeriod> zyzbPeriodMap = new HashMap<>();
                    for (InvFinanceZyzbPeriod zyzbPeriod : invFinanceZyzbPeriodList) {
                        zyzbPeriodMap.put(zyzbPeriod.getReportDate().toString(), zyzbPeriod);
                    }
                    JSONArray dataArray = JSONObject.parseObject(jsonStr).getJSONArray("data");
                    if(null!=dataArray){
                        Iterator<Object> iterator = dataArray.iterator();
                        while(iterator.hasNext()){
                            JSONObject jsonObject = (JSONObject)iterator.next();
                            //反射赋值
                            InvFinanceZyzbPeriod zyzbPeriod = new InvFinanceZyzbPeriod(stock.getCode());
                            Class<? extends InvFinanceZyzbPeriod> clazz = zyzbPeriod.getClass();
                            Field[] declaredFields = clazz.getDeclaredFields();
                            for(Field field : declaredFields){
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

                            if(zyzbPeriodMap.containsKey(zyzbPeriod.getReportDate().toString())){//数据库已有code指定日期报告
                                InvFinanceZyzbPeriod companies = zyzbPeriodMap.get(zyzbPeriod.getReportDate().toString());
                                companies.setId(null);
                                if(!companies.equals(zyzbPeriod)){//报告数据不相同，以最新获取为准更新数据库
                                    invFinanceZyzbPeriodMapper.updateInvFinanceZyzbPeriod(zyzbPeriod);
                                }
                            }else{//数据库没有code指定日期报告，插入
                                invFinanceZyzbPeriodMapper.insertInvFinanceZyzbPeriod(zyzbPeriod);
                            }
                        }
                    }
                }
            }

            */
        } catch (Exception e) {
            log.error(">>>MyQuartzAsyncTask.invFinanceZyzbPeriodTask("+stock.getCode()+")异常" + e);
        }
    }
}
