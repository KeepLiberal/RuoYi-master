package com.ruoyi.investment.domain;

import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 财务分析-现金流量对象 inv_finance_xjll
 * 
 * @author yangwenyang
 * @date 2022-12-31
 */
public class InvFinanceXjll extends BaseEntity{
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

    /** 现金的期初余额 */
    @Excel(name = "现金的期初余额")
    private Double beginCash;

    /** 现金的期初余额(环比%) */
    @Excel(name = "现金的期初余额(环比%)")
    private Double beginCashYoy;

    /** 拆入资金净减少额 */
    @Excel(name = "拆入资金净减少额")
    private Double borrowFundReduce;

    /** 拆入资金净减少额(环比%) */
    @Excel(name = "拆入资金净减少额(环比%)")
    private Double borrowFundReduceYoy;

    /** 经营活动现金流入的平衡项目 */
    @Excel(name = "经营活动现金流入的平衡项目")
    private Double operateInflowBalance;

    /** 经营活动现金流入的平衡项目(环比%) */
    @Excel(name = "经营活动现金流入的平衡项目(环比%)")
    private Double operateInflowBalanceYoy;

    /** 固定资产报废损失 */
    @Excel(name = "固定资产报废损失")
    private Double faScrapLoss;

    /** 固定资产报废损失(环比%) */
    @Excel(name = "固定资产报废损失(环比%)")
    private Double faScrapLossYoy;

    /** 经营活动现金流出的其他项目 */
    @Excel(name = "经营活动现金流出的其他项目")
    private Double operateOutflowOther;

    /** 经营活动现金流出的其他项目(环比%) */
    @Excel(name = "经营活动现金流出的其他项目(环比%)")
    private Double operateOutflowOtherYoy;

    /** 公允价值变动损失 */
    @Excel(name = "公允价值变动损失")
    private Double fairvalueChangeLoss;

    /** 公允价值变动损失(环比%) */
    @Excel(name = "公允价值变动损失(环比%)")
    private Double fairvalueChangeLossYoy;

    /** 经营活动现金流入的其他项目 */
    @Excel(name = "经营活动现金流入的其他项目")
    private Double operateInflowOther;

    /** 经营活动现金流入的其他项目(环比%) */
    @Excel(name = "经营活动现金流入的其他项目(环比%)")
    private Double operateInflowOtherYoy;

    /** 筹资活动产生的现金流量净额 */
    @Excel(name = "筹资活动产生的现金流量净额")
    private Double netcashFinance;

    /** 筹资活动产生的现金流量净额(环比%) */
    @Excel(name = "筹资活动产生的现金流量净额(环比%)")
    private Double netcashFinanceYoy;

    /** 存放中央银行款项净增加额 */
    @Excel(name = "存放中央银行款项净增加额")
    private Double depositPbcAdd;

    /** 存放中央银行款项净增加额(环比%) */
    @Excel(name = "存放中央银行款项净增加额(环比%)")
    private Double depositPbcAddYoy;

    /** 投资活动产生的现金流量净额其他项目 */
    @Excel(name = "投资活动产生的现金流量净额其他项目")
    private Double investNetcashOther;

    /** 投资活动产生的现金流量净额其他项目(环比%) */
    @Excel(name = "投资活动产生的现金流量净额其他项目(环比%)")
    private Double investNetcashOtherYoy;

    /** 收到其他与经营活动有关的现金 */
    @Excel(name = "收到其他与经营活动有关的现金")
    private Double receiveOtherOperate;

    /** 收到其他与经营活动有关的现金(环比%) */
    @Excel(name = "收到其他与经营活动有关的现金(环比%)")
    private Double receiveOtherOperateYoy;

    /** 支付利息的现金 */
    @Excel(name = "支付利息的现金")
    private Double payInterest;

    /** 支付利息的现金(环比%) */
    @Excel(name = "支付利息的现金(环比%)")
    private Double payInterestYoy;

    /** 发行次级债券所收到的现金 */
    @Excel(name = "发行次级债券所收到的现金")
    private Double issueSubbond;

    /** 发行次级债券所收到的现金(环比%) */
    @Excel(name = "发行次级债券所收到的现金(环比%)")
    private Double issueSubbondYoy;

    /** 投资支付的现金 */
    @Excel(name = "投资支付的现金")
    private Double investPayCash;

    /** 投资支付的现金(环比%) */
    @Excel(name = "投资支付的现金(环比%)")
    private Double investPayCashYoy;

    /** 增加股本所收到的现金 */
    @Excel(name = "增加股本所收到的现金")
    private Double receiveAddEquity;

    /** 增加股本所收到的现金(环比%) */
    @Excel(name = "增加股本所收到的现金(环比%)")
    private Double receiveAddEquityYoy;

    /** 拆出资金净增加额 */
    @Excel(name = "拆出资金净增加额")
    private Double lendFundAdd;

    /** 拆出资金净增加额(环比%) */
    @Excel(name = "拆出资金净增加额(环比%)")
    private Double lendFundAddYoy;

    /** 拆入资金及卖出回购金融资产款净增加额 */
    @Excel(name = "拆入资金及卖出回购金融资产款净增加额")
    private Double borrowRepoAdd;

    /** 拆入资金及卖出回购金融资产款净增加额(环比%) */
    @Excel(name = "拆入资金及卖出回购金融资产款净增加额(环比%)")
    private Double borrowRepoAddYoy;

    /** 筹资活动产生的现金流量净额其他项目 */
    @Excel(name = "筹资活动产生的现金流量净额其他项目")
    private Double financeNetcashOther;

    /** 筹资活动产生的现金流量净额其他项目(环比%) */
    @Excel(name = "筹资活动产生的现金流量净额其他项目(环比%)")
    private Double financeNetcashOtherYoy;

    /** 贷款的减少 */
    @Excel(name = "贷款的减少")
    private Double loanReduce;

    /** 贷款的减少(环比%) */
    @Excel(name = "贷款的减少(环比%)")
    private Double loanReduceYoy;

    /** 向中央银行借款净增加额 */
    @Excel(name = "向中央银行借款净增加额")
    private Double loanPbcAdd;

    /** 向中央银行借款净增加额(环比%) */
    @Excel(name = "向中央银行借款净增加额(环比%)")
    private Double loanPbcAddYoy;

    /** 计提其他资产减值准备 */
    @Excel(name = "计提其他资产减值准备")
    private Double otherAssetImpairment;

    /** 计提其他资产减值准备(环比%) */
    @Excel(name = "计提其他资产减值准备(环比%)")
    private Double otherAssetImpairmentYoy;

    /** 收到已核销款项 */
    @Excel(name = "收到已核销款项")
    private Double receiveWriteoff;

    /** 收到已核销款项(环比%) */
    @Excel(name = "收到已核销款项(环比%)")
    private Double receiveWriteoffYoy;

    /** 汇率变动对现金及现金等价物的影响 */
    @Excel(name = "汇率变动对现金及现金等价物的影响")
    private Double rateChangeEffect;

    /** 汇率变动对现金及现金等价物的影响(环比%) */
    @Excel(name = "汇率变动对现金及现金等价物的影响(环比%)")
    private Double rateChangeEffectYoy;

    /** 现金及现金等价物净增加额其他项目 */
    @Excel(name = "现金及现金等价物净增加额其他项目")
    private Double fbcceAddOther;

    /** 现金及现金等价物净增加额其他项目(环比%) */
    @Excel(name = "现金及现金等价物净增加额其他项目(环比%)")
    private Double fbcceAddOtherYoy;

    /** 递延所得税资产减少 */
    @Excel(name = "递延所得税资产减少")
    private Double dtAssetReduce;

    /** 递延所得税资产减少(环比%) */
    @Excel(name = "递延所得税资产减少(环比%)")
    private Double dtAssetReduceYoy;

    /** 吸收投资收到的现金 */
    @Excel(name = "吸收投资收到的现金")
    private Double acceptInvestCash;

    /** 吸收投资收到的现金(环比%) */
    @Excel(name = "吸收投资收到的现金(环比%)")
    private Double acceptInvestCashYoy;

    /** 期末现金及现金等价物余额其他项目 */
    @Excel(name = "期末现金及现金等价物余额其他项目")
    private Double endCceOther;

    /** 期末现金及现金等价物余额其他项目(环比%) */
    @Excel(name = "期末现金及现金等价物余额其他项目(环比%)")
    private Double endCceOtherYoy;

    /** 筹资活动现金流入的平衡项目 */
    @Excel(name = "筹资活动现金流入的平衡项目")
    private Double financeInflowBalance;

    /** 筹资活动现金流入的平衡项目(环比%) */
    @Excel(name = "筹资活动现金流入的平衡项目(环比%)")
    private Double financeInflowBalanceYoy;

    /** 期末现金及现金等价物余额 */
    @Excel(name = "期末现金及现金等价物余额")
    private Double endCce;

    /** 期末现金及现金等价物余额(环比%) */
    @Excel(name = "期末现金及现金等价物余额(环比%)")
    private Double endCceYoy;

    /** 筹资活动现金流入小计 */
    @Excel(name = "筹资活动现金流入小计")
    private Double totalFinanceInflow;

    /** 筹资活动现金流入小计(环比%) */
    @Excel(name = "筹资活动现金流入小计(环比%)")
    private Double totalFinanceInflowYoy;

    /** 现金及现金等价物净增加额其他项目 */
    @Excel(name = "现金及现金等价物净增加额其他项目")
    private Double cceAddOther;

    /** 现金及现金等价物净增加额其他项目(环比%) */
    @Excel(name = "现金及现金等价物净增加额其他项目(环比%)")
    private Double cceAddOtherYoy;

    /** 现金及现金等价物净增加额平衡项目 */
    @Excel(name = "现金及现金等价物净增加额平衡项目")
    private Double cceAddBalance;

    /** 现金及现金等价物净增加额平衡项目(环比%) */
    @Excel(name = "现金及现金等价物净增加额平衡项目(环比%)")
    private Double cceAddBalanceYoy;

    /** 汇兑损失 */
    @Excel(name = "汇兑损失")
    private Double exchangeLoss;

    /** 汇兑损失(环比%) */
    @Excel(name = "汇兑损失(环比%)")
    private Double exchangeLossYoy;

    /** 客户贷款及垫款净增加额 */
    @Excel(name = "客户贷款及垫款净增加额")
    private Double loanAdvanceAdd;

    /** 客户贷款及垫款净增加额(环比%) */
    @Excel(name = "客户贷款及垫款净增加额(环比%)")
    private Double loanAdvanceAddYoy;

    /** 投资损失 */
    @Excel(name = "投资损失")
    private Double investLoss;

    /** 投资损失(环比%) */
    @Excel(name = "投资损失(环比%)")
    private Double investLossYoy;

    /** 现金及现金等价物净增加额平衡项目 */
    @Excel(name = "现金及现金等价物净增加额平衡项目")
    private Double fbcceAddBalance;

    /** 现金及现金等价物净增加额平衡项目(环比%) */
    @Excel(name = "现金及现金等价物净增加额平衡项目(环比%)")
    private Double fbcceAddBalanceYoy;

    /** 现金及现金等价物净增加额 */
    @Excel(name = "现金及现金等价物净增加额")
    private Double cceAdd;

    /** 现金及现金等价物净增加额(环比%) */
    @Excel(name = "现金及现金等价物净增加额(环比%)")
    private Double cceAddYoy;

    /** 收取手续费及佣金的现金 */
    @Excel(name = "收取手续费及佣金的现金")
    private Double receiveCommission;

    /** 收取手续费及佣金的现金(环比%) */
    @Excel(name = "收取手续费及佣金的现金(环比%)")
    private Double receiveCommissionYoy;

    /** 递延所得税负债增加 */
    @Excel(name = "递延所得税负债增加")
    private Double dtLiabAdd;

    /** 递延所得税负债增加(环比%) */
    @Excel(name = "递延所得税负债增加(环比%)")
    private Double dtLiabAddYoy;

    /** 递延所得税 */
    @Excel(name = "递延所得税")
    private Double deferTax;

    /** 递延所得税(环比%) */
    @Excel(name = "递延所得税(环比%)")
    private Double deferTaxYoy;

    /** 投资活动现金流出的平衡项目 */
    @Excel(name = "投资活动现金流出的平衡项目")
    private Double investOutflowBalance;

    /** 投资活动现金流出的平衡项目(环比%) */
    @Excel(name = "投资活动现金流出的平衡项目(环比%)")
    private Double investOutflowBalanceYoy;

    /** 存放同业及其他金融机构款项净减少额 */
    @Excel(name = "存放同业及其他金融机构款项净减少额")
    private Double depositIofiReduce;

    /** 存放同业及其他金融机构款项净减少额(环比%) */
    @Excel(name = "存放同业及其他金融机构款项净减少额(环比%)")
    private Double depositIofiReduceYoy;

    /** 固定资产折旧 */
    @Excel(name = "固定资产折旧")
    private Double fixedAssetDepr;

    /** 固定资产折旧(环比%) */
    @Excel(name = "固定资产折旧(环比%)")
    private Double fixedAssetDeprYoy;

    /** 融资租入固定资产 */
    @Excel(name = "融资租入固定资产")
    private Double finleaseObtainFa;

    /** 融资租入固定资产(环比%) */
    @Excel(name = "融资租入固定资产(环比%)")
    private Double finleaseObtainFaYoy;

    /** 交易性金融资产净增加额 */
    @Excel(name = "交易性金融资产净增加额")
    private Double tradeFinassetAdd;

    /** 交易性金融资产净增加额(环比%) */
    @Excel(name = "交易性金融资产净增加额(环比%)")
    private Double tradeFinassetAddYoy;

    /** 存放中央银行和同业及其他金融机构款项净增加额 */
    @Excel(name = "存放中央银行和同业及其他金融机构款项净增加额")
    private Double pbcIofiAdd;

    /** 存放中央银行和同业及其他金融机构款项净增加额(环比%) */
    @Excel(name = "存放中央银行和同业及其他金融机构款项净增加额(环比%)")
    private Double pbcIofiAddYoy;

    /** 长期资产摊销 */
    @Excel(name = "长期资产摊销")
    private Double longassetAmortize;

    /** 长期资产摊销(环比%) */
    @Excel(name = "长期资产摊销(环比%)")
    private Double longassetAmortizeYoy;

    /** 投资活动现金流入小计 */
    @Excel(name = "投资活动现金流入小计")
    private Double totalInvestInflow;

    /** 投资活动现金流入小计(环比%) */
    @Excel(name = "投资活动现金流入小计(环比%)")
    private Double totalInvestInflowYoy;

    /** 筹资活动产生的现金流量净额平衡项目 */
    @Excel(name = "筹资活动产生的现金流量净额平衡项目")
    private Double financeNetcashBalance;

    /** 筹资活动产生的现金流量净额平衡项目(环比%) */
    @Excel(name = "筹资活动产生的现金流量净额平衡项目(环比%)")
    private Double financeNetcashBalanceYoy;

    /** 向中央银行借款净减少额 */
    @Excel(name = "向中央银行借款净减少额")
    private Double loanPbcReduce;

    /** 向中央银行借款净减少额(环比%) */
    @Excel(name = "向中央银行借款净减少额(环比%)")
    private Double loanPbcReduceYoy;

    /** 支付手续费及佣金的现金 */
    @Excel(name = "支付手续费及佣金的现金")
    private Double payCommission;

    /** 支付手续费及佣金的现金(环比%) */
    @Excel(name = "支付手续费及佣金的现金(环比%)")
    private Double payCommissionYoy;

    /** 收到的其他与投资活动有关的现金 */
    @Excel(name = "收到的其他与投资活动有关的现金")
    private Double receiveOtherInvest;

    /** 收到的其他与投资活动有关的现金(环比%) */
    @Excel(name = "收到的其他与投资活动有关的现金(环比%)")
    private Double receiveOtherInvestYoy;

    /** 拆借款项的净增加 */
    @Excel(name = "拆借款项的净增加")
    private Double lendAdd;

    /** 拆借款项的净增加(环比%) */
    @Excel(name = "拆借款项的净增加(环比%)")
    private Double lendAddYoy;

    /** 固定资产和投资性房地产折旧 */
    @Excel(name = "固定资产和投资性房地产折旧")
    private Double faIrDepr;

    /** 固定资产和投资性房地产折旧(环比%) */
    @Excel(name = "固定资产和投资性房地产折旧(环比%)")
    private Double faIrDeprYoy;

    /** 计提贷款减值准备 */
    @Excel(name = "计提贷款减值准备")
    private Double provisionLoanImpairment;

    /** 计提贷款减值准备(环比%) */
    @Excel(name = "计提贷款减值准备(环比%)")
    private Double provisionLoanImpairmentYoy;

    /** 经营活动现金流出的平衡项目 */
    @Excel(name = "经营活动现金流出的平衡项目")
    private Double operateOutflowBalance;

    /** 经营活动现金流出的平衡项目(环比%) */
    @Excel(name = "经营活动现金流出的平衡项目(环比%)")
    private Double operateOutflowBalanceYoy;

    /** 拆出资金及买入返售金融资产净增加额 */
    @Excel(name = "拆出资金及买入返售金融资产净增加额")
    private Double lendResaleAdd;

    /** 拆出资金及买入返售金融资产净增加额(环比%) */
    @Excel(name = "拆出资金及买入返售金融资产净增加额(环比%)")
    private Double lendResaleAddYoy;

    /** 买入返售金融资产净减少额 */
    @Excel(name = "买入返售金融资产净减少额")
    private Double buyResaleReduce;

    /** 买入返售金融资产净减少额(环比%) */
    @Excel(name = "买入返售金融资产净减少额(环比%)")
    private Double buyResaleReduceYoy;

    /** 客户存款净增加额 */
    @Excel(name = "客户存款净增加额")
    private Double customerDepositAdd;

    /** 客户存款净增加额(环比%) */
    @Excel(name = "客户存款净增加额(环比%)")
    private Double customerDepositAddYoy;

    /** 发行存款证 */
    @Excel(name = "发行存款证")
    private Double issueCd;

    /** 发行存款证(环比%) */
    @Excel(name = "发行存款证(环比%)")
    private Double issueCdYoy;

    /** 金融性资产的减少 */
    @Excel(name = "金融性资产的减少")
    private Double finassetReduce;

    /** 金融性资产的减少(环比%) */
    @Excel(name = "金融性资产的减少(环比%)")
    private Double finassetReduceYoy;

    /** 支付利息、手续费及佣金的现金 */
    @Excel(name = "支付利息、手续费及佣金的现金")
    private Double payInterestCommission;

    /** 支付利息、手续费及佣金的现金(环比%) */
    @Excel(name = "支付利息、手续费及佣金的现金(环比%)")
    private Double payInterestCommissionYoy;

    /** 支付其他与筹资活动有关的现金 */
    @Excel(name = "支付其他与筹资活动有关的现金")
    private Double payOtherFinance;

    /** 支付其他与筹资活动有关的现金(环比%) */
    @Excel(name = "支付其他与筹资活动有关的现金(环比%)")
    private Double payOtherFinanceYoy;

    /** 分得股利或利润所收到的现金 */
    @Excel(name = "分得股利或利润所收到的现金")
    private Double receiveDividendProfit;

    /** 分得股利或利润所收到的现金(环比%) */
    @Excel(name = "分得股利或利润所收到的现金(环比%)")
    private Double receiveDividendProfitYoy;

    /** 筹资活动现金流出的其他项目 */
    @Excel(name = "筹资活动现金流出的其他项目")
    private Double financeOutflowOther;

    /** 筹资活动现金流出的其他项目(环比%) */
    @Excel(name = "筹资活动现金流出的其他项目(环比%)")
    private Double financeOutflowOtherYoy;

    /** 取得子公司及其他营业单位支付的现金 */
    @Excel(name = "取得子公司及其他营业单位支付的现金")
    private Double obtainSubsidiaryOther;

    /** 取得子公司及其他营业单位支付的现金(环比%) */
    @Excel(name = "取得子公司及其他营业单位支付的现金(环比%)")
    private Double obtainSubsidiaryOtherYoy;

    /** 收回投资收到的现金 */
    @Excel(name = "收回投资收到的现金")
    private Double withdrawInvest;

    /** 收回投资收到的现金(环比%) */
    @Excel(name = "收回投资收到的现金(环比%)")
    private Double withdrawInvestYoy;

    /** 支付给职工以及为职工支付的现金 */
    @Excel(name = "支付给职工以及为职工支付的现金")
    private Double payStaffCash;

    /** 支付给职工以及为职工支付的现金(环比%) */
    @Excel(name = "支付给职工以及为职工支付的现金(环比%)")
    private Double payStaffCashYoy;

    /** 无形资产摊销 */
    @Excel(name = "无形资产摊销")
    private Double iaAmortize;

    /** 无形资产摊销(环比%) */
    @Excel(name = "无形资产摊销(环比%)")
    private Double iaAmortizeYoy;

    /** 期初现金及现金等价物余额 */
    @Excel(name = "期初现金及现金等价物余额")
    private Double beginCce;

    /** 期初现金及现金等价物余额(环比%) */
    @Excel(name = "期初现金及现金等价物余额(环比%)")
    private Double beginCceYoy;

    /** 存放中央银行款项净减少额 */
    @Excel(name = "存放中央银行款项净减少额")
    private Double depositPbcReduce;

    /** 存放中央银行款项净减少额(环比%) */
    @Excel(name = "存放中央银行款项净减少额(环比%)")
    private Double depositPbcReduceYoy;

    /** 卖出回购金融资产净减少额 */
    @Excel(name = "卖出回购金融资产净减少额")
    private Double sellRepoReduce;

    /** 卖出回购金融资产净减少额(环比%) */
    @Excel(name = "卖出回购金融资产净减少额(环比%)")
    private Double sellRepoReduceYoy;

    /** 不涉及现金收支的投资和筹资活动金额其他项目 */
    @Excel(name = "不涉及现金收支的投资和筹资活动金额其他项目")
    private Double uninvolveInvestfinOther;

    /** 不涉及现金收支的投资和筹资活动金额其他项目(环比%) */
    @Excel(name = "不涉及现金收支的投资和筹资活动金额其他项目(环比%)")
    private Double uninvolveInvestfinOtherYoy;

    /** 投资活动产生的现金流量净额 */
    @Excel(name = "投资活动产生的现金流量净额")
    private Double netcashInvest;

    /** 投资活动产生的现金流量净额(环比%) */
    @Excel(name = "投资活动产生的现金流量净额(环比%)")
    private Double netcashInvestYoy;

    /** 计提投资减值准备 */
    @Excel(name = "计提投资减值准备")
    private Double provisionInvestImpairment;

    /** 计提投资减值准备(环比%) */
    @Excel(name = "计提投资减值准备(环比%)")
    private Double provisionInvestImpairmentYoy;

    /** 净利润 */
    @Excel(name = "净利润")
    private Double netprofit;

    /** 净利润(环比%) */
    @Excel(name = "净利润(环比%)")
    private Double netprofitYoy;

    /** 存放中央银行和同业款项及其他金融机构净减少额 */
    @Excel(name = "存放中央银行和同业款项及其他金融机构净减少额")
    private Double pbcIofiReduce;

    /** 存放中央银行和同业款项及其他金融机构净减少额(环比%) */
    @Excel(name = "存放中央银行和同业款项及其他金融机构净减少额(环比%)")
    private Double pbcIofiReduceYoy;

    /** 经营活动产生的现金流量净额 */
    @Excel(name = "经营活动产生的现金流量净额")
    private Double fbnetcashOperate;

    /** 经营活动产生的现金流量净额(环比%) */
    @Excel(name = "经营活动产生的现金流量净额(环比%)")
    private Double fbnetcashOperateYoy;

    /** 买入返售金融资产净增加额 */
    @Excel(name = "买入返售金融资产净增加额")
    private Double buyResaleAdd;

    /** 买入返售金融资产净增加额(环比%) */
    @Excel(name = "买入返售金融资产净增加额(环比%)")
    private Double buyResaleAddYoy;

    /** 发行其他债券所收到的现金 */
    @Excel(name = "发行其他债券所收到的现金")
    private Double issueOtherBond;

    /** 发行其他债券所收到的现金(环比%) */
    @Excel(name = "发行其他债券所收到的现金(环比%)")
    private Double issueOtherBondYoy;

    /** 同业及其他机构存放款减少净额 */
    @Excel(name = "同业及其他机构存放款减少净额")
    private Double interbankOtherReduce;

    /** 同业及其他机构存放款减少净额(环比%) */
    @Excel(name = "同业及其他机构存放款减少净额(环比%)")
    private Double interbankOtherReduceYoy;

    /** 购买融资租赁资产支付的现金 */
    @Excel(name = "购买融资租赁资产支付的现金")
    private Double buyFinLease;

    /** 购买融资租赁资产支付的现金(环比%) */
    @Excel(name = "购买融资租赁资产支付的现金(环比%)")
    private Double buyFinLeaseYoy;

    /** 加现金等价物的期末余额 */
    @Excel(name = "加现金等价物的期末余额")
    private Double endCashEquivalents;

    /** 加现金等价物的期末余额(环比%) */
    @Excel(name = "加现金等价物的期末余额(环比%)")
    private Double endCashEquivalentsYoy;

    /** 长期待摊费用摊销 */
    @Excel(name = "长期待摊费用摊销")
    private Double lpeAmortize;

    /** 长期待摊费用摊销(环比%) */
    @Excel(name = "长期待摊费用摊销(环比%)")
    private Double lpeAmortizeYoy;

    /** 取得投资收益收到的现金 */
    @Excel(name = "取得投资收益收到的现金")
    private Double receiveInvestIncome;

    /** 取得投资收益收到的现金(环比%) */
    @Excel(name = "取得投资收益收到的现金(环比%)")
    private Double receiveInvestIncomeYoy;

    /** 已发行存款证净减少额 */
    @Excel(name = "已发行存款证净减少额")
    private Double issuedCdReduce;

    /** 已发行存款证净减少额(环比%) */
    @Excel(name = "已发行存款证净减少额(环比%)")
    private Double issuedCdReduceYoy;

    /** 拆入资金及卖出回购金融资产款净减少额 */
    @Excel(name = "拆入资金及卖出回购金融资产款净减少额")
    private Double borrowRepoReduce;

    /** 拆入资金及卖出回购金融资产款净减少额(环比%) */
    @Excel(name = "拆入资金及卖出回购金融资产款净减少额(环比%)")
    private Double borrowRepoReduceYoy;

    /** 偿付债券利息支付的现金 */
    @Excel(name = "偿付债券利息支付的现金")
    private Double payBondInterest;

    /** 偿付债券利息支付的现金(环比%) */
    @Excel(name = "偿付债券利息支付的现金(环比%)")
    private Double payBondInterestYoy;

    /** 交易性金融负债净增加额 */
    @Excel(name = "交易性金融负债净增加额")
    private Double tradeFinliabAdd;

    /** 交易性金融负债净增加额(环比%) */
    @Excel(name = "交易性金融负债净增加额(环比%)")
    private Double tradeFinliabAddYoy;

    /** 经营活动现金流出小计 */
    @Excel(name = "经营活动现金流出小计")
    private Double totalOperateOutflow;

    /** 经营活动现金流出小计(环比%) */
    @Excel(name = "经营活动现金流出小计(环比%)")
    private Double totalOperateOutflowYoy;

    /** 存放同业及其他金融机构款项净增加额 */
    @Excel(name = "存放同业及其他金融机构款项净增加额")
    private Double depositIofiAdd;

    /** 存放同业及其他金融机构款项净增加额(环比%) */
    @Excel(name = "存放同业及其他金融机构款项净增加额(环比%)")
    private Double depositIofiAddYoy;

    /** 收回的已于以前年度核销的贷款 */
    @Excel(name = "收回的已于以前年度核销的贷款")
    private Double withdrawWriteoffLoan;

    /** 收回的已于以前年度核销的贷款(环比%) */
    @Excel(name = "收回的已于以前年度核销的贷款(环比%)")
    private Double withdrawWriteoffLoanYoy;

    /** 发行债券利息支出 */
    @Excel(name = "发行债券利息支出")
    private Double bondInterestExpense;

    /** 发行债券利息支出(环比%) */
    @Excel(name = "发行债券利息支出(环比%)")
    private Double bondInterestExpenseYoy;

    /** 经营活动产生的现金流量净额平衡项目 */
    @Excel(name = "经营活动产生的现金流量净额平衡项目")
    private Double fboperateNetcashBalance;

    /** 经营活动产生的现金流量净额平衡项目(环比%) */
    @Excel(name = "经营活动产生的现金流量净额平衡项目(环比%)")
    private Double fboperateNetcashBalanceYoy;

    /** 股份发行支付的费用 */
    @Excel(name = "股份发行支付的费用")
    private Double issueSharesExpense;

    /** 股份发行支付的费用(环比%) */
    @Excel(name = "股份发行支付的费用(环比%)")
    private Double issueSharesExpenseYoy;

    /** 现金及现金等价物的净增加额 */
    @Excel(name = "现金及现金等价物的净增加额")
    private Double fbcceAdd;

    /** 现金及现金等价物的净增加额(环比%) */
    @Excel(name = "现金及现金等价物的净增加额(环比%)")
    private Double fbcceAddYoy;

    /** 偿还债务所支付的现金 */
    @Excel(name = "偿还债务所支付的现金")
    private Double payDebtCash;

    /** 偿还债务所支付的现金(环比%) */
    @Excel(name = "偿还债务所支付的现金(环比%)")
    private Double payDebtCashYoy;

    /** 处置抵债资产收到的现金 */
    @Excel(name = "处置抵债资产收到的现金")
    private Double disposalMortgageAsset;

