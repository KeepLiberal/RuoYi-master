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
 * @date 2023-01-19
 */
public class InvFinanceLr extends BaseEntity{
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

    /** 审计意见(境内) */
    @Excel(name = "审计意见(境内)")
    private String opinionType;

    /** 审计意见(境外) */
    @Excel(name = "审计意见(境外)")
    private String osopinionType;

    /** 营业收入 */
    @Excel(name = "营业收入")
    private Double operateIncome;

    /** 营业收入(同比%) */
    @Excel(name = "营业收入(同比%)")
    private Double operateIncomeYoy;

    /** 营业收入(单季度环比%) */
    @Excel(name = "营业收入(单季度环比%)")
    private Double operateIncomeQoq;

    /** 手续费及佣金净收入 */
    @Excel(name = "手续费及佣金净收入")
    private Double feeCommissionNi;

    /** 手续费及佣金净收入(同比%) */
    @Excel(name = "手续费及佣金净收入(同比%)")
    private Double feeCommissionNiYoy;

    /** 手续费及佣金净收入(单季度环比%) */
    @Excel(name = "手续费及佣金净收入(单季度环比%)")
    private Double feeCommissionNiQoq;

    /** 代理买卖证券业务净收入 */
    @Excel(name = "代理买卖证券业务净收入")
    private Double agentSecurityNi;

    /** 代理买卖证券业务净收入(同比%) */
    @Excel(name = "代理买卖证券业务净收入(同比%)")
    private Double agentSecurityNiYoy;

    /** 代理买卖证券业务净收入(单季度环比%) */
    @Excel(name = "代理买卖证券业务净收入(单季度环比%)")
    private Double agentSecurityNiQoq;

    /** 证券承销业务净收入 */
    @Excel(name = "证券承销业务净收入")
    private Double securityUnderwriteNi;

    /** 证券承销业务净收入(同比%) */
    @Excel(name = "证券承销业务净收入(同比%)")
    private Double securityUnderwriteNiYoy;

    /** 证券承销业务净收入(单季度环比%) */
    @Excel(name = "证券承销业务净收入(单季度环比%)")
    private Double securityUnderwriteNiQoq;

    /** 受托客户资产管理业务净收入 */
    @Excel(name = "受托客户资产管理业务净收入")
    private Double assetManageNi;

    /** 受托客户资产管理业务净收入(同比%) */
    @Excel(name = "受托客户资产管理业务净收入(同比%)")
    private Double assetManageNiYoy;

    /** 受托客户资产管理业务净收入(单季度环比%) */
    @Excel(name = "受托客户资产管理业务净收入(单季度环比%)")
    private Double assetManageNiQoq;

    /** 财务顾问净收入 */
    @Excel(name = "财务顾问净收入")
    private Double financeAdviserNi;

    /** 财务顾问净收入(同比%) */
    @Excel(name = "财务顾问净收入(同比%)")
    private Double financeAdviserNiYoy;

    /** 财务顾问净收入(单季度环比%) */
    @Excel(name = "财务顾问净收入(单季度环比%)")
    private Double financeAdviserNiQoq;

    /** 保荐业务净收入 */
    @Excel(name = "保荐业务净收入")
    private Double recommendNi;

    /** 保荐业务净收入(同比%) */
    @Excel(name = "保荐业务净收入(同比%)")
    private Double recommendNiYoy;

    /** 保荐业务净收入(单季度环比%) */
    @Excel(name = "保荐业务净收入(单季度环比%)")
    private Double recommendNiQoq;

    /** 基金管理业务净收入 */
    @Excel(name = "基金管理业务净收入")
    private Double fundManageNi;

    /** 基金管理业务净收入(同比%) */
    @Excel(name = "基金管理业务净收入(同比%)")
    private Double fundManageNiYoy;

    /** 基金管理业务净收入(单季度环比%) */
    @Excel(name = "基金管理业务净收入(单季度环比%)")
    private Double fundManageNiQoq;

    /** 基金销售业务净收入 */
    @Excel(name = "基金销售业务净收入")
    private Double fundSaleNi;

    /** 基金销售业务净收入(同比%) */
    @Excel(name = "基金销售业务净收入(同比%)")
    private Double fundSaleNiYoy;

    /** 基金销售业务净收入(单季度环比%) */
    @Excel(name = "基金销售业务净收入(单季度环比%)")
    private Double fundSaleNiQoq;

    /** 证券经纪业务净收入 */
    @Excel(name = "证券经纪业务净收入")
    private Double brokerNi;

    /** 证券经纪业务净收入(同比%) */
    @Excel(name = "证券经纪业务净收入(同比%)")
    private Double brokerNiYoy;

    /** 证券经纪业务净收入(单季度环比%) */
    @Excel(name = "证券经纪业务净收入(单季度环比%)")
    private Double brokerNiQoq;

    /** 证券经纪业务净收入-手续费及佣金净收入其他项目 */
    @Excel(name = "证券经纪业务净收入-手续费及佣金净收入其他项目")
    private Double commissionNiOther;

    /** 证券经纪业务净收入-手续费及佣金净收入其他项目(同比%) */
    @Excel(name = "证券经纪业务净收入-手续费及佣金净收入其他项目(同比%)")
    private Double commissionNiOtherYoy;

    /** 证券经纪业务净收入-手续费及佣金净收入其他项目(单季度环比%) */
    @Excel(name = "证券经纪业务净收入-手续费及佣金净收入其他项目(单季度环比%)")
    private Double commissionNiOtherQoq;

    /** 利息净收入 */
    @Excel(name = "利息净收入")
    private Double interestNi;

    /** 利息净收入(同比%) */
    @Excel(name = "利息净收入(同比%)")
    private Double interestNiYoy;

    /** 利息净收入(单季度环比%) */
    @Excel(name = "利息净收入(单季度环比%)")
    private Double interestNiQoq;

    /** 投资收益 */
    @Excel(name = "投资收益")
    private Double investIncome;

    /** 投资收益(同比%) */
    @Excel(name = "投资收益(同比%)")
    private Double investIncomeYoy;

    /** 投资收益(单季度环比%) */
    @Excel(name = "投资收益(单季度环比%)")
    private Double investIncomeQoq;

    /** 其中:对联营企业和合营企业的投资收益 */
    @Excel(name = "其中:对联营企业和合营企业的投资收益")
    private Double investJointIncome;

    /** 其中:对联营企业和合营企业的投资收益(同比%) */
    @Excel(name = "其中:对联营企业和合营企业的投资收益(同比%)")
    private Double investJointIncomeYoy;

    /** 其中:对联营企业和合营企业的投资收益(单季度环比%) */
    @Excel(name = "其中:对联营企业和合营企业的投资收益(单季度环比%)")
    private Double investJointIncomeQoq;

    /** 公允价值变动收益 */
    @Excel(name = "公允价值变动收益")
    private Double fairvalueChangeIncome;

    /** 公允价值变动收益(同比%) */
    @Excel(name = "公允价值变动收益(同比%)")
    private Double fairvalueChangeIncomeYoy;

    /** 公允价值变动收益(单季度环比%) */
    @Excel(name = "公允价值变动收益(单季度环比%)")
    private Double fairvalueChangeIncomeQoq;

    /** 汇兑收益 */
    @Excel(name = "汇兑收益")
    private Double exchangeIncome;

    /** 汇兑收益(同比%) */
    @Excel(name = "汇兑收益(同比%)")
    private Double exchangeIncomeYoy;

    /** 汇兑收益(单季度环比%) */
    @Excel(name = "汇兑收益(单季度环比%)")
    private Double exchangeIncomeQoq;

    /** 其他业务收入 */
    @Excel(name = "其他业务收入")
    private Double otherBusinessIncome;

    /** 其他业务收入(同比%) */
    @Excel(name = "其他业务收入(同比%)")
    private Double otherBusinessIncomeYoy;

    /** 其他业务收入(单季度环比%) */
    @Excel(name = "其他业务收入(单季度环比%)")
    private Double otherBusinessIncomeQoq;

    /** 资产处置收益 */
    @Excel(name = "资产处置收益")
    private Double assetDisposalIncome;

    /** 资产处置收益(同比%) */
    @Excel(name = "资产处置收益(同比%)")
    private Double assetDisposalIncomeYoy;

    /** 资产处置收益(单季度环比%) */
    @Excel(name = "资产处置收益(单季度环比%)")
    private Double assetDisposalIncomeQoq;

    /** 其他收益 */
    @Excel(name = "其他收益")
    private Double otherIncome;

    /** 其他收益(同比%) */
    @Excel(name = "其他收益(同比%)")
    private Double otherIncomeYoy;

    /** 其他收益(单季度环比%) */
    @Excel(name = "其他收益(单季度环比%)")
    private Double otherIncomeQoq;

    /** 营业收入其他项目 */
    @Excel(name = "营业收入其他项目")
    private Double operateIncomeOther;

    /** 营业收入其他项目(同比%) */
    @Excel(name = "营业收入其他项目(同比%)")
    private Double operateIncomeOtherYoy;

    /** 营业收入其他项目(单季度环比%) */
    @Excel(name = "营业收入其他项目(单季度环比%)")
    private Double operateIncomeOtherQoq;

    /** 营业收入平衡项目 */
    @Excel(name = "营业收入平衡项目")
    private Double operateIncomeBalance;

    /** 营业收入平衡项目(同比%) */
    @Excel(name = "营业收入平衡项目(同比%)")
    private Double operateIncomeBalanceYoy;

    /** 营业收入平衡项目(单季度环比%) */
    @Excel(name = "营业收入平衡项目(单季度环比%)")
    private Double operateIncomeBalanceQoq;

    /** 营业支出 */
    @Excel(name = "营业支出")
    private Double operateExpense;

    /** 营业支出(同比%) */
    @Excel(name = "营业支出(同比%)")
    private Double operateExpenseYoy;

    /** 营业支出(单季度环比%) */
    @Excel(name = "营业支出(单季度环比%)")
    private Double operateExpenseQoq;

    /** 税金及附加 */
    @Excel(name = "税金及附加")
    private Double operateTaxAdd;

    /** 税金及附加(同比%) */
    @Excel(name = "税金及附加(同比%)")
    private Double operateTaxAddYoy;

    /** 税金及附加(单季度环比%) */
    @Excel(name = "税金及附加(单季度环比%)")
    private Double operateTaxAddQoq;

    /** 业务及管理费 */
    @Excel(name = "业务及管理费")
    private Double businessManageExpense;

    /** 业务及管理费(同比%) */
    @Excel(name = "业务及管理费(同比%)")
    private Double businessManageExpenseYoy;

    /** 业务及管理费(单季度环比%) */
    @Excel(name = "业务及管理费(单季度环比%)")
    private Double businessManageExpenseQoq;

    /** 资产减值损失 */
    @Excel(name = "资产减值损失")
    private Double assetImpairmentLoss;

    /** 资产减值损失(同比%) */
    @Excel(name = "资产减值损失(同比%)")
    private Double assetImpairmentLossYoy;

    /** 资产减值损失(单季度环比%) */
    @Excel(name = "资产减值损失(单季度环比%)")
    private Double assetImpairmentLossQoq;

    /** 信用减值损失 */
    @Excel(name = "信用减值损失")
    private Double creditImpairmentLoss;

    /** 信用减值损失(同比%) */
    @Excel(name = "信用减值损失(同比%)")
    private Double creditImpairmentLossYoy;

    /** 信用减值损失(单季度环比%) */
    @Excel(name = "信用减值损失(单季度环比%)")
    private Double creditImpairmentLossQoq;

    /** 其他业务成本 */
    @Excel(name = "其他业务成本")
    private Double otherBusinessCost;

    /** 其他业务成本(同比%) */
    @Excel(name = "其他业务成本(同比%)")
    private Double otherBusinessCostYoy;

    /** 其他业务成本(单季度环比%) */
    @Excel(name = "其他业务成本(单季度环比%)")
    private Double otherBusinessCostQoq;

    /** 营业支出其他项目 */
    @Excel(name = "营业支出其他项目")
    private Double operateExpenseOther;

    /** 营业支出其他项目(同比%) */
    @Excel(name = "营业支出其他项目(同比%)")
    private Double operateExpenseOtherYoy;

    /** 营业支出其他项目(单季度环比%) */
    @Excel(name = "营业支出其他项目(单季度环比%)")
    private Double operateExpenseOtherQoq;

    /** 营业支出平衡项目 */
    @Excel(name = "营业支出平衡项目")
    private Double operateExpenseBalance;

    /** 营业支出平衡项目(同比%) */
    @Excel(name = "营业支出平衡项目(同比%)")
    private Double operateExpenseBalanceYoy;

    /** 营业支出平衡项目(单季度环比%) */
    @Excel(name = "营业支出平衡项目(单季度环比%)")
    private Double operateExpenseBalanceQoq;

    /** 营业利润其他项目 */
    @Excel(name = "营业利润其他项目")
    private Double operateProfitOther;

    /** 营业利润其他项目(同比%) */
    @Excel(name = "营业利润其他项目(同比%)")
    private Double operateProfitOtherYoy;

    /** 营业利润其他项目(单季度环比%) */
    @Excel(name = "营业利润其他项目(单季度环比%)")
    private Double operateProfitOtherQoq;

    /** 营业利润平衡项目 */
    @Excel(name = "营业利润平衡项目")
    private Double operateProfitBalance;

    /** 营业利润平衡项目(同比%) */
    @Excel(name = "营业利润平衡项目(同比%)")
    private Double operateProfitBalanceYoy;

    /** 营业利润平衡项目(单季度环比%) */
    @Excel(name = "营业利润平衡项目(单季度环比%)")
    private Double operateProfitBalanceQoq;

    /** 营业利润 */
    @Excel(name = "营业利润")
    private Double operateProfit;

    /** 营业利润(同比%) */
    @Excel(name = "营业利润(同比%)")
    private Double operateProfitYoy;

    /** 营业利润(单季度环比%) */
    @Excel(name = "营业利润(单季度环比%)")
    private Double operateProfitQoq;

    /** 加:营业外收入 */
    @Excel(name = "加:营业外收入")
    private Double nonbusinessIncome;

    /** 加:营业外收入(同比%) */
    @Excel(name = "加:营业外收入(同比%)")
    private Double nonbusinessIncomeYoy;

    /** 加:营业外收入(单季度环比%) */
    @Excel(name = "加:营业外收入(单季度环比%)")
    private Double nonbusinessIncomeQoq;

    /** 其中:非流动资产处置利得 */
    @Excel(name = "其中:非流动资产处置利得")
    private Double noncurrentDisposalIncome;

    /** 其中:非流动资产处置利得(同比%) */
    @Excel(name = "其中:非流动资产处置利得(同比%)")
    private Double noncurrentDisposalIncomeYoy;

    /** 其中:非流动资产处置利得(单季度环比%) */
    @Excel(name = "其中:非流动资产处置利得(单季度环比%)")
    private Double noncurrentDisposalIncomeQoq;

    /** 减:营业外支出 */
    @Excel(name = "减:营业外支出")
    private Double nonbusinessExpense;

    /** 减:营业外支出(同比%) */
    @Excel(name = "减:营业外支出(同比%)")
    private Double nonbusinessExpenseYoy;

    /** 减:营业外支出(单季度环比%) */
    @Excel(name = "减:营业外支出(单季度环比%)")
    private Double nonbusinessExpenseQoq;

    /** 其中:非流动资产处置净损失 */
    @Excel(name = "其中:非流动资产处置净损失")
    private Double noncurrentDisposalLoss;

    /** 其中:非流动资产处置净损失(同比%) */
    @Excel(name = "其中:非流动资产处置净损失(同比%)")
    private Double noncurrentDisposalLossYoy;

    /** 其中:非流动资产处置净损失(单季度环比%) */
    @Excel(name = "其中:非流动资产处置净损失(单季度环比%)")
    private Double noncurrentDisposalLossQoq;

    /** 加:影响利润总额的其他项目 */
    @Excel(name = "加:影响利润总额的其他项目")
    private Double effectTpOther;

    /** 加:影响利润总额的其他项目(同比%) */
    @Excel(name = "加:影响利润总额的其他项目(同比%)")
    private Double effectTpOtherYoy;

    /** 加:影响利润总额的其他项目(单季度环比%) */
    @Excel(name = "加:影响利润总额的其他项目(单季度环比%)")
    private Double effectTpOtherQoq;

    /** 利润总额平衡项目 */
    @Excel(name = "利润总额平衡项目")
    private Double totalProfitBalance;

    /** 利润总额平衡项目(同比%) */
    @Excel(name = "利润总额平衡项目(同比%)")
    private Double totalProfitBalanceYoy;

    /** 利润总额平衡项目(单季度环比%) */
    @Excel(name = "利润总额平衡项目(单季度环比%)")
    private Double totalProfitBalanceQoq;

    /** 利润总额 */
    @Excel(name = "利润总额")
    private Double totalProfit;

    /** 利润总额(同比%) */
    @Excel(name = "利润总额(同比%)")
    private Double totalProfitYoy;

    /** 利润总额(单季度环比%) */
    @Excel(name = "利润总额(单季度环比%)")
    private Double totalProfitQoq;

    /** 减:所得税 */
    @Excel(name = "减:所得税")
    private Double incomeTax;

    /** 减:所得税(同比%) */
    @Excel(name = "减:所得税(同比%)")
    private Double incomeTaxYoy;

