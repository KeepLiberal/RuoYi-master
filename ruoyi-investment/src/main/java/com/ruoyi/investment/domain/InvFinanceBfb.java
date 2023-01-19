package com.ruoyi.investment.domain;

import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 财务分析-百分比对象 inv_finance_bfb
 * 
 * @author yangwenyang
 * @date 2023-01-19
 */
public class InvFinanceBfb extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /** ID */
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

    /** 总资产 */
    @Excel(name = "总资产")
    private Double totalAssets;

    /** 一、营业收入(元) */
    @Excel(name = "一、营业收入(元)")
    private Double operateIncome;

    /** 流动资产 */
    @Excel(name = "流动资产")
    private Double totalCurrentAssets;

    /** 利息净收入(元) */
    @Excel(name = "利息净收入(元)")
    private Double interestNi;

    /** 手续费及佣金净收入(元) */
    @Excel(name = "手续费及佣金净收入(元)")
    private Double feeCommissionNi;

    /** 非流动资产 */
    @Excel(name = "非流动资产")
    private Double totalNoncurrentAssets;

    /** 投资收益(元) */
    @Excel(name = "投资收益(元)")
    private Double investIncome;

    /** 总负债金额 */
    @Excel(name = "总负债金额")
    private Double totalLiabilities;

    /** 公允价值变动收益(元) */
    @Excel(name = "公允价值变动收益(元)")
    private Double fairvalueChangeIncome;

    /** 流动负债 */
    @Excel(name = "流动负债")
    private Double totalCurrentLiab;

    /** 汇兑收益(元) */
    @Excel(name = "汇兑收益(元)")
    private Double exchangeIncome;

    /** 其他业务收入(元) */
    @Excel(name = "其他业务收入(元)")
    private Double otherBusinessIncome;

    /** 非流动负债 */
    @Excel(name = "非流动负债")
    private Double totalNoncurrentLiab;

    /** 资产处置收益(元) */
    @Excel(name = "资产处置收益(元)")
    private Double assetDisposalIncome;

    /** 其他收益(元) */
    @Excel(name = "其他收益(元)")
    private Double otherIncome;

    /** 二、营业支出(元) */
    @Excel(name = "二、营业支出(元)")
    private Double operateExpense;

    /** 税金及附加(元) */
    @Excel(name = "税金及附加(元)")
    private Double operateTaxAdd;

    /** 业务及管理费(元) */
    @Excel(name = "业务及管理费(元)")
    private Double businessManageExpense;

    /** 资产减值损失(元) */
    @Excel(name = "资产减值损失(元)")
    private Double assetImpairmentLoss;

    /** 信用减值损失(元) */
    @Excel(name = "信用减值损失(元)")
    private Double creditImpairmentLoss;

    /** 其他业务成本(元) */
    @Excel(name = "其他业务成本(元)")
    private Double otherBusinessCost;

    /** 三、营业利润(元) */
    @Excel(name = "三、营业利润(元)")
    private Double operateProfit;

    /** 加:营业外收入(元) */
    @Excel(name = "加:营业外收入(元)")
    private Double nonbusinessIncome;

    /** 减:营业外支出(元) */
    @Excel(name = "减:营业外支出(元)")
    private Double nonbusinessExpense;

    /** 四、利润总额(元) */
    @Excel(name = "四、利润总额(元)")
    private Double totalProfit;

    /** 减:所得税费用(元) */
    @Excel(name = "减:所得税费用(元)")
    private Double incomeTax;

    /** 五、净利润(元) */
    @Excel(name = "五、净利润(元)")
    private Double netprofit;

    /** 一、营业总收入(元) */
    @Excel(name = "一、营业总收入(元)")
    private Double totalOperateIncome;

    /** 二、营业总成本(元) */
    @Excel(name = "二、营业总成本(元)")
    private Double totalOperateCost;

    /** 营业成本(元) */
    @Excel(name = "营业成本(元)")
    private Double operateCost;

    /** 期间费用(元) */
    @Excel(name = "期间费用(元)")
    private Double totalExpense;

    /** 销售费用(元) */
    @Excel(name = "销售费用(元)")
    private Double saleExpense;

    /** 管理费用(元) */
    @Excel(name = "管理费用(元)")
    private Double manageExpense;

    /** 研发费用(元) */
    @Excel(name = "研发费用(元)")
    private Double researchExpense;

    /** 财务费用(元) */
    @Excel(name = "财务费用(元)")
    private Double financeExpense;

    /** 信用减值损失(元) */
    @Excel(name = "信用减值损失(元)")
    private Double creditImpairmentIncome;

    /** 资产减值损失(元) */
    @Excel(name = "资产减值损失(元)")
    private Double assetImpairmentIncome;

    /** 已赚保费(元) */
    @Excel(name = "已赚保费(元)")
    private Double earnedPremium;

    /** 公允价值变动收益(元) */
    @Excel(name = "公允价值变动收益(元)")
    private Double fairvalueChange;

    /** 退保金(元) */
    @Excel(name = "退保金(元)")
    private Double surrenderValue;

    /** 赔付支出(元) */
    @Excel(name = "赔付支出(元)")
    private Double compensateExpense;

    /** 减:摊回赔付支出(元) */
    @Excel(name = "减:摊回赔付支出(元)")
    private Double amortizeCompensateExpense;

    /** 提取保险责任准备金(元) */
    @Excel(name = "提取保险责任准备金(元)")
    private Double extractInsuranceReserve;

    /** 减:摊回保险责任准备金(元) */
    @Excel(name = "减:摊回保险责任准备金(元)")
    private Double amortizeInsuranceReserve;

    /** 保单红利支出(元) */
    @Excel(name = "保单红利支出(元)")
    private Double policyBonusExpense;

    /** 手续费及佣金支出(元) */
    @Excel(name = "手续费及佣金支出(元)")
    private Double feeCommissionExpense;

    public void setId(Integer id){this.id = id;}
    public Integer getId(){return id;}

    public void setSecurityCode(String securityCode){this.securityCode = securityCode;}
    public String getSecurityCode(){return securityCode;}

    public void setReportType(String reportType){this.reportType = reportType;}
    public String getReportType(){return reportType;}

    public void setReportDate(Date reportDate){this.reportDate = reportDate;}
    public Date getReportDate(){return reportDate;}

    public void setTotalAssets(Double totalAssets){this.totalAssets = totalAssets;}
    public Double getTotalAssets(){return totalAssets;}

    public void setOperateIncome(Double operateIncome){this.operateIncome = operateIncome;}
    public Double getOperateIncome(){return operateIncome;}

    public void setTotalCurrentAssets(Double totalCurrentAssets){this.totalCurrentAssets = totalCurrentAssets;}
    public Double getTotalCurrentAssets(){return totalCurrentAssets;}

    public void setInterestNi(Double interestNi){this.interestNi = interestNi;}
    public Double getInterestNi(){return interestNi;}

    public void setFeeCommissionNi(Double feeCommissionNi){this.feeCommissionNi = feeCommissionNi;}
    public Double getFeeCommissionNi(){return feeCommissionNi;}

    public void setTotalNoncurrentAssets(Double totalNoncurrentAssets){this.totalNoncurrentAssets = totalNoncurrentAssets;}
    public Double getTotalNoncurrentAssets(){return totalNoncurrentAssets;}

    public void setInvestIncome(Double investIncome){this.investIncome = investIncome;}
    public Double getInvestIncome(){return investIncome;}

    public void setTotalLiabilities(Double totalLiabilities){this.totalLiabilities = totalLiabilities;}
    public Double getTotalLiabilities(){return totalLiabilities;}

    public void setFairvalueChangeIncome(Double fairvalueChangeIncome){this.fairvalueChangeIncome = fairvalueChangeIncome;}
    public Double getFairvalueChangeIncome(){return fairvalueChangeIncome;}

    public void setTotalCurrentLiab(Double totalCurrentLiab){this.totalCurrentLiab = totalCurrentLiab;}
    public Double getTotalCurrentLiab(){return totalCurrentLiab;}

    public void setExchangeIncome(Double exchangeIncome){this.exchangeIncome = exchangeIncome;}
    public Double getExchangeIncome(){return exchangeIncome;}

    public void setOtherBusinessIncome(Double otherBusinessIncome){this.otherBusinessIncome = otherBusinessIncome;}
    public Double getOtherBusinessIncome(){return otherBusinessIncome;}

    public void setTotalNoncurrentLiab(Double totalNoncurrentLiab){this.totalNoncurrentLiab = totalNoncurrentLiab;}
    public Double getTotalNoncurrentLiab(){return totalNoncurrentLiab;}

    public void setAssetDisposalIncome(Double assetDisposalIncome){this.assetDisposalIncome = assetDisposalIncome;}
    public Double getAssetDisposalIncome(){return assetDisposalIncome;}

    public void setOtherIncome(Double otherIncome){this.otherIncome = otherIncome;}
    public Double getOtherIncome(){return otherIncome;}

    public void setOperateExpense(Double operateExpense){this.operateExpense = operateExpense;}
    public Double getOperateExpense(){return operateExpense;}

    public void setOperateTaxAdd(Double operateTaxAdd){this.operateTaxAdd = operateTaxAdd;}
    public Double getOperateTaxAdd(){return operateTaxAdd;}

    public void setBusinessManageExpense(Double businessManageExpense){this.businessManageExpense = businessManageExpense;}
    public Double getBusinessManageExpense(){return businessManageExpense;}

    public void setAssetImpairmentLoss(Double assetImpairmentLoss){this.assetImpairmentLoss = assetImpairmentLoss;}
    public Double getAssetImpairmentLoss(){return assetImpairmentLoss;}

    public void setCreditImpairmentLoss(Double creditImpairmentLoss){this.creditImpairmentLoss = creditImpairmentLoss;}
    public Double getCreditImpairmentLoss(){return creditImpairmentLoss;}

    public void setOtherBusinessCost(Double otherBusinessCost){this.otherBusinessCost = otherBusinessCost;}
    public Double getOtherBusinessCost(){return otherBusinessCost;}

    public void setOperateProfit(Double operateProfit){this.operateProfit = operateProfit;}
    public Double getOperateProfit(){return operateProfit;}

    public void setNonbusinessIncome(Double nonbusinessIncome){this.nonbusinessIncome = nonbusinessIncome;}
    public Double getNonbusinessIncome(){return nonbusinessIncome;}

    public void setNonbusinessExpense(Double nonbusinessExpense){this.nonbusinessExpense = nonbusinessExpense;}
    public Double getNonbusinessExpense(){return nonbusinessExpense;}

    public void setTotalProfit(Double totalProfit){this.totalProfit = totalProfit;}
    public Double getTotalProfit(){return totalProfit;}

    public void setIncomeTax(Double incomeTax){this.incomeTax = incomeTax;}
    public Double getIncomeTax(){return incomeTax;}

    public void setNetprofit(Double netprofit){this.netprofit = netprofit;}
    public Double getNetprofit(){return netprofit;}

    public void setTotalOperateIncome(Double totalOperateIncome){this.totalOperateIncome = totalOperateIncome;}
    public Double getTotalOperateIncome(){return totalOperateIncome;}

    public void setTotalOperateCost(Double totalOperateCost){this.totalOperateCost = totalOperateCost;}
    public Double getTotalOperateCost(){return totalOperateCost;}

    public void setOperateCost(Double operateCost){this.operateCost = operateCost;}
    public Double getOperateCost(){return operateCost;}

    public void setTotalExpense(Double totalExpense){this.totalExpense = totalExpense;}
    public Double getTotalExpense(){return totalExpense;}

    public void setSaleExpense(Double saleExpense){this.saleExpense = saleExpense;}
    public Double getSaleExpense(){return saleExpense;}

    public void setManageExpense(Double manageExpense){this.manageExpense = manageExpense;}
    public Double getManageExpense(){return manageExpense;}

    public void setResearchExpense(Double researchExpense){this.researchExpense = researchExpense;}
    public Double getResearchExpense(){return researchExpense;}

    public void setFinanceExpense(Double financeExpense){this.financeExpense = financeExpense;}
    public Double getFinanceExpense(){return financeExpense;}

    public void setCreditImpairmentIncome(Double creditImpairmentIncome){this.creditImpairmentIncome = creditImpairmentIncome;}
    public Double getCreditImpairmentIncome(){return creditImpairmentIncome;}

    public void setAssetImpairmentIncome(Double assetImpairmentIncome){this.assetImpairmentIncome = assetImpairmentIncome;}
    public Double getAssetImpairmentIncome(){return assetImpairmentIncome;}

    public void setEarnedPremium(Double earnedPremium){this.earnedPremium = earnedPremium;}
    public Double getEarnedPremium(){return earnedPremium;}

    public void setFairvalueChange(Double fairvalueChange){this.fairvalueChange = fairvalueChange;}
    public Double getFairvalueChange(){return fairvalueChange;}

    public void setSurrenderValue(Double surrenderValue){this.surrenderValue = surrenderValue;}
    public Double getSurrenderValue(){return surrenderValue;}

    public void setCompensateExpense(Double compensateExpense){this.compensateExpense = compensateExpense;}
    public Double getCompensateExpense(){return compensateExpense;}

    public void setAmortizeCompensateExpense(Double amortizeCompensateExpense){this.amortizeCompensateExpense = amortizeCompensateExpense;}
    public Double getAmortizeCompensateExpense(){return amortizeCompensateExpense;}

    public void setExtractInsuranceReserve(Double extractInsuranceReserve){this.extractInsuranceReserve = extractInsuranceReserve;}
    public Double getExtractInsuranceReserve(){return extractInsuranceReserve;}

    public void setAmortizeInsuranceReserve(Double amortizeInsuranceReserve){this.amortizeInsuranceReserve = amortizeInsuranceReserve;}
    public Double getAmortizeInsuranceReserve(){return amortizeInsuranceReserve;}

    public void setPolicyBonusExpense(Double policyBonusExpense){this.policyBonusExpense = policyBonusExpense;}
    public Double getPolicyBonusExpense(){return policyBonusExpense;}

    public void setFeeCommissionExpense(Double feeCommissionExpense){this.feeCommissionExpense = feeCommissionExpense;}
    public Double getFeeCommissionExpense(){return feeCommissionExpense;}

    public InvFinanceBfb() {
        super();
    }

    public InvFinanceBfb(String securityCode, String reportType) {
        this.securityCode = securityCode;
        this.reportType = reportType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvFinanceBfb)) return false;
        InvFinanceBfb that = (InvFinanceBfb) o;
        return Objects.equals(securityCode, that.securityCode) && Objects.equals(reportType, that.reportType) && Objects.equals(reportDate, that.reportDate) && Objects.equals(totalAssets, that.totalAssets) && Objects.equals(operateIncome, that.operateIncome) && Objects.equals(totalCurrentAssets, that.totalCurrentAssets) && Objects.equals(interestNi, that.interestNi) && Objects.equals(feeCommissionNi, that.feeCommissionNi) && Objects.equals(totalNoncurrentAssets, that.totalNoncurrentAssets) && Objects.equals(investIncome, that.investIncome) && Objects.equals(totalLiabilities, that.totalLiabilities) && Objects.equals(fairvalueChangeIncome, that.fairvalueChangeIncome) && Objects.equals(totalCurrentLiab, that.totalCurrentLiab) && Objects.equals(exchangeIncome, that.exchangeIncome) && Objects.equals(otherBusinessIncome, that.otherBusinessIncome) && Objects.equals(totalNoncurrentLiab, that.totalNoncurrentLiab) && Objects.equals(assetDisposalIncome, that.assetDisposalIncome) && Objects.equals(otherIncome, that.otherIncome) && Objects.equals(operateExpense, that.operateExpense) && Objects.equals(operateTaxAdd, that.operateTaxAdd) && Objects.equals(businessManageExpense, that.businessManageExpense) && Objects.equals(assetImpairmentLoss, that.assetImpairmentLoss) && Objects.equals(creditImpairmentLoss, that.creditImpairmentLoss) && Objects.equals(otherBusinessCost, that.otherBusinessCost) && Objects.equals(operateProfit, that.operateProfit) && Objects.equals(nonbusinessIncome, that.nonbusinessIncome) && Objects.equals(nonbusinessExpense, that.nonbusinessExpense) && Objects.equals(totalProfit, that.totalProfit) && Objects.equals(incomeTax, that.incomeTax) && Objects.equals(netprofit, that.netprofit) && Objects.equals(totalOperateIncome, that.totalOperateIncome) && Objects.equals(totalOperateCost, that.totalOperateCost) && Objects.equals(operateCost, that.operateCost) && Objects.equals(totalExpense, that.totalExpense) && Objects.equals(saleExpense, that.saleExpense) && Objects.equals(manageExpense, that.manageExpense) && Objects.equals(researchExpense, that.researchExpense) && Objects.equals(financeExpense, that.financeExpense) && Objects.equals(creditImpairmentIncome, that.creditImpairmentIncome) && Objects.equals(assetImpairmentIncome, that.assetImpairmentIncome) && Objects.equals(earnedPremium, that.earnedPremium) && Objects.equals(fairvalueChange, that.fairvalueChange) && Objects.equals(surrenderValue, that.surrenderValue) && Objects.equals(compensateExpense, that.compensateExpense) && Objects.equals(amortizeCompensateExpense, that.amortizeCompensateExpense) && Objects.equals(extractInsuranceReserve, that.extractInsuranceReserve) && Objects.equals(amortizeInsuranceReserve, that.amortizeInsuranceReserve) && Objects.equals(policyBonusExpense, that.policyBonusExpense) && Objects.equals(feeCommissionExpense, that.feeCommissionExpense);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityCode, reportType, reportDate, totalAssets, operateIncome, totalCurrentAssets, interestNi, feeCommissionNi, totalNoncurrentAssets, investIncome, totalLiabilities, fairvalueChangeIncome, totalCurrentLiab, exchangeIncome, otherBusinessIncome, totalNoncurrentLiab, assetDisposalIncome, otherIncome, operateExpense, operateTaxAdd, businessManageExpense, assetImpairmentLoss, creditImpairmentLoss, otherBusinessCost, operateProfit, nonbusinessIncome, nonbusinessExpense, totalProfit, incomeTax, netprofit, totalOperateIncome, totalOperateCost, operateCost, totalExpense, saleExpense, manageExpense, researchExpense, financeExpense, creditImpairmentIncome, assetImpairmentIncome, earnedPremium, fairvalueChange, surrenderValue, compensateExpense, amortizeCompensateExpense, extractInsuranceReserve, amortizeInsuranceReserve, policyBonusExpense, feeCommissionExpense);
    }

}