    /** 处置抵债资产收到的现金(环比%) */
    @Excel(name = "处置抵债资产收到的现金(环比%)")
    private Double disposalMortgageAssetYoy;

    /** 发行债券收到的现金 */
    @Excel(name = "发行债券收到的现金")
    private Double issueBond;

    /** 发行债券收到的现金(环比%) */
    @Excel(name = "发行债券收到的现金(环比%)")
    private Double issueBondYoy;

    /** 经营性应付项目的增加 */
    @Excel(name = "经营性应付项目的增加")
    private Double operatePayableAdd;

    /** 经营性应付项目的增加(环比%) */
    @Excel(name = "经营性应付项目的增加(环比%)")
    private Double operatePayableAddYoy;

    /** 经营性应收项目的减少 */
    @Excel(name = "经营性应收项目的减少")
    private Double operateReceReduce;

    /** 经营性应收项目的减少(环比%) */
    @Excel(name = "经营性应收项目的减少(环比%)")
    private Double operateReceReduceYoy;

    /** 转回投资减值准备 */
    @Excel(name = "转回投资减值准备")
    private Double transferInvestImpairment;

    /** 转回投资减值准备(环比%) */
    @Excel(name = "转回投资减值准备(环比%)")
    private Double transferInvestImpairmentYoy;

    /** 支付的各项税费 */
    @Excel(name = "支付的各项税费")
    private Double payAllTax;

    /** 支付的各项税费(环比%) */
    @Excel(name = "支付的各项税费(环比%)")
    private Double payAllTaxYoy;

    /** 投资活动产生的现金流量净额平衡项目 */
    @Excel(name = "投资活动产生的现金流量净额平衡项目")
    private Double investNetcashBalance;

    /** 投资活动产生的现金流量净额平衡项目(环比%) */
    @Excel(name = "投资活动产生的现金流量净额平衡项目(环比%)")
    private Double investNetcashBalanceYoy;

    /** 收取利息、手续费及佣金的现金 */
    @Excel(name = "收取利息、手续费及佣金的现金")
    private Double receiveInterestCommission;

    /** 收取利息、手续费及佣金的现金(环比%) */
    @Excel(name = "收取利息、手续费及佣金的现金(环比%)")
    private Double receiveInterestCommissionYoy;

    /** 经营活动产生的现金流量净额其他项目 */
    @Excel(name = "经营活动产生的现金流量净额其他项目")
    private Double fboperateNetcashOther;

    /** 经营活动产生的现金流量净额其他项目(环比%) */
    @Excel(name = "经营活动产生的现金流量净额其他项目(环比%)")
    private Double fboperateNetcashOtherYoy;

    /** 拆入资金净增加额 */
    @Excel(name = "拆入资金净增加额")
    private Double borrowFundAdd;

    /** 拆入资金净增加额(环比%) */
    @Excel(name = "拆入资金净增加额(环比%)")
    private Double borrowFundAddYoy;

    /** 资产减值准备 */
    @Excel(name = "资产减值准备")
    private Double assetImpairment;

    /** 资产减值准备(环比%) */
    @Excel(name = "资产减值准备(环比%)")
    private Double assetImpairmentYoy;

    /** 分配股利、利润或偿付利息支付的现金 */
    @Excel(name = "分配股利、利润或偿付利息支付的现金")
    private Double assignDividendPorfit;

    /** 分配股利、利润或偿付利息支付的现金(环比%) */
    @Excel(name = "分配股利、利润或偿付利息支付的现金(环比%)")
    private Double assignDividendPorfitYoy;

    /** 筹资活动现金流出小计 */
    @Excel(name = "筹资活动现金流出小计")
    private Double totalFinanceOutflow;

    /** 筹资活动现金流出小计(环比%) */
    @Excel(name = "筹资活动现金流出小计(环比%)")
    private Double totalFinanceOutflowYoy;

    /** 处置子公司、联营企业及合营企业投资及其他企业收到的现金 */
    @Excel(name = "处置子公司、联营企业及合营企业投资及其他企业收到的现金")
    private Double disposalSubsidiaryJoint;

    /** 处置子公司、联营企业及合营企业投资及其他企业收到的现金(环比%) */
    @Excel(name = "处置子公司、联营企业及合营企业投资及其他企业收到的现金(环比%)")
    private Double disposalSubsidiaryJointYoy;

    /** 收到其他与筹资活动有关的现金 */
    @Excel(name = "收到其他与筹资活动有关的现金")
    private Double receiveOtherFinance;

    /** 收到其他与筹资活动有关的现金(环比%) */
    @Excel(name = "收到其他与筹资活动有关的现金(环比%)")
    private Double receiveOtherFinanceYoy;

    /** 支付其他与经营活动有关的现金 */
    @Excel(name = "支付其他与经营活动有关的现金")
    private Double payOtherOperate;

    /** 支付其他与经营活动有关的现金(环比%) */
    @Excel(name = "支付其他与经营活动有关的现金(环比%)")
    private Double payOtherOperateYoy;

    /** 交易性金融资产净减少额 */
    @Excel(name = "交易性金融资产净减少额")
    private Double tradeFinassetReduce;

    /** 交易性金融资产净减少额(环比%) */
    @Excel(name = "交易性金融资产净减少额(环比%)")
    private Double tradeFinassetReduceYoy;

    /** 拆出资金及买入返售金融资产净减少额 */
    @Excel(name = "拆出资金及买入返售金融资产净减少额")
    private Double lendResaleReduce;

    /** 拆出资金及买入返售金融资产净减少额(环比%) */
    @Excel(name = "拆出资金及买入返售金融资产净减少额(环比%)")
    private Double lendResaleReduceYoy;

    /** 存款证净额 */
    @Excel(name = "存款证净额")
    private Double netCd;

    /** 存款证净额(环比%) */
    @Excel(name = "存款证净额(环比%)")
    private Double netCdYoy;

    /** 同业及其他金融机构存放款项净增加额 */
    @Excel(name = "同业及其他金融机构存放款项净增加额")
    private Double iofiAdd;

    /** 同业及其他金融机构存放款项净增加额(环比%) */
    @Excel(name = "同业及其他金融机构存放款项净增加额(环比%)")
    private Double iofiAddYoy;

    /** 存货的减少 */
    @Excel(name = "存货的减少")
    private Double inventoryReduce;

    /** 存货的减少(环比%) */
    @Excel(name = "存货的减少(环比%)")
    private Double inventoryReduceYoy;

    /** 处置固定资产、无形资产和其他长期资产的损失 */
    @Excel(name = "处置固定资产、无形资产和其他长期资产的损失")
    private Double disposalLongassetLoss;

    /** 处置固定资产、无形资产和其他长期资产的损失(环比%) */
    @Excel(name = "处置固定资产、无形资产和其他长期资产的损失(环比%)")
    private Double disposalLongassetLossYoy;

    /** 现金的期末余额 */
    @Excel(name = "现金的期末余额")
    private Double endCash;

    /** 现金的期末余额(环比%) */
    @Excel(name = "现金的期末余额(环比%)")
    private Double endCashYoy;

    /** 其他 */
    @Excel(name = "其他")
    private Double other;

    /** 其他(环比%) */
    @Excel(name = "其他(环比%)")
    private Double otherYoy;

    /** 经营活动产生的现金流量净额 */
    @Excel(name = "经营活动产生的现金流量净额")
    private Double netcashOperate;

    /** 经营活动产生的现金流量净额(环比%) */
    @Excel(name = "经营活动产生的现金流量净额(环比%)")
    private Double netcashOperateYoy;

    /** 处置固定资产、无形资产和其他长期资产收回的现金 */
    @Excel(name = "处置固定资产、无形资产和其他长期资产收回的现金")
    private Double disposalLongAsset;

    /** 处置固定资产、无形资产和其他长期资产收回的现金(环比%) */
    @Excel(name = "处置固定资产、无形资产和其他长期资产收回的现金(环比%)")
    private Double disposalLongAssetYoy;

    /** 子公司吸收少数股东投资收到的现金 */
    @Excel(name = "子公司吸收少数股东投资收到的现金")
    private Double subsidiaryAcceptInvest;

    /** 子公司吸收少数股东投资收到的现金(环比%) */
    @Excel(name = "子公司吸收少数股东投资收到的现金(环比%)")
    private Double subsidiaryAcceptInvestYoy;

    /** 收取利息的现金 */
    @Excel(name = "收取利息的现金")
    private Double receiveInterest;

    /** 收取利息的现金(环比%) */
    @Excel(name = "收取利息的现金(环比%)")
    private Double receiveInterestYoy;

    /** 经营活动现金流入小计 */
    @Excel(name = "经营活动现金流入小计")
    private Double totalOperateInflow;

    /** 经营活动现金流入小计(环比%) */
    @Excel(name = "经营活动现金流入小计(环比%)")
    private Double totalOperateInflowYoy;

    /** 金融性负债的增加 */
    @Excel(name = "金融性负债的增加")
    private Double finliabAdd;

    /** 金融性负债的增加(环比%) */
    @Excel(name = "金融性负债的增加(环比%)")
    private Double finliabAddYoy;

    /** 期末现金及现金等价物余额平衡项目 */
    @Excel(name = "期末现金及现金等价物余额平衡项目")
    private Double endCceBalance;

    /** 期末现金及现金等价物余额平衡项目(环比%) */
    @Excel(name = "期末现金及现金等价物余额平衡项目(环比%)")
    private Double endCceBalanceYoy;

    /** 应收账款净增加额 */
    @Excel(name = "应收账款净增加额")
    private Double accountsReceAdd;

    /** 应收账款净增加额(环比%) */
    @Excel(name = "应收账款净增加额(环比%)")
    private Double accountsReceAddYoy;

    /** 拆出资金净减少额 */
    @Excel(name = "拆出资金净减少额")
    private Double lendFundReduce;

    /** 拆出资金净减少额(环比%) */
    @Excel(name = "拆出资金净减少额(环比%)")
    private Double lendFundReduceYoy;

    /** 存款的增加 */
    @Excel(name = "存款的增加")
    private Double depositAdd;

    /** 存款的增加(环比%) */
    @Excel(name = "存款的增加(环比%)")
    private Double depositAddYoy;

    /** 投资活动现金流出的其他项目 */
    @Excel(name = "投资活动现金流出的其他项目")
    private Double investOutflowOther;

    /** 投资活动现金流出的其他项目(环比%) */
    @Excel(name = "投资活动现金流出的其他项目(环比%)")
    private Double investOutflowOtherYoy;

    /** 一年内到期的可转换公司债券 */
    @Excel(name = "一年内到期的可转换公司债券")
    private Double convertBond1year;

    /** 一年内到期的可转换公司债券(环比%) */
    @Excel(name = "一年内到期的可转换公司债券(环比%)")
    private Double convertBond1yearYoy;

    /** 购建固定资产、无形资产和其他长期资产支付的现金 */
    @Excel(name = "购建固定资产、无形资产和其他长期资产支付的现金")
    private Double constructLongAsset;

    /** 购建固定资产、无形资产和其他长期资产支付的现金(环比%) */
    @Excel(name = "购建固定资产、无形资产和其他长期资产支付的现金(环比%)")
    private Double constructLongAssetYoy;

    /** 筹资活动现金流出的平衡项目 */
    @Excel(name = "筹资活动现金流出的平衡项目")
    private Double financeOutflowBalance;

    /** 筹资活动现金流出的平衡项目(环比%) */
    @Excel(name = "筹资活动现金流出的平衡项目(环比%)")
    private Double financeOutflowBalanceYoy;

    /** 投资活动现金流出小计 */
    @Excel(name = "投资活动现金流出小计")
    private Double totalInvestOutflow;

    /** 投资活动现金流出小计(环比%) */
    @Excel(name = "投资活动现金流出小计(环比%)")
    private Double totalInvestOutflowYoy;

    /** 卖出回购金融资产款净增加额 */
    @Excel(name = "卖出回购金融资产款净增加额")
    private Double sellRepoAdd;

    /** 卖出回购金融资产款净增加额(环比%) */
    @Excel(name = "卖出回购金融资产款净增加额(环比%)")
    private Double sellRepoAddYoy;

    /** 经营活动产生的现金流量净额其他项目 */
    @Excel(name = "经营活动产生的现金流量净额其他项目")
    private Double operateNetcashOther;

    /** 经营活动产生的现金流量净额其他项目(环比%) */
    @Excel(name = "经营活动产生的现金流量净额其他项目(环比%)")
    private Double operateNetcashOtherYoy;

    /** 筹资活动现金流入的其他项目 */
    @Excel(name = "筹资活动现金流入的其他项目")
    private Double financeInflowOther;

    /** 筹资活动现金流入的其他项目(环比%) */
    @Excel(name = "筹资活动现金流入的其他项目(环比%)")
    private Double financeInflowOtherYoy;

    /** 无形资产及长期待摊费用等摊销 */
    @Excel(name = "无形资产及长期待摊费用等摊销")
    private Double iaLpeAmortize;

    /** 无形资产及长期待摊费用等摊销(环比%) */
    @Excel(name = "无形资产及长期待摊费用等摊销(环比%)")
    private Double iaLpeAmortizeYoy;

    /** 经营活动产生的现金流量净额平衡项目 */
    @Excel(name = "经营活动产生的现金流量净额平衡项目")
    private Double operateNetcashBalance;

    /** 经营活动产生的现金流量净额平衡项目(环比%) */
    @Excel(name = "经营活动产生的现金流量净额平衡项目(环比%)")
    private Double operateNetcashBalanceYoy;

    /** 投资活动现金流入的平衡项目 */
    @Excel(name = "投资活动现金流入的平衡项目")
    private Double investInflowBalance;

    /** 投资活动现金流入的平衡项目(环比%) */
    @Excel(name = "投资活动现金流入的平衡项目(环比%)")
    private Double investInflowBalanceYoy;

    /** 少数股东损益 */
    @Excel(name = "少数股东损益")
    private Double minorityInterest;

    /** 少数股东损益(环比%) */
    @Excel(name = "少数股东损益(环比%)")
    private Double minorityInterestYoy;

    /** 计提预计负债 */
    @Excel(name = "计提预计负债")
    private Double provisionPredictLiab;

    /** 计提预计负债(环比%) */
    @Excel(name = "计提预计负债(环比%)")
    private Double provisionPredictLiabYoy;

    /** 客户存款和同业及其他金融机构存放款项净增加额 */
    @Excel(name = "客户存款和同业及其他金融机构存放款项净增加额")
    private Double depositIofiOther;

    /** 客户存款和同业及其他金融机构存放款项净增加额(环比%) */
    @Excel(name = "客户存款和同业及其他金融机构存放款项净增加额(环比%)")
    private Double depositIofiOtherYoy;

    /** 债务转为资本 */
    @Excel(name = "债务转为资本")
    private Double debtTransferCapital;

    /** 债务转为资本(环比%) */
    @Excel(name = "债务转为资本(环比%)")
    private Double debtTransferCapitalYoy;

    /** 投资活动现金流入的其他项目 */
    @Excel(name = "投资活动现金流入的其他项目")
    private Double investInflowOther;

    /** 投资活动现金流入的其他项目(环比%) */
    @Excel(name = "投资活动现金流入的其他项目(环比%)")
    private Double investInflowOtherYoy;

    /** 现金等价物的期初余额 */
    @Excel(name = "现金等价物的期初余额")
    private Double beginCashEquivalents;

    /** 现金等价物的期初余额(环比%) */
    @Excel(name = "现金等价物的期初余额(环比%)")
    private Double beginCashEquivalentsYoy;

    /** 交易性金融负债净减少额 */
    @Excel(name = "交易性金融负债净减少额")
    private Double tradeFinliabReduce;

    /** 交易性金融负债净减少额(环比%) */
    @Excel(name = "交易性金融负债净减少额(环比%)")
    private Double tradeFinliabReduceYoy;

    /** 支付其他与投资活动有关的现金 */
    @Excel(name = "支付其他与投资活动有关的现金")
    private Double payOtherInvest;

    /** 支付其他与投资活动有关的现金(环比%) */
    @Excel(name = "支付其他与投资活动有关的现金(环比%)")
    private Double payOtherInvestYoy;

    /** 支付其他与筹资活动有关的现金 */
    @Excel(name = "支付其他与筹资活动有关的现金")
    private Double payOtherFinanceQoq;

    /** 向中央银行借款净增加额 */
    @Excel(name = "向中央银行借款净增加额")
    private Double loanPbcAddQoq;

    /** 存放中央银行和同业款项及其他金融机构净减少额 */
    @Excel(name = "存放中央银行和同业款项及其他金融机构净减少额")
    private Double pbcIofiReduceQoq;

    /** 公允价值变动损失 */
    @Excel(name = "公允价值变动损失")
    private Double fairvalueChangeLossQoq;

    /** 增加股本所收到的现金 */
    @Excel(name = "增加股本所收到的现金")
    private Double receiveAddEquityQoq;

    /** 偿付债券利息支付的现金 */
    @Excel(name = "偿付债券利息支付的现金")
    private Double payBondInterestQoq;

    /** 交易性金融负债净增加额 */
    @Excel(name = "交易性金融负债净增加额")
    private Double tradeFinliabAddQoq;

    /** 筹资活动现金流入的平衡项目 */
    @Excel(name = "筹资活动现金流入的平衡项目")
    private Double financeInflowBalanceQoq;

    /** 股份发行支付的费用 */
    @Excel(name = "股份发行支付的费用")
    private Double issueSharesExpenseQoq;

    /** 收回的已于以前年度核销的贷款 */
    @Excel(name = "收回的已于以前年度核销的贷款")
    private Double withdrawWriteoffLoanQoq;

    /** 发行债券收到的现金 */
    @Excel(name = "发行债券收到的现金")
    private Double issueBondQoq;

    /** 筹资活动现金流出小计 */
    @Excel(name = "筹资活动现金流出小计")
    private Double totalFinanceOutflowQoq;

    /** 转回投资减值准备 */
    @Excel(name = "转回投资减值准备")
    private Double transferInvestImpairmentQoq;

    /** 筹资活动产生的现金流量净额其他项目 */
    @Excel(name = "筹资活动产生的现金流量净额其他项目")
    private Double financeNetcashOtherQoq;

    /** 加现金等价物的期末余额 */
    @Excel(name = "加现金等价物的期末余额")
    private Double endCashEquivalentsQoq;

    /** 递延所得税资产减少 */
    @Excel(name = "递延所得税资产减少")
    private Double dtAssetReduceQoq;

    /** 拆借款项的净增加 */
    @Excel(name = "拆借款项的净增加")
    private Double lendAddQoq;

    /** 处置固定资产、无形资产和其他长期资产的损失 */
    @Excel(name = "处置固定资产、无形资产和其他长期资产的损失")
    private Double disposalLongassetLossQoq;

    /** 投资损失 */
    @Excel(name = "投资损失")
    private Double investLossQoq;

    /** 拆入资金净增加额 */
    @Excel(name = "拆入资金净增加额")
    private Double borrowFundAddQoq;

    /** 支付其他与经营活动有关的现金 */
    @Excel(name = "支付其他与经营活动有关的现金")
    private Double payOtherOperateQoq;

    /** 交易性金融资产净减少额 */
    @Excel(name = "交易性金融资产净减少额")
    private Double tradeFinassetReduceQoq;

    /** 拆出资金净增加额 */
    @Excel(name = "拆出资金净增加额")
    private Double lendFundAddQoq;

    /** 投资活动现金流出的平衡项目 */
    @Excel(name = "投资活动现金流出的平衡项目")
    private Double investOutflowBalanceQoq;

    /** 存款的增加 */
    @Excel(name = "存款的增加")
    private Double depositAddQoq;

    /** 收到其他与筹资活动有关的现金 */
    @Excel(name = "收到其他与筹资活动有关的现金")
    private Double receiveOtherFinanceQoq;

    /** 长期待摊费用摊销 */
    @Excel(name = "长期待摊费用摊销")
    private Double lpeAmortizeQoq;

    /** 经营活动产生的现金流量净额 */
    @Excel(name = "经营活动产生的现金流量净额")
    private Double fbnetcashOperateQoq;

    /** 现金及现金等价物净增加额其他项目 */
    @Excel(name = "现金及现金等价物净增加额其他项目")
    private Double fbcceAddOtherQoq;

    /** 现金的期末余额 */
    @Excel(name = "现金的期末余额")
    private Double endCashQoq;

    /** 拆出资金及买入返售金融资产净减少额 */
    @Excel(name = "拆出资金及买入返售金融资产净减少额")
    private Double lendResaleReduceQoq;

    /** 金融性资产的减少 */
    @Excel(name = "金融性资产的减少")
    private Double finassetReduceQoq;

    /** 经营活动现金流出的平衡项目 */
    @Excel(name = "经营活动现金流出的平衡项目")
    private Double operateOutflowBalanceQoq;

    /** 汇率变动对现金及现金等价物的影响 */
    @Excel(name = "汇率变动对现金及现金等价物的影响")
    private Double rateChangeEffectQoq;

    /** 经营活动产生的现金流量净额 */
    @Excel(name = "经营活动产生的现金流量净额")
    private Double netcashOperateQoq;

    /** 存款证净额 */
    @Excel(name = "存款证净额")
    private Double netCdQoq;

    /** 已发行存款证净减少额 */
    @Excel(name = "已发行存款证净减少额")
    private Double issuedCdReduceQoq;

    /** 存放同业及其他金融机构款项净增加额 */
    @Excel(name = "存放同业及其他金融机构款项净增加额")
    private Double depositIofiAddQoq;

    /** 现金及现金等价物的净增加额 */
    @Excel(name = "现金及现金等价物的净增加额")
    private Double fbcceAddQoq;

    /** 处置固定资产、无形资产和其他长期资产收回的现金 */
    @Excel(name = "处置固定资产、无形资产和其他长期资产收回的现金")
    private Double disposalLongAssetQoq;

    /** 资产减值准备 */
    @Excel(name = "资产减值准备")
    private Double assetImpairmentQoq;

    /** 投资活动现金流出的其他项目 */
    @Excel(name = "投资活动现金流出的其他项目")
    private Double investOutflowOtherQoq;

    /** 固定资产和投资性房地产折旧 */
    @Excel(name = "固定资产和投资性房地产折旧")
    private Double faIrDeprQoq;

    /** 现金及现金等价物净增加额其他项目 */
    @Excel(name = "现金及现金等价物净增加额其他项目")
    private Double cceAddOtherQoq;

    /** 融资租入固定资产 */
    @Excel(name = "融资租入固定资产")
    private Double finleaseObtainFaQoq;

    /** 拆出资金净减少额 */
    @Excel(name = "拆出资金净减少额")
    private Double lendFundReduceQoq;

    /** 收到已核销款项 */
    @Excel(name = "收到已核销款项")
    private Double receiveWriteoffQoq;

    /** 经营活动产生的现金流量净额平衡项目 */
    @Excel(name = "经营活动产生的现金流量净额平衡项目")
    private Double fboperateNetcashBalanceQoq;

    /** 子公司吸收少数股东投资收到的现金 */
    @Excel(name = "子公司吸收少数股东投资收到的现金")
    private Double subsidiaryAcceptInvestQoq;

    /** 应收账款净增加额 */
    @Excel(name = "应收账款净增加额")
    private Double accountsReceAddQoq;

    /** 金融性负债的增加 */
    @Excel(name = "金融性负债的增加")
    private Double finliabAddQoq;

    /** 期末现金及现金等价物余额平衡项目 */
    @Excel(name = "期末现金及现金等价物余额平衡项目")
    private Double endCceBalanceQoq;

    /** 经营活动产生的现金流量净额其他项目 */
    @Excel(name = "经营活动产生的现金流量净额其他项目")
    private Double fboperateNetcashOtherQoq;

    /** 支付利息、手续费及佣金的现金 */
    @Excel(name = "支付利息、手续费及佣金的现金")
    private Double payInterestCommissionQoq;

    /** 存放中央银行款项净减少额 */
    @Excel(name = "存放中央银行款项净减少额")
    private Double depositPbcReduceQoq;

    /** 收取利息、手续费及佣金的现金 */
    @Excel(name = "收取利息、手续费及佣金的现金")
    private Double receiveInterestCommissionQoq;

    /** 支付给职工以及为职工支付的现金 */
    @Excel(name = "支付给职工以及为职工支付的现金")
    private Double payStaffCashQoq;

    /** 购建固定资产、无形资产和其他长期资产支付的现金 */
    @Excel(name = "购建固定资产、无形资产和其他长期资产支付的现金")
    private Double constructLongAssetQoq;

    /** 收取手续费及佣金的现金 */
    @Excel(name = "收取手续费及佣金的现金")
    private Double receiveCommissionQoq;

    /** 经营活动现金流出小计 */
    @Excel(name = "经营活动现金流出小计")
    private Double totalOperateOutflowQoq;

    /** 经营活动现金流入小计 */
    @Excel(name = "经营活动现金流入小计")
    private Double totalOperateInflowQoq;

    /** 取得子公司及其他营业单位支付的现金 */
    @Excel(name = "取得子公司及其他营业单位支付的现金")
    private Double obtainSubsidiaryOtherQoq;

    /** 递延所得税负债增加 */
    @Excel(name = "递延所得税负债增加")
    private Double dtLiabAddQoq;

    /** 少数股东损益 */
    @Excel(name = "少数股东损益")
    private Double minorityInterestQoq;

    /** 经营活动产生的现金流量净额平衡项目 */
    @Excel(name = "经营活动产生的现金流量净额平衡项目")
    private Double operateNetcashBalanceQoq;

    /** 投资活动产生的现金流量净额平衡项目 */
    @Excel(name = "投资活动产生的现金流量净额平衡项目")
    private Double investNetcashBalanceQoq;

    /** 筹资活动现金流出的平衡项目 */
    @Excel(name = "筹资活动现金流出的平衡项目")
    private Double financeOutflowBalanceQoq;

    /** 投资支付的现金 */
    @Excel(name = "投资支付的现金")
    private Double investPayCashQoq;

    /** 债务转为资本 */
    @Excel(name = "债务转为资本")
    private Double debtTransferCapitalQoq;

    /** 分配股利、利润或偿付利息支付的现金 */
    @Excel(name = "分配股利、利润或偿付利息支付的现金")
    private Double assignDividendPorfitQoq;

    /** 一年内到期的可转换公司债券 */
    @Excel(name = "一年内到期的可转换公司债券")
    private Double convertBond1yearQoq;

    /** 期末现金及现金等价物余额其他项目 */
    @Excel(name = "期末现金及现金等价物余额其他项目")
    private Double endCceOtherQoq;

    /** 经营活动现金流入的其他项目 */
    @Excel(name = "经营活动现金流入的其他项目")
    private Double operateInflowOtherQoq;

    /** 收到的其他与投资活动有关的现金 */
    @Excel(name = "收到的其他与投资活动有关的现金")
    private Double receiveOtherInvestQoq;

    /** 客户存款和同业及其他金融机构存放款项净增加额 */
    @Excel(name = "客户存款和同业及其他金融机构存放款项净增加额")
    private Double depositIofiOtherQoq;

    /** 分得股利或利润所收到的现金 */
    @Excel(name = "分得股利或利润所收到的现金")
    private Double receiveDividendProfitQoq;

    /** 投资活动现金流出小计 */
    @Excel(name = "投资活动现金流出小计")
    private Double totalInvestOutflowQoq;

    /** 买入返售金融资产净减少额 */
    @Excel(name = "买入返售金融资产净减少额")
    private Double buyResaleReduceQoq;

    /** 计提预计负债 */
    @Excel(name = "计提预计负债")
    private Double provisionPredictLiabQoq;

    /** 买入返售金融资产净增加额 */
    @Excel(name = "买入返售金融资产净增加额")
    private Double buyResaleAddQoq;

    /** 处置子公司、联营企业及合营企业投资及其他企业收到的现金 */
    @Excel(name = "处置子公司、联营企业及合营企业投资及其他企业收到的现金")
    private Double disposalSubsidiaryJointQoq;

    /** 同业及其他金融机构存放款项净增加额 */
    @Excel(name = "同业及其他金融机构存放款项净增加额")
    private Double iofiAddQoq;

    /** 处置抵债资产收到的现金 */
    @Excel(name = "处置抵债资产收到的现金")
    private Double disposalMortgageAssetQoq;

    /** 偿还债务所支付的现金 */
    @Excel(name = "偿还债务所支付的现金")
    private Double payDebtCashQoq;

    /** 筹资活动现金流出的其他项目 */
    @Excel(name = "筹资活动现金流出的其他项目")
    private Double financeOutflowOtherQoq;

    /** 存货的减少 */
    @Excel(name = "存货的减少")
    private Double inventoryReduceQoq;

    /** 卖出回购金融资产款净增加额 */
    @Excel(name = "卖出回购金融资产款净增加额")
    private Double sellRepoAddQoq;

    /** 发行债券利息支出 */
    @Excel(name = "发行债券利息支出")
    private Double bondInterestExpenseQoq;

    /** 无形资产及长期待摊费用等摊销 */
    @Excel(name = "无形资产及长期待摊费用等摊销")
    private Double iaLpeAmortizeQoq;

    /** 收取利息的现金 */
    @Excel(name = "收取利息的现金")
    private Double receiveInterestQoq;

    /** 经营性应收项目的减少 */
    @Excel(name = "经营性应收项目的减少")
    private Double operateReceReduceQoq;

    /** 投资活动现金流入的平衡项目 */
    @Excel(name = "投资活动现金流入的平衡项目")
    private Double investInflowBalanceQoq;

    /** 投资活动现金流入的其他项目 */
    @Excel(name = "投资活动现金流入的其他项目")
    private Double investInflowOtherQoq;

    /** 发行其他债券所收到的现金 */
    @Excel(name = "发行其他债券所收到的现金")
    private Double issueOtherBondQoq;

