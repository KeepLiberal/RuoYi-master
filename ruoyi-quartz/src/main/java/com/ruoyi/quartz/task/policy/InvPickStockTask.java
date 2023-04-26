package com.ruoyi.quartz.task.policy;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.http.HttpUtils;
import com.ruoyi.investment.mapper.InvCommonMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;


@Slf4j
@Component
public class InvPickStockTask {
    @Resource
    private InvCommonMapper invCommonMapper;


    /**
     * 海选条件
     * 1、连续5年的ROE大于20%
     * 2、连续5年的净利润现金含量大于80%
     * 3、连续5年的毛利率大于40%
     * 4、上市大于3年-公司
     * <p>
     * <p>
     * <p>
     * 精选条件
     * 5、连续5年的平均净利润现金含量大于100%
     * 6、连续5年的资产负债率小于60%
     * 7、连续5年分红比例大于25%
     */
    public void pickStock() {
        List<String> dateList = new ArrayList<>();
        String nowYearStr = DateUtils.getNowYearStr();
        dateList.add((Integer.valueOf(nowYearStr) - 1) + "-12-31");
        dateList.add((Integer.valueOf(nowYearStr) - 2) + "-12-31");
        dateList.add((Integer.valueOf(nowYearStr) - 3) + "-12-31");
        dateList.add((Integer.valueOf(nowYearStr) - 4) + "-12-31");
        dateList.add((Integer.valueOf(nowYearStr) - 5) + "-12-31");

        //1.连续5年的ROE大于20%
        List<String> list1 = roe(dateList, 20);
        //2.连续5年的净利润现金含量大于80%
        List<String> list2 = netProfitCashContent(dateList, 80);
        //3.连续5年的毛利率大于40%
        List<String> list3 = grossMargin(dateList, 40);
        //4.上市大于3年
        List<String> list4 = listingDate(-3);
        //5.连续5年的平均净利润现金含量大于100%
        List<String> list5 = netProfitCashContentAverage(dateList, 100);
        //6、连续5年的资产负债率小于60%
        List<String> list6 = zcfzRatio(dateList, 60);
        //7、连续5年分红比例大于25%
        List<String> list7 = dividendRatio(dateList, 25);

        List<String> codeList = new ArrayList<>();
        for (String code : list1) {
            if (list2.contains(code) && list3.contains(code) && list4.contains(code) && list5.contains(code) && list6.contains(code) && list7.contains(code)) {
                codeList.add(code);
            }
        }

        log.info("连续5年的ROE大于20% >>> " + list1);
        log.info("连续5年的净利润现金含量大于80% >>> " + list2);
        log.info("连续5年的毛利率大于40% >>> " + list3);
        log.info("上市大于3年 >>> " + list4);
        log.info("连续5年的平均净利润现金含量大于100% >>> " + list5);
        log.info("连续5年的资产负债率小于60% >>> " + list6);
        log.info("连续5年分红比例大于25% >>> " + list7);
        log.info("综合选股 >>> "+codeList);
    }

    ////////////////////////////////////////////////////////////海选/////////////////////////////////////////////////////

    /**
     * 连续N年的ROE大于N%
     * <p>
     * ROE(净资产收益率)-主要指标(roejq-净资产收益率(加权))
     */
    private List<String> roe(List<String> dateList, double num) {
        List<String> codeList = new ArrayList<>();
        int time = 1;
        for (String date : dateList) {
            String sql = null;
            if (time == 1) {
                sql = "select security_code from inv_finance_zyzb where report_date='" + date + "' and report_type='nd' and roejq>" + num;
                List<Map<String, Object>> maps = invCommonMapper.commonSelect(sql);
                for (Map<String, Object> map : maps) {
                    String code = (String) map.get("security_code");
                    codeList.add(code);
                }
            } else {
                if (codeList.size() > 0) {
                    sql = "select security_code from inv_finance_zyzb where report_date='" + date + "' and report_type='nd' and roejq>" + num + " and security_code in (";
                    StringBuilder sb = new StringBuilder();
                    for (String code : codeList) {
                        sb.append("'").append(code).append("',");
                    }
                    String sbStr = sb.toString();
                    sbStr = sbStr.substring(0, sbStr.length() - 1) + ")";
                    sql = sql + sbStr;

                    codeList.clear();
                    List<Map<String, Object>> maps = invCommonMapper.commonSelect(sql);
                    for (Map<String, Object> map : maps) {
                        String code = (String) map.get("security_code");
                        codeList.add(code);
                    }
                } else {
                    break;
                }
            }
            time++;
        }
        return codeList;
    }

