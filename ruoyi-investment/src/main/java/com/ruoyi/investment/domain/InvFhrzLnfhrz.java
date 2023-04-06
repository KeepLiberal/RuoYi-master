package com.ruoyi.investment.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.Objects;

/**
 * 历年分红融资对象 inv_fhrz_lnfhrz
 * 
 * @author yangwenyang
 * @date 2023-04-06
 */
public class InvFhrzLnfhrz extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Integer id;

    /** 股票代码 */
    @Excel(name = "股票代码")
    private String securityCode;

    /** 年份 */
    @Excel(name = "年份")
    private String statisticsYear;

    /** 分红总额(万元) */
    @Excel(name = "分红总额(万元)")
    private Double totalDividend;

    /** 分红比例(%) */
    @Excel(name = "分红比例(%)")
    private Double dividendRatio;

    /** 增发(万股) */
    @Excel(name = "增发(万股)")
    private Double seoNum;

    /** 配股(万股) */
    @Excel(name = "配股(万股)")
    private Double allotmentNum;

    /** 新股发行(万股) */
    @Excel(name = "新股发行(万股)")
    private Double ipoNum;

    public void setId(Integer id){this.id = id;}
    public Integer getId(){return id;}

    public void setSecurityCode(String securityCode){this.securityCode = securityCode;}
    public String getSecurityCode(){return securityCode;}

    public void setStatisticsYear(String statisticsYear){this.statisticsYear = statisticsYear;}
    public String getStatisticsYear(){return statisticsYear;}

    public void setTotalDividend(Double totalDividend){this.totalDividend = totalDividend;}
    public Double getTotalDividend(){return totalDividend;}

    public void setDividendRatio(Double dividendRatio){this.dividendRatio = dividendRatio;}
    public Double getDividendRatio(){return dividendRatio;}

    public void setSeoNum(Double seoNum){this.seoNum = seoNum;}
    public Double getSeoNum(){return seoNum;}

    public void setAllotmentNum(Double allotmentNum){this.allotmentNum = allotmentNum;}
    public Double getAllotmentNum(){return allotmentNum;}

    public void setIpoNum(Double ipoNum){this.ipoNum = ipoNum;}
    public Double getIpoNum(){return ipoNum;}

    public InvFhrzLnfhrz() {
        super();
    }

    public InvFhrzLnfhrz(String securityCode) {
        this.securityCode = securityCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvFhrzLnfhrz)) return false;
        InvFhrzLnfhrz that = (InvFhrzLnfhrz) o;
        return Objects.equals(securityCode, that.securityCode) && Objects.equals(statisticsYear, that.statisticsYear) && Objects.equals(totalDividend, that.totalDividend) && Objects.equals(seoNum, that.seoNum) && Objects.equals(allotmentNum, that.allotmentNum) && Objects.equals(ipoNum, that.ipoNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityCode, statisticsYear, totalDividend, seoNum, allotmentNum, ipoNum);
    }
}