    /** 减:所得税(单季度环比%) */
    @Excel(name = "减:所得税(单季度环比%)")
    private Double incomeTaxQoq;

    /** 净利润 */
    @Excel(name = "净利润")
    private Double netprofit;

    /** 净利润(同比%) */
    @Excel(name = "净利润(同比%)")
    private Double netprofitYoy;

    /** 净利润(单季度环比%) */
    @Excel(name = "净利润(单季度环比%)")
    private Double netprofitQoq;

    /** 持续经营净利润 */
    @Excel(name = "持续经营净利润")
    private Double continuedNetprofit;

    /** 持续经营净利润(同比%) */
    @Excel(name = "持续经营净利润(同比%)")
    private Double continuedNetprofitYoy;

    /** 持续经营净利润(单季度环比%) */
    @Excel(name = "持续经营净利润(单季度环比%)")
    private Double continuedNetprofitQoq;

    /** 终止经营净利润 */
    @Excel(name = "终止经营净利润")
    private Double discontinuedNetprofit;

    /** 终止经营净利润(同比%) */
    @Excel(name = "终止经营净利润(同比%)")
    private Double discontinuedNetprofitYoy;

    /** 终止经营净利润(单季度环比%) */
    @Excel(name = "终止经营净利润(单季度环比%)")
    private Double discontinuedNetprofitQoq;

    /** 归属于母公司股东的净利润 */
    @Excel(name = "归属于母公司股东的净利润")
    private Double parentNetprofit;

    /** 归属于母公司股东的净利润(同比%) */
    @Excel(name = "归属于母公司股东的净利润(同比%)")
    private Double parentNetprofitYoy;

    /** 归属于母公司股东的净利润(单季度环比%) */
    @Excel(name = "归属于母公司股东的净利润(单季度环比%)")
    private Double parentNetprofitQoq;

    /** 少数股东损益 */
    @Excel(name = "少数股东损益")
    private Double minorityInterest;

    /** 少数股东损益(同比%) */
    @Excel(name = "少数股东损益(同比%)")
    private Double minorityInterestYoy;

    /** 少数股东损益(单季度环比%) */
    @Excel(name = "少数股东损益(单季度环比%)")
    private Double minorityInterestQoq;

    /** 扣除非经常性损益后的净利润 */
    @Excel(name = "扣除非经常性损益后的净利润")
    private Double deductParentNetprofit;

    /** 扣除非经常性损益后的净利润(同比%) */
    @Excel(name = "扣除非经常性损益后的净利润(同比%)")
    private Double deductParentNetprofitYoy;

    /** 扣除非经常性损益后的净利润(单季度环比%) */
    @Excel(name = "扣除非经常性损益后的净利润(单季度环比%)")
    private Double deductParentNetprofitQoq;

    /** 净利润其他项目 */
    @Excel(name = "净利润其他项目")
    private Double netprofitOther;

    /** 净利润其他项目(同比%) */
    @Excel(name = "净利润其他项目(同比%)")
    private Double netprofitOtherYoy;

    /** 净利润其他项目(单季度环比%) */
    @Excel(name = "净利润其他项目(单季度环比%)")
    private Double netprofitOtherQoq;

    /** 净利润差额(合计平衡项目) */
    @Excel(name = "净利润差额(合计平衡项目)")
    private Double netprofitBalance;

    /** 净利润差额(合计平衡项目)(同比%) */
    @Excel(name = "净利润差额(合计平衡项目)(同比%)")
    private Double netprofitBalanceYoy;

    /** 净利润差额(合计平衡项目)(单季度环比%) */
    @Excel(name = "净利润差额(合计平衡项目)(单季度环比%)")
    private Double netprofitBalanceQoq;

    /** 基本每股收益 */
    @Excel(name = "基本每股收益")
    private Double basicEps;

    /** 稀释每股收益 */
    @Excel(name = "稀释每股收益")
    private Double dilutedEps;

    /** 其他综合收益 */
    @Excel(name = "其他综合收益")
    private Double otherCompreIncome;

    /** 其他综合收益(同比%) */
    @Excel(name = "其他综合收益(同比%)")
    private Double otherCompreIncomeYoy;

    /** 其他综合收益(单季度环比%) */
    @Excel(name = "其他综合收益(单季度环比%)")
    private Double otherCompreIncomeQoq;

    /** 归属于母公司股东的其他综合收益 */
    @Excel(name = "归属于母公司股东的其他综合收益")
    private Double parentOci;

    /** 归属于母公司股东的其他综合收益(同比%) */
    @Excel(name = "归属于母公司股东的其他综合收益(同比%)")
    private Double parentOciYoy;

    /** 归属于母公司股东的其他综合收益(单季度环比%) */
    @Excel(name = "归属于母公司股东的其他综合收益(单季度环比%)")
    private Double parentOciQoq;

    /** 归属于少数股东的其他综合收益 */
    @Excel(name = "归属于少数股东的其他综合收益")
    private Double minorityOci;

    /** 归属于少数股东的其他综合收益(同比%) */
    @Excel(name = "归属于少数股东的其他综合收益(同比%)")
    private Double minorityOciYoy;

    /** 归属于少数股东的其他综合收益(单季度环比%) */
    @Excel(name = "归属于少数股东的其他综合收益(单季度环比%)")
    private Double minorityOciQoq;

    /** 综合收益总额 */
    @Excel(name = "综合收益总额")
    private Double totalCompreIncome;

    /** 综合收益总额(同比%) */
    @Excel(name = "综合收益总额(同比%)")
    private Double totalCompreIncomeYoy;

    /** 综合收益总额(单季度环比%) */
    @Excel(name = "综合收益总额(单季度环比%)")
    private Double totalCompreIncomeQoq;

    /** 归属于母公司股东的综合收益总额 */
    @Excel(name = "归属于母公司股东的综合收益总额")
    private Double parentTci;

    /** 归属于母公司股东的综合收益总额(同比%) */
    @Excel(name = "归属于母公司股东的综合收益总额(同比%)")
    private Double parentTciYoy;

    /** 归属于母公司股东的综合收益总额(单季度环比%) */
    @Excel(name = "归属于母公司股东的综合收益总额(单季度环比%)")
    private Double parentTciQoq;

    /** 归属于少数股东的综合收益总额 */
    @Excel(name = "归属于少数股东的综合收益总额")
    private Double minorityTci;

    /** 归属于少数股东的综合收益总额(同比%) */
    @Excel(name = "归属于少数股东的综合收益总额(同比%)")
    private Double minorityTciYoy;

    /** 归属于少数股东的综合收益总额(单季度环比%) */
    @Excel(name = "归属于少数股东的综合收益总额(单季度环比%)")
    private Double minorityTciQoq;

    /** 营业总收入 */
    @Excel(name = "营业总收入")
    private Double totalOperateIncome;

    /** 营业总收入(同比%) */
    @Excel(name = "营业总收入(同比%)")
    private Double totalOperateIncomeYoy;

    /** 营业总收入(单季度环比%) */
    @Excel(name = "营业总收入(单季度环比%)")
    private Double totalOperateIncomeQoq;

    /** 利息收入 */
    @Excel(name = "利息收入")
    private Double interestIncome;

    /** 利息收入(同比%) */
    @Excel(name = "利息收入(同比%)")
    private Double interestIncomeYoy;

    /** 利息收入(单季度环比%) */
    @Excel(name = "利息收入(单季度环比%)")
    private Double interestIncomeQoq;

    /** 已赚保费 */
    @Excel(name = "已赚保费")
    private Double earnedPremium;

    /** 已赚保费(同比%) */
    @Excel(name = "已赚保费(同比%)")
    private Double earnedPremiumYoy;

    /** 已赚保费(单季度环比%) */
    @Excel(name = "已赚保费(单季度环比%)")
    private Double earnedPremiumQoq;

    /** 手续费及佣金收入 */
    @Excel(name = "手续费及佣金收入")
    private Double feeCommissionIncome;

    /** 手续费及佣金收入(同比%) */
    @Excel(name = "手续费及佣金收入(同比%)")
    private Double feeCommissionIncomeYoy;

    /** 手续费及佣金收入(单季度环比%) */
    @Excel(name = "手续费及佣金收入(单季度环比%)")
    private Double feeCommissionIncomeQoq;

    /** 营业总收入其他项目 */
    @Excel(name = "营业总收入其他项目")
    private Double toiOther;

    /** 营业总收入其他项目(同比%) */
    @Excel(name = "营业总收入其他项目(同比%)")
    private Double toiOtherYoy;

    /** 营业总收入其他项目(单季度环比%) */
    @Excel(name = "营业总收入其他项目(单季度环比%)")
    private Double toiOtherQoq;

    /** 营业总成本 */
    @Excel(name = "营业总成本")
    private Double totalOperateCost;

    /** 营业总成本(同比%) */
    @Excel(name = "营业总成本(同比%)")
    private Double totalOperateCostYoy;

    /** 营业总成本(单季度环比%) */
    @Excel(name = "营业总成本(单季度环比%)")
    private Double totalOperateCostQoq;

    /** 营业成本 */
    @Excel(name = "营业成本")
    private Double operateCost;

    /** 营业成本(同比%) */
    @Excel(name = "营业成本(同比%)")
    private Double operateCostYoy;

    /** 营业成本(单季度环比%) */
    @Excel(name = "营业成本(单季度环比%)")
    private Double operateCostQoq;

    /** 利息支出 */
    @Excel(name = "利息支出")
    private Double interestExpense;

    /** 利息支出(同比%) */
    @Excel(name = "利息支出(同比%)")
    private Double interestExpenseYoy;

    /** 利息支出(单季度环比%) */
    @Excel(name = "利息支出(单季度环比%)")
    private Double interestExpenseQoq;

    /** 手续费及佣金支出 */
    @Excel(name = "手续费及佣金支出")
    private Double feeCommissionExpense;

    /** 手续费及佣金支出(同比%) */
    @Excel(name = "手续费及佣金支出(同比%)")
    private Double feeCommissionExpenseYoy;

    /** 手续费及佣金支出(单季度环比%) */
    @Excel(name = "手续费及佣金支出(单季度环比%)")
    private Double feeCommissionExpenseQoq;

    /** 退保金 */
    @Excel(name = "退保金")
    private Double surrenderValue;

    /** 退保金(同比%) */
    @Excel(name = "退保金(同比%)")
    private Double surrenderValueYoy;

    /** 退保金(单季度环比%) */
    @Excel(name = "退保金(单季度环比%)")
    private Double surrenderValueQoq;

    /** 赔付支出净额 */
    @Excel(name = "赔付支出净额")
    private Double netCompensateExpense;

    /** 赔付支出净额(同比%) */
    @Excel(name = "赔付支出净额(同比%)")
    private Double netCompensateExpenseYoy;

    /** 赔付支出净额(单季度环比%) */
    @Excel(name = "赔付支出净额(单季度环比%)")
    private Double netCompensateExpenseQoq;

    /** 提取保险合同准备金净额 */
    @Excel(name = "提取保险合同准备金净额")
    private Double netContractReserve;

    /** 提取保险合同准备金净额(同比%) */
    @Excel(name = "提取保险合同准备金净额(同比%)")
    private Double netContractReserveYoy;

    /** 提取保险合同准备金净额(单季度环比%) */
    @Excel(name = "提取保险合同准备金净额(单季度环比%)")
    private Double netContractReserveQoq;

    /** 保单红利支出 */
    @Excel(name = "保单红利支出")
    private Double policyBonusExpense;

    /** 保单红利支出(同比%) */
    @Excel(name = "保单红利支出(同比%)")
    private Double policyBonusExpenseYoy;

    /** 保单红利支出(单季度环比%) */
    @Excel(name = "保单红利支出(单季度环比%)")
    private Double policyBonusExpenseQoq;

    /** 分保费用 */
    @Excel(name = "分保费用")
    private Double reinsureExpense;

    /** 分保费用(同比%) */
    @Excel(name = "分保费用(同比%)")
    private Double reinsureExpenseYoy;

    /** 分保费用(单季度环比%) */
    @Excel(name = "分保费用(单季度环比%)")
    private Double reinsureExpenseQoq;

    /** 销售费用 */
    @Excel(name = "销售费用")
    private Double saleExpense;

    /** 销售费用(同比%) */
    @Excel(name = "销售费用(同比%)")
    private Double saleExpenseYoy;

    /** 销售费用(单季度环比%) */
    @Excel(name = "销售费用(单季度环比%)")
    private Double saleExpenseQoq;

    /** 管理费用 */
    @Excel(name = "管理费用")
    private Double manageExpense;

    /** 管理费用(同比%) */
    @Excel(name = "管理费用(同比%)")
    private Double manageExpenseYoy;

    /** 管理费用(单季度环比%) */
    @Excel(name = "管理费用(单季度环比%)")
    private Double manageExpenseQoq;

    /** 研发费用 */
    @Excel(name = "研发费用")
    private Double researchExpense;

    /** 研发费用(同比%) */
    @Excel(name = "研发费用(同比%)")
    private Double researchExpenseYoy;

    /** 研发费用(单季度环比%) */
    @Excel(name = "研发费用(单季度环比%)")
    private Double researchExpenseQoq;

    /** 财务费用 */
    @Excel(name = "财务费用")
    private Double financeExpense;

    /** 财务费用(同比%) */
    @Excel(name = "财务费用(同比%)")
    private Double financeExpenseYoy;

    /** 财务费用(单季度环比%) */
    @Excel(name = "财务费用(单季度环比%)")
    private Double financeExpenseQoq;

    /** 利息费用 */
    @Excel(name = "利息费用")
    private Double feInterestExpense;

    /** 利息费用(同比%) */
    @Excel(name = "利息费用(同比%)")
    private Double feInterestExpenseYoy;

    /** 利息费用(单季度环比%) */
    @Excel(name = "利息费用(单季度环比%)")
    private Double feInterestExpenseQoq;

    /** 利息收入 */
    @Excel(name = "利息收入")
    private Double feInterestIncome;

    /** 利息收入(同比%) */
    @Excel(name = "利息收入(同比%)")
    private Double feInterestIncomeYoy;

    /** 利息收入(单季度环比%) */
    @Excel(name = "利息收入(单季度环比%)")
    private Double feInterestIncomeQoq;

    /** 营业总成本其他项目 */
    @Excel(name = "营业总成本其他项目")
    private Double tocOther;

    /** 营业总成本其他项目(同比%) */
    @Excel(name = "营业总成本其他项目(同比%)")
    private Double tocOtherYoy;

    /** 营业总成本其他项目(单季度环比%) */
    @Excel(name = "营业总成本其他项目(单季度环比%)")
    private Double tocOtherQoq;

    /** 净敞口套期收益 */
    @Excel(name = "净敞口套期收益")
    private Double netExposureIncome;

    /** 净敞口套期收益(同比%) */
    @Excel(name = "净敞口套期收益(同比%)")
    private Double netExposureIncomeYoy;

    /** 净敞口套期收益(单季度环比%) */
    @Excel(name = "净敞口套期收益(单季度环比%)")
    private Double netExposureIncomeQoq;

    /** 资产减值损失(新) */
    @Excel(name = "资产减值损失(新)")
    private Double assetImpairmentIncome;

    /** 资产减值损失(新)(同比%) */
    @Excel(name = "资产减值损失(新)(同比%)")
    private Double assetImpairmentIncomeYoy;

    /** 资产减值损失(新)(单季度环比%) */
    @Excel(name = "资产减值损失(新)(单季度环比%)")
    private Double assetImpairmentIncomeQoq;

    /** 信用减值损失(新) */
    @Excel(name = "信用减值损失(新)")
    private Double creditImpairmentIncome;

    /** 信用减值损失(新)(同比%) */
    @Excel(name = "信用减值损失(新)(同比%)")
    private Double creditImpairmentIncomeYoy;

    /** 信用减值损失(新)(单季度环比%) */
    @Excel(name = "信用减值损失(新)(单季度环比%)")
    private Double creditImpairmentIncomeQoq;

    /** 加:影响净利润的其他项目 */
    @Excel(name = "加:影响净利润的其他项目")
    private Double effectNetprofitOther;

    /** 加:影响净利润的其他项目(同比%) */
    @Excel(name = "加:影响净利润的其他项目(同比%)")
    private Double effectNetprofitOtherYoy;

    /** 加:影响净利润的其他项目(单季度环比%) */
    @Excel(name = "加:影响净利润的其他项目(单季度环比%)")
    private Double effectNetprofitOtherQoq;

    /** 未确认投资损失 */
    @Excel(name = "未确认投资损失")
    private Double unconfirmInvestLoss;

    /** 未确认投资损失(同比%) */
    @Excel(name = "未确认投资损失(同比%)")
    private Double unconfirmInvestLossYoy;

    /** 未确认投资损失(单季度环比%) */
    @Excel(name = "未确认投资损失(单季度环比%)")
    private Double unconfirmInvestLossQoq;

    /** 其中:被合并方在合并前实现利润 */
    @Excel(name = "其中:被合并方在合并前实现利润")
    private Double precombineProfit;

    /** 其中:被合并方在合并前实现利润(同比%) */
    @Excel(name = "其中:被合并方在合并前实现利润(同比%)")
    private Double precombineProfitYoy;

