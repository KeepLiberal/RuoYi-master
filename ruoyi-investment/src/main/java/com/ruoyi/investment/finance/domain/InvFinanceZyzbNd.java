package com.ruoyi.investment.finance.domain;

import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 财务分析-重要指标-年度对象 inv_finance_zyzb_nd
 * 
 * @author yangwenyang
 * @date 2022-11-11
 */
public class InvFinanceZyzbNd extends BaseEntity{
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

    /** 净利率(%) */
    @Excel(name = "净利率(%)")
    private Double xsjll;

    /** 毛利润(元) */
    @Excel(name = "毛利润(元)")
    private Double mlr;

    /** 扣非净利润(元) */
    @Excel(name = "扣非净利润(元)")
    private Double kcfjcxsyjlr;

    /** 已赚保费(元) */
    @Excel(name = "已赚保费(元)")
    private Double earnedPremium;

    /** 净资本/净资产 */
    @Excel(name = "净资本/净资产")
    private Double jzbjzc;

    /** 总资产周转天数(天) */
    @Excel(name = "总资产周转天数(天)")
    private Double zzczzts;

    /** 每股未分配利润(元) */
    @Excel(name = "每股未分配利润(元)")
    private Double mgwfplr;

    /** 实际税率(%) */
    @Excel(name = "实际税率(%)")
    private Double taxrate;

    /** 应收账款周转率(次) */
    @Excel(name = "应收账款周转率(次)")
    private Double yszkzzl;

    /** 产权比率 */
    @Excel(name = "产权比率")
    private Double cqbl;

    /** 自营股票规模/净资产 */
    @Excel(name = "自营股票规模/净资产")
    private Double zygpgmjzc;

    /** 扣非净利润滚动环比增长(%) */
    @Excel(name = "扣非净利润滚动环比增长(%)")
    private Double kfjlrgdhbzc;

    /** 存贷款比例 */
    @Excel(name = "存贷款比例")
    private Double ltdrr;

    /** 偿付能力充足率(%) */
    @Excel(name = "偿付能力充足率(%)")
    private Double solvencyAr;

    /** 基本每股收益(元) */
    @Excel(name = "基本每股收益(元)")
    private Double epsjb;

    /** 经纪业务风险准备(元) */
    @Excel(name = "经纪业务风险准备(元)")
    private Double jjywfxzb;

    /** 证券自营业务风险准备(元) */
    @Excel(name = "证券自营业务风险准备(元)")
    private Double zqzyywfxzb;

    /** 净资产收益率(扣非/加权)(%) */
    @Excel(name = "净资产收益率(扣非/加权)(%)")
    private Double roekcjq;

    /** 退保率(%) */
    @Excel(name = "退保率(%)")
    private Double surrenderRateLife;

    /** 营业总收入滚动环比增长(%) */
    @Excel(name = "营业总收入滚动环比增长(%)")
    private Double yyzsrgdhbzc;

    /** 资产负债率(%) */
    @Excel(name = "资产负债率(%)")
    private Double zcfzl;

    /** 经营净现金流/营业总收入 */
    @Excel(name = "经营净现金流/营业总收入")
    private Double jyxjlyysr;

    /** 权益乘数 */
    @Excel(name = "权益乘数")
    private Double qycs;

    /** 总资产收益率(加权)(%) */
    @Excel(name = "总资产收益率(加权)(%)")
    private Double zzcjll;

    /** 每股净资产(元) */
    @Excel(name = "每股净资产(元)")
    private Double bps;

    /** 资本净额(元) */
    @Excel(name = "资本净额(元)")
    private Double nzbje;

    /** 净资产收益率(加权)(%) */
    @Excel(name = "净资产收益率(加权)(%)")
    private Double roejq;

    /** 应收账款周转天数(天) */
    @Excel(name = "应收账款周转天数(天)")
    private Double yszkzzts;

    /** 毛利率(%) */
    @Excel(name = "毛利率(%)")
    private Double xsmll;

    /** 扣非净利润同比增长(%) */
    @Excel(name = "扣非净利润同比增长(%)")
    private Double kcfjcxsyjlrtz;

    /** 营业总收入(元) */
    @Excel(name = "营业总收入(元)")
    private Double totaloperatereve;

    /** 速动比率 */
    @Excel(name = "速动比率")
    private Double sd;

