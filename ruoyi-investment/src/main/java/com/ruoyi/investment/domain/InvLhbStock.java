package com.ruoyi.investment.domain;

import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 个股龙虎榜对象 inv_lhb_stock
 * 
 * @author yangwenyang
 * @date 2023-01-27
 */
public class InvLhbStock extends BaseEntity{
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

    /** 数据类型 */
    @Excel(name = "数据类型")
    private String lhbDataType;

    /** 上榜说明 */
    @Excel(name = "上榜说明")
    private String explanation;

    /** 交易营业部代码 */
    @Excel(name = "交易营业部代码")
    private String operatedeptCode;

    /** 交易营业部名称 */
    @Excel(name = "交易营业部名称")
    private String operatedeptName;

    /** 买入金额(元) */
    @Excel(name = "买入金额(元)")
    private Double buy;

    /** 占总成交比例 */
    @Excel(name = "占总成交比例")
    private Double totalBuyrio;

    /** 卖出金额(元) */
    @Excel(name = "卖出金额(元)")
    private Double sell;

    /** 占总成交比例 */
    @Excel(name = "占总成交比例")
    private Double totalSellrio;

    /** 净额(元) */
    @Excel(name = "净额(元)")
    private Double net;

    /** (前5名)买入金额合计(元) */
    @Excel(name = "(前5名)买入金额合计(元)")
    private Double totalBuy;

    /** (前5名)卖出金额合计(元) */
    @Excel(name = "(前5名)卖出金额合计(元)")
    private Double totalSell;

    /** (前5名)占总成交比例 */
    @Excel(name = "(前5名)占总成交比例")
    private Double totalBuyriotop;

    /** (前5名)净额合计(元) */
    @Excel(name = "(前5名)净额合计(元)")
    private Double totalNet;

    public void setId(Integer id){this.id = id;}
    public Integer getId(){return id;}

    public void setSecurityCode(String securityCode){this.securityCode = securityCode;}
    public String getSecurityCode(){return securityCode;}

    public void setTradeDate(Date tradeDate){this.tradeDate = tradeDate;}
    public Date getTradeDate(){return tradeDate;}

    public void setLhbDataType(String lhbDataType){this.lhbDataType = lhbDataType;}
    public String getLhbDataType(){return lhbDataType;}

    public void setExplanation(String explanation){this.explanation = explanation;}
    public String getExplanation(){return explanation;}

    public void setOperatedeptCode(String operatedeptCode){this.operatedeptCode = operatedeptCode;}
    public String getOperatedeptCode(){return operatedeptCode;}

    public void setOperatedeptName(String operatedeptName){this.operatedeptName = operatedeptName;}
    public String getOperatedeptName(){return operatedeptName;}

    public void setBuy(Double buy){this.buy = buy;}
    public Double getBuy(){return buy;}

    public void setTotalBuyrio(Double totalBuyrio){this.totalBuyrio = totalBuyrio;}
    public Double getTotalBuyrio(){return totalBuyrio;}

    public void setSell(Double sell){this.sell = sell;}
    public Double getSell(){return sell;}

    public void setTotalSellrio(Double totalSellrio){this.totalSellrio = totalSellrio;}
    public Double getTotalSellrio(){return totalSellrio;}

    public void setNet(Double net){this.net = net;}
    public Double getNet(){return net;}

    public void setTotalBuy(Double totalBuy){this.totalBuy = totalBuy;}
    public Double getTotalBuy(){return totalBuy;}

    public void setTotalSell(Double totalSell){this.totalSell = totalSell;}
    public Double getTotalSell(){return totalSell;}

    public void setTotalBuyriotop(Double totalBuyriotop){this.totalBuyriotop = totalBuyriotop;}
    public Double getTotalBuyriotop(){return totalBuyriotop;}

    public void setTotalNet(Double totalNet){this.totalNet = totalNet;}
    public Double getTotalNet(){return totalNet;}


    public InvLhbStock() {
        super();
    }

    public InvLhbStock(String securityCode) {
        this.securityCode = securityCode;
    }

    public InvLhbStock(String securityCode, Date tradeDate, String lhbDataType) {
        this.securityCode = securityCode;
        this.tradeDate = tradeDate;
        this.lhbDataType = lhbDataType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvLhbStock)) return false;
        InvLhbStock that = (InvLhbStock) o;
        return Objects.equals(securityCode, that.securityCode) && Objects.equals(tradeDate, that.tradeDate) && Objects.equals(lhbDataType, that.lhbDataType) && Objects.equals(explanation, that.explanation) && Objects.equals(operatedeptCode, that.operatedeptCode) && Objects.equals(operatedeptName, that.operatedeptName) && Objects.equals(buy, that.buy) && Objects.equals(totalBuyrio, that.totalBuyrio) && Objects.equals(sell, that.sell) && Objects.equals(totalSellrio, that.totalSellrio) && Objects.equals(net, that.net) && Objects.equals(totalBuy, that.totalBuy) && Objects.equals(totalSell, that.totalSell) && Objects.equals(totalBuyriotop, that.totalBuyriotop) && Objects.equals(totalNet, that.totalNet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityCode, tradeDate, lhbDataType, explanation, operatedeptCode, operatedeptName, buy, totalBuyrio, sell, totalSellrio, net, totalBuy, totalSell, totalBuyriotop, totalNet);
    }
}