    /** 其中:被合并方在合并前实现利润(单季度环比%) */
    @Excel(name = "其中:被合并方在合并前实现利润(单季度环比%)")
    private Double precombineProfitQoq;

    /** 影响净利润的平衡项目 */
    @Excel(name = "影响净利润的平衡项目")
    private Double effectNetprofitBalance;

    /** 影响净利润的平衡项目(同比%) */
    @Excel(name = "影响净利润的平衡项目(同比%)")
    private Double effectNetprofitBalanceYoy;

    /** 影响净利润的平衡项目(单季度环比%) */
    @Excel(name = "影响净利润的平衡项目(单季度环比%)")
    private Double effectNetprofitBalanceQoq;

    /** 保险业务收入 */
    @Excel(name = "保险业务收入")
    private Double insuranceIncome;

    /** 保险业务收入(同比%) */
    @Excel(name = "保险业务收入(同比%)")
    private Double insuranceIncomeYoy;

    /** 保险业务收入(单季度环比%) */
    @Excel(name = "保险业务收入(单季度环比%)")
    private Double insuranceIncomeQoq;

    /** 分保费收入 */
    @Excel(name = "分保费收入")
    private Double reinsureIncome;

    /** 分保费收入(同比%) */
    @Excel(name = "分保费收入(同比%)")
    private Double reinsureIncomeYoy;

    /** 分保费收入(单季度环比%) */
    @Excel(name = "分保费收入(单季度环比%)")
    private Double reinsureIncomeQoq;

    /** 分出保费 */
    @Excel(name = "分出保费")
    private Double reinsurePremium;

    /** 分出保费(同比%) */
    @Excel(name = "分出保费(同比%)")
    private Double reinsurePremiumYoy;

    /** 分出保费(单季度环比%) */
    @Excel(name = "分出保费(单季度环比%)")
    private Double reinsurePremiumQoq;

    /** 提取未到期责任准备金 */
    @Excel(name = "提取未到期责任准备金")
    private Double extractUnexpireReserve;

    /** 提取未到期责任准备金(同比%) */
    @Excel(name = "提取未到期责任准备金(同比%)")
    private Double extractUnexpireReserveYoy;

    /** 提取未到期责任准备金(单季度环比%) */
    @Excel(name = "提取未到期责任准备金(单季度环比%)")
    private Double extractUnexpireReserveQoq;

    /** 其中:已赚保费平衡项目 */
    @Excel(name = "其中:已赚保费平衡项目")
    private Double earnedPremiumBalance;

    /** 其中:已赚保费平衡项目(同比%) */
    @Excel(name = "其中:已赚保费平衡项目(同比%)")
    private Double earnedPremiumBalanceYoy;

    /** 其中:已赚保费平衡项目(单季度环比%) */
    @Excel(name = "其中:已赚保费平衡项目(单季度环比%)")
    private Double earnedPremiumBalanceQoq;

    /** 银行业务利息净收入 */
    @Excel(name = "银行业务利息净收入")
    private Double bankInterestNi;

    /** 银行业务利息净收入(同比%) */
    @Excel(name = "银行业务利息净收入(同比%)")
    private Double bankInterestNiYoy;

    /** 银行业务利息净收入(单季度环比%) */
    @Excel(name = "银行业务利息净收入(单季度环比%)")
    private Double bankInterestNiQoq;

    /** 银行业务利息收入 */
    @Excel(name = "银行业务利息收入")
    private Double bankInterestIncome;

    /** 银行业务利息收入(同比%) */
    @Excel(name = "银行业务利息收入(同比%)")
    private Double bankInterestIncomeYoy;

    /** 银行业务利息收入(单季度环比%) */
    @Excel(name = "银行业务利息收入(单季度环比%)")
    private Double bankInterestIncomeQoq;

    /** 银行业务利息支出 */
    @Excel(name = "银行业务利息支出")
    private Double bankInterestExpense;

    /** 银行业务利息支出(同比%) */
    @Excel(name = "银行业务利息支出(同比%)")
    private Double bankInterestExpenseYoy;

    /** 银行业务利息支出(单季度环比%) */
    @Excel(name = "银行业务利息支出(单季度环比%)")
    private Double bankInterestExpenseQoq;

    /** 非保险业务手续费及佣金净收入 */
    @Excel(name = "非保险业务手续费及佣金净收入")
    private Double uninsuranceCni;

    /** 非保险业务手续费及佣金净收入(同比%) */
    @Excel(name = "非保险业务手续费及佣金净收入(同比%)")
    private Double uninsuranceCniYoy;

    /** 非保险业务手续费及佣金净收入(单季度环比%) */
    @Excel(name = "非保险业务手续费及佣金净收入(单季度环比%)")
    private Double uninsuranceCniQoq;

    /** 其中:非保险业务手续费及佣金收入 */
    @Excel(name = "其中:非保险业务手续费及佣金收入")
    private Double uninsuranceCi;

    /** 其中:非保险业务手续费及佣金收入(同比%) */
    @Excel(name = "其中:非保险业务手续费及佣金收入(同比%)")
    private Double uninsuranceCiYoy;

    /** 其中:非保险业务手续费及佣金收入(单季度环比%) */
    @Excel(name = "其中:非保险业务手续费及佣金收入(单季度环比%)")
    private Double uninsuranceCiQoq;

    /** 其中:非保险业务手续费及佣金支出 */
    @Excel(name = "其中:非保险业务手续费及佣金支出")
    private Double uninsuranceCe;

    /** 其中:非保险业务手续费及佣金支出(同比%) */
    @Excel(name = "其中:非保险业务手续费及佣金支出(同比%)")
    private Double uninsuranceCeYoy;

    /** 其中:非保险业务手续费及佣金支出(单季度环比%) */
    @Excel(name = "其中:非保险业务手续费及佣金支出(单季度环比%)")
    private Double uninsuranceCeQoq;

    /** 公允价值变动损益 */
    @Excel(name = "公允价值变动损益")
    private Double fairvalueChange;

    /** 公允价值变动损益(同比%) */
    @Excel(name = "公允价值变动损益(同比%)")
    private Double fairvalueChangeYoy;

    /** 公允价值变动损益(单季度环比%) */
    @Excel(name = "公允价值变动损益(单季度环比%)")
    private Double fairvalueChangeQoq;

    /** 其中:可供出售金融资产公允价值变动损益 */
    @Excel(name = "其中:可供出售金融资产公允价值变动损益")
    private Double afaFairvalueChange;

    /** 其中:可供出售金融资产公允价值变动损益(同比%) */
    @Excel(name = "其中:可供出售金融资产公允价值变动损益(同比%)")
    private Double afaFairvalueChangeYoy;

    /** 其中:可供出售金融资产公允价值变动损益(单季度环比%) */
    @Excel(name = "其中:可供出售金融资产公允价值变动损益(单季度环比%)")
    private Double afaFairvalueChangeQoq;

    /** 赔付支出 */
    @Excel(name = "赔付支出")
    private Double compensateExpense;

    /** 赔付支出(同比%) */
    @Excel(name = "赔付支出(同比%)")
    private Double compensateExpenseYoy;

    /** 赔付支出(单季度环比%) */
    @Excel(name = "赔付支出(单季度环比%)")
    private Double compensateExpenseQoq;

    /** 减:摊回赔付支出 */
    @Excel(name = "减:摊回赔付支出")
    private Double amortizeCompensateExpense;

    /** 减:摊回赔付支出(同比%) */
    @Excel(name = "减:摊回赔付支出(同比%)")
    private Double amortizeCompensateExpenseYoy;

    /** 减:摊回赔付支出(单季度环比%) */
    @Excel(name = "减:摊回赔付支出(单季度环比%)")
    private Double amortizeCompensateExpenseQoq;

    /** 提取保险责任准备金 */
    @Excel(name = "提取保险责任准备金")
    private Double extractInsuranceReserve;

    /** 提取保险责任准备金(同比%) */
    @Excel(name = "提取保险责任准备金(同比%)")
    private Double extractInsuranceReserveYoy;

    /** 提取保险责任准备金(单季度环比%) */
    @Excel(name = "提取保险责任准备金(单季度环比%)")
    private Double extractInsuranceReserveQoq;

    /** 减:摊回保险责任准备金 */
    @Excel(name = "减:摊回保险责任准备金")
    private Double amortizeInsuranceReserve;

    /** 减:摊回保险责任准备金(同比%) */
    @Excel(name = "减:摊回保险责任准备金(同比%)")
    private Double amortizeInsuranceReserveYoy;

    /** 减:摊回保险责任准备金(单季度环比%) */
    @Excel(name = "减:摊回保险责任准备金(单季度环比%)")
    private Double amortizeInsuranceReserveQoq;

    /** 减:摊回分保费用 */
    @Excel(name = "减:摊回分保费用")
    private Double amortizeReinsureExpense;

    /** 减:摊回分保费用(同比%) */
    @Excel(name = "减:摊回分保费用(同比%)")
    private Double amortizeReinsureExpenseYoy;

    /** 减:摊回分保费用(单季度环比%) */
    @Excel(name = "减:摊回分保费用(单季度环比%)")
    private Double amortizeReinsureExpenseQoq;

    public void setId(Integer id){this.id = id;}
    public Integer getId(){return id;}

    public void setSecurityCode(String securityCode){this.securityCode = securityCode;}
    public String getSecurityCode(){return securityCode;}

    public void setReportType(String reportType){this.reportType = reportType;}
    public String getReportType(){return reportType;}

    public void setReportDate(Date reportDate){this.reportDate = reportDate;}
    public Date getReportDate(){return reportDate;}

    public void setOpinionType(String opinionType){this.opinionType = opinionType;}
    public String getOpinionType(){return opinionType;}

    public void setOsopinionType(String osopinionType){this.osopinionType = osopinionType;}
    public String getOsopinionType(){return osopinionType;}

    public void setOperateIncome(Double operateIncome){this.operateIncome = operateIncome;}
    public Double getOperateIncome(){return operateIncome;}

    public void setOperateIncomeYoy(Double operateIncomeYoy){this.operateIncomeYoy = operateIncomeYoy;}
    public Double getOperateIncomeYoy(){return operateIncomeYoy;}

    public void setOperateIncomeQoq(Double operateIncomeQoq){this.operateIncomeQoq = operateIncomeQoq;}
    public Double getOperateIncomeQoq(){return operateIncomeQoq;}

    public void setFeeCommissionNi(Double feeCommissionNi){this.feeCommissionNi = feeCommissionNi;}
    public Double getFeeCommissionNi(){return feeCommissionNi;}

    public void setFeeCommissionNiYoy(Double feeCommissionNiYoy){this.feeCommissionNiYoy = feeCommissionNiYoy;}
    public Double getFeeCommissionNiYoy(){return feeCommissionNiYoy;}

    public void setFeeCommissionNiQoq(Double feeCommissionNiQoq){this.feeCommissionNiQoq = feeCommissionNiQoq;}
    public Double getFeeCommissionNiQoq(){return feeCommissionNiQoq;}

    public void setAgentSecurityNi(Double agentSecurityNi){this.agentSecurityNi = agentSecurityNi;}
    public Double getAgentSecurityNi(){return agentSecurityNi;}

    public void setAgentSecurityNiYoy(Double agentSecurityNiYoy){this.agentSecurityNiYoy = agentSecurityNiYoy;}
    public Double getAgentSecurityNiYoy(){return agentSecurityNiYoy;}

    public void setAgentSecurityNiQoq(Double agentSecurityNiQoq){this.agentSecurityNiQoq = agentSecurityNiQoq;}
    public Double getAgentSecurityNiQoq(){return agentSecurityNiQoq;}

    public void setSecurityUnderwriteNi(Double securityUnderwriteNi){this.securityUnderwriteNi = securityUnderwriteNi;}
    public Double getSecurityUnderwriteNi(){return securityUnderwriteNi;}

    public void setSecurityUnderwriteNiYoy(Double securityUnderwriteNiYoy){this.securityUnderwriteNiYoy = securityUnderwriteNiYoy;}
    public Double getSecurityUnderwriteNiYoy(){return securityUnderwriteNiYoy;}

    public void setSecurityUnderwriteNiQoq(Double securityUnderwriteNiQoq){this.securityUnderwriteNiQoq = securityUnderwriteNiQoq;}
    public Double getSecurityUnderwriteNiQoq(){return securityUnderwriteNiQoq;}

    public void setAssetManageNi(Double assetManageNi){this.assetManageNi = assetManageNi;}
    public Double getAssetManageNi(){return assetManageNi;}

    public void setAssetManageNiYoy(Double assetManageNiYoy){this.assetManageNiYoy = assetManageNiYoy;}
    public Double getAssetManageNiYoy(){return assetManageNiYoy;}

    public void setAssetManageNiQoq(Double assetManageNiQoq){this.assetManageNiQoq = assetManageNiQoq;}
    public Double getAssetManageNiQoq(){return assetManageNiQoq;}

    public void setFinanceAdviserNi(Double financeAdviserNi){this.financeAdviserNi = financeAdviserNi;}
    public Double getFinanceAdviserNi(){return financeAdviserNi;}

    public void setFinanceAdviserNiYoy(Double financeAdviserNiYoy){this.financeAdviserNiYoy = financeAdviserNiYoy;}
    public Double getFinanceAdviserNiYoy(){return financeAdviserNiYoy;}

    public void setFinanceAdviserNiQoq(Double financeAdviserNiQoq){this.financeAdviserNiQoq = financeAdviserNiQoq;}
    public Double getFinanceAdviserNiQoq(){return financeAdviserNiQoq;}

    public void setRecommendNi(Double recommendNi){this.recommendNi = recommendNi;}
    public Double getRecommendNi(){return recommendNi;}

    public void setRecommendNiYoy(Double recommendNiYoy){this.recommendNiYoy = recommendNiYoy;}
    public Double getRecommendNiYoy(){return recommendNiYoy;}

    public void setRecommendNiQoq(Double recommendNiQoq){this.recommendNiQoq = recommendNiQoq;}
    public Double getRecommendNiQoq(){return recommendNiQoq;}

    public void setFundManageNi(Double fundManageNi){this.fundManageNi = fundManageNi;}
    public Double getFundManageNi(){return fundManageNi;}

    public void setFundManageNiYoy(Double fundManageNiYoy){this.fundManageNiYoy = fundManageNiYoy;}
    public Double getFundManageNiYoy(){return fundManageNiYoy;}

    public void setFundManageNiQoq(Double fundManageNiQoq){this.fundManageNiQoq = fundManageNiQoq;}
    public Double getFundManageNiQoq(){return fundManageNiQoq;}

    public void setFundSaleNi(Double fundSaleNi){this.fundSaleNi = fundSaleNi;}
    public Double getFundSaleNi(){return fundSaleNi;}

    public void setFundSaleNiYoy(Double fundSaleNiYoy){this.fundSaleNiYoy = fundSaleNiYoy;}
    public Double getFundSaleNiYoy(){return fundSaleNiYoy;}

    public void setFundSaleNiQoq(Double fundSaleNiQoq){this.fundSaleNiQoq = fundSaleNiQoq;}
    public Double getFundSaleNiQoq(){return fundSaleNiQoq;}

    public void setBrokerNi(Double brokerNi){this.brokerNi = brokerNi;}
    public Double getBrokerNi(){return brokerNi;}

    public void setBrokerNiYoy(Double brokerNiYoy){this.brokerNiYoy = brokerNiYoy;}
    public Double getBrokerNiYoy(){return brokerNiYoy;}

    public void setBrokerNiQoq(Double brokerNiQoq){this.brokerNiQoq = brokerNiQoq;}
    public Double getBrokerNiQoq(){return brokerNiQoq;}

    public void setCommissionNiOther(Double commissionNiOther){this.commissionNiOther = commissionNiOther;}
    public Double getCommissionNiOther(){return commissionNiOther;}

    public void setCommissionNiOtherYoy(Double commissionNiOtherYoy){this.commissionNiOtherYoy = commissionNiOtherYoy;}
    public Double getCommissionNiOtherYoy(){return commissionNiOtherYoy;}

    public void setCommissionNiOtherQoq(Double commissionNiOtherQoq){this.commissionNiOtherQoq = commissionNiOtherQoq;}
    public Double getCommissionNiOtherQoq(){return commissionNiOtherQoq;}

    public void setInterestNi(Double interestNi){this.interestNi = interestNi;}
    public Double getInterestNi(){return interestNi;}

    public void setInterestNiYoy(Double interestNiYoy){this.interestNiYoy = interestNiYoy;}
    public Double getInterestNiYoy(){return interestNiYoy;}

    public void setInterestNiQoq(Double interestNiQoq){this.interestNiQoq = interestNiQoq;}
    public Double getInterestNiQoq(){return interestNiQoq;}

    public void setInvestIncome(Double investIncome){this.investIncome = investIncome;}
    public Double getInvestIncome(){return investIncome;}

    public void setInvestIncomeYoy(Double investIncomeYoy){this.investIncomeYoy = investIncomeYoy;}
    public Double getInvestIncomeYoy(){return investIncomeYoy;}

    public void setInvestIncomeQoq(Double investIncomeQoq){this.investIncomeQoq = investIncomeQoq;}
    public Double getInvestIncomeQoq(){return investIncomeQoq;}

    public void setInvestJointIncome(Double investJointIncome){this.investJointIncome = investJointIncome;}
    public Double getInvestJointIncome(){return investJointIncome;}