    /** 存货周转天数(天) */
    @Excel(name = "存货周转天数(天)")
    private Double chzzts;

    /** 每股公积金(元) */
    @Excel(name = "每股公积金(元)")
    private Double mgzbgj;

    /** 归属净利润(元) */
    @Excel(name = "归属净利润(元)")
    private Double parentnetprofit;

    /** 不良贷款率(%) */
    @Excel(name = "不良贷款率(%)")
    private Double nonperloan;

    /** 总投资收益率(%) */
    @Excel(name = "总投资收益率(%)")
    private Double totalRoi;

    /** 证券承销业务风险准备(元) */
    @Excel(name = "证券承销业务风险准备(元)")
    private Double zqcxywfxzb;

    /** 存货周转率(次) */
    @Excel(name = "存货周转率(次)")
    private Double chzzl;

    /** 净投资收益率(%) */
    @Excel(name = "净投资收益率(%)")
    private Double netRoi;

    /** 贷款总额(元) */
    @Excel(name = "贷款总额(元)")
    private Double grossloans;

    /** 扣非每股收益(元) */
    @Excel(name = "扣非每股收益(元)")
    private Double epskcjb;

    /** 归属净利润滚动环比增长(%) */
    @Excel(name = "归属净利润滚动环比增长(%)")
    private Double netprofitrphbzc;

    /** 核心资本充足率(%) */
    @Excel(name = "核心资本充足率(%)")
    private Double hxyjbczl;

    /** 归属净利润同比增长(%) */
    @Excel(name = "归属净利润同比增长(%)")
    private Double parentnetprofittz;

    /** 总资产周转率(次) */
    @Excel(name = "总资产周转率(次)")
    private Double toazzl;

    /** 营业总收入同比增长(%) */
    @Excel(name = "营业总收入同比增长(%)")
    private Double totaloperaterevetz;

    /** 稀释每股收益(元) */
    @Excel(name = "稀释每股收益(元)")
    private Double epsxs;

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

    /** 流动比率 */
    @Excel(name = "流动比率")
    private Double ld;

    /** 资本充足率(%) */
    @Excel(name = "资本充足率(%)")
    private Double newcapitalader;

    /** 销售净现金流/营业总收入 */
    @Excel(name = "销售净现金流/营业总收入")
    private Double xsjxlyysr;

    /** 每股经营现金流(元) */
    @Excel(name = "每股经营现金流(元)")
    private Double mgjyxjje;

    /** 营运风险准备(元) */
    @Excel(name = "营运风险准备(元)")
    private Double yyfxzb;

    /** 现金流量比率 */
    @Excel(name = "现金流量比率")
    private Double xjllb;

    /** 归属净利润同比增长(%) */
    @Excel(name = "归属净利润同比增长(%)")
    private Double epsjbtz;

    public void setId(Long id){this.id = id;}
    public Long getId(){return id;}

    public void setSecurityCode(String securityCode){this.securityCode = securityCode;}
    public String getSecurityCode(){return securityCode;}

    public void setReportDate(Date reportDate){this.reportDate = reportDate;}
    public Date getReportDate(){return reportDate;}

    public void setYszkyysr(Double yszkyysr){this.yszkyysr = yszkyysr;}
    public Double getYszkyysr(){return yszkyysr;}

    public void setRzrqywfxzb(Double rzrqywfxzb){this.rzrqywfxzb = rzrqywfxzb;}
    public Double getRzrqywfxzb(){return rzrqywfxzb;}

    public void setZygdsylzqjzb(Double zygdsylzqjzb){this.zygdsylzqjzb = zygdsylzqjzb;}
    public Double getZygdsylzqjzb(){return zygdsylzqjzb;}

    public void setTotaldeposits(Double totaldeposits){this.totaldeposits = totaldeposits;}
    public Double getTotaldeposits(){return totaldeposits;}

    public void setXsjll(Double xsjll){this.xsjll = xsjll;}
    public Double getXsjll(){return xsjll;}

    public void setMlr(Double mlr){this.mlr = mlr;}
    public Double getMlr(){return mlr;}

    public void setKcfjcxsyjlr(Double kcfjcxsyjlr){this.kcfjcxsyjlr = kcfjcxsyjlr;}
    public Double getKcfjcxsyjlr(){return kcfjcxsyjlr;}

