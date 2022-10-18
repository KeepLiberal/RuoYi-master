package com.ruoyi.investment.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.Objects;

/**
 * A股基本信息对象 inv_stock
 * 
 * @author yangwenyang
 * @date 2022-10-18
 */
public class InvStock extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 股票代码 */
    private String code;

    /** 股票简称 */
    @Excel(name = "股票简称")
    private String name;

    /** 股票分类 */
    @Excel(name = "股票分类")
    private String stockType;

    /** 股票市场 */
    @Excel(name = "股票市场")
    private String market;

    /** 组织代码 */
    @Excel(name = "组织代码")
    private String orgCode;

    /** 全量分类代码 */
    @Excel(name = "全量分类代码")
    private String securityTypeCode;


    public InvStock() {
        super();
    }

    public InvStock(String code, String name, String market) {
        this.code = code;
        this.name = name;
        this.market = market;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvStock)) return false;
        InvStock invStock = (InvStock) o;
        return Objects.equals(code, invStock.code) && Objects.equals(name, invStock.name) && Objects.equals(market, invStock.market);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, market);
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getCode() 
    {
        return code;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setStockType(String stockType) 
    {
        this.stockType = stockType;
    }

    public String getStockType() 
    {
        return stockType;
    }
    public void setMarket(String market) 
    {
        this.market = market;
    }

    public String getMarket() 
    {
        return market;
    }
    public void setOrgCode(String orgCode) 
    {
        this.orgCode = orgCode;
    }

    public String getOrgCode() 
    {
        return orgCode;
    }
    public void setSecurityTypeCode(String securityTypeCode) 
    {
        this.securityTypeCode = securityTypeCode;
    }

    public String getSecurityTypeCode() 
    {
        return securityTypeCode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("code", getCode())
            .append("name", getName())
            .append("stockType", getStockType())
            .append("market", getMarket())
            .append("orgCode", getOrgCode())
            .append("securityTypeCode", getSecurityTypeCode())
            .toString();
    }
}
