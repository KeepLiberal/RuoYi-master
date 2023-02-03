package com.ruoyi.quartz.constant;

import com.ruoyi.common.core.domain.entity.SysDictData;
import com.ruoyi.common.utils.spring.SpringUtils;
import com.ruoyi.investment.domain.InvIndustry;
import com.ruoyi.investment.domain.InvStockExchange;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;


@Component
public class InvConstants {

    /**
     * 容器中的线程池
     */
    public static ThreadPoolTaskExecutor investmentDataThreadPoolTaskExecutor = SpringUtils.getBean("investmentDataThreadPoolTaskExecutor");
    /**
     * 存放接口所有字段
     */
    public static Set<String> keyOfInterfaceSet = new HashSet<>();
    /**
     * 存放接口所有字段
     */
    public static Set<String> keyOfHtmlSet = new HashSet<>();
    /**
     * 存放sql
     */
    public static LinkedHashMap<String, String> sqlOfHtmlMap = new LinkedHashMap<>();
    /**
     * 存放行业
     */
    public static Set<InvIndustry> invIndustrySet = new HashSet<>();
    /**
     * 存放营业部
     */
    public static Set<InvStockExchange> invStockExchangeSet = new HashSet<>();
    /**
     * 存放字典
     */
    public static Set<SysDictData> sysDictDataSet = new HashSet<>();
    /**
     * 存放任意实体集合
     */
    public static ConcurrentHashMap<String, ConcurrentHashMap<String, Object>> objectMap = new ConcurrentHashMap<>();




    /**
     * 判断线程池状态
     */
    public static void isCompletedByTaskCount(Integer value) {
        while (investmentDataThreadPoolTaskExecutor.getThreadPoolExecutor().getActiveCount() > value) ;
    }



}