    public void setEarnedPremium(Double earnedPremium){this.earnedPremium = earnedPremium;}
    public Double getEarnedPremium(){return earnedPremium;}

    public void setJzbjzc(Double jzbjzc){this.jzbjzc = jzbjzc;}
    public Double getJzbjzc(){return jzbjzc;}

    public void setZzczzts(Double zzczzts){this.zzczzts = zzczzts;}
    public Double getZzczzts(){return zzczzts;}

    public void setMgwfplr(Double mgwfplr){this.mgwfplr = mgwfplr;}
    public Double getMgwfplr(){return mgwfplr;}

    public void setTaxrate(Double taxrate){this.taxrate = taxrate;}
    public Double getTaxrate(){return taxrate;}

    public void setYszkzzl(Double yszkzzl){this.yszkzzl = yszkzzl;}
    public Double getYszkzzl(){return yszkzzl;}

    public void setCqbl(Double cqbl){this.cqbl = cqbl;}
    public Double getCqbl(){return cqbl;}

    public void setZygpgmjzc(Double zygpgmjzc){this.zygpgmjzc = zygpgmjzc;}
    public Double getZygpgmjzc(){return zygpgmjzc;}

    public void setKfjlrgdhbzc(Double kfjlrgdhbzc){this.kfjlrgdhbzc = kfjlrgdhbzc;}
    public Double getKfjlrgdhbzc(){return kfjlrgdhbzc;}

    public void setLtdrr(Double ltdrr){this.ltdrr = ltdrr;}
    public Double getLtdrr(){return ltdrr;}

    public void setSolvencyAr(Double solvencyAr){this.solvencyAr = solvencyAr;}
    public Double getSolvencyAr(){return solvencyAr;}

    public void setEpsjb(Double epsjb){this.epsjb = epsjb;}
    public Double getEpsjb(){return epsjb;}

    public void setJjywfxzb(Double jjywfxzb){this.jjywfxzb = jjywfxzb;}
    public Double getJjywfxzb(){return jjywfxzb;}

    public void setZqzyywfxzb(Double zqzyywfxzb){this.zqzyywfxzb = zqzyywfxzb;}
    public Double getZqzyywfxzb(){return zqzyywfxzb;}

    public void setRoekcjq(Double roekcjq){this.roekcjq = roekcjq;}
    public Double getRoekcjq(){return roekcjq;}

    public void setSurrenderRateLife(Double surrenderRateLife){this.surrenderRateLife = surrenderRateLife;}
    public Double getSurrenderRateLife(){return surrenderRateLife;}

    public void setYyzsrgdhbzc(Double yyzsrgdhbzc){this.yyzsrgdhbzc = yyzsrgdhbzc;}
    public Double getYyzsrgdhbzc(){return yyzsrgdhbzc;}

    public void setZcfzl(Double zcfzl){this.zcfzl = zcfzl;}
    public Double getZcfzl(){return zcfzl;}

    public void setJyxjlyysr(Double jyxjlyysr){this.jyxjlyysr = jyxjlyysr;}
    public Double getJyxjlyysr(){return jyxjlyysr;}

    public void setQycs(Double qycs){this.qycs = qycs;}
    public Double getQycs(){return qycs;}

    public void setZzcjll(Double zzcjll){this.zzcjll = zzcjll;}
    public Double getZzcjll(){return zzcjll;}

    public void setBps(Double bps){this.bps = bps;}
    public Double getBps(){return bps;}

    public void setNzbje(Double nzbje){this.nzbje = nzbje;}
    public Double getNzbje(){return nzbje;}

    public void setRoejq(Double roejq){this.roejq = roejq;}
    public Double getRoejq(){return roejq;}

    public void setYszkzzts(Double yszkzzts){this.yszkzzts = yszkzzts;}
    public Double getYszkzzts(){return yszkzzts;}

    public void setXsmll(Double xsmll){this.xsmll = xsmll;}
    public Double getXsmll(){return xsmll;}

    public void setKcfjcxsyjlrtz(Double kcfjcxsyjlrtz){this.kcfjcxsyjlrtz = kcfjcxsyjlrtz;}
    public Double getKcfjcxsyjlrtz(){return kcfjcxsyjlrtz;}

