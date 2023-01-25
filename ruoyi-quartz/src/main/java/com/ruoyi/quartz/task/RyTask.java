package com.ruoyi.quartz.task;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.core.domain.entity.SysDictData;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.http.HttpUtils;
import com.ruoyi.common.utils.spring.SpringUtils;
import com.ruoyi.investment.domain.*;
import com.ruoyi.investment.mapper.*;
import com.ruoyi.quartz.async.InvestmentDataAsyncTask;
import com.ruoyi.quartz.util.TaskUtils;
import com.ruoyi.system.domain.SysArea;
import com.ruoyi.system.mapper.SysAreaMapper;
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
    private InvestmentDataAsyncTask investmentDataAsyncTask;
    @Resource
    private InvStockMapper invStockMapper;
    @Resource
    private InvCompanyMapper invCompanyMapper;
    @Resource
    private InvIndustryMapper invIndustryMapper;
    @Resource
    private InvCompanyAddressMapper invCompanyAddressMapper;
    @Resource
    private SysDictDataMapper dictDataMapper;
    @Resource
    private SysAreaMapper sysAreaMapper;

    /**
     * 容器中的线程池
     */
    private ThreadPoolTaskExecutor investmentDataThreadPoolTaskExecutor = SpringUtils.getBean("investmentDataThreadPoolTaskExecutor");
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
     * 存放行业
     */
    public static LinkedHashSet<InvIndustry> invIndustrySet = new LinkedHashSet<>();

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
            dictData.setDictType("market_start");
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
                                    log.error(">>>invStockTask任务:" + code + " " + name + " [" + code.substring(0, 3) + "]对应的市场前缀不在字典表market_start内，请添加");
                                }
                                InvStock stock = new InvStock(code, name, market);
                                if (stockMap.containsKey(code)) {
                                    //数据库存在，但数据不一致，进行更新
                                    InvStock compare = stockMap.get(code);
                                    if (!compare.equals(stock)) {
                                        stock.setId(compare.getId());
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
    private void invCompany() {
        log.info("========沪深A股-公司概况 任务开始=========");
        List<InvStock> stockList = invStockMapper.selectInvStockVoNoDelisting();
        for (InvStock stock : stockList) {
            investmentDataAsyncTask.invCompanyTask(stock, ev.getProperty("inv.company-company-ajax"), new AtomicInteger(10));
        }
        isCompletedByTaskCount(investmentDataThreadPoolTaskExecutor.getThreadPoolExecutor(), 0);
        log.info("========沪深A股-公司概况 任务完成=========");

        List<InvCompany> companyList = invCompanyMapper.selectInvCompanyShortList();
        invIndustry(companyList);
        invCompanyIndustry(companyList);
        invCompanyAddress(companyList);
    }

    /**
     * 行业
     */
    private void invIndustry(List<InvCompany> companyList) {
        try {
            log.info("========行业 任务开始=========");
            for (InvCompany company : companyList) {
                investmentDataAsyncTask.invIndustryTask(company, "csrc", new AtomicInteger(10));
                investmentDataAsyncTask.invIndustryTask(company, "em", new AtomicInteger(10));
            }
            isCompletedByTaskCount(investmentDataThreadPoolTaskExecutor.getThreadPoolExecutor(), 0);

            List<InvIndustry> hasInvIndustrys = invIndustryMapper.selectInvIndustryList(null);
            List<InvIndustry> invIndustryList = new ArrayList<>();
            for (InvIndustry newIndustry : invIndustrySet) {
                for (InvIndustry hasInvIndustry : hasInvIndustrys) {
                    if (newIndustry.equals(hasInvIndustry)) {
                        newIndustry.setId(hasInvIndustry.getId());
                        newIndustry.setPid(hasInvIndustry.getPid());
                        invIndustryList.add(newIndustry);
                    }
                }
            }
            InvIndustry max = invIndustryMapper.selectMaxId();
            int id = null != max ? max.getId() : 10000;

            for (int i = 1; i < 5; i++) {
                for (InvIndustry invIndustryZ : invIndustrySet) {
                    if (invIndustryZ.getLevel() == i) {
                        id++;
                        if (null == invIndustryZ.getId()) {
                            invIndustryZ.setId(id);
                        }
                        if (null == invIndustryZ.getPid()) {
                            if (i == 1) {
                                invIndustryZ.setPid(0);
                            }
                            if (i != 1) {
                                for (InvIndustry invIndustryF : invIndustrySet) {
                                    if (invIndustryF.getLevel() == i - 1) {
                                        String nameZ = invIndustryZ.getName();
                                        String mergeNameZ = invIndustryZ.getMergeName();
                                        String mergeNameF = invIndustryF.getMergeName();
                                        mergeNameZ = mergeNameZ.substring(0, mergeNameZ.lastIndexOf(nameZ) - 1);
                                        if (mergeNameZ.equals(mergeNameF)) {
                                            invIndustryZ.setPid(invIndustryF.getId());
                                        }
                                    }
                                }
                            }
                        }
                        invIndustryList.add(invIndustryZ);
                    }
                }
            }
            for (InvIndustry invIndustry : invIndustryList) {
                if (!hasInvIndustrys.contains(invIndustry)) {
                    invIndustryMapper.insertInvIndustry(invIndustry);
                }
            }
            log.info("========行业 任务完成=========");
        } catch (Exception e) {
            log.error(">>>异常:", e);
        } finally {
            invIndustrySet.clear();
        }
    }

    /**
     * 公司所属行业
     */
    private void invCompanyIndustry(List<InvCompany> companyList) {
        try {
            log.info("========公司所属行业 任务开始=========");
            List<InvIndustry> invIndustrys = invIndustryMapper.selectInvIndustryList(null);
            Map<String, InvIndustry> invIndustryMap = new HashMap<>();
            for (InvIndustry invIndustry : invIndustrys) {
                String key = invIndustry.getMergeName() + invIndustry.getType() + invIndustry.getLevel();
                invIndustryMap.put(key, invIndustry);
            }
            for (InvCompany company : companyList) {
                investmentDataAsyncTask.invCompanyIndustry(company, invIndustryMap, "csrc", new AtomicInteger(10));
                investmentDataAsyncTask.invCompanyIndustry(company, invIndustryMap, "em", new AtomicInteger(10));
            }
            isCompletedByTaskCount(investmentDataThreadPoolTaskExecutor.getThreadPoolExecutor(), 0);
            log.info("========公司所属行业 任务完成=========");
        } catch (Exception e) {
            log.error(">>>异常:", e);
        }
    }

    /**
     * 公司办公地址、注册地址
     */
    private void invCompanyAddress(List<InvCompany> companyList) {
        try {
            log.info("========公司办公地址、注册地址 任务开始=========");
            List<SysArea> sysAreas = sysAreaMapper.selectSysAreaList();
            Map<String, SysArea> sysAreasMap = new HashMap<>();
            for (SysArea sysArea : sysAreas) {
                String key = sysArea.getShortName() + sysArea.getLevel();
                sysAreasMap.put(key, sysArea);
            }
            for (InvCompany company : companyList) {
                investmentDataAsyncTask.invCompanyAddress(company, sysAreasMap, new AtomicInteger(10));
            }
            isCompletedByTaskCount(investmentDataThreadPoolTaskExecutor.getThreadPoolExecutor(), 0);
            log.info("========公司办公地址、注册地址 任务完成=========");
        } catch (Exception e) {
            log.error(">>>异常:", e);
        }
    }

    /**
     * 财务分析
     */
    private void invFinance() {
        log.info("========财务分析-报告日期 任务开始=========");
        List<InvStock> stockList = invStockMapper.selectInvStockVoNoDelisting();
        for (InvStock stock : stockList) {
            investmentDataAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("inv.finance-zcfz-date-bgq"), "zcfz", "bgq", new AtomicInteger(10));
            investmentDataAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("inv.finance-zcfz-date-bgq"), "zcfz", "bgq", new AtomicInteger(10));
            investmentDataAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("inv.finance-zcfz-date-nd"), "zcfz", "nd", new AtomicInteger(10));

            investmentDataAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("inv.finance-lr-date-bgq"), "lr", "bgq", new AtomicInteger(10));
            investmentDataAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("inv.finance-lr-date-nd"), "lr", "nd", new AtomicInteger(10));
            investmentDataAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("inv.finance-lr-date-jd"), "lr", "jd", new AtomicInteger(10));

            investmentDataAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("inv.finance-xjll-date-bgq"), "xjll", "bgq", new AtomicInteger(10));
            investmentDataAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("inv.finance-xjll-date-nd"), "xjll", "nd", new AtomicInteger(10));
            investmentDataAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("inv.finance-xjll-date-jd"), "xjll", "jd", new AtomicInteger(10));
        }
        isCompletedByTaskCount(investmentDataThreadPoolTaskExecutor.getThreadPoolExecutor(), 0);
        log.info("========财务分析-报告日期 任务完成=========");

        log.info("========财务分析-重要指标 任务开始=========");
        for (InvStock stock : stockList) {
            investmentDataAsyncTask.invFinanceZyzbTask(stock, ev.getProperty("inv.finance-zyzb-ajax-bgq"), "bgq", new AtomicInteger(10));
            investmentDataAsyncTask.invFinanceZyzbTask(stock, ev.getProperty("inv.finance-zyzb-ajax-nd"), "nd", new AtomicInteger(10));
            investmentDataAsyncTask.invFinanceZyzbTask(stock, ev.getProperty("inv.finance-zyzb-ajax-jd"), "jd", new AtomicInteger(10));
        }
        isCompletedByTaskCount(investmentDataThreadPoolTaskExecutor.getThreadPoolExecutor(), 0);
        log.info("========财务分析-重要指标 任务完成=========");

        log.info("========财务分析-杜邦分析 任务开始=========");
        for (InvStock stock : stockList) {
            investmentDataAsyncTask.invFinanceDbfxTask(stock, ev.getProperty("inv.finance-dbfx-ajax"), new AtomicInteger(10));
        }
        isCompletedByTaskCount(investmentDataThreadPoolTaskExecutor.getThreadPoolExecutor(), 0);
        log.info("========财务分析-杜邦分析 任务完成=========");

        log.info("========财务分析-资产负债 任务开始=========");
        SysDictData dictData = new SysDictData();
        dictData.setDictType("opinion_type");
        List<SysDictData> dictDatas = dictDataMapper.selectDictDataList(dictData);
        for (InvStock stock : stockList) {
            investmentDataAsyncTask.invFinanceZcfzTask(stock, ev.getProperty("inv.finance-zcfz-ajax-bgq"), "zcfz", "bgq", dictDatas, new AtomicInteger(10));
            investmentDataAsyncTask.invFinanceZcfzTask(stock, ev.getProperty("inv.finance-zcfz-ajax-nd"), "zcfz", "nd", dictDatas, new AtomicInteger(10));
        }
        isCompletedByTaskCount(investmentDataThreadPoolTaskExecutor.getThreadPoolExecutor(), 0);
        log.info("========财务分析-资产负债 任务完成=========");

        log.info("========财务分析-利润 任务开始=========");
        for (InvStock stock : stockList) {
            investmentDataAsyncTask.invFinanceLrTask(stock, ev.getProperty("inv.finance-lr-ajax-bgq"), "lr", "bgq", dictDatas, new AtomicInteger(10));
            investmentDataAsyncTask.invFinanceLrTask(stock, ev.getProperty("inv.finance-lr-ajax-nd"), "lr", "nd", dictDatas, new AtomicInteger(10));
            investmentDataAsyncTask.invFinanceLrTask(stock, ev.getProperty("inv.finance-lr-ajax-jd"), "lr", "jd", dictDatas, new AtomicInteger(10));
        }
        isCompletedByTaskCount(investmentDataThreadPoolTaskExecutor.getThreadPoolExecutor(), 0);
        log.info("========财务分析-利润 任务完成=========");

        log.info("========财务分析-现金流量 任务开始=========");
        for (InvStock stock : stockList) {
            investmentDataAsyncTask.invFinanceXjllTask(stock, ev.getProperty("inv.finance-xjll-ajax-bgq"), "xjll", "bgq", dictDatas, new AtomicInteger(10));
            investmentDataAsyncTask.invFinanceXjllTask(stock, ev.getProperty("inv.finance-xjll-ajax-nd"), "xjll", "nd", dictDatas, new AtomicInteger(10));
            investmentDataAsyncTask.invFinanceXjllTask(stock, ev.getProperty("inv.finance-xjll-ajax-jd"), "xjll", "jd", dictDatas, new AtomicInteger(10));
        }
        isCompletedByTaskCount(investmentDataThreadPoolTaskExecutor.getThreadPoolExecutor(), 0);
        log.info("========财务分析-现金流量 任务完成=========");

        log.info("========财务分析-百分比 任务开始=========");
        for (InvStock stock : stockList) {
            investmentDataAsyncTask.invFinanceBfbTask(stock, ev.getProperty("inv.finance-bfb-ajax-bgq"), "bgq", new AtomicInteger(10));
            investmentDataAsyncTask.invFinanceBfbTask(stock, ev.getProperty("inv.finance-bfb-ajax-nd"), "nd", new AtomicInteger(10));
            investmentDataAsyncTask.invFinanceBfbTask(stock, ev.getProperty("inv.finance-bfb-ajax-jd"), "jd", new AtomicInteger(10));
        }
        isCompletedByTaskCount(investmentDataThreadPoolTaskExecutor.getThreadPoolExecutor(), 0);
        log.info("========财务分析-百分比 任务完成=========");
    }

    /**
     * 公司大事
     */
    private void invCompanyBigNews() {
        log.info("========公司大事 任务开始=========");
        log.info("========大宗交易-每日明细 任务开始=========");
        List<InvStock> stockList = invStockMapper.selectInvStockVoNoDelisting();
        for (InvStock stock : stockList) {
            investmentDataAsyncTask.invDzjyMrmxTask(stock, ev.getProperty("inv.dzjy-mrmx"), 1, 1, 500, new AtomicInteger(10));
        }
        isCompletedByTaskCount(investmentDataThreadPoolTaskExecutor.getThreadPoolExecutor(), 0);
        log.info("========大宗交易-每日明细 任务结束=========");

        log.info("========融资融券 任务开始=========");
        for (InvStock stock : stockList) {
            investmentDataAsyncTask.invRzrqTask(stock, ev.getProperty("inv.rzrq"), 1, 1, new AtomicInteger(10));
        }
        isCompletedByTaskCount(investmentDataThreadPoolTaskExecutor.getThreadPoolExecutor(), 0);
        log.info("========融资融券 任务完成=========");


        log.info("========公司大事 任务完成=========");
    }

    /**
     * 财务分析数据抓取
     */
    public void initDataTask() {
        log.info("================数据初始化任务 等待=================");
        isCompletedByTaskCount(investmentDataThreadPoolTaskExecutor.getThreadPoolExecutor(), 0);
        log.info("================数据初始化任务 开始=================");

        invStock();
        invCompany();
        invFinance();
        invCompanyBigNews();


        log.info("================数据初始化任务 完成=================");
    }

    ///////////////////////////////////////////////////////快速工具///////////////////////////////////////////////////////

    /**
     * 生成接口对应SQL文件
     */
    public void createSqlFile(String interfaceName) {
        log.info("========生成SQL interfaceName:{} 任务等待=========", interfaceName);
        isCompletedByTaskCount(investmentDataThreadPoolTaskExecutor.getThreadPoolExecutor(), 0);
        log.info("========生成SQL interfaceName:{} 任务开始=========", interfaceName);

        keyOfInterfaceSet.clear();
        keyOfHtmlSet.clear();
        sqlOfHtmlMap.clear();

        List<InvStock> stockList = invStockMapper.selectInvStockVoNoDelisting();
        for (InvStock stock : stockList) {
//            if ("000001".equals(stock.getCode())) {
            if ("company".equals(interfaceName)) {
                investmentDataAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.company-company-ajax"));
                investmentDataAsyncTask.getHtmlKey(stock, ev.getProperty("inv.company-web"), interfaceName);
            }
            if ("zyzb".equals(interfaceName)) {
                investmentDataAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-zyzb-ajax-bgq"));
                investmentDataAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-zyzb-ajax-nd"));
                investmentDataAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-zyzb-ajax-jd"));
                investmentDataAsyncTask.getHtmlKey(stock, ev.getProperty("inv.finance-web"), interfaceName);
            }
            if ("dbfx".equals(interfaceName)) {
                investmentDataAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-dbfx-ajax"));
                investmentDataAsyncTask.getHtmlKey(stock, ev.getProperty("inv.finance-web"), interfaceName);
            }
            if ("zcfz".equals(interfaceName)) {
                investmentDataAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-zcfz-ajax-bgq"));
                investmentDataAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-zcfz-ajax-nd"));
                investmentDataAsyncTask.getHtmlKey(stock, ev.getProperty("inv.finance-web"), interfaceName);
            }
            if ("lr".equals(interfaceName)) {
                investmentDataAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-lr-ajax-bgq"));
                investmentDataAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-lr-ajax-nd"));
                investmentDataAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-lr-ajax-jd"));
                investmentDataAsyncTask.getHtmlKey(stock, ev.getProperty("inv.finance-web"), interfaceName);
            }
            if ("xjll".equals(interfaceName)) {
                investmentDataAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-xjll-ajax-bgq"));
                investmentDataAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-xjll-ajax-nd"));
                investmentDataAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-xjll-ajax-jd"));
                investmentDataAsyncTask.getHtmlKey(stock, ev.getProperty("inv.finance-web"), interfaceName);
            }
            if ("bfb".equals(interfaceName)) {
                investmentDataAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-bfb-ajax-bgq"));
                investmentDataAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-bfb-ajax-nd"));
                investmentDataAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-bfb-ajax-jd"));
                investmentDataAsyncTask.getHtmlKey(stock, ev.getProperty("inv.finance-web"), interfaceName);
            }
//            }
        }
        isCompletedByTaskCount(investmentDataThreadPoolTaskExecutor.getThreadPoolExecutor(), 0);

        TaskUtils.writeKeysOfInterface(interfaceName + ".txt");
        TaskUtils.writeSqlFileOfHtml(interfaceName + ".sql");
        TaskUtils.writeCompareKeyFile(interfaceName + "-compare.txt");

        keyOfInterfaceSet.clear();
        keyOfHtmlSet.clear();
        sqlOfHtmlMap.clear();
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