    /** 支付其他与投资活动有关的现金 */
    @Excel(name = "支付其他与投资活动有关的现金")
    private Double payOtherInvestQoq;

    /** 交易性金融负债净减少额 */
    @Excel(name = "交易性金融负债净减少额")
    private Double tradeFinliabReduceQoq;

    /** 支付的各项税费 */
    @Excel(name = "支付的各项税费")
    private Double payAllTaxQoq;

    /** 存放同业及其他金融机构款项净减少额 */
    @Excel(name = "存放同业及其他金融机构款项净减少额")
    private Double depositIofiReduceQoq;

    /** 减现金等价物的期初余额 */
    @Excel(name = "减现金等价物的期初余额")
    private Double beginCashEquivalentsQoq;

    /** 经营活动产生的现金流量净额其他项目 */
    @Excel(name = "经营活动产生的现金流量净额其他项目")
    private Double operateNetcashOtherQoq;

    /** 卖出回购金融资产净减少额 */
    @Excel(name = "卖出回购金融资产净减少额")
    private Double sellRepoReduceQoq;

    /** 加期初现金及现金等价物余额 */
    @Excel(name = "加期初现金及现金等价物余额")
    private Double beginCceQoq;

    /** 筹资活动现金流入的其他项目 */
    @Excel(name = "筹资活动现金流入的其他项目")
    private Double financeInflowOtherQoq;

    /** 存放中央银行款项净增加额 */
    @Excel(name = "存放中央银行款项净增加额")
    private Double depositPbcAddQoq;

    /** 其他 */
    @Excel(name = "其他")
    private Double otherQoq;

    /** 经营性应付项目的增加 */
    @Excel(name = "经营性应付项目的增加")
    private Double operatePayableAddQoq;

    /** 期末现金及现金等价物余额 */
    @Excel(name = "期末现金及现金等价物余额")
    private Double endCceQoq;

    /** 收到其他与经营活动有关的现金 */
    @Excel(name = "收到其他与经营活动有关的现金")
    private Double receiveOtherOperateQoq;

    /** 减现金的期初余额 */
    @Excel(name = "减现金的期初余额")
    private Double beginCashQoq;

    /** 支付利息的现金 */
    @Excel(name = "支付利息的现金")
    private Double payInterestQoq;

    /** 吸收投资收到的现金 */
    @Excel(name = "吸收投资收到的现金")
    private Double acceptInvestCashQoq;

    /** 拆入资金及卖出回购金融资产款净增加额 */
    @Excel(name = "拆入资金及卖出回购金融资产款净增加额")
    private Double borrowRepoAddQoq;

    /** 筹资活动产生的现金流量净额 */
    @Excel(name = "筹资活动产生的现金流量净额")
    private Double netcashFinanceQoq;

    /** 拆入资金净减少额 */
    @Excel(name = "拆入资金净减少额")
    private Double borrowFundReduceQoq;

    /** 发行次级债券所收到的现金 */
    @Excel(name = "发行次级债券所收到的现金")
    private Double issueSubbondQoq;

    /** 固定资产报废损失 */
    @Excel(name = "固定资产报废损失")
    private Double faScrapLossQoq;

    /** 经营活动现金流出的其他项目 */
    @Excel(name = "经营活动现金流出的其他项目")
    private Double operateOutflowOtherQoq;

    /** 现金及现金等价物净增加额平衡项目 */
    @Excel(name = "现金及现金等价物净增加额平衡项目")
    private Double cceAddBalanceQoq;

    /** 汇兑损失 */
    @Excel(name = "汇兑损失")
    private Double exchangeLossQoq;

    /** 经营活动现金流入的平衡项目 */
    @Excel(name = "经营活动现金流入的平衡项目")
    private Double operateInflowBalanceQoq;

    /** 交易性金融资产净增加额 */
    @Excel(name = "交易性金融资产净增加额")
    private Double tradeFinassetAddQoq;

    /** 客户贷款及垫款净增加额 */
    @Excel(name = "客户贷款及垫款净增加额")
    private Double loanAdvanceAddQoq;

    /** 计提贷款减值准备 */
    @Excel(name = "计提贷款减值准备")
    private Double provisionLoanImpairmentQoq;

    /** 向中央银行借款净减少额 */
    @Excel(name = "向中央银行借款净减少额")
    private Double loanPbcReduceQoq;

    /** 现金及现金等价物净增加额 */
    @Excel(name = "现金及现金等价物净增加额")
    private Double cceAddQoq;

    /** 递延所得税 */
    @Excel(name = "递延所得税")
    private Double deferTaxQoq;

    /** 支付手续费及佣金的现金 */
    @Excel(name = "支付手续费及佣金的现金")
    private Double payCommissionQoq;

    /** 现金及现金等价物净增加额平衡项目 */
    @Excel(name = "现金及现金等价物净增加额平衡项目")
    private Double fbcceAddBalanceQoq;

    /** 投资活动现金流入小计 */
    @Excel(name = "投资活动现金流入小计")
    private Double totalInvestInflowQoq;

    /** 客户存款净增加额 */
    @Excel(name = "客户存款净增加额")
    private Double customerDepositAddQoq;

    /** 存放中央银行和同业及其他金融机构款项净增加额 */
    @Excel(name = "存放中央银行和同业及其他金融机构款项净增加额")
    private Double pbcIofiAddQoq;

    /** 长期资产摊销 */
    @Excel(name = "长期资产摊销")
    private Double longassetAmortizeQoq;

    /** 筹资活动产生的现金流量净额平衡项目 */
    @Excel(name = "筹资活动产生的现金流量净额平衡项目")
    private Double financeNetcashBalanceQoq;

    /** 发行存款证 */
    @Excel(name = "发行存款证")
    private Double issueCdQoq;

    /** 收回投资收到的现金 */
    @Excel(name = "收回投资收到的现金")
    private Double withdrawInvestQoq;

    /** 投资活动产生的现金流量净额其他项目 */
    @Excel(name = "投资活动产生的现金流量净额其他项目")
    private Double investNetcashOtherQoq;

    /** 计提其他资产减值准备 */
    @Excel(name = "计提其他资产减值准备")
    private Double otherAssetImpairmentQoq;

    /** 投资活动产生的现金流量净额 */
    @Excel(name = "投资活动产生的现金流量净额")
    private Double netcashInvestQoq;

    /** 拆入资金及卖出回购金融资产款净减少额 */
    @Excel(name = "拆入资金及卖出回购金融资产款净减少额")
    private Double borrowRepoReduceQoq;

    /** 计提投资减值准备 */
    @Excel(name = "计提投资减值准备")
    private Double provisionInvestImpairmentQoq;

    /** 贷款的减少 */
    @Excel(name = "贷款的减少")
    private Double loanReduceQoq;

    /** 同业及其他机构存放款减少净额 */
    @Excel(name = "同业及其他机构存放款减少净额")
    private Double interbankOtherReduceQoq;

    /** 净利润 */
    @Excel(name = "净利润")
    private Double netprofitQoq;

    /** 不涉及现金收支的投资和筹资活动金额其他项目 */
    @Excel(name = "不涉及现金收支的投资和筹资活动金额其他项目")
    private Double uninvolveInvestfinOtherQoq;

    /** 筹资活动现金流入小计 */
    @Excel(name = "筹资活动现金流入小计")
    private Double totalFinanceInflowQoq;

    /** 购买融资租赁资产支付的现金 */
    @Excel(name = "购买融资租赁资产支付的现金")
    private Double buyFinLeaseQoq;

    /** 拆出资金及买入返售金融资产净增加额 */
    @Excel(name = "拆出资金及买入返售金融资产净增加额")
    private Double lendResaleAddQoq;

    /** 固定资产折旧 */
    @Excel(name = "固定资产折旧")
    private Double fixedAssetDeprQoq;

    /** 取得投资收益收到的现金 */
    @Excel(name = "取得投资收益收到的现金")
    private Double receiveInvestIncomeQoq;

    /** 无形资产摊销 */
    @Excel(name = "无形资产摊销")
    private Double iaAmortizeQoq;

    public void setId(Long id){this.id = id;}
    public Long getId(){return id;}

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

    public void setBeginCash(Double beginCash){this.beginCash = beginCash;}
    public Double getBeginCash(){return beginCash;}

    public void setBeginCashYoy(Double beginCashYoy){this.beginCashYoy = beginCashYoy;}
    public Double getBeginCashYoy(){return beginCashYoy;}

    public void setBorrowFundReduce(Double borrowFundReduce){this.borrowFundReduce = borrowFundReduce;}
    public Double getBorrowFundReduce(){return borrowFundReduce;}

    public void setBorrowFundReduceYoy(Double borrowFundReduceYoy){this.borrowFundReduceYoy = borrowFundReduceYoy;}
    public Double getBorrowFundReduceYoy(){return borrowFundReduceYoy;}

    public void setOperateInflowBalance(Double operateInflowBalance){this.operateInflowBalance = operateInflowBalance;}
    public Double getOperateInflowBalance(){return operateInflowBalance;}

    public void setOperateInflowBalanceYoy(Double operateInflowBalanceYoy){this.operateInflowBalanceYoy = operateInflowBalanceYoy;}
    public Double getOperateInflowBalanceYoy(){return operateInflowBalanceYoy;}

    public void setFaScrapLoss(Double faScrapLoss){this.faScrapLoss = faScrapLoss;}
    public Double getFaScrapLoss(){return faScrapLoss;}

    public void setFaScrapLossYoy(Double faScrapLossYoy){this.faScrapLossYoy = faScrapLossYoy;}
    public Double getFaScrapLossYoy(){return faScrapLossYoy;}

    public void setOperateOutflowOther(Double operateOutflowOther){this.operateOutflowOther = operateOutflowOther;}
    public Double getOperateOutflowOther(){return operateOutflowOther;}

    public void setOperateOutflowOtherYoy(Double operateOutflowOtherYoy){this.operateOutflowOtherYoy = operateOutflowOtherYoy;}
    public Double getOperateOutflowOtherYoy(){return operateOutflowOtherYoy;}

    public void setFairvalueChangeLoss(Double fairvalueChangeLoss){this.fairvalueChangeLoss = fairvalueChangeLoss;}
    public Double getFairvalueChangeLoss(){return fairvalueChangeLoss;}

    public void setFairvalueChangeLossYoy(Double fairvalueChangeLossYoy){this.fairvalueChangeLossYoy = fairvalueChangeLossYoy;}
    public Double getFairvalueChangeLossYoy(){return fairvalueChangeLossYoy;}

    public void setOperateInflowOther(Double operateInflowOther){this.operateInflowOther = operateInflowOther;}
    public Double getOperateInflowOther(){return operateInflowOther;}

    public void setOperateInflowOtherYoy(Double operateInflowOtherYoy){this.operateInflowOtherYoy = operateInflowOtherYoy;}
    public Double getOperateInflowOtherYoy(){return operateInflowOtherYoy;}

    public void setNetcashFinance(Double netcashFinance){this.netcashFinance = netcashFinance;}
    public Double getNetcashFinance(){return netcashFinance;}

    public void setNetcashFinanceYoy(Double netcashFinanceYoy){this.netcashFinanceYoy = netcashFinanceYoy;}
    public Double getNetcashFinanceYoy(){return netcashFinanceYoy;}

    public void setDepositPbcAdd(Double depositPbcAdd){this.depositPbcAdd = depositPbcAdd;}
    public Double getDepositPbcAdd(){return depositPbcAdd;}

    public void setDepositPbcAddYoy(Double depositPbcAddYoy){this.depositPbcAddYoy = depositPbcAddYoy;}
    public Double getDepositPbcAddYoy(){return depositPbcAddYoy;}

    public void setInvestNetcashOther(Double investNetcashOther){this.investNetcashOther = investNetcashOther;}
    public Double getInvestNetcashOther(){return investNetcashOther;}

    public void setInvestNetcashOtherYoy(Double investNetcashOtherYoy){this.investNetcashOtherYoy = investNetcashOtherYoy;}
    public Double getInvestNetcashOtherYoy(){return investNetcashOtherYoy;}

    public void setReceiveOtherOperate(Double receiveOtherOperate){this.receiveOtherOperate = receiveOtherOperate;}
    public Double getReceiveOtherOperate(){return receiveOtherOperate;}

    public void setReceiveOtherOperateYoy(Double receiveOtherOperateYoy){this.receiveOtherOperateYoy = receiveOtherOperateYoy;}
    public Double getReceiveOtherOperateYoy(){return receiveOtherOperateYoy;}

    public void setPayInterest(Double payInterest){this.payInterest = payInterest;}
    public Double getPayInterest(){return payInterest;}

    public void setPayInterestYoy(Double payInterestYoy){this.payInterestYoy = payInterestYoy;}
    public Double getPayInterestYoy(){return payInterestYoy;}

    public void setIssueSubbond(Double issueSubbond){this.issueSubbond = issueSubbond;}
    public Double getIssueSubbond(){return issueSubbond;}

    public void setIssueSubbondYoy(Double issueSubbondYoy){this.issueSubbondYoy = issueSubbondYoy;}
    public Double getIssueSubbondYoy(){return issueSubbondYoy;}

    public void setInvestPayCash(Double investPayCash){this.investPayCash = investPayCash;}
    public Double getInvestPayCash(){return investPayCash;}

    public void setInvestPayCashYoy(Double investPayCashYoy){this.investPayCashYoy = investPayCashYoy;}
    public Double getInvestPayCashYoy(){return investPayCashYoy;}

    public void setReceiveAddEquity(Double receiveAddEquity){this.receiveAddEquity = receiveAddEquity;}
    public Double getReceiveAddEquity(){return receiveAddEquity;}

    public void setReceiveAddEquityYoy(Double receiveAddEquityYoy){this.receiveAddEquityYoy = receiveAddEquityYoy;}
    public Double getReceiveAddEquityYoy(){return receiveAddEquityYoy;}

    public void setLendFundAdd(Double lendFundAdd){this.lendFundAdd = lendFundAdd;}
    public Double getLendFundAdd(){return lendFundAdd;}

    public void setLendFundAddYoy(Double lendFundAddYoy){this.lendFundAddYoy = lendFundAddYoy;}
    public Double getLendFundAddYoy(){return lendFundAddYoy;}

    public void setBorrowRepoAdd(Double borrowRepoAdd){this.borrowRepoAdd = borrowRepoAdd;}
    public Double getBorrowRepoAdd(){return borrowRepoAdd;}

    public void setBorrowRepoAddYoy(Double borrowRepoAddYoy){this.borrowRepoAddYoy = borrowRepoAddYoy;}
    public Double getBorrowRepoAddYoy(){return borrowRepoAddYoy;}

    public void setFinanceNetcashOther(Double financeNetcashOther){this.financeNetcashOther = financeNetcashOther;}
    public Double getFinanceNetcashOther(){return financeNetcashOther;}

    public void setFinanceNetcashOtherYoy(Double financeNetcashOtherYoy){this.financeNetcashOtherYoy = financeNetcashOtherYoy;}
    public Double getFinanceNetcashOtherYoy(){return financeNetcashOtherYoy;}

    public void setLoanReduce(Double loanReduce){this.loanReduce = loanReduce;}
    public Double getLoanReduce(){return loanReduce;}

    public void setLoanReduceYoy(Double loanReduceYoy){this.loanReduceYoy = loanReduceYoy;}
    public Double getLoanReduceYoy(){return loanReduceYoy;}

    public void setLoanPbcAdd(Double loanPbcAdd){this.loanPbcAdd = loanPbcAdd;}
    public Double getLoanPbcAdd(){return loanPbcAdd;}

    public void setLoanPbcAddYoy(Double loanPbcAddYoy){this.loanPbcAddYoy = loanPbcAddYoy;}
    public Double getLoanPbcAddYoy(){return loanPbcAddYoy;}

    public void setOtherAssetImpairment(Double otherAssetImpairment){this.otherAssetImpairment = otherAssetImpairment;}
    public Double getOtherAssetImpairment(){return otherAssetImpairment;}

    public void setOtherAssetImpairmentYoy(Double otherAssetImpairmentYoy){this.otherAssetImpairmentYoy = otherAssetImpairmentYoy;}
    public Double getOtherAssetImpairmentYoy(){return otherAssetImpairmentYoy;}

    public void setReceiveWriteoff(Double receiveWriteoff){this.receiveWriteoff = receiveWriteoff;}
    public Double getReceiveWriteoff(){return receiveWriteoff;}

    public void setReceiveWriteoffYoy(Double receiveWriteoffYoy){this.receiveWriteoffYoy = receiveWriteoffYoy;}
    public Double getReceiveWriteoffYoy(){return receiveWriteoffYoy;}

    public void setRateChangeEffect(Double rateChangeEffect){this.rateChangeEffect = rateChangeEffect;}
    public Double getRateChangeEffect(){return rateChangeEffect;}

    public void setRateChangeEffectYoy(Double rateChangeEffectYoy){this.rateChangeEffectYoy = rateChangeEffectYoy;}
    public Double getRateChangeEffectYoy(){return rateChangeEffectYoy;}

    public void setFbcceAddOther(Double fbcceAddOther){this.fbcceAddOther = fbcceAddOther;}
    public Double getFbcceAddOther(){return fbcceAddOther;}

    public void setFbcceAddOtherYoy(Double fbcceAddOtherYoy){this.fbcceAddOtherYoy = fbcceAddOtherYoy;}
    public Double getFbcceAddOtherYoy(){return fbcceAddOtherYoy;}

    public void setDtAssetReduce(Double dtAssetReduce){this.dtAssetReduce = dtAssetReduce;}
    public Double getDtAssetReduce(){return dtAssetReduce;}

    public void setDtAssetReduceYoy(Double dtAssetReduceYoy){this.dtAssetReduceYoy = dtAssetReduceYoy;}
    public Double getDtAssetReduceYoy(){return dtAssetReduceYoy;}

    public void setAcceptInvestCash(Double acceptInvestCash){this.acceptInvestCash = acceptInvestCash;}
    public Double getAcceptInvestCash(){return acceptInvestCash;}

    public void setAcceptInvestCashYoy(Double acceptInvestCashYoy){this.acceptInvestCashYoy = acceptInvestCashYoy;}
    public Double getAcceptInvestCashYoy(){return acceptInvestCashYoy;}

    public void setEndCceOther(Double endCceOther){this.endCceOther = endCceOther;}
    public Double getEndCceOther(){return endCceOther;}

    public void setEndCceOtherYoy(Double endCceOtherYoy){this.endCceOtherYoy = endCceOtherYoy;}
    public Double getEndCceOtherYoy(){return endCceOtherYoy;}

    public void setFinanceInflowBalance(Double financeInflowBalance){this.financeInflowBalance = financeInflowBalance;}
    public Double getFinanceInflowBalance(){return financeInflowBalance;}

    public void setFinanceInflowBalanceYoy(Double financeInflowBalanceYoy){this.financeInflowBalanceYoy = financeInflowBalanceYoy;}
    public Double getFinanceInflowBalanceYoy(){return financeInflowBalanceYoy;}

    public void setEndCce(Double endCce){this.endCce = endCce;}
    public Double getEndCce(){return endCce;}

    public void setEndCceYoy(Double endCceYoy){this.endCceYoy = endCceYoy;}
    public Double getEndCceYoy(){return endCceYoy;}

    public void setTotalFinanceInflow(Double totalFinanceInflow){this.totalFinanceInflow = totalFinanceInflow;}
    public Double getTotalFinanceInflow(){return totalFinanceInflow;}

    public void setTotalFinanceInflowYoy(Double totalFinanceInflowYoy){this.totalFinanceInflowYoy = totalFinanceInflowYoy;}
    public Double getTotalFinanceInflowYoy(){return totalFinanceInflowYoy;}

    public void setCceAddOther(Double cceAddOther){this.cceAddOther = cceAddOther;}
    public Double getCceAddOther(){return cceAddOther;}

    public void setCceAddOtherYoy(Double cceAddOtherYoy){this.cceAddOtherYoy = cceAddOtherYoy;}
    public Double getCceAddOtherYoy(){return cceAddOtherYoy;}

    public void setCceAddBalance(Double cceAddBalance){this.cceAddBalance = cceAddBalance;}
    public Double getCceAddBalance(){return cceAddBalance;}

    public void setCceAddBalanceYoy(Double cceAddBalanceYoy){this.cceAddBalanceYoy = cceAddBalanceYoy;}
    public Double getCceAddBalanceYoy(){return cceAddBalanceYoy;}

    public void setExchangeLoss(Double exchangeLoss){this.exchangeLoss = exchangeLoss;}
    public Double getExchangeLoss(){return exchangeLoss;}

    public void setExchangeLossYoy(Double exchangeLossYoy){this.exchangeLossYoy = exchangeLossYoy;}
    public Double getExchangeLossYoy(){return exchangeLossYoy;}

    public void setLoanAdvanceAdd(Double loanAdvanceAdd){this.loanAdvanceAdd = loanAdvanceAdd;}
    public Double getLoanAdvanceAdd(){return loanAdvanceAdd;}

    public void setLoanAdvanceAddYoy(Double loanAdvanceAddYoy){this.loanAdvanceAddYoy = loanAdvanceAddYoy;}
    public Double getLoanAdvanceAddYoy(){return loanAdvanceAddYoy;}

    public void setInvestLoss(Double investLoss){this.investLoss = investLoss;}
    public Double getInvestLoss(){return investLoss;}

    public void setInvestLossYoy(Double investLossYoy){this.investLossYoy = investLossYoy;}
    public Double getInvestLossYoy(){return investLossYoy;}

    public void setFbcceAddBalance(Double fbcceAddBalance){this.fbcceAddBalance = fbcceAddBalance;}
    public Double getFbcceAddBalance(){return fbcceAddBalance;}

    public void setFbcceAddBalanceYoy(Double fbcceAddBalanceYoy){this.fbcceAddBalanceYoy = fbcceAddBalanceYoy;}
    public Double getFbcceAddBalanceYoy(){return fbcceAddBalanceYoy;}

    public void setCceAdd(Double cceAdd){this.cceAdd = cceAdd;}
    public Double getCceAdd(){return cceAdd;}

    public void setCceAddYoy(Double cceAddYoy){this.cceAddYoy = cceAddYoy;}
    public Double getCceAddYoy(){return cceAddYoy;}

    public void setReceiveCommission(Double receiveCommission){this.receiveCommission = receiveCommission;}
    public Double getReceiveCommission(){return receiveCommission;}

    public void setReceiveCommissionYoy(Double receiveCommissionYoy){this.receiveCommissionYoy = receiveCommissionYoy;}
    public Double getReceiveCommissionYoy(){return receiveCommissionYoy;}

    public void setDtLiabAdd(Double dtLiabAdd){this.dtLiabAdd = dtLiabAdd;}
    public Double getDtLiabAdd(){return dtLiabAdd;}

    public void setDtLiabAddYoy(Double dtLiabAddYoy){this.dtLiabAddYoy = dtLiabAddYoy;}
    public Double getDtLiabAddYoy(){return dtLiabAddYoy;}

    public void setDeferTax(Double deferTax){this.deferTax = deferTax;}
    public Double getDeferTax(){return deferTax;}

    public void setDeferTaxYoy(Double deferTaxYoy){this.deferTaxYoy = deferTaxYoy;}
    public Double getDeferTaxYoy(){return deferTaxYoy;}

    public void setInvestOutflowBalance(Double investOutflowBalance){this.investOutflowBalance = investOutflowBalance;}
    public Double getInvestOutflowBalance(){return investOutflowBalance;}

    public void setInvestOutflowBalanceYoy(Double investOutflowBalanceYoy){this.investOutflowBalanceYoy = investOutflowBalanceYoy;}
    public Double getInvestOutflowBalanceYoy(){return investOutflowBalanceYoy;}

    public void setDepositIofiReduce(Double depositIofiReduce){this.depositIofiReduce = depositIofiReduce;}
    public Double getDepositIofiReduce(){return depositIofiReduce;}

    public void setDepositIofiReduceYoy(Double depositIofiReduceYoy){this.depositIofiReduceYoy = depositIofiReduceYoy;}
    public Double getDepositIofiReduceYoy(){return depositIofiReduceYoy;}

    public void setFixedAssetDepr(Double fixedAssetDepr){this.fixedAssetDepr = fixedAssetDepr;}
    public Double getFixedAssetDepr(){return fixedAssetDepr;}

    public void setFixedAssetDeprYoy(Double fixedAssetDeprYoy){this.fixedAssetDeprYoy = fixedAssetDeprYoy;}
    public Double getFixedAssetDeprYoy(){return fixedAssetDeprYoy;}

    public void setFinleaseObtainFa(Double finleaseObtainFa){this.finleaseObtainFa = finleaseObtainFa;}
    public Double getFinleaseObtainFa(){return finleaseObtainFa;}

    public void setFinleaseObtainFaYoy(Double finleaseObtainFaYoy){this.finleaseObtainFaYoy = finleaseObtainFaYoy;}
    public Double getFinleaseObtainFaYoy(){return finleaseObtainFaYoy;}

    public void setTradeFinassetAdd(Double tradeFinassetAdd){this.tradeFinassetAdd = tradeFinassetAdd;}
    public Double getTradeFinassetAdd(){return tradeFinassetAdd;}

    public void setTradeFinassetAddYoy(Double tradeFinassetAddYoy){this.tradeFinassetAddYoy = tradeFinassetAddYoy;}
    public Double getTradeFinassetAddYoy(){return tradeFinassetAddYoy;}

    public void setPbcIofiAdd(Double pbcIofiAdd){this.pbcIofiAdd = pbcIofiAdd;}
    public Double getPbcIofiAdd(){return pbcIofiAdd;}

    public void setPbcIofiAddYoy(Double pbcIofiAddYoy){this.pbcIofiAddYoy = pbcIofiAddYoy;}
    public Double getPbcIofiAddYoy(){return pbcIofiAddYoy;}

    public void setLongassetAmortize(Double longassetAmortize){this.longassetAmortize = longassetAmortize;}
    public Double getLongassetAmortize(){return longassetAmortize;}

    public void setLongassetAmortizeYoy(Double longassetAmortizeYoy){this.longassetAmortizeYoy = longassetAmortizeYoy;}
    public Double getLongassetAmortizeYoy(){return longassetAmortizeYoy;}

    public void setTotalInvestInflow(Double totalInvestInflow){this.totalInvestInflow = totalInvestInflow;}
    public Double getTotalInvestInflow(){return totalInvestInflow;}

    public void setTotalInvestInflowYoy(Double totalInvestInflowYoy){this.totalInvestInflowYoy = totalInvestInflowYoy;}
    public Double getTotalInvestInflowYoy(){return totalInvestInflowYoy;}

    public void setFinanceNetcashBalance(Double financeNetcashBalance){this.financeNetcashBalance = financeNetcashBalance;}
    public Double getFinanceNetcashBalance(){return financeNetcashBalance;}

    public void setFinanceNetcashBalanceYoy(Double financeNetcashBalanceYoy){this.financeNetcashBalanceYoy = financeNetcashBalanceYoy;}
    public Double getFinanceNetcashBalanceYoy(){return financeNetcashBalanceYoy;}

    public void setLoanPbcReduce(Double loanPbcReduce){this.loanPbcReduce = loanPbcReduce;}
    public Double getLoanPbcReduce(){return loanPbcReduce;}

    public void setLoanPbcReduceYoy(Double loanPbcReduceYoy){this.loanPbcReduceYoy = loanPbcReduceYoy;}
    public Double getLoanPbcReduceYoy(){return loanPbcReduceYoy;}

    public void setPayCommission(Double payCommission){this.payCommission = payCommission;}
    public Double getPayCommission(){return payCommission;}

    public void setPayCommissionYoy(Double payCommissionYoy){this.payCommissionYoy = payCommissionYoy;}
    public Double getPayCommissionYoy(){return payCommissionYoy;}

    public void setReceiveOtherInvest(Double receiveOtherInvest){this.receiveOtherInvest = receiveOtherInvest;}
    public Double getReceiveOtherInvest(){return receiveOtherInvest;}

    public void setReceiveOtherInvestYoy(Double receiveOtherInvestYoy){this.receiveOtherInvestYoy = receiveOtherInvestYoy;}
    public Double getReceiveOtherInvestYoy(){return receiveOtherInvestYoy;}

    public void setLendAdd(Double lendAdd){this.lendAdd = lendAdd;}
    public Double getLendAdd(){return lendAdd;}

    public void setLendAddYoy(Double lendAddYoy){this.lendAddYoy = lendAddYoy;}
    public Double getLendAddYoy(){return lendAddYoy;}

    public void setFaIrDepr(Double faIrDepr){this.faIrDepr = faIrDepr;}
    public Double getFaIrDepr(){return faIrDepr;}

    public void setFaIrDeprYoy(Double faIrDeprYoy){this.faIrDeprYoy = faIrDeprYoy;}
    public Double getFaIrDeprYoy(){return faIrDeprYoy;}

    public void setProvisionLoanImpairment(Double provisionLoanImpairment){this.provisionLoanImpairment = provisionLoanImpairment;}
    public Double getProvisionLoanImpairment(){return provisionLoanImpairment;}

    public void setProvisionLoanImpairmentYoy(Double provisionLoanImpairmentYoy){this.provisionLoanImpairmentYoy = provisionLoanImpairmentYoy;}
    public Double getProvisionLoanImpairmentYoy(){return provisionLoanImpairmentYoy;}

    public void setOperateOutflowBalance(Double operateOutflowBalance){this.operateOutflowBalance = operateOutflowBalance;}
    public Double getOperateOutflowBalance(){return operateOutflowBalance;}

