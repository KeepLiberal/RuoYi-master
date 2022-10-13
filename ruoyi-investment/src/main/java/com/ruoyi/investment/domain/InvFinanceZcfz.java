package com.ruoyi.investment.domain;

import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 财务分析-资产负债对象 inv_finance_zcfz
 *
 * @author yangwenyang
 * @date 2022-10-11
 */
public class InvFinanceZcfz extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;

    /**
     * 股票代码
     */
    @Excel(name = "股票代码")
    private String securityCode;

    /**
     * 分类代码
     */
    @Excel(name = "分类代码")
    private String orgCode;

    /**
     * 分类名称
     */
    @Excel(name = "分类名称")
    private String orgType;

    /**
     * 证劵分类代码
     */
    @Excel(name = "证劵分类代码")
    private String securityTypeCode;

    /**
     * 证劵简称
     */
    @Excel(name = "证劵简称")
    private String securityNameAbbr;

    /**
     * 报告类型
     */
    @Excel(name = "报告类型")
    private String reportType;

    /**
     * 报告名称
     */
    @Excel(name = "报告名称")
    private String reportDateName;

    /**
     * 通知日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "通知日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date noticeDate;

    /**
     * 报告日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "报告日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date reportDate;

    /**
     * 更新日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "更新日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updateDate;

    /**
     * 审计意见(境内)
     */
    @Excel(name = "审计意见(境内)")
    private String opinionType;

    /**
     * 审计意见(境外)
     */
    @Excel(name = "审计意见(境外)")
    private String osopinionType;

    /**
     * 货币资金
     */
    @Excel(name = "货币资金")
    private Double monetaryfunds;

    /**
     * 货币资金(环比%)
     */
    @Excel(name = "货币资金(环比%)")
    private Double monetaryfundsYoy;

    /**
     * 客户资金存款
     */
    @Excel(name = "客户资金存款")
    private Double customerDeposit;

    /**
     * 客户资金存款(环比%)
     */
    @Excel(name = "客户资金存款(环比%)")
    private Double customerDepositYoy;

    /**
     * 结算备付金
     */
    @Excel(name = "结算备付金")
    private Double settleExcessReserve;

    /**
     * 结算备付金(环比%)
     */
    @Excel(name = "结算备付金(环比%)")
    private Double settleExcessReserveYoy;

    /**
     * 客户备付金
     */
    @Excel(name = "客户备付金")
    private Double customerExcessReserve;

    /**
     * 客户备付金(环比%)
     */
    @Excel(name = "客户备付金(环比%)")
    private Double customerExcessReserveYoy;

    /**
     * 融出资金
     */
    @Excel(name = "融出资金")
    private Double finFund;

    /**
     * 融出资金(环比%)
     */
    @Excel(name = "融出资金(环比%)")
    private Double finFundYoy;

    /**
     * 以公允价值计量且其变动计入当期损益的金融资产
     */
    @Excel(name = "以公允价值计量且其变动计入当期损益的金融资产")
    private Double fvtplFinasset;

    /**
     * 以公允价值计量且其变动计入当期损益的金融资产(环比%)
     */
    @Excel(name = "以公允价值计量且其变动计入当期损益的金融资产(环比%)")
    private Double fvtplFinassetYoy;

    /**
     * 衍生金融资产
     */
    @Excel(name = "衍生金融资产")
    private Double deriveFinasset;

    /**
     * 衍生金融资产(环比%)
     */
    @Excel(name = "衍生金融资产(环比%)")
    private Double deriveFinassetYoy;

    /**
     * 买入返售金融资产
     */
    @Excel(name = "买入返售金融资产")
    private Double buyResaleFinasset;

    /**
     * 买入返售金融资产(环比%)
     */
    @Excel(name = "买入返售金融资产(环比%)")
    private Double buyResaleFinassetYoy;

    /**
     * 应收款项
     */
    @Excel(name = "应收款项")
    private Double receivables;

    /**
     * 应收款项(环比%)
     */
    @Excel(name = "应收款项(环比%)")
    private Double receivablesYoy;

    /**
     * 应收利息
     */
    @Excel(name = "应收利息")
    private Double interestRece;

    /**
     * 应收利息(环比%)
     */
    @Excel(name = "应收利息(环比%)")
    private Double interestReceYoy;

    /**
     * 存出保证金
     */
    @Excel(name = "存出保证金")
    private Double refundDepositPay;

    /**
     * 存出保证金(环比%)
     */
    @Excel(name = "存出保证金(环比%)")
    private Double refundDepositPayYoy;

    /**
     * 交易性金融资产
     */
    @Excel(name = "交易性金融资产")
    private Double tradeFinassetNotfvtpl;

    /**
     * 交易性金融资产(环比%)
     */
    @Excel(name = "交易性金融资产(环比%)")
    private Double tradeFinassetNotfvtplYoy;

    /**
     * 债权投资
     */
    @Excel(name = "债权投资")
    private Double creditorInvest;

    /**
     * 债权投资(环比%)
     */
    @Excel(name = "债权投资(环比%)")
    private Double creditorInvestYoy;

    /**
     * 其他债权投资
     */
    @Excel(name = "其他债权投资")
    private Double otherCreditorInvest;

    /**
     * 其他债权投资(环比%)
     */
    @Excel(name = "其他债权投资(环比%)")
    private Double otherCreditorInvestYoy;

    /**
     * 其他权益工具投资
     */
    @Excel(name = "其他权益工具投资")
    private Double otherEquityInvest;

    /**
     * 其他权益工具投资(环比%)
     */
    @Excel(name = "其他权益工具投资(环比%)")
    private Double otherEquityInvestYoy;

    /**
     * 可供出售金融资产
     */
    @Excel(name = "可供出售金融资产")
    private Double availableSaleFinasset;

    /**
     * 可供出售金融资产(环比%)
     */
    @Excel(name = "可供出售金融资产(环比%)")
    private Double availableSaleFinassetYoy;

    /**
     * 长期股权投资
     */
    @Excel(name = "长期股权投资")
    private Double longEquityInvest;

    /**
     * 长期股权投资(环比%)
     */
    @Excel(name = "长期股权投资(环比%)")
    private Double longEquityInvestYoy;

    /**
     * 投资性房地产
     */
    @Excel(name = "投资性房地产")
    private Double investRealestate;

    /**
     * 投资性房地产(环比%)
     */
    @Excel(name = "投资性房地产(环比%)")
    private Double investRealestateYoy;

    /**
     * 固定资产
     */
    @Excel(name = "固定资产")
    private Double fixedAsset;

    /**
     * 固定资产(环比%)
     */
    @Excel(name = "固定资产(环比%)")
    private Double fixedAssetYoy;

    /**
     * 在建工程
     */
    @Excel(name = "在建工程")
    private Double cip;

    /**
     * 在建工程(环比%)
     */
    @Excel(name = "在建工程(环比%)")
    private Double cipYoy;

    /**
     * 使用权资产
     */
    @Excel(name = "使用权资产")
    private Double userightAsset;

    /**
     * 使用权资产(环比%)
     */
    @Excel(name = "使用权资产(环比%)")
    private Double userightAssetYoy;

    /**
     * 无形资产
     */
    @Excel(name = "无形资产")
    private Double intangibleAsset;

    /**
     * 无形资产(环比%)
     */
    @Excel(name = "无形资产(环比%)")
    private Double intangibleAssetYoy;

    /**
     * 商誉
     */
    @Excel(name = "商誉")
    private Double goodwill;

    /**
     * 商誉(环比%)
     */
    @Excel(name = "商誉(环比%)")
    private Double goodwillYoy;

    /**
     * 递延所得税资产
     */
    @Excel(name = "递延所得税资产")
    private Double deferTaxAsset;

    /**
     * 递延所得税资产(环比%)
     */
    @Excel(name = "递延所得税资产(环比%)")
    private Double deferTaxAssetYoy;

    /**
     * 其他资产
     */
    @Excel(name = "其他资产")
    private Double otherAsset;

    /**
     * 其他资产(环比%)
     */
    @Excel(name = "其他资产(环比%)")
    private Double otherAssetYoy;

    /**
     * 资产总计
     */
    @Excel(name = "资产总计")
    private Double totalAssets;

    /**
     * 资产总计(环比%)
     */
    @Excel(name = "资产总计(环比%)")
    private Double totalAssetsYoy;

    /**
     * 短期借款
     */
    @Excel(name = "短期借款")
    private Double shortLoan;

    /**
     * 短期借款(环比%)
     */
    @Excel(name = "短期借款(环比%)")
    private Double shortLoanYoy;

    /**
     * 应付短期融资款
     */
    @Excel(name = "应付短期融资款")
    private Double shortFinPayable;

    /**
     * 应付短期融资款(环比%)
     */
    @Excel(name = "应付短期融资款(环比%)")
    private Double shortFinPayableYoy;

    /**
     * 拆入资金
     */
    @Excel(name = "拆入资金")
    private Double borrowFund;

    /**
     * 拆入资金(环比%)
     */
    @Excel(name = "拆入资金(环比%)")
    private Double borrowFundYoy;

    /**
     * 交易性金融负债
     */
    @Excel(name = "交易性金融负债")
    private Double tradeFinliabNotfvtpl;

    /**
     * 交易性金融负债(环比%)
     */
    @Excel(name = "交易性金融负债(环比%)")
    private Double tradeFinliabNotfvtplYoy;

    /**
     * 以公允价值计量且其变动计入当期损益的金融负债
     */
    @Excel(name = "以公允价值计量且其变动计入当期损益的金融负债")
    private Double fvtplFinliab;

    /**
     * 以公允价值计量且其变动计入当期损益的金融负债(环比%)
     */
    @Excel(name = "以公允价值计量且其变动计入当期损益的金融负债(环比%)")
    private Double fvtplFinliabYoy;

    /**
     * 衍生金融负债
     */
    @Excel(name = "衍生金融负债")
    private Double deriveFinliab;

    /**
     * 衍生金融负债(环比%)
     */
    @Excel(name = "衍生金融负债(环比%)")
    private Double deriveFinliabYoy;

    /**
     * 卖出回购金融资产款
     */
    @Excel(name = "卖出回购金融资产款")
    private Double sellRepoFinasset;

    /**
     * 卖出回购金融资产款(环比%)
     */
    @Excel(name = "卖出回购金融资产款(环比%)")
    private Double sellRepoFinassetYoy;

    /**
     * 代理买卖证券款
     */
    @Excel(name = "代理买卖证券款")
    private Double agentTradeSecurity;

    /**
     * 代理买卖证券款(环比%)
     */
    @Excel(name = "代理买卖证券款(环比%)")
    private Double agentTradeSecurityYoy;

    /**
     * 代理承销证券款
     */
    @Excel(name = "代理承销证券款")
    private Double agentUnderwriteSecurity;

    /**
     * 代理承销证券款(环比%)
     */
    @Excel(name = "代理承销证券款(环比%)")
    private Double agentUnderwriteSecurityYoy;

    /**
     * 应付账款
     */
    @Excel(name = "应付账款")
    private Double accountsPayable;

    /**
     * 应付账款(环比%)
     */
    @Excel(name = "应付账款(环比%)")
    private Double accountsPayableYoy;

    /**
     * 应付职工薪酬
     */
    @Excel(name = "应付职工薪酬")
    private Double staffSalaryPayable;

    /**
     * 应付职工薪酬(环比%)
     */
    @Excel(name = "应付职工薪酬(环比%)")
    private Double staffSalaryPayableYoy;

    /**
     * 应交税费
     */
    @Excel(name = "应交税费")
    private Double taxPayable;

    /**
     * 应交税费(环比%)
     */
    @Excel(name = "应交税费(环比%)")
    private Double taxPayableYoy;

    /**
     * 应付利息
     */
    @Excel(name = "应付利息")
    private Double interestPayable;

    /**
     * 应付利息(环比%)
     */
    @Excel(name = "应付利息(环比%)")
    private Double interestPayableYoy;

    /**
     * 长期借款
     */
    @Excel(name = "长期借款")
    private Double longLoan;

    /**
     * 长期借款(环比%)
     */
    @Excel(name = "长期借款(环比%)")
    private Double longLoanYoy;

    /**
     * 应付债券
     */
    @Excel(name = "应付债券")
    private Double bondPayable;

    /**
     * 应付债券(环比%)
     */
    @Excel(name = "应付债券(环比%)")
    private Double bondPayableYoy;

    /**
     * 租赁负债
     */
    @Excel(name = "租赁负债")
    private Double leaseLiab;

    /**
     * 租赁负债(环比%)
     */
    @Excel(name = "租赁负债(环比%)")
    private Double leaseLiabYoy;

    /**
     * 递延所得税负债
     */
    @Excel(name = "递延所得税负债")
    private Double deferTaxLiab;

    /**
     * 递延所得税负债(环比%)
     */
    @Excel(name = "递延所得税负债(环比%)")
    private Double deferTaxLiabYoy;

    /**
     * 其他负债
     */
    @Excel(name = "其他负债")
    private Double otherLiab;

    /**
     * 其他负债(环比%)
     */
    @Excel(name = "其他负债(环比%)")
    private Double otherLiabYoy;

    /**
     * 负债其他项目
     */
    @Excel(name = "负债其他项目")
    private Double liabOther;

    /**
     * 负债其他项目(环比%)
     */
    @Excel(name = "负债其他项目(环比%)")
    private Double liabOtherYoy;

    /**
     * 负债合计
     */
    @Excel(name = "负债合计")
    private Double totalLiabilities;

    /**
     * 负债合计(环比%)
     */
    @Excel(name = "负债合计(环比%)")
    private Double totalLiabilitiesYoy;

    /**
     * 资本或股本
     */
    @Excel(name = "资本或股本")
    private Double shareCapital;

    /**
     * 资本或股本(环比%)
     */
    @Excel(name = "资本或股本(环比%)")
    private Double shareCapitalYoy;

    /**
     * 资本公积
     */
    @Excel(name = "资本公积")
    private Double capitalReserve;

    /**
     * 资本公积(环比%)
     */
    @Excel(name = "资本公积(环比%)")
    private Double capitalReserveYoy;

    /**
     * 其他综合收益
     */
    @Excel(name = "其他综合收益")
    private Double otherCompreIncome;

    /**
     * 其他综合收益(环比%)
     */
    @Excel(name = "其他综合收益(环比%)")
    private Double otherCompreIncomeYoy;

    /**
     * 盈余公积
     */
    @Excel(name = "盈余公积")
    private Double surplusReserve;

    /**
     * 盈余公积(环比%)
     */
    @Excel(name = "盈余公积(环比%)")
    private Double surplusReserveYoy;

    /**
     * 一般风险准备
     */
    @Excel(name = "一般风险准备")
    private Double generalRiskReserve;

    /**
     * 一般风险准备(环比%)
     */
    @Excel(name = "一般风险准备(环比%)")
    private Double generalRiskReserveYoy;

    /**
     * 未分配利润
     */
    @Excel(name = "未分配利润")
    private Double unassignRpofit;

    /**
     * 未分配利润(环比%)
     */
    @Excel(name = "未分配利润(环比%)")
    private Double unassignRpofitYoy;

    /**
     * 归属于母公司股东权益总计
     */
    @Excel(name = "归属于母公司股东权益总计")
    private Double totalParentEquity;

    /**
     * 归属于母公司股东权益总计(环比%)
     */
    @Excel(name = "归属于母公司股东权益总计(环比%)")
    private Double totalParentEquityYoy;

    /**
     * 少数股东权益
     */
    @Excel(name = "少数股东权益")
    private Double minorityEquity;

    /**
     * 少数股东权益(环比%)
     */
    @Excel(name = "少数股东权益(环比%)")
    private Double minorityEquityYoy;

    /**
     * 股东权益合计
     */
    @Excel(name = "股东权益合计")
    private Double totalEquity;

    /**
     * 股东权益合计(环比%)
     */
    @Excel(name = "股东权益合计(环比%)")
    private Double totalEquityYoy;

    /**
     * 负债和股东权益总计
     */
    @Excel(name = "负债和股东权益总计")
    private Double totalLiabEquity;

    /**
     * 负债和股东权益总计(环比%)
     */
    @Excel(name = "负债和股东权益总计(环比%)")
    private Double totalLiabEquityYoy;

    /**
     * 应付次级债券
     */
    @Excel(name = "应付次级债券")
    private Double subbondPayable;

    /**
     * 应付次级债券(环比%)
     */
    @Excel(name = "应付次级债券(环比%)")
    private Double subbondPayableYoy;

    /**
     * 应收票据及应收账款
     */
    @Excel(name = "应收票据及应收账款")
    private Double noteAccountsRece;

    /**
     * 应收票据及应收账款(环比%)
     */
    @Excel(name = "应收票据及应收账款(环比%)")
    private Double noteAccountsReceYoy;

    /**
     * 应收票据
     */
    @Excel(name = "应收票据")
    private Double noteRece;

    /**
     * 应收票据(环比%)
     */
    @Excel(name = "应收票据(环比%)")
    private Double noteReceYoy;

    /**
     * 应收账款
     */
    @Excel(name = "应收账款")
    private Double accountsRece;

    /**
     * 应收账款(环比%)
     */
    @Excel(name = "应收账款(环比%)")
    private Double accountsReceYoy;

    /**
     * 应收款项融资
     */
    @Excel(name = "应收款项融资")
    private Double financeRece;

    /**
     * 应收款项融资(环比%)
     */
    @Excel(name = "应收款项融资(环比%)")
    private Double financeReceYoy;

    /**
     * 预付款项
     */
    @Excel(name = "预付款项")
    private Double prepayment;

    /**
     * 预付款项(环比%)
     */
    @Excel(name = "预付款项(环比%)")
    private Double prepaymentYoy;

    /**
     * 其他应收款合计
     */
    @Excel(name = "其他应收款合计")
    private Double totalOtherRece;

    /**
     * 其他应收款合计(环比%)
     */
    @Excel(name = "其他应收款合计(环比%)")
    private Double totalOtherReceYoy;

    /**
     * 应收股利
     */
    @Excel(name = "应收股利")
    private Double dividendRece;

    /**
     * 应收股利(环比%)
     */
    @Excel(name = "应收股利(环比%)")
    private Double dividendReceYoy;

    /**
     * 存货
     */
    @Excel(name = "存货")
    private Double inventory;

    /**
     * 存货(环比%)
     */
    @Excel(name = "存货(环比%)")
    private Double inventoryYoy;

    /**
     * 合同资产
     */
    @Excel(name = "合同资产")
    private Double contractAsset;

    /**
     * 合同资产(环比%)
     */
    @Excel(name = "合同资产(环比%)")
    private Double contractAssetYoy;

    /**
     * 一年内到期的非流动资产
     */
    @Excel(name = "一年内到期的非流动资产")
    private Double noncurrentAsset1year;

    /**
     * 一年内到期的非流动资产(环比%)
     */
    @Excel(name = "一年内到期的非流动资产(环比%)")
    private Double noncurrentAsset1yearYoy;

    /**
     * 其他流动资产
     */
    @Excel(name = "其他流动资产")
    private Double otherCurrentAsset;

    /**
     * 其他流动资产(环比%)
     */
    @Excel(name = "其他流动资产(环比%)")
    private Double otherCurrentAssetYoy;

    /**
     * 流动资产合计
     */
    @Excel(name = "流动资产合计")
    private Double totalCurrentAssets;

    /**
     * 流动资产合计(环比%)
     */
    @Excel(name = "流动资产合计(环比%)")
    private Double totalCurrentAssetsYoy;

    /**
     * 长期应收款
     */
    @Excel(name = "长期应收款")
    private Double longRece;

    /**
     * 长期应收款(环比%)
     */
    @Excel(name = "长期应收款(环比%)")
    private Double longReceYoy;

    /**
     * 开发支出
     */
    @Excel(name = "开发支出")
    private Double developExpense;

    /**
     * 开发支出(环比%)
     */
    @Excel(name = "开发支出(环比%)")
    private Double developExpenseYoy;

    /**
     * 长期待摊费用
     */
    @Excel(name = "长期待摊费用")
    private Double longPrepaidExpense;

    /**
     * 长期待摊费用(环比%)
     */
    @Excel(name = "长期待摊费用(环比%)")
    private Double longPrepaidExpenseYoy;

    /**
     * 其他非流动资产
     */
    @Excel(name = "其他非流动资产")
    private Double otherNoncurrentAsset;

    /**
     * 其他非流动资产(环比%)
     */
    @Excel(name = "其他非流动资产(环比%)")
    private Double otherNoncurrentAssetYoy;

    /**
     * 非流动资产合计
     */
    @Excel(name = "非流动资产合计")
    private Double totalNoncurrentAssets;

    /**
     * 非流动资产合计(环比%)
     */
    @Excel(name = "非流动资产合计(环比%)")
    private Double totalNoncurrentAssetsYoy;

    /**
     * 应付票据及应付账款
     */
    @Excel(name = "应付票据及应付账款")
    private Double noteAccountsPayable;

    /**
     * 应付票据及应付账款(环比%)
     */
    @Excel(name = "应付票据及应付账款(环比%)")
    private Double noteAccountsPayableYoy;

    /**
     * 应付票据
     */
    @Excel(name = "应付票据")
    private Double notePayable;

    /**
     * 应付票据(环比%)
     */
    @Excel(name = "应付票据(环比%)")
    private Double notePayableYoy;

    /**
     * 合同负债
     */
    @Excel(name = "合同负债")
    private Double contractLiab;

    /**
     * 合同负债(环比%)
     */
    @Excel(name = "合同负债(环比%)")
    private Double contractLiabYoy;

    /**
     * 其他应付款合计
     */
    @Excel(name = "其他应付款合计")
    private Double totalOtherPayable;

    /**
     * 其他应付款合计(环比%)
     */
    @Excel(name = "其他应付款合计(环比%)")
    private Double totalOtherPayableYoy;

    /**
     * 应付股利
     */
    @Excel(name = "应付股利")
    private Double dividendPayable;

    /**
     * 应付股利(环比%)
     */
    @Excel(name = "应付股利(环比%)")
    private Double dividendPayableYoy;

    /**
     * 一年内到期的非流动负债
     */
    @Excel(name = "一年内到期的非流动负债")
    private Double noncurrentLiab1year;

    /**
     * 一年内到期的非流动负债(环比%)
     */
    @Excel(name = "一年内到期的非流动负债(环比%)")
    private Double noncurrentLiab1yearYoy;

    /**
     * 其他流动负债
     */
    @Excel(name = "其他流动负债")
    private Double otherCurrentLiab;

    /**
     * 其他流动负债(环比%)
     */
    @Excel(name = "其他流动负债(环比%)")
    private Double otherCurrentLiabYoy;

    /**
     * 流动负债合计
     */
    @Excel(name = "流动负债合计")
    private Double totalCurrentLiab;

    /**
     * 流动负债合计(环比%)
     */
    @Excel(name = "流动负债合计(环比%)")
    private Double totalCurrentLiabYoy;

    /**
     * 长期应付款
     */
    @Excel(name = "长期应付款")
    private Double longPayable;

    /**
     * 长期应付款(环比%)
     */
    @Excel(name = "长期应付款(环比%)")
    private Double longPayableYoy;

    /**
     * 长期应付职工薪酬
     */
    @Excel(name = "长期应付职工薪酬")
    private Double longStaffsalaryPayable;

    /**
     * 长期应付职工薪酬(环比%)
     */
    @Excel(name = "长期应付职工薪酬(环比%)")
    private Double longStaffsalaryPayableYoy;

    /**
     * 预计负债
     */
    @Excel(name = "预计负债")
    private Double predictLiab;

    /**
     * 预计负债(环比%)
     */
    @Excel(name = "预计负债(环比%)")
    private Double predictLiabYoy;

    /**
     * 递延收益
     */
    @Excel(name = "递延收益")
    private Double deferIncome;

    /**
     * 递延收益(环比%)
     */
    @Excel(name = "递延收益(环比%)")
    private Double deferIncomeYoy;

    /**
     * 非流动负债合计
     */
    @Excel(name = "非流动负债合计")
    private Double totalNoncurrentLiab;

    /**
     * 非流动负债合计(环比%)
     */
    @Excel(name = "非流动负债合计(环比%)")
    private Double totalNoncurrentLiabYoy;

    /**
     * 专项储备
     */
    @Excel(name = "专项储备")
    private Double specialReserve;

    /**
     * 专项储备(环比%)
     */
    @Excel(name = "专项储备(环比%)")
    private Double specialReserveYoy;

    /**
     * 现金及存放中央银行款项
     */
    @Excel(name = "现金及存放中央银行款项")
    private Double cashDepositPbc;

    /**
     * 现金及存放中央银行款项(环比%)
     */
    @Excel(name = "现金及存放中央银行款项(环比%)")
    private Double cashDepositPbcYoy;

    /**
     * 存放同业款项
     */
    @Excel(name = "存放同业款项")
    private Double depositInterbank;

    /**
     * 存放同业款项(环比%)
     */
    @Excel(name = "存放同业款项(环比%)")
    private Double depositInterbankYoy;

    /**
     * 贵金属
     */
    @Excel(name = "贵金属")
    private Double preciousMetal;

    /**
     * 贵金属(环比%)
     */
    @Excel(name = "贵金属(环比%)")
    private Double preciousMetalYoy;

    /**
     * 拆出资金
     */
    @Excel(name = "拆出资金")
    private Double lendFund;

    /**
     * 拆出资金(环比%)
     */
    @Excel(name = "拆出资金(环比%)")
    private Double lendFundYoy;

    /**
     * 发放贷款及垫款
     */
    @Excel(name = "发放贷款及垫款")
    private Double loanAdvance;

    /**
     * 发放贷款及垫款(环比%)
     */
    @Excel(name = "发放贷款及垫款(环比%)")
    private Double loanAdvanceYoy;

    /**
     * 以摊余成本计量的金融资产
     */
    @Excel(name = "以摊余成本计量的金融资产")
    private Double amortizeCostFinasset;

    /**
     * 以摊余成本计量的金融资产(环比%)
     */
    @Excel(name = "以摊余成本计量的金融资产(环比%)")
    private Double amortizeCostFinassetyoy;

    /**
     * 以公允价值计量且其变动计入其他综合收益的金融资产
     */
    @Excel(name = "以公允价值计量且其变动计入其他综合收益的金融资产")
    private Double fvtociFinasset;

    /**
     * 以公允价值计量且其变动计入其他综合收益的金融资产(环比%)
     */
    @Excel(name = "以公允价值计量且其变动计入其他综合收益的金融资产(环比%)")
    private Double fvtociFinassetYoy;

    /**
     * 资产其他项目
     */
    @Excel(name = "资产其他项目")
    private Double assetOther;

    /**
     * 资产其他项目(环比%)
     */
    @Excel(name = "资产其他项目(环比%)")
    private Double assetOtherYoy;

    /**
     * 向中央银行借款
     */
    @Excel(name = "向中央银行借款")
    private Double loanPbc;

    /**
     * 向中央银行借款(环比%)
     */
    @Excel(name = "向中央银行借款(环比%)")
    private Double loanPbcYoy;

    /**
     * 同业及其他金融机构存放款项
     */
    @Excel(name = "同业及其他金融机构存放款项")
    private Double iofiDeposit;

    /**
     * 同业及其他金融机构存放款项(环比%)
     */
    @Excel(name = "同业及其他金融机构存放款项(环比%)")
    private Double iofiDepositYoy;

    /**
     * 吸收存款
     */
    @Excel(name = "吸收存款")
    private Double acceptDeposit;

    /**
     * 吸收存款(环比%)
     */
    @Excel(name = "吸收存款(环比%)")
    private Double acceptDepositYoy;

    /**
     * 其他权益工具
     */
    @Excel(name = "其他权益工具")
    private Double otherEquityOther;

    /**
     * 其他权益工具(环比%)
     */
    @Excel(name = "其他权益工具(环比%)")
    private Double otherEquityOtherYoy;

    /**
     * 优先股
     */
    @Excel(name = "优先股")
    private Double preferredShares;

    /**
     * 优先股(环比%)
     */
    @Excel(name = "优先股(环比%)")
    private Double preferredSharesYoy;

    /**
     * 永续债
     */
    @Excel(name = "永续债")
    private Double perpetualBond;

    /**
     * 永续债(环比%)
     */
    @Excel(name = "永续债(环比%)")
    private Double perpetualBondYoy;

    /**
     * 应收保费
     */
    @Excel(name = "应收保费")
    private Double premiumRece;

    /**
     * 应收保费(环比%)
     */
    @Excel(name = "应收保费(环比%)")
    private Double premiumReceYoy;

    /**
     * 应收分保账款
     */
    @Excel(name = "应收分保账款")
    private Double reinsureRece;

    /**
     * 应收分保账款(环比%)
     */
    @Excel(name = "应收分保账款(环比%)")
    private Double reinsureReceYoy;

    /**
     * 应收分保未到期责任准备金
     */
    @Excel(name = "应收分保未到期责任准备金")
    private Double rudReserveRece;

    /**
     * 应收分保未到期责任准备金(环比%)
     */
    @Excel(name = "应收分保未到期责任准备金(环比%)")
    private Double rudReserveReceYoy;

    /**
     * 应收分保未决赔偿准备金
     */
    @Excel(name = "应收分保未决赔偿准备金")
    private Double rucReserveRece;

    /**
     * 应收分保未决赔偿准备金(环比%)
     */
    @Excel(name = "应收分保未决赔偿准备金(环比%)")
    private Double rucReserveReceYoy;

    /**
     * 其他应收款
     */
    @Excel(name = "其他应收款")
    private Double otherRece;

    /**
     * 其他应收款(环比%)
     */
    @Excel(name = "其他应收款(环比%)")
    private Double otherReceYoy;

    /**
     * 定期存款
     */
    @Excel(name = "定期存款")
    private Double timeDeposit;

    /**
     * 定期存款(环比%)
     */
    @Excel(name = "定期存款(环比%)")
    private Double timeDepositYoy;

    /**
     * 持有至到期投资
     */
    @Excel(name = "持有至到期投资")
    private Double holdMaturityInvest;

    /**
     * 持有至到期投资(环比%)
     */
    @Excel(name = "持有至到期投资(环比%)")
    private Double holdMaturityInvestYoy;

    /**
     * 存出资本保证金
     */
    @Excel(name = "存出资本保证金")
    private Double refundCapitalDeposit;

    /**
     * 存出资本保证金(环比%)
     */
    @Excel(name = "存出资本保证金(环比%)")
    private Double refundCapitalDepositYoy;

    /**
     * 预收账款
     */
    @Excel(name = "预收账款")
    private Double advanceRece;

    /**
     * 预收账款(环比%)
     */
    @Excel(name = "预收账款(环比%)")
    private Double advanceReceYoy;

    /**
     * 预收保费
     */
    @Excel(name = "预收保费")
    private Double advancePremium;

    /**
     * 预收保费(环比%)
     */
    @Excel(name = "预收保费(环比%)")
    private Double advancePremiumYoy;

    /**
     * 应付手续费及佣金
     */
    @Excel(name = "应付手续费及佣金")
    private Double feeCommissionPayable;

    /**
     * 应付手续费及佣金(环比%)
     */
    @Excel(name = "应付手续费及佣金(环比%)")
    private Double feeCommissionPayableYoy;

    /**
     * 应付分保账款
     */
    @Excel(name = "应付分保账款")
    private Double reinsurePayable;

    /**
     * 应付分保账款(环比%)
     */
    @Excel(name = "应付分保账款(环比%)")
    private Double reinsurePayableYoy;

    /**
     * 应付赔付款
     */
    @Excel(name = "应付赔付款")
    private Double compensatePayable;

    /**
     * 应付赔付款(环比%)
     */
    @Excel(name = "应付赔付款(环比%)")
    private Double compensatePayableYoy;

    /**
     * 待处理抵债资产净额
     */
    @Excel(name = "待处理抵债资产净额")
    private Double netPendmortgageAsset;

    /**
     * 待处理抵债资产净额(环比%)
     */
    @Excel(name = "待处理抵债资产净额(环比%)")
    private Double netPendmortgageAssetYoy;

    /**
     * 套期储备
     */
    @Excel(name = "套期储备")
    private Double hedgeReserve;

    /**
     * 套期储备(环比%)
     */
    @Excel(name = "套期储备(环比%)")
    private Double hedgeReserveYoy;

    /**
     * 优先股
     */
    @Excel(name = "优先股")
    private Double preferredSharesPaybale;

    /**
     * 优先股(环比%)
     */
    @Excel(name = "优先股(环比%)")
    private Double preferredSharesPaybaleYoy;

    /**
     * 交易性金融资产
     */
    @Excel(name = "交易性金融资产")
    private Double tradeFinasset;

    /**
     * 交易性金融资产(环比%)
     */
    @Excel(name = "交易性金融资产(环比%)")
    private Double tradeFinassetYoy;

    /**
     * 持有待售资产
     */
    @Excel(name = "持有待售资产")
    private Double holdsaleAsset;

    /**
     * 持有待售资产(环比%)
     */
    @Excel(name = "持有待售资产(环比%)")
    private Double holdsaleAssetYoy;

    /**
     * 指定以公允价值计量且其变动计入当期损益的金融负债
     */
    @Excel(name = "指定以公允价值计量且其变动计入当期损益的金融负债")
    private Double appointFvtplFinliab;

    /**
     * 指定以公允价值计量且其变动计入当期损益的金融负债(环比%)
     */
    @Excel(name = "指定以公允价值计量且其变动计入当期损益的金融负债(环比%)")
    private Double appointFvtplFinliabYoy;

    /**
     * 负债平衡项目
     */
    @Excel(name = "负债平衡项目")
    private Double liabBalance;

    /**
     * 负债平衡项目(环比%)
     */
    @Excel(name = "负债平衡项目(环比%)")
    private Double liabBalanceYoy;

    /**
     * 存款证及应付票据
     */
    @Excel(name = "存款证及应付票据")
    private Double cdNotePayable;

    /**
     * 存款证及应付票据(环比%)
     */
    @Excel(name = "存款证及应付票据(环比%)")
    private Double cdNotePayableYoy;

    /**
     * 资产平衡项目
     */
    @Excel(name = "资产平衡项目")
    private Double assetBalance;

    /**
     * 资产平衡项目(环比%)
     */
    @Excel(name = "资产平衡项目(环比%)")
    private Double assetBalanceYoy;

    /**
     * 待处理抵债资产
     */
    @Excel(name = "待处理抵债资产")
    private Double pendMortgageAsset;

    /**
     * 待处理抵债资产(环比%)
     */
    @Excel(name = "待处理抵债资产(环比%)")
    private Double pendMortgageAssetYoy;

    /**
     * 持有待售负债
     */
    @Excel(name = "持有待售负债")
    private Double holdsaleLiab;

    /**
     * 持有待售负债(环比%)
     */
    @Excel(name = "持有待售负债(环比%)")
    private Double holdsaleLiabYoy;

    /**
     * 负债及股东权益平衡项目
     */
    @Excel(name = "负债及股东权益平衡项目")
    private Double liabEquityBalance;

    /**
     * 负债及股东权益平衡项目(环比%)
     */
    @Excel(name = "负债及股东权益平衡项目(环比%)")
    private Double liabEquityBalanceYoy;

    /**
     * 归属于母公司股东权益平衡项目
     */
    @Excel(name = "归属于母公司股东权益平衡项目")
    private Double equityBalance;

    /**
     * 归属于母公司股东权益平衡项目(环比%)
     */
    @Excel(name = "归属于母公司股东权益平衡项目(环比%)")
    private Double equityBalanceYoy;

    /**
     * 归属于母公司股东权益平衡项目
     */
    @Excel(name = "归属于母公司股东权益平衡项目")
    private Double parentEquityBalance;

    /**
     * 归属于母公司股东权益平衡项目(环比%)
     */
    @Excel(name = "归属于母公司股东权益平衡项目(环比%)")
    private Double parentEquityBalanceYoy;

    /**
     * 其他权益工具
     */
    @Excel(name = "其他权益工具")
    private Double otherEquityTool;

    /**
     * 其他权益工具(环比%)
     */
    @Excel(name = "其他权益工具(环比%)")
    private Double otherEquityToolYoy;

    /**
     * 股东权益其他项目
     */
    @Excel(name = "股东权益其他项目")
    private Double equityOther;

    /**
     * 股东权益其他项目(环比%)
     */
    @Excel(name = "股东权益其他项目(环比%)")
    private Double equityOtherYoy;

    /**
     * 负债和股东权益其他项目
     */
    @Excel(name = "负债和股东权益其他项目")
    private Double liabEquityOther;

    /**
     * 负债和股东权益其他项目(环比%)
     */
    @Excel(name = "负债和股东权益其他项目(环比%)")
    private Double liabEquityOtherYoy;

    /**
     * 应收款项类投资
     */
    @Excel(name = "应收款项类投资")
    private Double investRece;

    /**
     * 应收款项类投资(环比%)
     */
    @Excel(name = "应收款项类投资(环比%)")
    private Double investReceYoy;

    /**
     * 库存股
     */
    @Excel(name = "库存股")
    private Double treasuryShares;

    /**
     * 库存股(环比%)
     */
    @Excel(name = "库存股(环比%)")
    private Double treasurySharesYoy;

    /**
     * 汇出汇款
     */
    @Excel(name = "汇出汇款")
    private Double outwardRemit;

    /**
     * 汇出汇款(环比%)
     */
    @Excel(name = "汇出汇款(环比%)")
    private Double outwardRemitYoy;

    /**
     * 以摊余成本计量的金融负债
     */
    @Excel(name = "以摊余成本计量的金融负债")
    private Double amortizeCostFinliab;

    /**
     * 以摊余成本计量的金融负债(环比%)
     */
    @Excel(name = "以摊余成本计量的金融负债(环比%)")
    private Double amortizeCostFinliabYoy;

    /**
     * 对联营和合营企业的投资
     */
    @Excel(name = "对联营和合营企业的投资")
    private Double investJoint;

    /**
     * 对联营和合营企业的投资(环比%)
     */
    @Excel(name = "对联营和合营企业的投资(环比%)")
    private Double investJointYoy;

    /**
     * 投资重估储备
     */
    @Excel(name = "投资重估储备")
    private Double investRevalueReserve;

    /**
     * 投资重估储备(环比%)
     */
    @Excel(name = "投资重估储备(环比%)")
    private Double investRevalueReserveYoy;

    /**
     * 外币报表折算差额
     */
    @Excel(name = "外币报表折算差额")
    private Double convertDiff;

    /**
     * 外币报表折算差额(环比%)
     */
    @Excel(name = "外币报表折算差额(环比%)")
    private Double convertDiffYoy;

    /**
     * 交易性金融负债
     */
    @Excel(name = "交易性金融负债")
    private Double tradeFinliab;

    /**
     * 交易性金融负债(环比%)
     */
    @Excel(name = "交易性金融负债(环比%)")
    private Double tradeFinliabYoy;

    /**
     * 建议分派股利
     */
    @Excel(name = "建议分派股利")
    private Double adviceAssignDividend;

    /**
     * 建议分派股利(环比%)
     */
    @Excel(name = "建议分派股利(环比%)")
    private Double adviceAssignDividendYoy;

    /**
     * 指定以公允价值计量且其变动计入当期损益的金融资产
     */
    @Excel(name = "指定以公允价值计量且其变动计入当期损益的金融资产")
    private Double appointFvtplFinasset;

    /**
     * 指定以公允价值计量且其变动计入当期损益的金融资产(环比%)
     */
    @Excel(name = "指定以公允价值计量且其变动计入当期损益的金融资产(环比%)")
    private Double appointFvtplFinassetYoy;

    /**
     * 抵债资产减值准备
     */
    @Excel(name = "抵债资产减值准备")
    private Double mortgageAssetImpairment;

    /**
     * 抵债资产减值准备(环比%)
     */
    @Excel(name = "抵债资产减值准备(环比%)")
    private Double mortgageAssetImpairmentYoy;

    /**
     * 永续债/应付债券
     */
    @Excel(name = "永续债/应付债券")
    private Double perpetualBondPaybale;

    /**
     * 永续债/应付债券(环比%)
     */
    @Excel(name = "永续债/应付债券(环比%)")
    private Double perpetualBondPaybaleYoy;

    /**
     * 存款证及应付票据
     */
    @Excel(name = "存款证及应付票据")
    private Double depositCertificate;

    /**
     * 存款证及应付票据(环比%)
     */
    @Excel(name = "存款证及应付票据(环比%)")
    private Double depositCertificateYoy;

    /**
     * 对子公司的投资
     */
    @Excel(name = "对子公司的投资")
    private Double investSubsidiary;

    /**
     * 对子公司的投资(环比%)
     */
    @Excel(name = "对子公司的投资(环比%)")
    private Double investSubsidiaryYoy;

    /**
     * 归属于母公司股东权益其他项目
     */
    @Excel(name = "归属于母公司股东权益其他项目")
    private Double parentEquityOther;

    /**
     * 归属于母公司股东权益其他项目(环比%)
     */
    @Excel(name = "归属于母公司股东权益其他项目(环比%)")
    private Double parentEquityOtherYoy;

    /**
     * 保户储金及投资款
     */
    @Excel(name = "保户储金及投资款")
    private Double insuredDepositInvest;

    /**
     * 保户储金及投资款(环比%)
     */
    @Excel(name = "保户储金及投资款(环比%)")
    private Double insuredDepositInvestYoy;

    /**
     * 独立账户负债
     */
    @Excel(name = "独立账户负债")
    private Double indAccLiab;

    /**
     * 独立账户负债(环比%)
     */
    @Excel(name = "独立账户负债(环比%)")
    private Double indAccLiabYoy;

    /**
     * 债权计划投资
     */
    @Excel(name = "债权计划投资")
    private Double creditorPlanInvest;

    /**
     * 债权计划投资(环比%)
     */
    @Excel(name = "债权计划投资(环比%)")
    private Double creditorPlanInvestYoy;

    /**
     * 应收分保合同准备金
     */
    @Excel(name = "应收分保合同准备金")
    private Double rcReserveRece;

    /**
     * 应收分保合同准备金(环比%)
     */
    @Excel(name = "应收分保合同准备金(环比%)")
    private Double rcReserveReceYoy;

    /**
     * 非流动负债其他项目
     */
    @Excel(name = "非流动负债其他项目")
    private Double noncurrentLiabOther;

    /**
     * 非流动负债其他项目(环比%)
     */
    @Excel(name = "非流动负债其他项目(环比%)")
    private Double noncurrentLiabOtherYoy;

    /**
     * 独立账户资产
     */
    @Excel(name = "独立账户资产")
    private Double indAccAsset;

    /**
     * 独立账户资产(环比%)
     */
    @Excel(name = "独立账户资产(环比%)")
    private Double indAccAssetYoy;

    /**
     * 应收补贴款
     */
    @Excel(name = "应收补贴款")
    private Double subsidyRece;

    /**
     * 应收补贴款(环比%)
     */
    @Excel(name = "应收补贴款(环比%)")
    private Double subsidyReceYoy;

    /**
     * 以公允价值计量且其变动计入其他综合收益的非流动金融资产(环比%)
     */
    @Excel(name = "以公允价值计量且其变动计入其他综合收益的非流动金融资产(环比%)")
    private Double fvtociNcfinasset;

    /**
     * 以公允价值计量且其变动计入其他综合收益的非流动金融资产(环比%)
     */
    @Excel(name = "以公允价值计量且其变动计入其他综合收益的非流动金融资产(环比%)")
    private Double fvtociNcfinassetYoy;

    /**
     * 其他应付款
     */
    @Excel(name = "其他应付款")
    private Double otherPayable;

    /**
     * 其他应付款(环比%)
     */
    @Excel(name = "其他应付款(环比%)")
    private Double otherPayableYoy;

    /**
     * 寿险责任准备金
     */
    @Excel(name = "寿险责任准备金")
    private Double ldReserve;

    /**
     * 寿险责任准备金(环比%)
     */
    @Excel(name = "寿险责任准备金(环比%)")
    private Double ldReserveYoy;

    /**
     * 流动负债其他项目
     */
    @Excel(name = "流动负债其他项目")
    private Double currentLiabOther;

    /**
     * 流动负债其他项目(环比%)
     */
    @Excel(name = "流动负债其他项目(环比%)")
    private Double currentLiabOtherYoy;

    /**
     * 工程物资
     */
    @Excel(name = "工程物资")
    private Double projectMaterial;

    /**
     * 工程物资(环比%)
     */
    @Excel(name = "工程物资(环比%)")
    private Double projectMaterialYoy;

    /**
     * 固定资产清理
     */
    @Excel(name = "固定资产清理")
    private Double fixedAssetDisposal;

    /**
     * 固定资产清理(环比%)
     */
    @Excel(name = "固定资产清理(环比%)")
    private Double fixedAssetDisposalYoy;

    /**
     * 其他非流动负债
     */
    @Excel(name = "其他非流动负债")
    private Double otherNoncurrentLiab;

    /**
     * 其他非流动负债(环比%)
     */
    @Excel(name = "其他非流动负债(环比%)")
    private Double otherNoncurrentLiabYoy;

    /**
     * 油气资产
     */
    @Excel(name = "油气资产")
    private Double oilGasAsset;

    /**
     * 油气资产(环比%)
     */
    @Excel(name = "油气资产(环比%)")
    private Double oilGasAssetYoy;

    /**
     * 非流动负债平衡项目
     */
    @Excel(name = "非流动负债平衡项目")
    private Double noncurrentLiabBalance;

    /**
     * 非流动负债平衡项目(环比%)
     */
    @Excel(name = "非流动负债平衡项目(环比%)")
    private Double noncurrentLiabBalanceYoy;

    /**
     * 非流动资产平衡项目
     */
    @Excel(name = "非流动资产平衡项目")
    private Double noncurrentAssetBalance;

    /**
     * 非流动资产平衡项目(环比%)
     */
    @Excel(name = "非流动资产平衡项目(环比%)")
    private Double noncurrentAssetBalanceYoy;

    /**
     * 流动负债平衡项目
     */
    @Excel(name = "流动负债平衡项目")
    private Double currentLiabBalance;

    /**
     * 流动负债平衡项目(环比%)
     */
    @Excel(name = "流动负债平衡项目(环比%)")
    private Double currentLiabBalanceYoy;

    /**
     * 应付保单红利
     */
    @Excel(name = "应付保单红利")
    private Double policyBonusPayable;

    /**
     * 应付保单红利(环比%)
     */
    @Excel(name = "应付保单红利(环比%)")
    private Double policyBonusPayableYoy;

    /**
     * 内部应付款
     */
    @Excel(name = "内部应付款")
    private Double internalPayable;

    /**
     * 内部应付款(环比%)
     */
    @Excel(name = "内部应付款(环比%)")
    private Double internalPayableYoy;

    /**
     * 专项应付款
     */
    @Excel(name = "专项应付款")
    private Double specialPayable;

    /**
     * 专项应付款(环比%)
     */
    @Excel(name = "专项应付款(环比%)")
    private Double specialPayableYoy;

    /**
     * 应收分保寿险责任准备金
     */
    @Excel(name = "应收分保寿险责任准备金")
    private Double rldReserveRece;

    /**
     * 应收分保寿险责任准备金(环比%)
     */
    @Excel(name = "应收分保寿险责任准备金(环比%)")
    private Double rldReserveReceYoy;

    /**
     * 应收分保长期健康险责任准备金
     */
    @Excel(name = "应收分保长期健康险责任准备金")
    private Double rhdReserveRece;

    /**
     * 应收分保长期健康险责任准备金(环比%)
     */
    @Excel(name = "应收分保长期健康险责任准备金(环比%)")
    private Double rhdReserveReceYoy;

    /**
     * 预计流动负债
     */
    @Excel(name = "预计流动负债")
    private Double predictCurrentLiab;

    /**
     * 预计流动负债(环比%)
     */
    @Excel(name = "预计流动负债(环比%)")
    private Double predictCurrentLiabYoy;

    /**
     * 存入保证金
     */
    @Excel(name = "存入保证金")
    private Double refundDepositRece;

    /**
     * 存入保证金(环比%)
     */
    @Excel(name = "存入保证金(环比%)")
    private Double refundDepositReceYoy;

    /**
     * 长期健康险责任准备金
     */
    @Excel(name = "长期健康险责任准备金")
    private Double hdReserve;

    /**
     * 长期健康险责任准备金(环比%)
     */
    @Excel(name = "长期健康险责任准备金(环比%)")
    private Double hdReserveYoy;

    /**
     * 保户质押贷款
     */
    @Excel(name = "保户质押贷款")
    private Double insuredPledgeLoan;

    /**
     * 保户质押贷款(环比%)
     */
    @Excel(name = "保户质押贷款(环比%)")
    private Double insuredPledgeLoanYoy;

    /**
     * 其他非流动金融资产
     */
    @Excel(name = "其他非流动金融资产")
    private Double otherNoncurrentFinasset;

    /**
     * 其他非流动金融资产(环比%)
     */
    @Excel(name = "其他非流动金融资产(环比%)")
    private Double otherNoncurrentFinassetYoy;

    /**
     * 拟分配现金股利
     */
    @Excel(name = "拟分配现金股利")
    private Double assignCashDividend;

    /**
     * 拟分配现金股利(环比%)
     */
    @Excel(name = "拟分配现金股利(环比%)")
    private Double assignCashDividendYoy;

    /**
     * 预收款项
     */
    @Excel(name = "预收款项")
    private Double advanceReceivables;

    /**
     * 预收款项(环比%)
     */
    @Excel(name = "预收款项(环比%)")
    private Double advanceReceivablesYoy;

    /**
     * 应付短期债券
     */
    @Excel(name = "应付短期债券")
    private Double shortBondPayable;

    /**
     * 应付短期债券(环比%)
     */
    @Excel(name = "应付短期债券(环比%)")
    private Double shortBondPayableYoy;

    /**
     * 流动资产平衡项目
     */
    @Excel(name = "流动资产平衡项目")
    private Double currentAssetBalance;

    /**
     * 流动资产平衡项目(环比%)
     */
    @Excel(name = "流动资产平衡项目(环比%)")
    private Double currentAssetBalanceYoy;

    /**
     * 以摊余成本计量的非流动金融负债
     */
    @Excel(name = "以摊余成本计量的非流动金融负债")
    private Double amortizeCostNcfinliab;

    /**
     * 以摊余成本计量的非流动金融负债(环比%)
     */
    @Excel(name = "以摊余成本计量的非流动金融负债(环比%)")
    private Double amortizeCostNcfinliabYoy;

    /**
     * 以摊余成本计量的非流动金融资产
     */
    @Excel(name = "以摊余成本计量的非流动金融资产")
    private Double amortizeCostNcfinasset;

    /**
     * 以摊余成本计量的非流动金融资产(环比%)
     */
    @Excel(name = "以摊余成本计量的非流动金融资产(环比%)")
    private Double amortizeCostNcfinassetYoy;

    /**
     * 保险合同准备金
     */
    @Excel(name = "保险合同准备金")
    private Double insuranceContractReserve;

    /**
     * 保险合同准备金(环比%)
     */
    @Excel(name = "保险合同准备金(环比%)")
    private Double insuranceContractReserveYoy;

    /**
     * 客户信用资金存款
     */
    @Excel(name = "客户信用资金存款")
    private Double customerCreditDeposit;

    /**
     * 客户信用资金存款(环比%)
     */
    @Excel(name = "客户信用资金存款(环比%)")
    private Double customerCreditDepositYoy;

    /**
     * 未决赔款准备金
     */
    @Excel(name = "未决赔款准备金")
    private Double ucReserve;

    /**
     * 未决赔款准备金(环比%)
     */
    @Excel(name = "未决赔款准备金(环比%)")
    private Double ucReserveYoy;

    /**
     * 信用备付金
     */
    @Excel(name = "信用备付金")
    private Double creditExcessReserve;

    /**
     * 信用备付金(环比%)
     */
    @Excel(name = "信用备付金(环比%)")
    private Double creditExcessReserveYoy;

    /**
     * 交易席位费
     */
    @Excel(name = "交易席位费")
    private Double tradeSeatFee;

    /**
     * 交易席位费(环比%)
     */
    @Excel(name = "交易席位费(环比%)")
    private Double tradeSeatFeeYoy;

    /**
     * 交易风险准备
     */
    @Excel(name = "交易风险准备")
    private Double tradeRiskReserve;

    /**
     * 交易风险准备(环比%)
     */
    @Excel(name = "交易风险准备(环比%)")
    private Double tradeRiskReserveYoy;

    /**
     * 信用交易代理买卖证券款
     */
    @Excel(name = "信用交易代理买卖证券款")
    private Double creditAgentSecurity;

    /**
     * 信用交易代理买卖证券款(环比%)
     */
    @Excel(name = "信用交易代理买卖证券款(环比%)")
    private Double creditAgentSecurityYoy;

    /**
     * 融出资金中融出证券
     */
    @Excel(name = "融出资金中融出证券")
    private Double finSecurity;

    /**
     * 融出资金中融出证券(环比%)
     */
    @Excel(name = "融出资金中融出证券(环比%)")
    private Double finSecurityYoy;

    /**
     * 短期借款中质押借款
     */
    @Excel(name = "短期借款中质押借款")
    private Double pledgeLoan;

    /**
     * 短期借款中质押借款(环比%)
     */
    @Excel(name = "短期借款中质押借款(环比%)")
    private Double pledgeLoanYoy;

    /**
     * 未到期责任准备金
     */
    @Excel(name = "未到期责任准备金")
    private Double udReserve;

    /**
     * 未到期责任准备金(环比%)
     */
    @Excel(name = "未到期责任准备金(环比%)")
    private Double udReserveYoy;

    /**
     * 内部应收款
     */
    @Excel(name = "内部应收款")
    private Double internalRece;

    /**
     * 内部应收款(环比%)
     */
    @Excel(name = "内部应收款(环比%)")
    private Double internalReceYoy;

    /**
     * 未确定的投资损失
     */
    @Excel(name = "未确定的投资损失")
    private Double unconfirmInvestLoss;

    /**
     * 未确定的投资损失(环比%)
     */
    @Excel(name = "未确定的投资损失(环比%)")
    private Double unconfirmInvestLossYoy;

    /**
     * 应收出口退税
     */
    @Excel(name = "应收出口退税")
    private Double exportRefundRece;

    /**
     * 应收出口退税(环比%)
     */
    @Excel(name = "应收出口退税(环比%)")
    private Double exportRefundReceYoy;

    /**
     * 流动资产其他项目
     */
    @Excel(name = "流动资产其他项目")
    private Double currentAssetOther;

    /**
     * 流动资产其他项目(环比%)
     */
    @Excel(name = "流动资产其他项目(环比%)")
    private Double currentAssetOtherYoy;

    /**
     * 非流动资产其他项目
     */
    @Excel(name = "非流动资产其他项目")
    private Double noncurrentAssetOther;

    /**
     * 非流动资产其他项目(环比%)
     */
    @Excel(name = "非流动资产其他项目(环比%)")
    private Double noncurrentAssetOtherYoy;

    /**
     * 生产性生物资产
     */
    @Excel(name = "生产性生物资产")
    private Double productiveBiologyAsset;

    /**
     * 生产性生物资产(环比%)
     */
    @Excel(name = "生产性生物资产(环比%)")
    private Double productiveBiologyAssetYoy;

    /**
     * 预提费用
     */
    @Excel(name = "预提费用")
    private Double accruedExpense;

    /**
     * 预提费用(环比%)
     */
    @Excel(name = "预提费用(环比%)")
    private Double accruedExpenseYoy;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    public String getOrgType() {
        return orgType;
    }

    public void setSecurityTypeCode(String securityTypeCode) {
        this.securityTypeCode = securityTypeCode;
    }

    public String getSecurityTypeCode() {
        return securityTypeCode;
    }

    public void setSecurityNameAbbr(String securityNameAbbr) {
        this.securityNameAbbr = securityNameAbbr;
    }

    public String getSecurityNameAbbr() {
        return securityNameAbbr;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportDateName(String reportDateName) {
        this.reportDateName = reportDateName;
    }

    public String getReportDateName() {
        return reportDateName;
    }

    public void setNoticeDate(Date noticeDate) {
        this.noticeDate = noticeDate;
    }

    public Date getNoticeDate() {
        return noticeDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setOpinionType(String opinionType) {
        this.opinionType = opinionType;
    }

    public String getOpinionType() {
        return opinionType;
    }

    public void setOsopinionType(String osopinionType) {
        this.osopinionType = osopinionType;
    }

    public String getOsopinionType() {
        return osopinionType;
    }

    public void setMonetaryfunds(Double monetaryfunds) {
        this.monetaryfunds = monetaryfunds;
    }

    public Double getMonetaryfunds() {
        return monetaryfunds;
    }

    public void setMonetaryfundsYoy(Double monetaryfundsYoy) {
        this.monetaryfundsYoy = monetaryfundsYoy;
    }

    public Double getMonetaryfundsYoy() {
        return monetaryfundsYoy;
    }

    public void setCustomerDeposit(Double customerDeposit) {
        this.customerDeposit = customerDeposit;
    }

    public Double getCustomerDeposit() {
        return customerDeposit;
    }

    public void setCustomerDepositYoy(Double customerDepositYoy) {
        this.customerDepositYoy = customerDepositYoy;
    }

    public Double getCustomerDepositYoy() {
        return customerDepositYoy;
    }

    public void setSettleExcessReserve(Double settleExcessReserve) {
        this.settleExcessReserve = settleExcessReserve;
    }

    public Double getSettleExcessReserve() {
        return settleExcessReserve;
    }

    public void setSettleExcessReserveYoy(Double settleExcessReserveYoy) {
        this.settleExcessReserveYoy = settleExcessReserveYoy;
    }

    public Double getSettleExcessReserveYoy() {
        return settleExcessReserveYoy;
    }

    public void setCustomerExcessReserve(Double customerExcessReserve) {
        this.customerExcessReserve = customerExcessReserve;
    }

    public Double getCustomerExcessReserve() {
        return customerExcessReserve;
    }

    public void setCustomerExcessReserveYoy(Double customerExcessReserveYoy) {
        this.customerExcessReserveYoy = customerExcessReserveYoy;
    }

    public Double getCustomerExcessReserveYoy() {
        return customerExcessReserveYoy;
    }

    public void setFinFund(Double finFund) {
        this.finFund = finFund;
    }

    public Double getFinFund() {
        return finFund;
    }

    public void setFinFundYoy(Double finFundYoy) {
        this.finFundYoy = finFundYoy;
    }

    public Double getFinFundYoy() {
        return finFundYoy;
    }

    public void setFvtplFinasset(Double fvtplFinasset) {
        this.fvtplFinasset = fvtplFinasset;
    }

    public Double getFvtplFinasset() {
        return fvtplFinasset;
    }

    public void setFvtplFinassetYoy(Double fvtplFinassetYoy) {
        this.fvtplFinassetYoy = fvtplFinassetYoy;
    }

    public Double getFvtplFinassetYoy() {
        return fvtplFinassetYoy;
    }

    public void setDeriveFinasset(Double deriveFinasset) {
        this.deriveFinasset = deriveFinasset;
    }

    public Double getDeriveFinasset() {
        return deriveFinasset;
    }

    public void setDeriveFinassetYoy(Double deriveFinassetYoy) {
        this.deriveFinassetYoy = deriveFinassetYoy;
    }

    public Double getDeriveFinassetYoy() {
        return deriveFinassetYoy;
    }

    public void setBuyResaleFinasset(Double buyResaleFinasset) {
        this.buyResaleFinasset = buyResaleFinasset;
    }

    public Double getBuyResaleFinasset() {
        return buyResaleFinasset;
    }

    public void setBuyResaleFinassetYoy(Double buyResaleFinassetYoy) {
        this.buyResaleFinassetYoy = buyResaleFinassetYoy;
    }

    public Double getBuyResaleFinassetYoy() {
        return buyResaleFinassetYoy;
    }

    public void setReceivables(Double receivables) {
        this.receivables = receivables;
    }

    public Double getReceivables() {
        return receivables;
    }

    public void setReceivablesYoy(Double receivablesYoy) {
        this.receivablesYoy = receivablesYoy;
    }

    public Double getReceivablesYoy() {
        return receivablesYoy;
    }

    public void setInterestRece(Double interestRece) {
        this.interestRece = interestRece;
    }

    public Double getInterestRece() {
        return interestRece;
    }

    public void setInterestReceYoy(Double interestReceYoy) {
        this.interestReceYoy = interestReceYoy;
    }

    public Double getInterestReceYoy() {
        return interestReceYoy;
    }

    public void setRefundDepositPay(Double refundDepositPay) {
        this.refundDepositPay = refundDepositPay;
    }

    public Double getRefundDepositPay() {
        return refundDepositPay;
    }

    public void setRefundDepositPayYoy(Double refundDepositPayYoy) {
        this.refundDepositPayYoy = refundDepositPayYoy;
    }

    public Double getRefundDepositPayYoy() {
        return refundDepositPayYoy;
    }

    public void setTradeFinassetNotfvtpl(Double tradeFinassetNotfvtpl) {
        this.tradeFinassetNotfvtpl = tradeFinassetNotfvtpl;
    }

    public Double getTradeFinassetNotfvtpl() {
        return tradeFinassetNotfvtpl;
    }

    public void setTradeFinassetNotfvtplYoy(Double tradeFinassetNotfvtplYoy) {
        this.tradeFinassetNotfvtplYoy = tradeFinassetNotfvtplYoy;
    }

    public Double getTradeFinassetNotfvtplYoy() {
        return tradeFinassetNotfvtplYoy;
    }

    public void setCreditorInvest(Double creditorInvest) {
        this.creditorInvest = creditorInvest;
    }

    public Double getCreditorInvest() {
        return creditorInvest;
    }

    public void setCreditorInvestYoy(Double creditorInvestYoy) {
        this.creditorInvestYoy = creditorInvestYoy;
    }

    public Double getCreditorInvestYoy() {
        return creditorInvestYoy;
    }

    public void setOtherCreditorInvest(Double otherCreditorInvest) {
        this.otherCreditorInvest = otherCreditorInvest;
    }

    public Double getOtherCreditorInvest() {
        return otherCreditorInvest;
    }

    public void setOtherCreditorInvestYoy(Double otherCreditorInvestYoy) {
        this.otherCreditorInvestYoy = otherCreditorInvestYoy;
    }

    public Double getOtherCreditorInvestYoy() {
        return otherCreditorInvestYoy;
    }

    public void setOtherEquityInvest(Double otherEquityInvest) {
        this.otherEquityInvest = otherEquityInvest;
    }

    public Double getOtherEquityInvest() {
        return otherEquityInvest;
    }

    public void setOtherEquityInvestYoy(Double otherEquityInvestYoy) {
        this.otherEquityInvestYoy = otherEquityInvestYoy;
    }

    public Double getOtherEquityInvestYoy() {
        return otherEquityInvestYoy;
    }

    public void setAvailableSaleFinasset(Double availableSaleFinasset) {
        this.availableSaleFinasset = availableSaleFinasset;
    }

    public Double getAvailableSaleFinasset() {
        return availableSaleFinasset;
    }

    public void setAvailableSaleFinassetYoy(Double availableSaleFinassetYoy) {
        this.availableSaleFinassetYoy = availableSaleFinassetYoy;
    }

    public Double getAvailableSaleFinassetYoy() {
        return availableSaleFinassetYoy;
    }

    public void setLongEquityInvest(Double longEquityInvest) {
        this.longEquityInvest = longEquityInvest;
    }

    public Double getLongEquityInvest() {
        return longEquityInvest;
    }

    public void setLongEquityInvestYoy(Double longEquityInvestYoy) {
        this.longEquityInvestYoy = longEquityInvestYoy;
    }

    public Double getLongEquityInvestYoy() {
        return longEquityInvestYoy;
    }

    public void setInvestRealestate(Double investRealestate) {
        this.investRealestate = investRealestate;
    }

    public Double getInvestRealestate() {
        return investRealestate;
    }

    public void setInvestRealestateYoy(Double investRealestateYoy) {
        this.investRealestateYoy = investRealestateYoy;
    }

    public Double getInvestRealestateYoy() {
        return investRealestateYoy;
    }

    public void setFixedAsset(Double fixedAsset) {
        this.fixedAsset = fixedAsset;
    }

    public Double getFixedAsset() {
        return fixedAsset;
    }

    public void setFixedAssetYoy(Double fixedAssetYoy) {
        this.fixedAssetYoy = fixedAssetYoy;
    }

    public Double getFixedAssetYoy() {
        return fixedAssetYoy;
    }

    public void setCip(Double cip) {
        this.cip = cip;
    }

    public Double getCip() {
        return cip;
    }

    public void setCipYoy(Double cipYoy) {
        this.cipYoy = cipYoy;
    }

    public Double getCipYoy() {
        return cipYoy;
    }

    public void setUserightAsset(Double userightAsset) {
        this.userightAsset = userightAsset;
    }

    public Double getUserightAsset() {
        return userightAsset;
    }

    public void setUserightAssetYoy(Double userightAssetYoy) {
        this.userightAssetYoy = userightAssetYoy;
    }

    public Double getUserightAssetYoy() {
        return userightAssetYoy;
    }

    public void setIntangibleAsset(Double intangibleAsset) {
        this.intangibleAsset = intangibleAsset;
    }

    public Double getIntangibleAsset() {
        return intangibleAsset;
    }

    public void setIntangibleAssetYoy(Double intangibleAssetYoy) {
        this.intangibleAssetYoy = intangibleAssetYoy;
    }

    public Double getIntangibleAssetYoy() {
        return intangibleAssetYoy;
    }

    public void setGoodwill(Double goodwill) {
        this.goodwill = goodwill;
    }

    public Double getGoodwill() {
        return goodwill;
    }

    public void setGoodwillYoy(Double goodwillYoy) {
        this.goodwillYoy = goodwillYoy;
    }

    public Double getGoodwillYoy() {
        return goodwillYoy;
    }

    public void setDeferTaxAsset(Double deferTaxAsset) {
        this.deferTaxAsset = deferTaxAsset;
    }

    public Double getDeferTaxAsset() {
        return deferTaxAsset;
    }

    public void setDeferTaxAssetYoy(Double deferTaxAssetYoy) {
        this.deferTaxAssetYoy = deferTaxAssetYoy;
    }

    public Double getDeferTaxAssetYoy() {
        return deferTaxAssetYoy;
    }

    public void setOtherAsset(Double otherAsset) {
        this.otherAsset = otherAsset;
    }

    public Double getOtherAsset() {
        return otherAsset;
    }

    public void setOtherAssetYoy(Double otherAssetYoy) {
        this.otherAssetYoy = otherAssetYoy;
    }

    public Double getOtherAssetYoy() {
        return otherAssetYoy;
    }

    public void setTotalAssets(Double totalAssets) {
        this.totalAssets = totalAssets;
    }

    public Double getTotalAssets() {
        return totalAssets;
    }

    public void setTotalAssetsYoy(Double totalAssetsYoy) {
        this.totalAssetsYoy = totalAssetsYoy;
    }

    public Double getTotalAssetsYoy() {
        return totalAssetsYoy;
    }

    public void setShortLoan(Double shortLoan) {
        this.shortLoan = shortLoan;
    }

    public Double getShortLoan() {
        return shortLoan;
    }

    public void setShortLoanYoy(Double shortLoanYoy) {
        this.shortLoanYoy = shortLoanYoy;
    }

    public Double getShortLoanYoy() {
        return shortLoanYoy;
    }

    public void setShortFinPayable(Double shortFinPayable) {
        this.shortFinPayable = shortFinPayable;
    }

    public Double getShortFinPayable() {
        return shortFinPayable;
    }

    public void setShortFinPayableYoy(Double shortFinPayableYoy) {
        this.shortFinPayableYoy = shortFinPayableYoy;
    }

    public Double getShortFinPayableYoy() {
        return shortFinPayableYoy;
    }

    public void setBorrowFund(Double borrowFund) {
        this.borrowFund = borrowFund;
    }

    public Double getBorrowFund() {
        return borrowFund;
    }

    public void setBorrowFundYoy(Double borrowFundYoy) {
        this.borrowFundYoy = borrowFundYoy;
    }

    public Double getBorrowFundYoy() {
        return borrowFundYoy;
    }

    public void setTradeFinliabNotfvtpl(Double tradeFinliabNotfvtpl) {
        this.tradeFinliabNotfvtpl = tradeFinliabNotfvtpl;
    }

    public Double getTradeFinliabNotfvtpl() {
        return tradeFinliabNotfvtpl;
    }

    public void setTradeFinliabNotfvtplYoy(Double tradeFinliabNotfvtplYoy) {
        this.tradeFinliabNotfvtplYoy = tradeFinliabNotfvtplYoy;
    }

    public Double getTradeFinliabNotfvtplYoy() {
        return tradeFinliabNotfvtplYoy;
    }

    public void setFvtplFinliab(Double fvtplFinliab) {
        this.fvtplFinliab = fvtplFinliab;
    }

    public Double getFvtplFinliab() {
        return fvtplFinliab;
    }

    public void setFvtplFinliabYoy(Double fvtplFinliabYoy) {
        this.fvtplFinliabYoy = fvtplFinliabYoy;
    }

    public Double getFvtplFinliabYoy() {
        return fvtplFinliabYoy;
    }

    public void setDeriveFinliab(Double deriveFinliab) {
        this.deriveFinliab = deriveFinliab;
    }

    public Double getDeriveFinliab() {
        return deriveFinliab;
    }

    public void setDeriveFinliabYoy(Double deriveFinliabYoy) {
        this.deriveFinliabYoy = deriveFinliabYoy;
    }

    public Double getDeriveFinliabYoy() {
        return deriveFinliabYoy;
    }

    public void setSellRepoFinasset(Double sellRepoFinasset) {
        this.sellRepoFinasset = sellRepoFinasset;
    }

    public Double getSellRepoFinasset() {
        return sellRepoFinasset;
    }

    public void setSellRepoFinassetYoy(Double sellRepoFinassetYoy) {
        this.sellRepoFinassetYoy = sellRepoFinassetYoy;
    }

    public Double getSellRepoFinassetYoy() {
        return sellRepoFinassetYoy;
    }

    public void setAgentTradeSecurity(Double agentTradeSecurity) {
        this.agentTradeSecurity = agentTradeSecurity;
    }

    public Double getAgentTradeSecurity() {
        return agentTradeSecurity;
    }

    public void setAgentTradeSecurityYoy(Double agentTradeSecurityYoy) {
        this.agentTradeSecurityYoy = agentTradeSecurityYoy;
    }

    public Double getAgentTradeSecurityYoy() {
        return agentTradeSecurityYoy;
    }

    public void setAgentUnderwriteSecurity(Double agentUnderwriteSecurity) {
        this.agentUnderwriteSecurity = agentUnderwriteSecurity;
    }

    public Double getAgentUnderwriteSecurity() {
        return agentUnderwriteSecurity;
    }

    public void setAgentUnderwriteSecurityYoy(Double agentUnderwriteSecurityYoy) {
        this.agentUnderwriteSecurityYoy = agentUnderwriteSecurityYoy;
    }

    public Double getAgentUnderwriteSecurityYoy() {
        return agentUnderwriteSecurityYoy;
    }

    public void setAccountsPayable(Double accountsPayable) {
        this.accountsPayable = accountsPayable;
    }

    public Double getAccountsPayable() {
        return accountsPayable;
    }

    public void setAccountsPayableYoy(Double accountsPayableYoy) {
        this.accountsPayableYoy = accountsPayableYoy;
    }

    public Double getAccountsPayableYoy() {
        return accountsPayableYoy;
    }

    public void setStaffSalaryPayable(Double staffSalaryPayable) {
        this.staffSalaryPayable = staffSalaryPayable;
    }

    public Double getStaffSalaryPayable() {
        return staffSalaryPayable;
    }

    public void setStaffSalaryPayableYoy(Double staffSalaryPayableYoy) {
        this.staffSalaryPayableYoy = staffSalaryPayableYoy;
    }

    public Double getStaffSalaryPayableYoy() {
        return staffSalaryPayableYoy;
    }

    public void setTaxPayable(Double taxPayable) {
        this.taxPayable = taxPayable;
    }

    public Double getTaxPayable() {
        return taxPayable;
    }

    public void setTaxPayableYoy(Double taxPayableYoy) {
        this.taxPayableYoy = taxPayableYoy;
    }

    public Double getTaxPayableYoy() {
        return taxPayableYoy;
    }

    public void setInterestPayable(Double interestPayable) {
        this.interestPayable = interestPayable;
    }

    public Double getInterestPayable() {
        return interestPayable;
    }

    public void setInterestPayableYoy(Double interestPayableYoy) {
        this.interestPayableYoy = interestPayableYoy;
    }

    public Double getInterestPayableYoy() {
        return interestPayableYoy;
    }

    public void setLongLoan(Double longLoan) {
        this.longLoan = longLoan;
    }

    public Double getLongLoan() {
        return longLoan;
    }

    public void setLongLoanYoy(Double longLoanYoy) {
        this.longLoanYoy = longLoanYoy;
    }

    public Double getLongLoanYoy() {
        return longLoanYoy;
    }

    public void setBondPayable(Double bondPayable) {
        this.bondPayable = bondPayable;
    }

    public Double getBondPayable() {
        return bondPayable;
    }

    public void setBondPayableYoy(Double bondPayableYoy) {
        this.bondPayableYoy = bondPayableYoy;
    }

    public Double getBondPayableYoy() {
        return bondPayableYoy;
    }

    public void setLeaseLiab(Double leaseLiab) {
        this.leaseLiab = leaseLiab;
    }

    public Double getLeaseLiab() {
        return leaseLiab;
    }

    public void setLeaseLiabYoy(Double leaseLiabYoy) {
        this.leaseLiabYoy = leaseLiabYoy;
    }

    public Double getLeaseLiabYoy() {
        return leaseLiabYoy;
    }

    public void setDeferTaxLiab(Double deferTaxLiab) {
        this.deferTaxLiab = deferTaxLiab;
    }

    public Double getDeferTaxLiab() {
        return deferTaxLiab;
    }

    public void setDeferTaxLiabYoy(Double deferTaxLiabYoy) {
        this.deferTaxLiabYoy = deferTaxLiabYoy;
    }

    public Double getDeferTaxLiabYoy() {
        return deferTaxLiabYoy;
    }

    public void setOtherLiab(Double otherLiab) {
        this.otherLiab = otherLiab;
    }

    public Double getOtherLiab() {
        return otherLiab;
    }

    public void setOtherLiabYoy(Double otherLiabYoy) {
        this.otherLiabYoy = otherLiabYoy;
    }

    public Double getOtherLiabYoy() {
        return otherLiabYoy;
    }

    public void setLiabOther(Double liabOther) {
        this.liabOther = liabOther;
    }

    public Double getLiabOther() {
        return liabOther;
    }

    public void setLiabOtherYoy(Double liabOtherYoy) {
        this.liabOtherYoy = liabOtherYoy;
    }

    public Double getLiabOtherYoy() {
        return liabOtherYoy;
    }

    public void setTotalLiabilities(Double totalLiabilities) {
        this.totalLiabilities = totalLiabilities;
    }

    public Double getTotalLiabilities() {
        return totalLiabilities;
    }

    public void setTotalLiabilitiesYoy(Double totalLiabilitiesYoy) {
        this.totalLiabilitiesYoy = totalLiabilitiesYoy;
    }

    public Double getTotalLiabilitiesYoy() {
        return totalLiabilitiesYoy;
    }

    public void setShareCapital(Double shareCapital) {
        this.shareCapital = shareCapital;
    }

    public Double getShareCapital() {
        return shareCapital;
    }

    public void setShareCapitalYoy(Double shareCapitalYoy) {
        this.shareCapitalYoy = shareCapitalYoy;
    }

    public Double getShareCapitalYoy() {
        return shareCapitalYoy;
    }

    public void setCapitalReserve(Double capitalReserve) {
        this.capitalReserve = capitalReserve;
    }

    public Double getCapitalReserve() {
        return capitalReserve;
    }

    public void setCapitalReserveYoy(Double capitalReserveYoy) {
        this.capitalReserveYoy = capitalReserveYoy;
    }

    public Double getCapitalReserveYoy() {
        return capitalReserveYoy;
    }

    public void setOtherCompreIncome(Double otherCompreIncome) {
        this.otherCompreIncome = otherCompreIncome;
    }

    public Double getOtherCompreIncome() {
        return otherCompreIncome;
    }

    public void setOtherCompreIncomeYoy(Double otherCompreIncomeYoy) {
        this.otherCompreIncomeYoy = otherCompreIncomeYoy;
    }

    public Double getOtherCompreIncomeYoy() {
        return otherCompreIncomeYoy;
    }

    public void setSurplusReserve(Double surplusReserve) {
        this.surplusReserve = surplusReserve;
    }

    public Double getSurplusReserve() {
        return surplusReserve;
    }

    public void setSurplusReserveYoy(Double surplusReserveYoy) {
        this.surplusReserveYoy = surplusReserveYoy;
    }

    public Double getSurplusReserveYoy() {
        return surplusReserveYoy;
    }

    public void setGeneralRiskReserve(Double generalRiskReserve) {
        this.generalRiskReserve = generalRiskReserve;
    }

    public Double getGeneralRiskReserve() {
        return generalRiskReserve;
    }

    public void setGeneralRiskReserveYoy(Double generalRiskReserveYoy) {
        this.generalRiskReserveYoy = generalRiskReserveYoy;
    }

    public Double getGeneralRiskReserveYoy() {
        return generalRiskReserveYoy;
    }

    public void setUnassignRpofit(Double unassignRpofit) {
        this.unassignRpofit = unassignRpofit;
    }

    public Double getUnassignRpofit() {
        return unassignRpofit;
    }

    public void setUnassignRpofitYoy(Double unassignRpofitYoy) {
        this.unassignRpofitYoy = unassignRpofitYoy;
    }

    public Double getUnassignRpofitYoy() {
        return unassignRpofitYoy;
    }

    public void setTotalParentEquity(Double totalParentEquity) {
        this.totalParentEquity = totalParentEquity;
    }

    public Double getTotalParentEquity() {
        return totalParentEquity;
    }

    public void setTotalParentEquityYoy(Double totalParentEquityYoy) {
        this.totalParentEquityYoy = totalParentEquityYoy;
    }

    public Double getTotalParentEquityYoy() {
        return totalParentEquityYoy;
    }

    public void setMinorityEquity(Double minorityEquity) {
        this.minorityEquity = minorityEquity;
    }

    public Double getMinorityEquity() {
        return minorityEquity;
    }

    public void setMinorityEquityYoy(Double minorityEquityYoy) {
        this.minorityEquityYoy = minorityEquityYoy;
    }

    public Double getMinorityEquityYoy() {
        return minorityEquityYoy;
    }

    public void setTotalEquity(Double totalEquity) {
        this.totalEquity = totalEquity;
    }

    public Double getTotalEquity() {
        return totalEquity;
    }

    public void setTotalEquityYoy(Double totalEquityYoy) {
        this.totalEquityYoy = totalEquityYoy;
    }

    public Double getTotalEquityYoy() {
        return totalEquityYoy;
    }

    public void setTotalLiabEquity(Double totalLiabEquity) {
        this.totalLiabEquity = totalLiabEquity;
    }

    public Double getTotalLiabEquity() {
        return totalLiabEquity;
    }

    public void setTotalLiabEquityYoy(Double totalLiabEquityYoy) {
        this.totalLiabEquityYoy = totalLiabEquityYoy;
    }

    public Double getTotalLiabEquityYoy() {
        return totalLiabEquityYoy;
    }

    public void setSubbondPayable(Double subbondPayable) {
        this.subbondPayable = subbondPayable;
    }

    public Double getSubbondPayable() {
        return subbondPayable;
    }

    public void setSubbondPayableYoy(Double subbondPayableYoy) {
        this.subbondPayableYoy = subbondPayableYoy;
    }

    public Double getSubbondPayableYoy() {
        return subbondPayableYoy;
    }

    public void setNoteAccountsRece(Double noteAccountsRece) {
        this.noteAccountsRece = noteAccountsRece;
    }

    public Double getNoteAccountsRece() {
        return noteAccountsRece;
    }

    public void setNoteAccountsReceYoy(Double noteAccountsReceYoy) {
        this.noteAccountsReceYoy = noteAccountsReceYoy;
    }

    public Double getNoteAccountsReceYoy() {
        return noteAccountsReceYoy;
    }

    public void setNoteRece(Double noteRece) {
        this.noteRece = noteRece;
    }

    public Double getNoteRece() {
        return noteRece;
    }

    public void setNoteReceYoy(Double noteReceYoy) {
        this.noteReceYoy = noteReceYoy;
    }

    public Double getNoteReceYoy() {
        return noteReceYoy;
    }

    public void setAccountsRece(Double accountsRece) {
        this.accountsRece = accountsRece;
    }

    public Double getAccountsRece() {
        return accountsRece;
    }

    public void setAccountsReceYoy(Double accountsReceYoy) {
        this.accountsReceYoy = accountsReceYoy;
    }

    public Double getAccountsReceYoy() {
        return accountsReceYoy;
    }

    public void setFinanceRece(Double financeRece) {
        this.financeRece = financeRece;
    }

    public Double getFinanceRece() {
        return financeRece;
    }

    public void setFinanceReceYoy(Double financeReceYoy) {
        this.financeReceYoy = financeReceYoy;
    }

    public Double getFinanceReceYoy() {
        return financeReceYoy;
    }

    public void setPrepayment(Double prepayment) {
        this.prepayment = prepayment;
    }

    public Double getPrepayment() {
        return prepayment;
    }

    public void setPrepaymentYoy(Double prepaymentYoy) {
        this.prepaymentYoy = prepaymentYoy;
    }

    public Double getPrepaymentYoy() {
        return prepaymentYoy;
    }

    public void setTotalOtherRece(Double totalOtherRece) {
        this.totalOtherRece = totalOtherRece;
    }

    public Double getTotalOtherRece() {
        return totalOtherRece;
    }

    public void setTotalOtherReceYoy(Double totalOtherReceYoy) {
        this.totalOtherReceYoy = totalOtherReceYoy;
    }

    public Double getTotalOtherReceYoy() {
        return totalOtherReceYoy;
    }

    public void setDividendRece(Double dividendRece) {
        this.dividendRece = dividendRece;
    }

    public Double getDividendRece() {
        return dividendRece;
    }

    public void setDividendReceYoy(Double dividendReceYoy) {
        this.dividendReceYoy = dividendReceYoy;
    }

    public Double getDividendReceYoy() {
        return dividendReceYoy;
    }

    public void setInventory(Double inventory) {
        this.inventory = inventory;
    }

    public Double getInventory() {
        return inventory;
    }

    public void setInventoryYoy(Double inventoryYoy) {
        this.inventoryYoy = inventoryYoy;
    }

    public Double getInventoryYoy() {
        return inventoryYoy;
    }

    public void setContractAsset(Double contractAsset) {
        this.contractAsset = contractAsset;
    }

    public Double getContractAsset() {
        return contractAsset;
    }

    public void setContractAssetYoy(Double contractAssetYoy) {
        this.contractAssetYoy = contractAssetYoy;
    }

    public Double getContractAssetYoy() {
        return contractAssetYoy;
    }

    public void setNoncurrentAsset1year(Double noncurrentAsset1year) {
        this.noncurrentAsset1year = noncurrentAsset1year;
    }

    public Double getNoncurrentAsset1year() {
        return noncurrentAsset1year;
    }

    public void setNoncurrentAsset1yearYoy(Double noncurrentAsset1yearYoy) {
        this.noncurrentAsset1yearYoy = noncurrentAsset1yearYoy;
    }

    public Double getNoncurrentAsset1yearYoy() {
        return noncurrentAsset1yearYoy;
    }

    public void setOtherCurrentAsset(Double otherCurrentAsset) {
        this.otherCurrentAsset = otherCurrentAsset;
    }

    public Double getOtherCurrentAsset() {
        return otherCurrentAsset;
    }

    public void setOtherCurrentAssetYoy(Double otherCurrentAssetYoy) {
        this.otherCurrentAssetYoy = otherCurrentAssetYoy;
    }

    public Double getOtherCurrentAssetYoy() {
        return otherCurrentAssetYoy;
    }

    public void setTotalCurrentAssets(Double totalCurrentAssets) {
        this.totalCurrentAssets = totalCurrentAssets;
    }

    public Double getTotalCurrentAssets() {
        return totalCurrentAssets;
    }

    public void setTotalCurrentAssetsYoy(Double totalCurrentAssetsYoy) {
        this.totalCurrentAssetsYoy = totalCurrentAssetsYoy;
    }

    public Double getTotalCurrentAssetsYoy() {
        return totalCurrentAssetsYoy;
    }

    public void setLongRece(Double longRece) {
        this.longRece = longRece;
    }

    public Double getLongRece() {
        return longRece;
    }

    public void setLongReceYoy(Double longReceYoy) {
        this.longReceYoy = longReceYoy;
    }

    public Double getLongReceYoy() {
        return longReceYoy;
    }

    public void setDevelopExpense(Double developExpense) {
        this.developExpense = developExpense;
    }

    public Double getDevelopExpense() {
        return developExpense;
    }

    public void setDevelopExpenseYoy(Double developExpenseYoy) {
        this.developExpenseYoy = developExpenseYoy;
    }

    public Double getDevelopExpenseYoy() {
        return developExpenseYoy;
    }

    public void setLongPrepaidExpense(Double longPrepaidExpense) {
        this.longPrepaidExpense = longPrepaidExpense;
    }

    public Double getLongPrepaidExpense() {
        return longPrepaidExpense;
    }

    public void setLongPrepaidExpenseYoy(Double longPrepaidExpenseYoy) {
        this.longPrepaidExpenseYoy = longPrepaidExpenseYoy;
    }

    public Double getLongPrepaidExpenseYoy() {
        return longPrepaidExpenseYoy;
    }

    public void setOtherNoncurrentAsset(Double otherNoncurrentAsset) {
        this.otherNoncurrentAsset = otherNoncurrentAsset;
    }

    public Double getOtherNoncurrentAsset() {
        return otherNoncurrentAsset;
    }

    public void setOtherNoncurrentAssetYoy(Double otherNoncurrentAssetYoy) {
        this.otherNoncurrentAssetYoy = otherNoncurrentAssetYoy;
    }

    public Double getOtherNoncurrentAssetYoy() {
        return otherNoncurrentAssetYoy;
    }

    public void setTotalNoncurrentAssets(Double totalNoncurrentAssets) {
        this.totalNoncurrentAssets = totalNoncurrentAssets;
    }

    public Double getTotalNoncurrentAssets() {
        return totalNoncurrentAssets;
    }

    public void setTotalNoncurrentAssetsYoy(Double totalNoncurrentAssetsYoy) {
        this.totalNoncurrentAssetsYoy = totalNoncurrentAssetsYoy;
    }

    public Double getTotalNoncurrentAssetsYoy() {
        return totalNoncurrentAssetsYoy;
    }

    public void setNoteAccountsPayable(Double noteAccountsPayable) {
        this.noteAccountsPayable = noteAccountsPayable;
    }

    public Double getNoteAccountsPayable() {
        return noteAccountsPayable;
    }

    public void setNoteAccountsPayableYoy(Double noteAccountsPayableYoy) {
        this.noteAccountsPayableYoy = noteAccountsPayableYoy;
    }

    public Double getNoteAccountsPayableYoy() {
        return noteAccountsPayableYoy;
    }

    public void setNotePayable(Double notePayable) {
        this.notePayable = notePayable;
    }

    public Double getNotePayable() {
        return notePayable;
    }

    public void setNotePayableYoy(Double notePayableYoy) {
        this.notePayableYoy = notePayableYoy;
    }

    public Double getNotePayableYoy() {
        return notePayableYoy;
    }

    public void setContractLiab(Double contractLiab) {
        this.contractLiab = contractLiab;
    }

    public Double getContractLiab() {
        return contractLiab;
    }

    public void setContractLiabYoy(Double contractLiabYoy) {
        this.contractLiabYoy = contractLiabYoy;
    }

    public Double getContractLiabYoy() {
        return contractLiabYoy;
    }

    public void setTotalOtherPayable(Double totalOtherPayable) {
        this.totalOtherPayable = totalOtherPayable;
    }

    public Double getTotalOtherPayable() {
        return totalOtherPayable;
    }

    public void setTotalOtherPayableYoy(Double totalOtherPayableYoy) {
        this.totalOtherPayableYoy = totalOtherPayableYoy;
    }

    public Double getTotalOtherPayableYoy() {
        return totalOtherPayableYoy;
    }

    public void setDividendPayable(Double dividendPayable) {
        this.dividendPayable = dividendPayable;
    }

    public Double getDividendPayable() {
        return dividendPayable;
    }

    public void setDividendPayableYoy(Double dividendPayableYoy) {
        this.dividendPayableYoy = dividendPayableYoy;
    }

    public Double getDividendPayableYoy() {
        return dividendPayableYoy;
    }

    public void setNoncurrentLiab1year(Double noncurrentLiab1year) {
        this.noncurrentLiab1year = noncurrentLiab1year;
    }

    public Double getNoncurrentLiab1year() {
        return noncurrentLiab1year;
    }

    public void setNoncurrentLiab1yearYoy(Double noncurrentLiab1yearYoy) {
        this.noncurrentLiab1yearYoy = noncurrentLiab1yearYoy;
    }

    public Double getNoncurrentLiab1yearYoy() {
        return noncurrentLiab1yearYoy;
    }

    public void setOtherCurrentLiab(Double otherCurrentLiab) {
        this.otherCurrentLiab = otherCurrentLiab;
    }

    public Double getOtherCurrentLiab() {
        return otherCurrentLiab;
    }

    public void setOtherCurrentLiabYoy(Double otherCurrentLiabYoy) {
        this.otherCurrentLiabYoy = otherCurrentLiabYoy;
    }

    public Double getOtherCurrentLiabYoy() {
        return otherCurrentLiabYoy;
    }

    public void setTotalCurrentLiab(Double totalCurrentLiab) {
        this.totalCurrentLiab = totalCurrentLiab;
    }

    public Double getTotalCurrentLiab() {
        return totalCurrentLiab;
    }

    public void setTotalCurrentLiabYoy(Double totalCurrentLiabYoy) {
        this.totalCurrentLiabYoy = totalCurrentLiabYoy;
    }

    public Double getTotalCurrentLiabYoy() {
        return totalCurrentLiabYoy;
    }

    public void setLongPayable(Double longPayable) {
        this.longPayable = longPayable;
    }

    public Double getLongPayable() {
        return longPayable;
    }

    public void setLongPayableYoy(Double longPayableYoy) {
        this.longPayableYoy = longPayableYoy;
    }

    public Double getLongPayableYoy() {
        return longPayableYoy;
    }

    public void setLongStaffsalaryPayable(Double longStaffsalaryPayable) {
        this.longStaffsalaryPayable = longStaffsalaryPayable;
    }

    public Double getLongStaffsalaryPayable() {
        return longStaffsalaryPayable;
    }

    public void setLongStaffsalaryPayableYoy(Double longStaffsalaryPayableYoy) {
        this.longStaffsalaryPayableYoy = longStaffsalaryPayableYoy;
    }

    public Double getLongStaffsalaryPayableYoy() {
        return longStaffsalaryPayableYoy;
    }

    public void setPredictLiab(Double predictLiab) {
        this.predictLiab = predictLiab;
    }

    public Double getPredictLiab() {
        return predictLiab;
    }

    public void setPredictLiabYoy(Double predictLiabYoy) {
        this.predictLiabYoy = predictLiabYoy;
    }

    public Double getPredictLiabYoy() {
        return predictLiabYoy;
    }

    public void setDeferIncome(Double deferIncome) {
        this.deferIncome = deferIncome;
    }

    public Double getDeferIncome() {
        return deferIncome;
    }

    public void setDeferIncomeYoy(Double deferIncomeYoy) {
        this.deferIncomeYoy = deferIncomeYoy;
    }

    public Double getDeferIncomeYoy() {
        return deferIncomeYoy;
    }

    public void setTotalNoncurrentLiab(Double totalNoncurrentLiab) {
        this.totalNoncurrentLiab = totalNoncurrentLiab;
    }

    public Double getTotalNoncurrentLiab() {
        return totalNoncurrentLiab;
    }

    public void setTotalNoncurrentLiabYoy(Double totalNoncurrentLiabYoy) {
        this.totalNoncurrentLiabYoy = totalNoncurrentLiabYoy;
    }

    public Double getTotalNoncurrentLiabYoy() {
        return totalNoncurrentLiabYoy;
    }

    public void setSpecialReserve(Double specialReserve) {
        this.specialReserve = specialReserve;
    }

    public Double getSpecialReserve() {
        return specialReserve;
    }

    public void setSpecialReserveYoy(Double specialReserveYoy) {
        this.specialReserveYoy = specialReserveYoy;
    }

    public Double getSpecialReserveYoy() {
        return specialReserveYoy;
    }

    public void setCashDepositPbc(Double cashDepositPbc) {
        this.cashDepositPbc = cashDepositPbc;
    }

    public Double getCashDepositPbc() {
        return cashDepositPbc;
    }

    public void setCashDepositPbcYoy(Double cashDepositPbcYoy) {
        this.cashDepositPbcYoy = cashDepositPbcYoy;
    }

    public Double getCashDepositPbcYoy() {
        return cashDepositPbcYoy;
    }

    public void setDepositInterbank(Double depositInterbank) {
        this.depositInterbank = depositInterbank;
    }

    public Double getDepositInterbank() {
        return depositInterbank;
    }

    public void setDepositInterbankYoy(Double depositInterbankYoy) {
        this.depositInterbankYoy = depositInterbankYoy;
    }

    public Double getDepositInterbankYoy() {
        return depositInterbankYoy;
    }

    public void setPreciousMetal(Double preciousMetal) {
        this.preciousMetal = preciousMetal;
    }

    public Double getPreciousMetal() {
        return preciousMetal;
    }

    public void setPreciousMetalYoy(Double preciousMetalYoy) {
        this.preciousMetalYoy = preciousMetalYoy;
    }

    public Double getPreciousMetalYoy() {
        return preciousMetalYoy;
    }

    public void setLendFund(Double lendFund) {
        this.lendFund = lendFund;
    }

    public Double getLendFund() {
        return lendFund;
    }

    public void setLendFundYoy(Double lendFundYoy) {
        this.lendFundYoy = lendFundYoy;
    }

    public Double getLendFundYoy() {
        return lendFundYoy;
    }

    public void setLoanAdvance(Double loanAdvance) {
        this.loanAdvance = loanAdvance;
    }

    public Double getLoanAdvance() {
        return loanAdvance;
    }

    public void setLoanAdvanceYoy(Double loanAdvanceYoy) {
        this.loanAdvanceYoy = loanAdvanceYoy;
    }

    public Double getLoanAdvanceYoy() {
        return loanAdvanceYoy;
    }

    public void setAmortizeCostFinasset(Double amortizeCostFinasset) {
        this.amortizeCostFinasset = amortizeCostFinasset;
    }

    public Double getAmortizeCostFinasset() {
        return amortizeCostFinasset;
    }

    public void setAmortizeCostFinassetyoy(Double amortizeCostFinassetyoy) {
        this.amortizeCostFinassetyoy = amortizeCostFinassetyoy;
    }

    public Double getAmortizeCostFinassetyoy() {
        return amortizeCostFinassetyoy;
    }

    public void setFvtociFinasset(Double fvtociFinasset) {
        this.fvtociFinasset = fvtociFinasset;
    }

    public Double getFvtociFinasset() {
        return fvtociFinasset;
    }

    public void setFvtociFinassetYoy(Double fvtociFinassetYoy) {
        this.fvtociFinassetYoy = fvtociFinassetYoy;
    }

    public Double getFvtociFinassetYoy() {
        return fvtociFinassetYoy;
    }

    public void setAssetOther(Double assetOther) {
        this.assetOther = assetOther;
    }

    public Double getAssetOther() {
        return assetOther;
    }

    public void setAssetOtherYoy(Double assetOtherYoy) {
        this.assetOtherYoy = assetOtherYoy;
    }

    public Double getAssetOtherYoy() {
        return assetOtherYoy;
    }

    public void setLoanPbc(Double loanPbc) {
        this.loanPbc = loanPbc;
    }

    public Double getLoanPbc() {
        return loanPbc;
    }

    public void setLoanPbcYoy(Double loanPbcYoy) {
        this.loanPbcYoy = loanPbcYoy;
    }

    public Double getLoanPbcYoy() {
        return loanPbcYoy;
    }

    public void setIofiDeposit(Double iofiDeposit) {
        this.iofiDeposit = iofiDeposit;
    }

    public Double getIofiDeposit() {
        return iofiDeposit;
    }

    public void setIofiDepositYoy(Double iofiDepositYoy) {
        this.iofiDepositYoy = iofiDepositYoy;
    }

    public Double getIofiDepositYoy() {
        return iofiDepositYoy;
    }

    public void setAcceptDeposit(Double acceptDeposit) {
        this.acceptDeposit = acceptDeposit;
    }

    public Double getAcceptDeposit() {
        return acceptDeposit;
    }

    public void setAcceptDepositYoy(Double acceptDepositYoy) {
        this.acceptDepositYoy = acceptDepositYoy;
    }

    public Double getAcceptDepositYoy() {
        return acceptDepositYoy;
    }

    public void setOtherEquityOther(Double otherEquityOther) {
        this.otherEquityOther = otherEquityOther;
    }

    public Double getOtherEquityOther() {
        return otherEquityOther;
    }

    public void setOtherEquityOtherYoy(Double otherEquityOtherYoy) {
        this.otherEquityOtherYoy = otherEquityOtherYoy;
    }

    public Double getOtherEquityOtherYoy() {
        return otherEquityOtherYoy;
    }

    public void setPreferredShares(Double preferredShares) {
        this.preferredShares = preferredShares;
    }

    public Double getPreferredShares() {
        return preferredShares;
    }

    public void setPreferredSharesYoy(Double preferredSharesYoy) {
        this.preferredSharesYoy = preferredSharesYoy;
    }

    public Double getPreferredSharesYoy() {
        return preferredSharesYoy;
    }

    public void setPerpetualBond(Double perpetualBond) {
        this.perpetualBond = perpetualBond;
    }

    public Double getPerpetualBond() {
        return perpetualBond;
    }

    public void setPerpetualBondYoy(Double perpetualBondYoy) {
        this.perpetualBondYoy = perpetualBondYoy;
    }

    public Double getPerpetualBondYoy() {
        return perpetualBondYoy;
    }

    public void setPremiumRece(Double premiumRece) {
        this.premiumRece = premiumRece;
    }

    public Double getPremiumRece() {
        return premiumRece;
    }

    public void setPremiumReceYoy(Double premiumReceYoy) {
        this.premiumReceYoy = premiumReceYoy;
    }

    public Double getPremiumReceYoy() {
        return premiumReceYoy;
    }

    public void setReinsureRece(Double reinsureRece) {
        this.reinsureRece = reinsureRece;
    }

    public Double getReinsureRece() {
        return reinsureRece;
    }

    public void setReinsureReceYoy(Double reinsureReceYoy) {
        this.reinsureReceYoy = reinsureReceYoy;
    }

    public Double getReinsureReceYoy() {
        return reinsureReceYoy;
    }

    public void setRudReserveRece(Double rudReserveRece) {
        this.rudReserveRece = rudReserveRece;
    }

    public Double getRudReserveRece() {
        return rudReserveRece;
    }

    public void setRudReserveReceYoy(Double rudReserveReceYoy) {
        this.rudReserveReceYoy = rudReserveReceYoy;
    }

    public Double getRudReserveReceYoy() {
        return rudReserveReceYoy;
    }

    public void setRucReserveRece(Double rucReserveRece) {
        this.rucReserveRece = rucReserveRece;
    }

    public Double getRucReserveRece() {
        return rucReserveRece;
    }

    public void setRucReserveReceYoy(Double rucReserveReceYoy) {
        this.rucReserveReceYoy = rucReserveReceYoy;
    }

    public Double getRucReserveReceYoy() {
        return rucReserveReceYoy;
    }

    public void setOtherRece(Double otherRece) {
        this.otherRece = otherRece;
    }

    public Double getOtherRece() {
        return otherRece;
    }

    public void setOtherReceYoy(Double otherReceYoy) {
        this.otherReceYoy = otherReceYoy;
    }

    public Double getOtherReceYoy() {
        return otherReceYoy;
    }

    public void setTimeDeposit(Double timeDeposit) {
        this.timeDeposit = timeDeposit;
    }

    public Double getTimeDeposit() {
        return timeDeposit;
    }

    public void setTimeDepositYoy(Double timeDepositYoy) {
        this.timeDepositYoy = timeDepositYoy;
    }

    public Double getTimeDepositYoy() {
        return timeDepositYoy;
    }

    public void setHoldMaturityInvest(Double holdMaturityInvest) {
        this.holdMaturityInvest = holdMaturityInvest;
    }

    public Double getHoldMaturityInvest() {
        return holdMaturityInvest;
    }

    public void setHoldMaturityInvestYoy(Double holdMaturityInvestYoy) {
        this.holdMaturityInvestYoy = holdMaturityInvestYoy;
    }

    public Double getHoldMaturityInvestYoy() {
        return holdMaturityInvestYoy;
    }

    public void setRefundCapitalDeposit(Double refundCapitalDeposit) {
        this.refundCapitalDeposit = refundCapitalDeposit;
    }

    public Double getRefundCapitalDeposit() {
        return refundCapitalDeposit;
    }

    public void setRefundCapitalDepositYoy(Double refundCapitalDepositYoy) {
        this.refundCapitalDepositYoy = refundCapitalDepositYoy;
    }

    public Double getRefundCapitalDepositYoy() {
        return refundCapitalDepositYoy;
    }

    public void setAdvanceRece(Double advanceRece) {
        this.advanceRece = advanceRece;
    }

    public Double getAdvanceRece() {
        return advanceRece;
    }

    public void setAdvanceReceYoy(Double advanceReceYoy) {
        this.advanceReceYoy = advanceReceYoy;
    }

    public Double getAdvanceReceYoy() {
        return advanceReceYoy;
    }

    public void setAdvancePremium(Double advancePremium) {
        this.advancePremium = advancePremium;
    }

    public Double getAdvancePremium() {
        return advancePremium;
    }

    public void setAdvancePremiumYoy(Double advancePremiumYoy) {
        this.advancePremiumYoy = advancePremiumYoy;
    }

    public Double getAdvancePremiumYoy() {
        return advancePremiumYoy;
    }

    public void setFeeCommissionPayable(Double feeCommissionPayable) {
        this.feeCommissionPayable = feeCommissionPayable;
    }

    public Double getFeeCommissionPayable() {
        return feeCommissionPayable;
    }

    public void setFeeCommissionPayableYoy(Double feeCommissionPayableYoy) {
        this.feeCommissionPayableYoy = feeCommissionPayableYoy;
    }

    public Double getFeeCommissionPayableYoy() {
        return feeCommissionPayableYoy;
    }

    public void setReinsurePayable(Double reinsurePayable) {
        this.reinsurePayable = reinsurePayable;
    }

    public Double getReinsurePayable() {
        return reinsurePayable;
    }

    public void setReinsurePayableYoy(Double reinsurePayableYoy) {
        this.reinsurePayableYoy = reinsurePayableYoy;
    }

    public Double getReinsurePayableYoy() {
        return reinsurePayableYoy;
    }

    public void setCompensatePayable(Double compensatePayable) {
        this.compensatePayable = compensatePayable;
    }

    public Double getCompensatePayable() {
        return compensatePayable;
    }

    public void setCompensatePayableYoy(Double compensatePayableYoy) {
        this.compensatePayableYoy = compensatePayableYoy;
    }

    public Double getCompensatePayableYoy() {
        return compensatePayableYoy;
    }

    public void setNetPendmortgageAsset(Double netPendmortgageAsset) {
        this.netPendmortgageAsset = netPendmortgageAsset;
    }

    public Double getNetPendmortgageAsset() {
        return netPendmortgageAsset;
    }

    public void setNetPendmortgageAssetYoy(Double netPendmortgageAssetYoy) {
        this.netPendmortgageAssetYoy = netPendmortgageAssetYoy;
    }

    public Double getNetPendmortgageAssetYoy() {
        return netPendmortgageAssetYoy;
    }

    public void setHedgeReserve(Double hedgeReserve) {
        this.hedgeReserve = hedgeReserve;
    }

    public Double getHedgeReserve() {
        return hedgeReserve;
    }

    public void setHedgeReserveYoy(Double hedgeReserveYoy) {
        this.hedgeReserveYoy = hedgeReserveYoy;
    }

    public Double getHedgeReserveYoy() {
        return hedgeReserveYoy;
    }

    public void setPreferredSharesPaybale(Double preferredSharesPaybale) {
        this.preferredSharesPaybale = preferredSharesPaybale;
    }

    public Double getPreferredSharesPaybale() {
        return preferredSharesPaybale;
    }

    public void setPreferredSharesPaybaleYoy(Double preferredSharesPaybaleYoy) {
        this.preferredSharesPaybaleYoy = preferredSharesPaybaleYoy;
    }

    public Double getPreferredSharesPaybaleYoy() {
        return preferredSharesPaybaleYoy;
    }

    public void setTradeFinasset(Double tradeFinasset) {
        this.tradeFinasset = tradeFinasset;
    }

    public Double getTradeFinasset() {
        return tradeFinasset;
    }

    public void setTradeFinassetYoy(Double tradeFinassetYoy) {
        this.tradeFinassetYoy = tradeFinassetYoy;
    }

    public Double getTradeFinassetYoy() {
        return tradeFinassetYoy;
    }

    public void setHoldsaleAsset(Double holdsaleAsset) {
        this.holdsaleAsset = holdsaleAsset;
    }

    public Double getHoldsaleAsset() {
        return holdsaleAsset;
    }

    public void setHoldsaleAssetYoy(Double holdsaleAssetYoy) {
        this.holdsaleAssetYoy = holdsaleAssetYoy;
    }

    public Double getHoldsaleAssetYoy() {
        return holdsaleAssetYoy;
    }

    public void setAppointFvtplFinliab(Double appointFvtplFinliab) {
        this.appointFvtplFinliab = appointFvtplFinliab;
    }

    public Double getAppointFvtplFinliab() {
        return appointFvtplFinliab;
    }

    public void setAppointFvtplFinliabYoy(Double appointFvtplFinliabYoy) {
        this.appointFvtplFinliabYoy = appointFvtplFinliabYoy;
    }

    public Double getAppointFvtplFinliabYoy() {
        return appointFvtplFinliabYoy;
    }

    public void setLiabBalance(Double liabBalance) {
        this.liabBalance = liabBalance;
    }

    public Double getLiabBalance() {
        return liabBalance;
    }

    public void setLiabBalanceYoy(Double liabBalanceYoy) {
        this.liabBalanceYoy = liabBalanceYoy;
    }

    public Double getLiabBalanceYoy() {
        return liabBalanceYoy;
    }

    public void setCdNotePayable(Double cdNotePayable) {
        this.cdNotePayable = cdNotePayable;
    }

    public Double getCdNotePayable() {
        return cdNotePayable;
    }

    public void setCdNotePayableYoy(Double cdNotePayableYoy) {
        this.cdNotePayableYoy = cdNotePayableYoy;
    }

    public Double getCdNotePayableYoy() {
        return cdNotePayableYoy;
    }

    public void setAssetBalance(Double assetBalance) {
        this.assetBalance = assetBalance;
    }

    public Double getAssetBalance() {
        return assetBalance;
    }

    public void setAssetBalanceYoy(Double assetBalanceYoy) {
        this.assetBalanceYoy = assetBalanceYoy;
    }

    public Double getAssetBalanceYoy() {
        return assetBalanceYoy;
    }

    public void setPendMortgageAsset(Double pendMortgageAsset) {
        this.pendMortgageAsset = pendMortgageAsset;
    }

    public Double getPendMortgageAsset() {
        return pendMortgageAsset;
    }

    public void setPendMortgageAssetYoy(Double pendMortgageAssetYoy) {
        this.pendMortgageAssetYoy = pendMortgageAssetYoy;
    }

    public Double getPendMortgageAssetYoy() {
        return pendMortgageAssetYoy;
    }

    public void setHoldsaleLiab(Double holdsaleLiab) {
        this.holdsaleLiab = holdsaleLiab;
    }

    public Double getHoldsaleLiab() {
        return holdsaleLiab;
    }

    public void setHoldsaleLiabYoy(Double holdsaleLiabYoy) {
        this.holdsaleLiabYoy = holdsaleLiabYoy;
    }

    public Double getHoldsaleLiabYoy() {
        return holdsaleLiabYoy;
    }

    public void setLiabEquityBalance(Double liabEquityBalance) {
        this.liabEquityBalance = liabEquityBalance;
    }

    public Double getLiabEquityBalance() {
        return liabEquityBalance;
    }

    public void setLiabEquityBalanceYoy(Double liabEquityBalanceYoy) {
        this.liabEquityBalanceYoy = liabEquityBalanceYoy;
    }

    public Double getLiabEquityBalanceYoy() {
        return liabEquityBalanceYoy;
    }

    public void setEquityBalance(Double equityBalance) {
        this.equityBalance = equityBalance;
    }

    public Double getEquityBalance() {
        return equityBalance;
    }

    public void setEquityBalanceYoy(Double equityBalanceYoy) {
        this.equityBalanceYoy = equityBalanceYoy;
    }

    public Double getEquityBalanceYoy() {
        return equityBalanceYoy;
    }

    public void setParentEquityBalance(Double parentEquityBalance) {
        this.parentEquityBalance = parentEquityBalance;
    }

    public Double getParentEquityBalance() {
        return parentEquityBalance;
    }

    public void setParentEquityBalanceYoy(Double parentEquityBalanceYoy) {
        this.parentEquityBalanceYoy = parentEquityBalanceYoy;
    }

    public Double getParentEquityBalanceYoy() {
        return parentEquityBalanceYoy;
    }

    public void setOtherEquityTool(Double otherEquityTool) {
        this.otherEquityTool = otherEquityTool;
    }

    public Double getOtherEquityTool() {
        return otherEquityTool;
    }

    public void setOtherEquityToolYoy(Double otherEquityToolYoy) {
        this.otherEquityToolYoy = otherEquityToolYoy;
    }

    public Double getOtherEquityToolYoy() {
        return otherEquityToolYoy;
    }

    public void setEquityOther(Double equityOther) {
        this.equityOther = equityOther;
    }

    public Double getEquityOther() {
        return equityOther;
    }

    public void setEquityOtherYoy(Double equityOtherYoy) {
        this.equityOtherYoy = equityOtherYoy;
    }

    public Double getEquityOtherYoy() {
        return equityOtherYoy;
    }

    public void setLiabEquityOther(Double liabEquityOther) {
        this.liabEquityOther = liabEquityOther;
    }

    public Double getLiabEquityOther() {
        return liabEquityOther;
    }

    public void setLiabEquityOtherYoy(Double liabEquityOtherYoy) {
        this.liabEquityOtherYoy = liabEquityOtherYoy;
    }

    public Double getLiabEquityOtherYoy() {
        return liabEquityOtherYoy;
    }

    public void setInvestRece(Double investRece) {
        this.investRece = investRece;
    }

    public Double getInvestRece() {
        return investRece;
    }

    public void setInvestReceYoy(Double investReceYoy) {
        this.investReceYoy = investReceYoy;
    }

    public Double getInvestReceYoy() {
        return investReceYoy;
    }

    public void setTreasuryShares(Double treasuryShares) {
        this.treasuryShares = treasuryShares;
    }

    public Double getTreasuryShares() {
        return treasuryShares;
    }

    public void setTreasurySharesYoy(Double treasurySharesYoy) {
        this.treasurySharesYoy = treasurySharesYoy;
    }

    public Double getTreasurySharesYoy() {
        return treasurySharesYoy;
    }

    public void setOutwardRemit(Double outwardRemit) {
        this.outwardRemit = outwardRemit;
    }

    public Double getOutwardRemit() {
        return outwardRemit;
    }

    public void setOutwardRemitYoy(Double outwardRemitYoy) {
        this.outwardRemitYoy = outwardRemitYoy;
    }

    public Double getOutwardRemitYoy() {
        return outwardRemitYoy;
    }

    public void setAmortizeCostFinliab(Double amortizeCostFinliab) {
        this.amortizeCostFinliab = amortizeCostFinliab;
    }

    public Double getAmortizeCostFinliab() {
        return amortizeCostFinliab;
    }

    public void setAmortizeCostFinliabYoy(Double amortizeCostFinliabYoy) {
        this.amortizeCostFinliabYoy = amortizeCostFinliabYoy;
    }

    public Double getAmortizeCostFinliabYoy() {
        return amortizeCostFinliabYoy;
    }

    public void setInvestJoint(Double investJoint) {
        this.investJoint = investJoint;
    }

    public Double getInvestJoint() {
        return investJoint;
    }

    public void setInvestJointYoy(Double investJointYoy) {
        this.investJointYoy = investJointYoy;
    }

    public Double getInvestJointYoy() {
        return investJointYoy;
    }

    public void setInvestRevalueReserve(Double investRevalueReserve) {
        this.investRevalueReserve = investRevalueReserve;
    }

    public Double getInvestRevalueReserve() {
        return investRevalueReserve;
    }

    public void setInvestRevalueReserveYoy(Double investRevalueReserveYoy) {
        this.investRevalueReserveYoy = investRevalueReserveYoy;
    }

    public Double getInvestRevalueReserveYoy() {
        return investRevalueReserveYoy;
    }

    public void setConvertDiff(Double convertDiff) {
        this.convertDiff = convertDiff;
    }

    public Double getConvertDiff() {
        return convertDiff;
    }

    public void setConvertDiffYoy(Double convertDiffYoy) {
        this.convertDiffYoy = convertDiffYoy;
    }

    public Double getConvertDiffYoy() {
        return convertDiffYoy;
    }

    public void setTradeFinliab(Double tradeFinliab) {
        this.tradeFinliab = tradeFinliab;
    }

    public Double getTradeFinliab() {
        return tradeFinliab;
    }

    public void setTradeFinliabYoy(Double tradeFinliabYoy) {
        this.tradeFinliabYoy = tradeFinliabYoy;
    }

    public Double getTradeFinliabYoy() {
        return tradeFinliabYoy;
    }

    public void setAdviceAssignDividend(Double adviceAssignDividend) {
        this.adviceAssignDividend = adviceAssignDividend;
    }

    public Double getAdviceAssignDividend() {
        return adviceAssignDividend;
    }

    public void setAdviceAssignDividendYoy(Double adviceAssignDividendYoy) {
        this.adviceAssignDividendYoy = adviceAssignDividendYoy;
    }

    public Double getAdviceAssignDividendYoy() {
        return adviceAssignDividendYoy;
    }

    public void setAppointFvtplFinasset(Double appointFvtplFinasset) {
        this.appointFvtplFinasset = appointFvtplFinasset;
    }

    public Double getAppointFvtplFinasset() {
        return appointFvtplFinasset;
    }

    public void setAppointFvtplFinassetYoy(Double appointFvtplFinassetYoy) {
        this.appointFvtplFinassetYoy = appointFvtplFinassetYoy;
    }

    public Double getAppointFvtplFinassetYoy() {
        return appointFvtplFinassetYoy;
    }

    public void setMortgageAssetImpairment(Double mortgageAssetImpairment) {
        this.mortgageAssetImpairment = mortgageAssetImpairment;
    }

    public Double getMortgageAssetImpairment() {
        return mortgageAssetImpairment;
    }

    public void setMortgageAssetImpairmentYoy(Double mortgageAssetImpairmentYoy) {
        this.mortgageAssetImpairmentYoy = mortgageAssetImpairmentYoy;
    }

    public Double getMortgageAssetImpairmentYoy() {
        return mortgageAssetImpairmentYoy;
    }

    public void setPerpetualBondPaybale(Double perpetualBondPaybale) {
        this.perpetualBondPaybale = perpetualBondPaybale;
    }

    public Double getPerpetualBondPaybale() {
        return perpetualBondPaybale;
    }

    public void setPerpetualBondPaybaleYoy(Double perpetualBondPaybaleYoy) {
        this.perpetualBondPaybaleYoy = perpetualBondPaybaleYoy;
    }

    public Double getPerpetualBondPaybaleYoy() {
        return perpetualBondPaybaleYoy;
    }

    public void setDepositCertificate(Double depositCertificate) {
        this.depositCertificate = depositCertificate;
    }

    public Double getDepositCertificate() {
        return depositCertificate;
    }

    public void setDepositCertificateYoy(Double depositCertificateYoy) {
        this.depositCertificateYoy = depositCertificateYoy;
    }

    public Double getDepositCertificateYoy() {
        return depositCertificateYoy;
    }

    public void setInvestSubsidiary(Double investSubsidiary) {
        this.investSubsidiary = investSubsidiary;
    }

    public Double getInvestSubsidiary() {
        return investSubsidiary;
    }

    public void setInvestSubsidiaryYoy(Double investSubsidiaryYoy) {
        this.investSubsidiaryYoy = investSubsidiaryYoy;
    }

    public Double getInvestSubsidiaryYoy() {
        return investSubsidiaryYoy;
    }

    public void setParentEquityOther(Double parentEquityOther) {
        this.parentEquityOther = parentEquityOther;
    }

    public Double getParentEquityOther() {
        return parentEquityOther;
    }

    public void setParentEquityOtherYoy(Double parentEquityOtherYoy) {
        this.parentEquityOtherYoy = parentEquityOtherYoy;
    }

    public Double getParentEquityOtherYoy() {
        return parentEquityOtherYoy;
    }

    public void setInsuredDepositInvest(Double insuredDepositInvest) {
        this.insuredDepositInvest = insuredDepositInvest;
    }

    public Double getInsuredDepositInvest() {
        return insuredDepositInvest;
    }

    public void setInsuredDepositInvestYoy(Double insuredDepositInvestYoy) {
        this.insuredDepositInvestYoy = insuredDepositInvestYoy;
    }

    public Double getInsuredDepositInvestYoy() {
        return insuredDepositInvestYoy;
    }

    public void setIndAccLiab(Double indAccLiab) {
        this.indAccLiab = indAccLiab;
    }

    public Double getIndAccLiab() {
        return indAccLiab;
    }

    public void setIndAccLiabYoy(Double indAccLiabYoy) {
        this.indAccLiabYoy = indAccLiabYoy;
    }

    public Double getIndAccLiabYoy() {
        return indAccLiabYoy;
    }

    public void setCreditorPlanInvest(Double creditorPlanInvest) {
        this.creditorPlanInvest = creditorPlanInvest;
    }

    public Double getCreditorPlanInvest() {
        return creditorPlanInvest;
    }

    public void setCreditorPlanInvestYoy(Double creditorPlanInvestYoy) {
        this.creditorPlanInvestYoy = creditorPlanInvestYoy;
    }

    public Double getCreditorPlanInvestYoy() {
        return creditorPlanInvestYoy;
    }

    public void setRcReserveRece(Double rcReserveRece) {
        this.rcReserveRece = rcReserveRece;
    }

    public Double getRcReserveRece() {
        return rcReserveRece;
    }

    public void setRcReserveReceYoy(Double rcReserveReceYoy) {
        this.rcReserveReceYoy = rcReserveReceYoy;
    }

    public Double getRcReserveReceYoy() {
        return rcReserveReceYoy;
    }

    public void setNoncurrentLiabOther(Double noncurrentLiabOther) {
        this.noncurrentLiabOther = noncurrentLiabOther;
    }

    public Double getNoncurrentLiabOther() {
        return noncurrentLiabOther;
    }

    public void setNoncurrentLiabOtherYoy(Double noncurrentLiabOtherYoy) {
        this.noncurrentLiabOtherYoy = noncurrentLiabOtherYoy;
    }

    public Double getNoncurrentLiabOtherYoy() {
        return noncurrentLiabOtherYoy;
    }

    public void setIndAccAsset(Double indAccAsset) {
        this.indAccAsset = indAccAsset;
    }

    public Double getIndAccAsset() {
        return indAccAsset;
    }

    public void setIndAccAssetYoy(Double indAccAssetYoy) {
        this.indAccAssetYoy = indAccAssetYoy;
    }

    public Double getIndAccAssetYoy() {
        return indAccAssetYoy;
    }

    public void setSubsidyRece(Double subsidyRece) {
        this.subsidyRece = subsidyRece;
    }

    public Double getSubsidyRece() {
        return subsidyRece;
    }

    public void setSubsidyReceYoy(Double subsidyReceYoy) {
        this.subsidyReceYoy = subsidyReceYoy;
    }

    public Double getSubsidyReceYoy() {
        return subsidyReceYoy;
    }

    public void setFvtociNcfinasset(Double fvtociNcfinasset) {
        this.fvtociNcfinasset = fvtociNcfinasset;
    }

    public Double getFvtociNcfinasset() {
        return fvtociNcfinasset;
    }

    public void setFvtociNcfinassetYoy(Double fvtociNcfinassetYoy) {
        this.fvtociNcfinassetYoy = fvtociNcfinassetYoy;
    }

    public Double getFvtociNcfinassetYoy() {
        return fvtociNcfinassetYoy;
    }

    public void setOtherPayable(Double otherPayable) {
        this.otherPayable = otherPayable;
    }

    public Double getOtherPayable() {
        return otherPayable;
    }

    public void setOtherPayableYoy(Double otherPayableYoy) {
        this.otherPayableYoy = otherPayableYoy;
    }

    public Double getOtherPayableYoy() {
        return otherPayableYoy;
    }

    public void setLdReserve(Double ldReserve) {
        this.ldReserve = ldReserve;
    }

    public Double getLdReserve() {
        return ldReserve;
    }

    public void setLdReserveYoy(Double ldReserveYoy) {
        this.ldReserveYoy = ldReserveYoy;
    }

    public Double getLdReserveYoy() {
        return ldReserveYoy;
    }

    public void setCurrentLiabOther(Double currentLiabOther) {
        this.currentLiabOther = currentLiabOther;
    }

    public Double getCurrentLiabOther() {
        return currentLiabOther;
    }

    public void setCurrentLiabOtherYoy(Double currentLiabOtherYoy) {
        this.currentLiabOtherYoy = currentLiabOtherYoy;
    }

    public Double getCurrentLiabOtherYoy() {
        return currentLiabOtherYoy;
    }

    public void setProjectMaterial(Double projectMaterial) {
        this.projectMaterial = projectMaterial;
    }

    public Double getProjectMaterial() {
        return projectMaterial;
    }

    public void setProjectMaterialYoy(Double projectMaterialYoy) {
        this.projectMaterialYoy = projectMaterialYoy;
    }

    public Double getProjectMaterialYoy() {
        return projectMaterialYoy;
    }

    public void setFixedAssetDisposal(Double fixedAssetDisposal) {
        this.fixedAssetDisposal = fixedAssetDisposal;
    }

    public Double getFixedAssetDisposal() {
        return fixedAssetDisposal;
    }

    public void setFixedAssetDisposalYoy(Double fixedAssetDisposalYoy) {
        this.fixedAssetDisposalYoy = fixedAssetDisposalYoy;
    }

    public Double getFixedAssetDisposalYoy() {
        return fixedAssetDisposalYoy;
    }

    public void setOtherNoncurrentLiab(Double otherNoncurrentLiab) {
        this.otherNoncurrentLiab = otherNoncurrentLiab;
    }

    public Double getOtherNoncurrentLiab() {
        return otherNoncurrentLiab;
    }

    public void setOtherNoncurrentLiabYoy(Double otherNoncurrentLiabYoy) {
        this.otherNoncurrentLiabYoy = otherNoncurrentLiabYoy;
    }

    public Double getOtherNoncurrentLiabYoy() {
        return otherNoncurrentLiabYoy;
    }

    public void setOilGasAsset(Double oilGasAsset) {
        this.oilGasAsset = oilGasAsset;
    }

    public Double getOilGasAsset() {
        return oilGasAsset;
    }

    public void setOilGasAssetYoy(Double oilGasAssetYoy) {
        this.oilGasAssetYoy = oilGasAssetYoy;
    }

    public Double getOilGasAssetYoy() {
        return oilGasAssetYoy;
    }

    public void setNoncurrentLiabBalance(Double noncurrentLiabBalance) {
        this.noncurrentLiabBalance = noncurrentLiabBalance;
    }

    public Double getNoncurrentLiabBalance() {
        return noncurrentLiabBalance;
    }

    public void setNoncurrentLiabBalanceYoy(Double noncurrentLiabBalanceYoy) {
        this.noncurrentLiabBalanceYoy = noncurrentLiabBalanceYoy;
    }

    public Double getNoncurrentLiabBalanceYoy() {
        return noncurrentLiabBalanceYoy;
    }

    public void setNoncurrentAssetBalance(Double noncurrentAssetBalance) {
        this.noncurrentAssetBalance = noncurrentAssetBalance;
    }

    public Double getNoncurrentAssetBalance() {
        return noncurrentAssetBalance;
    }

    public void setNoncurrentAssetBalanceYoy(Double noncurrentAssetBalanceYoy) {
        this.noncurrentAssetBalanceYoy = noncurrentAssetBalanceYoy;
    }

    public Double getNoncurrentAssetBalanceYoy() {
        return noncurrentAssetBalanceYoy;
    }

    public void setCurrentLiabBalance(Double currentLiabBalance) {
        this.currentLiabBalance = currentLiabBalance;
    }

    public Double getCurrentLiabBalance() {
        return currentLiabBalance;
    }

    public void setCurrentLiabBalanceYoy(Double currentLiabBalanceYoy) {
        this.currentLiabBalanceYoy = currentLiabBalanceYoy;
    }

    public Double getCurrentLiabBalanceYoy() {
        return currentLiabBalanceYoy;
    }

    public void setPolicyBonusPayable(Double policyBonusPayable) {
        this.policyBonusPayable = policyBonusPayable;
    }

    public Double getPolicyBonusPayable() {
        return policyBonusPayable;
    }

    public void setPolicyBonusPayableYoy(Double policyBonusPayableYoy) {
        this.policyBonusPayableYoy = policyBonusPayableYoy;
    }

    public Double getPolicyBonusPayableYoy() {
        return policyBonusPayableYoy;
    }

    public void setInternalPayable(Double internalPayable) {
        this.internalPayable = internalPayable;
    }

    public Double getInternalPayable() {
        return internalPayable;
    }

    public void setInternalPayableYoy(Double internalPayableYoy) {
        this.internalPayableYoy = internalPayableYoy;
    }

    public Double getInternalPayableYoy() {
        return internalPayableYoy;
    }

    public void setSpecialPayable(Double specialPayable) {
        this.specialPayable = specialPayable;
    }

    public Double getSpecialPayable() {
        return specialPayable;
    }

    public void setSpecialPayableYoy(Double specialPayableYoy) {
        this.specialPayableYoy = specialPayableYoy;
    }

    public Double getSpecialPayableYoy() {
        return specialPayableYoy;
    }

    public void setRldReserveRece(Double rldReserveRece) {
        this.rldReserveRece = rldReserveRece;
    }

    public Double getRldReserveRece() {
        return rldReserveRece;
    }

    public void setRldReserveReceYoy(Double rldReserveReceYoy) {
        this.rldReserveReceYoy = rldReserveReceYoy;
    }

    public Double getRldReserveReceYoy() {
        return rldReserveReceYoy;
    }

    public void setRhdReserveRece(Double rhdReserveRece) {
        this.rhdReserveRece = rhdReserveRece;
    }

    public Double getRhdReserveRece() {
        return rhdReserveRece;
    }

    public void setRhdReserveReceYoy(Double rhdReserveReceYoy) {
        this.rhdReserveReceYoy = rhdReserveReceYoy;
    }

    public Double getRhdReserveReceYoy() {
        return rhdReserveReceYoy;
    }

    public void setPredictCurrentLiab(Double predictCurrentLiab) {
        this.predictCurrentLiab = predictCurrentLiab;
    }

    public Double getPredictCurrentLiab() {
        return predictCurrentLiab;
    }

    public void setPredictCurrentLiabYoy(Double predictCurrentLiabYoy) {
        this.predictCurrentLiabYoy = predictCurrentLiabYoy;
    }

    public Double getPredictCurrentLiabYoy() {
        return predictCurrentLiabYoy;
    }

    public void setRefundDepositRece(Double refundDepositRece) {
        this.refundDepositRece = refundDepositRece;
    }

    public Double getRefundDepositRece() {
        return refundDepositRece;
    }

    public void setRefundDepositReceYoy(Double refundDepositReceYoy) {
        this.refundDepositReceYoy = refundDepositReceYoy;
    }

    public Double getRefundDepositReceYoy() {
        return refundDepositReceYoy;
    }

    public void setHdReserve(Double hdReserve) {
        this.hdReserve = hdReserve;
    }

    public Double getHdReserve() {
        return hdReserve;
    }

    public void setHdReserveYoy(Double hdReserveYoy) {
        this.hdReserveYoy = hdReserveYoy;
    }

    public Double getHdReserveYoy() {
        return hdReserveYoy;
    }

    public void setInsuredPledgeLoan(Double insuredPledgeLoan) {
        this.insuredPledgeLoan = insuredPledgeLoan;
    }

    public Double getInsuredPledgeLoan() {
        return insuredPledgeLoan;
    }

    public void setInsuredPledgeLoanYoy(Double insuredPledgeLoanYoy) {
        this.insuredPledgeLoanYoy = insuredPledgeLoanYoy;
    }

    public Double getInsuredPledgeLoanYoy() {
        return insuredPledgeLoanYoy;
    }

    public void setOtherNoncurrentFinasset(Double otherNoncurrentFinasset) {
        this.otherNoncurrentFinasset = otherNoncurrentFinasset;
    }

    public Double getOtherNoncurrentFinasset() {
        return otherNoncurrentFinasset;
    }

    public void setOtherNoncurrentFinassetYoy(Double otherNoncurrentFinassetYoy) {
        this.otherNoncurrentFinassetYoy = otherNoncurrentFinassetYoy;
    }

    public Double getOtherNoncurrentFinassetYoy() {
        return otherNoncurrentFinassetYoy;
    }

    public void setAssignCashDividend(Double assignCashDividend) {
        this.assignCashDividend = assignCashDividend;
    }

    public Double getAssignCashDividend() {
        return assignCashDividend;
    }

    public void setAssignCashDividendYoy(Double assignCashDividendYoy) {
        this.assignCashDividendYoy = assignCashDividendYoy;
    }

    public Double getAssignCashDividendYoy() {
        return assignCashDividendYoy;
    }

    public void setAdvanceReceivables(Double advanceReceivables) {
        this.advanceReceivables = advanceReceivables;
    }

    public Double getAdvanceReceivables() {
        return advanceReceivables;
    }

    public void setAdvanceReceivablesYoy(Double advanceReceivablesYoy) {
        this.advanceReceivablesYoy = advanceReceivablesYoy;
    }

    public Double getAdvanceReceivablesYoy() {
        return advanceReceivablesYoy;
    }

    public void setShortBondPayable(Double shortBondPayable) {
        this.shortBondPayable = shortBondPayable;
    }

    public Double getShortBondPayable() {
        return shortBondPayable;
    }

    public void setShortBondPayableYoy(Double shortBondPayableYoy) {
        this.shortBondPayableYoy = shortBondPayableYoy;
    }

    public Double getShortBondPayableYoy() {
        return shortBondPayableYoy;
    }

    public void setCurrentAssetBalance(Double currentAssetBalance) {
        this.currentAssetBalance = currentAssetBalance;
    }

    public Double getCurrentAssetBalance() {
        return currentAssetBalance;
    }

    public void setCurrentAssetBalanceYoy(Double currentAssetBalanceYoy) {
        this.currentAssetBalanceYoy = currentAssetBalanceYoy;
    }

    public Double getCurrentAssetBalanceYoy() {
        return currentAssetBalanceYoy;
    }

    public void setAmortizeCostNcfinliab(Double amortizeCostNcfinliab) {
        this.amortizeCostNcfinliab = amortizeCostNcfinliab;
    }

    public Double getAmortizeCostNcfinliab() {
        return amortizeCostNcfinliab;
    }

    public void setAmortizeCostNcfinliabYoy(Double amortizeCostNcfinliabYoy) {
        this.amortizeCostNcfinliabYoy = amortizeCostNcfinliabYoy;
    }

    public Double getAmortizeCostNcfinliabYoy() {
        return amortizeCostNcfinliabYoy;
    }

    public void setAmortizeCostNcfinasset(Double amortizeCostNcfinasset) {
        this.amortizeCostNcfinasset = amortizeCostNcfinasset;
    }

    public Double getAmortizeCostNcfinasset() {
        return amortizeCostNcfinasset;
    }

    public void setAmortizeCostNcfinassetYoy(Double amortizeCostNcfinassetYoy) {
        this.amortizeCostNcfinassetYoy = amortizeCostNcfinassetYoy;
    }

    public Double getAmortizeCostNcfinassetYoy() {
        return amortizeCostNcfinassetYoy;
    }

    public void setInsuranceContractReserve(Double insuranceContractReserve) {
        this.insuranceContractReserve = insuranceContractReserve;
    }

    public Double getInsuranceContractReserve() {
        return insuranceContractReserve;
    }

    public void setInsuranceContractReserveYoy(Double insuranceContractReserveYoy) {
        this.insuranceContractReserveYoy = insuranceContractReserveYoy;
    }

    public Double getInsuranceContractReserveYoy() {
        return insuranceContractReserveYoy;
    }

    public void setCustomerCreditDeposit(Double customerCreditDeposit) {
        this.customerCreditDeposit = customerCreditDeposit;
    }

    public Double getCustomerCreditDeposit() {
        return customerCreditDeposit;
    }

    public void setCustomerCreditDepositYoy(Double customerCreditDepositYoy) {
        this.customerCreditDepositYoy = customerCreditDepositYoy;
    }

    public Double getCustomerCreditDepositYoy() {
        return customerCreditDepositYoy;
    }

    public void setUcReserve(Double ucReserve) {
        this.ucReserve = ucReserve;
    }

    public Double getUcReserve() {
        return ucReserve;
    }

    public void setUcReserveYoy(Double ucReserveYoy) {
        this.ucReserveYoy = ucReserveYoy;
    }

    public Double getUcReserveYoy() {
        return ucReserveYoy;
    }

    public void setCreditExcessReserve(Double creditExcessReserve) {
        this.creditExcessReserve = creditExcessReserve;
    }

    public Double getCreditExcessReserve() {
        return creditExcessReserve;
    }

    public void setCreditExcessReserveYoy(Double creditExcessReserveYoy) {
        this.creditExcessReserveYoy = creditExcessReserveYoy;
    }

    public Double getCreditExcessReserveYoy() {
        return creditExcessReserveYoy;
    }

    public void setTradeSeatFee(Double tradeSeatFee) {
        this.tradeSeatFee = tradeSeatFee;
    }

    public Double getTradeSeatFee() {
        return tradeSeatFee;
    }

    public void setTradeSeatFeeYoy(Double tradeSeatFeeYoy) {
        this.tradeSeatFeeYoy = tradeSeatFeeYoy;
    }

    public Double getTradeSeatFeeYoy() {
        return tradeSeatFeeYoy;
    }

    public void setTradeRiskReserve(Double tradeRiskReserve) {
        this.tradeRiskReserve = tradeRiskReserve;
    }

    public Double getTradeRiskReserve() {
        return tradeRiskReserve;
    }

    public void setTradeRiskReserveYoy(Double tradeRiskReserveYoy) {
        this.tradeRiskReserveYoy = tradeRiskReserveYoy;
    }

    public Double getTradeRiskReserveYoy() {
        return tradeRiskReserveYoy;
    }

    public void setCreditAgentSecurity(Double creditAgentSecurity) {
        this.creditAgentSecurity = creditAgentSecurity;
    }

    public Double getCreditAgentSecurity() {
        return creditAgentSecurity;
    }

    public void setCreditAgentSecurityYoy(Double creditAgentSecurityYoy) {
        this.creditAgentSecurityYoy = creditAgentSecurityYoy;
    }

    public Double getCreditAgentSecurityYoy() {
        return creditAgentSecurityYoy;
    }

    public void setFinSecurity(Double finSecurity) {
        this.finSecurity = finSecurity;
    }

    public Double getFinSecurity() {
        return finSecurity;
    }

    public void setFinSecurityYoy(Double finSecurityYoy) {
        this.finSecurityYoy = finSecurityYoy;
    }

    public Double getFinSecurityYoy() {
        return finSecurityYoy;
    }

    public void setPledgeLoan(Double pledgeLoan) {
        this.pledgeLoan = pledgeLoan;
    }

    public Double getPledgeLoan() {
        return pledgeLoan;
    }

    public void setPledgeLoanYoy(Double pledgeLoanYoy) {
        this.pledgeLoanYoy = pledgeLoanYoy;
    }

    public Double getPledgeLoanYoy() {
        return pledgeLoanYoy;
    }

    public void setUdReserve(Double udReserve) {
        this.udReserve = udReserve;
    }

    public Double getUdReserve() {
        return udReserve;
    }

    public void setUdReserveYoy(Double udReserveYoy) {
        this.udReserveYoy = udReserveYoy;
    }

    public Double getUdReserveYoy() {
        return udReserveYoy;
    }

    public void setInternalRece(Double internalRece) {
        this.internalRece = internalRece;
    }

    public Double getInternalRece() {
        return internalRece;
    }

    public void setInternalReceYoy(Double internalReceYoy) {
        this.internalReceYoy = internalReceYoy;
    }

    public Double getInternalReceYoy() {
        return internalReceYoy;
    }

    public void setUnconfirmInvestLoss(Double unconfirmInvestLoss) {
        this.unconfirmInvestLoss = unconfirmInvestLoss;
    }

    public Double getUnconfirmInvestLoss() {
        return unconfirmInvestLoss;
    }

    public void setUnconfirmInvestLossYoy(Double unconfirmInvestLossYoy) {
        this.unconfirmInvestLossYoy = unconfirmInvestLossYoy;
    }

    public Double getUnconfirmInvestLossYoy() {
        return unconfirmInvestLossYoy;
    }

    public void setExportRefundRece(Double exportRefundRece) {
        this.exportRefundRece = exportRefundRece;
    }

    public Double getExportRefundRece() {
        return exportRefundRece;
    }

    public void setExportRefundReceYoy(Double exportRefundReceYoy) {
        this.exportRefundReceYoy = exportRefundReceYoy;
    }

    public Double getExportRefundReceYoy() {
        return exportRefundReceYoy;
    }

    public void setCurrentAssetOther(Double currentAssetOther) {
        this.currentAssetOther = currentAssetOther;
    }

    public Double getCurrentAssetOther() {
        return currentAssetOther;
    }

    public void setCurrentAssetOtherYoy(Double currentAssetOtherYoy) {
        this.currentAssetOtherYoy = currentAssetOtherYoy;
    }

    public Double getCurrentAssetOtherYoy() {
        return currentAssetOtherYoy;
    }

    public void setNoncurrentAssetOther(Double noncurrentAssetOther) {
        this.noncurrentAssetOther = noncurrentAssetOther;
    }

    public Double getNoncurrentAssetOther() {
        return noncurrentAssetOther;
    }

    public void setNoncurrentAssetOtherYoy(Double noncurrentAssetOtherYoy) {
        this.noncurrentAssetOtherYoy = noncurrentAssetOtherYoy;
    }

    public Double getNoncurrentAssetOtherYoy() {
        return noncurrentAssetOtherYoy;
    }

    public void setProductiveBiologyAsset(Double productiveBiologyAsset) {
        this.productiveBiologyAsset = productiveBiologyAsset;
    }

    public Double getProductiveBiologyAsset() {
        return productiveBiologyAsset;
    }

    public void setProductiveBiologyAssetYoy(Double productiveBiologyAssetYoy) {
        this.productiveBiologyAssetYoy = productiveBiologyAssetYoy;
    }

    public Double getProductiveBiologyAssetYoy() {
        return productiveBiologyAssetYoy;
    }

    public void setAccruedExpense(Double accruedExpense) {
        this.accruedExpense = accruedExpense;
    }

    public Double getAccruedExpense() {
        return accruedExpense;
    }

    public void setAccruedExpenseYoy(Double accruedExpenseYoy) {
        this.accruedExpenseYoy = accruedExpenseYoy;
    }

    public Double getAccruedExpenseYoy() {
        return accruedExpenseYoy;
    }

    public InvFinanceZcfz() {
        super();
    }

    public InvFinanceZcfz(String securityCode) {
        this.securityCode = securityCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvFinanceZcfz)) return false;
        InvFinanceZcfz that = (InvFinanceZcfz) o;
        return Objects.equals(securityCode, that.securityCode) && Objects.equals(orgCode, that.orgCode) && Objects.equals(orgType, that.orgType) && Objects.equals(securityTypeCode, that.securityTypeCode) && Objects.equals(securityNameAbbr, that.securityNameAbbr) && Objects.equals(reportType, that.reportType) && Objects.equals(reportDateName, that.reportDateName) && Objects.equals(noticeDate, that.noticeDate) && Objects.equals(reportDate, that.reportDate) && Objects.equals(updateDate, that.updateDate) && Objects.equals(opinionType, that.opinionType) && Objects.equals(osopinionType, that.osopinionType) && Objects.equals(monetaryfunds, that.monetaryfunds) && Objects.equals(monetaryfundsYoy, that.monetaryfundsYoy) && Objects.equals(customerDeposit, that.customerDeposit) && Objects.equals(customerDepositYoy, that.customerDepositYoy) && Objects.equals(settleExcessReserve, that.settleExcessReserve) && Objects.equals(settleExcessReserveYoy, that.settleExcessReserveYoy) && Objects.equals(customerExcessReserve, that.customerExcessReserve) && Objects.equals(customerExcessReserveYoy, that.customerExcessReserveYoy) && Objects.equals(finFund, that.finFund) && Objects.equals(finFundYoy, that.finFundYoy) && Objects.equals(fvtplFinasset, that.fvtplFinasset) && Objects.equals(fvtplFinassetYoy, that.fvtplFinassetYoy) && Objects.equals(deriveFinasset, that.deriveFinasset) && Objects.equals(deriveFinassetYoy, that.deriveFinassetYoy) && Objects.equals(buyResaleFinasset, that.buyResaleFinasset) && Objects.equals(buyResaleFinassetYoy, that.buyResaleFinassetYoy) && Objects.equals(receivables, that.receivables) && Objects.equals(receivablesYoy, that.receivablesYoy) && Objects.equals(interestRece, that.interestRece) && Objects.equals(interestReceYoy, that.interestReceYoy) && Objects.equals(refundDepositPay, that.refundDepositPay) && Objects.equals(refundDepositPayYoy, that.refundDepositPayYoy) && Objects.equals(tradeFinassetNotfvtpl, that.tradeFinassetNotfvtpl) && Objects.equals(tradeFinassetNotfvtplYoy, that.tradeFinassetNotfvtplYoy) && Objects.equals(creditorInvest, that.creditorInvest) && Objects.equals(creditorInvestYoy, that.creditorInvestYoy) && Objects.equals(otherCreditorInvest, that.otherCreditorInvest) && Objects.equals(otherCreditorInvestYoy, that.otherCreditorInvestYoy) && Objects.equals(otherEquityInvest, that.otherEquityInvest) && Objects.equals(otherEquityInvestYoy, that.otherEquityInvestYoy) && Objects.equals(availableSaleFinasset, that.availableSaleFinasset) && Objects.equals(availableSaleFinassetYoy, that.availableSaleFinassetYoy) && Objects.equals(longEquityInvest, that.longEquityInvest) && Objects.equals(longEquityInvestYoy, that.longEquityInvestYoy) && Objects.equals(investRealestate, that.investRealestate) && Objects.equals(investRealestateYoy, that.investRealestateYoy) && Objects.equals(fixedAsset, that.fixedAsset) && Objects.equals(fixedAssetYoy, that.fixedAssetYoy) && Objects.equals(cip, that.cip) && Objects.equals(cipYoy, that.cipYoy) && Objects.equals(userightAsset, that.userightAsset) && Objects.equals(userightAssetYoy, that.userightAssetYoy) && Objects.equals(intangibleAsset, that.intangibleAsset) && Objects.equals(intangibleAssetYoy, that.intangibleAssetYoy) && Objects.equals(goodwill, that.goodwill) && Objects.equals(goodwillYoy, that.goodwillYoy) && Objects.equals(deferTaxAsset, that.deferTaxAsset) && Objects.equals(deferTaxAssetYoy, that.deferTaxAssetYoy) && Objects.equals(otherAsset, that.otherAsset) && Objects.equals(otherAssetYoy, that.otherAssetYoy) && Objects.equals(totalAssets, that.totalAssets) && Objects.equals(totalAssetsYoy, that.totalAssetsYoy) && Objects.equals(shortLoan, that.shortLoan) && Objects.equals(shortLoanYoy, that.shortLoanYoy) && Objects.equals(shortFinPayable, that.shortFinPayable) && Objects.equals(shortFinPayableYoy, that.shortFinPayableYoy) && Objects.equals(borrowFund, that.borrowFund) && Objects.equals(borrowFundYoy, that.borrowFundYoy) && Objects.equals(tradeFinliabNotfvtpl, that.tradeFinliabNotfvtpl) && Objects.equals(tradeFinliabNotfvtplYoy, that.tradeFinliabNotfvtplYoy) && Objects.equals(fvtplFinliab, that.fvtplFinliab) && Objects.equals(fvtplFinliabYoy, that.fvtplFinliabYoy) && Objects.equals(deriveFinliab, that.deriveFinliab) && Objects.equals(deriveFinliabYoy, that.deriveFinliabYoy) && Objects.equals(sellRepoFinasset, that.sellRepoFinasset) && Objects.equals(sellRepoFinassetYoy, that.sellRepoFinassetYoy) && Objects.equals(agentTradeSecurity, that.agentTradeSecurity) && Objects.equals(agentTradeSecurityYoy, that.agentTradeSecurityYoy) && Objects.equals(agentUnderwriteSecurity, that.agentUnderwriteSecurity) && Objects.equals(agentUnderwriteSecurityYoy, that.agentUnderwriteSecurityYoy) && Objects.equals(accountsPayable, that.accountsPayable) && Objects.equals(accountsPayableYoy, that.accountsPayableYoy) && Objects.equals(staffSalaryPayable, that.staffSalaryPayable) && Objects.equals(staffSalaryPayableYoy, that.staffSalaryPayableYoy) && Objects.equals(taxPayable, that.taxPayable) && Objects.equals(taxPayableYoy, that.taxPayableYoy) && Objects.equals(interestPayable, that.interestPayable) && Objects.equals(interestPayableYoy, that.interestPayableYoy) && Objects.equals(longLoan, that.longLoan) && Objects.equals(longLoanYoy, that.longLoanYoy) && Objects.equals(bondPayable, that.bondPayable) && Objects.equals(bondPayableYoy, that.bondPayableYoy) && Objects.equals(leaseLiab, that.leaseLiab) && Objects.equals(leaseLiabYoy, that.leaseLiabYoy) && Objects.equals(deferTaxLiab, that.deferTaxLiab) && Objects.equals(deferTaxLiabYoy, that.deferTaxLiabYoy) && Objects.equals(otherLiab, that.otherLiab) && Objects.equals(otherLiabYoy, that.otherLiabYoy) && Objects.equals(liabOther, that.liabOther) && Objects.equals(liabOtherYoy, that.liabOtherYoy) && Objects.equals(totalLiabilities, that.totalLiabilities) && Objects.equals(totalLiabilitiesYoy, that.totalLiabilitiesYoy) && Objects.equals(shareCapital, that.shareCapital) && Objects.equals(shareCapitalYoy, that.shareCapitalYoy) && Objects.equals(capitalReserve, that.capitalReserve) && Objects.equals(capitalReserveYoy, that.capitalReserveYoy) && Objects.equals(otherCompreIncome, that.otherCompreIncome) && Objects.equals(otherCompreIncomeYoy, that.otherCompreIncomeYoy) && Objects.equals(surplusReserve, that.surplusReserve) && Objects.equals(surplusReserveYoy, that.surplusReserveYoy) && Objects.equals(generalRiskReserve, that.generalRiskReserve) && Objects.equals(generalRiskReserveYoy, that.generalRiskReserveYoy) && Objects.equals(unassignRpofit, that.unassignRpofit) && Objects.equals(unassignRpofitYoy, that.unassignRpofitYoy) && Objects.equals(totalParentEquity, that.totalParentEquity) && Objects.equals(totalParentEquityYoy, that.totalParentEquityYoy) && Objects.equals(minorityEquity, that.minorityEquity) && Objects.equals(minorityEquityYoy, that.minorityEquityYoy) && Objects.equals(totalEquity, that.totalEquity) && Objects.equals(totalEquityYoy, that.totalEquityYoy) && Objects.equals(totalLiabEquity, that.totalLiabEquity) && Objects.equals(totalLiabEquityYoy, that.totalLiabEquityYoy) && Objects.equals(subbondPayable, that.subbondPayable) && Objects.equals(subbondPayableYoy, that.subbondPayableYoy) && Objects.equals(noteAccountsRece, that.noteAccountsRece) && Objects.equals(noteAccountsReceYoy, that.noteAccountsReceYoy) && Objects.equals(noteRece, that.noteRece) && Objects.equals(noteReceYoy, that.noteReceYoy) && Objects.equals(accountsRece, that.accountsRece) && Objects.equals(accountsReceYoy, that.accountsReceYoy) && Objects.equals(financeRece, that.financeRece) && Objects.equals(financeReceYoy, that.financeReceYoy) && Objects.equals(prepayment, that.prepayment) && Objects.equals(prepaymentYoy, that.prepaymentYoy) && Objects.equals(totalOtherRece, that.totalOtherRece) && Objects.equals(totalOtherReceYoy, that.totalOtherReceYoy) && Objects.equals(dividendRece, that.dividendRece) && Objects.equals(dividendReceYoy, that.dividendReceYoy) && Objects.equals(inventory, that.inventory) && Objects.equals(inventoryYoy, that.inventoryYoy) && Objects.equals(contractAsset, that.contractAsset) && Objects.equals(contractAssetYoy, that.contractAssetYoy) && Objects.equals(noncurrentAsset1year, that.noncurrentAsset1year) && Objects.equals(noncurrentAsset1yearYoy, that.noncurrentAsset1yearYoy) && Objects.equals(otherCurrentAsset, that.otherCurrentAsset) && Objects.equals(otherCurrentAssetYoy, that.otherCurrentAssetYoy) && Objects.equals(totalCurrentAssets, that.totalCurrentAssets) && Objects.equals(totalCurrentAssetsYoy, that.totalCurrentAssetsYoy) && Objects.equals(longRece, that.longRece) && Objects.equals(longReceYoy, that.longReceYoy) && Objects.equals(developExpense, that.developExpense) && Objects.equals(developExpenseYoy, that.developExpenseYoy) && Objects.equals(longPrepaidExpense, that.longPrepaidExpense) && Objects.equals(longPrepaidExpenseYoy, that.longPrepaidExpenseYoy) && Objects.equals(otherNoncurrentAsset, that.otherNoncurrentAsset) && Objects.equals(otherNoncurrentAssetYoy, that.otherNoncurrentAssetYoy) && Objects.equals(totalNoncurrentAssets, that.totalNoncurrentAssets) && Objects.equals(totalNoncurrentAssetsYoy, that.totalNoncurrentAssetsYoy) && Objects.equals(noteAccountsPayable, that.noteAccountsPayable) && Objects.equals(noteAccountsPayableYoy, that.noteAccountsPayableYoy) && Objects.equals(notePayable, that.notePayable) && Objects.equals(notePayableYoy, that.notePayableYoy) && Objects.equals(contractLiab, that.contractLiab) && Objects.equals(contractLiabYoy, that.contractLiabYoy) && Objects.equals(totalOtherPayable, that.totalOtherPayable) && Objects.equals(totalOtherPayableYoy, that.totalOtherPayableYoy) && Objects.equals(dividendPayable, that.dividendPayable) && Objects.equals(dividendPayableYoy, that.dividendPayableYoy) && Objects.equals(noncurrentLiab1year, that.noncurrentLiab1year) && Objects.equals(noncurrentLiab1yearYoy, that.noncurrentLiab1yearYoy) && Objects.equals(otherCurrentLiab, that.otherCurrentLiab) && Objects.equals(otherCurrentLiabYoy, that.otherCurrentLiabYoy) && Objects.equals(totalCurrentLiab, that.totalCurrentLiab) && Objects.equals(totalCurrentLiabYoy, that.totalCurrentLiabYoy) && Objects.equals(longPayable, that.longPayable) && Objects.equals(longPayableYoy, that.longPayableYoy) && Objects.equals(longStaffsalaryPayable, that.longStaffsalaryPayable) && Objects.equals(longStaffsalaryPayableYoy, that.longStaffsalaryPayableYoy) && Objects.equals(predictLiab, that.predictLiab) && Objects.equals(predictLiabYoy, that.predictLiabYoy) && Objects.equals(deferIncome, that.deferIncome) && Objects.equals(deferIncomeYoy, that.deferIncomeYoy) && Objects.equals(totalNoncurrentLiab, that.totalNoncurrentLiab) && Objects.equals(totalNoncurrentLiabYoy, that.totalNoncurrentLiabYoy) && Objects.equals(specialReserve, that.specialReserve) && Objects.equals(specialReserveYoy, that.specialReserveYoy) && Objects.equals(cashDepositPbc, that.cashDepositPbc) && Objects.equals(cashDepositPbcYoy, that.cashDepositPbcYoy) && Objects.equals(depositInterbank, that.depositInterbank) && Objects.equals(depositInterbankYoy, that.depositInterbankYoy) && Objects.equals(preciousMetal, that.preciousMetal) && Objects.equals(preciousMetalYoy, that.preciousMetalYoy) && Objects.equals(lendFund, that.lendFund) && Objects.equals(lendFundYoy, that.lendFundYoy) && Objects.equals(loanAdvance, that.loanAdvance) && Objects.equals(loanAdvanceYoy, that.loanAdvanceYoy) && Objects.equals(amortizeCostFinasset, that.amortizeCostFinasset) && Objects.equals(amortizeCostFinassetyoy, that.amortizeCostFinassetyoy) && Objects.equals(fvtociFinasset, that.fvtociFinasset) && Objects.equals(fvtociFinassetYoy, that.fvtociFinassetYoy) && Objects.equals(assetOther, that.assetOther) && Objects.equals(assetOtherYoy, that.assetOtherYoy) && Objects.equals(loanPbc, that.loanPbc) && Objects.equals(loanPbcYoy, that.loanPbcYoy) && Objects.equals(iofiDeposit, that.iofiDeposit) && Objects.equals(iofiDepositYoy, that.iofiDepositYoy) && Objects.equals(acceptDeposit, that.acceptDeposit) && Objects.equals(acceptDepositYoy, that.acceptDepositYoy) && Objects.equals(otherEquityOther, that.otherEquityOther) && Objects.equals(otherEquityOtherYoy, that.otherEquityOtherYoy) && Objects.equals(preferredShares, that.preferredShares) && Objects.equals(preferredSharesYoy, that.preferredSharesYoy) && Objects.equals(perpetualBond, that.perpetualBond) && Objects.equals(perpetualBondYoy, that.perpetualBondYoy) && Objects.equals(premiumRece, that.premiumRece) && Objects.equals(premiumReceYoy, that.premiumReceYoy) && Objects.equals(reinsureRece, that.reinsureRece) && Objects.equals(reinsureReceYoy, that.reinsureReceYoy) && Objects.equals(rudReserveRece, that.rudReserveRece) && Objects.equals(rudReserveReceYoy, that.rudReserveReceYoy) && Objects.equals(rucReserveRece, that.rucReserveRece) && Objects.equals(rucReserveReceYoy, that.rucReserveReceYoy) && Objects.equals(otherRece, that.otherRece) && Objects.equals(otherReceYoy, that.otherReceYoy) && Objects.equals(timeDeposit, that.timeDeposit) && Objects.equals(timeDepositYoy, that.timeDepositYoy) && Objects.equals(holdMaturityInvest, that.holdMaturityInvest) && Objects.equals(holdMaturityInvestYoy, that.holdMaturityInvestYoy) && Objects.equals(refundCapitalDeposit, that.refundCapitalDeposit) && Objects.equals(refundCapitalDepositYoy, that.refundCapitalDepositYoy) && Objects.equals(advanceRece, that.advanceRece) && Objects.equals(advanceReceYoy, that.advanceReceYoy) && Objects.equals(advancePremium, that.advancePremium) && Objects.equals(advancePremiumYoy, that.advancePremiumYoy) && Objects.equals(feeCommissionPayable, that.feeCommissionPayable) && Objects.equals(feeCommissionPayableYoy, that.feeCommissionPayableYoy) && Objects.equals(reinsurePayable, that.reinsurePayable) && Objects.equals(reinsurePayableYoy, that.reinsurePayableYoy) && Objects.equals(compensatePayable, that.compensatePayable) && Objects.equals(compensatePayableYoy, that.compensatePayableYoy) && Objects.equals(netPendmortgageAsset, that.netPendmortgageAsset) && Objects.equals(netPendmortgageAssetYoy, that.netPendmortgageAssetYoy) && Objects.equals(hedgeReserve, that.hedgeReserve) && Objects.equals(hedgeReserveYoy, that.hedgeReserveYoy) && Objects.equals(preferredSharesPaybale, that.preferredSharesPaybale) && Objects.equals(preferredSharesPaybaleYoy, that.preferredSharesPaybaleYoy) && Objects.equals(tradeFinasset, that.tradeFinasset) && Objects.equals(tradeFinassetYoy, that.tradeFinassetYoy) && Objects.equals(holdsaleAsset, that.holdsaleAsset) && Objects.equals(holdsaleAssetYoy, that.holdsaleAssetYoy) && Objects.equals(appointFvtplFinliab, that.appointFvtplFinliab) && Objects.equals(appointFvtplFinliabYoy, that.appointFvtplFinliabYoy) && Objects.equals(liabBalance, that.liabBalance) && Objects.equals(liabBalanceYoy, that.liabBalanceYoy) && Objects.equals(cdNotePayable, that.cdNotePayable) && Objects.equals(cdNotePayableYoy, that.cdNotePayableYoy) && Objects.equals(assetBalance, that.assetBalance) && Objects.equals(assetBalanceYoy, that.assetBalanceYoy) && Objects.equals(pendMortgageAsset, that.pendMortgageAsset) && Objects.equals(pendMortgageAssetYoy, that.pendMortgageAssetYoy) && Objects.equals(holdsaleLiab, that.holdsaleLiab) && Objects.equals(holdsaleLiabYoy, that.holdsaleLiabYoy) && Objects.equals(liabEquityBalance, that.liabEquityBalance) && Objects.equals(liabEquityBalanceYoy, that.liabEquityBalanceYoy) && Objects.equals(equityBalance, that.equityBalance) && Objects.equals(equityBalanceYoy, that.equityBalanceYoy) && Objects.equals(parentEquityBalance, that.parentEquityBalance) && Objects.equals(parentEquityBalanceYoy, that.parentEquityBalanceYoy) && Objects.equals(otherEquityTool, that.otherEquityTool) && Objects.equals(otherEquityToolYoy, that.otherEquityToolYoy) && Objects.equals(equityOther, that.equityOther) && Objects.equals(equityOtherYoy, that.equityOtherYoy) && Objects.equals(liabEquityOther, that.liabEquityOther) && Objects.equals(liabEquityOtherYoy, that.liabEquityOtherYoy) && Objects.equals(investRece, that.investRece) && Objects.equals(investReceYoy, that.investReceYoy) && Objects.equals(treasuryShares, that.treasuryShares) && Objects.equals(treasurySharesYoy, that.treasurySharesYoy) && Objects.equals(outwardRemit, that.outwardRemit) && Objects.equals(outwardRemitYoy, that.outwardRemitYoy) && Objects.equals(amortizeCostFinliab, that.amortizeCostFinliab) && Objects.equals(amortizeCostFinliabYoy, that.amortizeCostFinliabYoy) && Objects.equals(investJoint, that.investJoint) && Objects.equals(investJointYoy, that.investJointYoy) && Objects.equals(investRevalueReserve, that.investRevalueReserve) && Objects.equals(investRevalueReserveYoy, that.investRevalueReserveYoy) && Objects.equals(convertDiff, that.convertDiff) && Objects.equals(convertDiffYoy, that.convertDiffYoy) && Objects.equals(tradeFinliab, that.tradeFinliab) && Objects.equals(tradeFinliabYoy, that.tradeFinliabYoy) && Objects.equals(adviceAssignDividend, that.adviceAssignDividend) && Objects.equals(adviceAssignDividendYoy, that.adviceAssignDividendYoy) && Objects.equals(appointFvtplFinasset, that.appointFvtplFinasset) && Objects.equals(appointFvtplFinassetYoy, that.appointFvtplFinassetYoy) && Objects.equals(mortgageAssetImpairment, that.mortgageAssetImpairment) && Objects.equals(mortgageAssetImpairmentYoy, that.mortgageAssetImpairmentYoy) && Objects.equals(perpetualBondPaybale, that.perpetualBondPaybale) && Objects.equals(perpetualBondPaybaleYoy, that.perpetualBondPaybaleYoy) && Objects.equals(depositCertificate, that.depositCertificate) && Objects.equals(depositCertificateYoy, that.depositCertificateYoy) && Objects.equals(investSubsidiary, that.investSubsidiary) && Objects.equals(investSubsidiaryYoy, that.investSubsidiaryYoy) && Objects.equals(parentEquityOther, that.parentEquityOther) && Objects.equals(parentEquityOtherYoy, that.parentEquityOtherYoy) && Objects.equals(insuredDepositInvest, that.insuredDepositInvest) && Objects.equals(insuredDepositInvestYoy, that.insuredDepositInvestYoy) && Objects.equals(indAccLiab, that.indAccLiab) && Objects.equals(indAccLiabYoy, that.indAccLiabYoy) && Objects.equals(creditorPlanInvest, that.creditorPlanInvest) && Objects.equals(creditorPlanInvestYoy, that.creditorPlanInvestYoy) && Objects.equals(rcReserveRece, that.rcReserveRece) && Objects.equals(rcReserveReceYoy, that.rcReserveReceYoy) && Objects.equals(noncurrentLiabOther, that.noncurrentLiabOther) && Objects.equals(noncurrentLiabOtherYoy, that.noncurrentLiabOtherYoy) && Objects.equals(indAccAsset, that.indAccAsset) && Objects.equals(indAccAssetYoy, that.indAccAssetYoy) && Objects.equals(subsidyRece, that.subsidyRece) && Objects.equals(subsidyReceYoy, that.subsidyReceYoy) && Objects.equals(fvtociNcfinasset, that.fvtociNcfinasset) && Objects.equals(fvtociNcfinassetYoy, that.fvtociNcfinassetYoy) && Objects.equals(otherPayable, that.otherPayable) && Objects.equals(otherPayableYoy, that.otherPayableYoy) && Objects.equals(ldReserve, that.ldReserve) && Objects.equals(ldReserveYoy, that.ldReserveYoy) && Objects.equals(currentLiabOther, that.currentLiabOther) && Objects.equals(currentLiabOtherYoy, that.currentLiabOtherYoy) && Objects.equals(projectMaterial, that.projectMaterial) && Objects.equals(projectMaterialYoy, that.projectMaterialYoy) && Objects.equals(fixedAssetDisposal, that.fixedAssetDisposal) && Objects.equals(fixedAssetDisposalYoy, that.fixedAssetDisposalYoy) && Objects.equals(otherNoncurrentLiab, that.otherNoncurrentLiab) && Objects.equals(otherNoncurrentLiabYoy, that.otherNoncurrentLiabYoy) && Objects.equals(oilGasAsset, that.oilGasAsset) && Objects.equals(oilGasAssetYoy, that.oilGasAssetYoy) && Objects.equals(noncurrentLiabBalance, that.noncurrentLiabBalance) && Objects.equals(noncurrentLiabBalanceYoy, that.noncurrentLiabBalanceYoy) && Objects.equals(noncurrentAssetBalance, that.noncurrentAssetBalance) && Objects.equals(noncurrentAssetBalanceYoy, that.noncurrentAssetBalanceYoy) && Objects.equals(currentLiabBalance, that.currentLiabBalance) && Objects.equals(currentLiabBalanceYoy, that.currentLiabBalanceYoy) && Objects.equals(policyBonusPayable, that.policyBonusPayable) && Objects.equals(policyBonusPayableYoy, that.policyBonusPayableYoy) && Objects.equals(internalPayable, that.internalPayable) && Objects.equals(internalPayableYoy, that.internalPayableYoy) && Objects.equals(specialPayable, that.specialPayable) && Objects.equals(specialPayableYoy, that.specialPayableYoy) && Objects.equals(rldReserveRece, that.rldReserveRece) && Objects.equals(rldReserveReceYoy, that.rldReserveReceYoy) && Objects.equals(rhdReserveRece, that.rhdReserveRece) && Objects.equals(rhdReserveReceYoy, that.rhdReserveReceYoy) && Objects.equals(predictCurrentLiab, that.predictCurrentLiab) && Objects.equals(predictCurrentLiabYoy, that.predictCurrentLiabYoy) && Objects.equals(refundDepositRece, that.refundDepositRece) && Objects.equals(refundDepositReceYoy, that.refundDepositReceYoy) && Objects.equals(hdReserve, that.hdReserve) && Objects.equals(hdReserveYoy, that.hdReserveYoy) && Objects.equals(insuredPledgeLoan, that.insuredPledgeLoan) && Objects.equals(insuredPledgeLoanYoy, that.insuredPledgeLoanYoy) && Objects.equals(otherNoncurrentFinasset, that.otherNoncurrentFinasset) && Objects.equals(otherNoncurrentFinassetYoy, that.otherNoncurrentFinassetYoy) && Objects.equals(assignCashDividend, that.assignCashDividend) && Objects.equals(assignCashDividendYoy, that.assignCashDividendYoy) && Objects.equals(advanceReceivables, that.advanceReceivables) && Objects.equals(advanceReceivablesYoy, that.advanceReceivablesYoy) && Objects.equals(shortBondPayable, that.shortBondPayable) && Objects.equals(shortBondPayableYoy, that.shortBondPayableYoy) && Objects.equals(currentAssetBalance, that.currentAssetBalance) && Objects.equals(currentAssetBalanceYoy, that.currentAssetBalanceYoy) && Objects.equals(amortizeCostNcfinliab, that.amortizeCostNcfinliab) && Objects.equals(amortizeCostNcfinliabYoy, that.amortizeCostNcfinliabYoy) && Objects.equals(amortizeCostNcfinasset, that.amortizeCostNcfinasset) && Objects.equals(amortizeCostNcfinassetYoy, that.amortizeCostNcfinassetYoy) && Objects.equals(insuranceContractReserve, that.insuranceContractReserve) && Objects.equals(insuranceContractReserveYoy, that.insuranceContractReserveYoy) && Objects.equals(customerCreditDeposit, that.customerCreditDeposit) && Objects.equals(customerCreditDepositYoy, that.customerCreditDepositYoy) && Objects.equals(ucReserve, that.ucReserve) && Objects.equals(ucReserveYoy, that.ucReserveYoy) && Objects.equals(creditExcessReserve, that.creditExcessReserve) && Objects.equals(creditExcessReserveYoy, that.creditExcessReserveYoy) && Objects.equals(tradeSeatFee, that.tradeSeatFee) && Objects.equals(tradeSeatFeeYoy, that.tradeSeatFeeYoy) && Objects.equals(tradeRiskReserve, that.tradeRiskReserve) && Objects.equals(tradeRiskReserveYoy, that.tradeRiskReserveYoy) && Objects.equals(creditAgentSecurity, that.creditAgentSecurity) && Objects.equals(creditAgentSecurityYoy, that.creditAgentSecurityYoy) && Objects.equals(finSecurity, that.finSecurity) && Objects.equals(finSecurityYoy, that.finSecurityYoy) && Objects.equals(pledgeLoan, that.pledgeLoan) && Objects.equals(pledgeLoanYoy, that.pledgeLoanYoy) && Objects.equals(udReserve, that.udReserve) && Objects.equals(udReserveYoy, that.udReserveYoy) && Objects.equals(internalRece, that.internalRece) && Objects.equals(internalReceYoy, that.internalReceYoy) && Objects.equals(unconfirmInvestLoss, that.unconfirmInvestLoss) && Objects.equals(unconfirmInvestLossYoy, that.unconfirmInvestLossYoy) && Objects.equals(exportRefundRece, that.exportRefundRece) && Objects.equals(exportRefundReceYoy, that.exportRefundReceYoy) && Objects.equals(currentAssetOther, that.currentAssetOther) && Objects.equals(currentAssetOtherYoy, that.currentAssetOtherYoy) && Objects.equals(noncurrentAssetOther, that.noncurrentAssetOther) && Objects.equals(noncurrentAssetOtherYoy, that.noncurrentAssetOtherYoy) && Objects.equals(productiveBiologyAsset, that.productiveBiologyAsset) && Objects.equals(productiveBiologyAssetYoy, that.productiveBiologyAssetYoy) && Objects.equals(accruedExpense, that.accruedExpense) && Objects.equals(accruedExpenseYoy, that.accruedExpenseYoy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityCode, orgCode, orgType, securityTypeCode, securityNameAbbr, reportType, reportDateName, noticeDate, reportDate, updateDate, opinionType, osopinionType, monetaryfunds, monetaryfundsYoy, customerDeposit, customerDepositYoy, settleExcessReserve, settleExcessReserveYoy, customerExcessReserve, customerExcessReserveYoy, finFund, finFundYoy, fvtplFinasset, fvtplFinassetYoy, deriveFinasset, deriveFinassetYoy, buyResaleFinasset, buyResaleFinassetYoy, receivables, receivablesYoy, interestRece, interestReceYoy, refundDepositPay, refundDepositPayYoy, tradeFinassetNotfvtpl, tradeFinassetNotfvtplYoy, creditorInvest, creditorInvestYoy, otherCreditorInvest, otherCreditorInvestYoy, otherEquityInvest, otherEquityInvestYoy, availableSaleFinasset, availableSaleFinassetYoy, longEquityInvest, longEquityInvestYoy, investRealestate, investRealestateYoy, fixedAsset, fixedAssetYoy, cip, cipYoy, userightAsset, userightAssetYoy, intangibleAsset, intangibleAssetYoy, goodwill, goodwillYoy, deferTaxAsset, deferTaxAssetYoy, otherAsset, otherAssetYoy, totalAssets, totalAssetsYoy, shortLoan, shortLoanYoy, shortFinPayable, shortFinPayableYoy, borrowFund, borrowFundYoy, tradeFinliabNotfvtpl, tradeFinliabNotfvtplYoy, fvtplFinliab, fvtplFinliabYoy, deriveFinliab, deriveFinliabYoy, sellRepoFinasset, sellRepoFinassetYoy, agentTradeSecurity, agentTradeSecurityYoy, agentUnderwriteSecurity, agentUnderwriteSecurityYoy, accountsPayable, accountsPayableYoy, staffSalaryPayable, staffSalaryPayableYoy, taxPayable, taxPayableYoy, interestPayable, interestPayableYoy, longLoan, longLoanYoy, bondPayable, bondPayableYoy, leaseLiab, leaseLiabYoy, deferTaxLiab, deferTaxLiabYoy, otherLiab, otherLiabYoy, liabOther, liabOtherYoy, totalLiabilities, totalLiabilitiesYoy, shareCapital, shareCapitalYoy, capitalReserve, capitalReserveYoy, otherCompreIncome, otherCompreIncomeYoy, surplusReserve, surplusReserveYoy, generalRiskReserve, generalRiskReserveYoy, unassignRpofit, unassignRpofitYoy, totalParentEquity, totalParentEquityYoy, minorityEquity, minorityEquityYoy, totalEquity, totalEquityYoy, totalLiabEquity, totalLiabEquityYoy, subbondPayable, subbondPayableYoy, noteAccountsRece, noteAccountsReceYoy, noteRece, noteReceYoy, accountsRece, accountsReceYoy, financeRece, financeReceYoy, prepayment, prepaymentYoy, totalOtherRece, totalOtherReceYoy, dividendRece, dividendReceYoy, inventory, inventoryYoy, contractAsset, contractAssetYoy, noncurrentAsset1year, noncurrentAsset1yearYoy, otherCurrentAsset, otherCurrentAssetYoy, totalCurrentAssets, totalCurrentAssetsYoy, longRece, longReceYoy, developExpense, developExpenseYoy, longPrepaidExpense, longPrepaidExpenseYoy, otherNoncurrentAsset, otherNoncurrentAssetYoy, totalNoncurrentAssets, totalNoncurrentAssetsYoy, noteAccountsPayable, noteAccountsPayableYoy, notePayable, notePayableYoy, contractLiab, contractLiabYoy, totalOtherPayable, totalOtherPayableYoy, dividendPayable, dividendPayableYoy, noncurrentLiab1year, noncurrentLiab1yearYoy, otherCurrentLiab, otherCurrentLiabYoy, totalCurrentLiab, totalCurrentLiabYoy, longPayable, longPayableYoy, longStaffsalaryPayable, longStaffsalaryPayableYoy, predictLiab, predictLiabYoy, deferIncome, deferIncomeYoy, totalNoncurrentLiab, totalNoncurrentLiabYoy, specialReserve, specialReserveYoy, cashDepositPbc, cashDepositPbcYoy, depositInterbank, depositInterbankYoy, preciousMetal, preciousMetalYoy, lendFund, lendFundYoy, loanAdvance, loanAdvanceYoy, amortizeCostFinasset, amortizeCostFinassetyoy, fvtociFinasset, fvtociFinassetYoy, assetOther, assetOtherYoy, loanPbc, loanPbcYoy, iofiDeposit, iofiDepositYoy, acceptDeposit, acceptDepositYoy, otherEquityOther, otherEquityOtherYoy, preferredShares, preferredSharesYoy, perpetualBond, perpetualBondYoy, premiumRece, premiumReceYoy, reinsureRece, reinsureReceYoy, rudReserveRece, rudReserveReceYoy, rucReserveRece, rucReserveReceYoy, otherRece, otherReceYoy, timeDeposit, timeDepositYoy, holdMaturityInvest, holdMaturityInvestYoy, refundCapitalDeposit, refundCapitalDepositYoy, advanceRece, advanceReceYoy, advancePremium, advancePremiumYoy, feeCommissionPayable, feeCommissionPayableYoy, reinsurePayable, reinsurePayableYoy, compensatePayable, compensatePayableYoy, netPendmortgageAsset, netPendmortgageAssetYoy, hedgeReserve, hedgeReserveYoy, preferredSharesPaybale, preferredSharesPaybaleYoy, tradeFinasset, tradeFinassetYoy, holdsaleAsset, holdsaleAssetYoy, appointFvtplFinliab, appointFvtplFinliabYoy, liabBalance, liabBalanceYoy, cdNotePayable, cdNotePayableYoy, assetBalance, assetBalanceYoy, pendMortgageAsset, pendMortgageAssetYoy, holdsaleLiab, holdsaleLiabYoy, liabEquityBalance, liabEquityBalanceYoy, equityBalance, equityBalanceYoy, parentEquityBalance, parentEquityBalanceYoy, otherEquityTool, otherEquityToolYoy, equityOther, equityOtherYoy, liabEquityOther, liabEquityOtherYoy, investRece, investReceYoy, treasuryShares, treasurySharesYoy, outwardRemit, outwardRemitYoy, amortizeCostFinliab, amortizeCostFinliabYoy, investJoint, investJointYoy, investRevalueReserve, investRevalueReserveYoy, convertDiff, convertDiffYoy, tradeFinliab, tradeFinliabYoy, adviceAssignDividend, adviceAssignDividendYoy, appointFvtplFinasset, appointFvtplFinassetYoy, mortgageAssetImpairment, mortgageAssetImpairmentYoy, perpetualBondPaybale, perpetualBondPaybaleYoy, depositCertificate, depositCertificateYoy, investSubsidiary, investSubsidiaryYoy, parentEquityOther, parentEquityOtherYoy, insuredDepositInvest, insuredDepositInvestYoy, indAccLiab, indAccLiabYoy, creditorPlanInvest, creditorPlanInvestYoy, rcReserveRece, rcReserveReceYoy, noncurrentLiabOther, noncurrentLiabOtherYoy, indAccAsset, indAccAssetYoy, subsidyRece, subsidyReceYoy, fvtociNcfinasset, fvtociNcfinassetYoy, otherPayable, otherPayableYoy, ldReserve, ldReserveYoy, currentLiabOther, currentLiabOtherYoy, projectMaterial, projectMaterialYoy, fixedAssetDisposal, fixedAssetDisposalYoy, otherNoncurrentLiab, otherNoncurrentLiabYoy, oilGasAsset, oilGasAssetYoy, noncurrentLiabBalance, noncurrentLiabBalanceYoy, noncurrentAssetBalance, noncurrentAssetBalanceYoy, currentLiabBalance, currentLiabBalanceYoy, policyBonusPayable, policyBonusPayableYoy, internalPayable, internalPayableYoy, specialPayable, specialPayableYoy, rldReserveRece, rldReserveReceYoy, rhdReserveRece, rhdReserveReceYoy, predictCurrentLiab, predictCurrentLiabYoy, refundDepositRece, refundDepositReceYoy, hdReserve, hdReserveYoy, insuredPledgeLoan, insuredPledgeLoanYoy, otherNoncurrentFinasset, otherNoncurrentFinassetYoy, assignCashDividend, assignCashDividendYoy, advanceReceivables, advanceReceivablesYoy, shortBondPayable, shortBondPayableYoy, currentAssetBalance, currentAssetBalanceYoy, amortizeCostNcfinliab, amortizeCostNcfinliabYoy, amortizeCostNcfinasset, amortizeCostNcfinassetYoy, insuranceContractReserve, insuranceContractReserveYoy, customerCreditDeposit, customerCreditDepositYoy, ucReserve, ucReserveYoy, creditExcessReserve, creditExcessReserveYoy, tradeSeatFee, tradeSeatFeeYoy, tradeRiskReserve, tradeRiskReserveYoy, creditAgentSecurity, creditAgentSecurityYoy, finSecurity, finSecurityYoy, pledgeLoan, pledgeLoanYoy, udReserve, udReserveYoy, internalRece, internalReceYoy, unconfirmInvestLoss, unconfirmInvestLossYoy, exportRefundRece, exportRefundReceYoy, currentAssetOther, currentAssetOtherYoy, noncurrentAssetOther, noncurrentAssetOtherYoy, productiveBiologyAsset, productiveBiologyAssetYoy, accruedExpense, accruedExpenseYoy);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("securityCode", getSecurityCode())
                .append("orgCode", getOrgCode())
                .append("orgType", getOrgType())
                .append("securityTypeCode", getSecurityTypeCode())
                .append("securityNameAbbr", getSecurityNameAbbr())
                .append("reportType", getReportType())
                .append("reportDateName", getReportDateName())
                .append("noticeDate", getNoticeDate())
                .append("reportDate", getReportDate())
                .append("updateDate", getUpdateDate())
                .append("opinionType", getOpinionType())
                .append("osopinionType", getOsopinionType())
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
                .append("fvtplFinasset", getFvtplFinasset())
                .append("fvtplFinassetYoy", getFvtplFinassetYoy())
                .append("deriveFinasset", getDeriveFinasset())
                .append("deriveFinassetYoy", getDeriveFinassetYoy())
                .append("buyResaleFinasset", getBuyResaleFinasset())
                .append("buyResaleFinassetYoy", getBuyResaleFinassetYoy())
                .append("receivables", getReceivables())
                .append("receivablesYoy", getReceivablesYoy())
                .append("interestRece", getInterestRece())
                .append("interestReceYoy", getInterestReceYoy())
                .append("refundDepositPay", getRefundDepositPay())
                .append("refundDepositPayYoy", getRefundDepositPayYoy())
                .append("tradeFinassetNotfvtpl", getTradeFinassetNotfvtpl())
                .append("tradeFinassetNotfvtplYoy", getTradeFinassetNotfvtplYoy())
                .append("creditorInvest", getCreditorInvest())
                .append("creditorInvestYoy", getCreditorInvestYoy())
                .append("otherCreditorInvest", getOtherCreditorInvest())
                .append("otherCreditorInvestYoy", getOtherCreditorInvestYoy())
                .append("otherEquityInvest", getOtherEquityInvest())
                .append("otherEquityInvestYoy", getOtherEquityInvestYoy())
                .append("availableSaleFinasset", getAvailableSaleFinasset())
                .append("availableSaleFinassetYoy", getAvailableSaleFinassetYoy())
                .append("longEquityInvest", getLongEquityInvest())
                .append("longEquityInvestYoy", getLongEquityInvestYoy())
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
                .append("otherAsset", getOtherAsset())
                .append("otherAssetYoy", getOtherAssetYoy())
                .append("totalAssets", getTotalAssets())
                .append("totalAssetsYoy", getTotalAssetsYoy())
                .append("shortLoan", getShortLoan())
                .append("shortLoanYoy", getShortLoanYoy())
                .append("shortFinPayable", getShortFinPayable())
                .append("shortFinPayableYoy", getShortFinPayableYoy())
                .append("borrowFund", getBorrowFund())
                .append("borrowFundYoy", getBorrowFundYoy())
                .append("tradeFinliabNotfvtpl", getTradeFinliabNotfvtpl())
                .append("tradeFinliabNotfvtplYoy", getTradeFinliabNotfvtplYoy())
                .append("fvtplFinliab", getFvtplFinliab())
                .append("fvtplFinliabYoy", getFvtplFinliabYoy())
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
                .append("interestPayable", getInterestPayable())
                .append("interestPayableYoy", getInterestPayableYoy())
                .append("longLoan", getLongLoan())
                .append("longLoanYoy", getLongLoanYoy())
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
                .append("subbondPayable", getSubbondPayable())
                .append("subbondPayableYoy", getSubbondPayableYoy())
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
                .append("developExpense", getDevelopExpense())
                .append("developExpenseYoy", getDevelopExpenseYoy())
                .append("longPrepaidExpense", getLongPrepaidExpense())
                .append("longPrepaidExpenseYoy", getLongPrepaidExpenseYoy())
                .append("otherNoncurrentAsset", getOtherNoncurrentAsset())
                .append("otherNoncurrentAssetYoy", getOtherNoncurrentAssetYoy())
                .append("totalNoncurrentAssets", getTotalNoncurrentAssets())
                .append("totalNoncurrentAssetsYoy", getTotalNoncurrentAssetsYoy())
                .append("noteAccountsPayable", getNoteAccountsPayable())
                .append("noteAccountsPayableYoy", getNoteAccountsPayableYoy())
                .append("notePayable", getNotePayable())
                .append("notePayableYoy", getNotePayableYoy())
                .append("contractLiab", getContractLiab())
                .append("contractLiabYoy", getContractLiabYoy())
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
                .append("longPayable", getLongPayable())
                .append("longPayableYoy", getLongPayableYoy())
                .append("longStaffsalaryPayable", getLongStaffsalaryPayable())
                .append("longStaffsalaryPayableYoy", getLongStaffsalaryPayableYoy())
                .append("predictLiab", getPredictLiab())
                .append("predictLiabYoy", getPredictLiabYoy())
                .append("deferIncome", getDeferIncome())
                .append("deferIncomeYoy", getDeferIncomeYoy())
                .append("totalNoncurrentLiab", getTotalNoncurrentLiab())
                .append("totalNoncurrentLiabYoy", getTotalNoncurrentLiabYoy())
                .append("specialReserve", getSpecialReserve())
                .append("specialReserveYoy", getSpecialReserveYoy())
                .append("cashDepositPbc", getCashDepositPbc())
                .append("cashDepositPbcYoy", getCashDepositPbcYoy())
                .append("depositInterbank", getDepositInterbank())
                .append("depositInterbankYoy", getDepositInterbankYoy())
                .append("preciousMetal", getPreciousMetal())
                .append("preciousMetalYoy", getPreciousMetalYoy())
                .append("lendFund", getLendFund())
                .append("lendFundYoy", getLendFundYoy())
                .append("loanAdvance", getLoanAdvance())
                .append("loanAdvanceYoy", getLoanAdvanceYoy())
                .append("amortizeCostFinasset", getAmortizeCostFinasset())
                .append("amortizeCostFinassetyoy", getAmortizeCostFinassetyoy())
                .append("fvtociFinasset", getFvtociFinasset())
                .append("fvtociFinassetYoy", getFvtociFinassetYoy())
                .append("assetOther", getAssetOther())
                .append("assetOtherYoy", getAssetOtherYoy())
                .append("loanPbc", getLoanPbc())
                .append("loanPbcYoy", getLoanPbcYoy())
                .append("iofiDeposit", getIofiDeposit())
                .append("iofiDepositYoy", getIofiDepositYoy())
                .append("acceptDeposit", getAcceptDeposit())
                .append("acceptDepositYoy", getAcceptDepositYoy())
                .append("otherEquityOther", getOtherEquityOther())
                .append("otherEquityOtherYoy", getOtherEquityOtherYoy())
                .append("preferredShares", getPreferredShares())
                .append("preferredSharesYoy", getPreferredSharesYoy())
                .append("perpetualBond", getPerpetualBond())
                .append("perpetualBondYoy", getPerpetualBondYoy())
                .append("premiumRece", getPremiumRece())
                .append("premiumReceYoy", getPremiumReceYoy())
                .append("reinsureRece", getReinsureRece())
                .append("reinsureReceYoy", getReinsureReceYoy())
                .append("rudReserveRece", getRudReserveRece())
                .append("rudReserveReceYoy", getRudReserveReceYoy())
                .append("rucReserveRece", getRucReserveRece())
                .append("rucReserveReceYoy", getRucReserveReceYoy())
                .append("otherRece", getOtherRece())
                .append("otherReceYoy", getOtherReceYoy())
                .append("timeDeposit", getTimeDeposit())
                .append("timeDepositYoy", getTimeDepositYoy())
                .append("holdMaturityInvest", getHoldMaturityInvest())
                .append("holdMaturityInvestYoy", getHoldMaturityInvestYoy())
                .append("refundCapitalDeposit", getRefundCapitalDeposit())
                .append("refundCapitalDepositYoy", getRefundCapitalDepositYoy())
                .append("advanceRece", getAdvanceRece())
                .append("advanceReceYoy", getAdvanceReceYoy())
                .append("advancePremium", getAdvancePremium())
                .append("advancePremiumYoy", getAdvancePremiumYoy())
                .append("feeCommissionPayable", getFeeCommissionPayable())
                .append("feeCommissionPayableYoy", getFeeCommissionPayableYoy())
                .append("reinsurePayable", getReinsurePayable())
                .append("reinsurePayableYoy", getReinsurePayableYoy())
                .append("compensatePayable", getCompensatePayable())
                .append("compensatePayableYoy", getCompensatePayableYoy())
                .append("netPendmortgageAsset", getNetPendmortgageAsset())
                .append("netPendmortgageAssetYoy", getNetPendmortgageAssetYoy())
                .append("hedgeReserve", getHedgeReserve())
                .append("hedgeReserveYoy", getHedgeReserveYoy())
                .append("preferredSharesPaybale", getPreferredSharesPaybale())
                .append("preferredSharesPaybaleYoy", getPreferredSharesPaybaleYoy())
                .append("tradeFinasset", getTradeFinasset())
                .append("tradeFinassetYoy", getTradeFinassetYoy())
                .append("holdsaleAsset", getHoldsaleAsset())
                .append("holdsaleAssetYoy", getHoldsaleAssetYoy())
                .append("appointFvtplFinliab", getAppointFvtplFinliab())
                .append("appointFvtplFinliabYoy", getAppointFvtplFinliabYoy())
                .append("liabBalance", getLiabBalance())
                .append("liabBalanceYoy", getLiabBalanceYoy())
                .append("cdNotePayable", getCdNotePayable())
                .append("cdNotePayableYoy", getCdNotePayableYoy())
                .append("assetBalance", getAssetBalance())
                .append("assetBalanceYoy", getAssetBalanceYoy())
                .append("pendMortgageAsset", getPendMortgageAsset())
                .append("pendMortgageAssetYoy", getPendMortgageAssetYoy())
                .append("holdsaleLiab", getHoldsaleLiab())
                .append("holdsaleLiabYoy", getHoldsaleLiabYoy())
                .append("liabEquityBalance", getLiabEquityBalance())
                .append("liabEquityBalanceYoy", getLiabEquityBalanceYoy())
                .append("equityBalance", getEquityBalance())
                .append("equityBalanceYoy", getEquityBalanceYoy())
                .append("parentEquityBalance", getParentEquityBalance())
                .append("parentEquityBalanceYoy", getParentEquityBalanceYoy())
                .append("otherEquityTool", getOtherEquityTool())
                .append("otherEquityToolYoy", getOtherEquityToolYoy())
                .append("equityOther", getEquityOther())
                .append("equityOtherYoy", getEquityOtherYoy())
                .append("liabEquityOther", getLiabEquityOther())
                .append("liabEquityOtherYoy", getLiabEquityOtherYoy())
                .append("investRece", getInvestRece())
                .append("investReceYoy", getInvestReceYoy())
                .append("treasuryShares", getTreasuryShares())
                .append("treasurySharesYoy", getTreasurySharesYoy())
                .append("outwardRemit", getOutwardRemit())
                .append("outwardRemitYoy", getOutwardRemitYoy())
                .append("amortizeCostFinliab", getAmortizeCostFinliab())
                .append("amortizeCostFinliabYoy", getAmortizeCostFinliabYoy())
                .append("investJoint", getInvestJoint())
                .append("investJointYoy", getInvestJointYoy())
                .append("investRevalueReserve", getInvestRevalueReserve())
                .append("investRevalueReserveYoy", getInvestRevalueReserveYoy())
                .append("convertDiff", getConvertDiff())
                .append("convertDiffYoy", getConvertDiffYoy())
                .append("tradeFinliab", getTradeFinliab())
                .append("tradeFinliabYoy", getTradeFinliabYoy())
                .append("adviceAssignDividend", getAdviceAssignDividend())
                .append("adviceAssignDividendYoy", getAdviceAssignDividendYoy())
                .append("appointFvtplFinasset", getAppointFvtplFinasset())
                .append("appointFvtplFinassetYoy", getAppointFvtplFinassetYoy())
                .append("mortgageAssetImpairment", getMortgageAssetImpairment())
                .append("mortgageAssetImpairmentYoy", getMortgageAssetImpairmentYoy())
                .append("perpetualBondPaybale", getPerpetualBondPaybale())
                .append("perpetualBondPaybaleYoy", getPerpetualBondPaybaleYoy())
                .append("depositCertificate", getDepositCertificate())
                .append("depositCertificateYoy", getDepositCertificateYoy())
                .append("investSubsidiary", getInvestSubsidiary())
                .append("investSubsidiaryYoy", getInvestSubsidiaryYoy())
                .append("parentEquityOther", getParentEquityOther())
                .append("parentEquityOtherYoy", getParentEquityOtherYoy())
                .append("insuredDepositInvest", getInsuredDepositInvest())
                .append("insuredDepositInvestYoy", getInsuredDepositInvestYoy())
                .append("indAccLiab", getIndAccLiab())
                .append("indAccLiabYoy", getIndAccLiabYoy())
                .append("creditorPlanInvest", getCreditorPlanInvest())
                .append("creditorPlanInvestYoy", getCreditorPlanInvestYoy())
                .append("rcReserveRece", getRcReserveRece())
                .append("rcReserveReceYoy", getRcReserveReceYoy())
                .append("noncurrentLiabOther", getNoncurrentLiabOther())
                .append("noncurrentLiabOtherYoy", getNoncurrentLiabOtherYoy())
                .append("indAccAsset", getIndAccAsset())
                .append("indAccAssetYoy", getIndAccAssetYoy())
                .append("subsidyRece", getSubsidyRece())
                .append("subsidyReceYoy", getSubsidyReceYoy())
                .append("fvtociNcfinasset", getFvtociNcfinasset())
                .append("fvtociNcfinassetYoy", getFvtociNcfinassetYoy())
                .append("otherPayable", getOtherPayable())
                .append("otherPayableYoy", getOtherPayableYoy())
                .append("ldReserve", getLdReserve())
                .append("ldReserveYoy", getLdReserveYoy())
                .append("currentLiabOther", getCurrentLiabOther())
                .append("currentLiabOtherYoy", getCurrentLiabOtherYoy())
                .append("projectMaterial", getProjectMaterial())
                .append("projectMaterialYoy", getProjectMaterialYoy())
                .append("fixedAssetDisposal", getFixedAssetDisposal())
                .append("fixedAssetDisposalYoy", getFixedAssetDisposalYoy())
                .append("otherNoncurrentLiab", getOtherNoncurrentLiab())
                .append("otherNoncurrentLiabYoy", getOtherNoncurrentLiabYoy())
                .append("oilGasAsset", getOilGasAsset())
                .append("oilGasAssetYoy", getOilGasAssetYoy())
                .append("noncurrentLiabBalance", getNoncurrentLiabBalance())
                .append("noncurrentLiabBalanceYoy", getNoncurrentLiabBalanceYoy())
                .append("noncurrentAssetBalance", getNoncurrentAssetBalance())
                .append("noncurrentAssetBalanceYoy", getNoncurrentAssetBalanceYoy())
                .append("currentLiabBalance", getCurrentLiabBalance())
                .append("currentLiabBalanceYoy", getCurrentLiabBalanceYoy())
                .append("policyBonusPayable", getPolicyBonusPayable())
                .append("policyBonusPayableYoy", getPolicyBonusPayableYoy())
                .append("internalPayable", getInternalPayable())
                .append("internalPayableYoy", getInternalPayableYoy())
                .append("specialPayable", getSpecialPayable())
                .append("specialPayableYoy", getSpecialPayableYoy())
                .append("rldReserveRece", getRldReserveRece())
                .append("rldReserveReceYoy", getRldReserveReceYoy())
                .append("rhdReserveRece", getRhdReserveRece())
                .append("rhdReserveReceYoy", getRhdReserveReceYoy())
                .append("predictCurrentLiab", getPredictCurrentLiab())
                .append("predictCurrentLiabYoy", getPredictCurrentLiabYoy())
                .append("refundDepositRece", getRefundDepositRece())
                .append("refundDepositReceYoy", getRefundDepositReceYoy())
                .append("hdReserve", getHdReserve())
                .append("hdReserveYoy", getHdReserveYoy())
                .append("insuredPledgeLoan", getInsuredPledgeLoan())
                .append("insuredPledgeLoanYoy", getInsuredPledgeLoanYoy())
                .append("otherNoncurrentFinasset", getOtherNoncurrentFinasset())
                .append("otherNoncurrentFinassetYoy", getOtherNoncurrentFinassetYoy())
                .append("assignCashDividend", getAssignCashDividend())
                .append("assignCashDividendYoy", getAssignCashDividendYoy())
                .append("advanceReceivables", getAdvanceReceivables())
                .append("advanceReceivablesYoy", getAdvanceReceivablesYoy())
                .append("shortBondPayable", getShortBondPayable())
                .append("shortBondPayableYoy", getShortBondPayableYoy())
                .append("currentAssetBalance", getCurrentAssetBalance())
                .append("currentAssetBalanceYoy", getCurrentAssetBalanceYoy())
                .append("amortizeCostNcfinliab", getAmortizeCostNcfinliab())
                .append("amortizeCostNcfinliabYoy", getAmortizeCostNcfinliabYoy())
                .append("amortizeCostNcfinasset", getAmortizeCostNcfinasset())
                .append("amortizeCostNcfinassetYoy", getAmortizeCostNcfinassetYoy())
                .append("insuranceContractReserve", getInsuranceContractReserve())
                .append("insuranceContractReserveYoy", getInsuranceContractReserveYoy())
                .append("customerCreditDeposit", getCustomerCreditDeposit())
                .append("customerCreditDepositYoy", getCustomerCreditDepositYoy())
                .append("ucReserve", getUcReserve())
                .append("ucReserveYoy", getUcReserveYoy())
                .append("creditExcessReserve", getCreditExcessReserve())
                .append("creditExcessReserveYoy", getCreditExcessReserveYoy())
                .append("tradeSeatFee", getTradeSeatFee())
                .append("tradeSeatFeeYoy", getTradeSeatFeeYoy())
                .append("tradeRiskReserve", getTradeRiskReserve())
                .append("tradeRiskReserveYoy", getTradeRiskReserveYoy())
                .append("creditAgentSecurity", getCreditAgentSecurity())
                .append("creditAgentSecurityYoy", getCreditAgentSecurityYoy())
                .append("finSecurity", getFinSecurity())
                .append("finSecurityYoy", getFinSecurityYoy())
                .append("pledgeLoan", getPledgeLoan())
                .append("pledgeLoanYoy", getPledgeLoanYoy())
                .append("udReserve", getUdReserve())
                .append("udReserveYoy", getUdReserveYoy())
                .append("internalRece", getInternalRece())
                .append("internalReceYoy", getInternalReceYoy())
                .append("unconfirmInvestLoss", getUnconfirmInvestLoss())
                .append("unconfirmInvestLossYoy", getUnconfirmInvestLossYoy())
                .append("exportRefundRece", getExportRefundRece())
                .append("exportRefundReceYoy", getExportRefundReceYoy())
                .append("currentAssetOther", getCurrentAssetOther())
                .append("currentAssetOtherYoy", getCurrentAssetOtherYoy())
                .append("noncurrentAssetOther", getNoncurrentAssetOther())
                .append("noncurrentAssetOtherYoy", getNoncurrentAssetOtherYoy())
                .append("productiveBiologyAsset", getProductiveBiologyAsset())
                .append("productiveBiologyAssetYoy", getProductiveBiologyAssetYoy())
                .append("accruedExpense", getAccruedExpense())
                .append("accruedExpenseYoy", getAccruedExpenseYoy())
                .toString();
    }
}
