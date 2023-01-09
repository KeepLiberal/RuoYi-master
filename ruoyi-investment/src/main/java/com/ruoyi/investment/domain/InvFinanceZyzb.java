package com.ruoyi.investment.domain;

import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 财务分析-重要指标对象 inv_finance_zyzb
 * 
 * @author yangwenyang
 * @date 2023-01-09
 */
public class InvFinanceZyzb extends BaseEntity{
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

    /** 摊薄每股收益(元) */
    @Excel(name = "摊薄每股收益(元)")
    private Double epsjb;

    /** 扣非每股收益(元) */
    @Excel(name = "扣非每股收益(元)")
    private Double epskcjb;

    /** 稀释每股收益(元) */
    @Excel(name = "稀释每股收益(元)")
    private Double epsxs;

    /** 每股净资产(元) */
    @Excel(name = "每股净资产(元)")
    private Double bps;

    /** 每股公积金(元) */
    @Excel(name = "每股公积金(元)")
    private Double mgzbgj;

    /** 每股未分配利润(元) */
    @Excel(name = "每股未分配利润(元)")
    private Double mgwfplr;

    /** 每股经营现金流(元) */
    @Excel(name = "每股经营现金流(元)")
    private Double mgjyxjje;

    /** 营业总收入(元) */
    @Excel(name = "营业总收入(元)")
    private Double totaloperatereve;

    /** 毛利润(元) */
    @Excel(name = "毛利润(元)")
    private Double mlr;

    /** 归属净利润(元) */
    @Excel(name = "归属净利润(元)")
    private Double parentnetprofit;

    /** 扣非净利润(元) */
    @Excel(name = "扣非净利润(元)")
    private Double kcfjcxsyjlr;

    /** 营业总收入同比增长(%) */
    @Excel(name = "营业总收入同比增长(%)")
    private Double totaloperaterevetz;

    /** 归属净利润同比增长(%) */
    @Excel(name = "归属净利润同比增长(%)")
    private Double parentnetprofittz;

    /** 扣非净利润同比增长(%) */
    @Excel(name = "扣非净利润同比增长(%)")
    private Double kcfjcxsyjlrtz;

    /** 营业总收入滚动环比增长(%) */
    @Excel(name = "营业总收入滚动环比增长(%)")
    private Double yyzsrgdhbzc;

    /** 归属净利润滚动环比增长(%) */
    @Excel(name = "归属净利润滚动环比增长(%)")
    private Double netprofitrphbzc;

    /** 扣非净利润滚动环比增长(%) */
    @Excel(name = "扣非净利润滚动环比增长(%)")
    private Double kfjlrgdhbzc;

    /** 净资产收益率(加权)(%) */
    @Excel(name = "净资产收益率(加权)(%)")
    private Double roejq;

    /** 净资产收益率(扣非/加权)(%) */
    @Excel(name = "净资产收益率(扣非/加权)(%)")
    private Double roekcjq;

    /** 总资产收益率(加权)(%) */
    @Excel(name = "总资产收益率(加权)(%)")
    private Double zzcjll;

    /** 毛利率(%) */
    @Excel(name = "毛利率(%)")
    private Double xsmll;

    /** 净利率(%) */
    @Excel(name = "净利率(%)")
    private Double xsjll;

    /** 预收账款/营业总收入 */
    @Excel(name = "预收账款/营业总收入")
    private Double yszkyysr;

    /** 销售净现金流/营业总收入 */
    @Excel(name = "销售净现金流/营业总收入")
    private Double xsjxlyysr;

    /** 经营净现金流/营业总收入 */
    @Excel(name = "经营净现金流/营业总收入")
    private Double jyxjlyysr;

    /** 实际税率(%) */
    @Excel(name = "实际税率(%)")
    private Double taxrate;

    /** 流动比率 */
    @Excel(name = "流动比率")
    private Double ld;

    /** 速动比率 */
    @Excel(name = "速动比率")
    private Double sd;

    /** 现金流量比率 */
    @Excel(name = "现金流量比率")
    private Double xjllb;

    /** 资产负债率(%) */
    @Excel(name = "资产负债率(%)")
    private Double zcfzl;

    /** 权益乘数 */
    @Excel(name = "权益乘数")
    private Double qycs;

    /** 产权比率 */
    @Excel(name = "产权比率")
    private Double cqbl;

    /** 总资产周转天数(天) */
    @Excel(name = "总资产周转天数(天)")
    private Double zzczzts;

