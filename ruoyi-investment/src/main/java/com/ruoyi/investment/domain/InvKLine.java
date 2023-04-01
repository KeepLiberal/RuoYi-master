package com.ruoyi.investment.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 个股K线数据对象 inv_k_line
 * 
 * @author yangwenyang
 * @date 2023-04-01
 */
public class InvKLine extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Integer id;

    /** 股票代码 */
    @Excel(name = "股票代码")
    private String securityCode;

    /** 日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date reportDate;

    /** 开盘 */
    @Excel(name = "开盘")
    private Double open;

    /** 收盘 */
    @Excel(name = "收盘")
    private Double close;

    /** 最高 */
    @Excel(name = "最高")
    private Double high;

    /** 最低 */
    @Excel(name = "最低")
    private Double lower;

    /** 涨跌幅 */
    @Excel(name = "涨跌幅")
    private Double upDownRange;

    /** 涨跌额 */
    @Excel(name = "涨跌额")
    private Double upDownQuota;

    /** 成交量 */
    @Excel(name = "成交量")
    private Double turnoverSize;

    /** 成交额 */
    @Excel(name = "成交额")
    private Double turnoverQuota;

    /** 振幅 */
    @Excel(name = "振幅")
    private Double vibrateRange;

    /** 换手率 */
    @Excel(name = "换手率")
    private Double changeHandRange;

    public InvKLine() {
        super();
    }

    public InvKLine(String securityCode) {
        this.securityCode = securityCode;
    }

    public void setId(Integer id){this.id = id;}
    public Integer getId(){return id;}

    public void setSecurityCode(String securityCode){this.securityCode = securityCode;}
    public String getSecurityCode(){return securityCode;}

    public void setReportDate(Date reportDate){this.reportDate = reportDate;}
    public Date getReportDate(){return reportDate;}

    public void setOpen(Double open){this.open = open;}
    public Double getOpen(){return open;}

    public void setClose(Double close){this.close = close;}
    public Double getClose(){return close;}

    public void setHigh(Double high){this.high = high;}
    public Double getHigh(){return high;}

    public void setLower(Double lower){this.lower = lower;}
    public Double getLower(){return lower;}

    public void setUpDownRange(Double upDownRange){this.upDownRange = upDownRange;}
    public Double getUpDownRange(){return upDownRange;}

    public void setUpDownQuota(Double upDownQuota){this.upDownQuota = upDownQuota;}
    public Double getUpDownQuota(){return upDownQuota;}

    public void setTurnoverSize(Double turnoverSize){this.turnoverSize = turnoverSize;}
    public Double getTurnoverSize(){return turnoverSize;}

    public void setTurnoverQuota(Double turnoverQuota){this.turnoverQuota = turnoverQuota;}
    public Double getTurnoverQuota(){return turnoverQuota;}

    public void setVibrateRange(Double vibrateRange){this.vibrateRange = vibrateRange;}
    public Double getVibrateRange(){return vibrateRange;}

    public void setChangeHandRange(Double changeHandRange){this.changeHandRange = changeHandRange;}
    public Double getChangeHandRange(){return changeHandRange;}


    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("securityCode", getSecurityCode())
            .append("reportDate", getReportDate())
            .append("open", getOpen())
            .append("close", getClose())
            .append("high", getHigh())
            .append("lower", getLower())
            .append("upDownRange", getUpDownRange())
            .append("upDownQuota", getUpDownQuota())
            .append("turnoverSize", getTurnoverSize())
            .append("turnoverQuota", getTurnoverQuota())
            .append("vibrateRange", getVibrateRange())
            .append("changeHandRange", getChangeHandRange())
            .toString();
    }
}
