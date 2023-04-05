package com.ruoyi.investment.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

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

    public void setSeoNum(Double seoNum){this.seoNum = seoNum;}
    public Double getSeoNum(){return seoNum;}

    public void setAllotmentNum(Double allotmentNum){this.allotmentNum = allotmentNum;}
    public Double getAllotmentNum(){return allotmentNum;}

    public void setIpoNum(Double ipoNum){this.ipoNum = ipoNum;}
    public Double getIpoNum(){return ipoNum;}


    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("securityCode", getSecurityCode())
            .append("statisticsYear", getStatisticsYear())
            .append("totalDividend", getTotalDividend())
            .append("seoNum", getSeoNum())
            .append("allotmentNum", getAllotmentNum())
            .append("ipoNum", getIpoNum())
            .toString();
    }
}
