package com.ruoyi.investment.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 财务分析-报告日期对象 inv_finance_report_date
 * 
 * @author yangwenyang
 * @date 2022-10-18
 */
public class InvFinanceReportDate extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 股票代码 */
    @Excel(name = "股票代码")
    private String securityCode;

    /** 财务类型 */
    @Excel(name = "财务类型")
    private String financeType;

    /** 报告类型 */
    @Excel(name = "报告类型")
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
    public void setSecurityCode(String securityCode) 
    {
        this.securityCode = securityCode;
    }

    public String getSecurityCode() 
    {
        return securityCode;
    }
    public void setFinanceType(String financeType) 
    {
        this.financeType = financeType;
    }

    public String getFinanceType() 
    {
        return financeType;
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

    public InvFinanceReportDate(String securityCode, String financeType, String reportType) {
        this.securityCode = securityCode;
        this.financeType = financeType;
        this.reportType = reportType;
    }

    public InvFinanceReportDate(String securityCode, String financeType, String reportType, Date reportDate) {
        this.securityCode = securityCode;
        this.financeType = financeType;
        this.reportType = reportType;
        this.reportDate = reportDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("securityCode", getSecurityCode())
            .append("financeType", getFinanceType())
            .append("reportType", getReportType())
            .append("reportDate", getReportDate())
            .toString();
    }
}
