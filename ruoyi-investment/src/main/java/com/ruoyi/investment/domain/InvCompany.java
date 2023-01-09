package com.ruoyi.investment.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 公司概况对象 inv_company
 * 
 * @author yangwenyang
 * @date 2023-01-09
 */
public class InvCompany extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /** 股票代码 */
    private String code;

    /** 公司名称 */
    @Excel(name = "公司名称")
    private String orgName;

    /** 英文名称 */
    @Excel(name = "英文名称")
    private String orgNameEn;

    /** A股代码 */
    @Excel(name = "A股代码")
    private String strCodea;

    /** A股简称 */
    @Excel(name = "A股简称")
    private String strNamea;

    /** A股扩位简称 */
    @Excel(name = "A股扩位简称")
    private String expandNameAbbr;

    /** 曾用名 */
    @Excel(name = "曾用名")
    private String formername;

    /** B股代码 */
    @Excel(name = "B股代码")
    private String strCodeb;

    /** B股简称 */
    @Excel(name = "B股简称")
    private String strNameb;

    /** H股代码 */
    @Excel(name = "H股代码")
    private String strCodeh;

    /** H股简称 */
    @Excel(name = "H股简称")
    private String strNameh;

    /** 证券类别 */
    @Excel(name = "证券类别")
    private String securityType;

    /** 所属东财行业 */
    @Excel(name = "所属东财行业")
    private String em2016;

    /** 上市交易所 */
    @Excel(name = "上市交易所")
    private String tradeMarket;

    /** 所属证监会行业 */
    @Excel(name = "所属证监会行业")
    private String industrycsrc1;

    /** 总经理 */
    @Excel(name = "总经理")
    private String president;

    /** 法人代表 */
    @Excel(name = "法人代表")
    private String legalPerson;

    /** 董秘 */
    @Excel(name = "董秘")
    private String secretary;

    /** 董事长 */
    @Excel(name = "董事长")
    private String chairman;

    /** 证券事务代表 */
    @Excel(name = "证券事务代表")
    private String secpresent;

    /** 独立董事 */
    @Excel(name = "独立董事")
    private String indedirectors;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String orgTel;

    /** 电子信箱 */
    @Excel(name = "电子信箱")
    private String orgEmail;

    /** 传真 */
    @Excel(name = "传真")
    private String orgFax;

    /** 公司网址 */
    @Excel(name = "公司网址")
    private String orgWeb;

    /** 办公地址 */
    @Excel(name = "办公地址")
    private String address;

    /** 注册地址 */
    @Excel(name = "注册地址")
    private String regAddress;

    /** 区域 */
    @Excel(name = "区域")
    private String province;

    /** 邮政编码 */
    @Excel(name = "邮政编码")
    private String addressPostcode;

    /** 注册资本(元) */
    @Excel(name = "注册资本(元)")
    private Double regCapital;

    /** 工商登记 */
    @Excel(name = "工商登记")
    private String regNum;

    /** 雇员人数 */
    @Excel(name = "雇员人数")
    private String empNum;

    /** 管理人员人数 */
    @Excel(name = "管理人员人数")
    private String tatolnumber;

    /** 律师事务所 */
    @Excel(name = "律师事务所")
    private String lawFirm;

    /** 会计师事务所 */
    @Excel(name = "会计师事务所")
    private String accountfirmName;

    /** 公司简介 */
    @Excel(name = "公司简介")
    private String orgProfile;

    /** 经营范围 */
    @Excel(name = "经营范围")
    private String businessScope;

    /** 成立日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "成立日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date foundDate;

    /** 上市日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "上市日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date listingDate;

    /** 发行市盈率(倍) */
    @Excel(name = "发行市盈率(倍)")
    private Double afterIssuePe;

    /** 网上发行日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "网上发行日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date onlineIssueDate;

    /** 发行方式 */
    @Excel(name = "发行方式")
    private String issueWay;

    /** 每股面值(元) */
    @Excel(name = "每股面值(元)")
    private Double parValue;

    /** 发行量(股) */
    @Excel(name = "发行量(股)")
    private Double totalIssueNum;

    /** 每股发行价(元) */
    @Excel(name = "每股发行价(元)")
    private Double issuePrice;

    /** 发行费用(元) */
    @Excel(name = "发行费用(元)")
    private Double decSumissuefee;

    /** 发行总市值(元) */
    @Excel(name = "发行总市值(元)")
    private Double totalFunds;

    /** 募集资金净额(元) */
    @Excel(name = "募集资金净额(元)")
    private Double netRaiseFunds;

    /** 首日开盘价(元) */
    @Excel(name = "首日开盘价(元)")
    private Double openPrice;

    /** 首日收盘价(元) */
    @Excel(name = "首日收盘价(元)")
    private Double closePrice;

    /** 首日换手率 */
    @Excel(name = "首日换手率")
    private Double turnoverrate;

    /** 首日最高价(元) */
    @Excel(name = "首日最高价(元)")
    private Double highPrice;

    /** 网下配售中签率 */
    @Excel(name = "网下配售中签率")
    private Double offlineVapRatio;

    /** 定价中签率 */
    @Excel(name = "定价中签率")
    private Double onlineIssueLwr;

    public void setCode(String code){this.code = code;}
    public String getCode(){return code;}

    public void setOrgName(String orgName){this.orgName = orgName;}
    public String getOrgName(){return orgName;}

    public void setOrgNameEn(String orgNameEn){this.orgNameEn = orgNameEn;}
    public String getOrgNameEn(){return orgNameEn;}

    public void setStrCodea(String strCodea){this.strCodea = strCodea;}
    public String getStrCodea(){return strCodea;}

    public void setStrNamea(String strNamea){this.strNamea = strNamea;}
    public String getStrNamea(){return strNamea;}

    public void setExpandNameAbbr(String expandNameAbbr){this.expandNameAbbr = expandNameAbbr;}
    public String getExpandNameAbbr(){return expandNameAbbr;}

    public void setFormername(String formername){this.formername = formername;}
    public String getFormername(){return formername;}

    public void setStrCodeb(String strCodeb){this.strCodeb = strCodeb;}
    public String getStrCodeb(){return strCodeb;}

    public void setStrNameb(String strNameb){this.strNameb = strNameb;}
    public String getStrNameb(){return strNameb;}

    public void setStrCodeh(String strCodeh){this.strCodeh = strCodeh;}
    public String getStrCodeh(){return strCodeh;}

    public void setStrNameh(String strNameh){this.strNameh = strNameh;}
    public String getStrNameh(){return strNameh;}

    public void setSecurityType(String securityType){this.securityType = securityType;}
    public String getSecurityType(){return securityType;}

    public void setEm2016(String em2016){this.em2016 = em2016;}
    public String getEm2016(){return em2016;}

    public void setTradeMarket(String tradeMarket){this.tradeMarket = tradeMarket;}
    public String getTradeMarket(){return tradeMarket;}

    public void setIndustrycsrc1(String industrycsrc1){this.industrycsrc1 = industrycsrc1;}
    public String getIndustrycsrc1(){return industrycsrc1;}

    public void setPresident(String president){this.president = president;}
    public String getPresident(){return president;}

    public void setLegalPerson(String legalPerson){this.legalPerson = legalPerson;}
    public String getLegalPerson(){return legalPerson;}

    public void setSecretary(String secretary){this.secretary = secretary;}
    public String getSecretary(){return secretary;}

    public void setChairman(String chairman){this.chairman = chairman;}
    public String getChairman(){return chairman;}

    public void setSecpresent(String secpresent){this.secpresent = secpresent;}
    public String getSecpresent(){return secpresent;}

    public void setIndedirectors(String indedirectors){this.indedirectors = indedirectors;}
    public String getIndedirectors(){return indedirectors;}

    public void setOrgTel(String orgTel){this.orgTel = orgTel;}
    public String getOrgTel(){return orgTel;}

    public void setOrgEmail(String orgEmail){this.orgEmail = orgEmail;}
    public String getOrgEmail(){return orgEmail;}

    public void setOrgFax(String orgFax){this.orgFax = orgFax;}
    public String getOrgFax(){return orgFax;}

    public void setOrgWeb(String orgWeb){this.orgWeb = orgWeb;}
    public String getOrgWeb(){return orgWeb;}

    public void setAddress(String address){this.address = address;}
    public String getAddress(){return address;}

    public void setRegAddress(String regAddress){this.regAddress = regAddress;}
    public String getRegAddress(){return regAddress;}

    public void setProvince(String province){this.province = province;}
    public String getProvince(){return province;}

    public void setAddressPostcode(String addressPostcode){this.addressPostcode = addressPostcode;}
    public String getAddressPostcode(){return addressPostcode;}

    public void setRegCapital(Double regCapital){this.regCapital = regCapital;}
    public Double getRegCapital(){return regCapital;}

    public void setRegNum(String regNum){this.regNum = regNum;}
    public String getRegNum(){return regNum;}

    public void setEmpNum(String empNum){this.empNum = empNum;}
    public String getEmpNum(){return empNum;}

    public void setTatolnumber(String tatolnumber){this.tatolnumber = tatolnumber;}
    public String getTatolnumber(){return tatolnumber;}

    public void setLawFirm(String lawFirm){this.lawFirm = lawFirm;}
    public String getLawFirm(){return lawFirm;}

    public void setAccountfirmName(String accountfirmName){this.accountfirmName = accountfirmName;}
    public String getAccountfirmName(){return accountfirmName;}

    public void setOrgProfile(String orgProfile){this.orgProfile = orgProfile;}
    public String getOrgProfile(){return orgProfile;}

    public void setBusinessScope(String businessScope){this.businessScope = businessScope;}
    public String getBusinessScope(){return businessScope;}

    public void setFoundDate(Date foundDate){this.foundDate = foundDate;}
    public Date getFoundDate(){return foundDate;}

    public void setListingDate(Date listingDate){this.listingDate = listingDate;}
    public Date getListingDate(){return listingDate;}

    public void setAfterIssuePe(Double afterIssuePe){this.afterIssuePe = afterIssuePe;}
    public Double getAfterIssuePe(){return afterIssuePe;}

    public void setOnlineIssueDate(Date onlineIssueDate){this.onlineIssueDate = onlineIssueDate;}
    public Date getOnlineIssueDate(){return onlineIssueDate;}

    public void setIssueWay(String issueWay){this.issueWay = issueWay;}
    public String getIssueWay(){return issueWay;}

    public void setParValue(Double parValue){this.parValue = parValue;}
    public Double getParValue(){return parValue;}

    public void setTotalIssueNum(Double totalIssueNum){this.totalIssueNum = totalIssueNum;}
    public Double getTotalIssueNum(){return totalIssueNum;}

    public void setIssuePrice(Double issuePrice){this.issuePrice = issuePrice;}
    public Double getIssuePrice(){return issuePrice;}

    public void setDecSumissuefee(Double decSumissuefee){this.decSumissuefee = decSumissuefee;}
    public Double getDecSumissuefee(){return decSumissuefee;}

    public void setTotalFunds(Double totalFunds){this.totalFunds = totalFunds;}
    public Double getTotalFunds(){return totalFunds;}

    public void setNetRaiseFunds(Double netRaiseFunds){this.netRaiseFunds = netRaiseFunds;}
    public Double getNetRaiseFunds(){return netRaiseFunds;}

    public void setOpenPrice(Double openPrice){this.openPrice = openPrice;}
    public Double getOpenPrice(){return openPrice;}

    public void setClosePrice(Double closePrice){this.closePrice = closePrice;}
    public Double getClosePrice(){return closePrice;}

    public void setTurnoverrate(Double turnoverrate){this.turnoverrate = turnoverrate;}
    public Double getTurnoverrate(){return turnoverrate;}

    public void setHighPrice(Double highPrice){this.highPrice = highPrice;}
    public Double getHighPrice(){return highPrice;}

    public void setOfflineVapRatio(Double offlineVapRatio){this.offlineVapRatio = offlineVapRatio;}
    public Double getOfflineVapRatio(){return offlineVapRatio;}

    public void setOnlineIssueLwr(Double onlineIssueLwr){this.onlineIssueLwr = onlineIssueLwr;}
    public Double getOnlineIssueLwr(){return onlineIssueLwr;}


    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("code", getCode())
            .append("orgName", getOrgName())
            .append("orgNameEn", getOrgNameEn())
            .append("strCodea", getStrCodea())
            .append("strNamea", getStrNamea())
            .append("expandNameAbbr", getExpandNameAbbr())
            .append("formername", getFormername())
            .append("strCodeb", getStrCodeb())
            .append("strNameb", getStrNameb())
            .append("strCodeh", getStrCodeh())
            .append("strNameh", getStrNameh())
            .append("securityType", getSecurityType())
            .append("em2016", getEm2016())
            .append("tradeMarket", getTradeMarket())
            .append("industrycsrc1", getIndustrycsrc1())
            .append("president", getPresident())
            .append("legalPerson", getLegalPerson())
            .append("secretary", getSecretary())
            .append("chairman", getChairman())
            .append("secpresent", getSecpresent())
            .append("indedirectors", getIndedirectors())
            .append("orgTel", getOrgTel())
            .append("orgEmail", getOrgEmail())
            .append("orgFax", getOrgFax())
            .append("orgWeb", getOrgWeb())
            .append("address", getAddress())
            .append("regAddress", getRegAddress())
            .append("province", getProvince())
            .append("addressPostcode", getAddressPostcode())
            .append("regCapital", getRegCapital())
            .append("regNum", getRegNum())
            .append("empNum", getEmpNum())
            .append("tatolnumber", getTatolnumber())
            .append("lawFirm", getLawFirm())
            .append("accountfirmName", getAccountfirmName())
            .append("orgProfile", getOrgProfile())
            .append("businessScope", getBusinessScope())
            .append("foundDate", getFoundDate())
            .append("listingDate", getListingDate())
            .append("afterIssuePe", getAfterIssuePe())
            .append("onlineIssueDate", getOnlineIssueDate())
            .append("issueWay", getIssueWay())
            .append("parValue", getParValue())
            .append("totalIssueNum", getTotalIssueNum())
            .append("issuePrice", getIssuePrice())
            .append("decSumissuefee", getDecSumissuefee())
            .append("totalFunds", getTotalFunds())
            .append("netRaiseFunds", getNetRaiseFunds())
            .append("openPrice", getOpenPrice())
            .append("closePrice", getClosePrice())
            .append("turnoverrate", getTurnoverrate())
            .append("highPrice", getHighPrice())
            .append("offlineVapRatio", getOfflineVapRatio())
            .append("onlineIssueLwr", getOnlineIssueLwr())
            .toString();
    }
}
