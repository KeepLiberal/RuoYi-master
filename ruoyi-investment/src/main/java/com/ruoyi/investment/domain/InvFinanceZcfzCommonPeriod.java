package com.ruoyi.investment.domain;

import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 财务分析-资产负债-普通类-报告期对象 inv_finance_zcfz_common_period
 * 
 * @author yangwenyang
 * @date 2022-09-30
 */
public class InvFinanceZcfzCommonPeriod extends BaseEntity
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

    /** 衍生金融资产 */
    @Excel(name = "衍生金融资产")
    private Double deriveFinasset;

    /** 衍生金融资产(环比%) */
    @Excel(name = "衍生金融资产(环比%)")
    private Double deriveFinassetYoy;

    /** 应收票据及应收账款 */
    @Excel(name = "应收票据及应收账款")
    private Double noteAccountsRece;

    /** 应收票据及应收账款(环比%) */
    @Excel(name = "应收票据及应收账款(环比%)")
    private Double noteAccountsReceYoy;

    /** 应收票据 */
    @Excel(name = "应收票据")
    private Double noteRece;

    /** 应收票据(环比%) */
    @Excel(name = "应收票据(环比%)")
    private Double noteReceYoy;

    /** 应收账款 */
    @Excel(name = "应收账款")
    private Double accountsRece;

    /** 应收账款(环比%) */
    @Excel(name = "应收账款(环比%)")
    private Double accountsReceYoy;

    /** 应收款项融资 */
    @Excel(name = "应收款项融资")
    private Double financeRece;

    /** 应收款项融资(环比%) */
    @Excel(name = "应收款项融资(环比%)")
    private Double financeReceYoy;

    /** 预付款项 */
    @Excel(name = "预付款项")
    private Double prepayment;

    /** 预付款项(环比%) */
    @Excel(name = "预付款项(环比%)")
    private Double prepaymentYoy;

    /** 其他应收款合计 */
    @Excel(name = "其他应收款合计")
    private Double totalOtherRece;

    /** 其他应收款合计(环比%) */
    @Excel(name = "其他应收款合计(环比%)")
    private Double totalOtherReceYoy;

    /** 应收股利 */
    @Excel(name = "应收股利")
    private Double dividendRece;

    /** 应收股利(环比%) */
    @Excel(name = "应收股利(环比%)")
    private Double dividendReceYoy;

    /** 存货 */
    @Excel(name = "存货")
    private Double inventory;

    /** 存货(环比%) */
    @Excel(name = "存货(环比%)")
    private Double inventoryYoy;

    /** 合同资产 */
    @Excel(name = "合同资产")
    private Double contractAsset;

    /** 合同资产(环比%) */
    @Excel(name = "合同资产(环比%)")
    private Double contractAssetYoy;

    /** 一年内到期的非流动资产 */
    @Excel(name = "一年内到期的非流动资产")
    private Double noncurrentAsset1year;

    /** 一年内到期的非流动资产(环比%) */
    @Excel(name = "一年内到期的非流动资产(环比%)")
    private Double noncurrentAsset1yearYoy;

    /** 其他流动资产 */
    @Excel(name = "其他流动资产")
    private Double otherCurrentAsset;

    /** 其他流动资产(环比%) */
    @Excel(name = "其他流动资产(环比%)")
    private Double otherCurrentAssetYoy;

    /** 流动资产合计 */
    @Excel(name = "流动资产合计")
    private Double totalCurrentAssets;

    /** 流动资产合计(环比%) */
    @Excel(name = "流动资产合计(环比%)")
    private Double totalCurrentAssetsYoy;

    /** 长期应收款 */
    @Excel(name = "长期应收款")
    private Double longRece;

    /** 长期应收款(环比%) */
    @Excel(name = "长期应收款(环比%)")
    private Double longReceYoy;

    /** 长期股权投资 */
    @Excel(name = "长期股权投资")
    private Double longEquityInvest;

    /** 长期股权投资(环比%) */
    @Excel(name = "长期股权投资(环比%)")
    private Double longEquityInvestYoy;

    /** 其他权益工具投资 */
    @Excel(name = "其他权益工具投资")
    private Double otherEquityInvest;

    /** 其他权益工具投资(环比%) */
    @Excel(name = "其他权益工具投资(环比%)")
    private Double otherEquityInvestYoy;

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

    /** 开发支出 */
    @Excel(name = "开发支出")
    private Double developExpense;

    /** 开发支出(环比%) */
    @Excel(name = "开发支出(环比%)")
    private Double developExpenseYoy;

    /** 长期待摊费用 */
    @Excel(name = "长期待摊费用")
    private Double longPrepaidExpense;

    /** 长期待摊费用(环比%) */
    @Excel(name = "长期待摊费用(环比%)")
    private Double longPrepaidExpenseYoy;

    /** 递延所得税资产 */
    @Excel(name = "递延所得税资产")
    private Double deferTaxAsset;

    /** 递延所得税资产(环比%) */
    @Excel(name = "递延所得税资产(环比%)")
    private Double deferTaxAssetYoy;

    /** 其他非流动资产 */
    @Excel(name = "其他非流动资产")
    private Double otherNoncurrentAsset;

    /** 其他非流动资产(环比%) */
    @Excel(name = "其他非流动资产(环比%)")
    private Double otherNoncurrentAssetYoy;

    /** 非流动资产合计 */
    @Excel(name = "非流动资产合计")
    private Double totalNoncurrentAssets;

    /** 非流动资产合计(环比%) */
    @Excel(name = "非流动资产合计(环比%)")
    private Double totalNoncurrentAssetsYoy;

    /** 资产总计 */
    @Excel(name = "资产总计")
    private Double totalAssets;

    /** 资产总计(环比%) */
    @Excel(name = "资产总计(环比%)")
    private Double totalAssetsYoy;

    /** 短期借款 */
    @Excel(name = "短期借款")
    private Double shortLoan;

    /** 短期借款(环比%) */
    @Excel(name = "短期借款(环比%)")
    private Double shortLoanYoy;

    /** 应付票据及应付账款 */
    @Excel(name = "应付票据及应付账款")
    private Double noteAccountsPayable;

    /** 应付票据及应付账款(环比%) */
    @Excel(name = "应付票据及应付账款(环比%)")
    private Double noteAccountsPayableYoy;

    /** 应付票据 */
    @Excel(name = "应付票据")
    private Double notePayable;

    /** 应付票据(环比%) */
    @Excel(name = "应付票据(环比%)")
    private Double notePayableYoy;

    /** 应付账款 */
    @Excel(name = "应付账款")
    private Double accountsPayable;

    /** 应付账款(环比%) */
    @Excel(name = "应付账款(环比%)")
    private Double accountsPayableYoy;

    /** 合同负债 */
    @Excel(name = "合同负债")
    private Double contractLiab;

    /** 合同负债(环比%) */
    @Excel(name = "合同负债(环比%)")
    private Double contractLiabYoy;

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

    /** 其他应付款合计 */
    @Excel(name = "其他应付款合计")
    private Double totalOtherPayable;

    /** 其他应付款合计(环比%) */
    @Excel(name = "其他应付款合计(环比%)")
    private Double totalOtherPayableYoy;

    /** 应付股利 */
    @Excel(name = "应付股利")
    private Double dividendPayable;

    /** 应付股利(环比%) */
    @Excel(name = "应付股利(环比%)")
    private Double dividendPayableYoy;

    /** 一年内到期的非流动负债 */
    @Excel(name = "一年内到期的非流动负债")
    private Double noncurrentLiab1year;

    /** 一年内到期的非流动负债(环比%) */
    @Excel(name = "一年内到期的非流动负债(环比%)")
    private Double noncurrentLiab1yearYoy;

    /** 其他流动负债 */
    @Excel(name = "其他流动负债")
    private Double otherCurrentLiab;

    /** 其他流动负债(环比%) */
    @Excel(name = "其他流动负债(环比%)")
    private Double otherCurrentLiabYoy;

    /** 流动负债合计 */
    @Excel(name = "流动负债合计")
    private Double totalCurrentLiab;

    /** 流动负债合计(环比%) */
    @Excel(name = "流动负债合计(环比%)")
    private Double totalCurrentLiabYoy;

    /** 长期借款 */
    @Excel(name = "长期借款")
    private Double longLoan;

    /** 长期借款(环比%) */
    @Excel(name = "长期借款(环比%)")
    private Double longLoanYoy;

    /** 租赁负债 */
    @Excel(name = "租赁负债")
    private Double leaseLiab;

    /** 租赁负债(环比%) */
    @Excel(name = "租赁负债(环比%)")
    private Double leaseLiabYoy;

    /** 长期应付款 */
    @Excel(name = "长期应付款")
    private Double longPayable;

    /** 长期应付款(环比%) */
    @Excel(name = "长期应付款(环比%)")
    private Double longPayableYoy;

    /** 长期应付职工薪酬 */
    @Excel(name = "长期应付职工薪酬")
    private Double longStaffsalaryPayable;

    /** 长期应付职工薪酬(环比%) */
    @Excel(name = "长期应付职工薪酬(环比%)")
    private Double longStaffsalaryPayableYoy;

    /** 预计负债 */
    @Excel(name = "预计负债")
    private Double predictLiab;

    /** 预计负债(环比%) */
    @Excel(name = "预计负债(环比%)")
    private Double predictLiabYoy;

    /** 递延收益 */
    @Excel(name = "递延收益")
    private Double deferIncome;

    /** 递延收益(环比%) */
    @Excel(name = "递延收益(环比%)")
    private Double deferIncomeYoy;

    /** 递延所得税负债 */
    @Excel(name = "递延所得税负债")
    private Double deferTaxLiab;

    /** 递延所得税负债(环比%) */
    @Excel(name = "递延所得税负债(环比%)")
    private Double deferTaxLiabYoy;

    /** 非流动负债合计 */
    @Excel(name = "非流动负债合计")
    private Double totalNoncurrentLiab;

    /** 非流动负债合计(环比%) */
    @Excel(name = "非流动负债合计(环比%)")
    private Double totalNoncurrentLiabYoy;

    /** 负债合计 */
    @Excel(name = "负债合计")
    private Double totalLiabilities;

    /** 负债合计(环比%) */
    @Excel(name = "负债合计(环比%)")
    private Double totalLiabilitiesYoy;

    /** 实收资本或股本 */
    @Excel(name = "实收资本或股本")
    private Double shareCapital;

    /** 实收资本或股本(环比%) */
    @Excel(name = "实收资本或股本(环比%)")
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

    /** 专项储备 */
    @Excel(name = "专项储备")
    private Double specialReserve;

    /** 专项储备(环比%) */
    @Excel(name = "专项储备(环比%)")
    private Double specialReserveYoy;

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
    public void setNoteAccountsRece(Double noteAccountsRece) 
    {
        this.noteAccountsRece = noteAccountsRece;
    }

    public Double getNoteAccountsRece() 
    {
        return noteAccountsRece;
    }
    public void setNoteAccountsReceYoy(Double noteAccountsReceYoy) 
    {
        this.noteAccountsReceYoy = noteAccountsReceYoy;
    }

    public Double getNoteAccountsReceYoy() 
    {
        return noteAccountsReceYoy;
    }
    public void setNoteRece(Double noteRece) 
    {
        this.noteRece = noteRece;
    }

    public Double getNoteRece() 
    {
        return noteRece;
    }
    public void setNoteReceYoy(Double noteReceYoy) 
    {
        this.noteReceYoy = noteReceYoy;
    }

    public Double getNoteReceYoy() 
    {
        return noteReceYoy;
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
    public void setFinanceRece(Double financeRece) 
    {
        this.financeRece = financeRece;
    }

    public Double getFinanceRece() 
    {
        return financeRece;
    }
    public void setFinanceReceYoy(Double financeReceYoy) 
    {
        this.financeReceYoy = financeReceYoy;
    }

    public Double getFinanceReceYoy() 
    {
        return financeReceYoy;
    }
    public void setPrepayment(Double prepayment) 
    {
        this.prepayment = prepayment;
    }

    public Double getPrepayment() 
    {
        return prepayment;
    }
    public void setPrepaymentYoy(Double prepaymentYoy) 
    {
        this.prepaymentYoy = prepaymentYoy;
    }

    public Double getPrepaymentYoy() 
    {
        return prepaymentYoy;
    }
    public void setTotalOtherRece(Double totalOtherRece) 
    {
        this.totalOtherRece = totalOtherRece;
    }

    public Double getTotalOtherRece() 
    {
        return totalOtherRece;
    }
    public void setTotalOtherReceYoy(Double totalOtherReceYoy) 
    {
        this.totalOtherReceYoy = totalOtherReceYoy;
    }

    public Double getTotalOtherReceYoy() 
    {
        return totalOtherReceYoy;
    }
    public void setDividendRece(Double dividendRece) 
    {
        this.dividendRece = dividendRece;
    }

    public Double getDividendRece() 
    {
        return dividendRece;
    }
    public void setDividendReceYoy(Double dividendReceYoy) 
    {
        this.dividendReceYoy = dividendReceYoy;
    }

    public Double getDividendReceYoy() 
    {
        return dividendReceYoy;
    }
    public void setInventory(Double inventory) 
    {
        this.inventory = inventory;
    }

    public Double getInventory() 
    {
        return inventory;
    }
    public void setInventoryYoy(Double inventoryYoy) 
    {
        this.inventoryYoy = inventoryYoy;
    }

    public Double getInventoryYoy() 
    {
        return inventoryYoy;
    }
    public void setContractAsset(Double contractAsset) 
    {
        this.contractAsset = contractAsset;
    }

    public Double getContractAsset() 
    {
        return contractAsset;
    }
    public void setContractAssetYoy(Double contractAssetYoy) 
    {
        this.contractAssetYoy = contractAssetYoy;
    }

    public Double getContractAssetYoy() 
    {
        return contractAssetYoy;
    }
    public void setNoncurrentAsset1year(Double noncurrentAsset1year) 
    {
        this.noncurrentAsset1year = noncurrentAsset1year;
    }

    public Double getNoncurrentAsset1year() 
    {
        return noncurrentAsset1year;
    }
    public void setNoncurrentAsset1yearYoy(Double noncurrentAsset1yearYoy) 
    {
        this.noncurrentAsset1yearYoy = noncurrentAsset1yearYoy;
    }

    public Double getNoncurrentAsset1yearYoy() 
    {
        return noncurrentAsset1yearYoy;
    }
    public void setOtherCurrentAsset(Double otherCurrentAsset) 
    {
        this.otherCurrentAsset = otherCurrentAsset;
    }

    public Double getOtherCurrentAsset() 
    {
        return otherCurrentAsset;
    }
    public void setOtherCurrentAssetYoy(Double otherCurrentAssetYoy) 
    {
        this.otherCurrentAssetYoy = otherCurrentAssetYoy;
    }

    public Double getOtherCurrentAssetYoy() 
    {
        return otherCurrentAssetYoy;
    }
    public void setTotalCurrentAssets(Double totalCurrentAssets) 
    {
        this.totalCurrentAssets = totalCurrentAssets;
    }

    public Double getTotalCurrentAssets() 
    {
        return totalCurrentAssets;
    }
    public void setTotalCurrentAssetsYoy(Double totalCurrentAssetsYoy) 
    {
        this.totalCurrentAssetsYoy = totalCurrentAssetsYoy;
    }

    public Double getTotalCurrentAssetsYoy() 
    {
        return totalCurrentAssetsYoy;
    }
    public void setLongRece(Double longRece) 
    {
        this.longRece = longRece;
    }

    public Double getLongRece() 
    {
        return longRece;
    }
    public void setLongReceYoy(Double longReceYoy) 
    {
        this.longReceYoy = longReceYoy;
    }

    public Double getLongReceYoy() 
    {
        return longReceYoy;
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
    public void setDevelopExpense(Double developExpense) 
    {
        this.developExpense = developExpense;
    }

    public Double getDevelopExpense() 
    {
        return developExpense;
    }
    public void setDevelopExpenseYoy(Double developExpenseYoy) 
    {
        this.developExpenseYoy = developExpenseYoy;
    }

    public Double getDevelopExpenseYoy() 
    {
        return developExpenseYoy;
    }
    public void setLongPrepaidExpense(Double longPrepaidExpense) 
    {
        this.longPrepaidExpense = longPrepaidExpense;
    }

    public Double getLongPrepaidExpense() 
    {
        return longPrepaidExpense;
    }
    public void setLongPrepaidExpenseYoy(Double longPrepaidExpenseYoy) 
    {
        this.longPrepaidExpenseYoy = longPrepaidExpenseYoy;
    }

    public Double getLongPrepaidExpenseYoy() 
    {
        return longPrepaidExpenseYoy;
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
    public void setOtherNoncurrentAsset(Double otherNoncurrentAsset) 
    {
        this.otherNoncurrentAsset = otherNoncurrentAsset;
    }

    public Double getOtherNoncurrentAsset() 
    {
        return otherNoncurrentAsset;
    }
    public void setOtherNoncurrentAssetYoy(Double otherNoncurrentAssetYoy) 
    {
        this.otherNoncurrentAssetYoy = otherNoncurrentAssetYoy;
    }

    public Double getOtherNoncurrentAssetYoy() 
    {
        return otherNoncurrentAssetYoy;
    }
    public void setTotalNoncurrentAssets(Double totalNoncurrentAssets) 
    {
        this.totalNoncurrentAssets = totalNoncurrentAssets;
    }

    public Double getTotalNoncurrentAssets() 
    {
        return totalNoncurrentAssets;
    }
    public void setTotalNoncurrentAssetsYoy(Double totalNoncurrentAssetsYoy) 
    {
        this.totalNoncurrentAssetsYoy = totalNoncurrentAssetsYoy;
    }

    public Double getTotalNoncurrentAssetsYoy() 
    {
        return totalNoncurrentAssetsYoy;
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
    public void setShortLoan(Double shortLoan) 
    {
        this.shortLoan = shortLoan;
    }

    public Double getShortLoan() 
    {
        return shortLoan;
    }
    public void setShortLoanYoy(Double shortLoanYoy) 
    {
        this.shortLoanYoy = shortLoanYoy;
    }

    public Double getShortLoanYoy() 
    {
        return shortLoanYoy;
    }
    public void setNoteAccountsPayable(Double noteAccountsPayable) 
    {
        this.noteAccountsPayable = noteAccountsPayable;
    }

    public Double getNoteAccountsPayable() 
    {
        return noteAccountsPayable;
    }
    public void setNoteAccountsPayableYoy(Double noteAccountsPayableYoy) 
    {
        this.noteAccountsPayableYoy = noteAccountsPayableYoy;
    }

    public Double getNoteAccountsPayableYoy() 
    {
        return noteAccountsPayableYoy;
    }
    public void setNotePayable(Double notePayable) 
    {
        this.notePayable = notePayable;
    }

    public Double getNotePayable() 
    {
        return notePayable;
    }
    public void setNotePayableYoy(Double notePayableYoy) 
    {
        this.notePayableYoy = notePayableYoy;
    }

    public Double getNotePayableYoy() 
    {
        return notePayableYoy;
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
    public void setContractLiab(Double contractLiab) 
    {
        this.contractLiab = contractLiab;
    }

    public Double getContractLiab() 
    {
        return contractLiab;
    }
    public void setContractLiabYoy(Double contractLiabYoy) 
    {
        this.contractLiabYoy = contractLiabYoy;
    }

    public Double getContractLiabYoy() 
    {
        return contractLiabYoy;
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
    public void setTotalOtherPayable(Double totalOtherPayable) 
    {
        this.totalOtherPayable = totalOtherPayable;
    }

    public Double getTotalOtherPayable() 
    {
        return totalOtherPayable;
    }
    public void setTotalOtherPayableYoy(Double totalOtherPayableYoy) 
    {
        this.totalOtherPayableYoy = totalOtherPayableYoy;
    }

    public Double getTotalOtherPayableYoy() 
    {
        return totalOtherPayableYoy;
    }
    public void setDividendPayable(Double dividendPayable) 
    {
        this.dividendPayable = dividendPayable;
    }

    public Double getDividendPayable() 
    {
        return dividendPayable;
    }
    public void setDividendPayableYoy(Double dividendPayableYoy) 
    {
        this.dividendPayableYoy = dividendPayableYoy;
    }

    public Double getDividendPayableYoy() 
    {
        return dividendPayableYoy;
    }
    public void setNoncurrentLiab1year(Double noncurrentLiab1year) 
    {
        this.noncurrentLiab1year = noncurrentLiab1year;
    }

    public Double getNoncurrentLiab1year() 
    {
        return noncurrentLiab1year;
    }
    public void setNoncurrentLiab1yearYoy(Double noncurrentLiab1yearYoy) 
    {
        this.noncurrentLiab1yearYoy = noncurrentLiab1yearYoy;
    }

    public Double getNoncurrentLiab1yearYoy() 
    {
        return noncurrentLiab1yearYoy;
    }
    public void setOtherCurrentLiab(Double otherCurrentLiab) 
    {
        this.otherCurrentLiab = otherCurrentLiab;
    }

    public Double getOtherCurrentLiab() 
    {
        return otherCurrentLiab;
    }
    public void setOtherCurrentLiabYoy(Double otherCurrentLiabYoy) 
    {
        this.otherCurrentLiabYoy = otherCurrentLiabYoy;
    }

    public Double getOtherCurrentLiabYoy() 
    {
        return otherCurrentLiabYoy;
    }
    public void setTotalCurrentLiab(Double totalCurrentLiab) 
    {
        this.totalCurrentLiab = totalCurrentLiab;
    }

    public Double getTotalCurrentLiab() 
    {
        return totalCurrentLiab;
    }
    public void setTotalCurrentLiabYoy(Double totalCurrentLiabYoy) 
    {
        this.totalCurrentLiabYoy = totalCurrentLiabYoy;
    }

    public Double getTotalCurrentLiabYoy() 
    {
        return totalCurrentLiabYoy;
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
    public void setLongPayable(Double longPayable) 
    {
        this.longPayable = longPayable;
    }

    public Double getLongPayable() 
    {
        return longPayable;
    }
    public void setLongPayableYoy(Double longPayableYoy) 
    {
        this.longPayableYoy = longPayableYoy;
    }

    public Double getLongPayableYoy() 
    {
        return longPayableYoy;
    }
    public void setLongStaffsalaryPayable(Double longStaffsalaryPayable) 
    {
        this.longStaffsalaryPayable = longStaffsalaryPayable;
    }

    public Double getLongStaffsalaryPayable() 
    {
        return longStaffsalaryPayable;
    }
    public void setLongStaffsalaryPayableYoy(Double longStaffsalaryPayableYoy) 
    {
        this.longStaffsalaryPayableYoy = longStaffsalaryPayableYoy;
    }

    public Double getLongStaffsalaryPayableYoy() 
    {
        return longStaffsalaryPayableYoy;
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
    public void setDeferIncome(Double deferIncome) 
    {
        this.deferIncome = deferIncome;
    }

    public Double getDeferIncome() 
    {
        return deferIncome;
    }
    public void setDeferIncomeYoy(Double deferIncomeYoy) 
    {
        this.deferIncomeYoy = deferIncomeYoy;
    }

    public Double getDeferIncomeYoy() 
    {
        return deferIncomeYoy;
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
    public void setTotalNoncurrentLiab(Double totalNoncurrentLiab) 
    {
        this.totalNoncurrentLiab = totalNoncurrentLiab;
    }

    public Double getTotalNoncurrentLiab() 
    {
        return totalNoncurrentLiab;
    }
    public void setTotalNoncurrentLiabYoy(Double totalNoncurrentLiabYoy) 
    {
        this.totalNoncurrentLiabYoy = totalNoncurrentLiabYoy;
    }

    public Double getTotalNoncurrentLiabYoy() 
    {
        return totalNoncurrentLiabYoy;
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
    public void setSpecialReserve(Double specialReserve) 
    {
        this.specialReserve = specialReserve;
    }

    public Double getSpecialReserve() 
    {
        return specialReserve;
    }
    public void setSpecialReserveYoy(Double specialReserveYoy) 
    {
        this.specialReserveYoy = specialReserveYoy;
    }

    public Double getSpecialReserveYoy() 
    {
        return specialReserveYoy;
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

    public InvFinanceZcfzCommonPeriod() {
        super();
    }

    public InvFinanceZcfzCommonPeriod(String securityCode) {
        this.securityCode = securityCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvFinanceZcfzCommonPeriod)) return false;
        InvFinanceZcfzCommonPeriod that = (InvFinanceZcfzCommonPeriod) o;
        return Objects.equals(id, that.id) && Objects.equals(securityCode, that.securityCode) && Objects.equals(reportDate, that.reportDate) && Objects.equals(monetaryfunds, that.monetaryfunds) && Objects.equals(monetaryfundsYoy, that.monetaryfundsYoy) && Objects.equals(deriveFinasset, that.deriveFinasset) && Objects.equals(deriveFinassetYoy, that.deriveFinassetYoy) && Objects.equals(noteAccountsRece, that.noteAccountsRece) && Objects.equals(noteAccountsReceYoy, that.noteAccountsReceYoy) && Objects.equals(noteRece, that.noteRece) && Objects.equals(noteReceYoy, that.noteReceYoy) && Objects.equals(accountsRece, that.accountsRece) && Objects.equals(accountsReceYoy, that.accountsReceYoy) && Objects.equals(financeRece, that.financeRece) && Objects.equals(financeReceYoy, that.financeReceYoy) && Objects.equals(prepayment, that.prepayment) && Objects.equals(prepaymentYoy, that.prepaymentYoy) && Objects.equals(totalOtherRece, that.totalOtherRece) && Objects.equals(totalOtherReceYoy, that.totalOtherReceYoy) && Objects.equals(dividendRece, that.dividendRece) && Objects.equals(dividendReceYoy, that.dividendReceYoy) && Objects.equals(inventory, that.inventory) && Objects.equals(inventoryYoy, that.inventoryYoy) && Objects.equals(contractAsset, that.contractAsset) && Objects.equals(contractAssetYoy, that.contractAssetYoy) && Objects.equals(noncurrentAsset1year, that.noncurrentAsset1year) && Objects.equals(noncurrentAsset1yearYoy, that.noncurrentAsset1yearYoy) && Objects.equals(otherCurrentAsset, that.otherCurrentAsset) && Objects.equals(otherCurrentAssetYoy, that.otherCurrentAssetYoy) && Objects.equals(totalCurrentAssets, that.totalCurrentAssets) && Objects.equals(totalCurrentAssetsYoy, that.totalCurrentAssetsYoy) && Objects.equals(longRece, that.longRece) && Objects.equals(longReceYoy, that.longReceYoy) && Objects.equals(longEquityInvest, that.longEquityInvest) && Objects.equals(longEquityInvestYoy, that.longEquityInvestYoy) && Objects.equals(otherEquityInvest, that.otherEquityInvest) && Objects.equals(otherEquityInvestYoy, that.otherEquityInvestYoy) && Objects.equals(investRealestate, that.investRealestate) && Objects.equals(investRealestateYoy, that.investRealestateYoy) && Objects.equals(fixedAsset, that.fixedAsset) && Objects.equals(fixedAssetYoy, that.fixedAssetYoy) && Objects.equals(cip, that.cip) && Objects.equals(cipYoy, that.cipYoy) && Objects.equals(userightAsset, that.userightAsset) && Objects.equals(userightAssetYoy, that.userightAssetYoy) && Objects.equals(intangibleAsset, that.intangibleAsset) && Objects.equals(intangibleAssetYoy, that.intangibleAssetYoy) && Objects.equals(developExpense, that.developExpense) && Objects.equals(developExpenseYoy, that.developExpenseYoy) && Objects.equals(longPrepaidExpense, that.longPrepaidExpense) && Objects.equals(longPrepaidExpenseYoy, that.longPrepaidExpenseYoy) && Objects.equals(deferTaxAsset, that.deferTaxAsset) && Objects.equals(deferTaxAssetYoy, that.deferTaxAssetYoy) && Objects.equals(otherNoncurrentAsset, that.otherNoncurrentAsset) && Objects.equals(otherNoncurrentAssetYoy, that.otherNoncurrentAssetYoy) && Objects.equals(totalNoncurrentAssets, that.totalNoncurrentAssets) && Objects.equals(totalNoncurrentAssetsYoy, that.totalNoncurrentAssetsYoy) && Objects.equals(totalAssets, that.totalAssets) && Objects.equals(totalAssetsYoy, that.totalAssetsYoy) && Objects.equals(shortLoan, that.shortLoan) && Objects.equals(shortLoanYoy, that.shortLoanYoy) && Objects.equals(noteAccountsPayable, that.noteAccountsPayable) && Objects.equals(noteAccountsPayableYoy, that.noteAccountsPayableYoy) && Objects.equals(notePayable, that.notePayable) && Objects.equals(notePayableYoy, that.notePayableYoy) && Objects.equals(accountsPayable, that.accountsPayable) && Objects.equals(accountsPayableYoy, that.accountsPayableYoy) && Objects.equals(contractLiab, that.contractLiab) && Objects.equals(contractLiabYoy, that.contractLiabYoy) && Objects.equals(staffSalaryPayable, that.staffSalaryPayable) && Objects.equals(staffSalaryPayableYoy, that.staffSalaryPayableYoy) && Objects.equals(taxPayable, that.taxPayable) && Objects.equals(taxPayableYoy, that.taxPayableYoy) && Objects.equals(totalOtherPayable, that.totalOtherPayable) && Objects.equals(totalOtherPayableYoy, that.totalOtherPayableYoy) && Objects.equals(dividendPayable, that.dividendPayable) && Objects.equals(dividendPayableYoy, that.dividendPayableYoy) && Objects.equals(noncurrentLiab1year, that.noncurrentLiab1year) && Objects.equals(noncurrentLiab1yearYoy, that.noncurrentLiab1yearYoy) && Objects.equals(otherCurrentLiab, that.otherCurrentLiab) && Objects.equals(otherCurrentLiabYoy, that.otherCurrentLiabYoy) && Objects.equals(totalCurrentLiab, that.totalCurrentLiab) && Objects.equals(totalCurrentLiabYoy, that.totalCurrentLiabYoy) && Objects.equals(longLoan, that.longLoan) && Objects.equals(longLoanYoy, that.longLoanYoy) && Objects.equals(leaseLiab, that.leaseLiab) && Objects.equals(leaseLiabYoy, that.leaseLiabYoy) && Objects.equals(longPayable, that.longPayable) && Objects.equals(longPayableYoy, that.longPayableYoy) && Objects.equals(longStaffsalaryPayable, that.longStaffsalaryPayable) && Objects.equals(longStaffsalaryPayableYoy, that.longStaffsalaryPayableYoy) && Objects.equals(predictLiab, that.predictLiab) && Objects.equals(predictLiabYoy, that.predictLiabYoy) && Objects.equals(deferIncome, that.deferIncome) && Objects.equals(deferIncomeYoy, that.deferIncomeYoy) && Objects.equals(deferTaxLiab, that.deferTaxLiab) && Objects.equals(deferTaxLiabYoy, that.deferTaxLiabYoy) && Objects.equals(totalNoncurrentLiab, that.totalNoncurrentLiab) && Objects.equals(totalNoncurrentLiabYoy, that.totalNoncurrentLiabYoy) && Objects.equals(totalLiabilities, that.totalLiabilities) && Objects.equals(totalLiabilitiesYoy, that.totalLiabilitiesYoy) && Objects.equals(shareCapital, that.shareCapital) && Objects.equals(shareCapitalYoy, that.shareCapitalYoy) && Objects.equals(capitalReserve, that.capitalReserve) && Objects.equals(capitalReserveYoy, that.capitalReserveYoy) && Objects.equals(otherCompreIncome, that.otherCompreIncome) && Objects.equals(otherCompreIncomeYoy, that.otherCompreIncomeYoy) && Objects.equals(specialReserve, that.specialReserve) && Objects.equals(specialReserveYoy, that.specialReserveYoy) && Objects.equals(surplusReserve, that.surplusReserve) && Objects.equals(surplusReserveYoy, that.surplusReserveYoy) && Objects.equals(unassignRpofit, that.unassignRpofit) && Objects.equals(unassignRpofitYoy, that.unassignRpofitYoy) && Objects.equals(totalParentEquity, that.totalParentEquity) && Objects.equals(totalParentEquityYoy, that.totalParentEquityYoy) && Objects.equals(minorityEquity, that.minorityEquity) && Objects.equals(minorityEquityYoy, that.minorityEquityYoy) && Objects.equals(totalEquity, that.totalEquity) && Objects.equals(totalEquityYoy, that.totalEquityYoy) && Objects.equals(totalLiabEquity, that.totalLiabEquity) && Objects.equals(totalLiabEquityYoy, that.totalLiabEquityYoy) && Objects.equals(opinionType, that.opinionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, securityCode, reportDate, monetaryfunds, monetaryfundsYoy, deriveFinasset, deriveFinassetYoy, noteAccountsRece, noteAccountsReceYoy, noteRece, noteReceYoy, accountsRece, accountsReceYoy, financeRece, financeReceYoy, prepayment, prepaymentYoy, totalOtherRece, totalOtherReceYoy, dividendRece, dividendReceYoy, inventory, inventoryYoy, contractAsset, contractAssetYoy, noncurrentAsset1year, noncurrentAsset1yearYoy, otherCurrentAsset, otherCurrentAssetYoy, totalCurrentAssets, totalCurrentAssetsYoy, longRece, longReceYoy, longEquityInvest, longEquityInvestYoy, otherEquityInvest, otherEquityInvestYoy, investRealestate, investRealestateYoy, fixedAsset, fixedAssetYoy, cip, cipYoy, userightAsset, userightAssetYoy, intangibleAsset, intangibleAssetYoy, developExpense, developExpenseYoy, longPrepaidExpense, longPrepaidExpenseYoy, deferTaxAsset, deferTaxAssetYoy, otherNoncurrentAsset, otherNoncurrentAssetYoy, totalNoncurrentAssets, totalNoncurrentAssetsYoy, totalAssets, totalAssetsYoy, shortLoan, shortLoanYoy, noteAccountsPayable, noteAccountsPayableYoy, notePayable, notePayableYoy, accountsPayable, accountsPayableYoy, contractLiab, contractLiabYoy, staffSalaryPayable, staffSalaryPayableYoy, taxPayable, taxPayableYoy, totalOtherPayable, totalOtherPayableYoy, dividendPayable, dividendPayableYoy, noncurrentLiab1year, noncurrentLiab1yearYoy, otherCurrentLiab, otherCurrentLiabYoy, totalCurrentLiab, totalCurrentLiabYoy, longLoan, longLoanYoy, leaseLiab, leaseLiabYoy, longPayable, longPayableYoy, longStaffsalaryPayable, longStaffsalaryPayableYoy, predictLiab, predictLiabYoy, deferIncome, deferIncomeYoy, deferTaxLiab, deferTaxLiabYoy, totalNoncurrentLiab, totalNoncurrentLiabYoy, totalLiabilities, totalLiabilitiesYoy, shareCapital, shareCapitalYoy, capitalReserve, capitalReserveYoy, otherCompreIncome, otherCompreIncomeYoy, specialReserve, specialReserveYoy, surplusReserve, surplusReserveYoy, unassignRpofit, unassignRpofitYoy, totalParentEquity, totalParentEquityYoy, minorityEquity, minorityEquityYoy, totalEquity, totalEquityYoy, totalLiabEquity, totalLiabEquityYoy, opinionType);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("securityCode", getSecurityCode())
            .append("reportDate", getReportDate())
            .append("monetaryfunds", getMonetaryfunds())
            .append("monetaryfundsYoy", getMonetaryfundsYoy())
            .append("deriveFinasset", getDeriveFinasset())
            .append("deriveFinassetYoy", getDeriveFinassetYoy())
            .append("noteAccountsRece", getNoteAccountsRece())
            .append("noteAccountsReceYoy", getNoteAccountsReceYoy())
            .append("noteRece", getNoteRece())
            .append("noteReceYoy", getNoteReceYoy())
            .append("accountsRece", getAccountsRece())
            .append("accountsReceYoy", getAccountsReceYoy())
            .append("financeRece", getFinanceRece())
            .append("financeReceYoy", getFinanceReceYoy())
            .append("prepayment", getPrepayment())
            .append("prepaymentYoy", getPrepaymentYoy())
            .append("totalOtherRece", getTotalOtherRece())
            .append("totalOtherReceYoy", getTotalOtherReceYoy())
            .append("dividendRece", getDividendRece())
            .append("dividendReceYoy", getDividendReceYoy())
            .append("inventory", getInventory())
            .append("inventoryYoy", getInventoryYoy())
            .append("contractAsset", getContractAsset())
            .append("contractAssetYoy", getContractAssetYoy())
            .append("noncurrentAsset1year", getNoncurrentAsset1year())
            .append("noncurrentAsset1yearYoy", getNoncurrentAsset1yearYoy())
            .append("otherCurrentAsset", getOtherCurrentAsset())
            .append("otherCurrentAssetYoy", getOtherCurrentAssetYoy())
            .append("totalCurrentAssets", getTotalCurrentAssets())
            .append("totalCurrentAssetsYoy", getTotalCurrentAssetsYoy())
            .append("longRece", getLongRece())
            .append("longReceYoy", getLongReceYoy())
            .append("longEquityInvest", getLongEquityInvest())
            .append("longEquityInvestYoy", getLongEquityInvestYoy())
            .append("otherEquityInvest", getOtherEquityInvest())
            .append("otherEquityInvestYoy", getOtherEquityInvestYoy())
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
            .append("developExpense", getDevelopExpense())
            .append("developExpenseYoy", getDevelopExpenseYoy())
            .append("longPrepaidExpense", getLongPrepaidExpense())
            .append("longPrepaidExpenseYoy", getLongPrepaidExpenseYoy())
            .append("deferTaxAsset", getDeferTaxAsset())
            .append("deferTaxAssetYoy", getDeferTaxAssetYoy())
            .append("otherNoncurrentAsset", getOtherNoncurrentAsset())
            .append("otherNoncurrentAssetYoy", getOtherNoncurrentAssetYoy())
            .append("totalNoncurrentAssets", getTotalNoncurrentAssets())
            .append("totalNoncurrentAssetsYoy", getTotalNoncurrentAssetsYoy())
            .append("totalAssets", getTotalAssets())
            .append("totalAssetsYoy", getTotalAssetsYoy())
            .append("shortLoan", getShortLoan())
            .append("shortLoanYoy", getShortLoanYoy())
            .append("noteAccountsPayable", getNoteAccountsPayable())
            .append("noteAccountsPayableYoy", getNoteAccountsPayableYoy())
            .append("notePayable", getNotePayable())
            .append("notePayableYoy", getNotePayableYoy())
            .append("accountsPayable", getAccountsPayable())
            .append("accountsPayableYoy", getAccountsPayableYoy())
            .append("contractLiab", getContractLiab())
            .append("contractLiabYoy", getContractLiabYoy())
            .append("staffSalaryPayable", getStaffSalaryPayable())
            .append("staffSalaryPayableYoy", getStaffSalaryPayableYoy())
            .append("taxPayable", getTaxPayable())
            .append("taxPayableYoy", getTaxPayableYoy())
            .append("totalOtherPayable", getTotalOtherPayable())
            .append("totalOtherPayableYoy", getTotalOtherPayableYoy())
            .append("dividendPayable", getDividendPayable())
            .append("dividendPayableYoy", getDividendPayableYoy())
            .append("noncurrentLiab1year", getNoncurrentLiab1year())
            .append("noncurrentLiab1yearYoy", getNoncurrentLiab1yearYoy())
            .append("otherCurrentLiab", getOtherCurrentLiab())
            .append("otherCurrentLiabYoy", getOtherCurrentLiabYoy())
            .append("totalCurrentLiab", getTotalCurrentLiab())
            .append("totalCurrentLiabYoy", getTotalCurrentLiabYoy())
            .append("longLoan", getLongLoan())
            .append("longLoanYoy", getLongLoanYoy())
            .append("leaseLiab", getLeaseLiab())
            .append("leaseLiabYoy", getLeaseLiabYoy())
            .append("longPayable", getLongPayable())
            .append("longPayableYoy", getLongPayableYoy())
            .append("longStaffsalaryPayable", getLongStaffsalaryPayable())
            .append("longStaffsalaryPayableYoy", getLongStaffsalaryPayableYoy())
            .append("predictLiab", getPredictLiab())
            .append("predictLiabYoy", getPredictLiabYoy())
            .append("deferIncome", getDeferIncome())
            .append("deferIncomeYoy", getDeferIncomeYoy())
            .append("deferTaxLiab", getDeferTaxLiab())
            .append("deferTaxLiabYoy", getDeferTaxLiabYoy())
            .append("totalNoncurrentLiab", getTotalNoncurrentLiab())
            .append("totalNoncurrentLiabYoy", getTotalNoncurrentLiabYoy())
            .append("totalLiabilities", getTotalLiabilities())
            .append("totalLiabilitiesYoy", getTotalLiabilitiesYoy())
            .append("shareCapital", getShareCapital())
            .append("shareCapitalYoy", getShareCapitalYoy())
            .append("capitalReserve", getCapitalReserve())
            .append("capitalReserveYoy", getCapitalReserveYoy())
            .append("otherCompreIncome", getOtherCompreIncome())
            .append("otherCompreIncomeYoy", getOtherCompreIncomeYoy())
            .append("specialReserve", getSpecialReserve())
            .append("specialReserveYoy", getSpecialReserveYoy())
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