    public void setOperateOutflowBalanceYoy(Double operateOutflowBalanceYoy){this.operateOutflowBalanceYoy = operateOutflowBalanceYoy;}
    public Double getOperateOutflowBalanceYoy(){return operateOutflowBalanceYoy;}

    public void setLendResaleAdd(Double lendResaleAdd){this.lendResaleAdd = lendResaleAdd;}
    public Double getLendResaleAdd(){return lendResaleAdd;}

    public void setLendResaleAddYoy(Double lendResaleAddYoy){this.lendResaleAddYoy = lendResaleAddYoy;}
    public Double getLendResaleAddYoy(){return lendResaleAddYoy;}

    public void setBuyResaleReduce(Double buyResaleReduce){this.buyResaleReduce = buyResaleReduce;}
    public Double getBuyResaleReduce(){return buyResaleReduce;}

    public void setBuyResaleReduceYoy(Double buyResaleReduceYoy){this.buyResaleReduceYoy = buyResaleReduceYoy;}
    public Double getBuyResaleReduceYoy(){return buyResaleReduceYoy;}

    public void setCustomerDepositAdd(Double customerDepositAdd){this.customerDepositAdd = customerDepositAdd;}
    public Double getCustomerDepositAdd(){return customerDepositAdd;}

    public void setCustomerDepositAddYoy(Double customerDepositAddYoy){this.customerDepositAddYoy = customerDepositAddYoy;}
    public Double getCustomerDepositAddYoy(){return customerDepositAddYoy;}

    public void setIssueCd(Double issueCd){this.issueCd = issueCd;}
    public Double getIssueCd(){return issueCd;}

    public void setIssueCdYoy(Double issueCdYoy){this.issueCdYoy = issueCdYoy;}
    public Double getIssueCdYoy(){return issueCdYoy;}

    public void setFinassetReduce(Double finassetReduce){this.finassetReduce = finassetReduce;}
    public Double getFinassetReduce(){return finassetReduce;}

    public void setFinassetReduceYoy(Double finassetReduceYoy){this.finassetReduceYoy = finassetReduceYoy;}
    public Double getFinassetReduceYoy(){return finassetReduceYoy;}

    public void setPayInterestCommission(Double payInterestCommission){this.payInterestCommission = payInterestCommission;}
    public Double getPayInterestCommission(){return payInterestCommission;}

    public void setPayInterestCommissionYoy(Double payInterestCommissionYoy){this.payInterestCommissionYoy = payInterestCommissionYoy;}
    public Double getPayInterestCommissionYoy(){return payInterestCommissionYoy;}

    public void setPayOtherFinance(Double payOtherFinance){this.payOtherFinance = payOtherFinance;}
    public Double getPayOtherFinance(){return payOtherFinance;}

    public void setPayOtherFinanceYoy(Double payOtherFinanceYoy){this.payOtherFinanceYoy = payOtherFinanceYoy;}
    public Double getPayOtherFinanceYoy(){return payOtherFinanceYoy;}

    public void setReceiveDividendProfit(Double receiveDividendProfit){this.receiveDividendProfit = receiveDividendProfit;}
    public Double getReceiveDividendProfit(){return receiveDividendProfit;}

    public void setReceiveDividendProfitYoy(Double receiveDividendProfitYoy){this.receiveDividendProfitYoy = receiveDividendProfitYoy;}
    public Double getReceiveDividendProfitYoy(){return receiveDividendProfitYoy;}

    public void setFinanceOutflowOther(Double financeOutflowOther){this.financeOutflowOther = financeOutflowOther;}
    public Double getFinanceOutflowOther(){return financeOutflowOther;}

    public void setFinanceOutflowOtherYoy(Double financeOutflowOtherYoy){this.financeOutflowOtherYoy = financeOutflowOtherYoy;}
    public Double getFinanceOutflowOtherYoy(){return financeOutflowOtherYoy;}

    public void setObtainSubsidiaryOther(Double obtainSubsidiaryOther){this.obtainSubsidiaryOther = obtainSubsidiaryOther;}
    public Double getObtainSubsidiaryOther(){return obtainSubsidiaryOther;}

    public void setObtainSubsidiaryOtherYoy(Double obtainSubsidiaryOtherYoy){this.obtainSubsidiaryOtherYoy = obtainSubsidiaryOtherYoy;}
    public Double getObtainSubsidiaryOtherYoy(){return obtainSubsidiaryOtherYoy;}

    public void setWithdrawInvest(Double withdrawInvest){this.withdrawInvest = withdrawInvest;}
    public Double getWithdrawInvest(){return withdrawInvest;}

    public void setWithdrawInvestYoy(Double withdrawInvestYoy){this.withdrawInvestYoy = withdrawInvestYoy;}
    public Double getWithdrawInvestYoy(){return withdrawInvestYoy;}

    public void setPayStaffCash(Double payStaffCash){this.payStaffCash = payStaffCash;}
    public Double getPayStaffCash(){return payStaffCash;}

    public void setPayStaffCashYoy(Double payStaffCashYoy){this.payStaffCashYoy = payStaffCashYoy;}
    public Double getPayStaffCashYoy(){return payStaffCashYoy;}

    public void setIaAmortize(Double iaAmortize){this.iaAmortize = iaAmortize;}
    public Double getIaAmortize(){return iaAmortize;}

    public void setIaAmortizeYoy(Double iaAmortizeYoy){this.iaAmortizeYoy = iaAmortizeYoy;}
    public Double getIaAmortizeYoy(){return iaAmortizeYoy;}

    public void setBeginCce(Double beginCce){this.beginCce = beginCce;}
    public Double getBeginCce(){return beginCce;}

    public void setBeginCceYoy(Double beginCceYoy){this.beginCceYoy = beginCceYoy;}
    public Double getBeginCceYoy(){return beginCceYoy;}

    public void setDepositPbcReduce(Double depositPbcReduce){this.depositPbcReduce = depositPbcReduce;}
    public Double getDepositPbcReduce(){return depositPbcReduce;}

    public void setDepositPbcReduceYoy(Double depositPbcReduceYoy){this.depositPbcReduceYoy = depositPbcReduceYoy;}
    public Double getDepositPbcReduceYoy(){return depositPbcReduceYoy;}

    public void setSellRepoReduce(Double sellRepoReduce){this.sellRepoReduce = sellRepoReduce;}
    public Double getSellRepoReduce(){return sellRepoReduce;}

    public void setSellRepoReduceYoy(Double sellRepoReduceYoy){this.sellRepoReduceYoy = sellRepoReduceYoy;}
    public Double getSellRepoReduceYoy(){return sellRepoReduceYoy;}

    public void setUninvolveInvestfinOther(Double uninvolveInvestfinOther){this.uninvolveInvestfinOther = uninvolveInvestfinOther;}
    public Double getUninvolveInvestfinOther(){return uninvolveInvestfinOther;}

    public void setUninvolveInvestfinOtherYoy(Double uninvolveInvestfinOtherYoy){this.uninvolveInvestfinOtherYoy = uninvolveInvestfinOtherYoy;}
    public Double getUninvolveInvestfinOtherYoy(){return uninvolveInvestfinOtherYoy;}

    public void setNetcashInvest(Double netcashInvest){this.netcashInvest = netcashInvest;}
    public Double getNetcashInvest(){return netcashInvest;}

    public void setNetcashInvestYoy(Double netcashInvestYoy){this.netcashInvestYoy = netcashInvestYoy;}
    public Double getNetcashInvestYoy(){return netcashInvestYoy;}

    public void setProvisionInvestImpairment(Double provisionInvestImpairment){this.provisionInvestImpairment = provisionInvestImpairment;}
    public Double getProvisionInvestImpairment(){return provisionInvestImpairment;}

    public void setProvisionInvestImpairmentYoy(Double provisionInvestImpairmentYoy){this.provisionInvestImpairmentYoy = provisionInvestImpairmentYoy;}
    public Double getProvisionInvestImpairmentYoy(){return provisionInvestImpairmentYoy;}

    public void setNetprofit(Double netprofit){this.netprofit = netprofit;}
    public Double getNetprofit(){return netprofit;}

    public void setNetprofitYoy(Double netprofitYoy){this.netprofitYoy = netprofitYoy;}
    public Double getNetprofitYoy(){return netprofitYoy;}

    public void setPbcIofiReduce(Double pbcIofiReduce){this.pbcIofiReduce = pbcIofiReduce;}
    public Double getPbcIofiReduce(){return pbcIofiReduce;}

    public void setPbcIofiReduceYoy(Double pbcIofiReduceYoy){this.pbcIofiReduceYoy = pbcIofiReduceYoy;}
    public Double getPbcIofiReduceYoy(){return pbcIofiReduceYoy;}

    public void setFbnetcashOperate(Double fbnetcashOperate){this.fbnetcashOperate = fbnetcashOperate;}
    public Double getFbnetcashOperate(){return fbnetcashOperate;}

    public void setFbnetcashOperateYoy(Double fbnetcashOperateYoy){this.fbnetcashOperateYoy = fbnetcashOperateYoy;}
    public Double getFbnetcashOperateYoy(){return fbnetcashOperateYoy;}

    public void setBuyResaleAdd(Double buyResaleAdd){this.buyResaleAdd = buyResaleAdd;}
    public Double getBuyResaleAdd(){return buyResaleAdd;}

    public void setBuyResaleAddYoy(Double buyResaleAddYoy){this.buyResaleAddYoy = buyResaleAddYoy;}
    public Double getBuyResaleAddYoy(){return buyResaleAddYoy;}

    public void setIssueOtherBond(Double issueOtherBond){this.issueOtherBond = issueOtherBond;}
    public Double getIssueOtherBond(){return issueOtherBond;}

    public void setIssueOtherBondYoy(Double issueOtherBondYoy){this.issueOtherBondYoy = issueOtherBondYoy;}
    public Double getIssueOtherBondYoy(){return issueOtherBondYoy;}

    public void setInterbankOtherReduce(Double interbankOtherReduce){this.interbankOtherReduce = interbankOtherReduce;}
    public Double getInterbankOtherReduce(){return interbankOtherReduce;}

    public void setInterbankOtherReduceYoy(Double interbankOtherReduceYoy){this.interbankOtherReduceYoy = interbankOtherReduceYoy;}
    public Double getInterbankOtherReduceYoy(){return interbankOtherReduceYoy;}

    public void setBuyFinLease(Double buyFinLease){this.buyFinLease = buyFinLease;}
    public Double getBuyFinLease(){return buyFinLease;}

    public void setBuyFinLeaseYoy(Double buyFinLeaseYoy){this.buyFinLeaseYoy = buyFinLeaseYoy;}
    public Double getBuyFinLeaseYoy(){return buyFinLeaseYoy;}

    public void setEndCashEquivalents(Double endCashEquivalents){this.endCashEquivalents = endCashEquivalents;}
    public Double getEndCashEquivalents(){return endCashEquivalents;}

    public void setEndCashEquivalentsYoy(Double endCashEquivalentsYoy){this.endCashEquivalentsYoy = endCashEquivalentsYoy;}
    public Double getEndCashEquivalentsYoy(){return endCashEquivalentsYoy;}

    public void setLpeAmortize(Double lpeAmortize){this.lpeAmortize = lpeAmortize;}
    public Double getLpeAmortize(){return lpeAmortize;}

    public void setLpeAmortizeYoy(Double lpeAmortizeYoy){this.lpeAmortizeYoy = lpeAmortizeYoy;}
    public Double getLpeAmortizeYoy(){return lpeAmortizeYoy;}

    public void setReceiveInvestIncome(Double receiveInvestIncome){this.receiveInvestIncome = receiveInvestIncome;}
    public Double getReceiveInvestIncome(){return receiveInvestIncome;}

    public void setReceiveInvestIncomeYoy(Double receiveInvestIncomeYoy){this.receiveInvestIncomeYoy = receiveInvestIncomeYoy;}
    public Double getReceiveInvestIncomeYoy(){return receiveInvestIncomeYoy;}

    public void setIssuedCdReduce(Double issuedCdReduce){this.issuedCdReduce = issuedCdReduce;}
    public Double getIssuedCdReduce(){return issuedCdReduce;}

    public void setIssuedCdReduceYoy(Double issuedCdReduceYoy){this.issuedCdReduceYoy = issuedCdReduceYoy;}
    public Double getIssuedCdReduceYoy(){return issuedCdReduceYoy;}

    public void setBorrowRepoReduce(Double borrowRepoReduce){this.borrowRepoReduce = borrowRepoReduce;}
    public Double getBorrowRepoReduce(){return borrowRepoReduce;}

    public void setBorrowRepoReduceYoy(Double borrowRepoReduceYoy){this.borrowRepoReduceYoy = borrowRepoReduceYoy;}
    public Double getBorrowRepoReduceYoy(){return borrowRepoReduceYoy;}

    public void setPayBondInterest(Double payBondInterest){this.payBondInterest = payBondInterest;}
    public Double getPayBondInterest(){return payBondInterest;}

    public void setPayBondInterestYoy(Double payBondInterestYoy){this.payBondInterestYoy = payBondInterestYoy;}
    public Double getPayBondInterestYoy(){return payBondInterestYoy;}

    public void setTradeFinliabAdd(Double tradeFinliabAdd){this.tradeFinliabAdd = tradeFinliabAdd;}
    public Double getTradeFinliabAdd(){return tradeFinliabAdd;}

    public void setTradeFinliabAddYoy(Double tradeFinliabAddYoy){this.tradeFinliabAddYoy = tradeFinliabAddYoy;}
    public Double getTradeFinliabAddYoy(){return tradeFinliabAddYoy;}

    public void setTotalOperateOutflow(Double totalOperateOutflow){this.totalOperateOutflow = totalOperateOutflow;}
    public Double getTotalOperateOutflow(){return totalOperateOutflow;}

    public void setTotalOperateOutflowYoy(Double totalOperateOutflowYoy){this.totalOperateOutflowYoy = totalOperateOutflowYoy;}
    public Double getTotalOperateOutflowYoy(){return totalOperateOutflowYoy;}

    public void setDepositIofiAdd(Double depositIofiAdd){this.depositIofiAdd = depositIofiAdd;}
    public Double getDepositIofiAdd(){return depositIofiAdd;}

    public void setDepositIofiAddYoy(Double depositIofiAddYoy){this.depositIofiAddYoy = depositIofiAddYoy;}
    public Double getDepositIofiAddYoy(){return depositIofiAddYoy;}

    public void setWithdrawWriteoffLoan(Double withdrawWriteoffLoan){this.withdrawWriteoffLoan = withdrawWriteoffLoan;}
    public Double getWithdrawWriteoffLoan(){return withdrawWriteoffLoan;}

    public void setWithdrawWriteoffLoanYoy(Double withdrawWriteoffLoanYoy){this.withdrawWriteoffLoanYoy = withdrawWriteoffLoanYoy;}
    public Double getWithdrawWriteoffLoanYoy(){return withdrawWriteoffLoanYoy;}

    public void setBondInterestExpense(Double bondInterestExpense){this.bondInterestExpense = bondInterestExpense;}
    public Double getBondInterestExpense(){return bondInterestExpense;}

    public void setBondInterestExpenseYoy(Double bondInterestExpenseYoy){this.bondInterestExpenseYoy = bondInterestExpenseYoy;}
    public Double getBondInterestExpenseYoy(){return bondInterestExpenseYoy;}

    public void setFboperateNetcashBalance(Double fboperateNetcashBalance){this.fboperateNetcashBalance = fboperateNetcashBalance;}
    public Double getFboperateNetcashBalance(){return fboperateNetcashBalance;}

    public void setFboperateNetcashBalanceYoy(Double fboperateNetcashBalanceYoy){this.fboperateNetcashBalanceYoy = fboperateNetcashBalanceYoy;}
    public Double getFboperateNetcashBalanceYoy(){return fboperateNetcashBalanceYoy;}

    public void setIssueSharesExpense(Double issueSharesExpense){this.issueSharesExpense = issueSharesExpense;}
    public Double getIssueSharesExpense(){return issueSharesExpense;}

    public void setIssueSharesExpenseYoy(Double issueSharesExpenseYoy){this.issueSharesExpenseYoy = issueSharesExpenseYoy;}
    public Double getIssueSharesExpenseYoy(){return issueSharesExpenseYoy;}

    public void setFbcceAdd(Double fbcceAdd){this.fbcceAdd = fbcceAdd;}
    public Double getFbcceAdd(){return fbcceAdd;}

    public void setFbcceAddYoy(Double fbcceAddYoy){this.fbcceAddYoy = fbcceAddYoy;}
    public Double getFbcceAddYoy(){return fbcceAddYoy;}

    public void setPayDebtCash(Double payDebtCash){this.payDebtCash = payDebtCash;}
    public Double getPayDebtCash(){return payDebtCash;}

    public void setPayDebtCashYoy(Double payDebtCashYoy){this.payDebtCashYoy = payDebtCashYoy;}
    public Double getPayDebtCashYoy(){return payDebtCashYoy;}

    public void setDisposalMortgageAsset(Double disposalMortgageAsset){this.disposalMortgageAsset = disposalMortgageAsset;}
    public Double getDisposalMortgageAsset(){return disposalMortgageAsset;}

    public void setDisposalMortgageAssetYoy(Double disposalMortgageAssetYoy){this.disposalMortgageAssetYoy = disposalMortgageAssetYoy;}
    public Double getDisposalMortgageAssetYoy(){return disposalMortgageAssetYoy;}

    public void setIssueBond(Double issueBond){this.issueBond = issueBond;}
    public Double getIssueBond(){return issueBond;}

    public void setIssueBondYoy(Double issueBondYoy){this.issueBondYoy = issueBondYoy;}
    public Double getIssueBondYoy(){return issueBondYoy;}

    public void setOperatePayableAdd(Double operatePayableAdd){this.operatePayableAdd = operatePayableAdd;}
    public Double getOperatePayableAdd(){return operatePayableAdd;}

    public void setOperatePayableAddYoy(Double operatePayableAddYoy){this.operatePayableAddYoy = operatePayableAddYoy;}
    public Double getOperatePayableAddYoy(){return operatePayableAddYoy;}

    public void setOperateReceReduce(Double operateReceReduce){this.operateReceReduce = operateReceReduce;}
    public Double getOperateReceReduce(){return operateReceReduce;}

    public void setOperateReceReduceYoy(Double operateReceReduceYoy){this.operateReceReduceYoy = operateReceReduceYoy;}
    public Double getOperateReceReduceYoy(){return operateReceReduceYoy;}

    public void setTransferInvestImpairment(Double transferInvestImpairment){this.transferInvestImpairment = transferInvestImpairment;}
    public Double getTransferInvestImpairment(){return transferInvestImpairment;}

    public void setTransferInvestImpairmentYoy(Double transferInvestImpairmentYoy){this.transferInvestImpairmentYoy = transferInvestImpairmentYoy;}
    public Double getTransferInvestImpairmentYoy(){return transferInvestImpairmentYoy;}

    public void setPayAllTax(Double payAllTax){this.payAllTax = payAllTax;}
    public Double getPayAllTax(){return payAllTax;}

    public void setPayAllTaxYoy(Double payAllTaxYoy){this.payAllTaxYoy = payAllTaxYoy;}
    public Double getPayAllTaxYoy(){return payAllTaxYoy;}

    public void setInvestNetcashBalance(Double investNetcashBalance){this.investNetcashBalance = investNetcashBalance;}
    public Double getInvestNetcashBalance(){return investNetcashBalance;}

    public void setInvestNetcashBalanceYoy(Double investNetcashBalanceYoy){this.investNetcashBalanceYoy = investNetcashBalanceYoy;}
    public Double getInvestNetcashBalanceYoy(){return investNetcashBalanceYoy;}

    public void setReceiveInterestCommission(Double receiveInterestCommission){this.receiveInterestCommission = receiveInterestCommission;}
    public Double getReceiveInterestCommission(){return receiveInterestCommission;}

    public void setReceiveInterestCommissionYoy(Double receiveInterestCommissionYoy){this.receiveInterestCommissionYoy = receiveInterestCommissionYoy;}
    public Double getReceiveInterestCommissionYoy(){return receiveInterestCommissionYoy;}

    public void setFboperateNetcashOther(Double fboperateNetcashOther){this.fboperateNetcashOther = fboperateNetcashOther;}
    public Double getFboperateNetcashOther(){return fboperateNetcashOther;}

    public void setFboperateNetcashOtherYoy(Double fboperateNetcashOtherYoy){this.fboperateNetcashOtherYoy = fboperateNetcashOtherYoy;}
    public Double getFboperateNetcashOtherYoy(){return fboperateNetcashOtherYoy;}

    public void setBorrowFundAdd(Double borrowFundAdd){this.borrowFundAdd = borrowFundAdd;}
    public Double getBorrowFundAdd(){return borrowFundAdd;}

    public void setBorrowFundAddYoy(Double borrowFundAddYoy){this.borrowFundAddYoy = borrowFundAddYoy;}
    public Double getBorrowFundAddYoy(){return borrowFundAddYoy;}

    public void setAssetImpairment(Double assetImpairment){this.assetImpairment = assetImpairment;}
    public Double getAssetImpairment(){return assetImpairment;}

    public void setAssetImpairmentYoy(Double assetImpairmentYoy){this.assetImpairmentYoy = assetImpairmentYoy;}
    public Double getAssetImpairmentYoy(){return assetImpairmentYoy;}

    public void setAssignDividendPorfit(Double assignDividendPorfit){this.assignDividendPorfit = assignDividendPorfit;}
    public Double getAssignDividendPorfit(){return assignDividendPorfit;}

    public void setAssignDividendPorfitYoy(Double assignDividendPorfitYoy){this.assignDividendPorfitYoy = assignDividendPorfitYoy;}
    public Double getAssignDividendPorfitYoy(){return assignDividendPorfitYoy;}

    public void setTotalFinanceOutflow(Double totalFinanceOutflow){this.totalFinanceOutflow = totalFinanceOutflow;}
    public Double getTotalFinanceOutflow(){return totalFinanceOutflow;}

    public void setTotalFinanceOutflowYoy(Double totalFinanceOutflowYoy){this.totalFinanceOutflowYoy = totalFinanceOutflowYoy;}
    public Double getTotalFinanceOutflowYoy(){return totalFinanceOutflowYoy;}

    public void setDisposalSubsidiaryJoint(Double disposalSubsidiaryJoint){this.disposalSubsidiaryJoint = disposalSubsidiaryJoint;}
    public Double getDisposalSubsidiaryJoint(){return disposalSubsidiaryJoint;}

    public void setDisposalSubsidiaryJointYoy(Double disposalSubsidiaryJointYoy){this.disposalSubsidiaryJointYoy = disposalSubsidiaryJointYoy;}
    public Double getDisposalSubsidiaryJointYoy(){return disposalSubsidiaryJointYoy;}

    public void setReceiveOtherFinance(Double receiveOtherFinance){this.receiveOtherFinance = receiveOtherFinance;}
    public Double getReceiveOtherFinance(){return receiveOtherFinance;}

    public void setReceiveOtherFinanceYoy(Double receiveOtherFinanceYoy){this.receiveOtherFinanceYoy = receiveOtherFinanceYoy;}
    public Double getReceiveOtherFinanceYoy(){return receiveOtherFinanceYoy;}

    public void setPayOtherOperate(Double payOtherOperate){this.payOtherOperate = payOtherOperate;}
    public Double getPayOtherOperate(){return payOtherOperate;}

    public void setPayOtherOperateYoy(Double payOtherOperateYoy){this.payOtherOperateYoy = payOtherOperateYoy;}
    public Double getPayOtherOperateYoy(){return payOtherOperateYoy;}

    public void setTradeFinassetReduce(Double tradeFinassetReduce){this.tradeFinassetReduce = tradeFinassetReduce;}
    public Double getTradeFinassetReduce(){return tradeFinassetReduce;}

    public void setTradeFinassetReduceYoy(Double tradeFinassetReduceYoy){this.tradeFinassetReduceYoy = tradeFinassetReduceYoy;}
    public Double getTradeFinassetReduceYoy(){return tradeFinassetReduceYoy;}

    public void setLendResaleReduce(Double lendResaleReduce){this.lendResaleReduce = lendResaleReduce;}
    public Double getLendResaleReduce(){return lendResaleReduce;}

    public void setLendResaleReduceYoy(Double lendResaleReduceYoy){this.lendResaleReduceYoy = lendResaleReduceYoy;}
    public Double getLendResaleReduceYoy(){return lendResaleReduceYoy;}

    public void setNetCd(Double netCd){this.netCd = netCd;}
    public Double getNetCd(){return netCd;}

    public void setNetCdYoy(Double netCdYoy){this.netCdYoy = netCdYoy;}
    public Double getNetCdYoy(){return netCdYoy;}

    public void setIofiAdd(Double iofiAdd){this.iofiAdd = iofiAdd;}
    public Double getIofiAdd(){return iofiAdd;}

    public void setIofiAddYoy(Double iofiAddYoy){this.iofiAddYoy = iofiAddYoy;}
    public Double getIofiAddYoy(){return iofiAddYoy;}

    public void setInventoryReduce(Double inventoryReduce){this.inventoryReduce = inventoryReduce;}
    public Double getInventoryReduce(){return inventoryReduce;}

    public void setInventoryReduceYoy(Double inventoryReduceYoy){this.inventoryReduceYoy = inventoryReduceYoy;}
    public Double getInventoryReduceYoy(){return inventoryReduceYoy;}

    public void setDisposalLongassetLoss(Double disposalLongassetLoss){this.disposalLongassetLoss = disposalLongassetLoss;}
    public Double getDisposalLongassetLoss(){return disposalLongassetLoss;}

    public void setDisposalLongassetLossYoy(Double disposalLongassetLossYoy){this.disposalLongassetLossYoy = disposalLongassetLossYoy;}
    public Double getDisposalLongassetLossYoy(){return disposalLongassetLossYoy;}

    public void setEndCash(Double endCash){this.endCash = endCash;}
    public Double getEndCash(){return endCash;}

    public void setEndCashYoy(Double endCashYoy){this.endCashYoy = endCashYoy;}
    public Double getEndCashYoy(){return endCashYoy;}

    public void setOther(Double other){this.other = other;}
    public Double getOther(){return other;}

    public void setOtherYoy(Double otherYoy){this.otherYoy = otherYoy;}
    public Double getOtherYoy(){return otherYoy;}

    public void setNetcashOperate(Double netcashOperate){this.netcashOperate = netcashOperate;}
    public Double getNetcashOperate(){return netcashOperate;}

    public void setNetcashOperateYoy(Double netcashOperateYoy){this.netcashOperateYoy = netcashOperateYoy;}
    public Double getNetcashOperateYoy(){return netcashOperateYoy;}

    public void setDisposalLongAsset(Double disposalLongAsset){this.disposalLongAsset = disposalLongAsset;}
    public Double getDisposalLongAsset(){return disposalLongAsset;}

    public void setDisposalLongAssetYoy(Double disposalLongAssetYoy){this.disposalLongAssetYoy = disposalLongAssetYoy;}
    public Double getDisposalLongAssetYoy(){return disposalLongAssetYoy;}

    public void setSubsidiaryAcceptInvest(Double subsidiaryAcceptInvest){this.subsidiaryAcceptInvest = subsidiaryAcceptInvest;}
    public Double getSubsidiaryAcceptInvest(){return subsidiaryAcceptInvest;}

    public void setSubsidiaryAcceptInvestYoy(Double subsidiaryAcceptInvestYoy){this.subsidiaryAcceptInvestYoy = subsidiaryAcceptInvestYoy;}
    public Double getSubsidiaryAcceptInvestYoy(){return subsidiaryAcceptInvestYoy;}

    public void setReceiveInterest(Double receiveInterest){this.receiveInterest = receiveInterest;}
    public Double getReceiveInterest(){return receiveInterest;}

    public void setReceiveInterestYoy(Double receiveInterestYoy){this.receiveInterestYoy = receiveInterestYoy;}
    public Double getReceiveInterestYoy(){return receiveInterestYoy;}

    public void setTotalOperateInflow(Double totalOperateInflow){this.totalOperateInflow = totalOperateInflow;}
    public Double getTotalOperateInflow(){return totalOperateInflow;}

    public void setTotalOperateInflowYoy(Double totalOperateInflowYoy){this.totalOperateInflowYoy = totalOperateInflowYoy;}
    public Double getTotalOperateInflowYoy(){return totalOperateInflowYoy;}

    public void setFinliabAdd(Double finliabAdd){this.finliabAdd = finliabAdd;}
    public Double getFinliabAdd(){return finliabAdd;}

    public void setFinliabAddYoy(Double finliabAddYoy){this.finliabAddYoy = finliabAddYoy;}
    public Double getFinliabAddYoy(){return finliabAddYoy;}

    public void setEndCceBalance(Double endCceBalance){this.endCceBalance = endCceBalance;}
    public Double getEndCceBalance(){return endCceBalance;}

    public void setEndCceBalanceYoy(Double endCceBalanceYoy){this.endCceBalanceYoy = endCceBalanceYoy;}
    public Double getEndCceBalanceYoy(){return endCceBalanceYoy;}

    public void setAccountsReceAdd(Double accountsReceAdd){this.accountsReceAdd = accountsReceAdd;}
    public Double getAccountsReceAdd(){return accountsReceAdd;}

    public void setAccountsReceAddYoy(Double accountsReceAddYoy){this.accountsReceAddYoy = accountsReceAddYoy;}
    public Double getAccountsReceAddYoy(){return accountsReceAddYoy;}

    public void setLendFundReduce(Double lendFundReduce){this.lendFundReduce = lendFundReduce;}
    public Double getLendFundReduce(){return lendFundReduce;}

    public void setLendFundReduceYoy(Double lendFundReduceYoy){this.lendFundReduceYoy = lendFundReduceYoy;}
    public Double getLendFundReduceYoy(){return lendFundReduceYoy;}