    public void setInvestJointIncomeYoy(Double investJointIncomeYoy){this.investJointIncomeYoy = investJointIncomeYoy;}
    public Double getInvestJointIncomeYoy(){return investJointIncomeYoy;}

    public void setInvestJointIncomeQoq(Double investJointIncomeQoq){this.investJointIncomeQoq = investJointIncomeQoq;}
    public Double getInvestJointIncomeQoq(){return investJointIncomeQoq;}

    public void setFairvalueChangeIncome(Double fairvalueChangeIncome){this.fairvalueChangeIncome = fairvalueChangeIncome;}
    public Double getFairvalueChangeIncome(){return fairvalueChangeIncome;}

    public void setFairvalueChangeIncomeYoy(Double fairvalueChangeIncomeYoy){this.fairvalueChangeIncomeYoy = fairvalueChangeIncomeYoy;}
    public Double getFairvalueChangeIncomeYoy(){return fairvalueChangeIncomeYoy;}

    public void setFairvalueChangeIncomeQoq(Double fairvalueChangeIncomeQoq){this.fairvalueChangeIncomeQoq = fairvalueChangeIncomeQoq;}
    public Double getFairvalueChangeIncomeQoq(){return fairvalueChangeIncomeQoq;}

    public void setExchangeIncome(Double exchangeIncome){this.exchangeIncome = exchangeIncome;}
    public Double getExchangeIncome(){return exchangeIncome;}

    public void setExchangeIncomeYoy(Double exchangeIncomeYoy){this.exchangeIncomeYoy = exchangeIncomeYoy;}
    public Double getExchangeIncomeYoy(){return exchangeIncomeYoy;}

    public void setExchangeIncomeQoq(Double exchangeIncomeQoq){this.exchangeIncomeQoq = exchangeIncomeQoq;}
    public Double getExchangeIncomeQoq(){return exchangeIncomeQoq;}

    public void setOtherBusinessIncome(Double otherBusinessIncome){this.otherBusinessIncome = otherBusinessIncome;}
    public Double getOtherBusinessIncome(){return otherBusinessIncome;}

    public void setOtherBusinessIncomeYoy(Double otherBusinessIncomeYoy){this.otherBusinessIncomeYoy = otherBusinessIncomeYoy;}
    public Double getOtherBusinessIncomeYoy(){return otherBusinessIncomeYoy;}

    public void setOtherBusinessIncomeQoq(Double otherBusinessIncomeQoq){this.otherBusinessIncomeQoq = otherBusinessIncomeQoq;}
    public Double getOtherBusinessIncomeQoq(){return otherBusinessIncomeQoq;}

    public void setAssetDisposalIncome(Double assetDisposalIncome){this.assetDisposalIncome = assetDisposalIncome;}
    public Double getAssetDisposalIncome(){return assetDisposalIncome;}

    public void setAssetDisposalIncomeYoy(Double assetDisposalIncomeYoy){this.assetDisposalIncomeYoy = assetDisposalIncomeYoy;}
    public Double getAssetDisposalIncomeYoy(){return assetDisposalIncomeYoy;}

    public void setAssetDisposalIncomeQoq(Double assetDisposalIncomeQoq){this.assetDisposalIncomeQoq = assetDisposalIncomeQoq;}
    public Double getAssetDisposalIncomeQoq(){return assetDisposalIncomeQoq;}

    public void setOtherIncome(Double otherIncome){this.otherIncome = otherIncome;}
    public Double getOtherIncome(){return otherIncome;}

    public void setOtherIncomeYoy(Double otherIncomeYoy){this.otherIncomeYoy = otherIncomeYoy;}
    public Double getOtherIncomeYoy(){return otherIncomeYoy;}

    public void setOtherIncomeQoq(Double otherIncomeQoq){this.otherIncomeQoq = otherIncomeQoq;}
    public Double getOtherIncomeQoq(){return otherIncomeQoq;}

    public void setOperateIncomeOther(Double operateIncomeOther){this.operateIncomeOther = operateIncomeOther;}
    public Double getOperateIncomeOther(){return operateIncomeOther;}

    public void setOperateIncomeOtherYoy(Double operateIncomeOtherYoy){this.operateIncomeOtherYoy = operateIncomeOtherYoy;}
    public Double getOperateIncomeOtherYoy(){return operateIncomeOtherYoy;}

    public void setOperateIncomeOtherQoq(Double operateIncomeOtherQoq){this.operateIncomeOtherQoq = operateIncomeOtherQoq;}
    public Double getOperateIncomeOtherQoq(){return operateIncomeOtherQoq;}

    public void setOperateIncomeBalance(Double operateIncomeBalance){this.operateIncomeBalance = operateIncomeBalance;}
    public Double getOperateIncomeBalance(){return operateIncomeBalance;}

    public void setOperateIncomeBalanceYoy(Double operateIncomeBalanceYoy){this.operateIncomeBalanceYoy = operateIncomeBalanceYoy;}
    public Double getOperateIncomeBalanceYoy(){return operateIncomeBalanceYoy;}

    public void setOperateIncomeBalanceQoq(Double operateIncomeBalanceQoq){this.operateIncomeBalanceQoq = operateIncomeBalanceQoq;}
    public Double getOperateIncomeBalanceQoq(){return operateIncomeBalanceQoq;}

    public void setOperateExpense(Double operateExpense){this.operateExpense = operateExpense;}
    public Double getOperateExpense(){return operateExpense;}

    public void setOperateExpenseYoy(Double operateExpenseYoy){this.operateExpenseYoy = operateExpenseYoy;}
    public Double getOperateExpenseYoy(){return operateExpenseYoy;}

    public void setOperateExpenseQoq(Double operateExpenseQoq){this.operateExpenseQoq = operateExpenseQoq;}
    public Double getOperateExpenseQoq(){return operateExpenseQoq;}

    public void setOperateTaxAdd(Double operateTaxAdd){this.operateTaxAdd = operateTaxAdd;}
    public Double getOperateTaxAdd(){return operateTaxAdd;}

    public void setOperateTaxAddYoy(Double operateTaxAddYoy){this.operateTaxAddYoy = operateTaxAddYoy;}
    public Double getOperateTaxAddYoy(){return operateTaxAddYoy;}

    public void setOperateTaxAddQoq(Double operateTaxAddQoq){this.operateTaxAddQoq = operateTaxAddQoq;}
    public Double getOperateTaxAddQoq(){return operateTaxAddQoq;}

    public void setBusinessManageExpense(Double businessManageExpense){this.businessManageExpense = businessManageExpense;}
    public Double getBusinessManageExpense(){return businessManageExpense;}

    public void setBusinessManageExpenseYoy(Double businessManageExpenseYoy){this.businessManageExpenseYoy = businessManageExpenseYoy;}
    public Double getBusinessManageExpenseYoy(){return businessManageExpenseYoy;}

    public void setBusinessManageExpenseQoq(Double businessManageExpenseQoq){this.businessManageExpenseQoq = businessManageExpenseQoq;}
    public Double getBusinessManageExpenseQoq(){return businessManageExpenseQoq;}

    public void setAssetImpairmentLoss(Double assetImpairmentLoss){this.assetImpairmentLoss = assetImpairmentLoss;}
    public Double getAssetImpairmentLoss(){return assetImpairmentLoss;}

    public void setAssetImpairmentLossYoy(Double assetImpairmentLossYoy){this.assetImpairmentLossYoy = assetImpairmentLossYoy;}
    public Double getAssetImpairmentLossYoy(){return assetImpairmentLossYoy;}

    public void setAssetImpairmentLossQoq(Double assetImpairmentLossQoq){this.assetImpairmentLossQoq = assetImpairmentLossQoq;}
    public Double getAssetImpairmentLossQoq(){return assetImpairmentLossQoq;}

    public void setCreditImpairmentLoss(Double creditImpairmentLoss){this.creditImpairmentLoss = creditImpairmentLoss;}
    public Double getCreditImpairmentLoss(){return creditImpairmentLoss;}

    public void setCreditImpairmentLossYoy(Double creditImpairmentLossYoy){this.creditImpairmentLossYoy = creditImpairmentLossYoy;}
    public Double getCreditImpairmentLossYoy(){return creditImpairmentLossYoy;}

    public void setCreditImpairmentLossQoq(Double creditImpairmentLossQoq){this.creditImpairmentLossQoq = creditImpairmentLossQoq;}
    public Double getCreditImpairmentLossQoq(){return creditImpairmentLossQoq;}

    public void setOtherBusinessCost(Double otherBusinessCost){this.otherBusinessCost = otherBusinessCost;}
    public Double getOtherBusinessCost(){return otherBusinessCost;}

    public void setOtherBusinessCostYoy(Double otherBusinessCostYoy){this.otherBusinessCostYoy = otherBusinessCostYoy;}
    public Double getOtherBusinessCostYoy(){return otherBusinessCostYoy;}

    public void setOtherBusinessCostQoq(Double otherBusinessCostQoq){this.otherBusinessCostQoq = otherBusinessCostQoq;}
    public Double getOtherBusinessCostQoq(){return otherBusinessCostQoq;}

    public void setOperateExpenseOther(Double operateExpenseOther){this.operateExpenseOther = operateExpenseOther;}
    public Double getOperateExpenseOther(){return operateExpenseOther;}

    public void setOperateExpenseOtherYoy(Double operateExpenseOtherYoy){this.operateExpenseOtherYoy = operateExpenseOtherYoy;}
    public Double getOperateExpenseOtherYoy(){return operateExpenseOtherYoy;}

    public void setOperateExpenseOtherQoq(Double operateExpenseOtherQoq){this.operateExpenseOtherQoq = operateExpenseOtherQoq;}
    public Double getOperateExpenseOtherQoq(){return operateExpenseOtherQoq;}

    public void setOperateExpenseBalance(Double operateExpenseBalance){this.operateExpenseBalance = operateExpenseBalance;}
    public Double getOperateExpenseBalance(){return operateExpenseBalance;}

    public void setOperateExpenseBalanceYoy(Double operateExpenseBalanceYoy){this.operateExpenseBalanceYoy = operateExpenseBalanceYoy;}
    public Double getOperateExpenseBalanceYoy(){return operateExpenseBalanceYoy;}

    public void setOperateExpenseBalanceQoq(Double operateExpenseBalanceQoq){this.operateExpenseBalanceQoq = operateExpenseBalanceQoq;}
    public Double getOperateExpenseBalanceQoq(){return operateExpenseBalanceQoq;}

    public void setOperateProfitOther(Double operateProfitOther){this.operateProfitOther = operateProfitOther;}
    public Double getOperateProfitOther(){return operateProfitOther;}

    public void setOperateProfitOtherYoy(Double operateProfitOtherYoy){this.operateProfitOtherYoy = operateProfitOtherYoy;}
    public Double getOperateProfitOtherYoy(){return operateProfitOtherYoy;}

    public void setOperateProfitOtherQoq(Double operateProfitOtherQoq){this.operateProfitOtherQoq = operateProfitOtherQoq;}
    public Double getOperateProfitOtherQoq(){return operateProfitOtherQoq;}

    public void setOperateProfitBalance(Double operateProfitBalance){this.operateProfitBalance = operateProfitBalance;}
    public Double getOperateProfitBalance(){return operateProfitBalance;}

    public void setOperateProfitBalanceYoy(Double operateProfitBalanceYoy){this.operateProfitBalanceYoy = operateProfitBalanceYoy;}
    public Double getOperateProfitBalanceYoy(){return operateProfitBalanceYoy;}

    public void setOperateProfitBalanceQoq(Double operateProfitBalanceQoq){this.operateProfitBalanceQoq = operateProfitBalanceQoq;}
    public Double getOperateProfitBalanceQoq(){return operateProfitBalanceQoq;}

    public void setOperateProfit(Double operateProfit){this.operateProfit = operateProfit;}
    public Double getOperateProfit(){return operateProfit;}

    public void setOperateProfitYoy(Double operateProfitYoy){this.operateProfitYoy = operateProfitYoy;}
    public Double getOperateProfitYoy(){return operateProfitYoy;}

    public void setOperateProfitQoq(Double operateProfitQoq){this.operateProfitQoq = operateProfitQoq;}
    public Double getOperateProfitQoq(){return operateProfitQoq;}

    public void setNonbusinessIncome(Double nonbusinessIncome){this.nonbusinessIncome = nonbusinessIncome;}
    public Double getNonbusinessIncome(){return nonbusinessIncome;}

    public void setNonbusinessIncomeYoy(Double nonbusinessIncomeYoy){this.nonbusinessIncomeYoy = nonbusinessIncomeYoy;}
    public Double getNonbusinessIncomeYoy(){return nonbusinessIncomeYoy;}

    public void setNonbusinessIncomeQoq(Double nonbusinessIncomeQoq){this.nonbusinessIncomeQoq = nonbusinessIncomeQoq;}
    public Double getNonbusinessIncomeQoq(){return nonbusinessIncomeQoq;}

    public void setNoncurrentDisposalIncome(Double noncurrentDisposalIncome){this.noncurrentDisposalIncome = noncurrentDisposalIncome;}
    public Double getNoncurrentDisposalIncome(){return noncurrentDisposalIncome;}

    public void setNoncurrentDisposalIncomeYoy(Double noncurrentDisposalIncomeYoy){this.noncurrentDisposalIncomeYoy = noncurrentDisposalIncomeYoy;}
    public Double getNoncurrentDisposalIncomeYoy(){return noncurrentDisposalIncomeYoy;}

    public void setNoncurrentDisposalIncomeQoq(Double noncurrentDisposalIncomeQoq){this.noncurrentDisposalIncomeQoq = noncurrentDisposalIncomeQoq;}
    public Double getNoncurrentDisposalIncomeQoq(){return noncurrentDisposalIncomeQoq;}

    public void setNonbusinessExpense(Double nonbusinessExpense){this.nonbusinessExpense = nonbusinessExpense;}
    public Double getNonbusinessExpense(){return nonbusinessExpense;}

    public void setNonbusinessExpenseYoy(Double nonbusinessExpenseYoy){this.nonbusinessExpenseYoy = nonbusinessExpenseYoy;}
    public Double getNonbusinessExpenseYoy(){return nonbusinessExpenseYoy;}

    public void setNonbusinessExpenseQoq(Double nonbusinessExpenseQoq){this.nonbusinessExpenseQoq = nonbusinessExpenseQoq;}
    public Double getNonbusinessExpenseQoq(){return nonbusinessExpenseQoq;}

    public void setNoncurrentDisposalLoss(Double noncurrentDisposalLoss){this.noncurrentDisposalLoss = noncurrentDisposalLoss;}
    public Double getNoncurrentDisposalLoss(){return noncurrentDisposalLoss;}

    public void setNoncurrentDisposalLossYoy(Double noncurrentDisposalLossYoy){this.noncurrentDisposalLossYoy = noncurrentDisposalLossYoy;}
    public Double getNoncurrentDisposalLossYoy(){return noncurrentDisposalLossYoy;}

    public void setNoncurrentDisposalLossQoq(Double noncurrentDisposalLossQoq){this.noncurrentDisposalLossQoq = noncurrentDisposalLossQoq;}
    public Double getNoncurrentDisposalLossQoq(){return noncurrentDisposalLossQoq;}

    public void setEffectTpOther(Double effectTpOther){this.effectTpOther = effectTpOther;}
    public Double getEffectTpOther(){return effectTpOther;}

    public void setEffectTpOtherYoy(Double effectTpOtherYoy){this.effectTpOtherYoy = effectTpOtherYoy;}
    public Double getEffectTpOtherYoy(){return effectTpOtherYoy;}

    public void setEffectTpOtherQoq(Double effectTpOtherQoq){this.effectTpOtherQoq = effectTpOtherQoq;}
    public Double getEffectTpOtherQoq(){return effectTpOtherQoq;}

    public void setTotalProfitBalance(Double totalProfitBalance){this.totalProfitBalance = totalProfitBalance;}
    public Double getTotalProfitBalance(){return totalProfitBalance;}

    public void setTotalProfitBalanceYoy(Double totalProfitBalanceYoy){this.totalProfitBalanceYoy = totalProfitBalanceYoy;}
    public Double getTotalProfitBalanceYoy(){return totalProfitBalanceYoy;}

    public void setTotalProfitBalanceQoq(Double totalProfitBalanceQoq){this.totalProfitBalanceQoq = totalProfitBalanceQoq;}
    public Double getTotalProfitBalanceQoq(){return totalProfitBalanceQoq;}

    public void setTotalProfit(Double totalProfit){this.totalProfit = totalProfit;}
    public Double getTotalProfit(){return totalProfit;}

    public void setTotalProfitYoy(Double totalProfitYoy){this.totalProfitYoy = totalProfitYoy;}
    public Double getTotalProfitYoy(){return totalProfitYoy;}

    public void setTotalProfitQoq(Double totalProfitQoq){this.totalProfitQoq = totalProfitQoq;}
    public Double getTotalProfitQoq(){return totalProfitQoq;}

    public void setIncomeTax(Double incomeTax){this.incomeTax = incomeTax;}
    public Double getIncomeTax(){return incomeTax;}

    public void setIncomeTaxYoy(Double incomeTaxYoy){this.incomeTaxYoy = incomeTaxYoy;}
    public Double getIncomeTaxYoy(){return incomeTaxYoy;}

