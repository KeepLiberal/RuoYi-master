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
import com.ruoyi.system.mapper.SysDictDataMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.*;
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
     * @Title: isCompletedByTaskCount
     * @Description:判断线程池状态
     * @author weny.yang
     * @date Sep 9, 2020
     */
    private static void isCompletedByTaskCount(ThreadPoolExecutor threadPool, Integer value) {
        while (threadPool.getQueue().size() > value);
    }

    /**
     * @Title: invStockTask
     * @Description: 沪深A股基础数据抓取
     * @author weny.yang
     * @date Sep 9, 2020
     */
    private void invStockTask() {
        log.info("========invStockTask任务开始=========");
        SysDictData dictData = new SysDictData();
        dictData.setDictType("market_type");
        List<SysDictData> dictDatas = dictDataMapper.selectDictDataList(dictData);

        String url = ev.getProperty("investment.stock-list");
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
                            for (SysDictData dict : dictDatas){
                                if (code.startsWith(dict.getDictValue())){
                                    market = dict.getDictLabel();
                                }
                            }
                            if(StringUtils.isEmpty(market)){
                                log.error(">>>invStockTask任务:"+code+" "+name+" 对应的股票市场(market)不在字典表market_type内，请添加");
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
        log.info("========invStockTask任务完成=========");
    }

    /**
     * @Title: invFinanceTask
     * @Description: 财务分析数据抓取
     * @author weny.yang
     * @date Sep 9, 2020
     */
    public void invFinanceTask() {
        log.info("================财务分析任务  开始=================");
        //保证线程池比较闲时候再开始任务
        isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 1000);

        //沪深A股基础数据抓取任务
        invStockTask();
        //获取所有未退市股
        List<InvStock> stockList = invStockMapper.selectInvStockVoNoDelisting();

        log.info("========财务分析-报告日期 任务开始=========");
        for (InvStock stock : stockList) {
            myQuartzAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("investment.finance-zcfz-date-bgq") + stock.getMarket() + stock.getCode(), "zcfz", "bgq", new AtomicInteger(10));
            myQuartzAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("investment.finance-zcfz-date-nd") + stock.getMarket() + stock.getCode(), "zcfz", "nd", new AtomicInteger(10));

            myQuartzAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("investment.finance-lr-date-bgq") + stock.getMarket() + stock.getCode(), "lr", "bgq", new AtomicInteger(10));
            myQuartzAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("investment.finance-lr-date-nd") + stock.getMarket() + stock.getCode(), "lr", "nd", new AtomicInteger(10));
            myQuartzAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("investment.finance-lr-date-jd") + stock.getMarket() + stock.getCode(), "lr", "jd", new AtomicInteger(10));

            myQuartzAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("investment.finance-xjll-date-bgq") + stock.getMarket() + stock.getCode(), "xjll", "bgq", new AtomicInteger(10));
            myQuartzAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("investment.finance-xjll-date-nd") + stock.getMarket() + stock.getCode(), "xjll", "nd", new AtomicInteger(10));
            myQuartzAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("investment.finance-xjll-date-jd") + stock.getMarket() + stock.getCode(), "xjll", "jd", new AtomicInteger(10));
        }
        isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 1000);
        log.info("========财务分析-报告日期 任务完成=========");

        log.info("========财务分析-重要指标 任务开始=========");
        for (InvStock stock : stockList) {
            myQuartzAsyncTask.invFinanceZyzbTask(stock, ev.getProperty("investment.finance-zyzb-bgq") + stock.getMarket() + stock.getCode(), "bgq", new AtomicInteger(10));
            myQuartzAsyncTask.invFinanceZyzbTask(stock, ev.getProperty("investment.finance-zyzb-nd") + stock.getMarket() + stock.getCode(), "nd", new AtomicInteger(10));
            myQuartzAsyncTask.invFinanceZyzbTask(stock, ev.getProperty("investment.finance-zyzb-jd") + stock.getMarket() + stock.getCode(), "jd", new AtomicInteger(10));
        }
        isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 1000);
        log.info("========财务分析-重要指标 任务完成=========");

        log.info("========财务分析-杜邦分析 任务开始=========");
        for (InvStock stock : stockList) {
            myQuartzAsyncTask.invFinanceDbfxTask(stock, ev.getProperty("investment.finance-dbfx") + stock.getMarket() + stock.getCode(), new AtomicInteger(10));
        }
        isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 1000);
        log.info("========财务分析-杜邦分析 任务完成=========");

        log.info("========财务分析-资产负债 任务开始=========");
        for (InvStock stock : stockList) {
            myQuartzAsyncTask.invFinanceZcfzTask(stock, ev.getProperty("investment.finance-zcfz-ajax-bgq") + stock.getMarket() + stock.getCode(), "zcfz", "bgq", new AtomicInteger(10));
            myQuartzAsyncTask.invFinanceZcfzTask(stock, ev.getProperty("investment.finance-zcfz-ajax-nd") + stock.getMarket() + stock.getCode(), "zcfz", "nd", new AtomicInteger(10));
        }
        isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 1000);
        log.info("========财务分析-资产负债 任务完成=========");

        log.info("========财务分析-利润 任务开始=========");
        for (InvStock stock : stockList) {
            myQuartzAsyncTask.invFinanceLrTask(stock, ev.getProperty("investment.finance-lr-ajax-bgq") + stock.getMarket() + stock.getCode(), "lr", "bgq", new AtomicInteger(10));
            myQuartzAsyncTask.invFinanceLrTask(stock, ev.getProperty("investment.finance-lr-ajax-nd") + stock.getMarket() + stock.getCode(), "lr", "nd", new AtomicInteger(10));
            myQuartzAsyncTask.invFinanceLrTask(stock, ev.getProperty("investment.finance-lr-ajax-jd") + stock.getMarket() + stock.getCode(), "lr", "jd", new AtomicInteger(10));
        }
        isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 1000);
        log.info("========财务分析-利润 任务完成=========");

        log.info("========财务分析-现金流量 任务开始=========");
        for (InvStock stock : stockList) {
            myQuartzAsyncTask.invFinanceXjllTask(stock, ev.getProperty("investment.finance-xjll-ajax-bgq") + stock.getMarket() + stock.getCode(), "xjll", "bgq", new AtomicInteger(10));
            myQuartzAsyncTask.invFinanceXjllTask(stock, ev.getProperty("investment.finance-xjll-ajax-nd") + stock.getMarket() + stock.getCode(), "xjll", "nd", new AtomicInteger(10));
            myQuartzAsyncTask.invFinanceXjllTask(stock, ev.getProperty("investment.finance-xjll-ajax-jd") + stock.getMarket() + stock.getCode(), "xjll", "jd", new AtomicInteger(10));
        }
        isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 1);
        log.info("========财务分析-现金流量 任务完成=========");

        log.info("================财务分析任务  完成=================");
    }

    ///////////////////////////////////////////////////////快速工具///////////////////////////////////////////////////////

    /**
     * @Title: getInterfaceAllKey
     * @Description: 多线程获取接口所有字段
     * @author weny.yang
     * @date Sep 9, 2020
     */
    public void getInterfaceAllKey(String urls, Boolean containMarket) {//"investment.finance-zyzb-quarter"
        keySet.clear();
        log.info("========getInterfaceAllKey任务线程分发开始=========");
        List<InvStock> stockList = invStockMapper.selectInvStockVoNoDelisting();//获取所有未退市股
        String[] urlArr = urls.split("&");
        for (InvStock stock : stockList) {
            for (String url : urlArr) {
                myQuartzAsyncTask.getInterfaceAllKey(stock, url, containMarket);
            }
        }
        isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 1);
        log.info("========getInterfaceAllKey任务线程分发完成=========");
    }

    /**
     * @Title: writeAllKey
     * @Description: 写出接口所有字段
     * @author weny.yang
     * @date Sep 9, 2020
     */
    public void writeAllKey() throws IOException {
        File sqlFile = new File("/Users/yay/WorkSpace/RuoYi/RuoYi-master/devFile/sql/dev-without-comment.sql");
        // 判断文件是否存在
        if (!sqlFile.exists()) {
            sqlFile.createNewFile();
        }
        // 遍历写入
        BufferedWriter bw = new BufferedWriter(new FileWriter(sqlFile));
        for (String key : keySet) {
            bw.write("`" + key + "` double default null comment ''," + "\r\n");
        }
        bw.flush();
        bw.close();

        keySet.clear();
    }

    /**
     * @Title: downAllHtml
     * @Description: 下载所有html
     * @author weny.yang
     * @date Sep 9, 2020
     */
    public void downAllHtml(String url) throws IOException {//"investment.finance-zyzb-quarter"
        log.info("========downAllHtml任务线程分发开始=========");
        List<InvStock> stockList = invStockMapper.selectInvStockVoNoDelisting();//获取所有未退市股
        for (InvStock stock : stockList) {
            myQuartzAsyncTask.downAllHtml(url+stock.getMarket() + stock.getCode(), stock.getCode());
        }
        isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 1);
        log.info("========downAllHtml任务线程分发完成=========");
    }

    /**
     * @Title: main测试入口
     * @Description:
     * @author weny.yang
     * @date Sep 9, 2020
     */
    public static void main(String[] args) throws IOException {

        List<String> sqlListWithComment = getSqlListWithComment();
        creatSqlFileWithComment(sqlListWithComment);

    }

    /**
     * @Title: creatSqlFileWithComment
     * @Description: 生成字段带有描述的sql文件
     * @author weny.yang
     * @date Sep 9, 2020
     */
    private static void creatSqlFileWithComment(List<String> sqlList) throws IOException {
        File sqlFile = new File("/Users/yay/WorkSpace/RuoYi/RuoYi-master/devFile/sql/dev-with-comment.sql");
        // 判断文件是否存在
        if (!sqlFile.exists()) {
            sqlFile.createNewFile();
        }
        // 遍历写入
        BufferedWriter bw = new BufferedWriter(new FileWriter(sqlFile));
        for (String sql : sqlList) {
            bw.write(sql);
        }
        bw.flush();
        bw.close();
    }

    /**
     * @Title: getSqlListWithComment
     * @Description: 获取字段带描述的sql列表
     * @author weny.yang
     * @date Sep 9, 2020
     */
    private static List<String> getSqlListWithComment() throws IOException {
        File htmlFile = new File("/Users/yay/WorkSpace/RuoYi/RuoYi-master/devFile/html/dev.html");
        File sqlFile = new File("/Users/yay/WorkSpace/RuoYi/RuoYi-master/devFile/sql/dev-without-comment.sql");
        List<String> htmlList = readHtmlFile(htmlFile);
        List<String> sqlWithoutCommentList = readSqlFileWithoutComment(sqlFile);
        List<String> sqlWithCommentList = new ArrayList<>();

        for (String sql : sqlWithoutCommentList) {
            String sqlKey = sql.replace("double","")
                    .replace("default","")
                    .replace("null","")
                    .replace("comment","")
                    .replace("`","")
                    .replace("'","")
                    .replace(",","").trim();
            sqlKey = "(value."+sqlKey.toUpperCase()+")";
            for (int i=0; i<htmlList.size(); i++) {
                String htmlKey = htmlList.get(i);
                if (htmlKey.contains(sqlKey)) {
                    String chinese = StringUtils.getChinese(htmlList.get(i-1));
                    if(sqlKey.contains("_YOY")){
                        sql = sql.replace("comment ''","comment '"+chinese+"(环比%)'");
                    }else{
                        sql = sql.replace("comment ''","comment '"+chinese+"'");
                    }
                    sqlWithCommentList.add(sql);
                    break;
                }
            }
        }
        return sqlWithCommentList;
    }

    /**
     * @Title: readSqlFileWithoutComment
     * @Description: 读取程序生成的字段不带描述的sql文件
     * @author weny.yang
     * @date Sep 9, 2020
     */
    private static List<String> readSqlFileWithoutComment(File fin) throws IOException {
        List<String> keyList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(fin));
        String line = null;
        while ((line = br.readLine()) != null) {
            if (line.contains("comment")){
                keyList.add(line);
            }
        }
        br.close();
        return keyList;
    }

    /**
     * @Title: readHtmlFile
     * @Description: 读取html文件获得字段名和描述
     * @author weny.yang
     * @date Sep 9, 2020
     */
    private static List<String> readHtmlFile(File fin) throws IOException {
        List<String> keyList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(fin));
        String line = null;
        while ((line = br.readLine()) != null) {
            if (line.contains("(value.") || StringUtils.isContainChinese(line)){
                keyList.add(line);
            }
        }
        br.close();
        return keyList;
    }

    ///////////////////////////////////////////////////////示例代码//////////////////////////////////////////////////////

    /**
     * @Title: ryMultipleParams
     * @Description: 多参数任务示例
     * @author weny.yang
     * @date Sep 9, 2020
     */
    public void ryMultipleParams(String s, Boolean b, Long l, Double d, Integer i) {
        System.out.println(StringUtils.format("执行多参方法： 字符串类型{}，布尔类型{}，长整型{}，浮点型{}，整形{}", s, b, l, d, i));
    }

    /**
     * @Title: ryParams
     * @Description: 单参数任务示例
     * @author weny.yang
     * @date Sep 9, 2020
     */
    public void ryParams(String params) {
        System.out.println("执行有参方法：" + params);
    }

    /**
     * @Title: ryNoParams
     * @Description: 无参数任务示例
     * @author weny.yang
     * @date Sep 9, 2020
     */
    public void ryNoParams() {
        System.out.println("执行无参方法");
    }
}
