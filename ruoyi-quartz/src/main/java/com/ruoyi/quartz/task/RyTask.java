package com.ruoyi.quartz.task;

import com.ruoyi.quartz.constant.InvConstants;
import com.ruoyi.quartz.task.InvData.InvDataCompanyBigNewsTask;
import com.ruoyi.quartz.task.InvData.InvDataCompanyTask;
import com.ruoyi.quartz.task.InvData.InvDataFinanceTask;
import com.ruoyi.quartz.task.InvData.InvDataStockTask;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 定时任务调度
 */
@Slf4j
@Component("ryTask")
public class RyTask {
    @Resource
    private InvDataStockTask invDataStockTask;
    @Resource
    private InvDataCompanyTask invDataCompanyTask;
    @Resource
    private InvDataFinanceTask invDataFinanceTask;
    @Resource
    private InvDataCompanyBigNewsTask invDataRzrqTask;


    /**
     * 数据初始化
     */
    public void initDataTask() {
        log.info("================数据初始化任务 等待=================");
        InvConstants.isCompletedByTaskCount(0);
        log.info("================数据初始化任务 开始=================");
        invDataStockTask.invStock();//沪深A股基础数据
        invDataCompanyTask.invCompany();//公司概况
        invDataFinanceTask.invFinance();//财务分析
        invDataRzrqTask.invCompanyBigNews();//公司大事
        log.info("================数据初始化任务 完成=================");
    }

}
