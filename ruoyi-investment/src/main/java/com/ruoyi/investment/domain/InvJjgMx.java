package com.ruoyi.investment.domain;

import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 解禁股明细对象 inv_jjg_mx
 * 
 * @author yangwenyang
 * @date 2023-02-03
 */
public class InvJjgMx extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /** id */
    private Integer id;

    /** 股票代码 */
    @Excel(name = "股票代码")
    private String securityCode;

    /** 解除限售日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "解除限售日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date freeDate;

    /** 股东名称 */
    @Excel(name = "股东名称")
    private String limitedHolderName;

    /** 新增可上市股份 */
    @Excel(name = "新增可上市股份")
    private Double addListingShares;

    /** 限售股类型 */
    @Excel(name = "限售股类型")
    private String freeSharesType;

    /** 信息来源 */
    @Excel(name = "信息来源")
    private String planFeature;

    public void setId(Integer id){this.id = id;}
    public Integer getId(){return id;}

    public void setSecurityCode(String securityCode){this.securityCode = securityCode;}
    public String getSecurityCode(){return securityCode;}

    public void setFreeDate(Date freeDate){this.freeDate = freeDate;}
    public Date getFreeDate(){return freeDate;}

    public void setLimitedHolderName(String limitedHolderName){this.limitedHolderName = limitedHolderName;}
    public String getLimitedHolderName(){return limitedHolderName;}

    public void setAddListingShares(Double addListingShares){this.addListingShares = addListingShares;}
    public Double getAddListingShares(){return addListingShares;}

    public void setFreeSharesType(String freeSharesType){this.freeSharesType = freeSharesType;}
    public String getFreeSharesType(){return freeSharesType;}

    public void setPlanFeature(String planFeature){this.planFeature = planFeature;}
    public String getPlanFeature(){return planFeature;}

    public InvJjgMx() {
        super();
    }

    public InvJjgMx(String securityCode) {
        this.securityCode = securityCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvJjgMx)) return false;
        InvJjgMx invJjgMx = (InvJjgMx) o;
        return Objects.equals(securityCode, invJjgMx.securityCode) && Objects.equals(freeDate, invJjgMx.freeDate) && Objects.equals(limitedHolderName, invJjgMx.limitedHolderName) && Objects.equals(addListingShares, invJjgMx.addListingShares) && Objects.equals(freeSharesType, invJjgMx.freeSharesType) && Objects.equals(planFeature, invJjgMx.planFeature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityCode, freeDate, limitedHolderName, addListingShares, freeSharesType, planFeature);
    }
}
