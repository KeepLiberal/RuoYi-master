package com.ruoyi.quartz.async.invData;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.core.domain.entity.SysDictData;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.NumFormatUtil;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.http.HttpUtils;
import com.ruoyi.investment.domain.*;
import com.ruoyi.investment.mapper.*;
import com.ruoyi.quartz.constant.InvConstants;
import com.ruoyi.system.mapper.SysDictDataMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.Field;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;


@Slf4j
@Component
@Async("investmentDataThreadPoolTaskExecutor")
public class InvDataShareholderResearchAsyncTask {
    @Resource
    private InvJjgMxMapper invJjgMxMapper;

    /**
     * 股东分析-解禁股 任务
     */
    public void invJjgTask(InvStock stock, String url, int currentPages, int pages, AtomicInteger count) {
        String urlStr = url;
        try {
            url = url.replace("code=", "code=" + stock.getCode());
            String result = HttpUtils.sendGet(url, new AtomicInteger(10));
            if (StringUtils.isNotEmpty(result)) {
                JSONObject jsonObject = JSONObject.parseObject(result);
                Boolean success = (Boolean) jsonObject.get("success");
                if (success) {
                    pages = (Integer) jsonObject.getJSONObject("result").get("pages");
                    JSONArray dataArray = jsonObject.getJSONObject("result").getJSONArray("data");
                    if (!dataArray.isEmpty()) {
                        List<InvJjgMx> entityList = invJjgMxMapper.selectInvJjgMxList(new InvJjgMx(stock.getCode()));
                        Map<String, InvJjgMx> map = new HashMap<>();
                        for (InvJjgMx entity : entityList) {
                            map.put(entity.getFreeDate() + entity.getLimitedHolderName(), entity);
                        }
                        Iterator<Object> iterator = dataArray.iterator();
                        while (iterator.hasNext()) {
                            JSONObject next = (JSONObject) iterator.next();
                            InvJjgMx entity = new InvJjgMx(stock.getCode());
                            Class<? extends InvJjgMx> clazz = entity.getClass();
                            Field[] declaredFields = clazz.getDeclaredFields();
                            for (Field field : declaredFields) {
                                field.setAccessible(true);
                                String genericType = field.getGenericType().toString();
                                String fieldName = field.getName();
                                if (!"securityCode".equals(fieldName)) {
                                    String interfaceKeyLowercase = StringUtils.toUnderScoreCase(fieldName);
                                    String valueString = next.getString(interfaceKeyLowercase.toUpperCase());
                                    valueString = StringUtils.isNotEmpty(valueString) ? valueString.trim() : null;
                                    if ("class java.lang.Double".equals(genericType)) {
                                        Double value = NumFormatUtil.toDouble(valueString);
                                        field.set(entity, value);
                                    }
                                    if ("class java.util.Date".equals(genericType)) {
                                        Date value = DateUtils.parseDate(valueString);
                                        field.set(entity, value);
                                    }
                                    if ("class java.lang.String".equals(genericType)) {
                                        if (StringUtils.isNotEmpty(valueString) && ("freeSharesType".equals(fieldName) || "planFeature".equals(fieldName))) {
                                            valueString = valueString.replace("，", ",");
                                            for (String dictLabel : valueString.split(",")) {
                                                String dictValue = StringUtils.getPinyinInitial(dictLabel);
                                                InvConstants.sysDictDataSet.add(new SysDictData(dictLabel, dictValue, interfaceKeyLowercase));
                                            }
                                            valueString = StringUtils.getPinyinInitial(valueString);
                                        }
                                        field.set(entity, valueString);
                                    }
                                }
                            }
                            if (map.containsKey(entity.getFreeDate() + entity.getLimitedHolderName())) {
                                InvJjgMx compare = map.get(entity.getFreeDate() + entity.getLimitedHolderName());
                                if (!compare.equals(entity)) {
                                    entity.setId(compare.getId());
                                    invJjgMxMapper.updateInvJjgMx(entity);
                                }
                            } else {
                                invJjgMxMapper.insertInvJjgMx(entity);

                            }
                        }
                    }
                }
            }
            currentPages++;
            if (currentPages <= pages) {
                invJjgTask(stock, urlStr, currentPages, pages, count);
            }
        } catch (Exception e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                invJjgTask(stock, urlStr, currentPages, pages, count);
            } else {
                log.error(">>>异常:", e);
            }
        }
    }

}
