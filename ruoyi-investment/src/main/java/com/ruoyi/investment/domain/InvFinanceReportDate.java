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
 * @date 2023-01-19
 */
public class InvFinanceReportDate extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Integer id;

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

    public void setId(Integer id){this.id = id;}
    public Integer getId(){return id;}

    public void setSecurityCode(String securityCode){this.securityCode = securityCode;}
    public String getSecurityCode(){return securityCode;}

    public void setFinanceType(String financeType){this.financeType = financeType;}
    public String getFinanceType(){return financeType;}

    public void setReportType(String reportType){this.reportType = reportType;}
    public String getReportType(){return reportType;}

    public void setReportDate(Date reportDate){this.reportDate = reportDate;}
    public Date getReportDate(){return reportDate;}

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvFinanceReportDate)) return false;
        InvFinanceReportDate that = (InvFinanceReportDate) o;
        return Objects.equals(securityCode, that.securityCode) && Objects.equals(financeType, that.financeType) && Objects.equals(reportType, that.reportType) && Objects.equals(reportDate, that.reportDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityCode, financeType, reportType, reportDate);
    }

}
