package com.ruoyi.investment.domain;

import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 财务分析-资产负债-证劵类-报告期对象 inv_finance_zcfz_securities_period
 * 
 * @author yangwenyang
 * @date 2022-09-30
 */
public class InvFinanceZcfzSecuritiesPeriod extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 股票代码 */
    @Excel(name = "股票代码")
    private String securityCode;

    /** 报告日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "报告日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date reportDate;

    /** 货币资金 */
    @Excel(name = "货币资金")
    private Double monetaryfunds;

    /** 货币资金(环比%) */
    @Excel(name = "货币资金(环比%)")
    private Double monetaryfundsYoy;

    /** 客户资金存款 */
    @Excel(name = "客户资金存款")
    private Double customerDeposit;

    /** 客户资金存款(环比%) */
    @Excel(name = "客户资金存款(环比%)")
    private Double customerDepositYoy;

    /** 结算备付金 */
    @Excel(name = "结算备付金")
    private Double settleExcessReserve;

    /** 结算备付金(环比%) */
    @Excel(name = "结算备付金(环比%)")
    private Double settleExcessReserveYoy;

    /** 客户备付金 */
    @Excel(name = "客户备付金")
    private Double customerExcessReserve;

    /** 客户备付金(环比%) */
    @Excel(name = "客户备付金(环比%)")
    private Double customerExcessReserveYoy;

    /** 融出资金 */
    @Excel(name = "融出资金")
    private Double finFund;

    /** 融出资金(环比%) */
    @Excel(name = "融出资金(环比%)")
    private Double finFundYoy;

    /** 衍生金融资产 */
    @Excel(name = "衍生金融资产")
    private Double deriveFinasset;

    /** 衍生金融资产(环比%) */
    @Excel(name = "衍生金融资产(环比%)")
    private Double deriveFinassetYoy;

    /** 买入返售金融资产 */
    @Excel(name = "买入返售金融资产")
    private Double buyResaleFinasset;

    /** 买入返售金融资产(环比%) */
    @Excel(name = "买入返售金融资产(环比%)")
    private Double buyResaleFinassetYoy;

    /** 应收款项 */
    @Excel(name = "应收款项")
    private Double receivables;

    /** 应收款项(环比%) */
    @Excel(name = "应收款项(环比%)")
    private Double receivablesYoy;

    /** 存出保证金 */
    @Excel(name = "存出保证金")
    private Double refundDepositPay;

    /** 存出保证金(环比%) */
    @Excel(name = "存出保证金(环比%)")
    private Double refundDepositPayYoy;

    /** 交易性金融资产 */
    @Excel(name = "交易性金融资产")
    private Double tradeFinassetNotfvtpl;

    /** 交易性金融资产(环比%) */
    @Excel(name = "交易性金融资产(环比%)")
    private Double tradeFinassetNotfvtplYoy;

    /** 债权投资 */
    @Excel(name = "债权投资")
    private Double creditorInvest;

    /** 债权投资(环比%) */
    @Excel(name = "债权投资(环比%)")
    private Double creditorInvestYoy;

    /** 其他权益工具投资 */
    @Excel(name = "其他权益工具投资")
    private Double otherEquityInvest;

    /** 其他权益工具投资(环比%) */
    @Excel(name = "其他权益工具投资(环比%)")
    private Double otherEquityInvestYoy;

    /** 长期股权投资 */
    @Excel(name = "长期股权投资")
    private Double longEquityInvest;

    /** 长期股权投资(环比%) */
    @Excel(name = "长期股权投资(环比%)")
    private Double longEquityInvestYoy;

    /** 投资性房地产 */
    @Excel(name = "投资性房地产")
    private Double investRealestate;

    /** 投资性房地产(环比%) */
    @Excel(name = "投资性房地产(环比%)")
    private Double investRealestateYoy;

    /** 固定资产 */
    @Excel(name = "固定资产")
    private Double fixedAsset;

    /** 固定资产(环比%) */
    @Excel(name = "固定资产(环比%)")
    private Double fixedAssetYoy;

    /** 使用权资产 */
    @Excel(name = "使用权资产")
    private Double userightAsset;

    /** 使用权资产(环比%) */
    @Excel(name = "使用权资产(环比%)")
    private Double userightAssetYoy;

    /** 无形资产 */
    @Excel(name = "无形资产")
    private Double intangibleAsset;

    /** 无形资产(环比%) */
    @Excel(name = "无形资产(环比%)")
    private Double intangibleAssetYoy;

    /** 商誉 */
    @Excel(name = "商誉")
    private Double goodwill;

    /** 商誉(环比%) */
    @Excel(name = "商誉(环比%)")
    private Double goodwillYoy;

    /** 递延所得税资产 */
    @Excel(name = "递延所得税资产")
    private Double deferTaxAsset;

    /** 递延所得税资产(环比%) */
    @Excel(name = "递延所得税资产(环比%)")
    private Double deferTaxAssetYoy;

    /** 其他资产 */
    @Excel(name = "其他资产")
    private Double otherAsset;

    /** 其他资产(环比%) */
    @Excel(name = "其他资产(环比%)")
    private Double otherAssetYoy;

    /** 资产总计 */
    @Excel(name = "资产总计")
    private Double totalAssets;

    /** 资产总计(环比%) */
    @Excel(name = "资产总计(环比%)")
    private Double totalAssetsYoy;

    /** 应付短期融资款 */
    @Excel(name = "应付短期融资款")
    private Double shortFinPayable;

    /** 应付短期融资款(环比%) */
    @Excel(name = "应付短期融资款(环比%)")
    private Double shortFinPayableYoy;

    /** 拆入资金 */
    @Excel(name = "拆入资金")
    private Double borrowFund;

    /** 拆入资金(环比%) */
    @Excel(name = "拆入资金(环比%)")
    private Double borrowFundYoy;

    /** 交易性金融负债 */
    @Excel(name = "交易性金融负债")
    private Double tradeFinliabNotfvtpl;

    /** 交易性金融负债(环比%) */
    @Excel(name = "交易性金融负债(环比%)")
    private Double tradeFinliabNotfvtplYoy;

    /** 衍生金融负债 */
    @Excel(name = "衍生金融负债")
    private Double deriveFinliab;

    /** 衍生金融负债(环比%) */
    @Excel(name = "衍生金融负债(环比%)")
    private Double deriveFinliabYoy;

    /** 卖出回购金融资产款 */
    @Excel(name = "卖出回购金融资产款")
    private Double sellRepoFinasset;

    /** 卖出回购金融资产款(环比%) */
    @Excel(name = "卖出回购金融资产款(环比%)")
    private Double sellRepoFinassetYoy;

    /** 代理买卖证券款 */
    @Excel(name = "代理买卖证券款")
    private Double agentTradeSecurity;

    /** 代理买卖证券款(环比%) */
    @Excel(name = "代理买卖证券款(环比%)")
    private Double agentTradeSecurityYoy;

    /** 代理承销证券款 */
    @Excel(name = "代理承销证券款")
    private Double agentUnderwriteSecurity;

    /** 代理承销证券款(环比%) */
    @Excel(name = "代理承销证券款(环比%)")
    private Double agentUnderwriteSecurityYoy;

    /** 应付账款 */
    @Excel(name = "应付账款")
    private Double accountsPayable;

    /** 应付账款(环比%) */
    @Excel(name = "应付账款(环比%)")
    private Double accountsPayableYoy;

    /** 应付职工薪酬 */
    @Excel(name = "应付职工薪酬")
    private Double staffSalaryPayable;

    /** 应付职工薪酬(环比%) */
    @Excel(name = "应付职工薪酬(环比%)")
    private Double staffSalaryPayableYoy;

    /** 应交税费 */
    @Excel(name = "应交税费")
    private Double taxPayable;

    /** 应交税费(环比%) */
    @Excel(name = "应交税费(环比%)")
    private Double taxPayableYoy;

    /** 预计负债 */
    @Excel(name = "预计负债")
    private Double predictLiab;

    /** 预计负债(环比%) */
    @Excel(name = "预计负债(环比%)")
    private Double predictLiabYoy;

    /** 应付债券 */
    @Excel(name = "应付债券")
    private Double bondPayable;

    /** 应付债券(环比%) */
    @Excel(name = "应付债券(环比%)")
    private Double bondPayableYoy;

    /** 租赁负债 */
    @Excel(name = "租赁负债")
    private Double leaseLiab;

    /** 租赁负债(环比%) */
    @Excel(name = "租赁负债(环比%)")
    private Double leaseLiabYoy;

    /** 递延所得税负债 */
    @Excel(name = "递延所得税负债")
    private Double deferTaxLiab;

    /** 递延所得税负债(环比%) */
    @Excel(name = "递延所得税负债(环比%)")
    private Double deferTaxLiabYoy;

    /** 其他负债 */
    @Excel(name = "其他负债")
    private Double otherLiab;

    /** 其他负债(环比%) */
    @Excel(name = "其他负债(环比%)")
    private Double otherLiabYoy;

    /** 负债其他项目 */
    @Excel(name = "负债其他项目")
    private Double liabOther;

    /** 负债其他项目(环比%) */
    @Excel(name = "负债其他项目(环比%)")
    private Double liabOtherYoy;

    /** 负债合计 */
    @Excel(name = "负债合计")
    private Double totalLiabilities;

    /** 负债合计(环比%) */
    @Excel(name = "负债合计(环比%)")
    private Double totalLiabilitiesYoy;

    /** 股本 */
    @Excel(name = "股本")
    private Double shareCapital;

    /** 股本(环比%) */
    @Excel(name = "股本(环比%)")
    private Double shareCapitalYoy;

    /** 资本公积 */
    @Excel(name = "资本公积")
    private Double capitalReserve;

    /** 资本公积(环比%) */
    @Excel(name = "资本公积(环比%)")
    private Double capitalReserveYoy;

    /** 其他综合收益 */
    @Excel(name = "其他综合收益")
    private Double otherCompreIncome;

    /** 其他综合收益(环比%) */
    @Excel(name = "其他综合收益(环比%)")
    private Double otherCompreIncomeYoy;

    /** 盈余公积 */
    @Excel(name = "盈余公积")
    private Double surplusReserve;

    /** 盈余公积(环比%) */
    @Excel(name = "盈余公积(环比%)")
    private Double surplusReserveYoy;

    /** 一般风险准备 */
    @Excel(name = "一般风险准备")
    private Double generalRiskReserve;

    /** 一般风险准备(环比%) */
    @Excel(name = "一般风险准备(环比%)")
    private Double generalRiskReserveYoy;

    /** 未分配利润 */
    @Excel(name = "未分配利润")
    private Double unassignRpofit;

    /** 未分配利润(环比%) */
    @Excel(name = "未分配利润(环比%)")
    private Double unassignRpofitYoy;

    /** 归属于母公司股东权益总计 */
    @Excel(name = "归属于母公司股东权益总计")
    private Double totalParentEquity;

    /** 归属于母公司股东权益总计(环比%) */
    @Excel(name = "归属于母公司股东权益总计(环比%)")
    private Double totalParentEquityYoy;

    /** 少数股东权益 */
    @Excel(name = "少数股东权益")
    private Double minorityEquity;

    /** 少数股东权益(环比%) */
    @Excel(name = "少数股东权益(环比%)")
    private Double minorityEquityYoy;

    /** 股东权益合计 */
    @Excel(name = "股东权益合计")
    private Double totalEquity;

    /** 股东权益合计(环比%) */
    @Excel(name = "股东权益合计(环比%)")
    private Double totalEquityYoy;

    /** 负债和股东权益总计 */
    @Excel(name = "负债和股东权益总计")
    private Double totalLiabEquity;

    /** 负债和股东权益总计(环比%) */
    @Excel(name = "负债和股东权益总计(环比%)")
    private Double totalLiabEquityYoy;

    /** 审计意见(境内) */
    @Excel(name = "审计意见(境内)")
    private String opinionType;

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
    public void setMonetaryfunds(Double monetaryfunds) 
    {
        this.monetaryfunds = monetaryfunds;
    }

    public Double getMonetaryfunds() 
    {
        return monetaryfunds;
    }
    public void setMonetaryfundsYoy(Double monetaryfundsYoy) 
    {
        this.monetaryfundsYoy = monetaryfundsYoy;
    }

    public Double getMonetaryfundsYoy() 
    {
        return monetaryfundsYoy;
    }
    public void setCustomerDeposit(Double customerDeposit) 
    {
        this.customerDeposit = customerDeposit;
    }

    public Double getCustomerDeposit() 
    {
        return customerDeposit;
    }
    public void setCustomerDepositYoy(Double customerDepositYoy) 
    {
        this.customerDepositYoy = customerDepositYoy;
    }

    public Double getCustomerDepositYoy() 
    {
        return customerDepositYoy;
    }
    public void setSettleExcessReserve(Double settleExcessReserve) 
    {
        this.settleExcessReserve = settleExcessReserve;
    }

    public Double getSettleExcessReserve() 
    {
        return settleExcessReserve;
    }
    public void setSettleExcessReserveYoy(Double settleExcessReserveYoy) 
    {
        this.settleExcessReserveYoy = settleExcessReserveYoy;
    }

    public Double getSettleExcessReserveYoy() 
    {
        return settleExcessReserveYoy;
    }
    public void setCustomerExcessReserve(Double customerExcessReserve) 
    {
        this.customerExcessReserve = customerExcessReserve;
    }

    public Double getCustomerExcessReserve() 
    {
        return customerExcessReserve;
    }
    public void setCustomerExcessReserveYoy(Double customerExcessReserveYoy) 
    {
        this.customerExcessReserveYoy = customerExcessReserveYoy;
    }

    public Double getCustomerExcessReserveYoy() 
    {
        return customerExcessReserveYoy;
    }
    public void setFinFund(Double finFund) 
    {
        this.finFund = finFund;
    }

    public Double getFinFund() 
    {
        return finFund;
    }
    public void setFinFundYoy(Double finFundYoy) 
    {
        this.finFundYoy = finFundYoy;
    }

    public Double getFinFundYoy() 
    {
        return finFundYoy;
    }
    public void setDeriveFinasset(Double deriveFinasset) 
    {
        this.deriveFinasset = deriveFinasset;
    }

    public Double getDeriveFinasset() 
    {
        return deriveFinasset;
    }
    public void setDeriveFinassetYoy(Double deriveFinassetYoy) 
    {
        this.deriveFinassetYoy = deriveFinassetYoy;
    }

    public Double getDeriveFinassetYoy() 
    {
        return deriveFinassetYoy;
    }
    public void setBuyResaleFinasset(Double buyResaleFinasset) 
    {
        this.buyResaleFinasset = buyResaleFinasset;
    }

    public Double getBuyResaleFinasset() 
    {
        return buyResaleFinasset;
    }
    public void setBuyResaleFinassetYoy(Double buyResaleFinassetYoy) 
    {
        this.buyResaleFinassetYoy = buyResaleFinassetYoy;
    }

    public Double getBuyResaleFinassetYoy() 
    {
        return buyResaleFinassetYoy;
    }
    public void setReceivables(Double receivables) 
    {
        this.receivables = receivables;
    }

    public Double getReceivables() 
    {
        return receivables;
    }
    public void setReceivablesYoy(Double receivablesYoy) 
    {
        this.receivablesYoy = receivablesYoy;
    }

    public Double getReceivablesYoy() 
    {
        return receivablesYoy;
    }
    public void setRefundDepositPay(Double refundDepositPay) 
    {
        this.refundDepositPay = refundDepositPay;
    }

    public Double getRefundDepositPay() 
    {
        return refundDepositPay;
    }
    public void setRefundDepositPayYoy(Double refundDepositPayYoy) 
    {
        this.refundDepositPayYoy = refundDepositPayYoy;
    }

    public Double getRefundDepositPayYoy() 
    {
        return refundDepositPayYoy;
    }
    public void setTradeFinassetNotfvtpl(Double tradeFinassetNotfvtpl) 
    {
        this.tradeFinassetNotfvtpl = tradeFinassetNotfvtpl;
    }

    public Double getTradeFinassetNotfvtpl() 
    {
        return tradeFinassetNotfvtpl;
    }
    public void setTradeFinassetNotfvtplYoy(Double tradeFinassetNotfvtplYoy) 
    {
        this.tradeFinassetNotfvtplYoy = tradeFinassetNotfvtplYoy;
    }

    public Double getTradeFinassetNotfvtplYoy() 
    {
        return tradeFinassetNotfvtplYoy;
    }
    public void setCreditorInvest(Double creditorInvest) 
    {
        this.creditorInvest = creditorInvest;
    }

    public Double getCreditorInvest() 
    {
        return creditorInvest;
    }
    public void setCreditorInvestYoy(Double creditorInvestYoy) 
    {
        this.creditorInvestYoy = creditorInvestYoy;
    }

    public Double getCreditorInvestYoy() 
    {
        return creditorInvestYoy;
    }
    public void setOtherEquityInvest(Double otherEquityInvest) 
    {
        this.otherEquityInvest = otherEquityInvest;
    }

    public Double getOtherEquityInvest() 
    {
        return otherEquityInvest;
    }
    public void setOtherEquityInvestYoy(Double otherEquityInvestYoy) 
    {
        this.otherEquityInvestYoy = otherEquityInvestYoy;
    }

    public Double getOtherEquityInvestYoy() 
    {
        return otherEquityInvestYoy;
    }
    public void setLongEquityInvest(Double longEquityInvest) 
    {
        this.longEquityInvest = longEquityInvest;
    }

    public Double getLongEquityInvest() 
    {
        return longEquityInvest;
    }
    public void setLongEquityInvestYoy(Double longEquityInvestYoy) 
    {
        this.longEquityInvestYoy = longEquityInvestYoy;
    }

    public Double getLongEquityInvestYoy() 
    {
        return longEquityInvestYoy;
    }
    public void setInvestRealestate(Double investRealestate) 
    {
        this.investRealestate = investRealestate;
    }

    public Double getInvestRealestate() 
    {
        return investRealestate;
    }
    public void setInvestRealestateYoy(Double investRealestateYoy) 
    {
        this.investRealestateYoy = investRealestateYoy;
    }

    public Double getInvestRealestateYoy() 
    {
        return investRealestateYoy;
    }
    public void setFixedAsset(Double fixedAsset) 
    {
        this.fixedAsset = fixedAsset;
    }

    public Double getFixedAsset() 
    {
        return fixedAsset;
    }
    public void setFixedAssetYoy(Double fixedAssetYoy) 
    {
        this.fixedAssetYoy = fixedAssetYoy;
    }

    public Double getFixedAssetYoy() 
    {
        return fixedAssetYoy;
    }
    public void setUserightAsset(Double userightAsset) 
    {
        this.userightAsset = userightAsset;
    }

    public Double getUserightAsset() 
    {
        return userightAsset;
    }
    public void setUserightAssetYoy(Double userightAssetYoy) 
    {
        this.userightAssetYoy = userightAssetYoy;
    }

    public Double getUserightAssetYoy() 
    {
        return userightAssetYoy;
    }
    public void setIntangibleAsset(Double intangibleAsset) 
    {
        this.intangibleAsset = intangibleAsset;
    }

    public Double getIntangibleAsset() 
    {
        return intangibleAsset;
    }
    public void setIntangibleAssetYoy(Double intangibleAssetYoy) 
    {
        this.intangibleAssetYoy = intangibleAssetYoy;
    }

    public Double getIntangibleAssetYoy() 
    {
        return intangibleAssetYoy;
    }
    public void setGoodwill(Double goodwill) 
    {
        this.goodwill = goodwill;
    }

    public Double getGoodwill() 
    {
        return goodwill;
    }
    public void setGoodwillYoy(Double goodwillYoy) 
    {
        this.goodwillYoy = goodwillYoy;
    }

    public Double getGoodwillYoy() 
    {
        return goodwillYoy;
    }
    public void setDeferTaxAsset(Double deferTaxAsset) 
    {
        this.deferTaxAsset = deferTaxAsset;
    }

    public Double getDeferTaxAsset() 
    {
        return deferTaxAsset;
    }
    public void setDeferTaxAssetYoy(Double deferTaxAssetYoy) 
    {
        this.deferTaxAssetYoy = deferTaxAssetYoy;
    }

    public Double getDeferTaxAssetYoy() 
    {
        return deferTaxAssetYoy;
    }
    public void setOtherAsset(Double otherAsset) 
    {
        this.otherAsset = otherAsset;
    }

    public Double getOtherAsset() 
    {
        return otherAsset;
    }
    public void setOtherAssetYoy(Double otherAssetYoy) 
    {
        this.otherAssetYoy = otherAssetYoy;
    }

    public Double getOtherAssetYoy() 
    {
        return otherAssetYoy;
    }
    public void setTotalAssets(Double totalAssets) 
    {
        this.totalAssets = totalAssets;
    }

    public Double getTotalAssets() 
    {
        return totalAssets;
    }
    public void setTotalAssetsYoy(Double totalAssetsYoy) 
    {
        this.totalAssetsYoy = totalAssetsYoy;
    }

    public Double getTotalAssetsYoy() 
    {
        return totalAssetsYoy;
    }
    public void setShortFinPayable(Double shortFinPayable) 
    {
        this.shortFinPayable = shortFinPayable;
    }

    public Double getShortFinPayable() 
    {
        return shortFinPayable;
    }
    public void setShortFinPayableYoy(Double shortFinPayableYoy) 
    {
        this.shortFinPayableYoy = shortFinPayableYoy;
    }

    public Double getShortFinPayableYoy() 
    {
        return shortFinPayableYoy;
    }
    public void setBorrowFund(Double borrowFund) 
    {
        this.borrowFund = borrowFund;
    }

    public Double getBorrowFund() 
    {
        return borrowFund;
    }
    public void setBorrowFundYoy(Double borrowFundYoy) 
    {
        this.borrowFundYoy = borrowFundYoy;
    }

    public Double getBorrowFundYoy() 
    {
        return borrowFundYoy;
    }
    public void setTradeFinliabNotfvtpl(Double tradeFinliabNotfvtpl) 
    {
        this.tradeFinliabNotfvtpl = tradeFinliabNotfvtpl;
    }

    public Double getTradeFinliabNotfvtpl() 
    {
        return tradeFinliabNotfvtpl;
    }
    public void setTradeFinliabNotfvtplYoy(Double tradeFinliabNotfvtplYoy) 
    {
        this.tradeFinliabNotfvtplYoy = tradeFinliabNotfvtplYoy;
    }

    public Double getTradeFinliabNotfvtplYoy() 
    {
        return tradeFinliabNotfvtplYoy;
    }
    public void setDeriveFinliab(Double deriveFinliab) 
    {
        this.deriveFinliab = deriveFinliab;
    }

    public Double getDeriveFinliab() 
    {
        return deriveFinliab;
    }
    public void setDeriveFinliabYoy(Double deriveFinliabYoy) 
    {
        this.deriveFinliabYoy = deriveFinliabYoy;
    }

    public Double getDeriveFinliabYoy() 
    {
        return deriveFinliabYoy;
    }
    public void setSellRepoFinasset(Double sellRepoFinasset) 
    {
        this.sellRepoFinasset = sellRepoFinasset;
    }

    public Double getSellRepoFinasset() 
    {
        return sellRepoFinasset;
    }
    public void setSellRepoFinassetYoy(Double sellRepoFinassetYoy) 
    {
        this.sellRepoFinassetYoy = sellRepoFinassetYoy;
    }

    public Double getSellRepoFinassetYoy() 
    {
        return sellRepoFinassetYoy;
    }
    public void setAgentTradeSecurity(Double agentTradeSecurity) 
    {
        this.agentTradeSecurity = agentTradeSecurity;
    }

    public Double getAgentTradeSecurity() 
    {
        return agentTradeSecurity;
    }
    public void setAgentTradeSecurityYoy(Double agentTradeSecurityYoy) 
    {
        this.agentTradeSecurityYoy = agentTradeSecurityYoy;
    }

    public Double getAgentTradeSecurityYoy() 
    {
        return agentTradeSecurityYoy;
    }
    public void setAgentUnderwriteSecurity(Double agentUnderwriteSecurity) 
    {
        this.agentUnderwriteSecurity = agentUnderwriteSecurity;
    }

    public Double getAgentUnderwriteSecurity() 
    {
        return agentUnderwriteSecurity;
    }
    public void setAgentUnderwriteSecurityYoy(Double agentUnderwriteSecurityYoy) 
    {
        this.agentUnderwriteSecurityYoy = agentUnderwriteSecurityYoy;
    }

    public Double getAgentUnderwriteSecurityYoy() 
    {
        return agentUnderwriteSecurityYoy;
    }
    public void setAccountsPayable(Double accountsPayable) 
    {
        this.accountsPayable = accountsPayable;
    }

    public Double getAccountsPayable() 
    {
        return accountsPayable;
    }
    public void setAccountsPayableYoy(Double accountsPayableYoy) 
    {
        this.accountsPayableYoy = accountsPayableYoy;
    }

    public Double getAccountsPayableYoy() 
    {
        return accountsPayableYoy;
    }
    public void setStaffSalaryPayable(Double staffSalaryPayable) 
    {
        this.staffSalaryPayable = staffSalaryPayable;
    }

    public Double getStaffSalaryPayable() 
    {
        return staffSalaryPayable;
    }
    public void setStaffSalaryPayableYoy(Double staffSalaryPayableYoy) 
    {
        this.staffSalaryPayableYoy = staffSalaryPayableYoy;
    }

    public Double getStaffSalaryPayableYoy() 
    {
        return staffSalaryPayableYoy;
    }
    public void setTaxPayable(Double taxPayable) 
    {
        this.taxPayable = taxPayable;
    }

    public Double getTaxPayable() 
    {
        return taxPayable;
    }
    public void setTaxPayableYoy(Double taxPayableYoy) 
    {
        this.taxPayableYoy = taxPayableYoy;
    }

    public Double getTaxPayableYoy() 
    {
        return taxPayableYoy;
    }
    public void setPredictLiab(Double predictLiab) 
    {
        this.predictLiab = predictLiab;
    }

    public Double getPredictLiab() 
    {
        return predictLiab;
    }
    public void setPredictLiabYoy(Double predictLiabYoy) 
    {
        this.predictLiabYoy = predictLiabYoy;
    }

    public Double getPredictLiabYoy() 
    {
        return predictLiabYoy;
    }
    public void setBondPayable(Double bondPayable) 
    {
        this.bondPayable = bondPayable;
    }

    public Double getBondPayable() 
    {
        return bondPayable;
    }
    public void setBondPayableYoy(Double bondPayableYoy) 
    {
        this.bondPayableYoy = bondPayableYoy;
    }

    public Double getBondPayableYoy() 
    {
        return bondPayableYoy;
    }
    public void setLeaseLiab(Double leaseLiab) 
    {
        this.leaseLiab = leaseLiab;
    }

    public Double getLeaseLiab() 
    {
        return leaseLiab;
    }
    public void setLeaseLiabYoy(Double leaseLiabYoy) 
    {
        this.leaseLiabYoy = leaseLiabYoy;
    }

    public Double getLeaseLiabYoy() 
    {
        return leaseLiabYoy;
    }
    public void setDeferTaxLiab(Double deferTaxLiab) 
    {
        this.deferTaxLiab = deferTaxLiab;
    }

    public Double getDeferTaxLiab() 
    {
        return deferTaxLiab;
    }
    public void setDeferTaxLiabYoy(Double deferTaxLiabYoy) 
    {
        this.deferTaxLiabYoy = deferTaxLiabYoy;
    }

    public Double getDeferTaxLiabYoy() 
    {
        return deferTaxLiabYoy;
    }
    public void setOtherLiab(Double otherLiab) 
    {
        this.otherLiab = otherLiab;
    }

    public Double getOtherLiab() 
    {
        return otherLiab;
    }
    public void setOtherLiabYoy(Double otherLiabYoy) 
    {
        this.otherLiabYoy = otherLiabYoy;
    }

    public Double getOtherLiabYoy() 
    {
        return otherLiabYoy;
    }
    public void setLiabOther(Double liabOther) 
    {
        this.liabOther = liabOther;
    }

    public Double getLiabOther() 
    {
        return liabOther;
    }
    public void setLiabOtherYoy(Double liabOtherYoy) 
    {
        this.liabOtherYoy = liabOtherYoy;
    }

    public Double getLiabOtherYoy() 
    {
        return liabOtherYoy;
    }
    public void setTotalLiabilities(Double totalLiabilities) 
    {
        this.totalLiabilities = totalLiabilities;
    }

    public Double getTotalLiabilities() 
    {
        return totalLiabilities;
    }
    public void setTotalLiabilitiesYoy(Double totalLiabilitiesYoy) 
    {
        this.totalLiabilitiesYoy = totalLiabilitiesYoy;
    }

    public Double getTotalLiabilitiesYoy() 
    {
        return totalLiabilitiesYoy;
    }
    public void setShareCapital(Double shareCapital) 
    {
        this.shareCapital = shareCapital;
    }

    public Double getShareCapital() 
    {
        return shareCapital;
    }
    public void setShareCapitalYoy(Double shareCapitalYoy) 
    {
        this.shareCapitalYoy = shareCapitalYoy;
    }

    public Double getShareCapitalYoy() 
    {
        return shareCapitalYoy;
    }
    public void setCapitalReserve(Double capitalReserve) 
    {
        this.capitalReserve = capitalReserve;
    }

    public Double getCapitalReserve() 
    {
        return capitalReserve;
    }
    public void setCapitalReserveYoy(Double capitalReserveYoy) 
    {
        this.capitalReserveYoy = capitalReserveYoy;
    }

    public Double getCapitalReserveYoy() 
    {
        return capitalReserveYoy;
    }
    public void setOtherCompreIncome(Double otherCompreIncome) 
    {
        this.otherCompreIncome = otherCompreIncome;
    }

    public Double getOtherCompreIncome() 
    {
        return otherCompreIncome;
    }
    public void setOtherCompreIncomeYoy(Double otherCompreIncomeYoy) 
    {
        this.otherCompreIncomeYoy = otherCompreIncomeYoy;
    }

    public Double getOtherCompreIncomeYoy() 
    {
        return otherCompreIncomeYoy;
    }
    public void setSurplusReserve(Double surplusReserve) 
    {
        this.surplusReserve = surplusReserve;
    }

    public Double getSurplusReserve() 
    {
        return surplusReserve;
    }
    public void setSurplusReserveYoy(Double surplusReserveYoy) 
    {
        this.surplusReserveYoy = surplusReserveYoy;
    }

    public Double getSurplusReserveYoy() 
    {
        return surplusReserveYoy;
    }
    public void setGeneralRiskReserve(Double generalRiskReserve) 
    {
        this.generalRiskReserve = generalRiskReserve;
    }

    public Double getGeneralRiskReserve() 
    {
        return generalRiskReserve;
    }
    public void setGeneralRiskReserveYoy(Double generalRiskReserveYoy) 
    {
        this.generalRiskReserveYoy = generalRiskReserveYoy;
    }

    public Double getGeneralRiskReserveYoy() 
    {
        return generalRiskReserveYoy;
    }
    public void setUnassignRpofit(Double unassignRpofit) 
    {
        this.unassignRpofit = unassignRpofit;
    }

    public Double getUnassignRpofit() 
    {
        return unassignRpofit;
    }
    public void setUnassignRpofitYoy(Double unassignRpofitYoy) 
    {
        this.unassignRpofitYoy = unassignRpofitYoy;
    }

    public Double getUnassignRpofitYoy() 
    {
        return unassignRpofitYoy;
    }
    public void setTotalParentEquity(Double totalParentEquity) 
    {
        this.totalParentEquity = totalParentEquity;
    }

    public Double getTotalParentEquity() 
    {
        return totalParentEquity;
    }
    public void setTotalParentEquityYoy(Double totalParentEquityYoy) 
    {
        this.totalParentEquityYoy = totalParentEquityYoy;
    }

    public Double getTotalParentEquityYoy() 
    {
        return totalParentEquityYoy;
    }
    public void setMinorityEquity(Double minorityEquity) 
    {
        this.minorityEquity = minorityEquity;
    }

    public Double getMinorityEquity() 
    {
        return minorityEquity;
    }
    public void setMinorityEquityYoy(Double minorityEquityYoy) 
    {
        this.minorityEquityYoy = minorityEquityYoy;
    }

    public Double getMinorityEquityYoy() 
    {
        return minorityEquityYoy;
    }
    public void setTotalEquity(Double totalEquity) 
    {
        this.totalEquity = totalEquity;
    }

    public Double getTotalEquity() 
    {
        return totalEquity;
    }
    public void setTotalEquityYoy(Double totalEquityYoy) 
    {
        this.totalEquityYoy = totalEquityYoy;
    }

    public Double getTotalEquityYoy() 
    {
        return totalEquityYoy;
    }
    public void setTotalLiabEquity(Double totalLiabEquity) 
    {
        this.totalLiabEquity = totalLiabEquity;
    }

    public Double getTotalLiabEquity() 
    {
        return totalLiabEquity;
    }
    public void setTotalLiabEquityYoy(Double totalLiabEquityYoy) 
    {
        this.totalLiabEquityYoy = totalLiabEquityYoy;
    }

    public Double getTotalLiabEquityYoy() 
    {
        return totalLiabEquityYoy;
    }
    public void setOpinionType(String opinionType) 
    {
        this.opinionType = opinionType;
    }

    public String getOpinionType() 
    {
        return opinionType;
    }

    public InvFinanceZcfzSecuritiesPeriod() {
        super();
    }

    public InvFinanceZcfzSecuritiesPeriod(String securityCode) {
        this.securityCode = securityCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvFinanceZcfzSecuritiesPeriod)) return false;
        InvFinanceZcfzSecuritiesPeriod that = (InvFinanceZcfzSecuritiesPeriod) o;
        return Objects.equals(id, that.id) && Objects.equals(securityCode, that.securityCode) && Objects.equals(reportDate, that.reportDate) && Objects.equals(monetaryfunds, that.monetaryfunds) && Objects.equals(monetaryfundsYoy, that.monetaryfundsYoy) && Objects.equals(customerDeposit, that.customerDeposit) && Objects.equals(customerDepositYoy, that.customerDepositYoy) && Objects.equals(settleExcessReserve, that.settleExcessReserve) && Objects.equals(settleExcessReserveYoy, that.settleExcessReserveYoy) && Objects.equals(customerExcessReserve, that.customerExcessReserve) && Objects.equals(customerExcessReserveYoy, that.customerExcessReserveYoy) && Objects.equals(finFund, that.finFund) && Objects.equals(finFundYoy, that.finFundYoy) && Objects.equals(deriveFinasset, that.deriveFinasset) && Objects.equals(deriveFinassetYoy, that.deriveFinassetYoy) && Objects.equals(buyResaleFinasset, that.buyResaleFinasset) && Objects.equals(buyResaleFinassetYoy, that.buyResaleFinassetYoy) && Objects.equals(receivables, that.receivables) && Objects.equals(receivablesYoy, that.receivablesYoy) && Objects.equals(refundDepositPay, that.refundDepositPay) && Objects.equals(refundDepositPayYoy, that.refundDepositPayYoy) && Objects.equals(tradeFinassetNotfvtpl, that.tradeFinassetNotfvtpl) && Objects.equals(tradeFinassetNotfvtplYoy, that.tradeFinassetNotfvtplYoy) && Objects.equals(creditorInvest, that.creditorInvest) && Objects.equals(creditorInvestYoy, that.creditorInvestYoy) && Objects.equals(otherEquityInvest, that.otherEquityInvest) && Objects.equals(otherEquityInvestYoy, that.otherEquityInvestYoy) && Objects.equals(longEquityInvest, that.longEquityInvest) && Objects.equals(longEquityInvestYoy, that.longEquityInvestYoy) && Objects.equals(investRealestate, that.investRealestate) && Objects.equals(investRealestateYoy, that.investRealestateYoy) && Objects.equals(fixedAsset, that.fixedAsset) && Objects.equals(fixedAssetYoy, that.fixedAssetYoy) && Objects.equals(userightAsset, that.userightAsset) && Objects.equals(userightAssetYoy, that.userightAssetYoy) && Objects.equals(intangibleAsset, that.intangibleAsset) && Objects.equals(intangibleAssetYoy, that.intangibleAssetYoy) && Objects.equals(goodwill, that.goodwill) && Objects.equals(goodwillYoy, that.goodwillYoy) && Objects.equals(deferTaxAsset, that.deferTaxAsset) && Objects.equals(deferTaxAssetYoy, that.deferTaxAssetYoy) && Objects.equals(otherAsset, that.otherAsset) && Objects.equals(otherAssetYoy, that.otherAssetYoy) && Objects.equals(totalAssets, that.totalAssets) && Objects.equals(totalAssetsYoy, that.totalAssetsYoy) && Objects.equals(shortFinPayable, that.shortFinPayable) && Objects.equals(shortFinPayableYoy, that.shortFinPayableYoy) && Objects.equals(borrowFund, that.borrowFund) && Objects.equals(borrowFundYoy, that.borrowFundYoy) && Objects.equals(tradeFinliabNotfvtpl, that.tradeFinliabNotfvtpl) && Objects.equals(tradeFinliabNotfvtplYoy, that.tradeFinliabNotfvtplYoy) && Objects.equals(deriveFinliab, that.deriveFinliab) && Objects.equals(deriveFinliabYoy, that.deriveFinliabYoy) && Objects.equals(sellRepoFinasset, that.sellRepoFinasset) && Objects.equals(sellRepoFinassetYoy, that.sellRepoFinassetYoy) && Objects.equals(agentTradeSecurity, that.agentTradeSecurity) && Objects.equals(agentTradeSecurityYoy, that.agentTradeSecurityYoy) && Objects.equals(agentUnderwriteSecurity, that.agentUnderwriteSecurity) && Objects.equals(agentUnderwriteSecurityYoy, that.agentUnderwriteSecurityYoy) && Objects.equals(accountsPayable, that.accountsPayable) && Objects.equals(accountsPayableYoy, that.accountsPayableYoy) && Objects.equals(staffSalaryPayable, that.staffSalaryPayable) && Objects.equals(staffSalaryPayableYoy, that.staffSalaryPayableYoy) && Objects.equals(taxPayable, that.taxPayable) && Objects.equals(taxPayableYoy, that.taxPayableYoy) && Objects.equals(predictLiab, that.predictLiab) && Objects.equals(predictLiabYoy, that.predictLiabYoy) && Objects.equals(bondPayable, that.bondPayable) && Objects.equals(bondPayableYoy, that.bondPayableYoy) && Objects.equals(leaseLiab, that.leaseLiab) && Objects.equals(leaseLiabYoy, that.leaseLiabYoy) && Objects.equals(deferTaxLiab, that.deferTaxLiab) && Objects.equals(deferTaxLiabYoy, that.deferTaxLiabYoy) && Objects.equals(otherLiab, that.otherLiab) && Objects.equals(otherLiabYoy, that.otherLiabYoy) && Objects.equals(liabOther, that.liabOther) && Objects.equals(liabOtherYoy, that.liabOtherYoy) && Objects.equals(totalLiabilities, that.totalLiabilities) && Objects.equals(totalLiabilitiesYoy, that.totalLiabilitiesYoy) && Objects.equals(shareCapital, that.shareCapital) && Objects.equals(shareCapitalYoy, that.shareCapitalYoy) && Objects.equals(capitalReserve, that.capitalReserve) && Objects.equals(capitalReserveYoy, that.capitalReserveYoy) && Objects.equals(otherCompreIncome, that.otherCompreIncome) && Objects.equals(otherCompreIncomeYoy, that.otherCompreIncomeYoy) && Objects.equals(surplusReserve, that.surplusReserve) && Objects.equals(surplusReserveYoy, that.surplusReserveYoy) && Objects.equals(generalRiskReserve, that.generalRiskReserve) && Objects.equals(generalRiskReserveYoy, that.generalRiskReserveYoy) && Objects.equals(unassignRpofit, that.unassignRpofit) && Objects.equals(unassignRpofitYoy, that.unassignRpofitYoy) && Objects.equals(totalParentEquity, that.totalParentEquity) && Objects.equals(totalParentEquityYoy, that.totalParentEquityYoy) && Objects.equals(minorityEquity, that.minorityEquity) && Objects.equals(minorityEquityYoy, that.minorityEquityYoy) && Objects.equals(totalEquity, that.totalEquity) && Objects.equals(totalEquityYoy, that.totalEquityYoy) && Objects.equals(totalLiabEquity, that.totalLiabEquity) && Objects.equals(totalLiabEquityYoy, that.totalLiabEquityYoy) && Objects.equals(opinionType, that.opinionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, securityCode, reportDate, monetaryfunds, monetaryfundsYoy, customerDeposit, customerDepositYoy, settleExcessReserve, settleExcessReserveYoy, customerExcessReserve, customerExcessReserveYoy, finFund, finFundYoy, deriveFinasset, deriveFinassetYoy, buyResaleFinasset, buyResaleFinassetYoy, receivables, receivablesYoy, refundDepositPay, refundDepositPayYoy, tradeFinassetNotfvtpl, tradeFinassetNotfvtplYoy, creditorInvest, creditorInvestYoy, otherEquityInvest, otherEquityInvestYoy, longEquityInvest, longEquityInvestYoy, investRealestate, investRealestateYoy, fixedAsset, fixedAssetYoy, userightAsset, userightAssetYoy, intangibleAsset, intangibleAssetYoy, goodwill, goodwillYoy, deferTaxAsset, deferTaxAssetYoy, otherAsset, otherAssetYoy, totalAssets, totalAssetsYoy, shortFinPayable, shortFinPayableYoy, borrowFund, borrowFundYoy, tradeFinliabNotfvtpl, tradeFinliabNotfvtplYoy, deriveFinliab, deriveFinliabYoy, sellRepoFinasset, sellRepoFinassetYoy, agentTradeSecurity, agentTradeSecurityYoy, agentUnderwriteSecurity, agentUnderwriteSecurityYoy, accountsPayable, accountsPayableYoy, staffSalaryPayable, staffSalaryPayableYoy, taxPayable, taxPayableYoy, predictLiab, predictLiabYoy, bondPayable, bondPayableYoy, leaseLiab, leaseLiabYoy, deferTaxLiab, deferTaxLiabYoy, otherLiab, otherLiabYoy, liabOther, liabOtherYoy, totalLiabilities, totalLiabilitiesYoy, shareCapital, shareCapitalYoy, capitalReserve, capitalReserveYoy, otherCompreIncome, otherCompreIncomeYoy, surplusReserve, surplusReserveYoy, generalRiskReserve, generalRiskReserveYoy, unassignRpofit, unassignRpofitYoy, totalParentEquity, totalParentEquityYoy, minorityEquity, minorityEquityYoy, totalEquity, totalEquityYoy, totalLiabEquity, totalLiabEquityYoy, opinionType);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("securityCode", getSecurityCode())
            .append("reportDate", getReportDate())
            .append("monetaryfunds", getMonetaryfunds())
            .append("monetaryfundsYoy", getMonetaryfundsYoy())
            .append("customerDeposit", getCustomerDeposit())
            .append("customerDepositYoy", getCustomerDepositYoy())
            .append("settleExcessReserve", getSettleExcessReserve())
            .append("settleExcessReserveYoy", getSettleExcessReserveYoy())
            .append("customerExcessReserve", getCustomerExcessReserve())
            .append("customerExcessReserveYoy", getCustomerExcessReserveYoy())
            .append("finFund", getFinFund())
            .append("finFundYoy", getFinFundYoy())
            .append("deriveFinasset", getDeriveFinasset())
            .append("deriveFinassetYoy", getDeriveFinassetYoy())
            .append("buyResaleFinasset", getBuyResaleFinasset())
            .append("buyResaleFinassetYoy", getBuyResaleFinassetYoy())
            .append("receivables", getReceivables())
            .append("receivablesYoy", getReceivablesYoy())
            .append("refundDepositPay", getRefundDepositPay())
            .append("refundDepositPayYoy", getRefundDepositPayYoy())
            .append("tradeFinassetNotfvtpl", getTradeFinassetNotfvtpl())
            .append("tradeFinassetNotfvtplYoy", getTradeFinassetNotfvtplYoy())
            .append("creditorInvest", getCreditorInvest())
            .append("creditorInvestYoy", getCreditorInvestYoy())
            .append("otherEquityInvest", getOtherEquityInvest())
            .append("otherEquityInvestYoy", getOtherEquityInvestYoy())
            .append("longEquityInvest", getLongEquityInvest())
            .append("longEquityInvestYoy", getLongEquityInvestYoy())
            .append("investRealestate", getInvestRealestate())
            .append("investRealestateYoy", getInvestRealestateYoy())
            .append("fixedAsset", getFixedAsset())
            .append("fixedAssetYoy", getFixedAssetYoy())
            .append("userightAsset", getUserightAsset())
            .append("userightAssetYoy", getUserightAssetYoy())
            .append("intangibleAsset", getIntangibleAsset())
            .append("intangibleAssetYoy", getIntangibleAssetYoy())
            .append("goodwill", getGoodwill())
            .append("goodwillYoy", getGoodwillYoy())
            .append("deferTaxAsset", getDeferTaxAsset())
            .append("deferTaxAssetYoy", getDeferTaxAssetYoy())
            .append("otherAsset", getOtherAsset())
            .append("otherAssetYoy", getOtherAssetYoy())
            .append("totalAssets", getTotalAssets())
            .append("totalAssetsYoy", getTotalAssetsYoy())
            .append("shortFinPayable", getShortFinPayable())
            .append("shortFinPayableYoy", getShortFinPayableYoy())
            .append("borrowFund", getBorrowFund())
            .append("borrowFundYoy", getBorrowFundYoy())
            .append("tradeFinliabNotfvtpl", getTradeFinliabNotfvtpl())
            .append("tradeFinliabNotfvtplYoy", getTradeFinliabNotfvtplYoy())
            .append("deriveFinliab", getDeriveFinliab())
            .append("deriveFinliabYoy", getDeriveFinliabYoy())
            .append("sellRepoFinasset", getSellRepoFinasset())
            .append("sellRepoFinassetYoy", getSellRepoFinassetYoy())
            .append("agentTradeSecurity", getAgentTradeSecurity())
            .append("agentTradeSecurityYoy", getAgentTradeSecurityYoy())
            .append("agentUnderwriteSecurity", getAgentUnderwriteSecurity())
            .append("agentUnderwriteSecurityYoy", getAgentUnderwriteSecurityYoy())
            .append("accountsPayable", getAccountsPayable())
            .append("accountsPayableYoy", getAccountsPayableYoy())
            .append("staffSalaryPayable", getStaffSalaryPayable())
            .append("staffSalaryPayableYoy", getStaffSalaryPayableYoy())
            .append("taxPayable", getTaxPayable())
            .append("taxPayableYoy", getTaxPayableYoy())
            .append("predictLiab", getPredictLiab())
            .append("predictLiabYoy", getPredictLiabYoy())
            .append("bondPayable", getBondPayable())
            .append("bondPayableYoy", getBondPayableYoy())
            .append("leaseLiab", getLeaseLiab())
            .append("leaseLiabYoy", getLeaseLiabYoy())
            .append("deferTaxLiab", getDeferTaxLiab())
            .append("deferTaxLiabYoy", getDeferTaxLiabYoy())
            .append("otherLiab", getOtherLiab())
            .append("otherLiabYoy", getOtherLiabYoy())
            .append("liabOther", getLiabOther())
            .append("liabOtherYoy", getLiabOtherYoy())
            .append("totalLiabilities", getTotalLiabilities())
            .append("totalLiabilitiesYoy", getTotalLiabilitiesYoy())
            .append("shareCapital", getShareCapital())
            .append("shareCapitalYoy", getShareCapitalYoy())
            .append("capitalReserve", getCapitalReserve())
            .append("capitalReserveYoy", getCapitalReserveYoy())
            .append("otherCompreIncome", getOtherCompreIncome())
            .append("otherCompreIncomeYoy", getOtherCompreIncomeYoy())
            .append("surplusReserve", getSurplusReserve())
            .append("surplusReserveYoy", getSurplusReserveYoy())
            .append("generalRiskReserve", getGeneralRiskReserve())
            .append("generalRiskReserveYoy", getGeneralRiskReserveYoy())
            .append("unassignRpofit", getUnassignRpofit())
            .append("unassignRpofitYoy", getUnassignRpofitYoy())
            .append("totalParentEquity", getTotalParentEquity())
            .append("totalParentEquityYoy", getTotalParentEquityYoy())
            .append("minorityEquity", getMinorityEquity())
            .append("minorityEquityYoy", getMinorityEquityYoy())
            .append("totalEquity", getTotalEquity())
            .append("totalEquityYoy", getTotalEquityYoy())
            .append("totalLiabEquity", getTotalLiabEquity())
            .append("totalLiabEquityYoy", getTotalLiabEquityYoy())
            .append("opinionType", getOpinionType())
            .toString();
    }
}
