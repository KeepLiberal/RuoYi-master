package com.ruoyi.quartz.task.policy;

import com.ruoyi.investment.domain.InvFinanceZyzb;
import com.ruoyi.investment.mapper.InvCompanyMapper;
import com.ruoyi.investment.mapper.InvFinanceZyzbMapper;
import com.ruoyi.investment.mapper.InvKLineMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Slf4j
@Component
public class InvPickStockTask {
    @Resource
    private InvCompanyMapper invCompanyMapper;
    @Resource
    private InvKLineMapper invKLineMapper;
    @Resource
    private InvFinanceZyzbMapper invFinanceZyzbMapper;


    /**
     * 海选条件
     * 1、连续5年的ROE大于20%
     * 2、连续5年的净利润现金含量 大于80%     (净利润现金含量=经营性现金净流量╱净利润)  经营性现金净流量-取主要指标  净利润-取主要指标
     * 3、连续5年的毛利率大于40%
     * 4、上市大于3年-公司
     * <p>
     * 精选条件
     * 1、连续5年的平均净利润现金含量大于100%
     * 2、连续5年的资产负债率小于60%         资产负债率-取主要指标
     * 3、连续5年分红比例大于25%
     */
    public void pickStock() {

        List<String> dateList = Arrays.asList("2022-12-31", "2021-12-31", "2020-12-31", "2019-12-31", "2018-12-31");

        List<String> list1 = roe(dateList, 20);
        List<String> list2 = grossMargin(dateList, 40);

        List<String> codeList = new ArrayList<>();
        for (String code : list1) {
            if (list2.contains(code))
                codeList.add(code);
        }


        System.out.println(codeList);
    }

    /**
     * 连续N年的ROE大于N%
     *
     * ROE(净资产收益率)
     * 主要指标-roejq
     */
    private List<String> roe(List<String> dateList, double num) {
        List<String> codeList = new ArrayList<>();
        int time = 1;
        for (String date : dateList) {
            String sql = null;
            if (time == 1) {
                sql = "select security_code from inv_finance_zyzb where report_date='" + date + "' and report_type='nd' and roejq>" + num;
                for (InvFinanceZyzb zyzb : invFinanceZyzbMapper.commonSelect(sql)) {
                    codeList.add(zyzb.getSecurityCode());
                }
            } else {
                if(codeList.size()>0){
                    sql = "select security_code from inv_finance_zyzb where report_date='" + date + "' and report_type='nd' and roejq>" + num + " and security_code in (";
                    StringBuilder sb = new StringBuilder();
                    for (String code : codeList) {
                        sb.append("'").append(code).append("',");
                    }
                    String sbStr = sb.toString();
                    sbStr = sbStr.substring(0, sbStr.length() - 1) + ")";
                    sql = sql + sbStr;

                    codeList.clear();
                    for (InvFinanceZyzb zyzb : invFinanceZyzbMapper.commonSelect(sql)) {
                        codeList.add(zyzb.getSecurityCode());
                    }
                }else {
                    break;
                }
            }
            time++;
        }
        return codeList;
    }


    /**
     * 连续N年的毛利率大于N%
     *
     * 主要指标-xsmll
     */
    private List<String> grossMargin(List<String> dateList, double num) {
        List<String> codeList = new ArrayList<>();
        int time = 1;
        for (String date : dateList) {
            String sql = null;
            if (time == 1) {
                sql = "select security_code from inv_finance_zyzb where report_date='" + date + "' and report_type='nd' and xsmll>" + num;
                for (InvFinanceZyzb zyzb : invFinanceZyzbMapper.commonSelect(sql)) {
                    codeList.add(zyzb.getSecurityCode());
                }
            } else {
                if(codeList.size()>0){
                    sql = "select security_code from inv_finance_zyzb where report_date='" + date + "' and report_type='nd' and xsmll>" + num + " and security_code in (";
                    StringBuilder sb = new StringBuilder();
                    for (String code : codeList) {
                        sb.append("'").append(code).append("',");
                    }
                    String sbStr = sb.toString();
                    sbStr = sbStr.substring(0, sbStr.length() - 1) + ")";
                    sql = sql + sbStr;

                    codeList.clear();
                    for (InvFinanceZyzb zyzb : invFinanceZyzbMapper.commonSelect(sql)) {
                        codeList.add(zyzb.getSecurityCode());
                    }
                }else{
                    break;
                }
            }
            time++;
        }
        return codeList;
    }

}
