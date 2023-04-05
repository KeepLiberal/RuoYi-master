package com.ruoyi.investment.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 配股明细对象 inv_fhrz_pgmx
 * 
 * @author yangwenyang
 * @date 2023-04-06
 */
public class InvFhrzPgmx extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /** id */
    private Integer id;

    /** 股票代码 */
    @Excel(name = "股票代码")
    private String securityCode;

    /** 配股公告日 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "配股公告日", width = 30, dateFormat = "yyyy-MM-dd")
    private Date noticeDate;

    /** 配股价格(元) */
    @Excel(name = "配股价格(元)")
    private Double issuePrice;

    /** 实际配股数量(万股) */
    @Excel(name = "实际配股数量(万股)")
    private Double issueNum;

    /** 实际募资总额(万元) */
    @Excel(name = "实际募资总额(万元)")
    private Double totalRaiseFunds;

    /** 股权登记日 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "股权登记日", width = 30, dateFormat = "yyyy-MM-dd")
    private Date equityRecordDate;

    /** 除权基准日 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "除权基准日", width = 30, dateFormat = "yyyy-MM-dd")
    private Date exDividendDatee;

    /** 配股方案 */
    @Excel(name = "配股方案")
    private String eventExplain;

    public void setId(Integer id){this.id = id;}
    public Integer getId(){return id;}

    public void setSecurityCode(String securityCode){this.securityCode = securityCode;}
    public String getSecurityCode(){return securityCode;}

    public void setNoticeDate(Date noticeDate){this.noticeDate = noticeDate;}
    public Date getNoticeDate(){return noticeDate;}

    public void setIssuePrice(Double issuePrice){this.issuePrice = issuePrice;}
    public Double getIssuePrice(){return issuePrice;}

    public void setIssueNum(Double issueNum){this.issueNum = issueNum;}
    public Double getIssueNum(){return issueNum;}

    public void setTotalRaiseFunds(Double totalRaiseFunds){this.totalRaiseFunds = totalRaiseFunds;}
    public Double getTotalRaiseFunds(){return totalRaiseFunds;}

    public void setEquityRecordDate(Date equityRecordDate){this.equityRecordDate = equityRecordDate;}
    public Date getEquityRecordDate(){return equityRecordDate;}

    public void setExDividendDatee(Date exDividendDatee){this.exDividendDatee = exDividendDatee;}
    public Date getExDividendDatee(){return exDividendDatee;}

    public void setEventExplain(String eventExplain){this.eventExplain = eventExplain;}
    public String getEventExplain(){return eventExplain;}


    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("securityCode", getSecurityCode())
            .append("noticeDate", getNoticeDate())
            .append("issuePrice", getIssuePrice())
            .append("issueNum", getIssueNum())
            .append("totalRaiseFunds", getTotalRaiseFunds())
            .append("equityRecordDate", getEquityRecordDate())
            .append("exDividendDatee", getExDividendDatee())
            .append("eventExplain", getEventExplain())
            .toString();
    }
}
