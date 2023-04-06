package com.ruoyi.quartz.async.data;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.NumFormatUtil;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.http.HttpUtils;
import com.ruoyi.investment.domain.*;
import com.ruoyi.investment.mapper.InvFhrzFhqkMapper;
import com.ruoyi.investment.mapper.InvFhrzLnfhrzMapper;
import com.ruoyi.investment.mapper.InvFhrzPgmxMapper;
import com.ruoyi.investment.mapper.InvFhrzZfmxMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;


@Slf4j
@Component
@Async("invDataThreadPoolTaskExecutor")
public class InvDataFhrzAsyncTask {
    @Resource
    private Environment ev;
    @Resource
    private InvFhrzFhqkMapper invFhrzFhqkMapper;
    @Resource
    private InvFhrzLnfhrzMapper invFhrzLnfhrzMapper;
    @Resource
    private InvFhrzZfmxMapper invFhrzZfmxMapper;
    @Resource
    private InvFhrzPgmxMapper invFhrzPgmxMapper;

    /**
     * 分红融资
     */
    public void invFhrz(InvStock invStock) {
        String code = invStock.getCode();
        String market = invStock.getMarket();
        try {
            String url = ev.getProperty("inv.fhrz");
            url = url.replace("code=", "code=" + market + code);

            String result = HttpUtils.sendGet(url, new AtomicInteger(10));
            if (StringUtils.isNotEmpty(result)) {
                JSONObject jsonObject = JSONObject.parseObject(result);
                fhqk(jsonObject, code);
                lnfhrz(jsonObject, code);
                zfmx(jsonObject, code);
                pgmx(jsonObject, code);
            }
        } catch (Exception e) {
            log.error(">>>异常:", e);
        }
    }

    /**
     * 分红情况
     */
    private void fhqk(JSONObject jsonObject, String code) {
        try {
            if (jsonObject.containsKey("fhyx")) {
                JSONArray jsonArray = jsonObject.getJSONArray("fhyx");
                if (!jsonArray.isEmpty()) {
                    List<InvFhrzFhqk> entitys = invFhrzFhqkMapper.selectInvFhrzFhqkList(new InvFhrzFhqk(code));
                    Map<String, InvFhrzFhqk> map = new HashMap<>();
                    for (InvFhrzFhqk entity : entitys) {
                        map.put(entity.getNoticeDate().toString(), entity);
                    }

                    Iterator<Object> iterator = jsonArray.iterator();
                    while (iterator.hasNext()) {
                        JSONObject next = (JSONObject) iterator.next();
                        InvFhrzFhqk entity = new InvFhrzFhqk(code);
                        Class<? extends InvFhrzFhqk> clazz = entity.getClass();
                        Field[] declaredFields = clazz.getDeclaredFields();
                        for (Field field : declaredFields) {
                            field.setAccessible(true);
                            String fieldName = field.getName();
                            String valueString = next.getString(StringUtils.toUnderScoreCase(fieldName).toUpperCase());
                            valueString = StringUtils.isNotEmpty(valueString) ? valueString.trim() : null;
                            String genericType = field.getGenericType().toString();
                            if ("class java.lang.Double".equals(genericType)) {
                                Double value = NumFormatUtil.toDouble(valueString);
                                field.set(entity, value);
                            }
                            if ("class java.util.Date".equals(genericType)) {
                                Date value = DateUtils.parseDate(valueString);
                                field.set(entity, value);
                            }
                            if ("class java.lang.String".equals(genericType)) {
                                field.set(entity, valueString);
                            }
                        }
                        if (map.containsKey(entity.getNoticeDate().toString())) {
                            InvFhrzFhqk compare = map.get(entity.getNoticeDate().toString());
                            if (!compare.equals(entity)) {
                                entity.setId(compare.getId());
                                invFhrzFhqkMapper.updateInvFhrzFhqk(entity);
                            }
                        } else {
                            invFhrzFhqkMapper.insertInvFhrzFhqk(entity);
                        }
                    }
                }
            }
        } catch (Exception e) {
            log.error(">>>异常:", e);
        }
    }

    /**
     * 历年分红融资
     */
    private void lnfhrz(JSONObject jsonObject, String code) {
        try {
            if (jsonObject.containsKey("lnfhrz")) {
                JSONArray jsonArray = jsonObject.getJSONArray("lnfhrz");
                if (!jsonArray.isEmpty()) {
                    List<InvFhrzLnfhrz> entitys = invFhrzLnfhrzMapper.selectInvFhrzLnfhrzList(new InvFhrzLnfhrz(code));
                    Map<String, InvFhrzLnfhrz> map = new HashMap<>();
                    for (InvFhrzLnfhrz entity : entitys) {
                        map.put(entity.getStatisticsYear(), entity);
                    }

                    Iterator<Object> iterator = jsonArray.iterator();
                    while (iterator.hasNext()) {
                        JSONObject next = (JSONObject) iterator.next();
                        InvFhrzLnfhrz entity = new InvFhrzLnfhrz(code);
                        Class<? extends InvFhrzLnfhrz> clazz = entity.getClass();
                        Field[] declaredFields = clazz.getDeclaredFields();
                        for (Field field : declaredFields) {
                            field.setAccessible(true);
                            String fieldName = field.getName();
                            String valueString = next.getString(StringUtils.toUnderScoreCase(fieldName).toUpperCase());
                            valueString = StringUtils.isNotEmpty(valueString) ? valueString.trim() : null;
                            String genericType = field.getGenericType().toString();
                            if ("class java.lang.Double".equals(genericType)) {
                                Double value = NumFormatUtil.toDouble(valueString);
                                field.set(entity, value);
                            }
                            if ("class java.util.Date".equals(genericType)) {
                                Date value = DateUtils.parseDate(valueString);
                                field.set(entity, value);
                            }
                            if ("class java.lang.String".equals(genericType)) {
                                field.set(entity, valueString);
                            }
                        }
                        if (map.containsKey(entity.getStatisticsYear())) {
                            InvFhrzLnfhrz compare = map.get(entity.getStatisticsYear());
                            if (!compare.equals(entity)) {
                                entity.setId(compare.getId());
                                invFhrzLnfhrzMapper.updateInvFhrzLnfhrz(entity);
                            }
                        } else {
                            invFhrzLnfhrzMapper.insertInvFhrzLnfhrz(entity);
                        }
                    }
                }
            }
        } catch (Exception e) {
            log.error(">>>异常:", e);
        }
    }

