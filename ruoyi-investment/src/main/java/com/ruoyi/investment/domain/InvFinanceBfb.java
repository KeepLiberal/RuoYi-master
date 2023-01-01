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
 * @date 2023-01-01
 */
public class InvFinanceBfb extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

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

    /** 营业收入 */
    @Excel(name = "营业收入")
    private Double operateIncome;

    /** 营业收入(占比%) */
    @Excel(name = "营业收入(占比%)")
    private Double operateIncomeYoy;

    /** 利息净收入 */
    @Excel(name = "利息净收入")
    private Double interestNi;

    /** 利息净收入(占比%) */
    @Excel(name = "利息净收入(占比%)")
    private Double interestNiYoy;

    /** 手续费及佣金净收入 */
    @Excel(name = "手续费及佣金净收入")
    private Double feeCommissionNi;

    /** 手续费及佣金净收入(占比%) */
    @Excel(name = "手续费及佣金净收入(占比%)")
    private Double feeCommissionNiYoy;

    /** 投资收益 */
    @Excel(name = "投资收益")
    private Double investIncome;

    /** 投资收益(占比%) */
    @Excel(name = "投资收益(占比%)")
    private Double investIncomeYoy;

    /** 公允价值变动收益 */
    @Excel(name = "公允价值变动收益")
    private Double fairvalueChangeIncome;

    /** 公允价值变动收益(占比%) */
    @Excel(name = "公允价值变动收益(占比%)")
    private Double fairvalueChangeIncomeYoy;

    /** 汇兑收益 */
    @Excel(name = "汇兑收益")
    private Double exchangeIncome;

    /** 汇兑收益(占比%) */
    @Excel(name = "汇兑收益(占比%)")
    private Double exchangeIncomeYoy;

    /** 其他业务收入 */
    @Excel(name = "其他业务收入")
    private Double otherBusinessIncome;

    /** 其他业务收入(占比%) */
    @Excel(name = "其他业务收入(占比%)")
    private Double otherBusinessIncomeYoy;

    /** 资产处置收益 */
    @Excel(name = "资产处置收益")
    private Double assetDisposalIncome;

    /** 资产处置收益(占比%) */
    @Excel(name = "资产处置收益(占比%)")
    private Double assetDisposalIncomeYoy;

    /** 其他收益 */
    @Excel(name = "其他收益")
    private Double otherIncome;

    /** 其他收益(占比%) */
    @Excel(name = "其他收益(占比%)")
    private Double otherIncomeYoy;

    /** 营业支出 */
    @Excel(name = "营业支出")
    private Double operateExpense;

    /** 营业支出(占比%) */
    @Excel(name = "营业支出(占比%)")
    private Double operateExpenseYoy;

    /** 税金及附加 */
    @Excel(name = "税金及附加")
    private Double operateTaxAdd;

    /** 税金及附加(占比%) */
    @Excel(name = "税金及附加(占比%)")
    private Double operateTaxAddYoy;

    /** 业务及管理费 */
    @Excel(name = "业务及管理费")
    private Double businessManageExpense;

    /** 业务及管理费(占比%) */
    @Excel(name = "业务及管理费(占比%)")
    private Double businessManageExpenseYoy;

    /** 资产减值损失 */
    @Excel(name = "资产减值损失")
    private Double assetImpairmentLoss;

    /** 资产减值损失(占比%) */
    @Excel(name = "资产减值损失(占比%)")
    private Double assetImpairmentLossYoy;

    /** 信用减值损失 */
    @Excel(name = "信用减值损失")
    private Double creditImpairmentLoss;

    /** 信用减值损失(占比%) */
    @Excel(name = "信用减值损失(占比%)")
    private Double creditImpairmentLossYoy;

    /** 其他业务成本 */
    @Excel(name = "其他业务成本")
    private Double otherBusinessCost;

    /** 其他业务成本(占比%) */
    @Excel(name = "其他业务成本(占比%)")
    private Double otherBusinessCostYoy;

    /** 营业利润 */
    @Excel(name = "营业利润")
    private Double operateProfit;

    /** 营业利润(占比%) */
    @Excel(name = "营业利润(占比%)")
    private Double operateProfitYoy;

    /** 营业外收入 */
    @Excel(name = "营业外收入")
    private Double nonbusinessIncome;

    /** 营业外收入(占比%) */
    @Excel(name = "营业外收入(占比%)")
    private Double nonbusinessIncomeYoy;

    /** 营业外支出 */
    @Excel(name = "营业外支出")
    private Double nonbusinessExpense;

    /** 营业外支出(占比%) */
    @Excel(name = "营业外支出(占比%)")
    private Double nonbusinessExpenseYoy;

    /** 利润总额 */
    @Excel(name = "利润总额")
    private Double totalProfit;

    /** 利润总额(占比%) */
    @Excel(name = "利润总额(占比%)")
    private Double totalProfitYoy;

    /** 所得税费用 */
    @Excel(name = "所得税费用")
    private Double incomeTax;

    /** 所得税费用(占比%) */
    @Excel(name = "所得税费用(占比%)")
    private Double incomeTaxYoy;

    /** 净利润 */
    @Excel(name = "净利润")
    private Double netprofit;

    /** 净利润(占比%) */
    @Excel(name = "净利润(占比%)")
    private Double netprofitYoy;

    public void setId(Long id){this.id = id;}
    public Long getId(){return id;}

    public void setSecurityCode(String securityCode){this.securityCode = securityCode;}
    public String getSecurityCode(){return securityCode;}

    public void setReportType(String reportType){this.reportType = reportType;}
    public String getReportType(){return reportType;}

    public void setReportDate(Date reportDate){this.reportDate = reportDate;}
    public Date getReportDate(){return reportDate;}

    public void setOperateIncome(Double operateIncome){this.operateIncome = operateIncome;}
    public Double getOperateIncome(){return operateIncome;}

    public void setOperateIncomeYoy(Double operateIncomeYoy){this.operateIncomeYoy = operateIncomeYoy;}
    public Double getOperateIncomeYoy(){return operateIncomeYoy;}

    public void setInterestNi(Double interestNi){this.interestNi = interestNi;}
    public Double getInterestNi(){return interestNi;}

    public void setInterestNiYoy(Double interestNiYoy){this.interestNiYoy = interestNiYoy;}
    public Double getInterestNiYoy(){return interestNiYoy;}

    public void setFeeCommissionNi(Double feeCommissionNi){this.feeCommissionNi = feeCommissionNi;}
    public Double getFeeCommissionNi(){return feeCommissionNi;}

    public void setFeeCommissionNiYoy(Double feeCommissionNiYoy){this.feeCommissionNiYoy = feeCommissionNiYoy;}
    public Double getFeeCommissionNiYoy(){return feeCommissionNiYoy;}

    public void setInvestIncome(Double investIncome){this.investIncome = investIncome;}
    public Double getInvestIncome(){return investIncome;}

    public void setInvestIncomeYoy(Double investIncomeYoy){this.investIncomeYoy = investIncomeYoy;}
    public Double getInvestIncomeYoy(){return investIncomeYoy;}

    public void setFairvalueChangeIncome(Double fairvalueChangeIncome){this.fairvalueChangeIncome = fairvalueChangeIncome;}
    public Double getFairvalueChangeIncome(){return fairvalueChangeIncome;}

    public void setFairvalueChangeIncomeYoy(Double fairvalueChangeIncomeYoy){this.fairvalueChangeIncomeYoy = fairvalueChangeIncomeYoy;}
    public Double getFairvalueChangeIncomeYoy(){return fairvalueChangeIncomeYoy;}

    public void setExchangeIncome(Double exchangeIncome){this.exchangeIncome = exchangeIncome;}
    public Double getExchangeIncome(){return exchangeIncome;}

    public void setExchangeIncomeYoy(Double exchangeIncomeYoy){this.exchangeIncomeYoy = exchangeIncomeYoy;}
    public Double getExchangeIncomeYoy(){return exchangeIncomeYoy;}

    public void setOtherBusinessIncome(Double otherBusinessIncome){this.otherBusinessIncome = otherBusinessIncome;}
    public Double getOtherBusinessIncome(){return otherBusinessIncome;}

    public void setOtherBusinessIncomeYoy(Double otherBusinessIncomeYoy){this.otherBusinessIncomeYoy = otherBusinessIncomeYoy;}
    public Double getOtherBusinessIncomeYoy(){return otherBusinessIncomeYoy;}

    public void setAssetDisposalIncome(Double assetDisposalIncome){this.assetDisposalIncome = assetDisposalIncome;}
    public Double getAssetDisposalIncome(){return assetDisposalIncome;}

    public void setAssetDisposalIncomeYoy(Double assetDisposalIncomeYoy){this.assetDisposalIncomeYoy = assetDisposalIncomeYoy;}
    public Double getAssetDisposalIncomeYoy(){return assetDisposalIncomeYoy;}

    public void setOtherIncome(Double otherIncome){this.otherIncome = otherIncome;}
    public Double getOtherIncome(){return otherIncome;}

    public void setOtherIncomeYoy(Double otherIncomeYoy){this.otherIncomeYoy = otherIncomeYoy;}
    public Double getOtherIncomeYoy(){return otherIncomeYoy;}

    public void setOperateExpense(Double operateExpense){this.operateExpense = operateExpense;}
    public Double getOperateExpense(){return operateExpense;}

    public void setOperateExpenseYoy(Double operateExpenseYoy){this.operateExpenseYoy = operateExpenseYoy;}
    public Double getOperateExpenseYoy(){return operateExpenseYoy;}

    public void setOperateTaxAdd(Double operateTaxAdd){this.operateTaxAdd = operateTaxAdd;}
    public Double getOperateTaxAdd(){return operateTaxAdd;}

    public void setOperateTaxAddYoy(Double operateTaxAddYoy){this.operateTaxAddYoy = operateTaxAddYoy;}
    public Double getOperateTaxAddYoy(){return operateTaxAddYoy;}

    public void setBusinessManageExpense(Double businessManageExpense){this.businessManageExpense = businessManageExpense;}
    public Double getBusinessManageExpense(){return businessManageExpense;}

    public void setBusinessManageExpenseYoy(Double businessManageExpenseYoy){this.businessManageExpenseYoy = businessManageExpenseYoy;}
    public Double getBusinessManageExpenseYoy(){return businessManageExpenseYoy;}

    public void setAssetImpairmentLoss(Double assetImpairmentLoss){this.assetImpairmentLoss = assetImpairmentLoss;}
    public Double getAssetImpairmentLoss(){return assetImpairmentLoss;}

    public void setAssetImpairmentLossYoy(Double assetImpairmentLossYoy){this.assetImpairmentLossYoy = assetImpairmentLossYoy;}
    public Double getAssetImpairmentLossYoy(){return assetImpairmentLossYoy;}

    public void setCreditImpairmentLoss(Double creditImpairmentLoss){this.creditImpairmentLoss = creditImpairmentLoss;}
    public Double getCreditImpairmentLoss(){return creditImpairmentLoss;}

    public void setCreditImpairmentLossYoy(Double creditImpairmentLossYoy){this.creditImpairmentLossYoy = creditImpairmentLossYoy;}
    public Double getCreditImpairmentLossYoy(){return creditImpairmentLossYoy;}

    public void setOtherBusinessCost(Double otherBusinessCost){this.otherBusinessCost = otherBusinessCost;}
    public Double getOtherBusinessCost(){return otherBusinessCost;}

    public void setOtherBusinessCostYoy(Double otherBusinessCostYoy){this.otherBusinessCostYoy = otherBusinessCostYoy;}
    public Double getOtherBusinessCostYoy(){return otherBusinessCostYoy;}

    public void setOperateProfit(Double operateProfit){this.operateProfit = operateProfit;}
    public Double getOperateProfit(){return operateProfit;}

    public void setOperateProfitYoy(Double operateProfitYoy){this.operateProfitYoy = operateProfitYoy;}
    public Double getOperateProfitYoy(){return operateProfitYoy;}

    public void setNonbusinessIncome(Double nonbusinessIncome){this.nonbusinessIncome = nonbusinessIncome;}
    public Double getNonbusinessIncome(){return nonbusinessIncome;}

    public void setNonbusinessIncomeYoy(Double nonbusinessIncomeYoy){this.nonbusinessIncomeYoy = nonbusinessIncomeYoy;}
    public Double getNonbusinessIncomeYoy(){return nonbusinessIncomeYoy;}

    public void setNonbusinessExpense(Double nonbusinessExpense){this.nonbusinessExpense = nonbusinessExpense;}
    public Double getNonbusinessExpense(){return nonbusinessExpense;}

    public void setNonbusinessExpenseYoy(Double nonbusinessExpenseYoy){this.nonbusinessExpenseYoy = nonbusinessExpenseYoy;}
    public Double getNonbusinessExpenseYoy(){return nonbusinessExpenseYoy;}

    public void setTotalProfit(Double totalProfit){this.totalProfit = totalProfit;}
    public Double getTotalProfit(){return totalProfit;}

    public void setTotalProfitYoy(Double totalProfitYoy){this.totalProfitYoy = totalProfitYoy;}
    public Double getTotalProfitYoy(){return totalProfitYoy;}

    public void setIncomeTax(Double incomeTax){this.incomeTax = incomeTax;}
    public Double getIncomeTax(){return incomeTax;}

    public void setIncomeTaxYoy(Double incomeTaxYoy){this.incomeTaxYoy = incomeTaxYoy;}
    public Double getIncomeTaxYoy(){return incomeTaxYoy;}

    public void setNetprofit(Double netprofit){this.netprofit = netprofit;}
    public Double getNetprofit(){return netprofit;}

    public void setNetprofitYoy(Double netprofitYoy){this.netprofitYoy = netprofitYoy;}
    public Double getNetprofitYoy(){return netprofitYoy;}


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
        return Objects.equals(securityCode, that.securityCode) && Objects.equals(reportType, that.reportType) && Objects.equals(reportDate, that.reportDate) && Objects.equals(operateIncome, that.operateIncome) && Objects.equals(operateIncomeYoy, that.operateIncomeYoy) && Objects.equals(interestNi, that.interestNi) && Objects.equals(interestNiYoy, that.interestNiYoy) && Objects.equals(feeCommissionNi, that.feeCommissionNi) && Objects.equals(feeCommissionNiYoy, that.feeCommissionNiYoy) && Objects.equals(investIncome, that.investIncome) && Objects.equals(investIncomeYoy, that.investIncomeYoy) && Objects.equals(fairvalueChangeIncome, that.fairvalueChangeIncome) && Objects.equals(fairvalueChangeIncomeYoy, that.fairvalueChangeIncomeYoy) && Objects.equals(exchangeIncome, that.exchangeIncome) && Objects.equals(exchangeIncomeYoy, that.exchangeIncomeYoy) && Objects.equals(otherBusinessIncome, that.otherBusinessIncome) && Objects.equals(otherBusinessIncomeYoy, that.otherBusinessIncomeYoy) && Objects.equals(assetDisposalIncome, that.assetDisposalIncome) && Objects.equals(assetDisposalIncomeYoy, that.assetDisposalIncomeYoy) && Objects.equals(otherIncome, that.otherIncome) && Objects.equals(otherIncomeYoy, that.otherIncomeYoy) && Objects.equals(operateExpense, that.operateExpense) && Objects.equals(operateExpenseYoy, that.operateExpenseYoy) && Objects.equals(operateTaxAdd, that.operateTaxAdd) && Objects.equals(operateTaxAddYoy, that.operateTaxAddYoy) && Objects.equals(businessManageExpense, that.businessManageExpense) && Objects.equals(businessManageExpenseYoy, that.businessManageExpenseYoy) && Objects.equals(assetImpairmentLoss, that.assetImpairmentLoss) && Objects.equals(assetImpairmentLossYoy, that.assetImpairmentLossYoy) && Objects.equals(creditImpairmentLoss, that.creditImpairmentLoss) && Objects.equals(creditImpairmentLossYoy, that.creditImpairmentLossYoy) && Objects.equals(otherBusinessCost, that.otherBusinessCost) && Objects.equals(otherBusinessCostYoy, that.otherBusinessCostYoy) && Objects.equals(operateProfit, that.operateProfit) && Objects.equals(operateProfitYoy, that.operateProfitYoy) && Objects.equals(nonbusinessIncome, that.nonbusinessIncome) && Objects.equals(nonbusinessIncomeYoy, that.nonbusinessIncomeYoy) && Objects.equals(nonbusinessExpense, that.nonbusinessExpense) && Objects.equals(nonbusinessExpenseYoy, that.nonbusinessExpenseYoy) && Objects.equals(totalProfit, that.totalProfit) && Objects.equals(totalProfitYoy, that.totalProfitYoy) && Objects.equals(incomeTax, that.incomeTax) && Objects.equals(incomeTaxYoy, that.incomeTaxYoy) && Objects.equals(netprofit, that.netprofit) && Objects.equals(netprofitYoy, that.netprofitYoy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityCode, reportType, reportDate, operateIncome, operateIncomeYoy, interestNi, interestNiYoy, feeCommissionNi, feeCommissionNiYoy, investIncome, investIncomeYoy, fairvalueChangeIncome, fairvalueChangeIncomeYoy, exchangeIncome, exchangeIncomeYoy, otherBusinessIncome, otherBusinessIncomeYoy, assetDisposalIncome, assetDisposalIncomeYoy, otherIncome, otherIncomeYoy, operateExpense, operateExpenseYoy, operateTaxAdd, operateTaxAddYoy, businessManageExpense, businessManageExpenseYoy, assetImpairmentLoss, assetImpairmentLossYoy, creditImpairmentLoss, creditImpairmentLossYoy, otherBusinessCost, otherBusinessCostYoy, operateProfit, operateProfitYoy, nonbusinessIncome, nonbusinessIncomeYoy, nonbusinessExpense, nonbusinessExpenseYoy, totalProfit, totalProfitYoy, incomeTax, incomeTaxYoy, netprofit, netprofitYoy);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("securityCode", getSecurityCode())
            .append("reportType", getReportType())
            .append("reportDate", getReportDate())
            .append("operateIncome", getOperateIncome())
            .append("operateIncomeYoy", getOperateIncomeYoy())
            .append("interestNi", getInterestNi())
            .append("interestNiYoy", getInterestNiYoy())
            .append("feeCommissionNi", getFeeCommissionNi())
            .append("feeCommissionNiYoy", getFeeCommissionNiYoy())
            .append("investIncome", getInvestIncome())
            .append("investIncomeYoy", getInvestIncomeYoy())
            .append("fairvalueChangeIncome", getFairvalueChangeIncome())
            .append("fairvalueChangeIncomeYoy", getFairvalueChangeIncomeYoy())
            .append("exchangeIncome", getExchangeIncome())
            .append("exchangeIncomeYoy", getExchangeIncomeYoy())
            .append("otherBusinessIncome", getOtherBusinessIncome())
            .append("otherBusinessIncomeYoy", getOtherBusinessIncomeYoy())
            .append("assetDisposalIncome", getAssetDisposalIncome())
            .append("assetDisposalIncomeYoy", getAssetDisposalIncomeYoy())
            .append("otherIncome", getOtherIncome())
            .append("otherIncomeYoy", getOtherIncomeYoy())
            .append("operateExpense", getOperateExpense())
            .append("operateExpenseYoy", getOperateExpenseYoy())
            .append("operateTaxAdd", getOperateTaxAdd())
            .append("operateTaxAddYoy", getOperateTaxAddYoy())
            .append("businessManageExpense", getBusinessManageExpense())
            .append("businessManageExpenseYoy", getBusinessManageExpenseYoy())
            .append("assetImpairmentLoss", getAssetImpairmentLoss())
            .append("assetImpairmentLossYoy", getAssetImpairmentLossYoy())
            .append("creditImpairmentLoss", getCreditImpairmentLoss())
            .append("creditImpairmentLossYoy", getCreditImpairmentLossYoy())
            .append("otherBusinessCost", getOtherBusinessCost())
            .append("otherBusinessCostYoy", getOtherBusinessCostYoy())
            .append("operateProfit", getOperateProfit())
            .append("operateProfitYoy", getOperateProfitYoy())
            .append("nonbusinessIncome", getNonbusinessIncome())
            .append("nonbusinessIncomeYoy", getNonbusinessIncomeYoy())
            .append("nonbusinessExpense", getNonbusinessExpense())
            .append("nonbusinessExpenseYoy", getNonbusinessExpenseYoy())
            .append("totalProfit", getTotalProfit())
            .append("totalProfitYoy", getTotalProfitYoy())
            .append("incomeTax", getIncomeTax())
            .append("incomeTaxYoy", getIncomeTaxYoy())
            .append("netprofit", getNetprofit())
            .append("netprofitYoy", getNetprofitYoy())
            .toString();
    }
}