    /**
     * 连续N年的净利润现金含量大于N%
     * <p>
     * (净利润现金含量=经营性现金净流量╱净利润)
     * 经营性现金净流量-现金流量表(netcash_operatenote-经营活动产生的现金流量净额)
     * 净利润-利润表(parent_netprofit-归属于母公司股东的净利润)
     */
    private List<String> netProfitCashContent(List<String> dateList, double num) {
        List<String> codeList = new ArrayList<>();
        int time = 1;
        for (String date : dateList) {
            if (time == 1) {
                String sql = "select xjll.security_code, xjll.report_date, xjll.netcash_operate, xjll.netcash_operatenote, xjll.fbnetcash_operate, xjll.fb_netcash_operate, lr.parent_netprofit " +
                        "from inv_finance_xjll xjll, inv_finance_lr lr " +
                        "where xjll.report_date='" + date + "' " +
                        "and lr.report_date='" + date + "' " +
                        "and xjll.report_type='nd' " +
                        "and lr.report_type='nd' " +
                        "and xjll.security_code=lr.security_code";
                List<Map<String, Object>> maps = invCommonMapper.commonSelect(sql);

                for (Map<String, Object> map : maps) {
                    double netcash_operatenote = 0;
                    if (map.containsKey("netcash_operate")) {
                        netcash_operatenote = (Double) map.get("netcash_operate");
                    } else if (map.containsKey("netcash_operatenote")) {
                        netcash_operatenote = (Double) map.get("netcash_operatenote");
                    } else if (map.containsKey("fbnetcash_operate")) {
                        netcash_operatenote = (Double) map.get("fbnetcash_operate");
                    } else if (map.containsKey("fb_netcash_operate")) {
                        netcash_operatenote = (Double) map.get("fb_netcash_operate");
                    }

                    if (map.containsKey("parent_netprofit")) {
                        Double parent_netprofit = (Double) map.get("parent_netprofit");
                        Double ratio = (netcash_operatenote / parent_netprofit) * 100;
                        if (ratio > num) {
                            String code = (String) map.get("security_code");
                            codeList.add(code);
                        }
                    }
                }
            } else {
                if (codeList.size() > 0) {
                    String sql = "select xjll.security_code, xjll.report_date, xjll.netcash_operate, xjll.netcash_operatenote, xjll.fbnetcash_operate, xjll.fb_netcash_operate, lr.parent_netprofit " +
                            "from inv_finance_xjll xjll, inv_finance_lr lr " +
                            "where xjll.report_date='" + date + "' " +
                            "and lr.report_date='" + date + "' " +
                            "and xjll.report_type='nd' " +
                            "and lr.report_type='nd' " +
                            "and xjll.security_code=lr.security_code " +
                            "and xjll.security_code in (";
                    StringBuilder sb = new StringBuilder();
                    for (String code : codeList) {
                        sb.append("'").append(code).append("',");
                    }
                    String sbStr = sb.toString();
                    sbStr = sbStr.substring(0, sbStr.length() - 1) + ")";
                    sql = sql + sbStr;

                    codeList.clear();
                    List<Map<String, Object>> maps = invCommonMapper.commonSelect(sql);

                    for (Map<String, Object> map : maps) {
                        double netcash_operatenote = 0;
                        if (map.containsKey("netcash_operate")) {
                            netcash_operatenote = (Double) map.get("netcash_operate");
                        } else if (map.containsKey("netcash_operatenote")) {
                            netcash_operatenote = (Double) map.get("netcash_operatenote");
                        } else if (map.containsKey("fbnetcash_operate")) {
                            netcash_operatenote = (Double) map.get("fbnetcash_operate");
                        } else if (map.containsKey("fb_netcash_operate")) {
                            netcash_operatenote = (Double) map.get("fb_netcash_operate");
                        }

                        if (map.containsKey("parent_netprofit")) {
                            Double parent_netprofit = (Double) map.get("parent_netprofit");
                            Double ratio = (netcash_operatenote / parent_netprofit) * 100;
                            if (ratio > num) {
                                String code = (String) map.get("security_code");
                                codeList.add(code);
                            }
                        }
                    }
                } else {
                    break;
                }
            }
            time++;
        }

        return codeList;
    }

