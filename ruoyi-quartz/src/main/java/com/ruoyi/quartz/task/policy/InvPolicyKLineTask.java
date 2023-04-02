package com.ruoyi.quartz.task.policy;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.http.HttpUtils;
import com.ruoyi.investment.domain.InvCompany;
import com.ruoyi.investment.domain.InvKLine;
import com.ruoyi.investment.mapper.InvCompanyMapper;
import com.ruoyi.investment.mapper.InvKLineMapper;
import com.ruoyi.investment.mapper.InvStockMapper;
import com.ruoyi.quartz.async.data.InvDataKLineAsyncTask;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;


@Slf4j
@Component
public class InvPolicyKLineTask {
    @Resource
    private InvStockMapper invStockMapper;


    @Resource
    private InvCompanyMapper invCompanyMapper;
    @Resource
    private InvKLineMapper invKLineMapper;

    /**
     * K_Line
     */
    public void policyKLine() {

        //获取关联个股
        String url = "https://emweb.eastmoney.com/PC_HSF10/StockRelationship/PageAjax?code=SZ000002";
        String result = HttpUtils.sendGet(url, new AtomicInteger(10));
        List<String> codeList = new ArrayList<>();
        if (StringUtils.isNotEmpty(result)) {
            JSONObject jsonObject = JSONObject.parseObject(result);
            JSONArray ggpm = (JSONArray) jsonObject.get("ggpm");
            Iterator<Object> iterator = ggpm.iterator();
            while (iterator.hasNext()) {
                JSONObject next = (JSONObject) iterator.next();
                String code = (String) next.get("CORRE_SECURITY_CODE");
                codeList.add(code);
            }
        }

        //获取2000-01-01之前上市的个股
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("select code from inv_company where code in (");
        for (String code : codeList) {
            sqlBuilder.append("'").append(code).append("'").append(",");
        }
        String sql = sqlBuilder.toString();
        sql = sql.substring(0, sql.length() - 1) + ") and listing_date<'2000-01-01' order by code";
        List<InvCompany> companyList = invCompanyMapper.commonSelect(sql);

        //筛选出全部正常开市的日期
        Date reportDate = DateUtils.parseDate("1999-12-31");
        StringBuilder sb = new StringBuilder();
        sb.append("select report_data from inv_k_line where security_code in(");
        for (InvCompany invCompany : companyList) {
            sb.append("'").append(invCompany.getCode()).append("'").append(",");
        }

        List<String> dataList = new ArrayList<>();
        while (DateUtils.differentDaysByMillisecond(reportDate, new Date()) > 0) {
            reportDate = DateUtils.dateAddOne(reportDate);
            String dataStr = DateUtils.dateTime(reportDate);
            String sq = sb.toString();
            sq = sq.substring(0, sq.length() - 1);
            sq += ") and listing_date='" + dataStr + "' order by listing_date";
            List<InvKLine> invKLines = invKLineMapper.commonSelect(sq);
            if (invKLines.size() == companyList.size()) {
                dataList.add(dataStr);
            }
        }


        System.out.println();
    }

}
