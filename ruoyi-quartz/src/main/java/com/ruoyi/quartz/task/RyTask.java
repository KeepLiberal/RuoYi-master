package com.ruoyi.quartz.task;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.http.HttpUtils;
import com.ruoyi.investment.domain.InvStock;
import com.ruoyi.investment.mapper.InvStockMapper;
import com.ruoyi.quartz.async.MyQuartzAsyncTask;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
        log.info("========getInterfaceAllKey任务线程分发完成=========");
    }

    public void writeAllKey() throws IOException {
        File file = new File("/Users/yay/WorkSpace/RuoYi/RuoYi-master/ruoyi-quartz/src/main/resources/keys.txt");
        // 判断文件是否存在
        if (!file.exists()) {
            file.createNewFile();
        }
        // 遍历写入
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        for (String key : keySet) {
            bw.write("`"+key+"` double default null comment '-',"+"\r\n");
        }
        bw.flush();
        bw.close();

        keySet.clear();
    }

    /**
     * 获取接口字段描述页面
     */
    public void getInterfaceKeyDes(String key) {//"investment.finance-zyzb-quarter"

        log.info("========getInterfaceAllKey任务线程分发开始=========");
        List<InvStock> stockList = invStockMapper.selectInvStockVoNoDelisting();//获取所有未退市股

        int i = 0;
        for (InvStock stock : stockList) {
            String url = "https://emweb.eastmoney.com/PC_HSF10/NewFinanceAnalysis/Index?type=web&code="+stock.getMarket()+stock.getCode();
            myQuartzAsyncTask.getInterfaceKeyDes(url, key);
            System.out.println(i);
            i++;
        }
        log.info("========getInterfaceAllKey任务线程分发完成=========");
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * 沪深A股基础数据抓取任务
     */
    public void invStockTask() {
        log.info("========invStockTask任务开始=========");
        String url = ev.getProperty("investment.stock-list");
        String jsonStr = HttpUtils.sendGet(url, new AtomicInteger(3));
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
     * 财务分析-资产负债-报告日期抓取
     */
    public void invFinanceReportDateTask() {
        log.info("========invFinanceReportDateTask任务线程分发开始=========");
        List<InvStock> stockList = invStockMapper.selectInvStockVoNoDelisting();//获取所有未退市股
        for (InvStock stock : stockList) {
               myQuartzAsyncTask.invFinanceReportDateTask(stock);
        }
        log.info("========invFinanceReportDateTask任务线程分发完成=========");
    }


    /**
     * 财务分析-资产负债-详细报告数据抓取
     */
    public void invFinanceZcfzTask() {
        log.info("========invFinanceZcfzTask任务线程分发开始=========");
        List<InvStock> stockList = invStockMapper.selectInvStockVoNoDelisting();//获取所有未退市股
        for (InvStock stock : stockList) {
            myQuartzAsyncTask.invFinanceZcfzTask(stock);
        }
        log.info("========invFinanceZcfzTask任务线程分发完成=========");
    }


    public static void main(String[] args) {
        String url = "https://emweb.eastmoney.com/PC_HSF10/NewFinanceAnalysis/zcfzbAjaxNew?companyType=3&reportDateType=0&reportType=1&dates=2021-12-31&code=sz000001";

        String jsonStr = HttpUtils.sendGet(url, new AtomicInteger(3));
        JSONObject json = JSONObject.parseObject(jsonStr);// 解析jsonStr
        System.out.println(json);
    }



}
