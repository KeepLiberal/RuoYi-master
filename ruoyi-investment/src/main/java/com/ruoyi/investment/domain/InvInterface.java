package com.ruoyi.investment.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 接口配置对象 inv_interface
 * 
 * @author yangwenyang
 * @date 2023-01-02
 */
public class InvInterface extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 接口代码 */
    @Excel(name = "接口代码")
    private String code;

    /** 接口名称 */
    @Excel(name = "接口名称")
    private String name;

    /** 接口分类 */
    @Excel(name = "接口分类")
    private String type;

    /** 接口地址 */
    @Excel(name = "接口地址")
    private String url;

    /** 报告期地址 */
    @Excel(name = "报告期地址")
    private String bgqUrl;

    /** 年度地址 */
    @Excel(name = "年度地址")
    private String ndUrl;

    /** 季度地址 */
    @Excel(name = "季度地址")
    private String jdUrl;

    /** 接口地址是否包含市场 */
    @Excel(name = "接口地址是否包含市场")
    private String urlMarket;

    /** 页面地址 */
    @Excel(name = "页面地址")
    private String htmlUrl;

    /** 页面地址是否包含市场 */
    @Excel(name = "页面地址是否包含市场")
    private String htmlMarket;

    public void setId(Long id){this.id = id;}
    public Long getId(){return id;}

    public void setCode(String code){this.code = code;}
    public String getCode(){return code;}

    public void setName(String name){this.name = name;}
    public String getName(){return name;}

    public void setType(String type){this.type = type;}
    public String getType(){return type;}

    public void setUrl(String url){this.url = url;}
    public String getUrl(){return url;}

    public void setBgqUrl(String bgqUrl){this.bgqUrl = bgqUrl;}
    public String getBgqUrl(){return bgqUrl;}

    public void setNdUrl(String ndUrl){this.ndUrl = ndUrl;}
    public String getNdUrl(){return ndUrl;}

    public void setJdUrl(String jdUrl){this.jdUrl = jdUrl;}
    public String getJdUrl(){return jdUrl;}

    public void setUrlMarket(String urlMarket){this.urlMarket = urlMarket;}
    public String getUrlMarket(){return urlMarket;}

    public void setHtmlUrl(String htmlUrl){this.htmlUrl = htmlUrl;}
    public String getHtmlUrl(){return htmlUrl;}

    public void setHtmlMarket(String htmlMarket){this.htmlMarket = htmlMarket;}
    public String getHtmlMarket(){return htmlMarket;}


    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("code", getCode())
            .append("name", getName())
            .append("type", getType())
            .append("url", getUrl())
            .append("bgqUrl", getBgqUrl())
            .append("ndUrl", getNdUrl())
            .append("jdUrl", getJdUrl())
            .append("urlMarket", getUrlMarket())
            .append("htmlUrl", getHtmlUrl())
            .append("htmlMarket", getHtmlMarket())
            .append("remark", getRemark())
            .toString();
    }
}
