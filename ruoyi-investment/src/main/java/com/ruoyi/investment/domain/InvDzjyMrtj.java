package com.ruoyi.investment.domain;

import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 大宗交易-每日统计对象 inv_dzjy_mrtj
 * 
 * @author yangwenyang
 * @date 2023-01-26
 */
public class InvDzjyMrtj extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /** id */
    private Integer id;

    /** 股票代码 */
    @Excel(name = "股票代码")
    private String securityCode;

    /** 交易日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "交易日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date tradeDate;

    /** 涨跌幅(%) */
    @Excel(name = "涨跌幅(%)")
    private Double changeRate;

    /** 收盘价(元) */
    @Excel(name = "收盘价(元)")
    private Double closePrice;

    /** 成交均价(元) */
    @Excel(name = "成交均价(元)")
    private Double averagePrice;

    /** 折溢率(%) */
    @Excel(name = "折溢率(%)")
    private Double premiumRatio;

    /** 成交笔数 */
    @Excel(name = "成交笔数")
    private Double dealNum;

    /** 成交总量(万股) */
    @Excel(name = "成交总量(万股)")
    private Double volume;

    /** 成交总额(万元) */
    @Excel(name = "成交总额(万元)")
    private Double dealAmt;

    /** 成交总额/流通市值 */
    @Excel(name = "成交总额/流通市值")
    private Double turnoverrate;

    /** 上榜后1日涨跌幅(%) */
    @Excel(name = "上榜后1日涨跌幅(%)")
    private Double d1CloseAdjchrate;

    /** 上榜后5日涨跌幅(%) */
    @Excel(name = "上榜后5日涨跌幅(%)")
    private Double d5CloseAdjchrate;

    /** 上榜后10日涨跌幅(%) */
    @Excel(name = "上榜后10日涨跌幅(%)")
    private Double d10CloseAdjchrate;

    /** 上榜后20日涨跌幅(%) */
    @Excel(name = "上榜后20日涨跌幅(%)")
    private Double d20CloseAdjchrate;

    public void setId(Integer id){this.id = id;}
    public Integer getId(){return id;}

    public void setSecurityCode(String securityCode){this.securityCode = securityCode;}
    public String getSecurityCode(){return securityCode;}

    public void setTradeDate(Date tradeDate){this.tradeDate = tradeDate;}
    public Date getTradeDate(){return tradeDate;}

    public void setChangeRate(Double changeRate){this.changeRate = changeRate;}
    public Double getChangeRate(){return changeRate;}

    public void setClosePrice(Double closePrice){this.closePrice = closePrice;}
    public Double getClosePrice(){return closePrice;}

    public void setAveragePrice(Double averagePrice){this.averagePrice = averagePrice;}
    public Double getAveragePrice(){return averagePrice;}

    public void setPremiumRatio(Double premiumRatio){this.premiumRatio = premiumRatio;}
    public Double getPremiumRatio(){return premiumRatio;}

    public void setDealNum(Double dealNum){this.dealNum = dealNum;}
    public Double getDealNum(){return dealNum;}

    public void setVolume(Double volume){this.volume = volume;}
    public Double getVolume(){return volume;}

    public void setDealAmt(Double dealAmt){this.dealAmt = dealAmt;}
    public Double getDealAmt(){return dealAmt;}

    public void setTurnoverrate(Double turnoverrate){this.turnoverrate = turnoverrate;}
    public Double getTurnoverrate(){return turnoverrate;}

    public void setD1CloseAdjchrate(Double d1CloseAdjchrate){this.d1CloseAdjchrate = d1CloseAdjchrate;}
    public Double getD1CloseAdjchrate(){return d1CloseAdjchrate;}

    public void setD5CloseAdjchrate(Double d5CloseAdjchrate){this.d5CloseAdjchrate = d5CloseAdjchrate;}
    public Double getD5CloseAdjchrate(){return d5CloseAdjchrate;}

    public void setD10CloseAdjchrate(Double d10CloseAdjchrate){this.d10CloseAdjchrate = d10CloseAdjchrate;}
    public Double getD10CloseAdjchrate(){return d10CloseAdjchrate;}

    public void setD20CloseAdjchrate(Double d20CloseAdjchrate){this.d20CloseAdjchrate = d20CloseAdjchrate;}
    public Double getD20CloseAdjchrate(){return d20CloseAdjchrate;}

    public InvDzjyMrtj() {
        super();
    }

    public InvDzjyMrtj(String securityCode) {
        this.securityCode = securityCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvDzjyMrtj)) return false;
        InvDzjyMrtj that = (InvDzjyMrtj) o;
        return Objects.equals(securityCode, that.securityCode) && Objects.equals(tradeDate, that.tradeDate) && Objects.equals(changeRate, that.changeRate) && Objects.equals(closePrice, that.closePrice) && Objects.equals(averagePrice, that.averagePrice) && Objects.equals(premiumRatio, that.premiumRatio) && Objects.equals(dealNum, that.dealNum) && Objects.equals(volume, that.volume) && Objects.equals(dealAmt, that.dealAmt) && Objects.equals(turnoverrate, that.turnoverrate) && Objects.equals(d1CloseAdjchrate, that.d1CloseAdjchrate) && Objects.equals(d5CloseAdjchrate, that.d5CloseAdjchrate) && Objects.equals(d10CloseAdjchrate, that.d10CloseAdjchrate) && Objects.equals(d20CloseAdjchrate, that.d20CloseAdjchrate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityCode, tradeDate, changeRate, closePrice, averagePrice, premiumRatio, dealNum, volume, dealAmt, turnoverrate, d1CloseAdjchrate, d5CloseAdjchrate, d10CloseAdjchrate, d20CloseAdjchrate);
    }
}
