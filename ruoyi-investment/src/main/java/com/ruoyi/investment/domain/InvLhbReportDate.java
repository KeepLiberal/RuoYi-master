package com.ruoyi.investment.domain;

import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 龙虎榜上榜日期对象 inv_lhb_report_date
 * 
 * @author yangwenyang
 * @date 2023-01-26
 */
public class InvLhbReportDate extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /** id */
    private Integer id;

    /** 股票代码 */
    @Excel(name = "股票代码")
    private String securityCode;

    /** 上榜日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "上榜日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date tradeDate;

    public void setId(Integer id){this.id = id;}
    public Integer getId(){return id;}

    public void setSecurityCode(String securityCode){this.securityCode = securityCode;}
    public String getSecurityCode(){return securityCode;}

    public void setTradeDate(Date tradeDate){this.tradeDate = tradeDate;}
    public Date getTradeDate(){return tradeDate;}

    public InvLhbReportDate() {
        super();
    }

    public InvLhbReportDate(String securityCode) {
        this.securityCode = securityCode;
    }

    public InvLhbReportDate(String securityCode, Date tradeDate) {
        this.securityCode = securityCode;
        this.tradeDate = tradeDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvLhbReportDate)) return false;
        InvLhbReportDate that = (InvLhbReportDate) o;
        return Objects.equals(securityCode, that.securityCode) && Objects.equals(tradeDate, that.tradeDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityCode, tradeDate);
    }
}
