package com.ruoyi.quartz.task;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.core.domain.entity.SysDictData;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.http.HttpUtils;
import com.ruoyi.common.utils.spring.SpringUtils;
import com.ruoyi.investment.domain.InvStock;
import com.ruoyi.investment.mapper.InvStockMapper;
import com.ruoyi.quartz.async.MyQuartzAsyncTask;
import com.ruoyi.quartz.util.TaskUtils;
import com.ruoyi.system.mapper.SysDictDataMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 定时任务调度
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
    @Resource
    private SysDictDataMapper dictDataMapper;

    /**
     * 容器中的线程池
     */
    private ThreadPoolTaskExecutor threadPoolTaskExecutor = SpringUtils.getBean("threadPoolTaskExecutor");

    /**
     * 存放接口所有字段
     */
    public static Set<String> keySet = new HashSet<>();


    ///////////////////////////////////////////////////////个股信息//////////////////////////////////////////////////////

    /**
     * 判断线程池状态
     */
    private static void isCompletedByTaskCount(ThreadPoolExecutor threadPool, Integer value) {
        while (threadPool.getQueue().size() > value) ;
    }

    /**
     * 沪深A股基础数据抓取
     */
    private void invStockTask() {
        SysDictData dictData = new SysDictData();
        dictData.setDictType("market_type");
        List<SysDictData> dictDatas = dictDataMapper.selectDictDataList(dictData);

        String url = ev.getProperty("inv.stock-list");
        String jsonStr = HttpUtils.sendGet(url, new AtomicInteger(10));
        if (StringUtils.isNotEmpty(jsonStr)) {
            JSONObject jsonObject = JSONObject.parseObject(jsonStr);
            if (jsonObject.containsKey("data")) {
                JSONObject dataObject = jsonObject.getJSONObject("data");
                if (dataObject.containsKey("diff")) {
                    JSONArray diffArray = dataObject.getJSONArray("diff");
                    if (!diffArray.isEmpty()) {
                        List<InvStock> invStocks = invStockMapper.selectInvStockList(null);
                        Map<String, InvStock> stockMap = new HashMap<>();
                        for (InvStock stock : invStocks) {
                            stockMap.put(stock.getCode(), stock);
                        }

                        Iterator<Object> iterator = diffArray.iterator();
                        while (iterator.hasNext()) {
                            JSONObject next = (JSONObject) iterator.next();
                            String code = next.getString("f12");
                            String name = next.getString("f14");
                            String market = null;
                            //股票市场字典数据匹配
                            for (SysDictData dict : dictDatas) {
                                if (code.startsWith(dict.getDictValue())) {
                                    market = dict.getDictLabel();
                                }
                            }
                            if (StringUtils.isEmpty(market)) {
                                log.error(">>>invStockTask任务:" + code + " " + name + " [" + code.substring(0, 3) + "]对应的股票市场不在字典表market_type内，请添加");
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
            }
        }
    }

    /**
     * 财务分析数据抓取
     */
    public void invFinanceTask() {
        log.info("================财务分析任务 等待=================");
        //保证线程池比较闲时候再开始任务
        isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 1000);
        log.info("================财务分析任务 开始=================");

        log.info("========沪深A股基础数据初始化 任务开始=========");
        //沪深A股基础数据抓取任务
        invStockTask();
        log.info("========沪深A股基础数据初始化 任务完成=========");

        //获取所有未退市股
        List<InvStock> stockList = invStockMapper.selectInvStockVoNoDelisting();

        log.info("========财务分析-报告日期 任务开始=========");
        for (InvStock stock : stockList) {
            myQuartzAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("inv.finance-zcfz-date-bgq"), "zcfz", "bgq", new AtomicInteger(10));
            myQuartzAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("inv.finance-zcfz-date-nd"), "zcfz", "nd", new AtomicInteger(10));

            myQuartzAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("inv.finance-lr-date-bgq"), "lr", "bgq", new AtomicInteger(10));
            myQuartzAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("inv.finance-lr-date-nd"), "lr", "nd", new AtomicInteger(10));
            myQuartzAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("inv.finance-lr-date-jd"), "lr", "jd", new AtomicInteger(10));

            myQuartzAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("inv.finance-xjll-date-bgq"), "xjll", "bgq", new AtomicInteger(10));
            myQuartzAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("inv.finance-xjll-date-nd"), "xjll", "nd", new AtomicInteger(10));
            myQuartzAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("inv.finance-xjll-date-jd"), "xjll", "jd", new AtomicInteger(10));
        }
        isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 1000);
        log.info("========财务分析-报告日期 任务完成=========");

        log.info("========财务分析-重要指标 任务开始=========");
        for (InvStock stock : stockList) {
            myQuartzAsyncTask.invFinanceZyzbTask(stock, ev.getProperty("inv.finance-zyzb-bgq"), "bgq", new AtomicInteger(10));
            myQuartzAsyncTask.invFinanceZyzbTask(stock, ev.getProperty("inv.finance-zyzb-nd"), "nd", new AtomicInteger(10));
            myQuartzAsyncTask.invFinanceZyzbTask(stock, ev.getProperty("inv.finance-zyzb-jd"), "jd", new AtomicInteger(10));
        }
        isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 1000);
        log.info("========财务分析-重要指标 任务完成=========");

        log.info("========财务分析-杜邦分析 任务开始=========");
        for (InvStock stock : stockList) {
            myQuartzAsyncTask.invFinanceDbfxTask(stock, ev.getProperty("inv.finance-dbfx"), new AtomicInteger(10));
        }
        isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 1000);
        log.info("========财务分析-杜邦分析 任务完成=========");

        log.info("========财务分析-资产负债 任务开始=========");
        SysDictData dictData = new SysDictData();
        dictData.setDictType("opinion_type");
        List<SysDictData> dictDatas = dictDataMapper.selectDictDataList(dictData);
        for (InvStock stock : stockList) {
            myQuartzAsyncTask.invFinanceZcfzTask(stock, ev.getProperty("inv.finance-zcfz-ajax-bgq"), "zcfz", "bgq", dictDatas, new AtomicInteger(10));
            myQuartzAsyncTask.invFinanceZcfzTask(stock, ev.getProperty("inv.finance-zcfz-ajax-nd"), "zcfz", "nd", dictDatas, new AtomicInteger(10));
        }
        isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 1000);
        log.info("========财务分析-资产负债 任务完成=========");

        log.info("========财务分析-利润 任务开始=========");
        for (InvStock stock : stockList) {
            myQuartzAsyncTask.invFinanceLrTask(stock, ev.getProperty("inv.finance-lr-ajax-bgq"), "lr", "bgq", dictDatas, new AtomicInteger(10));
            myQuartzAsyncTask.invFinanceLrTask(stock, ev.getProperty("inv.finance-lr-ajax-nd"), "lr", "nd", dictDatas, new AtomicInteger(10));
            myQuartzAsyncTask.invFinanceLrTask(stock, ev.getProperty("inv.finance-lr-ajax-jd"), "lr", "jd", dictDatas, new AtomicInteger(10));
        }
        isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 1000);
        log.info("========财务分析-利润 任务完成=========");

        log.info("========财务分析-现金流量 任务开始=========");
        for (InvStock stock : stockList) {
            myQuartzAsyncTask.invFinanceXjllTask(stock, ev.getProperty("inv.finance-xjll-ajax-bgq"), "xjll", "bgq", dictDatas, new AtomicInteger(10));
            myQuartzAsyncTask.invFinanceXjllTask(stock, ev.getProperty("inv.finance-xjll-ajax-nd"), "xjll", "nd", dictDatas, new AtomicInteger(10));
            myQuartzAsyncTask.invFinanceXjllTask(stock, ev.getProperty("inv.finance-xjll-ajax-jd"), "xjll", "jd", dictDatas, new AtomicInteger(10));
        }
        isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 1000);
        log.info("========财务分析-现金流量 任务完成=========");

        log.info("========财务分析-百分比 任务开始=========");
        for (InvStock stock : stockList) {
            myQuartzAsyncTask.invFinanceBfbTask(stock, ev.getProperty("inv.finance-bfb-bgq"), "bgq", new AtomicInteger(10));
            myQuartzAsyncTask.invFinanceBfbTask(stock, ev.getProperty("inv.finance-bfb-nd"), "nd", new AtomicInteger(10));
            myQuartzAsyncTask.invFinanceBfbTask(stock, ev.getProperty("inv.finance-bfb-jd"), "jd", new AtomicInteger(10));
        }
        isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 0);
        log.info("========财务分析-百分比 任务完成=========");

        log.info("================财务分析任务  完成=================");
    }

    ///////////////////////////////////////////////////////快速工具///////////////////////////////////////////////////////

    /**
     * 生成接口对应SQL文件
     */
    public void createInterfaceSqlFile(String interfaceUrls, String webUrl, String fileName) throws IOException {
        log.info("========生成SQL 任务等待=========");
        isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 0);
        log.info("========生成SQL 任务开始=========");
        keySet.clear();

        List<InvStock> stockList = invStockMapper.selectInvStockVoNoDelisting();//获取所有未退市股
        String[] urlArr = interfaceUrls.split(";");
        for (InvStock stock : stockList) {
            //1.多线程获取接口字段
            for (String interfaceUrl : urlArr) {
                myQuartzAsyncTask.getInterfaceKey(stock, ev.getProperty("inv." + interfaceUrl));
            }
            //2.多线程下载接口所在的HTML文件
            myQuartzAsyncTask.downInterfaceHtml(stock, ev.getProperty("inv." + webUrl), fileName);
        }
        isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 0);

        //3.匹配字段和HTML中的描述并生成SQL文件
        TaskUtils.writeSqlFile(stockList, fileName);
        log.info("========生成SQL 任务完成=========");
    }

    ///////////////////////////////////////////////////////示例代码//////////////////////////////////////////////////////

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
}
