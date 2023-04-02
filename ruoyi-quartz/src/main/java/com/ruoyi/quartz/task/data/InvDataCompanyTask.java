package com.ruoyi.quartz.task.data;

import com.ruoyi.investment.domain.InvCompany;
import com.ruoyi.investment.domain.InvIndustry;
import com.ruoyi.investment.domain.InvStock;
import com.ruoyi.investment.mapper.InvCompanyMapper;
import com.ruoyi.investment.mapper.InvIndustryMapper;
import com.ruoyi.investment.mapper.InvStockMapper;
import com.ruoyi.quartz.async.data.InvDataCompanyAsyncTask;
import com.ruoyi.quartz.constant.InvConstants;
import com.ruoyi.system.domain.SysArea;
import com.ruoyi.system.mapper.SysAreaMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;


@Slf4j
@Component
public class InvDataCompanyTask {
    @Resource
    private Environment ev;
    @Resource
    private InvDataCompanyAsyncTask invDataCompanyAsyncTask;
    @Resource
    private InvStockMapper invStockMapper;
    @Resource
    private InvCompanyMapper invCompanyMapper;
    @Resource
    private InvIndustryMapper invIndustryMapper;
    @Resource
    private SysAreaMapper sysAreaMapper;


    /**
     * 公司概况
     */
    public void invCompany() {
        log.info("========公司概况 任务开始=========");
        List<InvStock> stockList = invStockMapper.selectInvStockVoNoDelisting();
        for (InvStock stock : stockList) {
            invDataCompanyAsyncTask.invCompanyTask(stock, ev.getProperty("inv.company-company-ajax"), new AtomicInteger(10));
        }
        InvConstants.isCompletedByTaskCount(0);
        log.info("========公司概况 任务完成=========");

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
                invDataCompanyAsyncTask.invIndustryTask(company, "csrc", new AtomicInteger(10));
                invDataCompanyAsyncTask.invIndustryTask(company, "em", new AtomicInteger(10));
            }
            InvConstants.isCompletedByTaskCount(0);

            List<InvIndustry> hasInvIndustrys = invIndustryMapper.selectInvIndustryList(null);
            List<InvIndustry> invIndustryList = new ArrayList<>();
            for (InvIndustry newIndustry : InvConstants.invIndustrySet) {
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
                for (InvIndustry invIndustryZ : InvConstants.invIndustrySet) {
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
                                for (InvIndustry invIndustryF : InvConstants.invIndustrySet) {
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
            InvConstants.invIndustrySet.clear();
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
                invDataCompanyAsyncTask.invCompanyIndustry(company, invIndustryMap, "csrc", new AtomicInteger(10));
                invDataCompanyAsyncTask.invCompanyIndustry(company, invIndustryMap, "em", new AtomicInteger(10));
            }
            InvConstants.isCompletedByTaskCount(0);
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
                invDataCompanyAsyncTask.invCompanyAddress(company, sysAreasMap, new AtomicInteger(10));
            }
            InvConstants.isCompletedByTaskCount(0);
            log.info("========公司办公地址、注册地址 任务完成=========");
        } catch (Exception e) {
            log.error(">>>异常:", e);
        }
    }

}
