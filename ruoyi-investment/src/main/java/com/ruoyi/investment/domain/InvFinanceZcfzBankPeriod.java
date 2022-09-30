package com.ruoyi.investment.domain;

import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 财务分析-资产负债-银行类-报告期对象 inv_finance_zcfz_bank_period
 * 
 * @author yangwenyang
 * @date 2022-09-30
 */
public class InvFinanceZcfzBankPeriod extends BaseEntity
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

    /** 现金及存放中央银行款项 */
    @Excel(name = "现金及存放中央银行款项")
    private Double cashDepositPbc;

    /** 现金及存放中央银行款项(环比%) */
    @Excel(name = "现金及存放中央银行款项(环比%)")
    private Double cashDepositPbcYoy;

    /** 存放同业款项 */
    @Excel(name = "存放同业款项")
    private Double depositInterbank;

    /** 存放同业款项(环比%) */
    @Excel(name = "存放同业款项(环比%)")
    private Double depositInterbankYoy;

    /** 贵金属 */
    @Excel(name = "贵金属")
    private Double preciousMetal;

    /** 贵金属(环比%) */
    @Excel(name = "贵金属(环比%)")
    private Double preciousMetalYoy;

    /** 拆出资金 */
    @Excel(name = "拆出资金")
    private Double lendFund;

    /** 拆出资金(环比%) */
    @Excel(name = "拆出资金(环比%)")
    private Double lendFundYoy;

    /** 以公允价值计量且其变动计入当期损益的金融资产 */
    @Excel(name = "以公允价值计量且其变动计入当期损益的金融资产")
    private Double fvtplFinasset;

    /** 以公允价值计量且其变动计入当期损益的金融资产(环比%) */
    @Excel(name = "以公允价值计量且其变动计入当期损益的金融资产(环比%)")
    private Double fvtplFinassetYoy;

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

    /** 发放贷款及垫款 */
    @Excel(name = "发放贷款及垫款")
    private Double loanAdvance;

    /** 发放贷款及垫款(环比%) */
    @Excel(name = "发放贷款及垫款(环比%)")
    private Double loanAdvanceYoy;

    /** 以摊余成本计量的金融资产 */
    @Excel(name = "以摊余成本计量的金融资产")
    private Double amortizeCostFinasset;

    /** 以摊余成本计量的金融资产(环比%) */
    @Excel(name = "以摊余成本计量的金融资产(环比%)")
    private Double amortizeCostFinassetyoy;

    /** 以公允价值计量且其变动计入其他综合收益的金融资产 */
    @Excel(name = "以公允价值计量且其变动计入其他综合收益的金融资产")
    private Double fvtociFinasset;

    /** 以公允价值计量且其变动计入其他综合收益的金融资产(环比%) */
    @Excel(name = "以公允价值计量且其变动计入其他综合收益的金融资产(环比%)")
    private Double fvtociFinassetYoy;

    /** 长期股权投资 */
    @Excel(name = "长期股权投资")
    private Double longEquityInvest;

    /** 长期股权投资(环比%) */
    @Excel(name = "长期股权投资(环比%)")
    private Double longEquityInvestYoy;

    /** 固定资产 */
    @Excel(name = "固定资产")
    private Double fixedAsset;

    /** 固定资产(环比%) */
    @Excel(name = "固定资产(环比%)")
    private Double fixedAssetYoy;

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

    /** 向中央银行借款 */
    @Excel(name = "向中央银行借款")
    private Double loanPbc;

    /** 向中央银行借款(环比%) */
    @Excel(name = "向中央银行借款(环比%)")
    private Double loanPbcYoy;

    /** 同业及其他金融机构存放款项 */
    @Excel(name = "同业及其他金融机构存放款项")
    private Double iofiDeposit;

    /** 同业及其他金融机构存放款项(环比%) */
    @Excel(name = "同业及其他金融机构存放款项(环比%)")
    private Double iofiDepositYoy;

    /** 拆入资金 */
    @Excel(name = "拆入资金")
    private Double borrowFund;

    /** 拆入资金(环比%) */
    @Excel(name = "拆入资金(环比%)")
    private Double borrowFundYoy;

    /** 以公允价值计量且其变动计入当期损益的金融负债 */
    @Excel(name = "以公允价值计量且其变动计入当期损益的金融负债")
    private Double fvtplFinliab;

    /** 以公允价值计量且其变动计入当期损益的金融负债(环比%) */
    @Excel(name = "以公允价值计量且其变动计入当期损益的金融负债(环比%)")
    private Double fvtplFinliabYoy;

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

    /** 吸收存款 */
    @Excel(name = "吸收存款")
    private Double acceptDeposit;

    /** 吸收存款(环比%) */
    @Excel(name = "吸收存款(环比%)")
    private Double acceptDepositYoy;

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

    /** 递延所得税负债 */
    @Excel(name = "递延所得税负债")
    private Double deferTaxLiab;

    /** 递延所得税负债(环比%) */
    @Excel(name = "递延所得税负债(环比%)")
    private Double deferTaxLiabYoy;

    /** 应付债券 */
    @Excel(name = "应付债券")
    private Double bondPayable;

    /** 应付债券(环比%) */
    @Excel(name = "应付债券(环比%)")
    private Double bondPayableYoy;

    /** 其他负债 */
    @Excel(name = "其他负债")
    private Double otherLiab;

    /** 其他负债(环比%) */
    @Excel(name = "其他负债(环比%)")
    private Double otherLiabYoy;

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

    /** 其他权益工具 */
    @Excel(name = "其他权益工具")
    private Double otherEquityOther;

    /** 其他权益工具(环比%) */
    @Excel(name = "其他权益工具(环比%)")
    private Double otherEquityOtherYoy;

    /** 优先股 */
    @Excel(name = "优先股")
    private Double preferredShares;

    /** 优先股(环比%) */
    @Excel(name = "优先股(环比%)")
    private Double preferredSharesYoy;

    /** 永续债 */
    @Excel(name = "永续债")
    private Double perpetualBond;

    /** 永续债(环比%) */
    @Excel(name = "永续债(环比%)")
    private Double perpetualBondYoy;

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
    public void setCashDepositPbc(Double cashDepositPbc) 
    {
        this.cashDepositPbc = cashDepositPbc;
    }

    public Double getCashDepositPbc() 
    {
        return cashDepositPbc;
    }
    public void setCashDepositPbcYoy(Double cashDepositPbcYoy) 
    {
        this.cashDepositPbcYoy = cashDepositPbcYoy;
    }

    public Double getCashDepositPbcYoy() 
    {
        return cashDepositPbcYoy;
    }
    public void setDepositInterbank(Double depositInterbank) 
    {
        this.depositInterbank = depositInterbank;
    }

    public Double getDepositInterbank() 
    {
        return depositInterbank;
    }
    public void setDepositInterbankYoy(Double depositInterbankYoy) 
    {
        this.depositInterbankYoy = depositInterbankYoy;
    }

    public Double getDepositInterbankYoy() 
    {
        return depositInterbankYoy;
    }
    public void setPreciousMetal(Double preciousMetal) 
    {
        this.preciousMetal = preciousMetal;
    }

    public Double getPreciousMetal() 
    {
        return preciousMetal;
    }
    public void setPreciousMetalYoy(Double preciousMetalYoy) 
    {
        this.preciousMetalYoy = preciousMetalYoy;
    }

    public Double getPreciousMetalYoy() 
    {
        return preciousMetalYoy;
    }
    public void setLendFund(Double lendFund) 
    {
        this.lendFund = lendFund;
    }

    public Double getLendFund() 
    {
        return lendFund;
    }
    public void setLendFundYoy(Double lendFundYoy) 
    {
        this.lendFundYoy = lendFundYoy;
    }

    public Double getLendFundYoy() 
    {
        return lendFundYoy;
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
    public void setAmortizeCostFinasset(Double amortizeCostFinasset) 
    {
        this.amortizeCostFinasset = amortizeCostFinasset;
    }

    public Double getAmortizeCostFinasset() 
    {
        return amortizeCostFinasset;
    }
    public void setAmortizeCostFinassetyoy(Double amortizeCostFinassetyoy) 
    {
        this.amortizeCostFinassetyoy = amortizeCostFinassetyoy;
    }

    public Double getAmortizeCostFinassetyoy() 
    {
        return amortizeCostFinassetyoy;
    }
    public void setFvtociFinasset(Double fvtociFinasset) 
    {
        this.fvtociFinasset = fvtociFinasset;
    }

    public Double getFvtociFinasset() 
    {
        return fvtociFinasset;
    }
    public void setFvtociFinassetYoy(Double fvtociFinassetYoy) 
    {
        this.fvtociFinassetYoy = fvtociFinassetYoy;
    }

    public Double getFvtociFinassetYoy() 
    {
        return fvtociFinassetYoy;
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
    public void setLoanPbc(Double loanPbc) 
    {
        this.loanPbc = loanPbc;
    }

    public Double getLoanPbc() 
    {
        return loanPbc;
    }
    public void setLoanPbcYoy(Double loanPbcYoy) 
    {
        this.loanPbcYoy = loanPbcYoy;
    }

    public Double getLoanPbcYoy() 
    {
        return loanPbcYoy;
    }
    public void setIofiDeposit(Double iofiDeposit) 
    {
        this.iofiDeposit = iofiDeposit;
    }

    public Double getIofiDeposit() 
    {
        return iofiDeposit;
    }
    public void setIofiDepositYoy(Double iofiDepositYoy) 
    {
        this.iofiDepositYoy = iofiDepositYoy;
    }

    public Double getIofiDepositYoy() 
    {
        return iofiDepositYoy;
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
    public void setFvtplFinliab(Double fvtplFinliab) 
    {
        this.fvtplFinliab = fvtplFinliab;
    }

    public Double getFvtplFinliab() 
    {
        return fvtplFinliab;
    }
    public void setFvtplFinliabYoy(Double fvtplFinliabYoy) 
    {
        this.fvtplFinliabYoy = fvtplFinliabYoy;
    }

    public Double getFvtplFinliabYoy() 
    {
        return fvtplFinliabYoy;
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
    public void setAcceptDeposit(Double acceptDeposit) 
    {
        this.acceptDeposit = acceptDeposit;
    }

    public Double getAcceptDeposit() 
    {
        return acceptDeposit;
    }
    public void setAcceptDepositYoy(Double acceptDepositYoy) 
    {
        this.acceptDepositYoy = acceptDepositYoy;
    }

    public Double getAcceptDepositYoy() 
    {
        return acceptDepositYoy;
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
    public void setOtherEquityOther(Double otherEquityOther) 
    {
        this.otherEquityOther = otherEquityOther;
    }

    public Double getOtherEquityOther() 
    {
        return otherEquityOther;
    }
    public void setOtherEquityOtherYoy(Double otherEquityOtherYoy) 
    {
        this.otherEquityOtherYoy = otherEquityOtherYoy;
    }

    public Double getOtherEquityOtherYoy() 
    {
        return otherEquityOtherYoy;
    }
    public void setPreferredShares(Double preferredShares) 
    {
        this.preferredShares = preferredShares;
    }

    public Double getPreferredShares() 
    {
        return preferredShares;
    }
    public void setPreferredSharesYoy(Double preferredSharesYoy) 
    {
        this.preferredSharesYoy = preferredSharesYoy;
    }

    public Double getPreferredSharesYoy() 
    {
        return preferredSharesYoy;
    }
    public void setPerpetualBond(Double perpetualBond) 
    {
        this.perpetualBond = perpetualBond;
    }

    public Double getPerpetualBond() 
    {
        return perpetualBond;
    }
    public void setPerpetualBondYoy(Double perpetualBondYoy) 
    {
        this.perpetualBondYoy = perpetualBondYoy;
    }

    public Double getPerpetualBondYoy() 
    {
        return perpetualBondYoy;
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

    public InvFinanceZcfzBankPeriod() {
        super();
    }

    public InvFinanceZcfzBankPeriod(String securityCode) {
        this.securityCode = securityCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvFinanceZcfzBankPeriod)) return false;
        InvFinanceZcfzBankPeriod that = (InvFinanceZcfzBankPeriod) o;
        return Objects.equals(id, that.id) && Objects.equals(securityCode, that.securityCode) && Objects.equals(reportDate, that.reportDate) && Objects.equals(cashDepositPbc, that.cashDepositPbc) && Objects.equals(cashDepositPbcYoy, that.cashDepositPbcYoy) && Objects.equals(depositInterbank, that.depositInterbank) && Objects.equals(depositInterbankYoy, that.depositInterbankYoy) && Objects.equals(preciousMetal, that.preciousMetal) && Objects.equals(preciousMetalYoy, that.preciousMetalYoy) && Objects.equals(lendFund, that.lendFund) && Objects.equals(lendFundYoy, that.lendFundYoy) && Objects.equals(fvtplFinasset, that.fvtplFinasset) && Objects.equals(fvtplFinassetYoy, that.fvtplFinassetYoy) && Objects.equals(deriveFinasset, that.deriveFinasset) && Objects.equals(deriveFinassetYoy, that.deriveFinassetYoy) && Objects.equals(buyResaleFinasset, that.buyResaleFinasset) && Objects.equals(buyResaleFinassetYoy, that.buyResaleFinassetYoy) && Objects.equals(loanAdvance, that.loanAdvance) && Objects.equals(loanAdvanceYoy, that.loanAdvanceYoy) && Objects.equals(amortizeCostFinasset, that.amortizeCostFinasset) && Objects.equals(amortizeCostFinassetyoy, that.amortizeCostFinassetyoy) && Objects.equals(fvtociFinasset, that.fvtociFinasset) && Objects.equals(fvtociFinassetYoy, that.fvtociFinassetYoy) && Objects.equals(longEquityInvest, that.longEquityInvest) && Objects.equals(longEquityInvestYoy, that.longEquityInvestYoy) && Objects.equals(fixedAsset, that.fixedAsset) && Objects.equals(fixedAssetYoy, that.fixedAssetYoy) && Objects.equals(intangibleAsset, that.intangibleAsset) && Objects.equals(intangibleAssetYoy, that.intangibleAssetYoy) && Objects.equals(goodwill, that.goodwill) && Objects.equals(goodwillYoy, that.goodwillYoy) && Objects.equals(deferTaxAsset, that.deferTaxAsset) && Objects.equals(deferTaxAssetYoy, that.deferTaxAssetYoy) && Objects.equals(otherAsset, that.otherAsset) && Objects.equals(otherAssetYoy, that.otherAssetYoy) && Objects.equals(assetOther, that.assetOther) && Objects.equals(assetOtherYoy, that.assetOtherYoy) && Objects.equals(totalAssets, that.totalAssets) && Objects.equals(totalAssetsYoy, that.totalAssetsYoy) && Objects.equals(loanPbc, that.loanPbc) && Objects.equals(loanPbcYoy, that.loanPbcYoy) && Objects.equals(iofiDeposit, that.iofiDeposit) && Objects.equals(iofiDepositYoy, that.iofiDepositYoy) && Objects.equals(borrowFund, that.borrowFund) && Objects.equals(borrowFundYoy, that.borrowFundYoy) && Objects.equals(fvtplFinliab, that.fvtplFinliab) && Objects.equals(fvtplFinliabYoy, that.fvtplFinliabYoy) && Objects.equals(deriveFinliab, that.deriveFinliab) && Objects.equals(deriveFinliabYoy, that.deriveFinliabYoy) && Objects.equals(sellRepoFinasset, that.sellRepoFinasset) && Objects.equals(sellRepoFinassetYoy, that.sellRepoFinassetYoy) && Objects.equals(acceptDeposit, that.acceptDeposit) && Objects.equals(acceptDepositYoy, that.acceptDepositYoy) && Objects.equals(staffSalaryPayable, that.staffSalaryPayable) && Objects.equals(staffSalaryPayableYoy, that.staffSalaryPayableYoy) && Objects.equals(taxPayable, that.taxPayable) && Objects.equals(taxPayableYoy, that.taxPayableYoy) && Objects.equals(predictLiab, that.predictLiab) && Objects.equals(predictLiabYoy, that.predictLiabYoy) && Objects.equals(deferTaxLiab, that.deferTaxLiab) && Objects.equals(deferTaxLiabYoy, that.deferTaxLiabYoy) && Objects.equals(bondPayable, that.bondPayable) && Objects.equals(bondPayableYoy, that.bondPayableYoy) && Objects.equals(otherLiab, that.otherLiab) && Objects.equals(otherLiabYoy, that.otherLiabYoy) && Objects.equals(totalLiabilities, that.totalLiabilities) && Objects.equals(totalLiabilitiesYoy, that.totalLiabilitiesYoy) && Objects.equals(shareCapital, that.shareCapital) && Objects.equals(shareCapitalYoy, that.shareCapitalYoy) && Objects.equals(otherEquityOther, that.otherEquityOther) && Objects.equals(otherEquityOtherYoy, that.otherEquityOtherYoy) && Objects.equals(preferredShares, that.preferredShares) && Objects.equals(preferredSharesYoy, that.preferredSharesYoy) && Objects.equals(perpetualBond, that.perpetualBond) && Objects.equals(perpetualBondYoy, that.perpetualBondYoy) && Objects.equals(capitalReserve, that.capitalReserve) && Objects.equals(capitalReserveYoy, that.capitalReserveYoy) && Objects.equals(otherCompreIncome, that.otherCompreIncome) && Objects.equals(otherCompreIncomeYoy, that.otherCompreIncomeYoy) && Objects.equals(surplusReserve, that.surplusReserve) && Objects.equals(surplusReserveYoy, that.surplusReserveYoy) && Objects.equals(generalRiskReserve, that.generalRiskReserve) && Objects.equals(generalRiskReserveYoy, that.generalRiskReserveYoy) && Objects.equals(unassignRpofit, that.unassignRpofit) && Objects.equals(unassignRpofitYoy, that.unassignRpofitYoy) && Objects.equals(totalParentEquity, that.totalParentEquity) && Objects.equals(totalParentEquityYoy, that.totalParentEquityYoy) && Objects.equals(minorityEquity, that.minorityEquity) && Objects.equals(minorityEquityYoy, that.minorityEquityYoy) && Objects.equals(totalEquity, that.totalEquity) && Objects.equals(totalEquityYoy, that.totalEquityYoy) && Objects.equals(totalLiabEquity, that.totalLiabEquity) && Objects.equals(totalLiabEquityYoy, that.totalLiabEquityYoy) && Objects.equals(opinionType, that.opinionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, securityCode, reportDate, cashDepositPbc, cashDepositPbcYoy, depositInterbank, depositInterbankYoy, preciousMetal, preciousMetalYoy, lendFund, lendFundYoy, fvtplFinasset, fvtplFinassetYoy, deriveFinasset, deriveFinassetYoy, buyResaleFinasset, buyResaleFinassetYoy, loanAdvance, loanAdvanceYoy, amortizeCostFinasset, amortizeCostFinassetyoy, fvtociFinasset, fvtociFinassetYoy, longEquityInvest, longEquityInvestYoy, fixedAsset, fixedAssetYoy, intangibleAsset, intangibleAssetYoy, goodwill, goodwillYoy, deferTaxAsset, deferTaxAssetYoy, otherAsset, otherAssetYoy, assetOther, assetOtherYoy, totalAssets, totalAssetsYoy, loanPbc, loanPbcYoy, iofiDeposit, iofiDepositYoy, borrowFund, borrowFundYoy, fvtplFinliab, fvtplFinliabYoy, deriveFinliab, deriveFinliabYoy, sellRepoFinasset, sellRepoFinassetYoy, acceptDeposit, acceptDepositYoy, staffSalaryPayable, staffSalaryPayableYoy, taxPayable, taxPayableYoy, predictLiab, predictLiabYoy, deferTaxLiab, deferTaxLiabYoy, bondPayable, bondPayableYoy, otherLiab, otherLiabYoy, totalLiabilities, totalLiabilitiesYoy, shareCapital, shareCapitalYoy, otherEquityOther, otherEquityOtherYoy, preferredShares, preferredSharesYoy, perpetualBond, perpetualBondYoy, capitalReserve, capitalReserveYoy, otherCompreIncome, otherCompreIncomeYoy, surplusReserve, surplusReserveYoy, generalRiskReserve, generalRiskReserveYoy, unassignRpofit, unassignRpofitYoy, totalParentEquity, totalParentEquityYoy, minorityEquity, minorityEquityYoy, totalEquity, totalEquityYoy, totalLiabEquity, totalLiabEquityYoy, opinionType);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("securityCode", getSecurityCode())
            .append("reportDate", getReportDate())
            .append("cashDepositPbc", getCashDepositPbc())
            .append("cashDepositPbcYoy", getCashDepositPbcYoy())
            .append("depositInterbank", getDepositInterbank())
            .append("depositInterbankYoy", getDepositInterbankYoy())
            .append("preciousMetal", getPreciousMetal())
            .append("preciousMetalYoy", getPreciousMetalYoy())
            .append("lendFund", getLendFund())
            .append("lendFundYoy", getLendFundYoy())
            .append("fvtplFinasset", getFvtplFinasset())
            .append("fvtplFinassetYoy", getFvtplFinassetYoy())
            .append("deriveFinasset", getDeriveFinasset())
            .append("deriveFinassetYoy", getDeriveFinassetYoy())
            .append("buyResaleFinasset", getBuyResaleFinasset())
            .append("buyResaleFinassetYoy", getBuyResaleFinassetYoy())
            .append("loanAdvance", getLoanAdvance())
            .append("loanAdvanceYoy", getLoanAdvanceYoy())
            .append("amortizeCostFinasset", getAmortizeCostFinasset())
            .append("amortizeCostFinassetyoy", getAmortizeCostFinassetyoy())
            .append("fvtociFinasset", getFvtociFinasset())
            .append("fvtociFinassetYoy", getFvtociFinassetYoy())
            .append("longEquityInvest", getLongEquityInvest())
            .append("longEquityInvestYoy", getLongEquityInvestYoy())
            .append("fixedAsset", getFixedAsset())
            .append("fixedAssetYoy", getFixedAssetYoy())
            .append("intangibleAsset", getIntangibleAsset())
            .append("intangibleAssetYoy", getIntangibleAssetYoy())
            .append("goodwill", getGoodwill())
            .append("goodwillYoy", getGoodwillYoy())
            .append("deferTaxAsset", getDeferTaxAsset())
            .append("deferTaxAssetYoy", getDeferTaxAssetYoy())
            .append("otherAsset", getOtherAsset())
            .append("otherAssetYoy", getOtherAssetYoy())
            .append("assetOther", getAssetOther())
            .append("assetOtherYoy", getAssetOtherYoy())
            .append("totalAssets", getTotalAssets())
            .append("totalAssetsYoy", getTotalAssetsYoy())
            .append("loanPbc", getLoanPbc())
            .append("loanPbcYoy", getLoanPbcYoy())
            .append("iofiDeposit", getIofiDeposit())
            .append("iofiDepositYoy", getIofiDepositYoy())
            .append("borrowFund", getBorrowFund())
            .append("borrowFundYoy", getBorrowFundYoy())
            .append("fvtplFinliab", getFvtplFinliab())
            .append("fvtplFinliabYoy", getFvtplFinliabYoy())
            .append("deriveFinliab", getDeriveFinliab())
            .append("deriveFinliabYoy", getDeriveFinliabYoy())
            .append("sellRepoFinasset", getSellRepoFinasset())
            .append("sellRepoFinassetYoy", getSellRepoFinassetYoy())
            .append("acceptDeposit", getAcceptDeposit())
            .append("acceptDepositYoy", getAcceptDepositYoy())
            .append("staffSalaryPayable", getStaffSalaryPayable())
            .append("staffSalaryPayableYoy", getStaffSalaryPayableYoy())
            .append("taxPayable", getTaxPayable())
            .append("taxPayableYoy", getTaxPayableYoy())
            .append("predictLiab", getPredictLiab())
            .append("predictLiabYoy", getPredictLiabYoy())
            .append("deferTaxLiab", getDeferTaxLiab())
            .append("deferTaxLiabYoy", getDeferTaxLiabYoy())
            .append("bondPayable", getBondPayable())
            .append("bondPayableYoy", getBondPayableYoy())
            .append("otherLiab", getOtherLiab())
            .append("otherLiabYoy", getOtherLiabYoy())
            .append("totalLiabilities", getTotalLiabilities())
            .append("totalLiabilitiesYoy", getTotalLiabilitiesYoy())
            .append("shareCapital", getShareCapital())
            .append("shareCapitalYoy", getShareCapitalYoy())
            .append("otherEquityOther", getOtherEquityOther())
            .append("otherEquityOtherYoy", getOtherEquityOtherYoy())
            .append("preferredShares", getPreferredShares())
            .append("preferredSharesYoy", getPreferredSharesYoy())
            .append("perpetualBond", getPerpetualBond())
            .append("perpetualBondYoy", getPerpetualBondYoy())
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