    public void setIncomeTaxQoq(Double incomeTaxQoq){this.incomeTaxQoq = incomeTaxQoq;}
    public Double getIncomeTaxQoq(){return incomeTaxQoq;}

    public void setNetprofit(Double netprofit){this.netprofit = netprofit;}
    public Double getNetprofit(){return netprofit;}

    public void setNetprofitYoy(Double netprofitYoy){this.netprofitYoy = netprofitYoy;}
    public Double getNetprofitYoy(){return netprofitYoy;}

    public void setNetprofitQoq(Double netprofitQoq){this.netprofitQoq = netprofitQoq;}
    public Double getNetprofitQoq(){return netprofitQoq;}

    public void setContinuedNetprofit(Double continuedNetprofit){this.continuedNetprofit = continuedNetprofit;}
    public Double getContinuedNetprofit(){return continuedNetprofit;}

    public void setContinuedNetprofitYoy(Double continuedNetprofitYoy){this.continuedNetprofitYoy = continuedNetprofitYoy;}
    public Double getContinuedNetprofitYoy(){return continuedNetprofitYoy;}

    public void setContinuedNetprofitQoq(Double continuedNetprofitQoq){this.continuedNetprofitQoq = continuedNetprofitQoq;}
    public Double getContinuedNetprofitQoq(){return continuedNetprofitQoq;}

    public void setDiscontinuedNetprofit(Double discontinuedNetprofit){this.discontinuedNetprofit = discontinuedNetprofit;}
    public Double getDiscontinuedNetprofit(){return discontinuedNetprofit;}

    public void setDiscontinuedNetprofitYoy(Double discontinuedNetprofitYoy){this.discontinuedNetprofitYoy = discontinuedNetprofitYoy;}
    public Double getDiscontinuedNetprofitYoy(){return discontinuedNetprofitYoy;}

    public void setDiscontinuedNetprofitQoq(Double discontinuedNetprofitQoq){this.discontinuedNetprofitQoq = discontinuedNetprofitQoq;}
    public Double getDiscontinuedNetprofitQoq(){return discontinuedNetprofitQoq;}

    public void setParentNetprofit(Double parentNetprofit){this.parentNetprofit = parentNetprofit;}
    public Double getParentNetprofit(){return parentNetprofit;}

    public void setParentNetprofitYoy(Double parentNetprofitYoy){this.parentNetprofitYoy = parentNetprofitYoy;}
    public Double getParentNetprofitYoy(){return parentNetprofitYoy;}

    public void setParentNetprofitQoq(Double parentNetprofitQoq){this.parentNetprofitQoq = parentNetprofitQoq;}
    public Double getParentNetprofitQoq(){return parentNetprofitQoq;}

    public void setMinorityInterest(Double minorityInterest){this.minorityInterest = minorityInterest;}
    public Double getMinorityInterest(){return minorityInterest;}

    public void setMinorityInterestYoy(Double minorityInterestYoy){this.minorityInterestYoy = minorityInterestYoy;}
    public Double getMinorityInterestYoy(){return minorityInterestYoy;}

    public void setMinorityInterestQoq(Double minorityInterestQoq){this.minorityInterestQoq = minorityInterestQoq;}
    public Double getMinorityInterestQoq(){return minorityInterestQoq;}

    public void setDeductParentNetprofit(Double deductParentNetprofit){this.deductParentNetprofit = deductParentNetprofit;}
    public Double getDeductParentNetprofit(){return deductParentNetprofit;}

    public void setDeductParentNetprofitYoy(Double deductParentNetprofitYoy){this.deductParentNetprofitYoy = deductParentNetprofitYoy;}
    public Double getDeductParentNetprofitYoy(){return deductParentNetprofitYoy;}

    public void setDeductParentNetprofitQoq(Double deductParentNetprofitQoq){this.deductParentNetprofitQoq = deductParentNetprofitQoq;}
    public Double getDeductParentNetprofitQoq(){return deductParentNetprofitQoq;}

    public void setNetprofitOther(Double netprofitOther){this.netprofitOther = netprofitOther;}
    public Double getNetprofitOther(){return netprofitOther;}

    public void setNetprofitOtherYoy(Double netprofitOtherYoy){this.netprofitOtherYoy = netprofitOtherYoy;}
    public Double getNetprofitOtherYoy(){return netprofitOtherYoy;}

    public void setNetprofitOtherQoq(Double netprofitOtherQoq){this.netprofitOtherQoq = netprofitOtherQoq;}
    public Double getNetprofitOtherQoq(){return netprofitOtherQoq;}

    public void setNetprofitBalance(Double netprofitBalance){this.netprofitBalance = netprofitBalance;}
    public Double getNetprofitBalance(){return netprofitBalance;}

    public void setNetprofitBalanceYoy(Double netprofitBalanceYoy){this.netprofitBalanceYoy = netprofitBalanceYoy;}
    public Double getNetprofitBalanceYoy(){return netprofitBalanceYoy;}

    public void setNetprofitBalanceQoq(Double netprofitBalanceQoq){this.netprofitBalanceQoq = netprofitBalanceQoq;}
    public Double getNetprofitBalanceQoq(){return netprofitBalanceQoq;}

    public void setBasicEps(Double basicEps){this.basicEps = basicEps;}
    public Double getBasicEps(){return basicEps;}

    public void setDilutedEps(Double dilutedEps){this.dilutedEps = dilutedEps;}
    public Double getDilutedEps(){return dilutedEps;}

    public void setOtherCompreIncome(Double otherCompreIncome){this.otherCompreIncome = otherCompreIncome;}
    public Double getOtherCompreIncome(){return otherCompreIncome;}

    public void setOtherCompreIncomeYoy(Double otherCompreIncomeYoy){this.otherCompreIncomeYoy = otherCompreIncomeYoy;}
    public Double getOtherCompreIncomeYoy(){return otherCompreIncomeYoy;}

    public void setOtherCompreIncomeQoq(Double otherCompreIncomeQoq){this.otherCompreIncomeQoq = otherCompreIncomeQoq;}
    public Double getOtherCompreIncomeQoq(){return otherCompreIncomeQoq;}

    public void setParentOci(Double parentOci){this.parentOci = parentOci;}
    public Double getParentOci(){return parentOci;}

    public void setParentOciYoy(Double parentOciYoy){this.parentOciYoy = parentOciYoy;}
    public Double getParentOciYoy(){return parentOciYoy;}

    public void setParentOciQoq(Double parentOciQoq){this.parentOciQoq = parentOciQoq;}
    public Double getParentOciQoq(){return parentOciQoq;}

    public void setMinorityOci(Double minorityOci){this.minorityOci = minorityOci;}
    public Double getMinorityOci(){return minorityOci;}

    public void setMinorityOciYoy(Double minorityOciYoy){this.minorityOciYoy = minorityOciYoy;}
    public Double getMinorityOciYoy(){return minorityOciYoy;}

    public void setMinorityOciQoq(Double minorityOciQoq){this.minorityOciQoq = minorityOciQoq;}
    public Double getMinorityOciQoq(){return minorityOciQoq;}

    public void setTotalCompreIncome(Double totalCompreIncome){this.totalCompreIncome = totalCompreIncome;}
    public Double getTotalCompreIncome(){return totalCompreIncome;}

    public void setTotalCompreIncomeYoy(Double totalCompreIncomeYoy){this.totalCompreIncomeYoy = totalCompreIncomeYoy;}
    public Double getTotalCompreIncomeYoy(){return totalCompreIncomeYoy;}

    public void setTotalCompreIncomeQoq(Double totalCompreIncomeQoq){this.totalCompreIncomeQoq = totalCompreIncomeQoq;}
    public Double getTotalCompreIncomeQoq(){return totalCompreIncomeQoq;}

    public void setParentTci(Double parentTci){this.parentTci = parentTci;}
    public Double getParentTci(){return parentTci;}

    public void setParentTciYoy(Double parentTciYoy){this.parentTciYoy = parentTciYoy;}
    public Double getParentTciYoy(){return parentTciYoy;}

    public void setParentTciQoq(Double parentTciQoq){this.parentTciQoq = parentTciQoq;}
    public Double getParentTciQoq(){return parentTciQoq;}

    public void setMinorityTci(Double minorityTci){this.minorityTci = minorityTci;}
    public Double getMinorityTci(){return minorityTci;}

    public void setMinorityTciYoy(Double minorityTciYoy){this.minorityTciYoy = minorityTciYoy;}
    public Double getMinorityTciYoy(){return minorityTciYoy;}

    public void setMinorityTciQoq(Double minorityTciQoq){this.minorityTciQoq = minorityTciQoq;}
    public Double getMinorityTciQoq(){return minorityTciQoq;}

    public void setTotalOperateIncome(Double totalOperateIncome){this.totalOperateIncome = totalOperateIncome;}
    public Double getTotalOperateIncome(){return totalOperateIncome;}

    public void setTotalOperateIncomeYoy(Double totalOperateIncomeYoy){this.totalOperateIncomeYoy = totalOperateIncomeYoy;}
    public Double getTotalOperateIncomeYoy(){return totalOperateIncomeYoy;}

    public void setTotalOperateIncomeQoq(Double totalOperateIncomeQoq){this.totalOperateIncomeQoq = totalOperateIncomeQoq;}
    public Double getTotalOperateIncomeQoq(){return totalOperateIncomeQoq;}

    public void setInterestIncome(Double interestIncome){this.interestIncome = interestIncome;}
    public Double getInterestIncome(){return interestIncome;}

    public void setInterestIncomeYoy(Double interestIncomeYoy){this.interestIncomeYoy = interestIncomeYoy;}
    public Double getInterestIncomeYoy(){return interestIncomeYoy;}

    public void setInterestIncomeQoq(Double interestIncomeQoq){this.interestIncomeQoq = interestIncomeQoq;}
    public Double getInterestIncomeQoq(){return interestIncomeQoq;}

    public void setEarnedPremium(Double earnedPremium){this.earnedPremium = earnedPremium;}
    public Double getEarnedPremium(){return earnedPremium;}

    public void setEarnedPremiumYoy(Double earnedPremiumYoy){this.earnedPremiumYoy = earnedPremiumYoy;}
    public Double getEarnedPremiumYoy(){return earnedPremiumYoy;}

    public void setEarnedPremiumQoq(Double earnedPremiumQoq){this.earnedPremiumQoq = earnedPremiumQoq;}
    public Double getEarnedPremiumQoq(){return earnedPremiumQoq;}

    public void setFeeCommissionIncome(Double feeCommissionIncome){this.feeCommissionIncome = feeCommissionIncome;}
    public Double getFeeCommissionIncome(){return feeCommissionIncome;}

    public void setFeeCommissionIncomeYoy(Double feeCommissionIncomeYoy){this.feeCommissionIncomeYoy = feeCommissionIncomeYoy;}
    public Double getFeeCommissionIncomeYoy(){return feeCommissionIncomeYoy;}

    public void setFeeCommissionIncomeQoq(Double feeCommissionIncomeQoq){this.feeCommissionIncomeQoq = feeCommissionIncomeQoq;}
    public Double getFeeCommissionIncomeQoq(){return feeCommissionIncomeQoq;}

    public void setToiOther(Double toiOther){this.toiOther = toiOther;}
    public Double getToiOther(){return toiOther;}

    public void setToiOtherYoy(Double toiOtherYoy){this.toiOtherYoy = toiOtherYoy;}
    public Double getToiOtherYoy(){return toiOtherYoy;}

    public void setToiOtherQoq(Double toiOtherQoq){this.toiOtherQoq = toiOtherQoq;}
    public Double getToiOtherQoq(){return toiOtherQoq;}

    public void setTotalOperateCost(Double totalOperateCost){this.totalOperateCost = totalOperateCost;}
    public Double getTotalOperateCost(){return totalOperateCost;}

    public void setTotalOperateCostYoy(Double totalOperateCostYoy){this.totalOperateCostYoy = totalOperateCostYoy;}
    public Double getTotalOperateCostYoy(){return totalOperateCostYoy;}

    public void setTotalOperateCostQoq(Double totalOperateCostQoq){this.totalOperateCostQoq = totalOperateCostQoq;}
    public Double getTotalOperateCostQoq(){return totalOperateCostQoq;}

    public void setOperateCost(Double operateCost){this.operateCost = operateCost;}
    public Double getOperateCost(){return operateCost;}

    public void setOperateCostYoy(Double operateCostYoy){this.operateCostYoy = operateCostYoy;}
    public Double getOperateCostYoy(){return operateCostYoy;}

    public void setOperateCostQoq(Double operateCostQoq){this.operateCostQoq = operateCostQoq;}
    public Double getOperateCostQoq(){return operateCostQoq;}

    public void setInterestExpense(Double interestExpense){this.interestExpense = interestExpense;}
    public Double getInterestExpense(){return interestExpense;}

    public void setInterestExpenseYoy(Double interestExpenseYoy){this.interestExpenseYoy = interestExpenseYoy;}
    public Double getInterestExpenseYoy(){return interestExpenseYoy;}

    public void setInterestExpenseQoq(Double interestExpenseQoq){this.interestExpenseQoq = interestExpenseQoq;}
    public Double getInterestExpenseQoq(){return interestExpenseQoq;}

    public void setFeeCommissionExpense(Double feeCommissionExpense){this.feeCommissionExpense = feeCommissionExpense;}
    public Double getFeeCommissionExpense(){return feeCommissionExpense;}

    public void setFeeCommissionExpenseYoy(Double feeCommissionExpenseYoy){this.feeCommissionExpenseYoy = feeCommissionExpenseYoy;}
    public Double getFeeCommissionExpenseYoy(){return feeCommissionExpenseYoy;}

    public void setFeeCommissionExpenseQoq(Double feeCommissionExpenseQoq){this.feeCommissionExpenseQoq = feeCommissionExpenseQoq;}
    public Double getFeeCommissionExpenseQoq(){return feeCommissionExpenseQoq;}

    public void setSurrenderValue(Double surrenderValue){this.surrenderValue = surrenderValue;}
    public Double getSurrenderValue(){return surrenderValue;}

    public void setSurrenderValueYoy(Double surrenderValueYoy){this.surrenderValueYoy = surrenderValueYoy;}
    public Double getSurrenderValueYoy(){return surrenderValueYoy;}

    public void setSurrenderValueQoq(Double surrenderValueQoq){this.surrenderValueQoq = surrenderValueQoq;}
    public Double getSurrenderValueQoq(){return surrenderValueQoq;}

    public void setNetCompensateExpense(Double netCompensateExpense){this.netCompensateExpense = netCompensateExpense;}
    public Double getNetCompensateExpense(){return netCompensateExpense;}

    public void setNetCompensateExpenseYoy(Double netCompensateExpenseYoy){this.netCompensateExpenseYoy = netCompensateExpenseYoy;}
    public Double getNetCompensateExpenseYoy(){return netCompensateExpenseYoy;}

    public void setNetCompensateExpenseQoq(Double netCompensateExpenseQoq){this.netCompensateExpenseQoq = netCompensateExpenseQoq;}
    public Double getNetCompensateExpenseQoq(){return netCompensateExpenseQoq;}

    public void setNetContractReserve(Double netContractReserve){this.netContractReserve = netContractReserve;}
    public Double getNetContractReserve(){return netContractReserve;}

    public void setNetContractReserveYoy(Double netContractReserveYoy){this.netContractReserveYoy = netContractReserveYoy;}
    public Double getNetContractReserveYoy(){return netContractReserveYoy;}

    public void setNetContractReserveQoq(Double netContractReserveQoq){this.netContractReserveQoq = netContractReserveQoq;}
    public Double getNetContractReserveQoq(){return netContractReserveQoq;}

    public void setPolicyBonusExpense(Double policyBonusExpense){this.policyBonusExpense = policyBonusExpense;}
    public Double getPolicyBonusExpense(){return policyBonusExpense;}

    public void setPolicyBonusExpenseYoy(Double policyBonusExpenseYoy){this.policyBonusExpenseYoy = policyBonusExpenseYoy;}
    public Double getPolicyBonusExpenseYoy(){return policyBonusExpenseYoy;}

    public void setPolicyBonusExpenseQoq(Double policyBonusExpenseQoq){this.policyBonusExpenseQoq = policyBonusExpenseQoq;}
    public Double getPolicyBonusExpenseQoq(){return policyBonusExpenseQoq;}

    public void setReinsureExpense(Double reinsureExpense){this.reinsureExpense = reinsureExpense;}
    public Double getReinsureExpense(){return reinsureExpense;}

    public void setReinsureExpenseYoy(Double reinsureExpenseYoy){this.reinsureExpenseYoy = reinsureExpenseYoy;}
    public Double getReinsureExpenseYoy(){return reinsureExpenseYoy;}

    public void setReinsureExpenseQoq(Double reinsureExpenseQoq){this.reinsureExpenseQoq = reinsureExpenseQoq;}
    public Double getReinsureExpenseQoq(){return reinsureExpenseQoq;}

    public void setSaleExpense(Double saleExpense){this.saleExpense = saleExpense;}
    public Double getSaleExpense(){return saleExpense;}

    public void setSaleExpenseYoy(Double saleExpenseYoy){this.saleExpenseYoy = saleExpenseYoy;}
    public Double getSaleExpenseYoy(){return saleExpenseYoy;}

