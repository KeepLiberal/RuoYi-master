package com.ruoyi.quartz.async.invData;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.NumFormatUtil;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.http.HttpUtils;
import com.ruoyi.investment.domain.*;
import com.ruoyi.investment.mapper.*;
import com.ruoyi.quartz.constant.InvConstants;
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
public class InvDataCompanyNewsAsyncTask {
    @Resource
    private InvLhbReportDateMapper invLhbReportDateMapper;
    @Resource
    private InvLhbStockMrmxMapper invLhbStockMrmxMapper;
    @Resource
    private InvLhbStockMrtjMapper invLhbStockMrtjMapper;
    @Resource
    private InvDzjyMrmxMapper invDzjyMrmxMapper;
    @Resource
    private InvDzjyMrtjMapper invDzjyMrtjMapper;
    @Resource
    private InvRzrqMapper invRzrqMapper;


    /**
     * 公司大事-龙虎榜单日期 任务
     */
    public void invLhbReportTask(InvStock stock, String url, int currentPages, int pages, AtomicInteger count) {
        String urlStr = url;
        try {
            url = url.replace("code=", stock.getCode());
            url = url.replace("pageNumber=", "pageNumber=" + currentPages);
            String result = HttpUtils.sendGet(url, new AtomicInteger(10));
            if (StringUtils.isNotEmpty(result)) {
                JSONObject jsonObject = JSONObject.parseObject(result);
                Boolean success = (Boolean) jsonObject.get("success");
                if (success) {
                    pages = (Integer) jsonObject.getJSONObject("result").get("pages");
                    JSONArray dataArray = jsonObject.getJSONObject("result").getJSONArray("data");
                    if (!dataArray.isEmpty()) {
                        List<InvLhbReportDate> entityList = invLhbReportDateMapper.selectInvLhbReportDateList(new InvLhbReportDate(stock.getCode()));
                        Iterator<Object> iterator = dataArray.iterator();
                        while (iterator.hasNext()) {
                            JSONObject next = (JSONObject) iterator.next();
                            InvLhbReportDate entity = new InvLhbReportDate(stock.getCode());
                            Class<? extends InvLhbReportDate> clazz = entity.getClass();
                            Field[] declaredFields = clazz.getDeclaredFields();
                            for (Field field : declaredFields) {
                                field.setAccessible(true);
                                String genericType = field.getGenericType().toString();
                                String fieldName = field.getName();
                                String valueString = next.getString(StringUtils.toUnderScoreCase(fieldName).toUpperCase());
                                valueString = StringUtils.isNotEmpty(valueString) ? valueString.trim() : null;
                                if ("class java.util.Date".equals(genericType)) {
                                    Date value = DateUtils.parseDate(valueString);
                                    field.set(entity, value);
                                }
                                if ("class java.lang.String".equals(genericType)) {
                                    field.set(entity, valueString);
                                }
                            }
                            if (!entityList.contains(entity)) {
                                invLhbReportDateMapper.insertInvLhbReportDate(new InvLhbReportDate(entity.getSecurityCode(), entity.getTradeDate()));
                            }
                        }
                    }
                }
            }
            currentPages++;
            if (currentPages <= pages) {
                invLhbReportTask(stock, urlStr, currentPages, pages, count);
            }
        } catch (Exception e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                invLhbReportTask(stock, urlStr, currentPages, pages, count);
            } else {
                log.error(">>>异常:", e);
            }
        }
    }

    /**
     * 公司大事-个股龙虎榜单-每日明细 任务
     */
    public void invLhbStockMrmxTask(InvStock stock, String url, Date reportDate, String reportDateStr, String lhbBuySellType, int currentPages, int pages, AtomicInteger count) {
        String urlStr = url;
        try {
            url = url.replace("code=", stock.getCode());
            url = url.replace("reportDate=", reportDateStr);
            url = url.replace("pageNumber=", "pageNumber=" + currentPages);
            String result = HttpUtils.sendGet(url, new AtomicInteger(10));
            if (StringUtils.isNotEmpty(result)) {
                JSONObject jsonObject = JSONObject.parseObject(result);
                Boolean success = (Boolean) jsonObject.get("success");
                if (success) {
                    pages = (Integer) jsonObject.getJSONObject("result").get("pages");
                    JSONArray dataArray = jsonObject.getJSONObject("result").getJSONArray("data");
                    if (!dataArray.isEmpty()) {
                        List<InvLhbStockMrmx> entityList = invLhbStockMrmxMapper.selectInvLhbStockMrmxList(new InvLhbStockMrmx(stock.getCode(), reportDate, lhbBuySellType));
                        Iterator<Object> iterator = dataArray.iterator();
                        while (iterator.hasNext()) {
                            JSONObject next = (JSONObject) iterator.next();
                            InvLhbStockMrmx entity = new InvLhbStockMrmx(stock.getCode());
                            Class<? extends InvLhbStockMrmx> clazz = entity.getClass();
                            Field[] declaredFields = clazz.getDeclaredFields();
                            for (Field field : declaredFields) {
                                field.setAccessible(true);
                                String genericType = field.getGenericType().toString();
                                String fieldName = field.getName();
                                String valueString = next.getString(StringUtils.toUnderScoreCase(fieldName).toUpperCase());
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
                                    field.set(entity, valueString);
                                }
                            }
                            entity.setLhbBuySellType(lhbBuySellType);
                            if (!entityList.contains(entity)) {
                                invLhbStockMrmxMapper.insertInvLhbStockMrmx(entity);
                            }
                        }
                    }
                }
            }
            currentPages++;
            if (currentPages <= pages) {
                invLhbStockMrmxTask(stock, urlStr, reportDate, reportDateStr, lhbBuySellType, currentPages, pages, count);
            }
        } catch (Exception e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                invLhbStockMrmxTask(stock, urlStr, reportDate, reportDateStr, lhbBuySellType, currentPages, pages, count);
            } else {
                log.error(">>>异常:", e);
            }
        }
    }

    /**
     * 公司大事-个股龙虎榜单-每日统计 任务
     */
    public void invLhbStockMrtjTask(InvStock stock, String url, String reportDateStr, String tjType, int currentPages, int pages, AtomicInteger count) {
        String urlStr = url;
        try {
            url = url.replace("code=", stock.getCode());
            if ("ALL".equals(tjType)) url = url.replace("reportDate=", reportDateStr);
            url = url.replace("pageNumber=", "pageNumber=" + currentPages);
            String result = HttpUtils.sendGet(url, new AtomicInteger(10));
            if (StringUtils.isNotEmpty(result)) {
                JSONObject jsonObject = JSONObject.parseObject(result);
                Boolean success = (Boolean) jsonObject.get("success");
                if (success) {
                    pages = (Integer) jsonObject.getJSONObject("result").get("pages");
                    JSONArray dataArray = jsonObject.getJSONObject("result").getJSONArray("data");
                    if (!dataArray.isEmpty()) {
                        Iterator<Object> iterator = dataArray.iterator();
                        while (iterator.hasNext()) {
                            JSONObject next = (JSONObject) iterator.next();
                            String explanation = next.getString("EXPLANATION");
                            if ("YYB".equals(tjType)) {
                                explanation = next.getString("EXPLAIN");
                            }
                            InvLhbStockMrtj entity = new InvLhbStockMrtj(stock.getCode());
                            if (StringUtils.isEmpty(reportDateStr)) {
                                reportDateStr = next.getString("TRADE_DATE").substring(0, 10);
                            }
                            ConcurrentHashMap<String, Object> objectMap = InvConstants.objectMap.get(stock.getCode());
                            if (null != objectMap) {
                                Object object = objectMap.get(reportDateStr + explanation);
                                if (null != object) {
                                    entity = (InvLhbStockMrtj) object;
                                }
                            }
                            entity.setExplanation(explanation);
                            entity.setTradeDate(DateUtils.parseDate(next.getString("TRADE_DATE")));
                            if ("YYB".equals(tjType)) {
                                entity.setYybBuyAmt(NumFormatUtil.toDouble(next.getString("NET_BUY_AMT")));
                                entity.setYybSellAmt(NumFormatUtil.toDouble(next.getString("NET_SELL_AMT")));
                                entity.setYybNet(NumFormatUtil.toDouble(next.getString("NET_OPERATEDEPT_AMT")));
                                entity.setD1CloseAdjchrate(NumFormatUtil.toDouble(next.getString("D1_CLOSE_ADJCHRATE")));
                                entity.setD2CloseAdjchrate(NumFormatUtil.toDouble(next.getString("D2_CLOSE_ADJCHRATE")));
                                entity.setD3CloseAdjchrate(NumFormatUtil.toDouble(next.getString("D3_CLOSE_ADJCHRATE")));
                                entity.setD5CloseAdjchrate(NumFormatUtil.toDouble(next.getString("D5_CLOSE_ADJCHRATE")));
                                entity.setD10CloseAdjchrate(NumFormatUtil.toDouble(next.getString("D10_CLOSE_ADJCHRATE")));
                                entity.setD20CloseAdjchrate(NumFormatUtil.toDouble(next.getString("D20_CLOSE_ADJCHRATE")));
                                entity.setD30CloseAdjchrate(NumFormatUtil.toDouble(next.getString("D30_CLOSE_ADJCHRATE")));
                            }
                            if ("JG".equals(tjType)) {
                                entity.setJgBuyCount(NumFormatUtil.toDouble(next.getString("BUY_COUNT")));
                                entity.setJgSellCount(NumFormatUtil.toDouble(next.getString("SELL_COUNT")));
                                entity.setJgBuyAmt(NumFormatUtil.toDouble(next.getString("BUY_AMT")));
                                entity.setJgSellAmt(NumFormatUtil.toDouble(next.getString("SELL_AMT")));
                                entity.setJgNet(NumFormatUtil.toDouble(next.getString("NET_BUY_AMT")));
                            }
                            if ("ALL".equals(tjType)) {
                                entity.setTotalBuy(NumFormatUtil.toDouble(next.getString("TOTAL_BUY")));
                                entity.setTotalBuyriotop(NumFormatUtil.toDouble(next.getString("TOTAL_BUYRIOTOP")));
                                entity.setTotalSell(NumFormatUtil.toDouble(next.getString("TOTAL_SELL")));
                                entity.setTotalSellriotop(NumFormatUtil.toDouble(next.getString("TOTAL_SELLRIOTOP")));
                                entity.setTotalNet(NumFormatUtil.toDouble(next.getString("TOTAL_NET")));
                            }
                            if (null != objectMap) {
                                objectMap.put(reportDateStr + explanation, entity);
                            } else {
                                ConcurrentHashMap<String, Object> map = new ConcurrentHashMap<>();
                                map.put(reportDateStr + explanation, entity);
                                InvConstants.objectMap.put(stock.getCode(), map);
                            }
                            reportDateStr = null;
                        }
                    }
                }
            }
            currentPages++;
            if (currentPages <= pages) {
                invLhbStockMrtjTask(stock, urlStr, reportDateStr, tjType, currentPages, pages, count);
            }
        } catch (Exception e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                invLhbStockMrtjTask(stock, urlStr, reportDateStr, tjType, currentPages, pages, count);
            } else {
                log.error(">>>异常:", e);
            }
        }
    }

    /**
     * 公司大事-个股龙虎榜单-每日统计-落库 任务
     */
    public void invLhbStockMrtjSaveTask(InvStock stock, AtomicInteger count) {
        try {
            List<InvLhbStockMrtj> invLhbStockMrtjs = invLhbStockMrtjMapper.selectInvLhbStockMrtjList(new InvLhbStockMrtj(stock.getCode()));
            Map<String, InvLhbStockMrtj> mrtjMap = new HashMap<>();
            for (InvLhbStockMrtj entity : invLhbStockMrtjs) {
                mrtjMap.put(entity.getSecurityCode() + entity.getTradeDate() + entity.getExplanation(), entity);
            }
            ConcurrentHashMap<String, Object> map = InvConstants.objectMap.get(stock.getCode());
            if (null != map) {
                for (Object obj : map.values()) {
                    InvLhbStockMrtj entity = (InvLhbStockMrtj) obj;
                    String key = entity.getSecurityCode() + entity.getTradeDate() + entity.getExplanation();
                    if (!mrtjMap.containsKey(key)) {
                        invLhbStockMrtjMapper.insertInvLhbStockMrtj(entity);
                    } else {
                        InvLhbStockMrtj compare = mrtjMap.get(key);
                        if (!entity.equals(compare)) {
                            entity.setId(compare.getId());
                            invLhbStockMrtjMapper.updateInvLhbStockMrtj(entity);
                        }
                    }
                }
            }
        } catch (Exception e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                invLhbStockMrtjSaveTask(stock, count);
            } else {
                log.error(">>>异常:", e);
            }
        }
    }

    /**
     * 公司大事-大宗交易-每日明细 任务
     */
    public void invDzjyMrmxTask(InvStock stock, String url, int currentPages, int pages, int pageSize, AtomicInteger count) {
        String urlStr = url;
        try {
            url = url.replace("code=", stock.getCode());
            url = url.replace("pageSize=", "pageSize=" + pageSize);
            url = url.replace("pageNumber=", "pageNumber=" + currentPages);
            String result = HttpUtils.sendGet(url, new AtomicInteger(10));
            if (StringUtils.isNotEmpty(result)) {
                JSONObject jsonObject = JSONObject.parseObject(result);
                Boolean success = (Boolean) jsonObject.get("success");
                if (success) {
                    pages = (Integer) jsonObject.getJSONObject("result").get("pages");
                    JSONArray dataArray = jsonObject.getJSONObject("result").getJSONArray("data");
                    if (!dataArray.isEmpty()) {
                        List<InvDzjyMrmx> entityList = invDzjyMrmxMapper.selectInvDzjyMrmxList(new InvDzjyMrmx(stock.getCode()));
                        Map<String, InvDzjyMrmx> entityMap = new HashMap<>();
                        for (InvDzjyMrmx entity : entityList) {
                            entityMap.put(entity.getNum().toString(), entity);
                        }
                        Iterator<Object> iterator = dataArray.iterator();
                        int num = (currentPages - 1) * pageSize;
                        while (iterator.hasNext()) {
                            num++;
                            JSONObject next = (JSONObject) iterator.next();
                            InvDzjyMrmx entity = new InvDzjyMrmx(stock.getCode());
                            entity.setNum(num);
                            Class<? extends InvDzjyMrmx> clazz = entity.getClass();
                            Field[] declaredFields = clazz.getDeclaredFields();
                            for (Field field : declaredFields) {
                                field.setAccessible(true);
                                String genericType = field.getGenericType().toString();
                                String fieldName = field.getName();
                                String upperFieldName = StringUtils.toUnderScoreCase(fieldName).toUpperCase();
                                upperFieldName = upperFieldName.replace("1DAYS", "_1DAYS").replace("5DAYS", "_5DAYS").replace("10DAYS", "_10DAYS").replace("20DAYS", "_20DAYS");
                                String valueString = next.getString(upperFieldName);
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
                                    field.set(entity, valueString);
                                }
                            }
                            if (!entityList.contains(entity)) {
                                invDzjyMrmxMapper.insertInvDzjyMrmx(entity);
                            }
                            if (StringUtils.isNotEmpty(entity.getBuyerCode()) && StringUtils.isNotEmpty(entity.getBuyerName())) {
                                InvConstants.invStockExchangeSet.add(new InvStockExchange(entity.getBuyerCode(), entity.getBuyerName(), entity.getTradeDate()));
                            }
                            if (StringUtils.isNotEmpty(entity.getSellerCode()) && StringUtils.isNotEmpty(entity.getSellerName())) {
                                InvConstants.invStockExchangeSet.add(new InvStockExchange(entity.getSellerCode(), entity.getSellerName(), entity.getTradeDate()));
                            }
                        }
                    }
                }
            }
            currentPages++;
            if (currentPages <= pages) {
                invDzjyMrmxTask(stock, urlStr, currentPages, pages, pageSize, count);
            }
        } catch (Exception e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                invDzjyMrmxTask(stock, urlStr, currentPages, pages, pageSize, count);
            } else {
                log.error(">>>异常:", e);
            }
        }
    }

    /**
     * 公司大事-大宗交易-每日统计 任务
     */
    public void invDzjyMrtjTask(InvStock stock, String url, int currentPages, int pages, AtomicInteger count) {
        String urlStr = url;
        try {
            url = url.replace("code=", stock.getCode());
            url = url.replace("pageNumber=", "pageNumber=" + currentPages);
            String result = HttpUtils.sendGet(url, new AtomicInteger(10));
            if (StringUtils.isNotEmpty(result)) {
                JSONObject jsonObject = JSONObject.parseObject(result);
                Boolean success = (Boolean) jsonObject.get("success");
                if (success) {
                    pages = (Integer) jsonObject.getJSONObject("result").get("pages");
                    JSONArray dataArray = jsonObject.getJSONObject("result").getJSONArray("data");
                    if (!dataArray.isEmpty()) {
                        List<InvDzjyMrtj> entityList = invDzjyMrtjMapper.selectInvDzjyMrtjList(new InvDzjyMrtj(stock.getCode()));
                        Iterator<Object> iterator = dataArray.iterator();
                        while (iterator.hasNext()) {
                            JSONObject next = (JSONObject) iterator.next();
                            InvDzjyMrtj entity = new InvDzjyMrtj(stock.getCode());
                            Class<? extends InvDzjyMrtj> clazz = entity.getClass();
                            Field[] declaredFields = clazz.getDeclaredFields();
                            for (Field field : declaredFields) {
                                field.setAccessible(true);
                                String genericType = field.getGenericType().toString();
                                String fieldName = field.getName();
                                String upperFieldName = StringUtils.toUnderScoreCase(fieldName).toUpperCase();
                                String valueString = next.getString(upperFieldName);
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
                                    field.set(entity, valueString);
                                }
                            }
                            if (!entityList.contains(entity)) {
                                invDzjyMrtjMapper.insertInvDzjyMrtj(entity);
                            }
                        }
                    }
                }
            }
            currentPages++;
            if (currentPages <= pages) {
                invDzjyMrtjTask(stock, urlStr, currentPages, pages, count);
            }
        } catch (Exception e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                invDzjyMrtjTask(stock, urlStr, currentPages, pages, count);
            } else {
                log.error(">>>异常:", e);
            }
        }
    }

    /**
     * 公司大事-融资融券 任务
     */
    public void invRzrqTask(InvStock stock, String url, int currentPages, int pages, AtomicInteger count) {
        String urlStr = url;
        try {
            url = url.replace("p=", "p=" + currentPages);
            url = url.replace("code=", "code=" + stock.getCode());
            String result = HttpUtils.sendGet(url, new AtomicInteger(10));
            if (StringUtils.isNotEmpty(result)) {
                JSONObject jsonObject = JSONObject.parseObject(result);
                Boolean success = (Boolean) jsonObject.get("success");
                if (success) {
                    pages = (Integer) jsonObject.getJSONObject("result").get("pages");
                    JSONArray dataArray = jsonObject.getJSONObject("result").getJSONArray("data");
                    if (!dataArray.isEmpty()) {
                        List<InvRzrq> entityList = invRzrqMapper.selectInvRzrqList(new InvRzrq(stock.getCode()));
                        Iterator<Object> iterator = dataArray.iterator();
                        while (iterator.hasNext()) {
                            JSONObject next = (JSONObject) iterator.next();
                            InvRzrq entity = new InvRzrq(stock.getCode());
                            Class<? extends InvRzrq> clazz = entity.getClass();
                            Field[] declaredFields = clazz.getDeclaredFields();
                            for (Field field : declaredFields) {
                                field.setAccessible(true);
                                String genericType = field.getGenericType().toString();
                                String fieldName = field.getName();
                                if (!"securityCode".equals(fieldName)) {
                                    String valueString = next.getString(StringUtils.toUnderScoreCase(fieldName).toUpperCase());
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
                                        field.set(entity, valueString);
                                    }
                                }
                            }
                            if (!entityList.contains(entity)) {
                                invRzrqMapper.insertInvRzrq(entity);
                            }
                        }
                    }
                }
            }
            currentPages++;
            if (currentPages <= pages) {
                invRzrqTask(stock, urlStr, currentPages, pages, count);
            }
        } catch (Exception e) {
            if (count.get() > 0) {
                count.decrementAndGet();
                invRzrqTask(stock, urlStr, currentPages, pages, count);
            } else {
                log.error(">>>异常:", e);
            }
        }
    }

}
