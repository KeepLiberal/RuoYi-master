package com.ruoyi.investment.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.Objects;

/**
 * 沪深A股基本信息对象 inv_stock
 * 
 * @author yangwenyang
 * @date 2023-01-19
 */
public class InvStock extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Integer id;

    /** 股票代码 */
    @Excel(name = "股票代码")
    private String code;

    /** 股票简称 */
    @Excel(name = "股票简称")
    private String name;

    /** 股票市场 */
    @Excel(name = "股票市场")
    private String market;

    /** 股票分类 */
    @Excel(name = "股票分类")
    private String stockType;

    /** 组织代码 */
    @Excel(name = "组织代码")
    private String orgCode;

    /** 组织简称 */
    @Excel(name = "组织简称")
    private String orgType;

    /** 股票分类代码 */
    @Excel(name = "股票分类代码")
    private String securityTypeCode;

    public void setId(Integer id){this.id = id;}
    public Integer getId(){return id;}

    public void setCode(String code){this.code = code;}
    public String getCode(){return code;}

    public void setName(String name){this.name = name;}
    public String getName(){return name;}

    public void setMarket(String market){this.market = market;}
    public String getMarket(){return market;}

    public void setStockType(String stockType){this.stockType = stockType;}
    public String getStockType(){return stockType;}

    public void setOrgCode(String orgCode){this.orgCode = orgCode;}
    public String getOrgCode(){return orgCode;}

    public void setOrgType(String orgType){this.orgType = orgType;}
    public String getOrgType(){return orgType;}

    public void setSecurityTypeCode(String securityTypeCode){this.securityTypeCode = securityTypeCode;}
    public String getSecurityTypeCode(){return securityTypeCode;}

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
}
