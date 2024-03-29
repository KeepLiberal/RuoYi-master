package com.ruoyi.quartz.task.data;

import com.ruoyi.common.core.domain.entity.SysDictData;
import com.ruoyi.investment.domain.InvStock;
import com.ruoyi.investment.mapper.InvStockMapper;
import com.ruoyi.quartz.async.data.InvDataShareholderResearchAsyncTask;
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
public class InvDataShareholderResearchTask {
    @Resource
    private Environment ev;
    @Resource
    private SysDictDataMapper dictDataMapper;
    @Resource
    private InvStockMapper invStockMapper;
    @Resource
    private InvDataShareholderResearchAsyncTask invDataShareholderResearchAsyncTask;


    public void shareholderResearch() {
        log.info("========股东研究=========");
        List<InvStock> stockList = invStockMapper.selectInvStockVoNoDelisting();
        invJjgTask(stockList);
        log.info("========股东研究=========");
    }

    /**
     * 解禁股
     */
    private void invJjgTask(List<InvStock> stockList) {
        log.info("========解禁股 任务开始=========");
        for (InvStock stock : stockList) {
            invDataShareholderResearchAsyncTask.invJjgTask(stock, ev.getProperty("inv.jjg-mx"), 1, 1, new AtomicInteger(10));
        }
        InvConstants.isCompletedByTaskCount(0);
        for (SysDictData dictData : InvConstants.sysDictDataSet){
            List<SysDictData> dictDatas = dictDataMapper.selectDictDataList(dictData);
            if (null == dictDatas || dictDatas.size() == 0) {
                dictDataMapper.insertDictData(dictData);
            }
        }
        InvConstants.sysDictDataSet.clear();
        log.info("========解禁股 任务完成=========");
    }

}
