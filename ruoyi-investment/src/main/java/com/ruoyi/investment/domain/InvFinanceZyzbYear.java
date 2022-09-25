package com.ruoyi.investment.domain;

import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 财务分析-重要指标-年度对象 inv_finance_zyzb_year
 * 
 * @author wenyong.yang
 * @date 2022-09-24
 */
public class InvFinanceZyzbYear extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 股票代码 */
    @Excel(name = "股票代码")
    private String securityCode;

    /** 报告日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "报告日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date reportDate;

    /** 发布日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发布日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date noticeDate;

    /** 修改日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "修改日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updateDate;

    /** 每股未分配利润(元) */
    @Excel(name = "每股未分配利润(元)")
    private Double mgwfplr;

    /** 每股经营现金流(元) */
    @Excel(name = "每股经营现金流(元)")
    private Double mgjyxjje;

    /** 稀释每股收益(元) */
    @Excel(name = "稀释每股收益(元)")
    private Double epsxs;

    /** 扣非每股收益(元) */
    @Excel(name = "扣非每股收益(元)")
    private Double epskcjb;

    /** 每股公积金(元) */
    @Excel(name = "每股公积金(元)")
    private Double mgzbgj;

    /** 每股净资产(元) */
    @Excel(name = "每股净资产(元)")
    private Double bps;

    /** 基本每股收益(元) */
    @Excel(name = "基本每股收益(元)")
    private Double epsjb;

    /** 营业总收入滚动环比增长(%) */
    @Excel(name = "营业总收入滚动环比增长(%)")
    private Double yyzsrgdhbzc;

    /** 营业总收入(元) */
    @Excel(name = "营业总收入(元)")
    private Double totaloperatereve;

    /** 扣非净利润滚动环比增长(%) */
    @Excel(name = "扣非净利润滚动环比增长(%)")
    private Double kfjlrgdhbzc;

    /** 扣非净利润(元) */
    @Excel(name = "扣非净利润(元)")
    private Double kcfjcxsyjlr;

    /** 归属净利润同比增长(%) */
    @Excel(name = "归属净利润同比增长(%)")
    private Double epsjbtz;

    /** 扣非净利润同比增长(%) */
    @Excel(name = "扣非净利润同比增长(%)")
    private Double kcfjcxsyjlrtz;

    /** 归属净利润(元) */
    @Excel(name = "归属净利润(元)")
    private Double parentnetprofit;

    /** 归属净利润滚动环比增长(%) */
    @Excel(name = "归属净利润滚动环比增长(%)")
    private Double netprofitrphbzc;

    /** 营业总收入同比增长(%) */
    @Excel(name = "营业总收入同比增长(%)")
    private Double totaloperaterevetz;

    /** 净资产收益率(扣非/加权)(%) */
    @Excel(name = "净资产收益率(扣非/加权)(%)")
    private Double roekcjq;

    /** 总资产收益率(加权)(%) */
    @Excel(name = "总资产收益率(加权)(%)")
    private Double zzcjll;

    /** 净资产收益率(加权)(%) */
    @Excel(name = "净资产收益率(加权)(%)")
    private Double roejq;

    /** 毛利率(%) */
    @Excel(name = "毛利率(%)")
    private Double xsmll;

    /** 净利率(%) */
    @Excel(name = "净利率(%)")
    private Double xsjll;

    /** 产权比率 */
    @Excel(name = "产权比率")
    private Double cqbl;

    /** 资产负债率(%) */
    @Excel(name = "资产负债率(%)")
    private Double zcfzl;

    /** 权益乘数 */
    @Excel(name = "权益乘数")
    private Double qycs;

    /** 速动比率 */
    @Excel(name = "速动比率")
    private Double sd;

    /** 现金流量比率 */
    @Excel(name = "现金流量比率")
    private Double xjllb;

    /** 流动比率 */
    @Excel(name = "流动比率")
    private Double ld;

    /** 总资产周转天数(天) */
    @Excel(name = "总资产周转天数(天)")
    private Double zzczzts;

    /** 应收账款周转率(次) */
    @Excel(name = "应收账款周转率(次)")
    private Double yszkzzl;

    /** 应收账款周转天数(天) */
    @Excel(name = "应收账款周转天数(天)")
    private Double yszkzzts;

    /** 存货周转天数(天) */
    @Excel(name = "存货周转天数(天)")
    private Double chzzts;

    /** 存货周转率(次) */
    @Excel(name = "存货周转率(次)")
    private Double chzzl;

    /** 总资产周转率(次) */
    @Excel(name = "总资产周转率(次)")
    private Double toazzl;

    /** 预收账款/营业总收入 */
    @Excel(name = "预收账款/营业总收入")
    private Double yszkyysr;

    /** 融资融券业务风险准备(元) */
    @Excel(name = "融资融券业务风险准备(元)")
    private Double rzrqywfxzb;

    /** 自营固定收益类证券规模/净资产 */
    @Excel(name = "自营固定收益类证券规模/净资产")
    private Double zygdsylzqjzb;

    /** 存款总额(元) */
    @Excel(name = "存款总额(元)")
    private Double totaldeposits;

    /** 毛利润(元) */
    @Excel(name = "毛利润(元)")
    private Double mlr;

    /** 已赚保费(元) */
    @Excel(name = "已赚保费(元)")
    private Double earnedPremium;

    /** 净资本/净资产 */
    @Excel(name = "净资本/净资产")
    private Double jzbjzc;

    /** 实际税率(%) */
    @Excel(name = "实际税率(%)")
    private Double taxrate;

    /** 自营股票规模/净资产 */
    @Excel(name = "自营股票规模/净资产")
    private Double zygpgmjzc;

    /** 存贷款比例 */
    @Excel(name = "存贷款比例")
    private Double ltdrr;

    /** 偿付能力充足率(%) */
    @Excel(name = "偿付能力充足率(%)")
    private Double solvencyAr;

    /** 经纪业务风险准备(元) */
    @Excel(name = "经纪业务风险准备(元)")
    private Double jjywfxzb;

    /** 证券自营业务风险准备(元) */
    @Excel(name = "证券自营业务风险准备(元)")
    private Double zqzyywfxzb;

    /** 退保率(%) */
    @Excel(name = "退保率(%)")
    private Double surrenderRateLife;

    /** 经营净现金流/营业总收入 */
    @Excel(name = "经营净现金流/营业总收入")
    private Double jyxjlyysr;

    /** 资本净额(元) */
    @Excel(name = "资本净额(元)")
    private Double nzbje;

    /** 不良贷款率(%) */
    @Excel(name = "不良贷款率(%)")
    private Double nonperloan;

    /** 总投资收益率(%) */
    @Excel(name = "总投资收益率(%)")
    private Double totalRoi;

    /** 证券承销业务风险准备(元) */
    @Excel(name = "证券承销业务风险准备(元)")
    private Double zqcxywfxzb;

    /** 净投资收益率(%) */
    @Excel(name = "净投资收益率(%)")
    private Double netRoi;

    /** 贷款总额(元) */
    @Excel(name = "贷款总额(元)")
    private Double grossloans;

    /** 核心资本充足率(%) */
    @Excel(name = "核心资本充足率(%)")
    private Double hxyjbczl;

    /** 归属净利润同比增长(%) */
    @Excel(name = "归属净利润同比增长(%)")
    private Double parentnetprofittz;

    /** 赔付支出(元) */
    @Excel(name = "赔付支出(元)")
    private Double compensateExpense;

    /** 净资产(元) */
    @Excel(name = "净资产(元)")
    private Double jzc;

    /** 净资本(元) */
    @Excel(name = "净资本(元)")
    private Double jzb;

    /** 不良贷款拨备覆盖率(%) */
    @Excel(name = "不良贷款拨备覆盖率(%)")
    private Double bldkbbl;

    /** 资本充足率(%) */
    @Excel(name = "资本充足率(%)")
    private Double newcapitalader;

    /** 销售净现金流/营业总收入 */
    @Excel(name = "销售净现金流/营业总收入")
    private Double xsjxlyysr;

    /** 营运风险准备(元) */
    @Excel(name = "营运风险准备(元)")
    private Double yyfxzb;

    /** 1 */
    @Excel(name = "1")
    private Double zcfzltz;

    /** 1 */
    @Excel(name = "1")
    private Double nbvRate;

    /** 1 */
    @Excel(name = "1")
    private Double roejqtz;

    /** 1 */
    @Excel(name = "1")
    private Double djdDeductdpnpYoy;

    /** 1 */
    @Excel(name = "1")
    private Double bpstz;

    /** 1 */
    @Excel(name = "1")
    private Double roic;

    /** 1 */
    @Excel(name = "1")
    private Double roictz;

    /** 1 */
    @Excel(name = "1")
    private Double reportYear;

    /** 1 */
    @Excel(name = "1")
    private Double mgjyxjjetz;

    /** 1 */
    @Excel(name = "1")
    private Double djdDpnpYoy;

    /** 1 */
    @Excel(name = "1")
    private Double mgzbgjtz;

    /** 1 */
    @Excel(name = "1")
    private Double zzcjlltz;

    /** 1 */
    @Excel(name = "1")
    private Double djdDpnpQoq;

    /** 1 */
    @Excel(name = "1")
    private Double mgwfplrtz;

    /** 1 */
    @Excel(name = "1")
    private Double djdDeductdpnpQoq;

    /** 1 */
    @Excel(name = "1")
    private Double nbvLife;

    /** 1 */
    @Excel(name = "1")
    private Double nhjzCurrentAmt;

    /** 1 */
    @Excel(name = "1")
    private Double djdToiQoq;

    /** 1 */
    @Excel(name = "1")
    private Double djdToiYoy;

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
    public void setNoticeDate(Date noticeDate) 
    {
        this.noticeDate = noticeDate;
    }

    public Date getNoticeDate() 
    {
        return noticeDate;
    }
    public void setUpdateDate(Date updateDate) 
    {
        this.updateDate = updateDate;
    }

    public Date getUpdateDate() 
    {
        return updateDate;
    }
    public void setMgwfplr(Double mgwfplr) 
    {
        this.mgwfplr = mgwfplr;
    }

    public Double getMgwfplr() 
    {
        return mgwfplr;
    }
    public void setMgjyxjje(Double mgjyxjje) 
    {
        this.mgjyxjje = mgjyxjje;
    }

    public Double getMgjyxjje() 
    {
        return mgjyxjje;
    }
    public void setEpsxs(Double epsxs) 
    {
        this.epsxs = epsxs;
    }

    public Double getEpsxs() 
    {
        return epsxs;
    }
    public void setEpskcjb(Double epskcjb) 
    {
        this.epskcjb = epskcjb;
    }

    public Double getEpskcjb() 
    {
        return epskcjb;
    }
    public void setMgzbgj(Double mgzbgj) 
    {
        this.mgzbgj = mgzbgj;
    }

    public Double getMgzbgj() 
    {
        return mgzbgj;
    }
    public void setBps(Double bps) 
    {
        this.bps = bps;
    }

    public Double getBps() 
    {
        return bps;
    }
    public void setEpsjb(Double epsjb) 
    {
        this.epsjb = epsjb;
    }

    public Double getEpsjb() 
    {
        return epsjb;
    }
    public void setYyzsrgdhbzc(Double yyzsrgdhbzc) 
    {
        this.yyzsrgdhbzc = yyzsrgdhbzc;
    }

    public Double getYyzsrgdhbzc() 
    {
        return yyzsrgdhbzc;
    }
    public void setTotaloperatereve(Double totaloperatereve) 
    {
        this.totaloperatereve = totaloperatereve;
    }

    public Double getTotaloperatereve() 
    {
        return totaloperatereve;
    }
    public void setKfjlrgdhbzc(Double kfjlrgdhbzc) 
    {
        this.kfjlrgdhbzc = kfjlrgdhbzc;
    }

    public Double getKfjlrgdhbzc() 
    {
        return kfjlrgdhbzc;
    }
    public void setKcfjcxsyjlr(Double kcfjcxsyjlr) 
    {
        this.kcfjcxsyjlr = kcfjcxsyjlr;
    }

    public Double getKcfjcxsyjlr() 
    {
        return kcfjcxsyjlr;
    }
    public void setEpsjbtz(Double epsjbtz) 
    {
        this.epsjbtz = epsjbtz;
    }

    public Double getEpsjbtz() 
    {
        return epsjbtz;
    }
    public void setKcfjcxsyjlrtz(Double kcfjcxsyjlrtz) 
    {
        this.kcfjcxsyjlrtz = kcfjcxsyjlrtz;
    }

    public Double getKcfjcxsyjlrtz() 
    {
        return kcfjcxsyjlrtz;
    }
    public void setParentnetprofit(Double parentnetprofit) 
    {
        this.parentnetprofit = parentnetprofit;
    }

    public Double getParentnetprofit() 
    {
        return parentnetprofit;
    }
    public void setNetprofitrphbzc(Double netprofitrphbzc) 
    {
        this.netprofitrphbzc = netprofitrphbzc;
    }

    public Double getNetprofitrphbzc() 
    {
        return netprofitrphbzc;
    }
    public void setTotaloperaterevetz(Double totaloperaterevetz) 
    {
        this.totaloperaterevetz = totaloperaterevetz;
    }

    public Double getTotaloperaterevetz() 
    {
        return totaloperaterevetz;
    }
    public void setRoekcjq(Double roekcjq) 
    {
        this.roekcjq = roekcjq;
    }

    public Double getRoekcjq() 
    {
        return roekcjq;
    }
    public void setZzcjll(Double zzcjll) 
    {
        this.zzcjll = zzcjll;
    }

    public Double getZzcjll() 
    {
        return zzcjll;
    }
    public void setRoejq(Double roejq) 
    {
        this.roejq = roejq;
    }

    public Double getRoejq() 
    {
        return roejq;
    }
    public void setXsmll(Double xsmll) 
    {
        this.xsmll = xsmll;
    }

    public Double getXsmll() 
    {
        return xsmll;
    }
    public void setXsjll(Double xsjll) 
    {
        this.xsjll = xsjll;
    }

    public Double getXsjll() 
    {
        return xsjll;
    }
    public void setCqbl(Double cqbl) 
    {
        this.cqbl = cqbl;
    }

    public Double getCqbl() 
    {
        return cqbl;
    }
    public void setZcfzl(Double zcfzl) 
    {
        this.zcfzl = zcfzl;
    }

    public Double getZcfzl() 
    {
        return zcfzl;
    }
    public void setQycs(Double qycs) 
    {
        this.qycs = qycs;
    }

    public Double getQycs() 
    {
        return qycs;
    }
    public void setSd(Double sd) 
    {
        this.sd = sd;
    }

    public Double getSd() 
    {
        return sd;
    }
    public void setXjllb(Double xjllb) 
    {
        this.xjllb = xjllb;
    }

    public Double getXjllb() 
    {
        return xjllb;
    }
    public void setLd(Double ld) 
    {
        this.ld = ld;
    }

    public Double getLd() 
    {
        return ld;
    }
    public void setZzczzts(Double zzczzts) 
    {
        this.zzczzts = zzczzts;
    }

    public Double getZzczzts() 
    {
        return zzczzts;
    }
    public void setYszkzzl(Double yszkzzl) 
    {
        this.yszkzzl = yszkzzl;
    }

    public Double getYszkzzl() 
    {
        return yszkzzl;
    }
    public void setYszkzzts(Double yszkzzts) 
    {
        this.yszkzzts = yszkzzts;
    }

    public Double getYszkzzts() 
    {
        return yszkzzts;
    }
    public void setChzzts(Double chzzts) 
    {
        this.chzzts = chzzts;
    }

    public Double getChzzts() 
    {
        return chzzts;
    }
    public void setChzzl(Double chzzl) 
    {
        this.chzzl = chzzl;
    }

    public Double getChzzl() 
    {
        return chzzl;
    }
    public void setToazzl(Double toazzl) 
    {
        this.toazzl = toazzl;
    }

    public Double getToazzl() 
    {
        return toazzl;
    }
    public void setYszkyysr(Double yszkyysr) 
    {
        this.yszkyysr = yszkyysr;
    }

    public Double getYszkyysr() 
    {
        return yszkyysr;
    }
    public void setRzrqywfxzb(Double rzrqywfxzb) 
    {
        this.rzrqywfxzb = rzrqywfxzb;
    }

    public Double getRzrqywfxzb() 
    {
        return rzrqywfxzb;
    }
    public void setZygdsylzqjzb(Double zygdsylzqjzb) 
    {
        this.zygdsylzqjzb = zygdsylzqjzb;
    }

    public Double getZygdsylzqjzb() 
    {
        return zygdsylzqjzb;
    }
    public void setTotaldeposits(Double totaldeposits) 
    {
        this.totaldeposits = totaldeposits;
    }

    public Double getTotaldeposits() 
    {
        return totaldeposits;
    }
    public void setMlr(Double mlr) 
    {
        this.mlr = mlr;
    }

    public Double getMlr() 
    {
        return mlr;
    }
    public void setEarnedPremium(Double earnedPremium) 
    {
        this.earnedPremium = earnedPremium;
    }

    public Double getEarnedPremium() 
    {
        return earnedPremium;
    }
    public void setJzbjzc(Double jzbjzc) 
    {
        this.jzbjzc = jzbjzc;
    }

    public Double getJzbjzc() 
    {
        return jzbjzc;
    }
    public void setTaxrate(Double taxrate) 
    {
        this.taxrate = taxrate;
    }

    public Double getTaxrate() 
    {
        return taxrate;
    }
    public void setZygpgmjzc(Double zygpgmjzc) 
    {
        this.zygpgmjzc = zygpgmjzc;
    }

    public Double getZygpgmjzc() 
    {
        return zygpgmjzc;
    }
    public void setLtdrr(Double ltdrr) 
    {
        this.ltdrr = ltdrr;
    }

    public Double getLtdrr() 
    {
        return ltdrr;
    }
    public void setSolvencyAr(Double solvencyAr) 
    {
        this.solvencyAr = solvencyAr;
    }

    public Double getSolvencyAr() 
    {
        return solvencyAr;
    }
    public void setJjywfxzb(Double jjywfxzb) 
    {
        this.jjywfxzb = jjywfxzb;
    }

    public Double getJjywfxzb() 
    {
        return jjywfxzb;
    }
    public void setZqzyywfxzb(Double zqzyywfxzb) 
    {
        this.zqzyywfxzb = zqzyywfxzb;
    }

    public Double getZqzyywfxzb() 
    {
        return zqzyywfxzb;
    }
    public void setSurrenderRateLife(Double surrenderRateLife) 
    {
        this.surrenderRateLife = surrenderRateLife;
    }

    public Double getSurrenderRateLife() 
    {
        return surrenderRateLife;
    }
    public void setJyxjlyysr(Double jyxjlyysr) 
    {
        this.jyxjlyysr = jyxjlyysr;
    }

    public Double getJyxjlyysr() 
    {
        return jyxjlyysr;
    }
    public void setNzbje(Double nzbje) 
    {
        this.nzbje = nzbje;
    }

    public Double getNzbje() 
    {
        return nzbje;
    }
    public void setNonperloan(Double nonperloan) 
    {
        this.nonperloan = nonperloan;
    }

    public Double getNonperloan() 
    {
        return nonperloan;
    }
    public void setTotalRoi(Double totalRoi) 
    {
        this.totalRoi = totalRoi;
    }

    public Double getTotalRoi() 
    {
        return totalRoi;
    }
    public void setZqcxywfxzb(Double zqcxywfxzb) 
    {
        this.zqcxywfxzb = zqcxywfxzb;
    }

    public Double getZqcxywfxzb() 
    {
        return zqcxywfxzb;
    }
    public void setNetRoi(Double netRoi) 
    {
        this.netRoi = netRoi;
    }

    public Double getNetRoi() 
    {
        return netRoi;
    }
    public void setGrossloans(Double grossloans) 
    {
        this.grossloans = grossloans;
    }

    public Double getGrossloans() 
    {
        return grossloans;
    }
    public void setHxyjbczl(Double hxyjbczl) 
    {
        this.hxyjbczl = hxyjbczl;
    }

    public Double getHxyjbczl() 
    {
        return hxyjbczl;
    }
    public void setParentnetprofittz(Double parentnetprofittz) 
    {
        this.parentnetprofittz = parentnetprofittz;
    }

    public Double getParentnetprofittz() 
    {
        return parentnetprofittz;
    }
    public void setCompensateExpense(Double compensateExpense) 
    {
        this.compensateExpense = compensateExpense;
    }

    public Double getCompensateExpense() 
    {
        return compensateExpense;
    }
    public void setJzc(Double jzc) 
    {
        this.jzc = jzc;
    }

    public Double getJzc() 
    {
        return jzc;
    }
    public void setJzb(Double jzb) 
    {
        this.jzb = jzb;
    }

    public Double getJzb() 
    {
        return jzb;
    }
    public void setBldkbbl(Double bldkbbl) 
    {
        this.bldkbbl = bldkbbl;
    }

    public Double getBldkbbl() 
    {
        return bldkbbl;
    }
    public void setNewcapitalader(Double newcapitalader) 
    {
        this.newcapitalader = newcapitalader;
    }

    public Double getNewcapitalader() 
    {
        return newcapitalader;
    }
    public void setXsjxlyysr(Double xsjxlyysr) 
    {
        this.xsjxlyysr = xsjxlyysr;
    }

    public Double getXsjxlyysr() 
    {
        return xsjxlyysr;
    }
    public void setYyfxzb(Double yyfxzb) 
    {
        this.yyfxzb = yyfxzb;
    }

    public Double getYyfxzb() 
    {
        return yyfxzb;
    }
    public void setZcfzltz(Double zcfzltz) 
    {
        this.zcfzltz = zcfzltz;
    }

    public Double getZcfzltz() 
    {
        return zcfzltz;
    }
    public void setNbvRate(Double nbvRate) 
    {
        this.nbvRate = nbvRate;
    }

    public Double getNbvRate() 
    {
        return nbvRate;
    }
    public void setRoejqtz(Double roejqtz) 
    {
        this.roejqtz = roejqtz;
    }

    public Double getRoejqtz() 
    {
        return roejqtz;
    }
    public void setDjdDeductdpnpYoy(Double djdDeductdpnpYoy) 
    {
        this.djdDeductdpnpYoy = djdDeductdpnpYoy;
    }

    public Double getDjdDeductdpnpYoy() 
    {
        return djdDeductdpnpYoy;
    }
    public void setBpstz(Double bpstz) 
    {
        this.bpstz = bpstz;
    }

    public Double getBpstz() 
    {
        return bpstz;
    }
    public void setRoic(Double roic) 
    {
        this.roic = roic;
    }

    public Double getRoic() 
    {
        return roic;
    }
    public void setRoictz(Double roictz) 
    {
        this.roictz = roictz;
    }

    public Double getRoictz() 
    {
        return roictz;
    }
    public void setReportYear(Double reportYear) 
    {
        this.reportYear = reportYear;
    }

    public Double getReportYear() 
    {
        return reportYear;
    }
    public void setMgjyxjjetz(Double mgjyxjjetz) 
    {
        this.mgjyxjjetz = mgjyxjjetz;
    }

    public Double getMgjyxjjetz() 
    {
        return mgjyxjjetz;
    }
    public void setDjdDpnpYoy(Double djdDpnpYoy) 
    {
        this.djdDpnpYoy = djdDpnpYoy;
    }

    public Double getDjdDpnpYoy() 
    {
        return djdDpnpYoy;
    }
    public void setMgzbgjtz(Double mgzbgjtz) 
    {
        this.mgzbgjtz = mgzbgjtz;
    }

    public Double getMgzbgjtz() 
    {
        return mgzbgjtz;
    }
    public void setZzcjlltz(Double zzcjlltz) 
    {
        this.zzcjlltz = zzcjlltz;
    }

    public Double getZzcjlltz() 
    {
        return zzcjlltz;
    }
    public void setDjdDpnpQoq(Double djdDpnpQoq) 
    {
        this.djdDpnpQoq = djdDpnpQoq;
    }

    public Double getDjdDpnpQoq() 
    {
        return djdDpnpQoq;
    }
    public void setMgwfplrtz(Double mgwfplrtz) 
    {
        this.mgwfplrtz = mgwfplrtz;
    }

    public Double getMgwfplrtz() 
    {
        return mgwfplrtz;
    }
    public void setDjdDeductdpnpQoq(Double djdDeductdpnpQoq) 
    {
        this.djdDeductdpnpQoq = djdDeductdpnpQoq;
    }

    public Double getDjdDeductdpnpQoq() 
    {
        return djdDeductdpnpQoq;
    }
    public void setNbvLife(Double nbvLife) 
    {
        this.nbvLife = nbvLife;
    }

    public Double getNbvLife() 
    {
        return nbvLife;
    }
    public void setNhjzCurrentAmt(Double nhjzCurrentAmt) 
    {
        this.nhjzCurrentAmt = nhjzCurrentAmt;
    }

    public Double getNhjzCurrentAmt() 
    {
        return nhjzCurrentAmt;
    }
    public void setDjdToiQoq(Double djdToiQoq) 
    {
        this.djdToiQoq = djdToiQoq;
    }

    public Double getDjdToiQoq() 
    {
        return djdToiQoq;
    }
    public void setDjdToiYoy(Double djdToiYoy) 
    {
        this.djdToiYoy = djdToiYoy;
    }

    public Double getDjdToiYoy() 
    {
        return djdToiYoy;
    }

    public InvFinanceZyzbYear() {
        super();
    }

    public InvFinanceZyzbYear(String securityCode) {
        this.securityCode = securityCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvFinanceZyzbYear)) return false;
        InvFinanceZyzbYear that = (InvFinanceZyzbYear) o;
        return Objects.equals(id, that.id) && Objects.equals(securityCode, that.securityCode) && Objects.equals(reportDate, that.reportDate) && Objects.equals(noticeDate, that.noticeDate) && Objects.equals(updateDate, that.updateDate) && Objects.equals(mgwfplr, that.mgwfplr) && Objects.equals(mgjyxjje, that.mgjyxjje) && Objects.equals(epsxs, that.epsxs) && Objects.equals(epskcjb, that.epskcjb) && Objects.equals(mgzbgj, that.mgzbgj) && Objects.equals(bps, that.bps) && Objects.equals(epsjb, that.epsjb) && Objects.equals(yyzsrgdhbzc, that.yyzsrgdhbzc) && Objects.equals(totaloperatereve, that.totaloperatereve) && Objects.equals(kfjlrgdhbzc, that.kfjlrgdhbzc) && Objects.equals(kcfjcxsyjlr, that.kcfjcxsyjlr) && Objects.equals(epsjbtz, that.epsjbtz) && Objects.equals(kcfjcxsyjlrtz, that.kcfjcxsyjlrtz) && Objects.equals(parentnetprofit, that.parentnetprofit) && Objects.equals(netprofitrphbzc, that.netprofitrphbzc) && Objects.equals(totaloperaterevetz, that.totaloperaterevetz) && Objects.equals(roekcjq, that.roekcjq) && Objects.equals(zzcjll, that.zzcjll) && Objects.equals(roejq, that.roejq) && Objects.equals(xsmll, that.xsmll) && Objects.equals(xsjll, that.xsjll) && Objects.equals(cqbl, that.cqbl) && Objects.equals(zcfzl, that.zcfzl) && Objects.equals(qycs, that.qycs) && Objects.equals(sd, that.sd) && Objects.equals(xjllb, that.xjllb) && Objects.equals(ld, that.ld) && Objects.equals(zzczzts, that.zzczzts) && Objects.equals(yszkzzl, that.yszkzzl) && Objects.equals(yszkzzts, that.yszkzzts) && Objects.equals(chzzts, that.chzzts) && Objects.equals(chzzl, that.chzzl) && Objects.equals(toazzl, that.toazzl) && Objects.equals(yszkyysr, that.yszkyysr) && Objects.equals(rzrqywfxzb, that.rzrqywfxzb) && Objects.equals(zygdsylzqjzb, that.zygdsylzqjzb) && Objects.equals(totaldeposits, that.totaldeposits) && Objects.equals(mlr, that.mlr) && Objects.equals(earnedPremium, that.earnedPremium) && Objects.equals(jzbjzc, that.jzbjzc) && Objects.equals(taxrate, that.taxrate) && Objects.equals(zygpgmjzc, that.zygpgmjzc) && Objects.equals(ltdrr, that.ltdrr) && Objects.equals(solvencyAr, that.solvencyAr) && Objects.equals(jjywfxzb, that.jjywfxzb) && Objects.equals(zqzyywfxzb, that.zqzyywfxzb) && Objects.equals(surrenderRateLife, that.surrenderRateLife) && Objects.equals(jyxjlyysr, that.jyxjlyysr) && Objects.equals(nzbje, that.nzbje) && Objects.equals(nonperloan, that.nonperloan) && Objects.equals(totalRoi, that.totalRoi) && Objects.equals(zqcxywfxzb, that.zqcxywfxzb) && Objects.equals(netRoi, that.netRoi) && Objects.equals(grossloans, that.grossloans) && Objects.equals(hxyjbczl, that.hxyjbczl) && Objects.equals(parentnetprofittz, that.parentnetprofittz) && Objects.equals(compensateExpense, that.compensateExpense) && Objects.equals(jzc, that.jzc) && Objects.equals(jzb, that.jzb) && Objects.equals(bldkbbl, that.bldkbbl) && Objects.equals(newcapitalader, that.newcapitalader) && Objects.equals(xsjxlyysr, that.xsjxlyysr) && Objects.equals(yyfxzb, that.yyfxzb) && Objects.equals(zcfzltz, that.zcfzltz) && Objects.equals(nbvRate, that.nbvRate) && Objects.equals(roejqtz, that.roejqtz) && Objects.equals(djdDeductdpnpYoy, that.djdDeductdpnpYoy) && Objects.equals(bpstz, that.bpstz) && Objects.equals(roic, that.roic) && Objects.equals(roictz, that.roictz) && Objects.equals(reportYear, that.reportYear) && Objects.equals(mgjyxjjetz, that.mgjyxjjetz) && Objects.equals(djdDpnpYoy, that.djdDpnpYoy) && Objects.equals(mgzbgjtz, that.mgzbgjtz) && Objects.equals(zzcjlltz, that.zzcjlltz) && Objects.equals(djdDpnpQoq, that.djdDpnpQoq) && Objects.equals(mgwfplrtz, that.mgwfplrtz) && Objects.equals(djdDeductdpnpQoq, that.djdDeductdpnpQoq) && Objects.equals(nbvLife, that.nbvLife) && Objects.equals(nhjzCurrentAmt, that.nhjzCurrentAmt) && Objects.equals(djdToiQoq, that.djdToiQoq) && Objects.equals(djdToiYoy, that.djdToiYoy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, securityCode, reportDate, noticeDate, updateDate, mgwfplr, mgjyxjje, epsxs, epskcjb, mgzbgj, bps, epsjb, yyzsrgdhbzc, totaloperatereve, kfjlrgdhbzc, kcfjcxsyjlr, epsjbtz, kcfjcxsyjlrtz, parentnetprofit, netprofitrphbzc, totaloperaterevetz, roekcjq, zzcjll, roejq, xsmll, xsjll, cqbl, zcfzl, qycs, sd, xjllb, ld, zzczzts, yszkzzl, yszkzzts, chzzts, chzzl, toazzl, yszkyysr, rzrqywfxzb, zygdsylzqjzb, totaldeposits, mlr, earnedPremium, jzbjzc, taxrate, zygpgmjzc, ltdrr, solvencyAr, jjywfxzb, zqzyywfxzb, surrenderRateLife, jyxjlyysr, nzbje, nonperloan, totalRoi, zqcxywfxzb, netRoi, grossloans, hxyjbczl, parentnetprofittz, compensateExpense, jzc, jzb, bldkbbl, newcapitalader, xsjxlyysr, yyfxzb, zcfzltz, nbvRate, roejqtz, djdDeductdpnpYoy, bpstz, roic, roictz, reportYear, mgjyxjjetz, djdDpnpYoy, mgzbgjtz, zzcjlltz, djdDpnpQoq, mgwfplrtz, djdDeductdpnpQoq, nbvLife, nhjzCurrentAmt, djdToiQoq, djdToiYoy);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("securityCode", getSecurityCode())
            .append("reportDate", getReportDate())
            .append("noticeDate", getNoticeDate())
            .append("updateDate", getUpdateDate())
            .append("mgwfplr", getMgwfplr())
            .append("mgjyxjje", getMgjyxjje())
            .append("epsxs", getEpsxs())
            .append("epskcjb", getEpskcjb())
            .append("mgzbgj", getMgzbgj())
            .append("bps", getBps())
            .append("epsjb", getEpsjb())
            .append("yyzsrgdhbzc", getYyzsrgdhbzc())
            .append("totaloperatereve", getTotaloperatereve())
            .append("kfjlrgdhbzc", getKfjlrgdhbzc())
            .append("kcfjcxsyjlr", getKcfjcxsyjlr())
            .append("epsjbtz", getEpsjbtz())
            .append("kcfjcxsyjlrtz", getKcfjcxsyjlrtz())
            .append("parentnetprofit", getParentnetprofit())
            .append("netprofitrphbzc", getNetprofitrphbzc())
            .append("totaloperaterevetz", getTotaloperaterevetz())
            .append("roekcjq", getRoekcjq())
            .append("zzcjll", getZzcjll())
            .append("roejq", getRoejq())
            .append("xsmll", getXsmll())
            .append("xsjll", getXsjll())
            .append("cqbl", getCqbl())
            .append("zcfzl", getZcfzl())
            .append("qycs", getQycs())
            .append("sd", getSd())
            .append("xjllb", getXjllb())
            .append("ld", getLd())
            .append("zzczzts", getZzczzts())
            .append("yszkzzl", getYszkzzl())
            .append("yszkzzts", getYszkzzts())
            .append("chzzts", getChzzts())
            .append("chzzl", getChzzl())
            .append("toazzl", getToazzl())
            .append("yszkyysr", getYszkyysr())
            .append("rzrqywfxzb", getRzrqywfxzb())
            .append("zygdsylzqjzb", getZygdsylzqjzb())
            .append("totaldeposits", getTotaldeposits())
            .append("mlr", getMlr())
            .append("earnedPremium", getEarnedPremium())
            .append("jzbjzc", getJzbjzc())
            .append("taxrate", getTaxrate())
            .append("zygpgmjzc", getZygpgmjzc())
            .append("ltdrr", getLtdrr())
            .append("solvencyAr", getSolvencyAr())
            .append("jjywfxzb", getJjywfxzb())
            .append("zqzyywfxzb", getZqzyywfxzb())
            .append("surrenderRateLife", getSurrenderRateLife())
            .append("jyxjlyysr", getJyxjlyysr())
            .append("nzbje", getNzbje())
            .append("nonperloan", getNonperloan())
            .append("totalRoi", getTotalRoi())
            .append("zqcxywfxzb", getZqcxywfxzb())
            .append("netRoi", getNetRoi())
            .append("grossloans", getGrossloans())
            .append("hxyjbczl", getHxyjbczl())
            .append("parentnetprofittz", getParentnetprofittz())
            .append("compensateExpense", getCompensateExpense())
            .append("jzc", getJzc())
            .append("jzb", getJzb())
            .append("bldkbbl", getBldkbbl())
            .append("newcapitalader", getNewcapitalader())
            .append("xsjxlyysr", getXsjxlyysr())
            .append("yyfxzb", getYyfxzb())
            .append("zcfzltz", getZcfzltz())
            .append("nbvRate", getNbvRate())
            .append("roejqtz", getRoejqtz())
            .append("djdDeductdpnpYoy", getDjdDeductdpnpYoy())
            .append("bpstz", getBpstz())
            .append("roic", getRoic())
            .append("roictz", getRoictz())
            .append("reportYear", getReportYear())
            .append("mgjyxjjetz", getMgjyxjjetz())
            .append("djdDpnpYoy", getDjdDpnpYoy())
            .append("mgzbgjtz", getMgzbgjtz())
            .append("zzcjlltz", getZzcjlltz())
            .append("djdDpnpQoq", getDjdDpnpQoq())
            .append("mgwfplrtz", getMgwfplrtz())
            .append("djdDeductdpnpQoq", getDjdDeductdpnpQoq())
            .append("nbvLife", getNbvLife())
            .append("nhjzCurrentAmt", getNhjzCurrentAmt())
            .append("djdToiQoq", getDjdToiQoq())
            .append("djdToiYoy", getDjdToiYoy())
            .toString();
    }
}
