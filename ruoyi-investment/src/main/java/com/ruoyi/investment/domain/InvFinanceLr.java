package com.ruoyi.investment.domain;

import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 财务分析-利润对象 inv_finance_lr
 * 
 * @author yangwenyang
 * @date 2022-11-05
 */
public class InvFinanceLr extends BaseEntity
{
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

    /** 审计意见(境内) */
    @Excel(name = "审计意见(境内)")
    private String opinionType;

    /** 审计意见(境外) */
    @Excel(name = "审计意见(境外)")
    private String osopinionType;

    /** 营业收入总额 */
    @Excel(name = "营业收入总额")
    private Double operateIncome;

    /** 营业收入总额(环比%) */
    @Excel(name = "营业收入总额(环比%)")
    private Double operateIncomeYoy;

    /** 利息净收入 */
    @Excel(name = "利息净收入")
    private Double interestNi;

    /** 利息净收入(环比%) */
    @Excel(name = "利息净收入(环比%)")
    private Double interestNiYoy;

    /** 利息收入 */
    @Excel(name = "利息收入")
    private Double interestIncome;

    /** 利息收入(环比%) */
    @Excel(name = "利息收入(环比%)")
    private Double interestIncomeYoy;

    /** 利息支出 */
    @Excel(name = "利息支出")
    private Double interestExpense;

    /** 利息支出(环比%) */
    @Excel(name = "利息支出(环比%)")
    private Double interestExpenseYoy;

    /** 手续费及佣金净收入 */
    @Excel(name = "手续费及佣金净收入")
    private Double feeCommissionNi;

    /** 手续费及佣金净收入(环比%) */
    @Excel(name = "手续费及佣金净收入(环比%)")
    private Double feeCommissionNiYoy;

    /** 手续费及佣金收入 */
    @Excel(name = "手续费及佣金收入")
    private Double feeCommissionIncome;

    /** 手续费及佣金收入(环比%) */
    @Excel(name = "手续费及佣金收入(环比%)")
    private Double feeCommissionIncomeYoy;

    /** 手续费及佣金支出 */
    @Excel(name = "手续费及佣金支出")
    private Double feeCommissionExpense;

    /** 手续费及佣金支出(环比%) */
    @Excel(name = "手续费及佣金支出(环比%)")
    private Double feeCommissionExpenseYoy;

    /** 投资收益 */
    @Excel(name = "投资收益")
    private Double investIncome;

    /** 投资收益(环比%) */
    @Excel(name = "投资收益(环比%)")
    private Double investIncomeYoy;

    /** 对联营企业和合营企业的投资收益 */
    @Excel(name = "对联营企业和合营企业的投资收益")
    private Double investJointIncome;

    /** 对联营企业和合营企业的投资收益(环比%) */
    @Excel(name = "对联营企业和合营企业的投资收益(环比%)")
    private Double investJointIncomeYoy;

    /** 公允价值变动收益 */
    @Excel(name = "公允价值变动收益")
    private Double fairvalueChangeIncome;

    /** 公允价值变动收益(环比%) */
    @Excel(name = "公允价值变动收益(环比%)")
    private Double fairvalueChangeIncomeYoy;

    /** 汇兑损失 */
    @Excel(name = "汇兑损失")
    private Double exchangeIncome;

    /** 汇兑损失(环比%) */
    @Excel(name = "汇兑损失(环比%)")
    private Double exchangeIncomeYoy;

    /** 其他业务收入 */
    @Excel(name = "其他业务收入")
    private Double otherBusinessIncome;

    /** 其他业务收入(环比%) */
    @Excel(name = "其他业务收入(环比%)")
    private Double otherBusinessIncomeYoy;

    /** 资产处置收益 */
    @Excel(name = "资产处置收益")
    private Double assetDisposalIncome;

    /** 资产处置收益(环比%) */
    @Excel(name = "资产处置收益(环比%)")
    private Double assetDisposalIncomeYoy;

    /** 其他收益 */
    @Excel(name = "其他收益")
    private Double otherIncome;

    /** 其他收益(环比%) */
    @Excel(name = "其他收益(环比%)")
    private Double otherIncomeYoy;

    /** 营业收入其他项目 */
    @Excel(name = "营业收入其他项目")
    private Double operateIncomeOther;

    /** 营业收入其他项目(环比%) */
    @Excel(name = "营业收入其他项目(环比%)")
    private Double operateIncomeOtherYoy;

    /** 营业收入平衡项目 */
    @Excel(name = "营业收入平衡项目")
    private Double operateIncomeBalance;

    /** 营业收入平衡项目(环比%) */
    @Excel(name = "营业收入平衡项目(环比%)")
    private Double operateIncomeBalanceYoy;

    /** 营业支出总额 */
    @Excel(name = "营业支出总额")
    private Double operateExpense;

    /** 营业支出总额(环比%) */
    @Excel(name = "营业支出总额(环比%)")
    private Double operateExpenseYoy;

    /** 税金及附加 */
    @Excel(name = "税金及附加")
    private Double operateTaxAdd;

    /** 税金及附加(环比%) */
    @Excel(name = "税金及附加(环比%)")
    private Double operateTaxAddYoy;

    /** 业务及管理费 */
    @Excel(name = "业务及管理费")
    private Double businessManageExpense;

    /** 业务及管理费(环比%) */
    @Excel(name = "业务及管理费(环比%)")
    private Double businessManageExpenseYoy;

    /** 资产减值损失 */
    @Excel(name = "资产减值损失")
    private Double assetImpairmentLoss;

    /** 资产减值损失(环比%) */
    @Excel(name = "资产减值损失(环比%)")
    private Double assetImpairmentLossYoy;

    /** 信用减值损失 */
    @Excel(name = "信用减值损失")
    private Double creditImpairmentLoss;

    /** 信用减值损失(环比%) */
    @Excel(name = "信用减值损失(环比%)")
    private Double creditImpairmentLossYoy;

    /** 其他业务成本 */
    @Excel(name = "其他业务成本")
    private Double otherBusinessCost;

    /** 其他业务成本(环比%) */
    @Excel(name = "其他业务成本(环比%)")
    private Double otherBusinessCostYoy;

    /** 营业支出其他项目 */
    @Excel(name = "营业支出其他项目")
    private Double operateExpenseOther;

    /** 营业支出其他项目(环比%) */
    @Excel(name = "营业支出其他项目(环比%)")
    private Double operateExpenseOtherYoy;

    /** 营业支出平衡项目 */
    @Excel(name = "营业支出平衡项目")
    private Double operateExpenseBalance;

    /** 营业支出平衡项目(环比%) */
    @Excel(name = "营业支出平衡项目(环比%)")
    private Double operateExpenseBalanceYoy;

    /** 营业利润其他项目 */
    @Excel(name = "营业利润其他项目")
    private Double operateProfitOther;

    /** 营业利润其他项目(环比%) */
    @Excel(name = "营业利润其他项目(环比%)")
    private Double operateProfitOtherYoy;

    /** 营业利润平衡项目 */
    @Excel(name = "营业利润平衡项目")
    private Double operateProfitBalance;

    /** 营业利润平衡项目(环比%) */
    @Excel(name = "营业利润平衡项目(环比%)")
    private Double operateProfitBalanceYoy;

    /** 营业利润 */
    @Excel(name = "营业利润")
    private Double operateProfit;

    /** 营业利润(环比%) */
    @Excel(name = "营业利润(环比%)")
    private Double operateProfitYoy;

    /** 营业外收入 */
    @Excel(name = "营业外收入")
    private Double nonbusinessIncome;

    /** 营业外收入(环比%) */
    @Excel(name = "营业外收入(环比%)")
    private Double nonbusinessIncomeYoy;

    /** 非流动资产处置利得 */
    @Excel(name = "非流动资产处置利得")
    private Double noncurrentDisposalIncome;

    /** 非流动资产处置利得(环比%) */
    @Excel(name = "非流动资产处置利得(环比%)")
    private Double noncurrentDisposalIncomeYoy;

    /** 营业外支出 */
    @Excel(name = "营业外支出")
    private Double nonbusinessExpense;

    /** 营业外支出(环比%) */
    @Excel(name = "营业外支出(环比%)")
    private Double nonbusinessExpenseYoy;

    /** 非流动资产处置净损失 */
    @Excel(name = "非流动资产处置净损失")
    private Double noncurrentDisposalLoss;

    /** 非流动资产处置净损失(环比%) */
    @Excel(name = "非流动资产处置净损失(环比%)")
    private Double noncurrentDisposalLossYoy;

    /** 影响利润总额的其他项目 */
    @Excel(name = "影响利润总额的其他项目")
    private Double effectTpOther;

    /** 影响利润总额的其他项目(环比%) */
    @Excel(name = "影响利润总额的其他项目(环比%)")
    private Double effectTpOtherYoy;

    /** 利润总额平衡项目 */
    @Excel(name = "利润总额平衡项目")
    private Double totalProfitBalance;

    /** 利润总额平衡项目(环比%) */
    @Excel(name = "利润总额平衡项目(环比%)")
    private Double totalProfitBalanceYoy;

    /** 利润总额 */
    @Excel(name = "利润总额")
    private Double totalProfit;

    /** 利润总额(环比%) */
    @Excel(name = "利润总额(环比%)")
    private Double totalProfitYoy;

    /** 所得税 */
    @Excel(name = "所得税")
    private Double incomeTax;

    /** 所得税(环比%) */
    @Excel(name = "所得税(环比%)")
    private Double incomeTaxYoy;

    /** 影响净利润的其他项目 */
    @Excel(name = "影响净利润的其他项目")
    private Double effectNetprofitOther;

    /** 影响净利润的其他项目(环比%) */
    @Excel(name = "影响净利润的其他项目(环比%)")
    private Double effectNetprofitOtherYoy;

    /** 影响净利润的平衡项目 */
    @Excel(name = "影响净利润的平衡项目")
    private Double effectNetprofitBalance;

    /** 影响净利润的平衡项目(环比%) */
    @Excel(name = "影响净利润的平衡项目(环比%)")
    private Double effectNetprofitBalanceYoy;

    /** 净利润 */
    @Excel(name = "净利润")
    private Double netprofit;

    /** 净利润(环比%) */
    @Excel(name = "净利润(环比%)")
    private Double netprofitYoy;

    /** 持续经营净利润 */
    @Excel(name = "持续经营净利润")
    private Double continuedNetprofit;

    /** 持续经营净利润(环比%) */
    @Excel(name = "持续经营净利润(环比%)")
    private Double continuedNetprofitYoy;

    /** 终止经营净利润 */
    @Excel(name = "终止经营净利润")
    private Double discontinuedNetprofit;

    /** 终止经营净利润(环比%) */
    @Excel(name = "终止经营净利润(环比%)")
    private Double discontinuedNetprofitYoy;

    /** 归属于母公司股东的净利润 */
    @Excel(name = "归属于母公司股东的净利润")
    private Double parentNetprofit;

    /** 归属于母公司股东的净利润(环比%) */
    @Excel(name = "归属于母公司股东的净利润(环比%)")
    private Double parentNetprofitYoy;

    /** 少数股东损益 */
    @Excel(name = "少数股东损益")
    private Double minorityInterest;

    /** 少数股东损益(环比%) */
    @Excel(name = "少数股东损益(环比%)")
    private Double minorityInterestYoy;

    /** 扣除非经常性损益后的净利润 */
    @Excel(name = "扣除非经常性损益后的净利润")
    private Double deductParentNetprofit;

    /** 扣除非经常性损益后的净利润(环比%) */
    @Excel(name = "扣除非经常性损益后的净利润(环比%)")
    private Double deductParentNetprofitYoy;

    /** 净利润其他项目 */
    @Excel(name = "净利润其他项目")
    private Double netprofitOther;

    /** 净利润其他项目(环比%) */
    @Excel(name = "净利润其他项目(环比%)")
    private Double netprofitOtherYoy;

    /** 净利润平衡项目 */
    @Excel(name = "净利润平衡项目")
    private Double netprofitBalance;

    /** 净利润平衡项目(环比%) */
    @Excel(name = "净利润平衡项目(环比%)")
    private Double netprofitBalanceYoy;

    /** 基本每股收益 */
    @Excel(name = "基本每股收益")
    private Double basicEps;

    /** 基本每股收益(环比%) */
    @Excel(name = "基本每股收益(环比%)")
    private Double basicEpsYoy;

    /** 稀释每股收益 */
    @Excel(name = "稀释每股收益")
    private Double dilutedEps;

    /** 稀释每股收益(环比%) */
    @Excel(name = "稀释每股收益(环比%)")
    private Double dilutedEpsYoy;

    /** 其他综合收益 */
    @Excel(name = "其他综合收益")
    private Double otherCompreIncome;

    /** 其他综合收益(环比%) */
    @Excel(name = "其他综合收益(环比%)")
    private Double otherCompreIncomeYoy;

    /** 归属于母公司股东的其他综合收益 */
    @Excel(name = "归属于母公司股东的其他综合收益")
    private Double parentOci;

    /** 归属于母公司股东的其他综合收益(环比%) */
    @Excel(name = "归属于母公司股东的其他综合收益(环比%)")
    private Double parentOciYoy;

    /** 归属于少数股东的其他综合收益 */
    @Excel(name = "归属于少数股东的其他综合收益")
    private Double minorityOci;

    /** 归属于少数股东的其他综合收益(环比%) */
    @Excel(name = "归属于少数股东的其他综合收益(环比%)")
    private Double minorityOciYoy;

    /** 赔付支出净额 */
    @Excel(name = "赔付支出净额")
    private Double netCompensateExpense;

    /** 赔付支出净额(环比%) */
    @Excel(name = "赔付支出净额(环比%)")
    private Double netCompensateExpenseYoy;

    /** 退保金(环比%) */
    @Excel(name = "退保金(环比%)")
    private Double surrenderValueYoy;

    /** 影响净利润的其他项目 */
    @Excel(name = "影响净利润的其他项目")
    private Double effectNetprofitOtherQoq;

    /** 营业总收入其他项目 */
    @Excel(name = "营业总收入其他项目")
    private Double toiOther;

    /** 营业总收入其他项目(环比%) */
    @Excel(name = "营业总收入其他项目(环比%)")
    private Double toiOtherYoy;

    /** 研发费用 */
    @Excel(name = "研发费用")
    private Double researchExpense;

    /** 研发费用(环比%) */
    @Excel(name = "研发费用(环比%)")
    private Double researchExpenseYoy;

    /** (环比%) */
    @Excel(name = "(环比%)")
    private Double uninsuranceCiYoy;

    /** 归属于母公司股东的综合收益总额 */
    @Excel(name = "归属于母公司股东的综合收益总额")
    private Double parentTciQoq;

    /** 净敞口套期收益 */
    @Excel(name = "净敞口套期收益")
    private Double netExposureIncome;

    /** 净敞口套期收益(环比%) */
    @Excel(name = "净敞口套期收益(环比%)")
    private Double netExposureIncomeYoy;

    /** 归属于少数股东的其他综合收益 */
    @Excel(name = "归属于少数股东的其他综合收益")
    private Double minorityOciQoq;

    /** 利息收入 */
    @Excel(name = "利息收入")
    private Double feInterestIncomeQoq;

    /** 营业总成本其他项目 */
    @Excel(name = "营业总成本其他项目")
    private Double tocOther;

    /** 营业总成本其他项目(环比%) */
    @Excel(name = "营业总成本其他项目(环比%)")
    private Double tocOtherYoy;

    /** 提取保险合同准备金净额 */
    @Excel(name = "提取保险合同准备金净额")
    private Double netContractReserve;

    /** 提取保险合同准备金净额(环比%) */
    @Excel(name = "提取保险合同准备金净额(环比%)")
    private Double netContractReserveYoy;

    /** 管理费用 */
    @Excel(name = "管理费用")
    private Double manageExpense;

    /** 管理费用(环比%) */
    @Excel(name = "管理费用(环比%)")
    private Double manageExpenseYoy;

    /** 营业成本 */
    @Excel(name = "营业成本")
    private Double operateCost;

    /** 营业成本(环比%) */
    @Excel(name = "营业成本(环比%)")
    private Double operateCostYoy;

    /** 营业总成本 */
    @Excel(name = "营业总成本")
    private Double totalOperateCost;

    /** 营业总成本(环比%) */
    @Excel(name = "营业总成本(环比%)")
    private Double totalOperateCostYoy;

    /** 利息费用 */
    @Excel(name = "利息费用")
    private Double feInterestExpense;

    /** 利息费用(环比%) */
    @Excel(name = "利息费用(环比%)")
    private Double feInterestExpenseYoy;

    /** 未确认投资损失 */
    @Excel(name = "未确认投资损失")
    private Double unconfirmInvestLoss;

    /** 未确认投资损失(环比%) */
    @Excel(name = "未确认投资损失(环比%)")
    private Double unconfirmInvestLossYoy;

    /** 被合并方在合并前实现利润 */
    @Excel(name = "被合并方在合并前实现利润")
    private Double precombineProfit;

    /** 被合并方在合并前实现利润(环比%) */
    @Excel(name = "被合并方在合并前实现利润(环比%)")
    private Double precombineProfitYoy;

    /** 资产减值损失 */
    @Excel(name = "资产减值损失")
    private Double assetImpairmentIncome;

    /** 资产减值损失(环比%) */
    @Excel(name = "资产减值损失(环比%)")
    private Double assetImpairmentIncomeYoy;

    /** 财务费用 */
    @Excel(name = "财务费用")
    private Double financeExpense;

    /** 财务费用(环比%) */
    @Excel(name = "财务费用(环比%)")
    private Double financeExpenseYoy;

    /** 分保费用 */
    @Excel(name = "分保费用")
    private Double reinsureExpense;

    /** 分保费用(环比%) */
    @Excel(name = "分保费用(环比%)")
    private Double reinsureExpenseYoy;

    /** 营业总收入 */
    @Excel(name = "营业总收入")
    private Double totalOperateIncome;

    /** 营业总收入(环比%) */
    @Excel(name = "营业总收入(环比%)")
    private Double totalOperateIncomeYoy;

    /** 信用减值损失 */
    @Excel(name = "信用减值损失")
    private Double creditImpairmentIncome;

    /** 信用减值损失(环比%) */
    @Excel(name = "信用减值损失(环比%)")
    private Double creditImpairmentIncomeYoy;

    /** 保单红利支出 */
    @Excel(name = "保单红利支出")
    private Double policyBonusExpense;

    /** 保单红利支出(环比%) */
    @Excel(name = "保单红利支出(环比%)")
    private Double policyBonusExpenseYoy;

    /** 利息收入 */
    @Excel(name = "利息收入")
    private Double feInterestIncome;

    /** 利息收入(环比%) */
    @Excel(name = "利息收入(环比%)")
    private Double feInterestIncomeYoy;

    /** 已赚保费 */
    @Excel(name = "已赚保费")
    private Double earnedPremium;

    /** 已赚保费(环比%) */
    @Excel(name = "已赚保费(环比%)")
    private Double earnedPremiumYoy;

    /** 销售费用 */
    @Excel(name = "销售费用")
    private Double saleExpense;

    /** 销售费用(环比%) */
    @Excel(name = "销售费用(环比%)")
    private Double saleExpenseYoy;

    /** 可供出售金融资产公允价值变动损益 */
    @Excel(name = "可供出售金融资产公允价值变动损益")
    private Double afaFairvalueChange;

    /** 可供出售金融资产公允价值变动损益(环比%) */
    @Excel(name = "可供出售金融资产公允价值变动损益(环比%)")
    private Double afaFairvalueChangeYoy;

    /** 外币报表折算差额 */
    @Excel(name = "外币报表折算差额")
    private Double convertDiff;

    /** 外币报表折算差额(环比%) */
    @Excel(name = "外币报表折算差额(环比%)")
    private Double convertDiffYoy;

    /** 综合收益总额 */
    @Excel(name = "综合收益总额")
    private Double totalCompreIncome;

    /** 综合收益总额(环比%) */
    @Excel(name = "综合收益总额(环比%)")
    private Double totalCompreIncomeYoy;

    /** 归属于母公司股东的综合收益总额 */
    @Excel(name = "归属于母公司股东的综合收益总额")
    private Double parentTci;

    /** 归属于母公司股东的综合收益总额(环比%) */
    @Excel(name = "归属于母公司股东的综合收益总额(环比%)")
    private Double parentTciYoy;

    /** 归属于少数股东的综合收益总额 */
    @Excel(name = "归属于少数股东的综合收益总额")
    private Double minorityTci;

    /** 归属于少数股东的综合收益总额(环比%) */
    @Excel(name = "归属于少数股东的综合收益总额(环比%)")
    private Double minorityTciYoy;

    /** 分出保费 */
    @Excel(name = "分出保费")
    private Double reinsurePremium;

    /** 分出保费(环比%) */
    @Excel(name = "分出保费(环比%)")
    private Double reinsurePremiumYoy;

