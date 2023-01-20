package com.ruoyi.investment.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.Date;
import java.util.Objects;

/**
 * 财务分析-现金流量对象 inv_finance_xjll
 * 
 * @author yangwenyang
 * @date 2023-01-19
 */
public class InvFinanceXjll extends BaseEntity{
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

    /** 销售商品、提供劳务收到的现金 */
    @Excel(name = "销售商品、提供劳务收到的现金")
    private Double salesServices;

    /** 销售商品、提供劳务收到的现金(同比%) */
    @Excel(name = "销售商品、提供劳务收到的现金(同比%)")
    private Double salesServicesYoy;

    /** 销售商品、提供劳务收到的现金(单季度环比%) */
    @Excel(name = "销售商品、提供劳务收到的现金(单季度环比%)")
    private Double salesServicesQoq;

    /** 客户存款和同业存放款项净增加额 */
    @Excel(name = "客户存款和同业存放款项净增加额")
    private Double depositInterbankAdd;

    /** 客户存款和同业存放款项净增加额(同比%) */
    @Excel(name = "客户存款和同业存放款项净增加额(同比%)")
    private Double depositInterbankAddYoy;

    /** 客户存款和同业存放款项净增加额(单季度环比%) */
    @Excel(name = "客户存款和同业存放款项净增加额(单季度环比%)")
    private Double depositInterbankAddQoq;

    /** 向中央银行借款净增加额 */
    @Excel(name = "向中央银行借款净增加额")
    private Double loanPbcAdd;

    /** 向中央银行借款净增加额(同比%) */
    @Excel(name = "向中央银行借款净增加额(同比%)")
    private Double loanPbcAddYoy;

    /** 向中央银行借款净增加额(单季度环比%) */
    @Excel(name = "向中央银行借款净增加额(单季度环比%)")
    private Double loanPbcAddQoq;

    /** 向其他金融机构拆入资金净增加额 */
    @Excel(name = "向其他金融机构拆入资金净增加额")
    private Double ofiBfAdd;

    /** 向其他金融机构拆入资金净增加额(同比%) */
    @Excel(name = "向其他金融机构拆入资金净增加额(同比%)")
    private Double ofiBfAddYoy;

    /** 向其他金融机构拆入资金净增加额(单季度环比%) */
    @Excel(name = "向其他金融机构拆入资金净增加额(单季度环比%)")
    private Double ofiBfAddQoq;

    /** 收到原保险合同保费取得的现金 */
    @Excel(name = "收到原保险合同保费取得的现金")
    private Double receiveOrigicPremium;

    /** 收到原保险合同保费取得的现金(同比%) */
    @Excel(name = "收到原保险合同保费取得的现金(同比%)")
    private Double receiveOrigicPremiumYoy;

    /** 收到原保险合同保费取得的现金(单季度环比%) */
    @Excel(name = "收到原保险合同保费取得的现金(单季度环比%)")
    private Double receiveOrigicPremiumQoq;

    /** 收到再保险业务现金净额 */
    @Excel(name = "收到再保险业务现金净额")
    private Double receiveReinsureNet;

    /** 收到再保险业务现金净额(同比%) */
    @Excel(name = "收到再保险业务现金净额(同比%)")
    private Double receiveReinsureNetYoy;

    /** 收到再保险业务现金净额(单季度环比%) */
    @Excel(name = "收到再保险业务现金净额(单季度环比%)")
    private Double receiveReinsureNetQoq;

    /** 保户储金及投资款净增加额 */
    @Excel(name = "保户储金及投资款净增加额")
    private Double insuredInvestAdd;

    /** 保户储金及投资款净增加额(同比%) */
    @Excel(name = "保户储金及投资款净增加额(同比%)")
    private Double insuredInvestAddYoy;

    /** 保户储金及投资款净增加额(单季度环比%) */
    @Excel(name = "保户储金及投资款净增加额(单季度环比%)")
    private Double insuredInvestAddQoq;

    /** 处置交易性金融资产净增加额 */
    @Excel(name = "处置交易性金融资产净增加额")
    private Double disposalTfaAdd;

    /** 处置交易性金融资产净增加额(同比%) */
    @Excel(name = "处置交易性金融资产净增加额(同比%)")
    private Double disposalTfaAddYoy;

    /** 处置交易性金融资产净增加额(单季度环比%) */
    @Excel(name = "处置交易性金融资产净增加额(单季度环比%)")
    private Double disposalTfaAddQoq;

    /** 收取利息、手续费及佣金的现金 */
    @Excel(name = "收取利息、手续费及佣金的现金")
    private Double receiveInterestCommission;

    /** 收取利息、手续费及佣金的现金(同比%) */
    @Excel(name = "收取利息、手续费及佣金的现金(同比%)")
    private Double receiveInterestCommissionYoy;

    /** 收取利息、手续费及佣金的现金(单季度环比%) */
    @Excel(name = "收取利息、手续费及佣金的现金(单季度环比%)")
    private Double receiveInterestCommissionQoq;

    /** 拆入资金净增加额 */
    @Excel(name = "拆入资金净增加额")
    private Double borrowFundAdd;

    /** 拆入资金净增加额(同比%) */
    @Excel(name = "拆入资金净增加额(同比%)")
    private Double borrowFundAddYoy;

    /** 拆入资金净增加额(单季度环比%) */
    @Excel(name = "拆入资金净增加额(单季度环比%)")
    private Double borrowFundAddQoq;

    /** 发放贷款及垫款的净减少额 */
    @Excel(name = "发放贷款及垫款的净减少额")
    private Double loanAdvanceReduce;

    /** 发放贷款及垫款的净减少额(同比%) */
    @Excel(name = "发放贷款及垫款的净减少额(同比%)")
    private Double loanAdvanceReduceYoy;

    /** 发放贷款及垫款的净减少额(单季度环比%) */
    @Excel(name = "发放贷款及垫款的净减少额(单季度环比%)")
    private Double loanAdvanceReduceQoq;

    /** 回购业务资金净增加额 */
    @Excel(name = "回购业务资金净增加额")
    private Double repoBusinessAdd;

    /** 回购业务资金净增加额(同比%) */
    @Excel(name = "回购业务资金净增加额(同比%)")
    private Double repoBusinessAddYoy;

    /** 回购业务资金净增加额(单季度环比%) */
    @Excel(name = "回购业务资金净增加额(单季度环比%)")
    private Double repoBusinessAddQoq;

    /** 收到的税收返还 */
    @Excel(name = "收到的税收返还")
    private Double receiveTaxRefund;

    /** 收到的税收返还(同比%) */
    @Excel(name = "收到的税收返还(同比%)")
    private Double receiveTaxRefundYoy;

    /** 收到的税收返还(单季度环比%) */
    @Excel(name = "收到的税收返还(单季度环比%)")
    private Double receiveTaxRefundQoq;

    /** 收到其他与经营活动有关的现金 */
    @Excel(name = "收到其他与经营活动有关的现金")
    private Double receiveOtherOperate;

    /** 收到其他与经营活动有关的现金(同比%) */
    @Excel(name = "收到其他与经营活动有关的现金(同比%)")
    private Double receiveOtherOperateYoy;

    /** 收到其他与经营活动有关的现金(单季度环比%) */
    @Excel(name = "收到其他与经营活动有关的现金(单季度环比%)")
    private Double receiveOtherOperateQoq;

    /** 经营活动现金流入的其他项目 */
    @Excel(name = "经营活动现金流入的其他项目")
    private Double operateInflowOther;

    /** 经营活动现金流入的其他项目(同比%) */
    @Excel(name = "经营活动现金流入的其他项目(同比%)")
    private Double operateInflowOtherYoy;

    /** 经营活动现金流入的其他项目(单季度环比%) */
    @Excel(name = "经营活动现金流入的其他项目(单季度环比%)")
    private Double operateInflowOtherQoq;

    /** 经营活动现金流入的平衡项目 */
    @Excel(name = "经营活动现金流入的平衡项目")
    private Double operateInflowBalance;

    /** 经营活动现金流入的平衡项目(同比%) */
    @Excel(name = "经营活动现金流入的平衡项目(同比%)")
    private Double operateInflowBalanceYoy;

    /** 经营活动现金流入的平衡项目(单季度环比%) */
    @Excel(name = "经营活动现金流入的平衡项目(单季度环比%)")
    private Double operateInflowBalanceQoq;

    /** 经营活动现金流入小计 */
    @Excel(name = "经营活动现金流入小计")
    private Double totalOperateInflow;

    /** 经营活动现金流入小计(同比%) */
    @Excel(name = "经营活动现金流入小计(同比%)")
    private Double totalOperateInflowYoy;

    /** 经营活动现金流入小计(单季度环比%) */
    @Excel(name = "经营活动现金流入小计(单季度环比%)")
    private Double totalOperateInflowQoq;

    /** 购买商品、接受劳务支付的现金 */
    @Excel(name = "购买商品、接受劳务支付的现金")
    private Double buyServices;

    /** 购买商品、接受劳务支付的现金(同比%) */
    @Excel(name = "购买商品、接受劳务支付的现金(同比%)")
    private Double buyServicesYoy;

    /** 购买商品、接受劳务支付的现金(单季度环比%) */
    @Excel(name = "购买商品、接受劳务支付的现金(单季度环比%)")
    private Double buyServicesQoq;

    /** 客户贷款及垫款净增加额 */
    @Excel(name = "客户贷款及垫款净增加额")
    private Double loanAdvanceAdd;

    /** 客户贷款及垫款净增加额(同比%) */
    @Excel(name = "客户贷款及垫款净增加额(同比%)")
    private Double loanAdvanceAddYoy;

    /** 客户贷款及垫款净增加额(单季度环比%) */
    @Excel(name = "客户贷款及垫款净增加额(单季度环比%)")
    private Double loanAdvanceAddQoq;

    /** 存放中央银行和同业款项净增加额 */
    @Excel(name = "存放中央银行和同业款项净增加额")
    private Double pbcInterbankAdd;

    /** 存放中央银行和同业款项净增加额(同比%) */
    @Excel(name = "存放中央银行和同业款项净增加额(同比%)")
    private Double pbcInterbankAddYoy;

    /** 存放中央银行和同业款项净增加额(单季度环比%) */
    @Excel(name = "存放中央银行和同业款项净增加额(单季度环比%)")
    private Double pbcInterbankAddQoq;

    /** 支付原保险合同赔付等款项的现金 */
    @Excel(name = "支付原保险合同赔付等款项的现金")
    private Double payOrigicCompensate;

    /** 支付原保险合同赔付等款项的现金(同比%) */
    @Excel(name = "支付原保险合同赔付等款项的现金(同比%)")
    private Double payOrigicCompensateYoy;

    /** 支付原保险合同赔付等款项的现金(单季度环比%) */
    @Excel(name = "支付原保险合同赔付等款项的现金(单季度环比%)")
    private Double payOrigicCompensateQoq;

    /** 支付利息、手续费及佣金的现金 */
    @Excel(name = "支付利息、手续费及佣金的现金")
    private Double payInterestCommission;

    /** 支付利息、手续费及佣金的现金(同比%) */
    @Excel(name = "支付利息、手续费及佣金的现金(同比%)")
    private Double payInterestCommissionYoy;

    /** 支付利息、手续费及佣金的现金(单季度环比%) */
    @Excel(name = "支付利息、手续费及佣金的现金(单季度环比%)")
    private Double payInterestCommissionQoq;

    /** 支付保单红利的现金 */
    @Excel(name = "支付保单红利的现金")
    private Double payPolicyBonus;

    /** 支付保单红利的现金(同比%) */
    @Excel(name = "支付保单红利的现金(同比%)")
    private Double payPolicyBonusYoy;

    /** 支付保单红利的现金(单季度环比%) */
    @Excel(name = "支付保单红利的现金(单季度环比%)")
    private Double payPolicyBonusQoq;

    /** 支付给职工以及为职工支付的现金 */
    @Excel(name = "支付给职工以及为职工支付的现金")
    private Double payStaffCash;

    /** 支付给职工以及为职工支付的现金(同比%) */
    @Excel(name = "支付给职工以及为职工支付的现金(同比%)")
    private Double payStaffCashYoy;

    /** 支付给职工以及为职工支付的现金(单季度环比%) */
    @Excel(name = "支付给职工以及为职工支付的现金(单季度环比%)")
    private Double payStaffCashQoq;

    /** 支付的各项税费 */
    @Excel(name = "支付的各项税费")
    private Double payAllTax;

    /** 支付的各项税费(同比%) */
    @Excel(name = "支付的各项税费(同比%)")
    private Double payAllTaxYoy;

    /** 支付的各项税费(单季度环比%) */
    @Excel(name = "支付的各项税费(单季度环比%)")
    private Double payAllTaxQoq;

    /** 支付其他与经营活动有关的现金 */
    @Excel(name = "支付其他与经营活动有关的现金")
    private Double payOtherOperate;

    /** 支付其他与经营活动有关的现金(同比%) */
    @Excel(name = "支付其他与经营活动有关的现金(同比%)")
    private Double payOtherOperateYoy;

    /** 支付其他与经营活动有关的现金(单季度环比%) */
    @Excel(name = "支付其他与经营活动有关的现金(单季度环比%)")
    private Double payOtherOperateQoq;

    /** 经营活动现金流出的其他项目 */
    @Excel(name = "经营活动现金流出的其他项目")
    private Double operateOutflowOther;

    /** 经营活动现金流出的其他项目(同比%) */
    @Excel(name = "经营活动现金流出的其他项目(同比%)")
    private Double operateOutflowOtherYoy;

    /** 经营活动现金流出的其他项目(单季度环比%) */
    @Excel(name = "经营活动现金流出的其他项目(单季度环比%)")
    private Double operateOutflowOtherQoq;

    /** 客户存款和同业及其他金融机构存放款项净增加额 */
    @Excel(name = "客户存款和同业及其他金融机构存放款项净增加额")
    private Double depositIofiOther;

    /** 客户存款和同业及其他金融机构存放款项净增加额(同比%) */
    @Excel(name = "客户存款和同业及其他金融机构存放款项净增加额(同比%)")
    private Double depositIofiOtherYoy;

    /** 客户存款和同业及其他金融机构存放款项净增加额(单季度环比%) */
    @Excel(name = "客户存款和同业及其他金融机构存放款项净增加额(单季度环比%)")
    private Double depositIofiOtherQoq;

    /** 经营活动现金流出的平衡项目 */
    @Excel(name = "经营活动现金流出的平衡项目")
    private Double operateOutflowBalance;

    /** 经营活动现金流出的平衡项目(同比%) */
    @Excel(name = "经营活动现金流出的平衡项目(同比%)")
    private Double operateOutflowBalanceYoy;

    /** 经营活动现金流出的平衡项目(单季度环比%) */
    @Excel(name = "经营活动现金流出的平衡项目(单季度环比%)")
    private Double operateOutflowBalanceQoq;

    /** 客户存款净增加额 */
    @Excel(name = "客户存款净增加额")
    private Double customerDepositAdd;

    /** 客户存款净增加额(同比%) */
    @Excel(name = "客户存款净增加额(同比%)")
    private Double customerDepositAddYoy;

    /** 客户存款净增加额(单季度环比%) */
    @Excel(name = "客户存款净增加额(单季度环比%)")
    private Double customerDepositAddQoq;

    /** 经营活动现金流出小计 */
    @Excel(name = "经营活动现金流出小计")
    private Double totalOperateOutflow;

    /** 经营活动现金流出小计(同比%) */
    @Excel(name = "经营活动现金流出小计(同比%)")
    private Double totalOperateOutflowYoy;

    /** 经营活动现金流出小计(单季度环比%) */
    @Excel(name = "经营活动现金流出小计(单季度环比%)")
    private Double totalOperateOutflowQoq;

    /** 同业及其他金融机构存放款项净增加额 */
    @Excel(name = "同业及其他金融机构存放款项净增加额")
    private Double iofiAdd;

    /** 同业及其他金融机构存放款项净增加额(同比%) */
    @Excel(name = "同业及其他金融机构存放款项净增加额(同比%)")
    private Double iofiAddYoy;

    /** 同业及其他金融机构存放款项净增加额(单季度环比%) */
    @Excel(name = "同业及其他金融机构存放款项净增加额(单季度环比%)")
    private Double iofiAddQoq;

    /** 经营活动产生的现金流量净额其他项目 */
    @Excel(name = "经营活动产生的现金流量净额其他项目")
    private Double operateNetcashOther;

    /** 经营活动产生的现金流量净额其他项目(同比%) */
    @Excel(name = "经营活动产生的现金流量净额其他项目(同比%)")
    private Double operateNetcashOtherYoy;

    /** 经营活动产生的现金流量净额其他项目(单季度环比%) */
    @Excel(name = "经营活动产生的现金流量净额其他项目(单季度环比%)")
    private Double operateNetcashOtherQoq;

    /** 经营活动产生的现金流量净额平衡项目 */
    @Excel(name = "经营活动产生的现金流量净额平衡项目")
    private Double operateNetcashBalance;

    /** 经营活动产生的现金流量净额平衡项目(同比%) */
    @Excel(name = "经营活动产生的现金流量净额平衡项目(同比%)")
    private Double operateNetcashBalanceYoy;

    /** 经营活动产生的现金流量净额平衡项目(单季度环比%) */
    @Excel(name = "经营活动产生的现金流量净额平衡项目(单季度环比%)")
    private Double operateNetcashBalanceQoq;

    /** 存放中央银行和同业款项及其他金融机构净减少额 */
    @Excel(name = "存放中央银行和同业款项及其他金融机构净减少额")
    private Double pbcIofiReduce;

    /** 存放中央银行和同业款项及其他金融机构净减少额(同比%) */
    @Excel(name = "存放中央银行和同业款项及其他金融机构净减少额(同比%)")
    private Double pbcIofiReduceYoy;

    /** 存放中央银行和同业款项及其他金融机构净减少额(单季度环比%) */
    @Excel(name = "存放中央银行和同业款项及其他金融机构净减少额(单季度环比%)")
    private Double pbcIofiReduceQoq;

    /** 经营活动产生的现金流量净额 */
    @Excel(name = "经营活动产生的现金流量净额")
    private Double netcashOperate;

    /** 经营活动产生的现金流量净额(同比%) */
    @Excel(name = "经营活动产生的现金流量净额(同比%)")
    private Double netcashOperateYoy;

    /** 经营活动产生的现金流量净额(单季度环比%) */
    @Excel(name = "经营活动产生的现金流量净额(单季度环比%)")
    private Double netcashOperateQoq;

    /** 存放中央银行款项净减少额 */
    @Excel(name = "存放中央银行款项净减少额")
    private Double depositPbcReduce;

    /** 存放中央银行款项净减少额(同比%) */
    @Excel(name = "存放中央银行款项净减少额(同比%)")
    private Double depositPbcReduceYoy;

    /** 存放中央银行款项净减少额(单季度环比%) */
    @Excel(name = "存放中央银行款项净减少额(单季度环比%)")
    private Double depositPbcReduceQoq;

    /** 收回投资收到的现金 */
    @Excel(name = "收回投资收到的现金")
    private Double withdrawInvest;

    /** 收回投资收到的现金(同比%) */
    @Excel(name = "收回投资收到的现金(同比%)")
    private Double withdrawInvestYoy;

    /** 收回投资收到的现金(单季度环比%) */
    @Excel(name = "收回投资收到的现金(单季度环比%)")
    private Double withdrawInvestQoq;

    /** 存放同业及其他金融机构款项净减少额 */
    @Excel(name = "存放同业及其他金融机构款项净减少额")
    private Double depositIofiReduce;

    /** 存放同业及其他金融机构款项净减少额(同比%) */
    @Excel(name = "存放同业及其他金融机构款项净减少额(同比%)")
    private Double depositIofiReduceYoy;

    /** 存放同业及其他金融机构款项净减少额(单季度环比%) */
    @Excel(name = "存放同业及其他金融机构款项净减少额(单季度环比%)")
    private Double depositIofiReduceQoq;

    /** 取得投资收益收到的现金 */
    @Excel(name = "取得投资收益收到的现金")
    private Double receiveInvestIncome;

    /** 取得投资收益收到的现金(同比%) */
    @Excel(name = "取得投资收益收到的现金(同比%)")
    private Double receiveInvestIncomeYoy;

    /** 取得投资收益收到的现金(单季度环比%) */
    @Excel(name = "取得投资收益收到的现金(单季度环比%)")
    private Double receiveInvestIncomeQoq;

    /** 拆入资金及卖出回购金融资产款净增加额 */
    @Excel(name = "拆入资金及卖出回购金融资产款净增加额")
    private Double borrowRepoAdd;

    /** 拆入资金及卖出回购金融资产款净增加额(同比%) */
    @Excel(name = "拆入资金及卖出回购金融资产款净增加额(同比%)")
    private Double borrowRepoAddYoy;

    /** 拆入资金及卖出回购金融资产款净增加额(单季度环比%) */
    @Excel(name = "拆入资金及卖出回购金融资产款净增加额(单季度环比%)")
    private Double borrowRepoAddQoq;

    /** 处置固定资产、无形资产和其他长期资产收回的现金净额 */
    @Excel(name = "处置固定资产、无形资产和其他长期资产收回的现金净额")
    private Double disposalLongAsset;

    /** 处置固定资产、无形资产和其他长期资产收回的现金净额(同比%) */
    @Excel(name = "处置固定资产、无形资产和其他长期资产收回的现金净额(同比%)")
    private Double disposalLongAssetYoy;

    /** 处置固定资产、无形资产和其他长期资产收回的现金净额(单季度环比%) */
    @Excel(name = "处置固定资产、无形资产和其他长期资产收回的现金净额(单季度环比%)")
    private Double disposalLongAssetQoq;

    /** 处置子公司及其他营业单位收到的现金 */
    @Excel(name = "处置子公司及其他营业单位收到的现金")
    private Double disposalSubsidiaryOther;

    /** 处置子公司及其他营业单位收到的现金(同比%) */
    @Excel(name = "处置子公司及其他营业单位收到的现金(同比%)")
    private Double disposalSubsidiaryOtherYoy;

    /** 处置子公司及其他营业单位收到的现金(单季度环比%) */
    @Excel(name = "处置子公司及其他营业单位收到的现金(单季度环比%)")
    private Double disposalSubsidiaryOtherQoq;

    /** 卖出回购金融资产款净增加额 */
    @Excel(name = "卖出回购金融资产款净增加额")
    private Double sellRepoAdd;

    /** 卖出回购金融资产款净增加额(同比%) */
    @Excel(name = "卖出回购金融资产款净增加额(同比%)")
    private Double sellRepoAddYoy;

    /** 卖出回购金融资产款净增加额(单季度环比%) */
    @Excel(name = "卖出回购金融资产款净增加额(单季度环比%)")
    private Double sellRepoAddQoq;

    /** 减少质押和定期存款所收到的现金 */
    @Excel(name = "减少质押和定期存款所收到的现金")
    private Double reducePledgeTimedeposits;

    /** 减少质押和定期存款所收到的现金(同比%) */
    @Excel(name = "减少质押和定期存款所收到的现金(同比%)")
    private Double reducePledgeTimedepositsYoy;

    /** 减少质押和定期存款所收到的现金(单季度环比%) */
    @Excel(name = "减少质押和定期存款所收到的现金(单季度环比%)")
    private Double reducePledgeTimedepositsQoq;

    /** 拆出资金及买入返售金融资产净减少额 */
    @Excel(name = "拆出资金及买入返售金融资产净减少额")
    private Double lendResaleReduce;

    /** 拆出资金及买入返售金融资产净减少额(同比%) */
    @Excel(name = "拆出资金及买入返售金融资产净减少额(同比%)")
    private Double lendResaleReduceYoy;

    /** 拆出资金及买入返售金融资产净减少额(单季度环比%) */
    @Excel(name = "拆出资金及买入返售金融资产净减少额(单季度环比%)")
    private Double lendResaleReduceQoq;

    /** 收到的其他与投资活动有关的现金 */
    @Excel(name = "收到的其他与投资活动有关的现金")
    private Double receiveOtherInvest;

    /** 收到的其他与投资活动有关的现金(同比%) */
    @Excel(name = "收到的其他与投资活动有关的现金(同比%)")
    private Double receiveOtherInvestYoy;

    /** 收到的其他与投资活动有关的现金(单季度环比%) */
    @Excel(name = "收到的其他与投资活动有关的现金(单季度环比%)")
    private Double receiveOtherInvestQoq;

    /** 拆出资金净减少额 */
    @Excel(name = "拆出资金净减少额")
    private Double lendFundReduce;

    /** 拆出资金净减少额(同比%) */
    @Excel(name = "拆出资金净减少额(同比%)")
    private Double lendFundReduceYoy;

    /** 拆出资金净减少额(单季度环比%) */
    @Excel(name = "拆出资金净减少额(单季度环比%)")
    private Double lendFundReduceQoq;

    /** 投资活动现金流入的其他项目 */
    @Excel(name = "投资活动现金流入的其他项目")
    private Double investInflowOther;

    /** 投资活动现金流入的其他项目(同比%) */
    @Excel(name = "投资活动现金流入的其他项目(同比%)")
    private Double investInflowOtherYoy;

    /** 投资活动现金流入的其他项目(单季度环比%) */
    @Excel(name = "投资活动现金流入的其他项目(单季度环比%)")
    private Double investInflowOtherQoq;

    /** 买入返售金融资产净减少额 */
    @Excel(name = "买入返售金融资产净减少额")
    private Double buyResaleReduce;

    /** 买入返售金融资产净减少额(同比%) */
    @Excel(name = "买入返售金融资产净减少额(同比%)")
    private Double buyResaleReduceYoy;

    /** 买入返售金融资产净减少额(单季度环比%) */
    @Excel(name = "买入返售金融资产净减少额(单季度环比%)")
    private Double buyResaleReduceQoq;

    /** 投资活动现金流入的平衡项目 */
    @Excel(name = "投资活动现金流入的平衡项目")
    private Double investInflowBalance;

    /** 投资活动现金流入的平衡项目(同比%) */
    @Excel(name = "投资活动现金流入的平衡项目(同比%)")
    private Double investInflowBalanceYoy;

    /** 投资活动现金流入的平衡项目(单季度环比%) */
    @Excel(name = "投资活动现金流入的平衡项目(单季度环比%)")
    private Double investInflowBalanceQoq;

    /** 存款证净额 */
    @Excel(name = "存款证净额")
    private Double netCd;

    /** 存款证净额(同比%) */
    @Excel(name = "存款证净额(同比%)")
    private Double netCdYoy;

    /** 存款证净额(单季度环比%) */
    @Excel(name = "存款证净额(单季度环比%)")
    private Double netCdQoq;

    /** 投资活动现金流入小计 */
    @Excel(name = "投资活动现金流入小计")
    private Double totalInvestInflow;

    /** 投资活动现金流入小计(同比%) */
    @Excel(name = "投资活动现金流入小计(同比%)")
    private Double totalInvestInflowYoy;

    /** 投资活动现金流入小计(单季度环比%) */
    @Excel(name = "投资活动现金流入小计(单季度环比%)")
    private Double totalInvestInflowQoq;

    /** 交易性金融负债净增加额 */
    @Excel(name = "交易性金融负债净增加额")
    private Double tradeFinliabAdd;

    /** 交易性金融负债净增加额(同比%) */
    @Excel(name = "交易性金融负债净增加额(同比%)")
    private Double tradeFinliabAddYoy;

    /** 交易性金融负债净增加额(单季度环比%) */
    @Excel(name = "交易性金融负债净增加额(单季度环比%)")
    private Double tradeFinliabAddQoq;

    /** 购建固定资产、无形资产和其他长期资产支付的现金 */
    @Excel(name = "购建固定资产、无形资产和其他长期资产支付的现金")
    private Double constructLongAsset;

    /** 购建固定资产、无形资产和其他长期资产支付的现金(同比%) */
    @Excel(name = "购建固定资产、无形资产和其他长期资产支付的现金(同比%)")
    private Double constructLongAssetYoy;

    /** 购建固定资产、无形资产和其他长期资产支付的现金(单季度环比%) */
    @Excel(name = "购建固定资产、无形资产和其他长期资产支付的现金(单季度环比%)")
    private Double constructLongAssetQoq;

    /** 交易性金融资产净减少额 */
    @Excel(name = "交易性金融资产净减少额")
    private Double tradeFinassetReduce;

    /** 交易性金融资产净减少额(同比%) */
    @Excel(name = "交易性金融资产净减少额(同比%)")
    private Double tradeFinassetReduceYoy;

    /** 交易性金融资产净减少额(单季度环比%) */
    @Excel(name = "交易性金融资产净减少额(单季度环比%)")
    private Double tradeFinassetReduceQoq;

    /** 投资支付的现金 */
    @Excel(name = "投资支付的现金")
    private Double investPayCash;

    /** 投资支付的现金(同比%) */
    @Excel(name = "投资支付的现金(同比%)")
    private Double investPayCashYoy;

    /** 投资支付的现金(单季度环比%) */
    @Excel(name = "投资支付的现金(单季度环比%)")
    private Double investPayCashQoq;

    /** 质押贷款净增加额 */
    @Excel(name = "质押贷款净增加额")
    private Double pledgeLoanAdd;

    /** 质押贷款净增加额(同比%) */
    @Excel(name = "质押贷款净增加额(同比%)")
    private Double pledgeLoanAddYoy;

    /** 质押贷款净增加额(单季度环比%) */
    @Excel(name = "质押贷款净增加额(单季度环比%)")
    private Double pledgeLoanAddQoq;

    /** 取得子公司及其他营业单位支付的现金净额 */
    @Excel(name = "取得子公司及其他营业单位支付的现金净额")
    private Double obtainSubsidiaryOther;

    /** 取得子公司及其他营业单位支付的现金净额(同比%) */
    @Excel(name = "取得子公司及其他营业单位支付的现金净额(同比%)")
    private Double obtainSubsidiaryOtherYoy;

    /** 取得子公司及其他营业单位支付的现金净额(单季度环比%) */
    @Excel(name = "取得子公司及其他营业单位支付的现金净额(单季度环比%)")
    private Double obtainSubsidiaryOtherQoq;

    /** 收取利息的现金 */
    @Excel(name = "收取利息的现金")
    private Double receiveInterest;

    /** 收取利息的现金(同比%) */
    @Excel(name = "收取利息的现金(同比%)")
    private Double receiveInterestYoy;

    /** 收取利息的现金(单季度环比%) */
    @Excel(name = "收取利息的现金(单季度环比%)")
    private Double receiveInterestQoq;

    /** 收取手续费及佣金的现金 */
    @Excel(name = "收取手续费及佣金的现金")
    private Double receiveCommission;

    /** 收取手续费及佣金的现金(同比%) */
    @Excel(name = "收取手续费及佣金的现金(同比%)")
    private Double receiveCommissionYoy;

    /** 收取手续费及佣金的现金(单季度环比%) */
    @Excel(name = "收取手续费及佣金的现金(单季度环比%)")
    private Double receiveCommissionQoq;

    /** 增加质押和定期存款所支付的现金 */
    @Excel(name = "增加质押和定期存款所支付的现金")
    private Double addPledgeTimedeposits;

    /** 增加质押和定期存款所支付的现金(同比%) */
    @Excel(name = "增加质押和定期存款所支付的现金(同比%)")
    private Double addPledgeTimedepositsYoy;

    /** 增加质押和定期存款所支付的现金(单季度环比%) */
    @Excel(name = "增加质押和定期存款所支付的现金(单季度环比%)")
    private Double addPledgeTimedepositsQoq;

    /** 处置抵债资产收到的现金 */
    @Excel(name = "处置抵债资产收到的现金")
    private Double disposalMortgageAsset;

    /** 处置抵债资产收到的现金(同比%) */
    @Excel(name = "处置抵债资产收到的现金(同比%)")
    private Double disposalMortgageAssetYoy;

    /** 处置抵债资产收到的现金(单季度环比%) */
    @Excel(name = "处置抵债资产收到的现金(单季度环比%)")
    private Double disposalMortgageAssetQoq;

    /** 支付其他与投资活动有关的现金 */
    @Excel(name = "支付其他与投资活动有关的现金")
    private Double payOtherInvest;

    /** 支付其他与投资活动有关的现金(同比%) */
    @Excel(name = "支付其他与投资活动有关的现金(同比%)")
    private Double payOtherInvestYoy;

    /** 支付其他与投资活动有关的现金(单季度环比%) */
    @Excel(name = "支付其他与投资活动有关的现金(单季度环比%)")
    private Double payOtherInvestQoq;

    /** 收回的已于以前年度核销的贷款 */
    @Excel(name = "收回的已于以前年度核销的贷款")
    private Double withdrawWriteoffLoan;

    /** 收回的已于以前年度核销的贷款(同比%) */
    @Excel(name = "收回的已于以前年度核销的贷款(同比%)")
    private Double withdrawWriteoffLoanYoy;

    /** 收回的已于以前年度核销的贷款(单季度环比%) */
    @Excel(name = "收回的已于以前年度核销的贷款(单季度环比%)")
    private Double withdrawWriteoffLoanQoq;

    /** 投资活动现金流出的其他项目 */
    @Excel(name = "投资活动现金流出的其他项目")
    private Double investOutflowOther;

    /** 投资活动现金流出的其他项目(同比%) */
    @Excel(name = "投资活动现金流出的其他项目(同比%)")
    private Double investOutflowOtherYoy;

    /** 投资活动现金流出的其他项目(单季度环比%) */
    @Excel(name = "投资活动现金流出的其他项目(单季度环比%)")
    private Double investOutflowOtherQoq;

    /** 投资活动现金流出的平衡项目 */
    @Excel(name = "投资活动现金流出的平衡项目")
    private Double investOutflowBalance;

    /** 投资活动现金流出的平衡项目(同比%) */
    @Excel(name = "投资活动现金流出的平衡项目(同比%)")
    private Double investOutflowBalanceYoy;

    /** 投资活动现金流出的平衡项目(单季度环比%) */
    @Excel(name = "投资活动现金流出的平衡项目(单季度环比%)")
    private Double investOutflowBalanceQoq;

    /** 投资活动现金流出小计 */
    @Excel(name = "投资活动现金流出小计")
    private Double totalInvestOutflow;

    /** 投资活动现金流出小计(同比%) */
    @Excel(name = "投资活动现金流出小计(同比%)")
    private Double totalInvestOutflowYoy;

    /** 投资活动现金流出小计(单季度环比%) */
    @Excel(name = "投资活动现金流出小计(单季度环比%)")
    private Double totalInvestOutflowQoq;

    /** 投资活动产生的现金流量净额其他项目 */
    @Excel(name = "投资活动产生的现金流量净额其他项目")
    private Double investNetcashOther;

    /** 投资活动产生的现金流量净额其他项目(同比%) */
    @Excel(name = "投资活动产生的现金流量净额其他项目(同比%)")
    private Double investNetcashOtherYoy;

    /** 投资活动产生的现金流量净额其他项目(单季度环比%) */
    @Excel(name = "投资活动产生的现金流量净额其他项目(单季度环比%)")
    private Double investNetcashOtherQoq;

    /** 投资活动产生的现金流量净额平衡项目 */
    @Excel(name = "投资活动产生的现金流量净额平衡项目")
    private Double investNetcashBalance;

    /** 投资活动产生的现金流量净额平衡项目(同比%) */
    @Excel(name = "投资活动产生的现金流量净额平衡项目(同比%)")
    private Double investNetcashBalanceYoy;

    /** 投资活动产生的现金流量净额平衡项目(单季度环比%) */
    @Excel(name = "投资活动产生的现金流量净额平衡项目(单季度环比%)")
    private Double investNetcashBalanceQoq;

    /** 投资活动产生的现金流量净额 */
    @Excel(name = "投资活动产生的现金流量净额")
    private Double netcashInvest;

    /** 投资活动产生的现金流量净额(同比%) */
    @Excel(name = "投资活动产生的现金流量净额(同比%)")
    private Double netcashInvestYoy;

    /** 投资活动产生的现金流量净额(单季度环比%) */
    @Excel(name = "投资活动产生的现金流量净额(单季度环比%)")
    private Double netcashInvestQoq;

    /** 向中央银行借款净减少额 */
    @Excel(name = "向中央银行借款净减少额")
    private Double loanPbcReduce;

    /** 向中央银行借款净减少额(同比%) */
    @Excel(name = "向中央银行借款净减少额(同比%)")
    private Double loanPbcReduceYoy;

    /** 向中央银行借款净减少额(单季度环比%) */
    @Excel(name = "向中央银行借款净减少额(单季度环比%)")
    private Double loanPbcReduceQoq;

    /** 吸收投资收到的现金 */
    @Excel(name = "吸收投资收到的现金")
    private Double acceptInvestCash;

    /** 吸收投资收到的现金(同比%) */
    @Excel(name = "吸收投资收到的现金(同比%)")
    private Double acceptInvestCashYoy;

    /** 吸收投资收到的现金(单季度环比%) */
    @Excel(name = "吸收投资收到的现金(单季度环比%)")
    private Double acceptInvestCashQoq;

    /** 存放中央银行和同业及其他金融机构款项净增加额 */
    @Excel(name = "存放中央银行和同业及其他金融机构款项净增加额")
    private Double pbcIofiAdd;

    /** 存放中央银行和同业及其他金融机构款项净增加额(同比%) */
    @Excel(name = "存放中央银行和同业及其他金融机构款项净增加额(同比%)")
    private Double pbcIofiAddYoy;

    /** 存放中央银行和同业及其他金融机构款项净增加额(单季度环比%) */
    @Excel(name = "存放中央银行和同业及其他金融机构款项净增加额(单季度环比%)")
    private Double pbcIofiAddQoq;

    /** 其中:子公司吸收少数股东投资收到的现金 */
    @Excel(name = "其中:子公司吸收少数股东投资收到的现金")
    private Double subsidiaryAcceptInvest;

    /** 其中:子公司吸收少数股东投资收到的现金(同比%) */
    @Excel(name = "其中:子公司吸收少数股东投资收到的现金(同比%)")
    private Double subsidiaryAcceptInvestYoy;

    /** 其中:子公司吸收少数股东投资收到的现金(单季度环比%) */
    @Excel(name = "其中:子公司吸收少数股东投资收到的现金(单季度环比%)")
    private Double subsidiaryAcceptInvestQoq;

    /** 存放中央银行款项净增加额 */
    @Excel(name = "存放中央银行款项净增加额")
    private Double depositPbcAdd;

    /** 存放中央银行款项净增加额(同比%) */
    @Excel(name = "存放中央银行款项净增加额(同比%)")
    private Double depositPbcAddYoy;

    /** 存放中央银行款项净增加额(单季度环比%) */
    @Excel(name = "存放中央银行款项净增加额(单季度环比%)")
    private Double depositPbcAddQoq;

    /** 取得借款收到的现金 */
    @Excel(name = "取得借款收到的现金")
    private Double receiveLoanCash;

    /** 取得借款收到的现金(同比%) */
    @Excel(name = "取得借款收到的现金(同比%)")
    private Double receiveLoanCashYoy;

    /** 取得借款收到的现金(单季度环比%) */
    @Excel(name = "取得借款收到的现金(单季度环比%)")
    private Double receiveLoanCashQoq;

    /** 存放同业及其他金融机构款项净增加额 */
    @Excel(name = "存放同业及其他金融机构款项净增加额")
    private Double depositIofiAdd;

    /** 存放同业及其他金融机构款项净增加额(同比%) */
    @Excel(name = "存放同业及其他金融机构款项净增加额(同比%)")
    private Double depositIofiAddYoy;

    /** 存放同业及其他金融机构款项净增加额(单季度环比%) */
    @Excel(name = "存放同业及其他金融机构款项净增加额(单季度环比%)")
    private Double depositIofiAddQoq;

    /** 发行债券收到的现金 */
    @Excel(name = "发行债券收到的现金")
    private Double issueBond;

    /** 发行债券收到的现金(同比%) */
    @Excel(name = "发行债券收到的现金(同比%)")
    private Double issueBondYoy;

    /** 发行债券收到的现金(单季度环比%) */
    @Excel(name = "发行债券收到的现金(单季度环比%)")
    private Double issueBondQoq;

    /** 同业及其他机构存放款减少净额 */
    @Excel(name = "同业及其他机构存放款减少净额")
    private Double interbankOtherReduce;

    /** 同业及其他机构存放款减少净额(同比%) */
    @Excel(name = "同业及其他机构存放款减少净额(同比%)")
    private Double interbankOtherReduceYoy;

    /** 同业及其他机构存放款减少净额(单季度环比%) */
    @Excel(name = "同业及其他机构存放款减少净额(单季度环比%)")
    private Double interbankOtherReduceQoq;

    /** 收到的其他与筹资活动有关的现金 */
    @Excel(name = "收到的其他与筹资活动有关的现金")
    private Double receiveOtherFinance;

    /** 收到的其他与筹资活动有关的现金(同比%) */
    @Excel(name = "收到的其他与筹资活动有关的现金(同比%)")
    private Double receiveOtherFinanceYoy;

    /** 收到的其他与筹资活动有关的现金(单季度环比%) */
    @Excel(name = "收到的其他与筹资活动有关的现金(单季度环比%)")
    private Double receiveOtherFinanceQoq;

    /** 已发行存款证净减少额 */
    @Excel(name = "已发行存款证净减少额")
    private Double issuedCdReduce;

    /** 已发行存款证净减少额(同比%) */
    @Excel(name = "已发行存款证净减少额(同比%)")
    private Double issuedCdReduceYoy;

    /** 已发行存款证净减少额(单季度环比%) */
    @Excel(name = "已发行存款证净减少额(单季度环比%)")
    private Double issuedCdReduceQoq;

    /** 筹资活动现金流入的其他项目 */
    @Excel(name = "筹资活动现金流入的其他项目")
    private Double financeInflowOther;

    /** 筹资活动现金流入的其他项目(同比%) */
    @Excel(name = "筹资活动现金流入的其他项目(同比%)")
    private Double financeInflowOtherYoy;

    /** 筹资活动现金流入的其他项目(单季度环比%) */
    @Excel(name = "筹资活动现金流入的其他项目(单季度环比%)")
    private Double financeInflowOtherQoq;

    /** 拆出资金及买入返售金融资产净增加额 */
    @Excel(name = "拆出资金及买入返售金融资产净增加额")
    private Double lendResaleAdd;

    /** 拆出资金及买入返售金融资产净增加额(同比%) */
    @Excel(name = "拆出资金及买入返售金融资产净增加额(同比%)")
    private Double lendResaleAddYoy;

    /** 拆出资金及买入返售金融资产净增加额(单季度环比%) */
    @Excel(name = "拆出资金及买入返售金融资产净增加额(单季度环比%)")
    private Double lendResaleAddQoq;

    /** 筹资活动现金流入的平衡项目 */
    @Excel(name = "筹资活动现金流入的平衡项目")
    private Double financeInflowBalance;

    /** 筹资活动现金流入的平衡项目(同比%) */
    @Excel(name = "筹资活动现金流入的平衡项目(同比%)")
    private Double financeInflowBalanceYoy;

    /** 筹资活动现金流入的平衡项目(单季度环比%) */
    @Excel(name = "筹资活动现金流入的平衡项目(单季度环比%)")
    private Double financeInflowBalanceQoq;

    /** 拆出资金净增加额 */
    @Excel(name = "拆出资金净增加额")
    private Double lendFundAdd;

    /** 拆出资金净增加额(同比%) */
    @Excel(name = "拆出资金净增加额(同比%)")
    private Double lendFundAddYoy;

    /** 拆出资金净增加额(单季度环比%) */
    @Excel(name = "拆出资金净增加额(单季度环比%)")
    private Double lendFundAddQoq;

    /** 筹资活动现金流入小计 */
    @Excel(name = "筹资活动现金流入小计")
    private Double totalFinanceInflow;

    /** 筹资活动现金流入小计(同比%) */
    @Excel(name = "筹资活动现金流入小计(同比%)")
    private Double totalFinanceInflowYoy;

    /** 筹资活动现金流入小计(单季度环比%) */
    @Excel(name = "筹资活动现金流入小计(单季度环比%)")
    private Double totalFinanceInflowQoq;

    /** 买入返售金融资产净增加额 */
    @Excel(name = "买入返售金融资产净增加额")
    private Double buyResaleAdd;

    /** 买入返售金融资产净增加额(同比%) */
    @Excel(name = "买入返售金融资产净增加额(同比%)")
    private Double buyResaleAddYoy;

    /** 买入返售金融资产净增加额(单季度环比%) */
    @Excel(name = "买入返售金融资产净增加额(单季度环比%)")
    private Double buyResaleAddQoq;

    /** 偿还债务所支付的现金 */
    @Excel(name = "偿还债务所支付的现金")
    private Double payDebtCash;

    /** 偿还债务所支付的现金(同比%) */
    @Excel(name = "偿还债务所支付的现金(同比%)")
    private Double payDebtCashYoy;

    /** 偿还债务所支付的现金(单季度环比%) */
    @Excel(name = "偿还债务所支付的现金(单季度环比%)")
    private Double payDebtCashQoq;

    /** 拆入资金及卖出回购金融资产款净减少额 */
    @Excel(name = "拆入资金及卖出回购金融资产款净减少额")
    private Double borrowRepoReduce;

    /** 拆入资金及卖出回购金融资产款净减少额(同比%) */
    @Excel(name = "拆入资金及卖出回购金融资产款净减少额(同比%)")
    private Double borrowRepoReduceYoy;

    /** 拆入资金及卖出回购金融资产款净减少额(单季度环比%) */
    @Excel(name = "拆入资金及卖出回购金融资产款净减少额(单季度环比%)")
    private Double borrowRepoReduceQoq;

    /** 分配股利、利润或偿付利息支付的现金 */
    @Excel(name = "分配股利、利润或偿付利息支付的现金")
    private Double assignDividendPorfit;

    /** 分配股利、利润或偿付利息支付的现金(同比%) */
    @Excel(name = "分配股利、利润或偿付利息支付的现金(同比%)")
    private Double assignDividendPorfitYoy;

    /** 分配股利、利润或偿付利息支付的现金(单季度环比%) */
    @Excel(name = "分配股利、利润或偿付利息支付的现金(单季度环比%)")
    private Double assignDividendPorfitQoq;

    /** 拆入资金净减少额 */
    @Excel(name = "拆入资金净减少额")
    private Double borrowFundReduce;

    /** 拆入资金净减少额(同比%) */
    @Excel(name = "拆入资金净减少额(同比%)")
    private Double borrowFundReduceYoy;

    /** 拆入资金净减少额(单季度环比%) */
    @Excel(name = "拆入资金净减少额(单季度环比%)")
    private Double borrowFundReduceQoq;

    /** 其中:子公司支付给少数股东的股利、利润 */
    @Excel(name = "其中:子公司支付给少数股东的股利、利润")
    private Double subsidiaryPayDividend;

    /** 其中:子公司支付给少数股东的股利、利润(同比%) */
    @Excel(name = "其中:子公司支付给少数股东的股利、利润(同比%)")
    private Double subsidiaryPayDividendYoy;

    /** 其中:子公司支付给少数股东的股利、利润(单季度环比%) */
    @Excel(name = "其中:子公司支付给少数股东的股利、利润(单季度环比%)")
    private Double subsidiaryPayDividendQoq;

    /** 卖出回购金融资产净减少额 */
    @Excel(name = "卖出回购金融资产净减少额")
    private Double sellRepoReduce;

    /** 卖出回购金融资产净减少额(同比%) */
    @Excel(name = "卖出回购金融资产净减少额(同比%)")
    private Double sellRepoReduceYoy;

    /** 卖出回购金融资产净减少额(单季度环比%) */
    @Excel(name = "卖出回购金融资产净减少额(单季度环比%)")
    private Double sellRepoReduceQoq;

    /** 购买子公司少数股权而支付的现金 */
    @Excel(name = "购买子公司少数股权而支付的现金")
    private Double buySubsidiaryEquity;

    /** 购买子公司少数股权而支付的现金(同比%) */
    @Excel(name = "购买子公司少数股权而支付的现金(同比%)")
    private Double buySubsidiaryEquityYoy;

    /** 购买子公司少数股权而支付的现金(单季度环比%) */
    @Excel(name = "购买子公司少数股权而支付的现金(单季度环比%)")
    private Double buySubsidiaryEquityQoq;

    /** 交易性金融资产净增加额 */
    @Excel(name = "交易性金融资产净增加额")
    private Double tradeFinassetAdd;

    /** 交易性金融资产净增加额(同比%) */
    @Excel(name = "交易性金融资产净增加额(同比%)")
    private Double tradeFinassetAddYoy;

    /** 交易性金融资产净增加额(单季度环比%) */
    @Excel(name = "交易性金融资产净增加额(单季度环比%)")
    private Double tradeFinassetAddQoq;

    /** 支付的其他与筹资活动有关的现金 */
    @Excel(name = "支付的其他与筹资活动有关的现金")
    private Double payOtherFinance;

    /** 支付的其他与筹资活动有关的现金(同比%) */
    @Excel(name = "支付的其他与筹资活动有关的现金(同比%)")
    private Double payOtherFinanceYoy;

    /** 支付的其他与筹资活动有关的现金(单季度环比%) */
    @Excel(name = "支付的其他与筹资活动有关的现金(单季度环比%)")
    private Double payOtherFinanceQoq;

    /** 交易性金融负债净减少额 */
    @Excel(name = "交易性金融负债净减少额")
    private Double tradeFinliabReduce;

    /** 交易性金融负债净减少额(同比%) */
    @Excel(name = "交易性金融负债净减少额(同比%)")
    private Double tradeFinliabReduceYoy;

    /** 交易性金融负债净减少额(单季度环比%) */
    @Excel(name = "交易性金融负债净减少额(单季度环比%)")
    private Double tradeFinliabReduceQoq;

    /** 其中:子公司减资支付给少数股东的现金 */
    @Excel(name = "其中:子公司减资支付给少数股东的现金")
    private Double subsidiaryReduceCash;

    /** 其中:子公司减资支付给少数股东的现金(同比%) */
    @Excel(name = "其中:子公司减资支付给少数股东的现金(同比%)")
    private Double subsidiaryReduceCashYoy;

    /** 其中:子公司减资支付给少数股东的现金(单季度环比%) */
    @Excel(name = "其中:子公司减资支付给少数股东的现金(单季度环比%)")
    private Double subsidiaryReduceCashQoq;

    /** 筹资活动现金流出的其他项目 */
    @Excel(name = "筹资活动现金流出的其他项目")
    private Double financeOutflowOther;

    /** 筹资活动现金流出的其他项目(同比%) */
    @Excel(name = "筹资活动现金流出的其他项目(同比%)")
    private Double financeOutflowOtherYoy;

    /** 筹资活动现金流出的其他项目(单季度环比%) */
    @Excel(name = "筹资活动现金流出的其他项目(单季度环比%)")
    private Double financeOutflowOtherQoq;

    /** 支付利息的现金 */
    @Excel(name = "支付利息的现金")
    private Double payInterest;

    /** 支付利息的现金(同比%) */
    @Excel(name = "支付利息的现金(同比%)")
    private Double payInterestYoy;

    /** 支付利息的现金(单季度环比%) */
    @Excel(name = "支付利息的现金(单季度环比%)")
    private Double payInterestQoq;

    /** 筹资活动现金流出的平衡项目 */
    @Excel(name = "筹资活动现金流出的平衡项目")
    private Double financeOutflowBalance;

    /** 筹资活动现金流出的平衡项目(同比%) */
    @Excel(name = "筹资活动现金流出的平衡项目(同比%)")
    private Double financeOutflowBalanceYoy;

    /** 筹资活动现金流出的平衡项目(单季度环比%) */
    @Excel(name = "筹资活动现金流出的平衡项目(单季度环比%)")
    private Double financeOutflowBalanceQoq;

    /** 支付手续费及佣金的现金 */
    @Excel(name = "支付手续费及佣金的现金")
    private Double payCommission;

    /** 支付手续费及佣金的现金(同比%) */
    @Excel(name = "支付手续费及佣金的现金(同比%)")
    private Double payCommissionYoy;

    /** 支付手续费及佣金的现金(单季度环比%) */
    @Excel(name = "支付手续费及佣金的现金(单季度环比%)")
    private Double payCommissionQoq;

    /** 筹资活动现金流出小计 */
    @Excel(name = "筹资活动现金流出小计")
    private Double totalFinanceOutflow;

    /** 筹资活动现金流出小计(同比%) */
    @Excel(name = "筹资活动现金流出小计(同比%)")
    private Double totalFinanceOutflowYoy;

    /** 筹资活动现金流出小计(单季度环比%) */
    @Excel(name = "筹资活动现金流出小计(单季度环比%)")
    private Double totalFinanceOutflowQoq;

    /** 筹资活动产生的现金流量净额其他项目 */
    @Excel(name = "筹资活动产生的现金流量净额其他项目")
    private Double financeNetcashOther;

    /** 筹资活动产生的现金流量净额其他项目(同比%) */
    @Excel(name = "筹资活动产生的现金流量净额其他项目(同比%)")
    private Double financeNetcashOtherYoy;

    /** 筹资活动产生的现金流量净额其他项目(单季度环比%) */
    @Excel(name = "筹资活动产生的现金流量净额其他项目(单季度环比%)")
    private Double financeNetcashOtherQoq;

    /** 购买融资租赁资产支付的现金 */
    @Excel(name = "购买融资租赁资产支付的现金")
    private Double buyFinLease;

    /** 购买融资租赁资产支付的现金(同比%) */
    @Excel(name = "购买融资租赁资产支付的现金(同比%)")
    private Double buyFinLeaseYoy;

    /** 购买融资租赁资产支付的现金(单季度环比%) */
    @Excel(name = "购买融资租赁资产支付的现金(单季度环比%)")
    private Double buyFinLeaseQoq;

    /** 筹资活动产生的现金流量净额平衡项目 */
    @Excel(name = "筹资活动产生的现金流量净额平衡项目")
    private Double financeNetcashBalance;

    /** 筹资活动产生的现金流量净额平衡项目(同比%) */
    @Excel(name = "筹资活动产生的现金流量净额平衡项目(同比%)")
    private Double financeNetcashBalanceYoy;

    /** 筹资活动产生的现金流量净额平衡项目(单季度环比%) */
    @Excel(name = "筹资活动产生的现金流量净额平衡项目(单季度环比%)")
    private Double financeNetcashBalanceQoq;

    /** 应收账款净增加额 */
    @Excel(name = "应收账款净增加额")
    private Double accountsReceAdd;

    /** 应收账款净增加额(同比%) */
    @Excel(name = "应收账款净增加额(同比%)")
    private Double accountsReceAddYoy;

    /** 应收账款净增加额(单季度环比%) */
    @Excel(name = "应收账款净增加额(单季度环比%)")
    private Double accountsReceAddQoq;

    /** 筹资活动产生的现金流量净额 */
    @Excel(name = "筹资活动产生的现金流量净额")
    private Double netcashFinance;

    /** 筹资活动产生的现金流量净额(同比%) */
    @Excel(name = "筹资活动产生的现金流量净额(同比%)")
    private Double netcashFinanceYoy;

    /** 筹资活动产生的现金流量净额(单季度环比%) */
    @Excel(name = "筹资活动产生的现金流量净额(单季度环比%)")
    private Double netcashFinanceQoq;

    /** 汇率变动对现金及现金等价物的影响 */
    @Excel(name = "汇率变动对现金及现金等价物的影响")
    private Double rateChangeEffect;

    /** 汇率变动对现金及现金等价物的影响(同比%) */
    @Excel(name = "汇率变动对现金及现金等价物的影响(同比%)")
    private Double rateChangeEffectYoy;

    /** 汇率变动对现金及现金等价物的影响(单季度环比%) */
    @Excel(name = "汇率变动对现金及现金等价物的影响(单季度环比%)")
    private Double rateChangeEffectQoq;

    /** 现金及现金等价物净增加额其他项目 */
    @Excel(name = "现金及现金等价物净增加额其他项目")
    private Double cceAddOther;

    /** 现金及现金等价物净增加额其他项目(同比%) */
    @Excel(name = "现金及现金等价物净增加额其他项目(同比%)")
    private Double cceAddOtherYoy;

    /** 现金及现金等价物净增加额其他项目(单季度环比%) */
    @Excel(name = "现金及现金等价物净增加额其他项目(单季度环比%)")
    private Double cceAddOtherQoq;

    /** 现金及现金等价物净增加额平衡项目 */
    @Excel(name = "现金及现金等价物净增加额平衡项目")
    private Double cceAddBalance;

    /** 现金及现金等价物净增加额平衡项目(同比%) */
    @Excel(name = "现金及现金等价物净增加额平衡项目(同比%)")
    private Double cceAddBalanceYoy;

    /** 现金及现金等价物净增加额平衡项目(单季度环比%) */
    @Excel(name = "现金及现金等价物净增加额平衡项目(单季度环比%)")
    private Double cceAddBalanceQoq;

    /** 现金及现金等价物净增加额 */
    @Excel(name = "现金及现金等价物净增加额")
    private Double cceAdd;

    /** 现金及现金等价物净增加额(同比%) */
    @Excel(name = "现金及现金等价物净增加额(同比%)")
    private Double cceAddYoy;

    /** 现金及现金等价物净增加额(单季度环比%) */
    @Excel(name = "现金及现金等价物净增加额(单季度环比%)")
    private Double cceAddQoq;

    /** 加:期初现金及现金等价物余额 */
    @Excel(name = "加:期初现金及现金等价物余额")
    private Double beginCce;

    /** 加:期初现金及现金等价物余额(同比%) */
    @Excel(name = "加:期初现金及现金等价物余额(同比%)")
    private Double beginCceYoy;

    /** 加:期初现金及现金等价物余额(单季度环比%) */
    @Excel(name = "加:期初现金及现金等价物余额(单季度环比%)")
    private Double beginCceQoq;

    /** 期末现金及现金等价物余额其他项目 */
    @Excel(name = "期末现金及现金等价物余额其他项目")
    private Double endCceOther;

    /** 期末现金及现金等价物余额其他项目(同比%) */
    @Excel(name = "期末现金及现金等价物余额其他项目(同比%)")
    private Double endCceOtherYoy;

    /** 期末现金及现金等价物余额其他项目(单季度环比%) */
    @Excel(name = "期末现金及现金等价物余额其他项目(单季度环比%)")
    private Double endCceOtherQoq;

    /** 期末现金及现金等价物余额平衡项目 */
    @Excel(name = "期末现金及现金等价物余额平衡项目")
    private Double endCceBalance;

    /** 期末现金及现金等价物余额平衡项目(同比%) */
    @Excel(name = "期末现金及现金等价物余额平衡项目(同比%)")
    private Double endCceBalanceYoy;

    /** 期末现金及现金等价物余额平衡项目(单季度环比%) */
    @Excel(name = "期末现金及现金等价物余额平衡项目(单季度环比%)")
    private Double endCceBalanceQoq;

    /** 期末现金及现金等价物余额 */
    @Excel(name = "期末现金及现金等价物余额")
    private Double endCce;

    /** 期末现金及现金等价物余额(同比%) */
    @Excel(name = "期末现金及现金等价物余额(同比%)")
    private Double endCceYoy;

    /** 期末现金及现金等价物余额(单季度环比%) */
    @Excel(name = "期末现金及现金等价物余额(单季度环比%)")
    private Double endCceQoq;

    /** 净利润 */
    @Excel(name = "净利润")
    private Double netprofit;

    /** 净利润(同比%) */
    @Excel(name = "净利润(同比%)")
    private Double netprofitYoy;

    /** 净利润(单季度环比%) */
    @Excel(name = "净利润(单季度环比%)")
    private Double netprofitQoq;

    /** 少数股东损益 */
    @Excel(name = "少数股东损益")
    private Double minorityInterest;

    /** 少数股东损益(同比%) */
    @Excel(name = "少数股东损益(同比%)")
    private Double minorityInterestYoy;

    /** 少数股东损益(单季度环比%) */
    @Excel(name = "少数股东损益(单季度环比%)")
    private Double minorityInterestQoq;

    /** 其中:分得股利或利润所收到的现金 */
    @Excel(name = "其中:分得股利或利润所收到的现金")
    private Double receiveDividendProfit;

    /** 其中:分得股利或利润所收到的现金(同比%) */
    @Excel(name = "其中:分得股利或利润所收到的现金(同比%)")
    private Double receiveDividendProfitYoy;

    /** 其中:分得股利或利润所收到的现金(单季度环比%) */
    @Excel(name = "其中:分得股利或利润所收到的现金(单季度环比%)")
    private Double receiveDividendProfitQoq;

    /** 资产减值准备 */
    @Excel(name = "资产减值准备")
    private Double assetImpairment;

    /** 资产减值准备(同比%) */
    @Excel(name = "资产减值准备(同比%)")
    private Double assetImpairmentYoy;

    /** 资产减值准备(单季度环比%) */
    @Excel(name = "资产减值准备(单季度环比%)")
    private Double assetImpairmentQoq;

    /** 固定资产和投资性房地产折旧 */
    @Excel(name = "固定资产和投资性房地产折旧")
    private Double faIrDepr;

    /** 固定资产和投资性房地产折旧(同比%) */
    @Excel(name = "固定资产和投资性房地产折旧(同比%)")
    private Double faIrDeprYoy;

    /** 固定资产和投资性房地产折旧(单季度环比%) */
    @Excel(name = "固定资产和投资性房地产折旧(单季度环比%)")
    private Double faIrDeprQoq;

    /** 处置子公司、联营企业及合营企业投资及其他企业收到的现金 */
    @Excel(name = "处置子公司、联营企业及合营企业投资及其他企业收到的现金")
    private Double disposalSubsidiaryJoint;

    /** 处置子公司、联营企业及合营企业投资及其他企业收到的现金(同比%) */
    @Excel(name = "处置子公司、联营企业及合营企业投资及其他企业收到的现金(同比%)")
    private Double disposalSubsidiaryJointYoy;

    /** 处置子公司、联营企业及合营企业投资及其他企业收到的现金(单季度环比%) */
    @Excel(name = "处置子公司、联营企业及合营企业投资及其他企业收到的现金(单季度环比%)")
    private Double disposalSubsidiaryJointQoq;

    /** 其中:固定资产折旧、油气资产折耗、生产性生物资产折旧 */
    @Excel(name = "其中:固定资产折旧、油气资产折耗、生产性生物资产折旧")
    private Double oilgasBiologyDepr;

    /** 其中:固定资产折旧、油气资产折耗、生产性生物资产折旧(同比%) */
    @Excel(name = "其中:固定资产折旧、油气资产折耗、生产性生物资产折旧(同比%)")
    private Double oilgasBiologyDeprYoy;

    /** 其中:固定资产折旧、油气资产折耗、生产性生物资产折旧(单季度环比%) */
    @Excel(name = "其中:固定资产折旧、油气资产折耗、生产性生物资产折旧(单季度环比%)")
    private Double oilgasBiologyDeprQoq;

    /** 投资性房地产折旧 */
    @Excel(name = "投资性房地产折旧")
    private Double irDepr;

    /** 投资性房地产折旧(同比%) */
    @Excel(name = "投资性房地产折旧(同比%)")
    private Double irDeprYoy;

    /** 投资性房地产折旧(单季度环比%) */
    @Excel(name = "投资性房地产折旧(单季度环比%)")
    private Double irDeprQoq;

    /** 无形资产摊销 */
    @Excel(name = "无形资产摊销")
    private Double iaAmortize;

    /** 无形资产摊销(同比%) */
    @Excel(name = "无形资产摊销(同比%)")
    private Double iaAmortizeYoy;

    /** 无形资产摊销(单季度环比%) */
    @Excel(name = "无形资产摊销(单季度环比%)")
    private Double iaAmortizeQoq;

    /** 长期待摊费用摊销 */
    @Excel(name = "长期待摊费用摊销")
    private Double lpeAmortize;

    /** 长期待摊费用摊销(同比%) */
    @Excel(name = "长期待摊费用摊销(同比%)")
    private Double lpeAmortizeYoy;

    /** 长期待摊费用摊销(单季度环比%) */
    @Excel(name = "长期待摊费用摊销(单季度环比%)")
    private Double lpeAmortizeQoq;

    /** 递延收益摊销 */
    @Excel(name = "递延收益摊销")
    private Double deferIncomeAmortize;

    /** 递延收益摊销(同比%) */
    @Excel(name = "递延收益摊销(同比%)")
    private Double deferIncomeAmortizeYoy;

    /** 递延收益摊销(单季度环比%) */
    @Excel(name = "递延收益摊销(单季度环比%)")
    private Double deferIncomeAmortizeQoq;

    /** 待摊费用的减少 */
    @Excel(name = "待摊费用的减少")
    private Double prepaidExpenseReduce;

    /** 待摊费用的减少(同比%) */
    @Excel(name = "待摊费用的减少(同比%)")
    private Double prepaidExpenseReduceYoy;

    /** 待摊费用的减少(单季度环比%) */
    @Excel(name = "待摊费用的减少(单季度环比%)")
    private Double prepaidExpenseReduceQoq;

    /** 预提费用的增加 */
    @Excel(name = "预提费用的增加")
    private Double accruedExpenseAdd;

    /** 预提费用的增加(同比%) */
    @Excel(name = "预提费用的增加(同比%)")
    private Double accruedExpenseAddYoy;

    /** 预提费用的增加(单季度环比%) */
    @Excel(name = "预提费用的增加(单季度环比%)")
    private Double accruedExpenseAddQoq;

    /** 处置固定资产、无形资产和其他长期资产的损失 */
    @Excel(name = "处置固定资产、无形资产和其他长期资产的损失")
    private Double disposalLongassetLoss;

    /** 处置固定资产、无形资产和其他长期资产的损失(同比%) */
    @Excel(name = "处置固定资产、无形资产和其他长期资产的损失(同比%)")
    private Double disposalLongassetLossYoy;

    /** 处置固定资产、无形资产和其他长期资产的损失(单季度环比%) */
    @Excel(name = "处置固定资产、无形资产和其他长期资产的损失(单季度环比%)")
    private Double disposalLongassetLossQoq;

    /** 固定资产报废损失 */
    @Excel(name = "固定资产报废损失")
    private Double faScrapLoss;

    /** 固定资产报废损失(同比%) */
    @Excel(name = "固定资产报废损失(同比%)")
    private Double faScrapLossYoy;

    /** 固定资产报废损失(单季度环比%) */
    @Excel(name = "固定资产报废损失(单季度环比%)")
    private Double faScrapLossQoq;

    /** 公允价值变动损失 */
    @Excel(name = "公允价值变动损失")
    private Double fairvalueChangeLoss;

    /** 公允价值变动损失(同比%) */
    @Excel(name = "公允价值变动损失(同比%)")
    private Double fairvalueChangeLossYoy;

    /** 公允价值变动损失(单季度环比%) */
    @Excel(name = "公允价值变动损失(单季度环比%)")
    private Double fairvalueChangeLossQoq;

    /** 财务费用 */
    @Excel(name = "财务费用")
    private Double financeExpense;

    /** 财务费用(同比%) */
    @Excel(name = "财务费用(同比%)")
    private Double financeExpenseYoy;

    /** 财务费用(单季度环比%) */
    @Excel(name = "财务费用(单季度环比%)")
    private Double financeExpenseQoq;

    /** 投资损失 */
    @Excel(name = "投资损失")
    private Double investLoss;

    /** 投资损失(同比%) */
    @Excel(name = "投资损失(同比%)")
    private Double investLossYoy;

    /** 投资损失(单季度环比%) */
    @Excel(name = "投资损失(单季度环比%)")
    private Double investLossQoq;

    /** 递延所得税 */
    @Excel(name = "递延所得税")
    private Double deferTax;

    /** 递延所得税(同比%) */
    @Excel(name = "递延所得税(同比%)")
    private Double deferTaxYoy;

    /** 递延所得税(单季度环比%) */
    @Excel(name = "递延所得税(单季度环比%)")
    private Double deferTaxQoq;

    /** 发行次级债券所收到的现金 */
    @Excel(name = "发行次级债券所收到的现金")
    private Double issueSubbond;

    /** 发行次级债券所收到的现金(同比%) */
    @Excel(name = "发行次级债券所收到的现金(同比%)")
    private Double issueSubbondYoy;

    /** 发行次级债券所收到的现金(单季度环比%) */
    @Excel(name = "发行次级债券所收到的现金(单季度环比%)")
    private Double issueSubbondQoq;

    /** 其中:递延所得税资产减少 */
    @Excel(name = "其中:递延所得税资产减少")
    private Double dtAssetReduce;

    /** 其中:递延所得税资产减少(同比%) */
    @Excel(name = "其中:递延所得税资产减少(同比%)")
    private Double dtAssetReduceYoy;

    /** 其中:递延所得税资产减少(单季度环比%) */
    @Excel(name = "其中:递延所得税资产减少(单季度环比%)")
    private Double dtAssetReduceQoq;

    /** 发行其他债券所收到的现金 */
    @Excel(name = "发行其他债券所收到的现金")
    private Double issueOtherBond;

    /** 发行其他债券所收到的现金(同比%) */
    @Excel(name = "发行其他债券所收到的现金(同比%)")
    private Double issueOtherBondYoy;

    /** 发行其他债券所收到的现金(单季度环比%) */
    @Excel(name = "发行其他债券所收到的现金(单季度环比%)")
    private Double issueOtherBondQoq;

    /** 递延所得税负债增加 */
    @Excel(name = "递延所得税负债增加")
    private Double dtLiabAdd;

    /** 递延所得税负债增加(同比%) */
    @Excel(name = "递延所得税负债增加(同比%)")
    private Double dtLiabAddYoy;

    /** 递延所得税负债增加(单季度环比%) */
    @Excel(name = "递延所得税负债增加(单季度环比%)")
    private Double dtLiabAddQoq;

    /** 预计负债的增加 */
    @Excel(name = "预计负债的增加")
    private Double predictLiabAdd;

    /** 预计负债的增加(同比%) */
    @Excel(name = "预计负债的增加(同比%)")
    private Double predictLiabAddYoy;

    /** 预计负债的增加(单季度环比%) */
    @Excel(name = "预计负债的增加(单季度环比%)")
    private Double predictLiabAddQoq;

    /** 存货的减少 */
    @Excel(name = "存货的减少")
    private Double inventoryReduce;

    /** 存货的减少(同比%) */
    @Excel(name = "存货的减少(同比%)")
    private Double inventoryReduceYoy;

    /** 存货的减少(单季度环比%) */
    @Excel(name = "存货的减少(单季度环比%)")
    private Double inventoryReduceQoq;

    /** 经营性应收项目的减少 */
    @Excel(name = "经营性应收项目的减少")
    private Double operateReceReduce;

    /** 经营性应收项目的减少(同比%) */
    @Excel(name = "经营性应收项目的减少(同比%)")
    private Double operateReceReduceYoy;

    /** 经营性应收项目的减少(单季度环比%) */
    @Excel(name = "经营性应收项目的减少(单季度环比%)")
    private Double operateReceReduceQoq;

    /** 发行存款证 */
    @Excel(name = "发行存款证")
    private Double issueCd;

    /** 发行存款证(同比%) */
    @Excel(name = "发行存款证(同比%)")
    private Double issueCdYoy;

    /** 发行存款证(单季度环比%) */
    @Excel(name = "发行存款证(单季度环比%)")
    private Double issueCdQoq;

    /** 经营性应付项目的增加 */
    @Excel(name = "经营性应付项目的增加")
    private Double operatePayableAdd;

    /** 经营性应付项目的增加(同比%) */
    @Excel(name = "经营性应付项目的增加(同比%)")
    private Double operatePayableAddYoy;

    /** 经营性应付项目的增加(单季度环比%) */
    @Excel(name = "经营性应付项目的增加(单季度环比%)")
    private Double operatePayableAddQoq;

    /** 增加股本所收到的现金 */
    @Excel(name = "增加股本所收到的现金")
    private Double receiveAddEquity;

    /** 增加股本所收到的现金(同比%) */
    @Excel(name = "增加股本所收到的现金(同比%)")
    private Double receiveAddEquityYoy;

    /** 增加股本所收到的现金(单季度环比%) */
    @Excel(name = "增加股本所收到的现金(单季度环比%)")
    private Double receiveAddEquityQoq;

    /** 其他 */
    @Excel(name = "其他")
    private Double other;

    /** 其他(同比%) */
    @Excel(name = "其他(同比%)")
    private Double otherYoy;

    /** 其他(单季度环比%) */
    @Excel(name = "其他(单季度环比%)")
    private Double otherQoq;

    /** 经营活动产生的现金流量净额其他项目 */
    @Excel(name = "经营活动产生的现金流量净额其他项目")
    private Double operateNetcashOthernote;

    /** 经营活动产生的现金流量净额其他项目(同比%) */
    @Excel(name = "经营活动产生的现金流量净额其他项目(同比%)")
    private Double operateNetcashOthernoteYoy;

    /** 经营活动产生的现金流量净额其他项目(单季度环比%) */
    @Excel(name = "经营活动产生的现金流量净额其他项目(单季度环比%)")
    private Double operateNetcashOthernoteQoq;

    /** 经营活动产生的现金流量净额平衡项目 */
    @Excel(name = "经营活动产生的现金流量净额平衡项目")
    private Double operateNetcashBalancenote;

    /** 经营活动产生的现金流量净额平衡项目(同比%) */
    @Excel(name = "经营活动产生的现金流量净额平衡项目(同比%)")
    private Double operateNetcashBalancenoteYoy;

    /** 经营活动产生的现金流量净额平衡项目(单季度环比%) */
    @Excel(name = "经营活动产生的现金流量净额平衡项目(单季度环比%)")
    private Double operateNetcashBalancenoteQoq;

    /** 经营活动产生的现金流量净额 */
    @Excel(name = "经营活动产生的现金流量净额")
    private Double netcashOperatenote;

    /** 经营活动产生的现金流量净额(同比%) */
    @Excel(name = "经营活动产生的现金流量净额(同比%)")
    private Double netcashOperatenoteYoy;

    /** 经营活动产生的现金流量净额(单季度环比%) */
    @Excel(name = "经营活动产生的现金流量净额(单季度环比%)")
    private Double netcashOperatenoteQoq;

    /** 债务转为资本 */
    @Excel(name = "债务转为资本")
    private Double debtTransferCapital;

    /** 债务转为资本(同比%) */
    @Excel(name = "债务转为资本(同比%)")
    private Double debtTransferCapitalYoy;

    /** 债务转为资本(单季度环比%) */
    @Excel(name = "债务转为资本(单季度环比%)")
    private Double debtTransferCapitalQoq;

    /** 偿付债券利息支付的现金 */
    @Excel(name = "偿付债券利息支付的现金")
    private Double payBondInterest;

    /** 偿付债券利息支付的现金(同比%) */
    @Excel(name = "偿付债券利息支付的现金(同比%)")
    private Double payBondInterestYoy;

    /** 偿付债券利息支付的现金(单季度环比%) */
    @Excel(name = "偿付债券利息支付的现金(单季度环比%)")
    private Double payBondInterestQoq;

    /** 一年内到期的可转换公司债券 */
    @Excel(name = "一年内到期的可转换公司债券")
    private Double convertBond1year;

    /** 一年内到期的可转换公司债券(同比%) */
    @Excel(name = "一年内到期的可转换公司债券(同比%)")
    private Double convertBond1yearYoy;

    /** 一年内到期的可转换公司债券(单季度环比%) */
    @Excel(name = "一年内到期的可转换公司债券(单季度环比%)")
    private Double convertBond1yearQoq;

    /** 股份发行支付的费用 */
    @Excel(name = "股份发行支付的费用")
    private Double issueSharesExpense;

    /** 股份发行支付的费用(同比%) */
    @Excel(name = "股份发行支付的费用(同比%)")
    private Double issueSharesExpenseYoy;

    /** 股份发行支付的费用(单季度环比%) */
    @Excel(name = "股份发行支付的费用(单季度环比%)")
    private Double issueSharesExpenseQoq;

    /** 融资租入固定资产 */
    @Excel(name = "融资租入固定资产")
    private Double finleaseObtainFa;

    /** 融资租入固定资产(同比%) */
    @Excel(name = "融资租入固定资产(同比%)")
    private Double finleaseObtainFaYoy;

    /** 融资租入固定资产(单季度环比%) */
    @Excel(name = "融资租入固定资产(单季度环比%)")
    private Double finleaseObtainFaQoq;

    /** 不涉及现金收支的投资和筹资活动金额其他项目 */
    @Excel(name = "不涉及现金收支的投资和筹资活动金额其他项目")
    private Double uninvolveInvestfinOther;

    /** 不涉及现金收支的投资和筹资活动金额其他项目(同比%) */
    @Excel(name = "不涉及现金收支的投资和筹资活动金额其他项目(同比%)")
    private Double uninvolveInvestfinOtherYoy;

    /** 不涉及现金收支的投资和筹资活动金额其他项目(单季度环比%) */
    @Excel(name = "不涉及现金收支的投资和筹资活动金额其他项目(单季度环比%)")
    private Double uninvolveInvestfinOtherQoq;

    /** 现金的期末余额 */
    @Excel(name = "现金的期末余额")
    private Double endCash;

    /** 现金的期末余额(同比%) */
    @Excel(name = "现金的期末余额(同比%)")
    private Double endCashYoy;

    /** 现金的期末余额(单季度环比%) */
    @Excel(name = "现金的期末余额(单季度环比%)")
    private Double endCashQoq;

    /** 减:现金的期初余额 */
    @Excel(name = "减:现金的期初余额")
    private Double beginCash;

    /** 减:现金的期初余额(同比%) */
    @Excel(name = "减:现金的期初余额(同比%)")
    private Double beginCashYoy;

    /** 减:现金的期初余额(单季度环比%) */
    @Excel(name = "减:现金的期初余额(单季度环比%)")
    private Double beginCashQoq;

    /** 加:现金等价物的期末余额 */
    @Excel(name = "加:现金等价物的期末余额")
    private Double endCashEquivalents;

    /** 加:现金等价物的期末余额(同比%) */
    @Excel(name = "加:现金等价物的期末余额(同比%)")
    private Double endCashEquivalentsYoy;

    /** 加:现金等价物的期末余额(单季度环比%) */
    @Excel(name = "加:现金等价物的期末余额(单季度环比%)")
    private Double endCashEquivalentsQoq;

    /** 减:现金等价物的期初余额 */
    @Excel(name = "减:现金等价物的期初余额")
    private Double beginCashEquivalents;

    /** 减:现金等价物的期初余额(同比%) */
    @Excel(name = "减:现金等价物的期初余额(同比%)")
    private Double beginCashEquivalentsYoy;

    /** 减:现金等价物的期初余额(单季度环比%) */
    @Excel(name = "减:现金等价物的期初余额(单季度环比%)")
    private Double beginCashEquivalentsQoq;

    /** 现金及现金等价物净增加额其他项目 */
    @Excel(name = "现金及现金等价物净增加额其他项目")
    private Double cceAddOthernote;

    /** 现金及现金等价物净增加额其他项目(同比%) */
    @Excel(name = "现金及现金等价物净增加额其他项目(同比%)")
    private Double cceAddOthernoteYoy;

    /** 现金及现金等价物净增加额其他项目(单季度环比%) */
    @Excel(name = "现金及现金等价物净增加额其他项目(单季度环比%)")
    private Double cceAddOthernoteQoq;

    /** 现金及现金等价物净增加额平衡项目 */
    @Excel(name = "现金及现金等价物净增加额平衡项目")
    private Double cceAddBalancenote;

    /** 现金及现金等价物净增加额平衡项目(同比%) */
    @Excel(name = "现金及现金等价物净增加额平衡项目(同比%)")
    private Double cceAddBalancenoteYoy;

    /** 现金及现金等价物净增加额平衡项目(单季度环比%) */
    @Excel(name = "现金及现金等价物净增加额平衡项目(单季度环比%)")
    private Double cceAddBalancenoteQoq;

    /** 现金及现金等价物的净增加额 */
    @Excel(name = "现金及现金等价物的净增加额")
    private Double cceAddnote;

    /** 现金及现金等价物的净增加额(同比%) */
    @Excel(name = "现金及现金等价物的净增加额(同比%)")
    private Double cceAddnoteYoy;

    /** 现金及现金等价物的净增加额(单季度环比%) */
    @Excel(name = "现金及现金等价物的净增加额(单季度环比%)")
    private Double cceAddnoteQoq;

    /** 计提投资减值准备 */
    @Excel(name = "计提投资减值准备")
    private Double provisionInvestImpairment;

    /** 计提投资减值准备(同比%) */
    @Excel(name = "计提投资减值准备(同比%)")
    private Double provisionInvestImpairmentYoy;

    /** 计提投资减值准备(单季度环比%) */
    @Excel(name = "计提投资减值准备(单季度环比%)")
    private Double provisionInvestImpairmentQoq;

    /** 转回投资减值准备 */
    @Excel(name = "转回投资减值准备")
    private Double transferInvestImpairment;

    /** 转回投资减值准备(同比%) */
    @Excel(name = "转回投资减值准备(同比%)")
    private Double transferInvestImpairmentYoy;

    /** 转回投资减值准备(单季度环比%) */
    @Excel(name = "转回投资减值准备(单季度环比%)")
    private Double transferInvestImpairmentQoq;

    /** 计提贷款减值准备 */
    @Excel(name = "计提贷款减值准备")
    private Double provisionLoanImpairment;

    /** 计提贷款减值准备(同比%) */
    @Excel(name = "计提贷款减值准备(同比%)")
    private Double provisionLoanImpairmentYoy;

    /** 计提贷款减值准备(单季度环比%) */
    @Excel(name = "计提贷款减值准备(单季度环比%)")
    private Double provisionLoanImpairmentQoq;

    /** 计提其他资产减值准备 */
    @Excel(name = "计提其他资产减值准备")
    private Double otherAssetImpairment;

    /** 计提其他资产减值准备(同比%) */
    @Excel(name = "计提其他资产减值准备(同比%)")
    private Double otherAssetImpairmentYoy;

    /** 计提其他资产减值准备(单季度环比%) */
    @Excel(name = "计提其他资产减值准备(单季度环比%)")
    private Double otherAssetImpairmentQoq;

    /** 计提预计负债 */
    @Excel(name = "计提预计负债")
    private Double provisionPredictLiab;

    /** 计提预计负债(同比%) */
    @Excel(name = "计提预计负债(同比%)")
    private Double provisionPredictLiabYoy;

    /** 计提预计负债(单季度环比%) */
    @Excel(name = "计提预计负债(单季度环比%)")
    private Double provisionPredictLiabQoq;

    /** 固定资产折旧 */
    @Excel(name = "固定资产折旧")
    private Double fixedAssetDepr;

    /** 固定资产折旧(同比%) */
    @Excel(name = "固定资产折旧(同比%)")
    private Double fixedAssetDeprYoy;

    /** 固定资产折旧(单季度环比%) */
    @Excel(name = "固定资产折旧(单季度环比%)")
    private Double fixedAssetDeprQoq;

    /** 无形资产及长期待摊费用等摊销 */
    @Excel(name = "无形资产及长期待摊费用等摊销")
    private Double iaLpeAmortize;

    /** 无形资产及长期待摊费用等摊销(同比%) */
    @Excel(name = "无形资产及长期待摊费用等摊销(同比%)")
    private Double iaLpeAmortizeYoy;

    /** 无形资产及长期待摊费用等摊销(单季度环比%) */
    @Excel(name = "无形资产及长期待摊费用等摊销(单季度环比%)")
    private Double iaLpeAmortizeQoq;

    /** 长期资产摊销 */
    @Excel(name = "长期资产摊销")
    private Double longassetAmortize;

    /** 长期资产摊销(同比%) */
    @Excel(name = "长期资产摊销(同比%)")
    private Double longassetAmortizeYoy;

    /** 长期资产摊销(单季度环比%) */
    @Excel(name = "长期资产摊销(单季度环比%)")
    private Double longassetAmortizeQoq;

    /** 收到已核销款项 */
    @Excel(name = "收到已核销款项")
    private Double receiveWriteoff;

    /** 收到已核销款项(同比%) */
    @Excel(name = "收到已核销款项(同比%)")
    private Double receiveWriteoffYoy;

    /** 收到已核销款项(单季度环比%) */
    @Excel(name = "收到已核销款项(单季度环比%)")
    private Double receiveWriteoffQoq;

    /** 汇兑损失 */
    @Excel(name = "汇兑损失")
    private Double exchangeLoss;

    /** 汇兑损失(同比%) */
    @Excel(name = "汇兑损失(同比%)")
    private Double exchangeLossYoy;

    /** 汇兑损失(单季度环比%) */
    @Excel(name = "汇兑损失(单季度环比%)")
    private Double exchangeLossQoq;

    /** 发行债券利息支出 */
    @Excel(name = "发行债券利息支出")
    private Double bondInterestExpense;

    /** 发行债券利息支出(同比%) */
    @Excel(name = "发行债券利息支出(同比%)")
    private Double bondInterestExpenseYoy;

    /** 发行债券利息支出(单季度环比%) */
    @Excel(name = "发行债券利息支出(单季度环比%)")
    private Double bondInterestExpenseQoq;

    /** 贷款的减少 */
    @Excel(name = "贷款的减少")
    private Double loanReduce;

    /** 贷款的减少(同比%) */
    @Excel(name = "贷款的减少(同比%)")
    private Double loanReduceYoy;

    /** 贷款的减少(单季度环比%) */
    @Excel(name = "贷款的减少(单季度环比%)")
    private Double loanReduceQoq;

    /** 存款的增加 */
    @Excel(name = "存款的增加")
    private Double depositAdd;

    /** 存款的增加(同比%) */
    @Excel(name = "存款的增加(同比%)")
    private Double depositAddYoy;

    /** 存款的增加(单季度环比%) */
    @Excel(name = "存款的增加(单季度环比%)")
    private Double depositAddQoq;

    /** 拆借款项的净增加 */
    @Excel(name = "拆借款项的净增加")
    private Double lendAdd;

    /** 拆借款项的净增加(同比%) */
    @Excel(name = "拆借款项的净增加(同比%)")
    private Double lendAddYoy;

    /** 拆借款项的净增加(单季度环比%) */
    @Excel(name = "拆借款项的净增加(单季度环比%)")
    private Double lendAddQoq;

    /** 金融性资产的减少 */
    @Excel(name = "金融性资产的减少")
    private Double finassetReduce;

    /** 金融性资产的减少(同比%) */
    @Excel(name = "金融性资产的减少(同比%)")
    private Double finassetReduceYoy;

    /** 金融性资产的减少(单季度环比%) */
    @Excel(name = "金融性资产的减少(单季度环比%)")
    private Double finassetReduceQoq;

    /** 金融性负债的增加 */
    @Excel(name = "金融性负债的增加")
    private Double finliabAdd;

    /** 金融性负债的增加(同比%) */
    @Excel(name = "金融性负债的增加(同比%)")
    private Double finliabAddYoy;

    /** 金融性负债的增加(单季度环比%) */
    @Excel(name = "金融性负债的增加(单季度环比%)")
    private Double finliabAddQoq;

    /** 经营活动产生的现金流量净额其他项目 */
    @Excel(name = "经营活动产生的现金流量净额其他项目")
    private Double fboperateNetcashOther;

    /** 经营活动产生的现金流量净额其他项目(同比%) */
    @Excel(name = "经营活动产生的现金流量净额其他项目(同比%)")
    private Double fboperateNetcashOtherYoy;

    /** 经营活动产生的现金流量净额其他项目(单季度环比%) */
    @Excel(name = "经营活动产生的现金流量净额其他项目(单季度环比%)")
    private Double fboperateNetcashOtherQoq;

    /** 经营活动产生的现金流量净额平衡项目 */
    @Excel(name = "经营活动产生的现金流量净额平衡项目")
    private Double fboperateNetcashBalance;

    /** 经营活动产生的现金流量净额平衡项目(同比%) */
    @Excel(name = "经营活动产生的现金流量净额平衡项目(同比%)")
    private Double fboperateNetcashBalanceYoy;

    /** 经营活动产生的现金流量净额平衡项目(单季度环比%) */
    @Excel(name = "经营活动产生的现金流量净额平衡项目(单季度环比%)")
    private Double fboperateNetcashBalanceQoq;

    /** 经营活动产生的现金流量净额 */
    @Excel(name = "经营活动产生的现金流量净额")
    private Double fbnetcashOperate;

    /** 经营活动产生的现金流量净额(同比%) */
    @Excel(name = "经营活动产生的现金流量净额(同比%)")
    private Double fbnetcashOperateYoy;

    /** 经营活动产生的现金流量净额(单季度环比%) */
    @Excel(name = "经营活动产生的现金流量净额(单季度环比%)")
    private Double fbnetcashOperateQoq;

    /** 现金及现金等价物净增加额其他项目 */
    @Excel(name = "现金及现金等价物净增加额其他项目")
    private Double fbcceAddOther;

    /** 现金及现金等价物净增加额其他项目(同比%) */
    @Excel(name = "现金及现金等价物净增加额其他项目(同比%)")
    private Double fbcceAddOtherYoy;

    /** 现金及现金等价物净增加额其他项目(单季度环比%) */
    @Excel(name = "现金及现金等价物净增加额其他项目(单季度环比%)")
    private Double fbcceAddOtherQoq;

    /** 现金及现金等价物净增加额平衡项目 */
    @Excel(name = "现金及现金等价物净增加额平衡项目")
    private Double fbcceAddBalance;

    /** 现金及现金等价物净增加额平衡项目(同比%) */
    @Excel(name = "现金及现金等价物净增加额平衡项目(同比%)")
    private Double fbcceAddBalanceYoy;

    /** 现金及现金等价物净增加额平衡项目(单季度环比%) */
    @Excel(name = "现金及现金等价物净增加额平衡项目(单季度环比%)")
    private Double fbcceAddBalanceQoq;

    /** 现金及现金等价物的净增加额 */
    @Excel(name = "现金及现金等价物的净增加额")
    private Double fbcceAdd;

    /** 现金及现金等价物的净增加额(同比%) */
    @Excel(name = "现金及现金等价物的净增加额(同比%)")
    private Double fbcceAddYoy;

    /** 现金及现金等价物的净增加额(单季度环比%) */
    @Excel(name = "现金及现金等价物的净增加额(单季度环比%)")
    private Double fbcceAddQoq;

    /** 购买、处置或发行其他金融工具净增加额 */
    @Excel(name = "购买、处置或发行其他金融工具净增加额")
    private Double otherfintoolAdd;

    /** 购买、处置或发行其他金融工具净增加额(同比%) */
    @Excel(name = "购买、处置或发行其他金融工具净增加额(同比%)")
    private Double otherfintoolAddYoy;

    /** 购买、处置或发行其他金融工具净增加额(单季度环比%) */
    @Excel(name = "购买、处置或发行其他金融工具净增加额(单季度环比%)")
    private Double otherfintoolAddQoq;

    /** 承销证券收到的现金净额 */
    @Excel(name = "承销证券收到的现金净额")
    private Double underwriteSecurity;

    /** 承销证券收到的现金净额(同比%) */
    @Excel(name = "承销证券收到的现金净额(同比%)")
    private Double underwriteSecurityYoy;

    /** 承销证券收到的现金净额(单季度环比%) */
    @Excel(name = "承销证券收到的现金净额(单季度环比%)")
    private Double underwriteSecurityQoq;

    /** 代理买卖证券收到的现金净额 */
    @Excel(name = "代理买卖证券收到的现金净额")
    private Double receiveAgentTrade;

    /** 代理买卖证券收到的现金净额(同比%) */
    @Excel(name = "代理买卖证券收到的现金净额(同比%)")
    private Double receiveAgentTradeYoy;

    /** 代理买卖证券收到的现金净额(单季度环比%) */
    @Excel(name = "代理买卖证券收到的现金净额(单季度环比%)")
    private Double receiveAgentTradeQoq;

    /** 买入返售金融资产收到的现金 */
    @Excel(name = "买入返售金融资产收到的现金")
    private Double receiveBuyResale;

    /** 买入返售金融资产收到的现金(同比%) */
    @Excel(name = "买入返售金融资产收到的现金(同比%)")
    private Double receiveBuyResaleYoy;

    /** 买入返售金融资产收到的现金(单季度环比%) */
    @Excel(name = "买入返售金融资产收到的现金(单季度环比%)")
    private Double receiveBuyResaleQoq;

    /** 代理承销证券收到的现金净额 */
    @Excel(name = "代理承销证券收到的现金净额")
    private Double receiveAgentUnderwrite;

    /** 代理承销证券收到的现金净额(同比%) */
    @Excel(name = "代理承销证券收到的现金净额(同比%)")
    private Double receiveAgentUnderwriteYoy;

    /** 代理承销证券收到的现金净额(单季度环比%) */
    @Excel(name = "代理承销证券收到的现金净额(单季度环比%)")
    private Double receiveAgentUnderwriteQoq;

    /** 客户交易结算资金增加 */
    @Excel(name = "客户交易结算资金增加")
    private Double tradeSettleAdd;

    /** 客户交易结算资金增加(同比%) */
    @Excel(name = "客户交易结算资金增加(同比%)")
    private Double tradeSettleAddYoy;

    /** 客户交易结算资金增加(单季度环比%) */
    @Excel(name = "客户交易结算资金增加(单季度环比%)")
    private Double tradeSettleAddQoq;

    /** 直接投资经营资金增加 */
    @Excel(name = "直接投资经营资金增加")
    private Double directInvestAdd;

    /** 直接投资经营资金增加(同比%) */
    @Excel(name = "直接投资经营资金增加(同比%)")
    private Double directInvestAddYoy;

    /** 直接投资经营资金增加(单季度环比%) */
    @Excel(name = "直接投资经营资金增加(单季度环比%)")
    private Double directInvestAddQoq;

    /** 买入返售金融资产支付的现金净额 */
    @Excel(name = "买入返售金融资产支付的现金净额")
    private Double payBuyResale;

    /** 买入返售金融资产支付的现金净额(同比%) */
    @Excel(name = "买入返售金融资产支付的现金净额(同比%)")
    private Double payBuyResaleYoy;

    /** 买入返售金融资产支付的现金净额(单季度环比%) */
    @Excel(name = "买入返售金融资产支付的现金净额(单季度环比%)")
    private Double payBuyResaleQoq;

    /** 处置交易性金融资产的净减少额 */
    @Excel(name = "处置交易性金融资产的净减少额")
    private Double disposalTfaReduce;

    /** 处置交易性金融资产的净减少额(同比%) */
    @Excel(name = "处置交易性金融资产的净减少额(同比%)")
    private Double disposalTfaReduceYoy;

    /** 处置交易性金融资产的净减少额(单季度环比%) */
    @Excel(name = "处置交易性金融资产的净减少额(单季度环比%)")
    private Double disposalTfaReduceQoq;

    /** 购买、处置或发行其他金融工具净减少额 */
    @Excel(name = "购买、处置或发行其他金融工具净减少额")
    private Double otherfintoolReduce;

    /** 购买、处置或发行其他金融工具净减少额(同比%) */
    @Excel(name = "购买、处置或发行其他金融工具净减少额(同比%)")
    private Double otherfintoolReduceYoy;

    /** 购买、处置或发行其他金融工具净减少额(单季度环比%) */
    @Excel(name = "购买、处置或发行其他金融工具净减少额(单季度环比%)")
    private Double otherfintoolReduceQoq;

    /** 客户交易结算资金减少 */
    @Excel(name = "客户交易结算资金减少")
    private Double tradeSettleReduce;

    /** 客户交易结算资金减少(同比%) */
    @Excel(name = "客户交易结算资金减少(同比%)")
    private Double tradeSettleReduceYoy;

    /** 客户交易结算资金减少(单季度环比%) */
    @Excel(name = "客户交易结算资金减少(单季度环比%)")
    private Double tradeSettleReduceQoq;

    /** 直接投资经营资金减少 */
    @Excel(name = "直接投资经营资金减少")
    private Double directInvestReduce;

    /** 直接投资经营资金减少(同比%) */
    @Excel(name = "直接投资经营资金减少(同比%)")
    private Double directInvestReduceYoy;

    /** 直接投资经营资金减少(单季度环比%) */
    @Excel(name = "直接投资经营资金减少(单季度环比%)")
    private Double directInvestReduceQoq;

    /** 回购业务资金净减少额 */
    @Excel(name = "回购业务资金净减少额")
    private Double repoBusinessReduce;

    /** 回购业务资金净减少额(同比%) */
    @Excel(name = "回购业务资金净减少额(同比%)")
    private Double repoBusinessReduceYoy;

    /** 回购业务资金净减少额(单季度环比%) */
    @Excel(name = "回购业务资金净减少额(单季度环比%)")
    private Double repoBusinessReduceQoq;

    /** 代理买卖证券支付的现金净额（净减少额） */
    @Excel(name = "代理买卖证券支付的现金净额", readConverterExp = "净=减少额")
    private Double payAgentTrade;

    /** 代理买卖证券支付的现金净额（净减少额）(同比%) */
    @Excel(name = "代理买卖证券支付的现金净额", readConverterExp = "净=减少额")
    private Double payAgentTradeYoy;

    /** 代理买卖证券支付的现金净额（净减少额）(单季度环比%) */
    @Excel(name = "代理买卖证券支付的现金净额", readConverterExp = "净=减少额")
    private Double payAgentTradeQoq;

    /** 处置可供出售金融资产净增加额 */
    @Excel(name = "处置可供出售金融资产净增加额")
    private Double disposalAfaAdd;

    /** 处置可供出售金融资产净增加额(同比%) */
    @Excel(name = "处置可供出售金融资产净增加额(同比%)")
    private Double disposalAfaAddYoy;

    /** 处置可供出售金融资产净增加额(单季度环比%) */
    @Excel(name = "处置可供出售金融资产净增加额(单季度环比%)")
    private Double disposalAfaAddQoq;

    /** 处置可供出售金融资产净减少额 */
    @Excel(name = "处置可供出售金融资产净减少额")
    private Double disposalAfaReduce;

    /** 处置可供出售金融资产净减少额(同比%) */
    @Excel(name = "处置可供出售金融资产净减少额(同比%)")
    private Double disposalAfaReduceYoy;

    /** 处置可供出售金融资产净减少额(单季度环比%) */
    @Excel(name = "处置可供出售金融资产净减少额(单季度环比%)")
    private Double disposalAfaReduceQoq;

    /** 可供出售金融资产的减少 */
    @Excel(name = "可供出售金融资产的减少")
    private Double afaReduce;

    /** 可供出售金融资产的减少(同比%) */
    @Excel(name = "可供出售金融资产的减少(同比%)")
    private Double afaReduceYoy;

    /** 可供出售金融资产的减少(单季度环比%) */
    @Excel(name = "可供出售金融资产的减少(单季度环比%)")
    private Double afaReduceQoq;

    /** 收到交易性金融资产现金净额 */
    @Excel(name = "收到交易性金融资产现金净额")
    private Double receiveTradeFinasset;

    /** 收到交易性金融资产现金净额(同比%) */
    @Excel(name = "收到交易性金融资产现金净额(同比%)")
    private Double receiveTradeFinassetYoy;

    /** 收到交易性金融资产现金净额(单季度环比%) */
    @Excel(name = "收到交易性金融资产现金净额(单季度环比%)")
    private Double receiveTradeFinassetQoq;

    /** 银行业务及证券业务拆借资金净增加额 */
    @Excel(name = "银行业务及证券业务拆借资金净增加额")
    private Double banksecurityLendAdd;

    /** 银行业务及证券业务拆借资金净增加额(同比%) */
    @Excel(name = "银行业务及证券业务拆借资金净增加额(同比%)")
    private Double banksecurityLendAddYoy;

    /** 银行业务及证券业务拆借资金净增加额(单季度环比%) */
    @Excel(name = "银行业务及证券业务拆借资金净增加额(单季度环比%)")
    private Double banksecurityLendAddQoq;

    /** 存放中央银行和同业款项净减少额 */
    @Excel(name = "存放中央银行和同业款项净减少额")
    private Double pbcInterbankReduce;

    /** 存放中央银行和同业款项净减少额(同比%) */
    @Excel(name = "存放中央银行和同业款项净减少额(同比%)")
    private Double pbcInterbankReduceYoy;

    /** 存放中央银行和同业款项净减少额(单季度环比%) */
    @Excel(name = "存放中央银行和同业款项净减少额(单季度环比%)")
    private Double pbcInterbankReduceQoq;

    /** 银行及证券业务卖出回购资金净增加额 */
    @Excel(name = "银行及证券业务卖出回购资金净增加额")
    private Double banksecurityRepoAdd;

    /** 银行及证券业务卖出回购资金净增加额(同比%) */
    @Excel(name = "银行及证券业务卖出回购资金净增加额(同比%)")
    private Double banksecurityRepoAddYoy;

    /** 银行及证券业务卖出回购资金净增加额(单季度环比%) */
    @Excel(name = "银行及证券业务卖出回购资金净增加额(单季度环比%)")
    private Double banksecurityRepoAddQoq;

    /** 银行及证券业务买入返售资金净减少额 */
    @Excel(name = "银行及证券业务买入返售资金净减少额")
    private Double banksecurityResaleReduce;

    /** 银行及证券业务买入返售资金净减少额(同比%) */
    @Excel(name = "银行及证券业务买入返售资金净减少额(同比%)")
    private Double banksecurityResaleReduceYoy;

    /** 银行及证券业务买入返售资金净减少额(单季度环比%) */
    @Excel(name = "银行及证券业务买入返售资金净减少额(单季度环比%)")
    private Double banksecurityResaleReduceQoq;

    /** 支付再保险业务现金净额 */
    @Excel(name = "支付再保险业务现金净额")
    private Double payReinsure;

    /** 支付再保险业务现金净额(同比%) */
    @Excel(name = "支付再保险业务现金净额(同比%)")
    private Double payReinsureYoy;

    /** 支付再保险业务现金净额(单季度环比%) */
    @Excel(name = "支付再保险业务现金净额(单季度环比%)")
    private Double payReinsureQoq;

    /** 银行业务及证券业务拆借资金净减少额 */
    @Excel(name = "银行业务及证券业务拆借资金净减少额")
    private Double banksecurityLendReduce;

    /** 银行业务及证券业务拆借资金净减少额(同比%) */
    @Excel(name = "银行业务及证券业务拆借资金净减少额(同比%)")
    private Double banksecurityLendReduceYoy;

    /** 银行业务及证券业务拆借资金净减少额(单季度环比%) */
    @Excel(name = "银行业务及证券业务拆借资金净减少额(单季度环比%)")
    private Double banksecurityLendReduceQoq;

    /** 银行业务及证券业务买入返售资金净增加额 */
    @Excel(name = "银行业务及证券业务买入返售资金净增加额")
    private Double banksecurityResaleAdd;

    /** 银行业务及证券业务买入返售资金净增加额(同比%) */
    @Excel(name = "银行业务及证券业务买入返售资金净增加额(同比%)")
    private Double banksecurityResaleAddYoy;

    /** 银行业务及证券业务买入返售资金净增加额(单季度环比%) */
    @Excel(name = "银行业务及证券业务买入返售资金净增加额(单季度环比%)")
    private Double banksecurityResaleAddQoq;

    /** 银行业务及证券业务卖出回购资金净减少额 */
    @Excel(name = "银行业务及证券业务卖出回购资金净减少额")
    private Double banksecurityRepoReduce;

    /** 银行业务及证券业务卖出回购资金净减少额(同比%) */
    @Excel(name = "银行业务及证券业务卖出回购资金净减少额(同比%)")
    private Double banksecurityRepoReduceYoy;

    /** 银行业务及证券业务卖出回购资金净减少额(单季度环比%) */
    @Excel(name = "银行业务及证券业务卖出回购资金净减少额(单季度环比%)")
    private Double banksecurityRepoReduceQoq;

    /** 保户储金及投资款净减少额 */
    @Excel(name = "保户储金及投资款净减少额")
    private Double insuredInvestReduce;

    /** 保户储金及投资款净减少额(同比%) */
    @Excel(name = "保户储金及投资款净减少额(同比%)")
    private Double insuredInvestReduceYoy;

    /** 保户储金及投资款净减少额(单季度环比%) */
    @Excel(name = "保户储金及投资款净减少额(单季度环比%)")
    private Double insuredInvestReduceQoq;

    /** 支付交易性金融资产现金净额 */
    @Excel(name = "支付交易性金融资产现金净额")
    private Double payTradeFinasset;

    /** 支付交易性金融资产现金净额(同比%) */
    @Excel(name = "支付交易性金融资产现金净额(同比%)")
    private Double payTradeFinassetYoy;

    /** 支付交易性金融资产现金净额(单季度环比%) */
    @Excel(name = "支付交易性金融资产现金净额(单季度环比%)")
    private Double payTradeFinassetQoq;

    /** 保户质押贷款净增加额 */
    @Excel(name = "保户质押贷款净增加额")
    private Double insuredPla;

    /** 保户质押贷款净增加额(同比%) */
    @Excel(name = "保户质押贷款净增加额(同比%)")
    private Double insuredPlaYoy;

    /** 保户质押贷款净增加额(单季度环比%) */
    @Excel(name = "保户质押贷款净增加额(单季度环比%)")
    private Double insuredPlaQoq;

    /** 收购子公司及其他营业单位支付的现金净额 */
    @Excel(name = "收购子公司及其他营业单位支付的现金净额")
    private Double purchaseSubsidiaryOther;

    /** 收购子公司及其他营业单位支付的现金净额(同比%) */
    @Excel(name = "收购子公司及其他营业单位支付的现金净额(同比%)")
    private Double purchaseSubsidiaryOtherYoy;

    /** 收购子公司及其他营业单位支付的现金净额(单季度环比%) */
    @Excel(name = "收购子公司及其他营业单位支付的现金净额(单季度环比%)")
    private Double purchaseSubsidiaryOtherQoq;

    /** 处置子公司及其他营业单位流出的现金净额 */
    @Excel(name = "处置子公司及其他营业单位流出的现金净额")
    private Double disposalSubsidiaryOutflow;

    /** 处置子公司及其他营业单位流出的现金净额(同比%) */
    @Excel(name = "处置子公司及其他营业单位流出的现金净额(同比%)")
    private Double disposalSubsidiaryOutflowYoy;

    /** 处置子公司及其他营业单位流出的现金净额(单季度环比%) */
    @Excel(name = "处置子公司及其他营业单位流出的现金净额(单季度环比%)")
    private Double disposalSubsidiaryOutflowQoq;

    /** 收到卖出回购金融资产款现金净额 */
    @Excel(name = "收到卖出回购金融资产款现金净额")
    private Double receiveSellRepo;

    /** 收到卖出回购金融资产款现金净额(同比%) */
    @Excel(name = "收到卖出回购金融资产款现金净额(同比%)")
    private Double receiveSellRepoYoy;

    /** 收到卖出回购金融资产款现金净额(单季度环比%) */
    @Excel(name = "收到卖出回购金融资产款现金净额(单季度环比%)")
    private Double receiveSellRepoQoq;

    /** 支付卖出回购金融资产款现金净额 */
    @Excel(name = "支付卖出回购金融资产款现金净额")
    private Double paySellRepo;

    /** 支付卖出回购金融资产款现金净额(同比%) */
    @Excel(name = "支付卖出回购金融资产款现金净额(同比%)")
    private Double paySellRepoYoy;

    /** 支付卖出回购金融资产款现金净额(单季度环比%) */
    @Excel(name = "支付卖出回购金融资产款现金净额(单季度环比%)")
    private Double paySellRepoQoq;

    /** 提取的保险责任准备金 */
    @Excel(name = "提取的保险责任准备金")
    private Double extractInsuranceReserve;

    /** 提取的保险责任准备金(同比%) */
    @Excel(name = "提取的保险责任准备金(同比%)")
    private Double extractInsuranceReserveYoy;

    /** 提取的保险责任准备金(单季度环比%) */
    @Excel(name = "提取的保险责任准备金(单季度环比%)")
    private Double extractInsuranceReserveQoq;

    /** 提取的未到期的责任准备金 */
    @Excel(name = "提取的未到期的责任准备金")
    private Double extractUnexpireReserve;

    /** 提取的未到期的责任准备金(同比%) */
    @Excel(name = "提取的未到期的责任准备金(同比%)")
    private Double extractUnexpireReserveYoy;

    /** 提取的未到期的责任准备金(单季度环比%) */
    @Excel(name = "提取的未到期的责任准备金(单季度环比%)")
    private Double extractUnexpireReserveQoq;

    /** 经营活动产生的现金流量净额其他项目 */
    @Excel(name = "经营活动产生的现金流量净额其他项目")
    private Double fbOperateNetcashOther;

    /** 经营活动产生的现金流量净额其他项目(同比%) */
    @Excel(name = "经营活动产生的现金流量净额其他项目(同比%)")
    private Double fbOperateNetcashOtherYoy;

    /** 经营活动产生的现金流量净额其他项目(单季度环比%) */
    @Excel(name = "经营活动产生的现金流量净额其他项目(单季度环比%)")
    private Double fbOperateNetcashOtherQoq;

    /** 经营活动产生的现金流量净额平衡项目 */
    @Excel(name = "经营活动产生的现金流量净额平衡项目")
    private Double fbOperateNetcashBalance;

    /** 经营活动产生的现金流量净额平衡项目(同比%) */
    @Excel(name = "经营活动产生的现金流量净额平衡项目(同比%)")
    private Double fbOperateNetcashBalanceYoy;

    /** 经营活动产生的现金流量净额平衡项目(单季度环比%) */
    @Excel(name = "经营活动产生的现金流量净额平衡项目(单季度环比%)")
    private Double fbOperateNetcashBalanceQoq;

    /** 经营活动产生的现金流量净额 */
    @Excel(name = "经营活动产生的现金流量净额")
    private Double fbNetcashOperate;

    /** 经营活动产生的现金流量净额(同比%) */
    @Excel(name = "经营活动产生的现金流量净额(同比%)")
    private Double fbNetcashOperateYoy;

    /** 经营活动产生的现金流量净额(单季度环比%) */
    @Excel(name = "经营活动产生的现金流量净额(单季度环比%)")
    private Double fbNetcashOperateQoq;

    /** 现金及现金等价物净增加额其他项目 */
    @Excel(name = "现金及现金等价物净增加额其他项目")
    private Double fbCceAddOther;

    /** 现金及现金等价物净增加额其他项目(同比%) */
    @Excel(name = "现金及现金等价物净增加额其他项目(同比%)")
    private Double fbCceAddOtherYoy;

    /** 现金及现金等价物净增加额其他项目(单季度环比%) */
    @Excel(name = "现金及现金等价物净增加额其他项目(单季度环比%)")
    private Double fbCceAddOtherQoq;

    /** 现金及现金等价物净增加额平衡项目 */
    @Excel(name = "现金及现金等价物净增加额平衡项目")
    private Double fbCceAddBalance;

    /** 现金及现金等价物净增加额平衡项目(同比%) */
    @Excel(name = "现金及现金等价物净增加额平衡项目(同比%)")
    private Double fbCceAddBalanceYoy;

    /** 现金及现金等价物净增加额平衡项目(单季度环比%) */
    @Excel(name = "现金及现金等价物净增加额平衡项目(单季度环比%)")
    private Double fbCceAddBalanceQoq;

    /** 现金及现金等价物的净增加额 */
    @Excel(name = "现金及现金等价物的净增加额")
    private Double fbCceAdd;

    /** 现金及现金等价物的净增加额(同比%) */
    @Excel(name = "现金及现金等价物的净增加额(同比%)")
    private Double fbCceAddYoy;

    /** 现金及现金等价物的净增加额(单季度环比%) */
    @Excel(name = "现金及现金等价物的净增加额(单季度环比%)")
    private Double fbCceAddQoq;

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

    public void setSalesServices(Double salesServices){this.salesServices = salesServices;}
    public Double getSalesServices(){return salesServices;}

    public void setSalesServicesYoy(Double salesServicesYoy){this.salesServicesYoy = salesServicesYoy;}
    public Double getSalesServicesYoy(){return salesServicesYoy;}

    public void setSalesServicesQoq(Double salesServicesQoq){this.salesServicesQoq = salesServicesQoq;}
    public Double getSalesServicesQoq(){return salesServicesQoq;}

    public void setDepositInterbankAdd(Double depositInterbankAdd){this.depositInterbankAdd = depositInterbankAdd;}
    public Double getDepositInterbankAdd(){return depositInterbankAdd;}

    public void setDepositInterbankAddYoy(Double depositInterbankAddYoy){this.depositInterbankAddYoy = depositInterbankAddYoy;}
    public Double getDepositInterbankAddYoy(){return depositInterbankAddYoy;}

    public void setDepositInterbankAddQoq(Double depositInterbankAddQoq){this.depositInterbankAddQoq = depositInterbankAddQoq;}
    public Double getDepositInterbankAddQoq(){return depositInterbankAddQoq;}

    public void setLoanPbcAdd(Double loanPbcAdd){this.loanPbcAdd = loanPbcAdd;}
    public Double getLoanPbcAdd(){return loanPbcAdd;}

    public void setLoanPbcAddYoy(Double loanPbcAddYoy){this.loanPbcAddYoy = loanPbcAddYoy;}
    public Double getLoanPbcAddYoy(){return loanPbcAddYoy;}

    public void setLoanPbcAddQoq(Double loanPbcAddQoq){this.loanPbcAddQoq = loanPbcAddQoq;}
    public Double getLoanPbcAddQoq(){return loanPbcAddQoq;}

    public void setOfiBfAdd(Double ofiBfAdd){this.ofiBfAdd = ofiBfAdd;}
    public Double getOfiBfAdd(){return ofiBfAdd;}

    public void setOfiBfAddYoy(Double ofiBfAddYoy){this.ofiBfAddYoy = ofiBfAddYoy;}
    public Double getOfiBfAddYoy(){return ofiBfAddYoy;}

    public void setOfiBfAddQoq(Double ofiBfAddQoq){this.ofiBfAddQoq = ofiBfAddQoq;}
    public Double getOfiBfAddQoq(){return ofiBfAddQoq;}

    public void setReceiveOrigicPremium(Double receiveOrigicPremium){this.receiveOrigicPremium = receiveOrigicPremium;}
    public Double getReceiveOrigicPremium(){return receiveOrigicPremium;}

    public void setReceiveOrigicPremiumYoy(Double receiveOrigicPremiumYoy){this.receiveOrigicPremiumYoy = receiveOrigicPremiumYoy;}
    public Double getReceiveOrigicPremiumYoy(){return receiveOrigicPremiumYoy;}

    public void setReceiveOrigicPremiumQoq(Double receiveOrigicPremiumQoq){this.receiveOrigicPremiumQoq = receiveOrigicPremiumQoq;}
    public Double getReceiveOrigicPremiumQoq(){return receiveOrigicPremiumQoq;}

    public void setReceiveReinsureNet(Double receiveReinsureNet){this.receiveReinsureNet = receiveReinsureNet;}
    public Double getReceiveReinsureNet(){return receiveReinsureNet;}

    public void setReceiveReinsureNetYoy(Double receiveReinsureNetYoy){this.receiveReinsureNetYoy = receiveReinsureNetYoy;}
    public Double getReceiveReinsureNetYoy(){return receiveReinsureNetYoy;}

    public void setReceiveReinsureNetQoq(Double receiveReinsureNetQoq){this.receiveReinsureNetQoq = receiveReinsureNetQoq;}
    public Double getReceiveReinsureNetQoq(){return receiveReinsureNetQoq;}

    public void setInsuredInvestAdd(Double insuredInvestAdd){this.insuredInvestAdd = insuredInvestAdd;}
    public Double getInsuredInvestAdd(){return insuredInvestAdd;}

    public void setInsuredInvestAddYoy(Double insuredInvestAddYoy){this.insuredInvestAddYoy = insuredInvestAddYoy;}
    public Double getInsuredInvestAddYoy(){return insuredInvestAddYoy;}

    public void setInsuredInvestAddQoq(Double insuredInvestAddQoq){this.insuredInvestAddQoq = insuredInvestAddQoq;}
    public Double getInsuredInvestAddQoq(){return insuredInvestAddQoq;}

    public void setDisposalTfaAdd(Double disposalTfaAdd){this.disposalTfaAdd = disposalTfaAdd;}
    public Double getDisposalTfaAdd(){return disposalTfaAdd;}

    public void setDisposalTfaAddYoy(Double disposalTfaAddYoy){this.disposalTfaAddYoy = disposalTfaAddYoy;}
    public Double getDisposalTfaAddYoy(){return disposalTfaAddYoy;}

    public void setDisposalTfaAddQoq(Double disposalTfaAddQoq){this.disposalTfaAddQoq = disposalTfaAddQoq;}
    public Double getDisposalTfaAddQoq(){return disposalTfaAddQoq;}

    public void setReceiveInterestCommission(Double receiveInterestCommission){this.receiveInterestCommission = receiveInterestCommission;}
    public Double getReceiveInterestCommission(){return receiveInterestCommission;}

    public void setReceiveInterestCommissionYoy(Double receiveInterestCommissionYoy){this.receiveInterestCommissionYoy = receiveInterestCommissionYoy;}
    public Double getReceiveInterestCommissionYoy(){return receiveInterestCommissionYoy;}

    public void setReceiveInterestCommissionQoq(Double receiveInterestCommissionQoq){this.receiveInterestCommissionQoq = receiveInterestCommissionQoq;}
    public Double getReceiveInterestCommissionQoq(){return receiveInterestCommissionQoq;}

    public void setBorrowFundAdd(Double borrowFundAdd){this.borrowFundAdd = borrowFundAdd;}
    public Double getBorrowFundAdd(){return borrowFundAdd;}

    public void setBorrowFundAddYoy(Double borrowFundAddYoy){this.borrowFundAddYoy = borrowFundAddYoy;}
    public Double getBorrowFundAddYoy(){return borrowFundAddYoy;}

    public void setBorrowFundAddQoq(Double borrowFundAddQoq){this.borrowFundAddQoq = borrowFundAddQoq;}
    public Double getBorrowFundAddQoq(){return borrowFundAddQoq;}

    public void setLoanAdvanceReduce(Double loanAdvanceReduce){this.loanAdvanceReduce = loanAdvanceReduce;}
    public Double getLoanAdvanceReduce(){return loanAdvanceReduce;}

    public void setLoanAdvanceReduceYoy(Double loanAdvanceReduceYoy){this.loanAdvanceReduceYoy = loanAdvanceReduceYoy;}
    public Double getLoanAdvanceReduceYoy(){return loanAdvanceReduceYoy;}

    public void setLoanAdvanceReduceQoq(Double loanAdvanceReduceQoq){this.loanAdvanceReduceQoq = loanAdvanceReduceQoq;}
    public Double getLoanAdvanceReduceQoq(){return loanAdvanceReduceQoq;}

    public void setRepoBusinessAdd(Double repoBusinessAdd){this.repoBusinessAdd = repoBusinessAdd;}
    public Double getRepoBusinessAdd(){return repoBusinessAdd;}

    public void setRepoBusinessAddYoy(Double repoBusinessAddYoy){this.repoBusinessAddYoy = repoBusinessAddYoy;}
    public Double getRepoBusinessAddYoy(){return repoBusinessAddYoy;}

    public void setRepoBusinessAddQoq(Double repoBusinessAddQoq){this.repoBusinessAddQoq = repoBusinessAddQoq;}
    public Double getRepoBusinessAddQoq(){return repoBusinessAddQoq;}

    public void setReceiveTaxRefund(Double receiveTaxRefund){this.receiveTaxRefund = receiveTaxRefund;}
    public Double getReceiveTaxRefund(){return receiveTaxRefund;}

    public void setReceiveTaxRefundYoy(Double receiveTaxRefundYoy){this.receiveTaxRefundYoy = receiveTaxRefundYoy;}
    public Double getReceiveTaxRefundYoy(){return receiveTaxRefundYoy;}

    public void setReceiveTaxRefundQoq(Double receiveTaxRefundQoq){this.receiveTaxRefundQoq = receiveTaxRefundQoq;}
    public Double getReceiveTaxRefundQoq(){return receiveTaxRefundQoq;}

    public void setReceiveOtherOperate(Double receiveOtherOperate){this.receiveOtherOperate = receiveOtherOperate;}
    public Double getReceiveOtherOperate(){return receiveOtherOperate;}

    public void setReceiveOtherOperateYoy(Double receiveOtherOperateYoy){this.receiveOtherOperateYoy = receiveOtherOperateYoy;}
    public Double getReceiveOtherOperateYoy(){return receiveOtherOperateYoy;}

    public void setReceiveOtherOperateQoq(Double receiveOtherOperateQoq){this.receiveOtherOperateQoq = receiveOtherOperateQoq;}
    public Double getReceiveOtherOperateQoq(){return receiveOtherOperateQoq;}

    public void setOperateInflowOther(Double operateInflowOther){this.operateInflowOther = operateInflowOther;}
    public Double getOperateInflowOther(){return operateInflowOther;}

    public void setOperateInflowOtherYoy(Double operateInflowOtherYoy){this.operateInflowOtherYoy = operateInflowOtherYoy;}
    public Double getOperateInflowOtherYoy(){return operateInflowOtherYoy;}

    public void setOperateInflowOtherQoq(Double operateInflowOtherQoq){this.operateInflowOtherQoq = operateInflowOtherQoq;}
    public Double getOperateInflowOtherQoq(){return operateInflowOtherQoq;}

    public void setOperateInflowBalance(Double operateInflowBalance){this.operateInflowBalance = operateInflowBalance;}
    public Double getOperateInflowBalance(){return operateInflowBalance;}

    public void setOperateInflowBalanceYoy(Double operateInflowBalanceYoy){this.operateInflowBalanceYoy = operateInflowBalanceYoy;}
    public Double getOperateInflowBalanceYoy(){return operateInflowBalanceYoy;}

    public void setOperateInflowBalanceQoq(Double operateInflowBalanceQoq){this.operateInflowBalanceQoq = operateInflowBalanceQoq;}
    public Double getOperateInflowBalanceQoq(){return operateInflowBalanceQoq;}

    public void setTotalOperateInflow(Double totalOperateInflow){this.totalOperateInflow = totalOperateInflow;}
    public Double getTotalOperateInflow(){return totalOperateInflow;}

    public void setTotalOperateInflowYoy(Double totalOperateInflowYoy){this.totalOperateInflowYoy = totalOperateInflowYoy;}
    public Double getTotalOperateInflowYoy(){return totalOperateInflowYoy;}

    public void setTotalOperateInflowQoq(Double totalOperateInflowQoq){this.totalOperateInflowQoq = totalOperateInflowQoq;}
    public Double getTotalOperateInflowQoq(){return totalOperateInflowQoq;}

    public void setBuyServices(Double buyServices){this.buyServices = buyServices;}
    public Double getBuyServices(){return buyServices;}

    public void setBuyServicesYoy(Double buyServicesYoy){this.buyServicesYoy = buyServicesYoy;}
    public Double getBuyServicesYoy(){return buyServicesYoy;}

    public void setBuyServicesQoq(Double buyServicesQoq){this.buyServicesQoq = buyServicesQoq;}
    public Double getBuyServicesQoq(){return buyServicesQoq;}

    public void setLoanAdvanceAdd(Double loanAdvanceAdd){this.loanAdvanceAdd = loanAdvanceAdd;}
    public Double getLoanAdvanceAdd(){return loanAdvanceAdd;}

    public void setLoanAdvanceAddYoy(Double loanAdvanceAddYoy){this.loanAdvanceAddYoy = loanAdvanceAddYoy;}
    public Double getLoanAdvanceAddYoy(){return loanAdvanceAddYoy;}

    public void setLoanAdvanceAddQoq(Double loanAdvanceAddQoq){this.loanAdvanceAddQoq = loanAdvanceAddQoq;}
    public Double getLoanAdvanceAddQoq(){return loanAdvanceAddQoq;}

    public void setPbcInterbankAdd(Double pbcInterbankAdd){this.pbcInterbankAdd = pbcInterbankAdd;}
    public Double getPbcInterbankAdd(){return pbcInterbankAdd;}

    public void setPbcInterbankAddYoy(Double pbcInterbankAddYoy){this.pbcInterbankAddYoy = pbcInterbankAddYoy;}
    public Double getPbcInterbankAddYoy(){return pbcInterbankAddYoy;}

    public void setPbcInterbankAddQoq(Double pbcInterbankAddQoq){this.pbcInterbankAddQoq = pbcInterbankAddQoq;}
    public Double getPbcInterbankAddQoq(){return pbcInterbankAddQoq;}

    public void setPayOrigicCompensate(Double payOrigicCompensate){this.payOrigicCompensate = payOrigicCompensate;}
    public Double getPayOrigicCompensate(){return payOrigicCompensate;}

    public void setPayOrigicCompensateYoy(Double payOrigicCompensateYoy){this.payOrigicCompensateYoy = payOrigicCompensateYoy;}
    public Double getPayOrigicCompensateYoy(){return payOrigicCompensateYoy;}

    public void setPayOrigicCompensateQoq(Double payOrigicCompensateQoq){this.payOrigicCompensateQoq = payOrigicCompensateQoq;}
    public Double getPayOrigicCompensateQoq(){return payOrigicCompensateQoq;}

    public void setPayInterestCommission(Double payInterestCommission){this.payInterestCommission = payInterestCommission;}
    public Double getPayInterestCommission(){return payInterestCommission;}

    public void setPayInterestCommissionYoy(Double payInterestCommissionYoy){this.payInterestCommissionYoy = payInterestCommissionYoy;}
    public Double getPayInterestCommissionYoy(){return payInterestCommissionYoy;}

    public void setPayInterestCommissionQoq(Double payInterestCommissionQoq){this.payInterestCommissionQoq = payInterestCommissionQoq;}
    public Double getPayInterestCommissionQoq(){return payInterestCommissionQoq;}

    public void setPayPolicyBonus(Double payPolicyBonus){this.payPolicyBonus = payPolicyBonus;}
    public Double getPayPolicyBonus(){return payPolicyBonus;}

    public void setPayPolicyBonusYoy(Double payPolicyBonusYoy){this.payPolicyBonusYoy = payPolicyBonusYoy;}
    public Double getPayPolicyBonusYoy(){return payPolicyBonusYoy;}

    public void setPayPolicyBonusQoq(Double payPolicyBonusQoq){this.payPolicyBonusQoq = payPolicyBonusQoq;}
    public Double getPayPolicyBonusQoq(){return payPolicyBonusQoq;}

    public void setPayStaffCash(Double payStaffCash){this.payStaffCash = payStaffCash;}
    public Double getPayStaffCash(){return payStaffCash;}

    public void setPayStaffCashYoy(Double payStaffCashYoy){this.payStaffCashYoy = payStaffCashYoy;}
    public Double getPayStaffCashYoy(){return payStaffCashYoy;}

    public void setPayStaffCashQoq(Double payStaffCashQoq){this.payStaffCashQoq = payStaffCashQoq;}
    public Double getPayStaffCashQoq(){return payStaffCashQoq;}

    public void setPayAllTax(Double payAllTax){this.payAllTax = payAllTax;}
    public Double getPayAllTax(){return payAllTax;}

    public void setPayAllTaxYoy(Double payAllTaxYoy){this.payAllTaxYoy = payAllTaxYoy;}
    public Double getPayAllTaxYoy(){return payAllTaxYoy;}

    public void setPayAllTaxQoq(Double payAllTaxQoq){this.payAllTaxQoq = payAllTaxQoq;}
    public Double getPayAllTaxQoq(){return payAllTaxQoq;}

    public void setPayOtherOperate(Double payOtherOperate){this.payOtherOperate = payOtherOperate;}
    public Double getPayOtherOperate(){return payOtherOperate;}

    public void setPayOtherOperateYoy(Double payOtherOperateYoy){this.payOtherOperateYoy = payOtherOperateYoy;}
    public Double getPayOtherOperateYoy(){return payOtherOperateYoy;}

    public void setPayOtherOperateQoq(Double payOtherOperateQoq){this.payOtherOperateQoq = payOtherOperateQoq;}
    public Double getPayOtherOperateQoq(){return payOtherOperateQoq;}

    public void setOperateOutflowOther(Double operateOutflowOther){this.operateOutflowOther = operateOutflowOther;}
    public Double getOperateOutflowOther(){return operateOutflowOther;}

    public void setOperateOutflowOtherYoy(Double operateOutflowOtherYoy){this.operateOutflowOtherYoy = operateOutflowOtherYoy;}
    public Double getOperateOutflowOtherYoy(){return operateOutflowOtherYoy;}

    public void setOperateOutflowOtherQoq(Double operateOutflowOtherQoq){this.operateOutflowOtherQoq = operateOutflowOtherQoq;}
    public Double getOperateOutflowOtherQoq(){return operateOutflowOtherQoq;}

    public void setDepositIofiOther(Double depositIofiOther){this.depositIofiOther = depositIofiOther;}
    public Double getDepositIofiOther(){return depositIofiOther;}

    public void setDepositIofiOtherYoy(Double depositIofiOtherYoy){this.depositIofiOtherYoy = depositIofiOtherYoy;}
    public Double getDepositIofiOtherYoy(){return depositIofiOtherYoy;}

    public void setDepositIofiOtherQoq(Double depositIofiOtherQoq){this.depositIofiOtherQoq = depositIofiOtherQoq;}
    public Double getDepositIofiOtherQoq(){return depositIofiOtherQoq;}

    public void setOperateOutflowBalance(Double operateOutflowBalance){this.operateOutflowBalance = operateOutflowBalance;}
    public Double getOperateOutflowBalance(){return operateOutflowBalance;}

    public void setOperateOutflowBalanceYoy(Double operateOutflowBalanceYoy){this.operateOutflowBalanceYoy = operateOutflowBalanceYoy;}
    public Double getOperateOutflowBalanceYoy(){return operateOutflowBalanceYoy;}

    public void setOperateOutflowBalanceQoq(Double operateOutflowBalanceQoq){this.operateOutflowBalanceQoq = operateOutflowBalanceQoq;}
    public Double getOperateOutflowBalanceQoq(){return operateOutflowBalanceQoq;}

    public void setCustomerDepositAdd(Double customerDepositAdd){this.customerDepositAdd = customerDepositAdd;}
    public Double getCustomerDepositAdd(){return customerDepositAdd;}

    public void setCustomerDepositAddYoy(Double customerDepositAddYoy){this.customerDepositAddYoy = customerDepositAddYoy;}
    public Double getCustomerDepositAddYoy(){return customerDepositAddYoy;}

    public void setCustomerDepositAddQoq(Double customerDepositAddQoq){this.customerDepositAddQoq = customerDepositAddQoq;}
    public Double getCustomerDepositAddQoq(){return customerDepositAddQoq;}

    public void setTotalOperateOutflow(Double totalOperateOutflow){this.totalOperateOutflow = totalOperateOutflow;}
    public Double getTotalOperateOutflow(){return totalOperateOutflow;}

    public void setTotalOperateOutflowYoy(Double totalOperateOutflowYoy){this.totalOperateOutflowYoy = totalOperateOutflowYoy;}
    public Double getTotalOperateOutflowYoy(){return totalOperateOutflowYoy;}

    public void setTotalOperateOutflowQoq(Double totalOperateOutflowQoq){this.totalOperateOutflowQoq = totalOperateOutflowQoq;}
    public Double getTotalOperateOutflowQoq(){return totalOperateOutflowQoq;}

    public void setIofiAdd(Double iofiAdd){this.iofiAdd = iofiAdd;}
    public Double getIofiAdd(){return iofiAdd;}

    public void setIofiAddYoy(Double iofiAddYoy){this.iofiAddYoy = iofiAddYoy;}
    public Double getIofiAddYoy(){return iofiAddYoy;}

    public void setIofiAddQoq(Double iofiAddQoq){this.iofiAddQoq = iofiAddQoq;}
    public Double getIofiAddQoq(){return iofiAddQoq;}

    public void setOperateNetcashOther(Double operateNetcashOther){this.operateNetcashOther = operateNetcashOther;}
    public Double getOperateNetcashOther(){return operateNetcashOther;}

    public void setOperateNetcashOtherYoy(Double operateNetcashOtherYoy){this.operateNetcashOtherYoy = operateNetcashOtherYoy;}
    public Double getOperateNetcashOtherYoy(){return operateNetcashOtherYoy;}

    public void setOperateNetcashOtherQoq(Double operateNetcashOtherQoq){this.operateNetcashOtherQoq = operateNetcashOtherQoq;}
    public Double getOperateNetcashOtherQoq(){return operateNetcashOtherQoq;}

    public void setOperateNetcashBalance(Double operateNetcashBalance){this.operateNetcashBalance = operateNetcashBalance;}
    public Double getOperateNetcashBalance(){return operateNetcashBalance;}

    public void setOperateNetcashBalanceYoy(Double operateNetcashBalanceYoy){this.operateNetcashBalanceYoy = operateNetcashBalanceYoy;}
    public Double getOperateNetcashBalanceYoy(){return operateNetcashBalanceYoy;}

    public void setOperateNetcashBalanceQoq(Double operateNetcashBalanceQoq){this.operateNetcashBalanceQoq = operateNetcashBalanceQoq;}
    public Double getOperateNetcashBalanceQoq(){return operateNetcashBalanceQoq;}

    public void setPbcIofiReduce(Double pbcIofiReduce){this.pbcIofiReduce = pbcIofiReduce;}
    public Double getPbcIofiReduce(){return pbcIofiReduce;}

    public void setPbcIofiReduceYoy(Double pbcIofiReduceYoy){this.pbcIofiReduceYoy = pbcIofiReduceYoy;}
    public Double getPbcIofiReduceYoy(){return pbcIofiReduceYoy;}

    public void setPbcIofiReduceQoq(Double pbcIofiReduceQoq){this.pbcIofiReduceQoq = pbcIofiReduceQoq;}
    public Double getPbcIofiReduceQoq(){return pbcIofiReduceQoq;}

    public void setNetcashOperate(Double netcashOperate){this.netcashOperate = netcashOperate;}
    public Double getNetcashOperate(){return netcashOperate;}

    public void setNetcashOperateYoy(Double netcashOperateYoy){this.netcashOperateYoy = netcashOperateYoy;}
    public Double getNetcashOperateYoy(){return netcashOperateYoy;}

    public void setNetcashOperateQoq(Double netcashOperateQoq){this.netcashOperateQoq = netcashOperateQoq;}
    public Double getNetcashOperateQoq(){return netcashOperateQoq;}

    public void setDepositPbcReduce(Double depositPbcReduce){this.depositPbcReduce = depositPbcReduce;}
    public Double getDepositPbcReduce(){return depositPbcReduce;}

    public void setDepositPbcReduceYoy(Double depositPbcReduceYoy){this.depositPbcReduceYoy = depositPbcReduceYoy;}
    public Double getDepositPbcReduceYoy(){return depositPbcReduceYoy;}

    public void setDepositPbcReduceQoq(Double depositPbcReduceQoq){this.depositPbcReduceQoq = depositPbcReduceQoq;}
    public Double getDepositPbcReduceQoq(){return depositPbcReduceQoq;}

    public void setWithdrawInvest(Double withdrawInvest){this.withdrawInvest = withdrawInvest;}
    public Double getWithdrawInvest(){return withdrawInvest;}

    public void setWithdrawInvestYoy(Double withdrawInvestYoy){this.withdrawInvestYoy = withdrawInvestYoy;}
    public Double getWithdrawInvestYoy(){return withdrawInvestYoy;}

    public void setWithdrawInvestQoq(Double withdrawInvestQoq){this.withdrawInvestQoq = withdrawInvestQoq;}
    public Double getWithdrawInvestQoq(){return withdrawInvestQoq;}

    public void setDepositIofiReduce(Double depositIofiReduce){this.depositIofiReduce = depositIofiReduce;}
    public Double getDepositIofiReduce(){return depositIofiReduce;}

    public void setDepositIofiReduceYoy(Double depositIofiReduceYoy){this.depositIofiReduceYoy = depositIofiReduceYoy;}
    public Double getDepositIofiReduceYoy(){return depositIofiReduceYoy;}

    public void setDepositIofiReduceQoq(Double depositIofiReduceQoq){this.depositIofiReduceQoq = depositIofiReduceQoq;}
    public Double getDepositIofiReduceQoq(){return depositIofiReduceQoq;}

    public void setReceiveInvestIncome(Double receiveInvestIncome){this.receiveInvestIncome = receiveInvestIncome;}
    public Double getReceiveInvestIncome(){return receiveInvestIncome;}

    public void setReceiveInvestIncomeYoy(Double receiveInvestIncomeYoy){this.receiveInvestIncomeYoy = receiveInvestIncomeYoy;}
    public Double getReceiveInvestIncomeYoy(){return receiveInvestIncomeYoy;}

    public void setReceiveInvestIncomeQoq(Double receiveInvestIncomeQoq){this.receiveInvestIncomeQoq = receiveInvestIncomeQoq;}
    public Double getReceiveInvestIncomeQoq(){return receiveInvestIncomeQoq;}

    public void setBorrowRepoAdd(Double borrowRepoAdd){this.borrowRepoAdd = borrowRepoAdd;}
    public Double getBorrowRepoAdd(){return borrowRepoAdd;}

    public void setBorrowRepoAddYoy(Double borrowRepoAddYoy){this.borrowRepoAddYoy = borrowRepoAddYoy;}
    public Double getBorrowRepoAddYoy(){return borrowRepoAddYoy;}

    public void setBorrowRepoAddQoq(Double borrowRepoAddQoq){this.borrowRepoAddQoq = borrowRepoAddQoq;}
    public Double getBorrowRepoAddQoq(){return borrowRepoAddQoq;}

    public void setDisposalLongAsset(Double disposalLongAsset){this.disposalLongAsset = disposalLongAsset;}
    public Double getDisposalLongAsset(){return disposalLongAsset;}

    public void setDisposalLongAssetYoy(Double disposalLongAssetYoy){this.disposalLongAssetYoy = disposalLongAssetYoy;}
    public Double getDisposalLongAssetYoy(){return disposalLongAssetYoy;}

    public void setDisposalLongAssetQoq(Double disposalLongAssetQoq){this.disposalLongAssetQoq = disposalLongAssetQoq;}
    public Double getDisposalLongAssetQoq(){return disposalLongAssetQoq;}

    public void setDisposalSubsidiaryOther(Double disposalSubsidiaryOther){this.disposalSubsidiaryOther = disposalSubsidiaryOther;}
    public Double getDisposalSubsidiaryOther(){return disposalSubsidiaryOther;}

    public void setDisposalSubsidiaryOtherYoy(Double disposalSubsidiaryOtherYoy){this.disposalSubsidiaryOtherYoy = disposalSubsidiaryOtherYoy;}
    public Double getDisposalSubsidiaryOtherYoy(){return disposalSubsidiaryOtherYoy;}

    public void setDisposalSubsidiaryOtherQoq(Double disposalSubsidiaryOtherQoq){this.disposalSubsidiaryOtherQoq = disposalSubsidiaryOtherQoq;}
    public Double getDisposalSubsidiaryOtherQoq(){return disposalSubsidiaryOtherQoq;}

    public void setSellRepoAdd(Double sellRepoAdd){this.sellRepoAdd = sellRepoAdd;}
    public Double getSellRepoAdd(){return sellRepoAdd;}

    public void setSellRepoAddYoy(Double sellRepoAddYoy){this.sellRepoAddYoy = sellRepoAddYoy;}
    public Double getSellRepoAddYoy(){return sellRepoAddYoy;}

    public void setSellRepoAddQoq(Double sellRepoAddQoq){this.sellRepoAddQoq = sellRepoAddQoq;}
    public Double getSellRepoAddQoq(){return sellRepoAddQoq;}

    public void setReducePledgeTimedeposits(Double reducePledgeTimedeposits){this.reducePledgeTimedeposits = reducePledgeTimedeposits;}
    public Double getReducePledgeTimedeposits(){return reducePledgeTimedeposits;}

    public void setReducePledgeTimedepositsYoy(Double reducePledgeTimedepositsYoy){this.reducePledgeTimedepositsYoy = reducePledgeTimedepositsYoy;}
    public Double getReducePledgeTimedepositsYoy(){return reducePledgeTimedepositsYoy;}

    public void setReducePledgeTimedepositsQoq(Double reducePledgeTimedepositsQoq){this.reducePledgeTimedepositsQoq = reducePledgeTimedepositsQoq;}
    public Double getReducePledgeTimedepositsQoq(){return reducePledgeTimedepositsQoq;}

    public void setLendResaleReduce(Double lendResaleReduce){this.lendResaleReduce = lendResaleReduce;}
    public Double getLendResaleReduce(){return lendResaleReduce;}

    public void setLendResaleReduceYoy(Double lendResaleReduceYoy){this.lendResaleReduceYoy = lendResaleReduceYoy;}
    public Double getLendResaleReduceYoy(){return lendResaleReduceYoy;}

    public void setLendResaleReduceQoq(Double lendResaleReduceQoq){this.lendResaleReduceQoq = lendResaleReduceQoq;}
    public Double getLendResaleReduceQoq(){return lendResaleReduceQoq;}

    public void setReceiveOtherInvest(Double receiveOtherInvest){this.receiveOtherInvest = receiveOtherInvest;}
    public Double getReceiveOtherInvest(){return receiveOtherInvest;}

    public void setReceiveOtherInvestYoy(Double receiveOtherInvestYoy){this.receiveOtherInvestYoy = receiveOtherInvestYoy;}
    public Double getReceiveOtherInvestYoy(){return receiveOtherInvestYoy;}

    public void setReceiveOtherInvestQoq(Double receiveOtherInvestQoq){this.receiveOtherInvestQoq = receiveOtherInvestQoq;}
    public Double getReceiveOtherInvestQoq(){return receiveOtherInvestQoq;}

    public void setLendFundReduce(Double lendFundReduce){this.lendFundReduce = lendFundReduce;}
    public Double getLendFundReduce(){return lendFundReduce;}

    public void setLendFundReduceYoy(Double lendFundReduceYoy){this.lendFundReduceYoy = lendFundReduceYoy;}
    public Double getLendFundReduceYoy(){return lendFundReduceYoy;}

    public void setLendFundReduceQoq(Double lendFundReduceQoq){this.lendFundReduceQoq = lendFundReduceQoq;}
    public Double getLendFundReduceQoq(){return lendFundReduceQoq;}

    public void setInvestInflowOther(Double investInflowOther){this.investInflowOther = investInflowOther;}
    public Double getInvestInflowOther(){return investInflowOther;}

    public void setInvestInflowOtherYoy(Double investInflowOtherYoy){this.investInflowOtherYoy = investInflowOtherYoy;}
    public Double getInvestInflowOtherYoy(){return investInflowOtherYoy;}

    public void setInvestInflowOtherQoq(Double investInflowOtherQoq){this.investInflowOtherQoq = investInflowOtherQoq;}
    public Double getInvestInflowOtherQoq(){return investInflowOtherQoq;}

    public void setBuyResaleReduce(Double buyResaleReduce){this.buyResaleReduce = buyResaleReduce;}
    public Double getBuyResaleReduce(){return buyResaleReduce;}

    public void setBuyResaleReduceYoy(Double buyResaleReduceYoy){this.buyResaleReduceYoy = buyResaleReduceYoy;}
    public Double getBuyResaleReduceYoy(){return buyResaleReduceYoy;}

    public void setBuyResaleReduceQoq(Double buyResaleReduceQoq){this.buyResaleReduceQoq = buyResaleReduceQoq;}
    public Double getBuyResaleReduceQoq(){return buyResaleReduceQoq;}

    public void setInvestInflowBalance(Double investInflowBalance){this.investInflowBalance = investInflowBalance;}
    public Double getInvestInflowBalance(){return investInflowBalance;}

    public void setInvestInflowBalanceYoy(Double investInflowBalanceYoy){this.investInflowBalanceYoy = investInflowBalanceYoy;}
    public Double getInvestInflowBalanceYoy(){return investInflowBalanceYoy;}

    public void setInvestInflowBalanceQoq(Double investInflowBalanceQoq){this.investInflowBalanceQoq = investInflowBalanceQoq;}
    public Double getInvestInflowBalanceQoq(){return investInflowBalanceQoq;}

    public void setNetCd(Double netCd){this.netCd = netCd;}
    public Double getNetCd(){return netCd;}

    public void setNetCdYoy(Double netCdYoy){this.netCdYoy = netCdYoy;}
    public Double getNetCdYoy(){return netCdYoy;}

    public void setNetCdQoq(Double netCdQoq){this.netCdQoq = netCdQoq;}
    public Double getNetCdQoq(){return netCdQoq;}

    public void setTotalInvestInflow(Double totalInvestInflow){this.totalInvestInflow = totalInvestInflow;}
    public Double getTotalInvestInflow(){return totalInvestInflow;}

    public void setTotalInvestInflowYoy(Double totalInvestInflowYoy){this.totalInvestInflowYoy = totalInvestInflowYoy;}
    public Double getTotalInvestInflowYoy(){return totalInvestInflowYoy;}

    public void setTotalInvestInflowQoq(Double totalInvestInflowQoq){this.totalInvestInflowQoq = totalInvestInflowQoq;}
    public Double getTotalInvestInflowQoq(){return totalInvestInflowQoq;}

    public void setTradeFinliabAdd(Double tradeFinliabAdd){this.tradeFinliabAdd = tradeFinliabAdd;}
    public Double getTradeFinliabAdd(){return tradeFinliabAdd;}

    public void setTradeFinliabAddYoy(Double tradeFinliabAddYoy){this.tradeFinliabAddYoy = tradeFinliabAddYoy;}
    public Double getTradeFinliabAddYoy(){return tradeFinliabAddYoy;}

    public void setTradeFinliabAddQoq(Double tradeFinliabAddQoq){this.tradeFinliabAddQoq = tradeFinliabAddQoq;}
    public Double getTradeFinliabAddQoq(){return tradeFinliabAddQoq;}

    public void setConstructLongAsset(Double constructLongAsset){this.constructLongAsset = constructLongAsset;}
    public Double getConstructLongAsset(){return constructLongAsset;}

    public void setConstructLongAssetYoy(Double constructLongAssetYoy){this.constructLongAssetYoy = constructLongAssetYoy;}
    public Double getConstructLongAssetYoy(){return constructLongAssetYoy;}

    public void setConstructLongAssetQoq(Double constructLongAssetQoq){this.constructLongAssetQoq = constructLongAssetQoq;}
    public Double getConstructLongAssetQoq(){return constructLongAssetQoq;}

    public void setTradeFinassetReduce(Double tradeFinassetReduce){this.tradeFinassetReduce = tradeFinassetReduce;}
    public Double getTradeFinassetReduce(){return tradeFinassetReduce;}

    public void setTradeFinassetReduceYoy(Double tradeFinassetReduceYoy){this.tradeFinassetReduceYoy = tradeFinassetReduceYoy;}
    public Double getTradeFinassetReduceYoy(){return tradeFinassetReduceYoy;}

    public void setTradeFinassetReduceQoq(Double tradeFinassetReduceQoq){this.tradeFinassetReduceQoq = tradeFinassetReduceQoq;}
    public Double getTradeFinassetReduceQoq(){return tradeFinassetReduceQoq;}

    public void setInvestPayCash(Double investPayCash){this.investPayCash = investPayCash;}
    public Double getInvestPayCash(){return investPayCash;}

    public void setInvestPayCashYoy(Double investPayCashYoy){this.investPayCashYoy = investPayCashYoy;}
    public Double getInvestPayCashYoy(){return investPayCashYoy;}

    public void setInvestPayCashQoq(Double investPayCashQoq){this.investPayCashQoq = investPayCashQoq;}
    public Double getInvestPayCashQoq(){return investPayCashQoq;}

    public void setPledgeLoanAdd(Double pledgeLoanAdd){this.pledgeLoanAdd = pledgeLoanAdd;}
    public Double getPledgeLoanAdd(){return pledgeLoanAdd;}

    public void setPledgeLoanAddYoy(Double pledgeLoanAddYoy){this.pledgeLoanAddYoy = pledgeLoanAddYoy;}
    public Double getPledgeLoanAddYoy(){return pledgeLoanAddYoy;}

    public void setPledgeLoanAddQoq(Double pledgeLoanAddQoq){this.pledgeLoanAddQoq = pledgeLoanAddQoq;}
    public Double getPledgeLoanAddQoq(){return pledgeLoanAddQoq;}

    public void setObtainSubsidiaryOther(Double obtainSubsidiaryOther){this.obtainSubsidiaryOther = obtainSubsidiaryOther;}
    public Double getObtainSubsidiaryOther(){return obtainSubsidiaryOther;}

    public void setObtainSubsidiaryOtherYoy(Double obtainSubsidiaryOtherYoy){this.obtainSubsidiaryOtherYoy = obtainSubsidiaryOtherYoy;}
    public Double getObtainSubsidiaryOtherYoy(){return obtainSubsidiaryOtherYoy;}

    public void setObtainSubsidiaryOtherQoq(Double obtainSubsidiaryOtherQoq){this.obtainSubsidiaryOtherQoq = obtainSubsidiaryOtherQoq;}
    public Double getObtainSubsidiaryOtherQoq(){return obtainSubsidiaryOtherQoq;}

    public void setReceiveInterest(Double receiveInterest){this.receiveInterest = receiveInterest;}
    public Double getReceiveInterest(){return receiveInterest;}

    public void setReceiveInterestYoy(Double receiveInterestYoy){this.receiveInterestYoy = receiveInterestYoy;}
    public Double getReceiveInterestYoy(){return receiveInterestYoy;}

    public void setReceiveInterestQoq(Double receiveInterestQoq){this.receiveInterestQoq = receiveInterestQoq;}
    public Double getReceiveInterestQoq(){return receiveInterestQoq;}

    public void setReceiveCommission(Double receiveCommission){this.receiveCommission = receiveCommission;}
    public Double getReceiveCommission(){return receiveCommission;}

    public void setReceiveCommissionYoy(Double receiveCommissionYoy){this.receiveCommissionYoy = receiveCommissionYoy;}
    public Double getReceiveCommissionYoy(){return receiveCommissionYoy;}

    public void setReceiveCommissionQoq(Double receiveCommissionQoq){this.receiveCommissionQoq = receiveCommissionQoq;}
    public Double getReceiveCommissionQoq(){return receiveCommissionQoq;}

    public void setAddPledgeTimedeposits(Double addPledgeTimedeposits){this.addPledgeTimedeposits = addPledgeTimedeposits;}
    public Double getAddPledgeTimedeposits(){return addPledgeTimedeposits;}

    public void setAddPledgeTimedepositsYoy(Double addPledgeTimedepositsYoy){this.addPledgeTimedepositsYoy = addPledgeTimedepositsYoy;}
    public Double getAddPledgeTimedepositsYoy(){return addPledgeTimedepositsYoy;}

    public void setAddPledgeTimedepositsQoq(Double addPledgeTimedepositsQoq){this.addPledgeTimedepositsQoq = addPledgeTimedepositsQoq;}
    public Double getAddPledgeTimedepositsQoq(){return addPledgeTimedepositsQoq;}

    public void setDisposalMortgageAsset(Double disposalMortgageAsset){this.disposalMortgageAsset = disposalMortgageAsset;}
    public Double getDisposalMortgageAsset(){return disposalMortgageAsset;}

    public void setDisposalMortgageAssetYoy(Double disposalMortgageAssetYoy){this.disposalMortgageAssetYoy = disposalMortgageAssetYoy;}
    public Double getDisposalMortgageAssetYoy(){return disposalMortgageAssetYoy;}

    public void setDisposalMortgageAssetQoq(Double disposalMortgageAssetQoq){this.disposalMortgageAssetQoq = disposalMortgageAssetQoq;}
    public Double getDisposalMortgageAssetQoq(){return disposalMortgageAssetQoq;}

    public void setPayOtherInvest(Double payOtherInvest){this.payOtherInvest = payOtherInvest;}
    public Double getPayOtherInvest(){return payOtherInvest;}

    public void setPayOtherInvestYoy(Double payOtherInvestYoy){this.payOtherInvestYoy = payOtherInvestYoy;}
    public Double getPayOtherInvestYoy(){return payOtherInvestYoy;}

    public void setPayOtherInvestQoq(Double payOtherInvestQoq){this.payOtherInvestQoq = payOtherInvestQoq;}
    public Double getPayOtherInvestQoq(){return payOtherInvestQoq;}

    public void setWithdrawWriteoffLoan(Double withdrawWriteoffLoan){this.withdrawWriteoffLoan = withdrawWriteoffLoan;}
    public Double getWithdrawWriteoffLoan(){return withdrawWriteoffLoan;}

    public void setWithdrawWriteoffLoanYoy(Double withdrawWriteoffLoanYoy){this.withdrawWriteoffLoanYoy = withdrawWriteoffLoanYoy;}
    public Double getWithdrawWriteoffLoanYoy(){return withdrawWriteoffLoanYoy;}

    public void setWithdrawWriteoffLoanQoq(Double withdrawWriteoffLoanQoq){this.withdrawWriteoffLoanQoq = withdrawWriteoffLoanQoq;}
    public Double getWithdrawWriteoffLoanQoq(){return withdrawWriteoffLoanQoq;}

    public void setInvestOutflowOther(Double investOutflowOther){this.investOutflowOther = investOutflowOther;}
    public Double getInvestOutflowOther(){return investOutflowOther;}

    public void setInvestOutflowOtherYoy(Double investOutflowOtherYoy){this.investOutflowOtherYoy = investOutflowOtherYoy;}
    public Double getInvestOutflowOtherYoy(){return investOutflowOtherYoy;}

    public void setInvestOutflowOtherQoq(Double investOutflowOtherQoq){this.investOutflowOtherQoq = investOutflowOtherQoq;}
    public Double getInvestOutflowOtherQoq(){return investOutflowOtherQoq;}

    public void setInvestOutflowBalance(Double investOutflowBalance){this.investOutflowBalance = investOutflowBalance;}
    public Double getInvestOutflowBalance(){return investOutflowBalance;}

    public void setInvestOutflowBalanceYoy(Double investOutflowBalanceYoy){this.investOutflowBalanceYoy = investOutflowBalanceYoy;}
    public Double getInvestOutflowBalanceYoy(){return investOutflowBalanceYoy;}

    public void setInvestOutflowBalanceQoq(Double investOutflowBalanceQoq){this.investOutflowBalanceQoq = investOutflowBalanceQoq;}
    public Double getInvestOutflowBalanceQoq(){return investOutflowBalanceQoq;}

    public void setTotalInvestOutflow(Double totalInvestOutflow){this.totalInvestOutflow = totalInvestOutflow;}
    public Double getTotalInvestOutflow(){return totalInvestOutflow;}

    public void setTotalInvestOutflowYoy(Double totalInvestOutflowYoy){this.totalInvestOutflowYoy = totalInvestOutflowYoy;}
    public Double getTotalInvestOutflowYoy(){return totalInvestOutflowYoy;}

    public void setTotalInvestOutflowQoq(Double totalInvestOutflowQoq){this.totalInvestOutflowQoq = totalInvestOutflowQoq;}
    public Double getTotalInvestOutflowQoq(){return totalInvestOutflowQoq;}

    public void setInvestNetcashOther(Double investNetcashOther){this.investNetcashOther = investNetcashOther;}
    public Double getInvestNetcashOther(){return investNetcashOther;}

    public void setInvestNetcashOtherYoy(Double investNetcashOtherYoy){this.investNetcashOtherYoy = investNetcashOtherYoy;}
    public Double getInvestNetcashOtherYoy(){return investNetcashOtherYoy;}

    public void setInvestNetcashOtherQoq(Double investNetcashOtherQoq){this.investNetcashOtherQoq = investNetcashOtherQoq;}
    public Double getInvestNetcashOtherQoq(){return investNetcashOtherQoq;}

    public void setInvestNetcashBalance(Double investNetcashBalance){this.investNetcashBalance = investNetcashBalance;}
    public Double getInvestNetcashBalance(){return investNetcashBalance;}

    public void setInvestNetcashBalanceYoy(Double investNetcashBalanceYoy){this.investNetcashBalanceYoy = investNetcashBalanceYoy;}
    public Double getInvestNetcashBalanceYoy(){return investNetcashBalanceYoy;}

    public void setInvestNetcashBalanceQoq(Double investNetcashBalanceQoq){this.investNetcashBalanceQoq = investNetcashBalanceQoq;}
    public Double getInvestNetcashBalanceQoq(){return investNetcashBalanceQoq;}

    public void setNetcashInvest(Double netcashInvest){this.netcashInvest = netcashInvest;}
    public Double getNetcashInvest(){return netcashInvest;}

    public void setNetcashInvestYoy(Double netcashInvestYoy){this.netcashInvestYoy = netcashInvestYoy;}
    public Double getNetcashInvestYoy(){return netcashInvestYoy;}

    public void setNetcashInvestQoq(Double netcashInvestQoq){this.netcashInvestQoq = netcashInvestQoq;}
    public Double getNetcashInvestQoq(){return netcashInvestQoq;}

    public void setLoanPbcReduce(Double loanPbcReduce){this.loanPbcReduce = loanPbcReduce;}
    public Double getLoanPbcReduce(){return loanPbcReduce;}

    public void setLoanPbcReduceYoy(Double loanPbcReduceYoy){this.loanPbcReduceYoy = loanPbcReduceYoy;}
    public Double getLoanPbcReduceYoy(){return loanPbcReduceYoy;}

    public void setLoanPbcReduceQoq(Double loanPbcReduceQoq){this.loanPbcReduceQoq = loanPbcReduceQoq;}
    public Double getLoanPbcReduceQoq(){return loanPbcReduceQoq;}

    public void setAcceptInvestCash(Double acceptInvestCash){this.acceptInvestCash = acceptInvestCash;}
    public Double getAcceptInvestCash(){return acceptInvestCash;}

    public void setAcceptInvestCashYoy(Double acceptInvestCashYoy){this.acceptInvestCashYoy = acceptInvestCashYoy;}
    public Double getAcceptInvestCashYoy(){return acceptInvestCashYoy;}

    public void setAcceptInvestCashQoq(Double acceptInvestCashQoq){this.acceptInvestCashQoq = acceptInvestCashQoq;}
    public Double getAcceptInvestCashQoq(){return acceptInvestCashQoq;}

    public void setPbcIofiAdd(Double pbcIofiAdd){this.pbcIofiAdd = pbcIofiAdd;}
    public Double getPbcIofiAdd(){return pbcIofiAdd;}

    public void setPbcIofiAddYoy(Double pbcIofiAddYoy){this.pbcIofiAddYoy = pbcIofiAddYoy;}
    public Double getPbcIofiAddYoy(){return pbcIofiAddYoy;}

    public void setPbcIofiAddQoq(Double pbcIofiAddQoq){this.pbcIofiAddQoq = pbcIofiAddQoq;}
    public Double getPbcIofiAddQoq(){return pbcIofiAddQoq;}

    public void setSubsidiaryAcceptInvest(Double subsidiaryAcceptInvest){this.subsidiaryAcceptInvest = subsidiaryAcceptInvest;}
    public Double getSubsidiaryAcceptInvest(){return subsidiaryAcceptInvest;}

    public void setSubsidiaryAcceptInvestYoy(Double subsidiaryAcceptInvestYoy){this.subsidiaryAcceptInvestYoy = subsidiaryAcceptInvestYoy;}
    public Double getSubsidiaryAcceptInvestYoy(){return subsidiaryAcceptInvestYoy;}

    public void setSubsidiaryAcceptInvestQoq(Double subsidiaryAcceptInvestQoq){this.subsidiaryAcceptInvestQoq = subsidiaryAcceptInvestQoq;}
    public Double getSubsidiaryAcceptInvestQoq(){return subsidiaryAcceptInvestQoq;}

    public void setDepositPbcAdd(Double depositPbcAdd){this.depositPbcAdd = depositPbcAdd;}
    public Double getDepositPbcAdd(){return depositPbcAdd;}

    public void setDepositPbcAddYoy(Double depositPbcAddYoy){this.depositPbcAddYoy = depositPbcAddYoy;}
    public Double getDepositPbcAddYoy(){return depositPbcAddYoy;}

    public void setDepositPbcAddQoq(Double depositPbcAddQoq){this.depositPbcAddQoq = depositPbcAddQoq;}
    public Double getDepositPbcAddQoq(){return depositPbcAddQoq;}

    public void setReceiveLoanCash(Double receiveLoanCash){this.receiveLoanCash = receiveLoanCash;}
    public Double getReceiveLoanCash(){return receiveLoanCash;}

    public void setReceiveLoanCashYoy(Double receiveLoanCashYoy){this.receiveLoanCashYoy = receiveLoanCashYoy;}
    public Double getReceiveLoanCashYoy(){return receiveLoanCashYoy;}

    public void setReceiveLoanCashQoq(Double receiveLoanCashQoq){this.receiveLoanCashQoq = receiveLoanCashQoq;}
    public Double getReceiveLoanCashQoq(){return receiveLoanCashQoq;}

    public void setDepositIofiAdd(Double depositIofiAdd){this.depositIofiAdd = depositIofiAdd;}
    public Double getDepositIofiAdd(){return depositIofiAdd;}

    public void setDepositIofiAddYoy(Double depositIofiAddYoy){this.depositIofiAddYoy = depositIofiAddYoy;}
    public Double getDepositIofiAddYoy(){return depositIofiAddYoy;}

    public void setDepositIofiAddQoq(Double depositIofiAddQoq){this.depositIofiAddQoq = depositIofiAddQoq;}
    public Double getDepositIofiAddQoq(){return depositIofiAddQoq;}

    public void setIssueBond(Double issueBond){this.issueBond = issueBond;}
    public Double getIssueBond(){return issueBond;}

    public void setIssueBondYoy(Double issueBondYoy){this.issueBondYoy = issueBondYoy;}
    public Double getIssueBondYoy(){return issueBondYoy;}

    public void setIssueBondQoq(Double issueBondQoq){this.issueBondQoq = issueBondQoq;}
    public Double getIssueBondQoq(){return issueBondQoq;}

    public void setInterbankOtherReduce(Double interbankOtherReduce){this.interbankOtherReduce = interbankOtherReduce;}
    public Double getInterbankOtherReduce(){return interbankOtherReduce;}

    public void setInterbankOtherReduceYoy(Double interbankOtherReduceYoy){this.interbankOtherReduceYoy = interbankOtherReduceYoy;}
    public Double getInterbankOtherReduceYoy(){return interbankOtherReduceYoy;}

    public void setInterbankOtherReduceQoq(Double interbankOtherReduceQoq){this.interbankOtherReduceQoq = interbankOtherReduceQoq;}
    public Double getInterbankOtherReduceQoq(){return interbankOtherReduceQoq;}

    public void setReceiveOtherFinance(Double receiveOtherFinance){this.receiveOtherFinance = receiveOtherFinance;}
    public Double getReceiveOtherFinance(){return receiveOtherFinance;}

    public void setReceiveOtherFinanceYoy(Double receiveOtherFinanceYoy){this.receiveOtherFinanceYoy = receiveOtherFinanceYoy;}
    public Double getReceiveOtherFinanceYoy(){return receiveOtherFinanceYoy;}

    public void setReceiveOtherFinanceQoq(Double receiveOtherFinanceQoq){this.receiveOtherFinanceQoq = receiveOtherFinanceQoq;}
    public Double getReceiveOtherFinanceQoq(){return receiveOtherFinanceQoq;}

    public void setIssuedCdReduce(Double issuedCdReduce){this.issuedCdReduce = issuedCdReduce;}
    public Double getIssuedCdReduce(){return issuedCdReduce;}

    public void setIssuedCdReduceYoy(Double issuedCdReduceYoy){this.issuedCdReduceYoy = issuedCdReduceYoy;}
    public Double getIssuedCdReduceYoy(){return issuedCdReduceYoy;}

    public void setIssuedCdReduceQoq(Double issuedCdReduceQoq){this.issuedCdReduceQoq = issuedCdReduceQoq;}
    public Double getIssuedCdReduceQoq(){return issuedCdReduceQoq;}

    public void setFinanceInflowOther(Double financeInflowOther){this.financeInflowOther = financeInflowOther;}
    public Double getFinanceInflowOther(){return financeInflowOther;}

    public void setFinanceInflowOtherYoy(Double financeInflowOtherYoy){this.financeInflowOtherYoy = financeInflowOtherYoy;}
    public Double getFinanceInflowOtherYoy(){return financeInflowOtherYoy;}

    public void setFinanceInflowOtherQoq(Double financeInflowOtherQoq){this.financeInflowOtherQoq = financeInflowOtherQoq;}
    public Double getFinanceInflowOtherQoq(){return financeInflowOtherQoq;}

    public void setLendResaleAdd(Double lendResaleAdd){this.lendResaleAdd = lendResaleAdd;}
    public Double getLendResaleAdd(){return lendResaleAdd;}

    public void setLendResaleAddYoy(Double lendResaleAddYoy){this.lendResaleAddYoy = lendResaleAddYoy;}
    public Double getLendResaleAddYoy(){return lendResaleAddYoy;}

    public void setLendResaleAddQoq(Double lendResaleAddQoq){this.lendResaleAddQoq = lendResaleAddQoq;}
    public Double getLendResaleAddQoq(){return lendResaleAddQoq;}

    public void setFinanceInflowBalance(Double financeInflowBalance){this.financeInflowBalance = financeInflowBalance;}
    public Double getFinanceInflowBalance(){return financeInflowBalance;}

    public void setFinanceInflowBalanceYoy(Double financeInflowBalanceYoy){this.financeInflowBalanceYoy = financeInflowBalanceYoy;}
    public Double getFinanceInflowBalanceYoy(){return financeInflowBalanceYoy;}

    public void setFinanceInflowBalanceQoq(Double financeInflowBalanceQoq){this.financeInflowBalanceQoq = financeInflowBalanceQoq;}
    public Double getFinanceInflowBalanceQoq(){return financeInflowBalanceQoq;}

    public void setLendFundAdd(Double lendFundAdd){this.lendFundAdd = lendFundAdd;}
    public Double getLendFundAdd(){return lendFundAdd;}

    public void setLendFundAddYoy(Double lendFundAddYoy){this.lendFundAddYoy = lendFundAddYoy;}
    public Double getLendFundAddYoy(){return lendFundAddYoy;}

    public void setLendFundAddQoq(Double lendFundAddQoq){this.lendFundAddQoq = lendFundAddQoq;}
    public Double getLendFundAddQoq(){return lendFundAddQoq;}

    public void setTotalFinanceInflow(Double totalFinanceInflow){this.totalFinanceInflow = totalFinanceInflow;}
    public Double getTotalFinanceInflow(){return totalFinanceInflow;}

    public void setTotalFinanceInflowYoy(Double totalFinanceInflowYoy){this.totalFinanceInflowYoy = totalFinanceInflowYoy;}
    public Double getTotalFinanceInflowYoy(){return totalFinanceInflowYoy;}

    public void setTotalFinanceInflowQoq(Double totalFinanceInflowQoq){this.totalFinanceInflowQoq = totalFinanceInflowQoq;}
    public Double getTotalFinanceInflowQoq(){return totalFinanceInflowQoq;}

    public void setBuyResaleAdd(Double buyResaleAdd){this.buyResaleAdd = buyResaleAdd;}
    public Double getBuyResaleAdd(){return buyResaleAdd;}

    public void setBuyResaleAddYoy(Double buyResaleAddYoy){this.buyResaleAddYoy = buyResaleAddYoy;}
    public Double getBuyResaleAddYoy(){return buyResaleAddYoy;}

    public void setBuyResaleAddQoq(Double buyResaleAddQoq){this.buyResaleAddQoq = buyResaleAddQoq;}
    public Double getBuyResaleAddQoq(){return buyResaleAddQoq;}

    public void setPayDebtCash(Double payDebtCash){this.payDebtCash = payDebtCash;}
    public Double getPayDebtCash(){return payDebtCash;}

    public void setPayDebtCashYoy(Double payDebtCashYoy){this.payDebtCashYoy = payDebtCashYoy;}
    public Double getPayDebtCashYoy(){return payDebtCashYoy;}

    public void setPayDebtCashQoq(Double payDebtCashQoq){this.payDebtCashQoq = payDebtCashQoq;}
    public Double getPayDebtCashQoq(){return payDebtCashQoq;}

    public void setBorrowRepoReduce(Double borrowRepoReduce){this.borrowRepoReduce = borrowRepoReduce;}
    public Double getBorrowRepoReduce(){return borrowRepoReduce;}

    public void setBorrowRepoReduceYoy(Double borrowRepoReduceYoy){this.borrowRepoReduceYoy = borrowRepoReduceYoy;}
    public Double getBorrowRepoReduceYoy(){return borrowRepoReduceYoy;}

    public void setBorrowRepoReduceQoq(Double borrowRepoReduceQoq){this.borrowRepoReduceQoq = borrowRepoReduceQoq;}
    public Double getBorrowRepoReduceQoq(){return borrowRepoReduceQoq;}

    public void setAssignDividendPorfit(Double assignDividendPorfit){this.assignDividendPorfit = assignDividendPorfit;}
    public Double getAssignDividendPorfit(){return assignDividendPorfit;}

    public void setAssignDividendPorfitYoy(Double assignDividendPorfitYoy){this.assignDividendPorfitYoy = assignDividendPorfitYoy;}
    public Double getAssignDividendPorfitYoy(){return assignDividendPorfitYoy;}

    public void setAssignDividendPorfitQoq(Double assignDividendPorfitQoq){this.assignDividendPorfitQoq = assignDividendPorfitQoq;}
    public Double getAssignDividendPorfitQoq(){return assignDividendPorfitQoq;}

    public void setBorrowFundReduce(Double borrowFundReduce){this.borrowFundReduce = borrowFundReduce;}
    public Double getBorrowFundReduce(){return borrowFundReduce;}

    public void setBorrowFundReduceYoy(Double borrowFundReduceYoy){this.borrowFundReduceYoy = borrowFundReduceYoy;}
    public Double getBorrowFundReduceYoy(){return borrowFundReduceYoy;}

    public void setBorrowFundReduceQoq(Double borrowFundReduceQoq){this.borrowFundReduceQoq = borrowFundReduceQoq;}
    public Double getBorrowFundReduceQoq(){return borrowFundReduceQoq;}

    public void setSubsidiaryPayDividend(Double subsidiaryPayDividend){this.subsidiaryPayDividend = subsidiaryPayDividend;}
    public Double getSubsidiaryPayDividend(){return subsidiaryPayDividend;}

    public void setSubsidiaryPayDividendYoy(Double subsidiaryPayDividendYoy){this.subsidiaryPayDividendYoy = subsidiaryPayDividendYoy;}
    public Double getSubsidiaryPayDividendYoy(){return subsidiaryPayDividendYoy;}

    public void setSubsidiaryPayDividendQoq(Double subsidiaryPayDividendQoq){this.subsidiaryPayDividendQoq = subsidiaryPayDividendQoq;}
    public Double getSubsidiaryPayDividendQoq(){return subsidiaryPayDividendQoq;}

    public void setSellRepoReduce(Double sellRepoReduce){this.sellRepoReduce = sellRepoReduce;}
    public Double getSellRepoReduce(){return sellRepoReduce;}

    public void setSellRepoReduceYoy(Double sellRepoReduceYoy){this.sellRepoReduceYoy = sellRepoReduceYoy;}
    public Double getSellRepoReduceYoy(){return sellRepoReduceYoy;}

    public void setSellRepoReduceQoq(Double sellRepoReduceQoq){this.sellRepoReduceQoq = sellRepoReduceQoq;}
    public Double getSellRepoReduceQoq(){return sellRepoReduceQoq;}

    public void setBuySubsidiaryEquity(Double buySubsidiaryEquity){this.buySubsidiaryEquity = buySubsidiaryEquity;}
    public Double getBuySubsidiaryEquity(){return buySubsidiaryEquity;}

    public void setBuySubsidiaryEquityYoy(Double buySubsidiaryEquityYoy){this.buySubsidiaryEquityYoy = buySubsidiaryEquityYoy;}
    public Double getBuySubsidiaryEquityYoy(){return buySubsidiaryEquityYoy;}

    public void setBuySubsidiaryEquityQoq(Double buySubsidiaryEquityQoq){this.buySubsidiaryEquityQoq = buySubsidiaryEquityQoq;}
    public Double getBuySubsidiaryEquityQoq(){return buySubsidiaryEquityQoq;}

    public void setTradeFinassetAdd(Double tradeFinassetAdd){this.tradeFinassetAdd = tradeFinassetAdd;}
    public Double getTradeFinassetAdd(){return tradeFinassetAdd;}

    public void setTradeFinassetAddYoy(Double tradeFinassetAddYoy){this.tradeFinassetAddYoy = tradeFinassetAddYoy;}
    public Double getTradeFinassetAddYoy(){return tradeFinassetAddYoy;}

    public void setTradeFinassetAddQoq(Double tradeFinassetAddQoq){this.tradeFinassetAddQoq = tradeFinassetAddQoq;}
    public Double getTradeFinassetAddQoq(){return tradeFinassetAddQoq;}

    public void setPayOtherFinance(Double payOtherFinance){this.payOtherFinance = payOtherFinance;}
    public Double getPayOtherFinance(){return payOtherFinance;}

    public void setPayOtherFinanceYoy(Double payOtherFinanceYoy){this.payOtherFinanceYoy = payOtherFinanceYoy;}
    public Double getPayOtherFinanceYoy(){return payOtherFinanceYoy;}

    public void setPayOtherFinanceQoq(Double payOtherFinanceQoq){this.payOtherFinanceQoq = payOtherFinanceQoq;}
    public Double getPayOtherFinanceQoq(){return payOtherFinanceQoq;}

    public void setTradeFinliabReduce(Double tradeFinliabReduce){this.tradeFinliabReduce = tradeFinliabReduce;}
    public Double getTradeFinliabReduce(){return tradeFinliabReduce;}

    public void setTradeFinliabReduceYoy(Double tradeFinliabReduceYoy){this.tradeFinliabReduceYoy = tradeFinliabReduceYoy;}
    public Double getTradeFinliabReduceYoy(){return tradeFinliabReduceYoy;}

    public void setTradeFinliabReduceQoq(Double tradeFinliabReduceQoq){this.tradeFinliabReduceQoq = tradeFinliabReduceQoq;}
    public Double getTradeFinliabReduceQoq(){return tradeFinliabReduceQoq;}

    public void setSubsidiaryReduceCash(Double subsidiaryReduceCash){this.subsidiaryReduceCash = subsidiaryReduceCash;}
    public Double getSubsidiaryReduceCash(){return subsidiaryReduceCash;}

    public void setSubsidiaryReduceCashYoy(Double subsidiaryReduceCashYoy){this.subsidiaryReduceCashYoy = subsidiaryReduceCashYoy;}
    public Double getSubsidiaryReduceCashYoy(){return subsidiaryReduceCashYoy;}

    public void setSubsidiaryReduceCashQoq(Double subsidiaryReduceCashQoq){this.subsidiaryReduceCashQoq = subsidiaryReduceCashQoq;}
    public Double getSubsidiaryReduceCashQoq(){return subsidiaryReduceCashQoq;}

    public void setFinanceOutflowOther(Double financeOutflowOther){this.financeOutflowOther = financeOutflowOther;}
    public Double getFinanceOutflowOther(){return financeOutflowOther;}

    public void setFinanceOutflowOtherYoy(Double financeOutflowOtherYoy){this.financeOutflowOtherYoy = financeOutflowOtherYoy;}
    public Double getFinanceOutflowOtherYoy(){return financeOutflowOtherYoy;}

    public void setFinanceOutflowOtherQoq(Double financeOutflowOtherQoq){this.financeOutflowOtherQoq = financeOutflowOtherQoq;}
    public Double getFinanceOutflowOtherQoq(){return financeOutflowOtherQoq;}

    public void setPayInterest(Double payInterest){this.payInterest = payInterest;}
    public Double getPayInterest(){return payInterest;}

    public void setPayInterestYoy(Double payInterestYoy){this.payInterestYoy = payInterestYoy;}
    public Double getPayInterestYoy(){return payInterestYoy;}

    public void setPayInterestQoq(Double payInterestQoq){this.payInterestQoq = payInterestQoq;}
    public Double getPayInterestQoq(){return payInterestQoq;}

    public void setFinanceOutflowBalance(Double financeOutflowBalance){this.financeOutflowBalance = financeOutflowBalance;}
    public Double getFinanceOutflowBalance(){return financeOutflowBalance;}

    public void setFinanceOutflowBalanceYoy(Double financeOutflowBalanceYoy){this.financeOutflowBalanceYoy = financeOutflowBalanceYoy;}
    public Double getFinanceOutflowBalanceYoy(){return financeOutflowBalanceYoy;}

    public void setFinanceOutflowBalanceQoq(Double financeOutflowBalanceQoq){this.financeOutflowBalanceQoq = financeOutflowBalanceQoq;}
    public Double getFinanceOutflowBalanceQoq(){return financeOutflowBalanceQoq;}

    public void setPayCommission(Double payCommission){this.payCommission = payCommission;}
    public Double getPayCommission(){return payCommission;}

    public void setPayCommissionYoy(Double payCommissionYoy){this.payCommissionYoy = payCommissionYoy;}
    public Double getPayCommissionYoy(){return payCommissionYoy;}

    public void setPayCommissionQoq(Double payCommissionQoq){this.payCommissionQoq = payCommissionQoq;}
    public Double getPayCommissionQoq(){return payCommissionQoq;}

    public void setTotalFinanceOutflow(Double totalFinanceOutflow){this.totalFinanceOutflow = totalFinanceOutflow;}
    public Double getTotalFinanceOutflow(){return totalFinanceOutflow;}

    public void setTotalFinanceOutflowYoy(Double totalFinanceOutflowYoy){this.totalFinanceOutflowYoy = totalFinanceOutflowYoy;}
    public Double getTotalFinanceOutflowYoy(){return totalFinanceOutflowYoy;}

    public void setTotalFinanceOutflowQoq(Double totalFinanceOutflowQoq){this.totalFinanceOutflowQoq = totalFinanceOutflowQoq;}
    public Double getTotalFinanceOutflowQoq(){return totalFinanceOutflowQoq;}

    public void setFinanceNetcashOther(Double financeNetcashOther){this.financeNetcashOther = financeNetcashOther;}
    public Double getFinanceNetcashOther(){return financeNetcashOther;}

    public void setFinanceNetcashOtherYoy(Double financeNetcashOtherYoy){this.financeNetcashOtherYoy = financeNetcashOtherYoy;}
    public Double getFinanceNetcashOtherYoy(){return financeNetcashOtherYoy;}

    public void setFinanceNetcashOtherQoq(Double financeNetcashOtherQoq){this.financeNetcashOtherQoq = financeNetcashOtherQoq;}
    public Double getFinanceNetcashOtherQoq(){return financeNetcashOtherQoq;}

    public void setBuyFinLease(Double buyFinLease){this.buyFinLease = buyFinLease;}
    public Double getBuyFinLease(){return buyFinLease;}

    public void setBuyFinLeaseYoy(Double buyFinLeaseYoy){this.buyFinLeaseYoy = buyFinLeaseYoy;}
    public Double getBuyFinLeaseYoy(){return buyFinLeaseYoy;}

    public void setBuyFinLeaseQoq(Double buyFinLeaseQoq){this.buyFinLeaseQoq = buyFinLeaseQoq;}
    public Double getBuyFinLeaseQoq(){return buyFinLeaseQoq;}

    public void setFinanceNetcashBalance(Double financeNetcashBalance){this.financeNetcashBalance = financeNetcashBalance;}
    public Double getFinanceNetcashBalance(){return financeNetcashBalance;}

    public void setFinanceNetcashBalanceYoy(Double financeNetcashBalanceYoy){this.financeNetcashBalanceYoy = financeNetcashBalanceYoy;}
    public Double getFinanceNetcashBalanceYoy(){return financeNetcashBalanceYoy;}

    public void setFinanceNetcashBalanceQoq(Double financeNetcashBalanceQoq){this.financeNetcashBalanceQoq = financeNetcashBalanceQoq;}
    public Double getFinanceNetcashBalanceQoq(){return financeNetcashBalanceQoq;}

    public void setAccountsReceAdd(Double accountsReceAdd){this.accountsReceAdd = accountsReceAdd;}
    public Double getAccountsReceAdd(){return accountsReceAdd;}

    public void setAccountsReceAddYoy(Double accountsReceAddYoy){this.accountsReceAddYoy = accountsReceAddYoy;}
    public Double getAccountsReceAddYoy(){return accountsReceAddYoy;}

    public void setAccountsReceAddQoq(Double accountsReceAddQoq){this.accountsReceAddQoq = accountsReceAddQoq;}
    public Double getAccountsReceAddQoq(){return accountsReceAddQoq;}

    public void setNetcashFinance(Double netcashFinance){this.netcashFinance = netcashFinance;}
    public Double getNetcashFinance(){return netcashFinance;}

    public void setNetcashFinanceYoy(Double netcashFinanceYoy){this.netcashFinanceYoy = netcashFinanceYoy;}
    public Double getNetcashFinanceYoy(){return netcashFinanceYoy;}

    public void setNetcashFinanceQoq(Double netcashFinanceQoq){this.netcashFinanceQoq = netcashFinanceQoq;}
    public Double getNetcashFinanceQoq(){return netcashFinanceQoq;}

    public void setRateChangeEffect(Double rateChangeEffect){this.rateChangeEffect = rateChangeEffect;}
    public Double getRateChangeEffect(){return rateChangeEffect;}

    public void setRateChangeEffectYoy(Double rateChangeEffectYoy){this.rateChangeEffectYoy = rateChangeEffectYoy;}
    public Double getRateChangeEffectYoy(){return rateChangeEffectYoy;}

    public void setRateChangeEffectQoq(Double rateChangeEffectQoq){this.rateChangeEffectQoq = rateChangeEffectQoq;}
    public Double getRateChangeEffectQoq(){return rateChangeEffectQoq;}

    public void setCceAddOther(Double cceAddOther){this.cceAddOther = cceAddOther;}
    public Double getCceAddOther(){return cceAddOther;}

    public void setCceAddOtherYoy(Double cceAddOtherYoy){this.cceAddOtherYoy = cceAddOtherYoy;}
    public Double getCceAddOtherYoy(){return cceAddOtherYoy;}

    public void setCceAddOtherQoq(Double cceAddOtherQoq){this.cceAddOtherQoq = cceAddOtherQoq;}
    public Double getCceAddOtherQoq(){return cceAddOtherQoq;}

    public void setCceAddBalance(Double cceAddBalance){this.cceAddBalance = cceAddBalance;}
    public Double getCceAddBalance(){return cceAddBalance;}

    public void setCceAddBalanceYoy(Double cceAddBalanceYoy){this.cceAddBalanceYoy = cceAddBalanceYoy;}
    public Double getCceAddBalanceYoy(){return cceAddBalanceYoy;}

    public void setCceAddBalanceQoq(Double cceAddBalanceQoq){this.cceAddBalanceQoq = cceAddBalanceQoq;}
    public Double getCceAddBalanceQoq(){return cceAddBalanceQoq;}

    public void setCceAdd(Double cceAdd){this.cceAdd = cceAdd;}
    public Double getCceAdd(){return cceAdd;}

    public void setCceAddYoy(Double cceAddYoy){this.cceAddYoy = cceAddYoy;}
    public Double getCceAddYoy(){return cceAddYoy;}

    public void setCceAddQoq(Double cceAddQoq){this.cceAddQoq = cceAddQoq;}
    public Double getCceAddQoq(){return cceAddQoq;}

    public void setBeginCce(Double beginCce){this.beginCce = beginCce;}
    public Double getBeginCce(){return beginCce;}

    public void setBeginCceYoy(Double beginCceYoy){this.beginCceYoy = beginCceYoy;}
    public Double getBeginCceYoy(){return beginCceYoy;}

    public void setBeginCceQoq(Double beginCceQoq){this.beginCceQoq = beginCceQoq;}
    public Double getBeginCceQoq(){return beginCceQoq;}

    public void setEndCceOther(Double endCceOther){this.endCceOther = endCceOther;}
    public Double getEndCceOther(){return endCceOther;}

    public void setEndCceOtherYoy(Double endCceOtherYoy){this.endCceOtherYoy = endCceOtherYoy;}
    public Double getEndCceOtherYoy(){return endCceOtherYoy;}

    public void setEndCceOtherQoq(Double endCceOtherQoq){this.endCceOtherQoq = endCceOtherQoq;}
    public Double getEndCceOtherQoq(){return endCceOtherQoq;}

    public void setEndCceBalance(Double endCceBalance){this.endCceBalance = endCceBalance;}
    public Double getEndCceBalance(){return endCceBalance;}

    public void setEndCceBalanceYoy(Double endCceBalanceYoy){this.endCceBalanceYoy = endCceBalanceYoy;}
    public Double getEndCceBalanceYoy(){return endCceBalanceYoy;}

    public void setEndCceBalanceQoq(Double endCceBalanceQoq){this.endCceBalanceQoq = endCceBalanceQoq;}
    public Double getEndCceBalanceQoq(){return endCceBalanceQoq;}

    public void setEndCce(Double endCce){this.endCce = endCce;}
    public Double getEndCce(){return endCce;}

    public void setEndCceYoy(Double endCceYoy){this.endCceYoy = endCceYoy;}
    public Double getEndCceYoy(){return endCceYoy;}

    public void setEndCceQoq(Double endCceQoq){this.endCceQoq = endCceQoq;}
    public Double getEndCceQoq(){return endCceQoq;}

    public void setNetprofit(Double netprofit){this.netprofit = netprofit;}
    public Double getNetprofit(){return netprofit;}

    public void setNetprofitYoy(Double netprofitYoy){this.netprofitYoy = netprofitYoy;}
    public Double getNetprofitYoy(){return netprofitYoy;}

    public void setNetprofitQoq(Double netprofitQoq){this.netprofitQoq = netprofitQoq;}
    public Double getNetprofitQoq(){return netprofitQoq;}

    public void setMinorityInterest(Double minorityInterest){this.minorityInterest = minorityInterest;}
    public Double getMinorityInterest(){return minorityInterest;}

    public void setMinorityInterestYoy(Double minorityInterestYoy){this.minorityInterestYoy = minorityInterestYoy;}
    public Double getMinorityInterestYoy(){return minorityInterestYoy;}

    public void setMinorityInterestQoq(Double minorityInterestQoq){this.minorityInterestQoq = minorityInterestQoq;}
    public Double getMinorityInterestQoq(){return minorityInterestQoq;}

    public void setReceiveDividendProfit(Double receiveDividendProfit){this.receiveDividendProfit = receiveDividendProfit;}
    public Double getReceiveDividendProfit(){return receiveDividendProfit;}

    public void setReceiveDividendProfitYoy(Double receiveDividendProfitYoy){this.receiveDividendProfitYoy = receiveDividendProfitYoy;}
    public Double getReceiveDividendProfitYoy(){return receiveDividendProfitYoy;}

    public void setReceiveDividendProfitQoq(Double receiveDividendProfitQoq){this.receiveDividendProfitQoq = receiveDividendProfitQoq;}
    public Double getReceiveDividendProfitQoq(){return receiveDividendProfitQoq;}

    public void setAssetImpairment(Double assetImpairment){this.assetImpairment = assetImpairment;}
    public Double getAssetImpairment(){return assetImpairment;}

    public void setAssetImpairmentYoy(Double assetImpairmentYoy){this.assetImpairmentYoy = assetImpairmentYoy;}
    public Double getAssetImpairmentYoy(){return assetImpairmentYoy;}

    public void setAssetImpairmentQoq(Double assetImpairmentQoq){this.assetImpairmentQoq = assetImpairmentQoq;}
    public Double getAssetImpairmentQoq(){return assetImpairmentQoq;}

    public void setFaIrDepr(Double faIrDepr){this.faIrDepr = faIrDepr;}
    public Double getFaIrDepr(){return faIrDepr;}

    public void setFaIrDeprYoy(Double faIrDeprYoy){this.faIrDeprYoy = faIrDeprYoy;}
    public Double getFaIrDeprYoy(){return faIrDeprYoy;}

    public void setFaIrDeprQoq(Double faIrDeprQoq){this.faIrDeprQoq = faIrDeprQoq;}
    public Double getFaIrDeprQoq(){return faIrDeprQoq;}

    public void setDisposalSubsidiaryJoint(Double disposalSubsidiaryJoint){this.disposalSubsidiaryJoint = disposalSubsidiaryJoint;}
    public Double getDisposalSubsidiaryJoint(){return disposalSubsidiaryJoint;}

    public void setDisposalSubsidiaryJointYoy(Double disposalSubsidiaryJointYoy){this.disposalSubsidiaryJointYoy = disposalSubsidiaryJointYoy;}
    public Double getDisposalSubsidiaryJointYoy(){return disposalSubsidiaryJointYoy;}

    public void setDisposalSubsidiaryJointQoq(Double disposalSubsidiaryJointQoq){this.disposalSubsidiaryJointQoq = disposalSubsidiaryJointQoq;}
    public Double getDisposalSubsidiaryJointQoq(){return disposalSubsidiaryJointQoq;}

    public void setOilgasBiologyDepr(Double oilgasBiologyDepr){this.oilgasBiologyDepr = oilgasBiologyDepr;}
    public Double getOilgasBiologyDepr(){return oilgasBiologyDepr;}

    public void setOilgasBiologyDeprYoy(Double oilgasBiologyDeprYoy){this.oilgasBiologyDeprYoy = oilgasBiologyDeprYoy;}
    public Double getOilgasBiologyDeprYoy(){return oilgasBiologyDeprYoy;}

    public void setOilgasBiologyDeprQoq(Double oilgasBiologyDeprQoq){this.oilgasBiologyDeprQoq = oilgasBiologyDeprQoq;}
    public Double getOilgasBiologyDeprQoq(){return oilgasBiologyDeprQoq;}

    public void setIrDepr(Double irDepr){this.irDepr = irDepr;}
    public Double getIrDepr(){return irDepr;}

    public void setIrDeprYoy(Double irDeprYoy){this.irDeprYoy = irDeprYoy;}
    public Double getIrDeprYoy(){return irDeprYoy;}

    public void setIrDeprQoq(Double irDeprQoq){this.irDeprQoq = irDeprQoq;}
    public Double getIrDeprQoq(){return irDeprQoq;}

    public void setIaAmortize(Double iaAmortize){this.iaAmortize = iaAmortize;}
    public Double getIaAmortize(){return iaAmortize;}

    public void setIaAmortizeYoy(Double iaAmortizeYoy){this.iaAmortizeYoy = iaAmortizeYoy;}
    public Double getIaAmortizeYoy(){return iaAmortizeYoy;}

    public void setIaAmortizeQoq(Double iaAmortizeQoq){this.iaAmortizeQoq = iaAmortizeQoq;}
    public Double getIaAmortizeQoq(){return iaAmortizeQoq;}

    public void setLpeAmortize(Double lpeAmortize){this.lpeAmortize = lpeAmortize;}
    public Double getLpeAmortize(){return lpeAmortize;}

    public void setLpeAmortizeYoy(Double lpeAmortizeYoy){this.lpeAmortizeYoy = lpeAmortizeYoy;}
    public Double getLpeAmortizeYoy(){return lpeAmortizeYoy;}

    public void setLpeAmortizeQoq(Double lpeAmortizeQoq){this.lpeAmortizeQoq = lpeAmortizeQoq;}
    public Double getLpeAmortizeQoq(){return lpeAmortizeQoq;}

    public void setDeferIncomeAmortize(Double deferIncomeAmortize){this.deferIncomeAmortize = deferIncomeAmortize;}
    public Double getDeferIncomeAmortize(){return deferIncomeAmortize;}

    public void setDeferIncomeAmortizeYoy(Double deferIncomeAmortizeYoy){this.deferIncomeAmortizeYoy = deferIncomeAmortizeYoy;}
    public Double getDeferIncomeAmortizeYoy(){return deferIncomeAmortizeYoy;}

    public void setDeferIncomeAmortizeQoq(Double deferIncomeAmortizeQoq){this.deferIncomeAmortizeQoq = deferIncomeAmortizeQoq;}
    public Double getDeferIncomeAmortizeQoq(){return deferIncomeAmortizeQoq;}

    public void setPrepaidExpenseReduce(Double prepaidExpenseReduce){this.prepaidExpenseReduce = prepaidExpenseReduce;}
    public Double getPrepaidExpenseReduce(){return prepaidExpenseReduce;}

    public void setPrepaidExpenseReduceYoy(Double prepaidExpenseReduceYoy){this.prepaidExpenseReduceYoy = prepaidExpenseReduceYoy;}
    public Double getPrepaidExpenseReduceYoy(){return prepaidExpenseReduceYoy;}

    public void setPrepaidExpenseReduceQoq(Double prepaidExpenseReduceQoq){this.prepaidExpenseReduceQoq = prepaidExpenseReduceQoq;}
    public Double getPrepaidExpenseReduceQoq(){return prepaidExpenseReduceQoq;}

    public void setAccruedExpenseAdd(Double accruedExpenseAdd){this.accruedExpenseAdd = accruedExpenseAdd;}
    public Double getAccruedExpenseAdd(){return accruedExpenseAdd;}

    public void setAccruedExpenseAddYoy(Double accruedExpenseAddYoy){this.accruedExpenseAddYoy = accruedExpenseAddYoy;}
    public Double getAccruedExpenseAddYoy(){return accruedExpenseAddYoy;}

    public void setAccruedExpenseAddQoq(Double accruedExpenseAddQoq){this.accruedExpenseAddQoq = accruedExpenseAddQoq;}
    public Double getAccruedExpenseAddQoq(){return accruedExpenseAddQoq;}

    public void setDisposalLongassetLoss(Double disposalLongassetLoss){this.disposalLongassetLoss = disposalLongassetLoss;}
    public Double getDisposalLongassetLoss(){return disposalLongassetLoss;}

    public void setDisposalLongassetLossYoy(Double disposalLongassetLossYoy){this.disposalLongassetLossYoy = disposalLongassetLossYoy;}
    public Double getDisposalLongassetLossYoy(){return disposalLongassetLossYoy;}

    public void setDisposalLongassetLossQoq(Double disposalLongassetLossQoq){this.disposalLongassetLossQoq = disposalLongassetLossQoq;}
    public Double getDisposalLongassetLossQoq(){return disposalLongassetLossQoq;}

    public void setFaScrapLoss(Double faScrapLoss){this.faScrapLoss = faScrapLoss;}
    public Double getFaScrapLoss(){return faScrapLoss;}

    public void setFaScrapLossYoy(Double faScrapLossYoy){this.faScrapLossYoy = faScrapLossYoy;}
    public Double getFaScrapLossYoy(){return faScrapLossYoy;}

    public void setFaScrapLossQoq(Double faScrapLossQoq){this.faScrapLossQoq = faScrapLossQoq;}
    public Double getFaScrapLossQoq(){return faScrapLossQoq;}

    public void setFairvalueChangeLoss(Double fairvalueChangeLoss){this.fairvalueChangeLoss = fairvalueChangeLoss;}
    public Double getFairvalueChangeLoss(){return fairvalueChangeLoss;}

    public void setFairvalueChangeLossYoy(Double fairvalueChangeLossYoy){this.fairvalueChangeLossYoy = fairvalueChangeLossYoy;}
    public Double getFairvalueChangeLossYoy(){return fairvalueChangeLossYoy;}

    public void setFairvalueChangeLossQoq(Double fairvalueChangeLossQoq){this.fairvalueChangeLossQoq = fairvalueChangeLossQoq;}
    public Double getFairvalueChangeLossQoq(){return fairvalueChangeLossQoq;}

    public void setFinanceExpense(Double financeExpense){this.financeExpense = financeExpense;}
    public Double getFinanceExpense(){return financeExpense;}

    public void setFinanceExpenseYoy(Double financeExpenseYoy){this.financeExpenseYoy = financeExpenseYoy;}
    public Double getFinanceExpenseYoy(){return financeExpenseYoy;}

    public void setFinanceExpenseQoq(Double financeExpenseQoq){this.financeExpenseQoq = financeExpenseQoq;}
    public Double getFinanceExpenseQoq(){return financeExpenseQoq;}

    public void setInvestLoss(Double investLoss){this.investLoss = investLoss;}
    public Double getInvestLoss(){return investLoss;}

    public void setInvestLossYoy(Double investLossYoy){this.investLossYoy = investLossYoy;}
    public Double getInvestLossYoy(){return investLossYoy;}

    public void setInvestLossQoq(Double investLossQoq){this.investLossQoq = investLossQoq;}
    public Double getInvestLossQoq(){return investLossQoq;}

    public void setDeferTax(Double deferTax){this.deferTax = deferTax;}
    public Double getDeferTax(){return deferTax;}

    public void setDeferTaxYoy(Double deferTaxYoy){this.deferTaxYoy = deferTaxYoy;}
    public Double getDeferTaxYoy(){return deferTaxYoy;}

    public void setDeferTaxQoq(Double deferTaxQoq){this.deferTaxQoq = deferTaxQoq;}
    public Double getDeferTaxQoq(){return deferTaxQoq;}

    public void setIssueSubbond(Double issueSubbond){this.issueSubbond = issueSubbond;}
    public Double getIssueSubbond(){return issueSubbond;}

    public void setIssueSubbondYoy(Double issueSubbondYoy){this.issueSubbondYoy = issueSubbondYoy;}
    public Double getIssueSubbondYoy(){return issueSubbondYoy;}

    public void setIssueSubbondQoq(Double issueSubbondQoq){this.issueSubbondQoq = issueSubbondQoq;}
    public Double getIssueSubbondQoq(){return issueSubbondQoq;}

    public void setDtAssetReduce(Double dtAssetReduce){this.dtAssetReduce = dtAssetReduce;}
    public Double getDtAssetReduce(){return dtAssetReduce;}

    public void setDtAssetReduceYoy(Double dtAssetReduceYoy){this.dtAssetReduceYoy = dtAssetReduceYoy;}
    public Double getDtAssetReduceYoy(){return dtAssetReduceYoy;}

    public void setDtAssetReduceQoq(Double dtAssetReduceQoq){this.dtAssetReduceQoq = dtAssetReduceQoq;}
    public Double getDtAssetReduceQoq(){return dtAssetReduceQoq;}

    public void setIssueOtherBond(Double issueOtherBond){this.issueOtherBond = issueOtherBond;}
    public Double getIssueOtherBond(){return issueOtherBond;}

    public void setIssueOtherBondYoy(Double issueOtherBondYoy){this.issueOtherBondYoy = issueOtherBondYoy;}
    public Double getIssueOtherBondYoy(){return issueOtherBondYoy;}

    public void setIssueOtherBondQoq(Double issueOtherBondQoq){this.issueOtherBondQoq = issueOtherBondQoq;}
    public Double getIssueOtherBondQoq(){return issueOtherBondQoq;}

    public void setDtLiabAdd(Double dtLiabAdd){this.dtLiabAdd = dtLiabAdd;}
    public Double getDtLiabAdd(){return dtLiabAdd;}

    public void setDtLiabAddYoy(Double dtLiabAddYoy){this.dtLiabAddYoy = dtLiabAddYoy;}
    public Double getDtLiabAddYoy(){return dtLiabAddYoy;}

    public void setDtLiabAddQoq(Double dtLiabAddQoq){this.dtLiabAddQoq = dtLiabAddQoq;}
    public Double getDtLiabAddQoq(){return dtLiabAddQoq;}

    public void setPredictLiabAdd(Double predictLiabAdd){this.predictLiabAdd = predictLiabAdd;}
    public Double getPredictLiabAdd(){return predictLiabAdd;}

    public void setPredictLiabAddYoy(Double predictLiabAddYoy){this.predictLiabAddYoy = predictLiabAddYoy;}
    public Double getPredictLiabAddYoy(){return predictLiabAddYoy;}

    public void setPredictLiabAddQoq(Double predictLiabAddQoq){this.predictLiabAddQoq = predictLiabAddQoq;}
    public Double getPredictLiabAddQoq(){return predictLiabAddQoq;}

    public void setInventoryReduce(Double inventoryReduce){this.inventoryReduce = inventoryReduce;}
    public Double getInventoryReduce(){return inventoryReduce;}

    public void setInventoryReduceYoy(Double inventoryReduceYoy){this.inventoryReduceYoy = inventoryReduceYoy;}
    public Double getInventoryReduceYoy(){return inventoryReduceYoy;}

    public void setInventoryReduceQoq(Double inventoryReduceQoq){this.inventoryReduceQoq = inventoryReduceQoq;}
    public Double getInventoryReduceQoq(){return inventoryReduceQoq;}

    public void setOperateReceReduce(Double operateReceReduce){this.operateReceReduce = operateReceReduce;}
    public Double getOperateReceReduce(){return operateReceReduce;}

    public void setOperateReceReduceYoy(Double operateReceReduceYoy){this.operateReceReduceYoy = operateReceReduceYoy;}
    public Double getOperateReceReduceYoy(){return operateReceReduceYoy;}

    public void setOperateReceReduceQoq(Double operateReceReduceQoq){this.operateReceReduceQoq = operateReceReduceQoq;}
    public Double getOperateReceReduceQoq(){return operateReceReduceQoq;}

    public void setIssueCd(Double issueCd){this.issueCd = issueCd;}
    public Double getIssueCd(){return issueCd;}

    public void setIssueCdYoy(Double issueCdYoy){this.issueCdYoy = issueCdYoy;}
    public Double getIssueCdYoy(){return issueCdYoy;}

    public void setIssueCdQoq(Double issueCdQoq){this.issueCdQoq = issueCdQoq;}
    public Double getIssueCdQoq(){return issueCdQoq;}

    public void setOperatePayableAdd(Double operatePayableAdd){this.operatePayableAdd = operatePayableAdd;}
    public Double getOperatePayableAdd(){return operatePayableAdd;}

    public void setOperatePayableAddYoy(Double operatePayableAddYoy){this.operatePayableAddYoy = operatePayableAddYoy;}
    public Double getOperatePayableAddYoy(){return operatePayableAddYoy;}

    public void setOperatePayableAddQoq(Double operatePayableAddQoq){this.operatePayableAddQoq = operatePayableAddQoq;}
    public Double getOperatePayableAddQoq(){return operatePayableAddQoq;}

    public void setReceiveAddEquity(Double receiveAddEquity){this.receiveAddEquity = receiveAddEquity;}
    public Double getReceiveAddEquity(){return receiveAddEquity;}

    public void setReceiveAddEquityYoy(Double receiveAddEquityYoy){this.receiveAddEquityYoy = receiveAddEquityYoy;}
    public Double getReceiveAddEquityYoy(){return receiveAddEquityYoy;}

    public void setReceiveAddEquityQoq(Double receiveAddEquityQoq){this.receiveAddEquityQoq = receiveAddEquityQoq;}
    public Double getReceiveAddEquityQoq(){return receiveAddEquityQoq;}

    public void setOther(Double other){this.other = other;}
    public Double getOther(){return other;}

    public void setOtherYoy(Double otherYoy){this.otherYoy = otherYoy;}
    public Double getOtherYoy(){return otherYoy;}

    public void setOtherQoq(Double otherQoq){this.otherQoq = otherQoq;}
    public Double getOtherQoq(){return otherQoq;}

    public void setOperateNetcashOthernote(Double operateNetcashOthernote){this.operateNetcashOthernote = operateNetcashOthernote;}
    public Double getOperateNetcashOthernote(){return operateNetcashOthernote;}

    public void setOperateNetcashOthernoteYoy(Double operateNetcashOthernoteYoy){this.operateNetcashOthernoteYoy = operateNetcashOthernoteYoy;}
    public Double getOperateNetcashOthernoteYoy(){return operateNetcashOthernoteYoy;}

    public void setOperateNetcashOthernoteQoq(Double operateNetcashOthernoteQoq){this.operateNetcashOthernoteQoq = operateNetcashOthernoteQoq;}
    public Double getOperateNetcashOthernoteQoq(){return operateNetcashOthernoteQoq;}

    public void setOperateNetcashBalancenote(Double operateNetcashBalancenote){this.operateNetcashBalancenote = operateNetcashBalancenote;}
    public Double getOperateNetcashBalancenote(){return operateNetcashBalancenote;}

    public void setOperateNetcashBalancenoteYoy(Double operateNetcashBalancenoteYoy){this.operateNetcashBalancenoteYoy = operateNetcashBalancenoteYoy;}
    public Double getOperateNetcashBalancenoteYoy(){return operateNetcashBalancenoteYoy;}

    public void setOperateNetcashBalancenoteQoq(Double operateNetcashBalancenoteQoq){this.operateNetcashBalancenoteQoq = operateNetcashBalancenoteQoq;}
    public Double getOperateNetcashBalancenoteQoq(){return operateNetcashBalancenoteQoq;}

    public void setNetcashOperatenote(Double netcashOperatenote){this.netcashOperatenote = netcashOperatenote;}
    public Double getNetcashOperatenote(){return netcashOperatenote;}

    public void setNetcashOperatenoteYoy(Double netcashOperatenoteYoy){this.netcashOperatenoteYoy = netcashOperatenoteYoy;}
    public Double getNetcashOperatenoteYoy(){return netcashOperatenoteYoy;}

    public void setNetcashOperatenoteQoq(Double netcashOperatenoteQoq){this.netcashOperatenoteQoq = netcashOperatenoteQoq;}
    public Double getNetcashOperatenoteQoq(){return netcashOperatenoteQoq;}

    public void setDebtTransferCapital(Double debtTransferCapital){this.debtTransferCapital = debtTransferCapital;}
    public Double getDebtTransferCapital(){return debtTransferCapital;}

    public void setDebtTransferCapitalYoy(Double debtTransferCapitalYoy){this.debtTransferCapitalYoy = debtTransferCapitalYoy;}
    public Double getDebtTransferCapitalYoy(){return debtTransferCapitalYoy;}

    public void setDebtTransferCapitalQoq(Double debtTransferCapitalQoq){this.debtTransferCapitalQoq = debtTransferCapitalQoq;}
    public Double getDebtTransferCapitalQoq(){return debtTransferCapitalQoq;}

    public void setPayBondInterest(Double payBondInterest){this.payBondInterest = payBondInterest;}
    public Double getPayBondInterest(){return payBondInterest;}

    public void setPayBondInterestYoy(Double payBondInterestYoy){this.payBondInterestYoy = payBondInterestYoy;}
    public Double getPayBondInterestYoy(){return payBondInterestYoy;}

    public void setPayBondInterestQoq(Double payBondInterestQoq){this.payBondInterestQoq = payBondInterestQoq;}
    public Double getPayBondInterestQoq(){return payBondInterestQoq;}

    public void setConvertBond1year(Double convertBond1year){this.convertBond1year = convertBond1year;}
    public Double getConvertBond1year(){return convertBond1year;}

    public void setConvertBond1yearYoy(Double convertBond1yearYoy){this.convertBond1yearYoy = convertBond1yearYoy;}
    public Double getConvertBond1yearYoy(){return convertBond1yearYoy;}

    public void setConvertBond1yearQoq(Double convertBond1yearQoq){this.convertBond1yearQoq = convertBond1yearQoq;}
    public Double getConvertBond1yearQoq(){return convertBond1yearQoq;}

    public void setIssueSharesExpense(Double issueSharesExpense){this.issueSharesExpense = issueSharesExpense;}
    public Double getIssueSharesExpense(){return issueSharesExpense;}

    public void setIssueSharesExpenseYoy(Double issueSharesExpenseYoy){this.issueSharesExpenseYoy = issueSharesExpenseYoy;}
    public Double getIssueSharesExpenseYoy(){return issueSharesExpenseYoy;}

    public void setIssueSharesExpenseQoq(Double issueSharesExpenseQoq){this.issueSharesExpenseQoq = issueSharesExpenseQoq;}
    public Double getIssueSharesExpenseQoq(){return issueSharesExpenseQoq;}

    public void setFinleaseObtainFa(Double finleaseObtainFa){this.finleaseObtainFa = finleaseObtainFa;}
    public Double getFinleaseObtainFa(){return finleaseObtainFa;}

    public void setFinleaseObtainFaYoy(Double finleaseObtainFaYoy){this.finleaseObtainFaYoy = finleaseObtainFaYoy;}
    public Double getFinleaseObtainFaYoy(){return finleaseObtainFaYoy;}

    public void setFinleaseObtainFaQoq(Double finleaseObtainFaQoq){this.finleaseObtainFaQoq = finleaseObtainFaQoq;}
    public Double getFinleaseObtainFaQoq(){return finleaseObtainFaQoq;}

    public void setUninvolveInvestfinOther(Double uninvolveInvestfinOther){this.uninvolveInvestfinOther = uninvolveInvestfinOther;}
    public Double getUninvolveInvestfinOther(){return uninvolveInvestfinOther;}

    public void setUninvolveInvestfinOtherYoy(Double uninvolveInvestfinOtherYoy){this.uninvolveInvestfinOtherYoy = uninvolveInvestfinOtherYoy;}
    public Double getUninvolveInvestfinOtherYoy(){return uninvolveInvestfinOtherYoy;}

    public void setUninvolveInvestfinOtherQoq(Double uninvolveInvestfinOtherQoq){this.uninvolveInvestfinOtherQoq = uninvolveInvestfinOtherQoq;}
    public Double getUninvolveInvestfinOtherQoq(){return uninvolveInvestfinOtherQoq;}

    public void setEndCash(Double endCash){this.endCash = endCash;}
    public Double getEndCash(){return endCash;}

    public void setEndCashYoy(Double endCashYoy){this.endCashYoy = endCashYoy;}
    public Double getEndCashYoy(){return endCashYoy;}

    public void setEndCashQoq(Double endCashQoq){this.endCashQoq = endCashQoq;}
    public Double getEndCashQoq(){return endCashQoq;}

    public void setBeginCash(Double beginCash){this.beginCash = beginCash;}
    public Double getBeginCash(){return beginCash;}

    public void setBeginCashYoy(Double beginCashYoy){this.beginCashYoy = beginCashYoy;}
    public Double getBeginCashYoy(){return beginCashYoy;}

    public void setBeginCashQoq(Double beginCashQoq){this.beginCashQoq = beginCashQoq;}
    public Double getBeginCashQoq(){return beginCashQoq;}

    public void setEndCashEquivalents(Double endCashEquivalents){this.endCashEquivalents = endCashEquivalents;}
    public Double getEndCashEquivalents(){return endCashEquivalents;}

    public void setEndCashEquivalentsYoy(Double endCashEquivalentsYoy){this.endCashEquivalentsYoy = endCashEquivalentsYoy;}
    public Double getEndCashEquivalentsYoy(){return endCashEquivalentsYoy;}

    public void setEndCashEquivalentsQoq(Double endCashEquivalentsQoq){this.endCashEquivalentsQoq = endCashEquivalentsQoq;}
    public Double getEndCashEquivalentsQoq(){return endCashEquivalentsQoq;}

    public void setBeginCashEquivalents(Double beginCashEquivalents){this.beginCashEquivalents = beginCashEquivalents;}
    public Double getBeginCashEquivalents(){return beginCashEquivalents;}

    public void setBeginCashEquivalentsYoy(Double beginCashEquivalentsYoy){this.beginCashEquivalentsYoy = beginCashEquivalentsYoy;}
    public Double getBeginCashEquivalentsYoy(){return beginCashEquivalentsYoy;}

    public void setBeginCashEquivalentsQoq(Double beginCashEquivalentsQoq){this.beginCashEquivalentsQoq = beginCashEquivalentsQoq;}
    public Double getBeginCashEquivalentsQoq(){return beginCashEquivalentsQoq;}

    public void setCceAddOthernote(Double cceAddOthernote){this.cceAddOthernote = cceAddOthernote;}
    public Double getCceAddOthernote(){return cceAddOthernote;}

    public void setCceAddOthernoteYoy(Double cceAddOthernoteYoy){this.cceAddOthernoteYoy = cceAddOthernoteYoy;}
    public Double getCceAddOthernoteYoy(){return cceAddOthernoteYoy;}

    public void setCceAddOthernoteQoq(Double cceAddOthernoteQoq){this.cceAddOthernoteQoq = cceAddOthernoteQoq;}
    public Double getCceAddOthernoteQoq(){return cceAddOthernoteQoq;}

    public void setCceAddBalancenote(Double cceAddBalancenote){this.cceAddBalancenote = cceAddBalancenote;}
    public Double getCceAddBalancenote(){return cceAddBalancenote;}

    public void setCceAddBalancenoteYoy(Double cceAddBalancenoteYoy){this.cceAddBalancenoteYoy = cceAddBalancenoteYoy;}
    public Double getCceAddBalancenoteYoy(){return cceAddBalancenoteYoy;}

    public void setCceAddBalancenoteQoq(Double cceAddBalancenoteQoq){this.cceAddBalancenoteQoq = cceAddBalancenoteQoq;}
    public Double getCceAddBalancenoteQoq(){return cceAddBalancenoteQoq;}

    public void setCceAddnote(Double cceAddnote){this.cceAddnote = cceAddnote;}
    public Double getCceAddnote(){return cceAddnote;}

    public void setCceAddnoteYoy(Double cceAddnoteYoy){this.cceAddnoteYoy = cceAddnoteYoy;}
    public Double getCceAddnoteYoy(){return cceAddnoteYoy;}

    public void setCceAddnoteQoq(Double cceAddnoteQoq){this.cceAddnoteQoq = cceAddnoteQoq;}
    public Double getCceAddnoteQoq(){return cceAddnoteQoq;}

    public void setProvisionInvestImpairment(Double provisionInvestImpairment){this.provisionInvestImpairment = provisionInvestImpairment;}
    public Double getProvisionInvestImpairment(){return provisionInvestImpairment;}

    public void setProvisionInvestImpairmentYoy(Double provisionInvestImpairmentYoy){this.provisionInvestImpairmentYoy = provisionInvestImpairmentYoy;}
    public Double getProvisionInvestImpairmentYoy(){return provisionInvestImpairmentYoy;}

    public void setProvisionInvestImpairmentQoq(Double provisionInvestImpairmentQoq){this.provisionInvestImpairmentQoq = provisionInvestImpairmentQoq;}
    public Double getProvisionInvestImpairmentQoq(){return provisionInvestImpairmentQoq;}

    public void setTransferInvestImpairment(Double transferInvestImpairment){this.transferInvestImpairment = transferInvestImpairment;}
    public Double getTransferInvestImpairment(){return transferInvestImpairment;}

    public void setTransferInvestImpairmentYoy(Double transferInvestImpairmentYoy){this.transferInvestImpairmentYoy = transferInvestImpairmentYoy;}
    public Double getTransferInvestImpairmentYoy(){return transferInvestImpairmentYoy;}

    public void setTransferInvestImpairmentQoq(Double transferInvestImpairmentQoq){this.transferInvestImpairmentQoq = transferInvestImpairmentQoq;}
    public Double getTransferInvestImpairmentQoq(){return transferInvestImpairmentQoq;}

    public void setProvisionLoanImpairment(Double provisionLoanImpairment){this.provisionLoanImpairment = provisionLoanImpairment;}
    public Double getProvisionLoanImpairment(){return provisionLoanImpairment;}

    public void setProvisionLoanImpairmentYoy(Double provisionLoanImpairmentYoy){this.provisionLoanImpairmentYoy = provisionLoanImpairmentYoy;}
    public Double getProvisionLoanImpairmentYoy(){return provisionLoanImpairmentYoy;}

    public void setProvisionLoanImpairmentQoq(Double provisionLoanImpairmentQoq){this.provisionLoanImpairmentQoq = provisionLoanImpairmentQoq;}
    public Double getProvisionLoanImpairmentQoq(){return provisionLoanImpairmentQoq;}

    public void setOtherAssetImpairment(Double otherAssetImpairment){this.otherAssetImpairment = otherAssetImpairment;}
    public Double getOtherAssetImpairment(){return otherAssetImpairment;}

    public void setOtherAssetImpairmentYoy(Double otherAssetImpairmentYoy){this.otherAssetImpairmentYoy = otherAssetImpairmentYoy;}
    public Double getOtherAssetImpairmentYoy(){return otherAssetImpairmentYoy;}

    public void setOtherAssetImpairmentQoq(Double otherAssetImpairmentQoq){this.otherAssetImpairmentQoq = otherAssetImpairmentQoq;}
    public Double getOtherAssetImpairmentQoq(){return otherAssetImpairmentQoq;}

    public void setProvisionPredictLiab(Double provisionPredictLiab){this.provisionPredictLiab = provisionPredictLiab;}
    public Double getProvisionPredictLiab(){return provisionPredictLiab;}

    public void setProvisionPredictLiabYoy(Double provisionPredictLiabYoy){this.provisionPredictLiabYoy = provisionPredictLiabYoy;}
    public Double getProvisionPredictLiabYoy(){return provisionPredictLiabYoy;}

    public void setProvisionPredictLiabQoq(Double provisionPredictLiabQoq){this.provisionPredictLiabQoq = provisionPredictLiabQoq;}
    public Double getProvisionPredictLiabQoq(){return provisionPredictLiabQoq;}

    public void setFixedAssetDepr(Double fixedAssetDepr){this.fixedAssetDepr = fixedAssetDepr;}
    public Double getFixedAssetDepr(){return fixedAssetDepr;}

    public void setFixedAssetDeprYoy(Double fixedAssetDeprYoy){this.fixedAssetDeprYoy = fixedAssetDeprYoy;}
    public Double getFixedAssetDeprYoy(){return fixedAssetDeprYoy;}

    public void setFixedAssetDeprQoq(Double fixedAssetDeprQoq){this.fixedAssetDeprQoq = fixedAssetDeprQoq;}
    public Double getFixedAssetDeprQoq(){return fixedAssetDeprQoq;}

    public void setIaLpeAmortize(Double iaLpeAmortize){this.iaLpeAmortize = iaLpeAmortize;}
    public Double getIaLpeAmortize(){return iaLpeAmortize;}

    public void setIaLpeAmortizeYoy(Double iaLpeAmortizeYoy){this.iaLpeAmortizeYoy = iaLpeAmortizeYoy;}
    public Double getIaLpeAmortizeYoy(){return iaLpeAmortizeYoy;}

    public void setIaLpeAmortizeQoq(Double iaLpeAmortizeQoq){this.iaLpeAmortizeQoq = iaLpeAmortizeQoq;}
    public Double getIaLpeAmortizeQoq(){return iaLpeAmortizeQoq;}

    public void setLongassetAmortize(Double longassetAmortize){this.longassetAmortize = longassetAmortize;}
    public Double getLongassetAmortize(){return longassetAmortize;}

    public void setLongassetAmortizeYoy(Double longassetAmortizeYoy){this.longassetAmortizeYoy = longassetAmortizeYoy;}
    public Double getLongassetAmortizeYoy(){return longassetAmortizeYoy;}

    public void setLongassetAmortizeQoq(Double longassetAmortizeQoq){this.longassetAmortizeQoq = longassetAmortizeQoq;}
    public Double getLongassetAmortizeQoq(){return longassetAmortizeQoq;}

    public void setReceiveWriteoff(Double receiveWriteoff){this.receiveWriteoff = receiveWriteoff;}
    public Double getReceiveWriteoff(){return receiveWriteoff;}

    public void setReceiveWriteoffYoy(Double receiveWriteoffYoy){this.receiveWriteoffYoy = receiveWriteoffYoy;}
    public Double getReceiveWriteoffYoy(){return receiveWriteoffYoy;}

    public void setReceiveWriteoffQoq(Double receiveWriteoffQoq){this.receiveWriteoffQoq = receiveWriteoffQoq;}
    public Double getReceiveWriteoffQoq(){return receiveWriteoffQoq;}

    public void setExchangeLoss(Double exchangeLoss){this.exchangeLoss = exchangeLoss;}
    public Double getExchangeLoss(){return exchangeLoss;}

    public void setExchangeLossYoy(Double exchangeLossYoy){this.exchangeLossYoy = exchangeLossYoy;}
    public Double getExchangeLossYoy(){return exchangeLossYoy;}

    public void setExchangeLossQoq(Double exchangeLossQoq){this.exchangeLossQoq = exchangeLossQoq;}
    public Double getExchangeLossQoq(){return exchangeLossQoq;}

    public void setBondInterestExpense(Double bondInterestExpense){this.bondInterestExpense = bondInterestExpense;}
    public Double getBondInterestExpense(){return bondInterestExpense;}

    public void setBondInterestExpenseYoy(Double bondInterestExpenseYoy){this.bondInterestExpenseYoy = bondInterestExpenseYoy;}
    public Double getBondInterestExpenseYoy(){return bondInterestExpenseYoy;}

    public void setBondInterestExpenseQoq(Double bondInterestExpenseQoq){this.bondInterestExpenseQoq = bondInterestExpenseQoq;}
    public Double getBondInterestExpenseQoq(){return bondInterestExpenseQoq;}

    public void setLoanReduce(Double loanReduce){this.loanReduce = loanReduce;}
    public Double getLoanReduce(){return loanReduce;}

    public void setLoanReduceYoy(Double loanReduceYoy){this.loanReduceYoy = loanReduceYoy;}
    public Double getLoanReduceYoy(){return loanReduceYoy;}

    public void setLoanReduceQoq(Double loanReduceQoq){this.loanReduceQoq = loanReduceQoq;}
    public Double getLoanReduceQoq(){return loanReduceQoq;}

    public void setDepositAdd(Double depositAdd){this.depositAdd = depositAdd;}
    public Double getDepositAdd(){return depositAdd;}

    public void setDepositAddYoy(Double depositAddYoy){this.depositAddYoy = depositAddYoy;}
    public Double getDepositAddYoy(){return depositAddYoy;}

    public void setDepositAddQoq(Double depositAddQoq){this.depositAddQoq = depositAddQoq;}
    public Double getDepositAddQoq(){return depositAddQoq;}

    public void setLendAdd(Double lendAdd){this.lendAdd = lendAdd;}
    public Double getLendAdd(){return lendAdd;}

    public void setLendAddYoy(Double lendAddYoy){this.lendAddYoy = lendAddYoy;}
    public Double getLendAddYoy(){return lendAddYoy;}

    public void setLendAddQoq(Double lendAddQoq){this.lendAddQoq = lendAddQoq;}
    public Double getLendAddQoq(){return lendAddQoq;}

    public void setFinassetReduce(Double finassetReduce){this.finassetReduce = finassetReduce;}
    public Double getFinassetReduce(){return finassetReduce;}

    public void setFinassetReduceYoy(Double finassetReduceYoy){this.finassetReduceYoy = finassetReduceYoy;}
    public Double getFinassetReduceYoy(){return finassetReduceYoy;}

    public void setFinassetReduceQoq(Double finassetReduceQoq){this.finassetReduceQoq = finassetReduceQoq;}
    public Double getFinassetReduceQoq(){return finassetReduceQoq;}

    public void setFinliabAdd(Double finliabAdd){this.finliabAdd = finliabAdd;}
    public Double getFinliabAdd(){return finliabAdd;}

    public void setFinliabAddYoy(Double finliabAddYoy){this.finliabAddYoy = finliabAddYoy;}
    public Double getFinliabAddYoy(){return finliabAddYoy;}

    public void setFinliabAddQoq(Double finliabAddQoq){this.finliabAddQoq = finliabAddQoq;}
    public Double getFinliabAddQoq(){return finliabAddQoq;}

    public void setFboperateNetcashOther(Double fboperateNetcashOther){this.fboperateNetcashOther = fboperateNetcashOther;}
    public Double getFboperateNetcashOther(){return fboperateNetcashOther;}

    public void setFboperateNetcashOtherYoy(Double fboperateNetcashOtherYoy){this.fboperateNetcashOtherYoy = fboperateNetcashOtherYoy;}
    public Double getFboperateNetcashOtherYoy(){return fboperateNetcashOtherYoy;}

    public void setFboperateNetcashOtherQoq(Double fboperateNetcashOtherQoq){this.fboperateNetcashOtherQoq = fboperateNetcashOtherQoq;}
    public Double getFboperateNetcashOtherQoq(){return fboperateNetcashOtherQoq;}

    public void setFboperateNetcashBalance(Double fboperateNetcashBalance){this.fboperateNetcashBalance = fboperateNetcashBalance;}
    public Double getFboperateNetcashBalance(){return fboperateNetcashBalance;}

    public void setFboperateNetcashBalanceYoy(Double fboperateNetcashBalanceYoy){this.fboperateNetcashBalanceYoy = fboperateNetcashBalanceYoy;}
    public Double getFboperateNetcashBalanceYoy(){return fboperateNetcashBalanceYoy;}

    public void setFboperateNetcashBalanceQoq(Double fboperateNetcashBalanceQoq){this.fboperateNetcashBalanceQoq = fboperateNetcashBalanceQoq;}
    public Double getFboperateNetcashBalanceQoq(){return fboperateNetcashBalanceQoq;}

    public void setFbnetcashOperate(Double fbnetcashOperate){this.fbnetcashOperate = fbnetcashOperate;}
    public Double getFbnetcashOperate(){return fbnetcashOperate;}

    public void setFbnetcashOperateYoy(Double fbnetcashOperateYoy){this.fbnetcashOperateYoy = fbnetcashOperateYoy;}
    public Double getFbnetcashOperateYoy(){return fbnetcashOperateYoy;}

    public void setFbnetcashOperateQoq(Double fbnetcashOperateQoq){this.fbnetcashOperateQoq = fbnetcashOperateQoq;}
    public Double getFbnetcashOperateQoq(){return fbnetcashOperateQoq;}

    public void setFbcceAddOther(Double fbcceAddOther){this.fbcceAddOther = fbcceAddOther;}
    public Double getFbcceAddOther(){return fbcceAddOther;}

    public void setFbcceAddOtherYoy(Double fbcceAddOtherYoy){this.fbcceAddOtherYoy = fbcceAddOtherYoy;}
    public Double getFbcceAddOtherYoy(){return fbcceAddOtherYoy;}

    public void setFbcceAddOtherQoq(Double fbcceAddOtherQoq){this.fbcceAddOtherQoq = fbcceAddOtherQoq;}
    public Double getFbcceAddOtherQoq(){return fbcceAddOtherQoq;}

    public void setFbcceAddBalance(Double fbcceAddBalance){this.fbcceAddBalance = fbcceAddBalance;}
    public Double getFbcceAddBalance(){return fbcceAddBalance;}

    public void setFbcceAddBalanceYoy(Double fbcceAddBalanceYoy){this.fbcceAddBalanceYoy = fbcceAddBalanceYoy;}
    public Double getFbcceAddBalanceYoy(){return fbcceAddBalanceYoy;}

    public void setFbcceAddBalanceQoq(Double fbcceAddBalanceQoq){this.fbcceAddBalanceQoq = fbcceAddBalanceQoq;}
    public Double getFbcceAddBalanceQoq(){return fbcceAddBalanceQoq;}

    public void setFbcceAdd(Double fbcceAdd){this.fbcceAdd = fbcceAdd;}
    public Double getFbcceAdd(){return fbcceAdd;}

    public void setFbcceAddYoy(Double fbcceAddYoy){this.fbcceAddYoy = fbcceAddYoy;}
    public Double getFbcceAddYoy(){return fbcceAddYoy;}

    public void setFbcceAddQoq(Double fbcceAddQoq){this.fbcceAddQoq = fbcceAddQoq;}
    public Double getFbcceAddQoq(){return fbcceAddQoq;}

    public void setOtherfintoolAdd(Double otherfintoolAdd){this.otherfintoolAdd = otherfintoolAdd;}
    public Double getOtherfintoolAdd(){return otherfintoolAdd;}

    public void setOtherfintoolAddYoy(Double otherfintoolAddYoy){this.otherfintoolAddYoy = otherfintoolAddYoy;}
    public Double getOtherfintoolAddYoy(){return otherfintoolAddYoy;}

    public void setOtherfintoolAddQoq(Double otherfintoolAddQoq){this.otherfintoolAddQoq = otherfintoolAddQoq;}
    public Double getOtherfintoolAddQoq(){return otherfintoolAddQoq;}

    public void setUnderwriteSecurity(Double underwriteSecurity){this.underwriteSecurity = underwriteSecurity;}
    public Double getUnderwriteSecurity(){return underwriteSecurity;}

    public void setUnderwriteSecurityYoy(Double underwriteSecurityYoy){this.underwriteSecurityYoy = underwriteSecurityYoy;}
    public Double getUnderwriteSecurityYoy(){return underwriteSecurityYoy;}

    public void setUnderwriteSecurityQoq(Double underwriteSecurityQoq){this.underwriteSecurityQoq = underwriteSecurityQoq;}
    public Double getUnderwriteSecurityQoq(){return underwriteSecurityQoq;}

    public void setReceiveAgentTrade(Double receiveAgentTrade){this.receiveAgentTrade = receiveAgentTrade;}
    public Double getReceiveAgentTrade(){return receiveAgentTrade;}

    public void setReceiveAgentTradeYoy(Double receiveAgentTradeYoy){this.receiveAgentTradeYoy = receiveAgentTradeYoy;}
    public Double getReceiveAgentTradeYoy(){return receiveAgentTradeYoy;}

    public void setReceiveAgentTradeQoq(Double receiveAgentTradeQoq){this.receiveAgentTradeQoq = receiveAgentTradeQoq;}
    public Double getReceiveAgentTradeQoq(){return receiveAgentTradeQoq;}

    public void setReceiveBuyResale(Double receiveBuyResale){this.receiveBuyResale = receiveBuyResale;}
    public Double getReceiveBuyResale(){return receiveBuyResale;}

    public void setReceiveBuyResaleYoy(Double receiveBuyResaleYoy){this.receiveBuyResaleYoy = receiveBuyResaleYoy;}
    public Double getReceiveBuyResaleYoy(){return receiveBuyResaleYoy;}

    public void setReceiveBuyResaleQoq(Double receiveBuyResaleQoq){this.receiveBuyResaleQoq = receiveBuyResaleQoq;}
    public Double getReceiveBuyResaleQoq(){return receiveBuyResaleQoq;}

    public void setReceiveAgentUnderwrite(Double receiveAgentUnderwrite){this.receiveAgentUnderwrite = receiveAgentUnderwrite;}
    public Double getReceiveAgentUnderwrite(){return receiveAgentUnderwrite;}

    public void setReceiveAgentUnderwriteYoy(Double receiveAgentUnderwriteYoy){this.receiveAgentUnderwriteYoy = receiveAgentUnderwriteYoy;}
    public Double getReceiveAgentUnderwriteYoy(){return receiveAgentUnderwriteYoy;}

    public void setReceiveAgentUnderwriteQoq(Double receiveAgentUnderwriteQoq){this.receiveAgentUnderwriteQoq = receiveAgentUnderwriteQoq;}
    public Double getReceiveAgentUnderwriteQoq(){return receiveAgentUnderwriteQoq;}

    public void setTradeSettleAdd(Double tradeSettleAdd){this.tradeSettleAdd = tradeSettleAdd;}
    public Double getTradeSettleAdd(){return tradeSettleAdd;}

    public void setTradeSettleAddYoy(Double tradeSettleAddYoy){this.tradeSettleAddYoy = tradeSettleAddYoy;}
    public Double getTradeSettleAddYoy(){return tradeSettleAddYoy;}

    public void setTradeSettleAddQoq(Double tradeSettleAddQoq){this.tradeSettleAddQoq = tradeSettleAddQoq;}
    public Double getTradeSettleAddQoq(){return tradeSettleAddQoq;}

    public void setDirectInvestAdd(Double directInvestAdd){this.directInvestAdd = directInvestAdd;}
    public Double getDirectInvestAdd(){return directInvestAdd;}

    public void setDirectInvestAddYoy(Double directInvestAddYoy){this.directInvestAddYoy = directInvestAddYoy;}
    public Double getDirectInvestAddYoy(){return directInvestAddYoy;}

    public void setDirectInvestAddQoq(Double directInvestAddQoq){this.directInvestAddQoq = directInvestAddQoq;}
    public Double getDirectInvestAddQoq(){return directInvestAddQoq;}

    public void setPayBuyResale(Double payBuyResale){this.payBuyResale = payBuyResale;}
    public Double getPayBuyResale(){return payBuyResale;}

    public void setPayBuyResaleYoy(Double payBuyResaleYoy){this.payBuyResaleYoy = payBuyResaleYoy;}
    public Double getPayBuyResaleYoy(){return payBuyResaleYoy;}

    public void setPayBuyResaleQoq(Double payBuyResaleQoq){this.payBuyResaleQoq = payBuyResaleQoq;}
    public Double getPayBuyResaleQoq(){return payBuyResaleQoq;}

    public void setDisposalTfaReduce(Double disposalTfaReduce){this.disposalTfaReduce = disposalTfaReduce;}
    public Double getDisposalTfaReduce(){return disposalTfaReduce;}

    public void setDisposalTfaReduceYoy(Double disposalTfaReduceYoy){this.disposalTfaReduceYoy = disposalTfaReduceYoy;}
    public Double getDisposalTfaReduceYoy(){return disposalTfaReduceYoy;}

    public void setDisposalTfaReduceQoq(Double disposalTfaReduceQoq){this.disposalTfaReduceQoq = disposalTfaReduceQoq;}
    public Double getDisposalTfaReduceQoq(){return disposalTfaReduceQoq;}

    public void setOtherfintoolReduce(Double otherfintoolReduce){this.otherfintoolReduce = otherfintoolReduce;}
    public Double getOtherfintoolReduce(){return otherfintoolReduce;}

    public void setOtherfintoolReduceYoy(Double otherfintoolReduceYoy){this.otherfintoolReduceYoy = otherfintoolReduceYoy;}
    public Double getOtherfintoolReduceYoy(){return otherfintoolReduceYoy;}

    public void setOtherfintoolReduceQoq(Double otherfintoolReduceQoq){this.otherfintoolReduceQoq = otherfintoolReduceQoq;}
    public Double getOtherfintoolReduceQoq(){return otherfintoolReduceQoq;}

    public void setTradeSettleReduce(Double tradeSettleReduce){this.tradeSettleReduce = tradeSettleReduce;}
    public Double getTradeSettleReduce(){return tradeSettleReduce;}

    public void setTradeSettleReduceYoy(Double tradeSettleReduceYoy){this.tradeSettleReduceYoy = tradeSettleReduceYoy;}
    public Double getTradeSettleReduceYoy(){return tradeSettleReduceYoy;}

    public void setTradeSettleReduceQoq(Double tradeSettleReduceQoq){this.tradeSettleReduceQoq = tradeSettleReduceQoq;}
    public Double getTradeSettleReduceQoq(){return tradeSettleReduceQoq;}

    public void setDirectInvestReduce(Double directInvestReduce){this.directInvestReduce = directInvestReduce;}
    public Double getDirectInvestReduce(){return directInvestReduce;}

    public void setDirectInvestReduceYoy(Double directInvestReduceYoy){this.directInvestReduceYoy = directInvestReduceYoy;}
    public Double getDirectInvestReduceYoy(){return directInvestReduceYoy;}

    public void setDirectInvestReduceQoq(Double directInvestReduceQoq){this.directInvestReduceQoq = directInvestReduceQoq;}
    public Double getDirectInvestReduceQoq(){return directInvestReduceQoq;}

    public void setRepoBusinessReduce(Double repoBusinessReduce){this.repoBusinessReduce = repoBusinessReduce;}
    public Double getRepoBusinessReduce(){return repoBusinessReduce;}

    public void setRepoBusinessReduceYoy(Double repoBusinessReduceYoy){this.repoBusinessReduceYoy = repoBusinessReduceYoy;}
    public Double getRepoBusinessReduceYoy(){return repoBusinessReduceYoy;}

    public void setRepoBusinessReduceQoq(Double repoBusinessReduceQoq){this.repoBusinessReduceQoq = repoBusinessReduceQoq;}
    public Double getRepoBusinessReduceQoq(){return repoBusinessReduceQoq;}

    public void setPayAgentTrade(Double payAgentTrade){this.payAgentTrade = payAgentTrade;}
    public Double getPayAgentTrade(){return payAgentTrade;}

    public void setPayAgentTradeYoy(Double payAgentTradeYoy){this.payAgentTradeYoy = payAgentTradeYoy;}
    public Double getPayAgentTradeYoy(){return payAgentTradeYoy;}

    public void setPayAgentTradeQoq(Double payAgentTradeQoq){this.payAgentTradeQoq = payAgentTradeQoq;}
    public Double getPayAgentTradeQoq(){return payAgentTradeQoq;}

    public void setDisposalAfaAdd(Double disposalAfaAdd){this.disposalAfaAdd = disposalAfaAdd;}
    public Double getDisposalAfaAdd(){return disposalAfaAdd;}

    public void setDisposalAfaAddYoy(Double disposalAfaAddYoy){this.disposalAfaAddYoy = disposalAfaAddYoy;}
    public Double getDisposalAfaAddYoy(){return disposalAfaAddYoy;}

    public void setDisposalAfaAddQoq(Double disposalAfaAddQoq){this.disposalAfaAddQoq = disposalAfaAddQoq;}
    public Double getDisposalAfaAddQoq(){return disposalAfaAddQoq;}

    public void setDisposalAfaReduce(Double disposalAfaReduce){this.disposalAfaReduce = disposalAfaReduce;}
    public Double getDisposalAfaReduce(){return disposalAfaReduce;}

    public void setDisposalAfaReduceYoy(Double disposalAfaReduceYoy){this.disposalAfaReduceYoy = disposalAfaReduceYoy;}
    public Double getDisposalAfaReduceYoy(){return disposalAfaReduceYoy;}

    public void setDisposalAfaReduceQoq(Double disposalAfaReduceQoq){this.disposalAfaReduceQoq = disposalAfaReduceQoq;}
    public Double getDisposalAfaReduceQoq(){return disposalAfaReduceQoq;}

    public void setAfaReduce(Double afaReduce){this.afaReduce = afaReduce;}
    public Double getAfaReduce(){return afaReduce;}

    public void setAfaReduceYoy(Double afaReduceYoy){this.afaReduceYoy = afaReduceYoy;}
    public Double getAfaReduceYoy(){return afaReduceYoy;}

    public void setAfaReduceQoq(Double afaReduceQoq){this.afaReduceQoq = afaReduceQoq;}
    public Double getAfaReduceQoq(){return afaReduceQoq;}

    public void setReceiveTradeFinasset(Double receiveTradeFinasset){this.receiveTradeFinasset = receiveTradeFinasset;}
    public Double getReceiveTradeFinasset(){return receiveTradeFinasset;}

    public void setReceiveTradeFinassetYoy(Double receiveTradeFinassetYoy){this.receiveTradeFinassetYoy = receiveTradeFinassetYoy;}
    public Double getReceiveTradeFinassetYoy(){return receiveTradeFinassetYoy;}

    public void setReceiveTradeFinassetQoq(Double receiveTradeFinassetQoq){this.receiveTradeFinassetQoq = receiveTradeFinassetQoq;}
    public Double getReceiveTradeFinassetQoq(){return receiveTradeFinassetQoq;}

    public void setBanksecurityLendAdd(Double banksecurityLendAdd){this.banksecurityLendAdd = banksecurityLendAdd;}
    public Double getBanksecurityLendAdd(){return banksecurityLendAdd;}

    public void setBanksecurityLendAddYoy(Double banksecurityLendAddYoy){this.banksecurityLendAddYoy = banksecurityLendAddYoy;}
    public Double getBanksecurityLendAddYoy(){return banksecurityLendAddYoy;}

    public void setBanksecurityLendAddQoq(Double banksecurityLendAddQoq){this.banksecurityLendAddQoq = banksecurityLendAddQoq;}
    public Double getBanksecurityLendAddQoq(){return banksecurityLendAddQoq;}

    public void setPbcInterbankReduce(Double pbcInterbankReduce){this.pbcInterbankReduce = pbcInterbankReduce;}
    public Double getPbcInterbankReduce(){return pbcInterbankReduce;}

    public void setPbcInterbankReduceYoy(Double pbcInterbankReduceYoy){this.pbcInterbankReduceYoy = pbcInterbankReduceYoy;}
    public Double getPbcInterbankReduceYoy(){return pbcInterbankReduceYoy;}

    public void setPbcInterbankReduceQoq(Double pbcInterbankReduceQoq){this.pbcInterbankReduceQoq = pbcInterbankReduceQoq;}
    public Double getPbcInterbankReduceQoq(){return pbcInterbankReduceQoq;}

    public void setBanksecurityRepoAdd(Double banksecurityRepoAdd){this.banksecurityRepoAdd = banksecurityRepoAdd;}
    public Double getBanksecurityRepoAdd(){return banksecurityRepoAdd;}

    public void setBanksecurityRepoAddYoy(Double banksecurityRepoAddYoy){this.banksecurityRepoAddYoy = banksecurityRepoAddYoy;}
    public Double getBanksecurityRepoAddYoy(){return banksecurityRepoAddYoy;}

    public void setBanksecurityRepoAddQoq(Double banksecurityRepoAddQoq){this.banksecurityRepoAddQoq = banksecurityRepoAddQoq;}
    public Double getBanksecurityRepoAddQoq(){return banksecurityRepoAddQoq;}

    public void setBanksecurityResaleReduce(Double banksecurityResaleReduce){this.banksecurityResaleReduce = banksecurityResaleReduce;}
    public Double getBanksecurityResaleReduce(){return banksecurityResaleReduce;}

    public void setBanksecurityResaleReduceYoy(Double banksecurityResaleReduceYoy){this.banksecurityResaleReduceYoy = banksecurityResaleReduceYoy;}
    public Double getBanksecurityResaleReduceYoy(){return banksecurityResaleReduceYoy;}

    public void setBanksecurityResaleReduceQoq(Double banksecurityResaleReduceQoq){this.banksecurityResaleReduceQoq = banksecurityResaleReduceQoq;}
    public Double getBanksecurityResaleReduceQoq(){return banksecurityResaleReduceQoq;}

    public void setPayReinsure(Double payReinsure){this.payReinsure = payReinsure;}
    public Double getPayReinsure(){return payReinsure;}

    public void setPayReinsureYoy(Double payReinsureYoy){this.payReinsureYoy = payReinsureYoy;}
    public Double getPayReinsureYoy(){return payReinsureYoy;}

    public void setPayReinsureQoq(Double payReinsureQoq){this.payReinsureQoq = payReinsureQoq;}
    public Double getPayReinsureQoq(){return payReinsureQoq;}

    public void setBanksecurityLendReduce(Double banksecurityLendReduce){this.banksecurityLendReduce = banksecurityLendReduce;}
    public Double getBanksecurityLendReduce(){return banksecurityLendReduce;}

    public void setBanksecurityLendReduceYoy(Double banksecurityLendReduceYoy){this.banksecurityLendReduceYoy = banksecurityLendReduceYoy;}
    public Double getBanksecurityLendReduceYoy(){return banksecurityLendReduceYoy;}

    public void setBanksecurityLendReduceQoq(Double banksecurityLendReduceQoq){this.banksecurityLendReduceQoq = banksecurityLendReduceQoq;}
    public Double getBanksecurityLendReduceQoq(){return banksecurityLendReduceQoq;}

    public void setBanksecurityResaleAdd(Double banksecurityResaleAdd){this.banksecurityResaleAdd = banksecurityResaleAdd;}
    public Double getBanksecurityResaleAdd(){return banksecurityResaleAdd;}

    public void setBanksecurityResaleAddYoy(Double banksecurityResaleAddYoy){this.banksecurityResaleAddYoy = banksecurityResaleAddYoy;}
    public Double getBanksecurityResaleAddYoy(){return banksecurityResaleAddYoy;}

    public void setBanksecurityResaleAddQoq(Double banksecurityResaleAddQoq){this.banksecurityResaleAddQoq = banksecurityResaleAddQoq;}
    public Double getBanksecurityResaleAddQoq(){return banksecurityResaleAddQoq;}

    public void setBanksecurityRepoReduce(Double banksecurityRepoReduce){this.banksecurityRepoReduce = banksecurityRepoReduce;}
    public Double getBanksecurityRepoReduce(){return banksecurityRepoReduce;}

    public void setBanksecurityRepoReduceYoy(Double banksecurityRepoReduceYoy){this.banksecurityRepoReduceYoy = banksecurityRepoReduceYoy;}
    public Double getBanksecurityRepoReduceYoy(){return banksecurityRepoReduceYoy;}

    public void setBanksecurityRepoReduceQoq(Double banksecurityRepoReduceQoq){this.banksecurityRepoReduceQoq = banksecurityRepoReduceQoq;}
    public Double getBanksecurityRepoReduceQoq(){return banksecurityRepoReduceQoq;}

    public void setInsuredInvestReduce(Double insuredInvestReduce){this.insuredInvestReduce = insuredInvestReduce;}
    public Double getInsuredInvestReduce(){return insuredInvestReduce;}

    public void setInsuredInvestReduceYoy(Double insuredInvestReduceYoy){this.insuredInvestReduceYoy = insuredInvestReduceYoy;}
    public Double getInsuredInvestReduceYoy(){return insuredInvestReduceYoy;}

    public void setInsuredInvestReduceQoq(Double insuredInvestReduceQoq){this.insuredInvestReduceQoq = insuredInvestReduceQoq;}
    public Double getInsuredInvestReduceQoq(){return insuredInvestReduceQoq;}

    public void setPayTradeFinasset(Double payTradeFinasset){this.payTradeFinasset = payTradeFinasset;}
    public Double getPayTradeFinasset(){return payTradeFinasset;}

    public void setPayTradeFinassetYoy(Double payTradeFinassetYoy){this.payTradeFinassetYoy = payTradeFinassetYoy;}
    public Double getPayTradeFinassetYoy(){return payTradeFinassetYoy;}

    public void setPayTradeFinassetQoq(Double payTradeFinassetQoq){this.payTradeFinassetQoq = payTradeFinassetQoq;}
    public Double getPayTradeFinassetQoq(){return payTradeFinassetQoq;}

    public void setInsuredPla(Double insuredPla){this.insuredPla = insuredPla;}
    public Double getInsuredPla(){return insuredPla;}

    public void setInsuredPlaYoy(Double insuredPlaYoy){this.insuredPlaYoy = insuredPlaYoy;}
    public Double getInsuredPlaYoy(){return insuredPlaYoy;}

    public void setInsuredPlaQoq(Double insuredPlaQoq){this.insuredPlaQoq = insuredPlaQoq;}
    public Double getInsuredPlaQoq(){return insuredPlaQoq;}

    public void setPurchaseSubsidiaryOther(Double purchaseSubsidiaryOther){this.purchaseSubsidiaryOther = purchaseSubsidiaryOther;}
    public Double getPurchaseSubsidiaryOther(){return purchaseSubsidiaryOther;}

    public void setPurchaseSubsidiaryOtherYoy(Double purchaseSubsidiaryOtherYoy){this.purchaseSubsidiaryOtherYoy = purchaseSubsidiaryOtherYoy;}
    public Double getPurchaseSubsidiaryOtherYoy(){return purchaseSubsidiaryOtherYoy;}

    public void setPurchaseSubsidiaryOtherQoq(Double purchaseSubsidiaryOtherQoq){this.purchaseSubsidiaryOtherQoq = purchaseSubsidiaryOtherQoq;}
    public Double getPurchaseSubsidiaryOtherQoq(){return purchaseSubsidiaryOtherQoq;}

    public void setDisposalSubsidiaryOutflow(Double disposalSubsidiaryOutflow){this.disposalSubsidiaryOutflow = disposalSubsidiaryOutflow;}
    public Double getDisposalSubsidiaryOutflow(){return disposalSubsidiaryOutflow;}

    public void setDisposalSubsidiaryOutflowYoy(Double disposalSubsidiaryOutflowYoy){this.disposalSubsidiaryOutflowYoy = disposalSubsidiaryOutflowYoy;}
    public Double getDisposalSubsidiaryOutflowYoy(){return disposalSubsidiaryOutflowYoy;}

    public void setDisposalSubsidiaryOutflowQoq(Double disposalSubsidiaryOutflowQoq){this.disposalSubsidiaryOutflowQoq = disposalSubsidiaryOutflowQoq;}
    public Double getDisposalSubsidiaryOutflowQoq(){return disposalSubsidiaryOutflowQoq;}

    public void setReceiveSellRepo(Double receiveSellRepo){this.receiveSellRepo = receiveSellRepo;}
    public Double getReceiveSellRepo(){return receiveSellRepo;}

    public void setReceiveSellRepoYoy(Double receiveSellRepoYoy){this.receiveSellRepoYoy = receiveSellRepoYoy;}
    public Double getReceiveSellRepoYoy(){return receiveSellRepoYoy;}

    public void setReceiveSellRepoQoq(Double receiveSellRepoQoq){this.receiveSellRepoQoq = receiveSellRepoQoq;}
    public Double getReceiveSellRepoQoq(){return receiveSellRepoQoq;}

    public void setPaySellRepo(Double paySellRepo){this.paySellRepo = paySellRepo;}
    public Double getPaySellRepo(){return paySellRepo;}

    public void setPaySellRepoYoy(Double paySellRepoYoy){this.paySellRepoYoy = paySellRepoYoy;}
    public Double getPaySellRepoYoy(){return paySellRepoYoy;}

    public void setPaySellRepoQoq(Double paySellRepoQoq){this.paySellRepoQoq = paySellRepoQoq;}
    public Double getPaySellRepoQoq(){return paySellRepoQoq;}

    public void setExtractInsuranceReserve(Double extractInsuranceReserve){this.extractInsuranceReserve = extractInsuranceReserve;}
    public Double getExtractInsuranceReserve(){return extractInsuranceReserve;}

    public void setExtractInsuranceReserveYoy(Double extractInsuranceReserveYoy){this.extractInsuranceReserveYoy = extractInsuranceReserveYoy;}
    public Double getExtractInsuranceReserveYoy(){return extractInsuranceReserveYoy;}

    public void setExtractInsuranceReserveQoq(Double extractInsuranceReserveQoq){this.extractInsuranceReserveQoq = extractInsuranceReserveQoq;}
    public Double getExtractInsuranceReserveQoq(){return extractInsuranceReserveQoq;}

    public void setExtractUnexpireReserve(Double extractUnexpireReserve){this.extractUnexpireReserve = extractUnexpireReserve;}
    public Double getExtractUnexpireReserve(){return extractUnexpireReserve;}

    public void setExtractUnexpireReserveYoy(Double extractUnexpireReserveYoy){this.extractUnexpireReserveYoy = extractUnexpireReserveYoy;}
    public Double getExtractUnexpireReserveYoy(){return extractUnexpireReserveYoy;}

    public void setExtractUnexpireReserveQoq(Double extractUnexpireReserveQoq){this.extractUnexpireReserveQoq = extractUnexpireReserveQoq;}
    public Double getExtractUnexpireReserveQoq(){return extractUnexpireReserveQoq;}

    public void setFbOperateNetcashOther(Double fbOperateNetcashOther){this.fbOperateNetcashOther = fbOperateNetcashOther;}
    public Double getFbOperateNetcashOther(){return fbOperateNetcashOther;}

    public void setFbOperateNetcashOtherYoy(Double fbOperateNetcashOtherYoy){this.fbOperateNetcashOtherYoy = fbOperateNetcashOtherYoy;}
    public Double getFbOperateNetcashOtherYoy(){return fbOperateNetcashOtherYoy;}

    public void setFbOperateNetcashOtherQoq(Double fbOperateNetcashOtherQoq){this.fbOperateNetcashOtherQoq = fbOperateNetcashOtherQoq;}
    public Double getFbOperateNetcashOtherQoq(){return fbOperateNetcashOtherQoq;}

    public void setFbOperateNetcashBalance(Double fbOperateNetcashBalance){this.fbOperateNetcashBalance = fbOperateNetcashBalance;}
    public Double getFbOperateNetcashBalance(){return fbOperateNetcashBalance;}

    public void setFbOperateNetcashBalanceYoy(Double fbOperateNetcashBalanceYoy){this.fbOperateNetcashBalanceYoy = fbOperateNetcashBalanceYoy;}
    public Double getFbOperateNetcashBalanceYoy(){return fbOperateNetcashBalanceYoy;}

    public void setFbOperateNetcashBalanceQoq(Double fbOperateNetcashBalanceQoq){this.fbOperateNetcashBalanceQoq = fbOperateNetcashBalanceQoq;}
    public Double getFbOperateNetcashBalanceQoq(){return fbOperateNetcashBalanceQoq;}

    public void setFbNetcashOperate(Double fbNetcashOperate){this.fbNetcashOperate = fbNetcashOperate;}
    public Double getFbNetcashOperate(){return fbNetcashOperate;}

    public void setFbNetcashOperateYoy(Double fbNetcashOperateYoy){this.fbNetcashOperateYoy = fbNetcashOperateYoy;}
    public Double getFbNetcashOperateYoy(){return fbNetcashOperateYoy;}

    public void setFbNetcashOperateQoq(Double fbNetcashOperateQoq){this.fbNetcashOperateQoq = fbNetcashOperateQoq;}
    public Double getFbNetcashOperateQoq(){return fbNetcashOperateQoq;}

    public void setFbCceAddOther(Double fbCceAddOther){this.fbCceAddOther = fbCceAddOther;}
    public Double getFbCceAddOther(){return fbCceAddOther;}

    public void setFbCceAddOtherYoy(Double fbCceAddOtherYoy){this.fbCceAddOtherYoy = fbCceAddOtherYoy;}
    public Double getFbCceAddOtherYoy(){return fbCceAddOtherYoy;}

    public void setFbCceAddOtherQoq(Double fbCceAddOtherQoq){this.fbCceAddOtherQoq = fbCceAddOtherQoq;}
    public Double getFbCceAddOtherQoq(){return fbCceAddOtherQoq;}

    public void setFbCceAddBalance(Double fbCceAddBalance){this.fbCceAddBalance = fbCceAddBalance;}
    public Double getFbCceAddBalance(){return fbCceAddBalance;}

    public void setFbCceAddBalanceYoy(Double fbCceAddBalanceYoy){this.fbCceAddBalanceYoy = fbCceAddBalanceYoy;}
    public Double getFbCceAddBalanceYoy(){return fbCceAddBalanceYoy;}

    public void setFbCceAddBalanceQoq(Double fbCceAddBalanceQoq){this.fbCceAddBalanceQoq = fbCceAddBalanceQoq;}
    public Double getFbCceAddBalanceQoq(){return fbCceAddBalanceQoq;}

    public void setFbCceAdd(Double fbCceAdd){this.fbCceAdd = fbCceAdd;}
    public Double getFbCceAdd(){return fbCceAdd;}

    public void setFbCceAddYoy(Double fbCceAddYoy){this.fbCceAddYoy = fbCceAddYoy;}
    public Double getFbCceAddYoy(){return fbCceAddYoy;}

    public void setFbCceAddQoq(Double fbCceAddQoq){this.fbCceAddQoq = fbCceAddQoq;}
    public Double getFbCceAddQoq(){return fbCceAddQoq;}

    public InvFinanceXjll() {
        super();
    }

    public InvFinanceXjll(String securityCode, String reportType) {
        this.securityCode = securityCode;
        this.reportType = reportType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvFinanceXjll)) return false;
        InvFinanceXjll that = (InvFinanceXjll) o;
        return Objects.equals(securityCode, that.securityCode) && Objects.equals(reportType, that.reportType) && Objects.equals(reportDate, that.reportDate) && Objects.equals(opinionType, that.opinionType) && Objects.equals(osopinionType, that.osopinionType) && Objects.equals(salesServices, that.salesServices) && Objects.equals(salesServicesYoy, that.salesServicesYoy) && Objects.equals(salesServicesQoq, that.salesServicesQoq) && Objects.equals(depositInterbankAdd, that.depositInterbankAdd) && Objects.equals(depositInterbankAddYoy, that.depositInterbankAddYoy) && Objects.equals(depositInterbankAddQoq, that.depositInterbankAddQoq) && Objects.equals(loanPbcAdd, that.loanPbcAdd) && Objects.equals(loanPbcAddYoy, that.loanPbcAddYoy) && Objects.equals(loanPbcAddQoq, that.loanPbcAddQoq) && Objects.equals(ofiBfAdd, that.ofiBfAdd) && Objects.equals(ofiBfAddYoy, that.ofiBfAddYoy) && Objects.equals(ofiBfAddQoq, that.ofiBfAddQoq) && Objects.equals(receiveOrigicPremium, that.receiveOrigicPremium) && Objects.equals(receiveOrigicPremiumYoy, that.receiveOrigicPremiumYoy) && Objects.equals(receiveOrigicPremiumQoq, that.receiveOrigicPremiumQoq) && Objects.equals(receiveReinsureNet, that.receiveReinsureNet) && Objects.equals(receiveReinsureNetYoy, that.receiveReinsureNetYoy) && Objects.equals(receiveReinsureNetQoq, that.receiveReinsureNetQoq) && Objects.equals(insuredInvestAdd, that.insuredInvestAdd) && Objects.equals(insuredInvestAddYoy, that.insuredInvestAddYoy) && Objects.equals(insuredInvestAddQoq, that.insuredInvestAddQoq) && Objects.equals(disposalTfaAdd, that.disposalTfaAdd) && Objects.equals(disposalTfaAddYoy, that.disposalTfaAddYoy) && Objects.equals(disposalTfaAddQoq, that.disposalTfaAddQoq) && Objects.equals(receiveInterestCommission, that.receiveInterestCommission) && Objects.equals(receiveInterestCommissionYoy, that.receiveInterestCommissionYoy) && Objects.equals(receiveInterestCommissionQoq, that.receiveInterestCommissionQoq) && Objects.equals(borrowFundAdd, that.borrowFundAdd) && Objects.equals(borrowFundAddYoy, that.borrowFundAddYoy) && Objects.equals(borrowFundAddQoq, that.borrowFundAddQoq) && Objects.equals(loanAdvanceReduce, that.loanAdvanceReduce) && Objects.equals(loanAdvanceReduceYoy, that.loanAdvanceReduceYoy) && Objects.equals(loanAdvanceReduceQoq, that.loanAdvanceReduceQoq) && Objects.equals(repoBusinessAdd, that.repoBusinessAdd) && Objects.equals(repoBusinessAddYoy, that.repoBusinessAddYoy) && Objects.equals(repoBusinessAddQoq, that.repoBusinessAddQoq) && Objects.equals(receiveTaxRefund, that.receiveTaxRefund) && Objects.equals(receiveTaxRefundYoy, that.receiveTaxRefundYoy) && Objects.equals(receiveTaxRefundQoq, that.receiveTaxRefundQoq) && Objects.equals(receiveOtherOperate, that.receiveOtherOperate) && Objects.equals(receiveOtherOperateYoy, that.receiveOtherOperateYoy) && Objects.equals(receiveOtherOperateQoq, that.receiveOtherOperateQoq) && Objects.equals(operateInflowOther, that.operateInflowOther) && Objects.equals(operateInflowOtherYoy, that.operateInflowOtherYoy) && Objects.equals(operateInflowOtherQoq, that.operateInflowOtherQoq) && Objects.equals(operateInflowBalance, that.operateInflowBalance) && Objects.equals(operateInflowBalanceYoy, that.operateInflowBalanceYoy) && Objects.equals(operateInflowBalanceQoq, that.operateInflowBalanceQoq) && Objects.equals(totalOperateInflow, that.totalOperateInflow) && Objects.equals(totalOperateInflowYoy, that.totalOperateInflowYoy) && Objects.equals(totalOperateInflowQoq, that.totalOperateInflowQoq) && Objects.equals(buyServices, that.buyServices) && Objects.equals(buyServicesYoy, that.buyServicesYoy) && Objects.equals(buyServicesQoq, that.buyServicesQoq) && Objects.equals(loanAdvanceAdd, that.loanAdvanceAdd) && Objects.equals(loanAdvanceAddYoy, that.loanAdvanceAddYoy) && Objects.equals(loanAdvanceAddQoq, that.loanAdvanceAddQoq) && Objects.equals(pbcInterbankAdd, that.pbcInterbankAdd) && Objects.equals(pbcInterbankAddYoy, that.pbcInterbankAddYoy) && Objects.equals(pbcInterbankAddQoq, that.pbcInterbankAddQoq) && Objects.equals(payOrigicCompensate, that.payOrigicCompensate) && Objects.equals(payOrigicCompensateYoy, that.payOrigicCompensateYoy) && Objects.equals(payOrigicCompensateQoq, that.payOrigicCompensateQoq) && Objects.equals(payInterestCommission, that.payInterestCommission) && Objects.equals(payInterestCommissionYoy, that.payInterestCommissionYoy) && Objects.equals(payInterestCommissionQoq, that.payInterestCommissionQoq) && Objects.equals(payPolicyBonus, that.payPolicyBonus) && Objects.equals(payPolicyBonusYoy, that.payPolicyBonusYoy) && Objects.equals(payPolicyBonusQoq, that.payPolicyBonusQoq) && Objects.equals(payStaffCash, that.payStaffCash) && Objects.equals(payStaffCashYoy, that.payStaffCashYoy) && Objects.equals(payStaffCashQoq, that.payStaffCashQoq) && Objects.equals(payAllTax, that.payAllTax) && Objects.equals(payAllTaxYoy, that.payAllTaxYoy) && Objects.equals(payAllTaxQoq, that.payAllTaxQoq) && Objects.equals(payOtherOperate, that.payOtherOperate) && Objects.equals(payOtherOperateYoy, that.payOtherOperateYoy) && Objects.equals(payOtherOperateQoq, that.payOtherOperateQoq) && Objects.equals(operateOutflowOther, that.operateOutflowOther) && Objects.equals(operateOutflowOtherYoy, that.operateOutflowOtherYoy) && Objects.equals(operateOutflowOtherQoq, that.operateOutflowOtherQoq) && Objects.equals(depositIofiOther, that.depositIofiOther) && Objects.equals(depositIofiOtherYoy, that.depositIofiOtherYoy) && Objects.equals(depositIofiOtherQoq, that.depositIofiOtherQoq) && Objects.equals(operateOutflowBalance, that.operateOutflowBalance) && Objects.equals(operateOutflowBalanceYoy, that.operateOutflowBalanceYoy) && Objects.equals(operateOutflowBalanceQoq, that.operateOutflowBalanceQoq) && Objects.equals(customerDepositAdd, that.customerDepositAdd) && Objects.equals(customerDepositAddYoy, that.customerDepositAddYoy) && Objects.equals(customerDepositAddQoq, that.customerDepositAddQoq) && Objects.equals(totalOperateOutflow, that.totalOperateOutflow) && Objects.equals(totalOperateOutflowYoy, that.totalOperateOutflowYoy) && Objects.equals(totalOperateOutflowQoq, that.totalOperateOutflowQoq) && Objects.equals(iofiAdd, that.iofiAdd) && Objects.equals(iofiAddYoy, that.iofiAddYoy) && Objects.equals(iofiAddQoq, that.iofiAddQoq) && Objects.equals(operateNetcashOther, that.operateNetcashOther) && Objects.equals(operateNetcashOtherYoy, that.operateNetcashOtherYoy) && Objects.equals(operateNetcashOtherQoq, that.operateNetcashOtherQoq) && Objects.equals(operateNetcashBalance, that.operateNetcashBalance) && Objects.equals(operateNetcashBalanceYoy, that.operateNetcashBalanceYoy) && Objects.equals(operateNetcashBalanceQoq, that.operateNetcashBalanceQoq) && Objects.equals(pbcIofiReduce, that.pbcIofiReduce) && Objects.equals(pbcIofiReduceYoy, that.pbcIofiReduceYoy) && Objects.equals(pbcIofiReduceQoq, that.pbcIofiReduceQoq) && Objects.equals(netcashOperate, that.netcashOperate) && Objects.equals(netcashOperateYoy, that.netcashOperateYoy) && Objects.equals(netcashOperateQoq, that.netcashOperateQoq) && Objects.equals(depositPbcReduce, that.depositPbcReduce) && Objects.equals(depositPbcReduceYoy, that.depositPbcReduceYoy) && Objects.equals(depositPbcReduceQoq, that.depositPbcReduceQoq) && Objects.equals(withdrawInvest, that.withdrawInvest) && Objects.equals(withdrawInvestYoy, that.withdrawInvestYoy) && Objects.equals(withdrawInvestQoq, that.withdrawInvestQoq) && Objects.equals(depositIofiReduce, that.depositIofiReduce) && Objects.equals(depositIofiReduceYoy, that.depositIofiReduceYoy) && Objects.equals(depositIofiReduceQoq, that.depositIofiReduceQoq) && Objects.equals(receiveInvestIncome, that.receiveInvestIncome) && Objects.equals(receiveInvestIncomeYoy, that.receiveInvestIncomeYoy) && Objects.equals(receiveInvestIncomeQoq, that.receiveInvestIncomeQoq) && Objects.equals(borrowRepoAdd, that.borrowRepoAdd) && Objects.equals(borrowRepoAddYoy, that.borrowRepoAddYoy) && Objects.equals(borrowRepoAddQoq, that.borrowRepoAddQoq) && Objects.equals(disposalLongAsset, that.disposalLongAsset) && Objects.equals(disposalLongAssetYoy, that.disposalLongAssetYoy) && Objects.equals(disposalLongAssetQoq, that.disposalLongAssetQoq) && Objects.equals(disposalSubsidiaryOther, that.disposalSubsidiaryOther) && Objects.equals(disposalSubsidiaryOtherYoy, that.disposalSubsidiaryOtherYoy) && Objects.equals(disposalSubsidiaryOtherQoq, that.disposalSubsidiaryOtherQoq) && Objects.equals(sellRepoAdd, that.sellRepoAdd) && Objects.equals(sellRepoAddYoy, that.sellRepoAddYoy) && Objects.equals(sellRepoAddQoq, that.sellRepoAddQoq) && Objects.equals(reducePledgeTimedeposits, that.reducePledgeTimedeposits) && Objects.equals(reducePledgeTimedepositsYoy, that.reducePledgeTimedepositsYoy) && Objects.equals(reducePledgeTimedepositsQoq, that.reducePledgeTimedepositsQoq) && Objects.equals(lendResaleReduce, that.lendResaleReduce) && Objects.equals(lendResaleReduceYoy, that.lendResaleReduceYoy) && Objects.equals(lendResaleReduceQoq, that.lendResaleReduceQoq) && Objects.equals(receiveOtherInvest, that.receiveOtherInvest) && Objects.equals(receiveOtherInvestYoy, that.receiveOtherInvestYoy) && Objects.equals(receiveOtherInvestQoq, that.receiveOtherInvestQoq) && Objects.equals(lendFundReduce, that.lendFundReduce) && Objects.equals(lendFundReduceYoy, that.lendFundReduceYoy) && Objects.equals(lendFundReduceQoq, that.lendFundReduceQoq) && Objects.equals(investInflowOther, that.investInflowOther) && Objects.equals(investInflowOtherYoy, that.investInflowOtherYoy) && Objects.equals(investInflowOtherQoq, that.investInflowOtherQoq) && Objects.equals(buyResaleReduce, that.buyResaleReduce) && Objects.equals(buyResaleReduceYoy, that.buyResaleReduceYoy) && Objects.equals(buyResaleReduceQoq, that.buyResaleReduceQoq) && Objects.equals(investInflowBalance, that.investInflowBalance) && Objects.equals(investInflowBalanceYoy, that.investInflowBalanceYoy) && Objects.equals(investInflowBalanceQoq, that.investInflowBalanceQoq) && Objects.equals(netCd, that.netCd) && Objects.equals(netCdYoy, that.netCdYoy) && Objects.equals(netCdQoq, that.netCdQoq) && Objects.equals(totalInvestInflow, that.totalInvestInflow) && Objects.equals(totalInvestInflowYoy, that.totalInvestInflowYoy) && Objects.equals(totalInvestInflowQoq, that.totalInvestInflowQoq) && Objects.equals(tradeFinliabAdd, that.tradeFinliabAdd) && Objects.equals(tradeFinliabAddYoy, that.tradeFinliabAddYoy) && Objects.equals(tradeFinliabAddQoq, that.tradeFinliabAddQoq) && Objects.equals(constructLongAsset, that.constructLongAsset) && Objects.equals(constructLongAssetYoy, that.constructLongAssetYoy) && Objects.equals(constructLongAssetQoq, that.constructLongAssetQoq) && Objects.equals(tradeFinassetReduce, that.tradeFinassetReduce) && Objects.equals(tradeFinassetReduceYoy, that.tradeFinassetReduceYoy) && Objects.equals(tradeFinassetReduceQoq, that.tradeFinassetReduceQoq) && Objects.equals(investPayCash, that.investPayCash) && Objects.equals(investPayCashYoy, that.investPayCashYoy) && Objects.equals(investPayCashQoq, that.investPayCashQoq) && Objects.equals(pledgeLoanAdd, that.pledgeLoanAdd) && Objects.equals(pledgeLoanAddYoy, that.pledgeLoanAddYoy) && Objects.equals(pledgeLoanAddQoq, that.pledgeLoanAddQoq) && Objects.equals(obtainSubsidiaryOther, that.obtainSubsidiaryOther) && Objects.equals(obtainSubsidiaryOtherYoy, that.obtainSubsidiaryOtherYoy) && Objects.equals(obtainSubsidiaryOtherQoq, that.obtainSubsidiaryOtherQoq) && Objects.equals(receiveInterest, that.receiveInterest) && Objects.equals(receiveInterestYoy, that.receiveInterestYoy) && Objects.equals(receiveInterestQoq, that.receiveInterestQoq) && Objects.equals(receiveCommission, that.receiveCommission) && Objects.equals(receiveCommissionYoy, that.receiveCommissionYoy) && Objects.equals(receiveCommissionQoq, that.receiveCommissionQoq) && Objects.equals(addPledgeTimedeposits, that.addPledgeTimedeposits) && Objects.equals(addPledgeTimedepositsYoy, that.addPledgeTimedepositsYoy) && Objects.equals(addPledgeTimedepositsQoq, that.addPledgeTimedepositsQoq) && Objects.equals(disposalMortgageAsset, that.disposalMortgageAsset) && Objects.equals(disposalMortgageAssetYoy, that.disposalMortgageAssetYoy) && Objects.equals(disposalMortgageAssetQoq, that.disposalMortgageAssetQoq) && Objects.equals(payOtherInvest, that.payOtherInvest) && Objects.equals(payOtherInvestYoy, that.payOtherInvestYoy) && Objects.equals(payOtherInvestQoq, that.payOtherInvestQoq) && Objects.equals(withdrawWriteoffLoan, that.withdrawWriteoffLoan) && Objects.equals(withdrawWriteoffLoanYoy, that.withdrawWriteoffLoanYoy) && Objects.equals(withdrawWriteoffLoanQoq, that.withdrawWriteoffLoanQoq) && Objects.equals(investOutflowOther, that.investOutflowOther) && Objects.equals(investOutflowOtherYoy, that.investOutflowOtherYoy) && Objects.equals(investOutflowOtherQoq, that.investOutflowOtherQoq) && Objects.equals(investOutflowBalance, that.investOutflowBalance) && Objects.equals(investOutflowBalanceYoy, that.investOutflowBalanceYoy) && Objects.equals(investOutflowBalanceQoq, that.investOutflowBalanceQoq) && Objects.equals(totalInvestOutflow, that.totalInvestOutflow) && Objects.equals(totalInvestOutflowYoy, that.totalInvestOutflowYoy) && Objects.equals(totalInvestOutflowQoq, that.totalInvestOutflowQoq) && Objects.equals(investNetcashOther, that.investNetcashOther) && Objects.equals(investNetcashOtherYoy, that.investNetcashOtherYoy) && Objects.equals(investNetcashOtherQoq, that.investNetcashOtherQoq) && Objects.equals(investNetcashBalance, that.investNetcashBalance) && Objects.equals(investNetcashBalanceYoy, that.investNetcashBalanceYoy) && Objects.equals(investNetcashBalanceQoq, that.investNetcashBalanceQoq) && Objects.equals(netcashInvest, that.netcashInvest) && Objects.equals(netcashInvestYoy, that.netcashInvestYoy) && Objects.equals(netcashInvestQoq, that.netcashInvestQoq) && Objects.equals(loanPbcReduce, that.loanPbcReduce) && Objects.equals(loanPbcReduceYoy, that.loanPbcReduceYoy) && Objects.equals(loanPbcReduceQoq, that.loanPbcReduceQoq) && Objects.equals(acceptInvestCash, that.acceptInvestCash) && Objects.equals(acceptInvestCashYoy, that.acceptInvestCashYoy) && Objects.equals(acceptInvestCashQoq, that.acceptInvestCashQoq) && Objects.equals(pbcIofiAdd, that.pbcIofiAdd) && Objects.equals(pbcIofiAddYoy, that.pbcIofiAddYoy) && Objects.equals(pbcIofiAddQoq, that.pbcIofiAddQoq) && Objects.equals(subsidiaryAcceptInvest, that.subsidiaryAcceptInvest) && Objects.equals(subsidiaryAcceptInvestYoy, that.subsidiaryAcceptInvestYoy) && Objects.equals(subsidiaryAcceptInvestQoq, that.subsidiaryAcceptInvestQoq) && Objects.equals(depositPbcAdd, that.depositPbcAdd) && Objects.equals(depositPbcAddYoy, that.depositPbcAddYoy) && Objects.equals(depositPbcAddQoq, that.depositPbcAddQoq) && Objects.equals(receiveLoanCash, that.receiveLoanCash) && Objects.equals(receiveLoanCashYoy, that.receiveLoanCashYoy) && Objects.equals(receiveLoanCashQoq, that.receiveLoanCashQoq) && Objects.equals(depositIofiAdd, that.depositIofiAdd) && Objects.equals(depositIofiAddYoy, that.depositIofiAddYoy) && Objects.equals(depositIofiAddQoq, that.depositIofiAddQoq) && Objects.equals(issueBond, that.issueBond) && Objects.equals(issueBondYoy, that.issueBondYoy) && Objects.equals(issueBondQoq, that.issueBondQoq) && Objects.equals(interbankOtherReduce, that.interbankOtherReduce) && Objects.equals(interbankOtherReduceYoy, that.interbankOtherReduceYoy) && Objects.equals(interbankOtherReduceQoq, that.interbankOtherReduceQoq) && Objects.equals(receiveOtherFinance, that.receiveOtherFinance) && Objects.equals(receiveOtherFinanceYoy, that.receiveOtherFinanceYoy) && Objects.equals(receiveOtherFinanceQoq, that.receiveOtherFinanceQoq) && Objects.equals(issuedCdReduce, that.issuedCdReduce) && Objects.equals(issuedCdReduceYoy, that.issuedCdReduceYoy) && Objects.equals(issuedCdReduceQoq, that.issuedCdReduceQoq) && Objects.equals(financeInflowOther, that.financeInflowOther) && Objects.equals(financeInflowOtherYoy, that.financeInflowOtherYoy) && Objects.equals(financeInflowOtherQoq, that.financeInflowOtherQoq) && Objects.equals(lendResaleAdd, that.lendResaleAdd) && Objects.equals(lendResaleAddYoy, that.lendResaleAddYoy) && Objects.equals(lendResaleAddQoq, that.lendResaleAddQoq) && Objects.equals(financeInflowBalance, that.financeInflowBalance) && Objects.equals(financeInflowBalanceYoy, that.financeInflowBalanceYoy) && Objects.equals(financeInflowBalanceQoq, that.financeInflowBalanceQoq) && Objects.equals(lendFundAdd, that.lendFundAdd) && Objects.equals(lendFundAddYoy, that.lendFundAddYoy) && Objects.equals(lendFundAddQoq, that.lendFundAddQoq) && Objects.equals(totalFinanceInflow, that.totalFinanceInflow) && Objects.equals(totalFinanceInflowYoy, that.totalFinanceInflowYoy) && Objects.equals(totalFinanceInflowQoq, that.totalFinanceInflowQoq) && Objects.equals(buyResaleAdd, that.buyResaleAdd) && Objects.equals(buyResaleAddYoy, that.buyResaleAddYoy) && Objects.equals(buyResaleAddQoq, that.buyResaleAddQoq) && Objects.equals(payDebtCash, that.payDebtCash) && Objects.equals(payDebtCashYoy, that.payDebtCashYoy) && Objects.equals(payDebtCashQoq, that.payDebtCashQoq) && Objects.equals(borrowRepoReduce, that.borrowRepoReduce) && Objects.equals(borrowRepoReduceYoy, that.borrowRepoReduceYoy) && Objects.equals(borrowRepoReduceQoq, that.borrowRepoReduceQoq) && Objects.equals(assignDividendPorfit, that.assignDividendPorfit) && Objects.equals(assignDividendPorfitYoy, that.assignDividendPorfitYoy) && Objects.equals(assignDividendPorfitQoq, that.assignDividendPorfitQoq) && Objects.equals(borrowFundReduce, that.borrowFundReduce) && Objects.equals(borrowFundReduceYoy, that.borrowFundReduceYoy) && Objects.equals(borrowFundReduceQoq, that.borrowFundReduceQoq) && Objects.equals(subsidiaryPayDividend, that.subsidiaryPayDividend) && Objects.equals(subsidiaryPayDividendYoy, that.subsidiaryPayDividendYoy) && Objects.equals(subsidiaryPayDividendQoq, that.subsidiaryPayDividendQoq) && Objects.equals(sellRepoReduce, that.sellRepoReduce) && Objects.equals(sellRepoReduceYoy, that.sellRepoReduceYoy) && Objects.equals(sellRepoReduceQoq, that.sellRepoReduceQoq) && Objects.equals(buySubsidiaryEquity, that.buySubsidiaryEquity) && Objects.equals(buySubsidiaryEquityYoy, that.buySubsidiaryEquityYoy) && Objects.equals(buySubsidiaryEquityQoq, that.buySubsidiaryEquityQoq) && Objects.equals(tradeFinassetAdd, that.tradeFinassetAdd) && Objects.equals(tradeFinassetAddYoy, that.tradeFinassetAddYoy) && Objects.equals(tradeFinassetAddQoq, that.tradeFinassetAddQoq) && Objects.equals(payOtherFinance, that.payOtherFinance) && Objects.equals(payOtherFinanceYoy, that.payOtherFinanceYoy) && Objects.equals(payOtherFinanceQoq, that.payOtherFinanceQoq) && Objects.equals(tradeFinliabReduce, that.tradeFinliabReduce) && Objects.equals(tradeFinliabReduceYoy, that.tradeFinliabReduceYoy) && Objects.equals(tradeFinliabReduceQoq, that.tradeFinliabReduceQoq) && Objects.equals(subsidiaryReduceCash, that.subsidiaryReduceCash) && Objects.equals(subsidiaryReduceCashYoy, that.subsidiaryReduceCashYoy) && Objects.equals(subsidiaryReduceCashQoq, that.subsidiaryReduceCashQoq) && Objects.equals(financeOutflowOther, that.financeOutflowOther) && Objects.equals(financeOutflowOtherYoy, that.financeOutflowOtherYoy) && Objects.equals(financeOutflowOtherQoq, that.financeOutflowOtherQoq) && Objects.equals(payInterest, that.payInterest) && Objects.equals(payInterestYoy, that.payInterestYoy) && Objects.equals(payInterestQoq, that.payInterestQoq) && Objects.equals(financeOutflowBalance, that.financeOutflowBalance) && Objects.equals(financeOutflowBalanceYoy, that.financeOutflowBalanceYoy) && Objects.equals(financeOutflowBalanceQoq, that.financeOutflowBalanceQoq) && Objects.equals(payCommission, that.payCommission) && Objects.equals(payCommissionYoy, that.payCommissionYoy) && Objects.equals(payCommissionQoq, that.payCommissionQoq) && Objects.equals(totalFinanceOutflow, that.totalFinanceOutflow) && Objects.equals(totalFinanceOutflowYoy, that.totalFinanceOutflowYoy) && Objects.equals(totalFinanceOutflowQoq, that.totalFinanceOutflowQoq) && Objects.equals(financeNetcashOther, that.financeNetcashOther) && Objects.equals(financeNetcashOtherYoy, that.financeNetcashOtherYoy) && Objects.equals(financeNetcashOtherQoq, that.financeNetcashOtherQoq) && Objects.equals(buyFinLease, that.buyFinLease) && Objects.equals(buyFinLeaseYoy, that.buyFinLeaseYoy) && Objects.equals(buyFinLeaseQoq, that.buyFinLeaseQoq) && Objects.equals(financeNetcashBalance, that.financeNetcashBalance) && Objects.equals(financeNetcashBalanceYoy, that.financeNetcashBalanceYoy) && Objects.equals(financeNetcashBalanceQoq, that.financeNetcashBalanceQoq) && Objects.equals(accountsReceAdd, that.accountsReceAdd) && Objects.equals(accountsReceAddYoy, that.accountsReceAddYoy) && Objects.equals(accountsReceAddQoq, that.accountsReceAddQoq) && Objects.equals(netcashFinance, that.netcashFinance) && Objects.equals(netcashFinanceYoy, that.netcashFinanceYoy) && Objects.equals(netcashFinanceQoq, that.netcashFinanceQoq) && Objects.equals(rateChangeEffect, that.rateChangeEffect) && Objects.equals(rateChangeEffectYoy, that.rateChangeEffectYoy) && Objects.equals(rateChangeEffectQoq, that.rateChangeEffectQoq) && Objects.equals(cceAddOther, that.cceAddOther) && Objects.equals(cceAddOtherYoy, that.cceAddOtherYoy) && Objects.equals(cceAddOtherQoq, that.cceAddOtherQoq) && Objects.equals(cceAddBalance, that.cceAddBalance) && Objects.equals(cceAddBalanceYoy, that.cceAddBalanceYoy) && Objects.equals(cceAddBalanceQoq, that.cceAddBalanceQoq) && Objects.equals(cceAdd, that.cceAdd) && Objects.equals(cceAddYoy, that.cceAddYoy) && Objects.equals(cceAddQoq, that.cceAddQoq) && Objects.equals(beginCce, that.beginCce) && Objects.equals(beginCceYoy, that.beginCceYoy) && Objects.equals(beginCceQoq, that.beginCceQoq) && Objects.equals(endCceOther, that.endCceOther) && Objects.equals(endCceOtherYoy, that.endCceOtherYoy) && Objects.equals(endCceOtherQoq, that.endCceOtherQoq) && Objects.equals(endCceBalance, that.endCceBalance) && Objects.equals(endCceBalanceYoy, that.endCceBalanceYoy) && Objects.equals(endCceBalanceQoq, that.endCceBalanceQoq) && Objects.equals(endCce, that.endCce) && Objects.equals(endCceYoy, that.endCceYoy) && Objects.equals(endCceQoq, that.endCceQoq) && Objects.equals(netprofit, that.netprofit) && Objects.equals(netprofitYoy, that.netprofitYoy) && Objects.equals(netprofitQoq, that.netprofitQoq) && Objects.equals(minorityInterest, that.minorityInterest) && Objects.equals(minorityInterestYoy, that.minorityInterestYoy) && Objects.equals(minorityInterestQoq, that.minorityInterestQoq) && Objects.equals(receiveDividendProfit, that.receiveDividendProfit) && Objects.equals(receiveDividendProfitYoy, that.receiveDividendProfitYoy) && Objects.equals(receiveDividendProfitQoq, that.receiveDividendProfitQoq) && Objects.equals(assetImpairment, that.assetImpairment) && Objects.equals(assetImpairmentYoy, that.assetImpairmentYoy) && Objects.equals(assetImpairmentQoq, that.assetImpairmentQoq) && Objects.equals(faIrDepr, that.faIrDepr) && Objects.equals(faIrDeprYoy, that.faIrDeprYoy) && Objects.equals(faIrDeprQoq, that.faIrDeprQoq) && Objects.equals(disposalSubsidiaryJoint, that.disposalSubsidiaryJoint) && Objects.equals(disposalSubsidiaryJointYoy, that.disposalSubsidiaryJointYoy) && Objects.equals(disposalSubsidiaryJointQoq, that.disposalSubsidiaryJointQoq) && Objects.equals(oilgasBiologyDepr, that.oilgasBiologyDepr) && Objects.equals(oilgasBiologyDeprYoy, that.oilgasBiologyDeprYoy) && Objects.equals(oilgasBiologyDeprQoq, that.oilgasBiologyDeprQoq) && Objects.equals(irDepr, that.irDepr) && Objects.equals(irDeprYoy, that.irDeprYoy) && Objects.equals(irDeprQoq, that.irDeprQoq) && Objects.equals(iaAmortize, that.iaAmortize) && Objects.equals(iaAmortizeYoy, that.iaAmortizeYoy) && Objects.equals(iaAmortizeQoq, that.iaAmortizeQoq) && Objects.equals(lpeAmortize, that.lpeAmortize) && Objects.equals(lpeAmortizeYoy, that.lpeAmortizeYoy) && Objects.equals(lpeAmortizeQoq, that.lpeAmortizeQoq) && Objects.equals(deferIncomeAmortize, that.deferIncomeAmortize) && Objects.equals(deferIncomeAmortizeYoy, that.deferIncomeAmortizeYoy) && Objects.equals(deferIncomeAmortizeQoq, that.deferIncomeAmortizeQoq) && Objects.equals(prepaidExpenseReduce, that.prepaidExpenseReduce) && Objects.equals(prepaidExpenseReduceYoy, that.prepaidExpenseReduceYoy) && Objects.equals(prepaidExpenseReduceQoq, that.prepaidExpenseReduceQoq) && Objects.equals(accruedExpenseAdd, that.accruedExpenseAdd) && Objects.equals(accruedExpenseAddYoy, that.accruedExpenseAddYoy) && Objects.equals(accruedExpenseAddQoq, that.accruedExpenseAddQoq) && Objects.equals(disposalLongassetLoss, that.disposalLongassetLoss) && Objects.equals(disposalLongassetLossYoy, that.disposalLongassetLossYoy) && Objects.equals(disposalLongassetLossQoq, that.disposalLongassetLossQoq) && Objects.equals(faScrapLoss, that.faScrapLoss) && Objects.equals(faScrapLossYoy, that.faScrapLossYoy) && Objects.equals(faScrapLossQoq, that.faScrapLossQoq) && Objects.equals(fairvalueChangeLoss, that.fairvalueChangeLoss) && Objects.equals(fairvalueChangeLossYoy, that.fairvalueChangeLossYoy) && Objects.equals(fairvalueChangeLossQoq, that.fairvalueChangeLossQoq) && Objects.equals(financeExpense, that.financeExpense) && Objects.equals(financeExpenseYoy, that.financeExpenseYoy) && Objects.equals(financeExpenseQoq, that.financeExpenseQoq) && Objects.equals(investLoss, that.investLoss) && Objects.equals(investLossYoy, that.investLossYoy) && Objects.equals(investLossQoq, that.investLossQoq) && Objects.equals(deferTax, that.deferTax) && Objects.equals(deferTaxYoy, that.deferTaxYoy) && Objects.equals(deferTaxQoq, that.deferTaxQoq) && Objects.equals(issueSubbond, that.issueSubbond) && Objects.equals(issueSubbondYoy, that.issueSubbondYoy) && Objects.equals(issueSubbondQoq, that.issueSubbondQoq) && Objects.equals(dtAssetReduce, that.dtAssetReduce) && Objects.equals(dtAssetReduceYoy, that.dtAssetReduceYoy) && Objects.equals(dtAssetReduceQoq, that.dtAssetReduceQoq) && Objects.equals(issueOtherBond, that.issueOtherBond) && Objects.equals(issueOtherBondYoy, that.issueOtherBondYoy) && Objects.equals(issueOtherBondQoq, that.issueOtherBondQoq) && Objects.equals(dtLiabAdd, that.dtLiabAdd) && Objects.equals(dtLiabAddYoy, that.dtLiabAddYoy) && Objects.equals(dtLiabAddQoq, that.dtLiabAddQoq) && Objects.equals(predictLiabAdd, that.predictLiabAdd) && Objects.equals(predictLiabAddYoy, that.predictLiabAddYoy) && Objects.equals(predictLiabAddQoq, that.predictLiabAddQoq) && Objects.equals(inventoryReduce, that.inventoryReduce) && Objects.equals(inventoryReduceYoy, that.inventoryReduceYoy) && Objects.equals(inventoryReduceQoq, that.inventoryReduceQoq) && Objects.equals(operateReceReduce, that.operateReceReduce) && Objects.equals(operateReceReduceYoy, that.operateReceReduceYoy) && Objects.equals(operateReceReduceQoq, that.operateReceReduceQoq) && Objects.equals(issueCd, that.issueCd) && Objects.equals(issueCdYoy, that.issueCdYoy) && Objects.equals(issueCdQoq, that.issueCdQoq) && Objects.equals(operatePayableAdd, that.operatePayableAdd) && Objects.equals(operatePayableAddYoy, that.operatePayableAddYoy) && Objects.equals(operatePayableAddQoq, that.operatePayableAddQoq) && Objects.equals(receiveAddEquity, that.receiveAddEquity) && Objects.equals(receiveAddEquityYoy, that.receiveAddEquityYoy) && Objects.equals(receiveAddEquityQoq, that.receiveAddEquityQoq) && Objects.equals(other, that.other) && Objects.equals(otherYoy, that.otherYoy) && Objects.equals(otherQoq, that.otherQoq) && Objects.equals(operateNetcashOthernote, that.operateNetcashOthernote) && Objects.equals(operateNetcashOthernoteYoy, that.operateNetcashOthernoteYoy) && Objects.equals(operateNetcashOthernoteQoq, that.operateNetcashOthernoteQoq) && Objects.equals(operateNetcashBalancenote, that.operateNetcashBalancenote) && Objects.equals(operateNetcashBalancenoteYoy, that.operateNetcashBalancenoteYoy) && Objects.equals(operateNetcashBalancenoteQoq, that.operateNetcashBalancenoteQoq) && Objects.equals(netcashOperatenote, that.netcashOperatenote) && Objects.equals(netcashOperatenoteYoy, that.netcashOperatenoteYoy) && Objects.equals(netcashOperatenoteQoq, that.netcashOperatenoteQoq) && Objects.equals(debtTransferCapital, that.debtTransferCapital) && Objects.equals(debtTransferCapitalYoy, that.debtTransferCapitalYoy) && Objects.equals(debtTransferCapitalQoq, that.debtTransferCapitalQoq) && Objects.equals(payBondInterest, that.payBondInterest) && Objects.equals(payBondInterestYoy, that.payBondInterestYoy) && Objects.equals(payBondInterestQoq, that.payBondInterestQoq) && Objects.equals(convertBond1year, that.convertBond1year) && Objects.equals(convertBond1yearYoy, that.convertBond1yearYoy) && Objects.equals(convertBond1yearQoq, that.convertBond1yearQoq) && Objects.equals(issueSharesExpense, that.issueSharesExpense) && Objects.equals(issueSharesExpenseYoy, that.issueSharesExpenseYoy) && Objects.equals(issueSharesExpenseQoq, that.issueSharesExpenseQoq) && Objects.equals(finleaseObtainFa, that.finleaseObtainFa) && Objects.equals(finleaseObtainFaYoy, that.finleaseObtainFaYoy) && Objects.equals(finleaseObtainFaQoq, that.finleaseObtainFaQoq) && Objects.equals(uninvolveInvestfinOther, that.uninvolveInvestfinOther) && Objects.equals(uninvolveInvestfinOtherYoy, that.uninvolveInvestfinOtherYoy) && Objects.equals(uninvolveInvestfinOtherQoq, that.uninvolveInvestfinOtherQoq) && Objects.equals(endCash, that.endCash) && Objects.equals(endCashYoy, that.endCashYoy) && Objects.equals(endCashQoq, that.endCashQoq) && Objects.equals(beginCash, that.beginCash) && Objects.equals(beginCashYoy, that.beginCashYoy) && Objects.equals(beginCashQoq, that.beginCashQoq) && Objects.equals(endCashEquivalents, that.endCashEquivalents) && Objects.equals(endCashEquivalentsYoy, that.endCashEquivalentsYoy) && Objects.equals(endCashEquivalentsQoq, that.endCashEquivalentsQoq) && Objects.equals(beginCashEquivalents, that.beginCashEquivalents) && Objects.equals(beginCashEquivalentsYoy, that.beginCashEquivalentsYoy) && Objects.equals(beginCashEquivalentsQoq, that.beginCashEquivalentsQoq) && Objects.equals(cceAddOthernote, that.cceAddOthernote) && Objects.equals(cceAddOthernoteYoy, that.cceAddOthernoteYoy) && Objects.equals(cceAddOthernoteQoq, that.cceAddOthernoteQoq) && Objects.equals(cceAddBalancenote, that.cceAddBalancenote) && Objects.equals(cceAddBalancenoteYoy, that.cceAddBalancenoteYoy) && Objects.equals(cceAddBalancenoteQoq, that.cceAddBalancenoteQoq) && Objects.equals(cceAddnote, that.cceAddnote) && Objects.equals(cceAddnoteYoy, that.cceAddnoteYoy) && Objects.equals(cceAddnoteQoq, that.cceAddnoteQoq) && Objects.equals(provisionInvestImpairment, that.provisionInvestImpairment) && Objects.equals(provisionInvestImpairmentYoy, that.provisionInvestImpairmentYoy) && Objects.equals(provisionInvestImpairmentQoq, that.provisionInvestImpairmentQoq) && Objects.equals(transferInvestImpairment, that.transferInvestImpairment) && Objects.equals(transferInvestImpairmentYoy, that.transferInvestImpairmentYoy) && Objects.equals(transferInvestImpairmentQoq, that.transferInvestImpairmentQoq) && Objects.equals(provisionLoanImpairment, that.provisionLoanImpairment) && Objects.equals(provisionLoanImpairmentYoy, that.provisionLoanImpairmentYoy) && Objects.equals(provisionLoanImpairmentQoq, that.provisionLoanImpairmentQoq) && Objects.equals(otherAssetImpairment, that.otherAssetImpairment) && Objects.equals(otherAssetImpairmentYoy, that.otherAssetImpairmentYoy) && Objects.equals(otherAssetImpairmentQoq, that.otherAssetImpairmentQoq) && Objects.equals(provisionPredictLiab, that.provisionPredictLiab) && Objects.equals(provisionPredictLiabYoy, that.provisionPredictLiabYoy) && Objects.equals(provisionPredictLiabQoq, that.provisionPredictLiabQoq) && Objects.equals(fixedAssetDepr, that.fixedAssetDepr) && Objects.equals(fixedAssetDeprYoy, that.fixedAssetDeprYoy) && Objects.equals(fixedAssetDeprQoq, that.fixedAssetDeprQoq) && Objects.equals(iaLpeAmortize, that.iaLpeAmortize) && Objects.equals(iaLpeAmortizeYoy, that.iaLpeAmortizeYoy) && Objects.equals(iaLpeAmortizeQoq, that.iaLpeAmortizeQoq) && Objects.equals(longassetAmortize, that.longassetAmortize) && Objects.equals(longassetAmortizeYoy, that.longassetAmortizeYoy) && Objects.equals(longassetAmortizeQoq, that.longassetAmortizeQoq) && Objects.equals(receiveWriteoff, that.receiveWriteoff) && Objects.equals(receiveWriteoffYoy, that.receiveWriteoffYoy) && Objects.equals(receiveWriteoffQoq, that.receiveWriteoffQoq) && Objects.equals(exchangeLoss, that.exchangeLoss) && Objects.equals(exchangeLossYoy, that.exchangeLossYoy) && Objects.equals(exchangeLossQoq, that.exchangeLossQoq) && Objects.equals(bondInterestExpense, that.bondInterestExpense) && Objects.equals(bondInterestExpenseYoy, that.bondInterestExpenseYoy) && Objects.equals(bondInterestExpenseQoq, that.bondInterestExpenseQoq) && Objects.equals(loanReduce, that.loanReduce) && Objects.equals(loanReduceYoy, that.loanReduceYoy) && Objects.equals(loanReduceQoq, that.loanReduceQoq) && Objects.equals(depositAdd, that.depositAdd) && Objects.equals(depositAddYoy, that.depositAddYoy) && Objects.equals(depositAddQoq, that.depositAddQoq) && Objects.equals(lendAdd, that.lendAdd) && Objects.equals(lendAddYoy, that.lendAddYoy) && Objects.equals(lendAddQoq, that.lendAddQoq) && Objects.equals(finassetReduce, that.finassetReduce) && Objects.equals(finassetReduceYoy, that.finassetReduceYoy) && Objects.equals(finassetReduceQoq, that.finassetReduceQoq) && Objects.equals(finliabAdd, that.finliabAdd) && Objects.equals(finliabAddYoy, that.finliabAddYoy) && Objects.equals(finliabAddQoq, that.finliabAddQoq) && Objects.equals(fboperateNetcashOther, that.fboperateNetcashOther) && Objects.equals(fboperateNetcashOtherYoy, that.fboperateNetcashOtherYoy) && Objects.equals(fboperateNetcashOtherQoq, that.fboperateNetcashOtherQoq) && Objects.equals(fboperateNetcashBalance, that.fboperateNetcashBalance) && Objects.equals(fboperateNetcashBalanceYoy, that.fboperateNetcashBalanceYoy) && Objects.equals(fboperateNetcashBalanceQoq, that.fboperateNetcashBalanceQoq) && Objects.equals(fbnetcashOperate, that.fbnetcashOperate) && Objects.equals(fbnetcashOperateYoy, that.fbnetcashOperateYoy) && Objects.equals(fbnetcashOperateQoq, that.fbnetcashOperateQoq) && Objects.equals(fbcceAddOther, that.fbcceAddOther) && Objects.equals(fbcceAddOtherYoy, that.fbcceAddOtherYoy) && Objects.equals(fbcceAddOtherQoq, that.fbcceAddOtherQoq) && Objects.equals(fbcceAddBalance, that.fbcceAddBalance) && Objects.equals(fbcceAddBalanceYoy, that.fbcceAddBalanceYoy) && Objects.equals(fbcceAddBalanceQoq, that.fbcceAddBalanceQoq) && Objects.equals(fbcceAdd, that.fbcceAdd) && Objects.equals(fbcceAddYoy, that.fbcceAddYoy) && Objects.equals(fbcceAddQoq, that.fbcceAddQoq) && Objects.equals(otherfintoolAdd, that.otherfintoolAdd) && Objects.equals(otherfintoolAddYoy, that.otherfintoolAddYoy) && Objects.equals(otherfintoolAddQoq, that.otherfintoolAddQoq) && Objects.equals(underwriteSecurity, that.underwriteSecurity) && Objects.equals(underwriteSecurityYoy, that.underwriteSecurityYoy) && Objects.equals(underwriteSecurityQoq, that.underwriteSecurityQoq) && Objects.equals(receiveAgentTrade, that.receiveAgentTrade) && Objects.equals(receiveAgentTradeYoy, that.receiveAgentTradeYoy) && Objects.equals(receiveAgentTradeQoq, that.receiveAgentTradeQoq) && Objects.equals(receiveBuyResale, that.receiveBuyResale) && Objects.equals(receiveBuyResaleYoy, that.receiveBuyResaleYoy) && Objects.equals(receiveBuyResaleQoq, that.receiveBuyResaleQoq) && Objects.equals(receiveAgentUnderwrite, that.receiveAgentUnderwrite) && Objects.equals(receiveAgentUnderwriteYoy, that.receiveAgentUnderwriteYoy) && Objects.equals(receiveAgentUnderwriteQoq, that.receiveAgentUnderwriteQoq) && Objects.equals(tradeSettleAdd, that.tradeSettleAdd) && Objects.equals(tradeSettleAddYoy, that.tradeSettleAddYoy) && Objects.equals(tradeSettleAddQoq, that.tradeSettleAddQoq) && Objects.equals(directInvestAdd, that.directInvestAdd) && Objects.equals(directInvestAddYoy, that.directInvestAddYoy) && Objects.equals(directInvestAddQoq, that.directInvestAddQoq) && Objects.equals(payBuyResale, that.payBuyResale) && Objects.equals(payBuyResaleYoy, that.payBuyResaleYoy) && Objects.equals(payBuyResaleQoq, that.payBuyResaleQoq) && Objects.equals(disposalTfaReduce, that.disposalTfaReduce) && Objects.equals(disposalTfaReduceYoy, that.disposalTfaReduceYoy) && Objects.equals(disposalTfaReduceQoq, that.disposalTfaReduceQoq) && Objects.equals(otherfintoolReduce, that.otherfintoolReduce) && Objects.equals(otherfintoolReduceYoy, that.otherfintoolReduceYoy) && Objects.equals(otherfintoolReduceQoq, that.otherfintoolReduceQoq) && Objects.equals(tradeSettleReduce, that.tradeSettleReduce) && Objects.equals(tradeSettleReduceYoy, that.tradeSettleReduceYoy) && Objects.equals(tradeSettleReduceQoq, that.tradeSettleReduceQoq) && Objects.equals(directInvestReduce, that.directInvestReduce) && Objects.equals(directInvestReduceYoy, that.directInvestReduceYoy) && Objects.equals(directInvestReduceQoq, that.directInvestReduceQoq) && Objects.equals(repoBusinessReduce, that.repoBusinessReduce) && Objects.equals(repoBusinessReduceYoy, that.repoBusinessReduceYoy) && Objects.equals(repoBusinessReduceQoq, that.repoBusinessReduceQoq) && Objects.equals(payAgentTrade, that.payAgentTrade) && Objects.equals(payAgentTradeYoy, that.payAgentTradeYoy) && Objects.equals(payAgentTradeQoq, that.payAgentTradeQoq) && Objects.equals(disposalAfaAdd, that.disposalAfaAdd) && Objects.equals(disposalAfaAddYoy, that.disposalAfaAddYoy) && Objects.equals(disposalAfaAddQoq, that.disposalAfaAddQoq) && Objects.equals(disposalAfaReduce, that.disposalAfaReduce) && Objects.equals(disposalAfaReduceYoy, that.disposalAfaReduceYoy) && Objects.equals(disposalAfaReduceQoq, that.disposalAfaReduceQoq) && Objects.equals(afaReduce, that.afaReduce) && Objects.equals(afaReduceYoy, that.afaReduceYoy) && Objects.equals(afaReduceQoq, that.afaReduceQoq) && Objects.equals(receiveTradeFinasset, that.receiveTradeFinasset) && Objects.equals(receiveTradeFinassetYoy, that.receiveTradeFinassetYoy) && Objects.equals(receiveTradeFinassetQoq, that.receiveTradeFinassetQoq) && Objects.equals(banksecurityLendAdd, that.banksecurityLendAdd) && Objects.equals(banksecurityLendAddYoy, that.banksecurityLendAddYoy) && Objects.equals(banksecurityLendAddQoq, that.banksecurityLendAddQoq) && Objects.equals(pbcInterbankReduce, that.pbcInterbankReduce) && Objects.equals(pbcInterbankReduceYoy, that.pbcInterbankReduceYoy) && Objects.equals(pbcInterbankReduceQoq, that.pbcInterbankReduceQoq) && Objects.equals(banksecurityRepoAdd, that.banksecurityRepoAdd) && Objects.equals(banksecurityRepoAddYoy, that.banksecurityRepoAddYoy) && Objects.equals(banksecurityRepoAddQoq, that.banksecurityRepoAddQoq) && Objects.equals(banksecurityResaleReduce, that.banksecurityResaleReduce) && Objects.equals(banksecurityResaleReduceYoy, that.banksecurityResaleReduceYoy) && Objects.equals(banksecurityResaleReduceQoq, that.banksecurityResaleReduceQoq) && Objects.equals(payReinsure, that.payReinsure) && Objects.equals(payReinsureYoy, that.payReinsureYoy) && Objects.equals(payReinsureQoq, that.payReinsureQoq) && Objects.equals(banksecurityLendReduce, that.banksecurityLendReduce) && Objects.equals(banksecurityLendReduceYoy, that.banksecurityLendReduceYoy) && Objects.equals(banksecurityLendReduceQoq, that.banksecurityLendReduceQoq) && Objects.equals(banksecurityResaleAdd, that.banksecurityResaleAdd) && Objects.equals(banksecurityResaleAddYoy, that.banksecurityResaleAddYoy) && Objects.equals(banksecurityResaleAddQoq, that.banksecurityResaleAddQoq) && Objects.equals(banksecurityRepoReduce, that.banksecurityRepoReduce) && Objects.equals(banksecurityRepoReduceYoy, that.banksecurityRepoReduceYoy) && Objects.equals(banksecurityRepoReduceQoq, that.banksecurityRepoReduceQoq) && Objects.equals(insuredInvestReduce, that.insuredInvestReduce) && Objects.equals(insuredInvestReduceYoy, that.insuredInvestReduceYoy) && Objects.equals(insuredInvestReduceQoq, that.insuredInvestReduceQoq) && Objects.equals(payTradeFinasset, that.payTradeFinasset) && Objects.equals(payTradeFinassetYoy, that.payTradeFinassetYoy) && Objects.equals(payTradeFinassetQoq, that.payTradeFinassetQoq) && Objects.equals(insuredPla, that.insuredPla) && Objects.equals(insuredPlaYoy, that.insuredPlaYoy) && Objects.equals(insuredPlaQoq, that.insuredPlaQoq) && Objects.equals(purchaseSubsidiaryOther, that.purchaseSubsidiaryOther) && Objects.equals(purchaseSubsidiaryOtherYoy, that.purchaseSubsidiaryOtherYoy) && Objects.equals(purchaseSubsidiaryOtherQoq, that.purchaseSubsidiaryOtherQoq) && Objects.equals(disposalSubsidiaryOutflow, that.disposalSubsidiaryOutflow) && Objects.equals(disposalSubsidiaryOutflowYoy, that.disposalSubsidiaryOutflowYoy) && Objects.equals(disposalSubsidiaryOutflowQoq, that.disposalSubsidiaryOutflowQoq) && Objects.equals(receiveSellRepo, that.receiveSellRepo) && Objects.equals(receiveSellRepoYoy, that.receiveSellRepoYoy) && Objects.equals(receiveSellRepoQoq, that.receiveSellRepoQoq) && Objects.equals(paySellRepo, that.paySellRepo) && Objects.equals(paySellRepoYoy, that.paySellRepoYoy) && Objects.equals(paySellRepoQoq, that.paySellRepoQoq) && Objects.equals(extractInsuranceReserve, that.extractInsuranceReserve) && Objects.equals(extractInsuranceReserveYoy, that.extractInsuranceReserveYoy) && Objects.equals(extractInsuranceReserveQoq, that.extractInsuranceReserveQoq) && Objects.equals(extractUnexpireReserve, that.extractUnexpireReserve) && Objects.equals(extractUnexpireReserveYoy, that.extractUnexpireReserveYoy) && Objects.equals(extractUnexpireReserveQoq, that.extractUnexpireReserveQoq) && Objects.equals(fbOperateNetcashOther, that.fbOperateNetcashOther) && Objects.equals(fbOperateNetcashOtherYoy, that.fbOperateNetcashOtherYoy) && Objects.equals(fbOperateNetcashOtherQoq, that.fbOperateNetcashOtherQoq) && Objects.equals(fbOperateNetcashBalance, that.fbOperateNetcashBalance) && Objects.equals(fbOperateNetcashBalanceYoy, that.fbOperateNetcashBalanceYoy) && Objects.equals(fbOperateNetcashBalanceQoq, that.fbOperateNetcashBalanceQoq) && Objects.equals(fbNetcashOperate, that.fbNetcashOperate) && Objects.equals(fbNetcashOperateYoy, that.fbNetcashOperateYoy) && Objects.equals(fbNetcashOperateQoq, that.fbNetcashOperateQoq) && Objects.equals(fbCceAddOther, that.fbCceAddOther) && Objects.equals(fbCceAddOtherYoy, that.fbCceAddOtherYoy) && Objects.equals(fbCceAddOtherQoq, that.fbCceAddOtherQoq) && Objects.equals(fbCceAddBalance, that.fbCceAddBalance) && Objects.equals(fbCceAddBalanceYoy, that.fbCceAddBalanceYoy) && Objects.equals(fbCceAddBalanceQoq, that.fbCceAddBalanceQoq) && Objects.equals(fbCceAdd, that.fbCceAdd) && Objects.equals(fbCceAddYoy, that.fbCceAddYoy) && Objects.equals(fbCceAddQoq, that.fbCceAddQoq);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityCode, reportType, reportDate, opinionType, osopinionType, salesServices, salesServicesYoy, salesServicesQoq, depositInterbankAdd, depositInterbankAddYoy, depositInterbankAddQoq, loanPbcAdd, loanPbcAddYoy, loanPbcAddQoq, ofiBfAdd, ofiBfAddYoy, ofiBfAddQoq, receiveOrigicPremium, receiveOrigicPremiumYoy, receiveOrigicPremiumQoq, receiveReinsureNet, receiveReinsureNetYoy, receiveReinsureNetQoq, insuredInvestAdd, insuredInvestAddYoy, insuredInvestAddQoq, disposalTfaAdd, disposalTfaAddYoy, disposalTfaAddQoq, receiveInterestCommission, receiveInterestCommissionYoy, receiveInterestCommissionQoq, borrowFundAdd, borrowFundAddYoy, borrowFundAddQoq, loanAdvanceReduce, loanAdvanceReduceYoy, loanAdvanceReduceQoq, repoBusinessAdd, repoBusinessAddYoy, repoBusinessAddQoq, receiveTaxRefund, receiveTaxRefundYoy, receiveTaxRefundQoq, receiveOtherOperate, receiveOtherOperateYoy, receiveOtherOperateQoq, operateInflowOther, operateInflowOtherYoy, operateInflowOtherQoq, operateInflowBalance, operateInflowBalanceYoy, operateInflowBalanceQoq, totalOperateInflow, totalOperateInflowYoy, totalOperateInflowQoq, buyServices, buyServicesYoy, buyServicesQoq, loanAdvanceAdd, loanAdvanceAddYoy, loanAdvanceAddQoq, pbcInterbankAdd, pbcInterbankAddYoy, pbcInterbankAddQoq, payOrigicCompensate, payOrigicCompensateYoy, payOrigicCompensateQoq, payInterestCommission, payInterestCommissionYoy, payInterestCommissionQoq, payPolicyBonus, payPolicyBonusYoy, payPolicyBonusQoq, payStaffCash, payStaffCashYoy, payStaffCashQoq, payAllTax, payAllTaxYoy, payAllTaxQoq, payOtherOperate, payOtherOperateYoy, payOtherOperateQoq, operateOutflowOther, operateOutflowOtherYoy, operateOutflowOtherQoq, depositIofiOther, depositIofiOtherYoy, depositIofiOtherQoq, operateOutflowBalance, operateOutflowBalanceYoy, operateOutflowBalanceQoq, customerDepositAdd, customerDepositAddYoy, customerDepositAddQoq, totalOperateOutflow, totalOperateOutflowYoy, totalOperateOutflowQoq, iofiAdd, iofiAddYoy, iofiAddQoq, operateNetcashOther, operateNetcashOtherYoy, operateNetcashOtherQoq, operateNetcashBalance, operateNetcashBalanceYoy, operateNetcashBalanceQoq, pbcIofiReduce, pbcIofiReduceYoy, pbcIofiReduceQoq, netcashOperate, netcashOperateYoy, netcashOperateQoq, depositPbcReduce, depositPbcReduceYoy, depositPbcReduceQoq, withdrawInvest, withdrawInvestYoy, withdrawInvestQoq, depositIofiReduce, depositIofiReduceYoy, depositIofiReduceQoq, receiveInvestIncome, receiveInvestIncomeYoy, receiveInvestIncomeQoq, borrowRepoAdd, borrowRepoAddYoy, borrowRepoAddQoq, disposalLongAsset, disposalLongAssetYoy, disposalLongAssetQoq, disposalSubsidiaryOther, disposalSubsidiaryOtherYoy, disposalSubsidiaryOtherQoq, sellRepoAdd, sellRepoAddYoy, sellRepoAddQoq, reducePledgeTimedeposits, reducePledgeTimedepositsYoy, reducePledgeTimedepositsQoq, lendResaleReduce, lendResaleReduceYoy, lendResaleReduceQoq, receiveOtherInvest, receiveOtherInvestYoy, receiveOtherInvestQoq, lendFundReduce, lendFundReduceYoy, lendFundReduceQoq, investInflowOther, investInflowOtherYoy, investInflowOtherQoq, buyResaleReduce, buyResaleReduceYoy, buyResaleReduceQoq, investInflowBalance, investInflowBalanceYoy, investInflowBalanceQoq, netCd, netCdYoy, netCdQoq, totalInvestInflow, totalInvestInflowYoy, totalInvestInflowQoq, tradeFinliabAdd, tradeFinliabAddYoy, tradeFinliabAddQoq, constructLongAsset, constructLongAssetYoy, constructLongAssetQoq, tradeFinassetReduce, tradeFinassetReduceYoy, tradeFinassetReduceQoq, investPayCash, investPayCashYoy, investPayCashQoq, pledgeLoanAdd, pledgeLoanAddYoy, pledgeLoanAddQoq, obtainSubsidiaryOther, obtainSubsidiaryOtherYoy, obtainSubsidiaryOtherQoq, receiveInterest, receiveInterestYoy, receiveInterestQoq, receiveCommission, receiveCommissionYoy, receiveCommissionQoq, addPledgeTimedeposits, addPledgeTimedepositsYoy, addPledgeTimedepositsQoq, disposalMortgageAsset, disposalMortgageAssetYoy, disposalMortgageAssetQoq, payOtherInvest, payOtherInvestYoy, payOtherInvestQoq, withdrawWriteoffLoan, withdrawWriteoffLoanYoy, withdrawWriteoffLoanQoq, investOutflowOther, investOutflowOtherYoy, investOutflowOtherQoq, investOutflowBalance, investOutflowBalanceYoy, investOutflowBalanceQoq, totalInvestOutflow, totalInvestOutflowYoy, totalInvestOutflowQoq, investNetcashOther, investNetcashOtherYoy, investNetcashOtherQoq, investNetcashBalance, investNetcashBalanceYoy, investNetcashBalanceQoq, netcashInvest, netcashInvestYoy, netcashInvestQoq, loanPbcReduce, loanPbcReduceYoy, loanPbcReduceQoq, acceptInvestCash, acceptInvestCashYoy, acceptInvestCashQoq, pbcIofiAdd, pbcIofiAddYoy, pbcIofiAddQoq, subsidiaryAcceptInvest, subsidiaryAcceptInvestYoy, subsidiaryAcceptInvestQoq, depositPbcAdd, depositPbcAddYoy, depositPbcAddQoq, receiveLoanCash, receiveLoanCashYoy, receiveLoanCashQoq, depositIofiAdd, depositIofiAddYoy, depositIofiAddQoq, issueBond, issueBondYoy, issueBondQoq, interbankOtherReduce, interbankOtherReduceYoy, interbankOtherReduceQoq, receiveOtherFinance, receiveOtherFinanceYoy, receiveOtherFinanceQoq, issuedCdReduce, issuedCdReduceYoy, issuedCdReduceQoq, financeInflowOther, financeInflowOtherYoy, financeInflowOtherQoq, lendResaleAdd, lendResaleAddYoy, lendResaleAddQoq, financeInflowBalance, financeInflowBalanceYoy, financeInflowBalanceQoq, lendFundAdd, lendFundAddYoy, lendFundAddQoq, totalFinanceInflow, totalFinanceInflowYoy, totalFinanceInflowQoq, buyResaleAdd, buyResaleAddYoy, buyResaleAddQoq, payDebtCash, payDebtCashYoy, payDebtCashQoq, borrowRepoReduce, borrowRepoReduceYoy, borrowRepoReduceQoq, assignDividendPorfit, assignDividendPorfitYoy, assignDividendPorfitQoq, borrowFundReduce, borrowFundReduceYoy, borrowFundReduceQoq, subsidiaryPayDividend, subsidiaryPayDividendYoy, subsidiaryPayDividendQoq, sellRepoReduce, sellRepoReduceYoy, sellRepoReduceQoq, buySubsidiaryEquity, buySubsidiaryEquityYoy, buySubsidiaryEquityQoq, tradeFinassetAdd, tradeFinassetAddYoy, tradeFinassetAddQoq, payOtherFinance, payOtherFinanceYoy, payOtherFinanceQoq, tradeFinliabReduce, tradeFinliabReduceYoy, tradeFinliabReduceQoq, subsidiaryReduceCash, subsidiaryReduceCashYoy, subsidiaryReduceCashQoq, financeOutflowOther, financeOutflowOtherYoy, financeOutflowOtherQoq, payInterest, payInterestYoy, payInterestQoq, financeOutflowBalance, financeOutflowBalanceYoy, financeOutflowBalanceQoq, payCommission, payCommissionYoy, payCommissionQoq, totalFinanceOutflow, totalFinanceOutflowYoy, totalFinanceOutflowQoq, financeNetcashOther, financeNetcashOtherYoy, financeNetcashOtherQoq, buyFinLease, buyFinLeaseYoy, buyFinLeaseQoq, financeNetcashBalance, financeNetcashBalanceYoy, financeNetcashBalanceQoq, accountsReceAdd, accountsReceAddYoy, accountsReceAddQoq, netcashFinance, netcashFinanceYoy, netcashFinanceQoq, rateChangeEffect, rateChangeEffectYoy, rateChangeEffectQoq, cceAddOther, cceAddOtherYoy, cceAddOtherQoq, cceAddBalance, cceAddBalanceYoy, cceAddBalanceQoq, cceAdd, cceAddYoy, cceAddQoq, beginCce, beginCceYoy, beginCceQoq, endCceOther, endCceOtherYoy, endCceOtherQoq, endCceBalance, endCceBalanceYoy, endCceBalanceQoq, endCce, endCceYoy, endCceQoq, netprofit, netprofitYoy, netprofitQoq, minorityInterest, minorityInterestYoy, minorityInterestQoq, receiveDividendProfit, receiveDividendProfitYoy, receiveDividendProfitQoq, assetImpairment, assetImpairmentYoy, assetImpairmentQoq, faIrDepr, faIrDeprYoy, faIrDeprQoq, disposalSubsidiaryJoint, disposalSubsidiaryJointYoy, disposalSubsidiaryJointQoq, oilgasBiologyDepr, oilgasBiologyDeprYoy, oilgasBiologyDeprQoq, irDepr, irDeprYoy, irDeprQoq, iaAmortize, iaAmortizeYoy, iaAmortizeQoq, lpeAmortize, lpeAmortizeYoy, lpeAmortizeQoq, deferIncomeAmortize, deferIncomeAmortizeYoy, deferIncomeAmortizeQoq, prepaidExpenseReduce, prepaidExpenseReduceYoy, prepaidExpenseReduceQoq, accruedExpenseAdd, accruedExpenseAddYoy, accruedExpenseAddQoq, disposalLongassetLoss, disposalLongassetLossYoy, disposalLongassetLossQoq, faScrapLoss, faScrapLossYoy, faScrapLossQoq, fairvalueChangeLoss, fairvalueChangeLossYoy, fairvalueChangeLossQoq, financeExpense, financeExpenseYoy, financeExpenseQoq, investLoss, investLossYoy, investLossQoq, deferTax, deferTaxYoy, deferTaxQoq, issueSubbond, issueSubbondYoy, issueSubbondQoq, dtAssetReduce, dtAssetReduceYoy, dtAssetReduceQoq, issueOtherBond, issueOtherBondYoy, issueOtherBondQoq, dtLiabAdd, dtLiabAddYoy, dtLiabAddQoq, predictLiabAdd, predictLiabAddYoy, predictLiabAddQoq, inventoryReduce, inventoryReduceYoy, inventoryReduceQoq, operateReceReduce, operateReceReduceYoy, operateReceReduceQoq, issueCd, issueCdYoy, issueCdQoq, operatePayableAdd, operatePayableAddYoy, operatePayableAddQoq, receiveAddEquity, receiveAddEquityYoy, receiveAddEquityQoq, other, otherYoy, otherQoq, operateNetcashOthernote, operateNetcashOthernoteYoy, operateNetcashOthernoteQoq, operateNetcashBalancenote, operateNetcashBalancenoteYoy, operateNetcashBalancenoteQoq, netcashOperatenote, netcashOperatenoteYoy, netcashOperatenoteQoq, debtTransferCapital, debtTransferCapitalYoy, debtTransferCapitalQoq, payBondInterest, payBondInterestYoy, payBondInterestQoq, convertBond1year, convertBond1yearYoy, convertBond1yearQoq, issueSharesExpense, issueSharesExpenseYoy, issueSharesExpenseQoq, finleaseObtainFa, finleaseObtainFaYoy, finleaseObtainFaQoq, uninvolveInvestfinOther, uninvolveInvestfinOtherYoy, uninvolveInvestfinOtherQoq, endCash, endCashYoy, endCashQoq, beginCash, beginCashYoy, beginCashQoq, endCashEquivalents, endCashEquivalentsYoy, endCashEquivalentsQoq, beginCashEquivalents, beginCashEquivalentsYoy, beginCashEquivalentsQoq, cceAddOthernote, cceAddOthernoteYoy, cceAddOthernoteQoq, cceAddBalancenote, cceAddBalancenoteYoy, cceAddBalancenoteQoq, cceAddnote, cceAddnoteYoy, cceAddnoteQoq, provisionInvestImpairment, provisionInvestImpairmentYoy, provisionInvestImpairmentQoq, transferInvestImpairment, transferInvestImpairmentYoy, transferInvestImpairmentQoq, provisionLoanImpairment, provisionLoanImpairmentYoy, provisionLoanImpairmentQoq, otherAssetImpairment, otherAssetImpairmentYoy, otherAssetImpairmentQoq, provisionPredictLiab, provisionPredictLiabYoy, provisionPredictLiabQoq, fixedAssetDepr, fixedAssetDeprYoy, fixedAssetDeprQoq, iaLpeAmortize, iaLpeAmortizeYoy, iaLpeAmortizeQoq, longassetAmortize, longassetAmortizeYoy, longassetAmortizeQoq, receiveWriteoff, receiveWriteoffYoy, receiveWriteoffQoq, exchangeLoss, exchangeLossYoy, exchangeLossQoq, bondInterestExpense, bondInterestExpenseYoy, bondInterestExpenseQoq, loanReduce, loanReduceYoy, loanReduceQoq, depositAdd, depositAddYoy, depositAddQoq, lendAdd, lendAddYoy, lendAddQoq, finassetReduce, finassetReduceYoy, finassetReduceQoq, finliabAdd, finliabAddYoy, finliabAddQoq, fboperateNetcashOther, fboperateNetcashOtherYoy, fboperateNetcashOtherQoq, fboperateNetcashBalance, fboperateNetcashBalanceYoy, fboperateNetcashBalanceQoq, fbnetcashOperate, fbnetcashOperateYoy, fbnetcashOperateQoq, fbcceAddOther, fbcceAddOtherYoy, fbcceAddOtherQoq, fbcceAddBalance, fbcceAddBalanceYoy, fbcceAddBalanceQoq, fbcceAdd, fbcceAddYoy, fbcceAddQoq, otherfintoolAdd, otherfintoolAddYoy, otherfintoolAddQoq, underwriteSecurity, underwriteSecurityYoy, underwriteSecurityQoq, receiveAgentTrade, receiveAgentTradeYoy, receiveAgentTradeQoq, receiveBuyResale, receiveBuyResaleYoy, receiveBuyResaleQoq, receiveAgentUnderwrite, receiveAgentUnderwriteYoy, receiveAgentUnderwriteQoq, tradeSettleAdd, tradeSettleAddYoy, tradeSettleAddQoq, directInvestAdd, directInvestAddYoy, directInvestAddQoq, payBuyResale, payBuyResaleYoy, payBuyResaleQoq, disposalTfaReduce, disposalTfaReduceYoy, disposalTfaReduceQoq, otherfintoolReduce, otherfintoolReduceYoy, otherfintoolReduceQoq, tradeSettleReduce, tradeSettleReduceYoy, tradeSettleReduceQoq, directInvestReduce, directInvestReduceYoy, directInvestReduceQoq, repoBusinessReduce, repoBusinessReduceYoy, repoBusinessReduceQoq, payAgentTrade, payAgentTradeYoy, payAgentTradeQoq, disposalAfaAdd, disposalAfaAddYoy, disposalAfaAddQoq, disposalAfaReduce, disposalAfaReduceYoy, disposalAfaReduceQoq, afaReduce, afaReduceYoy, afaReduceQoq, receiveTradeFinasset, receiveTradeFinassetYoy, receiveTradeFinassetQoq, banksecurityLendAdd, banksecurityLendAddYoy, banksecurityLendAddQoq, pbcInterbankReduce, pbcInterbankReduceYoy, pbcInterbankReduceQoq, banksecurityRepoAdd, banksecurityRepoAddYoy, banksecurityRepoAddQoq, banksecurityResaleReduce, banksecurityResaleReduceYoy, banksecurityResaleReduceQoq, payReinsure, payReinsureYoy, payReinsureQoq, banksecurityLendReduce, banksecurityLendReduceYoy, banksecurityLendReduceQoq, banksecurityResaleAdd, banksecurityResaleAddYoy, banksecurityResaleAddQoq, banksecurityRepoReduce, banksecurityRepoReduceYoy, banksecurityRepoReduceQoq, insuredInvestReduce, insuredInvestReduceYoy, insuredInvestReduceQoq, payTradeFinasset, payTradeFinassetYoy, payTradeFinassetQoq, insuredPla, insuredPlaYoy, insuredPlaQoq, purchaseSubsidiaryOther, purchaseSubsidiaryOtherYoy, purchaseSubsidiaryOtherQoq, disposalSubsidiaryOutflow, disposalSubsidiaryOutflowYoy, disposalSubsidiaryOutflowQoq, receiveSellRepo, receiveSellRepoYoy, receiveSellRepoQoq, paySellRepo, paySellRepoYoy, paySellRepoQoq, extractInsuranceReserve, extractInsuranceReserveYoy, extractInsuranceReserveQoq, extractUnexpireReserve, extractUnexpireReserveYoy, extractUnexpireReserveQoq, fbOperateNetcashOther, fbOperateNetcashOtherYoy, fbOperateNetcashOtherQoq, fbOperateNetcashBalance, fbOperateNetcashBalanceYoy, fbOperateNetcashBalanceQoq, fbNetcashOperate, fbNetcashOperateYoy, fbNetcashOperateQoq, fbCceAddOther, fbCceAddOtherYoy, fbCceAddOtherQoq, fbCceAddBalance, fbCceAddBalanceYoy, fbCceAddBalanceQoq, fbCceAdd, fbCceAddYoy, fbCceAddQoq);
    }

}
