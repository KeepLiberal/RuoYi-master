package com.ruoyi.investment.domain;

import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 增发明细对象 inv_fhrz_zfmx
 * 
 * @author yangwenyang
 * @date 2023-04-06
 */
public class InvFhrzZfmx extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Integer id;

    /** 股票代码 */
    @Excel(name = "股票代码")
    private String securityCode;

    /** 增发时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "增发时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date noticeDate;

    /** 实际增发数量(万股) */
    @Excel(name = "实际增发数量(万股)")
    private Double issueNum;

    /** 实际募集净额(万元) */
    @Excel(name = "实际募集净额(万元)")
    private Double netRaiseFunds;

    /** 增发价格(元/股) */
    @Excel(name = "增发价格(元/股)")
    private Double issuePrice;

    /** 新股发行(万股) */
    @Excel(name = "新股发行(万股)")
    private Double ipoNum;

    /** 发行方式 */
    @Excel(name = "发行方式")
    private String issueWayExplain;

    /** 股权登记日 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "股权登记日", width = 30, dateFormat = "yyyy-MM-dd")
    private Date regDate;

    /** 增发上市日 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "增发上市日", width = 30, dateFormat = "yyyy-MM-dd")
    private Date listingDate;

    /** 资金到账日 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "资金到账日", width = 30, dateFormat = "yyyy-MM-dd")
    private Date receiveDate;

    public void setId(Integer id){this.id = id;}
    public Integer getId(){return id;}

    public void setSecurityCode(String securityCode){this.securityCode = securityCode;}
    public String getSecurityCode(){return securityCode;}

    public void setNoticeDate(Date noticeDate){this.noticeDate = noticeDate;}
    public Date getNoticeDate(){return noticeDate;}

    public void setIssueNum(Double issueNum){this.issueNum = issueNum;}
    public Double getIssueNum(){return issueNum;}

    public void setNetRaiseFunds(Double netRaiseFunds){this.netRaiseFunds = netRaiseFunds;}
    public Double getNetRaiseFunds(){return netRaiseFunds;}

    public void setIssuePrice(Double issuePrice){this.issuePrice = issuePrice;}
    public Double getIssuePrice(){return issuePrice;}

    public void setIpoNum(Double ipoNum){this.ipoNum = ipoNum;}
    public Double getIpoNum(){return ipoNum;}

    public void setIssueWayExplain(String issueWayExplain){this.issueWayExplain = issueWayExplain;}
    public String getIssueWayExplain(){return issueWayExplain;}

    public void setRegDate(Date regDate){this.regDate = regDate;}
    public Date getRegDate(){return regDate;}

    public void setListingDate(Date listingDate){this.listingDate = listingDate;}
    public Date getListingDate(){return listingDate;}

    public void setReceiveDate(Date receiveDate){this.receiveDate = receiveDate;}
    public Date getReceiveDate(){return receiveDate;}

    public InvFhrzZfmx() {
        super();
    }

    public InvFhrzZfmx(String securityCode) {
        this.securityCode = securityCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvFhrzZfmx)) return false;
        InvFhrzZfmx that = (InvFhrzZfmx) o;
        return Objects.equals(securityCode, that.securityCode) && Objects.equals(noticeDate, that.noticeDate) && Objects.equals(issueNum, that.issueNum) && Objects.equals(netRaiseFunds, that.netRaiseFunds) && Objects.equals(issuePrice, that.issuePrice) && Objects.equals(ipoNum, that.ipoNum) && Objects.equals(issueWayExplain, that.issueWayExplain) && Objects.equals(regDate, that.regDate) && Objects.equals(listingDate, that.listingDate) && Objects.equals(receiveDate, that.receiveDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityCode, noticeDate, issueNum, netRaiseFunds, issuePrice, ipoNum, issueWayExplain, regDate, listingDate, receiveDate);
    }
}