    /**
     * 连续N年的毛利率大于N%
     * <p>
     * 主要指标(xsmll-毛利率)
     */
    private List<String> grossMargin(List<String> dateList, double num) {
        List<String> codeList = new ArrayList<>();
        int time = 1;
        for (String date : dateList) {
            if (time == 1) {
                String sql = "select security_code from inv_finance_zyzb where report_date='" + date + "' and report_type='nd' and xsmll>" + num;
                List<Map<String, Object>> maps = invCommonMapper.commonSelect(sql);
                for (Map<String, Object> map : maps) {
                    String code = (String) map.get("security_code");
                    codeList.add(code);
                }
            } else {
                if (codeList.size() > 0) {
                    String sql = "select security_code from inv_finance_zyzb where report_date='" + date + "' and report_type='nd' and xsmll>" + num + " and security_code in (";
                    StringBuilder sb = new StringBuilder();
                    for (String code : codeList) {
                        sb.append("'").append(code).append("',");
                    }
                    String sbStr = sb.toString();
                    sbStr = sbStr.substring(0, sbStr.length() - 1) + ")";
                    sql = sql + sbStr;

                    codeList.clear();
                    List<Map<String, Object>> maps = invCommonMapper.commonSelect(sql);
                    for (Map<String, Object> map : maps) {
                        String code = (String) map.get("security_code");
                        codeList.add(code);
                    }
                } else {
                    break;
                }
            }
            time++;
        }
        return codeList;
    }

    /**
     * 上市时间大于N年
     * <p>
     * 公司概况(listing_date-上市日期)
     */
    private List<String> listingDate(int num) {
        List<String> codeList = new ArrayList<>();

        String date = DateUtils.dateTime(DateUtils.yearAddOrSub(new Date(), num));
        String sql = "select code from inv_company where listing_date<'" + date + "'";
        List<Map<String, Object>> maps = invCommonMapper.commonSelect(sql);
        for (Map<String, Object> map : maps) {
            String code = (String) map.get("code");
            codeList.add(code);
        }

        return codeList;
    }


    ////////////////////////////////////////////////////////////精选/////////////////////////////////////////////////////

    /**
     * 连续N年的平均净利润现金含量大于N%
     * <p>
     * (净利润现金含量=经营性现金净流量╱净利润)
     * 经营性现金净流量-现金流量表(netcash_operatenote-经营活动产生的现金流量净额)
     * 净利润-利润表(parent_netprofit-归属于母公司股东的净利润)
     */
    private List<String> netProfitCashContentAverage(List<String> dateList, double num) {
        List<String> codeList = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        for (String date : dateList) {
            sb.append("'").append(date).append("',");
        }
        String sbStr = sb.toString();
        sbStr = sbStr.substring(0, sbStr.length() - 1);

        String sql = "select xjll.security_code, xjll.report_date, xjll.netcash_operate, xjll.netcash_operatenote, xjll.fbnetcash_operate, xjll.fb_netcash_operate, lr.parent_netprofit " +
                "from inv_finance_xjll xjll, inv_finance_lr lr " +
                "where xjll.report_date=lr.report_date " +
                "and xjll.report_type='nd' " +
                "and lr.report_type='nd' " +
                "and xjll.security_code=lr.security_code " +
                "and xjll.report_date in (" + sbStr + ") order by xjll.security_code";
        List<Map<String, Object>> maps = invCommonMapper.commonSelect(sql);
        String code = "000001";
        double time = 0;
        double ratioSum = 0;
        for (Map<String, Object> map : maps) {
            String security_code = (String) map.get("security_code");
            if (code.equals(security_code)) {
                double netcash_operatenote = 0;
                if (map.containsKey("netcash_operate")) {
                    netcash_operatenote = (Double) map.get("netcash_operate");
                } else if (map.containsKey("netcash_operatenote")) {
                    netcash_operatenote = (Double) map.get("netcash_operatenote");
                } else if (map.containsKey("fbnetcash_operate")) {
                    netcash_operatenote = (Double) map.get("fbnetcash_operate");
                } else if (map.containsKey("fb_netcash_operate")) {
                    netcash_operatenote = (Double) map.get("fb_netcash_operate");
                }

                if (map.containsKey("parent_netprofit")) {
                    Double parent_netprofit = (Double) map.get("parent_netprofit");
                    Double ratio = (netcash_operatenote / parent_netprofit) * 100;
                    ratioSum += ratio;

                }
                time++;
            } else {
                if (time == dateList.size()) {
                    double ratioAverage = ratioSum / time;
                    if (ratioAverage > num) {
                        codeList.add(code);
                    }
                }

                double netcash_operatenote = 0;
                if (map.containsKey("netcash_operate")) {
                    netcash_operatenote = (Double) map.get("netcash_operate");
                } else if (map.containsKey("netcash_operatenote")) {
                    netcash_operatenote = (Double) map.get("netcash_operatenote");
                } else if (map.containsKey("fbnetcash_operate")) {
                    netcash_operatenote = (Double) map.get("fbnetcash_operate");
                } else if (map.containsKey("fb_netcash_operate")) {
                    netcash_operatenote = (Double) map.get("fb_netcash_operate");
                }

                if (map.containsKey("parent_netprofit")) {
                    Double parent_netprofit = (Double) map.get("parent_netprofit");
                    Double ratio = (netcash_operatenote / parent_netprofit) * 100;
                    ratioSum = ratio;

                }
                code = security_code;
                time = 1;
            }
        }

        return codeList;
    }