    /** 存货周转天数(天) */
    @Excel(name = "存货周转天数(天)")
    private Double chzzts;

    /** 应收账款周转天数(天) */
    @Excel(name = "应收账款周转天数(天)")
    private Double yszkzzts;

    /** 总资产周转率(次) */
    @Excel(name = "总资产周转率(次)")
    private Double toazzl;

    /** 存货周转率(次) */
    @Excel(name = "存货周转率(次)")
    private Double chzzl;

    /** 应收账款周转率(次) */
    @Excel(name = "应收账款周转率(次)")
    private Double yszkzzl;

    /** 存款总额(元) */
    @Excel(name = "存款总额(元)")
    private Double totaldeposits;

    /** 贷款总额(元) */
    @Excel(name = "贷款总额(元)")
    private Double grossloans;

    /** 存贷款比例 */
    @Excel(name = "存贷款比例")
    private Double ltdrr;

    /** 资本充足率(%) */
    @Excel(name = "资本充足率(%)")
    private Double newcapitalader;

    /** 核心资本充足率(%) */
    @Excel(name = "核心资本充足率(%)")
    private Double hxyjbczl;

    /** 不良贷款率(%) */
    @Excel(name = "不良贷款率(%)")
    private Double nonperloan;

    /** 不良贷款拨备覆盖率(%) */
    @Excel(name = "不良贷款拨备覆盖率(%)")
    private Double bldkbbl;

    /** 资本净额(元) */
    @Excel(name = "资本净额(元)")
    private Double nzbje;

    /** 总投资收益率(%) */
    @Excel(name = "总投资收益率(%)")
    private Double totalRoi;

    /** 净投资收益率(%) */
    @Excel(name = "净投资收益率(%)")
    private Double netRoi;

    /** 已赚保费(元) */
    @Excel(name = "已赚保费(元)")
    private Double earnedPremium;

    /** 赔付支出(元) */
    @Excel(name = "赔付支出(元)")
    private Double compensateExpense;

    /** 退保率(%) */
    @Excel(name = "退保率(%)")
    private Double surrenderRateLife;

    /** 偿付能力充足率(%) */
    @Excel(name = "偿付能力充足率(%)")
    private Double solvencyAr;

    /** 净资本(元) */
    @Excel(name = "净资本(元)")
    private Double jzb;

    /** 净资产(元) */
    @Excel(name = "净资产(元)")
    private Double jzc;

    /** 净资本/净资产 */
    @Excel(name = "净资本/净资产")
    private Double jzbjzc;

    /** 自营股票规模/净资产 */
    @Excel(name = "自营股票规模/净资产")
    private Double zygpgmjzc;

    /** 自营固定收益类证券规模/净资产 */
    @Excel(name = "自营固定收益类证券规模/净资产")
    private Double zygdsylzqjzb;

    /** 营运风险准备(元) */
    @Excel(name = "营运风险准备(元)")
    private Double yyfxzb;

    /** 经纪业务风险准备(元) */
    @Excel(name = "经纪业务风险准备(元)")
    private Double jjywfxzb;

    /** 证券自营业务风险准备(元) */
    @Excel(name = "证券自营业务风险准备(元)")
    private Double zqzyywfxzb;

    /** 证券承销业务风险准备(元) */
    @Excel(name = "证券承销业务风险准备(元)")
    private Double zqcxywfxzb;

    /** 融资融券业务风险准备(元) */
    @Excel(name = "融资融券业务风险准备(元)")
    private Double rzrqywfxzb;

    /** 每股公积金(元) */
    @Excel(name = "每股公积金(元)")
    private Double perCapitalReserve;

    /** 每股未分配利润(元) */
    @Excel(name = "每股未分配利润(元)")
    private Double perUnassignProfit;

    /** 每股经营现金流(元) */
    @Excel(name = "每股经营现金流(元)")
    private Double perNetcash;

    /** 毛利润(元) */
    @Excel(name = "毛利润(元)")
    private Double grossProfit;

    /** 扣非净利润(元) */
    @Excel(name = "扣非净利润(元)")
    private Double deduParentProfit;

    /** 扣非净利润同比增长(%) */
    @Excel(name = "扣非净利润同比增长(%)")
    private Double dpnpYoyRatio;

    /** 摊薄净资产收益率(%) */
    @Excel(name = "摊薄净资产收益率(%)")
    private Double roeDiluted;

