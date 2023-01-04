package com.ruoyi.quartz.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.http.HttpUtils;
import com.ruoyi.investment.domain.InvStock;
import com.ruoyi.quartz.task.RyTask;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 定时任务调度工具类
 *
 * @author yay
 */
@Slf4j
public class TaskUtils {


    /**
     * 获取接口字段
     */
    public static void getInterfaceKey(InvStock stock, String dataUrl) {
        try {
            if (dataUrl.contains("code=")) {
                dataUrl = dataUrl.replace("code=", "code=" + stock.getMarket() + stock.getCode());
            }
            if (dataUrl.contains("companyType=")) {
                dataUrl = dataUrl.replace("companyType=", "companyType=" + stock.getStockType());
            }
            if (dataUrl.contains("ctype=")) {
                dataUrl = dataUrl.replace("ctype=", "ctype=" + stock.getStockType());
            }
            if (dataUrl.contains("dates=")) {
                ZonedDateTime dateTime = ZonedDateTime.now();
                int year = dateTime.getYear();
                int month = dateTime.getMonthValue();
                if (month < 3) {
                    dataUrl = dataUrl.replace("dates=", "dates=" + (year - 2) + "-12-31");
                }
                if (month > 3 && month <= 6) {
                    dataUrl = dataUrl.replace("dates=", "dates=" + (year - 1) + "-3-31");
                }
                if (month > 6 && month <= 9) {
                    dataUrl = dataUrl.replace("dates=", "dates=" + (year - 1) + "-6-30");
                }
                if (month > 9 && month <= 12) {
                    dataUrl = dataUrl.replace("dates=", "dates=" + (year - 1) + "-9-30");
                }
            }
            String result = HttpUtils.sendGet(dataUrl, new AtomicInteger(10));
            if (StringUtils.isNotEmpty(result)) {
                JSONObject jsonObject = JSONObject.parseObject(result);
                Set<String> keySet = jsonObject.keySet();
                for (String key : keySet) {
                    Object obj = jsonObject.get(key);
                    if (obj instanceof JSONArray) {
                        JSONArray jsonArray = (JSONArray) obj;
                        if (!jsonArray.isEmpty()) {
                            Iterator<Object> iterator = jsonArray.iterator();
                            if (iterator.hasNext()) {
                                JSONObject next = (JSONObject) iterator.next();
                                RyTask.keySetOfInterface.addAll(next.keySet());
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            log.error(">>>TaskUtils.getInterfaceKey 异常:", e);
        }
    }

    public static void main(String[] args) {
        getHtmlKey(new InvStock("000005", "", "sz"), "https://emweb.eastmoney.com/PC_HSF10/NewFinanceAnalysis/Index?type=web&code=", "lr");
    }

    /**
     * 获取接口字段
     */
    public static void getHtmlKey(InvStock stock, String htmlUrl, String name) {
        try {
            htmlUrl = htmlUrl.replace("code=", "code=" + stock.getMarket() + stock.getCode());
            String result = HttpUtils.sendGet(htmlUrl, new AtomicInteger(10));
            if (StringUtils.isNotEmpty(result)) {
                Document doc = Jsoup.parse(result);
                Elements scripts = doc.getElementsByTag("script");

                List<String> elementIdList = new ArrayList<>();
                for (Element element : scripts) {
                    String elementId = element.id();
                    if (elementId.contains(name)) {
                        elementIdList.add(elementId);
                        String replace1 = "<script type=\"text/template\" id=\"" + elementId + "\">";
                        String replace2 = "</script>";
                        String elementStr = element.toString().replace(replace1, "").replace(replace2, "");

                        Document elementDoc = Jsoup.parse(elementStr);
                        Elements elementTds = elementDoc.select("td");
                        for (int i = 0; i < elementTds.size() - 1; i++) {
                            Element ele = elementTds.get(i);
                            String eleStr = ele.toString();
                            if (eleStr.contains("no-data") || eleStr.contains("nodata") || eleStr.contains("暂无数据")) {
                                elementTds.remove(ele);
                            }
                        }

                        for (int i = 0; i <= elementTds.size() - 2; i = i + 2) {
                            String nameText = elementTds.get(i).select("span").get(0).text();
                            String keyText = elementTds.get(i + 1).select("span").get(0).text();

                            String clearKey = cleanKey(keyText);
                            String sql = "";
                            if (StringUtils.isNotEmpty(clearKey)) {
                                sql = "`" + clearKey + "` double default null comment '" + nameText + "',";
                            } else {
                                sql = "-- =================" + nameText + "================= --";
                            }

                            RyTask.keyMapOfHtml.put(sql, clearKey);
                        }
                    }
                }
                if (elementIdList.size() == 0) {
                    log.info("htmlUrl:{} name:{} 无匹配项，请检查网页源码修正代码", htmlUrl, name);
                }
            }
        } catch (Exception e) {
            log.error(">>>TaskUtils.getHtmlKey 异常:", e);
        }
    }

    /**
     * 生成SQL文件
     */
    public static void writeSqlFile(String fileName, Set<String> sqlSet) {
        BufferedWriter bw = null;
        try {
            File sqlFile = new File("/Users/yay/WorkSpace/RuoYi/RuoYi-master/devFile/" + fileName);
            File pafile = sqlFile.getParentFile();
            // 判断文件夹是否存在
            if (!pafile.exists()) {
                pafile.mkdirs();
            }
            // 判断文件是否存在
            if (!sqlFile.exists()) {
                sqlFile.createNewFile();
            }
            // 遍历写入
            bw = new BufferedWriter(new FileWriter(sqlFile));
            for (String sql : sqlSet) {
                bw.write(sql);
                bw.write(System.getProperty("line.separator"));
            }
            bw.flush();
            bw.close();
        } catch (Exception e) {
            log.error(">>>TaskUtils.writeSqlFile 异常:", e);
        } finally {
            if (null != bw) {
                try {
                    bw.close();
                } catch (IOException e) {
                }
            }
        }
    }

    /**
     * 生成SQL文件
     */
    public static void writeSqlFile(String fileName, LinkedHashMap<String, String> keyMapOfHtml) {
        BufferedWriter bw = null;
        try {
            Set<String> sqlSet = new LinkedHashSet<>();
            //字段和对应的同比环比配对
            Set<String> keySet = keyMapOfHtml.keySet();
            for (String keyOut : keySet){
                for (String keyInner : keySet){
                    if (!keyMapOfHtml.get(keyOut).contains("_YOY") && (keyMapOfHtml.get(keyOut)+"_YOY").equals(keyMapOfHtml.get(keyInner))){
                        sqlSet.add(keyOut);
                        sqlSet.add(keyInner);
                    }
                    if (StringUtils.isEmpty(keyMapOfHtml.get(keyOut))){
                        sqlSet.add(keyOut);
                    }
                }
            }
            //存放没有配对的字段
            for (String key : keySet){
                sqlSet.add(key);
            }

            File sqlFile = new File("/Users/yay/WorkSpace/RuoYi/RuoYi-master/devFile/" + fileName);
            File pafile = sqlFile.getParentFile();
            // 判断文件夹是否存在
            if (!pafile.exists()) {
                pafile.mkdirs();
            }
            // 判断文件是否存在
            if (!sqlFile.exists()) {
                sqlFile.createNewFile();
            }
            // 遍历写入
            bw = new BufferedWriter(new FileWriter(sqlFile));
            for (String sql : sqlSet) {
                bw.write(sql);
                bw.write(System.getProperty("line.separator"));
            }
            bw.flush();
            bw.close();
        } catch (Exception e) {
            log.error(">>>TaskUtils.writeSqlFile 异常:", e);
        } finally {
            if (null != bw) {
                try {
                    bw.close();
                } catch (IOException e) {
                }
            }
        }
    }

    /**
     * 生成字段对比文件
     */
    public static void writeCompareFile(String fileName) {
        BufferedWriter bw = null;
        try {
            File sqlFile = new File("/Users/yay/WorkSpace/RuoYi/RuoYi-master/devFile/" + fileName);
            File pafile = sqlFile.getParentFile();
            // 判断文件夹是否存在
            if (!pafile.exists()) {
                pafile.mkdirs();
            }
            // 判断文件是否存在
            if (!sqlFile.exists()) {
                sqlFile.createNewFile();
            }

            List<String> interfaceHasNo = new ArrayList<>();
            List<String> htmlHasNo = new ArrayList<>();
            for (String key : RyTask.keySetOfInterface) {
                if (!RyTask.keyMapOfHtml.containsValue(key)) {
                    htmlHasNo.add(key);
                }
            }
            for (String key : RyTask.keyMapOfHtml.values()) {
                if (!RyTask.keySetOfInterface.contains(key)) {
                    interfaceHasNo.add(key);
                }
            }

            // 遍历写入
            bw = new BufferedWriter(new FileWriter(sqlFile));
            bw.write("--==============接口包含页面不包含的字段==============");
            bw.write(System.getProperty("line.separator"));
            for (String key : htmlHasNo) {
                bw.write(key);
                bw.write(System.getProperty("line.separator"));
            }
            bw.write(System.getProperty("line.separator"));

            bw.write("--==============页面包含接口不包含的字段==============");
            bw.write(System.getProperty("line.separator"));
            for (String key : interfaceHasNo) {
                bw.write(key);
                bw.write(System.getProperty("line.separator"));
            }

            bw.flush();
            bw.close();
        } catch (Exception e) {
            log.error(">>>TaskUtils.writeCompareFile 异常:", e);
        } finally {
            if (null != bw) {
                try {
                    bw.close();
                } catch (IOException e) {
                }
            }
        }
    }


    /**
     * 清洗HTML
     */
    private static String cleanKey(String str) {
        List<String> replaceList = new ArrayList<>();
        replaceList.add("{");
        replaceList.add("formatStr");
        replaceList.add("toFixed");
        replaceList.add("formatMoney");
        replaceList.add("formatPercent");
        replaceList.add("(");
        replaceList.add("value");
        replaceList.add(".");
        replaceList.add(",");
        replaceList.add("'");
        replaceList.add("4");
        replaceList.add(")");
        replaceList.add("}");

        for (String replace : replaceList) {
            str = str.replace(replace, "");
        }
        return str.trim();
    }
}
