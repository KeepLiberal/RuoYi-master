package com.ruoyi.quartz.task;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.core.domain.entity.SysDictData;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.http.HttpUtils;
import com.ruoyi.common.utils.spring.SpringUtils;
import com.ruoyi.investment.domain.*;
import com.ruoyi.investment.mapper.*;
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
    private InvCompanyMapper invCompanyMapper;
    @Resource
    private InvIndustryCsrcMapper invIndustryCsrcMapper;
    @Resource
    private InvCompanyIndustryCsrcMapper invCompanyIndustryCsrcMapper;
    @Resource
    private InvIndustryEmMapper invIndustryEmMapper;
    @Resource
    private InvCompanyIndustryEmMapper invCompanyIndustryEmMapper;
    @Resource
    private SysDictDataMapper dictDataMapper;

    /**
     * 容器中的线程池
     */
    private ThreadPoolTaskExecutor threadPoolTaskExecutor = SpringUtils.getBean("threadPoolTaskExecutor");
    /**
     * 存放接口所有字段
     */
    public static Set<String> keySetOfInterface = new HashSet<>();
    /**
     * 存放接口所有字段
     */
    public static Set<String> keySetOfHtml = new HashSet<>();
    /**
     * 存放sql
     */
    public static LinkedHashMap<String, String> sqlMapOfHtml = new LinkedHashMap<>();


    ///////////////////////////////////////////////////////个股信息//////////////////////////////////////////////////////

    /**
     * 判断线程池状态
     */
    private static void isCompletedByTaskCount(ThreadPoolExecutor threadPool, Integer value) {
        while (threadPool.getActiveCount() > value) ;
    }

    /**
     * 沪深A股基础数据抓取
     */
    private void invStockTask() {
        SysDictData dictData = new SysDictData();
        dictData.setDictType("market_type");
        List<SysDictData> dictDatas = dictDataMapper.selectDictDataList(dictData);

        String url = ev.getProperty("inv.stock-list");
        String result = HttpUtils.sendGet(url, new AtomicInteger(10));
        if (StringUtils.isNotEmpty(result)) {
            JSONObject jsonObject = JSONObject.parseObject(result);
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
        isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 0);
        log.info("================财务分析任务 开始=================");

        log.info("========沪深A股-基础数据 任务开始=========");
        //沪深A股基础数据抓取任务
        invStockTask();
        log.info("========沪深A股-基础数据 任务完成=========");

        //获取所有未退市股
        List<InvStock> stockList = invStockMapper.selectInvStockVoNoDelisting();

        log.info("========沪深A股-公司概况 任务开始=========");
        for (InvStock stock : stockList) {
//            if ("000001".equals(stock.getCode())){
            // myQuartzAsyncTask.invCompanyTask(stock, ev.getProperty("inv.company-company-ajax"), new AtomicInteger(10));
//            }
        }
        isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 0);

        List<InvCompany> invCompanies = invCompanyMapper.selectInvCompanyList(null);
        for (InvCompany invCompany : invCompanies) {
            String industryCsrc = invCompany.getIndustrycsrc1();
            if (StringUtils.isNotEmpty(industryCsrc)) {
                String[] industryCsrcs = industryCsrc.split("-");
                for (int i = 0; i < industryCsrcs.length; i++) {
                    InvIndustryCsrc invIndustryCsrc = new InvIndustryCsrc();
                    String name = industryCsrcs[i];
                    String shortName = name.replace("业", "");
                    invIndustryCsrc.setShortName(shortName);
                    invIndustryCsrc.setName(name);
                    invIndustryCsrc.setLevel(i + 1);
                    String mergeName = "";
                    for (int j = 0; j <= i; j++) {
                        if (StringUtils.isNotEmpty(mergeName)){
                            mergeName = mergeName + "-" + industryCsrcs[j];
                        }else{
                            mergeName = industryCsrcs[j];
                        }
                    }
                    invIndustryCsrc.setMergeName(mergeName);
                    List<InvIndustryCsrc> csrcs = invIndustryCsrcMapper.selectInvIndustryCsrcList(invIndustryCsrc);
                    if (null == csrcs || csrcs.size() == 0) {
                        if (i == 0) {
                            invIndustryCsrc.setPid(0);
                        } else {
                            InvIndustryCsrc csrc = new InvIndustryCsrc();
                            String mergeNa = "";
                            for (int j = 0; j <= i - 1; j++) {
                                if (StringUtils.isNotEmpty(mergeNa)){
                                    mergeNa = mergeNa + "-" + industryCsrcs[j];
                                }else{
                                    mergeNa = industryCsrcs[j];
                                }
                            }
                            csrc.setMergeName(mergeNa);
                            csrcs = invIndustryCsrcMapper.selectInvIndustryCsrcList(csrc);
                            invIndustryCsrc.setPid(csrcs.get(0).getId());
                        }
                        invIndustryCsrcMapper.insertInvIndustryCsrc(invIndustryCsrc);
                    }
                }
                InvCompanyIndustryCsrc invCompanyIndustryCsrc = new InvCompanyIndustryCsrc();
                for (int i = 0; i < industryCsrcs.length; i++) {
                    InvIndustryCsrc invIndustryCsrc = new InvIndustryCsrc();
                    invIndustryCsrc.setName(industryCsrcs[i]);
                    List<InvIndustryCsrc> csrcs = invIndustryCsrcMapper.selectInvIndustryCsrcList(invIndustryCsrc);
                    invCompanyIndustryCsrc.setCode(invCompany.getCode());
                    invCompanyIndustryCsrc.setLevel(i+1);
                    invCompanyIndustryCsrc.setIndustryCsrcId(csrcs.get(0).getId());
                    invCompanyIndustryCsrcMapper.insertInvCompanyIndustryCsrc(invCompanyIndustryCsrc);
                }
            }

            String industryEm = invCompany.getEm2016();
            if (StringUtils.isNotEmpty(industryEm)) {
                String[] industryEms = industryEm.split("-");
                for (int i = 0; i < industryEms.length; i++) {
                    InvIndustryEm invIndustryEm = new InvIndustryEm();
                    String name = industryEms[i];
                    String shortName = name.replace("业", "");
                    invIndustryEm.setShortName(shortName);
                    invIndustryEm.setName(name);
                    invIndustryEm.setLevel(i + 1);
                    String mergeName = "";
                    for (int j = 0; j <= i; j++) {
                        if (StringUtils.isNotEmpty(mergeName)){
                            mergeName = mergeName + "-" + industryEms[j];
                        }else{
                            mergeName = industryEms[j];
                        }
                    }
                    invIndustryEm.setMergeName(mergeName);
                    List<InvIndustryEm> ems = invIndustryEmMapper.selectInvIndustryEmList(invIndustryEm);
                    if (null == ems || ems.size() == 0) {
                        if (i == 0) {
                            invIndustryEm.setPid(0);
                        } else {
                            InvIndustryEm em = new InvIndustryEm();
                            String mergeNa = "";
                            for (int j = 0; j <= i - 1; j++) {
                                if (StringUtils.isNotEmpty(mergeNa)){
                                    mergeNa = mergeNa + "-" + industryEms[j];
                                }else{
                                    mergeNa = industryEms[j];
                                }
                            }
                            em.setMergeName(mergeNa);
                            ems = invIndustryEmMapper.selectInvIndustryEmList(em);
                            invIndustryEm.setPid(ems.get(0).getId());
                        }
                        invIndustryEmMapper.insertInvIndustryEm(invIndustryEm);
                    }
                }
                InvCompanyIndustryEm invCompanyIndustryEm = new InvCompanyIndustryEm();
                for (int i = 0; i < industryEms.length; i++) {
                    InvIndustryEm invIndustryEm = new InvIndustryEm();
                    invIndustryEm.setName(industryEms[i]);
                    List<InvIndustryEm> csrcs = invIndustryEmMapper.selectInvIndustryEmList(invIndustryEm);
                    invCompanyIndustryEm.setCode(invCompany.getCode());
                    invCompanyIndustryEm.setLevel(i+1);
                    invCompanyIndustryEm.setIndustryEmId(csrcs.get(0).getId());
                    invCompanyIndustryEmMapper.insertInvCompanyIndustryEm(invCompanyIndustryEm);
                }
            }
        }
        log.info("========沪深A股-公司概况 任务完成=========");

