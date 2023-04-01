package com.ruoyi.quartz.task.InvData;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.NumFormatUtil;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.http.HttpUtils;
import com.ruoyi.investment.domain.InvKLine;
import com.ruoyi.investment.domain.InvStock;
import com.ruoyi.investment.mapper.InvKLineMapper;
import com.ruoyi.investment.mapper.InvStockMapper;
import com.ruoyi.quartz.async.invData.InvDataFinanceAsyncTask;
import com.ruoyi.quartz.async.invData.InvDataKLineAsyncTask;
import com.ruoyi.quartz.constant.InvConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;


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