    /** 摊薄总资产收益率(%) */
    @Excel(name = "摊薄总资产收益率(%)")
    private Double jroa;

    /** 毛利率(%) */
    @Excel(name = "毛利率(%)")
    private Double grossProfitRatio;

    /** 净利率(%) */
    @Excel(name = "净利率(%)")
    private Double netProfitRatio;

    public void setId(Long id){this.id = id;}
    public Long getId(){return id;}

    public void setSecurityCode(String securityCode){this.securityCode = securityCode;}
    public String getSecurityCode(){return securityCode;}

    public void setReportType(String reportType){this.reportType = reportType;}
    public String getReportType(){return reportType;}

    public void setReportDate(Date reportDate){this.reportDate = reportDate;}
    public Date getReportDate(){return reportDate;}

    public void setEpsjb(Double epsjb){this.epsjb = epsjb;}
    public Double getEpsjb(){return epsjb;}

    public void setEpskcjb(Double epskcjb){this.epskcjb = epskcjb;}
    public Double getEpskcjb(){return epskcjb;}

    public void setEpsxs(Double epsxs){this.epsxs = epsxs;}
    public Double getEpsxs(){return epsxs;}

    public void setBps(Double bps){this.bps = bps;}
    public Double getBps(){return bps;}

    public void setMgzbgj(Double mgzbgj){this.mgzbgj = mgzbgj;}
    public Double getMgzbgj(){return mgzbgj;}

    public void setMgwfplr(Double mgwfplr){this.mgwfplr = mgwfplr;}
    public Double getMgwfplr(){return mgwfplr;}

    public void setMgjyxjje(Double mgjyxjje){this.mgjyxjje = mgjyxjje;}
    public Double getMgjyxjje(){return mgjyxjje;}

    public void setTotaloperatereve(Double totaloperatereve){this.totaloperatereve = totaloperatereve;}
    public Double getTotaloperatereve(){return totaloperatereve;}

    public void setMlr(Double mlr){this.mlr = mlr;}
    public Double getMlr(){return mlr;}

    public void setParentnetprofit(Double parentnetprofit){this.parentnetprofit = parentnetprofit;}
    public Double getParentnetprofit(){return parentnetprofit;}

    public void setKcfjcxsyjlr(Double kcfjcxsyjlr){this.kcfjcxsyjlr = kcfjcxsyjlr;}
    public Double getKcfjcxsyjlr(){return kcfjcxsyjlr;}

    public void setTotaloperaterevetz(Double totaloperaterevetz){this.totaloperaterevetz = totaloperaterevetz;}
    public Double getTotaloperaterevetz(){return totaloperaterevetz;}

    public void setParentnetprofittz(Double parentnetprofittz){this.parentnetprofittz = parentnetprofittz;}
    public Double getParentnetprofittz(){return parentnetprofittz;}

    public void setKcfjcxsyjlrtz(Double kcfjcxsyjlrtz){this.kcfjcxsyjlrtz = kcfjcxsyjlrtz;}
    public Double getKcfjcxsyjlrtz(){return kcfjcxsyjlrtz;}

    public void setYyzsrgdhbzc(Double yyzsrgdhbzc){this.yyzsrgdhbzc = yyzsrgdhbzc;}
    public Double getYyzsrgdhbzc(){return yyzsrgdhbzc;}

    public void setNetprofitrphbzc(Double netprofitrphbzc){this.netprofitrphbzc = netprofitrphbzc;}
    public Double getNetprofitrphbzc(){return netprofitrphbzc;}

    public void setKfjlrgdhbzc(Double kfjlrgdhbzc){this.kfjlrgdhbzc = kfjlrgdhbzc;}
    public Double getKfjlrgdhbzc(){return kfjlrgdhbzc;}

    public void setRoejq(Double roejq){this.roejq = roejq;}
    public Double getRoejq(){return roejq;}

    public void setRoekcjq(Double roekcjq){this.roekcjq = roekcjq;}
    public Double getRoekcjq(){return roekcjq;}

    public void setZzcjll(Double zzcjll){this.zzcjll = zzcjll;}
    public Double getZzcjll(){return zzcjll;}

    public void setXsmll(Double xsmll){this.xsmll = xsmll;}
    public Double getXsmll(){return xsmll;}

    public void setXsjll(Double xsjll){this.xsjll = xsjll;}
    public Double getXsjll(){return xsjll;}

