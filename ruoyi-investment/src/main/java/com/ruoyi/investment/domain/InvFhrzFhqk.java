package com.ruoyi.investment.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 分红情况对象 inv_fhrz_fhqk
 * 
 * @author yangwenyang
 * @date 2023-04-06
 */
public class InvFhrzFhqk extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Integer id;

    /** 股票代码 */
    @Excel(name = "股票代码")
    private String securityCode;

    /** 公告日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "公告日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date noticeDate;

    /** 分红方案 */
    @Excel(name = "分红方案")
    private String implPlanProfile;

    /** 股权登记日 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "股权登记日", width = 30, dateFormat = "yyyy-MM-dd")
    private Date equityRecordDate;

    /** 除权除息日 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "除权除息日", width = 30, dateFormat = "yyyy-MM-dd")
    private Date exDividendDate;

    /** 派息日 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "派息日", width = 30, dateFormat = "yyyy-MM-dd")
    private Date payCashDate;

    /** 方案进度 */
    @Excel(name = "方案进度")
    private String assignProgress;

    public void setId(Integer id){this.id = id;}
    public Integer getId(){return id;}

    public void setSecurityCode(String securityCode){this.securityCode = securityCode;}
    public String getSecurityCode(){return securityCode;}

    public void setNoticeDate(Date noticeDate){this.noticeDate = noticeDate;}
    public Date getNoticeDate(){return noticeDate;}

    public void setImplPlanProfile(String implPlanProfile){this.implPlanProfile = implPlanProfile;}
    public String getImplPlanProfile(){return implPlanProfile;}

    public void setEquityRecordDate(Date equityRecordDate){this.equityRecordDate = equityRecordDate;}
    public Date getEquityRecordDate(){return equityRecordDate;}

    public void setExDividendDate(Date exDividendDate){this.exDividendDate = exDividendDate;}
    public Date getExDividendDate(){return exDividendDate;}

    public void setPayCashDate(Date payCashDate){this.payCashDate = payCashDate;}
    public Date getPayCashDate(){return payCashDate;}

    public void setAssignProgress(String assignProgress){this.assignProgress = assignProgress;}
    public String getAssignProgress(){return assignProgress;}


    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("securityCode", getSecurityCode())
            .append("noticeDate", getNoticeDate())
            .append("implPlanProfile", getImplPlanProfile())
            .append("equityRecordDate", getEquityRecordDate())
            .append("exDividendDate", getExDividendDate())
            .append("payCashDate", getPayCashDate())
            .append("assignProgress", getAssignProgress())
            .toString();
    }
}