    public void setSaleExpenseQoq(Double saleExpenseQoq){this.saleExpenseQoq = saleExpenseQoq;}
    public Double getSaleExpenseQoq(){return saleExpenseQoq;}

    public void setManageExpense(Double manageExpense){this.manageExpense = manageExpense;}
    public Double getManageExpense(){return manageExpense;}

    public void setManageExpenseYoy(Double manageExpenseYoy){this.manageExpenseYoy = manageExpenseYoy;}
    public Double getManageExpenseYoy(){return manageExpenseYoy;}

    public void setManageExpenseQoq(Double manageExpenseQoq){this.manageExpenseQoq = manageExpenseQoq;}
    public Double getManageExpenseQoq(){return manageExpenseQoq;}

    public void setResearchExpense(Double researchExpense){this.researchExpense = researchExpense;}
    public Double getResearchExpense(){return researchExpense;}

    public void setResearchExpenseYoy(Double researchExpenseYoy){this.researchExpenseYoy = researchExpenseYoy;}
    public Double getResearchExpenseYoy(){return researchExpenseYoy;}

    public void setResearchExpenseQoq(Double researchExpenseQoq){this.researchExpenseQoq = researchExpenseQoq;}
    public Double getResearchExpenseQoq(){return researchExpenseQoq;}

    public void setFinanceExpense(Double financeExpense){this.financeExpense = financeExpense;}
    public Double getFinanceExpense(){return financeExpense;}

    public void setFinanceExpenseYoy(Double financeExpenseYoy){this.financeExpenseYoy = financeExpenseYoy;}
    public Double getFinanceExpenseYoy(){return financeExpenseYoy;}

    public void setFinanceExpenseQoq(Double financeExpenseQoq){this.financeExpenseQoq = financeExpenseQoq;}
    public Double getFinanceExpenseQoq(){return financeExpenseQoq;}

    public void setFeInterestExpense(Double feInterestExpense){this.feInterestExpense = feInterestExpense;}
    public Double getFeInterestExpense(){return feInterestExpense;}

    public void setFeInterestExpenseYoy(Double feInterestExpenseYoy){this.feInterestExpenseYoy = feInterestExpenseYoy;}
    public Double getFeInterestExpenseYoy(){return feInterestExpenseYoy;}

    public void setFeInterestExpenseQoq(Double feInterestExpenseQoq){this.feInterestExpenseQoq = feInterestExpenseQoq;}
    public Double getFeInterestExpenseQoq(){return feInterestExpenseQoq;}

    public void setFeInterestIncome(Double feInterestIncome){this.feInterestIncome = feInterestIncome;}
    public Double getFeInterestIncome(){return feInterestIncome;}

    public void setFeInterestIncomeYoy(Double feInterestIncomeYoy){this.feInterestIncomeYoy = feInterestIncomeYoy;}
    public Double getFeInterestIncomeYoy(){return feInterestIncomeYoy;}

    public void setFeInterestIncomeQoq(Double feInterestIncomeQoq){this.feInterestIncomeQoq = feInterestIncomeQoq;}
    public Double getFeInterestIncomeQoq(){return feInterestIncomeQoq;}

    public void setTocOther(Double tocOther){this.tocOther = tocOther;}
    public Double getTocOther(){return tocOther;}

    public void setTocOtherYoy(Double tocOtherYoy){this.tocOtherYoy = tocOtherYoy;}
    public Double getTocOtherYoy(){return tocOtherYoy;}

    public void setTocOtherQoq(Double tocOtherQoq){this.tocOtherQoq = tocOtherQoq;}
    public Double getTocOtherQoq(){return tocOtherQoq;}

    public void setNetExposureIncome(Double netExposureIncome){this.netExposureIncome = netExposureIncome;}
    public Double getNetExposureIncome(){return netExposureIncome;}

    public void setNetExposureIncomeYoy(Double netExposureIncomeYoy){this.netExposureIncomeYoy = netExposureIncomeYoy;}
    public Double getNetExposureIncomeYoy(){return netExposureIncomeYoy;}

    public void setNetExposureIncomeQoq(Double netExposureIncomeQoq){this.netExposureIncomeQoq = netExposureIncomeQoq;}
    public Double getNetExposureIncomeQoq(){return netExposureIncomeQoq;}

    public void setAssetImpairmentIncome(Double assetImpairmentIncome){this.assetImpairmentIncome = assetImpairmentIncome;}
    public Double getAssetImpairmentIncome(){return assetImpairmentIncome;}

    public void setAssetImpairmentIncomeYoy(Double assetImpairmentIncomeYoy){this.assetImpairmentIncomeYoy = assetImpairmentIncomeYoy;}
    public Double getAssetImpairmentIncomeYoy(){return assetImpairmentIncomeYoy;}

    public void setAssetImpairmentIncomeQoq(Double assetImpairmentIncomeQoq){this.assetImpairmentIncomeQoq = assetImpairmentIncomeQoq;}
    public Double getAssetImpairmentIncomeQoq(){return assetImpairmentIncomeQoq;}

    public void setCreditImpairmentIncome(Double creditImpairmentIncome){this.creditImpairmentIncome = creditImpairmentIncome;}
    public Double getCreditImpairmentIncome(){return creditImpairmentIncome;}

    public void setCreditImpairmentIncomeYoy(Double creditImpairmentIncomeYoy){this.creditImpairmentIncomeYoy = creditImpairmentIncomeYoy;}
    public Double getCreditImpairmentIncomeYoy(){return creditImpairmentIncomeYoy;}

    public void setCreditImpairmentIncomeQoq(Double creditImpairmentIncomeQoq){this.creditImpairmentIncomeQoq = creditImpairmentIncomeQoq;}
    public Double getCreditImpairmentIncomeQoq(){return creditImpairmentIncomeQoq;}

    public void setEffectNetprofitOther(Double effectNetprofitOther){this.effectNetprofitOther = effectNetprofitOther;}
    public Double getEffectNetprofitOther(){return effectNetprofitOther;}

    public void setEffectNetprofitOtherYoy(Double effectNetprofitOtherYoy){this.effectNetprofitOtherYoy = effectNetprofitOtherYoy;}
    public Double getEffectNetprofitOtherYoy(){return effectNetprofitOtherYoy;}

    public void setEffectNetprofitOtherQoq(Double effectNetprofitOtherQoq){this.effectNetprofitOtherQoq = effectNetprofitOtherQoq;}
    public Double getEffectNetprofitOtherQoq(){return effectNetprofitOtherQoq;}

    public void setUnconfirmInvestLoss(Double unconfirmInvestLoss){this.unconfirmInvestLoss = unconfirmInvestLoss;}
    public Double getUnconfirmInvestLoss(){return unconfirmInvestLoss;}

    public void setUnconfirmInvestLossYoy(Double unconfirmInvestLossYoy){this.unconfirmInvestLossYoy = unconfirmInvestLossYoy;}
    public Double getUnconfirmInvestLossYoy(){return unconfirmInvestLossYoy;}

    public void setUnconfirmInvestLossQoq(Double unconfirmInvestLossQoq){this.unconfirmInvestLossQoq = unconfirmInvestLossQoq;}
    public Double getUnconfirmInvestLossQoq(){return unconfirmInvestLossQoq;}

    public void setPrecombineProfit(Double precombineProfit){this.precombineProfit = precombineProfit;}
    public Double getPrecombineProfit(){return precombineProfit;}

    public void setPrecombineProfitYoy(Double precombineProfitYoy){this.precombineProfitYoy = precombineProfitYoy;}
    public Double getPrecombineProfitYoy(){return precombineProfitYoy;}

    public void setPrecombineProfitQoq(Double precombineProfitQoq){this.precombineProfitQoq = precombineProfitQoq;}
    public Double getPrecombineProfitQoq(){return precombineProfitQoq;}

    public void setEffectNetprofitBalance(Double effectNetprofitBalance){this.effectNetprofitBalance = effectNetprofitBalance;}
    public Double getEffectNetprofitBalance(){return effectNetprofitBalance;}

    public void setEffectNetprofitBalanceYoy(Double effectNetprofitBalanceYoy){this.effectNetprofitBalanceYoy = effectNetprofitBalanceYoy;}
    public Double getEffectNetprofitBalanceYoy(){return effectNetprofitBalanceYoy;}

    public void setEffectNetprofitBalanceQoq(Double effectNetprofitBalanceQoq){this.effectNetprofitBalanceQoq = effectNetprofitBalanceQoq;}
    public Double getEffectNetprofitBalanceQoq(){return effectNetprofitBalanceQoq;}

    public void setInsuranceIncome(Double insuranceIncome){this.insuranceIncome = insuranceIncome;}
    public Double getInsuranceIncome(){return insuranceIncome;}

    public void setInsuranceIncomeYoy(Double insuranceIncomeYoy){this.insuranceIncomeYoy = insuranceIncomeYoy;}
    public Double getInsuranceIncomeYoy(){return insuranceIncomeYoy;}

    public void setInsuranceIncomeQoq(Double insuranceIncomeQoq){this.insuranceIncomeQoq = insuranceIncomeQoq;}
    public Double getInsuranceIncomeQoq(){return insuranceIncomeQoq;}

    public void setReinsureIncome(Double reinsureIncome){this.reinsureIncome = reinsureIncome;}
    public Double getReinsureIncome(){return reinsureIncome;}

    public void setReinsureIncomeYoy(Double reinsureIncomeYoy){this.reinsureIncomeYoy = reinsureIncomeYoy;}
    public Double getReinsureIncomeYoy(){return reinsureIncomeYoy;}

    public void setReinsureIncomeQoq(Double reinsureIncomeQoq){this.reinsureIncomeQoq = reinsureIncomeQoq;}
    public Double getReinsureIncomeQoq(){return reinsureIncomeQoq;}

    public void setReinsurePremium(Double reinsurePremium){this.reinsurePremium = reinsurePremium;}
    public Double getReinsurePremium(){return reinsurePremium;}

    public void setReinsurePremiumYoy(Double reinsurePremiumYoy){this.reinsurePremiumYoy = reinsurePremiumYoy;}
    public Double getReinsurePremiumYoy(){return reinsurePremiumYoy;}

    public void setReinsurePremiumQoq(Double reinsurePremiumQoq){this.reinsurePremiumQoq = reinsurePremiumQoq;}
    public Double getReinsurePremiumQoq(){return reinsurePremiumQoq;}

    public void setExtractUnexpireReserve(Double extractUnexpireReserve){this.extractUnexpireReserve = extractUnexpireReserve;}
    public Double getExtractUnexpireReserve(){return extractUnexpireReserve;}

    public void setExtractUnexpireReserveYoy(Double extractUnexpireReserveYoy){this.extractUnexpireReserveYoy = extractUnexpireReserveYoy;}
    public Double getExtractUnexpireReserveYoy(){return extractUnexpireReserveYoy;}

    public void setExtractUnexpireReserveQoq(Double extractUnexpireReserveQoq){this.extractUnexpireReserveQoq = extractUnexpireReserveQoq;}
    public Double getExtractUnexpireReserveQoq(){return extractUnexpireReserveQoq;}

    public void setEarnedPremiumBalance(Double earnedPremiumBalance){this.earnedPremiumBalance = earnedPremiumBalance;}
    public Double getEarnedPremiumBalance(){return earnedPremiumBalance;}

    public void setEarnedPremiumBalanceYoy(Double earnedPremiumBalanceYoy){this.earnedPremiumBalanceYoy = earnedPremiumBalanceYoy;}
    public Double getEarnedPremiumBalanceYoy(){return earnedPremiumBalanceYoy;}

    public void setEarnedPremiumBalanceQoq(Double earnedPremiumBalanceQoq){this.earnedPremiumBalanceQoq = earnedPremiumBalanceQoq;}
    public Double getEarnedPremiumBalanceQoq(){return earnedPremiumBalanceQoq;}

    public void setBankInterestNi(Double bankInterestNi){this.bankInterestNi = bankInterestNi;}
    public Double getBankInterestNi(){return bankInterestNi;}

    public void setBankInterestNiYoy(Double bankInterestNiYoy){this.bankInterestNiYoy = bankInterestNiYoy;}
    public Double getBankInterestNiYoy(){return bankInterestNiYoy;}

    public void setBankInterestNiQoq(Double bankInterestNiQoq){this.bankInterestNiQoq = bankInterestNiQoq;}
    public Double getBankInterestNiQoq(){return bankInterestNiQoq;}

    public void setBankInterestIncome(Double bankInterestIncome){this.bankInterestIncome = bankInterestIncome;}
    public Double getBankInterestIncome(){return bankInterestIncome;}

    public void setBankInterestIncomeYoy(Double bankInterestIncomeYoy){this.bankInterestIncomeYoy = bankInterestIncomeYoy;}
    public Double getBankInterestIncomeYoy(){return bankInterestIncomeYoy;}

    public void setBankInterestIncomeQoq(Double bankInterestIncomeQoq){this.bankInterestIncomeQoq = bankInterestIncomeQoq;}
    public Double getBankInterestIncomeQoq(){return bankInterestIncomeQoq;}

    public void setBankInterestExpense(Double bankInterestExpense){this.bankInterestExpense = bankInterestExpense;}
    public Double getBankInterestExpense(){return bankInterestExpense;}

    public void setBankInterestExpenseYoy(Double bankInterestExpenseYoy){this.bankInterestExpenseYoy = bankInterestExpenseYoy;}
    public Double getBankInterestExpenseYoy(){return bankInterestExpenseYoy;}

    public void setBankInterestExpenseQoq(Double bankInterestExpenseQoq){this.bankInterestExpenseQoq = bankInterestExpenseQoq;}
    public Double getBankInterestExpenseQoq(){return bankInterestExpenseQoq;}

    public void setUninsuranceCni(Double uninsuranceCni){this.uninsuranceCni = uninsuranceCni;}
    public Double getUninsuranceCni(){return uninsuranceCni;}

    public void setUninsuranceCniYoy(Double uninsuranceCniYoy){this.uninsuranceCniYoy = uninsuranceCniYoy;}
    public Double getUninsuranceCniYoy(){return uninsuranceCniYoy;}

    public void setUninsuranceCniQoq(Double uninsuranceCniQoq){this.uninsuranceCniQoq = uninsuranceCniQoq;}
    public Double getUninsuranceCniQoq(){return uninsuranceCniQoq;}

    public void setUninsuranceCi(Double uninsuranceCi){this.uninsuranceCi = uninsuranceCi;}
    public Double getUninsuranceCi(){return uninsuranceCi;}

    public void setUninsuranceCiYoy(Double uninsuranceCiYoy){this.uninsuranceCiYoy = uninsuranceCiYoy;}
    public Double getUninsuranceCiYoy(){return uninsuranceCiYoy;}

    public void setUninsuranceCiQoq(Double uninsuranceCiQoq){this.uninsuranceCiQoq = uninsuranceCiQoq;}
    public Double getUninsuranceCiQoq(){return uninsuranceCiQoq;}

    public void setUninsuranceCe(Double uninsuranceCe){this.uninsuranceCe = uninsuranceCe;}
    public Double getUninsuranceCe(){return uninsuranceCe;}

    public void setUninsuranceCeYoy(Double uninsuranceCeYoy){this.uninsuranceCeYoy = uninsuranceCeYoy;}
    public Double getUninsuranceCeYoy(){return uninsuranceCeYoy;}

    public void setUninsuranceCeQoq(Double uninsuranceCeQoq){this.uninsuranceCeQoq = uninsuranceCeQoq;}
    public Double getUninsuranceCeQoq(){return uninsuranceCeQoq;}

    public void setFairvalueChange(Double fairvalueChange){this.fairvalueChange = fairvalueChange;}
    public Double getFairvalueChange(){return fairvalueChange;}

    public void setFairvalueChangeYoy(Double fairvalueChangeYoy){this.fairvalueChangeYoy = fairvalueChangeYoy;}
    public Double getFairvalueChangeYoy(){return fairvalueChangeYoy;}

    public void setFairvalueChangeQoq(Double fairvalueChangeQoq){this.fairvalueChangeQoq = fairvalueChangeQoq;}
    public Double getFairvalueChangeQoq(){return fairvalueChangeQoq;}

    public void setAfaFairvalueChange(Double afaFairvalueChange){this.afaFairvalueChange = afaFairvalueChange;}
    public Double getAfaFairvalueChange(){return afaFairvalueChange;}

    public void setAfaFairvalueChangeYoy(Double afaFairvalueChangeYoy){this.afaFairvalueChangeYoy = afaFairvalueChangeYoy;}
    public Double getAfaFairvalueChangeYoy(){return afaFairvalueChangeYoy;}

    public void setAfaFairvalueChangeQoq(Double afaFairvalueChangeQoq){this.afaFairvalueChangeQoq = afaFairvalueChangeQoq;}
    public Double getAfaFairvalueChangeQoq(){return afaFairvalueChangeQoq;}

    public void setCompensateExpense(Double compensateExpense){this.compensateExpense = compensateExpense;}
    public Double getCompensateExpense(){return compensateExpense;}

    public void setCompensateExpenseYoy(Double compensateExpenseYoy){this.compensateExpenseYoy = compensateExpenseYoy;}
    public Double getCompensateExpenseYoy(){return compensateExpenseYoy;}

    public void setCompensateExpenseQoq(Double compensateExpenseQoq){this.compensateExpenseQoq = compensateExpenseQoq;}
    public Double getCompensateExpenseQoq(){return compensateExpenseQoq;}

