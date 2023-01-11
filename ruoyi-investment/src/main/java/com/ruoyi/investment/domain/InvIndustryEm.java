package com.ruoyi.investment.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 东财行业对象 inv_industry_em
 * 
 * @author yangwenyang
 * @date 2023-01-11
 */
public class InvIndustryEm extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 父ID */
    @Excel(name = "父ID")
    private Long pid;

    /** 简称 */
    @Excel(name = "简称")
    private String shortname;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    /** 全称 */
    @Excel(name = "全称")
    private String mergename;

    /** 层级 1-4 */
    @Excel(name = "层级 1-4")
    private Long level;

    /** 拼音 */
    @Excel(name = "拼音")
    private String pinyin;

    /** 首字母 */
    @Excel(name = "首字母")
    private String first;

    public void setId(Long id){this.id = id;}
    public Long getId(){return id;}

    public void setPid(Long pid){this.pid = pid;}
    public Long getPid(){return pid;}

    public void setShortname(String shortname){this.shortname = shortname;}
    public String getShortname(){return shortname;}

    public void setName(String name){this.name = name;}
    public String getName(){return name;}

    public void setMergename(String mergename){this.mergename = mergename;}
    public String getMergename(){return mergename;}

    public void setLevel(Long level){this.level = level;}
    public Long getLevel(){return level;}

    public void setPinyin(String pinyin){this.pinyin = pinyin;}
    public String getPinyin(){return pinyin;}

    public void setFirst(String first){this.first = first;}
    public String getFirst(){return first;}


    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("pid", getPid())
            .append("shortname", getShortname())
            .append("name", getName())
            .append("mergename", getMergename())
            .append("level", getLevel())
            .append("pinyin", getPinyin())
            .append("first", getFirst())
            .toString();
    }
}