//
//        log.info("========财务分析-报告日期 任务开始=========");
//        for (InvStock stock : stockList) {
//            myQuartzAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("inv.finance-zcfz-date-bgq"), "zcfz", "bgq", new AtomicInteger(10));
//            myQuartzAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("inv.finance-zcfz-date-nd"), "zcfz", "nd", new AtomicInteger(10));
//
//            myQuartzAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("inv.finance-lr-date-bgq"), "lr", "bgq", new AtomicInteger(10));
//            myQuartzAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("inv.finance-lr-date-nd"), "lr", "nd", new AtomicInteger(10));
//            myQuartzAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("inv.finance-lr-date-jd"), "lr", "jd", new AtomicInteger(10));
//
//            myQuartzAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("inv.finance-xjll-date-bgq"), "xjll", "bgq", new AtomicInteger(10));
//            myQuartzAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("inv.finance-xjll-date-nd"), "xjll", "nd", new AtomicInteger(10));
//            myQuartzAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("inv.finance-xjll-date-jd"), "xjll", "jd", new AtomicInteger(10));
//        }
//        isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 0);
//        log.info("========财务分析-报告日期 任务完成=========");
//
//        log.info("========财务分析-重要指标 任务开始=========");
//        for (InvStock stock : stockList) {
//            myQuartzAsyncTask.invFinanceZyzbTask(stock, ev.getProperty("inv.finance-zyzb-ajax-bgq"), "bgq", new AtomicInteger(10));
//            myQuartzAsyncTask.invFinanceZyzbTask(stock, ev.getProperty("inv.finance-zyzb-ajax-nd"), "nd", new AtomicInteger(10));
//            myQuartzAsyncTask.invFinanceZyzbTask(stock, ev.getProperty("inv.finance-zyzb-ajax-jd"), "jd", new AtomicInteger(10));
//        }
//        isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 0);
//        log.info("========财务分析-重要指标 任务完成=========");
//
//        log.info("========财务分析-杜邦分析 任务开始=========");
//        for (InvStock stock : stockList) {
//            myQuartzAsyncTask.invFinanceDbfxTask(stock, ev.getProperty("inv.finance-dbfx-ajax"), new AtomicInteger(10));
//        }
//        isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 0);
//        log.info("========财务分析-杜邦分析 任务完成=========");
//
//        log.info("========财务分析-资产负债 任务开始=========");
//        SysDictData dictData = new SysDictData();
//        dictData.setDictType("opinion_type");
//        List<SysDictData> dictDatas = dictDataMapper.selectDictDataList(dictData);
//        for (InvStock stock : stockList) {
//            myQuartzAsyncTask.invFinanceZcfzTask(stock, ev.getProperty("inv.finance-zcfz-ajax-bgq"), "zcfz", "bgq", dictDatas, new AtomicInteger(10));
//            myQuartzAsyncTask.invFinanceZcfzTask(stock, ev.getProperty("inv.finance-zcfz-ajax-nd"), "zcfz", "nd", dictDatas, new AtomicInteger(10));
//        }
//        isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 0);
//        log.info("========财务分析-资产负债 任务完成=========");
//
//        log.info("========财务分析-利润 任务开始=========");
//        for (InvStock stock : stockList) {
//            myQuartzAsyncTask.invFinanceLrTask(stock, ev.getProperty("inv.finance-lr-ajax-bgq"), "lr", "bgq", dictDatas, new AtomicInteger(10));
//            myQuartzAsyncTask.invFinanceLrTask(stock, ev.getProperty("inv.finance-lr-ajax-nd"), "lr", "nd", dictDatas, new AtomicInteger(10));
//            myQuartzAsyncTask.invFinanceLrTask(stock, ev.getProperty("inv.finance-lr-ajax-jd"), "lr", "jd", dictDatas, new AtomicInteger(10));
//        }
//        isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 0);
//        log.info("========财务分析-利润 任务完成=========");
//
//        log.info("========财务分析-现金流量 任务开始=========");
//        for (InvStock stock : stockList) {
//            myQuartzAsyncTask.invFinanceXjllTask(stock, ev.getProperty("inv.finance-xjll-ajax-bgq"), "xjll", "bgq", dictDatas, new AtomicInteger(10));
//            myQuartzAsyncTask.invFinanceXjllTask(stock, ev.getProperty("inv.finance-xjll-ajax-nd"), "xjll", "nd", dictDatas, new AtomicInteger(10));
//            myQuartzAsyncTask.invFinanceXjllTask(stock, ev.getProperty("inv.finance-xjll-ajax-jd"), "xjll", "jd", dictDatas, new AtomicInteger(10));
//        }
//        isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 0);
//        log.info("========财务分析-现金流量 任务完成=========");
//
//        log.info("========财务分析-百分比 任务开始=========");
//        for (InvStock stock : stockList) {
//            myQuartzAsyncTask.invFinanceBfbTask(stock, ev.getProperty("inv.finance-bfb-ajax-bgq"), "bgq", new AtomicInteger(10));
//            myQuartzAsyncTask.invFinanceBfbTask(stock, ev.getProperty("inv.finance-bfb-ajax-nd"), "nd", new AtomicInteger(10));
//            myQuartzAsyncTask.invFinanceBfbTask(stock, ev.getProperty("inv.finance-bfb-ajax-jd"), "jd", new AtomicInteger(10));
//        }
//        isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 0);
//        log.info("========财务分析-百分比 任务完成=========");

        log.info("================财务分析任务 完成=================");
    }

    ///////////////////////////////////////////////////////快速工具///////////////////////////////////////////////////////

    /**
     * 生成接口对应SQL文件
     */
    public void createSqlFile(String interfaceName) {
        log.info("========生成SQL interfaceName:{} 任务等待=========", interfaceName);
        isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 0);
        log.info("========生成SQL interfaceName:{} 任务开始=========", interfaceName);

        keySetOfInterface.clear();
        keySetOfHtml.clear();
        sqlMapOfHtml.clear();

        List<InvStock> stockList = invStockMapper.selectInvStockVoNoDelisting();
        for (InvStock stock : stockList) {
//            if ("000001".equals(stock.getCode())) {
            if ("company".equals(interfaceName)) {
                myQuartzAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.company-company-ajax"));
                myQuartzAsyncTask.getHtmlKey(stock, ev.getProperty("inv.company-web"), interfaceName);
            }
            if ("zyzb".equals(interfaceName)) {
                myQuartzAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-zyzb-ajax-bgq"));
                myQuartzAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-zyzb-ajax-nd"));
                myQuartzAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-zyzb-ajax-jd"));
                myQuartzAsyncTask.getHtmlKey(stock, ev.getProperty("inv.finance-web"), interfaceName);
            }
            if ("dbfx".equals(interfaceName)) {
                myQuartzAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-dbfx-ajax"));
                myQuartzAsyncTask.getHtmlKey(stock, ev.getProperty("inv.finance-web"), interfaceName);
            }
            if ("zcfz".equals(interfaceName)) {
                myQuartzAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-zcfz-ajax-bgq"));
                myQuartzAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-zcfz-ajax-nd"));
                myQuartzAsyncTask.getHtmlKey(stock, ev.getProperty("inv.finance-web"), interfaceName);
            }
            if ("lr".equals(interfaceName)) {
                myQuartzAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-lr-ajax-bgq"));
                myQuartzAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-lr-ajax-nd"));
                myQuartzAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-lr-ajax-jd"));
                myQuartzAsyncTask.getHtmlKey(stock, ev.getProperty("inv.finance-web"), interfaceName);
            }
            if ("xjll".equals(interfaceName)) {
                myQuartzAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-xjll-ajax-bgq"));
                myQuartzAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-xjll-ajax-nd"));
                myQuartzAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-xjll-ajax-jd"));
                myQuartzAsyncTask.getHtmlKey(stock, ev.getProperty("inv.finance-web"), interfaceName);
            }
            if ("bfb".equals(interfaceName)) {
                myQuartzAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-bfb-ajax-bgq"));
                myQuartzAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-bfb-ajax-nd"));
                myQuartzAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-bfb-ajax-jd"));
                myQuartzAsyncTask.getHtmlKey(stock, ev.getProperty("inv.finance-web"), interfaceName);
            }
//            }
        }
        isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 0);

        TaskUtils.writeKeysOfInterface(interfaceName + ".txt");
        TaskUtils.writeSqlFileOfHtml(interfaceName + ".sql");
        TaskUtils.writeCompareKeyFile(interfaceName + "-compare.txt");
        log.info("========生成SQL interfaceName:{} 任务完成=========", interfaceName);
    }

    ///////////////////////////////////////////////////////示例代码//////////////////////////////////////////////////////

    /**
     * 示例代码
     */
    public void ryMultipleParams(String s, Boolean b, Long l, Double d, Integer i) {
        System.out.println(StringUtils.format("执行多参方法： 字符串类型{}，布尔类型{}，长整型{}，浮点型{}，整形{}", s, b, l, d, i));
    }
}