    public void setYszkyysr(Double yszkyysr){this.yszkyysr = yszkyysr;}
    public Double getYszkyysr(){return yszkyysr;}

    public void setXsjxlyysr(Double xsjxlyysr){this.xsjxlyysr = xsjxlyysr;}
    public Double getXsjxlyysr(){return xsjxlyysr;}

    public void setJyxjlyysr(Double jyxjlyysr){this.jyxjlyysr = jyxjlyysr;}
    public Double getJyxjlyysr(){return jyxjlyysr;}

    public void setTaxrate(Double taxrate){this.taxrate = taxrate;}
    public Double getTaxrate(){return taxrate;}

    public void setLd(Double ld){this.ld = ld;}
    public Double getLd(){return ld;}

    public void setSd(Double sd){this.sd = sd;}
    public Double getSd(){return sd;}

    public void setXjllb(Double xjllb){this.xjllb = xjllb;}
    public Double getXjllb(){return xjllb;}

    public void setZcfzl(Double zcfzl){this.zcfzl = zcfzl;}
    public Double getZcfzl(){return zcfzl;}

    public void setQycs(Double qycs){this.qycs = qycs;}
    public Double getQycs(){return qycs;}

    public void setCqbl(Double cqbl){this.cqbl = cqbl;}
    public Double getCqbl(){return cqbl;}

    public void setZzczzts(Double zzczzts){this.zzczzts = zzczzts;}
    public Double getZzczzts(){return zzczzts;}

    public void setChzzts(Double chzzts){this.chzzts = chzzts;}
    public Double getChzzts(){return chzzts;}

    public void setYszkzzts(Double yszkzzts){this.yszkzzts = yszkzzts;}
    public Double getYszkzzts(){return yszkzzts;}

    public void setToazzl(Double toazzl){this.toazzl = toazzl;}
    public Double getToazzl(){return toazzl;}

    public void setChzzl(Double chzzl){this.chzzl = chzzl;}
    public Double getChzzl(){return chzzl;}

    public void setYszkzzl(Double yszkzzl){this.yszkzzl = yszkzzl;}
    public Double getYszkzzl(){return yszkzzl;}

    public void setTotaldeposits(Double totaldeposits){this.totaldeposits = totaldeposits;}
    public Double getTotaldeposits(){return totaldeposits;}

    public void setGrossloans(Double grossloans){this.grossloans = grossloans;}
    public Double getGrossloans(){return grossloans;}

    public void setLtdrr(Double ltdrr){this.ltdrr = ltdrr;}
    public Double getLtdrr(){return ltdrr;}

    public void setNewcapitalader(Double newcapitalader){this.newcapitalader = newcapitalader;}
    public Double getNewcapitalader(){return newcapitalader;}

    public void setHxyjbczl(Double hxyjbczl){this.hxyjbczl = hxyjbczl;}
    public Double getHxyjbczl(){return hxyjbczl;}

    public void setNonperloan(Double nonperloan){this.nonperloan = nonperloan;}
    public Double getNonperloan(){return nonperloan;}

    public void setBldkbbl(Double bldkbbl){this.bldkbbl = bldkbbl;}
    public Double getBldkbbl(){return bldkbbl;}

    public void setNzbje(Double nzbje){this.nzbje = nzbje;}
    public Double getNzbje(){return nzbje;}

    public void setTotalRoi(Double totalRoi){this.totalRoi = totalRoi;}
    public Double getTotalRoi(){return totalRoi;}

    public void setNetRoi(Double netRoi){this.netRoi = netRoi;}
    public Double getNetRoi(){return netRoi;}

    public void setEarnedPremium(Double earnedPremium){this.earnedPremium = earnedPremium;}
    public Double getEarnedPremium(){return earnedPremium;}

    public void setCompensateExpense(Double compensateExpense){this.compensateExpense = compensateExpense;}
    public Double getCompensateExpense(){return compensateExpense;}

    public void setSurrenderRateLife(Double surrenderRateLife){this.surrenderRateLife = surrenderRateLife;}
    public Double getSurrenderRateLife(){return surrenderRateLife;}

    public void setSolvencyAr(Double solvencyAr){this.solvencyAr = solvencyAr;}
    public Double getSolvencyAr(){return solvencyAr;}

    public void setJzb(Double jzb){this.jzb = jzb;}
    public Double getJzb(){return jzb;}

