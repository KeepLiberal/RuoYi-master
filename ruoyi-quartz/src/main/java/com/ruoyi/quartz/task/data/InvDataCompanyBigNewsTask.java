package com.ruoyi.quartz.task.data;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.investment.domain.InvLhbReportDate;
import com.ruoyi.investment.domain.InvStock;
import com.ruoyi.investment.domain.InvStockExchange;
import com.ruoyi.investment.mapper.InvLhbReportDateMapper;
import com.ruoyi.investment.mapper.InvStockExchangeMapper;
import com.ruoyi.investment.mapper.InvStockMapper;
import com.ruoyi.quartz.async.data.InvDataCompanyNewsAsyncTask;
import com.ruoyi.quartz.constant.InvConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
@Component
public class InvDataCompanyBigNewsTask {
    @Resource
    private Environment ev;
    @Resource
    private InvDataCompanyNewsAsyncTask invDataCompanyNewsAsyncTask;
    @Resource
    private InvStockMapper invStockMapper;
    @Resource
    private InvLhbReportDateMapper invLhbReportDateMapper;
    @Resource
    private InvStockExchangeMapper invStockExchangeMapper;


    public void invCompanyBigNews() {
        log.info("========公司大事=========");
        List<InvStock> stockList = invStockMapper.selectInvStockVoNoDelisting();
        invDataLhb(stockList);
        invDataDzjy(stockList);
        invDataRzrq(stockList);
        log.info("========公司大事=========");
    }

    /**
     * 龙虎榜单
     */
    private void invDataLhb(List<InvStock> stockList) {
        log.info("========龙虎榜单-日期 任务开始=========");
        for (InvStock stock : stockList) {
            invDataCompanyNewsAsyncTask.invLhbReportTask(stock, ev.getProperty("inv.lhb-stock-rq"), 1, 1, new AtomicInteger(10));
        }
        InvConstants.isCompletedByTaskCount(0);
        log.info("========龙虎榜单-日期 任务完成=========");

        log.info("========龙虎榜单-每日明细 任务开始=========");
        for (InvStock stock : stockList) {
            List<InvLhbReportDate> invLhbReportDates = invLhbReportDateMapper.selectInvLhbReportDateListPendingMrmx(stock.getCode());
            for (InvLhbReportDate invLhbReportDate : invLhbReportDates) {
                Date tradeDate = invLhbReportDate.getTradeDate();
                String reportDateStr = DateUtils.parseDateToStr(DateUtils.YYYY_MM_DD, tradeDate);
                invDataCompanyNewsAsyncTask.invLhbStockMrmxTask(stock, ev.getProperty("inv.lhb-stock-mrmx-buy"), tradeDate, reportDateStr, "B", 1, 1, new AtomicInteger(10));
                invDataCompanyNewsAsyncTask.invLhbStockMrmxTask(stock, ev.getProperty("inv.lhb-stock-mrmx-sell"), tradeDate, reportDateStr, "S", 1, 1, new AtomicInteger(10));
            }
        }
        InvConstants.isCompletedByTaskCount(0);
        log.info("========龙虎榜单-每日明细 任务完成=========");

        log.info("========龙虎榜单-每日统计 任务开始=========");
        InvConstants.objectMap.clear();
        for (InvStock stock : stockList) {
            List<InvLhbReportDate> invLhbReportDates = invLhbReportDateMapper.selectInvLhbReportDateListPendingMrtj(stock.getCode());
            for (InvLhbReportDate invLhbReportDate : invLhbReportDates) {
                String reportDateStr = DateUtils.parseDateToStr(DateUtils.YYYY_MM_DD, invLhbReportDate.getTradeDate());
                invDataCompanyNewsAsyncTask.invLhbStockMrtjTask(stock, ev.getProperty("inv.lhb-stock-mrtj-all"), reportDateStr, "ALL", 1, 1, new AtomicInteger(10));
            }
            invDataCompanyNewsAsyncTask.invLhbStockMrtjTask(stock, ev.getProperty("inv.lhb-stock-mrtj-yyb"), null, "YYB", 1, 1, new AtomicInteger(10));
            invDataCompanyNewsAsyncTask.invLhbStockMrtjTask(stock, ev.getProperty("inv.lhb-stock-mrtj-jg"), null, "JG", 1, 1, new AtomicInteger(10));
        }
        InvConstants.isCompletedByTaskCount(0);
        for (InvStock stock : stockList) {
            invDataCompanyNewsAsyncTask.invLhbStockMrtjSaveTask(stock, new AtomicInteger(10));
        }
        InvConstants.isCompletedByTaskCount(0);
        InvConstants.objectMap.clear();
        log.info("========龙虎榜单-每日统计 任务完成=========");
    }

    /**
     * 大宗交易
     */
    private void invDataDzjy(List<InvStock> stockList) {
        log.info("========大宗交易-每日明细 任务开始=========");
        for (InvStock stock : stockList) {
            invDataCompanyNewsAsyncTask.invDzjyMrmxTask(stock, ev.getProperty("inv.dzjy-mrmx"), 1, 1, 500, new AtomicInteger(10));
        }
        InvConstants.isCompletedByTaskCount(0);
        log.info("========大宗交易-每日明细 任务结束=========");

        log.info("========证券交易所 任务开始=========");
        List<InvStockExchange> invStockExchanges = invStockExchangeMapper.selectInvStockExchangeList(null);
        Map<String, InvStockExchange> entityMap = new HashMap<>();
        for (InvStockExchange entity : invStockExchanges) {
            entityMap.put(entity.getCode(), entity);
        }
        for (InvStockExchange entity : InvConstants.invStockExchangeSet) {
            if (entityMap.containsKey(entity.getCode())) {
                InvStockExchange compare = entityMap.get(entity.getCode());
                if (!compare.equals(entity) && DateUtils.differentDaysByMillisecond(compare.getCreateDate(), entity.getCreateDate()) > 0) {
                    entity.setId(compare.getId());
                    invStockExchangeMapper.updateInvStockExchange(entity);
                }
            } else {
                invStockExchangeMapper.insertInvStockExchange(entity);
            }
        }
        log.info("========证券交易所 任务结束=========");

        log.info("========大宗交易-每日统计 任务开始=========");
        for (InvStock stock : stockList) {
            invDataCompanyNewsAsyncTask.invDzjyMrtjTask(stock, ev.getProperty("inv.dzjy-mrtj"), 1, 1, new AtomicInteger(10));
        }
        InvConstants.isCompletedByTaskCount(0);
        log.info("========大宗交易-每日统计 任务结束=========");
    }

    /**
     * 融资融券
     */
    private void invDataRzrq(List<InvStock> stockList) {
        log.info("========融资融券 任务开始=========");
        for (InvStock stock : stockList) {
            invDataCompanyNewsAsyncTask.invRzrqTask(stock, ev.getProperty("inv.rzrq"), 1, 1, new AtomicInteger(10));
        }
        InvConstants.isCompletedByTaskCount(0);
        log.info("========融资融券 任务完成=========");
    }
}
