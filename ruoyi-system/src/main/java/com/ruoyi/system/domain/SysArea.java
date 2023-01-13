package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 地区对象 sys_area
 * 
 * @author yangwenyang
 * @date 2023-01-13
 */
public class SysArea extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /** ID */
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

    /** 层级 0 1 2 省市区县 */
    @Excel(name = "层级 0 1 2 省市区县")
    private Integer level;

    /** 拼音 */
    @Excel(name = "拼音")
    private String pinyin;

    /** 长途区号 */
    @Excel(name = "长途区号")
    private String code;

    /** 邮编 */
    @Excel(name = "邮编")
    private String zip;

    /** 首字母 */
    @Excel(name = "首字母")
    private String first;

    /** 经度 */
    @Excel(name = "经度")
    private String lng;

    /** 纬度 */
    @Excel(name = "纬度")
    private String lat;

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

    public void setCode(String code){this.code = code;}
    public String getCode(){return code;}

    public void setZip(String zip){this.zip = zip;}
    public String getZip(){return zip;}

    public void setFirst(String first){this.first = first;}
    public String getFirst(){return first;}

    public void setLng(String lng){this.lng = lng;}
    public String getLng(){return lng;}

    public void setLat(String lat){this.lat = lat;}
    public String getLat(){return lat;}


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
            .append("code", getCode())
            .append("zip", getZip())
            .append("first", getFirst())
            .append("lng", getLng())
            .append("lat", getLat())
            .toString();
    }
}
