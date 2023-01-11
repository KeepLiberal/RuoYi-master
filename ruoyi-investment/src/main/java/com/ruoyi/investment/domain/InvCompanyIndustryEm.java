package com.ruoyi.investment.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 所属东财行业对象 inv_company_industry_em
 * 
 * @author yangwenyang
 * @date 2023-01-11
 */
public class InvCompanyIndustryEm extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Integer id;

    /** 股票代码 */
    @Excel(name = "股票代码")
    private String code;

    /** 一级 */
    @Excel(name = "一级")
    private String em1;

    /** 二级 */
    @Excel(name = "二级")
    private String em2;

    /** 三级 */
    @Excel(name = "三级")
    private String em3;

    /** 四级 */
    @Excel(name = "四级")
    private String em4;

    public void setId(Integer id){this.id = id;}
    public Integer getId(){return id;}

    public void setCode(String code){this.code = code;}
    public String getCode(){return code;}

    public void setEm1(String em1){this.em1 = em1;}
    public String getEm1(){return em1;}

    public void setEm2(String em2){this.em2 = em2;}
    public String getEm2(){return em2;}

    public void setEm3(String em3){this.em3 = em3;}
    public String getEm3(){return em3;}

    public void setEm4(String em4){this.em4 = em4;}
    public String getEm4(){return em4;}


    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("code", getCode())
            .append("em1", getEm1())
            .append("em2", getEm2())
            .append("em3", getEm3())
            .append("em4", getEm4())
            .toString();
    }
}