    public void setTotaloperatereve(Double totaloperatereve){this.totaloperatereve = totaloperatereve;}
    public Double getTotaloperatereve(){return totaloperatereve;}

    public void setSd(Double sd){this.sd = sd;}
    public Double getSd(){return sd;}

    public void setChzzts(Double chzzts){this.chzzts = chzzts;}
    public Double getChzzts(){return chzzts;}

    public void setMgzbgj(Double mgzbgj){this.mgzbgj = mgzbgj;}
    public Double getMgzbgj(){return mgzbgj;}

    public void setParentnetprofit(Double parentnetprofit){this.parentnetprofit = parentnetprofit;}
    public Double getParentnetprofit(){return parentnetprofit;}

    public void setNonperloan(Double nonperloan){this.nonperloan = nonperloan;}
    public Double getNonperloan(){return nonperloan;}

    public void setTotalRoi(Double totalRoi){this.totalRoi = totalRoi;}
    public Double getTotalRoi(){return totalRoi;}

    public void setZqcxywfxzb(Double zqcxywfxzb){this.zqcxywfxzb = zqcxywfxzb;}
    public Double getZqcxywfxzb(){return zqcxywfxzb;}

    public void setChzzl(Double chzzl){this.chzzl = chzzl;}
    public Double getChzzl(){return chzzl;}

    public void setNetRoi(Double netRoi){this.netRoi = netRoi;}
    public Double getNetRoi(){return netRoi;}

    public void setGrossloans(Double grossloans){this.grossloans = grossloans;}
    public Double getGrossloans(){return grossloans;}

    public void setEpskcjb(Double epskcjb){this.epskcjb = epskcjb;}
    public Double getEpskcjb(){return epskcjb;}

    public void setNetprofitrphbzc(Double netprofitrphbzc){this.netprofitrphbzc = netprofitrphbzc;}
    public Double getNetprofitrphbzc(){return netprofitrphbzc;}

    public void setHxyjbczl(Double hxyjbczl){this.hxyjbczl = hxyjbczl;}
    public Double getHxyjbczl(){return hxyjbczl;}

    public void setParentnetprofittz(Double parentnetprofittz){this.parentnetprofittz = parentnetprofittz;}
    public Double getParentnetprofittz(){return parentnetprofittz;}

    public void setToazzl(Double toazzl){this.toazzl = toazzl;}
    public Double getToazzl(){return toazzl;}

    public void setTotaloperaterevetz(Double totaloperaterevetz){this.totaloperaterevetz = totaloperaterevetz;}
    public Double getTotaloperaterevetz(){return totaloperaterevetz;}

    public void setEpsxs(Double epsxs){this.epsxs = epsxs;}
    public Double getEpsxs(){return epsxs;}

    public void setCompensateExpense(Double compensateExpense){this.compensateExpense = compensateExpense;}
    public Double getCompensateExpense(){return compensateExpense;}

    public void setJzc(Double jzc){this.jzc = jzc;}
    public Double getJzc(){return jzc;}

    public void setJzb(Double jzb){this.jzb = jzb;}
    public Double getJzb(){return jzb;}

    public void setBldkbbl(Double bldkbbl){this.bldkbbl = bldkbbl;}
    public Double getBldkbbl(){return bldkbbl;}

    public void setLd(Double ld){this.ld = ld;}
    public Double getLd(){return ld;}

    public void setNewcapitalader(Double newcapitalader){this.newcapitalader = newcapitalader;}
    public Double getNewcapitalader(){return newcapitalader;}

    public void setXsjxlyysr(Double xsjxlyysr){this.xsjxlyysr = xsjxlyysr;}
    public Double getXsjxlyysr(){return xsjxlyysr;}

    public void setMgjyxjje(Double mgjyxjje){this.mgjyxjje = mgjyxjje;}
    public Double getMgjyxjje(){return mgjyxjje;}

    public void setYyfxzb(Double yyfxzb){this.yyfxzb = yyfxzb;}
    public Double getYyfxzb(){return yyfxzb;}

    public void setXjllb(Double xjllb){this.xjllb = xjllb;}
    public Double getXjllb(){return xjllb;}

    public void setEpsjbtz(Double epsjbtz){this.epsjbtz = epsjbtz;}
    public Double getEpsjbtz(){return epsjbtz;}

