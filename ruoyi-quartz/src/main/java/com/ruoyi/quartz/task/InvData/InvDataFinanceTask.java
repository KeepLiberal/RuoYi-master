package com.ruoyi.quartz.task.InvData;

import com.ruoyi.common.core.domain.entity.SysDictData;
import com.ruoyi.investment.domain.InvStock;
import com.ruoyi.investment.mapper.InvStockMapper;
import com.ruoyi.quartz.async.invData.InvDataFinanceAsyncTask;
import com.ruoyi.quartz.constant.InvConstants;
import com.ruoyi.system.mapper.SysDictDataMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
@Component
public class InvDataFinanceTask {
    @Resource
    private Environment ev;
    @Resource
    private InvDataFinanceAsyncTask invDataFinanceAsyncTask;
    @Resource
    private InvStockMapper invStockMapper;
    @Resource
    private SysDictDataMapper dictDataMapper;

    /**
     * 财务分析
     */
    public void invFinance() {
        log.info("========财务分析=========");

        List<InvStock> stockList = invStockMapper.selectInvStockVoNoDelisting();
        SysDictData dictData = new SysDictData();
        dictData.setDictType("opinion_type");
        List<SysDictData> dictDatas = dictDataMapper.selectDictDataList(dictData);

        invFinanceReportDateTask(stockList);
        invFinanceZyzbTask(stockList);
        invFinanceDbfxTask(stockList);
        invFinanceZcfzTask(stockList);
        invFinanceLrTask(stockList, dictDatas);
        invFinanceXjllTask(stockList, dictDatas);
        invFinanceBfbTask(stockList);
        log.info("========财务分析=========");

    }

