package com.ruoyi.investment.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.Date;
import java.util.Objects;

/**
 * 证劵交易所对象 inv_stock_exchange
 * 
 * @author yangwenyang
 * @date 2023-01-27
 */
public class InvStockExchange extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /** id */
    private Integer id;

    /** 交易所代码 */
    @Excel(name = "交易所代码")
    private String code;

    /** 交易所名称 */
    @Excel(name = "交易所名称")
    private String name;

    /** 创建日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createDate;

    public void setId(Integer id){this.id = id;}
    public Integer getId(){return id;}

    public void setCode(String code){this.code = code;}
    public String getCode(){return code;}

    public void setName(String name){this.name = name;}
    public String getName(){return name;}

    public void setCreateDate(Date createDate){this.createDate = createDate;}
    public Date getCreateDate(){return createDate;}

    public InvStockExchange() {
        super();
    }

    public InvStockExchange(String code, String name, Date createDate) {
        this.code = code;
        this.name = name;
        this.createDate = createDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvStockExchange)) return false;
        InvStockExchange that = (InvStockExchange) o;
        return Objects.equals(code, that.code) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name);
    }
}