    /** 银行业务利息净收入 */
    @Excel(name = "银行业务利息净收入")
    private Double bankInterestNi;

    /** 银行业务利息净收入(环比%) */
    @Excel(name = "银行业务利息净收入(环比%)")
    private Double bankInterestNiYoy;

    /** 赔付支出 */
    @Excel(name = "赔付支出")
    private Double compensateExpense;

    /** 赔付支出(环比%) */
    @Excel(name = "赔付支出(环比%)")
    private Double compensateExpenseYoy;

    /** 分保费收入 */
    @Excel(name = "分保费收入")
    private Double reinsureIncome;

    /** 分保费收入(环比%) */
    @Excel(name = "分保费收入(环比%)")
    private Double reinsureIncomeYoy;

    /** 摊回保险责任准备金 */
    @Excel(name = "摊回保险责任准备金")
    private Double amortizeInsuranceReserve;

    /** 摊回保险责任准备金(环比%) */
    @Excel(name = "摊回保险责任准备金(环比%)")
    private Double amortizeInsuranceReserveYoy;

    /** 影响净利润的平衡项目 */
    @Excel(name = "影响净利润的平衡项目")
    private Double effectNetprofitBalanceQoq;

    /** 非保险业务手续费及佣金收入 */
    @Excel(name = "非保险业务手续费及佣金收入")
    private Double uninsuranceCiQoq;

    /** 提取保险责任准备金 */
    @Excel(name = "提取保险责任准备金")
    private Double extractInsuranceReserveQoq;

    /** 提取未到期责任准备金 */
    @Excel(name = "提取未到期责任准备金")
    private Double extractUnexpireReserve;

    /** 提取未到期责任准备金(环比%) */
    @Excel(name = "提取未到期责任准备金(环比%)")
    private Double extractUnexpireReserveYoy;

    /** 已赚保费平衡项目 */
    @Excel(name = "已赚保费平衡项目")
    private Double earnedPremiumBalance;

    /** 已赚保费平衡项目(环比%) */
    @Excel(name = "已赚保费平衡项目(环比%)")
    private Double earnedPremiumBalanceYoy;

    /** 银行业务利息支出 */
    @Excel(name = "银行业务利息支出")
    private Double bankInterestExpense;

    /** 银行业务利息支出(环比%) */
    @Excel(name = "银行业务利息支出(环比%)")
    private Double bankInterestExpenseYoy;

    /** 公允价值变动损益 */
    @Excel(name = "公允价值变动损益")
    private Double fairvalueChange;

    /** 公允价值变动损益(环比%) */
    @Excel(name = "公允价值变动损益(环比%)")
    private Double fairvalueChangeYoy;

    /** 摊回赔付支出 */
    @Excel(name = "摊回赔付支出")
    private Double amortizeCompensateExpense;

    /** 摊回赔付支出(环比%) */
    @Excel(name = "摊回赔付支出(环比%)")
    private Double amortizeCompensateExpenseYoy;

    /** 提取保险责任准备金 */
    @Excel(name = "提取保险责任准备金")
    private Double extractInsuranceReserve;

    /** 提取保险责任准备金(环比%) */
    @Excel(name = "提取保险责任准备金(环比%)")
    private Double extractInsuranceReserveYoy;

    /** 受托客户资产管理业务净收入 */
    @Excel(name = "受托客户资产管理业务净收入")
    private Double assetManageNi;

    /** 受托客户资产管理业务净收入(环比%) */
    @Excel(name = "受托客户资产管理业务净收入(环比%)")
    private Double assetManageNiYoy;

    /** 证券经纪业务净收入-手续费及佣金净收入其他项目 */
    @Excel(name = "证券经纪业务净收入-手续费及佣金净收入其他项目")
    private Double commissionNiOther;

    /** 证券经纪业务净收入-手续费及佣金净收入其他项目(环比%) */
    @Excel(name = "证券经纪业务净收入-手续费及佣金净收入其他项目(环比%)")
    private Double commissionNiOtherYoy;

    /** 代理买卖证券业务净收入 */
    @Excel(name = "代理买卖证券业务净收入")
    private Double agentSecurityNi;

    /** 代理买卖证券业务净收入(环比%) */
    @Excel(name = "代理买卖证券业务净收入(环比%)")
    private Double agentSecurityNiYoy;

    /** 保荐业务净收入 */
    @Excel(name = "保荐业务净收入")
    private Double recommendNi;

    /** 保荐业务净收入(环比%) */
    @Excel(name = "保荐业务净收入(环比%)")
    private Double recommendNiYoy;

    /** 证券经纪业务净收入 */
    @Excel(name = "证券经纪业务净收入")
    private Double brokerNi;

    /** 证券经纪业务净收入(环比%) */
    @Excel(name = "证券经纪业务净收入(环比%)")
    private Double brokerNiYoy;

    /** 财务顾问净收入 */
    @Excel(name = "财务顾问净收入")
    private Double financeAdviserNi;

    /** 财务顾问净收入(环比%) */
    @Excel(name = "财务顾问净收入(环比%)")
    private Double financeAdviserNiYoy;

    /** 基金销售业务净收入 */
    @Excel(name = "基金销售业务净收入")
    private Double fundSaleNi;

    /** 基金销售业务净收入(环比%) */
    @Excel(name = "基金销售业务净收入(环比%)")
    private Double fundSaleNiYoy;

    /** 摊回分保费用 */
    @Excel(name = "摊回分保费用")
    private Double amortizeReinsureExpense;

    /** 摊回分保费用(环比%) */
    @Excel(name = "摊回分保费用(环比%)")
    private Double amortizeReinsureExpenseYoy;

    /** 非保险业务手续费及佣金净收入 */
    @Excel(name = "非保险业务手续费及佣金净收入")
    private Double uninsuranceCni;

    /** 非保险业务手续费及佣金净收入(环比%) */
    @Excel(name = "非保险业务手续费及佣金净收入(环比%)")
    private Double uninsuranceCniYoy;

    /** 银行业务利息收入 */
    @Excel(name = "银行业务利息收入")
    private Double bankInterestIncome;

    /** 银行业务利息收入(环比%) */
    @Excel(name = "银行业务利息收入(环比%)")
    private Double bankInterestIncomeYoy;

    /** 非保险业务手续费及佣金支出 */
    @Excel(name = "非保险业务手续费及佣金支出")
    private Double uninsuranceCe;

    /** 非保险业务手续费及佣金支出(环比%) */
    @Excel(name = "非保险业务手续费及佣金支出(环比%)")
    private Double uninsuranceCeYoy;

    /** 证券承销业务净收入 */
    @Excel(name = "证券承销业务净收入")
    private Double securityUnderwriteNi;

    /** 证券承销业务净收入(环比%) */
    @Excel(name = "证券承销业务净收入(环比%)")
    private Double securityUnderwriteNiYoy;

    /** 保险业务收入 */
    @Excel(name = "保险业务收入")
    private Double insuranceIncome;

    /** 保险业务收入(环比%) */
    @Excel(name = "保险业务收入(环比%)")
    private Double insuranceIncomeYoy;

    /** 基金管理业务净收入 */
    @Excel(name = "基金管理业务净收入")
    private Double fundManageNi;

    /** 基金管理业务净收入(环比%) */
    @Excel(name = "基金管理业务净收入(环比%)")
    private Double fundManageNiYoy;

    /** 净利润其他项目 */
    @Excel(name = "净利润其他项目")
    private Double netprofitOtherQoq;

    /** 其他业务收入 */
    @Excel(name = "其他业务收入")
    private Double otherBusinessIncomeQoq;

    /** 营业利润 */
    @Excel(name = "营业利润")
    private Double operateProfitQoq;

    /** 所得税 */
    @Excel(name = "所得税")
    private Double incomeTaxQoq;

    /** 被合并方在合并前实现利润 */
    @Excel(name = "被合并方在合并前实现利润")
    private Double precombineProfitQoq;

    /** 营业总成本 */
    @Excel(name = "营业总成本")
    private Double totalOperateCostQoq;

    /** 净利润差额/合计平衡项目 */
    @Excel(name = "净利润差额/合计平衡项目")
    private Double netprofitBalanceQoq;

    /** 营业外收入 */
    @Excel(name = "营业外收入")
    private Double nonbusinessIncomeQoq;

    /** 扣除非经常性损益后的净利润 */
    @Excel(name = "扣除非经常性损益后的净利润")
    private Double deductParentNetprofitQoq;

    /** 赔付支出净额 */
    @Excel(name = "赔付支出净额")
    private Double netCompensateExpenseQoq;

    /** 信用减值损失 */
    @Excel(name = "信用减值损失")
    private Double creditImpairmentIncomeQoq;

    /** 资产减值损失 */
    @Excel(name = "资产减值损失")
    private Double assetImpairmentLossQoq;

    /** 研发费用 */
    @Excel(name = "研发费用")
    private Double researchExpenseQoq;

    /** 少数股东损益 */
    @Excel(name = "少数股东损益")
    private Double parentNetprofitQoq;

    /** 利息收入 */
    @Excel(name = "利息收入")
    private Double interestIncomeQoq;

    /** 手续费及佣金收入 */
    @Excel(name = "手续费及佣金收入")
    private Double feeCommissionIncomeQoq;

    /** 其他综合收益 */
    @Excel(name = "其他综合收益")
    private Double otherCompreIncomeQoq;

    /** 退保金 */
    @Excel(name = "退保金")
    private Double surrenderValueQoq;

    /** 其他收益 */
    @Excel(name = "其他收益")
    private Double otherIncomeQoq;

    /** 利润总额 */
    @Excel(name = "利润总额")
    private Double totalProfitQoq;

    /** 未确认投资损失 */
    @Excel(name = "未确认投资损失")
    private Double unconfirmInvestLossQoq;

    /** 影响利润总额的其他项目 */
    @Excel(name = "影响利润总额的其他项目")
    private Double effectTpOtherQoq;

    /** 终止经营净利润 */
    @Excel(name = "终止经营净利润")
    private Double discontinuedNetprofitQoq;

    /** 分保费用 */
    @Excel(name = "分保费用")
    private Double reinsureExpenseQoq;

    /** 归属于少数股东的综合收益总额 */
    @Excel(name = "归属于少数股东的综合收益总额")
    private Double minorityTciQoq;

    /** 营业总收入 */
    @Excel(name = "营业总收入")
    private Double totalOperateIncomeQoq;

    /** 持续经营净利润 */
    @Excel(name = "持续经营净利润")
    private Double continuedNetprofitQoq;

    /** 退保金 */
    @Excel(name = "退保金")
    private Double surrenderValue;

    /** 财务费用 */
    @Excel(name = "财务费用")
    private Double financeExpenseQoq;

    /** 税金及附加 */
    @Excel(name = "税金及附加")
    private Double operateTaxAddQoq;

    /** 销售费用 */
    @Excel(name = "销售费用")
    private Double saleExpenseQoq;

    /** 投资收益 */
    @Excel(name = "投资收益")
    private Double investIncomeQoq;

    /** 营业利润其他项目 */
    @Excel(name = "营业利润其他项目")
    private Double operateProfitOtherQoq;

    /** 提取保险合同准备金净额 */
    @Excel(name = "提取保险合同准备金净额")
    private Double netContractReserveQoq;

    /** 利息支出 */
    @Excel(name = "利息支出")
    private Double interestExpenseQoq;

    /** 基本每股收益 */
    @Excel(name = "基本每股收益")
    private Double basicEpsQoq;

    /** 信用减值损失 */
    @Excel(name = "信用减值损失")
    private Double creditImpairmentLossQoq;

    /** 少数股东损益 */
    @Excel(name = "少数股东损益")
    private Double minorityInterestQoq;

    /** 公允价值变动收益 */
    @Excel(name = "公允价值变动收益")
    private Double fairvalueChangeIncomeQoq;

    /** 营业外支出 */
    @Excel(name = "营业外支出")
    private Double nonbusinessExpenseQoq;

    /** 对联营企业和合营企业的投资收益 */
    @Excel(name = "对联营企业和合营企业的投资收益")
    private Double investJointIncomeQoq;

    /** 净利润 */
    @Excel(name = "净利润")
    private Double netprofitQoq;

    /** 管理费用 */
    @Excel(name = "管理费用")
    private Double manageExpenseQoq;

    /** 资产减值损失 */
    @Excel(name = "资产减值损失")
    private Double assetImpairmentIncomeQoq;

    /** 非流动资产处置利得 */
    @Excel(name = "非流动资产处置利得")
    private Double noncurrentDisposalIncomeQoq;

    /** 非流动资产处置净损失 */
    @Excel(name = "非流动资产处置净损失")
    private Double noncurrentDisposalLossQoq;

    /** 营业总收入其他项目 */
    @Excel(name = "营业总收入其他项目")
    private Double toiOtherQoq;

    /** 利息费用 */
    @Excel(name = "利息费用")
    private Double feInterestExpenseQoq;

    /** 稀释每股收益 */
    @Excel(name = "稀释每股收益")
    private Double dilutedEpsQoq;

    /** 其他业务成本 */
    @Excel(name = "其他业务成本")
    private Double otherBusinessCostQoq;

    /** 营业利润平衡项目 */
    @Excel(name = "营业利润平衡项目")
    private Double operateProfitBalanceQoq;

    /** 保单红利支出 */
    @Excel(name = "保单红利支出")
    private Double policyBonusExpenseQoq;

    /** 归属于母公司股东的其他综合收益 */
    @Excel(name = "归属于母公司股东的其他综合收益")
    private Double parentOciQoq;

    /** 营业支出 */
    @Excel(name = "营业支出")
    private Double operateExpenseQoq;

    /** 银行业务利息净收入 */
    @Excel(name = "银行业务利息净收入")
    private Double bankInterestNiQoq;

    /** 提取未到期责任准备金 */
    @Excel(name = "提取未到期责任准备金")
    private Double extractUnexpireReserveQoq;

    /** 基金管理业务净收入 */
    @Excel(name = "基金管理业务净收入")
    private Double fundManageNiQoq;

    /** 受托客户资产管理业务净收入 */
    @Excel(name = "受托客户资产管理业务净收入")
    private Double assetManageNiQoq;

    /** 代理买卖证券业务净收入 */
    @Excel(name = "代理买卖证券业务净收入")
    private Double agentSecurityNiQoq;

    /** 营业收入平衡项目 */
    @Excel(name = "营业收入平衡项目")
    private Double operateIncomeBalanceQoq;

    /** 营业支出平衡项目 */
    @Excel(name = "营业支出平衡项目")
    private Double operateExpenseBalanceQoq;

    /** 非保险业务手续费及佣金净收入 */
    @Excel(name = "非保险业务手续费及佣金净收入")
    private Double uninsuranceCniQoq;

    /** 摊回赔付支出 */
    @Excel(name = "摊回赔付支出")
    private Double amortizeCompensateExpenseQoq;

    /** 分保费收入 */
    @Excel(name = "分保费收入")
    private Double reinsureIncomeQoq;

    /** 业务及管理费 */
    @Excel(name = "业务及管理费")
    private Double businessManageExpenseQoq;

    /** 营业收入其他项目 */
    @Excel(name = "营业收入其他项目")
    private Double operateIncomeOtherQoq;

    /** 基金销售业务净收入 */
    @Excel(name = "基金销售业务净收入")
    private Double fundSaleNiQoq;

    /** 证券经纪业务净收入 */
    @Excel(name = "证券经纪业务净收入")
    private Double brokerNiQoq;

    /** 银行业务利息收入 */
    @Excel(name = "银行业务利息收入")
    private Double bankInterestIncomeQoq;

    /** 分出保费 */
    @Excel(name = "分出保费")
    private Double reinsurePremiumQoq;

    /** 赔付支出 */
    @Excel(name = "赔付支出")
    private Double compensateExpenseQoq;

    /** 财务顾问净收入 */
    @Excel(name = "财务顾问净收入")
    private Double financeAdviserNiQoq;

    /** 手续费及佣金净收入 */
    @Excel(name = "手续费及佣金净收入")
    private Double feeCommissionNiQoq;

    /** 保荐业务净收入 */
    @Excel(name = "保荐业务净收入")
    private Double recommendNiQoq;

    /** 营业支出其他项目 */
    @Excel(name = "营业支出其他项目")
    private Double operateExpenseOtherQoq;

    /** 手续费及佣金净收入其他项目 */
    @Excel(name = "手续费及佣金净收入其他项目")
    private Double commissionNiOtherQoq;

    /** 可供出售金融资产公允价值变动损益 */
    @Excel(name = "可供出售金融资产公允价值变动损益")
    private Double afaFairvalueChangeQoq;

    /** 摊回分保费用 */
    @Excel(name = "摊回分保费用")
    private Double amortizeReinsureExpenseQoq;

    /** 已赚保费平衡项目 */
    @Excel(name = "已赚保费平衡项目")
    private Double earnedPremiumBalanceQoq;

    /** 非保险业务手续费及佣金收入 */
    @Excel(name = "非保险业务手续费及佣金收入")
    private Double uninsuranceCi;

    /** 营业总成本其他项目 */
    @Excel(name = "营业总成本其他项目")
    private Double tocOtherQoq;

    /** 净敞口套期收益 */
    @Excel(name = "净敞口套期收益")
    private Double netExposureIncomeQoq;

    /** 汇兑收益 */
    @Excel(name = "汇兑收益")
    private Double exchangeIncomeQoq;

    /** 非保险业务手续费及佣金支出 */
    @Excel(name = "非保险业务手续费及佣金支出")
    private Double uninsuranceCeQoq;

    /** 已赚保费 */
    @Excel(name = "已赚保费")
    private Double earnedPremiumQoq;

    /** 营业总成本 */
    @Excel(name = "营业总成本")
    private Double operateCostQoq;

    /** 综合收益总额 */
    @Excel(name = "综合收益总额")
    private Double totalCompreIncomeQoq;

    /** 证券承销业务净收入 */
    @Excel(name = "证券承销业务净收入")
    private Double securityUnderwriteNiQoq;

    /** 摊回保险责任准备金 */
    @Excel(name = "摊回保险责任准备金")
    private Double amortizeInsuranceReserveQoq;

    /** 资产处置收益 */
    @Excel(name = "资产处置收益")
    private Double assetDisposalIncomeQoq;

    /** 利润总额平衡项目 */
    @Excel(name = "利润总额平衡项目")
    private Double totalProfitBalanceQoq;

    /** 保险业务收入 */
    @Excel(name = "保险业务收入")
    private Double insuranceIncomeQoq;

    /** 公允价值变动损益 */
    @Excel(name = "公允价值变动损益")
    private Double fairvalueChangeQoq;

    /** 利息净收入 */
    @Excel(name = "利息净收入")
    private Double interestNiQoq;

    /** 营业收入 */
    @Excel(name = "营业收入")
    private Double operateIncomeQoq;

    /** 手续费及佣金支出 */
    @Excel(name = "手续费及佣金支出")
    private Double feeCommissionExpenseQoq;

    /** 银行业务利息支出 */
    @Excel(name = "银行业务利息支出")
    private Double bankInterestExpenseQoq;

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
    public void setReportType(String reportType) 
    {
        this.reportType = reportType;
    }

    public String getReportType() 
    {
        return reportType;
    }
    public void setReportDate(Date reportDate) 
    {
        this.reportDate = reportDate;
    }

    public Date getReportDate() 
    {
        return reportDate;
    }
    public void setOpinionType(String opinionType) 
    {
        this.opinionType = opinionType;
    }

    public String getOpinionType() 
    {
        return opinionType;
    }
    public void setOsopinionType(String osopinionType) 
    {
        this.osopinionType = osopinionType;
    }

    public String getOsopinionType() 
    {
        return osopinionType;
    }
    public void setOperateIncome(Double operateIncome) 
    {
        this.operateIncome = operateIncome;
    }

    public Double getOperateIncome() 
    {
        return operateIncome;
    }
    public void setOperateIncomeYoy(Double operateIncomeYoy) 
    {
        this.operateIncomeYoy = operateIncomeYoy;
    }

    public Double getOperateIncomeYoy() 
    {
        return operateIncomeYoy;
    }
    public void setInterestNi(Double interestNi) 
    {
        this.interestNi = interestNi;
    }

    public Double getInterestNi() 
    {
        return interestNi;
    }
    public void setInterestNiYoy(Double interestNiYoy) 
    {
        this.interestNiYoy = interestNiYoy;
    }

    public Double getInterestNiYoy() 
    {
        return interestNiYoy;
    }
    public void setInterestIncome(Double interestIncome) 
    {
        this.interestIncome = interestIncome;
    }

    public Double getInterestIncome() 
    {
        return interestIncome;
    }
    public void setInterestIncomeYoy(Double interestIncomeYoy) 
    {
        this.interestIncomeYoy = interestIncomeYoy;
    }

    public Double getInterestIncomeYoy() 
    {
        return interestIncomeYoy;
    }
    public void setInterestExpense(Double interestExpense) 
    {
        this.interestExpense = interestExpense;
    }

