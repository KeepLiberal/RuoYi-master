package com.ruoyi.quartz.task;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.http.HttpUtils;
import com.ruoyi.common.utils.spring.SpringUtils;
import com.ruoyi.investment.domain.InvStock;
import com.ruoyi.investment.mapper.InvStockMapper;
import com.ruoyi.quartz.async.MyQuartzAsyncTask;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ThreadPoolExecutor;
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

    //从容器中取线程池
    private ThreadPoolTaskExecutor threadPoolTaskExecutor = SpringUtils.getBean("threadPoolTaskExecutor");

    /**
     * 判断线程池状态
     */
    private static void isCompletedByTaskCount(ThreadPoolExecutor threadPool, Integer value) {
        while (threadPool.getQueue().size()>value) {
            //log.info("计划线程数："+ threadPool.getTaskCount()+" 完成线程数："+ threadPool.getCompletedTaskCount()+" 排队线程数："+ threadPool.getQueue().size()+" 活动线程数："+ threadPool.getActiveCount());
        }
    }

    /**
     * 多参数任务示例
     */
    public void ryMultipleParams(String s, Boolean b, Long l, Double d, Integer i) {
        System.out.println(StringUtils.format("执行多参方法： 字符串类型{}，布尔类型{}，长整型{}，浮点型{}，整形{}", s, b, l, d, i));
    }

    /**
     * 单参数任务示例
     */
    public void ryParams(String params) {
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

    public void getInterfaceAllKey(String urls, String type) {//"investment.finance-zyzb-quarter"
        keySet.clear();
        log.info("========getInterfaceAllKey任务线程分发开始=========");
        List<InvStock> stockList = invStockMapper.selectInvStockVoNoDelisting();//获取所有未退市股
        String[] urlArr = urls.split(";");
        for (InvStock stock : stockList) {
            for (String url : urlArr) {
                myQuartzAsyncTask.getInterfaceAllKey(stock, url, type);
            }
        }
        isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 1);
        log.info("========getInterfaceAllKey任务线程分发完成=========");
    }

    /**
     * 写出接口所有字段
     */
    public void writeAllKey() throws IOException {
        File file = new File("/Users/yay/WorkSpace/RuoYi/RuoYi-master/ruoyi-investment/src/main/resources/key/keys.txt");
        // 判断文件是否存在
        if (!file.exists()) {
            file.createNewFile();
        }
        // 遍历写入
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        for (String key : keySet) {
            bw.write("`" + key + "` double default null comment '-'," + "\r\n");
        }
        bw.flush();
        bw.close();

        keySet.clear();
    }

    /**
     * 下载html
     */
    public void downHtml() throws IOException {//"investment.finance-zyzb-quarter"
        log.info("========getInterfaceAllKey任务线程分发开始=========");
        List<InvStock> stockList = invStockMapper.selectInvStockVoNoDelisting();//获取所有未退市股
        for (InvStock stock : stockList) {
            String url = "https://emweb.eastmoney.com/PC_HSF10/NewFinanceAnalysis/Index?type=web&code=" + stock.getMarket() + stock.getCode();
            myQuartzAsyncTask.downHtml(url, stock.getCode());
        }
        isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 1);
        log.info("========getInterfaceAllKey任务线程分发完成=========");
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * 沪深A股基础数据抓取任务
     */
    public void invStockTask() {
        log.info("========invStockTask任务开始=========");
        String url = ev.getProperty("investment.stock-list");
        String jsonStr = HttpUtils.sendGet(url, new AtomicInteger(10));
        if (null != jsonStr && !"".equals(jsonStr)) {
            JSONObject json = JSONObject.parseObject(jsonStr);// 解析jsonStr
            JSONArray diffArray = json.getJSONObject("data").getJSONArray("diff");
            if (null != diffArray && !diffArray.isEmpty()) {
                List<InvStock> invStocks = invStockMapper.selectInvStockList(null);
                Map<String, InvStock> stockMap = new HashMap<>();
                for (InvStock stock : invStocks) {
                    stockMap.put(stock.getCode(), stock);
                }
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
                    if (stockMap.containsKey(code)) {
                        //数据库存在，但数据不一致，进行更新
                        if (!stockMap.get(code).equals(stock)) {
                            invStockMapper.updateInvStock(stock);
                        }
                    } else {
                        //数据库不存在，直接插入
                        invStockMapper.insertInvStock(stock);
                    }
                }
            }
        }
        log.info("========invStockTask任务完成=========");
    }


    /**
     * 财务分析-重要指标
     */
    public void invFinanceTask() {
        //保证线程池比较闲时候再开始任务
        isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 1000);

        List<InvStock> stockList = invStockMapper.selectInvStockVoNoDelisting();//获取所有未退市股
        log.info("========财务分析-重要指标 任务开始=========");
        String finance_zyzb_bgq = ev.getProperty("investment.finance-zyzb-bgq");
        String finance_zyzb_nd = ev.getProperty("investment.finance-zyzb-nd");
        String finance_zyzb_jd = ev.getProperty("investment.finance-zyzb-jd");
        for (InvStock stock : stockList) {
            myQuartzAsyncTask.invFinanceZyzbTask(stock, finance_zyzb_bgq + stock.getMarket() + stock.getCode(), "bgq", new AtomicInteger(10));
            myQuartzAsyncTask.invFinanceZyzbTask(stock, finance_zyzb_nd + stock.getMarket() + stock.getCode(), "nd", new AtomicInteger(10));
            myQuartzAsyncTask.invFinanceZyzbTask(stock, finance_zyzb_jd + stock.getMarket() + stock.getCode(), "jd", new AtomicInteger(10));
        }
        isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 1000);
        log.info("========财务分析-重要指标 任务完成=========");

        log.info("========财务分析-杜邦分析 任务开始 =========");
        String finance_zcfz_dbfx = ev.getProperty("investment.finance-dbfx");
        for (InvStock stock : stockList) {
            myQuartzAsyncTask.invFinanceDbfxTask(stock, finance_zcfz_dbfx + stock.getMarket() + stock.getCode(), new AtomicInteger(10));
        }
        isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 1000);
        log.info("========财务分析-杜邦分析 任务完成=========");

        log.info("========财务分析-资产负债-报告日期 任务开始 =========");
        String finance_zcfz_date_bgq = ev.getProperty("investment.finance-zcfz-date-bgq");
        String finance_zcfz_date_nd = ev.getProperty("investment.finance-zcfz-date-nd");
        for (InvStock stock : stockList) {
            myQuartzAsyncTask.invFinanceReportDateTask(stock, finance_zcfz_date_bgq + stock.getMarket() + stock.getCode(), "zcfz", "bgq", new AtomicInteger(10));
            myQuartzAsyncTask.invFinanceReportDateTask(stock, finance_zcfz_date_nd + stock.getMarket() + stock.getCode(), "zcfz", "nd", new AtomicInteger(10));
        }
        isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 1000);
        log.info("========财务分析-资产负债-报告日期 任务完成=========");

        log.info("========财务分析-资产负债 任务开始=========");
        String finance_zcfz_ajax_bgq = ev.getProperty("investment.finance-zcfz-ajax-bgq");
        String finance_zcfz_ajax_nd = ev.getProperty("investment.finance-zcfz-ajax-nd");
        for (InvStock stock : stockList) {
            myQuartzAsyncTask.invFinanceZcfzTask(stock, finance_zcfz_ajax_bgq + stock.getMarket() + stock.getCode(), "zcfz", "bgq", new AtomicInteger(10));
            myQuartzAsyncTask.invFinanceZcfzTask(stock, finance_zcfz_ajax_nd + stock.getMarket() + stock.getCode(), "zcfz", "nd", new AtomicInteger(10));
        }
        isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 1);
        log.info("========财务分析-资产负债 任务完成=========");
    }





}
