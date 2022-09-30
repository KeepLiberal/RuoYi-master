package com.ruoyi.investment.domain;

import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 财务分析-资产负债-保险类-报告期对象 inv_finance_zcfz_insurance_period
 * 
 * @author yangwenyang
 * @date 2022-09-30
 */
public class InvFinanceZcfzInsurancePeriod extends BaseEntity
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

    /** 以公允价值计量且其变动计入当期损益的金融资产 */
    @Excel(name = "以公允价值计量且其变动计入当期损益的金融资产")
    private Double fvtplFinasset;

    /** 以公允价值计量且其变动计入当期损益的金融资产(环比%) */
    @Excel(name = "以公允价值计量且其变动计入当期损益的金融资产(环比%)")
    private Double fvtplFinassetYoy;

    /** 买入返售金融资产 */
    @Excel(name = "买入返售金融资产")
    private Double buyResaleFinasset;

    /** 买入返售金融资产(环比%) */
    @Excel(name = "买入返售金融资产(环比%)")
    private Double buyResaleFinassetYoy;

    /** 应收利息 */
    @Excel(name = "应收利息")
    private Double interestRece;

    /** 应收利息(环比%) */
    @Excel(name = "应收利息(环比%)")
    private Double interestReceYoy;

    /** 应收保费 */
    @Excel(name = "应收保费")
    private Double premiumRece;

    /** 应收保费(环比%) */
    @Excel(name = "应收保费(环比%)")
    private Double premiumReceYoy;

    /** 应收分保账款 */
    @Excel(name = "应收分保账款")
    private Double reinsureRece;

    /** 应收分保账款(环比%) */
    @Excel(name = "应收分保账款(环比%)")
    private Double reinsureReceYoy;

    /** 应收分保未到期责任准备金 */
    @Excel(name = "应收分保未到期责任准备金")
    private Double rudReserveRece;

    /** 应收分保未到期责任准备金(环比%) */
    @Excel(name = "应收分保未到期责任准备金(环比%)")
    private Double rudReserveReceYoy;

    /** 应收分保未决赔偿准备金 */
    @Excel(name = "应收分保未决赔偿准备金")
    private Double rucReserveRece;

    /** 应收分保未决赔偿准备金(环比%) */
    @Excel(name = "应收分保未决赔偿准备金(环比%)")
    private Double rucReserveReceYoy;

    /** 发放贷款及垫款 */
    @Excel(name = "发放贷款及垫款")
    private Double loanAdvance;

    /** 发放贷款及垫款(环比%) */
    @Excel(name = "发放贷款及垫款(环比%)")
    private Double loanAdvanceYoy;

    /** 交易性金融资产 */
    @Excel(name = "交易性金融资产")
    private Double tradeFinassetNotfvtpl;

    /** 交易性金融资产(环比%) */
    @Excel(name = "交易性金融资产(环比%)")
    private Double tradeFinassetNotfvtplYoy;

    /** 其他应收款 */
    @Excel(name = "其他应收款")
    private Double otherRece;

    /** 其他应收款(环比%) */
    @Excel(name = "其他应收款(环比%)")
    private Double otherReceYoy;

    /** 定期存款 */
    @Excel(name = "定期存款")
    private Double timeDeposit;

    /** 定期存款(环比%) */
    @Excel(name = "定期存款(环比%)")
    private Double timeDepositYoy;

    /** 可供出售金融资产 */
    @Excel(name = "可供出售金融资产")
    private Double availableSaleFinasset;

    /** 可供出售金融资产(环比%) */
    @Excel(name = "可供出售金融资产(环比%)")
    private Double availableSaleFinassetYoy;

    /** 持有至到期投资 */
    @Excel(name = "持有至到期投资")
    private Double holdMaturityInvest;

    /** 持有至到期投资(环比%) */
    @Excel(name = "持有至到期投资(环比%)")
    private Double holdMaturityInvestYoy;

    /** 应收账款 */
    @Excel(name = "应收账款")
    private Double accountsRece;

    /** 应收账款(环比%) */
    @Excel(name = "应收账款(环比%)")
    private Double accountsReceYoy;

    /** 长期股权投资 */
    @Excel(name = "长期股权投资")
    private Double longEquityInvest;

    /** 长期股权投资(环比%) */
    @Excel(name = "长期股权投资(环比%)")
    private Double longEquityInvestYoy;

    /** 存出资本保证金 */
    @Excel(name = "存出资本保证金")
    private Double refundCapitalDeposit;

    /** 存出资本保证金(环比%) */
    @Excel(name = "存出资本保证金(环比%)")
    private Double refundCapitalDepositYoy;

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

    /** 在建工程 */
    @Excel(name = "在建工程")
    private Double cip;

    /** 在建工程(环比%) */
    @Excel(name = "在建工程(环比%)")
    private Double cipYoy;

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

    /** 资产其他项目 */
    @Excel(name = "资产其他项目")
    private Double assetOther;

    /** 资产其他项目(环比%) */
    @Excel(name = "资产其他项目(环比%)")
    private Double assetOtherYoy;

    /** 资产总计 */
    @Excel(name = "资产总计")
    private Double totalAssets;

    /** 资产总计(环比%) */
    @Excel(name = "资产总计(环比%)")
    private Double totalAssetsYoy;

    /** 卖出回购金融资产款 */
    @Excel(name = "卖出回购金融资产款")
    private Double sellRepoFinasset;

    /** 卖出回购金融资产款(环比%) */
    @Excel(name = "卖出回购金融资产款(环比%)")
    private Double sellRepoFinassetYoy;

    /** 应付账款 */
    @Excel(name = "应付账款")
    private Double accountsPayable;

    /** 应付账款(环比%) */
    @Excel(name = "应付账款(环比%)")
    private Double accountsPayableYoy;

    /** 预收账款 */
    @Excel(name = "预收账款")
    private Double advanceRece;

    /** 预收账款(环比%) */
    @Excel(name = "预收账款(环比%)")
    private Double advanceReceYoy;

    /** 预收保费 */
    @Excel(name = "预收保费")
    private Double advancePremium;

    /** 预收保费(环比%) */
    @Excel(name = "预收保费(环比%)")
    private Double advancePremiumYoy;

    /** 应付手续费及佣金 */
    @Excel(name = "应付手续费及佣金")
    private Double feeCommissionPayable;

    /** 应付手续费及佣金(环比%) */
    @Excel(name = "应付手续费及佣金(环比%)")
    private Double feeCommissionPayableYoy;

    /** 应付分保账款 */
    @Excel(name = "应付分保账款")
    private Double reinsurePayable;

    /** 应付分保账款(环比%) */
    @Excel(name = "应付分保账款(环比%)")
    private Double reinsurePayableYoy;

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

    /** 应付利息 */
    @Excel(name = "应付利息")
    private Double interestPayable;

    /** 应付利息(环比%) */
    @Excel(name = "应付利息(环比%)")
    private Double interestPayableYoy;

    /** 应付赔付款 */
    @Excel(name = "应付赔付款")
    private Double compensatePayable;

    /** 应付赔付款(环比%) */
    @Excel(name = "应付赔付款(环比%)")
    private Double compensatePayableYoy;

    /** 长期借款 */
    @Excel(name = "长期借款")
    private Double longLoan;

    /** 长期借款(环比%) */
    @Excel(name = "长期借款(环比%)")
    private Double longLoanYoy;

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
    public void setFvtplFinasset(Double fvtplFinasset) 
    {
        this.fvtplFinasset = fvtplFinasset;
    }

    public Double getFvtplFinasset() 
    {
        return fvtplFinasset;
    }
    public void setFvtplFinassetYoy(Double fvtplFinassetYoy) 
    {
        this.fvtplFinassetYoy = fvtplFinassetYoy;
    }

    public Double getFvtplFinassetYoy() 
    {
        return fvtplFinassetYoy;
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
    public void setInterestRece(Double interestRece) 
    {
        this.interestRece = interestRece;
    }

    public Double getInterestRece() 
    {
        return interestRece;
    }
    public void setInterestReceYoy(Double interestReceYoy) 
    {
        this.interestReceYoy = interestReceYoy;
    }

    public Double getInterestReceYoy() 
    {
        return interestReceYoy;
    }
    public void setPremiumRece(Double premiumRece) 
    {
        this.premiumRece = premiumRece;
    }

    public Double getPremiumRece() 
    {
        return premiumRece;
    }
    public void setPremiumReceYoy(Double premiumReceYoy) 
    {
        this.premiumReceYoy = premiumReceYoy;
    }

    public Double getPremiumReceYoy() 
    {
        return premiumReceYoy;
    }
    public void setReinsureRece(Double reinsureRece) 
    {
        this.reinsureRece = reinsureRece;
    }

    public Double getReinsureRece() 
    {
        return reinsureRece;
    }
    public void setReinsureReceYoy(Double reinsureReceYoy) 
    {
        this.reinsureReceYoy = reinsureReceYoy;
    }

    public Double getReinsureReceYoy() 
    {
        return reinsureReceYoy;
    }
    public void setRudReserveRece(Double rudReserveRece) 
    {
        this.rudReserveRece = rudReserveRece;
    }

    public Double getRudReserveRece() 
    {
        return rudReserveRece;
    }
    public void setRudReserveReceYoy(Double rudReserveReceYoy) 
    {
        this.rudReserveReceYoy = rudReserveReceYoy;
    }

    public Double getRudReserveReceYoy() 
    {
        return rudReserveReceYoy;
    }
    public void setRucReserveRece(Double rucReserveRece) 
    {
        this.rucReserveRece = rucReserveRece;
    }

    public Double getRucReserveRece() 
    {
        return rucReserveRece;
    }
    public void setRucReserveReceYoy(Double rucReserveReceYoy) 
    {
        this.rucReserveReceYoy = rucReserveReceYoy;
    }

    public Double getRucReserveReceYoy() 
    {
        return rucReserveReceYoy;
    }
    public void setLoanAdvance(Double loanAdvance) 
    {
        this.loanAdvance = loanAdvance;
    }

    public Double getLoanAdvance() 
    {
        return loanAdvance;
    }
    public void setLoanAdvanceYoy(Double loanAdvanceYoy) 
    {
        this.loanAdvanceYoy = loanAdvanceYoy;
    }

    public Double getLoanAdvanceYoy() 
    {
        return loanAdvanceYoy;
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
    public void setOtherRece(Double otherRece) 
    {
        this.otherRece = otherRece;
    }

    public Double getOtherRece() 
    {
        return otherRece;
    }
    public void setOtherReceYoy(Double otherReceYoy) 
    {
        this.otherReceYoy = otherReceYoy;
    }

    public Double getOtherReceYoy() 
    {
        return otherReceYoy;
    }
    public void setTimeDeposit(Double timeDeposit) 
    {
        this.timeDeposit = timeDeposit;
    }

    public Double getTimeDeposit() 
    {
        return timeDeposit;
    }
    public void setTimeDepositYoy(Double timeDepositYoy) 
    {
        this.timeDepositYoy = timeDepositYoy;
    }

    public Double getTimeDepositYoy() 
    {
        return timeDepositYoy;
    }
    public void setAvailableSaleFinasset(Double availableSaleFinasset) 
    {
        this.availableSaleFinasset = availableSaleFinasset;
    }

    public Double getAvailableSaleFinasset() 
    {
        return availableSaleFinasset;
    }
    public void setAvailableSaleFinassetYoy(Double availableSaleFinassetYoy) 
    {
        this.availableSaleFinassetYoy = availableSaleFinassetYoy;
    }

    public Double getAvailableSaleFinassetYoy() 
    {
        return availableSaleFinassetYoy;
    }
    public void setHoldMaturityInvest(Double holdMaturityInvest) 
    {
        this.holdMaturityInvest = holdMaturityInvest;
    }

    public Double getHoldMaturityInvest() 
    {
        return holdMaturityInvest;
    }
    public void setHoldMaturityInvestYoy(Double holdMaturityInvestYoy) 
    {
        this.holdMaturityInvestYoy = holdMaturityInvestYoy;
    }

    public Double getHoldMaturityInvestYoy() 
    {
        return holdMaturityInvestYoy;
    }
    public void setAccountsRece(Double accountsRece) 
    {
        this.accountsRece = accountsRece;
    }

    public Double getAccountsRece() 
    {
        return accountsRece;
    }
    public void setAccountsReceYoy(Double accountsReceYoy) 
    {
        this.accountsReceYoy = accountsReceYoy;
    }

    public Double getAccountsReceYoy() 
    {
        return accountsReceYoy;
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
    public void setRefundCapitalDeposit(Double refundCapitalDeposit) 
    {
        this.refundCapitalDeposit = refundCapitalDeposit;
    }

    public Double getRefundCapitalDeposit() 
    {
        return refundCapitalDeposit;
    }
    public void setRefundCapitalDepositYoy(Double refundCapitalDepositYoy) 
    {
        this.refundCapitalDepositYoy = refundCapitalDepositYoy;
    }

    public Double getRefundCapitalDepositYoy() 
    {
        return refundCapitalDepositYoy;
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
    public void setCip(Double cip) 
    {
        this.cip = cip;
    }

    public Double getCip() 
    {
        return cip;
    }
    public void setCipYoy(Double cipYoy) 
    {
        this.cipYoy = cipYoy;
    }

    public Double getCipYoy() 
    {
        return cipYoy;
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
    public void setAssetOther(Double assetOther) 
    {
        this.assetOther = assetOther;
    }

    public Double getAssetOther() 
    {
        return assetOther;
    }
    public void setAssetOtherYoy(Double assetOtherYoy) 
    {
        this.assetOtherYoy = assetOtherYoy;
    }

    public Double getAssetOtherYoy() 
    {
        return assetOtherYoy;
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
    public void setAdvanceRece(Double advanceRece) 
    {
        this.advanceRece = advanceRece;
    }

    public Double getAdvanceRece() 
    {
        return advanceRece;
    }
    public void setAdvanceReceYoy(Double advanceReceYoy) 
    {
        this.advanceReceYoy = advanceReceYoy;
    }

    public Double getAdvanceReceYoy() 
    {
        return advanceReceYoy;
    }
    public void setAdvancePremium(Double advancePremium) 
    {
        this.advancePremium = advancePremium;
    }

    public Double getAdvancePremium() 
    {
        return advancePremium;
    }
    public void setAdvancePremiumYoy(Double advancePremiumYoy) 
    {
        this.advancePremiumYoy = advancePremiumYoy;
    }

    public Double getAdvancePremiumYoy() 
    {
        return advancePremiumYoy;
    }
    public void setFeeCommissionPayable(Double feeCommissionPayable) 
    {
        this.feeCommissionPayable = feeCommissionPayable;
    }

    public Double getFeeCommissionPayable() 
    {
        return feeCommissionPayable;
    }
    public void setFeeCommissionPayableYoy(Double feeCommissionPayableYoy) 
    {
        this.feeCommissionPayableYoy = feeCommissionPayableYoy;
    }

    public Double getFeeCommissionPayableYoy() 
    {
        return feeCommissionPayableYoy;
    }
    public void setReinsurePayable(Double reinsurePayable) 
    {
        this.reinsurePayable = reinsurePayable;
    }

    public Double getReinsurePayable() 
    {
        return reinsurePayable;
    }
    public void setReinsurePayableYoy(Double reinsurePayableYoy) 
    {
        this.reinsurePayableYoy = reinsurePayableYoy;
    }

    public Double getReinsurePayableYoy() 
    {
        return reinsurePayableYoy;
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
    public void setInterestPayable(Double interestPayable) 
    {
        this.interestPayable = interestPayable;
    }

    public Double getInterestPayable() 
    {
        return interestPayable;
    }
    public void setInterestPayableYoy(Double interestPayableYoy) 
    {
        this.interestPayableYoy = interestPayableYoy;
    }

    public Double getInterestPayableYoy() 
    {
        return interestPayableYoy;
    }
    public void setCompensatePayable(Double compensatePayable) 
    {
        this.compensatePayable = compensatePayable;
    }

    public Double getCompensatePayable() 
    {
        return compensatePayable;
    }
    public void setCompensatePayableYoy(Double compensatePayableYoy) 
    {
        this.compensatePayableYoy = compensatePayableYoy;
    }

    public Double getCompensatePayableYoy() 
    {
        return compensatePayableYoy;
    }
    public void setLongLoan(Double longLoan) 
    {
        this.longLoan = longLoan;
    }

    public Double getLongLoan() 
    {
        return longLoan;
    }
    public void setLongLoanYoy(Double longLoanYoy) 
    {
        this.longLoanYoy = longLoanYoy;
    }

    public Double getLongLoanYoy() 
    {
        return longLoanYoy;
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

    public InvFinanceZcfzInsurancePeriod() {
        super();
    }

    public InvFinanceZcfzInsurancePeriod(String securityCode) {
        this.securityCode = securityCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvFinanceZcfzInsurancePeriod)) return false;
        InvFinanceZcfzInsurancePeriod that = (InvFinanceZcfzInsurancePeriod) o;
        return Objects.equals(id, that.id) && Objects.equals(securityCode, that.securityCode) && Objects.equals(reportDate, that.reportDate) && Objects.equals(monetaryfunds, that.monetaryfunds) && Objects.equals(monetaryfundsYoy, that.monetaryfundsYoy) && Objects.equals(fvtplFinasset, that.fvtplFinasset) && Objects.equals(fvtplFinassetYoy, that.fvtplFinassetYoy) && Objects.equals(buyResaleFinasset, that.buyResaleFinasset) && Objects.equals(buyResaleFinassetYoy, that.buyResaleFinassetYoy) && Objects.equals(interestRece, that.interestRece) && Objects.equals(interestReceYoy, that.interestReceYoy) && Objects.equals(premiumRece, that.premiumRece) && Objects.equals(premiumReceYoy, that.premiumReceYoy) && Objects.equals(reinsureRece, that.reinsureRece) && Objects.equals(reinsureReceYoy, that.reinsureReceYoy) && Objects.equals(rudReserveRece, that.rudReserveRece) && Objects.equals(rudReserveReceYoy, that.rudReserveReceYoy) && Objects.equals(rucReserveRece, that.rucReserveRece) && Objects.equals(rucReserveReceYoy, that.rucReserveReceYoy) && Objects.equals(loanAdvance, that.loanAdvance) && Objects.equals(loanAdvanceYoy, that.loanAdvanceYoy) && Objects.equals(tradeFinassetNotfvtpl, that.tradeFinassetNotfvtpl) && Objects.equals(tradeFinassetNotfvtplYoy, that.tradeFinassetNotfvtplYoy) && Objects.equals(otherRece, that.otherRece) && Objects.equals(otherReceYoy, that.otherReceYoy) && Objects.equals(timeDeposit, that.timeDeposit) && Objects.equals(timeDepositYoy, that.timeDepositYoy) && Objects.equals(availableSaleFinasset, that.availableSaleFinasset) && Objects.equals(availableSaleFinassetYoy, that.availableSaleFinassetYoy) && Objects.equals(holdMaturityInvest, that.holdMaturityInvest) && Objects.equals(holdMaturityInvestYoy, that.holdMaturityInvestYoy) && Objects.equals(accountsRece, that.accountsRece) && Objects.equals(accountsReceYoy, that.accountsReceYoy) && Objects.equals(longEquityInvest, that.longEquityInvest) && Objects.equals(longEquityInvestYoy, that.longEquityInvestYoy) && Objects.equals(refundCapitalDeposit, that.refundCapitalDeposit) && Objects.equals(refundCapitalDepositYoy, that.refundCapitalDepositYoy) && Objects.equals(investRealestate, that.investRealestate) && Objects.equals(investRealestateYoy, that.investRealestateYoy) && Objects.equals(fixedAsset, that.fixedAsset) && Objects.equals(fixedAssetYoy, that.fixedAssetYoy) && Objects.equals(cip, that.cip) && Objects.equals(cipYoy, that.cipYoy) && Objects.equals(userightAsset, that.userightAsset) && Objects.equals(userightAssetYoy, that.userightAssetYoy) && Objects.equals(intangibleAsset, that.intangibleAsset) && Objects.equals(intangibleAssetYoy, that.intangibleAssetYoy) && Objects.equals(goodwill, that.goodwill) && Objects.equals(goodwillYoy, that.goodwillYoy) && Objects.equals(deferTaxAsset, that.deferTaxAsset) && Objects.equals(deferTaxAssetYoy, that.deferTaxAssetYoy) && Objects.equals(assetOther, that.assetOther) && Objects.equals(assetOtherYoy, that.assetOtherYoy) && Objects.equals(totalAssets, that.totalAssets) && Objects.equals(totalAssetsYoy, that.totalAssetsYoy) && Objects.equals(sellRepoFinasset, that.sellRepoFinasset) && Objects.equals(sellRepoFinassetYoy, that.sellRepoFinassetYoy) && Objects.equals(accountsPayable, that.accountsPayable) && Objects.equals(accountsPayableYoy, that.accountsPayableYoy) && Objects.equals(advanceRece, that.advanceRece) && Objects.equals(advanceReceYoy, that.advanceReceYoy) && Objects.equals(advancePremium, that.advancePremium) && Objects.equals(advancePremiumYoy, that.advancePremiumYoy) && Objects.equals(feeCommissionPayable, that.feeCommissionPayable) && Objects.equals(feeCommissionPayableYoy, that.feeCommissionPayableYoy) && Objects.equals(reinsurePayable, that.reinsurePayable) && Objects.equals(reinsurePayableYoy, that.reinsurePayableYoy) && Objects.equals(staffSalaryPayable, that.staffSalaryPayable) && Objects.equals(staffSalaryPayableYoy, that.staffSalaryPayableYoy) && Objects.equals(taxPayable, that.taxPayable) && Objects.equals(taxPayableYoy, that.taxPayableYoy) && Objects.equals(interestPayable, that.interestPayable) && Objects.equals(interestPayableYoy, that.interestPayableYoy) && Objects.equals(compensatePayable, that.compensatePayable) && Objects.equals(compensatePayableYoy, that.compensatePayableYoy) && Objects.equals(longLoan, that.longLoan) && Objects.equals(longLoanYoy, that.longLoanYoy) && Objects.equals(bondPayable, that.bondPayable) && Objects.equals(bondPayableYoy, that.bondPayableYoy) && Objects.equals(leaseLiab, that.leaseLiab) && Objects.equals(leaseLiabYoy, that.leaseLiabYoy) && Objects.equals(deferTaxLiab, that.deferTaxLiab) && Objects.equals(deferTaxLiabYoy, that.deferTaxLiabYoy) && Objects.equals(liabOther, that.liabOther) && Objects.equals(liabOtherYoy, that.liabOtherYoy) && Objects.equals(totalLiabilities, that.totalLiabilities) && Objects.equals(totalLiabilitiesYoy, that.totalLiabilitiesYoy) && Objects.equals(shareCapital, that.shareCapital) && Objects.equals(shareCapitalYoy, that.shareCapitalYoy) && Objects.equals(capitalReserve, that.capitalReserve) && Objects.equals(capitalReserveYoy, that.capitalReserveYoy) && Objects.equals(otherCompreIncome, that.otherCompreIncome) && Objects.equals(otherCompreIncomeYoy, that.otherCompreIncomeYoy) && Objects.equals(surplusReserve, that.surplusReserve) && Objects.equals(surplusReserveYoy, that.surplusReserveYoy) && Objects.equals(unassignRpofit, that.unassignRpofit) && Objects.equals(unassignRpofitYoy, that.unassignRpofitYoy) && Objects.equals(totalParentEquity, that.totalParentEquity) && Objects.equals(totalParentEquityYoy, that.totalParentEquityYoy) && Objects.equals(minorityEquity, that.minorityEquity) && Objects.equals(minorityEquityYoy, that.minorityEquityYoy) && Objects.equals(totalEquity, that.totalEquity) && Objects.equals(totalEquityYoy, that.totalEquityYoy) && Objects.equals(totalLiabEquity, that.totalLiabEquity) && Objects.equals(totalLiabEquityYoy, that.totalLiabEquityYoy) && Objects.equals(opinionType, that.opinionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, securityCode, reportDate, monetaryfunds, monetaryfundsYoy, fvtplFinasset, fvtplFinassetYoy, buyResaleFinasset, buyResaleFinassetYoy, interestRece, interestReceYoy, premiumRece, premiumReceYoy, reinsureRece, reinsureReceYoy, rudReserveRece, rudReserveReceYoy, rucReserveRece, rucReserveReceYoy, loanAdvance, loanAdvanceYoy, tradeFinassetNotfvtpl, tradeFinassetNotfvtplYoy, otherRece, otherReceYoy, timeDeposit, timeDepositYoy, availableSaleFinasset, availableSaleFinassetYoy, holdMaturityInvest, holdMaturityInvestYoy, accountsRece, accountsReceYoy, longEquityInvest, longEquityInvestYoy, refundCapitalDeposit, refundCapitalDepositYoy, investRealestate, investRealestateYoy, fixedAsset, fixedAssetYoy, cip, cipYoy, userightAsset, userightAssetYoy, intangibleAsset, intangibleAssetYoy, goodwill, goodwillYoy, deferTaxAsset, deferTaxAssetYoy, assetOther, assetOtherYoy, totalAssets, totalAssetsYoy, sellRepoFinasset, sellRepoFinassetYoy, accountsPayable, accountsPayableYoy, advanceRece, advanceReceYoy, advancePremium, advancePremiumYoy, feeCommissionPayable, feeCommissionPayableYoy, reinsurePayable, reinsurePayableYoy, staffSalaryPayable, staffSalaryPayableYoy, taxPayable, taxPayableYoy, interestPayable, interestPayableYoy, compensatePayable, compensatePayableYoy, longLoan, longLoanYoy, bondPayable, bondPayableYoy, leaseLiab, leaseLiabYoy, deferTaxLiab, deferTaxLiabYoy, liabOther, liabOtherYoy, totalLiabilities, totalLiabilitiesYoy, shareCapital, shareCapitalYoy, capitalReserve, capitalReserveYoy, otherCompreIncome, otherCompreIncomeYoy, surplusReserve, surplusReserveYoy, unassignRpofit, unassignRpofitYoy, totalParentEquity, totalParentEquityYoy, minorityEquity, minorityEquityYoy, totalEquity, totalEquityYoy, totalLiabEquity, totalLiabEquityYoy, opinionType);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("securityCode", getSecurityCode())
            .append("reportDate", getReportDate())
            .append("monetaryfunds", getMonetaryfunds())
            .append("monetaryfundsYoy", getMonetaryfundsYoy())
            .append("fvtplFinasset", getFvtplFinasset())
            .append("fvtplFinassetYoy", getFvtplFinassetYoy())
            .append("buyResaleFinasset", getBuyResaleFinasset())
            .append("buyResaleFinassetYoy", getBuyResaleFinassetYoy())
            .append("interestRece", getInterestRece())
            .append("interestReceYoy", getInterestReceYoy())
            .append("premiumRece", getPremiumRece())
            .append("premiumReceYoy", getPremiumReceYoy())
            .append("reinsureRece", getReinsureRece())
            .append("reinsureReceYoy", getReinsureReceYoy())
            .append("rudReserveRece", getRudReserveRece())
            .append("rudReserveReceYoy", getRudReserveReceYoy())
            .append("rucReserveRece", getRucReserveRece())
            .append("rucReserveReceYoy", getRucReserveReceYoy())
            .append("loanAdvance", getLoanAdvance())
            .append("loanAdvanceYoy", getLoanAdvanceYoy())
            .append("tradeFinassetNotfvtpl", getTradeFinassetNotfvtpl())
            .append("tradeFinassetNotfvtplYoy", getTradeFinassetNotfvtplYoy())
            .append("otherRece", getOtherRece())
            .append("otherReceYoy", getOtherReceYoy())
            .append("timeDeposit", getTimeDeposit())
            .append("timeDepositYoy", getTimeDepositYoy())
            .append("availableSaleFinasset", getAvailableSaleFinasset())
            .append("availableSaleFinassetYoy", getAvailableSaleFinassetYoy())
            .append("holdMaturityInvest", getHoldMaturityInvest())
            .append("holdMaturityInvestYoy", getHoldMaturityInvestYoy())
            .append("accountsRece", getAccountsRece())
            .append("accountsReceYoy", getAccountsReceYoy())
            .append("longEquityInvest", getLongEquityInvest())
            .append("longEquityInvestYoy", getLongEquityInvestYoy())
            .append("refundCapitalDeposit", getRefundCapitalDeposit())
            .append("refundCapitalDepositYoy", getRefundCapitalDepositYoy())
            .append("investRealestate", getInvestRealestate())
            .append("investRealestateYoy", getInvestRealestateYoy())
            .append("fixedAsset", getFixedAsset())
            .append("fixedAssetYoy", getFixedAssetYoy())
            .append("cip", getCip())
            .append("cipYoy", getCipYoy())
            .append("userightAsset", getUserightAsset())
            .append("userightAssetYoy", getUserightAssetYoy())
            .append("intangibleAsset", getIntangibleAsset())
            .append("intangibleAssetYoy", getIntangibleAssetYoy())
            .append("goodwill", getGoodwill())
            .append("goodwillYoy", getGoodwillYoy())
            .append("deferTaxAsset", getDeferTaxAsset())
            .append("deferTaxAssetYoy", getDeferTaxAssetYoy())
            .append("assetOther", getAssetOther())
            .append("assetOtherYoy", getAssetOtherYoy())
            .append("totalAssets", getTotalAssets())
            .append("totalAssetsYoy", getTotalAssetsYoy())
            .append("sellRepoFinasset", getSellRepoFinasset())
            .append("sellRepoFinassetYoy", getSellRepoFinassetYoy())
            .append("accountsPayable", getAccountsPayable())
            .append("accountsPayableYoy", getAccountsPayableYoy())
            .append("advanceRece", getAdvanceRece())
            .append("advanceReceYoy", getAdvanceReceYoy())
            .append("advancePremium", getAdvancePremium())
            .append("advancePremiumYoy", getAdvancePremiumYoy())
            .append("feeCommissionPayable", getFeeCommissionPayable())
            .append("feeCommissionPayableYoy", getFeeCommissionPayableYoy())
            .append("reinsurePayable", getReinsurePayable())
            .append("reinsurePayableYoy", getReinsurePayableYoy())
            .append("staffSalaryPayable", getStaffSalaryPayable())
            .append("staffSalaryPayableYoy", getStaffSalaryPayableYoy())
            .append("taxPayable", getTaxPayable())
            .append("taxPayableYoy", getTaxPayableYoy())
            .append("interestPayable", getInterestPayable())
            .append("interestPayableYoy", getInterestPayableYoy())
            .append("compensatePayable", getCompensatePayable())
            .append("compensatePayableYoy", getCompensatePayableYoy())
            .append("longLoan", getLongLoan())
            .append("longLoanYoy", getLongLoanYoy())
            .append("bondPayable", getBondPayable())
            .append("bondPayableYoy", getBondPayableYoy())
            .append("leaseLiab", getLeaseLiab())
            .append("leaseLiabYoy", getLeaseLiabYoy())
            .append("deferTaxLiab", getDeferTaxLiab())
            .append("deferTaxLiabYoy", getDeferTaxLiabYoy())
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
