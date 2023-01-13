package com.ruoyi.investment.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.Objects;

/**
 * 证监会行业对象 inv_industry_csrc
 * 
 * @author yangwenyang
 * @date 2023-01-11
 */
public class InvIndustryCsrc extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /** id */
    private Integer id;

    /** 父id */
    @Excel(name = "父id")
    private Integer pid;

    /** 简称 */
    @Excel(name = "简称")
    private String shortName;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    /** 全称 */
    @Excel(name = "全称")
    private String mergeName;

    /** 层级 1-4 */
    @Excel(name = "层级 1-4")
    private Integer level;

    /** 拼音 */
    @Excel(name = "拼音")
    private String pinyin;

    /** 首字母 */
    @Excel(name = "首字母")
    private String first;

    public void setId(Integer id){this.id = id;}
    public Integer getId(){return id;}

    public void setPid(Integer pid){this.pid = pid;}
    public Integer getPid(){return pid;}

    public void setShortName(String shortName){this.shortName = shortName;}
    public String getShortName(){return shortName;}

    public void setName(String name){this.name = name;}
    public String getName(){return name;}

    public void setMergeName(String mergeName){this.mergeName = mergeName;}
    public String getMergeName(){return mergeName;}

    public void setLevel(Integer level){this.level = level;}
    public Integer getLevel(){return level;}

    public void setPinyin(String pinyin){this.pinyin = pinyin;}
    public String getPinyin(){return pinyin;}

    public void setFirst(String first){this.first = first;}
    public String getFirst(){return first;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvIndustryCsrc)) return false;
        InvIndustryCsrc that = (InvIndustryCsrc) o;
        return Objects.equals(shortName, that.shortName) && Objects.equals(name, that.name) && Objects.equals(mergeName, that.mergeName) && Objects.equals(level, that.level) && Objects.equals(pinyin, that.pinyin) && Objects.equals(first, that.first);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shortName, name, mergeName, level, pinyin, first);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("pid", getPid())
            .append("shortName", getShortName())
            .append("name", getName())
            .append("mergeName", getMergeName())
            .append("level", getLevel())
            .append("pinyin", getPinyin())
            .append("first", getFirst())
            .toString();
    }
}
