package com.ruoyi.quartz.task.data;

import com.ruoyi.investment.domain.InvStock;
import com.ruoyi.investment.mapper.InvStockMapper;
import com.ruoyi.quartz.async.data.InvDataFhrzAsyncTask;
import com.ruoyi.quartz.constant.InvConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;


@Slf4j
@Component
public class InvDataFhrzTask {
    @Resource
    private InvStockMapper invStockMapper;

    @Resource
    private InvDataFhrzAsyncTask invDataFhrzAsyncTask;

    /**
     * 分红融资
     */
    public void invFhrz() {
        log.info("========分红融资 任务开始=========");
        List<InvStock> invStocks = invStockMapper.selectInvStockList(null);
        for (InvStock invStock : invStocks) {
            invDataFhrzAsyncTask.invFhrz(invStock);
        }
        InvConstants.isCompletedByTaskCount(0);
        log.info("========分红融资 任务完成=========");
    }
}