    public void setDepositAdd(Double depositAdd){this.depositAdd = depositAdd;}
    public Double getDepositAdd(){return depositAdd;}

    public void setDepositAddYoy(Double depositAddYoy){this.depositAddYoy = depositAddYoy;}
    public Double getDepositAddYoy(){return depositAddYoy;}

    public void setInvestOutflowOther(Double investOutflowOther){this.investOutflowOther = investOutflowOther;}
    public Double getInvestOutflowOther(){return investOutflowOther;}

    public void setInvestOutflowOtherYoy(Double investOutflowOtherYoy){this.investOutflowOtherYoy = investOutflowOtherYoy;}
    public Double getInvestOutflowOtherYoy(){return investOutflowOtherYoy;}

    public void setConvertBond1year(Double convertBond1year){this.convertBond1year = convertBond1year;}
    public Double getConvertBond1year(){return convertBond1year;}

    public void setConvertBond1yearYoy(Double convertBond1yearYoy){this.convertBond1yearYoy = convertBond1yearYoy;}
    public Double getConvertBond1yearYoy(){return convertBond1yearYoy;}

    public void setConstructLongAsset(Double constructLongAsset){this.constructLongAsset = constructLongAsset;}
    public Double getConstructLongAsset(){return constructLongAsset;}

    public void setConstructLongAssetYoy(Double constructLongAssetYoy){this.constructLongAssetYoy = constructLongAssetYoy;}
    public Double getConstructLongAssetYoy(){return constructLongAssetYoy;}

    public void setFinanceOutflowBalance(Double financeOutflowBalance){this.financeOutflowBalance = financeOutflowBalance;}
    public Double getFinanceOutflowBalance(){return financeOutflowBalance;}

    public void setFinanceOutflowBalanceYoy(Double financeOutflowBalanceYoy){this.financeOutflowBalanceYoy = financeOutflowBalanceYoy;}
    public Double getFinanceOutflowBalanceYoy(){return financeOutflowBalanceYoy;}

    public void setTotalInvestOutflow(Double totalInvestOutflow){this.totalInvestOutflow = totalInvestOutflow;}
    public Double getTotalInvestOutflow(){return totalInvestOutflow;}

    public void setTotalInvestOutflowYoy(Double totalInvestOutflowYoy){this.totalInvestOutflowYoy = totalInvestOutflowYoy;}
    public Double getTotalInvestOutflowYoy(){return totalInvestOutflowYoy;}

    public void setSellRepoAdd(Double sellRepoAdd){this.sellRepoAdd = sellRepoAdd;}
    public Double getSellRepoAdd(){return sellRepoAdd;}

    public void setSellRepoAddYoy(Double sellRepoAddYoy){this.sellRepoAddYoy = sellRepoAddYoy;}
    public Double getSellRepoAddYoy(){return sellRepoAddYoy;}

    public void setOperateNetcashOther(Double operateNetcashOther){this.operateNetcashOther = operateNetcashOther;}
    public Double getOperateNetcashOther(){return operateNetcashOther;}

    public void setOperateNetcashOtherYoy(Double operateNetcashOtherYoy){this.operateNetcashOtherYoy = operateNetcashOtherYoy;}
    public Double getOperateNetcashOtherYoy(){return operateNetcashOtherYoy;}

    public void setFinanceInflowOther(Double financeInflowOther){this.financeInflowOther = financeInflowOther;}
    public Double getFinanceInflowOther(){return financeInflowOther;}

    public void setFinanceInflowOtherYoy(Double financeInflowOtherYoy){this.financeInflowOtherYoy = financeInflowOtherYoy;}
    public Double getFinanceInflowOtherYoy(){return financeInflowOtherYoy;}

    public void setIaLpeAmortize(Double iaLpeAmortize){this.iaLpeAmortize = iaLpeAmortize;}
    public Double getIaLpeAmortize(){return iaLpeAmortize;}

    public void setIaLpeAmortizeYoy(Double iaLpeAmortizeYoy){this.iaLpeAmortizeYoy = iaLpeAmortizeYoy;}
    public Double getIaLpeAmortizeYoy(){return iaLpeAmortizeYoy;}

    public void setOperateNetcashBalance(Double operateNetcashBalance){this.operateNetcashBalance = operateNetcashBalance;}
    public Double getOperateNetcashBalance(){return operateNetcashBalance;}

    public void setOperateNetcashBalanceYoy(Double operateNetcashBalanceYoy){this.operateNetcashBalanceYoy = operateNetcashBalanceYoy;}
    public Double getOperateNetcashBalanceYoy(){return operateNetcashBalanceYoy;}

    public void setInvestInflowBalance(Double investInflowBalance){this.investInflowBalance = investInflowBalance;}
    public Double getInvestInflowBalance(){return investInflowBalance;}

    public void setInvestInflowBalanceYoy(Double investInflowBalanceYoy){this.investInflowBalanceYoy = investInflowBalanceYoy;}
    public Double getInvestInflowBalanceYoy(){return investInflowBalanceYoy;}

    public void setMinorityInterest(Double minorityInterest){this.minorityInterest = minorityInterest;}
    public Double getMinorityInterest(){return minorityInterest;}

    public void setMinorityInterestYoy(Double minorityInterestYoy){this.minorityInterestYoy = minorityInterestYoy;}
    public Double getMinorityInterestYoy(){return minorityInterestYoy;}

    public void setProvisionPredictLiab(Double provisionPredictLiab){this.provisionPredictLiab = provisionPredictLiab;}
    public Double getProvisionPredictLiab(){return provisionPredictLiab;}

    public void setProvisionPredictLiabYoy(Double provisionPredictLiabYoy){this.provisionPredictLiabYoy = provisionPredictLiabYoy;}
    public Double getProvisionPredictLiabYoy(){return provisionPredictLiabYoy;}

    public void setDepositIofiOther(Double depositIofiOther){this.depositIofiOther = depositIofiOther;}
    public Double getDepositIofiOther(){return depositIofiOther;}

    public void setDepositIofiOtherYoy(Double depositIofiOtherYoy){this.depositIofiOtherYoy = depositIofiOtherYoy;}
    public Double getDepositIofiOtherYoy(){return depositIofiOtherYoy;}

    public void setDebtTransferCapital(Double debtTransferCapital){this.debtTransferCapital = debtTransferCapital;}
    public Double getDebtTransferCapital(){return debtTransferCapital;}

    public void setDebtTransferCapitalYoy(Double debtTransferCapitalYoy){this.debtTransferCapitalYoy = debtTransferCapitalYoy;}
    public Double getDebtTransferCapitalYoy(){return debtTransferCapitalYoy;}

    public void setInvestInflowOther(Double investInflowOther){this.investInflowOther = investInflowOther;}
    public Double getInvestInflowOther(){return investInflowOther;}

    public void setInvestInflowOtherYoy(Double investInflowOtherYoy){this.investInflowOtherYoy = investInflowOtherYoy;}
    public Double getInvestInflowOtherYoy(){return investInflowOtherYoy;}

    public void setBeginCashEquivalents(Double beginCashEquivalents){this.beginCashEquivalents = beginCashEquivalents;}
    public Double getBeginCashEquivalents(){return beginCashEquivalents;}

    public void setBeginCashEquivalentsYoy(Double beginCashEquivalentsYoy){this.beginCashEquivalentsYoy = beginCashEquivalentsYoy;}
    public Double getBeginCashEquivalentsYoy(){return beginCashEquivalentsYoy;}

    public void setTradeFinliabReduce(Double tradeFinliabReduce){this.tradeFinliabReduce = tradeFinliabReduce;}
    public Double getTradeFinliabReduce(){return tradeFinliabReduce;}

    public void setTradeFinliabReduceYoy(Double tradeFinliabReduceYoy){this.tradeFinliabReduceYoy = tradeFinliabReduceYoy;}
    public Double getTradeFinliabReduceYoy(){return tradeFinliabReduceYoy;}

    public void setPayOtherInvest(Double payOtherInvest){this.payOtherInvest = payOtherInvest;}
    public Double getPayOtherInvest(){return payOtherInvest;}

    public void setPayOtherInvestYoy(Double payOtherInvestYoy){this.payOtherInvestYoy = payOtherInvestYoy;}
    public Double getPayOtherInvestYoy(){return payOtherInvestYoy;}

    public void setPayOtherFinanceQoq(Double payOtherFinanceQoq){this.payOtherFinanceQoq = payOtherFinanceQoq;}
    public Double getPayOtherFinanceQoq(){return payOtherFinanceQoq;}

    public void setLoanPbcAddQoq(Double loanPbcAddQoq){this.loanPbcAddQoq = loanPbcAddQoq;}
    public Double getLoanPbcAddQoq(){return loanPbcAddQoq;}

    public void setPbcIofiReduceQoq(Double pbcIofiReduceQoq){this.pbcIofiReduceQoq = pbcIofiReduceQoq;}
    public Double getPbcIofiReduceQoq(){return pbcIofiReduceQoq;}

    public void setFairvalueChangeLossQoq(Double fairvalueChangeLossQoq){this.fairvalueChangeLossQoq = fairvalueChangeLossQoq;}
    public Double getFairvalueChangeLossQoq(){return fairvalueChangeLossQoq;}

    public void setReceiveAddEquityQoq(Double receiveAddEquityQoq){this.receiveAddEquityQoq = receiveAddEquityQoq;}
    public Double getReceiveAddEquityQoq(){return receiveAddEquityQoq;}

    public void setPayBondInterestQoq(Double payBondInterestQoq){this.payBondInterestQoq = payBondInterestQoq;}
    public Double getPayBondInterestQoq(){return payBondInterestQoq;}

    public void setTradeFinliabAddQoq(Double tradeFinliabAddQoq){this.tradeFinliabAddQoq = tradeFinliabAddQoq;}
    public Double getTradeFinliabAddQoq(){return tradeFinliabAddQoq;}

    public void setFinanceInflowBalanceQoq(Double financeInflowBalanceQoq){this.financeInflowBalanceQoq = financeInflowBalanceQoq;}
    public Double getFinanceInflowBalanceQoq(){return financeInflowBalanceQoq;}

    public void setIssueSharesExpenseQoq(Double issueSharesExpenseQoq){this.issueSharesExpenseQoq = issueSharesExpenseQoq;}
    public Double getIssueSharesExpenseQoq(){return issueSharesExpenseQoq;}

    public void setWithdrawWriteoffLoanQoq(Double withdrawWriteoffLoanQoq){this.withdrawWriteoffLoanQoq = withdrawWriteoffLoanQoq;}
    public Double getWithdrawWriteoffLoanQoq(){return withdrawWriteoffLoanQoq;}

    public void setIssueBondQoq(Double issueBondQoq){this.issueBondQoq = issueBondQoq;}
    public Double getIssueBondQoq(){return issueBondQoq;}

    public void setTotalFinanceOutflowQoq(Double totalFinanceOutflowQoq){this.totalFinanceOutflowQoq = totalFinanceOutflowQoq;}
    public Double getTotalFinanceOutflowQoq(){return totalFinanceOutflowQoq;}

    public void setTransferInvestImpairmentQoq(Double transferInvestImpairmentQoq){this.transferInvestImpairmentQoq = transferInvestImpairmentQoq;}
    public Double getTransferInvestImpairmentQoq(){return transferInvestImpairmentQoq;}

    public void setFinanceNetcashOtherQoq(Double financeNetcashOtherQoq){this.financeNetcashOtherQoq = financeNetcashOtherQoq;}
    public Double getFinanceNetcashOtherQoq(){return financeNetcashOtherQoq;}

    public void setEndCashEquivalentsQoq(Double endCashEquivalentsQoq){this.endCashEquivalentsQoq = endCashEquivalentsQoq;}
    public Double getEndCashEquivalentsQoq(){return endCashEquivalentsQoq;}

    public void setDtAssetReduceQoq(Double dtAssetReduceQoq){this.dtAssetReduceQoq = dtAssetReduceQoq;}
    public Double getDtAssetReduceQoq(){return dtAssetReduceQoq;}

    public void setLendAddQoq(Double lendAddQoq){this.lendAddQoq = lendAddQoq;}
    public Double getLendAddQoq(){return lendAddQoq;}

    public void setDisposalLongassetLossQoq(Double disposalLongassetLossQoq){this.disposalLongassetLossQoq = disposalLongassetLossQoq;}
    public Double getDisposalLongassetLossQoq(){return disposalLongassetLossQoq;}

    public void setInvestLossQoq(Double investLossQoq){this.investLossQoq = investLossQoq;}
    public Double getInvestLossQoq(){return investLossQoq;}

    public void setBorrowFundAddQoq(Double borrowFundAddQoq){this.borrowFundAddQoq = borrowFundAddQoq;}
    public Double getBorrowFundAddQoq(){return borrowFundAddQoq;}

    public void setPayOtherOperateQoq(Double payOtherOperateQoq){this.payOtherOperateQoq = payOtherOperateQoq;}
    public Double getPayOtherOperateQoq(){return payOtherOperateQoq;}

    public void setTradeFinassetReduceQoq(Double tradeFinassetReduceQoq){this.tradeFinassetReduceQoq = tradeFinassetReduceQoq;}
    public Double getTradeFinassetReduceQoq(){return tradeFinassetReduceQoq;}

    public void setLendFundAddQoq(Double lendFundAddQoq){this.lendFundAddQoq = lendFundAddQoq;}
    public Double getLendFundAddQoq(){return lendFundAddQoq;}

    public void setInvestOutflowBalanceQoq(Double investOutflowBalanceQoq){this.investOutflowBalanceQoq = investOutflowBalanceQoq;}
    public Double getInvestOutflowBalanceQoq(){return investOutflowBalanceQoq;}

    public void setDepositAddQoq(Double depositAddQoq){this.depositAddQoq = depositAddQoq;}
    public Double getDepositAddQoq(){return depositAddQoq;}

    public void setReceiveOtherFinanceQoq(Double receiveOtherFinanceQoq){this.receiveOtherFinanceQoq = receiveOtherFinanceQoq;}
    public Double getReceiveOtherFinanceQoq(){return receiveOtherFinanceQoq;}

    public void setLpeAmortizeQoq(Double lpeAmortizeQoq){this.lpeAmortizeQoq = lpeAmortizeQoq;}
    public Double getLpeAmortizeQoq(){return lpeAmortizeQoq;}

    public void setFbnetcashOperateQoq(Double fbnetcashOperateQoq){this.fbnetcashOperateQoq = fbnetcashOperateQoq;}
    public Double getFbnetcashOperateQoq(){return fbnetcashOperateQoq;}

    public void setFbcceAddOtherQoq(Double fbcceAddOtherQoq){this.fbcceAddOtherQoq = fbcceAddOtherQoq;}
    public Double getFbcceAddOtherQoq(){return fbcceAddOtherQoq;}

    public void setEndCashQoq(Double endCashQoq){this.endCashQoq = endCashQoq;}
    public Double getEndCashQoq(){return endCashQoq;}

    public void setLendResaleReduceQoq(Double lendResaleReduceQoq){this.lendResaleReduceQoq = lendResaleReduceQoq;}
    public Double getLendResaleReduceQoq(){return lendResaleReduceQoq;}

    public void setFinassetReduceQoq(Double finassetReduceQoq){this.finassetReduceQoq = finassetReduceQoq;}
    public Double getFinassetReduceQoq(){return finassetReduceQoq;}

    public void setOperateOutflowBalanceQoq(Double operateOutflowBalanceQoq){this.operateOutflowBalanceQoq = operateOutflowBalanceQoq;}
    public Double getOperateOutflowBalanceQoq(){return operateOutflowBalanceQoq;}

    public void setRateChangeEffectQoq(Double rateChangeEffectQoq){this.rateChangeEffectQoq = rateChangeEffectQoq;}
    public Double getRateChangeEffectQoq(){return rateChangeEffectQoq;}

    public void setNetcashOperateQoq(Double netcashOperateQoq){this.netcashOperateQoq = netcashOperateQoq;}
    public Double getNetcashOperateQoq(){return netcashOperateQoq;}

    public void setNetCdQoq(Double netCdQoq){this.netCdQoq = netCdQoq;}
    public Double getNetCdQoq(){return netCdQoq;}

    public void setIssuedCdReduceQoq(Double issuedCdReduceQoq){this.issuedCdReduceQoq = issuedCdReduceQoq;}
    public Double getIssuedCdReduceQoq(){return issuedCdReduceQoq;}

    public void setDepositIofiAddQoq(Double depositIofiAddQoq){this.depositIofiAddQoq = depositIofiAddQoq;}
    public Double getDepositIofiAddQoq(){return depositIofiAddQoq;}

    public void setFbcceAddQoq(Double fbcceAddQoq){this.fbcceAddQoq = fbcceAddQoq;}
    public Double getFbcceAddQoq(){return fbcceAddQoq;}

    public void setDisposalLongAssetQoq(Double disposalLongAssetQoq){this.disposalLongAssetQoq = disposalLongAssetQoq;}
    public Double getDisposalLongAssetQoq(){return disposalLongAssetQoq;}

    public void setAssetImpairmentQoq(Double assetImpairmentQoq){this.assetImpairmentQoq = assetImpairmentQoq;}
    public Double getAssetImpairmentQoq(){return assetImpairmentQoq;}

    public void setInvestOutflowOtherQoq(Double investOutflowOtherQoq){this.investOutflowOtherQoq = investOutflowOtherQoq;}
    public Double getInvestOutflowOtherQoq(){return investOutflowOtherQoq;}

    public void setFaIrDeprQoq(Double faIrDeprQoq){this.faIrDeprQoq = faIrDeprQoq;}
    public Double getFaIrDeprQoq(){return faIrDeprQoq;}

    public void setCceAddOtherQoq(Double cceAddOtherQoq){this.cceAddOtherQoq = cceAddOtherQoq;}
    public Double getCceAddOtherQoq(){return cceAddOtherQoq;}

    public void setFinleaseObtainFaQoq(Double finleaseObtainFaQoq){this.finleaseObtainFaQoq = finleaseObtainFaQoq;}
    public Double getFinleaseObtainFaQoq(){return finleaseObtainFaQoq;}

    public void setLendFundReduceQoq(Double lendFundReduceQoq){this.lendFundReduceQoq = lendFundReduceQoq;}
    public Double getLendFundReduceQoq(){return lendFundReduceQoq;}

    public void setReceiveWriteoffQoq(Double receiveWriteoffQoq){this.receiveWriteoffQoq = receiveWriteoffQoq;}
    public Double getReceiveWriteoffQoq(){return receiveWriteoffQoq;}

    public void setFboperateNetcashBalanceQoq(Double fboperateNetcashBalanceQoq){this.fboperateNetcashBalanceQoq = fboperateNetcashBalanceQoq;}
    public Double getFboperateNetcashBalanceQoq(){return fboperateNetcashBalanceQoq;}

    public void setSubsidiaryAcceptInvestQoq(Double subsidiaryAcceptInvestQoq){this.subsidiaryAcceptInvestQoq = subsidiaryAcceptInvestQoq;}
    public Double getSubsidiaryAcceptInvestQoq(){return subsidiaryAcceptInvestQoq;}

    public void setAccountsReceAddQoq(Double accountsReceAddQoq){this.accountsReceAddQoq = accountsReceAddQoq;}
    public Double getAccountsReceAddQoq(){return accountsReceAddQoq;}

    public void setFinliabAddQoq(Double finliabAddQoq){this.finliabAddQoq = finliabAddQoq;}
    public Double getFinliabAddQoq(){return finliabAddQoq;}

    public void setEndCceBalanceQoq(Double endCceBalanceQoq){this.endCceBalanceQoq = endCceBalanceQoq;}
    public Double getEndCceBalanceQoq(){return endCceBalanceQoq;}

    public void setFboperateNetcashOtherQoq(Double fboperateNetcashOtherQoq){this.fboperateNetcashOtherQoq = fboperateNetcashOtherQoq;}
    public Double getFboperateNetcashOtherQoq(){return fboperateNetcashOtherQoq;}

    public void setPayInterestCommissionQoq(Double payInterestCommissionQoq){this.payInterestCommissionQoq = payInterestCommissionQoq;}
    public Double getPayInterestCommissionQoq(){return payInterestCommissionQoq;}

    public void setDepositPbcReduceQoq(Double depositPbcReduceQoq){this.depositPbcReduceQoq = depositPbcReduceQoq;}
    public Double getDepositPbcReduceQoq(){return depositPbcReduceQoq;}

    public void setReceiveInterestCommissionQoq(Double receiveInterestCommissionQoq){this.receiveInterestCommissionQoq = receiveInterestCommissionQoq;}
    public Double getReceiveInterestCommissionQoq(){return receiveInterestCommissionQoq;}

    public void setPayStaffCashQoq(Double payStaffCashQoq){this.payStaffCashQoq = payStaffCashQoq;}
    public Double getPayStaffCashQoq(){return payStaffCashQoq;}

    public void setConstructLongAssetQoq(Double constructLongAssetQoq){this.constructLongAssetQoq = constructLongAssetQoq;}
    public Double getConstructLongAssetQoq(){return constructLongAssetQoq;}

    public void setReceiveCommissionQoq(Double receiveCommissionQoq){this.receiveCommissionQoq = receiveCommissionQoq;}
    public Double getReceiveCommissionQoq(){return receiveCommissionQoq;}

    public void setTotalOperateOutflowQoq(Double totalOperateOutflowQoq){this.totalOperateOutflowQoq = totalOperateOutflowQoq;}
    public Double getTotalOperateOutflowQoq(){return totalOperateOutflowQoq;}

    public void setTotalOperateInflowQoq(Double totalOperateInflowQoq){this.totalOperateInflowQoq = totalOperateInflowQoq;}
    public Double getTotalOperateInflowQoq(){return totalOperateInflowQoq;}

    public void setObtainSubsidiaryOtherQoq(Double obtainSubsidiaryOtherQoq){this.obtainSubsidiaryOtherQoq = obtainSubsidiaryOtherQoq;}
    public Double getObtainSubsidiaryOtherQoq(){return obtainSubsidiaryOtherQoq;}

    public void setDtLiabAddQoq(Double dtLiabAddQoq){this.dtLiabAddQoq = dtLiabAddQoq;}
    public Double getDtLiabAddQoq(){return dtLiabAddQoq;}

    public void setMinorityInterestQoq(Double minorityInterestQoq){this.minorityInterestQoq = minorityInterestQoq;}
    public Double getMinorityInterestQoq(){return minorityInterestQoq;}

    public void setOperateNetcashBalanceQoq(Double operateNetcashBalanceQoq){this.operateNetcashBalanceQoq = operateNetcashBalanceQoq;}
    public Double getOperateNetcashBalanceQoq(){return operateNetcashBalanceQoq;}

    public void setInvestNetcashBalanceQoq(Double investNetcashBalanceQoq){this.investNetcashBalanceQoq = investNetcashBalanceQoq;}
    public Double getInvestNetcashBalanceQoq(){return investNetcashBalanceQoq;}

    public void setFinanceOutflowBalanceQoq(Double financeOutflowBalanceQoq){this.financeOutflowBalanceQoq = financeOutflowBalanceQoq;}
    public Double getFinanceOutflowBalanceQoq(){return financeOutflowBalanceQoq;}

    public void setInvestPayCashQoq(Double investPayCashQoq){this.investPayCashQoq = investPayCashQoq;}
    public Double getInvestPayCashQoq(){return investPayCashQoq;}

    public void setDebtTransferCapitalQoq(Double debtTransferCapitalQoq){this.debtTransferCapitalQoq = debtTransferCapitalQoq;}
    public Double getDebtTransferCapitalQoq(){return debtTransferCapitalQoq;}

    public void setAssignDividendPorfitQoq(Double assignDividendPorfitQoq){this.assignDividendPorfitQoq = assignDividendPorfitQoq;}
    public Double getAssignDividendPorfitQoq(){return assignDividendPorfitQoq;}

    public void setConvertBond1yearQoq(Double convertBond1yearQoq){this.convertBond1yearQoq = convertBond1yearQoq;}
    public Double getConvertBond1yearQoq(){return convertBond1yearQoq;}

    public void setEndCceOtherQoq(Double endCceOtherQoq){this.endCceOtherQoq = endCceOtherQoq;}
    public Double getEndCceOtherQoq(){return endCceOtherQoq;}

    public void setOperateInflowOtherQoq(Double operateInflowOtherQoq){this.operateInflowOtherQoq = operateInflowOtherQoq;}
    public Double getOperateInflowOtherQoq(){return operateInflowOtherQoq;}

    public void setReceiveOtherInvestQoq(Double receiveOtherInvestQoq){this.receiveOtherInvestQoq = receiveOtherInvestQoq;}
    public Double getReceiveOtherInvestQoq(){return receiveOtherInvestQoq;}

    public void setDepositIofiOtherQoq(Double depositIofiOtherQoq){this.depositIofiOtherQoq = depositIofiOtherQoq;}
    public Double getDepositIofiOtherQoq(){return depositIofiOtherQoq;}

    public void setReceiveDividendProfitQoq(Double receiveDividendProfitQoq){this.receiveDividendProfitQoq = receiveDividendProfitQoq;}
    public Double getReceiveDividendProfitQoq(){return receiveDividendProfitQoq;}

    public void setTotalInvestOutflowQoq(Double totalInvestOutflowQoq){this.totalInvestOutflowQoq = totalInvestOutflowQoq;}
    public Double getTotalInvestOutflowQoq(){return totalInvestOutflowQoq;}

    public void setBuyResaleReduceQoq(Double buyResaleReduceQoq){this.buyResaleReduceQoq = buyResaleReduceQoq;}
    public Double getBuyResaleReduceQoq(){return buyResaleReduceQoq;}

    public void setProvisionPredictLiabQoq(Double provisionPredictLiabQoq){this.provisionPredictLiabQoq = provisionPredictLiabQoq;}
    public Double getProvisionPredictLiabQoq(){return provisionPredictLiabQoq;}

    public void setBuyResaleAddQoq(Double buyResaleAddQoq){this.buyResaleAddQoq = buyResaleAddQoq;}
    public Double getBuyResaleAddQoq(){return buyResaleAddQoq;}

    public void setDisposalSubsidiaryJointQoq(Double disposalSubsidiaryJointQoq){this.disposalSubsidiaryJointQoq = disposalSubsidiaryJointQoq;}
    public Double getDisposalSubsidiaryJointQoq(){return disposalSubsidiaryJointQoq;}

    public void setIofiAddQoq(Double iofiAddQoq){this.iofiAddQoq = iofiAddQoq;}
    public Double getIofiAddQoq(){return iofiAddQoq;}

    public void setDisposalMortgageAssetQoq(Double disposalMortgageAssetQoq){this.disposalMortgageAssetQoq = disposalMortgageAssetQoq;}
    public Double getDisposalMortgageAssetQoq(){return disposalMortgageAssetQoq;}

    public void setPayDebtCashQoq(Double payDebtCashQoq){this.payDebtCashQoq = payDebtCashQoq;}
    public Double getPayDebtCashQoq(){return payDebtCashQoq;}

    public void setFinanceOutflowOtherQoq(Double financeOutflowOtherQoq){this.financeOutflowOtherQoq = financeOutflowOtherQoq;}
    public Double getFinanceOutflowOtherQoq(){return financeOutflowOtherQoq;}

    public void setInventoryReduceQoq(Double inventoryReduceQoq){this.inventoryReduceQoq = inventoryReduceQoq;}
    public Double getInventoryReduceQoq(){return inventoryReduceQoq;}

    public void setSellRepoAddQoq(Double sellRepoAddQoq){this.sellRepoAddQoq = sellRepoAddQoq;}
    public Double getSellRepoAddQoq(){return sellRepoAddQoq;}

    public void setBondInterestExpenseQoq(Double bondInterestExpenseQoq){this.bondInterestExpenseQoq = bondInterestExpenseQoq;}
    public Double getBondInterestExpenseQoq(){return bondInterestExpenseQoq;}

    public void setIaLpeAmortizeQoq(Double iaLpeAmortizeQoq){this.iaLpeAmortizeQoq = iaLpeAmortizeQoq;}
    public Double getIaLpeAmortizeQoq(){return iaLpeAmortizeQoq;}

    public void setReceiveInterestQoq(Double receiveInterestQoq){this.receiveInterestQoq = receiveInterestQoq;}
    public Double getReceiveInterestQoq(){return receiveInterestQoq;}

    public void setOperateReceReduceQoq(Double operateReceReduceQoq){this.operateReceReduceQoq = operateReceReduceQoq;}
    public Double getOperateReceReduceQoq(){return operateReceReduceQoq;}

    public void setInvestInflowBalanceQoq(Double investInflowBalanceQoq){this.investInflowBalanceQoq = investInflowBalanceQoq;}
    public Double getInvestInflowBalanceQoq(){return investInflowBalanceQoq;}

    public void setInvestInflowOtherQoq(Double investInflowOtherQoq){this.investInflowOtherQoq = investInflowOtherQoq;}
    public Double getInvestInflowOtherQoq(){return investInflowOtherQoq;}

    public void setIssueOtherBondQoq(Double issueOtherBondQoq){this.issueOtherBondQoq = issueOtherBondQoq;}
    public Double getIssueOtherBondQoq(){return issueOtherBondQoq;}

    public void setPayOtherInvestQoq(Double payOtherInvestQoq){this.payOtherInvestQoq = payOtherInvestQoq;}
    public Double getPayOtherInvestQoq(){return payOtherInvestQoq;}

    public void setTradeFinliabReduceQoq(Double tradeFinliabReduceQoq){this.tradeFinliabReduceQoq = tradeFinliabReduceQoq;}
    public Double getTradeFinliabReduceQoq(){return tradeFinliabReduceQoq;}

