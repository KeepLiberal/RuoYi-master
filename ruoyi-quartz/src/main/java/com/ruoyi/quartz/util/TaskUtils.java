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
            log.error(">>>TaskUtils.getInterfaceKey 异常:{}", e);
        }
    }

    /**
     * 获取页面字段
     */
    public static void getHtmlKey(InvStock stock, String htmlUrl, String name) {
        try {
            int size = 0;
            htmlUrl = htmlUrl.replace("code=", "code=" + stock.getMarket() + stock.getCode());
            String result = HttpUtils.sendGet(htmlUrl, new AtomicInteger(10));
            Document doc = Jsoup.parse(result);

            if ("company".equals(name)) {
                size = getHtmlKey_company(doc);
            }
            if ("zyzb".equals(name)) {
                size = getHtmlKey_zyzb(doc);
            }
            if ("dbfx".equals(name)) {
                size = getHtmlKey_dbfx(doc);
            }
            if ("zcfz".equals(name)) {
                size = getHtmlKey_zcfz(doc);
            }
            if ("lr".equals(name)) {
                size = getHtmlKey_lr(doc);
            }
            if ("xjll".equals(name)) {
                size = getHtmlKey_xjll(doc);
            }
            if ("bfb".equals(name)) {
                size = getHtmlKey_bfb(doc);
            }

            if (size == 0) {
                log.error("htmlUrl:{} name:{} 无匹配项，请检查网页源码修正代码", "view-source:" + htmlUrl, name);
            }
        } catch (Exception e) {
            log.error(">>>TaskUtils.getHtmlKey htmlUrl:{} name:{} 异常:{}", htmlUrl, name, e);
        }
    }

    /**
     * 获取页面字段-公司概况
     */
    private static int getHtmlKey_company(Document doc) {
        int size = 0;
        try {
            Element element = doc.getElementById("tmpl");
            if (null != element) {
                size++;
                String elementStr = element.toString().replace("<script type=\"text/template\" id=\"tmpl\">", "").replace("</script>", "");
                Elements tbodys = Jsoup.parse(elementStr).select("tbody");
                for (Element tbody : tbodys) {
                    Elements jbzlTrs = tbody.select("tr");
                    for (Element tr : jbzlTrs) {
                        Elements ths = tr.select("th");
                        Elements tds = tr.select("td");
                        for (int i = 0; i < ths.size(); i++) {
                            String text = ths.get(i).text();
                            String key = tds.get(i).text();
                            String cleanKey = cleanKey(key);
                            if (StringUtils.isNotEmpty(cleanKey)) {
                                RyTask.keySetOfHtml.add(cleanKey);
                                RyTask.sqlMapOfHtml.put(cleanKey, getSql(key, text));
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            log.error(">>>TaskUtils.getHtmlKey_company 异常:{}", e);
        }
        return size;
    }

    /**
     * 获取页面字段-主要指标
     */
    private static int getHtmlKey_zyzb(Document doc) {
        int size = 0;
        try {
            Element element = doc.getElementById("tmpl_zyzb");
            if (null != element) {
                size++;
                String elementStr = element.toString().replace("<script type=\"text/template\" id=\"tmpl_zyzb\">", "").replace("</script>", "");
                Elements trs = Jsoup.parse(elementStr).select("tr");
                for (Element tr : trs) {
                    Elements tds = tr.select("td");
                    if (tds.size() == 2) {
                        Elements spans1 = tds.get(0).select("span");
                        Elements spans2 = tds.get(1).select("span");
                        String key = "";
                        String text = "";
                        if (spans1.size() == 1) {
                            text = spans1.get(0).text();
                        }
                        if (spans2.size() == 1) {
                            key = spans2.get(0).text();
                        }
                        String cleanKey = cleanKey(key);
                        if (StringUtils.isNotEmpty(cleanKey)) {
                            RyTask.keySetOfHtml.add(cleanKey);
                            RyTask.sqlMapOfHtml.put(cleanKey, getSql(key, text));
                        }
                    }
                }
            }
        } catch (Exception e) {
            log.error(">>>TaskUtils.getHtmlKey_zyzb 异常:{}", e);
        }
        return size;
    }

    /**
     * 获取页面字段-杜邦分析
     */
    private static int getHtmlKey_dbfx(Document doc) {
        int size = 0;
        try {
            Element element = doc.getElementById("tmpl_dbfx");
            if (null != element) {
                size++;
                List<String> divClasslist = new ArrayList<>();
                List<String> pClasslist = new ArrayList<>();
                for (int i = 1; i < 100; i++) {
                    divClasslist.add("db_" + (i < 10 ? "0" + i : i));
                    pClasslist.add("db_data" + (i < 10 ? "0" + i : i));
                }
                String elementStr = element.toString().replace("<script type=\"text/template\" id=\"tmpl_dbfx\">", "").replace("</script>", "");
                Elements divs = Jsoup.parse(elementStr).select("div");
                for (Element div : divs) {
                    String divClassName = div.className();
                    if (divClasslist.contains(divClassName)) {
                        String url = "https://emweb.eastmoney.com/PC_HSF10/Content/webImages/" + divClassName.replace("db_", "db_w_") + ".jpg";
                        Elements ps = div.select("p");
                        for (Element p : ps) {
                            String pClassName = p.className();
                            String cleanKey = cleanKey(p.text());
                            if (StringUtils.isNotEmpty(cleanKey)) {
                                RyTask.keySetOfHtml.add(cleanKey);
                                RyTask.sqlMapOfHtml.put(divClassName + "-" + pClassName + "-" + cleanKey, url);
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            log.error(">>>TaskUtils.getHtmlKey_dbfx 异常:{}", e);
        }
        return size;
    }

    /**
     * 获取页面字段-资产负债
     */
    private static int getHtmlKey_zcfz(Document doc) {
        int size = 0;
        try {
            List<String> ids = Arrays.asList("zcfzb_qy", "zcfzb_qy_tb", "zcfzb_yh", "zcfzb_yh_tb");
            List<String> elementStrs = new ArrayList<>();
            for (String id : ids) {
                Element element = doc.getElementById(id);
                if (null != element) {
                    elementStrs.add(element.toString().replace("<script type=\"text/template\" id=\"" + id + "\">", "").replace("</script>", ""));
                }
            }
            for (String elementStr : elementStrs) {
                Elements trs = Jsoup.parse(elementStr).select("tr");
                for (Element tr : trs) {
                    Elements tds = tr.select("td");
                    if (tds.size() == 2) {
                        Elements spans1 = tds.get(0).select("span");
                        Elements spans2 = tds.get(1).select("span");
                        String key = "";
                        String text = "";
                        if (spans1.size() == 1) {
                            text = spans1.get(0).text();
                        }
                        if (spans2.size() == 1) {
                            key = spans2.get(0).text();
                        }
                        String cleanKey = cleanKey(key);
                        if (StringUtils.isNotEmpty(cleanKey)) {
                            RyTask.keySetOfHtml.add(cleanKey);
                            RyTask.sqlMapOfHtml.put(cleanKey, getSql(key, text));
                        }
                    }
                }
            }
            size = elementStrs.size();
        } catch (Exception e) {
            log.error(">>>TaskUtils.getHtmlKey_zcfz 异常:{}", e);
        }
        return size;
    }

    /**
     * 获取页面字段-利润
     */
    private static int getHtmlKey_lr(Document doc) {
        int size = 0;
        try {
            List<String> ids = Arrays.asList("lrb_qy", "lrb_qy_tb", "lrb_qy_hb", "lrb_yh", "lrb_yh_tb", "lrb_yh_hb");
            List<String> elementStrs = new ArrayList<>();
            for (String id : ids) {
                Element element = doc.getElementById(id);
                if (null != element) {
                    elementStrs.add(element.toString().replace("<script type=\"text/template\" id=\"" + id + "\">", "").replace("</script>", ""));
                }
            }
            for (String elementStr : elementStrs) {
                Elements trs = Jsoup.parse(elementStr).select("tr");
                for (Element tr : trs) {
                    Elements tds = tr.select("td");
                    if (tds.size() == 2) {
                        Elements spans1 = tds.get(0).select("span");
                        Elements spans2 = tds.get(1).select("span");
                        String key = "";
                        String text = "";
                        if (spans1.size() == 1) {
                            text = spans1.get(0).text();
                        }
                        if (spans2.size() == 1) {
                            key = spans2.get(0).text();
                        }
                        String cleanKey = cleanKey(key);
                        if (StringUtils.isNotEmpty(cleanKey)) {
                            RyTask.keySetOfHtml.add(cleanKey);
                            RyTask.sqlMapOfHtml.put(cleanKey, getSql(key, text));
                        }
                    }
                }
            }
            size = elementStrs.size();
        } catch (Exception e) {
            log.error(">>>TaskUtils.getHtmlKey_lr 异常:{}", e);
        }
        return size;
    }

    /**
     * 获取页面字段-现金流量
     */
    private static int getHtmlKey_xjll(Document doc) {
        int size = 0;
        try {
            List<String> ids = Arrays.asList("xjllb_qy", "xjllb_qy_tb", "xjllb_qy_hb", "xjllb_yh", "xjllb_yh_tb", "xjllb_yh_hb");
            List<String> elementStrs = new ArrayList<>();
            for (String id : ids) {
                Element element = doc.getElementById(id);
                if (null != element) {
                    elementStrs.add(element.toString().replace("<script type=\"text/template\" id=\"" + id + "\">", "").replace("</script>", ""));
                }
            }
            for (String elementStr : elementStrs) {
                Elements trs = Jsoup.parse(elementStr).select("tr");
                for (Element tr : trs) {
                    Elements tds = tr.select("td");
                    if (tds.size() == 2) {
                        Elements spans1 = tds.get(0).select("span");
                        Elements spans2 = tds.get(1).select("span");
                        String key = "";
                        String text = "";
                        if (spans1.size() == 1) {
                            text = spans1.get(0).text();
                        }
                        if (spans2.size() == 1) {
                            key = spans2.get(0).text();
                        }
                        String cleanKey = cleanKey(key);
                        if (StringUtils.isNotEmpty(cleanKey)) {
                            RyTask.keySetOfHtml.add(cleanKey);
                            RyTask.sqlMapOfHtml.put(cleanKey, getSql(key, text));
                        }
                    }
                }
            }
            size = elementStrs.size();
        } catch (Exception e) {
            log.error(">>>TaskUtils.getHtmlKey_xjll 异常:{}", e);
        }
        return size;
    }

    /**
     * 获取页面字段-百分比
     */
    private static int getHtmlKey_bfb(Document doc) {
        int size = 0;
        try {
            List<String> ids = Arrays.asList("tmpl_bfbbb_index", "tmpl_bfbbb_1", "tmpl_bfbbb_2", "tmpl_bfbbb_3", "tmpl_bfbbb_4");
            List<String> elementStrs = new ArrayList<>();
            for (String id : ids) {
                Element element = doc.getElementById(id);
                if (null != element) {
                    elementStrs.add(element.toString().replace("<script type=\"text/template\" id=\"" + id + "\">", "").replace("</script>", ""));
                }
            }
            for (String elementStr : elementStrs) {
                Elements trs = Jsoup.parse(elementStr).select("tr");
                for (Element tr : trs) {
                    Elements tds = tr.select("td");
                    if (tds.size() == 2 && tds.get(0).className().equals("tips-data-Right")) {
                        String text = tr.select("th").get(0).select("span").get(0).text();
                        String key = tds.get(0).select("span").get(0).text();
                        String cleanKey = cleanKey(key);
                        if (StringUtils.isNotEmpty(cleanKey)) {
                            RyTask.keySetOfHtml.add(cleanKey);
                            RyTask.sqlMapOfHtml.put(cleanKey, getSql(key, text));
                        }
                    }
                }
            }
            size = elementStrs.size();
        } catch (Exception e) {
            log.error(">>>TaskUtils.getHtmlKey_bfb 异常:{}", e);
        }
        return size;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * 生成接口字段的TXT文件
     */
    public static void writeKeysOfInterface(String fileName) {
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
            for (String sql : RyTask.keySetOfInterface) {
                bw.write(sql);
                bw.write(System.getProperty("line.separator"));
            }
            bw.flush();
            bw.close();
        } catch (Exception e) {
            log.error(">>>TaskUtils.writeKeysOfInterface 异常:{}", e);
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
     * 生成页面字段生成的SQL文件
     */
    public static void writeSqlFileOfHtml(String fileName) {
        BufferedWriter bw = null;
        try {
            LinkedHashMap<String, String> sqlLinkedHashMap = new LinkedHashMap<>();
            //字段和对应的同比环比配对
            Set<String> keyMapOfHtmlKeySet = RyTask.sqlMapOfHtml.keySet();
            for (String outKey : keyMapOfHtmlKeySet) {
                if (!outKey.endsWith("_YOY") && !outKey.endsWith("_QOQ")) {
                    sqlLinkedHashMap.put(outKey, RyTask.sqlMapOfHtml.get(outKey));
                    for (String innerKey : keyMapOfHtmlKeySet) {
                        if ((outKey + "_YOY").equals(innerKey)) {
                            sqlLinkedHashMap.put(innerKey, RyTask.sqlMapOfHtml.get(innerKey));
                        }
                    }
                    for (String innerKey : keyMapOfHtmlKeySet) {
                        if ((outKey + "_QOQ").equals(innerKey)) {
                            sqlLinkedHashMap.put(innerKey, RyTask.sqlMapOfHtml.get(innerKey));
                        }
                    }
                }
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
            for (String key : sqlLinkedHashMap.keySet()) {
                bw.write(sqlLinkedHashMap.get(key));
                bw.write(System.getProperty("line.separator"));
            }
            bw.flush();
            bw.close();
        } catch (Exception e) {
            log.error(">>>TaskUtils.writeSqlFileOfHtml 异常:{}", e);
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
     * 生成接口字段和页面字段对比TXT文件
     */
    public static void writeCompareKeyFile(String fileName) {
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
                if (!RyTask.keySetOfHtml.contains(key)) {
                    htmlHasNo.add(key);
                }
            }
            for (String key : RyTask.keySetOfHtml) {
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
            log.error(">>>TaskUtils.writeCompareKeyFile 异常:{}", e);
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
     * 清洗KEY
     */
    private static String cleanKey(String str) {
        if (StringUtils.isEmpty(str)) return null;

        List<String> replaceList = new ArrayList<>();
        replaceList.add("{{formatStr(");
        replaceList.add("{{toFixed(");
        replaceList.add("{{formatFixed(");
        replaceList.add("{{formatMoney(");
        replaceList.add("{{formatPercent(");
        replaceList.add("{{formatNumber(");
        replaceList.add("{{formatDate(");
        replaceList.add(")}}");
        replaceList.add("value.");
        replaceList.add("jbzl.");
        replaceList.add("fxxg.");
        replaceList.add("1e4");
        replaceList.add(",");
        replaceList.add("'");
        replaceList.add("1");
        replaceList.add("2");
        replaceList.add("3");
        replaceList.add("4");

        for (String replace : replaceList) {
            str = str.replace(replace, "");
        }
        return str.trim();
    }

    /**
     * 获取sql
     */
    private static String getSql(String key, String text) {
        if (StringUtils.isEmpty(key)) return null;

        String cleanKey = cleanKey(key);
        if (cleanKey.endsWith("_YOY")) {
            text = text + "(同比%)";
        }
        if (cleanKey.endsWith("_QOQ")) {
            text = text + "(单季度环比%)";
        }

        if (key.contains("formatStr")) {
            text = "varchar(10) default null comment '" + text + "',";
        }
        if (key.contains("formatDate")) {
            text = "datetime default null comment '" + text + "',";
        }
        if (key.contains("toFixed") || key.contains("formatFixed") || key.contains("formatMoney") || key.contains("formatPercent") || key.contains("formatNumber") || key.contains("formatPercent")) {
            text = "double default null comment '" + text + "',";
        }

        return cleanKey + " " + text;
    }

    public static void main(String[] args) {
        getHtmlKey(new InvStock("000005", "", "sz"), "https://emweb.eastmoney.com/PC_HSF10/NewFinanceAnalysis/Index?type=web&code=", "dbfx");
    }
}
