package com.ruoyi.quartz.async.invData;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.NumFormatUtil;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.http.HttpUtils;
import com.ruoyi.investment.domain.*;
import com.ruoyi.investment.mapper.InvCompanyAddressMapper;
import com.ruoyi.investment.mapper.InvCompanyIndustryMapper;
import com.ruoyi.investment.mapper.InvCompanyMapper;
import com.ruoyi.quartz.constant.InvConstants;
import com.ruoyi.system.domain.SysArea;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.Field;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;


@Slf4j
@Component
@Async("investmentDataThreadPoolTaskExecutor")
public class InvDataCompanyAsyncTask {
    @Resource
    private InvCompanyMapper invCompanyMapper;
    @Resource
    private InvCompanyIndustryMapper invCompanyIndustryMapper;
    @Resource
    private InvCompanyAddressMapper invCompanyAddressMapper;


    /**
     * 公司概况 任务
     */
    public void invCompanyTask(InvStock stock, String url, AtomicInteger count) {
        String urlStr = url;
        try {
            url = url.replace("code=", "code=" + stock.getMarket() + stock.getCode());
            String result = HttpUtils.sendGet(url, new AtomicInteger(10));
            if (StringUtils.isNotEmpty(result) && !result.contains("<title>无F10资料</title>")) {
                JSONObject jsonObject = JSONObject.parseObject(result);
                Set<String> keySetOut = jsonObject.keySet();
                Map<String, String> map = new HashMap<>();
                for (String keyOut : keySetOut) {
                    Object obj = jsonObject.get(keyOut);
                    if (obj instanceof JSONArray) {
                        JSONArray jsonArray = (JSONArray) obj;
                        Iterator<Object> iterator = jsonArray.iterator();
                        while (iterator.hasNext()) {
                            JSONObject next = (JSONObject) iterator.next();
                            Set<String> keySetInner = next.keySet();
                            for (String keyInner : keySetInner) {
                                String value = String.valueOf(next.get(keyInner));
                                if (StringUtils.isNotEmpty(value) && !"null".equals(value)) {
                                    map.put(keyInner, value);
                                }
                            }
                        }
                    }
                }

                InvCompany invCompany = new InvCompany(stock.getCode());
                Class<? extends InvCompany> invCompanyClass = invCompany.getClass();
                Field[] declaredFields = invCompanyClass.getDeclaredFields();
                for (Field field : declaredFields) {
                    field.setAccessible(true);
                    String genericType = field.getGenericType().toString();
                    String fieldName = field.getName();
                    String valueString = map.get(StringUtils.toUnderScoreCase(fieldName).toUpperCase());
                    valueString = StringUtils.isNotEmpty(valueString) ? valueString.trim() : null;
                    if (!"code".equals(fieldName) && StringUtils.isNotEmpty(valueString)) {
                        if ("class java.lang.Double".equals(genericType)) {
                            Double value = NumFormatUtil.toDouble(valueString);
                            if ("regCapital".equals(fieldName) && null != value) {
                                //注册资本比较特殊
                                value = value * 10000;
                            }
                            field.set(invCompany, value);
                        }
                        if ("class java.util.Date".equals(genericType)) {
                            Date value = DateUtils.parseDate(valueString);
                            field.set(invCompany, value);
                        }
                        if ("class java.lang.String".equals(genericType)) {
                            field.set(invCompany, valueString);
                        }
                    }
                }
                InvCompany compare = invCompanyMapper.selectInvCompanyByCode(stock.getCode());
                if (null == compare) {
                    invCompanyMapper.insertInvCompany(invCompany);
                } else {
                    if (!invCompany.equals(compare)) {
                        invCompany.setId(compare.getId());
                        invCompanyMapper.updateInvCompany(invCompany);
                    }
                }
            }
        } catch (Exception e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                invCompanyTask(stock, urlStr, count);
            } else {
                log.error(">>>异常:", e);
            }
        }
    }

    /**
     * 行业
     */
    public void invIndustryTask(InvCompany company, String type, AtomicInteger count) {
        try {
            String industry = null;
            if ("csrc".equals(type)) {
                industry = company.getIndustrycsrc1();
            }
            if ("em".equals(type)) {
                industry = company.getEm2016();
            }
            if (StringUtils.isNotEmpty(industry)) {
                String[] industrys = industry.split("-");
                for (int i = 0; i < industrys.length; i++) {
                    int level = i + 1;
                    String name = industrys[i];
                    String shortName = name.replace("业", "");
                    String mergeName = "";
                    for (int j = 0; j <= i; j++) {
                        if (StringUtils.isNotEmpty(mergeName)) {
                            mergeName = mergeName + "-" + industrys[j];
                        } else {
                            mergeName = industrys[j];
                        }
                    }
                    InvIndustry invIndustry = new InvIndustry();
                    invIndustry.setShortName(shortName);
                    invIndustry.setName(name);
                    invIndustry.setType(type);
                    invIndustry.setLevel(level);
                    invIndustry.setMergeName(mergeName);
                    InvConstants.invIndustrySet.add(invIndustry);
                }
            }
        } catch (Exception e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                invIndustryTask(company, type, count);
            } else {
                log.error(">>>异常:", e);
            }
        }
    }

    /**
     * 公司所属行业
     */
    public void invCompanyIndustry(InvCompany company, Map<String, InvIndustry> invIndustryMap, String type, AtomicInteger count) {
        try {
            String industry = null;
            if ("csrc".equals(type)) {
                industry = company.getIndustrycsrc1();
            }
            if ("em".equals(type)) {
                industry = company.getEm2016();
            }
            if (StringUtils.isNotEmpty(industry)) {
                InvCompanyIndustry invCompanyIndustry = new InvCompanyIndustry();
                invCompanyIndustry.setCode(company.getCode());
                invCompanyIndustry.setType(type);
                List<InvCompanyIndustry> invCompanyIndustries = invCompanyIndustryMapper.selectInvCompanyIndustryList(invCompanyIndustry);

                String[] industryCsrcs = industry.split("-");
                for (int i = 0; i < industryCsrcs.length; i++) {
                    int level = i + 1;
                    String mergeName = "";
                    for (int j = 0; j <= i; j++) {
                        if (StringUtils.isNotEmpty(mergeName)) {
                            mergeName = mergeName + "-" + industryCsrcs[j];
                        } else {
                            mergeName = industryCsrcs[j];
                        }
                    }

                    String key = mergeName + type + level;
                    if (invIndustryMap.containsKey(key)) {
                        Integer invIndustryId = invIndustryMap.get(key).getId();
                        if (level == 1) {
                            invCompanyIndustry.setLevel1(invIndustryId);
                        }
                        if (level == 2) {
                            invCompanyIndustry.setLevel2(invIndustryId);
                        }
                        if (level == 3) {
                            invCompanyIndustry.setLevel3(invIndustryId);
                        }
                        if (level == 4) {
                            invCompanyIndustry.setLevel4(invIndustryId);
                        }
                    }
                }

                if (null == invCompanyIndustries || invCompanyIndustries.size() == 0) {
                    invCompanyIndustryMapper.insertInvCompanyIndustry(invCompanyIndustry);
                } else {
                    InvCompanyIndustry compare = invCompanyIndustries.get(0);
                    if (!compare.equals(invCompanyIndustry)) {
                        invCompanyIndustry.setId(compare.getId());
                        invCompanyIndustryMapper.updateInvCompanyIndustry(invCompanyIndustry);
                    }
                }
            }
        } catch (Exception e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                invCompanyIndustry(company, invIndustryMap, type, count);
            } else {
                log.error(">>>异常:", e);
            }
        }
    }

    /**
     * 公司办公地址、注册地址
     */
    public void invCompanyAddress(InvCompany company, Map<String, SysArea> sysAreasMap, AtomicInteger count) {
        try {
            InvCompanyAddress invCompanyAddress = new InvCompanyAddress();
            invCompanyAddress.setCode(company.getCode());
            invCompanyAddress.setType("W");
            List<InvCompanyAddress> invCompanyAddresses = invCompanyAddressMapper.selectInvCompanyAddressList(invCompanyAddress);

            String provinceName = company.getProvince();
            String provinceShortKey = provinceName + "1";
            if (sysAreasMap.containsKey(provinceShortKey)) {
                SysArea sysArea = sysAreasMap.get(provinceShortKey);
                invCompanyAddress.setProvince(sysArea.getId());
            }
            if (null == invCompanyAddresses || invCompanyAddresses.size() == 0) {
                invCompanyAddressMapper.insertInvCompanyAddress(invCompanyAddress);
            } else {
                InvCompanyAddress compare = invCompanyAddresses.get(0);
                if (!compare.equals(invCompanyAddress)) {
                    invCompanyAddress.setId(compare.getId());
                    invCompanyAddressMapper.updateInvCompanyAddress(invCompanyAddress);
                }
            }
        } catch (Exception e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                invCompanyAddress(company, sysAreasMap, count);
            } else {
                log.error(">>>异常:" + company.getCode(), e);
            }
        }
    }

}