    /**
     * 连续N年的资产负债率小于N%
     * <p>
     * 资产负债表(total_assets-资产总计 total_liabilities-负债合计)
     */
    private List<String> zcfzRatio(List<String> dateList, double num) {
        List<String> codeList = new ArrayList<>();
        int time = 1;
        for (String date : dateList) {
            if (time == 1) {
                String sql = "select security_code, total_assets, total_liabilities from inv_finance_zcfz where report_date='" + date + "' and report_type='nd'";
                List<Map<String, Object>> maps = invCommonMapper.commonSelect(sql);
                for (Map<String, Object> map : maps) {
                    if (map.containsKey("total_assets") && map.containsKey("total_liabilities")) {
                        double total_assets = (Double) map.get("total_assets");
                        double total_liabilities = (Double) map.get("total_liabilities");
                        double ratio = (total_liabilities / total_assets) * 100;
                        if (ratio < num) {
                            String code = (String) map.get("security_code");
                            codeList.add(code);
                        }
                    }
                }
            } else {
                if (codeList.size() > 0) {
                    String sql = "select security_code, total_assets, total_liabilities from inv_finance_zcfz where report_date='" + date + "' and report_type='nd' and security_code in (";
                    StringBuilder sb = new StringBuilder();
                    for (String code : codeList) {
                        sb.append("'").append(code).append("',");
                    }
                    String sbStr = sb.toString();
                    sbStr = sbStr.substring(0, sbStr.length() - 1) + ")";
                    sql = sql + sbStr;

                    codeList.clear();
                    List<Map<String, Object>> maps = invCommonMapper.commonSelect(sql);
                    for (Map<String, Object> map : maps) {
                        if (map.containsKey("total_assets") && map.containsKey("total_liabilities")) {
                            double total_assets = (Double) map.get("total_assets");
                            double total_liabilities = (Double) map.get("total_liabilities");
                            double ratio = (total_liabilities / total_assets) * 100;
                            if (ratio < num) {
                                String code = (String) map.get("security_code");
                                codeList.add(code);
                            }
                        }
                    }
                } else {
                    break;
                }
            }
            time++;
        }
        return codeList;
    }

    /**
     * 连续N年分红比例大于N%
     * <p>
     * 历年分红融资(dividend_ratio-分红比例)
     */
    private List<String> dividendRatio(List<String> dateList, double num) {
        List<String> codeList = new ArrayList<>();
        int time = 1;
        for (String date : dateList) {
            if (time == 1) {
                String sql = "select security_code from inv_fhrz_lnfhrz where statistics_year='" + date.substring(0, 4) + "' and dividend_ratio>" + num;
                List<Map<String, Object>> maps = invCommonMapper.commonSelect(sql);
                for (Map<String, Object> map : maps) {
                    String code = (String) map.get("security_code");
                    codeList.add(code);
                }
            } else {
                if (codeList.size() > 0) {
                    String sql = "select security_code from inv_fhrz_lnfhrz where statistics_year='" + date.substring(0, 4) + "' and dividend_ratio>" + num + " and security_code in (";
                    StringBuilder sb = new StringBuilder();
                    for (String code : codeList) {
                        sb.append("'").append(code).append("',");
                    }
                    String sbStr = sb.toString();
                    sbStr = sbStr.substring(0, sbStr.length() - 1) + ")";
                    sql = sql + sbStr;

                    codeList.clear();
                    List<Map<String, Object>> maps = invCommonMapper.commonSelect(sql);
                    for (Map<String, Object> map : maps) {
                        String code = (String) map.get("security_code");
                        codeList.add(code);
                    }
                } else {
                    break;
                }
            }
            time++;
        }
        return codeList;
    }
}