    public InvFinanceZyzbNd() {
        super();
    }

    public InvFinanceZyzbNd(String securityCode) {
        this.securityCode = securityCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvFinanceZyzbNd)) return false;
        InvFinanceZyzbNd that = (InvFinanceZyzbNd) o;
        return Objects.equals(securityCode, that.securityCode) && Objects.equals(reportDate, that.reportDate) && Objects.equals(yszkyysr, that.yszkyysr) && Objects.equals(rzrqywfxzb, that.rzrqywfxzb) && Objects.equals(zygdsylzqjzb, that.zygdsylzqjzb) && Objects.equals(totaldeposits, that.totaldeposits) && Objects.equals(xsjll, that.xsjll) && Objects.equals(mlr, that.mlr) && Objects.equals(kcfjcxsyjlr, that.kcfjcxsyjlr) && Objects.equals(earnedPremium, that.earnedPremium) && Objects.equals(jzbjzc, that.jzbjzc) && Objects.equals(zzczzts, that.zzczzts) && Objects.equals(mgwfplr, that.mgwfplr) && Objects.equals(taxrate, that.taxrate) && Objects.equals(yszkzzl, that.yszkzzl) && Objects.equals(cqbl, that.cqbl) && Objects.equals(zygpgmjzc, that.zygpgmjzc) && Objects.equals(kfjlrgdhbzc, that.kfjlrgdhbzc) && Objects.equals(ltdrr, that.ltdrr) && Objects.equals(solvencyAr, that.solvencyAr) && Objects.equals(epsjb, that.epsjb) && Objects.equals(jjywfxzb, that.jjywfxzb) && Objects.equals(zqzyywfxzb, that.zqzyywfxzb) && Objects.equals(roekcjq, that.roekcjq) && Objects.equals(surrenderRateLife, that.surrenderRateLife) && Objects.equals(yyzsrgdhbzc, that.yyzsrgdhbzc) && Objects.equals(zcfzl, that.zcfzl) && Objects.equals(jyxjlyysr, that.jyxjlyysr) && Objects.equals(qycs, that.qycs) && Objects.equals(zzcjll, that.zzcjll) && Objects.equals(bps, that.bps) && Objects.equals(nzbje, that.nzbje) && Objects.equals(roejq, that.roejq) && Objects.equals(yszkzzts, that.yszkzzts) && Objects.equals(xsmll, that.xsmll) && Objects.equals(kcfjcxsyjlrtz, that.kcfjcxsyjlrtz) && Objects.equals(totaloperatereve, that.totaloperatereve) && Objects.equals(sd, that.sd) && Objects.equals(chzzts, that.chzzts) && Objects.equals(mgzbgj, that.mgzbgj) && Objects.equals(parentnetprofit, that.parentnetprofit) && Objects.equals(nonperloan, that.nonperloan) && Objects.equals(totalRoi, that.totalRoi) && Objects.equals(zqcxywfxzb, that.zqcxywfxzb) && Objects.equals(chzzl, that.chzzl) && Objects.equals(netRoi, that.netRoi) && Objects.equals(grossloans, that.grossloans) && Objects.equals(epskcjb, that.epskcjb) && Objects.equals(netprofitrphbzc, that.netprofitrphbzc) && Objects.equals(hxyjbczl, that.hxyjbczl) && Objects.equals(parentnetprofittz, that.parentnetprofittz) && Objects.equals(toazzl, that.toazzl) && Objects.equals(totaloperaterevetz, that.totaloperaterevetz) && Objects.equals(epsxs, that.epsxs) && Objects.equals(compensateExpense, that.compensateExpense) && Objects.equals(jzc, that.jzc) && Objects.equals(jzb, that.jzb) && Objects.equals(bldkbbl, that.bldkbbl) && Objects.equals(ld, that.ld) && Objects.equals(newcapitalader, that.newcapitalader) && Objects.equals(xsjxlyysr, that.xsjxlyysr) && Objects.equals(mgjyxjje, that.mgjyxjje) && Objects.equals(yyfxzb, that.yyfxzb) && Objects.equals(xjllb, that.xjllb) && Objects.equals(epsjbtz, that.epsjbtz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityCode, reportDate, yszkyysr, rzrqywfxzb, zygdsylzqjzb, totaldeposits, xsjll, mlr, kcfjcxsyjlr, earnedPremium, jzbjzc, zzczzts, mgwfplr, taxrate, yszkzzl, cqbl, zygpgmjzc, kfjlrgdhbzc, ltdrr, solvencyAr, epsjb, jjywfxzb, zqzyywfxzb, roekcjq, surrenderRateLife, yyzsrgdhbzc, zcfzl, jyxjlyysr, qycs, zzcjll, bps, nzbje, roejq, yszkzzts, xsmll, kcfjcxsyjlrtz, totaloperatereve, sd, chzzts, mgzbgj, parentnetprofit, nonperloan, totalRoi, zqcxywfxzb, chzzl, netRoi, grossloans, epskcjb, netprofitrphbzc, hxyjbczl, parentnetprofittz, toazzl, totaloperaterevetz, epsxs, compensateExpense, jzc, jzb, bldkbbl, ld, newcapitalader, xsjxlyysr, mgjyxjje, yyfxzb, xjllb, epsjbtz);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("securityCode", getSecurityCode())
            .append("reportDate", getReportDate())
            .append("yszkyysr", getYszkyysr())
            .append("rzrqywfxzb", getRzrqywfxzb())
            .append("zygdsylzqjzb", getZygdsylzqjzb())
            .append("totaldeposits", getTotaldeposits())
            .append("xsjll", getXsjll())
            .append("mlr", getMlr())
            .append("kcfjcxsyjlr", getKcfjcxsyjlr())
            .append("earnedPremium", getEarnedPremium())
            .append("jzbjzc", getJzbjzc())
            .append("zzczzts", getZzczzts())
            .append("mgwfplr", getMgwfplr())
            .append("taxrate", getTaxrate())
            .append("yszkzzl", getYszkzzl())
            .append("cqbl", getCqbl())
            .append("zygpgmjzc", getZygpgmjzc())
            .append("kfjlrgdhbzc", getKfjlrgdhbzc())
            .append("ltdrr", getLtdrr())
            .append("solvencyAr", getSolvencyAr())
            .append("epsjb", getEpsjb())
            .append("jjywfxzb", getJjywfxzb())
            .append("zqzyywfxzb", getZqzyywfxzb())
            .append("roekcjq", getRoekcjq())
            .append("surrenderRateLife", getSurrenderRateLife())
            .append("yyzsrgdhbzc", getYyzsrgdhbzc())
            .append("zcfzl", getZcfzl())
            .append("jyxjlyysr", getJyxjlyysr())
            .append("qycs", getQycs())
            .append("zzcjll", getZzcjll())
            .append("bps", getBps())
            .append("nzbje", getNzbje())
            .append("roejq", getRoejq())
            .append("yszkzzts", getYszkzzts())
            .append("xsmll", getXsmll())
            .append("kcfjcxsyjlrtz", getKcfjcxsyjlrtz())
            .append("totaloperatereve", getTotaloperatereve())
            .append("sd", getSd())
            .append("chzzts", getChzzts())
            .append("mgzbgj", getMgzbgj())
            .append("parentnetprofit", getParentnetprofit())
            .append("nonperloan", getNonperloan())
            .append("totalRoi", getTotalRoi())
            .append("zqcxywfxzb", getZqcxywfxzb())
            .append("chzzl", getChzzl())
            .append("netRoi", getNetRoi())
            .append("grossloans", getGrossloans())
            .append("epskcjb", getEpskcjb())
            .append("netprofitrphbzc", getNetprofitrphbzc())
            .append("hxyjbczl", getHxyjbczl())
            .append("parentnetprofittz", getParentnetprofittz())
            .append("toazzl", getToazzl())
            .append("totaloperaterevetz", getTotaloperaterevetz())
            .append("epsxs", getEpsxs())
            .append("compensateExpense", getCompensateExpense())
            .append("jzc", getJzc())
            .append("jzb", getJzb())
            .append("bldkbbl", getBldkbbl())
            .append("ld", getLd())
            .append("newcapitalader", getNewcapitalader())
            .append("xsjxlyysr", getXsjxlyysr())
            .append("mgjyxjje", getMgjyxjje())
            .append("yyfxzb", getYyfxzb())
            .append("xjllb", getXjllb())
            .append("epsjbtz", getEpsjbtz())
            .toString();
    }
}