    public Double getInterestExpense() 
    {
        return interestExpense;
    }
    public void setInterestExpenseYoy(Double interestExpenseYoy) 
    {
        this.interestExpenseYoy = interestExpenseYoy;
    }

    public Double getInterestExpenseYoy() 
    {
        return interestExpenseYoy;
    }
    public void setFeeCommissionNi(Double feeCommissionNi) 
    {
        this.feeCommissionNi = feeCommissionNi;
    }

    public Double getFeeCommissionNi() 
    {
        return feeCommissionNi;
    }
    public void setFeeCommissionNiYoy(Double feeCommissionNiYoy) 
    {
        this.feeCommissionNiYoy = feeCommissionNiYoy;
    }

    public Double getFeeCommissionNiYoy() 
    {
        return feeCommissionNiYoy;
    }
    public void setFeeCommissionIncome(Double feeCommissionIncome) 
    {
        this.feeCommissionIncome = feeCommissionIncome;
    }

    public Double getFeeCommissionIncome() 
    {
        return feeCommissionIncome;
    }
    public void setFeeCommissionIncomeYoy(Double feeCommissionIncomeYoy) 
    {
        this.feeCommissionIncomeYoy = feeCommissionIncomeYoy;
    }

    public Double getFeeCommissionIncomeYoy() 
    {
        return feeCommissionIncomeYoy;
    }
    public void setFeeCommissionExpense(Double feeCommissionExpense) 
    {
        this.feeCommissionExpense = feeCommissionExpense;
    }

    public Double getFeeCommissionExpense() 
    {
        return feeCommissionExpense;
    }
    public void setFeeCommissionExpenseYoy(Double feeCommissionExpenseYoy) 
    {
        this.feeCommissionExpenseYoy = feeCommissionExpenseYoy;
    }

    public Double getFeeCommissionExpenseYoy() 
    {
        return feeCommissionExpenseYoy;
    }
    public void setInvestIncome(Double investIncome) 
    {
        this.investIncome = investIncome;
    }

    public Double getInvestIncome() 
    {
        return investIncome;
    }
    public void setInvestIncomeYoy(Double investIncomeYoy) 
    {
        this.investIncomeYoy = investIncomeYoy;
    }

    public Double getInvestIncomeYoy() 
    {
        return investIncomeYoy;
    }
    public void setInvestJointIncome(Double investJointIncome) 
    {
        this.investJointIncome = investJointIncome;
    }

    public Double getInvestJointIncome() 
    {
        return investJointIncome;
    }
    public void setInvestJointIncomeYoy(Double investJointIncomeYoy) 
    {
        this.investJointIncomeYoy = investJointIncomeYoy;
    }

    public Double getInvestJointIncomeYoy() 
    {
        return investJointIncomeYoy;
    }
    public void setFairvalueChangeIncome(Double fairvalueChangeIncome) 
    {
        this.fairvalueChangeIncome = fairvalueChangeIncome;
    }

    public Double getFairvalueChangeIncome() 
    {
        return fairvalueChangeIncome;
    }
    public void setFairvalueChangeIncomeYoy(Double fairvalueChangeIncomeYoy) 
    {
        this.fairvalueChangeIncomeYoy = fairvalueChangeIncomeYoy;
    }

    public Double getFairvalueChangeIncomeYoy() 
    {
        return fairvalueChangeIncomeYoy;
    }
    public void setExchangeIncome(Double exchangeIncome) 
    {
        this.exchangeIncome = exchangeIncome;
    }

    public Double getExchangeIncome() 
    {
        return exchangeIncome;
    }
    public void setExchangeIncomeYoy(Double exchangeIncomeYoy) 
    {
        this.exchangeIncomeYoy = exchangeIncomeYoy;
    }

    public Double getExchangeIncomeYoy() 
    {
        return exchangeIncomeYoy;
    }
    public void setOtherBusinessIncome(Double otherBusinessIncome) 
    {
        this.otherBusinessIncome = otherBusinessIncome;
    }

    public Double getOtherBusinessIncome() 
    {
        return otherBusinessIncome;
    }
    public void setOtherBusinessIncomeYoy(Double otherBusinessIncomeYoy) 
    {
        this.otherBusinessIncomeYoy = otherBusinessIncomeYoy;
    }

    public Double getOtherBusinessIncomeYoy() 
    {
        return otherBusinessIncomeYoy;
    }
    public void setAssetDisposalIncome(Double assetDisposalIncome) 
    {
        this.assetDisposalIncome = assetDisposalIncome;
    }

    public Double getAssetDisposalIncome() 
    {
        return assetDisposalIncome;
    }
    public void setAssetDisposalIncomeYoy(Double assetDisposalIncomeYoy) 
    {
        this.assetDisposalIncomeYoy = assetDisposalIncomeYoy;
    }

    public Double getAssetDisposalIncomeYoy() 
    {
        return assetDisposalIncomeYoy;
    }
    public void setOtherIncome(Double otherIncome) 
    {
        this.otherIncome = otherIncome;
    }

    public Double getOtherIncome() 
    {
        return otherIncome;
    }
    public void setOtherIncomeYoy(Double otherIncomeYoy) 
    {
        this.otherIncomeYoy = otherIncomeYoy;
    }

    public Double getOtherIncomeYoy() 
    {
        return otherIncomeYoy;
    }
    public void setOperateIncomeOther(Double operateIncomeOther) 
    {
        this.operateIncomeOther = operateIncomeOther;
    }

    public Double getOperateIncomeOther() 
    {
        return operateIncomeOther;
    }
    public void setOperateIncomeOtherYoy(Double operateIncomeOtherYoy) 
    {
        this.operateIncomeOtherYoy = operateIncomeOtherYoy;
    }

    public Double getOperateIncomeOtherYoy() 
    {
        return operateIncomeOtherYoy;
    }
    public void setOperateIncomeBalance(Double operateIncomeBalance) 
    {
        this.operateIncomeBalance = operateIncomeBalance;
    }

    public Double getOperateIncomeBalance() 
    {
        return operateIncomeBalance;
    }
    public void setOperateIncomeBalanceYoy(Double operateIncomeBalanceYoy) 
    {
        this.operateIncomeBalanceYoy = operateIncomeBalanceYoy;
    }

    public Double getOperateIncomeBalanceYoy() 
    {
        return operateIncomeBalanceYoy;
    }
    public void setOperateExpense(Double operateExpense) 
    {
        this.operateExpense = operateExpense;
    }

    public Double getOperateExpense() 
    {
        return operateExpense;
    }
    public void setOperateExpenseYoy(Double operateExpenseYoy) 
    {
        this.operateExpenseYoy = operateExpenseYoy;
    }

    public Double getOperateExpenseYoy() 
    {
        return operateExpenseYoy;
    }
    public void setOperateTaxAdd(Double operateTaxAdd) 
    {
        this.operateTaxAdd = operateTaxAdd;
    }

    public Double getOperateTaxAdd() 
    {
        return operateTaxAdd;
    }
    public void setOperateTaxAddYoy(Double operateTaxAddYoy) 
    {
        this.operateTaxAddYoy = operateTaxAddYoy;
    }

    public Double getOperateTaxAddYoy() 
    {
        return operateTaxAddYoy;
    }
    public void setBusinessManageExpense(Double businessManageExpense) 
    {
        this.businessManageExpense = businessManageExpense;
    }

    public Double getBusinessManageExpense() 
    {
        return businessManageExpense;
    }
    public void setBusinessManageExpenseYoy(Double businessManageExpenseYoy) 
    {
        this.businessManageExpenseYoy = businessManageExpenseYoy;
    }

    public Double getBusinessManageExpenseYoy() 
    {
        return businessManageExpenseYoy;
    }
    public void setAssetImpairmentLoss(Double assetImpairmentLoss) 
    {
        this.assetImpairmentLoss = assetImpairmentLoss;
    }

    public Double getAssetImpairmentLoss() 
    {
        return assetImpairmentLoss;
    }
    public void setAssetImpairmentLossYoy(Double assetImpairmentLossYoy) 
    {
        this.assetImpairmentLossYoy = assetImpairmentLossYoy;
    }

    public Double getAssetImpairmentLossYoy() 
    {
        return assetImpairmentLossYoy;
    }
    public void setCreditImpairmentLoss(Double creditImpairmentLoss) 
    {
        this.creditImpairmentLoss = creditImpairmentLoss;
    }

    public Double getCreditImpairmentLoss() 
    {
        return creditImpairmentLoss;
    }
    public void setCreditImpairmentLossYoy(Double creditImpairmentLossYoy) 
    {
        this.creditImpairmentLossYoy = creditImpairmentLossYoy;
    }

    public Double getCreditImpairmentLossYoy() 
    {
        return creditImpairmentLossYoy;
    }
    public void setOtherBusinessCost(Double otherBusinessCost) 
    {
        this.otherBusinessCost = otherBusinessCost;
    }

    public Double getOtherBusinessCost() 
    {
        return otherBusinessCost;
    }
    public void setOtherBusinessCostYoy(Double otherBusinessCostYoy) 
    {
        this.otherBusinessCostYoy = otherBusinessCostYoy;
    }

    public Double getOtherBusinessCostYoy() 
    {
        return otherBusinessCostYoy;
    }
    public void setOperateExpenseOther(Double operateExpenseOther) 
    {
        this.operateExpenseOther = operateExpenseOther;
    }

    public Double getOperateExpenseOther() 
    {
        return operateExpenseOther;
    }
    public void setOperateExpenseOtherYoy(Double operateExpenseOtherYoy) 
    {
        this.operateExpenseOtherYoy = operateExpenseOtherYoy;
    }

    public Double getOperateExpenseOtherYoy() 
    {
        return operateExpenseOtherYoy;
    }
    public void setOperateExpenseBalance(Double operateExpenseBalance) 
    {
        this.operateExpenseBalance = operateExpenseBalance;
    }

    public Double getOperateExpenseBalance() 
    {
        return operateExpenseBalance;
    }
    public void setOperateExpenseBalanceYoy(Double operateExpenseBalanceYoy) 
    {
        this.operateExpenseBalanceYoy = operateExpenseBalanceYoy;
    }

    public Double getOperateExpenseBalanceYoy() 
    {
        return operateExpenseBalanceYoy;
    }
    public void setOperateProfitOther(Double operateProfitOther) 
    {
        this.operateProfitOther = operateProfitOther;
    }

    public Double getOperateProfitOther() 
    {
        return operateProfitOther;
    }
    public void setOperateProfitOtherYoy(Double operateProfitOtherYoy) 
    {
        this.operateProfitOtherYoy = operateProfitOtherYoy;
    }

    public Double getOperateProfitOtherYoy() 
    {
        return operateProfitOtherYoy;
    }
    public void setOperateProfitBalance(Double operateProfitBalance) 
    {
        this.operateProfitBalance = operateProfitBalance;
    }

    public Double getOperateProfitBalance() 
    {
        return operateProfitBalance;
    }
    public void setOperateProfitBalanceYoy(Double operateProfitBalanceYoy) 
    {
        this.operateProfitBalanceYoy = operateProfitBalanceYoy;
    }

    public Double getOperateProfitBalanceYoy() 
    {
        return operateProfitBalanceYoy;
    }
    public void setOperateProfit(Double operateProfit) 
    {
        this.operateProfit = operateProfit;
    }

    public Double getOperateProfit() 
    {
        return operateProfit;
    }
    public void setOperateProfitYoy(Double operateProfitYoy) 
    {
        this.operateProfitYoy = operateProfitYoy;
    }

    public Double getOperateProfitYoy() 
    {
        return operateProfitYoy;
    }
    public void setNonbusinessIncome(Double nonbusinessIncome) 
    {
        this.nonbusinessIncome = nonbusinessIncome;
    }

    public Double getNonbusinessIncome() 
    {
        return nonbusinessIncome;
    }
    public void setNonbusinessIncomeYoy(Double nonbusinessIncomeYoy) 
    {
        this.nonbusinessIncomeYoy = nonbusinessIncomeYoy;
    }

    public Double getNonbusinessIncomeYoy() 
    {
        return nonbusinessIncomeYoy;
    }
    public void setNoncurrentDisposalIncome(Double noncurrentDisposalIncome) 
    {
        this.noncurrentDisposalIncome = noncurrentDisposalIncome;
    }

    public Double getNoncurrentDisposalIncome() 
    {
        return noncurrentDisposalIncome;
    }
    public void setNoncurrentDisposalIncomeYoy(Double noncurrentDisposalIncomeYoy) 
    {
        this.noncurrentDisposalIncomeYoy = noncurrentDisposalIncomeYoy;
    }

    public Double getNoncurrentDisposalIncomeYoy() 
    {
        return noncurrentDisposalIncomeYoy;
    }
    public void setNonbusinessExpense(Double nonbusinessExpense) 
    {
        this.nonbusinessExpense = nonbusinessExpense;
    }

    public Double getNonbusinessExpense() 
    {
        return nonbusinessExpense;
    }
    public void setNonbusinessExpenseYoy(Double nonbusinessExpenseYoy) 
    {
        this.nonbusinessExpenseYoy = nonbusinessExpenseYoy;
    }

    public Double getNonbusinessExpenseYoy() 
    {
        return nonbusinessExpenseYoy;
    }
    public void setNoncurrentDisposalLoss(Double noncurrentDisposalLoss) 
    {
        this.noncurrentDisposalLoss = noncurrentDisposalLoss;
    }

    public Double getNoncurrentDisposalLoss() 
    {
        return noncurrentDisposalLoss;
    }
    public void setNoncurrentDisposalLossYoy(Double noncurrentDisposalLossYoy) 
    {
        this.noncurrentDisposalLossYoy = noncurrentDisposalLossYoy;
    }

    public Double getNoncurrentDisposalLossYoy() 
    {
        return noncurrentDisposalLossYoy;
    }
    public void setEffectTpOther(Double effectTpOther) 
    {
        this.effectTpOther = effectTpOther;
    }

    public Double getEffectTpOther() 
    {
        return effectTpOther;
    }
    public void setEffectTpOtherYoy(Double effectTpOtherYoy) 
    {
        this.effectTpOtherYoy = effectTpOtherYoy;
    }

    public Double getEffectTpOtherYoy() 
    {
        return effectTpOtherYoy;
    }
    public void setTotalProfitBalance(Double totalProfitBalance) 
    {
        this.totalProfitBalance = totalProfitBalance;
    }

    public Double getTotalProfitBalance() 
    {
        return totalProfitBalance;
    }
    public void setTotalProfitBalanceYoy(Double totalProfitBalanceYoy) 
    {
        this.totalProfitBalanceYoy = totalProfitBalanceYoy;
    }

    public Double getTotalProfitBalanceYoy() 
    {
        return totalProfitBalanceYoy;
    }
    public void setTotalProfit(Double totalProfit) 
    {
        this.totalProfit = totalProfit;
    }

    public Double getTotalProfit() 
    {
        return totalProfit;
    }
    public void setTotalProfitYoy(Double totalProfitYoy) 
    {
        this.totalProfitYoy = totalProfitYoy;
    }

    public Double getTotalProfitYoy() 
    {
        return totalProfitYoy;
    }
    public void setIncomeTax(Double incomeTax) 
    {
        this.incomeTax = incomeTax;
    }

    public Double getIncomeTax() 
    {
        return incomeTax;
    }
    public void setIncomeTaxYoy(Double incomeTaxYoy) 
    {
        this.incomeTaxYoy = incomeTaxYoy;
    }

    public Double getIncomeTaxYoy() 
    {
        return incomeTaxYoy;
    }
    public void setEffectNetprofitOther(Double effectNetprofitOther) 
    {
        this.effectNetprofitOther = effectNetprofitOther;
    }

    public Double getEffectNetprofitOther() 
    {
        return effectNetprofitOther;
    }
    public void setEffectNetprofitOtherYoy(Double effectNetprofitOtherYoy) 
    {
        this.effectNetprofitOtherYoy = effectNetprofitOtherYoy;
    }

    public Double getEffectNetprofitOtherYoy() 
    {
        return effectNetprofitOtherYoy;
    }
    public void setEffectNetprofitBalance(Double effectNetprofitBalance) 
    {
        this.effectNetprofitBalance = effectNetprofitBalance;
    }

    public Double getEffectNetprofitBalance() 
    {
        return effectNetprofitBalance;
    }
    public void setEffectNetprofitBalanceYoy(Double effectNetprofitBalanceYoy) 
    {
        this.effectNetprofitBalanceYoy = effectNetprofitBalanceYoy;
    }

    public Double getEffectNetprofitBalanceYoy() 
    {
        return effectNetprofitBalanceYoy;
    }
    public void setNetprofit(Double netprofit) 
    {
        this.netprofit = netprofit;
    }

    public Double getNetprofit() 
    {
        return netprofit;
    }
    public void setNetprofitYoy(Double netprofitYoy) 
    {
        this.netprofitYoy = netprofitYoy;
    }

    public Double getNetprofitYoy() 
    {
        return netprofitYoy;
    }
    public void setContinuedNetprofit(Double continuedNetprofit) 
    {
        this.continuedNetprofit = continuedNetprofit;
    }

    public Double getContinuedNetprofit() 
    {
        return continuedNetprofit;
    }
    public void setContinuedNetprofitYoy(Double continuedNetprofitYoy) 
    {
        this.continuedNetprofitYoy = continuedNetprofitYoy;
    }

    public Double getContinuedNetprofitYoy() 
    {
        return continuedNetprofitYoy;
    }
    public void setDiscontinuedNetprofit(Double discontinuedNetprofit) 
    {
        this.discontinuedNetprofit = discontinuedNetprofit;
    }

    public Double getDiscontinuedNetprofit() 
    {
        return discontinuedNetprofit;
    }
    public void setDiscontinuedNetprofitYoy(Double discontinuedNetprofitYoy) 
    {
        this.discontinuedNetprofitYoy = discontinuedNetprofitYoy;
    }

    public Double getDiscontinuedNetprofitYoy() 
    {
        return discontinuedNetprofitYoy;
    }
    public void setParentNetprofit(Double parentNetprofit) 
    {
        this.parentNetprofit = parentNetprofit;
    }

    public Double getParentNetprofit() 
    {
        return parentNetprofit;
    }
    public void setParentNetprofitYoy(Double parentNetprofitYoy) 
    {
        this.parentNetprofitYoy = parentNetprofitYoy;
    }

    public Double getParentNetprofitYoy() 
    {
        return parentNetprofitYoy;
    }
    public void setMinorityInterest(Double minorityInterest) 
    {
        this.minorityInterest = minorityInterest;
    }

    public Double getMinorityInterest() 
    {
        return minorityInterest;
    }
    public void setMinorityInterestYoy(Double minorityInterestYoy) 
    {
        this.minorityInterestYoy = minorityInterestYoy;
    }

    public Double getMinorityInterestYoy() 
    {
        return minorityInterestYoy;
    }
    public void setDeductParentNetprofit(Double deductParentNetprofit) 
    {
        this.deductParentNetprofit = deductParentNetprofit;
    }

    public Double getDeductParentNetprofit() 
    {
        return deductParentNetprofit;
    }
    public void setDeductParentNetprofitYoy(Double deductParentNetprofitYoy) 
    {
        this.deductParentNetprofitYoy = deductParentNetprofitYoy;
    }

    public Double getDeductParentNetprofitYoy() 
    {
        return deductParentNetprofitYoy;
    }
    public void setNetprofitOther(Double netprofitOther) 
    {
        this.netprofitOther = netprofitOther;
    }

    public Double getNetprofitOther() 
    {
        return netprofitOther;
    }
    public void setNetprofitOtherYoy(Double netprofitOtherYoy) 
    {
        this.netprofitOtherYoy = netprofitOtherYoy;
    }

    public Double getNetprofitOtherYoy() 
    {
        return netprofitOtherYoy;
    }
    public void setNetprofitBalance(Double netprofitBalance) 
    {
        this.netprofitBalance = netprofitBalance;
    }

    public Double getNetprofitBalance() 
    {
        return netprofitBalance;
    }
    public void setNetprofitBalanceYoy(Double netprofitBalanceYoy) 
    {
        this.netprofitBalanceYoy = netprofitBalanceYoy;
    }

    public Double getNetprofitBalanceYoy() 
    {
        return netprofitBalanceYoy;
    }
    public void setBasicEps(Double basicEps) 
    {
        this.basicEps = basicEps;
    }

    public Double getBasicEps() 
    {
        return basicEps;
    }
    public void setBasicEpsYoy(Double basicEpsYoy) 
    {
        this.basicEpsYoy = basicEpsYoy;
    }

    public Double getBasicEpsYoy() 
    {
        return basicEpsYoy;
    }
    public void setDilutedEps(Double dilutedEps) 
    {
        this.dilutedEps = dilutedEps;
    }

