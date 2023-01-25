package com.ruoyi.investment.domain;

import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 融资融券对象 inv_rzrq
 * 
 * @author yangwenyang
 * @date 2023-01-22
 */
public class InvRzrq extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /** id */
    private Integer id;

    /** 股票代码 */
    @Excel(name = "股票代码")
    private String securityCode;

    /** 日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date date;

    /** 融资余额(元) */
    @Excel(name = "融资余额(元)")
    private Double rzye;

    /** 融券余额(元) */
    @Excel(name = "融券余额(元)")
    private Double rqye;

    /** 融资买入额(元) */
    @Excel(name = "融资买入额(元)")
    private Double rzmre;

    /** 融资偿还额(元) */
    @Excel(name = "融资偿还额(元)")
    private Double rzche;

    /** 融资净买额(元) */
    @Excel(name = "融资净买额(元)")
    private Double rzjme;

    /** 融券余量(股) */
    @Excel(name = "融券余量(股)")
    private Double rqyl;

    /** 融券卖出量(股) */
    @Excel(name = "融券卖出量(股)")
    private Double rqmcl;

    /** 融券偿还量(股) */
    @Excel(name = "融券偿还量(股)")
    private Double rqchl;

    /** 融资融券余额(元) */
    @Excel(name = "融资融券余额(元)")
    private Double rzrqye;

    public void setId(Integer id){this.id = id;}
    public Integer getId(){return id;}

    public void setSecurityCode(String securityCode){this.securityCode = securityCode;}
    public String getSecurityCode(){return securityCode;}

    public void setDate(Date date){this.date = date;}
    public Date getDate(){return date;}

    public void setRzye(Double rzye){this.rzye = rzye;}
    public Double getRzye(){return rzye;}

    public void setRqye(Double rqye){this.rqye = rqye;}
    public Double getRqye(){return rqye;}

    public void setRzmre(Double rzmre){this.rzmre = rzmre;}
    public Double getRzmre(){return rzmre;}

    public void setRzche(Double rzche){this.rzche = rzche;}
    public Double getRzche(){return rzche;}

    public void setRzjme(Double rzjme){this.rzjme = rzjme;}
    public Double getRzjme(){return rzjme;}

    public void setRqyl(Double rqyl){this.rqyl = rqyl;}
    public Double getRqyl(){return rqyl;}

    public void setRqmcl(Double rqmcl){this.rqmcl = rqmcl;}
    public Double getRqmcl(){return rqmcl;}

    public void setRqchl(Double rqchl){this.rqchl = rqchl;}
    public Double getRqchl(){return rqchl;}

    public void setRzrqye(Double rzrqye){this.rzrqye = rzrqye;}
    public Double getRzrqye(){return rzrqye;}

    public InvRzrq() {
        super();
    }

    public InvRzrq(String securityCode) {
        this.securityCode = securityCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvRzrq)) return false;
        InvRzrq invRzrq = (InvRzrq) o;
        return Objects.equals(securityCode, invRzrq.securityCode) && Objects.equals(date, invRzrq.date) && Objects.equals(rzye, invRzrq.rzye) && Objects.equals(rqye, invRzrq.rqye) && Objects.equals(rzmre, invRzrq.rzmre) && Objects.equals(rzche, invRzrq.rzche) && Objects.equals(rzjme, invRzrq.rzjme) && Objects.equals(rqyl, invRzrq.rqyl) && Objects.equals(rqmcl, invRzrq.rqmcl) && Objects.equals(rqchl, invRzrq.rqchl) && Objects.equals(rzrqye, invRzrq.rzrqye);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityCode, date, rzye, rqye, rzmre, rzche, rzjme, rqyl, rqmcl, rqchl, rzrqye);
    }
}