    public void setJzc(Double jzc){this.jzc = jzc;}
    public Double getJzc(){return jzc;}

    public void setJzbjzc(Double jzbjzc){this.jzbjzc = jzbjzc;}
    public Double getJzbjzc(){return jzbjzc;}

    public void setZygpgmjzc(Double zygpgmjzc){this.zygpgmjzc = zygpgmjzc;}
    public Double getZygpgmjzc(){return zygpgmjzc;}

    public void setZygdsylzqjzb(Double zygdsylzqjzb){this.zygdsylzqjzb = zygdsylzqjzb;}
    public Double getZygdsylzqjzb(){return zygdsylzqjzb;}

    public void setYyfxzb(Double yyfxzb){this.yyfxzb = yyfxzb;}
    public Double getYyfxzb(){return yyfxzb;}

    public void setJjywfxzb(Double jjywfxzb){this.jjywfxzb = jjywfxzb;}
    public Double getJjywfxzb(){return jjywfxzb;}

    public void setZqzyywfxzb(Double zqzyywfxzb){this.zqzyywfxzb = zqzyywfxzb;}
    public Double getZqzyywfxzb(){return zqzyywfxzb;}

    public void setZqcxywfxzb(Double zqcxywfxzb){this.zqcxywfxzb = zqcxywfxzb;}
    public Double getZqcxywfxzb(){return zqcxywfxzb;}

    public void setRzrqywfxzb(Double rzrqywfxzb){this.rzrqywfxzb = rzrqywfxzb;}
    public Double getRzrqywfxzb(){return rzrqywfxzb;}

    public void setPerCapitalReserve(Double perCapitalReserve){this.perCapitalReserve = perCapitalReserve;}
    public Double getPerCapitalReserve(){return perCapitalReserve;}

    public void setPerUnassignProfit(Double perUnassignProfit){this.perUnassignProfit = perUnassignProfit;}
    public Double getPerUnassignProfit(){return perUnassignProfit;}

    public void setPerNetcash(Double perNetcash){this.perNetcash = perNetcash;}
    public Double getPerNetcash(){return perNetcash;}

    public void setGrossProfit(Double grossProfit){this.grossProfit = grossProfit;}
    public Double getGrossProfit(){return grossProfit;}

    public void setDeduParentProfit(Double deduParentProfit){this.deduParentProfit = deduParentProfit;}
    public Double getDeduParentProfit(){return deduParentProfit;}

    public void setDpnpYoyRatio(Double dpnpYoyRatio){this.dpnpYoyRatio = dpnpYoyRatio;}
    public Double getDpnpYoyRatio(){return dpnpYoyRatio;}

    public void setRoeDiluted(Double roeDiluted){this.roeDiluted = roeDiluted;}
    public Double getRoeDiluted(){return roeDiluted;}

    public void setJroa(Double jroa){this.jroa = jroa;}
    public Double getJroa(){return jroa;}

    public void setGrossProfitRatio(Double grossProfitRatio){this.grossProfitRatio = grossProfitRatio;}
    public Double getGrossProfitRatio(){return grossProfitRatio;}

    public void setNetProfitRatio(Double netProfitRatio){this.netProfitRatio = netProfitRatio;}
    public Double getNetProfitRatio(){return netProfitRatio;}

    public InvFinanceZyzb() {
        super();
    }

