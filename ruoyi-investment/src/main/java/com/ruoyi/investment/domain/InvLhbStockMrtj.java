package com.ruoyi.investment.domain;

import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 个股龙虎榜统计对象 inv_lhb_stock_mrtj
 * 
 * @author yangwenyang
 * @date 2023-01-28
 */
public class InvLhbStockMrtj extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /** id */
    private Integer id;

    /** 股票代码 */
    @Excel(name = "股票代码")
    private String securityCode;

    /** 上榜日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "上榜日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date tradeDate;

    /** 营业部买入合计 */
    @Excel(name = "营业部买入合计")
    private Double yybBuyAmt;

    /** 营业部卖出合计 */
    @Excel(name = "营业部卖出合计")
    private Double yybSellAmt;

    /** 营业部买卖净额 */
    @Excel(name = "营业部买卖净额")
    private Double yybNet;

    /** 买入机构数 */
    @Excel(name = "买入机构数")
    private Double jgBuyCount;

    /** 卖出机构数 */
    @Excel(name = "卖出机构数")
    private Double jgSellCount;

    /** 机构买入总额 */
    @Excel(name = "机构买入总额")
    private Double jgBuyAmt;

    /** 机构卖出总额 */
    @Excel(name = "机构卖出总额")
    private Double jgSellAmt;

    /** 机构买卖净额 */
    @Excel(name = "机构买卖净额")
    private Double jgNet;

    /** 后1日涨跌幅 */
    @Excel(name = "后1日涨跌幅")
    private Double d1CloseAdjchrate;

    /** 后2日涨跌幅 */
    @Excel(name = "后2日涨跌幅")
    private Double d2CloseAdjchrate;

    /** 后3日涨跌幅 */
    @Excel(name = "后3日涨跌幅")
    private Double d3CloseAdjchrate;

    /** 后5日涨跌幅 */
    @Excel(name = "后5日涨跌幅")
    private Double d5CloseAdjchrate;

    /** 后10日涨跌幅 */
    @Excel(name = "后10日涨跌幅")
    private Double d10CloseAdjchrate;

    /** 后20日涨跌幅 */
    @Excel(name = "后20日涨跌幅")
    private Double d20CloseAdjchrate;

    /** 后30日涨跌幅 */
    @Excel(name = "后30日涨跌幅")
    private Double d30CloseAdjchrate;

    public void setId(Integer id){this.id = id;}
    public Integer getId(){return id;}

    public void setSecurityCode(String securityCode){this.securityCode = securityCode;}
    public String getSecurityCode(){return securityCode;}

    public void setTradeDate(Date tradeDate){this.tradeDate = tradeDate;}
    public Date getTradeDate(){return tradeDate;}

    public void setYybBuyAmt(Double yybBuyAmt){this.yybBuyAmt = yybBuyAmt;}
    public Double getYybBuyAmt(){return yybBuyAmt;}

    public void setYybSellAmt(Double yybSellAmt){this.yybSellAmt = yybSellAmt;}
    public Double getYybSellAmt(){return yybSellAmt;}

    public void setYybNet(Double yybNet){this.yybNet = yybNet;}
    public Double getYybNet(){return yybNet;}

    public void setJgBuyCount(Double jgBuyCount){this.jgBuyCount = jgBuyCount;}
    public Double getJgBuyCount(){return jgBuyCount;}

    public void setJgSellCount(Double jgSellCount){this.jgSellCount = jgSellCount;}
    public Double getJgSellCount(){return jgSellCount;}

    public void setJgBuyAmt(Double jgBuyAmt){this.jgBuyAmt = jgBuyAmt;}
    public Double getJgBuyAmt(){return jgBuyAmt;}

    public void setJgSellAmt(Double jgSellAmt){this.jgSellAmt = jgSellAmt;}
    public Double getJgSellAmt(){return jgSellAmt;}

    public void setJgNet(Double jgNet){this.jgNet = jgNet;}
    public Double getJgNet(){return jgNet;}

    public void setD1CloseAdjchrate(Double d1CloseAdjchrate){this.d1CloseAdjchrate = d1CloseAdjchrate;}
    public Double getD1CloseAdjchrate(){return d1CloseAdjchrate;}

    public void setD2CloseAdjchrate(Double d2CloseAdjchrate){this.d2CloseAdjchrate = d2CloseAdjchrate;}
    public Double getD2CloseAdjchrate(){return d2CloseAdjchrate;}

    public void setD3CloseAdjchrate(Double d3CloseAdjchrate){this.d3CloseAdjchrate = d3CloseAdjchrate;}
    public Double getD3CloseAdjchrate(){return d3CloseAdjchrate;}

    public void setD5CloseAdjchrate(Double d5CloseAdjchrate){this.d5CloseAdjchrate = d5CloseAdjchrate;}
    public Double getD5CloseAdjchrate(){return d5CloseAdjchrate;}

    public void setD10CloseAdjchrate(Double d10CloseAdjchrate){this.d10CloseAdjchrate = d10CloseAdjchrate;}
    public Double getD10CloseAdjchrate(){return d10CloseAdjchrate;}

    public void setD20CloseAdjchrate(Double d20CloseAdjchrate){this.d20CloseAdjchrate = d20CloseAdjchrate;}
    public Double getD20CloseAdjchrate(){return d20CloseAdjchrate;}

    public void setD30CloseAdjchrate(Double d30CloseAdjchrate){this.d30CloseAdjchrate = d30CloseAdjchrate;}
    public Double getD30CloseAdjchrate(){return d30CloseAdjchrate;}

    public InvLhbStockMrtj() {
        super();
    }

    public InvLhbStockMrtj(String securityCode) {
        this.securityCode = securityCode;
    }

    public InvLhbStockMrtj(String securityCode, Date tradeDate) {
        this.securityCode = securityCode;
        this.tradeDate = tradeDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvLhbStockMrtj)) return false;
        InvLhbStockMrtj that = (InvLhbStockMrtj) o;
        return Objects.equals(securityCode, that.securityCode) && Objects.equals(tradeDate, that.tradeDate) && Objects.equals(yybBuyAmt, that.yybBuyAmt) && Objects.equals(yybSellAmt, that.yybSellAmt) && Objects.equals(yybNet, that.yybNet) && Objects.equals(jgBuyCount, that.jgBuyCount) && Objects.equals(jgSellCount, that.jgSellCount) && Objects.equals(jgBuyAmt, that.jgBuyAmt) && Objects.equals(jgSellAmt, that.jgSellAmt) && Objects.equals(jgNet, that.jgNet) && Objects.equals(d1CloseAdjchrate, that.d1CloseAdjchrate) && Objects.equals(d2CloseAdjchrate, that.d2CloseAdjchrate) && Objects.equals(d3CloseAdjchrate, that.d3CloseAdjchrate) && Objects.equals(d5CloseAdjchrate, that.d5CloseAdjchrate) && Objects.equals(d10CloseAdjchrate, that.d10CloseAdjchrate) && Objects.equals(d20CloseAdjchrate, that.d20CloseAdjchrate) && Objects.equals(d30CloseAdjchrate, that.d30CloseAdjchrate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityCode, tradeDate, yybBuyAmt, yybSellAmt, yybNet, jgBuyCount, jgSellCount, jgBuyAmt, jgSellAmt, jgNet, d1CloseAdjchrate, d2CloseAdjchrate, d3CloseAdjchrate, d5CloseAdjchrate, d10CloseAdjchrate, d20CloseAdjchrate, d30CloseAdjchrate);
    }
}