    public void setPayAllTaxQoq(Double payAllTaxQoq){this.payAllTaxQoq = payAllTaxQoq;}
    public Double getPayAllTaxQoq(){return payAllTaxQoq;}

    public void setDepositIofiReduceQoq(Double depositIofiReduceQoq){this.depositIofiReduceQoq = depositIofiReduceQoq;}
    public Double getDepositIofiReduceQoq(){return depositIofiReduceQoq;}

    public void setBeginCashEquivalentsQoq(Double beginCashEquivalentsQoq){this.beginCashEquivalentsQoq = beginCashEquivalentsQoq;}
    public Double getBeginCashEquivalentsQoq(){return beginCashEquivalentsQoq;}

    public void setOperateNetcashOtherQoq(Double operateNetcashOtherQoq){this.operateNetcashOtherQoq = operateNetcashOtherQoq;}
    public Double getOperateNetcashOtherQoq(){return operateNetcashOtherQoq;}

    public void setSellRepoReduceQoq(Double sellRepoReduceQoq){this.sellRepoReduceQoq = sellRepoReduceQoq;}
    public Double getSellRepoReduceQoq(){return sellRepoReduceQoq;}

    public void setBeginCceQoq(Double beginCceQoq){this.beginCceQoq = beginCceQoq;}
    public Double getBeginCceQoq(){return beginCceQoq;}

    public void setFinanceInflowOtherQoq(Double financeInflowOtherQoq){this.financeInflowOtherQoq = financeInflowOtherQoq;}
    public Double getFinanceInflowOtherQoq(){return financeInflowOtherQoq;}

    public void setDepositPbcAddQoq(Double depositPbcAddQoq){this.depositPbcAddQoq = depositPbcAddQoq;}
    public Double getDepositPbcAddQoq(){return depositPbcAddQoq;}

    public void setOtherQoq(Double otherQoq){this.otherQoq = otherQoq;}
    public Double getOtherQoq(){return otherQoq;}

    public void setOperatePayableAddQoq(Double operatePayableAddQoq){this.operatePayableAddQoq = operatePayableAddQoq;}
    public Double getOperatePayableAddQoq(){return operatePayableAddQoq;}

    public void setEndCceQoq(Double endCceQoq){this.endCceQoq = endCceQoq;}
    public Double getEndCceQoq(){return endCceQoq;}

    public void setReceiveOtherOperateQoq(Double receiveOtherOperateQoq){this.receiveOtherOperateQoq = receiveOtherOperateQoq;}
    public Double getReceiveOtherOperateQoq(){return receiveOtherOperateQoq;}

    public void setBeginCashQoq(Double beginCashQoq){this.beginCashQoq = beginCashQoq;}
    public Double getBeginCashQoq(){return beginCashQoq;}

    public void setPayInterestQoq(Double payInterestQoq){this.payInterestQoq = payInterestQoq;}
    public Double getPayInterestQoq(){return payInterestQoq;}

    public void setAcceptInvestCashQoq(Double acceptInvestCashQoq){this.acceptInvestCashQoq = acceptInvestCashQoq;}
    public Double getAcceptInvestCashQoq(){return acceptInvestCashQoq;}

    public void setBorrowRepoAddQoq(Double borrowRepoAddQoq){this.borrowRepoAddQoq = borrowRepoAddQoq;}
    public Double getBorrowRepoAddQoq(){return borrowRepoAddQoq;}

    public void setNetcashFinanceQoq(Double netcashFinanceQoq){this.netcashFinanceQoq = netcashFinanceQoq;}
    public Double getNetcashFinanceQoq(){return netcashFinanceQoq;}

    public void setBorrowFundReduceQoq(Double borrowFundReduceQoq){this.borrowFundReduceQoq = borrowFundReduceQoq;}
    public Double getBorrowFundReduceQoq(){return borrowFundReduceQoq;}

    public void setIssueSubbondQoq(Double issueSubbondQoq){this.issueSubbondQoq = issueSubbondQoq;}
    public Double getIssueSubbondQoq(){return issueSubbondQoq;}

    public void setFaScrapLossQoq(Double faScrapLossQoq){this.faScrapLossQoq = faScrapLossQoq;}
    public Double getFaScrapLossQoq(){return faScrapLossQoq;}

    public void setOperateOutflowOtherQoq(Double operateOutflowOtherQoq){this.operateOutflowOtherQoq = operateOutflowOtherQoq;}
    public Double getOperateOutflowOtherQoq(){return operateOutflowOtherQoq;}

    public void setCceAddBalanceQoq(Double cceAddBalanceQoq){this.cceAddBalanceQoq = cceAddBalanceQoq;}
    public Double getCceAddBalanceQoq(){return cceAddBalanceQoq;}

    public void setExchangeLossQoq(Double exchangeLossQoq){this.exchangeLossQoq = exchangeLossQoq;}
    public Double getExchangeLossQoq(){return exchangeLossQoq;}

    public void setOperateInflowBalanceQoq(Double operateInflowBalanceQoq){this.operateInflowBalanceQoq = operateInflowBalanceQoq;}
    public Double getOperateInflowBalanceQoq(){return operateInflowBalanceQoq;}

    public void setTradeFinassetAddQoq(Double tradeFinassetAddQoq){this.tradeFinassetAddQoq = tradeFinassetAddQoq;}
    public Double getTradeFinassetAddQoq(){return tradeFinassetAddQoq;}

    public void setLoanAdvanceAddQoq(Double loanAdvanceAddQoq){this.loanAdvanceAddQoq = loanAdvanceAddQoq;}
    public Double getLoanAdvanceAddQoq(){return loanAdvanceAddQoq;}

    public void setProvisionLoanImpairmentQoq(Double provisionLoanImpairmentQoq){this.provisionLoanImpairmentQoq = provisionLoanImpairmentQoq;}
    public Double getProvisionLoanImpairmentQoq(){return provisionLoanImpairmentQoq;}

    public void setLoanPbcReduceQoq(Double loanPbcReduceQoq){this.loanPbcReduceQoq = loanPbcReduceQoq;}
    public Double getLoanPbcReduceQoq(){return loanPbcReduceQoq;}

    public void setCceAddQoq(Double cceAddQoq){this.cceAddQoq = cceAddQoq;}
    public Double getCceAddQoq(){return cceAddQoq;}

    public void setDeferTaxQoq(Double deferTaxQoq){this.deferTaxQoq = deferTaxQoq;}
    public Double getDeferTaxQoq(){return deferTaxQoq;}

    public void setPayCommissionQoq(Double payCommissionQoq){this.payCommissionQoq = payCommissionQoq;}
    public Double getPayCommissionQoq(){return payCommissionQoq;}

    public void setFbcceAddBalanceQoq(Double fbcceAddBalanceQoq){this.fbcceAddBalanceQoq = fbcceAddBalanceQoq;}
    public Double getFbcceAddBalanceQoq(){return fbcceAddBalanceQoq;}

    public void setTotalInvestInflowQoq(Double totalInvestInflowQoq){this.totalInvestInflowQoq = totalInvestInflowQoq;}
    public Double getTotalInvestInflowQoq(){return totalInvestInflowQoq;}

    public void setCustomerDepositAddQoq(Double customerDepositAddQoq){this.customerDepositAddQoq = customerDepositAddQoq;}
    public Double getCustomerDepositAddQoq(){return customerDepositAddQoq;}

    public void setPbcIofiAddQoq(Double pbcIofiAddQoq){this.pbcIofiAddQoq = pbcIofiAddQoq;}
    public Double getPbcIofiAddQoq(){return pbcIofiAddQoq;}

    public void setLongassetAmortizeQoq(Double longassetAmortizeQoq){this.longassetAmortizeQoq = longassetAmortizeQoq;}
    public Double getLongassetAmortizeQoq(){return longassetAmortizeQoq;}

    public void setFinanceNetcashBalanceQoq(Double financeNetcashBalanceQoq){this.financeNetcashBalanceQoq = financeNetcashBalanceQoq;}
    public Double getFinanceNetcashBalanceQoq(){return financeNetcashBalanceQoq;}

    public void setIssueCdQoq(Double issueCdQoq){this.issueCdQoq = issueCdQoq;}
    public Double getIssueCdQoq(){return issueCdQoq;}

    public void setWithdrawInvestQoq(Double withdrawInvestQoq){this.withdrawInvestQoq = withdrawInvestQoq;}
    public Double getWithdrawInvestQoq(){return withdrawInvestQoq;}

    public void setInvestNetcashOtherQoq(Double investNetcashOtherQoq){this.investNetcashOtherQoq = investNetcashOtherQoq;}
    public Double getInvestNetcashOtherQoq(){return investNetcashOtherQoq;}

    public void setOtherAssetImpairmentQoq(Double otherAssetImpairmentQoq){this.otherAssetImpairmentQoq = otherAssetImpairmentQoq;}
    public Double getOtherAssetImpairmentQoq(){return otherAssetImpairmentQoq;}

    public void setNetcashInvestQoq(Double netcashInvestQoq){this.netcashInvestQoq = netcashInvestQoq;}
    public Double getNetcashInvestQoq(){return netcashInvestQoq;}

    public void setBorrowRepoReduceQoq(Double borrowRepoReduceQoq){this.borrowRepoReduceQoq = borrowRepoReduceQoq;}
    public Double getBorrowRepoReduceQoq(){return borrowRepoReduceQoq;}

    public void setProvisionInvestImpairmentQoq(Double provisionInvestImpairmentQoq){this.provisionInvestImpairmentQoq = provisionInvestImpairmentQoq;}
    public Double getProvisionInvestImpairmentQoq(){return provisionInvestImpairmentQoq;}

    public void setLoanReduceQoq(Double loanReduceQoq){this.loanReduceQoq = loanReduceQoq;}
    public Double getLoanReduceQoq(){return loanReduceQoq;}

    public void setInterbankOtherReduceQoq(Double interbankOtherReduceQoq){this.interbankOtherReduceQoq = interbankOtherReduceQoq;}
    public Double getInterbankOtherReduceQoq(){return interbankOtherReduceQoq;}

    public void setNetprofitQoq(Double netprofitQoq){this.netprofitQoq = netprofitQoq;}
    public Double getNetprofitQoq(){return netprofitQoq;}

    public void setUninvolveInvestfinOtherQoq(Double uninvolveInvestfinOtherQoq){this.uninvolveInvestfinOtherQoq = uninvolveInvestfinOtherQoq;}
    public Double getUninvolveInvestfinOtherQoq(){return uninvolveInvestfinOtherQoq;}

    public void setTotalFinanceInflowQoq(Double totalFinanceInflowQoq){this.totalFinanceInflowQoq = totalFinanceInflowQoq;}
    public Double getTotalFinanceInflowQoq(){return totalFinanceInflowQoq;}

    public void setBuyFinLeaseQoq(Double buyFinLeaseQoq){this.buyFinLeaseQoq = buyFinLeaseQoq;}
    public Double getBuyFinLeaseQoq(){return buyFinLeaseQoq;}

    public void setLendResaleAddQoq(Double lendResaleAddQoq){this.lendResaleAddQoq = lendResaleAddQoq;}
    public Double getLendResaleAddQoq(){return lendResaleAddQoq;}

    public void setFixedAssetDeprQoq(Double fixedAssetDeprQoq){this.fixedAssetDeprQoq = fixedAssetDeprQoq;}
    public Double getFixedAssetDeprQoq(){return fixedAssetDeprQoq;}

    public void setReceiveInvestIncomeQoq(Double receiveInvestIncomeQoq){this.receiveInvestIncomeQoq = receiveInvestIncomeQoq;}
    public Double getReceiveInvestIncomeQoq(){return receiveInvestIncomeQoq;}

