package com.ruoyi.investment.domain;

import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 财务分析-报告日期对象 inv_finance_report_date
 * 
 * @author yangwenyang
 * @date 2022-10-12
 */
public class InvFinanceReportDate extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 股票代码 */
    @Excel(name = "股票代码")
    private String code;

    /** 报告类型  zcfz-资产负债，lr-利润，xjll-现金流量 */
    @Excel(name = "报告类型  zcfz-资产负债，lr-利润，xjll-现金流量")
    private String reportType;

    /** 报告日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "报告日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date reportDate;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCode(String code) 
    {
        this.code = code;
    }

    public String getCode() 
    {
        return code;
    }
    public void setReportType(String reportType) 
    {
        this.reportType = reportType;
    }

    public String getReportType() 
    {
        return reportType;
    }
    public void setReportDate(Date reportDate) 
    {
        this.reportDate = reportDate;
    }

    public Date getReportDate() 
    {
        return reportDate;
    }

    public InvFinanceReportDate() {
        super();
    }

    public InvFinanceReportDate(String code) {
        this.code = code;
    }

    public InvFinanceReportDate(String code, String reportType, Date reportDate) {
        this.code = code;
        this.reportType = reportType;
        this.reportDate = reportDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvFinanceReportDate)) return false;
        InvFinanceReportDate that = (InvFinanceReportDate) o;
        return Objects.equals(code, that.code) && Objects.equals(reportType, that.reportType) && Objects.equals(reportDate, that.reportDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, reportType, reportDate);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("code", getCode())
            .append("reportType", getReportType())
            .append("reportDate", getReportDate())
            .toString();
    }
}
