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
    private String interfaceCode;

    /** 接口名称 */
    @Excel(name = "接口名称")
    private String interfaceName;

    /** 接口分类 */
    @Excel(name = "接口分类")
    private String interfaceType;

    /** 接口地址 */
    @Excel(name = "接口地址")
    private String interfaceUrl;

    /** 接口地址是否包含股票市场 */
    @Excel(name = "接口地址是否包含股票市场")
    private String interfaceUrlMarketFlag;

    /** 接口地址是否包含股票代码 */
    @Excel(name = "接口地址是否包含股票代码")
    private String interfaceUrlCodeFlag;

    /** 页面地址 */
    @Excel(name = "页面地址")
    private String htmlUrl;

    /** 页面地址是否包含股票市场 */
    @Excel(name = "页面地址是否包含股票市场")
    private String htmlUrlMarketFlag;

    /** 页面地址是否包含股票代码 */
    @Excel(name = "页面地址是否包含股票代码")
    private String htmlUrlCodeFlag;

    public void setId(Long id){this.id = id;}
    public Long getId(){return id;}

    public void setInterfaceCode(String interfaceCode){this.interfaceCode = interfaceCode;}
    public String getInterfaceCode(){return interfaceCode;}

    public void setInterfaceName(String interfaceName){this.interfaceName = interfaceName;}
    public String getInterfaceName(){return interfaceName;}

    public void setInterfaceType(String interfaceType){this.interfaceType = interfaceType;}
    public String getInterfaceType(){return interfaceType;}

    public void setInterfaceUrl(String interfaceUrl){this.interfaceUrl = interfaceUrl;}
    public String getInterfaceUrl(){return interfaceUrl;}

    public void setInterfaceUrlMarketFlag(String interfaceUrlMarketFlag){this.interfaceUrlMarketFlag = interfaceUrlMarketFlag;}
    public String getInterfaceUrlMarketFlag(){return interfaceUrlMarketFlag;}

    public void setInterfaceUrlCodeFlag(String interfaceUrlCodeFlag){this.interfaceUrlCodeFlag = interfaceUrlCodeFlag;}
    public String getInterfaceUrlCodeFlag(){return interfaceUrlCodeFlag;}

    public void setHtmlUrl(String htmlUrl){this.htmlUrl = htmlUrl;}
    public String getHtmlUrl(){return htmlUrl;}

    public void setHtmlUrlMarketFlag(String htmlUrlMarketFlag){this.htmlUrlMarketFlag = htmlUrlMarketFlag;}
    public String getHtmlUrlMarketFlag(){return htmlUrlMarketFlag;}

    public void setHtmlUrlCodeFlag(String htmlUrlCodeFlag){this.htmlUrlCodeFlag = htmlUrlCodeFlag;}
    public String getHtmlUrlCodeFlag(){return htmlUrlCodeFlag;}


    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("interfaceCode", getInterfaceCode())
            .append("interfaceName", getInterfaceName())
            .append("interfaceType", getInterfaceType())
            .append("interfaceUrl", getInterfaceUrl())
            .append("interfaceUrlMarketFlag", getInterfaceUrlMarketFlag())
            .append("interfaceUrlCodeFlag", getInterfaceUrlCodeFlag())
            .append("htmlUrl", getHtmlUrl())
            .append("htmlUrlMarketFlag", getHtmlUrlMarketFlag())
            .append("htmlUrlCodeFlag", getHtmlUrlCodeFlag())
            .append("remark", getRemark())
            .toString();
    }
}
