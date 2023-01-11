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

    /** 级别 */
    @Excel(name = "级别")
    private Integer level;

    /** 证监会行业ID */
    @Excel(name = "证监会行业ID")
    private Integer industryCsrcId;

    public void setId(Integer id){this.id = id;}
    public Integer getId(){return id;}

    public void setCode(String code){this.code = code;}
    public String getCode(){return code;}

    public void setLevel(Integer level){this.level = level;}
    public Integer getLevel(){return level;}

    public void setIndustryCsrcId(Integer industryCsrcId){this.industryCsrcId = industryCsrcId;}
    public Integer getIndustryCsrcId(){return industryCsrcId;}


    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("code", getCode())
            .append("level", getLevel())
            .append("industryCsrcId", getIndustryCsrcId())
            .toString();
    }
}
