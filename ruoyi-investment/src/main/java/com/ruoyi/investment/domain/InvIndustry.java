package com.ruoyi.investment.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.Objects;

/**
 * 行业对象 inv_industry
 * 
 * @author yangwenyang
 * @date 2023-01-19
 */
public class InvIndustry extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /** id */
    private Integer id;

    /** 父id */
    @Excel(name = "父id")
    private Integer pid;

    /** 类型 csrc:证监会行业 em:东财行业 */
    @Excel(name = "类型 csrc:证监会行业 em:东财行业")
    private String type;

    /** 层级 1-4 */
    @Excel(name = "层级 1-4")
    private Integer level;

    /** 简称 */
    @Excel(name = "简称")
    private String shortName;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    /** 全称 */
    @Excel(name = "全称")
    private String mergeName;

    public void setId(Integer id){this.id = id;}
    public Integer getId(){return id;}

    public void setPid(Integer pid){this.pid = pid;}
    public Integer getPid(){return pid;}

    public void setType(String type){this.type = type;}
    public String getType(){return type;}

    public void setLevel(Integer level){this.level = level;}
    public Integer getLevel(){return level;}

    public void setShortName(String shortName){this.shortName = shortName;}
    public String getShortName(){return shortName;}

    public void setName(String name){this.name = name;}
    public String getName(){return name;}

    public void setMergeName(String mergeName){this.mergeName = mergeName;}
    public String getMergeName(){return mergeName;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvIndustry)) return false;
        InvIndustry that = (InvIndustry) o;
        return Objects.equals(type, that.type) && Objects.equals(level, that.level) && Objects.equals(shortName, that.shortName) && Objects.equals(name, that.name) && Objects.equals(mergeName, that.mergeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, level, shortName, name, mergeName);
    }
}
