package com.ruoyi.quartz.task.data;

import com.ruoyi.investment.domain.InvStock;
import com.ruoyi.investment.mapper.InvStockMapper;
import com.ruoyi.quartz.async.data.InvDataKLineAsyncTask;
import com.ruoyi.quartz.constant.InvConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.*;


@Slf4j
@Component
public class InvDataKLineTask {
    @Resource
    private InvStockMapper invStockMapper;

    @Resource
    private InvDataKLineAsyncTask invDataKLineAsyncTask;

    /**
     * K_Line
     */
    public void invDataKLine() {
        log.info("========K_Line 任务开始=========");
        List<InvStock> invStocks = invStockMapper.selectInvStockList(null);
        for (InvStock invStock : invStocks) {
            invDataKLineAsyncTask.invDataKLine(invStock);
        }
        InvConstants.isCompletedByTaskCount(0);
        log.info("========K_Line 任务完成=========");
    }
}
