package com.ruoyi.quartz.task.data;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.core.domain.entity.SysDictData;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.http.HttpUtils;
import com.ruoyi.investment.domain.InvStock;
import com.ruoyi.investment.mapper.InvStockMapper;
import com.ruoyi.system.mapper.SysDictDataMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;


@Slf4j
@Component
public class InvDataStockTask {
    @Resource
    private Environment ev;
    @Resource
    private InvStockMapper invStockMapper;
    @Resource
    private SysDictDataMapper dictDataMapper;

    /**
     * 沪深A股-基础数据
     */
    public void invStock() {
        try {
            log.info("========沪深A股-基础数据 任务开始=========");
            SysDictData dictData = new SysDictData();
            dictData.setDictType("market_start");
            List<SysDictData> dictDatas = dictDataMapper.selectDictDataList(dictData);

            String url = ev.getProperty("inv.stock-list");
            String result = HttpUtils.sendGet(url, new AtomicInteger(10));
            if (StringUtils.isNotEmpty(result)) {
                JSONObject jsonObject = JSONObject.parseObject(result);
                if (jsonObject.containsKey("data")) {
                    JSONObject dataObject = jsonObject.getJSONObject("data");
                    if (dataObject.containsKey("diff")) {
                        JSONArray diffArray = dataObject.getJSONArray("diff");
                        if (!diffArray.isEmpty()) {
                            List<InvStock> invStocks = invStockMapper.selectInvStockList(null);
                            Map<String, InvStock> stockMap = new HashMap<>();
                            for (InvStock stock : invStocks) {
                                stockMap.put(stock.getCode(), stock);
                            }

                            Iterator<Object> iterator = diffArray.iterator();
                            while (iterator.hasNext()) {
                                JSONObject next = (JSONObject) iterator.next();
                                String code = next.getString("f12");
                                String name = next.getString("f14");
                                String market = null;
                                //股票市场字典数据匹配
                                for (SysDictData dict : dictDatas) {
                                    if (code.startsWith(dict.getDictValue())) {
                                        market = dict.getDictLabel();
                                    }
                                }
                                if (StringUtils.isEmpty(market)) {
                                    log.error(">>>invStockTask任务:" + code + " " + name + " [" + code.substring(0, 3) + "]对应的市场前缀不在字典表market_start内，请添加");
                                }
                                InvStock stock = new InvStock(code, name, market);
                                if (stockMap.containsKey(code)) {
                                    //数据库存在，但数据不一致，进行更新
                                    InvStock compare = stockMap.get(code);
                                    if (!compare.equals(stock)) {
                                        stock.setId(compare.getId());
                                        invStockMapper.updateInvStock(stock);
                                    }
                                } else {
                                    //数据库不存在，直接插入
                                    invStockMapper.insertInvStock(stock);
                                }
                            }
                        }
                    }
                }
            }
            log.info("========沪深A股-基础数据 任务完成=========");
        } catch (Exception e) {
            log.error(">>>异常:", e);
        }
    }

}
