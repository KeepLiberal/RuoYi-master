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
    private InvIndustryEmMapper invIndustryEmMapper;
    @Resource
    private InvCompanyIndustryEmMapper invCompanyIndustryEmMapper;
    @Resource
    private InvCompanyIndustryCsrcMapper invCompanyIndustryCsrcMapper;
    @Resource
    private SysDictDataMapper dictDataMapper;

    /**
     * 容器中的线程池
     */
    private ThreadPoolTaskExecutor threadPoolTaskExecutor = SpringUtils.getBean("threadPoolTaskExecutor");
    /**
     * 存放接口所有字段
     */
    public static Set<String> keyOfInterfaceSet = new HashSet<>();
    /**
     * 存放接口所有字段
     */
    public static Set<String> keyOfHtmlSet = new HashSet<>();
    /**
     * 存放sql
     */
    public static LinkedHashMap<String, String> sqlOfHtmlMap = new LinkedHashMap<>();
    /**
     * 存放证监会行业
     */
    public static LinkedHashSet<InvIndustryCsrc> invIndustryCsrcSet = new LinkedHashSet<>();
    /**
     * 存放东财行业
     */
    public static LinkedHashSet<InvIndustryEm> invIndustryEmSet = new LinkedHashSet<>();

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
    private void invStock() {
        try {
            log.info("========沪深A股-基础数据 任务开始=========");
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
            log.info("========沪深A股-基础数据 任务完成=========");
        } catch (Exception e) {
            log.error(">>>异常:", e);
        }
    }

    /**
     * 公司概况
     */
    private void invCompany(List<InvStock> stockList) {
        log.info("========沪深A股-公司概况 任务开始=========");
        for (InvStock stock : stockList) {
            myQuartzAsyncTask.invCompanyTask(stock, ev.getProperty("inv.company-company-ajax"), new AtomicInteger(10));
        }
        isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 0);
        log.info("========沪深A股-公司概况 任务完成=========");
    }

    /**
     * 证监会行业
     */
    private void invIndustryCsrc(List<InvCompany> companyList) {
        try {
            log.info("========证监会行业 任务开始=========");
            for (InvCompany company : companyList) {
                myQuartzAsyncTask.invIndustryCsrcTask(company, new AtomicInteger(10));
            }
            isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 0);
            List<InvIndustryCsrc> invIndustryCsrcs = invIndustryCsrcMapper.selectInvIndustryCsrcList();
            for (InvIndustryCsrc invIndustryCsrc : invIndustryCsrcSet) {
                for (InvIndustryCsrc csrc : invIndustryCsrcs) {
                    if (invIndustryCsrc.equals(csrc)) {
                        invIndustryCsrc.setId(csrc.getId());
                        invIndustryCsrc.setPid(csrc.getPid());
                    }
                }
            }
            int id = 10000;
            InvIndustryCsrc icsrc = invIndustryCsrcMapper.selectMaxId();
            if (null != icsrc) {
                id = icsrc.getId();
            }
            for (int i = 1; i < 5; i++) {
                for (InvIndustryCsrc invIndustryCsrc : invIndustryCsrcSet) {
                    if (invIndustryCsrc.getLevel() == i) {
                        id++;
                        if (null == invIndustryCsrc.getId()) {
                            invIndustryCsrc.setId(id);
                        }
                        if (null == invIndustryCsrc.getPid()) {
                            if (i == 1) {
                                invIndustryCsrc.setPid(0);
                            } else {
                                for (InvIndustryCsrc industryCsrc : invIndustryCsrcSet) {
                                    if (industryCsrc.getLevel() == i - 1) {
                                        String pMergeName = industryCsrc.getMergeName();
                                        String mergeName = invIndustryCsrc.getMergeName();
                                        String name = invIndustryCsrc.getName();
                                        String cName = mergeName.substring(0, mergeName.lastIndexOf(name) - 1);
                                        if (cName.equals(pMergeName)) {
                                            invIndustryCsrc.setPid(industryCsrc.getId());
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            for (InvIndustryCsrc invIndustryCsrc : invIndustryCsrcSet) {
                if (!invIndustryCsrcs.contains(invIndustryCsrc)) {
                    invIndustryCsrcMapper.insertInvIndustryCsrc(invIndustryCsrc);
                }
            }
            log.info("========证监会行业 任务完成=========");
        } catch (Exception e) {
            log.error(">>>异常:", e);
        }
    }

    /**
     * 东财行业
     */
    private void invIndustryEm(List<InvCompany> companyList) {
        try {
            log.info("========东财行业 任务开始=========");
            for (InvCompany company : companyList) {
                myQuartzAsyncTask.invIndustryEmTask(company, new AtomicInteger(10));
            }
            isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 0);
            List<InvIndustryEm> invIndustryEms = invIndustryEmMapper.selectInvIndustryEmList();
            for (InvIndustryEm invIndustryEm : invIndustryEmSet) {
                for (InvIndustryEm em : invIndustryEms) {
                    if (invIndustryEms.equals(em)) {
                        invIndustryEm.setId(em.getId());
                        invIndustryEm.setPid(em.getPid());
                        if ("肉制品".equals(invIndustryEm.getName()) && "食品饮料-食品-肉制品".equals(invIndustryEm.getMergeName())) {
                            System.out.println(invIndustryEm);
                        }
                    }
                }
            }
            int id = 10000;
            InvIndustryEm iem = invIndustryEmMapper.selectMaxId();
            if (null != iem) {
                id = iem.getId();
            }
            for (int i = 1; i < 5; i++) {
                for (InvIndustryEm invIndustryEm : invIndustryEmSet) {
                    if (invIndustryEm.getLevel() == i) {
                        id++;
                        if (null == invIndustryEm.getId()) {
                            invIndustryEm.setId(id);
                        }
                        if (null == invIndustryEm.getPid()) {
                            if (i == 1) {
                                invIndustryEm.setPid(0);
                            } else {
                                for (InvIndustryEm industryEm : invIndustryEmSet) {
                                    if (industryEm.getLevel() == i - 1) {
                                        String pMergeName = industryEm.getMergeName();
                                        String mergeName = invIndustryEm.getMergeName();
                                        String name = invIndustryEm.getName();
                                        String cName = mergeName.substring(0, mergeName.lastIndexOf(name) - 1);
                                        if (cName.equals(pMergeName)) {
                                            invIndustryEm.setPid(industryEm.getId());
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            for (InvIndustryEm invIndustryEm : invIndustryEmSet) {
                if (!invIndustryEms.contains(invIndustryEm)) {
                    invIndustryEmMapper.insertInvIndustryEm(invIndustryEm);
                }
            }
            log.info("========东财行业 任务完成=========");
        } catch (Exception e) {
            log.error(">>>异常:", e);
        }
    }

    /**
     * 公司所属证监会行业
     */
    private void invCompanyIndustryCsrc(List<InvCompany> companyList) {
        try {
            log.info("========所属证监会行业 任务开始=========");
            List<InvIndustryCsrc> invIndustryCsrcs = invIndustryCsrcMapper.selectInvIndustryCsrcList();
            Map<String, InvIndustryCsrc> invIndustryCsrcMap = new HashMap<>();
            for (InvIndustryCsrc invIndustryCsrc : invIndustryCsrcs) {
                String key = invIndustryCsrc.getMergeName() + invIndustryCsrc.getLevel();
                invIndustryCsrcMap.put(key, invIndustryCsrc);
            }
            List<InvCompanyIndustryCsrc> invCompanyIndustryCsrcs = invCompanyIndustryCsrcMapper.selectInvCompanyIndustryCsrcList();
            Map<String, InvCompanyIndustryCsrc> invCompanyIndustryCsrcMap = new HashMap<>();
            for (InvCompanyIndustryCsrc invCompanyIndustryCsrc : invCompanyIndustryCsrcs) {
                String key = invCompanyIndustryCsrc.getCode() + invCompanyIndustryCsrc.getLevel();
                invCompanyIndustryCsrcMap.put(key, invCompanyIndustryCsrc);
            }
            for (InvCompany company : companyList) {
                String industryCsrc = company.getIndustrycsrc1();
                if (StringUtils.isNotEmpty(industryCsrc)) {
                    String[] industryCsrcs = industryCsrc.split("-");

                    for (int i = 0; i < industryCsrcs.length; i++) {
                        String mergeName = "";
                        for (int j = 0; j <= i; j++) {
                            if (StringUtils.isNotEmpty(mergeName)) {
                                mergeName = mergeName + "-" + industryCsrcs[j];
                            } else {
                                mergeName = industryCsrcs[j];
                            }
                        }
                        int level = i + 1;

                        String invIndustryCsrcMapKey = mergeName + level;
                        if (invIndustryCsrcMap.containsKey(invIndustryCsrcMapKey)) {
                            InvCompanyIndustryCsrc invCompanyIndustryCsrc = new InvCompanyIndustryCsrc();
                            invCompanyIndustryCsrc.setCode(company.getCode());
                            invCompanyIndustryCsrc.setLevel(level);
                            invCompanyIndustryCsrc.setIndustryCsrcId(invIndustryCsrcMap.get(invIndustryCsrcMapKey).getId());

                            String invCompanyIndustryCsrcMapKey = invCompanyIndustryCsrc.getCode() + invCompanyIndustryCsrc.getLevel();
                            if (invCompanyIndustryCsrcMap.containsKey(invCompanyIndustryCsrcMapKey)) {
                                if (!invCompanyIndustryCsrcMap.get(invCompanyIndustryCsrcMapKey).equals(invCompanyIndustryCsrc)) {
                                    invCompanyIndustryCsrcMapper.deleteInvCompanyIndustryCsrcById(invCompanyIndustryCsrcMap.get(invCompanyIndustryCsrcMapKey).getId());
                                    invCompanyIndustryCsrcMapper.insertInvCompanyIndustryCsrc(invCompanyIndustryCsrc);
                                }
                            } else {
                                invCompanyIndustryCsrcMapper.insertInvCompanyIndustryCsrc(invCompanyIndustryCsrc);
                            }
                        }
                    }
                }
            }
            log.info("========所属证监会行业 任务完成=========");
        } catch (Exception e) {
            log.error(">>>异常:", e);
        }
    }

    /**
     * 公司所属东财行业
     */
    private void invCompanyIndustryEm(List<InvCompany> companyList) {
        try {
            log.info("========所属东财行业 任务开始=========");
            List<InvIndustryEm> invIndustryEms = invIndustryEmMapper.selectInvIndustryEmList();
            Map<String, InvIndustryEm> invIndustryEmMap = new HashMap<>();
            for (InvIndustryEm invIndustryEm : invIndustryEms) {
                String key = invIndustryEm.getMergeName() + invIndustryEm.getLevel();
                invIndustryEmMap.put(key, invIndustryEm);
            }
            List<InvCompanyIndustryEm> invCompanyIndustryEms = invCompanyIndustryEmMapper.selectInvCompanyIndustryEmList();
            Map<String, InvCompanyIndustryEm> invCompanyIndustryEmMap = new HashMap<>();
            for (InvCompanyIndustryEm invCompanyIndustryEm : invCompanyIndustryEms) {
                String key = invCompanyIndustryEm.getCode() + invCompanyIndustryEm.getLevel();
                invCompanyIndustryEmMap.put(key, invCompanyIndustryEm);
            }
            for (InvCompany company : companyList) {
                String industryEm = company.getEm2016();
                if (StringUtils.isNotEmpty(industryEm)) {
                    String[] industryEms = industryEm.split("-");

                    for (int i = 0; i < industryEms.length; i++) {
                        String mergeName = "";
                        for (int j = 0; j <= i; j++) {
                            if (StringUtils.isNotEmpty(mergeName)) {
                                mergeName = mergeName + "-" + industryEms[j];
                            } else {
                                mergeName = industryEms[j];
                            }
                        }
                        int level = i + 1;

                        String invIndustryEmMapKey = mergeName + level;
                        if (invIndustryEmMap.containsKey(invIndustryEmMapKey)) {
                            InvCompanyIndustryEm invCompanyIndustryEm = new InvCompanyIndustryEm();
                            invCompanyIndustryEm.setCode(company.getCode());
                            invCompanyIndustryEm.setLevel(level);
                            invCompanyIndustryEm.setIndustryEmId(invIndustryEmMap.get(invIndustryEmMapKey).getId());

                            String invCompanyIndustryEmMapKey = invCompanyIndustryEm.getCode() + invCompanyIndustryEm.getLevel();
                            if (invCompanyIndustryEmMap.containsKey(invCompanyIndustryEmMapKey)) {
                                if (!invCompanyIndustryEmMap.get(invCompanyIndustryEmMapKey).equals(invCompanyIndustryEm)) {
                                    invCompanyIndustryEmMapper.deleteInvCompanyIndustryEmById(invCompanyIndustryEmMap.get(invCompanyIndustryEmMapKey).getId());
                                    invCompanyIndustryEmMapper.insertInvCompanyIndustryEm(invCompanyIndustryEm);
                                }
                            } else {
                                invCompanyIndustryEmMapper.insertInvCompanyIndustryEm(invCompanyIndustryEm);
                            }
                        }
                    }
                }
            }
            log.info("========所属东财行业 任务完成=========");
        } catch (Exception e) {
            log.error(">>>异常:", e);
        }
    }

    /**
     * 财务分析数据抓取
     */
    public void initDataTask() {
        log.info("================数据初始化任务 等待=================");
        isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 0);
        log.info("================数据初始化任务 开始=================");

        invStock();

        List<InvStock> stockList = invStockMapper.selectInvStockVoNoDelisting();
        //invCompany(stockList);

        List<InvCompany> companyList = invCompanyMapper.selectInvCompanyShortList();
        invIndustryCsrc(companyList);
        invIndustryEm(companyList);
        invCompanyIndustryCsrc(companyList);
        invCompanyIndustryEm(companyList);


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

        log.info("================数据初始化任务 完成=================");
    }

    ///////////////////////////////////////////////////////快速工具///////////////////////////////////////////////////////

    /**
     * 生成接口对应SQL文件
     */
    public void createSqlFile(String interfaceName) {
        log.info("========生成SQL interfaceName:{} 任务等待=========", interfaceName);
        isCompletedByTaskCount(threadPoolTaskExecutor.getThreadPoolExecutor(), 0);
        log.info("========生成SQL interfaceName:{} 任务开始=========", interfaceName);

        keyOfInterfaceSet.clear();
        keyOfHtmlSet.clear();
        sqlOfHtmlMap.clear();

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