    /**
     * 增发明细
     */
    private void zfmx(JSONObject jsonObject, String code) {
        try {
            if (jsonObject.containsKey("zfmx")) {
                JSONArray jsonArray = jsonObject.getJSONArray("zfmx");
                if (!jsonArray.isEmpty()) {
                    List<InvFhrzZfmx> entitys = invFhrzZfmxMapper.selectInvFhrzZfmxList(new InvFhrzZfmx(code));
                    Map<String, InvFhrzZfmx> map = new HashMap<>();
                    for (InvFhrzZfmx entity : entitys) {
                        map.put(entity.getNoticeDate().toString(), entity);
                    }

                    Iterator<Object> iterator = jsonArray.iterator();
                    while (iterator.hasNext()) {
                        JSONObject next = (JSONObject) iterator.next();
                        InvFhrzZfmx entity = new InvFhrzZfmx(code);
                        Class<? extends InvFhrzZfmx> clazz = entity.getClass();
                        Field[] declaredFields = clazz.getDeclaredFields();
                        for (Field field : declaredFields) {
                            field.setAccessible(true);
                            String fieldName = field.getName();
                            String valueString = next.getString(StringUtils.toUnderScoreCase(fieldName).toUpperCase());
                            valueString = StringUtils.isNotEmpty(valueString) ? valueString.trim() : null;
                            String genericType = field.getGenericType().toString();
                            if ("class java.lang.Double".equals(genericType)) {
                                Double value = NumFormatUtil.toDouble(valueString);
                                field.set(entity, value);
                            }
                            if ("class java.util.Date".equals(genericType)) {
                                Date value = DateUtils.parseDate(valueString);
                                field.set(entity, value);
                            }
                            if ("class java.lang.String".equals(genericType)) {
                                field.set(entity, valueString);
                            }
                        }
                        if (map.containsKey(entity.getNoticeDate().toString())) {
                            InvFhrzZfmx compare = map.get(entity.getNoticeDate().toString());
                            if (!compare.equals(entity)) {
                                entity.setId(compare.getId());
                                invFhrzZfmxMapper.updateInvFhrzZfmx(entity);
                            }
                        } else {
                            invFhrzZfmxMapper.insertInvFhrzZfmx(entity);
                        }
                    }
                }
            }
        } catch (Exception e) {
            log.error(">>>异常:", e);
        }
    }

    /**
     * 配股明细
     */
    private void pgmx(JSONObject jsonObject, String code) {
        try {
            if (jsonObject.containsKey("pgmx")) {
                JSONArray jsonArray = jsonObject.getJSONArray("pgmx");
                if (!jsonArray.isEmpty()) {
                    List<InvFhrzPgmx> entitys = invFhrzPgmxMapper.selectInvFhrzPgmxList(new InvFhrzPgmx(code));
                    Map<String, InvFhrzPgmx> map = new HashMap<>();
                    for (InvFhrzPgmx entity : entitys) {
                        map.put(entity.getNoticeDate().toString(), entity);
                    }

                    Iterator<Object> iterator = jsonArray.iterator();
                    while (iterator.hasNext()) {
                        JSONObject next = (JSONObject) iterator.next();
                        InvFhrzPgmx entity = new InvFhrzPgmx(code);
                        Class<? extends InvFhrzPgmx> clazz = entity.getClass();
                        Field[] declaredFields = clazz.getDeclaredFields();
                        for (Field field : declaredFields) {
                            field.setAccessible(true);
                            String fieldName = field.getName();
                            String valueString = next.getString(StringUtils.toUnderScoreCase(fieldName).toUpperCase());
                            valueString = StringUtils.isNotEmpty(valueString) ? valueString.trim() : null;
                            String genericType = field.getGenericType().toString();
                            if ("class java.lang.Double".equals(genericType)) {
                                Double value = NumFormatUtil.toDouble(valueString);
                                field.set(entity, value);
                            }
                            if ("class java.util.Date".equals(genericType)) {
                                Date value = DateUtils.parseDate(valueString);
                                field.set(entity, value);
                            }
                            if ("class java.lang.String".equals(genericType)) {
                                field.set(entity, valueString);
                            }
                        }
                        if (map.containsKey(entity.getNoticeDate().toString())) {
                            InvFhrzPgmx compare = map.get(entity.getNoticeDate().toString());
                            if (!compare.equals(entity)) {
                                entity.setId(compare.getId());
                                invFhrzPgmxMapper.updateInvFhrzPgmx(entity);
                            }
                        } else {
                            invFhrzPgmxMapper.insertInvFhrzPgmx(entity);
                        }
                    }
                }
            }
        } catch (Exception e) {
            log.error(">>>异常:", e);
        }
    }

}