    public void setIaAmortizeQoq(Double iaAmortizeQoq){this.iaAmortizeQoq = iaAmortizeQoq;}
    public Double getIaAmortizeQoq(){return iaAmortizeQoq;}

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
        return Objects.equals(securityCode, that.securityCode) && Objects.equals(reportType, that.reportType) && Objects.equals(reportDate, that.reportDate) && Objects.equals(opinionType, that.opinionType) && Objects.equals(osopinionType, that.osopinionType) && Objects.equals(beginCash, that.beginCash) && Objects.equals(beginCashYoy, that.beginCashYoy) && Objects.equals(borrowFundReduce, that.borrowFundReduce) && Objects.equals(borrowFundReduceYoy, that.borrowFundReduceYoy) && Objects.equals(operateInflowBalance, that.operateInflowBalance) && Objects.equals(operateInflowBalanceYoy, that.operateInflowBalanceYoy) && Objects.equals(faScrapLoss, that.faScrapLoss) && Objects.equals(faScrapLossYoy, that.faScrapLossYoy) && Objects.equals(operateOutflowOther, that.operateOutflowOther) && Objects.equals(operateOutflowOtherYoy, that.operateOutflowOtherYoy) && Objects.equals(fairvalueChangeLoss, that.fairvalueChangeLoss) && Objects.equals(fairvalueChangeLossYoy, that.fairvalueChangeLossYoy) && Objects.equals(operateInflowOther, that.operateInflowOther) && Objects.equals(operateInflowOtherYoy, that.operateInflowOtherYoy) && Objects.equals(netcashFinance, that.netcashFinance) && Objects.equals(netcashFinanceYoy, that.netcashFinanceYoy) && Objects.equals(depositPbcAdd, that.depositPbcAdd) && Objects.equals(depositPbcAddYoy, that.depositPbcAddYoy) && Objects.equals(investNetcashOther, that.investNetcashOther) && Objects.equals(investNetcashOtherYoy, that.investNetcashOtherYoy) && Objects.equals(receiveOtherOperate, that.receiveOtherOperate) && Objects.equals(receiveOtherOperateYoy, that.receiveOtherOperateYoy) && Objects.equals(payInterest, that.payInterest) && Objects.equals(payInterestYoy, that.payInterestYoy) && Objects.equals(issueSubbond, that.issueSubbond) && Objects.equals(issueSubbondYoy, that.issueSubbondYoy) && Objects.equals(investPayCash, that.investPayCash) && Objects.equals(investPayCashYoy, that.investPayCashYoy) && Objects.equals(receiveAddEquity, that.receiveAddEquity) && Objects.equals(receiveAddEquityYoy, that.receiveAddEquityYoy) && Objects.equals(lendFundAdd, that.lendFundAdd) && Objects.equals(lendFundAddYoy, that.lendFundAddYoy) && Objects.equals(borrowRepoAdd, that.borrowRepoAdd) && Objects.equals(borrowRepoAddYoy, that.borrowRepoAddYoy) && Objects.equals(financeNetcashOther, that.financeNetcashOther) && Objects.equals(financeNetcashOtherYoy, that.financeNetcashOtherYoy) && Objects.equals(loanReduce, that.loanReduce) && Objects.equals(loanReduceYoy, that.loanReduceYoy) && Objects.equals(loanPbcAdd, that.loanPbcAdd) && Objects.equals(loanPbcAddYoy, that.loanPbcAddYoy) && Objects.equals(otherAssetImpairment, that.otherAssetImpairment) && Objects.equals(otherAssetImpairmentYoy, that.otherAssetImpairmentYoy) && Objects.equals(receiveWriteoff, that.receiveWriteoff) && Objects.equals(receiveWriteoffYoy, that.receiveWriteoffYoy) && Objects.equals(rateChangeEffect, that.rateChangeEffect) && Objects.equals(rateChangeEffectYoy, that.rateChangeEffectYoy) && Objects.equals(fbcceAddOther, that.fbcceAddOther) && Objects.equals(fbcceAddOtherYoy, that.fbcceAddOtherYoy) && Objects.equals(dtAssetReduce, that.dtAssetReduce) && Objects.equals(dtAssetReduceYoy, that.dtAssetReduceYoy) && Objects.equals(acceptInvestCash, that.acceptInvestCash) && Objects.equals(acceptInvestCashYoy, that.acceptInvestCashYoy) && Objects.equals(endCceOther, that.endCceOther) && Objects.equals(endCceOtherYoy, that.endCceOtherYoy) && Objects.equals(financeInflowBalance, that.financeInflowBalance) && Objects.equals(financeInflowBalanceYoy, that.financeInflowBalanceYoy) && Objects.equals(endCce, that.endCce) && Objects.equals(endCceYoy, that.endCceYoy) && Objects.equals(totalFinanceInflow, that.totalFinanceInflow) && Objects.equals(totalFinanceInflowYoy, that.totalFinanceInflowYoy) && Objects.equals(cceAddOther, that.cceAddOther) && Objects.equals(cceAddOtherYoy, that.cceAddOtherYoy) && Objects.equals(cceAddBalance, that.cceAddBalance) && Objects.equals(cceAddBalanceYoy, that.cceAddBalanceYoy) && Objects.equals(exchangeLoss, that.exchangeLoss) && Objects.equals(exchangeLossYoy, that.exchangeLossYoy) && Objects.equals(loanAdvanceAdd, that.loanAdvanceAdd) && Objects.equals(loanAdvanceAddYoy, that.loanAdvanceAddYoy) && Objects.equals(investLoss, that.investLoss) && Objects.equals(investLossYoy, that.investLossYoy) && Objects.equals(fbcceAddBalance, that.fbcceAddBalance) && Objects.equals(fbcceAddBalanceYoy, that.fbcceAddBalanceYoy) && Objects.equals(cceAdd, that.cceAdd) && Objects.equals(cceAddYoy, that.cceAddYoy) && Objects.equals(receiveCommission, that.receiveCommission) && Objects.equals(receiveCommissionYoy, that.receiveCommissionYoy) && Objects.equals(dtLiabAdd, that.dtLiabAdd) && Objects.equals(dtLiabAddYoy, that.dtLiabAddYoy) && Objects.equals(deferTax, that.deferTax) && Objects.equals(deferTaxYoy, that.deferTaxYoy) && Objects.equals(investOutflowBalance, that.investOutflowBalance) && Objects.equals(investOutflowBalanceYoy, that.investOutflowBalanceYoy) && Objects.equals(depositIofiReduce, that.depositIofiReduce) && Objects.equals(depositIofiReduceYoy, that.depositIofiReduceYoy) && Objects.equals(fixedAssetDepr, that.fixedAssetDepr) && Objects.equals(fixedAssetDeprYoy, that.fixedAssetDeprYoy) && Objects.equals(finleaseObtainFa, that.finleaseObtainFa) && Objects.equals(finleaseObtainFaYoy, that.finleaseObtainFaYoy) && Objects.equals(tradeFinassetAdd, that.tradeFinassetAdd) && Objects.equals(tradeFinassetAddYoy, that.tradeFinassetAddYoy) && Objects.equals(pbcIofiAdd, that.pbcIofiAdd) && Objects.equals(pbcIofiAddYoy, that.pbcIofiAddYoy) && Objects.equals(longassetAmortize, that.longassetAmortize) && Objects.equals(longassetAmortizeYoy, that.longassetAmortizeYoy) && Objects.equals(totalInvestInflow, that.totalInvestInflow) && Objects.equals(totalInvestInflowYoy, that.totalInvestInflowYoy) && Objects.equals(financeNetcashBalance, that.financeNetcashBalance) && Objects.equals(financeNetcashBalanceYoy, that.financeNetcashBalanceYoy) && Objects.equals(loanPbcReduce, that.loanPbcReduce) && Objects.equals(loanPbcReduceYoy, that.loanPbcReduceYoy) && Objects.equals(payCommission, that.payCommission) && Objects.equals(payCommissionYoy, that.payCommissionYoy) && Objects.equals(receiveOtherInvest, that.receiveOtherInvest) && Objects.equals(receiveOtherInvestYoy, that.receiveOtherInvestYoy) && Objects.equals(lendAdd, that.lendAdd) && Objects.equals(lendAddYoy, that.lendAddYoy) && Objects.equals(faIrDepr, that.faIrDepr) && Objects.equals(faIrDeprYoy, that.faIrDeprYoy) && Objects.equals(provisionLoanImpairment, that.provisionLoanImpairment) && Objects.equals(provisionLoanImpairmentYoy, that.provisionLoanImpairmentYoy) && Objects.equals(operateOutflowBalance, that.operateOutflowBalance) && Objects.equals(operateOutflowBalanceYoy, that.operateOutflowBalanceYoy) && Objects.equals(lendResaleAdd, that.lendResaleAdd) && Objects.equals(lendResaleAddYoy, that.lendResaleAddYoy) && Objects.equals(buyResaleReduce, that.buyResaleReduce) && Objects.equals(buyResaleReduceYoy, that.buyResaleReduceYoy) && Objects.equals(customerDepositAdd, that.customerDepositAdd) && Objects.equals(customerDepositAddYoy, that.customerDepositAddYoy) && Objects.equals(issueCd, that.issueCd) && Objects.equals(issueCdYoy, that.issueCdYoy) && Objects.equals(finassetReduce, that.finassetReduce) && Objects.equals(finassetReduceYoy, that.finassetReduceYoy) && Objects.equals(payInterestCommission, that.payInterestCommission) && Objects.equals(payInterestCommissionYoy, that.payInterestCommissionYoy) && Objects.equals(payOtherFinance, that.payOtherFinance) && Objects.equals(payOtherFinanceYoy, that.payOtherFinanceYoy) && Objects.equals(receiveDividendProfit, that.receiveDividendProfit) && Objects.equals(receiveDividendProfitYoy, that.receiveDividendProfitYoy) && Objects.equals(financeOutflowOther, that.financeOutflowOther) && Objects.equals(financeOutflowOtherYoy, that.financeOutflowOtherYoy) && Objects.equals(obtainSubsidiaryOther, that.obtainSubsidiaryOther) && Objects.equals(obtainSubsidiaryOtherYoy, that.obtainSubsidiaryOtherYoy) && Objects.equals(withdrawInvest, that.withdrawInvest) && Objects.equals(withdrawInvestYoy, that.withdrawInvestYoy) && Objects.equals(payStaffCash, that.payStaffCash) && Objects.equals(payStaffCashYoy, that.payStaffCashYoy) && Objects.equals(iaAmortize, that.iaAmortize) && Objects.equals(iaAmortizeYoy, that.iaAmortizeYoy) && Objects.equals(beginCce, that.beginCce) && Objects.equals(beginCceYoy, that.beginCceYoy) && Objects.equals(depositPbcReduce, that.depositPbcReduce) && Objects.equals(depositPbcReduceYoy, that.depositPbcReduceYoy) && Objects.equals(sellRepoReduce, that.sellRepoReduce) && Objects.equals(sellRepoReduceYoy, that.sellRepoReduceYoy) && Objects.equals(uninvolveInvestfinOther, that.uninvolveInvestfinOther) && Objects.equals(uninvolveInvestfinOtherYoy, that.uninvolveInvestfinOtherYoy) && Objects.equals(netcashInvest, that.netcashInvest) && Objects.equals(netcashInvestYoy, that.netcashInvestYoy) && Objects.equals(provisionInvestImpairment, that.provisionInvestImpairment) && Objects.equals(provisionInvestImpairmentYoy, that.provisionInvestImpairmentYoy) && Objects.equals(netprofit, that.netprofit) && Objects.equals(netprofitYoy, that.netprofitYoy) && Objects.equals(pbcIofiReduce, that.pbcIofiReduce) && Objects.equals(pbcIofiReduceYoy, that.pbcIofiReduceYoy) && Objects.equals(fbnetcashOperate, that.fbnetcashOperate) && Objects.equals(fbnetcashOperateYoy, that.fbnetcashOperateYoy) && Objects.equals(buyResaleAdd, that.buyResaleAdd) && Objects.equals(buyResaleAddYoy, that.buyResaleAddYoy) && Objects.equals(issueOtherBond, that.issueOtherBond) && Objects.equals(issueOtherBondYoy, that.issueOtherBondYoy) && Objects.equals(interbankOtherReduce, that.interbankOtherReduce) && Objects.equals(interbankOtherReduceYoy, that.interbankOtherReduceYoy) && Objects.equals(buyFinLease, that.buyFinLease) && Objects.equals(buyFinLeaseYoy, that.buyFinLeaseYoy) && Objects.equals(endCashEquivalents, that.endCashEquivalents) && Objects.equals(endCashEquivalentsYoy, that.endCashEquivalentsYoy) && Objects.equals(lpeAmortize, that.lpeAmortize) && Objects.equals(lpeAmortizeYoy, that.lpeAmortizeYoy) && Objects.equals(receiveInvestIncome, that.receiveInvestIncome) && Objects.equals(receiveInvestIncomeYoy, that.receiveInvestIncomeYoy) && Objects.equals(issuedCdReduce, that.issuedCdReduce) && Objects.equals(issuedCdReduceYoy, that.issuedCdReduceYoy) && Objects.equals(borrowRepoReduce, that.borrowRepoReduce) && Objects.equals(borrowRepoReduceYoy, that.borrowRepoReduceYoy) && Objects.equals(payBondInterest, that.payBondInterest) && Objects.equals(payBondInterestYoy, that.payBondInterestYoy) && Objects.equals(tradeFinliabAdd, that.tradeFinliabAdd) && Objects.equals(tradeFinliabAddYoy, that.tradeFinliabAddYoy) && Objects.equals(totalOperateOutflow, that.totalOperateOutflow) && Objects.equals(totalOperateOutflowYoy, that.totalOperateOutflowYoy) && Objects.equals(depositIofiAdd, that.depositIofiAdd) && Objects.equals(depositIofiAddYoy, that.depositIofiAddYoy) && Objects.equals(withdrawWriteoffLoan, that.withdrawWriteoffLoan) && Objects.equals(withdrawWriteoffLoanYoy, that.withdrawWriteoffLoanYoy) && Objects.equals(bondInterestExpense, that.bondInterestExpense) && Objects.equals(bondInterestExpenseYoy, that.bondInterestExpenseYoy) && Objects.equals(fboperateNetcashBalance, that.fboperateNetcashBalance) && Objects.equals(fboperateNetcashBalanceYoy, that.fboperateNetcashBalanceYoy) && Objects.equals(issueSharesExpense, that.issueSharesExpense) && Objects.equals(issueSharesExpenseYoy, that.issueSharesExpenseYoy) && Objects.equals(fbcceAdd, that.fbcceAdd) && Objects.equals(fbcceAddYoy, that.fbcceAddYoy) && Objects.equals(payDebtCash, that.payDebtCash) && Objects.equals(payDebtCashYoy, that.payDebtCashYoy) && Objects.equals(disposalMortgageAsset, that.disposalMortgageAsset) && Objects.equals(disposalMortgageAssetYoy, that.disposalMortgageAssetYoy) && Objects.equals(issueBond, that.issueBond) && Objects.equals(issueBondYoy, that.issueBondYoy) && Objects.equals(operatePayableAdd, that.operatePayableAdd) && Objects.equals(operatePayableAddYoy, that.operatePayableAddYoy) && Objects.equals(operateReceReduce, that.operateReceReduce) && Objects.equals(operateReceReduceYoy, that.operateReceReduceYoy) && Objects.equals(transferInvestImpairment, that.transferInvestImpairment) && Objects.equals(transferInvestImpairmentYoy, that.transferInvestImpairmentYoy) && Objects.equals(payAllTax, that.payAllTax) && Objects.equals(payAllTaxYoy, that.payAllTaxYoy) && Objects.equals(investNetcashBalance, that.investNetcashBalance) && Objects.equals(investNetcashBalanceYoy, that.investNetcashBalanceYoy) && Objects.equals(receiveInterestCommission, that.receiveInterestCommission) && Objects.equals(receiveInterestCommissionYoy, that.receiveInterestCommissionYoy) && Objects.equals(fboperateNetcashOther, that.fboperateNetcashOther) && Objects.equals(fboperateNetcashOtherYoy, that.fboperateNetcashOtherYoy) && Objects.equals(borrowFundAdd, that.borrowFundAdd) && Objects.equals(borrowFundAddYoy, that.borrowFundAddYoy) && Objects.equals(assetImpairment, that.assetImpairment) && Objects.equals(assetImpairmentYoy, that.assetImpairmentYoy) && Objects.equals(assignDividendPorfit, that.assignDividendPorfit) && Objects.equals(assignDividendPorfitYoy, that.assignDividendPorfitYoy) && Objects.equals(totalFinanceOutflow, that.totalFinanceOutflow) && Objects.equals(totalFinanceOutflowYoy, that.totalFinanceOutflowYoy) && Objects.equals(disposalSubsidiaryJoint, that.disposalSubsidiaryJoint) && Objects.equals(disposalSubsidiaryJointYoy, that.disposalSubsidiaryJointYoy) && Objects.equals(receiveOtherFinance, that.receiveOtherFinance) && Objects.equals(receiveOtherFinanceYoy, that.receiveOtherFinanceYoy) && Objects.equals(payOtherOperate, that.payOtherOperate) && Objects.equals(payOtherOperateYoy, that.payOtherOperateYoy) && Objects.equals(tradeFinassetReduce, that.tradeFinassetReduce) && Objects.equals(tradeFinassetReduceYoy, that.tradeFinassetReduceYoy) && Objects.equals(lendResaleReduce, that.lendResaleReduce) && Objects.equals(lendResaleReduceYoy, that.lendResaleReduceYoy) && Objects.equals(netCd, that.netCd) && Objects.equals(netCdYoy, that.netCdYoy) && Objects.equals(iofiAdd, that.iofiAdd) && Objects.equals(iofiAddYoy, that.iofiAddYoy) && Objects.equals(inventoryReduce, that.inventoryReduce) && Objects.equals(inventoryReduceYoy, that.inventoryReduceYoy) && Objects.equals(disposalLongassetLoss, that.disposalLongassetLoss) && Objects.equals(disposalLongassetLossYoy, that.disposalLongassetLossYoy) && Objects.equals(endCash, that.endCash) && Objects.equals(endCashYoy, that.endCashYoy) && Objects.equals(other, that.other) && Objects.equals(otherYoy, that.otherYoy) && Objects.equals(netcashOperate, that.netcashOperate) && Objects.equals(netcashOperateYoy, that.netcashOperateYoy) && Objects.equals(disposalLongAsset, that.disposalLongAsset) && Objects.equals(disposalLongAssetYoy, that.disposalLongAssetYoy) && Objects.equals(subsidiaryAcceptInvest, that.subsidiaryAcceptInvest) && Objects.equals(subsidiaryAcceptInvestYoy, that.subsidiaryAcceptInvestYoy) && Objects.equals(receiveInterest, that.receiveInterest) && Objects.equals(receiveInterestYoy, that.receiveInterestYoy) && Objects.equals(totalOperateInflow, that.totalOperateInflow) && Objects.equals(totalOperateInflowYoy, that.totalOperateInflowYoy) && Objects.equals(finliabAdd, that.finliabAdd) && Objects.equals(finliabAddYoy, that.finliabAddYoy) && Objects.equals(endCceBalance, that.endCceBalance) && Objects.equals(endCceBalanceYoy, that.endCceBalanceYoy) && Objects.equals(accountsReceAdd, that.accountsReceAdd) && Objects.equals(accountsReceAddYoy, that.accountsReceAddYoy) && Objects.equals(lendFundReduce, that.lendFundReduce) && Objects.equals(lendFundReduceYoy, that.lendFundReduceYoy) && Objects.equals(depositAdd, that.depositAdd) && Objects.equals(depositAddYoy, that.depositAddYoy) && Objects.equals(investOutflowOther, that.investOutflowOther) && Objects.equals(investOutflowOtherYoy, that.investOutflowOtherYoy) && Objects.equals(convertBond1year, that.convertBond1year) && Objects.equals(convertBond1yearYoy, that.convertBond1yearYoy) && Objects.equals(constructLongAsset, that.constructLongAsset) && Objects.equals(constructLongAssetYoy, that.constructLongAssetYoy) && Objects.equals(financeOutflowBalance, that.financeOutflowBalance) && Objects.equals(financeOutflowBalanceYoy, that.financeOutflowBalanceYoy) && Objects.equals(totalInvestOutflow, that.totalInvestOutflow) && Objects.equals(totalInvestOutflowYoy, that.totalInvestOutflowYoy) && Objects.equals(sellRepoAdd, that.sellRepoAdd) && Objects.equals(sellRepoAddYoy, that.sellRepoAddYoy) && Objects.equals(operateNetcashOther, that.operateNetcashOther) && Objects.equals(operateNetcashOtherYoy, that.operateNetcashOtherYoy) && Objects.equals(financeInflowOther, that.financeInflowOther) && Objects.equals(financeInflowOtherYoy, that.financeInflowOtherYoy) && Objects.equals(iaLpeAmortize, that.iaLpeAmortize) && Objects.equals(iaLpeAmortizeYoy, that.iaLpeAmortizeYoy) && Objects.equals(operateNetcashBalance, that.operateNetcashBalance) && Objects.equals(operateNetcashBalanceYoy, that.operateNetcashBalanceYoy) && Objects.equals(investInflowBalance, that.investInflowBalance) && Objects.equals(investInflowBalanceYoy, that.investInflowBalanceYoy) && Objects.equals(minorityInterest, that.minorityInterest) && Objects.equals(minorityInterestYoy, that.minorityInterestYoy) && Objects.equals(provisionPredictLiab, that.provisionPredictLiab) && Objects.equals(provisionPredictLiabYoy, that.provisionPredictLiabYoy) && Objects.equals(depositIofiOther, that.depositIofiOther) && Objects.equals(depositIofiOtherYoy, that.depositIofiOtherYoy) && Objects.equals(debtTransferCapital, that.debtTransferCapital) && Objects.equals(debtTransferCapitalYoy, that.debtTransferCapitalYoy) && Objects.equals(investInflowOther, that.investInflowOther) && Objects.equals(investInflowOtherYoy, that.investInflowOtherYoy) && Objects.equals(beginCashEquivalents, that.beginCashEquivalents) && Objects.equals(beginCashEquivalentsYoy, that.beginCashEquivalentsYoy) && Objects.equals(tradeFinliabReduce, that.tradeFinliabReduce) && Objects.equals(tradeFinliabReduceYoy, that.tradeFinliabReduceYoy) && Objects.equals(payOtherInvest, that.payOtherInvest) && Objects.equals(payOtherInvestYoy, that.payOtherInvestYoy) && Objects.equals(payOtherFinanceQoq, that.payOtherFinanceQoq) && Objects.equals(loanPbcAddQoq, that.loanPbcAddQoq) && Objects.equals(pbcIofiReduceQoq, that.pbcIofiReduceQoq) && Objects.equals(fairvalueChangeLossQoq, that.fairvalueChangeLossQoq) && Objects.equals(receiveAddEquityQoq, that.receiveAddEquityQoq) && Objects.equals(payBondInterestQoq, that.payBondInterestQoq) && Objects.equals(tradeFinliabAddQoq, that.tradeFinliabAddQoq) && Objects.equals(financeInflowBalanceQoq, that.financeInflowBalanceQoq) && Objects.equals(issueSharesExpenseQoq, that.issueSharesExpenseQoq) && Objects.equals(withdrawWriteoffLoanQoq, that.withdrawWriteoffLoanQoq) && Objects.equals(issueBondQoq, that.issueBondQoq) && Objects.equals(totalFinanceOutflowQoq, that.totalFinanceOutflowQoq) && Objects.equals(transferInvestImpairmentQoq, that.transferInvestImpairmentQoq) && Objects.equals(financeNetcashOtherQoq, that.financeNetcashOtherQoq) && Objects.equals(endCashEquivalentsQoq, that.endCashEquivalentsQoq) && Objects.equals(dtAssetReduceQoq, that.dtAssetReduceQoq) && Objects.equals(lendAddQoq, that.lendAddQoq) && Objects.equals(disposalLongassetLossQoq, that.disposalLongassetLossQoq) && Objects.equals(investLossQoq, that.investLossQoq) && Objects.equals(borrowFundAddQoq, that.borrowFundAddQoq) && Objects.equals(payOtherOperateQoq, that.payOtherOperateQoq) && Objects.equals(tradeFinassetReduceQoq, that.tradeFinassetReduceQoq) && Objects.equals(lendFundAddQoq, that.lendFundAddQoq) && Objects.equals(investOutflowBalanceQoq, that.investOutflowBalanceQoq) && Objects.equals(depositAddQoq, that.depositAddQoq) && Objects.equals(receiveOtherFinanceQoq, that.receiveOtherFinanceQoq) && Objects.equals(lpeAmortizeQoq, that.lpeAmortizeQoq) && Objects.equals(fbnetcashOperateQoq, that.fbnetcashOperateQoq) && Objects.equals(fbcceAddOtherQoq, that.fbcceAddOtherQoq) && Objects.equals(endCashQoq, that.endCashQoq) && Objects.equals(lendResaleReduceQoq, that.lendResaleReduceQoq) && Objects.equals(finassetReduceQoq, that.finassetReduceQoq) && Objects.equals(operateOutflowBalanceQoq, that.operateOutflowBalanceQoq) && Objects.equals(rateChangeEffectQoq, that.rateChangeEffectQoq) && Objects.equals(netcashOperateQoq, that.netcashOperateQoq) && Objects.equals(netCdQoq, that.netCdQoq) && Objects.equals(issuedCdReduceQoq, that.issuedCdReduceQoq) && Objects.equals(depositIofiAddQoq, that.depositIofiAddQoq) && Objects.equals(fbcceAddQoq, that.fbcceAddQoq) && Objects.equals(disposalLongAssetQoq, that.disposalLongAssetQoq) && Objects.equals(assetImpairmentQoq, that.assetImpairmentQoq) && Objects.equals(investOutflowOtherQoq, that.investOutflowOtherQoq) && Objects.equals(faIrDeprQoq, that.faIrDeprQoq) && Objects.equals(cceAddOtherQoq, that.cceAddOtherQoq) && Objects.equals(finleaseObtainFaQoq, that.finleaseObtainFaQoq) && Objects.equals(lendFundReduceQoq, that.lendFundReduceQoq) && Objects.equals(receiveWriteoffQoq, that.receiveWriteoffQoq) && Objects.equals(fboperateNetcashBalanceQoq, that.fboperateNetcashBalanceQoq) && Objects.equals(subsidiaryAcceptInvestQoq, that.subsidiaryAcceptInvestQoq) && Objects.equals(accountsReceAddQoq, that.accountsReceAddQoq) && Objects.equals(finliabAddQoq, that.finliabAddQoq) && Objects.equals(endCceBalanceQoq, that.endCceBalanceQoq) && Objects.equals(fboperateNetcashOtherQoq, that.fboperateNetcashOtherQoq) && Objects.equals(payInterestCommissionQoq, that.payInterestCommissionQoq) && Objects.equals(depositPbcReduceQoq, that.depositPbcReduceQoq) && Objects.equals(receiveInterestCommissionQoq, that.receiveInterestCommissionQoq) && Objects.equals(payStaffCashQoq, that.payStaffCashQoq) && Objects.equals(constructLongAssetQoq, that.constructLongAssetQoq) && Objects.equals(receiveCommissionQoq, that.receiveCommissionQoq) && Objects.equals(totalOperateOutflowQoq, that.totalOperateOutflowQoq) && Objects.equals(totalOperateInflowQoq, that.totalOperateInflowQoq) && Objects.equals(obtainSubsidiaryOtherQoq, that.obtainSubsidiaryOtherQoq) && Objects.equals(dtLiabAddQoq, that.dtLiabAddQoq) && Objects.equals(minorityInterestQoq, that.minorityInterestQoq) && Objects.equals(operateNetcashBalanceQoq, that.operateNetcashBalanceQoq) && Objects.equals(investNetcashBalanceQoq, that.investNetcashBalanceQoq) && Objects.equals(financeOutflowBalanceQoq, that.financeOutflowBalanceQoq) && Objects.equals(investPayCashQoq, that.investPayCashQoq) && Objects.equals(debtTransferCapitalQoq, that.debtTransferCapitalQoq) && Objects.equals(assignDividendPorfitQoq, that.assignDividendPorfitQoq) && Objects.equals(convertBond1yearQoq, that.convertBond1yearQoq) && Objects.equals(endCceOtherQoq, that.endCceOtherQoq) && Objects.equals(operateInflowOtherQoq, that.operateInflowOtherQoq) && Objects.equals(receiveOtherInvestQoq, that.receiveOtherInvestQoq) && Objects.equals(depositIofiOtherQoq, that.depositIofiOtherQoq) && Objects.equals(receiveDividendProfitQoq, that.receiveDividendProfitQoq) && Objects.equals(totalInvestOutflowQoq, that.totalInvestOutflowQoq) && Objects.equals(buyResaleReduceQoq, that.buyResaleReduceQoq) && Objects.equals(provisionPredictLiabQoq, that.provisionPredictLiabQoq) && Objects.equals(buyResaleAddQoq, that.buyResaleAddQoq) && Objects.equals(disposalSubsidiaryJointQoq, that.disposalSubsidiaryJointQoq) && Objects.equals(iofiAddQoq, that.iofiAddQoq) && Objects.equals(disposalMortgageAssetQoq, that.disposalMortgageAssetQoq) && Objects.equals(payDebtCashQoq, that.payDebtCashQoq) && Objects.equals(financeOutflowOtherQoq, that.financeOutflowOtherQoq) && Objects.equals(inventoryReduceQoq, that.inventoryReduceQoq) && Objects.equals(sellRepoAddQoq, that.sellRepoAddQoq) && Objects.equals(bondInterestExpenseQoq, that.bondInterestExpenseQoq) && Objects.equals(iaLpeAmortizeQoq, that.iaLpeAmortizeQoq) && Objects.equals(receiveInterestQoq, that.receiveInterestQoq) && Objects.equals(operateReceReduceQoq, that.operateReceReduceQoq) && Objects.equals(investInflowBalanceQoq, that.investInflowBalanceQoq) && Objects.equals(investInflowOtherQoq, that.investInflowOtherQoq) && Objects.equals(issueOtherBondQoq, that.issueOtherBondQoq) && Objects.equals(payOtherInvestQoq, that.payOtherInvestQoq) && Objects.equals(tradeFinliabReduceQoq, that.tradeFinliabReduceQoq) && Objects.equals(payAllTaxQoq, that.payAllTaxQoq) && Objects.equals(depositIofiReduceQoq, that.depositIofiReduceQoq) && Objects.equals(beginCashEquivalentsQoq, that.beginCashEquivalentsQoq) && Objects.equals(operateNetcashOtherQoq, that.operateNetcashOtherQoq) && Objects.equals(sellRepoReduceQoq, that.sellRepoReduceQoq) && Objects.equals(beginCceQoq, that.beginCceQoq) && Objects.equals(financeInflowOtherQoq, that.financeInflowOtherQoq) && Objects.equals(depositPbcAddQoq, that.depositPbcAddQoq) && Objects.equals(otherQoq, that.otherQoq) && Objects.equals(operatePayableAddQoq, that.operatePayableAddQoq) && Objects.equals(endCceQoq, that.endCceQoq) && Objects.equals(receiveOtherOperateQoq, that.receiveOtherOperateQoq) && Objects.equals(beginCashQoq, that.beginCashQoq) && Objects.equals(payInterestQoq, that.payInterestQoq) && Objects.equals(acceptInvestCashQoq, that.acceptInvestCashQoq) && Objects.equals(borrowRepoAddQoq, that.borrowRepoAddQoq) && Objects.equals(netcashFinanceQoq, that.netcashFinanceQoq) && Objects.equals(borrowFundReduceQoq, that.borrowFundReduceQoq) && Objects.equals(issueSubbondQoq, that.issueSubbondQoq) && Objects.equals(faScrapLossQoq, that.faScrapLossQoq) && Objects.equals(operateOutflowOtherQoq, that.operateOutflowOtherQoq) && Objects.equals(cceAddBalanceQoq, that.cceAddBalanceQoq) && Objects.equals(exchangeLossQoq, that.exchangeLossQoq) && Objects.equals(operateInflowBalanceQoq, that.operateInflowBalanceQoq) && Objects.equals(tradeFinassetAddQoq, that.tradeFinassetAddQoq) && Objects.equals(loanAdvanceAddQoq, that.loanAdvanceAddQoq) && Objects.equals(provisionLoanImpairmentQoq, that.provisionLoanImpairmentQoq) && Objects.equals(loanPbcReduceQoq, that.loanPbcReduceQoq) && Objects.equals(cceAddQoq, that.cceAddQoq) && Objects.equals(deferTaxQoq, that.deferTaxQoq) && Objects.equals(payCommissionQoq, that.payCommissionQoq) && Objects.equals(fbcceAddBalanceQoq, that.fbcceAddBalanceQoq) && Objects.equals(totalInvestInflowQoq, that.totalInvestInflowQoq) && Objects.equals(customerDepositAddQoq, that.customerDepositAddQoq) && Objects.equals(pbcIofiAddQoq, that.pbcIofiAddQoq) && Objects.equals(longassetAmortizeQoq, that.longassetAmortizeQoq) && Objects.equals(financeNetcashBalanceQoq, that.financeNetcashBalanceQoq) && Objects.equals(issueCdQoq, that.issueCdQoq) && Objects.equals(withdrawInvestQoq, that.withdrawInvestQoq) && Objects.equals(investNetcashOtherQoq, that.investNetcashOtherQoq) && Objects.equals(otherAssetImpairmentQoq, that.otherAssetImpairmentQoq) && Objects.equals(netcashInvestQoq, that.netcashInvestQoq) && Objects.equals(borrowRepoReduceQoq, that.borrowRepoReduceQoq) && Objects.equals(provisionInvestImpairmentQoq, that.provisionInvestImpairmentQoq) && Objects.equals(loanReduceQoq, that.loanReduceQoq) && Objects.equals(interbankOtherReduceQoq, that.interbankOtherReduceQoq) && Objects.equals(netprofitQoq, that.netprofitQoq) && Objects.equals(uninvolveInvestfinOtherQoq, that.uninvolveInvestfinOtherQoq) && Objects.equals(totalFinanceInflowQoq, that.totalFinanceInflowQoq) && Objects.equals(buyFinLeaseQoq, that.buyFinLeaseQoq) && Objects.equals(lendResaleAddQoq, that.lendResaleAddQoq) && Objects.equals(fixedAssetDeprQoq, that.fixedAssetDeprQoq) && Objects.equals(receiveInvestIncomeQoq, that.receiveInvestIncomeQoq) && Objects.equals(iaAmortizeQoq, that.iaAmortizeQoq);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityCode, reportType, reportDate, opinionType, osopinionType, beginCash, beginCashYoy, borrowFundReduce, borrowFundReduceYoy, operateInflowBalance, operateInflowBalanceYoy, faScrapLoss, faScrapLossYoy, operateOutflowOther, operateOutflowOtherYoy, fairvalueChangeLoss, fairvalueChangeLossYoy, operateInflowOther, operateInflowOtherYoy, netcashFinance, netcashFinanceYoy, depositPbcAdd, depositPbcAddYoy, investNetcashOther, investNetcashOtherYoy, receiveOtherOperate, receiveOtherOperateYoy, payInterest, payInterestYoy, issueSubbond, issueSubbondYoy, investPayCash, investPayCashYoy, receiveAddEquity, receiveAddEquityYoy, lendFundAdd, lendFundAddYoy, borrowRepoAdd, borrowRepoAddYoy, financeNetcashOther, financeNetcashOtherYoy, loanReduce, loanReduceYoy, loanPbcAdd, loanPbcAddYoy, otherAssetImpairment, otherAssetImpairmentYoy, receiveWriteoff, receiveWriteoffYoy, rateChangeEffect, rateChangeEffectYoy, fbcceAddOther, fbcceAddOtherYoy, dtAssetReduce, dtAssetReduceYoy, acceptInvestCash, acceptInvestCashYoy, endCceOther, endCceOtherYoy, financeInflowBalance, financeInflowBalanceYoy, endCce, endCceYoy, totalFinanceInflow, totalFinanceInflowYoy, cceAddOther, cceAddOtherYoy, cceAddBalance, cceAddBalanceYoy, exchangeLoss, exchangeLossYoy, loanAdvanceAdd, loanAdvanceAddYoy, investLoss, investLossYoy, fbcceAddBalance, fbcceAddBalanceYoy, cceAdd, cceAddYoy, receiveCommission, receiveCommissionYoy, dtLiabAdd, dtLiabAddYoy, deferTax, deferTaxYoy, investOutflowBalance, investOutflowBalanceYoy, depositIofiReduce, depositIofiReduceYoy, fixedAssetDepr, fixedAssetDeprYoy, finleaseObtainFa, finleaseObtainFaYoy, tradeFinassetAdd, tradeFinassetAddYoy, pbcIofiAdd, pbcIofiAddYoy, longassetAmortize, longassetAmortizeYoy, totalInvestInflow, totalInvestInflowYoy, financeNetcashBalance, financeNetcashBalanceYoy, loanPbcReduce, loanPbcReduceYoy, payCommission, payCommissionYoy, receiveOtherInvest, receiveOtherInvestYoy, lendAdd, lendAddYoy, faIrDepr, faIrDeprYoy, provisionLoanImpairment, provisionLoanImpairmentYoy, operateOutflowBalance, operateOutflowBalanceYoy, lendResaleAdd, lendResaleAddYoy, buyResaleReduce, buyResaleReduceYoy, customerDepositAdd, customerDepositAddYoy, issueCd, issueCdYoy, finassetReduce, finassetReduceYoy, payInterestCommission, payInterestCommissionYoy, payOtherFinance, payOtherFinanceYoy, receiveDividendProfit, receiveDividendProfitYoy, financeOutflowOther, financeOutflowOtherYoy, obtainSubsidiaryOther, obtainSubsidiaryOtherYoy, withdrawInvest, withdrawInvestYoy, payStaffCash, payStaffCashYoy, iaAmortize, iaAmortizeYoy, beginCce, beginCceYoy, depositPbcReduce, depositPbcReduceYoy, sellRepoReduce, sellRepoReduceYoy, uninvolveInvestfinOther, uninvolveInvestfinOtherYoy, netcashInvest, netcashInvestYoy, provisionInvestImpairment, provisionInvestImpairmentYoy, netprofit, netprofitYoy, pbcIofiReduce, pbcIofiReduceYoy, fbnetcashOperate, fbnetcashOperateYoy, buyResaleAdd, buyResaleAddYoy, issueOtherBond, issueOtherBondYoy, interbankOtherReduce, interbankOtherReduceYoy, buyFinLease, buyFinLeaseYoy, endCashEquivalents, endCashEquivalentsYoy, lpeAmortize, lpeAmortizeYoy, receiveInvestIncome, receiveInvestIncomeYoy, issuedCdReduce, issuedCdReduceYoy, borrowRepoReduce, borrowRepoReduceYoy, payBondInterest, payBondInterestYoy, tradeFinliabAdd, tradeFinliabAddYoy, totalOperateOutflow, totalOperateOutflowYoy, depositIofiAdd, depositIofiAddYoy, withdrawWriteoffLoan, withdrawWriteoffLoanYoy, bondInterestExpense, bondInterestExpenseYoy, fboperateNetcashBalance, fboperateNetcashBalanceYoy, issueSharesExpense, issueSharesExpenseYoy, fbcceAdd, fbcceAddYoy, payDebtCash, payDebtCashYoy, disposalMortgageAsset, disposalMortgageAssetYoy, issueBond, issueBondYoy, operatePayableAdd, operatePayableAddYoy, operateReceReduce, operateReceReduceYoy, transferInvestImpairment, transferInvestImpairmentYoy, payAllTax, payAllTaxYoy, investNetcashBalance, investNetcashBalanceYoy, receiveInterestCommission, receiveInterestCommissionYoy, fboperateNetcashOther, fboperateNetcashOtherYoy, borrowFundAdd, borrowFundAddYoy, assetImpairment, assetImpairmentYoy, assignDividendPorfit, assignDividendPorfitYoy, totalFinanceOutflow, totalFinanceOutflowYoy, disposalSubsidiaryJoint, disposalSubsidiaryJointYoy, receiveOtherFinance, receiveOtherFinanceYoy, payOtherOperate, payOtherOperateYoy, tradeFinassetReduce, tradeFinassetReduceYoy, lendResaleReduce, lendResaleReduceYoy, netCd, netCdYoy, iofiAdd, iofiAddYoy, inventoryReduce, inventoryReduceYoy, disposalLongassetLoss, disposalLongassetLossYoy, endCash, endCashYoy, other, otherYoy, netcashOperate, netcashOperateYoy, disposalLongAsset, disposalLongAssetYoy, subsidiaryAcceptInvest, subsidiaryAcceptInvestYoy, receiveInterest, receiveInterestYoy, totalOperateInflow, totalOperateInflowYoy, finliabAdd, finliabAddYoy, endCceBalance, endCceBalanceYoy, accountsReceAdd, accountsReceAddYoy, lendFundReduce, lendFundReduceYoy, depositAdd, depositAddYoy, investOutflowOther, investOutflowOtherYoy, convertBond1year, convertBond1yearYoy, constructLongAsset, constructLongAssetYoy, financeOutflowBalance, financeOutflowBalanceYoy, totalInvestOutflow, totalInvestOutflowYoy, sellRepoAdd, sellRepoAddYoy, operateNetcashOther, operateNetcashOtherYoy, financeInflowOther, financeInflowOtherYoy, iaLpeAmortize, iaLpeAmortizeYoy, operateNetcashBalance, operateNetcashBalanceYoy, investInflowBalance, investInflowBalanceYoy, minorityInterest, minorityInterestYoy, provisionPredictLiab, provisionPredictLiabYoy, depositIofiOther, depositIofiOtherYoy, debtTransferCapital, debtTransferCapitalYoy, investInflowOther, investInflowOtherYoy, beginCashEquivalents, beginCashEquivalentsYoy, tradeFinliabReduce, tradeFinliabReduceYoy, payOtherInvest, payOtherInvestYoy, payOtherFinanceQoq, loanPbcAddQoq, pbcIofiReduceQoq, fairvalueChangeLossQoq, receiveAddEquityQoq, payBondInterestQoq, tradeFinliabAddQoq, financeInflowBalanceQoq, issueSharesExpenseQoq, withdrawWriteoffLoanQoq, issueBondQoq, totalFinanceOutflowQoq, transferInvestImpairmentQoq, financeNetcashOtherQoq, endCashEquivalentsQoq, dtAssetReduceQoq, lendAddQoq, disposalLongassetLossQoq, investLossQoq, borrowFundAddQoq, payOtherOperateQoq, tradeFinassetReduceQoq, lendFundAddQoq, investOutflowBalanceQoq, depositAddQoq, receiveOtherFinanceQoq, lpeAmortizeQoq, fbnetcashOperateQoq, fbcceAddOtherQoq, endCashQoq, lendResaleReduceQoq, finassetReduceQoq, operateOutflowBalanceQoq, rateChangeEffectQoq, netcashOperateQoq, netCdQoq, issuedCdReduceQoq, depositIofiAddQoq, fbcceAddQoq, disposalLongAssetQoq, assetImpairmentQoq, investOutflowOtherQoq, faIrDeprQoq, cceAddOtherQoq, finleaseObtainFaQoq, lendFundReduceQoq, receiveWriteoffQoq, fboperateNetcashBalanceQoq, subsidiaryAcceptInvestQoq, accountsReceAddQoq, finliabAddQoq, endCceBalanceQoq, fboperateNetcashOtherQoq, payInterestCommissionQoq, depositPbcReduceQoq, receiveInterestCommissionQoq, payStaffCashQoq, constructLongAssetQoq, receiveCommissionQoq, totalOperateOutflowQoq, totalOperateInflowQoq, obtainSubsidiaryOtherQoq, dtLiabAddQoq, minorityInterestQoq, operateNetcashBalanceQoq, investNetcashBalanceQoq, financeOutflowBalanceQoq, investPayCashQoq, debtTransferCapitalQoq, assignDividendPorfitQoq, convertBond1yearQoq, endCceOtherQoq, operateInflowOtherQoq, receiveOtherInvestQoq, depositIofiOtherQoq, receiveDividendProfitQoq, totalInvestOutflowQoq, buyResaleReduceQoq, provisionPredictLiabQoq, buyResaleAddQoq, disposalSubsidiaryJointQoq, iofiAddQoq, disposalMortgageAssetQoq, payDebtCashQoq, financeOutflowOtherQoq, inventoryReduceQoq, sellRepoAddQoq, bondInterestExpenseQoq, iaLpeAmortizeQoq, receiveInterestQoq, operateReceReduceQoq, investInflowBalanceQoq, investInflowOtherQoq, issueOtherBondQoq, payOtherInvestQoq, tradeFinliabReduceQoq, payAllTaxQoq, depositIofiReduceQoq, beginCashEquivalentsQoq, operateNetcashOtherQoq, sellRepoReduceQoq, beginCceQoq, financeInflowOtherQoq, depositPbcAddQoq, otherQoq, operatePayableAddQoq, endCceQoq, receiveOtherOperateQoq, beginCashQoq, payInterestQoq, acceptInvestCashQoq, borrowRepoAddQoq, netcashFinanceQoq, borrowFundReduceQoq, issueSubbondQoq, faScrapLossQoq, operateOutflowOtherQoq, cceAddBalanceQoq, exchangeLossQoq, operateInflowBalanceQoq, tradeFinassetAddQoq, loanAdvanceAddQoq, provisionLoanImpairmentQoq, loanPbcReduceQoq, cceAddQoq, deferTaxQoq, payCommissionQoq, fbcceAddBalanceQoq, totalInvestInflowQoq, customerDepositAddQoq, pbcIofiAddQoq, longassetAmortizeQoq, financeNetcashBalanceQoq, issueCdQoq, withdrawInvestQoq, investNetcashOtherQoq, otherAssetImpairmentQoq, netcashInvestQoq, borrowRepoReduceQoq, provisionInvestImpairmentQoq, loanReduceQoq, interbankOtherReduceQoq, netprofitQoq, uninvolveInvestfinOtherQoq, totalFinanceInflowQoq, buyFinLeaseQoq, lendResaleAddQoq, fixedAssetDeprQoq, receiveInvestIncomeQoq, iaAmortizeQoq);
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
            .append("beginCash", getBeginCash())
            .append("beginCashYoy", getBeginCashYoy())
            .append("borrowFundReduce", getBorrowFundReduce())
            .append("borrowFundReduceYoy", getBorrowFundReduceYoy())
            .append("operateInflowBalance", getOperateInflowBalance())
            .append("operateInflowBalanceYoy", getOperateInflowBalanceYoy())
            .append("faScrapLoss", getFaScrapLoss())
            .append("faScrapLossYoy", getFaScrapLossYoy())
            .append("operateOutflowOther", getOperateOutflowOther())
            .append("operateOutflowOtherYoy", getOperateOutflowOtherYoy())
            .append("fairvalueChangeLoss", getFairvalueChangeLoss())
            .append("fairvalueChangeLossYoy", getFairvalueChangeLossYoy())
            .append("operateInflowOther", getOperateInflowOther())
            .append("operateInflowOtherYoy", getOperateInflowOtherYoy())
            .append("netcashFinance", getNetcashFinance())
            .append("netcashFinanceYoy", getNetcashFinanceYoy())
            .append("depositPbcAdd", getDepositPbcAdd())
            .append("depositPbcAddYoy", getDepositPbcAddYoy())
            .append("investNetcashOther", getInvestNetcashOther())
            .append("investNetcashOtherYoy", getInvestNetcashOtherYoy())
            .append("receiveOtherOperate", getReceiveOtherOperate())
            .append("receiveOtherOperateYoy", getReceiveOtherOperateYoy())
            .append("payInterest", getPayInterest())
            .append("payInterestYoy", getPayInterestYoy())
            .append("issueSubbond", getIssueSubbond())
            .append("issueSubbondYoy", getIssueSubbondYoy())
            .append("investPayCash", getInvestPayCash())
            .append("investPayCashYoy", getInvestPayCashYoy())
            .append("receiveAddEquity", getReceiveAddEquity())
            .append("receiveAddEquityYoy", getReceiveAddEquityYoy())
            .append("lendFundAdd", getLendFundAdd())
            .append("lendFundAddYoy", getLendFundAddYoy())
            .append("borrowRepoAdd", getBorrowRepoAdd())
            .append("borrowRepoAddYoy", getBorrowRepoAddYoy())
            .append("financeNetcashOther", getFinanceNetcashOther())
            .append("financeNetcashOtherYoy", getFinanceNetcashOtherYoy())
            .append("loanReduce", getLoanReduce())
            .append("loanReduceYoy", getLoanReduceYoy())
            .append("loanPbcAdd", getLoanPbcAdd())
            .append("loanPbcAddYoy", getLoanPbcAddYoy())
            .append("otherAssetImpairment", getOtherAssetImpairment())
            .append("otherAssetImpairmentYoy", getOtherAssetImpairmentYoy())
            .append("receiveWriteoff", getReceiveWriteoff())
            .append("receiveWriteoffYoy", getReceiveWriteoffYoy())
            .append("rateChangeEffect", getRateChangeEffect())
            .append("rateChangeEffectYoy", getRateChangeEffectYoy())
            .append("fbcceAddOther", getFbcceAddOther())
            .append("fbcceAddOtherYoy", getFbcceAddOtherYoy())
            .append("dtAssetReduce", getDtAssetReduce())
            .append("dtAssetReduceYoy", getDtAssetReduceYoy())
            .append("acceptInvestCash", getAcceptInvestCash())
            .append("acceptInvestCashYoy", getAcceptInvestCashYoy())
            .append("endCceOther", getEndCceOther())
            .append("endCceOtherYoy", getEndCceOtherYoy())
            .append("financeInflowBalance", getFinanceInflowBalance())
            .append("financeInflowBalanceYoy", getFinanceInflowBalanceYoy())
            .append("endCce", getEndCce())
            .append("endCceYoy", getEndCceYoy())
            .append("totalFinanceInflow", getTotalFinanceInflow())
            .append("totalFinanceInflowYoy", getTotalFinanceInflowYoy())
            .append("cceAddOther", getCceAddOther())
            .append("cceAddOtherYoy", getCceAddOtherYoy())
            .append("cceAddBalance", getCceAddBalance())
            .append("cceAddBalanceYoy", getCceAddBalanceYoy())
            .append("exchangeLoss", getExchangeLoss())
            .append("exchangeLossYoy", getExchangeLossYoy())
            .append("loanAdvanceAdd", getLoanAdvanceAdd())
            .append("loanAdvanceAddYoy", getLoanAdvanceAddYoy())
            .append("investLoss", getInvestLoss())
            .append("investLossYoy", getInvestLossYoy())
            .append("fbcceAddBalance", getFbcceAddBalance())
            .append("fbcceAddBalanceYoy", getFbcceAddBalanceYoy())
            .append("cceAdd", getCceAdd())
            .append("cceAddYoy", getCceAddYoy())
            .append("receiveCommission", getReceiveCommission())
            .append("receiveCommissionYoy", getReceiveCommissionYoy())
            .append("dtLiabAdd", getDtLiabAdd())
            .append("dtLiabAddYoy", getDtLiabAddYoy())
            .append("deferTax", getDeferTax())
            .append("deferTaxYoy", getDeferTaxYoy())
            .append("investOutflowBalance", getInvestOutflowBalance())
            .append("investOutflowBalanceYoy", getInvestOutflowBalanceYoy())
            .append("depositIofiReduce", getDepositIofiReduce())
            .append("depositIofiReduceYoy", getDepositIofiReduceYoy())
            .append("fixedAssetDepr", getFixedAssetDepr())
            .append("fixedAssetDeprYoy", getFixedAssetDeprYoy())
            .append("finleaseObtainFa", getFinleaseObtainFa())
            .append("finleaseObtainFaYoy", getFinleaseObtainFaYoy())
            .append("tradeFinassetAdd", getTradeFinassetAdd())
            .append("tradeFinassetAddYoy", getTradeFinassetAddYoy())
            .append("pbcIofiAdd", getPbcIofiAdd())
            .append("pbcIofiAddYoy", getPbcIofiAddYoy())
            .append("longassetAmortize", getLongassetAmortize())
            .append("longassetAmortizeYoy", getLongassetAmortizeYoy())
            .append("totalInvestInflow", getTotalInvestInflow())
            .append("totalInvestInflowYoy", getTotalInvestInflowYoy())
            .append("financeNetcashBalance", getFinanceNetcashBalance())
            .append("financeNetcashBalanceYoy", getFinanceNetcashBalanceYoy())
            .append("loanPbcReduce", getLoanPbcReduce())
            .append("loanPbcReduceYoy", getLoanPbcReduceYoy())
            .append("payCommission", getPayCommission())
            .append("payCommissionYoy", getPayCommissionYoy())
            .append("receiveOtherInvest", getReceiveOtherInvest())
            .append("receiveOtherInvestYoy", getReceiveOtherInvestYoy())
            .append("lendAdd", getLendAdd())
            .append("lendAddYoy", getLendAddYoy())
            .append("faIrDepr", getFaIrDepr())
            .append("faIrDeprYoy", getFaIrDeprYoy())
            .append("provisionLoanImpairment", getProvisionLoanImpairment())
            .append("provisionLoanImpairmentYoy", getProvisionLoanImpairmentYoy())
            .append("operateOutflowBalance", getOperateOutflowBalance())
            .append("operateOutflowBalanceYoy", getOperateOutflowBalanceYoy())
            .append("lendResaleAdd", getLendResaleAdd())
            .append("lendResaleAddYoy", getLendResaleAddYoy())
            .append("buyResaleReduce", getBuyResaleReduce())
            .append("buyResaleReduceYoy", getBuyResaleReduceYoy())
            .append("customerDepositAdd", getCustomerDepositAdd())
            .append("customerDepositAddYoy", getCustomerDepositAddYoy())
            .append("issueCd", getIssueCd())
            .append("issueCdYoy", getIssueCdYoy())
            .append("finassetReduce", getFinassetReduce())
            .append("finassetReduceYoy", getFinassetReduceYoy())
            .append("payInterestCommission", getPayInterestCommission())
            .append("payInterestCommissionYoy", getPayInterestCommissionYoy())
            .append("payOtherFinance", getPayOtherFinance())
            .append("payOtherFinanceYoy", getPayOtherFinanceYoy())
            .append("receiveDividendProfit", getReceiveDividendProfit())
            .append("receiveDividendProfitYoy", getReceiveDividendProfitYoy())
            .append("financeOutflowOther", getFinanceOutflowOther())
            .append("financeOutflowOtherYoy", getFinanceOutflowOtherYoy())
            .append("obtainSubsidiaryOther", getObtainSubsidiaryOther())
            .append("obtainSubsidiaryOtherYoy", getObtainSubsidiaryOtherYoy())
            .append("withdrawInvest", getWithdrawInvest())
            .append("withdrawInvestYoy", getWithdrawInvestYoy())
            .append("payStaffCash", getPayStaffCash())
            .append("payStaffCashYoy", getPayStaffCashYoy())
            .append("iaAmortize", getIaAmortize())
            .append("iaAmortizeYoy", getIaAmortizeYoy())
            .append("beginCce", getBeginCce())
            .append("beginCceYoy", getBeginCceYoy())
            .append("depositPbcReduce", getDepositPbcReduce())
            .append("depositPbcReduceYoy", getDepositPbcReduceYoy())
            .append("sellRepoReduce", getSellRepoReduce())
            .append("sellRepoReduceYoy", getSellRepoReduceYoy())
            .append("uninvolveInvestfinOther", getUninvolveInvestfinOther())
            .append("uninvolveInvestfinOtherYoy", getUninvolveInvestfinOtherYoy())
            .append("netcashInvest", getNetcashInvest())
            .append("netcashInvestYoy", getNetcashInvestYoy())
            .append("provisionInvestImpairment", getProvisionInvestImpairment())
            .append("provisionInvestImpairmentYoy", getProvisionInvestImpairmentYoy())
            .append("netprofit", getNetprofit())
            .append("netprofitYoy", getNetprofitYoy())
            .append("pbcIofiReduce", getPbcIofiReduce())
            .append("pbcIofiReduceYoy", getPbcIofiReduceYoy())
            .append("fbnetcashOperate", getFbnetcashOperate())
            .append("fbnetcashOperateYoy", getFbnetcashOperateYoy())
            .append("buyResaleAdd", getBuyResaleAdd())
            .append("buyResaleAddYoy", getBuyResaleAddYoy())
            .append("issueOtherBond", getIssueOtherBond())
            .append("issueOtherBondYoy", getIssueOtherBondYoy())
            .append("interbankOtherReduce", getInterbankOtherReduce())
            .append("interbankOtherReduceYoy", getInterbankOtherReduceYoy())
            .append("buyFinLease", getBuyFinLease())
            .append("buyFinLeaseYoy", getBuyFinLeaseYoy())
            .append("endCashEquivalents", getEndCashEquivalents())
            .append("endCashEquivalentsYoy", getEndCashEquivalentsYoy())
            .append("lpeAmortize", getLpeAmortize())
            .append("lpeAmortizeYoy", getLpeAmortizeYoy())
            .append("receiveInvestIncome", getReceiveInvestIncome())
            .append("receiveInvestIncomeYoy", getReceiveInvestIncomeYoy())
            .append("issuedCdReduce", getIssuedCdReduce())
            .append("issuedCdReduceYoy", getIssuedCdReduceYoy())
            .append("borrowRepoReduce", getBorrowRepoReduce())
            .append("borrowRepoReduceYoy", getBorrowRepoReduceYoy())
            .append("payBondInterest", getPayBondInterest())
            .append("payBondInterestYoy", getPayBondInterestYoy())
            .append("tradeFinliabAdd", getTradeFinliabAdd())
            .append("tradeFinliabAddYoy", getTradeFinliabAddYoy())
            .append("totalOperateOutflow", getTotalOperateOutflow())
            .append("totalOperateOutflowYoy", getTotalOperateOutflowYoy())
            .append("depositIofiAdd", getDepositIofiAdd())
            .append("depositIofiAddYoy", getDepositIofiAddYoy())
            .append("withdrawWriteoffLoan", getWithdrawWriteoffLoan())
            .append("withdrawWriteoffLoanYoy", getWithdrawWriteoffLoanYoy())
            .append("bondInterestExpense", getBondInterestExpense())
            .append("bondInterestExpenseYoy", getBondInterestExpenseYoy())
            .append("fboperateNetcashBalance", getFboperateNetcashBalance())
            .append("fboperateNetcashBalanceYoy", getFboperateNetcashBalanceYoy())
            .append("issueSharesExpense", getIssueSharesExpense())
            .append("issueSharesExpenseYoy", getIssueSharesExpenseYoy())
            .append("fbcceAdd", getFbcceAdd())
            .append("fbcceAddYoy", getFbcceAddYoy())
            .append("payDebtCash", getPayDebtCash())
            .append("payDebtCashYoy", getPayDebtCashYoy())
            .append("disposalMortgageAsset", getDisposalMortgageAsset())
            .append("disposalMortgageAssetYoy", getDisposalMortgageAssetYoy())
            .append("issueBond", getIssueBond())
            .append("issueBondYoy", getIssueBondYoy())
            .append("operatePayableAdd", getOperatePayableAdd())
            .append("operatePayableAddYoy", getOperatePayableAddYoy())
            .append("operateReceReduce", getOperateReceReduce())
            .append("operateReceReduceYoy", getOperateReceReduceYoy())
            .append("transferInvestImpairment", getTransferInvestImpairment())
            .append("transferInvestImpairmentYoy", getTransferInvestImpairmentYoy())
            .append("payAllTax", getPayAllTax())
            .append("payAllTaxYoy", getPayAllTaxYoy())
            .append("investNetcashBalance", getInvestNetcashBalance())
            .append("investNetcashBalanceYoy", getInvestNetcashBalanceYoy())
            .append("receiveInterestCommission", getReceiveInterestCommission())
            .append("receiveInterestCommissionYoy", getReceiveInterestCommissionYoy())
            .append("fboperateNetcashOther", getFboperateNetcashOther())
            .append("fboperateNetcashOtherYoy", getFboperateNetcashOtherYoy())
            .append("borrowFundAdd", getBorrowFundAdd())
            .append("borrowFundAddYoy", getBorrowFundAddYoy())
            .append("assetImpairment", getAssetImpairment())
            .append("assetImpairmentYoy", getAssetImpairmentYoy())
            .append("assignDividendPorfit", getAssignDividendPorfit())
            .append("assignDividendPorfitYoy", getAssignDividendPorfitYoy())
            .append("totalFinanceOutflow", getTotalFinanceOutflow())
            .append("totalFinanceOutflowYoy", getTotalFinanceOutflowYoy())
            .append("disposalSubsidiaryJoint", getDisposalSubsidiaryJoint())
            .append("disposalSubsidiaryJointYoy", getDisposalSubsidiaryJointYoy())
            .append("receiveOtherFinance", getReceiveOtherFinance())
            .append("receiveOtherFinanceYoy", getReceiveOtherFinanceYoy())
            .append("payOtherOperate", getPayOtherOperate())
            .append("payOtherOperateYoy", getPayOtherOperateYoy())
            .append("tradeFinassetReduce", getTradeFinassetReduce())
            .append("tradeFinassetReduceYoy", getTradeFinassetReduceYoy())
            .append("lendResaleReduce", getLendResaleReduce())
            .append("lendResaleReduceYoy", getLendResaleReduceYoy())
            .append("netCd", getNetCd())
            .append("netCdYoy", getNetCdYoy())
            .append("iofiAdd", getIofiAdd())
            .append("iofiAddYoy", getIofiAddYoy())
            .append("inventoryReduce", getInventoryReduce())
            .append("inventoryReduceYoy", getInventoryReduceYoy())
            .append("disposalLongassetLoss", getDisposalLongassetLoss())
            .append("disposalLongassetLossYoy", getDisposalLongassetLossYoy())
            .append("endCash", getEndCash())
            .append("endCashYoy", getEndCashYoy())
            .append("other", getOther())
            .append("otherYoy", getOtherYoy())
            .append("netcashOperate", getNetcashOperate())
            .append("netcashOperateYoy", getNetcashOperateYoy())
            .append("disposalLongAsset", getDisposalLongAsset())
            .append("disposalLongAssetYoy", getDisposalLongAssetYoy())
            .append("subsidiaryAcceptInvest", getSubsidiaryAcceptInvest())
            .append("subsidiaryAcceptInvestYoy", getSubsidiaryAcceptInvestYoy())
            .append("receiveInterest", getReceiveInterest())
            .append("receiveInterestYoy", getReceiveInterestYoy())
            .append("totalOperateInflow", getTotalOperateInflow())
            .append("totalOperateInflowYoy", getTotalOperateInflowYoy())
            .append("finliabAdd", getFinliabAdd())
            .append("finliabAddYoy", getFinliabAddYoy())
            .append("endCceBalance", getEndCceBalance())
            .append("endCceBalanceYoy", getEndCceBalanceYoy())
            .append("accountsReceAdd", getAccountsReceAdd())
            .append("accountsReceAddYoy", getAccountsReceAddYoy())
            .append("lendFundReduce", getLendFundReduce())
            .append("lendFundReduceYoy", getLendFundReduceYoy())
            .append("depositAdd", getDepositAdd())
            .append("depositAddYoy", getDepositAddYoy())
            .append("investOutflowOther", getInvestOutflowOther())
            .append("investOutflowOtherYoy", getInvestOutflowOtherYoy())
            .append("convertBond1year", getConvertBond1year())
            .append("convertBond1yearYoy", getConvertBond1yearYoy())
            .append("constructLongAsset", getConstructLongAsset())
            .append("constructLongAssetYoy", getConstructLongAssetYoy())
            .append("financeOutflowBalance", getFinanceOutflowBalance())
            .append("financeOutflowBalanceYoy", getFinanceOutflowBalanceYoy())
            .append("totalInvestOutflow", getTotalInvestOutflow())
            .append("totalInvestOutflowYoy", getTotalInvestOutflowYoy())
            .append("sellRepoAdd", getSellRepoAdd())
            .append("sellRepoAddYoy", getSellRepoAddYoy())
            .append("operateNetcashOther", getOperateNetcashOther())
            .append("operateNetcashOtherYoy", getOperateNetcashOtherYoy())
            .append("financeInflowOther", getFinanceInflowOther())
            .append("financeInflowOtherYoy", getFinanceInflowOtherYoy())
            .append("iaLpeAmortize", getIaLpeAmortize())
            .append("iaLpeAmortizeYoy", getIaLpeAmortizeYoy())
            .append("operateNetcashBalance", getOperateNetcashBalance())
            .append("operateNetcashBalanceYoy", getOperateNetcashBalanceYoy())
            .append("investInflowBalance", getInvestInflowBalance())
            .append("investInflowBalanceYoy", getInvestInflowBalanceYoy())
            .append("minorityInterest", getMinorityInterest())
            .append("minorityInterestYoy", getMinorityInterestYoy())
            .append("provisionPredictLiab", getProvisionPredictLiab())
            .append("provisionPredictLiabYoy", getProvisionPredictLiabYoy())
            .append("depositIofiOther", getDepositIofiOther())
            .append("depositIofiOtherYoy", getDepositIofiOtherYoy())
            .append("debtTransferCapital", getDebtTransferCapital())
            .append("debtTransferCapitalYoy", getDebtTransferCapitalYoy())
            .append("investInflowOther", getInvestInflowOther())
            .append("investInflowOtherYoy", getInvestInflowOtherYoy())
            .append("beginCashEquivalents", getBeginCashEquivalents())
            .append("beginCashEquivalentsYoy", getBeginCashEquivalentsYoy())
            .append("tradeFinliabReduce", getTradeFinliabReduce())
            .append("tradeFinliabReduceYoy", getTradeFinliabReduceYoy())
            .append("payOtherInvest", getPayOtherInvest())
            .append("payOtherInvestYoy", getPayOtherInvestYoy())
            .append("payOtherFinanceQoq", getPayOtherFinanceQoq())
            .append("loanPbcAddQoq", getLoanPbcAddQoq())
            .append("pbcIofiReduceQoq", getPbcIofiReduceQoq())
            .append("fairvalueChangeLossQoq", getFairvalueChangeLossQoq())
            .append("receiveAddEquityQoq", getReceiveAddEquityQoq())
            .append("payBondInterestQoq", getPayBondInterestQoq())
            .append("tradeFinliabAddQoq", getTradeFinliabAddQoq())
            .append("financeInflowBalanceQoq", getFinanceInflowBalanceQoq())
            .append("issueSharesExpenseQoq", getIssueSharesExpenseQoq())
            .append("withdrawWriteoffLoanQoq", getWithdrawWriteoffLoanQoq())
            .append("issueBondQoq", getIssueBondQoq())
            .append("totalFinanceOutflowQoq", getTotalFinanceOutflowQoq())
            .append("transferInvestImpairmentQoq", getTransferInvestImpairmentQoq())
            .append("financeNetcashOtherQoq", getFinanceNetcashOtherQoq())
            .append("endCashEquivalentsQoq", getEndCashEquivalentsQoq())
            .append("dtAssetReduceQoq", getDtAssetReduceQoq())
            .append("lendAddQoq", getLendAddQoq())
            .append("disposalLongassetLossQoq", getDisposalLongassetLossQoq())
            .append("investLossQoq", getInvestLossQoq())
            .append("borrowFundAddQoq", getBorrowFundAddQoq())
            .append("payOtherOperateQoq", getPayOtherOperateQoq())
            .append("tradeFinassetReduceQoq", getTradeFinassetReduceQoq())
            .append("lendFundAddQoq", getLendFundAddQoq())
            .append("investOutflowBalanceQoq", getInvestOutflowBalanceQoq())
            .append("depositAddQoq", getDepositAddQoq())
            .append("receiveOtherFinanceQoq", getReceiveOtherFinanceQoq())
            .append("lpeAmortizeQoq", getLpeAmortizeQoq())
            .append("fbnetcashOperateQoq", getFbnetcashOperateQoq())
            .append("fbcceAddOtherQoq", getFbcceAddOtherQoq())
            .append("endCashQoq", getEndCashQoq())
            .append("lendResaleReduceQoq", getLendResaleReduceQoq())
            .append("finassetReduceQoq", getFinassetReduceQoq())
            .append("operateOutflowBalanceQoq", getOperateOutflowBalanceQoq())
            .append("rateChangeEffectQoq", getRateChangeEffectQoq())
            .append("netcashOperateQoq", getNetcashOperateQoq())
            .append("netCdQoq", getNetCdQoq())
            .append("issuedCdReduceQoq", getIssuedCdReduceQoq())
            .append("depositIofiAddQoq", getDepositIofiAddQoq())
            .append("fbcceAddQoq", getFbcceAddQoq())
            .append("disposalLongAssetQoq", getDisposalLongAssetQoq())
            .append("assetImpairmentQoq", getAssetImpairmentQoq())
            .append("investOutflowOtherQoq", getInvestOutflowOtherQoq())
            .append("faIrDeprQoq", getFaIrDeprQoq())
            .append("cceAddOtherQoq", getCceAddOtherQoq())
            .append("finleaseObtainFaQoq", getFinleaseObtainFaQoq())
            .append("lendFundReduceQoq", getLendFundReduceQoq())
            .append("receiveWriteoffQoq", getReceiveWriteoffQoq())
            .append("fboperateNetcashBalanceQoq", getFboperateNetcashBalanceQoq())
            .append("subsidiaryAcceptInvestQoq", getSubsidiaryAcceptInvestQoq())
            .append("accountsReceAddQoq", getAccountsReceAddQoq())
            .append("finliabAddQoq", getFinliabAddQoq())
            .append("endCceBalanceQoq", getEndCceBalanceQoq())
            .append("fboperateNetcashOtherQoq", getFboperateNetcashOtherQoq())
            .append("payInterestCommissionQoq", getPayInterestCommissionQoq())
            .append("depositPbcReduceQoq", getDepositPbcReduceQoq())
            .append("receiveInterestCommissionQoq", getReceiveInterestCommissionQoq())
            .append("payStaffCashQoq", getPayStaffCashQoq())
            .append("constructLongAssetQoq", getConstructLongAssetQoq())
            .append("receiveCommissionQoq", getReceiveCommissionQoq())
            .append("totalOperateOutflowQoq", getTotalOperateOutflowQoq())
            .append("totalOperateInflowQoq", getTotalOperateInflowQoq())
            .append("obtainSubsidiaryOtherQoq", getObtainSubsidiaryOtherQoq())
            .append("dtLiabAddQoq", getDtLiabAddQoq())
            .append("minorityInterestQoq", getMinorityInterestQoq())
            .append("operateNetcashBalanceQoq", getOperateNetcashBalanceQoq())
            .append("investNetcashBalanceQoq", getInvestNetcashBalanceQoq())
            .append("financeOutflowBalanceQoq", getFinanceOutflowBalanceQoq())
            .append("investPayCashQoq", getInvestPayCashQoq())
            .append("debtTransferCapitalQoq", getDebtTransferCapitalQoq())
            .append("assignDividendPorfitQoq", getAssignDividendPorfitQoq())
            .append("convertBond1yearQoq", getConvertBond1yearQoq())
            .append("endCceOtherQoq", getEndCceOtherQoq())
            .append("operateInflowOtherQoq", getOperateInflowOtherQoq())
            .append("receiveOtherInvestQoq", getReceiveOtherInvestQoq())
            .append("depositIofiOtherQoq", getDepositIofiOtherQoq())
            .append("receiveDividendProfitQoq", getReceiveDividendProfitQoq())
            .append("totalInvestOutflowQoq", getTotalInvestOutflowQoq())
            .append("buyResaleReduceQoq", getBuyResaleReduceQoq())
            .append("provisionPredictLiabQoq", getProvisionPredictLiabQoq())
            .append("buyResaleAddQoq", getBuyResaleAddQoq())
            .append("disposalSubsidiaryJointQoq", getDisposalSubsidiaryJointQoq())
            .append("iofiAddQoq", getIofiAddQoq())
            .append("disposalMortgageAssetQoq", getDisposalMortgageAssetQoq())
            .append("payDebtCashQoq", getPayDebtCashQoq())
            .append("financeOutflowOtherQoq", getFinanceOutflowOtherQoq())
            .append("inventoryReduceQoq", getInventoryReduceQoq())
            .append("sellRepoAddQoq", getSellRepoAddQoq())
            .append("bondInterestExpenseQoq", getBondInterestExpenseQoq())
            .append("iaLpeAmortizeQoq", getIaLpeAmortizeQoq())
            .append("receiveInterestQoq", getReceiveInterestQoq())
            .append("operateReceReduceQoq", getOperateReceReduceQoq())
            .append("investInflowBalanceQoq", getInvestInflowBalanceQoq())
            .append("investInflowOtherQoq", getInvestInflowOtherQoq())
            .append("issueOtherBondQoq", getIssueOtherBondQoq())
            .append("payOtherInvestQoq", getPayOtherInvestQoq())
            .append("tradeFinliabReduceQoq", getTradeFinliabReduceQoq())
            .append("payAllTaxQoq", getPayAllTaxQoq())
            .append("depositIofiReduceQoq", getDepositIofiReduceQoq())
            .append("beginCashEquivalentsQoq", getBeginCashEquivalentsQoq())
            .append("operateNetcashOtherQoq", getOperateNetcashOtherQoq())
            .append("sellRepoReduceQoq", getSellRepoReduceQoq())
            .append("beginCceQoq", getBeginCceQoq())
            .append("financeInflowOtherQoq", getFinanceInflowOtherQoq())
            .append("depositPbcAddQoq", getDepositPbcAddQoq())
            .append("otherQoq", getOtherQoq())
            .append("operatePayableAddQoq", getOperatePayableAddQoq())
            .append("endCceQoq", getEndCceQoq())
            .append("receiveOtherOperateQoq", getReceiveOtherOperateQoq())
            .append("beginCashQoq", getBeginCashQoq())
            .append("payInterestQoq", getPayInterestQoq())
            .append("acceptInvestCashQoq", getAcceptInvestCashQoq())
            .append("borrowRepoAddQoq", getBorrowRepoAddQoq())
            .append("netcashFinanceQoq", getNetcashFinanceQoq())
            .append("borrowFundReduceQoq", getBorrowFundReduceQoq())
            .append("issueSubbondQoq", getIssueSubbondQoq())
            .append("faScrapLossQoq", getFaScrapLossQoq())
            .append("operateOutflowOtherQoq", getOperateOutflowOtherQoq())
            .append("cceAddBalanceQoq", getCceAddBalanceQoq())
            .append("exchangeLossQoq", getExchangeLossQoq())
            .append("operateInflowBalanceQoq", getOperateInflowBalanceQoq())
            .append("tradeFinassetAddQoq", getTradeFinassetAddQoq())
            .append("loanAdvanceAddQoq", getLoanAdvanceAddQoq())
            .append("provisionLoanImpairmentQoq", getProvisionLoanImpairmentQoq())
            .append("loanPbcReduceQoq", getLoanPbcReduceQoq())
            .append("cceAddQoq", getCceAddQoq())
            .append("deferTaxQoq", getDeferTaxQoq())
            .append("payCommissionQoq", getPayCommissionQoq())
            .append("fbcceAddBalanceQoq", getFbcceAddBalanceQoq())
            .append("totalInvestInflowQoq", getTotalInvestInflowQoq())
            .append("customerDepositAddQoq", getCustomerDepositAddQoq())
            .append("pbcIofiAddQoq", getPbcIofiAddQoq())
            .append("longassetAmortizeQoq", getLongassetAmortizeQoq())
            .append("financeNetcashBalanceQoq", getFinanceNetcashBalanceQoq())
            .append("issueCdQoq", getIssueCdQoq())
            .append("withdrawInvestQoq", getWithdrawInvestQoq())
            .append("investNetcashOtherQoq", getInvestNetcashOtherQoq())
            .append("otherAssetImpairmentQoq", getOtherAssetImpairmentQoq())
            .append("netcashInvestQoq", getNetcashInvestQoq())
            .append("borrowRepoReduceQoq", getBorrowRepoReduceQoq())
            .append("provisionInvestImpairmentQoq", getProvisionInvestImpairmentQoq())
            .append("loanReduceQoq", getLoanReduceQoq())
            .append("interbankOtherReduceQoq", getInterbankOtherReduceQoq())
            .append("netprofitQoq", getNetprofitQoq())
            .append("uninvolveInvestfinOtherQoq", getUninvolveInvestfinOtherQoq())
            .append("totalFinanceInflowQoq", getTotalFinanceInflowQoq())
            .append("buyFinLeaseQoq", getBuyFinLeaseQoq())
            .append("lendResaleAddQoq", getLendResaleAddQoq())
            .append("fixedAssetDeprQoq", getFixedAssetDeprQoq())
            .append("receiveInvestIncomeQoq", getReceiveInvestIncomeQoq())
            .append("iaAmortizeQoq", getIaAmortizeQoq())
            .toString();
    }
}
