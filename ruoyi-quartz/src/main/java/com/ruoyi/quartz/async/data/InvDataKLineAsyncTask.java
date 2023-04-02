package com.ruoyi.quartz.async.data;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.NumFormatUtil;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.http.HttpUtils;
import com.ruoyi.investment.domain.InvKLine;
import com.ruoyi.investment.domain.InvStock;
import com.ruoyi.investment.mapper.InvKLineMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;


@Slf4j
@Component
@Async("invDataThreadPoolTaskExecutor")
public class InvDataKLineAsyncTask {
    @Resource
    private Environment ev;
    @Resource
    private InvKLineMapper invKLineMapper;

    /**
     * K_Line
     */
    public void invDataKLine(InvStock invStock) {
        String code = invStock.getCode();
        String market = invStock.getMarket();
        try {
            String url = ev.getProperty("inv.k_line");
            if ("sz".equals(market)) {
                url = url.replace("secid=", "secid=0." + code);
            } else if ("sh".equals(market)) {
                url = url.replace("secid=", "secid=1." + code);
            }
            String result = HttpUtils.sendGet(url, new AtomicInteger(10));
            if (StringUtils.isNotEmpty(result)) {
                JSONObject jsonObject = JSONObject.parseObject(result);
                if (jsonObject.containsKey("data")) {
                    JSONObject data = jsonObject.getJSONObject("data");
                    if (data.containsKey("klines")) {
                        JSONArray klines = data.getJSONArray("klines");
                        if (!klines.isEmpty()) {
                            List<InvKLine> invKLines = invKLineMapper.selectInvKLineList(new InvKLine(code));
                            Map<String, InvKLine> invKLineMap = new HashMap<>();
                            for (InvKLine invKLine : invKLines) {
                                invKLineMap.put(invKLine.getReportDate().toString(), invKLine);
                            }

                            Iterator<Object> iterator = klines.iterator();
                            while (iterator.hasNext()) {
                                String next = (String) iterator.next();
                                String[] value = next.split(",");
                                Date reportDate = DateUtils.parseDate(value[0]);
                                InvKLine invKLine = new InvKLine(code);
                                invKLine.setReportDate(reportDate);//日期
                                invKLine.setOpen(NumFormatUtil.toDouble(value[1]));//开盘
                                invKLine.setClose(NumFormatUtil.toDouble(value[2]));//收盘
                                invKLine.setHigh(NumFormatUtil.toDouble(value[3]));//最高
                                invKLine.setLower(NumFormatUtil.toDouble(value[4]));//最低
                                invKLine.setTurnoverSize(NumFormatUtil.toDouble(value[5]));//成交量
                                invKLine.setTurnoverQuota(NumFormatUtil.toDouble(value[6]));//成交额
                                invKLine.setVibrateRange(NumFormatUtil.toDouble(value[7]));//振幅
                                invKLine.setUpDownRange(NumFormatUtil.toDouble(value[8]));//涨跌幅
                                invKLine.setUpDownQuota(NumFormatUtil.toDouble(value[9]));//涨跌额
                                invKLine.setChangeHandRange(NumFormatUtil.toDouble(value[10]));//换手率

                                if (invKLineMap.containsKey(reportDate.toString())) {
                                    //数据库存在，但数据不一致，进行更新
                                    InvKLine compare = invKLineMap.get(reportDate.toString());
                                    if (!compare.equals(invKLine)) {
                                        invKLine.setId(compare.getId());
                                        invKLineMapper.updateInvKLine(invKLine);
                                    }
                                } else {
                                    //数据库不存在，直接插入
                                    invKLineMapper.insertInvKLine(invKLine);
                                }
                            }
                        }
                    }
                }
            }
            log.info("========" + code + "-K_Line=========");
        } catch (Exception e) {
            log.error(">>>异常:", e);
        }
    }
}
