package com.ruoyi.investment.domain;

import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 大宗交易-每日明细对象 inv_dzjy_mrmx
 * 
 * @author yangwenyang
 * @date 2023-01-24
 */
public class InvDzjyMrmx extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Integer id;

    /** 股票代码 */
    @Excel(name = "股票代码")
    private String securityCode;

    /** 序号 */
    @Excel(name = "序号")
    private Integer num;

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

    /** 成交价(元) */
    @Excel(name = "成交价(元)")
    private Double dealPrice;

    /** 折溢率(%) */
    @Excel(name = "折溢率(%)")
    private Double premiumRatio;

    /** 成交量(万股) */
    @Excel(name = "成交量(万股)")
    private Double dealVolume;

    /** 成交额(万元) */
    @Excel(name = "成交额(万元)")
    private Double dealAmt;

    /** 成交额/流通市值 */
    @Excel(name = "成交额/流通市值")
    private Double turnoverRate;

    /** 买方营业部代码 */
    @Excel(name = "买方营业部代码")
    private String buyerCode;

    /** 买方营业部 */
    @Excel(name = "买方营业部")
    private String buyerName;

    /** 卖方营业部代码 */
    @Excel(name = "卖方营业部代码")
    private String sellerCode;

    /** 卖方营业部 */
    @Excel(name = "卖方营业部")
    private String sellerName;

    /** 上榜后1日涨跌幅(%) */
    @Excel(name = "上榜后1日涨跌幅(%)")
    private Double changeRate1days;

    /** 上榜后5日涨跌幅(%) */
    @Excel(name = "上榜后5日涨跌幅(%)")
    private Double changeRate5days;

    /** 上榜后10日涨跌幅(%) */
    @Excel(name = "上榜后10日涨跌幅(%)")
    private Double changeRate10days;

    /** 上榜后20日涨跌幅(%) */
    @Excel(name = "上榜后20日涨跌幅(%)")
    private Double changeRate20days;

    public void setId(Integer id){this.id = id;}
    public Integer getId(){return id;}

    public void setSecurityCode(String securityCode){this.securityCode = securityCode;}
    public String getSecurityCode(){return securityCode;}

    public void setNum(Integer num){this.num = num;}
    public Integer getNum(){return num;}

    public void setTradeDate(Date tradeDate){this.tradeDate = tradeDate;}
    public Date getTradeDate(){return tradeDate;}

    public void setChangeRate(Double changeRate){this.changeRate = changeRate;}
    public Double getChangeRate(){return changeRate;}

    public void setClosePrice(Double closePrice){this.closePrice = closePrice;}
    public Double getClosePrice(){return closePrice;}

    public void setDealPrice(Double dealPrice){this.dealPrice = dealPrice;}
    public Double getDealPrice(){return dealPrice;}

    public void setPremiumRatio(Double premiumRatio){this.premiumRatio = premiumRatio;}
    public Double getPremiumRatio(){return premiumRatio;}

    public void setDealVolume(Double dealVolume){this.dealVolume = dealVolume;}
    public Double getDealVolume(){return dealVolume;}

    public void setDealAmt(Double dealAmt){this.dealAmt = dealAmt;}
    public Double getDealAmt(){return dealAmt;}

    public void setTurnoverRate(Double turnoverRate){this.turnoverRate = turnoverRate;}
    public Double getTurnoverRate(){return turnoverRate;}

    public void setBuyerCode(String buyerCode){this.buyerCode = buyerCode;}
    public String getBuyerCode(){return buyerCode;}

    public void setBuyerName(String buyerName){this.buyerName = buyerName;}
    public String getBuyerName(){return buyerName;}

    public void setSellerCode(String sellerCode){this.sellerCode = sellerCode;}
    public String getSellerCode(){return sellerCode;}

    public void setSellerName(String sellerName){this.sellerName = sellerName;}
    public String getSellerName(){return sellerName;}

    public void setChangeRate1days(Double changeRate1days){this.changeRate1days = changeRate1days;}
    public Double getChangeRate1days(){return changeRate1days;}

    public void setChangeRate5days(Double changeRate5days){this.changeRate5days = changeRate5days;}
    public Double getChangeRate5days(){return changeRate5days;}

    public void setChangeRate10days(Double changeRate10days){this.changeRate10days = changeRate10days;}
    public Double getChangeRate10days(){return changeRate10days;}

    public void setChangeRate20days(Double changeRate20days){this.changeRate20days = changeRate20days;}
    public Double getChangeRate20days(){return changeRate20days;}

    public InvDzjyMrmx() {
        super();
    }

    public InvDzjyMrmx(String securityCode) {
        this.securityCode = securityCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvDzjyMrmx)) return false;
        InvDzjyMrmx that = (InvDzjyMrmx) o;
        return Objects.equals(securityCode, that.securityCode) && Objects.equals(num, that.num) && Objects.equals(tradeDate, that.tradeDate) && Objects.equals(changeRate, that.changeRate) && Objects.equals(closePrice, that.closePrice) && Objects.equals(dealPrice, that.dealPrice) && Objects.equals(premiumRatio, that.premiumRatio) && Objects.equals(dealVolume, that.dealVolume) && Objects.equals(dealAmt, that.dealAmt) && Objects.equals(turnoverRate, that.turnoverRate) && Objects.equals(buyerCode, that.buyerCode) && Objects.equals(buyerName, that.buyerName) && Objects.equals(sellerCode, that.sellerCode) && Objects.equals(sellerName, that.sellerName) && Objects.equals(changeRate1days, that.changeRate1days) && Objects.equals(changeRate5days, that.changeRate5days) && Objects.equals(changeRate10days, that.changeRate10days) && Objects.equals(changeRate20days, that.changeRate20days);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityCode, num, tradeDate, changeRate, closePrice, dealPrice, premiumRatio, dealVolume, dealAmt, turnoverRate, buyerCode, buyerName, sellerCode, sellerName, changeRate1days, changeRate5days, changeRate10days, changeRate20days);
    }
}
