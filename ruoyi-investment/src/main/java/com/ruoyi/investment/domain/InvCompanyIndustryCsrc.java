package com.ruoyi.investment.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 所属证监会行业对象 inv_company_industry_csrc
 * 
 * @author yangwenyang
 * @date 2023-01-11
 */
public class InvCompanyIndustryCsrc extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Integer id;

    /** 股票代码 */
    @Excel(name = "股票代码")
    private String code;

    /** 一级 */
    @Excel(name = "一级")
    private String csrc1;

    /** 二级 */
    @Excel(name = "二级")
    private String csrc2;

    /** 三级 */
    @Excel(name = "三级")
    private String csrc3;

    /** 四级 */
    @Excel(name = "四级")
    private String csrc4;

    public void setId(Integer id){this.id = id;}
    public Integer getId(){return id;}

    public void setCode(String code){this.code = code;}
    public String getCode(){return code;}

    public void setCsrc1(String csrc1){this.csrc1 = csrc1;}
    public String getCsrc1(){return csrc1;}

    public void setCsrc2(String csrc2){this.csrc2 = csrc2;}
    public String getCsrc2(){return csrc2;}

    public void setCsrc3(String csrc3){this.csrc3 = csrc3;}
    public String getCsrc3(){return csrc3;}

    public void setCsrc4(String csrc4){this.csrc4 = csrc4;}
    public String getCsrc4(){return csrc4;}


    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("code", getCode())
            .append("csrc1", getCsrc1())
            .append("csrc2", getCsrc2())
            .append("csrc3", getCsrc3())
            .append("csrc4", getCsrc4())
            .toString();
    }
}
