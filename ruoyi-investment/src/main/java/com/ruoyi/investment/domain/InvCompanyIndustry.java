package com.ruoyi.investment.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.Objects;

/**
 * 公司所属行业对象 inv_company_industry
 * 
 * @author yangwenyang
 * @date 2023-01-19
 */
public class InvCompanyIndustry extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Integer id;

    /** 股票代码 */
    @Excel(name = "股票代码")
    private String code;

    /** 类型 csrc:证监会行业 em:东财行业 */
    @Excel(name = "类型 csrc:证监会行业 em:东财行业")
    private String type;

    /** 一级 */
    @Excel(name = "一级")
    private Integer level1;

    /** 二级 */
    @Excel(name = "二级")
    private Integer level2;

    /** 三级 */
    @Excel(name = "三级")
    private Integer level3;

    /** 四级 */
    @Excel(name = "四级")
    private Integer level4;

    public void setId(Integer id){this.id = id;}
    public Integer getId(){return id;}

    public void setCode(String code){this.code = code;}
    public String getCode(){return code;}

    public void setType(String type){this.type = type;}
    public String getType(){return type;}

    public void setLevel1(Integer level1){this.level1 = level1;}
    public Integer getLevel1(){return level1;}

    public void setLevel2(Integer level2){this.level2 = level2;}
    public Integer getLevel2(){return level2;}

    public void setLevel3(Integer level3){this.level3 = level3;}
    public Integer getLevel3(){return level3;}

    public void setLevel4(Integer level4){this.level4 = level4;}
    public Integer getLevel4(){return level4;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvCompanyIndustry)) return false;
        InvCompanyIndustry that = (InvCompanyIndustry) o;
        return Objects.equals(code, that.code) && Objects.equals(type, that.type) && Objects.equals(level1, that.level1) && Objects.equals(level2, that.level2) && Objects.equals(level3, that.level3) && Objects.equals(level4, that.level4);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, type, level1, level2, level3, level4);
    }

}
