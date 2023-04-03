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
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


@Slf4j
@Component
public class InvPolicyKLineTask {
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
        sb.append("select security_code, up_down_range from inv_k_line where security_code in(");
        for (InvCompany invCompany : companyList) {
            sb.append("'").append(invCompany.getCode()).append("'").append(",");
        }

        List<String> upDownRangeList = new ArrayList<>();
        while (DateUtils.differentDaysByMillisecond(reportDate, new Date()) > 0) {
            reportDate = DateUtils.dateAddOne(reportDate);
            String dataStr = DateUtils.dateTime(reportDate);
            String sq = sb.toString();
            sq = sq.substring(0, sq.length() - 1);
            sq += ") and report_date='" + dataStr + "' order by security_code";
            List<InvKLine> invKLines = invKLineMapper.commonSelect(sq);
            if (invKLines.size() == companyList.size()) {
                String lib = "-0,0";
                StringBuilder list = new StringBuilder();
                int time = 0;
                for (InvKLine invKLine : invKLines) {
                    if ("000002".equals(invKLine.getSecurityCode())) {
                        if (invKLine.getUpDownRange() > 0) {
                            lib = "-1,0";
                        }
                    } else {
                        if (time<3){
                            if (invKLine.getUpDownRange() > 0) {
                                list.append("1,");
                            } else {
                                list.append("0,");
                            }
                            time++;
                        }else{
                            break;
                        }
                    }
                }
                ;
                upDownRangeList.add(list.toString().substring(0,list.length()-1) + lib);
            }
        }
        writeTrainData("/Users/yay/WorkSpace/RuoYi/RuoYi-master/policyFile/KLine/KLine.txt", upDownRangeList);
    }


    /**
     * 生成训练数据TXT文件
     */
    private void writeTrainData(String fileName, List<String> upDownRangeList) {
        BufferedWriter bw = null;
        try {
            File file = new File(fileName);
            File paFile = file.getParentFile();
            // 判断文件夹是否存在
            if (!paFile.exists()) {
                paFile.mkdirs();
            }
            // 判断文件是否存在
            if (!file.exists()) {
                file.createNewFile();
            }


            // 遍历写入
            bw = new BufferedWriter(new FileWriter(file));
            for (String content : upDownRangeList) {
                bw.write(content);
                bw.write(System.getProperty("line.separator"));
            }
            bw.flush();
            bw.close();
        } catch (Exception e) {
            log.error(">>>异常:", e);
        } finally {
            if (null != bw) {
                try {
                    bw.close();
                } catch (IOException e) {
                }
            }
        }
    }

}
