package com.ruoyi.investment.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.Objects;

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

    /** 级别 */
    @Excel(name = "级别")
    private Integer level;

    /** 东财行业ID */
    @Excel(name = "东财行业ID")
    private Integer industryEmId;

    public void setId(Integer id){this.id = id;}
    public Integer getId(){return id;}

    public void setCode(String code){this.code = code;}
    public String getCode(){return code;}

    public void setLevel(Integer level){this.level = level;}
    public Integer getLevel(){return level;}

    public void setIndustryEmId(Integer industryEmId){this.industryEmId = industryEmId;}
    public Integer getIndustryEmId(){return industryEmId;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvCompanyIndustryEm)) return false;
        InvCompanyIndustryEm that = (InvCompanyIndustryEm) o;
        return Objects.equals(code, that.code) && Objects.equals(level, that.level) && Objects.equals(industryEmId, that.industryEmId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, level, industryEmId);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("code", getCode())
            .append("level", getLevel())
            .append("industryEmId", getIndustryEmId())
            .toString();
    }
}
