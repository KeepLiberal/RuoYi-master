package com.ruoyi.investment.domain;

import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 财务分析-重要指标-季度对象 inv_finance_zyzb_quarter
 * 
 * @author wenyong.yang
 * @date 2022-09-24
 */
public class InvFinanceZyzbQuarter extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 股票代码 */
    @Excel(name = "股票代码")
    private String securityCode;

    /** 报告日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "报告日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date reportDate;

    /** 摊薄每股收益(元) */
    @Excel(name = "摊薄每股收益(元)")
    private Double epsjb;

    /** 每股净资产(元) */
    @Excel(name = "每股净资产(元)")
    private Double bps;

    /** 每股公积金(元) */
    @Excel(name = "每股公积金(元)")
    private Double perCapitalReserve;

    /** 每股未分配利润(元) */
    @Excel(name = "每股未分配利润(元)")
    private Double perUnassignProfit;

    /** 每股经营现金流(元) */
    @Excel(name = "每股经营现金流(元)")
    private Double perNetcash;

    /** 营业总收入(元) */
    @Excel(name = "营业总收入(元)")
    private Double totaloperatereve;

    /** 毛利润(元) */
    @Excel(name = "毛利润(元)")
    private Double grossProfit;

    /** 归属净利润(元) */
    @Excel(name = "归属净利润(元)")
    private Double parentnetprofit;

    /** 扣非净利润(元) */
    @Excel(name = "扣非净利润(元)")
    private Double deduParentProfit;

    /** 营业总收入同比增长(%) */
    @Excel(name = "营业总收入同比增长(%)")
    private Double totaloperaterevetz;

    /** 归属净利润同比增长(%) */
    @Excel(name = "归属净利润同比增长(%)")
    private Double parentnetprofittz;

    /** 扣非净利润同比增长(%) */
    @Excel(name = "扣非净利润同比增长(%)")
    private Double dpnpYoyRatio;

    /** 营业总收入滚动环比增长(%) */
    @Excel(name = "营业总收入滚动环比增长(%)")
    private Double yyzsrgdhbzc;

    /** 归属净利润滚动环比增长(%) */
    @Excel(name = "归属净利润滚动环比增长(%)")
    private Double netprofitrphbzc;

    /** 摊薄净资产收益率(%) */
    @Excel(name = "摊薄净资产收益率(%)")
    private Double kfjlrgdhbzc;

    /** 扣非净利润滚动环比增长(%) */
    @Excel(name = "扣非净利润滚动环比增长(%)")
    private Double roeDiluted;

    /** 摊薄总资产收益率(%) */
    @Excel(name = "摊薄总资产收益率(%)")
    private Double jroa;

    /** 净利率(%) */
    @Excel(name = "净利率(%)")
    private Double netProfitRatio;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setSecurityCode(String securityCode) 
    {
        this.securityCode = securityCode;
    }

    public String getSecurityCode() 
    {
        return securityCode;
    }
    public void setReportDate(Date reportDate) 
    {
        this.reportDate = reportDate;
    }

    public Date getReportDate() 
    {
        return reportDate;
    }
    public void setEpsjb(Double epsjb) 
    {
        this.epsjb = epsjb;
    }

    public Double getEpsjb() 
    {
        return epsjb;
    }
    public void setBps(Double bps) 
    {
        this.bps = bps;
    }

    public Double getBps() 
    {
        return bps;
    }
    public void setPerCapitalReserve(Double perCapitalReserve) 
    {
        this.perCapitalReserve = perCapitalReserve;
    }

    public Double getPerCapitalReserve() 
    {
        return perCapitalReserve;
    }
    public void setPerUnassignProfit(Double perUnassignProfit) 
    {
        this.perUnassignProfit = perUnassignProfit;
    }

    public Double getPerUnassignProfit() 
    {
        return perUnassignProfit;
    }
    public void setPerNetcash(Double perNetcash) 
    {
        this.perNetcash = perNetcash;
    }

    public Double getPerNetcash() 
    {
        return perNetcash;
    }
    public void setTotaloperatereve(Double totaloperatereve) 
    {
        this.totaloperatereve = totaloperatereve;
    }

    public Double getTotaloperatereve() 
    {
        return totaloperatereve;
    }
    public void setGrossProfit(Double grossProfit) 
    {
        this.grossProfit = grossProfit;
    }

    public Double getGrossProfit() 
    {
        return grossProfit;
    }
    public void setParentnetprofit(Double parentnetprofit) 
    {
        this.parentnetprofit = parentnetprofit;
    }

    public Double getParentnetprofit() 
    {
        return parentnetprofit;
    }
    public void setDeduParentProfit(Double deduParentProfit) 
    {
        this.deduParentProfit = deduParentProfit;
    }

    public Double getDeduParentProfit() 
    {
        return deduParentProfit;
    }
    public void setTotaloperaterevetz(Double totaloperaterevetz) 
    {
        this.totaloperaterevetz = totaloperaterevetz;
    }

    public Double getTotaloperaterevetz() 
    {
        return totaloperaterevetz;
    }
    public void setParentnetprofittz(Double parentnetprofittz) 
    {
        this.parentnetprofittz = parentnetprofittz;
    }

    public Double getParentnetprofittz() 
    {
        return parentnetprofittz;
    }
    public void setDpnpYoyRatio(Double dpnpYoyRatio) 
    {
        this.dpnpYoyRatio = dpnpYoyRatio;
    }

    public Double getDpnpYoyRatio() 
    {
        return dpnpYoyRatio;
    }
    public void setYyzsrgdhbzc(Double yyzsrgdhbzc) 
    {
        this.yyzsrgdhbzc = yyzsrgdhbzc;
    }

    public Double getYyzsrgdhbzc() 
    {
        return yyzsrgdhbzc;
    }
    public void setNetprofitrphbzc(Double netprofitrphbzc) 
    {
        this.netprofitrphbzc = netprofitrphbzc;
    }

    public Double getNetprofitrphbzc() 
    {
        return netprofitrphbzc;
    }
    public void setKfjlrgdhbzc(Double kfjlrgdhbzc) 
    {
        this.kfjlrgdhbzc = kfjlrgdhbzc;
    }

    public Double getKfjlrgdhbzc() 
    {
        return kfjlrgdhbzc;
    }
    public void setRoeDiluted(Double roeDiluted) 
    {
        this.roeDiluted = roeDiluted;
    }

    public Double getRoeDiluted() 
    {
        return roeDiluted;
    }
    public void setJroa(Double jroa) 
    {
        this.jroa = jroa;
    }

    public Double getJroa() 
    {
        return jroa;
    }
    public void setNetProfitRatio(Double netProfitRatio) 
    {
        this.netProfitRatio = netProfitRatio;
    }

    public Double getNetProfitRatio() 
    {
        return netProfitRatio;
    }

    public InvFinanceZyzbQuarter() {
        super();
    }

    public InvFinanceZyzbQuarter(String securityCode) {
        this.securityCode = securityCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvFinanceZyzbQuarter)) return false;
        InvFinanceZyzbQuarter that = (InvFinanceZyzbQuarter) o;
        return Objects.equals(id, that.id) && Objects.equals(securityCode, that.securityCode) && Objects.equals(reportDate, that.reportDate) && Objects.equals(epsjb, that.epsjb) && Objects.equals(bps, that.bps) && Objects.equals(perCapitalReserve, that.perCapitalReserve) && Objects.equals(perUnassignProfit, that.perUnassignProfit) && Objects.equals(perNetcash, that.perNetcash) && Objects.equals(totaloperatereve, that.totaloperatereve) && Objects.equals(grossProfit, that.grossProfit) && Objects.equals(parentnetprofit, that.parentnetprofit) && Objects.equals(deduParentProfit, that.deduParentProfit) && Objects.equals(totaloperaterevetz, that.totaloperaterevetz) && Objects.equals(parentnetprofittz, that.parentnetprofittz) && Objects.equals(dpnpYoyRatio, that.dpnpYoyRatio) && Objects.equals(yyzsrgdhbzc, that.yyzsrgdhbzc) && Objects.equals(netprofitrphbzc, that.netprofitrphbzc) && Objects.equals(kfjlrgdhbzc, that.kfjlrgdhbzc) && Objects.equals(roeDiluted, that.roeDiluted) && Objects.equals(jroa, that.jroa) && Objects.equals(netProfitRatio, that.netProfitRatio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, securityCode, reportDate, epsjb, bps, perCapitalReserve, perUnassignProfit, perNetcash, totaloperatereve, grossProfit, parentnetprofit, deduParentProfit, totaloperaterevetz, parentnetprofittz, dpnpYoyRatio, yyzsrgdhbzc, netprofitrphbzc, kfjlrgdhbzc, roeDiluted, jroa, netProfitRatio);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("securityCode", getSecurityCode())
            .append("reportDate", getReportDate())
            .append("epsjb", getEpsjb())
            .append("bps", getBps())
            .append("perCapitalReserve", getPerCapitalReserve())
            .append("perUnassignProfit", getPerUnassignProfit())
            .append("perNetcash", getPerNetcash())
            .append("totaloperatereve", getTotaloperatereve())
            .append("grossProfit", getGrossProfit())
            .append("parentnetprofit", getParentnetprofit())
            .append("deduParentProfit", getDeduParentProfit())
            .append("totaloperaterevetz", getTotaloperaterevetz())
            .append("parentnetprofittz", getParentnetprofittz())
            .append("dpnpYoyRatio", getDpnpYoyRatio())
            .append("yyzsrgdhbzc", getYyzsrgdhbzc())
            .append("netprofitrphbzc", getNetprofitrphbzc())
            .append("kfjlrgdhbzc", getKfjlrgdhbzc())
            .append("roeDiluted", getRoeDiluted())
            .append("jroa", getJroa())
            .append("netProfitRatio", getNetProfitRatio())
            .toString();
    }
}