    public InvFinanceZyzb(String securityCode, String reportType) {
        this.securityCode = securityCode;
        this.reportType = reportType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvFinanceZyzb)) return false;
        InvFinanceZyzb that = (InvFinanceZyzb) o;
        return Objects.equals(securityCode, that.securityCode) && Objects.equals(reportType, that.reportType) && Objects.equals(reportDate, that.reportDate) && Objects.equals(epsjb, that.epsjb) && Objects.equals(epskcjb, that.epskcjb) && Objects.equals(epsxs, that.epsxs) && Objects.equals(bps, that.bps) && Objects.equals(mgzbgj, that.mgzbgj) && Objects.equals(mgwfplr, that.mgwfplr) && Objects.equals(mgjyxjje, that.mgjyxjje) && Objects.equals(totaloperatereve, that.totaloperatereve) && Objects.equals(mlr, that.mlr) && Objects.equals(parentnetprofit, that.parentnetprofit) && Objects.equals(kcfjcxsyjlr, that.kcfjcxsyjlr) && Objects.equals(totaloperaterevetz, that.totaloperaterevetz) && Objects.equals(parentnetprofittz, that.parentnetprofittz) && Objects.equals(kcfjcxsyjlrtz, that.kcfjcxsyjlrtz) && Objects.equals(yyzsrgdhbzc, that.yyzsrgdhbzc) && Objects.equals(netprofitrphbzc, that.netprofitrphbzc) && Objects.equals(kfjlrgdhbzc, that.kfjlrgdhbzc) && Objects.equals(roejq, that.roejq) && Objects.equals(roekcjq, that.roekcjq) && Objects.equals(zzcjll, that.zzcjll) && Objects.equals(xsmll, that.xsmll) && Objects.equals(xsjll, that.xsjll) && Objects.equals(yszkyysr, that.yszkyysr) && Objects.equals(xsjxlyysr, that.xsjxlyysr) && Objects.equals(jyxjlyysr, that.jyxjlyysr) && Objects.equals(taxrate, that.taxrate) && Objects.equals(ld, that.ld) && Objects.equals(sd, that.sd) && Objects.equals(xjllb, that.xjllb) && Objects.equals(zcfzl, that.zcfzl) && Objects.equals(qycs, that.qycs) && Objects.equals(cqbl, that.cqbl) && Objects.equals(zzczzts, that.zzczzts) && Objects.equals(chzzts, that.chzzts) && Objects.equals(yszkzzts, that.yszkzzts) && Objects.equals(toazzl, that.toazzl) && Objects.equals(chzzl, that.chzzl) && Objects.equals(yszkzzl, that.yszkzzl) && Objects.equals(totaldeposits, that.totaldeposits) && Objects.equals(grossloans, that.grossloans) && Objects.equals(ltdrr, that.ltdrr) && Objects.equals(newcapitalader, that.newcapitalader) && Objects.equals(hxyjbczl, that.hxyjbczl) && Objects.equals(nonperloan, that.nonperloan) && Objects.equals(bldkbbl, that.bldkbbl) && Objects.equals(nzbje, that.nzbje) && Objects.equals(totalRoi, that.totalRoi) && Objects.equals(netRoi, that.netRoi) && Objects.equals(earnedPremium, that.earnedPremium) && Objects.equals(compensateExpense, that.compensateExpense) && Objects.equals(surrenderRateLife, that.surrenderRateLife) && Objects.equals(solvencyAr, that.solvencyAr) && Objects.equals(jzb, that.jzb) && Objects.equals(jzc, that.jzc) && Objects.equals(jzbjzc, that.jzbjzc) && Objects.equals(zygpgmjzc, that.zygpgmjzc) && Objects.equals(zygdsylzqjzb, that.zygdsylzqjzb) && Objects.equals(yyfxzb, that.yyfxzb) && Objects.equals(jjywfxzb, that.jjywfxzb) && Objects.equals(zqzyywfxzb, that.zqzyywfxzb) && Objects.equals(zqcxywfxzb, that.zqcxywfxzb) && Objects.equals(rzrqywfxzb, that.rzrqywfxzb) && Objects.equals(perCapitalReserve, that.perCapitalReserve) && Objects.equals(perUnassignProfit, that.perUnassignProfit) && Objects.equals(perNetcash, that.perNetcash) && Objects.equals(grossProfit, that.grossProfit) && Objects.equals(deduParentProfit, that.deduParentProfit) && Objects.equals(dpnpYoyRatio, that.dpnpYoyRatio) && Objects.equals(roeDiluted, that.roeDiluted) && Objects.equals(jroa, that.jroa) && Objects.equals(grossProfitRatio, that.grossProfitRatio) && Objects.equals(netProfitRatio, that.netProfitRatio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityCode, reportType, reportDate, epsjb, epskcjb, epsxs, bps, mgzbgj, mgwfplr, mgjyxjje, totaloperatereve, mlr, parentnetprofit, kcfjcxsyjlr, totaloperaterevetz, parentnetprofittz, kcfjcxsyjlrtz, yyzsrgdhbzc, netprofitrphbzc, kfjlrgdhbzc, roejq, roekcjq, zzcjll, xsmll, xsjll, yszkyysr, xsjxlyysr, jyxjlyysr, taxrate, ld, sd, xjllb, zcfzl, qycs, cqbl, zzczzts, chzzts, yszkzzts, toazzl, chzzl, yszkzzl, totaldeposits, grossloans, ltdrr, newcapitalader, hxyjbczl, nonperloan, bldkbbl, nzbje, totalRoi, netRoi, earnedPremium, compensateExpense, surrenderRateLife, solvencyAr, jzb, jzc, jzbjzc, zygpgmjzc, zygdsylzqjzb, yyfxzb, jjywfxzb, zqzyywfxzb, zqcxywfxzb, rzrqywfxzb, perCapitalReserve, perUnassignProfit, perNetcash, grossProfit, deduParentProfit, dpnpYoyRatio, roeDiluted, jroa, grossProfitRatio, netProfitRatio);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("securityCode", getSecurityCode())
            .append("reportType", getReportType())
            .append("reportDate", getReportDate())
            .append("epsjb", getEpsjb())
            .append("epskcjb", getEpskcjb())
            .append("epsxs", getEpsxs())
            .append("bps", getBps())
            .append("mgzbgj", getMgzbgj())
            .append("mgwfplr", getMgwfplr())
            .append("mgjyxjje", getMgjyxjje())
            .append("totaloperatereve", getTotaloperatereve())
            .append("mlr", getMlr())
            .append("parentnetprofit", getParentnetprofit())
            .append("kcfjcxsyjlr", getKcfjcxsyjlr())
            .append("totaloperaterevetz", getTotaloperaterevetz())
            .append("parentnetprofittz", getParentnetprofittz())
            .append("kcfjcxsyjlrtz", getKcfjcxsyjlrtz())
            .append("yyzsrgdhbzc", getYyzsrgdhbzc())
            .append("netprofitrphbzc", getNetprofitrphbzc())
            .append("kfjlrgdhbzc", getKfjlrgdhbzc())
            .append("roejq", getRoejq())
            .append("roekcjq", getRoekcjq())
            .append("zzcjll", getZzcjll())
            .append("xsmll", getXsmll())
            .append("xsjll", getXsjll())
            .append("yszkyysr", getYszkyysr())
            .append("xsjxlyysr", getXsjxlyysr())
            .append("jyxjlyysr", getJyxjlyysr())
            .append("taxrate", getTaxrate())
            .append("ld", getLd())
            .append("sd", getSd())
            .append("xjllb", getXjllb())
            .append("zcfzl", getZcfzl())
            .append("qycs", getQycs())
            .append("cqbl", getCqbl())
            .append("zzczzts", getZzczzts())
            .append("chzzts", getChzzts())
            .append("yszkzzts", getYszkzzts())
            .append("toazzl", getToazzl())
            .append("chzzl", getChzzl())
            .append("yszkzzl", getYszkzzl())
            .append("totaldeposits", getTotaldeposits())
            .append("grossloans", getGrossloans())
            .append("ltdrr", getLtdrr())
            .append("newcapitalader", getNewcapitalader())
            .append("hxyjbczl", getHxyjbczl())
            .append("nonperloan", getNonperloan())
            .append("bldkbbl", getBldkbbl())
            .append("nzbje", getNzbje())
            .append("totalRoi", getTotalRoi())
            .append("netRoi", getNetRoi())
            .append("earnedPremium", getEarnedPremium())
            .append("compensateExpense", getCompensateExpense())
            .append("surrenderRateLife", getSurrenderRateLife())
            .append("solvencyAr", getSolvencyAr())
            .append("jzb", getJzb())
            .append("jzc", getJzc())
            .append("jzbjzc", getJzbjzc())
            .append("zygpgmjzc", getZygpgmjzc())
            .append("zygdsylzqjzb", getZygdsylzqjzb())
            .append("yyfxzb", getYyfxzb())
            .append("jjywfxzb", getJjywfxzb())
            .append("zqzyywfxzb", getZqzyywfxzb())
            .append("zqcxywfxzb", getZqcxywfxzb())
            .append("rzrqywfxzb", getRzrqywfxzb())
            .append("perCapitalReserve", getPerCapitalReserve())
            .append("perUnassignProfit", getPerUnassignProfit())
            .append("perNetcash", getPerNetcash())
            .append("grossProfit", getGrossProfit())
            .append("deduParentProfit", getDeduParentProfit())
            .append("dpnpYoyRatio", getDpnpYoyRatio())
            .append("roeDiluted", getRoeDiluted())
            .append("jroa", getJroa())
            .append("grossProfitRatio", getGrossProfitRatio())
            .append("netProfitRatio", getNetProfitRatio())
            .toString();
    }
}
