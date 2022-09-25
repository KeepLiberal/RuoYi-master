package com.ruoyi.quartz.async;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.NumFormatUtil;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.http.HttpUtils;
import com.ruoyi.investment.domain.InvFinanceZyzbQuarter;
import com.ruoyi.investment.domain.InvFinanceZyzbYear;
import com.ruoyi.investment.domain.InvStock;
import com.ruoyi.investment.mapper.InvFinanceZyzbQuarterMapper;
import com.ruoyi.investment.mapper.InvFinanceZyzbYearMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.Field;
import java.util.*;


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
    private InvFinanceZyzbQuarterMapper invFinanceZyzbQuarterMapper;
    @Resource
    private InvFinanceZyzbYearMapper invFinanceZyzbYearMapper;


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
            String jsonStr = HttpUtils.sendGet(url, "", "UTF-8");
            if (null != jsonStr && !"".equals(jsonStr)) {
                List<InvFinanceZyzbQuarter> invFinanceZyzbQuarterList = invFinanceZyzbQuarterMapper.selectInvFinanceZyzbQuarterList(new InvFinanceZyzbQuarter(stock.getCode()));
                Map<String, InvFinanceZyzbQuarter> zyzbQuarterMap = new HashMap<>();
                for (InvFinanceZyzbQuarter zyzbQuarter : invFinanceZyzbQuarterList) {
                    zyzbQuarterMap.put(zyzbQuarter.getReportDate().toString(), zyzbQuarter);
                }
                JSONObject json = JSONObject.parseObject(jsonStr);// 解析jsonStr
                JSONArray dataArray = json.getJSONArray("data");
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
     * @Title: 异步执行invFinanceZyzbYearTask任务
     * @Description:
     * @author weny.yang
     * @date Sep 9, 2020
     */
    @Async("threadPoolTaskExecutor")
    public void invFinanceZyzbYearTask(InvStock stock) {
        try{
            String url = ev.getProperty("investment.finance-zyzb-year") + stock.getMarket() + stock.getCode();
            String jsonStr = HttpUtils.sendGet(url, "", "UTF-8");
            if (null != jsonStr && !"".equals(jsonStr)) {
                List<InvFinanceZyzbYear> invFinanceZyzbYearList = invFinanceZyzbYearMapper.selectInvFinanceZyzbYearList(new InvFinanceZyzbYear(stock.getCode()));
                Map<String, InvFinanceZyzbYear> zyzbYearMap = new HashMap<>();
                for (InvFinanceZyzbYear zyzbYear : invFinanceZyzbYearList) {
                    zyzbYearMap.put(zyzbYear.getReportDate().toString(), zyzbYear);
                }

                JSONObject json = JSONObject.parseObject(jsonStr);// 解析jsonStr
                JSONArray dataArray = json.getJSONArray("data");
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

}