    public void setAmortizeCompensateExpense(Double amortizeCompensateExpense){this.amortizeCompensateExpense = amortizeCompensateExpense;}
    public Double getAmortizeCompensateExpense(){return amortizeCompensateExpense;}

    public void setAmortizeCompensateExpenseYoy(Double amortizeCompensateExpenseYoy){this.amortizeCompensateExpenseYoy = amortizeCompensateExpenseYoy;}
    public Double getAmortizeCompensateExpenseYoy(){return amortizeCompensateExpenseYoy;}

    public void setAmortizeCompensateExpenseQoq(Double amortizeCompensateExpenseQoq){this.amortizeCompensateExpenseQoq = amortizeCompensateExpenseQoq;}
    public Double getAmortizeCompensateExpenseQoq(){return amortizeCompensateExpenseQoq;}

    public void setExtractInsuranceReserve(Double extractInsuranceReserve){this.extractInsuranceReserve = extractInsuranceReserve;}
    public Double getExtractInsuranceReserve(){return extractInsuranceReserve;}

    public void setExtractInsuranceReserveYoy(Double extractInsuranceReserveYoy){this.extractInsuranceReserveYoy = extractInsuranceReserveYoy;}
    public Double getExtractInsuranceReserveYoy(){return extractInsuranceReserveYoy;}

    public void setExtractInsuranceReserveQoq(Double extractInsuranceReserveQoq){this.extractInsuranceReserveQoq = extractInsuranceReserveQoq;}
    public Double getExtractInsuranceReserveQoq(){return extractInsuranceReserveQoq;}

    public void setAmortizeInsuranceReserve(Double amortizeInsuranceReserve){this.amortizeInsuranceReserve = amortizeInsuranceReserve;}
    public Double getAmortizeInsuranceReserve(){return amortizeInsuranceReserve;}

    public void setAmortizeInsuranceReserveYoy(Double amortizeInsuranceReserveYoy){this.amortizeInsuranceReserveYoy = amortizeInsuranceReserveYoy;}
    public Double getAmortizeInsuranceReserveYoy(){return amortizeInsuranceReserveYoy;}

    public void setAmortizeInsuranceReserveQoq(Double amortizeInsuranceReserveQoq){this.amortizeInsuranceReserveQoq = amortizeInsuranceReserveQoq;}
    public Double getAmortizeInsuranceReserveQoq(){return amortizeInsuranceReserveQoq;}

    public void setAmortizeReinsureExpense(Double amortizeReinsureExpense){this.amortizeReinsureExpense = amortizeReinsureExpense;}
    public Double getAmortizeReinsureExpense(){return amortizeReinsureExpense;}

    public void setAmortizeReinsureExpenseYoy(Double amortizeReinsureExpenseYoy){this.amortizeReinsureExpenseYoy = amortizeReinsureExpenseYoy;}
    public Double getAmortizeReinsureExpenseYoy(){return amortizeReinsureExpenseYoy;}

