package com.ruoyi.quartz.task;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.http.HttpUtils;
import com.ruoyi.investment.domain.InvStock;
import com.ruoyi.investment.mapper.InvStockMapper;
import com.ruoyi.quartz.async.MyQuartzAsyncTask;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 定时任务调度测试
 *
 * @author ruoyi
 */
@Slf4j
@Component("ryTask")
public class RyTask {
    @Resource
    private Environment ev;
    @Resource
    private MyQuartzAsyncTask myQuartzAsyncTask;
    @Resource
    private InvStockMapper invStockMapper;

    /**
     * 多参数任务示例
     */
    public void ryMultipleParams(String s, Boolean b, Long l, Double d, Integer i) {
        System.out.println(StringUtils.format("执行多参方法： 字符串类型{}，布尔类型{}，长整型{}，浮点型{}，整形{}", s, b, l, d, i));
    }
    /**
     * 单参数任务示例
     */
    public void ryOneParams(String params) {
        System.out.println("执行有参方法：" + params);
    }
    /**
     * 无参数任务示例
     */
    public void ryNoParams() {
        System.out.println("执行无参方法");
    }

    /**
     * 获取接口所有字段
     */
    public static Set<String> keySet = new HashSet<>();
    public void getInterfaceAllKey(String urls, String type) throws InterruptedException {//"investment.finance-zyzb-quarter"
        keySet.clear();
        log.info("========getInterfaceAllKey任务线程分发开始=========");
        List<InvStock> stockList = invStockMapper.selectInvStockVoNoDelisting();//获取所有未退市股
        String[] urlArr = urls.split(";");
        for (InvStock stock : stockList) {
            if ("4".equals(stock.getCompanyType())){
                for(String url : urlArr){
                    myQuartzAsyncTask.getInterfaceAllKey(stock,url,type);
                }
            }
        }

        Thread.sleep(60000);
        for (String key : keySet){
            System.out.println("`"+key+"` double DEFAULT NULL COMMENT '',");
        }
        log.info("========getInterfaceAllKey任务线程分发完成=========");

    }


    /**
     * 沪深A股基础数据抓取任务
     */
    public void invStockTask() {
        log.info("========invStockTask任务开始=========");
        String url = ev.getProperty("investment.stock-list");
        String jsonStr = HttpUtils.sendGet(url, new AtomicInteger(3));

        if (null != jsonStr) {
            List<InvStock> invStocks = invStockMapper.selectInvStockList(null);
            Map<String, InvStock> stockMap = new HashMap<>();
            for (InvStock stock : invStocks) {
                stockMap.put(stock.getCode(), stock);
            }

            JSONObject json = JSONObject.parseObject(jsonStr);// 解析jsonStr
            JSONArray diffArray = json.getJSONObject("data").getJSONArray("diff");
            for (int i = 0; i < diffArray.size(); i++) {
                JSONObject jsonObject = diffArray.getJSONObject(i);
                String code = jsonObject.getString("f12");
                String name = jsonObject.getString("f14");
                String market = "";
                if (code.startsWith("000") || code.startsWith("001") || code.startsWith("002") || code.startsWith("003") ||
                        code.startsWith("200") || code.startsWith("201") || code.startsWith("300") || code.startsWith("301")) {
                    market = "sz";
                } else if (code.startsWith("600") || code.startsWith("601") ||
                        code.startsWith("603") || code.startsWith("605") ||
                        code.startsWith("688") || code.startsWith("689") || code.startsWith("900")) {
                    market = "sh";
                }
                InvStock stock = new InvStock(code, name, market);
                if (!stockMap.containsKey(code)) {//数据库不存在，直接插入
                    invStockMapper.insertInvStock(stock);
                } else {
                    if (!stockMap.get(code).equals(stock)) {//数据库存在，但是有数据变更，进行更新
                        invStockMapper.updateInvStock(stock);
                    }
                }
            }
        }
        log.info("========invStockTask任务完成=========");
    }

    /**
     * 沪深A股财务分析-重要指标-报告期 数据抓取任务
     */
    public void invFinanceZyzbPeriodTask() {
        log.info("========invFinanceZyzbPeriodTask任务线程分发开始=========");
        List<InvStock> stockList = invStockMapper.selectInvStockVoNoDelisting();//获取所有未退市股
        for (InvStock stock : stockList) {
            myQuartzAsyncTask.invFinanceZyzbPeriodTask(stock);
        }
        log.info("========invFinanceZyzbPeriodTask任务线程分发完成=========");
    }

    /**
     * 沪深A股财务分析-重要指标-年度 数据抓取任务
     */
    public void invFinanceZyzbYearTask() {
        log.info("========invFinanceZyzbYearTask任务线程分发开始=========");
        List<InvStock> stockList = invStockMapper.selectInvStockVoNoDelisting();//获取所有未退市股
        for (InvStock stock : stockList) {
            myQuartzAsyncTask.invFinanceZyzbYearTask(stock);
        }
        log.info("========invFinanceZyzbYearTask任务线程分发完成=========");
    }

    /**
     * 沪深A股财务分析-重要指标-季度 数据抓取任务
     */
    public void invFinanceZyzbQuarterTask() {
        log.info("========invFinanceZyzbQuarterTask任务线程分发开始=========");
        List<InvStock> stockList = invStockMapper.selectInvStockVoNoDelisting();//获取所有未退市股
        for (InvStock stock : stockList) {
            myQuartzAsyncTask.invFinanceZyzbQuarterTask(stock);
        }
        log.info("========invFinanceZyzbQuarterTask任务线程分发完成=========");
    }

    /**
     * 沪深A股财务分析-资产负债-季度 数据抓取任务
     */
    public void invFinanceZcfzPeriodTask() {
        log.info("========invFinanceZcfzPeriodTask任务线程分发开始=========");
        List<InvStock> stockList = invStockMapper.selectInvStockVoNoDelisting();//获取所有未退市股
        for (InvStock stock : stockList) {
            if ("000001".equals(stock.getCode())){
                //myQuartzAsyncTask.invFinanceZcfzPeriodTask(stock);
            };
            myQuartzAsyncTask.invFinanceZcfzPeriodTask(stock);
        }
        log.info("========invFinanceZcfzPeriodTask任务线程分发完成=========");
    }





}
