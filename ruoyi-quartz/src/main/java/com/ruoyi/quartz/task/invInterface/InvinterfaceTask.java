package com.ruoyi.quartz.task.invInterface;

import com.ruoyi.investment.domain.InvStock;
import com.ruoyi.investment.mapper.InvStockMapper;
import com.ruoyi.quartz.async.invInterface.InvInterfaceAsyncTask;
import com.ruoyi.quartz.constant.InvConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
public class InvinterfaceTask {
    @Resource
    private Environment ev;
    @Resource
    private InvInterfaceAsyncTask investmentInterfaceAsyncTask;
    @Resource
    private InvStockMapper invStockMapper;

    /**
     * 生成接口对应SQL文件
     */
    public void createSqlFile(String interfaceName) {
        log.info("========生成SQL interfaceName:{} 任务等待=========", interfaceName);
        InvConstants.isCompletedByTaskCount(0);
        log.info("========生成SQL interfaceName:{} 任务开始=========", interfaceName);

        InvConstants.keyOfInterfaceSet.clear();
        InvConstants.keyOfHtmlSet.clear();
        InvConstants.sqlOfHtmlMap.clear();

        List<InvStock> stockList = invStockMapper.selectInvStockVoNoDelisting();
        for (InvStock stock : stockList) {
            if ("company".equals(interfaceName)) {
                investmentInterfaceAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.company-company-ajax"));
                investmentInterfaceAsyncTask.getHtmlKey(stock, ev.getProperty("inv.company-web"), interfaceName);
            }
            if ("zyzb".equals(interfaceName)) {
                investmentInterfaceAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-zyzb-ajax-bgq"));
                investmentInterfaceAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-zyzb-ajax-nd"));
                investmentInterfaceAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-zyzb-ajax-jd"));
                investmentInterfaceAsyncTask.getHtmlKey(stock, ev.getProperty("inv.finance-web"), interfaceName);
            }
            if ("dbfx".equals(interfaceName)) {
                investmentInterfaceAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-dbfx-ajax"));
                investmentInterfaceAsyncTask.getHtmlKey(stock, ev.getProperty("inv.finance-web"), interfaceName);
            }
            if ("zcfz".equals(interfaceName)) {
                investmentInterfaceAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-zcfz-ajax-bgq"));
                investmentInterfaceAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-zcfz-ajax-nd"));
                investmentInterfaceAsyncTask.getHtmlKey(stock, ev.getProperty("inv.finance-web"), interfaceName);
            }
            if ("lr".equals(interfaceName)) {
                investmentInterfaceAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-lr-ajax-bgq"));
                investmentInterfaceAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-lr-ajax-nd"));
                investmentInterfaceAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-lr-ajax-jd"));
                investmentInterfaceAsyncTask.getHtmlKey(stock, ev.getProperty("inv.finance-web"), interfaceName);
            }
            if ("xjll".equals(interfaceName)) {
                investmentInterfaceAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-xjll-ajax-bgq"));
                investmentInterfaceAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-xjll-ajax-nd"));
                investmentInterfaceAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-xjll-ajax-jd"));
                investmentInterfaceAsyncTask.getHtmlKey(stock, ev.getProperty("inv.finance-web"), interfaceName);
            }
            if ("bfb".equals(interfaceName)) {
                investmentInterfaceAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-bfb-ajax-bgq"));
                investmentInterfaceAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-bfb-ajax-nd"));
                investmentInterfaceAsyncTask.getInterfaceKey(stock, ev.getProperty("inv.finance-bfb-ajax-jd"));
                investmentInterfaceAsyncTask.getHtmlKey(stock, ev.getProperty("inv.finance-web"), interfaceName);
            }
        }
        InvConstants.isCompletedByTaskCount(0);

        investmentInterfaceAsyncTask.writeKeysOfInterface(interfaceName + ".txt");
        investmentInterfaceAsyncTask.writeSqlFileOfHtml(interfaceName + ".sql");
        investmentInterfaceAsyncTask.writeCompareKeyFile(interfaceName + "-compare.txt");

        InvConstants.keyOfInterfaceSet.clear();
        InvConstants.keyOfHtmlSet.clear();
        InvConstants.sqlOfHtmlMap.clear();
        log.info("========生成SQL interfaceName:{} 任务完成=========", interfaceName);
    }


}