    public void setAmortizeReinsureExpenseQoq(Double amortizeReinsureExpenseQoq){this.amortizeReinsureExpenseQoq = amortizeReinsureExpenseQoq;}
    public Double getAmortizeReinsureExpenseQoq(){return amortizeReinsureExpenseQoq;}

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
        return Objects.equals(securityCode, that.securityCode) && Objects.equals(reportType, that.reportType) && Objects.equals(reportDate, that.reportDate) && Objects.equals(opinionType, that.opinionType) && Objects.equals(osopinionType, that.osopinionType) && Objects.equals(operateIncome, that.operateIncome) && Objects.equals(operateIncomeYoy, that.operateIncomeYoy) && Objects.equals(operateIncomeQoq, that.operateIncomeQoq) && Objects.equals(feeCommissionNi, that.feeCommissionNi) && Objects.equals(feeCommissionNiYoy, that.feeCommissionNiYoy) && Objects.equals(feeCommissionNiQoq, that.feeCommissionNiQoq) && Objects.equals(agentSecurityNi, that.agentSecurityNi) && Objects.equals(agentSecurityNiYoy, that.agentSecurityNiYoy) && Objects.equals(agentSecurityNiQoq, that.agentSecurityNiQoq) && Objects.equals(securityUnderwriteNi, that.securityUnderwriteNi) && Objects.equals(securityUnderwriteNiYoy, that.securityUnderwriteNiYoy) && Objects.equals(securityUnderwriteNiQoq, that.securityUnderwriteNiQoq) && Objects.equals(assetManageNi, that.assetManageNi) && Objects.equals(assetManageNiYoy, that.assetManageNiYoy) && Objects.equals(assetManageNiQoq, that.assetManageNiQoq) && Objects.equals(financeAdviserNi, that.financeAdviserNi) && Objects.equals(financeAdviserNiYoy, that.financeAdviserNiYoy) && Objects.equals(financeAdviserNiQoq, that.financeAdviserNiQoq) && Objects.equals(recommendNi, that.recommendNi) && Objects.equals(recommendNiYoy, that.recommendNiYoy) && Objects.equals(recommendNiQoq, that.recommendNiQoq) && Objects.equals(fundManageNi, that.fundManageNi) && Objects.equals(fundManageNiYoy, that.fundManageNiYoy) && Objects.equals(fundManageNiQoq, that.fundManageNiQoq) && Objects.equals(fundSaleNi, that.fundSaleNi) && Objects.equals(fundSaleNiYoy, that.fundSaleNiYoy) && Objects.equals(fundSaleNiQoq, that.fundSaleNiQoq) && Objects.equals(brokerNi, that.brokerNi) && Objects.equals(brokerNiYoy, that.brokerNiYoy) && Objects.equals(brokerNiQoq, that.brokerNiQoq) && Objects.equals(commissionNiOther, that.commissionNiOther) && Objects.equals(commissionNiOtherYoy, that.commissionNiOtherYoy) && Objects.equals(commissionNiOtherQoq, that.commissionNiOtherQoq) && Objects.equals(interestNi, that.interestNi) && Objects.equals(interestNiYoy, that.interestNiYoy) && Objects.equals(interestNiQoq, that.interestNiQoq) && Objects.equals(investIncome, that.investIncome) && Objects.equals(investIncomeYoy, that.investIncomeYoy) && Objects.equals(investIncomeQoq, that.investIncomeQoq) && Objects.equals(investJointIncome, that.investJointIncome) && Objects.equals(investJointIncomeYoy, that.investJointIncomeYoy) && Objects.equals(investJointIncomeQoq, that.investJointIncomeQoq) && Objects.equals(fairvalueChangeIncome, that.fairvalueChangeIncome) && Objects.equals(fairvalueChangeIncomeYoy, that.fairvalueChangeIncomeYoy) && Objects.equals(fairvalueChangeIncomeQoq, that.fairvalueChangeIncomeQoq) && Objects.equals(exchangeIncome, that.exchangeIncome) && Objects.equals(exchangeIncomeYoy, that.exchangeIncomeYoy) && Objects.equals(exchangeIncomeQoq, that.exchangeIncomeQoq) && Objects.equals(otherBusinessIncome, that.otherBusinessIncome) && Objects.equals(otherBusinessIncomeYoy, that.otherBusinessIncomeYoy) && Objects.equals(otherBusinessIncomeQoq, that.otherBusinessIncomeQoq) && Objects.equals(assetDisposalIncome, that.assetDisposalIncome) && Objects.equals(assetDisposalIncomeYoy, that.assetDisposalIncomeYoy) && Objects.equals(assetDisposalIncomeQoq, that.assetDisposalIncomeQoq) && Objects.equals(otherIncome, that.otherIncome) && Objects.equals(otherIncomeYoy, that.otherIncomeYoy) && Objects.equals(otherIncomeQoq, that.otherIncomeQoq) && Objects.equals(operateIncomeOther, that.operateIncomeOther) && Objects.equals(operateIncomeOtherYoy, that.operateIncomeOtherYoy) && Objects.equals(operateIncomeOtherQoq, that.operateIncomeOtherQoq) && Objects.equals(operateIncomeBalance, that.operateIncomeBalance) && Objects.equals(operateIncomeBalanceYoy, that.operateIncomeBalanceYoy) && Objects.equals(operateIncomeBalanceQoq, that.operateIncomeBalanceQoq) && Objects.equals(operateExpense, that.operateExpense) && Objects.equals(operateExpenseYoy, that.operateExpenseYoy) && Objects.equals(operateExpenseQoq, that.operateExpenseQoq) && Objects.equals(operateTaxAdd, that.operateTaxAdd) && Objects.equals(operateTaxAddYoy, that.operateTaxAddYoy) && Objects.equals(operateTaxAddQoq, that.operateTaxAddQoq) && Objects.equals(businessManageExpense, that.businessManageExpense) && Objects.equals(businessManageExpenseYoy, that.businessManageExpenseYoy) && Objects.equals(businessManageExpenseQoq, that.businessManageExpenseQoq) && Objects.equals(assetImpairmentLoss, that.assetImpairmentLoss) && Objects.equals(assetImpairmentLossYoy, that.assetImpairmentLossYoy) && Objects.equals(assetImpairmentLossQoq, that.assetImpairmentLossQoq) && Objects.equals(creditImpairmentLoss, that.creditImpairmentLoss) && Objects.equals(creditImpairmentLossYoy, that.creditImpairmentLossYoy) && Objects.equals(creditImpairmentLossQoq, that.creditImpairmentLossQoq) && Objects.equals(otherBusinessCost, that.otherBusinessCost) && Objects.equals(otherBusinessCostYoy, that.otherBusinessCostYoy) && Objects.equals(otherBusinessCostQoq, that.otherBusinessCostQoq) && Objects.equals(operateExpenseOther, that.operateExpenseOther) && Objects.equals(operateExpenseOtherYoy, that.operateExpenseOtherYoy) && Objects.equals(operateExpenseOtherQoq, that.operateExpenseOtherQoq) && Objects.equals(operateExpenseBalance, that.operateExpenseBalance) && Objects.equals(operateExpenseBalanceYoy, that.operateExpenseBalanceYoy) && Objects.equals(operateExpenseBalanceQoq, that.operateExpenseBalanceQoq) && Objects.equals(operateProfitOther, that.operateProfitOther) && Objects.equals(operateProfitOtherYoy, that.operateProfitOtherYoy) && Objects.equals(operateProfitOtherQoq, that.operateProfitOtherQoq) && Objects.equals(operateProfitBalance, that.operateProfitBalance) && Objects.equals(operateProfitBalanceYoy, that.operateProfitBalanceYoy) && Objects.equals(operateProfitBalanceQoq, that.operateProfitBalanceQoq) && Objects.equals(operateProfit, that.operateProfit) && Objects.equals(operateProfitYoy, that.operateProfitYoy) && Objects.equals(operateProfitQoq, that.operateProfitQoq) && Objects.equals(nonbusinessIncome, that.nonbusinessIncome) && Objects.equals(nonbusinessIncomeYoy, that.nonbusinessIncomeYoy) && Objects.equals(nonbusinessIncomeQoq, that.nonbusinessIncomeQoq) && Objects.equals(noncurrentDisposalIncome, that.noncurrentDisposalIncome) && Objects.equals(noncurrentDisposalIncomeYoy, that.noncurrentDisposalIncomeYoy) && Objects.equals(noncurrentDisposalIncomeQoq, that.noncurrentDisposalIncomeQoq) && Objects.equals(nonbusinessExpense, that.nonbusinessExpense) && Objects.equals(nonbusinessExpenseYoy, that.nonbusinessExpenseYoy) && Objects.equals(nonbusinessExpenseQoq, that.nonbusinessExpenseQoq) && Objects.equals(noncurrentDisposalLoss, that.noncurrentDisposalLoss) && Objects.equals(noncurrentDisposalLossYoy, that.noncurrentDisposalLossYoy) && Objects.equals(noncurrentDisposalLossQoq, that.noncurrentDisposalLossQoq) && Objects.equals(effectTpOther, that.effectTpOther) && Objects.equals(effectTpOtherYoy, that.effectTpOtherYoy) && Objects.equals(effectTpOtherQoq, that.effectTpOtherQoq) && Objects.equals(totalProfitBalance, that.totalProfitBalance) && Objects.equals(totalProfitBalanceYoy, that.totalProfitBalanceYoy) && Objects.equals(totalProfitBalanceQoq, that.totalProfitBalanceQoq) && Objects.equals(totalProfit, that.totalProfit) && Objects.equals(totalProfitYoy, that.totalProfitYoy) && Objects.equals(totalProfitQoq, that.totalProfitQoq) && Objects.equals(incomeTax, that.incomeTax) && Objects.equals(incomeTaxYoy, that.incomeTaxYoy) && Objects.equals(incomeTaxQoq, that.incomeTaxQoq) && Objects.equals(netprofit, that.netprofit) && Objects.equals(netprofitYoy, that.netprofitYoy) && Objects.equals(netprofitQoq, that.netprofitQoq) && Objects.equals(continuedNetprofit, that.continuedNetprofit) && Objects.equals(continuedNetprofitYoy, that.continuedNetprofitYoy) && Objects.equals(continuedNetprofitQoq, that.continuedNetprofitQoq) && Objects.equals(discontinuedNetprofit, that.discontinuedNetprofit) && Objects.equals(discontinuedNetprofitYoy, that.discontinuedNetprofitYoy) && Objects.equals(discontinuedNetprofitQoq, that.discontinuedNetprofitQoq) && Objects.equals(parentNetprofit, that.parentNetprofit) && Objects.equals(parentNetprofitYoy, that.parentNetprofitYoy) && Objects.equals(parentNetprofitQoq, that.parentNetprofitQoq) && Objects.equals(minorityInterest, that.minorityInterest) && Objects.equals(minorityInterestYoy, that.minorityInterestYoy) && Objects.equals(minorityInterestQoq, that.minorityInterestQoq) && Objects.equals(deductParentNetprofit, that.deductParentNetprofit) && Objects.equals(deductParentNetprofitYoy, that.deductParentNetprofitYoy) && Objects.equals(deductParentNetprofitQoq, that.deductParentNetprofitQoq) && Objects.equals(netprofitOther, that.netprofitOther) && Objects.equals(netprofitOtherYoy, that.netprofitOtherYoy) && Objects.equals(netprofitOtherQoq, that.netprofitOtherQoq) && Objects.equals(netprofitBalance, that.netprofitBalance) && Objects.equals(netprofitBalanceYoy, that.netprofitBalanceYoy) && Objects.equals(netprofitBalanceQoq, that.netprofitBalanceQoq) && Objects.equals(basicEps, that.basicEps) && Objects.equals(dilutedEps, that.dilutedEps) && Objects.equals(otherCompreIncome, that.otherCompreIncome) && Objects.equals(otherCompreIncomeYoy, that.otherCompreIncomeYoy) && Objects.equals(otherCompreIncomeQoq, that.otherCompreIncomeQoq) && Objects.equals(parentOci, that.parentOci) && Objects.equals(parentOciYoy, that.parentOciYoy) && Objects.equals(parentOciQoq, that.parentOciQoq) && Objects.equals(minorityOci, that.minorityOci) && Objects.equals(minorityOciYoy, that.minorityOciYoy) && Objects.equals(minorityOciQoq, that.minorityOciQoq) && Objects.equals(totalCompreIncome, that.totalCompreIncome) && Objects.equals(totalCompreIncomeYoy, that.totalCompreIncomeYoy) && Objects.equals(totalCompreIncomeQoq, that.totalCompreIncomeQoq) && Objects.equals(parentTci, that.parentTci) && Objects.equals(parentTciYoy, that.parentTciYoy) && Objects.equals(parentTciQoq, that.parentTciQoq) && Objects.equals(minorityTci, that.minorityTci) && Objects.equals(minorityTciYoy, that.minorityTciYoy) && Objects.equals(minorityTciQoq, that.minorityTciQoq) && Objects.equals(totalOperateIncome, that.totalOperateIncome) && Objects.equals(totalOperateIncomeYoy, that.totalOperateIncomeYoy) && Objects.equals(totalOperateIncomeQoq, that.totalOperateIncomeQoq) && Objects.equals(interestIncome, that.interestIncome) && Objects.equals(interestIncomeYoy, that.interestIncomeYoy) && Objects.equals(interestIncomeQoq, that.interestIncomeQoq) && Objects.equals(earnedPremium, that.earnedPremium) && Objects.equals(earnedPremiumYoy, that.earnedPremiumYoy) && Objects.equals(earnedPremiumQoq, that.earnedPremiumQoq) && Objects.equals(feeCommissionIncome, that.feeCommissionIncome) && Objects.equals(feeCommissionIncomeYoy, that.feeCommissionIncomeYoy) && Objects.equals(feeCommissionIncomeQoq, that.feeCommissionIncomeQoq) && Objects.equals(toiOther, that.toiOther) && Objects.equals(toiOtherYoy, that.toiOtherYoy) && Objects.equals(toiOtherQoq, that.toiOtherQoq) && Objects.equals(totalOperateCost, that.totalOperateCost) && Objects.equals(totalOperateCostYoy, that.totalOperateCostYoy) && Objects.equals(totalOperateCostQoq, that.totalOperateCostQoq) && Objects.equals(operateCost, that.operateCost) && Objects.equals(operateCostYoy, that.operateCostYoy) && Objects.equals(operateCostQoq, that.operateCostQoq) && Objects.equals(interestExpense, that.interestExpense) && Objects.equals(interestExpenseYoy, that.interestExpenseYoy) && Objects.equals(interestExpenseQoq, that.interestExpenseQoq) && Objects.equals(feeCommissionExpense, that.feeCommissionExpense) && Objects.equals(feeCommissionExpenseYoy, that.feeCommissionExpenseYoy) && Objects.equals(feeCommissionExpenseQoq, that.feeCommissionExpenseQoq) && Objects.equals(surrenderValue, that.surrenderValue) && Objects.equals(surrenderValueYoy, that.surrenderValueYoy) && Objects.equals(surrenderValueQoq, that.surrenderValueQoq) && Objects.equals(netCompensateExpense, that.netCompensateExpense) && Objects.equals(netCompensateExpenseYoy, that.netCompensateExpenseYoy) && Objects.equals(netCompensateExpenseQoq, that.netCompensateExpenseQoq) && Objects.equals(netContractReserve, that.netContractReserve) && Objects.equals(netContractReserveYoy, that.netContractReserveYoy) && Objects.equals(netContractReserveQoq, that.netContractReserveQoq) && Objects.equals(policyBonusExpense, that.policyBonusExpense) && Objects.equals(policyBonusExpenseYoy, that.policyBonusExpenseYoy) && Objects.equals(policyBonusExpenseQoq, that.policyBonusExpenseQoq) && Objects.equals(reinsureExpense, that.reinsureExpense) && Objects.equals(reinsureExpenseYoy, that.reinsureExpenseYoy) && Objects.equals(reinsureExpenseQoq, that.reinsureExpenseQoq) && Objects.equals(saleExpense, that.saleExpense) && Objects.equals(saleExpenseYoy, that.saleExpenseYoy) && Objects.equals(saleExpenseQoq, that.saleExpenseQoq) && Objects.equals(manageExpense, that.manageExpense) && Objects.equals(manageExpenseYoy, that.manageExpenseYoy) && Objects.equals(manageExpenseQoq, that.manageExpenseQoq) && Objects.equals(researchExpense, that.researchExpense) && Objects.equals(researchExpenseYoy, that.researchExpenseYoy) && Objects.equals(researchExpenseQoq, that.researchExpenseQoq) && Objects.equals(financeExpense, that.financeExpense) && Objects.equals(financeExpenseYoy, that.financeExpenseYoy) && Objects.equals(financeExpenseQoq, that.financeExpenseQoq) && Objects.equals(feInterestExpense, that.feInterestExpense) && Objects.equals(feInterestExpenseYoy, that.feInterestExpenseYoy) && Objects.equals(feInterestExpenseQoq, that.feInterestExpenseQoq) && Objects.equals(feInterestIncome, that.feInterestIncome) && Objects.equals(feInterestIncomeYoy, that.feInterestIncomeYoy) && Objects.equals(feInterestIncomeQoq, that.feInterestIncomeQoq) && Objects.equals(tocOther, that.tocOther) && Objects.equals(tocOtherYoy, that.tocOtherYoy) && Objects.equals(tocOtherQoq, that.tocOtherQoq) && Objects.equals(netExposureIncome, that.netExposureIncome) && Objects.equals(netExposureIncomeYoy, that.netExposureIncomeYoy) && Objects.equals(netExposureIncomeQoq, that.netExposureIncomeQoq) && Objects.equals(assetImpairmentIncome, that.assetImpairmentIncome) && Objects.equals(assetImpairmentIncomeYoy, that.assetImpairmentIncomeYoy) && Objects.equals(assetImpairmentIncomeQoq, that.assetImpairmentIncomeQoq) && Objects.equals(creditImpairmentIncome, that.creditImpairmentIncome) && Objects.equals(creditImpairmentIncomeYoy, that.creditImpairmentIncomeYoy) && Objects.equals(creditImpairmentIncomeQoq, that.creditImpairmentIncomeQoq) && Objects.equals(effectNetprofitOther, that.effectNetprofitOther) && Objects.equals(effectNetprofitOtherYoy, that.effectNetprofitOtherYoy) && Objects.equals(effectNetprofitOtherQoq, that.effectNetprofitOtherQoq) && Objects.equals(unconfirmInvestLoss, that.unconfirmInvestLoss) && Objects.equals(unconfirmInvestLossYoy, that.unconfirmInvestLossYoy) && Objects.equals(unconfirmInvestLossQoq, that.unconfirmInvestLossQoq) && Objects.equals(precombineProfit, that.precombineProfit) && Objects.equals(precombineProfitYoy, that.precombineProfitYoy) && Objects.equals(precombineProfitQoq, that.precombineProfitQoq) && Objects.equals(effectNetprofitBalance, that.effectNetprofitBalance) && Objects.equals(effectNetprofitBalanceYoy, that.effectNetprofitBalanceYoy) && Objects.equals(effectNetprofitBalanceQoq, that.effectNetprofitBalanceQoq) && Objects.equals(insuranceIncome, that.insuranceIncome) && Objects.equals(insuranceIncomeYoy, that.insuranceIncomeYoy) && Objects.equals(insuranceIncomeQoq, that.insuranceIncomeQoq) && Objects.equals(reinsureIncome, that.reinsureIncome) && Objects.equals(reinsureIncomeYoy, that.reinsureIncomeYoy) && Objects.equals(reinsureIncomeQoq, that.reinsureIncomeQoq) && Objects.equals(reinsurePremium, that.reinsurePremium) && Objects.equals(reinsurePremiumYoy, that.reinsurePremiumYoy) && Objects.equals(reinsurePremiumQoq, that.reinsurePremiumQoq) && Objects.equals(extractUnexpireReserve, that.extractUnexpireReserve) && Objects.equals(extractUnexpireReserveYoy, that.extractUnexpireReserveYoy) && Objects.equals(extractUnexpireReserveQoq, that.extractUnexpireReserveQoq) && Objects.equals(earnedPremiumBalance, that.earnedPremiumBalance) && Objects.equals(earnedPremiumBalanceYoy, that.earnedPremiumBalanceYoy) && Objects.equals(earnedPremiumBalanceQoq, that.earnedPremiumBalanceQoq) && Objects.equals(bankInterestNi, that.bankInterestNi) && Objects.equals(bankInterestNiYoy, that.bankInterestNiYoy) && Objects.equals(bankInterestNiQoq, that.bankInterestNiQoq) && Objects.equals(bankInterestIncome, that.bankInterestIncome) && Objects.equals(bankInterestIncomeYoy, that.bankInterestIncomeYoy) && Objects.equals(bankInterestIncomeQoq, that.bankInterestIncomeQoq) && Objects.equals(bankInterestExpense, that.bankInterestExpense) && Objects.equals(bankInterestExpenseYoy, that.bankInterestExpenseYoy) && Objects.equals(bankInterestExpenseQoq, that.bankInterestExpenseQoq) && Objects.equals(uninsuranceCni, that.uninsuranceCni) && Objects.equals(uninsuranceCniYoy, that.uninsuranceCniYoy) && Objects.equals(uninsuranceCniQoq, that.uninsuranceCniQoq) && Objects.equals(uninsuranceCi, that.uninsuranceCi) && Objects.equals(uninsuranceCiYoy, that.uninsuranceCiYoy) && Objects.equals(uninsuranceCiQoq, that.uninsuranceCiQoq) && Objects.equals(uninsuranceCe, that.uninsuranceCe) && Objects.equals(uninsuranceCeYoy, that.uninsuranceCeYoy) && Objects.equals(uninsuranceCeQoq, that.uninsuranceCeQoq) && Objects.equals(fairvalueChange, that.fairvalueChange) && Objects.equals(fairvalueChangeYoy, that.fairvalueChangeYoy) && Objects.equals(fairvalueChangeQoq, that.fairvalueChangeQoq) && Objects.equals(afaFairvalueChange, that.afaFairvalueChange) && Objects.equals(afaFairvalueChangeYoy, that.afaFairvalueChangeYoy) && Objects.equals(afaFairvalueChangeQoq, that.afaFairvalueChangeQoq) && Objects.equals(compensateExpense, that.compensateExpense) && Objects.equals(compensateExpenseYoy, that.compensateExpenseYoy) && Objects.equals(compensateExpenseQoq, that.compensateExpenseQoq) && Objects.equals(amortizeCompensateExpense, that.amortizeCompensateExpense) && Objects.equals(amortizeCompensateExpenseYoy, that.amortizeCompensateExpenseYoy) && Objects.equals(amortizeCompensateExpenseQoq, that.amortizeCompensateExpenseQoq) && Objects.equals(extractInsuranceReserve, that.extractInsuranceReserve) && Objects.equals(extractInsuranceReserveYoy, that.extractInsuranceReserveYoy) && Objects.equals(extractInsuranceReserveQoq, that.extractInsuranceReserveQoq) && Objects.equals(amortizeInsuranceReserve, that.amortizeInsuranceReserve) && Objects.equals(amortizeInsuranceReserveYoy, that.amortizeInsuranceReserveYoy) && Objects.equals(amortizeInsuranceReserveQoq, that.amortizeInsuranceReserveQoq) && Objects.equals(amortizeReinsureExpense, that.amortizeReinsureExpense) && Objects.equals(amortizeReinsureExpenseYoy, that.amortizeReinsureExpenseYoy) && Objects.equals(amortizeReinsureExpenseQoq, that.amortizeReinsureExpenseQoq);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityCode, reportType, reportDate, opinionType, osopinionType, operateIncome, operateIncomeYoy, operateIncomeQoq, feeCommissionNi, feeCommissionNiYoy, feeCommissionNiQoq, agentSecurityNi, agentSecurityNiYoy, agentSecurityNiQoq, securityUnderwriteNi, securityUnderwriteNiYoy, securityUnderwriteNiQoq, assetManageNi, assetManageNiYoy, assetManageNiQoq, financeAdviserNi, financeAdviserNiYoy, financeAdviserNiQoq, recommendNi, recommendNiYoy, recommendNiQoq, fundManageNi, fundManageNiYoy, fundManageNiQoq, fundSaleNi, fundSaleNiYoy, fundSaleNiQoq, brokerNi, brokerNiYoy, brokerNiQoq, commissionNiOther, commissionNiOtherYoy, commissionNiOtherQoq, interestNi, interestNiYoy, interestNiQoq, investIncome, investIncomeYoy, investIncomeQoq, investJointIncome, investJointIncomeYoy, investJointIncomeQoq, fairvalueChangeIncome, fairvalueChangeIncomeYoy, fairvalueChangeIncomeQoq, exchangeIncome, exchangeIncomeYoy, exchangeIncomeQoq, otherBusinessIncome, otherBusinessIncomeYoy, otherBusinessIncomeQoq, assetDisposalIncome, assetDisposalIncomeYoy, assetDisposalIncomeQoq, otherIncome, otherIncomeYoy, otherIncomeQoq, operateIncomeOther, operateIncomeOtherYoy, operateIncomeOtherQoq, operateIncomeBalance, operateIncomeBalanceYoy, operateIncomeBalanceQoq, operateExpense, operateExpenseYoy, operateExpenseQoq, operateTaxAdd, operateTaxAddYoy, operateTaxAddQoq, businessManageExpense, businessManageExpenseYoy, businessManageExpenseQoq, assetImpairmentLoss, assetImpairmentLossYoy, assetImpairmentLossQoq, creditImpairmentLoss, creditImpairmentLossYoy, creditImpairmentLossQoq, otherBusinessCost, otherBusinessCostYoy, otherBusinessCostQoq, operateExpenseOther, operateExpenseOtherYoy, operateExpenseOtherQoq, operateExpenseBalance, operateExpenseBalanceYoy, operateExpenseBalanceQoq, operateProfitOther, operateProfitOtherYoy, operateProfitOtherQoq, operateProfitBalance, operateProfitBalanceYoy, operateProfitBalanceQoq, operateProfit, operateProfitYoy, operateProfitQoq, nonbusinessIncome, nonbusinessIncomeYoy, nonbusinessIncomeQoq, noncurrentDisposalIncome, noncurrentDisposalIncomeYoy, noncurrentDisposalIncomeQoq, nonbusinessExpense, nonbusinessExpenseYoy, nonbusinessExpenseQoq, noncurrentDisposalLoss, noncurrentDisposalLossYoy, noncurrentDisposalLossQoq, effectTpOther, effectTpOtherYoy, effectTpOtherQoq, totalProfitBalance, totalProfitBalanceYoy, totalProfitBalanceQoq, totalProfit, totalProfitYoy, totalProfitQoq, incomeTax, incomeTaxYoy, incomeTaxQoq, netprofit, netprofitYoy, netprofitQoq, continuedNetprofit, continuedNetprofitYoy, continuedNetprofitQoq, discontinuedNetprofit, discontinuedNetprofitYoy, discontinuedNetprofitQoq, parentNetprofit, parentNetprofitYoy, parentNetprofitQoq, minorityInterest, minorityInterestYoy, minorityInterestQoq, deductParentNetprofit, deductParentNetprofitYoy, deductParentNetprofitQoq, netprofitOther, netprofitOtherYoy, netprofitOtherQoq, netprofitBalance, netprofitBalanceYoy, netprofitBalanceQoq, basicEps, dilutedEps, otherCompreIncome, otherCompreIncomeYoy, otherCompreIncomeQoq, parentOci, parentOciYoy, parentOciQoq, minorityOci, minorityOciYoy, minorityOciQoq, totalCompreIncome, totalCompreIncomeYoy, totalCompreIncomeQoq, parentTci, parentTciYoy, parentTciQoq, minorityTci, minorityTciYoy, minorityTciQoq, totalOperateIncome, totalOperateIncomeYoy, totalOperateIncomeQoq, interestIncome, interestIncomeYoy, interestIncomeQoq, earnedPremium, earnedPremiumYoy, earnedPremiumQoq, feeCommissionIncome, feeCommissionIncomeYoy, feeCommissionIncomeQoq, toiOther, toiOtherYoy, toiOtherQoq, totalOperateCost, totalOperateCostYoy, totalOperateCostQoq, operateCost, operateCostYoy, operateCostQoq, interestExpense, interestExpenseYoy, interestExpenseQoq, feeCommissionExpense, feeCommissionExpenseYoy, feeCommissionExpenseQoq, surrenderValue, surrenderValueYoy, surrenderValueQoq, netCompensateExpense, netCompensateExpenseYoy, netCompensateExpenseQoq, netContractReserve, netContractReserveYoy, netContractReserveQoq, policyBonusExpense, policyBonusExpenseYoy, policyBonusExpenseQoq, reinsureExpense, reinsureExpenseYoy, reinsureExpenseQoq, saleExpense, saleExpenseYoy, saleExpenseQoq, manageExpense, manageExpenseYoy, manageExpenseQoq, researchExpense, researchExpenseYoy, researchExpenseQoq, financeExpense, financeExpenseYoy, financeExpenseQoq, feInterestExpense, feInterestExpenseYoy, feInterestExpenseQoq, feInterestIncome, feInterestIncomeYoy, feInterestIncomeQoq, tocOther, tocOtherYoy, tocOtherQoq, netExposureIncome, netExposureIncomeYoy, netExposureIncomeQoq, assetImpairmentIncome, assetImpairmentIncomeYoy, assetImpairmentIncomeQoq, creditImpairmentIncome, creditImpairmentIncomeYoy, creditImpairmentIncomeQoq, effectNetprofitOther, effectNetprofitOtherYoy, effectNetprofitOtherQoq, unconfirmInvestLoss, unconfirmInvestLossYoy, unconfirmInvestLossQoq, precombineProfit, precombineProfitYoy, precombineProfitQoq, effectNetprofitBalance, effectNetprofitBalanceYoy, effectNetprofitBalanceQoq, insuranceIncome, insuranceIncomeYoy, insuranceIncomeQoq, reinsureIncome, reinsureIncomeYoy, reinsureIncomeQoq, reinsurePremium, reinsurePremiumYoy, reinsurePremiumQoq, extractUnexpireReserve, extractUnexpireReserveYoy, extractUnexpireReserveQoq, earnedPremiumBalance, earnedPremiumBalanceYoy, earnedPremiumBalanceQoq, bankInterestNi, bankInterestNiYoy, bankInterestNiQoq, bankInterestIncome, bankInterestIncomeYoy, bankInterestIncomeQoq, bankInterestExpense, bankInterestExpenseYoy, bankInterestExpenseQoq, uninsuranceCni, uninsuranceCniYoy, uninsuranceCniQoq, uninsuranceCi, uninsuranceCiYoy, uninsuranceCiQoq, uninsuranceCe, uninsuranceCeYoy, uninsuranceCeQoq, fairvalueChange, fairvalueChangeYoy, fairvalueChangeQoq, afaFairvalueChange, afaFairvalueChangeYoy, afaFairvalueChangeQoq, compensateExpense, compensateExpenseYoy, compensateExpenseQoq, amortizeCompensateExpense, amortizeCompensateExpenseYoy, amortizeCompensateExpenseQoq, extractInsuranceReserve, extractInsuranceReserveYoy, extractInsuranceReserveQoq, amortizeInsuranceReserve, amortizeInsuranceReserveYoy, amortizeInsuranceReserveQoq, amortizeReinsureExpense, amortizeReinsureExpenseYoy, amortizeReinsureExpenseQoq);
    }

}
