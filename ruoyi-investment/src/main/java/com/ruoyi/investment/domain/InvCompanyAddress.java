package com.ruoyi.investment.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.Objects;

/**
 * 公司地址对象 inv_company_address
 * 
 * @author yangwenyang
 * @date 2023-01-19
 */
public class InvCompanyAddress extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Integer id;

    /** 股票代码 */
    @Excel(name = "股票代码")
    private String code;

    /** 类型 W:办公地址 R:注册地址 */
    @Excel(name = "类型 W:办公地址 R:注册地址")
    private String type;

    /** 省 */
    @Excel(name = "省")
    private Integer province;

    /** 市 */
    @Excel(name = "市")
    private Integer city;

    /** 区/县 */
    @Excel(name = "区/县")
    private Integer district;

    /** 详细地址 */
    @Excel(name = "详细地址")
    private String detail;

    public void setId(Integer id){this.id = id;}
    public Integer getId(){return id;}

    public void setCode(String code){this.code = code;}
    public String getCode(){return code;}

    public void setType(String type){this.type = type;}
    public String getType(){return type;}

    public void setProvince(Integer province){this.province = province;}
    public Integer getProvince(){return province;}

    public void setCity(Integer city){this.city = city;}
    public Integer getCity(){return city;}

    public void setDistrict(Integer district){this.district = district;}
    public Integer getDistrict(){return district;}

    public void setDetail(String detail){this.detail = detail;}
    public String getDetail(){return detail;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvCompanyAddress)) return false;
        InvCompanyAddress that = (InvCompanyAddress) o;
        return Objects.equals(code, that.code) && Objects.equals(type, that.type) && Objects.equals(province, that.province) && Objects.equals(city, that.city) && Objects.equals(district, that.district) && Objects.equals(detail, that.detail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, type, province, city, district, detail);
    }

}