    public Double getDilutedEps() 
    {
        return dilutedEps;
    }
    public void setDilutedEpsYoy(Double dilutedEpsYoy) 
    {
        this.dilutedEpsYoy = dilutedEpsYoy;
    }

    public Double getDilutedEpsYoy() 
    {
        return dilutedEpsYoy;
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
    public void setParentOci(Double parentOci) 
    {
        this.parentOci = parentOci;
    }

    public Double getParentOci() 
    {
        return parentOci;
    }
    public void setParentOciYoy(Double parentOciYoy) 
    {
        this.parentOciYoy = parentOciYoy;
    }

    public Double getParentOciYoy() 
    {
        return parentOciYoy;
    }
    public void setMinorityOci(Double minorityOci) 
    {
        this.minorityOci = minorityOci;
    }

    public Double getMinorityOci() 
    {
        return minorityOci;
    }
    public void setMinorityOciYoy(Double minorityOciYoy) 
    {
        this.minorityOciYoy = minorityOciYoy;
    }

    public Double getMinorityOciYoy() 
    {
        return minorityOciYoy;
    }
    public void setNetCompensateExpense(Double netCompensateExpense) 
    {
        this.netCompensateExpense = netCompensateExpense;
    }

    public Double getNetCompensateExpense() 
    {
        return netCompensateExpense;
    }
    public void setNetCompensateExpenseYoy(Double netCompensateExpenseYoy) 
    {
        this.netCompensateExpenseYoy = netCompensateExpenseYoy;
    }

    public Double getNetCompensateExpenseYoy() 
    {
        return netCompensateExpenseYoy;
    }
    public void setSurrenderValueYoy(Double surrenderValueYoy) 
    {
        this.surrenderValueYoy = surrenderValueYoy;
    }

    public Double getSurrenderValueYoy() 
    {
        return surrenderValueYoy;
    }
    public void setEffectNetprofitOtherQoq(Double effectNetprofitOtherQoq) 
    {
        this.effectNetprofitOtherQoq = effectNetprofitOtherQoq;
    }

    public Double getEffectNetprofitOtherQoq() 
    {
        return effectNetprofitOtherQoq;
    }
    public void setToiOther(Double toiOther) 
    {
        this.toiOther = toiOther;
    }

    public Double getToiOther() 
    {
        return toiOther;
    }
    public void setToiOtherYoy(Double toiOtherYoy) 
    {
        this.toiOtherYoy = toiOtherYoy;
    }

    public Double getToiOtherYoy() 
    {
        return toiOtherYoy;
    }
    public void setResearchExpense(Double researchExpense) 
    {
        this.researchExpense = researchExpense;
    }

    public Double getResearchExpense() 
    {
        return researchExpense;
    }
    public void setResearchExpenseYoy(Double researchExpenseYoy) 
    {
        this.researchExpenseYoy = researchExpenseYoy;
    }

    public Double getResearchExpenseYoy() 
    {
        return researchExpenseYoy;
    }
    public void setUninsuranceCiYoy(Double uninsuranceCiYoy) 
    {
        this.uninsuranceCiYoy = uninsuranceCiYoy;
    }

    public Double getUninsuranceCiYoy() 
    {
        return uninsuranceCiYoy;
    }
    public void setParentTciQoq(Double parentTciQoq) 
    {
        this.parentTciQoq = parentTciQoq;
    }

    public Double getParentTciQoq() 
    {
        return parentTciQoq;
    }
    public void setNetExposureIncome(Double netExposureIncome) 
    {
        this.netExposureIncome = netExposureIncome;
    }

    public Double getNetExposureIncome() 
    {
        return netExposureIncome;
    }
    public void setNetExposureIncomeYoy(Double netExposureIncomeYoy) 
    {
        this.netExposureIncomeYoy = netExposureIncomeYoy;
    }

    public Double getNetExposureIncomeYoy() 
    {
        return netExposureIncomeYoy;
    }
    public void setMinorityOciQoq(Double minorityOciQoq) 
    {
        this.minorityOciQoq = minorityOciQoq;
    }

    public Double getMinorityOciQoq() 
    {
        return minorityOciQoq;
    }
    public void setFeInterestIncomeQoq(Double feInterestIncomeQoq) 
    {
        this.feInterestIncomeQoq = feInterestIncomeQoq;
    }

    public Double getFeInterestIncomeQoq() 
    {
        return feInterestIncomeQoq;
    }
    public void setTocOther(Double tocOther) 
    {
        this.tocOther = tocOther;
    }

    public Double getTocOther() 
    {
        return tocOther;
    }
    public void setTocOtherYoy(Double tocOtherYoy) 
    {
        this.tocOtherYoy = tocOtherYoy;
    }

    public Double getTocOtherYoy() 
    {
        return tocOtherYoy;
    }
    public void setNetContractReserve(Double netContractReserve) 
    {
        this.netContractReserve = netContractReserve;
    }

    public Double getNetContractReserve() 
    {
        return netContractReserve;
    }
    public void setNetContractReserveYoy(Double netContractReserveYoy) 
    {
        this.netContractReserveYoy = netContractReserveYoy;
    }

    public Double getNetContractReserveYoy() 
    {
        return netContractReserveYoy;
    }
    public void setManageExpense(Double manageExpense) 
    {
        this.manageExpense = manageExpense;
    }

    public Double getManageExpense() 
    {
        return manageExpense;
    }
    public void setManageExpenseYoy(Double manageExpenseYoy) 
    {
        this.manageExpenseYoy = manageExpenseYoy;
    }

    public Double getManageExpenseYoy() 
    {
        return manageExpenseYoy;
    }
    public void setOperateCost(Double operateCost) 
    {
        this.operateCost = operateCost;
    }

    public Double getOperateCost() 
    {
        return operateCost;
    }
    public void setOperateCostYoy(Double operateCostYoy) 
    {
        this.operateCostYoy = operateCostYoy;
    }

    public Double getOperateCostYoy() 
    {
        return operateCostYoy;
    }
    public void setTotalOperateCost(Double totalOperateCost) 
    {
        this.totalOperateCost = totalOperateCost;
    }

    public Double getTotalOperateCost() 
    {
        return totalOperateCost;
    }
    public void setTotalOperateCostYoy(Double totalOperateCostYoy) 
    {
        this.totalOperateCostYoy = totalOperateCostYoy;
    }

    public Double getTotalOperateCostYoy() 
    {
        return totalOperateCostYoy;
    }
    public void setFeInterestExpense(Double feInterestExpense) 
    {
        this.feInterestExpense = feInterestExpense;
    }

    public Double getFeInterestExpense() 
    {
        return feInterestExpense;
    }
    public void setFeInterestExpenseYoy(Double feInterestExpenseYoy) 
    {
        this.feInterestExpenseYoy = feInterestExpenseYoy;
    }

    public Double getFeInterestExpenseYoy() 
    {
        return feInterestExpenseYoy;
    }
    public void setUnconfirmInvestLoss(Double unconfirmInvestLoss) 
    {
        this.unconfirmInvestLoss = unconfirmInvestLoss;
    }

    public Double getUnconfirmInvestLoss() 
    {
        return unconfirmInvestLoss;
    }
    public void setUnconfirmInvestLossYoy(Double unconfirmInvestLossYoy) 
    {
        this.unconfirmInvestLossYoy = unconfirmInvestLossYoy;
    }

    public Double getUnconfirmInvestLossYoy() 
    {
        return unconfirmInvestLossYoy;
    }
    public void setPrecombineProfit(Double precombineProfit) 
    {
        this.precombineProfit = precombineProfit;
    }

    public Double getPrecombineProfit() 
    {
        return precombineProfit;
    }
    public void setPrecombineProfitYoy(Double precombineProfitYoy) 
    {
        this.precombineProfitYoy = precombineProfitYoy;
    }

    public Double getPrecombineProfitYoy() 
    {
        return precombineProfitYoy;
    }
    public void setAssetImpairmentIncome(Double assetImpairmentIncome) 
    {
        this.assetImpairmentIncome = assetImpairmentIncome;
    }

    public Double getAssetImpairmentIncome() 
    {
        return assetImpairmentIncome;
    }
    public void setAssetImpairmentIncomeYoy(Double assetImpairmentIncomeYoy) 
    {
        this.assetImpairmentIncomeYoy = assetImpairmentIncomeYoy;
    }

    public Double getAssetImpairmentIncomeYoy() 
    {
        return assetImpairmentIncomeYoy;
    }
    public void setFinanceExpense(Double financeExpense) 
    {
        this.financeExpense = financeExpense;
    }

    public Double getFinanceExpense() 
    {
        return financeExpense;
    }
    public void setFinanceExpenseYoy(Double financeExpenseYoy) 
    {
        this.financeExpenseYoy = financeExpenseYoy;
    }

    public Double getFinanceExpenseYoy() 
    {
        return financeExpenseYoy;
    }
    public void setReinsureExpense(Double reinsureExpense) 
    {
        this.reinsureExpense = reinsureExpense;
    }

    public Double getReinsureExpense() 
    {
        return reinsureExpense;
    }
    public void setReinsureExpenseYoy(Double reinsureExpenseYoy) 
    {
        this.reinsureExpenseYoy = reinsureExpenseYoy;
    }

    public Double getReinsureExpenseYoy() 
    {
        return reinsureExpenseYoy;
    }
    public void setTotalOperateIncome(Double totalOperateIncome) 
    {
        this.totalOperateIncome = totalOperateIncome;
    }

    public Double getTotalOperateIncome() 
    {
        return totalOperateIncome;
    }
    public void setTotalOperateIncomeYoy(Double totalOperateIncomeYoy) 
    {
        this.totalOperateIncomeYoy = totalOperateIncomeYoy;
    }

    public Double getTotalOperateIncomeYoy() 
    {
        return totalOperateIncomeYoy;
    }
    public void setCreditImpairmentIncome(Double creditImpairmentIncome) 
    {
        this.creditImpairmentIncome = creditImpairmentIncome;
    }

    public Double getCreditImpairmentIncome() 
    {
        return creditImpairmentIncome;
    }
    public void setCreditImpairmentIncomeYoy(Double creditImpairmentIncomeYoy) 
    {
        this.creditImpairmentIncomeYoy = creditImpairmentIncomeYoy;
    }

    public Double getCreditImpairmentIncomeYoy() 
    {
        return creditImpairmentIncomeYoy;
    }
    public void setPolicyBonusExpense(Double policyBonusExpense) 
    {
        this.policyBonusExpense = policyBonusExpense;
    }

    public Double getPolicyBonusExpense() 
    {
        return policyBonusExpense;
    }
    public void setPolicyBonusExpenseYoy(Double policyBonusExpenseYoy) 
    {
        this.policyBonusExpenseYoy = policyBonusExpenseYoy;
    }

    public Double getPolicyBonusExpenseYoy() 
    {
        return policyBonusExpenseYoy;
    }
    public void setFeInterestIncome(Double feInterestIncome) 
    {
        this.feInterestIncome = feInterestIncome;
    }

    public Double getFeInterestIncome() 
    {
        return feInterestIncome;
    }
    public void setFeInterestIncomeYoy(Double feInterestIncomeYoy) 
    {
        this.feInterestIncomeYoy = feInterestIncomeYoy;
    }

    public Double getFeInterestIncomeYoy() 
    {
        return feInterestIncomeYoy;
    }
    public void setEarnedPremium(Double earnedPremium) 
    {
        this.earnedPremium = earnedPremium;
    }

    public Double getEarnedPremium() 
    {
        return earnedPremium;
    }
    public void setEarnedPremiumYoy(Double earnedPremiumYoy) 
    {
        this.earnedPremiumYoy = earnedPremiumYoy;
    }

    public Double getEarnedPremiumYoy() 
    {
        return earnedPremiumYoy;
    }
    public void setSaleExpense(Double saleExpense) 
    {
        this.saleExpense = saleExpense;
    }

    public Double getSaleExpense() 
    {
        return saleExpense;
    }
    public void setSaleExpenseYoy(Double saleExpenseYoy) 
    {
        this.saleExpenseYoy = saleExpenseYoy;
    }

    public Double getSaleExpenseYoy() 
    {
        return saleExpenseYoy;
    }
    public void setAfaFairvalueChange(Double afaFairvalueChange) 
    {
        this.afaFairvalueChange = afaFairvalueChange;
    }

    public Double getAfaFairvalueChange() 
    {
        return afaFairvalueChange;
    }
    public void setAfaFairvalueChangeYoy(Double afaFairvalueChangeYoy) 
    {
        this.afaFairvalueChangeYoy = afaFairvalueChangeYoy;
    }

    public Double getAfaFairvalueChangeYoy() 
    {
        return afaFairvalueChangeYoy;
    }
    public void setConvertDiff(Double convertDiff) 
    {
        this.convertDiff = convertDiff;
    }

    public Double getConvertDiff() 
    {
        return convertDiff;
    }
    public void setConvertDiffYoy(Double convertDiffYoy) 
    {
        this.convertDiffYoy = convertDiffYoy;
    }

    public Double getConvertDiffYoy() 
    {
        return convertDiffYoy;
    }
    public void setTotalCompreIncome(Double totalCompreIncome) 
    {
        this.totalCompreIncome = totalCompreIncome;
    }

    public Double getTotalCompreIncome() 
    {
        return totalCompreIncome;
    }
    public void setTotalCompreIncomeYoy(Double totalCompreIncomeYoy) 
    {
        this.totalCompreIncomeYoy = totalCompreIncomeYoy;
    }

    public Double getTotalCompreIncomeYoy() 
    {
        return totalCompreIncomeYoy;
    }
    public void setParentTci(Double parentTci) 
    {
        this.parentTci = parentTci;
    }

    public Double getParentTci() 
    {
        return parentTci;
    }
    public void setParentTciYoy(Double parentTciYoy) 
    {
        this.parentTciYoy = parentTciYoy;
    }

    public Double getParentTciYoy() 
    {
        return parentTciYoy;
    }
    public void setMinorityTci(Double minorityTci) 
    {
        this.minorityTci = minorityTci;
    }

    public Double getMinorityTci() 
    {
        return minorityTci;
    }
    public void setMinorityTciYoy(Double minorityTciYoy) 
    {
        this.minorityTciYoy = minorityTciYoy;
    }

    public Double getMinorityTciYoy() 
    {
        return minorityTciYoy;
    }
    public void setReinsurePremium(Double reinsurePremium) 
    {
        this.reinsurePremium = reinsurePremium;
    }

    public Double getReinsurePremium() 
    {
        return reinsurePremium;
    }
    public void setReinsurePremiumYoy(Double reinsurePremiumYoy) 
    {
        this.reinsurePremiumYoy = reinsurePremiumYoy;
    }

    public Double getReinsurePremiumYoy() 
    {
        return reinsurePremiumYoy;
    }
    public void setBankInterestNi(Double bankInterestNi) 
    {
        this.bankInterestNi = bankInterestNi;
    }

    public Double getBankInterestNi() 
    {
        return bankInterestNi;
    }
    public void setBankInterestNiYoy(Double bankInterestNiYoy) 
    {
        this.bankInterestNiYoy = bankInterestNiYoy;
    }

    public Double getBankInterestNiYoy() 
    {
        return bankInterestNiYoy;
    }
    public void setCompensateExpense(Double compensateExpense) 
    {
        this.compensateExpense = compensateExpense;
    }

    public Double getCompensateExpense() 
    {
        return compensateExpense;
    }
    public void setCompensateExpenseYoy(Double compensateExpenseYoy) 
    {
        this.compensateExpenseYoy = compensateExpenseYoy;
    }

    public Double getCompensateExpenseYoy() 
    {
        return compensateExpenseYoy;
    }
    public void setReinsureIncome(Double reinsureIncome) 
    {
        this.reinsureIncome = reinsureIncome;
    }

    public Double getReinsureIncome() 
    {
        return reinsureIncome;
    }
    public void setReinsureIncomeYoy(Double reinsureIncomeYoy) 
    {
        this.reinsureIncomeYoy = reinsureIncomeYoy;
    }

    public Double getReinsureIncomeYoy() 
    {
        return reinsureIncomeYoy;
    }
    public void setAmortizeInsuranceReserve(Double amortizeInsuranceReserve) 
    {
        this.amortizeInsuranceReserve = amortizeInsuranceReserve;
    }

    public Double getAmortizeInsuranceReserve() 
    {
        return amortizeInsuranceReserve;
    }
    public void setAmortizeInsuranceReserveYoy(Double amortizeInsuranceReserveYoy) 
    {
        this.amortizeInsuranceReserveYoy = amortizeInsuranceReserveYoy;
    }

    public Double getAmortizeInsuranceReserveYoy() 
    {
        return amortizeInsuranceReserveYoy;
    }
    public void setEffectNetprofitBalanceQoq(Double effectNetprofitBalanceQoq) 
    {
        this.effectNetprofitBalanceQoq = effectNetprofitBalanceQoq;
    }

    public Double getEffectNetprofitBalanceQoq() 
    {
        return effectNetprofitBalanceQoq;
    }
    public void setUninsuranceCiQoq(Double uninsuranceCiQoq) 
    {
        this.uninsuranceCiQoq = uninsuranceCiQoq;
    }

    public Double getUninsuranceCiQoq() 
    {
        return uninsuranceCiQoq;
    }
    public void setExtractInsuranceReserveQoq(Double extractInsuranceReserveQoq) 
    {
        this.extractInsuranceReserveQoq = extractInsuranceReserveQoq;
    }

    public Double getExtractInsuranceReserveQoq() 
    {
        return extractInsuranceReserveQoq;
    }
    public void setExtractUnexpireReserve(Double extractUnexpireReserve) 
    {
        this.extractUnexpireReserve = extractUnexpireReserve;
    }

    public Double getExtractUnexpireReserve() 
    {
        return extractUnexpireReserve;
    }
    public void setExtractUnexpireReserveYoy(Double extractUnexpireReserveYoy) 
    {
        this.extractUnexpireReserveYoy = extractUnexpireReserveYoy;
    }

    public Double getExtractUnexpireReserveYoy() 
    {
        return extractUnexpireReserveYoy;
    }
    public void setEarnedPremiumBalance(Double earnedPremiumBalance) 
    {
        this.earnedPremiumBalance = earnedPremiumBalance;
    }

    public Double getEarnedPremiumBalance() 
    {
        return earnedPremiumBalance;
    }
    public void setEarnedPremiumBalanceYoy(Double earnedPremiumBalanceYoy) 
    {
        this.earnedPremiumBalanceYoy = earnedPremiumBalanceYoy;
    }

    public Double getEarnedPremiumBalanceYoy() 
    {
        return earnedPremiumBalanceYoy;
    }
    public void setBankInterestExpense(Double bankInterestExpense) 
    {
        this.bankInterestExpense = bankInterestExpense;
    }

    public Double getBankInterestExpense() 
    {
        return bankInterestExpense;
    }
    public void setBankInterestExpenseYoy(Double bankInterestExpenseYoy) 
    {
        this.bankInterestExpenseYoy = bankInterestExpenseYoy;
    }

    public Double getBankInterestExpenseYoy() 
    {
        return bankInterestExpenseYoy;
    }
    public void setFairvalueChange(Double fairvalueChange) 
    {
        this.fairvalueChange = fairvalueChange;
    }

    public Double getFairvalueChange() 
    {
        return fairvalueChange;
    }
    public void setFairvalueChangeYoy(Double fairvalueChangeYoy) 
    {
        this.fairvalueChangeYoy = fairvalueChangeYoy;
    }

    public Double getFairvalueChangeYoy() 
    {
        return fairvalueChangeYoy;
    }
    public void setAmortizeCompensateExpense(Double amortizeCompensateExpense) 
    {
        this.amortizeCompensateExpense = amortizeCompensateExpense;
    }

    public Double getAmortizeCompensateExpense() 
    {
        return amortizeCompensateExpense;
    }
    public void setAmortizeCompensateExpenseYoy(Double amortizeCompensateExpenseYoy) 
    {
        this.amortizeCompensateExpenseYoy = amortizeCompensateExpenseYoy;
    }

    public Double getAmortizeCompensateExpenseYoy() 
    {
        return amortizeCompensateExpenseYoy;
    }
    public void setExtractInsuranceReserve(Double extractInsuranceReserve) 
    {
        this.extractInsuranceReserve = extractInsuranceReserve;
    }

    public Double getExtractInsuranceReserve() 
    {
        return extractInsuranceReserve;
    }
    public void setExtractInsuranceReserveYoy(Double extractInsuranceReserveYoy) 
    {
        this.extractInsuranceReserveYoy = extractInsuranceReserveYoy;
    }

    public Double getExtractInsuranceReserveYoy() 
    {
        return extractInsuranceReserveYoy;
    }
    public void setAssetManageNi(Double assetManageNi) 
    {
        this.assetManageNi = assetManageNi;
    }

    public Double getAssetManageNi() 
    {
        return assetManageNi;
    }
    public void setAssetManageNiYoy(Double assetManageNiYoy) 
    {
        this.assetManageNiYoy = assetManageNiYoy;
    }

    public Double getAssetManageNiYoy() 
    {
        return assetManageNiYoy;
    }
    public void setCommissionNiOther(Double commissionNiOther) 
    {
        this.commissionNiOther = commissionNiOther;
    }

    public Double getCommissionNiOther() 
    {
        return commissionNiOther;
    }
    public void setCommissionNiOtherYoy(Double commissionNiOtherYoy) 
    {
        this.commissionNiOtherYoy = commissionNiOtherYoy;
    }

    public Double getCommissionNiOtherYoy() 
    {
        return commissionNiOtherYoy;
    }
    public void setAgentSecurityNi(Double agentSecurityNi) 
    {
        this.agentSecurityNi = agentSecurityNi;
    }

    public Double getAgentSecurityNi() 
    {
        return agentSecurityNi;
    }
    public void setAgentSecurityNiYoy(Double agentSecurityNiYoy) 
    {
        this.agentSecurityNiYoy = agentSecurityNiYoy;
    }

    public Double getAgentSecurityNiYoy() 
    {
        return agentSecurityNiYoy;
    }
    public void setRecommendNi(Double recommendNi) 
    {
        this.recommendNi = recommendNi;
    }

    public Double getRecommendNi() 
    {
        return recommendNi;
    }
    public void setRecommendNiYoy(Double recommendNiYoy) 
    {
        this.recommendNiYoy = recommendNiYoy;
    }

    public Double getRecommendNiYoy() 
    {
        return recommendNiYoy;
    }
    public void setBrokerNi(Double brokerNi) 
    {
        this.brokerNi = brokerNi;
    }

    public Double getBrokerNi() 
    {
        return brokerNi;
    }
    public void setBrokerNiYoy(Double brokerNiYoy) 
    {
        this.brokerNiYoy = brokerNiYoy;
    }

    public Double getBrokerNiYoy() 
    {
        return brokerNiYoy;
    }
    public void setFinanceAdviserNi(Double financeAdviserNi) 
    {
        this.financeAdviserNi = financeAdviserNi;
    }

    public Double getFinanceAdviserNi() 
    {
        return financeAdviserNi;
    }
    public void setFinanceAdviserNiYoy(Double financeAdviserNiYoy) 
    {
        this.financeAdviserNiYoy = financeAdviserNiYoy;
    }

    public Double getFinanceAdviserNiYoy() 
    {
        return financeAdviserNiYoy;
    }
    public void setFundSaleNi(Double fundSaleNi) 
    {
        this.fundSaleNi = fundSaleNi;
    }

    public Double getFundSaleNi() 
    {
        return fundSaleNi;
    }
    public void setFundSaleNiYoy(Double fundSaleNiYoy) 
    {
        this.fundSaleNiYoy = fundSaleNiYoy;
    }

    public Double getFundSaleNiYoy() 
    {
        return fundSaleNiYoy;
    }
    public void setAmortizeReinsureExpense(Double amortizeReinsureExpense) 
    {
        this.amortizeReinsureExpense = amortizeReinsureExpense;
    }

    public Double getAmortizeReinsureExpense() 
    {
        return amortizeReinsureExpense;
    }
    public void setAmortizeReinsureExpenseYoy(Double amortizeReinsureExpenseYoy) 
    {
        this.amortizeReinsureExpenseYoy = amortizeReinsureExpenseYoy;
    }

    public Double getAmortizeReinsureExpenseYoy() 
    {
        return amortizeReinsureExpenseYoy;
    }
    public void setUninsuranceCni(Double uninsuranceCni) 
    {
        this.uninsuranceCni = uninsuranceCni;
    }

    public Double getUninsuranceCni() 
    {
        return uninsuranceCni;
    }
    public void setUninsuranceCniYoy(Double uninsuranceCniYoy) 
    {
        this.uninsuranceCniYoy = uninsuranceCniYoy;
    }

    public Double getUninsuranceCniYoy() 
    {
        return uninsuranceCniYoy;
    }
    public void setBankInterestIncome(Double bankInterestIncome) 
    {
        this.bankInterestIncome = bankInterestIncome;
    }

    public Double getBankInterestIncome() 
    {
        return bankInterestIncome;
    }
    public void setBankInterestIncomeYoy(Double bankInterestIncomeYoy) 
    {
        this.bankInterestIncomeYoy = bankInterestIncomeYoy;
    }

    public Double getBankInterestIncomeYoy() 
    {
        return bankInterestIncomeYoy;
    }
    public void setUninsuranceCe(Double uninsuranceCe) 
    {
        this.uninsuranceCe = uninsuranceCe;
    }

    public Double getUninsuranceCe() 
    {
        return uninsuranceCe;
    }
    public void setUninsuranceCeYoy(Double uninsuranceCeYoy) 
    {
        this.uninsuranceCeYoy = uninsuranceCeYoy;
    }

    public Double getUninsuranceCeYoy() 
    {
        return uninsuranceCeYoy;
    }
    public void setSecurityUnderwriteNi(Double securityUnderwriteNi) 
    {
        this.securityUnderwriteNi = securityUnderwriteNi;
    }

    public Double getSecurityUnderwriteNi() 
    {
        return securityUnderwriteNi;
    }
    public void setSecurityUnderwriteNiYoy(Double securityUnderwriteNiYoy) 
    {
        this.securityUnderwriteNiYoy = securityUnderwriteNiYoy;
    }

    public Double getSecurityUnderwriteNiYoy() 
    {
        return securityUnderwriteNiYoy;
    }
    public void setInsuranceIncome(Double insuranceIncome) 
    {
        this.insuranceIncome = insuranceIncome;
    }

    public Double getInsuranceIncome() 
    {
        return insuranceIncome;
    }
    public void setInsuranceIncomeYoy(Double insuranceIncomeYoy) 
    {
        this.insuranceIncomeYoy = insuranceIncomeYoy;
    }

    public Double getInsuranceIncomeYoy() 
    {
        return insuranceIncomeYoy;
    }
    public void setFundManageNi(Double fundManageNi) 
    {
        this.fundManageNi = fundManageNi;
    }

    public Double getFundManageNi() 
    {
        return fundManageNi;
    }
    public void setFundManageNiYoy(Double fundManageNiYoy) 
    {
        this.fundManageNiYoy = fundManageNiYoy;
    }

    public Double getFundManageNiYoy() 
    {
        return fundManageNiYoy;
    }
    public void setNetprofitOtherQoq(Double netprofitOtherQoq) 
    {
        this.netprofitOtherQoq = netprofitOtherQoq;
    }

    public Double getNetprofitOtherQoq() 
    {
        return netprofitOtherQoq;
    }
    public void setOtherBusinessIncomeQoq(Double otherBusinessIncomeQoq) 
    {
        this.otherBusinessIncomeQoq = otherBusinessIncomeQoq;
    }

    public Double getOtherBusinessIncomeQoq() 
    {
        return otherBusinessIncomeQoq;
    }
    public void setOperateProfitQoq(Double operateProfitQoq) 
    {
        this.operateProfitQoq = operateProfitQoq;
    }

    public Double getOperateProfitQoq() 
    {
        return operateProfitQoq;
    }
    public void setIncomeTaxQoq(Double incomeTaxQoq) 
    {
        this.incomeTaxQoq = incomeTaxQoq;
    }

    public Double getIncomeTaxQoq() 
    {
        return incomeTaxQoq;
    }
    public void setPrecombineProfitQoq(Double precombineProfitQoq) 
    {
        this.precombineProfitQoq = precombineProfitQoq;
    }

    public Double getPrecombineProfitQoq() 
    {
        return precombineProfitQoq;
    }
    public void setTotalOperateCostQoq(Double totalOperateCostQoq) 
    {
        this.totalOperateCostQoq = totalOperateCostQoq;
    }

    public Double getTotalOperateCostQoq() 
    {
        return totalOperateCostQoq;
    }
    public void setNetprofitBalanceQoq(Double netprofitBalanceQoq) 
    {
        this.netprofitBalanceQoq = netprofitBalanceQoq;
    }

    public Double getNetprofitBalanceQoq() 
    {
        return netprofitBalanceQoq;
    }
    public void setNonbusinessIncomeQoq(Double nonbusinessIncomeQoq) 
    {
        this.nonbusinessIncomeQoq = nonbusinessIncomeQoq;
    }

    public Double getNonbusinessIncomeQoq() 
    {
        return nonbusinessIncomeQoq;
    }
    public void setDeductParentNetprofitQoq(Double deductParentNetprofitQoq) 
    {
        this.deductParentNetprofitQoq = deductParentNetprofitQoq;
    }

    public Double getDeductParentNetprofitQoq() 
    {
        return deductParentNetprofitQoq;
    }
    public void setNetCompensateExpenseQoq(Double netCompensateExpenseQoq) 
    {
        this.netCompensateExpenseQoq = netCompensateExpenseQoq;
    }

    public Double getNetCompensateExpenseQoq() 
    {
        return netCompensateExpenseQoq;
    }
    public void setCreditImpairmentIncomeQoq(Double creditImpairmentIncomeQoq) 
    {
        this.creditImpairmentIncomeQoq = creditImpairmentIncomeQoq;
    }

    public Double getCreditImpairmentIncomeQoq() 
    {
        return creditImpairmentIncomeQoq;
    }
    public void setAssetImpairmentLossQoq(Double assetImpairmentLossQoq) 
    {
        this.assetImpairmentLossQoq = assetImpairmentLossQoq;
    }

    public Double getAssetImpairmentLossQoq() 
    {
        return assetImpairmentLossQoq;
    }
    public void setResearchExpenseQoq(Double researchExpenseQoq) 
    {
        this.researchExpenseQoq = researchExpenseQoq;
    }

    public Double getResearchExpenseQoq() 
    {
        return researchExpenseQoq;
    }
    public void setParentNetprofitQoq(Double parentNetprofitQoq) 
    {
        this.parentNetprofitQoq = parentNetprofitQoq;
    }

    public Double getParentNetprofitQoq() 
    {
        return parentNetprofitQoq;
    }
    public void setInterestIncomeQoq(Double interestIncomeQoq) 
    {
        this.interestIncomeQoq = interestIncomeQoq;
    }

    public Double getInterestIncomeQoq() 
    {
        return interestIncomeQoq;
    }
    public void setFeeCommissionIncomeQoq(Double feeCommissionIncomeQoq) 
    {
        this.feeCommissionIncomeQoq = feeCommissionIncomeQoq;
    }

    public Double getFeeCommissionIncomeQoq() 
    {
        return feeCommissionIncomeQoq;
    }
    public void setOtherCompreIncomeQoq(Double otherCompreIncomeQoq) 
    {
        this.otherCompreIncomeQoq = otherCompreIncomeQoq;
    }

    public Double getOtherCompreIncomeQoq() 
    {
        return otherCompreIncomeQoq;
    }
    public void setSurrenderValueQoq(Double surrenderValueQoq) 
    {
        this.surrenderValueQoq = surrenderValueQoq;
    }

    public Double getSurrenderValueQoq() 
    {
        return surrenderValueQoq;
    }
    public void setOtherIncomeQoq(Double otherIncomeQoq) 
    {
        this.otherIncomeQoq = otherIncomeQoq;
    }

    public Double getOtherIncomeQoq() 
    {
        return otherIncomeQoq;
    }
    public void setTotalProfitQoq(Double totalProfitQoq) 
    {
        this.totalProfitQoq = totalProfitQoq;
    }

    public Double getTotalProfitQoq() 
    {
        return totalProfitQoq;
    }
    public void setUnconfirmInvestLossQoq(Double unconfirmInvestLossQoq) 
    {
        this.unconfirmInvestLossQoq = unconfirmInvestLossQoq;
    }

    public Double getUnconfirmInvestLossQoq() 
    {
        return unconfirmInvestLossQoq;
    }
    public void setEffectTpOtherQoq(Double effectTpOtherQoq) 
    {
        this.effectTpOtherQoq = effectTpOtherQoq;
    }

    public Double getEffectTpOtherQoq() 
    {
        return effectTpOtherQoq;
    }
    public void setDiscontinuedNetprofitQoq(Double discontinuedNetprofitQoq) 
    {
        this.discontinuedNetprofitQoq = discontinuedNetprofitQoq;
    }

    public Double getDiscontinuedNetprofitQoq() 
    {
        return discontinuedNetprofitQoq;
    }
    public void setReinsureExpenseQoq(Double reinsureExpenseQoq) 
    {
        this.reinsureExpenseQoq = reinsureExpenseQoq;
    }

    public Double getReinsureExpenseQoq() 
    {
        return reinsureExpenseQoq;
    }
    public void setMinorityTciQoq(Double minorityTciQoq) 
    {
        this.minorityTciQoq = minorityTciQoq;
    }

    public Double getMinorityTciQoq() 
    {
        return minorityTciQoq;
    }
    public void setTotalOperateIncomeQoq(Double totalOperateIncomeQoq) 
    {
        this.totalOperateIncomeQoq = totalOperateIncomeQoq;
    }

    public Double getTotalOperateIncomeQoq() 
    {
        return totalOperateIncomeQoq;
    }
    public void setContinuedNetprofitQoq(Double continuedNetprofitQoq) 
    {
        this.continuedNetprofitQoq = continuedNetprofitQoq;
    }

    public Double getContinuedNetprofitQoq() 
    {
        return continuedNetprofitQoq;
    }
    public void setSurrenderValue(Double surrenderValue) 
    {
        this.surrenderValue = surrenderValue;
    }

    public Double getSurrenderValue() 
    {
        return surrenderValue;
    }
    public void setFinanceExpenseQoq(Double financeExpenseQoq) 
    {
        this.financeExpenseQoq = financeExpenseQoq;
    }

    public Double getFinanceExpenseQoq() 
    {
        return financeExpenseQoq;
    }
    public void setOperateTaxAddQoq(Double operateTaxAddQoq) 
    {
        this.operateTaxAddQoq = operateTaxAddQoq;
    }

    public Double getOperateTaxAddQoq() 
    {
        return operateTaxAddQoq;
    }
    public void setSaleExpenseQoq(Double saleExpenseQoq) 
    {
        this.saleExpenseQoq = saleExpenseQoq;
    }

    public Double getSaleExpenseQoq() 
    {
        return saleExpenseQoq;
    }
    public void setInvestIncomeQoq(Double investIncomeQoq) 
    {
        this.investIncomeQoq = investIncomeQoq;
    }

    public Double getInvestIncomeQoq() 
    {
        return investIncomeQoq;
    }
    public void setOperateProfitOtherQoq(Double operateProfitOtherQoq) 
    {
        this.operateProfitOtherQoq = operateProfitOtherQoq;
    }

    public Double getOperateProfitOtherQoq() 
    {
        return operateProfitOtherQoq;
    }
    public void setNetContractReserveQoq(Double netContractReserveQoq) 
    {
        this.netContractReserveQoq = netContractReserveQoq;
    }

    public Double getNetContractReserveQoq() 
    {
        return netContractReserveQoq;
    }
    public void setInterestExpenseQoq(Double interestExpenseQoq) 
    {
        this.interestExpenseQoq = interestExpenseQoq;
    }

    public Double getInterestExpenseQoq() 
    {
        return interestExpenseQoq;
    }
    public void setBasicEpsQoq(Double basicEpsQoq) 
    {
        this.basicEpsQoq = basicEpsQoq;
    }

    public Double getBasicEpsQoq() 
    {
        return basicEpsQoq;
    }
    public void setCreditImpairmentLossQoq(Double creditImpairmentLossQoq) 
    {
        this.creditImpairmentLossQoq = creditImpairmentLossQoq;
    }

    public Double getCreditImpairmentLossQoq() 
    {
        return creditImpairmentLossQoq;
    }
    public void setMinorityInterestQoq(Double minorityInterestQoq) 
    {
        this.minorityInterestQoq = minorityInterestQoq;
    }

    public Double getMinorityInterestQoq() 
    {
        return minorityInterestQoq;
    }
    public void setFairvalueChangeIncomeQoq(Double fairvalueChangeIncomeQoq) 
    {
        this.fairvalueChangeIncomeQoq = fairvalueChangeIncomeQoq;
    }

    public Double getFairvalueChangeIncomeQoq() 
    {
        return fairvalueChangeIncomeQoq;
    }
    public void setNonbusinessExpenseQoq(Double nonbusinessExpenseQoq) 
    {
        this.nonbusinessExpenseQoq = nonbusinessExpenseQoq;
    }

    public Double getNonbusinessExpenseQoq() 
    {
        return nonbusinessExpenseQoq;
    }
    public void setInvestJointIncomeQoq(Double investJointIncomeQoq) 
    {
        this.investJointIncomeQoq = investJointIncomeQoq;
    }

    public Double getInvestJointIncomeQoq() 
    {
        return investJointIncomeQoq;
    }
    public void setNetprofitQoq(Double netprofitQoq) 
    {
        this.netprofitQoq = netprofitQoq;
    }

    public Double getNetprofitQoq() 
    {
        return netprofitQoq;
    }
    public void setManageExpenseQoq(Double manageExpenseQoq) 
    {
        this.manageExpenseQoq = manageExpenseQoq;
    }

    public Double getManageExpenseQoq() 
    {
        return manageExpenseQoq;
    }
    public void setAssetImpairmentIncomeQoq(Double assetImpairmentIncomeQoq) 
    {
        this.assetImpairmentIncomeQoq = assetImpairmentIncomeQoq;
    }

    public Double getAssetImpairmentIncomeQoq() 
    {
        return assetImpairmentIncomeQoq;
    }
    public void setNoncurrentDisposalIncomeQoq(Double noncurrentDisposalIncomeQoq) 
    {
        this.noncurrentDisposalIncomeQoq = noncurrentDisposalIncomeQoq;
    }

    public Double getNoncurrentDisposalIncomeQoq() 
    {
        return noncurrentDisposalIncomeQoq;
    }
    public void setNoncurrentDisposalLossQoq(Double noncurrentDisposalLossQoq) 
    {
        this.noncurrentDisposalLossQoq = noncurrentDisposalLossQoq;
    }

    public Double getNoncurrentDisposalLossQoq() 
    {
        return noncurrentDisposalLossQoq;
    }
    public void setToiOtherQoq(Double toiOtherQoq) 
    {
        this.toiOtherQoq = toiOtherQoq;
    }

    public Double getToiOtherQoq() 
    {
        return toiOtherQoq;
    }
    public void setFeInterestExpenseQoq(Double feInterestExpenseQoq) 
    {
        this.feInterestExpenseQoq = feInterestExpenseQoq;
    }

    public Double getFeInterestExpenseQoq() 
    {
        return feInterestExpenseQoq;
    }
    public void setDilutedEpsQoq(Double dilutedEpsQoq) 
    {
        this.dilutedEpsQoq = dilutedEpsQoq;
    }

    public Double getDilutedEpsQoq() 
    {
        return dilutedEpsQoq;
    }
    public void setOtherBusinessCostQoq(Double otherBusinessCostQoq) 
    {
        this.otherBusinessCostQoq = otherBusinessCostQoq;
    }

    public Double getOtherBusinessCostQoq() 
    {
        return otherBusinessCostQoq;
    }
    public void setOperateProfitBalanceQoq(Double operateProfitBalanceQoq) 
    {
        this.operateProfitBalanceQoq = operateProfitBalanceQoq;
    }

    public Double getOperateProfitBalanceQoq() 
    {
        return operateProfitBalanceQoq;
    }
    public void setPolicyBonusExpenseQoq(Double policyBonusExpenseQoq) 
    {
        this.policyBonusExpenseQoq = policyBonusExpenseQoq;
    }

    public Double getPolicyBonusExpenseQoq() 
    {
        return policyBonusExpenseQoq;
    }
    public void setParentOciQoq(Double parentOciQoq) 
    {
        this.parentOciQoq = parentOciQoq;
    }

    public Double getParentOciQoq() 
    {
        return parentOciQoq;
    }
    public void setOperateExpenseQoq(Double operateExpenseQoq) 
    {
        this.operateExpenseQoq = operateExpenseQoq;
    }

    public Double getOperateExpenseQoq() 
    {
        return operateExpenseQoq;
    }
    public void setBankInterestNiQoq(Double bankInterestNiQoq) 
    {
        this.bankInterestNiQoq = bankInterestNiQoq;
    }

    public Double getBankInterestNiQoq() 
    {
        return bankInterestNiQoq;
    }
    public void setExtractUnexpireReserveQoq(Double extractUnexpireReserveQoq) 
    {
        this.extractUnexpireReserveQoq = extractUnexpireReserveQoq;
    }

    public Double getExtractUnexpireReserveQoq() 
    {
        return extractUnexpireReserveQoq;
    }
    public void setFundManageNiQoq(Double fundManageNiQoq) 
    {
        this.fundManageNiQoq = fundManageNiQoq;
    }

    public Double getFundManageNiQoq() 
    {
        return fundManageNiQoq;
    }
    public void setAssetManageNiQoq(Double assetManageNiQoq) 
    {
        this.assetManageNiQoq = assetManageNiQoq;
    }

    public Double getAssetManageNiQoq() 
    {
        return assetManageNiQoq;
    }
    public void setAgentSecurityNiQoq(Double agentSecurityNiQoq) 
    {
        this.agentSecurityNiQoq = agentSecurityNiQoq;
    }

    public Double getAgentSecurityNiQoq() 
    {
        return agentSecurityNiQoq;
    }
    public void setOperateIncomeBalanceQoq(Double operateIncomeBalanceQoq) 
    {
        this.operateIncomeBalanceQoq = operateIncomeBalanceQoq;
    }

    public Double getOperateIncomeBalanceQoq() 
    {
        return operateIncomeBalanceQoq;
    }
    public void setOperateExpenseBalanceQoq(Double operateExpenseBalanceQoq) 
    {
        this.operateExpenseBalanceQoq = operateExpenseBalanceQoq;
    }

    public Double getOperateExpenseBalanceQoq() 
    {
        return operateExpenseBalanceQoq;
    }
    public void setUninsuranceCniQoq(Double uninsuranceCniQoq) 
    {
        this.uninsuranceCniQoq = uninsuranceCniQoq;
    }

    public Double getUninsuranceCniQoq() 
    {
        return uninsuranceCniQoq;
    }
    public void setAmortizeCompensateExpenseQoq(Double amortizeCompensateExpenseQoq) 
    {
        this.amortizeCompensateExpenseQoq = amortizeCompensateExpenseQoq;
    }

    public Double getAmortizeCompensateExpenseQoq() 
    {
        return amortizeCompensateExpenseQoq;
    }
    public void setReinsureIncomeQoq(Double reinsureIncomeQoq) 
    {
        this.reinsureIncomeQoq = reinsureIncomeQoq;
    }

    public Double getReinsureIncomeQoq() 
    {
        return reinsureIncomeQoq;
    }
    public void setBusinessManageExpenseQoq(Double businessManageExpenseQoq) 
    {
        this.businessManageExpenseQoq = businessManageExpenseQoq;
    }

    public Double getBusinessManageExpenseQoq() 
    {
        return businessManageExpenseQoq;
    }
    public void setOperateIncomeOtherQoq(Double operateIncomeOtherQoq) 
    {
        this.operateIncomeOtherQoq = operateIncomeOtherQoq;
    }

    public Double getOperateIncomeOtherQoq() 
    {
        return operateIncomeOtherQoq;
    }
    public void setFundSaleNiQoq(Double fundSaleNiQoq) 
    {
        this.fundSaleNiQoq = fundSaleNiQoq;
    }

    public Double getFundSaleNiQoq() 
    {
        return fundSaleNiQoq;
    }
    public void setBrokerNiQoq(Double brokerNiQoq) 
    {
        this.brokerNiQoq = brokerNiQoq;
    }

    public Double getBrokerNiQoq() 
    {
        return brokerNiQoq;
    }
    public void setBankInterestIncomeQoq(Double bankInterestIncomeQoq) 
    {
        this.bankInterestIncomeQoq = bankInterestIncomeQoq;
    }

    public Double getBankInterestIncomeQoq() 
    {
        return bankInterestIncomeQoq;
    }
    public void setReinsurePremiumQoq(Double reinsurePremiumQoq) 
    {
        this.reinsurePremiumQoq = reinsurePremiumQoq;
    }

    public Double getReinsurePremiumQoq() 
    {
        return reinsurePremiumQoq;
    }
    public void setCompensateExpenseQoq(Double compensateExpenseQoq) 
    {
        this.compensateExpenseQoq = compensateExpenseQoq;
    }

    public Double getCompensateExpenseQoq() 
    {
        return compensateExpenseQoq;
    }
    public void setFinanceAdviserNiQoq(Double financeAdviserNiQoq) 
    {
        this.financeAdviserNiQoq = financeAdviserNiQoq;
    }

    public Double getFinanceAdviserNiQoq() 
    {
        return financeAdviserNiQoq;
    }
    public void setFeeCommissionNiQoq(Double feeCommissionNiQoq) 
    {
        this.feeCommissionNiQoq = feeCommissionNiQoq;
    }

    public Double getFeeCommissionNiQoq() 
    {
        return feeCommissionNiQoq;
    }
    public void setRecommendNiQoq(Double recommendNiQoq) 
    {
        this.recommendNiQoq = recommendNiQoq;
    }

    public Double getRecommendNiQoq() 
    {
        return recommendNiQoq;
    }
    public void setOperateExpenseOtherQoq(Double operateExpenseOtherQoq) 
    {
        this.operateExpenseOtherQoq = operateExpenseOtherQoq;
    }

    public Double getOperateExpenseOtherQoq() 
    {
        return operateExpenseOtherQoq;
    }
    public void setCommissionNiOtherQoq(Double commissionNiOtherQoq) 
    {
        this.commissionNiOtherQoq = commissionNiOtherQoq;
    }

    public Double getCommissionNiOtherQoq() 
    {
        return commissionNiOtherQoq;
    }
    public void setAfaFairvalueChangeQoq(Double afaFairvalueChangeQoq) 
    {
        this.afaFairvalueChangeQoq = afaFairvalueChangeQoq;
    }

    public Double getAfaFairvalueChangeQoq() 
    {
        return afaFairvalueChangeQoq;
    }
    public void setAmortizeReinsureExpenseQoq(Double amortizeReinsureExpenseQoq) 
    {
        this.amortizeReinsureExpenseQoq = amortizeReinsureExpenseQoq;
    }

    public Double getAmortizeReinsureExpenseQoq() 
    {
        return amortizeReinsureExpenseQoq;
    }
    public void setEarnedPremiumBalanceQoq(Double earnedPremiumBalanceQoq) 
    {
        this.earnedPremiumBalanceQoq = earnedPremiumBalanceQoq;
    }

    public Double getEarnedPremiumBalanceQoq() 
    {
        return earnedPremiumBalanceQoq;
    }
    public void setUninsuranceCi(Double uninsuranceCi) 
    {
        this.uninsuranceCi = uninsuranceCi;
    }

    public Double getUninsuranceCi() 
    {
        return uninsuranceCi;
    }
    public void setTocOtherQoq(Double tocOtherQoq) 
    {
        this.tocOtherQoq = tocOtherQoq;
    }

    public Double getTocOtherQoq() 
    {
        return tocOtherQoq;
    }
    public void setNetExposureIncomeQoq(Double netExposureIncomeQoq) 
    {
        this.netExposureIncomeQoq = netExposureIncomeQoq;
    }

    public Double getNetExposureIncomeQoq() 
    {
        return netExposureIncomeQoq;
    }
    public void setExchangeIncomeQoq(Double exchangeIncomeQoq) 
    {
        this.exchangeIncomeQoq = exchangeIncomeQoq;
    }

    public Double getExchangeIncomeQoq() 
    {
        return exchangeIncomeQoq;
    }
    public void setUninsuranceCeQoq(Double uninsuranceCeQoq) 
    {
        this.uninsuranceCeQoq = uninsuranceCeQoq;
    }

    public Double getUninsuranceCeQoq() 
    {
        return uninsuranceCeQoq;
    }
    public void setEarnedPremiumQoq(Double earnedPremiumQoq) 
    {
        this.earnedPremiumQoq = earnedPremiumQoq;
    }

    public Double getEarnedPremiumQoq() 
    {
        return earnedPremiumQoq;
    }
    public void setOperateCostQoq(Double operateCostQoq) 
    {
        this.operateCostQoq = operateCostQoq;
    }

    public Double getOperateCostQoq() 
    {
        return operateCostQoq;
    }
    public void setTotalCompreIncomeQoq(Double totalCompreIncomeQoq) 
    {
        this.totalCompreIncomeQoq = totalCompreIncomeQoq;
    }

    public Double getTotalCompreIncomeQoq() 
    {
        return totalCompreIncomeQoq;
    }
    public void setSecurityUnderwriteNiQoq(Double securityUnderwriteNiQoq) 
    {
        this.securityUnderwriteNiQoq = securityUnderwriteNiQoq;
    }

    public Double getSecurityUnderwriteNiQoq() 
    {
        return securityUnderwriteNiQoq;
    }
    public void setAmortizeInsuranceReserveQoq(Double amortizeInsuranceReserveQoq) 
    {
        this.amortizeInsuranceReserveQoq = amortizeInsuranceReserveQoq;
    }

    public Double getAmortizeInsuranceReserveQoq() 
    {
        return amortizeInsuranceReserveQoq;
    }
    public void setAssetDisposalIncomeQoq(Double assetDisposalIncomeQoq) 
    {
        this.assetDisposalIncomeQoq = assetDisposalIncomeQoq;
    }

    public Double getAssetDisposalIncomeQoq() 
    {
        return assetDisposalIncomeQoq;
    }
    public void setTotalProfitBalanceQoq(Double totalProfitBalanceQoq) 
    {
        this.totalProfitBalanceQoq = totalProfitBalanceQoq;
    }

    public Double getTotalProfitBalanceQoq() 
    {
        return totalProfitBalanceQoq;
    }
    public void setInsuranceIncomeQoq(Double insuranceIncomeQoq) 
    {
        this.insuranceIncomeQoq = insuranceIncomeQoq;
    }

    public Double getInsuranceIncomeQoq() 
    {
        return insuranceIncomeQoq;
    }
    public void setFairvalueChangeQoq(Double fairvalueChangeQoq) 
    {
        this.fairvalueChangeQoq = fairvalueChangeQoq;
    }

    public Double getFairvalueChangeQoq() 
    {
        return fairvalueChangeQoq;
    }
    public void setInterestNiQoq(Double interestNiQoq) 
    {
        this.interestNiQoq = interestNiQoq;
    }

    public Double getInterestNiQoq() 
    {
        return interestNiQoq;
    }
    public void setOperateIncomeQoq(Double operateIncomeQoq) 
    {
        this.operateIncomeQoq = operateIncomeQoq;
    }

    public Double getOperateIncomeQoq() 
    {
        return operateIncomeQoq;
    }
    public void setFeeCommissionExpenseQoq(Double feeCommissionExpenseQoq) 
    {
        this.feeCommissionExpenseQoq = feeCommissionExpenseQoq;
    }

    public Double getFeeCommissionExpenseQoq() 
    {
        return feeCommissionExpenseQoq;
    }
    public void setBankInterestExpenseQoq(Double bankInterestExpenseQoq) 
    {
        this.bankInterestExpenseQoq = bankInterestExpenseQoq;
    }

    public Double getBankInterestExpenseQoq() 
    {
        return bankInterestExpenseQoq;
    }

    public InvFinanceLr() {
        super();
    }

    public InvFinanceLr(String securityCode, String reportType) {
        this.securityCode = securityCode;
        this.reportType = reportType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvFinanceLr)) return false;
        InvFinanceLr that = (InvFinanceLr) o;
        return Objects.equals(securityCode, that.securityCode) && Objects.equals(reportType, that.reportType) && Objects.equals(reportDate, that.reportDate) && Objects.equals(opinionType, that.opinionType) && Objects.equals(osopinionType, that.osopinionType) && Objects.equals(operateIncome, that.operateIncome) && Objects.equals(operateIncomeYoy, that.operateIncomeYoy) && Objects.equals(interestNi, that.interestNi) && Objects.equals(interestNiYoy, that.interestNiYoy) && Objects.equals(interestIncome, that.interestIncome) && Objects.equals(interestIncomeYoy, that.interestIncomeYoy) && Objects.equals(interestExpense, that.interestExpense) && Objects.equals(interestExpenseYoy, that.interestExpenseYoy) && Objects.equals(feeCommissionNi, that.feeCommissionNi) && Objects.equals(feeCommissionNiYoy, that.feeCommissionNiYoy) && Objects.equals(feeCommissionIncome, that.feeCommissionIncome) && Objects.equals(feeCommissionIncomeYoy, that.feeCommissionIncomeYoy) && Objects.equals(feeCommissionExpense, that.feeCommissionExpense) && Objects.equals(feeCommissionExpenseYoy, that.feeCommissionExpenseYoy) && Objects.equals(investIncome, that.investIncome) && Objects.equals(investIncomeYoy, that.investIncomeYoy) && Objects.equals(investJointIncome, that.investJointIncome) && Objects.equals(investJointIncomeYoy, that.investJointIncomeYoy) && Objects.equals(fairvalueChangeIncome, that.fairvalueChangeIncome) && Objects.equals(fairvalueChangeIncomeYoy, that.fairvalueChangeIncomeYoy) && Objects.equals(exchangeIncome, that.exchangeIncome) && Objects.equals(exchangeIncomeYoy, that.exchangeIncomeYoy) && Objects.equals(otherBusinessIncome, that.otherBusinessIncome) && Objects.equals(otherBusinessIncomeYoy, that.otherBusinessIncomeYoy) && Objects.equals(assetDisposalIncome, that.assetDisposalIncome) && Objects.equals(assetDisposalIncomeYoy, that.assetDisposalIncomeYoy) && Objects.equals(otherIncome, that.otherIncome) && Objects.equals(otherIncomeYoy, that.otherIncomeYoy) && Objects.equals(operateIncomeOther, that.operateIncomeOther) && Objects.equals(operateIncomeOtherYoy, that.operateIncomeOtherYoy) && Objects.equals(operateIncomeBalance, that.operateIncomeBalance) && Objects.equals(operateIncomeBalanceYoy, that.operateIncomeBalanceYoy) && Objects.equals(operateExpense, that.operateExpense) && Objects.equals(operateExpenseYoy, that.operateExpenseYoy) && Objects.equals(operateTaxAdd, that.operateTaxAdd) && Objects.equals(operateTaxAddYoy, that.operateTaxAddYoy) && Objects.equals(businessManageExpense, that.businessManageExpense) && Objects.equals(businessManageExpenseYoy, that.businessManageExpenseYoy) && Objects.equals(assetImpairmentLoss, that.assetImpairmentLoss) && Objects.equals(assetImpairmentLossYoy, that.assetImpairmentLossYoy) && Objects.equals(creditImpairmentLoss, that.creditImpairmentLoss) && Objects.equals(creditImpairmentLossYoy, that.creditImpairmentLossYoy) && Objects.equals(otherBusinessCost, that.otherBusinessCost) && Objects.equals(otherBusinessCostYoy, that.otherBusinessCostYoy) && Objects.equals(operateExpenseOther, that.operateExpenseOther) && Objects.equals(operateExpenseOtherYoy, that.operateExpenseOtherYoy) && Objects.equals(operateExpenseBalance, that.operateExpenseBalance) && Objects.equals(operateExpenseBalanceYoy, that.operateExpenseBalanceYoy) && Objects.equals(operateProfitOther, that.operateProfitOther) && Objects.equals(operateProfitOtherYoy, that.operateProfitOtherYoy) && Objects.equals(operateProfitBalance, that.operateProfitBalance) && Objects.equals(operateProfitBalanceYoy, that.operateProfitBalanceYoy) && Objects.equals(operateProfit, that.operateProfit) && Objects.equals(operateProfitYoy, that.operateProfitYoy) && Objects.equals(nonbusinessIncome, that.nonbusinessIncome) && Objects.equals(nonbusinessIncomeYoy, that.nonbusinessIncomeYoy) && Objects.equals(noncurrentDisposalIncome, that.noncurrentDisposalIncome) && Objects.equals(noncurrentDisposalIncomeYoy, that.noncurrentDisposalIncomeYoy) && Objects.equals(nonbusinessExpense, that.nonbusinessExpense) && Objects.equals(nonbusinessExpenseYoy, that.nonbusinessExpenseYoy) && Objects.equals(noncurrentDisposalLoss, that.noncurrentDisposalLoss) && Objects.equals(noncurrentDisposalLossYoy, that.noncurrentDisposalLossYoy) && Objects.equals(effectTpOther, that.effectTpOther) && Objects.equals(effectTpOtherYoy, that.effectTpOtherYoy) && Objects.equals(totalProfitBalance, that.totalProfitBalance) && Objects.equals(totalProfitBalanceYoy, that.totalProfitBalanceYoy) && Objects.equals(totalProfit, that.totalProfit) && Objects.equals(totalProfitYoy, that.totalProfitYoy) && Objects.equals(incomeTax, that.incomeTax) && Objects.equals(incomeTaxYoy, that.incomeTaxYoy) && Objects.equals(effectNetprofitOther, that.effectNetprofitOther) && Objects.equals(effectNetprofitOtherYoy, that.effectNetprofitOtherYoy) && Objects.equals(effectNetprofitBalance, that.effectNetprofitBalance) && Objects.equals(effectNetprofitBalanceYoy, that.effectNetprofitBalanceYoy) && Objects.equals(netprofit, that.netprofit) && Objects.equals(netprofitYoy, that.netprofitYoy) && Objects.equals(continuedNetprofit, that.continuedNetprofit) && Objects.equals(continuedNetprofitYoy, that.continuedNetprofitYoy) && Objects.equals(discontinuedNetprofit, that.discontinuedNetprofit) && Objects.equals(discontinuedNetprofitYoy, that.discontinuedNetprofitYoy) && Objects.equals(parentNetprofit, that.parentNetprofit) && Objects.equals(parentNetprofitYoy, that.parentNetprofitYoy) && Objects.equals(minorityInterest, that.minorityInterest) && Objects.equals(minorityInterestYoy, that.minorityInterestYoy) && Objects.equals(deductParentNetprofit, that.deductParentNetprofit) && Objects.equals(deductParentNetprofitYoy, that.deductParentNetprofitYoy) && Objects.equals(netprofitOther, that.netprofitOther) && Objects.equals(netprofitOtherYoy, that.netprofitOtherYoy) && Objects.equals(netprofitBalance, that.netprofitBalance) && Objects.equals(netprofitBalanceYoy, that.netprofitBalanceYoy) && Objects.equals(basicEps, that.basicEps) && Objects.equals(basicEpsYoy, that.basicEpsYoy) && Objects.equals(dilutedEps, that.dilutedEps) && Objects.equals(dilutedEpsYoy, that.dilutedEpsYoy) && Objects.equals(otherCompreIncome, that.otherCompreIncome) && Objects.equals(otherCompreIncomeYoy, that.otherCompreIncomeYoy) && Objects.equals(parentOci, that.parentOci) && Objects.equals(parentOciYoy, that.parentOciYoy) && Objects.equals(minorityOci, that.minorityOci) && Objects.equals(minorityOciYoy, that.minorityOciYoy) && Objects.equals(netCompensateExpense, that.netCompensateExpense) && Objects.equals(netCompensateExpenseYoy, that.netCompensateExpenseYoy) && Objects.equals(surrenderValueYoy, that.surrenderValueYoy) && Objects.equals(effectNetprofitOtherQoq, that.effectNetprofitOtherQoq) && Objects.equals(toiOther, that.toiOther) && Objects.equals(toiOtherYoy, that.toiOtherYoy) && Objects.equals(researchExpense, that.researchExpense) && Objects.equals(researchExpenseYoy, that.researchExpenseYoy) && Objects.equals(uninsuranceCiYoy, that.uninsuranceCiYoy) && Objects.equals(parentTciQoq, that.parentTciQoq) && Objects.equals(netExposureIncome, that.netExposureIncome) && Objects.equals(netExposureIncomeYoy, that.netExposureIncomeYoy) && Objects.equals(minorityOciQoq, that.minorityOciQoq) && Objects.equals(feInterestIncomeQoq, that.feInterestIncomeQoq) && Objects.equals(tocOther, that.tocOther) && Objects.equals(tocOtherYoy, that.tocOtherYoy) && Objects.equals(netContractReserve, that.netContractReserve) && Objects.equals(netContractReserveYoy, that.netContractReserveYoy) && Objects.equals(manageExpense, that.manageExpense) && Objects.equals(manageExpenseYoy, that.manageExpenseYoy) && Objects.equals(operateCost, that.operateCost) && Objects.equals(operateCostYoy, that.operateCostYoy) && Objects.equals(totalOperateCost, that.totalOperateCost) && Objects.equals(totalOperateCostYoy, that.totalOperateCostYoy) && Objects.equals(feInterestExpense, that.feInterestExpense) && Objects.equals(feInterestExpenseYoy, that.feInterestExpenseYoy) && Objects.equals(unconfirmInvestLoss, that.unconfirmInvestLoss) && Objects.equals(unconfirmInvestLossYoy, that.unconfirmInvestLossYoy) && Objects.equals(precombineProfit, that.precombineProfit) && Objects.equals(precombineProfitYoy, that.precombineProfitYoy) && Objects.equals(assetImpairmentIncome, that.assetImpairmentIncome) && Objects.equals(assetImpairmentIncomeYoy, that.assetImpairmentIncomeYoy) && Objects.equals(financeExpense, that.financeExpense) && Objects.equals(financeExpenseYoy, that.financeExpenseYoy) && Objects.equals(reinsureExpense, that.reinsureExpense) && Objects.equals(reinsureExpenseYoy, that.reinsureExpenseYoy) && Objects.equals(totalOperateIncome, that.totalOperateIncome) && Objects.equals(totalOperateIncomeYoy, that.totalOperateIncomeYoy) && Objects.equals(creditImpairmentIncome, that.creditImpairmentIncome) && Objects.equals(creditImpairmentIncomeYoy, that.creditImpairmentIncomeYoy) && Objects.equals(policyBonusExpense, that.policyBonusExpense) && Objects.equals(policyBonusExpenseYoy, that.policyBonusExpenseYoy) && Objects.equals(feInterestIncome, that.feInterestIncome) && Objects.equals(feInterestIncomeYoy, that.feInterestIncomeYoy) && Objects.equals(earnedPremium, that.earnedPremium) && Objects.equals(earnedPremiumYoy, that.earnedPremiumYoy) && Objects.equals(saleExpense, that.saleExpense) && Objects.equals(saleExpenseYoy, that.saleExpenseYoy) && Objects.equals(afaFairvalueChange, that.afaFairvalueChange) && Objects.equals(afaFairvalueChangeYoy, that.afaFairvalueChangeYoy) && Objects.equals(convertDiff, that.convertDiff) && Objects.equals(convertDiffYoy, that.convertDiffYoy) && Objects.equals(totalCompreIncome, that.totalCompreIncome) && Objects.equals(totalCompreIncomeYoy, that.totalCompreIncomeYoy) && Objects.equals(parentTci, that.parentTci) && Objects.equals(parentTciYoy, that.parentTciYoy) && Objects.equals(minorityTci, that.minorityTci) && Objects.equals(minorityTciYoy, that.minorityTciYoy) && Objects.equals(reinsurePremium, that.reinsurePremium) && Objects.equals(reinsurePremiumYoy, that.reinsurePremiumYoy) && Objects.equals(bankInterestNi, that.bankInterestNi) && Objects.equals(bankInterestNiYoy, that.bankInterestNiYoy) && Objects.equals(compensateExpense, that.compensateExpense) && Objects.equals(compensateExpenseYoy, that.compensateExpenseYoy) && Objects.equals(reinsureIncome, that.reinsureIncome) && Objects.equals(reinsureIncomeYoy, that.reinsureIncomeYoy) && Objects.equals(amortizeInsuranceReserve, that.amortizeInsuranceReserve) && Objects.equals(amortizeInsuranceReserveYoy, that.amortizeInsuranceReserveYoy) && Objects.equals(effectNetprofitBalanceQoq, that.effectNetprofitBalanceQoq) && Objects.equals(uninsuranceCiQoq, that.uninsuranceCiQoq) && Objects.equals(extractInsuranceReserveQoq, that.extractInsuranceReserveQoq) && Objects.equals(extractUnexpireReserve, that.extractUnexpireReserve) && Objects.equals(extractUnexpireReserveYoy, that.extractUnexpireReserveYoy) && Objects.equals(earnedPremiumBalance, that.earnedPremiumBalance) && Objects.equals(earnedPremiumBalanceYoy, that.earnedPremiumBalanceYoy) && Objects.equals(bankInterestExpense, that.bankInterestExpense) && Objects.equals(bankInterestExpenseYoy, that.bankInterestExpenseYoy) && Objects.equals(fairvalueChange, that.fairvalueChange) && Objects.equals(fairvalueChangeYoy, that.fairvalueChangeYoy) && Objects.equals(amortizeCompensateExpense, that.amortizeCompensateExpense) && Objects.equals(amortizeCompensateExpenseYoy, that.amortizeCompensateExpenseYoy) && Objects.equals(extractInsuranceReserve, that.extractInsuranceReserve) && Objects.equals(extractInsuranceReserveYoy, that.extractInsuranceReserveYoy) && Objects.equals(assetManageNi, that.assetManageNi) && Objects.equals(assetManageNiYoy, that.assetManageNiYoy) && Objects.equals(commissionNiOther, that.commissionNiOther) && Objects.equals(commissionNiOtherYoy, that.commissionNiOtherYoy) && Objects.equals(agentSecurityNi, that.agentSecurityNi) && Objects.equals(agentSecurityNiYoy, that.agentSecurityNiYoy) && Objects.equals(recommendNi, that.recommendNi) && Objects.equals(recommendNiYoy, that.recommendNiYoy) && Objects.equals(brokerNi, that.brokerNi) && Objects.equals(brokerNiYoy, that.brokerNiYoy) && Objects.equals(financeAdviserNi, that.financeAdviserNi) && Objects.equals(financeAdviserNiYoy, that.financeAdviserNiYoy) && Objects.equals(fundSaleNi, that.fundSaleNi) && Objects.equals(fundSaleNiYoy, that.fundSaleNiYoy) && Objects.equals(amortizeReinsureExpense, that.amortizeReinsureExpense) && Objects.equals(amortizeReinsureExpenseYoy, that.amortizeReinsureExpenseYoy) && Objects.equals(uninsuranceCni, that.uninsuranceCni) && Objects.equals(uninsuranceCniYoy, that.uninsuranceCniYoy) && Objects.equals(bankInterestIncome, that.bankInterestIncome) && Objects.equals(bankInterestIncomeYoy, that.bankInterestIncomeYoy) && Objects.equals(uninsuranceCe, that.uninsuranceCe) && Objects.equals(uninsuranceCeYoy, that.uninsuranceCeYoy) && Objects.equals(securityUnderwriteNi, that.securityUnderwriteNi) && Objects.equals(securityUnderwriteNiYoy, that.securityUnderwriteNiYoy) && Objects.equals(insuranceIncome, that.insuranceIncome) && Objects.equals(insuranceIncomeYoy, that.insuranceIncomeYoy) && Objects.equals(fundManageNi, that.fundManageNi) && Objects.equals(fundManageNiYoy, that.fundManageNiYoy) && Objects.equals(netprofitOtherQoq, that.netprofitOtherQoq) && Objects.equals(otherBusinessIncomeQoq, that.otherBusinessIncomeQoq) && Objects.equals(operateProfitQoq, that.operateProfitQoq) && Objects.equals(incomeTaxQoq, that.incomeTaxQoq) && Objects.equals(precombineProfitQoq, that.precombineProfitQoq) && Objects.equals(totalOperateCostQoq, that.totalOperateCostQoq) && Objects.equals(netprofitBalanceQoq, that.netprofitBalanceQoq) && Objects.equals(nonbusinessIncomeQoq, that.nonbusinessIncomeQoq) && Objects.equals(deductParentNetprofitQoq, that.deductParentNetprofitQoq) && Objects.equals(netCompensateExpenseQoq, that.netCompensateExpenseQoq) && Objects.equals(creditImpairmentIncomeQoq, that.creditImpairmentIncomeQoq) && Objects.equals(assetImpairmentLossQoq, that.assetImpairmentLossQoq) && Objects.equals(researchExpenseQoq, that.researchExpenseQoq) && Objects.equals(parentNetprofitQoq, that.parentNetprofitQoq) && Objects.equals(interestIncomeQoq, that.interestIncomeQoq) && Objects.equals(feeCommissionIncomeQoq, that.feeCommissionIncomeQoq) && Objects.equals(otherCompreIncomeQoq, that.otherCompreIncomeQoq) && Objects.equals(surrenderValueQoq, that.surrenderValueQoq) && Objects.equals(otherIncomeQoq, that.otherIncomeQoq) && Objects.equals(totalProfitQoq, that.totalProfitQoq) && Objects.equals(unconfirmInvestLossQoq, that.unconfirmInvestLossQoq) && Objects.equals(effectTpOtherQoq, that.effectTpOtherQoq) && Objects.equals(discontinuedNetprofitQoq, that.discontinuedNetprofitQoq) && Objects.equals(reinsureExpenseQoq, that.reinsureExpenseQoq) && Objects.equals(minorityTciQoq, that.minorityTciQoq) && Objects.equals(totalOperateIncomeQoq, that.totalOperateIncomeQoq) && Objects.equals(continuedNetprofitQoq, that.continuedNetprofitQoq) && Objects.equals(surrenderValue, that.surrenderValue) && Objects.equals(financeExpenseQoq, that.financeExpenseQoq) && Objects.equals(operateTaxAddQoq, that.operateTaxAddQoq) && Objects.equals(saleExpenseQoq, that.saleExpenseQoq) && Objects.equals(investIncomeQoq, that.investIncomeQoq) && Objects.equals(operateProfitOtherQoq, that.operateProfitOtherQoq) && Objects.equals(netContractReserveQoq, that.netContractReserveQoq) && Objects.equals(interestExpenseQoq, that.interestExpenseQoq) && Objects.equals(basicEpsQoq, that.basicEpsQoq) && Objects.equals(creditImpairmentLossQoq, that.creditImpairmentLossQoq) && Objects.equals(minorityInterestQoq, that.minorityInterestQoq) && Objects.equals(fairvalueChangeIncomeQoq, that.fairvalueChangeIncomeQoq) && Objects.equals(nonbusinessExpenseQoq, that.nonbusinessExpenseQoq) && Objects.equals(investJointIncomeQoq, that.investJointIncomeQoq) && Objects.equals(netprofitQoq, that.netprofitQoq) && Objects.equals(manageExpenseQoq, that.manageExpenseQoq) && Objects.equals(assetImpairmentIncomeQoq, that.assetImpairmentIncomeQoq) && Objects.equals(noncurrentDisposalIncomeQoq, that.noncurrentDisposalIncomeQoq) && Objects.equals(noncurrentDisposalLossQoq, that.noncurrentDisposalLossQoq) && Objects.equals(toiOtherQoq, that.toiOtherQoq) && Objects.equals(feInterestExpenseQoq, that.feInterestExpenseQoq) && Objects.equals(dilutedEpsQoq, that.dilutedEpsQoq) && Objects.equals(otherBusinessCostQoq, that.otherBusinessCostQoq) && Objects.equals(operateProfitBalanceQoq, that.operateProfitBalanceQoq) && Objects.equals(policyBonusExpenseQoq, that.policyBonusExpenseQoq) && Objects.equals(parentOciQoq, that.parentOciQoq) && Objects.equals(operateExpenseQoq, that.operateExpenseQoq) && Objects.equals(bankInterestNiQoq, that.bankInterestNiQoq) && Objects.equals(extractUnexpireReserveQoq, that.extractUnexpireReserveQoq) && Objects.equals(fundManageNiQoq, that.fundManageNiQoq) && Objects.equals(assetManageNiQoq, that.assetManageNiQoq) && Objects.equals(agentSecurityNiQoq, that.agentSecurityNiQoq) && Objects.equals(operateIncomeBalanceQoq, that.operateIncomeBalanceQoq) && Objects.equals(operateExpenseBalanceQoq, that.operateExpenseBalanceQoq) && Objects.equals(uninsuranceCniQoq, that.uninsuranceCniQoq) && Objects.equals(amortizeCompensateExpenseQoq, that.amortizeCompensateExpenseQoq) && Objects.equals(reinsureIncomeQoq, that.reinsureIncomeQoq) && Objects.equals(businessManageExpenseQoq, that.businessManageExpenseQoq) && Objects.equals(operateIncomeOtherQoq, that.operateIncomeOtherQoq) && Objects.equals(fundSaleNiQoq, that.fundSaleNiQoq) && Objects.equals(brokerNiQoq, that.brokerNiQoq) && Objects.equals(bankInterestIncomeQoq, that.bankInterestIncomeQoq) && Objects.equals(reinsurePremiumQoq, that.reinsurePremiumQoq) && Objects.equals(compensateExpenseQoq, that.compensateExpenseQoq) && Objects.equals(financeAdviserNiQoq, that.financeAdviserNiQoq) && Objects.equals(feeCommissionNiQoq, that.feeCommissionNiQoq) && Objects.equals(recommendNiQoq, that.recommendNiQoq) && Objects.equals(operateExpenseOtherQoq, that.operateExpenseOtherQoq) && Objects.equals(commissionNiOtherQoq, that.commissionNiOtherQoq) && Objects.equals(afaFairvalueChangeQoq, that.afaFairvalueChangeQoq) && Objects.equals(amortizeReinsureExpenseQoq, that.amortizeReinsureExpenseQoq) && Objects.equals(earnedPremiumBalanceQoq, that.earnedPremiumBalanceQoq) && Objects.equals(uninsuranceCi, that.uninsuranceCi) && Objects.equals(tocOtherQoq, that.tocOtherQoq) && Objects.equals(netExposureIncomeQoq, that.netExposureIncomeQoq) && Objects.equals(exchangeIncomeQoq, that.exchangeIncomeQoq) && Objects.equals(uninsuranceCeQoq, that.uninsuranceCeQoq) && Objects.equals(earnedPremiumQoq, that.earnedPremiumQoq) && Objects.equals(operateCostQoq, that.operateCostQoq) && Objects.equals(totalCompreIncomeQoq, that.totalCompreIncomeQoq) && Objects.equals(securityUnderwriteNiQoq, that.securityUnderwriteNiQoq) && Objects.equals(amortizeInsuranceReserveQoq, that.amortizeInsuranceReserveQoq) && Objects.equals(assetDisposalIncomeQoq, that.assetDisposalIncomeQoq) && Objects.equals(totalProfitBalanceQoq, that.totalProfitBalanceQoq) && Objects.equals(insuranceIncomeQoq, that.insuranceIncomeQoq) && Objects.equals(fairvalueChangeQoq, that.fairvalueChangeQoq) && Objects.equals(interestNiQoq, that.interestNiQoq) && Objects.equals(operateIncomeQoq, that.operateIncomeQoq) && Objects.equals(feeCommissionExpenseQoq, that.feeCommissionExpenseQoq) && Objects.equals(bankInterestExpenseQoq, that.bankInterestExpenseQoq);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityCode, reportType, reportDate, opinionType, osopinionType, operateIncome, operateIncomeYoy, interestNi, interestNiYoy, interestIncome, interestIncomeYoy, interestExpense, interestExpenseYoy, feeCommissionNi, feeCommissionNiYoy, feeCommissionIncome, feeCommissionIncomeYoy, feeCommissionExpense, feeCommissionExpenseYoy, investIncome, investIncomeYoy, investJointIncome, investJointIncomeYoy, fairvalueChangeIncome, fairvalueChangeIncomeYoy, exchangeIncome, exchangeIncomeYoy, otherBusinessIncome, otherBusinessIncomeYoy, assetDisposalIncome, assetDisposalIncomeYoy, otherIncome, otherIncomeYoy, operateIncomeOther, operateIncomeOtherYoy, operateIncomeBalance, operateIncomeBalanceYoy, operateExpense, operateExpenseYoy, operateTaxAdd, operateTaxAddYoy, businessManageExpense, businessManageExpenseYoy, assetImpairmentLoss, assetImpairmentLossYoy, creditImpairmentLoss, creditImpairmentLossYoy, otherBusinessCost, otherBusinessCostYoy, operateExpenseOther, operateExpenseOtherYoy, operateExpenseBalance, operateExpenseBalanceYoy, operateProfitOther, operateProfitOtherYoy, operateProfitBalance, operateProfitBalanceYoy, operateProfit, operateProfitYoy, nonbusinessIncome, nonbusinessIncomeYoy, noncurrentDisposalIncome, noncurrentDisposalIncomeYoy, nonbusinessExpense, nonbusinessExpenseYoy, noncurrentDisposalLoss, noncurrentDisposalLossYoy, effectTpOther, effectTpOtherYoy, totalProfitBalance, totalProfitBalanceYoy, totalProfit, totalProfitYoy, incomeTax, incomeTaxYoy, effectNetprofitOther, effectNetprofitOtherYoy, effectNetprofitBalance, effectNetprofitBalanceYoy, netprofit, netprofitYoy, continuedNetprofit, continuedNetprofitYoy, discontinuedNetprofit, discontinuedNetprofitYoy, parentNetprofit, parentNetprofitYoy, minorityInterest, minorityInterestYoy, deductParentNetprofit, deductParentNetprofitYoy, netprofitOther, netprofitOtherYoy, netprofitBalance, netprofitBalanceYoy, basicEps, basicEpsYoy, dilutedEps, dilutedEpsYoy, otherCompreIncome, otherCompreIncomeYoy, parentOci, parentOciYoy, minorityOci, minorityOciYoy, netCompensateExpense, netCompensateExpenseYoy, surrenderValueYoy, effectNetprofitOtherQoq, toiOther, toiOtherYoy, researchExpense, researchExpenseYoy, uninsuranceCiYoy, parentTciQoq, netExposureIncome, netExposureIncomeYoy, minorityOciQoq, feInterestIncomeQoq, tocOther, tocOtherYoy, netContractReserve, netContractReserveYoy, manageExpense, manageExpenseYoy, operateCost, operateCostYoy, totalOperateCost, totalOperateCostYoy, feInterestExpense, feInterestExpenseYoy, unconfirmInvestLoss, unconfirmInvestLossYoy, precombineProfit, precombineProfitYoy, assetImpairmentIncome, assetImpairmentIncomeYoy, financeExpense, financeExpenseYoy, reinsureExpense, reinsureExpenseYoy, totalOperateIncome, totalOperateIncomeYoy, creditImpairmentIncome, creditImpairmentIncomeYoy, policyBonusExpense, policyBonusExpenseYoy, feInterestIncome, feInterestIncomeYoy, earnedPremium, earnedPremiumYoy, saleExpense, saleExpenseYoy, afaFairvalueChange, afaFairvalueChangeYoy, convertDiff, convertDiffYoy, totalCompreIncome, totalCompreIncomeYoy, parentTci, parentTciYoy, minorityTci, minorityTciYoy, reinsurePremium, reinsurePremiumYoy, bankInterestNi, bankInterestNiYoy, compensateExpense, compensateExpenseYoy, reinsureIncome, reinsureIncomeYoy, amortizeInsuranceReserve, amortizeInsuranceReserveYoy, effectNetprofitBalanceQoq, uninsuranceCiQoq, extractInsuranceReserveQoq, extractUnexpireReserve, extractUnexpireReserveYoy, earnedPremiumBalance, earnedPremiumBalanceYoy, bankInterestExpense, bankInterestExpenseYoy, fairvalueChange, fairvalueChangeYoy, amortizeCompensateExpense, amortizeCompensateExpenseYoy, extractInsuranceReserve, extractInsuranceReserveYoy, assetManageNi, assetManageNiYoy, commissionNiOther, commissionNiOtherYoy, agentSecurityNi, agentSecurityNiYoy, recommendNi, recommendNiYoy, brokerNi, brokerNiYoy, financeAdviserNi, financeAdviserNiYoy, fundSaleNi, fundSaleNiYoy, amortizeReinsureExpense, amortizeReinsureExpenseYoy, uninsuranceCni, uninsuranceCniYoy, bankInterestIncome, bankInterestIncomeYoy, uninsuranceCe, uninsuranceCeYoy, securityUnderwriteNi, securityUnderwriteNiYoy, insuranceIncome, insuranceIncomeYoy, fundManageNi, fundManageNiYoy, netprofitOtherQoq, otherBusinessIncomeQoq, operateProfitQoq, incomeTaxQoq, precombineProfitQoq, totalOperateCostQoq, netprofitBalanceQoq, nonbusinessIncomeQoq, deductParentNetprofitQoq, netCompensateExpenseQoq, creditImpairmentIncomeQoq, assetImpairmentLossQoq, researchExpenseQoq, parentNetprofitQoq, interestIncomeQoq, feeCommissionIncomeQoq, otherCompreIncomeQoq, surrenderValueQoq, otherIncomeQoq, totalProfitQoq, unconfirmInvestLossQoq, effectTpOtherQoq, discontinuedNetprofitQoq, reinsureExpenseQoq, minorityTciQoq, totalOperateIncomeQoq, continuedNetprofitQoq, surrenderValue, financeExpenseQoq, operateTaxAddQoq, saleExpenseQoq, investIncomeQoq, operateProfitOtherQoq, netContractReserveQoq, interestExpenseQoq, basicEpsQoq, creditImpairmentLossQoq, minorityInterestQoq, fairvalueChangeIncomeQoq, nonbusinessExpenseQoq, investJointIncomeQoq, netprofitQoq, manageExpenseQoq, assetImpairmentIncomeQoq, noncurrentDisposalIncomeQoq, noncurrentDisposalLossQoq, toiOtherQoq, feInterestExpenseQoq, dilutedEpsQoq, otherBusinessCostQoq, operateProfitBalanceQoq, policyBonusExpenseQoq, parentOciQoq, operateExpenseQoq, bankInterestNiQoq, extractUnexpireReserveQoq, fundManageNiQoq, assetManageNiQoq, agentSecurityNiQoq, operateIncomeBalanceQoq, operateExpenseBalanceQoq, uninsuranceCniQoq, amortizeCompensateExpenseQoq, reinsureIncomeQoq, businessManageExpenseQoq, operateIncomeOtherQoq, fundSaleNiQoq, brokerNiQoq, bankInterestIncomeQoq, reinsurePremiumQoq, compensateExpenseQoq, financeAdviserNiQoq, feeCommissionNiQoq, recommendNiQoq, operateExpenseOtherQoq, commissionNiOtherQoq, afaFairvalueChangeQoq, amortizeReinsureExpenseQoq, earnedPremiumBalanceQoq, uninsuranceCi, tocOtherQoq, netExposureIncomeQoq, exchangeIncomeQoq, uninsuranceCeQoq, earnedPremiumQoq, operateCostQoq, totalCompreIncomeQoq, securityUnderwriteNiQoq, amortizeInsuranceReserveQoq, assetDisposalIncomeQoq, totalProfitBalanceQoq, insuranceIncomeQoq, fairvalueChangeQoq, interestNiQoq, operateIncomeQoq, feeCommissionExpenseQoq, bankInterestExpenseQoq);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("securityCode", getSecurityCode())
            .append("reportType", getReportType())
            .append("reportDate", getReportDate())
            .append("opinionType", getOpinionType())
            .append("osopinionType", getOsopinionType())
            .append("operateIncome", getOperateIncome())
            .append("operateIncomeYoy", getOperateIncomeYoy())
            .append("interestNi", getInterestNi())
            .append("interestNiYoy", getInterestNiYoy())
            .append("interestIncome", getInterestIncome())
            .append("interestIncomeYoy", getInterestIncomeYoy())
            .append("interestExpense", getInterestExpense())
            .append("interestExpenseYoy", getInterestExpenseYoy())
            .append("feeCommissionNi", getFeeCommissionNi())
            .append("feeCommissionNiYoy", getFeeCommissionNiYoy())
            .append("feeCommissionIncome", getFeeCommissionIncome())
            .append("feeCommissionIncomeYoy", getFeeCommissionIncomeYoy())
            .append("feeCommissionExpense", getFeeCommissionExpense())
            .append("feeCommissionExpenseYoy", getFeeCommissionExpenseYoy())
            .append("investIncome", getInvestIncome())
            .append("investIncomeYoy", getInvestIncomeYoy())
            .append("investJointIncome", getInvestJointIncome())
            .append("investJointIncomeYoy", getInvestJointIncomeYoy())
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
            .append("operateIncomeOther", getOperateIncomeOther())
            .append("operateIncomeOtherYoy", getOperateIncomeOtherYoy())
            .append("operateIncomeBalance", getOperateIncomeBalance())
            .append("operateIncomeBalanceYoy", getOperateIncomeBalanceYoy())
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
            .append("operateExpenseOther", getOperateExpenseOther())
            .append("operateExpenseOtherYoy", getOperateExpenseOtherYoy())
            .append("operateExpenseBalance", getOperateExpenseBalance())
            .append("operateExpenseBalanceYoy", getOperateExpenseBalanceYoy())
            .append("operateProfitOther", getOperateProfitOther())
            .append("operateProfitOtherYoy", getOperateProfitOtherYoy())
            .append("operateProfitBalance", getOperateProfitBalance())
            .append("operateProfitBalanceYoy", getOperateProfitBalanceYoy())
            .append("operateProfit", getOperateProfit())
            .append("operateProfitYoy", getOperateProfitYoy())
            .append("nonbusinessIncome", getNonbusinessIncome())
            .append("nonbusinessIncomeYoy", getNonbusinessIncomeYoy())
            .append("noncurrentDisposalIncome", getNoncurrentDisposalIncome())
            .append("noncurrentDisposalIncomeYoy", getNoncurrentDisposalIncomeYoy())
            .append("nonbusinessExpense", getNonbusinessExpense())
            .append("nonbusinessExpenseYoy", getNonbusinessExpenseYoy())
            .append("noncurrentDisposalLoss", getNoncurrentDisposalLoss())
            .append("noncurrentDisposalLossYoy", getNoncurrentDisposalLossYoy())
            .append("effectTpOther", getEffectTpOther())
            .append("effectTpOtherYoy", getEffectTpOtherYoy())
            .append("totalProfitBalance", getTotalProfitBalance())
            .append("totalProfitBalanceYoy", getTotalProfitBalanceYoy())
            .append("totalProfit", getTotalProfit())
            .append("totalProfitYoy", getTotalProfitYoy())
            .append("incomeTax", getIncomeTax())
            .append("incomeTaxYoy", getIncomeTaxYoy())
            .append("effectNetprofitOther", getEffectNetprofitOther())
            .append("effectNetprofitOtherYoy", getEffectNetprofitOtherYoy())
            .append("effectNetprofitBalance", getEffectNetprofitBalance())
            .append("effectNetprofitBalanceYoy", getEffectNetprofitBalanceYoy())
            .append("netprofit", getNetprofit())
            .append("netprofitYoy", getNetprofitYoy())
            .append("continuedNetprofit", getContinuedNetprofit())
            .append("continuedNetprofitYoy", getContinuedNetprofitYoy())
            .append("discontinuedNetprofit", getDiscontinuedNetprofit())
            .append("discontinuedNetprofitYoy", getDiscontinuedNetprofitYoy())
            .append("parentNetprofit", getParentNetprofit())
            .append("parentNetprofitYoy", getParentNetprofitYoy())
            .append("minorityInterest", getMinorityInterest())
            .append("minorityInterestYoy", getMinorityInterestYoy())
            .append("deductParentNetprofit", getDeductParentNetprofit())
            .append("deductParentNetprofitYoy", getDeductParentNetprofitYoy())
            .append("netprofitOther", getNetprofitOther())
            .append("netprofitOtherYoy", getNetprofitOtherYoy())
            .append("netprofitBalance", getNetprofitBalance())
            .append("netprofitBalanceYoy", getNetprofitBalanceYoy())
            .append("basicEps", getBasicEps())
            .append("basicEpsYoy", getBasicEpsYoy())
            .append("dilutedEps", getDilutedEps())
            .append("dilutedEpsYoy", getDilutedEpsYoy())
            .append("otherCompreIncome", getOtherCompreIncome())
            .append("otherCompreIncomeYoy", getOtherCompreIncomeYoy())
            .append("parentOci", getParentOci())
            .append("parentOciYoy", getParentOciYoy())
            .append("minorityOci", getMinorityOci())
            .append("minorityOciYoy", getMinorityOciYoy())
            .append("netCompensateExpense", getNetCompensateExpense())
            .append("netCompensateExpenseYoy", getNetCompensateExpenseYoy())
            .append("surrenderValueYoy", getSurrenderValueYoy())
            .append("effectNetprofitOtherQoq", getEffectNetprofitOtherQoq())
            .append("toiOther", getToiOther())
            .append("toiOtherYoy", getToiOtherYoy())
            .append("researchExpense", getResearchExpense())
            .append("researchExpenseYoy", getResearchExpenseYoy())
            .append("uninsuranceCiYoy", getUninsuranceCiYoy())
            .append("parentTciQoq", getParentTciQoq())
            .append("netExposureIncome", getNetExposureIncome())
            .append("netExposureIncomeYoy", getNetExposureIncomeYoy())
            .append("minorityOciQoq", getMinorityOciQoq())
            .append("feInterestIncomeQoq", getFeInterestIncomeQoq())
            .append("tocOther", getTocOther())
            .append("tocOtherYoy", getTocOtherYoy())
            .append("netContractReserve", getNetContractReserve())
            .append("netContractReserveYoy", getNetContractReserveYoy())
            .append("manageExpense", getManageExpense())
            .append("manageExpenseYoy", getManageExpenseYoy())
            .append("operateCost", getOperateCost())
            .append("operateCostYoy", getOperateCostYoy())
            .append("totalOperateCost", getTotalOperateCost())
            .append("totalOperateCostYoy", getTotalOperateCostYoy())
            .append("feInterestExpense", getFeInterestExpense())
            .append("feInterestExpenseYoy", getFeInterestExpenseYoy())
            .append("unconfirmInvestLoss", getUnconfirmInvestLoss())
            .append("unconfirmInvestLossYoy", getUnconfirmInvestLossYoy())
            .append("precombineProfit", getPrecombineProfit())
            .append("precombineProfitYoy", getPrecombineProfitYoy())
            .append("assetImpairmentIncome", getAssetImpairmentIncome())
            .append("assetImpairmentIncomeYoy", getAssetImpairmentIncomeYoy())
            .append("financeExpense", getFinanceExpense())
            .append("financeExpenseYoy", getFinanceExpenseYoy())
            .append("reinsureExpense", getReinsureExpense())
            .append("reinsureExpenseYoy", getReinsureExpenseYoy())
            .append("totalOperateIncome", getTotalOperateIncome())
            .append("totalOperateIncomeYoy", getTotalOperateIncomeYoy())
            .append("creditImpairmentIncome", getCreditImpairmentIncome())
            .append("creditImpairmentIncomeYoy", getCreditImpairmentIncomeYoy())
            .append("policyBonusExpense", getPolicyBonusExpense())
            .append("policyBonusExpenseYoy", getPolicyBonusExpenseYoy())
            .append("feInterestIncome", getFeInterestIncome())
            .append("feInterestIncomeYoy", getFeInterestIncomeYoy())
            .append("earnedPremium", getEarnedPremium())
            .append("earnedPremiumYoy", getEarnedPremiumYoy())
            .append("saleExpense", getSaleExpense())
            .append("saleExpenseYoy", getSaleExpenseYoy())
            .append("afaFairvalueChange", getAfaFairvalueChange())
            .append("afaFairvalueChangeYoy", getAfaFairvalueChangeYoy())
            .append("convertDiff", getConvertDiff())
            .append("convertDiffYoy", getConvertDiffYoy())
            .append("totalCompreIncome", getTotalCompreIncome())
            .append("totalCompreIncomeYoy", getTotalCompreIncomeYoy())
            .append("parentTci", getParentTci())
            .append("parentTciYoy", getParentTciYoy())
            .append("minorityTci", getMinorityTci())
            .append("minorityTciYoy", getMinorityTciYoy())
            .append("reinsurePremium", getReinsurePremium())
            .append("reinsurePremiumYoy", getReinsurePremiumYoy())
            .append("bankInterestNi", getBankInterestNi())
            .append("bankInterestNiYoy", getBankInterestNiYoy())
            .append("compensateExpense", getCompensateExpense())
            .append("compensateExpenseYoy", getCompensateExpenseYoy())
            .append("reinsureIncome", getReinsureIncome())
            .append("reinsureIncomeYoy", getReinsureIncomeYoy())
            .append("amortizeInsuranceReserve", getAmortizeInsuranceReserve())
            .append("amortizeInsuranceReserveYoy", getAmortizeInsuranceReserveYoy())
            .append("effectNetprofitBalanceQoq", getEffectNetprofitBalanceQoq())
            .append("uninsuranceCiQoq", getUninsuranceCiQoq())
            .append("extractInsuranceReserveQoq", getExtractInsuranceReserveQoq())
            .append("extractUnexpireReserve", getExtractUnexpireReserve())
            .append("extractUnexpireReserveYoy", getExtractUnexpireReserveYoy())
            .append("earnedPremiumBalance", getEarnedPremiumBalance())
            .append("earnedPremiumBalanceYoy", getEarnedPremiumBalanceYoy())
            .append("bankInterestExpense", getBankInterestExpense())
            .append("bankInterestExpenseYoy", getBankInterestExpenseYoy())
            .append("fairvalueChange", getFairvalueChange())
            .append("fairvalueChangeYoy", getFairvalueChangeYoy())
            .append("amortizeCompensateExpense", getAmortizeCompensateExpense())
            .append("amortizeCompensateExpenseYoy", getAmortizeCompensateExpenseYoy())
            .append("extractInsuranceReserve", getExtractInsuranceReserve())
            .append("extractInsuranceReserveYoy", getExtractInsuranceReserveYoy())
            .append("assetManageNi", getAssetManageNi())
            .append("assetManageNiYoy", getAssetManageNiYoy())
            .append("commissionNiOther", getCommissionNiOther())
            .append("commissionNiOtherYoy", getCommissionNiOtherYoy())
            .append("agentSecurityNi", getAgentSecurityNi())
            .append("agentSecurityNiYoy", getAgentSecurityNiYoy())
            .append("recommendNi", getRecommendNi())
            .append("recommendNiYoy", getRecommendNiYoy())
            .append("brokerNi", getBrokerNi())
            .append("brokerNiYoy", getBrokerNiYoy())
            .append("financeAdviserNi", getFinanceAdviserNi())
            .append("financeAdviserNiYoy", getFinanceAdviserNiYoy())
            .append("fundSaleNi", getFundSaleNi())
            .append("fundSaleNiYoy", getFundSaleNiYoy())
            .append("amortizeReinsureExpense", getAmortizeReinsureExpense())
            .append("amortizeReinsureExpenseYoy", getAmortizeReinsureExpenseYoy())
            .append("uninsuranceCni", getUninsuranceCni())
            .append("uninsuranceCniYoy", getUninsuranceCniYoy())
            .append("bankInterestIncome", getBankInterestIncome())
            .append("bankInterestIncomeYoy", getBankInterestIncomeYoy())
            .append("uninsuranceCe", getUninsuranceCe())
            .append("uninsuranceCeYoy", getUninsuranceCeYoy())
            .append("securityUnderwriteNi", getSecurityUnderwriteNi())
            .append("securityUnderwriteNiYoy", getSecurityUnderwriteNiYoy())
            .append("insuranceIncome", getInsuranceIncome())
            .append("insuranceIncomeYoy", getInsuranceIncomeYoy())
            .append("fundManageNi", getFundManageNi())
            .append("fundManageNiYoy", getFundManageNiYoy())
            .append("netprofitOtherQoq", getNetprofitOtherQoq())
            .append("otherBusinessIncomeQoq", getOtherBusinessIncomeQoq())
            .append("operateProfitQoq", getOperateProfitQoq())
            .append("incomeTaxQoq", getIncomeTaxQoq())
            .append("precombineProfitQoq", getPrecombineProfitQoq())
            .append("totalOperateCostQoq", getTotalOperateCostQoq())
            .append("netprofitBalanceQoq", getNetprofitBalanceQoq())
            .append("nonbusinessIncomeQoq", getNonbusinessIncomeQoq())
            .append("deductParentNetprofitQoq", getDeductParentNetprofitQoq())
            .append("netCompensateExpenseQoq", getNetCompensateExpenseQoq())
            .append("creditImpairmentIncomeQoq", getCreditImpairmentIncomeQoq())
            .append("assetImpairmentLossQoq", getAssetImpairmentLossQoq())
            .append("researchExpenseQoq", getResearchExpenseQoq())
            .append("parentNetprofitQoq", getParentNetprofitQoq())
            .append("interestIncomeQoq", getInterestIncomeQoq())
            .append("feeCommissionIncomeQoq", getFeeCommissionIncomeQoq())
            .append("otherCompreIncomeQoq", getOtherCompreIncomeQoq())
            .append("surrenderValueQoq", getSurrenderValueQoq())
            .append("otherIncomeQoq", getOtherIncomeQoq())
            .append("totalProfitQoq", getTotalProfitQoq())
            .append("unconfirmInvestLossQoq", getUnconfirmInvestLossQoq())
            .append("effectTpOtherQoq", getEffectTpOtherQoq())
            .append("discontinuedNetprofitQoq", getDiscontinuedNetprofitQoq())
            .append("reinsureExpenseQoq", getReinsureExpenseQoq())
            .append("minorityTciQoq", getMinorityTciQoq())
            .append("totalOperateIncomeQoq", getTotalOperateIncomeQoq())
            .append("continuedNetprofitQoq", getContinuedNetprofitQoq())
            .append("surrenderValue", getSurrenderValue())
            .append("financeExpenseQoq", getFinanceExpenseQoq())
            .append("operateTaxAddQoq", getOperateTaxAddQoq())
            .append("saleExpenseQoq", getSaleExpenseQoq())
            .append("investIncomeQoq", getInvestIncomeQoq())
            .append("operateProfitOtherQoq", getOperateProfitOtherQoq())
            .append("netContractReserveQoq", getNetContractReserveQoq())
            .append("interestExpenseQoq", getInterestExpenseQoq())
            .append("basicEpsQoq", getBasicEpsQoq())
            .append("creditImpairmentLossQoq", getCreditImpairmentLossQoq())
            .append("minorityInterestQoq", getMinorityInterestQoq())
            .append("fairvalueChangeIncomeQoq", getFairvalueChangeIncomeQoq())
            .append("nonbusinessExpenseQoq", getNonbusinessExpenseQoq())
            .append("investJointIncomeQoq", getInvestJointIncomeQoq())
            .append("netprofitQoq", getNetprofitQoq())
            .append("manageExpenseQoq", getManageExpenseQoq())
            .append("assetImpairmentIncomeQoq", getAssetImpairmentIncomeQoq())
            .append("noncurrentDisposalIncomeQoq", getNoncurrentDisposalIncomeQoq())
            .append("noncurrentDisposalLossQoq", getNoncurrentDisposalLossQoq())
            .append("toiOtherQoq", getToiOtherQoq())
            .append("feInterestExpenseQoq", getFeInterestExpenseQoq())
            .append("dilutedEpsQoq", getDilutedEpsQoq())
            .append("otherBusinessCostQoq", getOtherBusinessCostQoq())
            .append("operateProfitBalanceQoq", getOperateProfitBalanceQoq())
            .append("policyBonusExpenseQoq", getPolicyBonusExpenseQoq())
            .append("parentOciQoq", getParentOciQoq())
            .append("operateExpenseQoq", getOperateExpenseQoq())
            .append("bankInterestNiQoq", getBankInterestNiQoq())
            .append("extractUnexpireReserveQoq", getExtractUnexpireReserveQoq())
            .append("fundManageNiQoq", getFundManageNiQoq())
            .append("assetManageNiQoq", getAssetManageNiQoq())
            .append("agentSecurityNiQoq", getAgentSecurityNiQoq())
            .append("operateIncomeBalanceQoq", getOperateIncomeBalanceQoq())
            .append("operateExpenseBalanceQoq", getOperateExpenseBalanceQoq())
            .append("uninsuranceCniQoq", getUninsuranceCniQoq())
            .append("amortizeCompensateExpenseQoq", getAmortizeCompensateExpenseQoq())
            .append("reinsureIncomeQoq", getReinsureIncomeQoq())
            .append("businessManageExpenseQoq", getBusinessManageExpenseQoq())
            .append("operateIncomeOtherQoq", getOperateIncomeOtherQoq())
            .append("fundSaleNiQoq", getFundSaleNiQoq())
            .append("brokerNiQoq", getBrokerNiQoq())
            .append("bankInterestIncomeQoq", getBankInterestIncomeQoq())
            .append("reinsurePremiumQoq", getReinsurePremiumQoq())
            .append("compensateExpenseQoq", getCompensateExpenseQoq())
            .append("financeAdviserNiQoq", getFinanceAdviserNiQoq())
            .append("feeCommissionNiQoq", getFeeCommissionNiQoq())
            .append("recommendNiQoq", getRecommendNiQoq())
            .append("operateExpenseOtherQoq", getOperateExpenseOtherQoq())
            .append("commissionNiOtherQoq", getCommissionNiOtherQoq())
            .append("afaFairvalueChangeQoq", getAfaFairvalueChangeQoq())
            .append("amortizeReinsureExpenseQoq", getAmortizeReinsureExpenseQoq())
            .append("earnedPremiumBalanceQoq", getEarnedPremiumBalanceQoq())
            .append("uninsuranceCi", getUninsuranceCi())
            .append("tocOtherQoq", getTocOtherQoq())
            .append("netExposureIncomeQoq", getNetExposureIncomeQoq())
            .append("exchangeIncomeQoq", getExchangeIncomeQoq())
            .append("uninsuranceCeQoq", getUninsuranceCeQoq())
            .append("earnedPremiumQoq", getEarnedPremiumQoq())
            .append("operateCostQoq", getOperateCostQoq())
            .append("totalCompreIncomeQoq", getTotalCompreIncomeQoq())
            .append("securityUnderwriteNiQoq", getSecurityUnderwriteNiQoq())
            .append("amortizeInsuranceReserveQoq", getAmortizeInsuranceReserveQoq())
            .append("assetDisposalIncomeQoq", getAssetDisposalIncomeQoq())
            .append("totalProfitBalanceQoq", getTotalProfitBalanceQoq())
            .append("insuranceIncomeQoq", getInsuranceIncomeQoq())
            .append("fairvalueChangeQoq", getFairvalueChangeQoq())
            .append("interestNiQoq", getInterestNiQoq())
            .append("operateIncomeQoq", getOperateIncomeQoq())
            .append("feeCommissionExpenseQoq", getFeeCommissionExpenseQoq())
            .append("bankInterestExpenseQoq", getBankInterestExpenseQoq())
            .toString();
    }
}
