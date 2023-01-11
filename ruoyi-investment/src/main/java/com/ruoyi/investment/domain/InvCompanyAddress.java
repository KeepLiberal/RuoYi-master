package com.ruoyi.investment.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 公司地址对象 inv_company_address
 * 
 * @author yangwenyang
 * @date 2023-01-11
 */
public class InvCompanyAddress extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Integer id;

    /** 股票代码 */
    @Excel(name = "股票代码")
    private String code;

    /** 省 */
    @Excel(name = "省")
    private String province;

    /** 市区 */
    @Excel(name = "市区")
    private String city;

    /** 县 */
    @Excel(name = "县")
    private String county;

    /** 详细地址 */
    @Excel(name = "详细地址")
    private String address;

    public void setId(Integer id){this.id = id;}
    public Integer getId(){return id;}

    public void setCode(String code){this.code = code;}
    public String getCode(){return code;}

    public void setProvince(String province){this.province = province;}
    public String getProvince(){return province;}

    public void setCity(String city){this.city = city;}
    public String getCity(){return city;}

    public void setCounty(String county){this.county = county;}
    public String getCounty(){return county;}

    public void setAddress(String address){this.address = address;}
    public String getAddress(){return address;}


    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("code", getCode())
            .append("province", getProvince())
            .append("city", getCity())
            .append("county", getCounty())
            .append("address", getAddress())
            .toString();
    }
}