    /**
     * 报告日期
     */
    public void invFinanceReportDateTask(List<InvStock> stockList) {
        log.info("========报告日期 任务开始=========");
        for (InvStock stock : stockList) {
            invDataFinanceAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("inv.finance-zcfz-date-bgq"), "zcfz", "bgq", new AtomicInteger(10));
            invDataFinanceAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("inv.finance-zcfz-date-bgq"), "zcfz", "bgq", new AtomicInteger(10));
            invDataFinanceAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("inv.finance-zcfz-date-nd"), "zcfz", "nd", new AtomicInteger(10));

            invDataFinanceAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("inv.finance-lr-date-bgq"), "lr", "bgq", new AtomicInteger(10));
            invDataFinanceAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("inv.finance-lr-date-nd"), "lr", "nd", new AtomicInteger(10));
            invDataFinanceAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("inv.finance-lr-date-jd"), "lr", "jd", new AtomicInteger(10));

            invDataFinanceAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("inv.finance-xjll-date-bgq"), "xjll", "bgq", new AtomicInteger(10));
            invDataFinanceAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("inv.finance-xjll-date-nd"), "xjll", "nd", new AtomicInteger(10));
            invDataFinanceAsyncTask.invFinanceReportDateTask(stock, ev.getProperty("inv.finance-xjll-date-jd"), "xjll", "jd", new AtomicInteger(10));
        }
        InvConstants.isCompletedByTaskCount(0);
        log.info("========报告日期 任务完成=========");
    }

    /**
     * 重要指标
     */
    public void invFinanceZyzbTask(List<InvStock> stockList) {
        log.info("========重要指标 任务开始=========");
        for (InvStock stock : stockList) {
            invDataFinanceAsyncTask.invFinanceZyzbTask(stock, ev.getProperty("inv.finance-zyzb-ajax-bgq"), "bgq", new AtomicInteger(10));
            invDataFinanceAsyncTask.invFinanceZyzbTask(stock, ev.getProperty("inv.finance-zyzb-ajax-nd"), "nd", new AtomicInteger(10));
            invDataFinanceAsyncTask.invFinanceZyzbTask(stock, ev.getProperty("inv.finance-zyzb-ajax-jd"), "jd", new AtomicInteger(10));
        }
        InvConstants.isCompletedByTaskCount(0);
        log.info("========重要指标 任务完成=========");
    }

    /**
     * 杜邦分析
     */
    public void invFinanceDbfxTask(List<InvStock> stockList) {
        log.info("========杜邦分析 任务开始=========");
        for (InvStock stock : stockList) {
            invDataFinanceAsyncTask.invFinanceDbfxTask(stock, ev.getProperty("inv.finance-dbfx-ajax"), new AtomicInteger(10));
        }
        InvConstants.isCompletedByTaskCount(0);
        log.info("========杜邦分析 任务完成=========");
    }

    /**
     * 资产负债
     */
    public void invFinanceZcfzTask(List<InvStock> stockList) {
        log.info("========资产负债 任务开始=========");
        SysDictData dictData = new SysDictData();
        dictData.setDictType("opinion_type");
        List<SysDictData> dictDatas = dictDataMapper.selectDictDataList(dictData);
        for (InvStock stock : stockList) {
            invDataFinanceAsyncTask.invFinanceZcfzTask(stock, ev.getProperty("inv.finance-zcfz-ajax-bgq"), "zcfz", "bgq", dictDatas, new AtomicInteger(10));
            invDataFinanceAsyncTask.invFinanceZcfzTask(stock, ev.getProperty("inv.finance-zcfz-ajax-nd"), "zcfz", "nd", dictDatas, new AtomicInteger(10));
        }
        InvConstants.isCompletedByTaskCount(0);
        log.info("========资产负债 任务完成=========");
    }

    /**
     * 利润
     */
    public void invFinanceLrTask(List<InvStock> stockList, List<SysDictData> dictDatas) {
        log.info("========利润 任务开始=========");
        for (InvStock stock : stockList) {
            invDataFinanceAsyncTask.invFinanceLrTask(stock, ev.getProperty("inv.finance-lr-ajax-bgq"), "lr", "bgq", dictDatas, new AtomicInteger(10));
            invDataFinanceAsyncTask.invFinanceLrTask(stock, ev.getProperty("inv.finance-lr-ajax-nd"), "lr", "nd", dictDatas, new AtomicInteger(10));
            invDataFinanceAsyncTask.invFinanceLrTask(stock, ev.getProperty("inv.finance-lr-ajax-jd"), "lr", "jd", dictDatas, new AtomicInteger(10));
        }
        InvConstants.isCompletedByTaskCount(0);
        log.info("========利润 任务完成=========");
    }

    /**
     * 现金流量
     */
    public void invFinanceXjllTask(List<InvStock> stockList, List<SysDictData> dictDatas) {
        log.info("========现金流量 任务开始=========");
        for (InvStock stock : stockList) {
            invDataFinanceAsyncTask.invFinanceXjllTask(stock, ev.getProperty("inv.finance-xjll-ajax-bgq"), "xjll", "bgq", dictDatas, new AtomicInteger(10));
            invDataFinanceAsyncTask.invFinanceXjllTask(stock, ev.getProperty("inv.finance-xjll-ajax-nd"), "xjll", "nd", dictDatas, new AtomicInteger(10));
            invDataFinanceAsyncTask.invFinanceXjllTask(stock, ev.getProperty("inv.finance-xjll-ajax-jd"), "xjll", "jd", dictDatas, new AtomicInteger(10));
        }
        InvConstants.isCompletedByTaskCount(0);
        log.info("========现金流量 任务完成=========");
    }

    /**
     * 百分比
     */
    public void invFinanceBfbTask(List<InvStock> stockList) {
        log.info("========百分比 任务开始=========");
        for (InvStock stock : stockList) {
            invDataFinanceAsyncTask.invFinanceBfbTask(stock, ev.getProperty("inv.finance-bfb-ajax-bgq"), "bgq", new AtomicInteger(10));
            invDataFinanceAsyncTask.invFinanceBfbTask(stock, ev.getProperty("inv.finance-bfb-ajax-nd"), "nd", new AtomicInteger(10));
            invDataFinanceAsyncTask.invFinanceBfbTask(stock, ev.getProperty("inv.finance-bfb-ajax-jd"), "jd", new AtomicInteger(10));
        }
        InvConstants.isCompletedByTaskCount(0);
        log.info("========百分比 任务完成=========");
    }

}
