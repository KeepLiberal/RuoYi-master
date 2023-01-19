package com.ruoyi.investment.domain;

import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 财务分析-杜邦分析对象 inv_finance_dbfx
 * 
 * @author yangwenyang
 * @date 2023-01-19
 */
public class InvFinanceDbfx extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /** id */
    private Integer id;

    /** 股票代码 */
    @Excel(name = "股票代码")
    private String securityCode;

    /** 报告类型 */
    @Excel(name = "报告类型")
    private String reportType;

    /** 报告日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "报告日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date reportDate;

    /** 净资产收益率(%) */
    @Excel(name = "净资产收益率(%)")
    private Double roe;

    /** 总资产净利率(%) */
    @Excel(name = "总资产净利率(%)")
    private Double jroa;

    /** 归属母公司股东的净利润占比(%) */
    @Excel(name = "归属母公司股东的净利润占比(%)")
    private Double parentNetprofitRatio;

    /** 权益乘数 */
    @Excel(name = "权益乘数")
    private Double equityMultiplier;

    /** 营业净利润率(%) */
    @Excel(name = "营业净利润率(%)")
    private Double saleNpr;

    /** 总资产周转率(%) */
    @Excel(name = "总资产周转率(%)")
    private Double totalAssetsTr;

    /** 资产负债率(%) */
    @Excel(name = "资产负债率(%)")
    private Double debtAssetRatio;

    /** 净利润 */
    @Excel(name = "净利润")
    private Double netprofit;

    /** 资产总额 */
    @Excel(name = "资产总额")
    private Double totalAssets;

    /** 负债总额 */
    @Excel(name = "负债总额")
    private Double totalLiabilities;

    /** 收入总额 */
    @Excel(name = "收入总额")
    private Double totalIncome;

    /** 成本总额 */
    @Excel(name = "成本总额")
    private Double totalCost;

    /** 流动资产 */
    @Excel(name = "流动资产")
    private Double totalCurrentAssets;

    /** 非流动资产 */
    @Excel(name = "非流动资产")
    private Double totalNoncurrentAssets;

    /** 营业成本 */
    @Excel(name = "营业成本")
    private Double operateCost;

    /** 期间费用 */
    @Excel(name = "期间费用")
    private Double totalExpense;

    /** 货币资金 */
    @Excel(name = "货币资金")
    private Double monetaryfunds;

    /** 债权投资 */
    @Excel(name = "债权投资")
    private Double creditorInvest;

    /** 使用权资产 */
    @Excel(name = "使用权资产")
    private Double userightAsset;

    /** 营业总收入 */
    @Excel(name = "营业总收入")
    private Double totalOperateIncome;

    /** 投资收益 */
    @Excel(name = "投资收益")
    private Double investIncome;

    /** 税金及附加 */
    @Excel(name = "税金及附加")
    private Double operateTaxAdd;

    /** 交易性金融资产 */
    @Excel(name = "交易性金融资产")
    private Double tradeFinasset;

    /** 其他债权投资 */
    @Excel(name = "其他债权投资")
    private Double otherCreditorInvest;

    /** 无形资产 */
    @Excel(name = "无形资产")
    private Double intangibleAsset;

    /** 公允价值变动收益 */
    @Excel(name = "公允价值变动收益")
    private Double fairvalueChangeIncome;

    /** 所得税费用 */
    @Excel(name = "所得税费用")
    private Double incomeTax;

    /** 财务费用 */
    @Excel(name = "财务费用")
    private Double financeExpense;

    /** 应收票据 */
    @Excel(name = "应收票据")
    private Double noteRece;

    /** 其他权益工具投资 */
    @Excel(name = "其他权益工具投资")
    private Double otherEquityInvest;

    /** 开发支出 */
    @Excel(name = "开发支出")
    private Double developExpense;

    /** 资产处置收益 */
    @Excel(name = "资产处置收益")
    private Double assetDisposalIncome;

    /** 资产减值损失 */
    @Excel(name = "资产减值损失")
    private Double assetImpairmentIncome;

    /** 销售费用 */
    @Excel(name = "销售费用")
    private Double saleExpense;

    /** 应收账款 */
    @Excel(name = "应收账款")
    private Double accountsRece;

    /** 长期应收款 */
    @Excel(name = "长期应收款")
    private Double longRece;

    /** 商誉 */
    @Excel(name = "商誉")
    private Double goodwill;

    /** 汇兑收益 */
    @Excel(name = "汇兑收益")
    private Double exchangeIncome;

    /** 信用减值损失 */
    @Excel(name = "信用减值损失")
    private Double creditImpairmentIncome;

    /** 管理费用 */
    @Excel(name = "管理费用")
    private Double manageExpense;

    /** 应收款项融资 */
    @Excel(name = "应收款项融资")
    private Double financeRece;

    /** 长期股权投资 */
    @Excel(name = "长期股权投资")
    private Double longEquityInvest;

    /** 长期待摊费用 */
    @Excel(name = "长期待摊费用")
    private Double longPrepaidExpense;

    /** 营业外支出 */
    @Excel(name = "营业外支出")
    private Double nonbusinessExpense;

    /** 研发费用 */
    @Excel(name = "研发费用")
    private Double researchExpense;

    /** 其他应收款 */
    @Excel(name = "其他应收款")
    private Double otherRece;

    /** 投资性房地产 */
    @Excel(name = "投资性房地产")
    private Double investRealestate;

    /** 递延所得税资产 */
    @Excel(name = "递延所得税资产")
    private Double deferTaxAsset;

    /** 存货 */
    @Excel(name = "存货")
    private Double inventory;

    /** 固定资产 */
    @Excel(name = "固定资产")
    private Double fixedAsset;

    /** 可供出售金融资产 */
    @Excel(name = "可供出售金融资产")
    private Double availableSaleFinasset;

    /** 在建工程 */
    @Excel(name = "在建工程")
    private Double cip;

    /** 持有至到期投资 */
    @Excel(name = "持有至到期投资")
    private Double holdMaturityInvest;

    /** 已赚保费 */
    @Excel(name = "已赚保费")
    private Double earnedPremium;

    /** 退保金 */
    @Excel(name = "退保金")
    private Double surrenderValue;

    /** 赔付支出 */
    @Excel(name = "赔付支出")
    private Double netCompensateExpense;

    /** 提取保险责任准备金 */
    @Excel(name = "提取保险责任准备金")
    private Double netContractReserve;

    /** 保单红利支出 */
    @Excel(name = "保单红利支出")
    private Double policyBonusExpense;

    /** 利息净收入 */
    @Excel(name = "利息净收入")
    private Double interestNi;

    /** 手续费及佣金净收入 */
    @Excel(name = "手续费及佣金净收入")
    private Double feeCommissionNi;

    /** 业务及管理费 */
    @Excel(name = "业务及管理费")
    private Double businessManageExpense;

    /** 手续费及佣金支出 */
    @Excel(name = "手续费及佣金支出")
    private Double feeCommissionExpense;

    /** 归属于母公司股东的净利润 */
    @Excel(name = "归属于母公司股东的净利润")
    private Double parentNetprofit;

    public void setId(Integer id){this.id = id;}
    public Integer getId(){return id;}

    public void setSecurityCode(String securityCode){this.securityCode = securityCode;}
    public String getSecurityCode(){return securityCode;}

    public void setReportType(String reportType){this.reportType = reportType;}
    public String getReportType(){return reportType;}

    public void setReportDate(Date reportDate){this.reportDate = reportDate;}
    public Date getReportDate(){return reportDate;}

    public void setRoe(Double roe){this.roe = roe;}
    public Double getRoe(){return roe;}

    public void setJroa(Double jroa){this.jroa = jroa;}
    public Double getJroa(){return jroa;}

    public void setParentNetprofitRatio(Double parentNetprofitRatio){this.parentNetprofitRatio = parentNetprofitRatio;}
    public Double getParentNetprofitRatio(){return parentNetprofitRatio;}

    public void setEquityMultiplier(Double equityMultiplier){this.equityMultiplier = equityMultiplier;}
    public Double getEquityMultiplier(){return equityMultiplier;}

    public void setSaleNpr(Double saleNpr){this.saleNpr = saleNpr;}
    public Double getSaleNpr(){return saleNpr;}

    public void setTotalAssetsTr(Double totalAssetsTr){this.totalAssetsTr = totalAssetsTr;}
    public Double getTotalAssetsTr(){return totalAssetsTr;}

    public void setDebtAssetRatio(Double debtAssetRatio){this.debtAssetRatio = debtAssetRatio;}
    public Double getDebtAssetRatio(){return debtAssetRatio;}

    public void setNetprofit(Double netprofit){this.netprofit = netprofit;}
    public Double getNetprofit(){return netprofit;}

    public void setTotalAssets(Double totalAssets){this.totalAssets = totalAssets;}
    public Double getTotalAssets(){return totalAssets;}

    public void setTotalLiabilities(Double totalLiabilities){this.totalLiabilities = totalLiabilities;}
    public Double getTotalLiabilities(){return totalLiabilities;}

    public void setTotalIncome(Double totalIncome){this.totalIncome = totalIncome;}
    public Double getTotalIncome(){return totalIncome;}

    public void setTotalCost(Double totalCost){this.totalCost = totalCost;}
    public Double getTotalCost(){return totalCost;}

    public void setTotalCurrentAssets(Double totalCurrentAssets){this.totalCurrentAssets = totalCurrentAssets;}
    public Double getTotalCurrentAssets(){return totalCurrentAssets;}

    public void setTotalNoncurrentAssets(Double totalNoncurrentAssets){this.totalNoncurrentAssets = totalNoncurrentAssets;}
    public Double getTotalNoncurrentAssets(){return totalNoncurrentAssets;}

    public void setOperateCost(Double operateCost){this.operateCost = operateCost;}
    public Double getOperateCost(){return operateCost;}

    public void setTotalExpense(Double totalExpense){this.totalExpense = totalExpense;}
    public Double getTotalExpense(){return totalExpense;}

    public void setMonetaryfunds(Double monetaryfunds){this.monetaryfunds = monetaryfunds;}
    public Double getMonetaryfunds(){return monetaryfunds;}

    public void setCreditorInvest(Double creditorInvest){this.creditorInvest = creditorInvest;}
    public Double getCreditorInvest(){return creditorInvest;}

    public void setUserightAsset(Double userightAsset){this.userightAsset = userightAsset;}
    public Double getUserightAsset(){return userightAsset;}

    public void setTotalOperateIncome(Double totalOperateIncome){this.totalOperateIncome = totalOperateIncome;}
    public Double getTotalOperateIncome(){return totalOperateIncome;}

    public void setInvestIncome(Double investIncome){this.investIncome = investIncome;}
    public Double getInvestIncome(){return investIncome;}

    public void setOperateTaxAdd(Double operateTaxAdd){this.operateTaxAdd = operateTaxAdd;}
    public Double getOperateTaxAdd(){return operateTaxAdd;}

    public void setTradeFinasset(Double tradeFinasset){this.tradeFinasset = tradeFinasset;}
    public Double getTradeFinasset(){return tradeFinasset;}

    public void setOtherCreditorInvest(Double otherCreditorInvest){this.otherCreditorInvest = otherCreditorInvest;}
    public Double getOtherCreditorInvest(){return otherCreditorInvest;}

    public void setIntangibleAsset(Double intangibleAsset){this.intangibleAsset = intangibleAsset;}
    public Double getIntangibleAsset(){return intangibleAsset;}

    public void setFairvalueChangeIncome(Double fairvalueChangeIncome){this.fairvalueChangeIncome = fairvalueChangeIncome;}
    public Double getFairvalueChangeIncome(){return fairvalueChangeIncome;}

    public void setIncomeTax(Double incomeTax){this.incomeTax = incomeTax;}
    public Double getIncomeTax(){return incomeTax;}

    public void setFinanceExpense(Double financeExpense){this.financeExpense = financeExpense;}
    public Double getFinanceExpense(){return financeExpense;}

    public void setNoteRece(Double noteRece){this.noteRece = noteRece;}
    public Double getNoteRece(){return noteRece;}

    public void setOtherEquityInvest(Double otherEquityInvest){this.otherEquityInvest = otherEquityInvest;}
    public Double getOtherEquityInvest(){return otherEquityInvest;}

    public void setDevelopExpense(Double developExpense){this.developExpense = developExpense;}
    public Double getDevelopExpense(){return developExpense;}

    public void setAssetDisposalIncome(Double assetDisposalIncome){this.assetDisposalIncome = assetDisposalIncome;}
    public Double getAssetDisposalIncome(){return assetDisposalIncome;}

    public void setAssetImpairmentIncome(Double assetImpairmentIncome){this.assetImpairmentIncome = assetImpairmentIncome;}
    public Double getAssetImpairmentIncome(){return assetImpairmentIncome;}

    public void setSaleExpense(Double saleExpense){this.saleExpense = saleExpense;}
    public Double getSaleExpense(){return saleExpense;}

    public void setAccountsRece(Double accountsRece){this.accountsRece = accountsRece;}
    public Double getAccountsRece(){return accountsRece;}

    public void setLongRece(Double longRece){this.longRece = longRece;}
    public Double getLongRece(){return longRece;}

    public void setGoodwill(Double goodwill){this.goodwill = goodwill;}
    public Double getGoodwill(){return goodwill;}

    public void setExchangeIncome(Double exchangeIncome){this.exchangeIncome = exchangeIncome;}
    public Double getExchangeIncome(){return exchangeIncome;}

    public void setCreditImpairmentIncome(Double creditImpairmentIncome){this.creditImpairmentIncome = creditImpairmentIncome;}
    public Double getCreditImpairmentIncome(){return creditImpairmentIncome;}

    public void setManageExpense(Double manageExpense){this.manageExpense = manageExpense;}
    public Double getManageExpense(){return manageExpense;}

    public void setFinanceRece(Double financeRece){this.financeRece = financeRece;}
    public Double getFinanceRece(){return financeRece;}

    public void setLongEquityInvest(Double longEquityInvest){this.longEquityInvest = longEquityInvest;}
    public Double getLongEquityInvest(){return longEquityInvest;}

    public void setLongPrepaidExpense(Double longPrepaidExpense){this.longPrepaidExpense = longPrepaidExpense;}
    public Double getLongPrepaidExpense(){return longPrepaidExpense;}

    public void setNonbusinessExpense(Double nonbusinessExpense){this.nonbusinessExpense = nonbusinessExpense;}
    public Double getNonbusinessExpense(){return nonbusinessExpense;}

    public void setResearchExpense(Double researchExpense){this.researchExpense = researchExpense;}
    public Double getResearchExpense(){return researchExpense;}

    public void setOtherRece(Double otherRece){this.otherRece = otherRece;}
    public Double getOtherRece(){return otherRece;}

    public void setInvestRealestate(Double investRealestate){this.investRealestate = investRealestate;}
    public Double getInvestRealestate(){return investRealestate;}

    public void setDeferTaxAsset(Double deferTaxAsset){this.deferTaxAsset = deferTaxAsset;}
    public Double getDeferTaxAsset(){return deferTaxAsset;}

    public void setInventory(Double inventory){this.inventory = inventory;}
    public Double getInventory(){return inventory;}

    public void setFixedAsset(Double fixedAsset){this.fixedAsset = fixedAsset;}
    public Double getFixedAsset(){return fixedAsset;}

    public void setAvailableSaleFinasset(Double availableSaleFinasset){this.availableSaleFinasset = availableSaleFinasset;}
    public Double getAvailableSaleFinasset(){return availableSaleFinasset;}

    public void setCip(Double cip){this.cip = cip;}
    public Double getCip(){return cip;}

    public void setHoldMaturityInvest(Double holdMaturityInvest){this.holdMaturityInvest = holdMaturityInvest;}
    public Double getHoldMaturityInvest(){return holdMaturityInvest;}

    public void setEarnedPremium(Double earnedPremium){this.earnedPremium = earnedPremium;}
    public Double getEarnedPremium(){return earnedPremium;}

    public void setSurrenderValue(Double surrenderValue){this.surrenderValue = surrenderValue;}
    public Double getSurrenderValue(){return surrenderValue;}

    public void setNetCompensateExpense(Double netCompensateExpense){this.netCompensateExpense = netCompensateExpense;}
    public Double getNetCompensateExpense(){return netCompensateExpense;}

    public void setNetContractReserve(Double netContractReserve){this.netContractReserve = netContractReserve;}
    public Double getNetContractReserve(){return netContractReserve;}

    public void setPolicyBonusExpense(Double policyBonusExpense){this.policyBonusExpense = policyBonusExpense;}
    public Double getPolicyBonusExpense(){return policyBonusExpense;}

    public void setInterestNi(Double interestNi){this.interestNi = interestNi;}
    public Double getInterestNi(){return interestNi;}

    public void setFeeCommissionNi(Double feeCommissionNi){this.feeCommissionNi = feeCommissionNi;}
    public Double getFeeCommissionNi(){return feeCommissionNi;}

    public void setBusinessManageExpense(Double businessManageExpense){this.businessManageExpense = businessManageExpense;}
    public Double getBusinessManageExpense(){return businessManageExpense;}

    public void setFeeCommissionExpense(Double feeCommissionExpense){this.feeCommissionExpense = feeCommissionExpense;}
    public Double getFeeCommissionExpense(){return feeCommissionExpense;}

    public void setParentNetprofit(Double parentNetprofit){this.parentNetprofit = parentNetprofit;}
    public Double getParentNetprofit(){return parentNetprofit;}

    public InvFinanceDbfx() {
        super();
    }

    public InvFinanceDbfx(String securityCode, String reportType) {
        this.securityCode = securityCode;
        this.reportType = reportType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvFinanceDbfx)) return false;
        InvFinanceDbfx that = (InvFinanceDbfx) o;
        return Objects.equals(securityCode, that.securityCode) && Objects.equals(reportType, that.reportType) && Objects.equals(reportDate, that.reportDate) && Objects.equals(roe, that.roe) && Objects.equals(jroa, that.jroa) && Objects.equals(parentNetprofitRatio, that.parentNetprofitRatio) && Objects.equals(equityMultiplier, that.equityMultiplier) && Objects.equals(saleNpr, that.saleNpr) && Objects.equals(totalAssetsTr, that.totalAssetsTr) && Objects.equals(debtAssetRatio, that.debtAssetRatio) && Objects.equals(netprofit, that.netprofit) && Objects.equals(totalAssets, that.totalAssets) && Objects.equals(totalLiabilities, that.totalLiabilities) && Objects.equals(totalIncome, that.totalIncome) && Objects.equals(totalCost, that.totalCost) && Objects.equals(totalCurrentAssets, that.totalCurrentAssets) && Objects.equals(totalNoncurrentAssets, that.totalNoncurrentAssets) && Objects.equals(operateCost, that.operateCost) && Objects.equals(totalExpense, that.totalExpense) && Objects.equals(monetaryfunds, that.monetaryfunds) && Objects.equals(creditorInvest, that.creditorInvest) && Objects.equals(userightAsset, that.userightAsset) && Objects.equals(totalOperateIncome, that.totalOperateIncome) && Objects.equals(investIncome, that.investIncome) && Objects.equals(operateTaxAdd, that.operateTaxAdd) && Objects.equals(tradeFinasset, that.tradeFinasset) && Objects.equals(otherCreditorInvest, that.otherCreditorInvest) && Objects.equals(intangibleAsset, that.intangibleAsset) && Objects.equals(fairvalueChangeIncome, that.fairvalueChangeIncome) && Objects.equals(incomeTax, that.incomeTax) && Objects.equals(financeExpense, that.financeExpense) && Objects.equals(noteRece, that.noteRece) && Objects.equals(otherEquityInvest, that.otherEquityInvest) && Objects.equals(developExpense, that.developExpense) && Objects.equals(assetDisposalIncome, that.assetDisposalIncome) && Objects.equals(assetImpairmentIncome, that.assetImpairmentIncome) && Objects.equals(saleExpense, that.saleExpense) && Objects.equals(accountsRece, that.accountsRece) && Objects.equals(longRece, that.longRece) && Objects.equals(goodwill, that.goodwill) && Objects.equals(exchangeIncome, that.exchangeIncome) && Objects.equals(creditImpairmentIncome, that.creditImpairmentIncome) && Objects.equals(manageExpense, that.manageExpense) && Objects.equals(financeRece, that.financeRece) && Objects.equals(longEquityInvest, that.longEquityInvest) && Objects.equals(longPrepaidExpense, that.longPrepaidExpense) && Objects.equals(nonbusinessExpense, that.nonbusinessExpense) && Objects.equals(researchExpense, that.researchExpense) && Objects.equals(otherRece, that.otherRece) && Objects.equals(investRealestate, that.investRealestate) && Objects.equals(deferTaxAsset, that.deferTaxAsset) && Objects.equals(inventory, that.inventory) && Objects.equals(fixedAsset, that.fixedAsset) && Objects.equals(availableSaleFinasset, that.availableSaleFinasset) && Objects.equals(cip, that.cip) && Objects.equals(holdMaturityInvest, that.holdMaturityInvest) && Objects.equals(earnedPremium, that.earnedPremium) && Objects.equals(surrenderValue, that.surrenderValue) && Objects.equals(netCompensateExpense, that.netCompensateExpense) && Objects.equals(netContractReserve, that.netContractReserve) && Objects.equals(policyBonusExpense, that.policyBonusExpense) && Objects.equals(interestNi, that.interestNi) && Objects.equals(feeCommissionNi, that.feeCommissionNi) && Objects.equals(businessManageExpense, that.businessManageExpense) && Objects.equals(feeCommissionExpense, that.feeCommissionExpense) && Objects.equals(parentNetprofit, that.parentNetprofit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityCode, reportType, reportDate, roe, jroa, parentNetprofitRatio, equityMultiplier, saleNpr, totalAssetsTr, debtAssetRatio, netprofit, totalAssets, totalLiabilities, totalIncome, totalCost, totalCurrentAssets, totalNoncurrentAssets, operateCost, totalExpense, monetaryfunds, creditorInvest, userightAsset, totalOperateIncome, investIncome, operateTaxAdd, tradeFinasset, otherCreditorInvest, intangibleAsset, fairvalueChangeIncome, incomeTax, financeExpense, noteRece, otherEquityInvest, developExpense, assetDisposalIncome, assetImpairmentIncome, saleExpense, accountsRece, longRece, goodwill, exchangeIncome, creditImpairmentIncome, manageExpense, financeRece, longEquityInvest, longPrepaidExpense, nonbusinessExpense, researchExpense, otherRece, investRealestate, deferTaxAsset, inventory, fixedAsset, availableSaleFinasset, cip, holdMaturityInvest, earnedPremium, surrenderValue, netCompensateExpense, netContractReserve, policyBonusExpense, interestNi, feeCommissionNi, businessManageExpense, feeCommissionExpense, parentNetprofit);
    }

}
