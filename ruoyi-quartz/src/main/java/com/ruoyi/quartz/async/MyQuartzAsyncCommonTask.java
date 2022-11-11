package com.ruoyi.quartz.async;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.NumFormatUtil;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.http.HttpUtils;
import com.ruoyi.investment.domain.InvStock;
import com.ruoyi.investment.finance.domain.InvFinanceZyzbBgq;
import com.ruoyi.investment.finance.mapper.InvFinanceZyzbBgqMapper;
import com.ruoyi.quartz.task.RyTask;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;


/**
 * @describe:@Async注解开启异步线程示例
 * @author: weny.yang
 * @date: 2021-08-22 13:53
 */
@Slf4j
@Component
public class MyQuartzAsyncCommonTask {



    @Resource
    private InvFinanceZyzbBgqMapper invFinanceZyzbBgqMapper;


    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
