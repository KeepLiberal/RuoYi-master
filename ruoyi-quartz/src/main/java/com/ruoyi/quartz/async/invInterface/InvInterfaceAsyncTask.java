package com.ruoyi.quartz.async.invInterface;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.http.HttpUtils;
import com.ruoyi.investment.domain.InvStock;
import com.ruoyi.quartz.constant.InvConstants;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
@Component
public class InvInterfaceAsyncTask {

    /**
     * 多线程获取接口字段
     */
    @Async("investmentDataThreadPoolTaskExecutor")
    public void getInterfaceKey(InvStock stock, String dataUrl) {
        if (StringUtils.isNotEmpty(dataUrl)) getInterfaceKeys(stock, dataUrl);
    }

    /**
     * 多线程获取接口字段
     */
    @Async("investmentDataThreadPoolTaskExecutor")
    public void getHtmlKey(InvStock stock, String htmlUrl, String name) {
        if (StringUtils.isNotEmpty(htmlUrl)) getHtmlKeys(stock, htmlUrl, name);
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * 生成接口字段的TXT文件
     */
    public void writeKeysOfInterface(String fileName) {
        BufferedWriter bw = null;
        try {
            File sqlFile = new File("/Users/yay/WorkSpace/RuoYi/RuoYi-master/devFile/" + fileName);
            File paFile = sqlFile.getParentFile();
            // 判断文件夹是否存在
            if (!paFile.exists()) {
                paFile.mkdirs();
            }
            // 判断文件是否存在
            if (!sqlFile.exists()) {
                sqlFile.createNewFile();
            }
            // 遍历写入
            bw = new BufferedWriter(new FileWriter(sqlFile));
            for (String sql : InvConstants.keyOfInterfaceSet) {
                bw.write(sql);
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

    /**
     * 生成页面字段生成的SQL文件
     */
    public void writeSqlFileOfHtml(String fileName) {
        BufferedWriter bw = null;
        try {
            LinkedHashMap<String, String> sqlLinkedHashMap = new LinkedHashMap<>();
            Set<String> imageSet = new HashSet<>();
            //字段和对应的同比环比配对
            Set<String> keyMapOfHtmlKeySet = InvConstants.sqlOfHtmlMap.keySet();
            for (String outKey : keyMapOfHtmlKeySet) {
                String value = InvConstants.sqlOfHtmlMap.get(outKey);
                if (value.contains("https")) {
                    String imageUrl = value.substring(value.indexOf("https"), value.length() - 2);
                    imageSet.add(imageUrl);
                }
                if (!outKey.endsWith("_YOY") && !outKey.endsWith("_QOQ")) {
                    sqlLinkedHashMap.put(outKey, InvConstants.sqlOfHtmlMap.get(outKey));
                    for (String innerKey : keyMapOfHtmlKeySet) {
                        if ((outKey + "_YOY").equals(innerKey)) {
                            sqlLinkedHashMap.put(innerKey, InvConstants.sqlOfHtmlMap.get(innerKey));
                        }
                    }
                    for (String innerKey : keyMapOfHtmlKeySet) {
                        if ((outKey + "_QOQ").equals(innerKey)) {
                            sqlLinkedHashMap.put(innerKey, InvConstants.sqlOfHtmlMap.get(innerKey));
                        }
                    }
                }
            }

            File sqlFile = new File("/Users/yay/WorkSpace/RuoYi/RuoYi-master/devFile/" + fileName);
            File paFile = sqlFile.getParentFile();
            // 判断文件夹是否存在
            if (!paFile.exists()) {
                paFile.mkdirs();
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

            for (String imageUrl : imageSet) {
                HttpUtils.downloadFile(imageUrl, "/Users/yay/WorkSpace/RuoYi/RuoYi-master/devFile/" + imageUrl.substring(imageUrl.indexOf("db_w_")), new AtomicInteger(10));
            }
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

    /**
     * 生成接口字段和页面字段对比TXT文件
     */
    public void writeCompareKeyFile(String fileName) {
        BufferedWriter bw = null;
        try {
            File sqlFile = new File("/Users/yay/WorkSpace/RuoYi/RuoYi-master/devFile/" + fileName);
            File paFile = sqlFile.getParentFile();
            // 判断文件夹是否存在
            if (!paFile.exists()) {
                paFile.mkdirs();
            }
            // 判断文件是否存在
            if (!sqlFile.exists()) {
                sqlFile.createNewFile();
            }

            List<String> interfaceHasNo = new ArrayList<>();
            List<String> htmlHasNo = new ArrayList<>();

            for (String key : InvConstants.keyOfInterfaceSet) {
                if (!InvConstants.keyOfHtmlSet.contains(key)) {
                    htmlHasNo.add(key);
                }
            }
            for (String key : InvConstants.keyOfHtmlSet) {
                if (!InvConstants.keyOfInterfaceSet.contains(key)) {
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

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * 获取接口字段
     */
    private void getInterfaceKeys(InvStock stock, String dataUrl) {
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
            if (StringUtils.isNotEmpty(result) && !result.contains("<title>无F10资料</title>")) {
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
                                InvConstants.keyOfInterfaceSet.addAll(next.keySet());
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            log.error(">>>dataUrl:{} 异常:", dataUrl, e);
        }
    }

    /**
     * 获取页面字段
     */
    private void getHtmlKeys(InvStock stock, String htmlUrl, String name) {
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
                log.error("htmlUrl:{} name:{} 无匹配项，请检查网页源码修正代码", htmlUrl, name);
            }
        } catch (Exception e) {
            log.error(">>>htmlUrl:{} name:{} 异常", htmlUrl, name, e);
        }
    }

    /**
     * 获取页面字段-公司概况
     */
    private int getHtmlKey_company(Document doc) {
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
                                InvConstants.keyOfHtmlSet.add(cleanKey);
                                InvConstants.sqlOfHtmlMap.put(cleanKey, getSql(key, text));
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            log.error("异常:", e);
        }
        return size;
    }

    /**
     * 获取页面字段-主要指标
     */
    private int getHtmlKey_zyzb(Document doc) {
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
                            InvConstants.keyOfHtmlSet.add(cleanKey);
                            InvConstants.sqlOfHtmlMap.put(cleanKey, getSql(key, text));
                        }
                    }
                }
            }
        } catch (Exception e) {
            log.error(">>>异常:", e);
        }
        return size;
    }

    /**
     * 获取页面字段-杜邦分析
     */
    private int getHtmlKey_dbfx(Document doc) {
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
                            String key = p.text();
                            String cleanKey = cleanKey(key);
                            if (StringUtils.isNotEmpty(cleanKey)) {
                                InvConstants.keyOfHtmlSet.add(cleanKey);
                                InvConstants.sqlOfHtmlMap.put(cleanKey, getSql(key, divClassName + "-" + pClassName + "-" + url));
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            log.error(">>>异常:", e);
        }
        return size;
    }

    /**
     * 获取页面字段-资产负债
     */
    private int getHtmlKey_zcfz(Document doc) {
        int size = 0;
        try {
            List<String> ids = Arrays.asList("zcfzb_qy", "zcfzb_qy_tb", "zcfzb_yh", "zcfzb_yh_tb", "zcfzb_qs", "zcfzb_qs_tb", "zcfzb_bx", "zcfzb_bx_tb");
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
                            InvConstants.keyOfHtmlSet.add(cleanKey);
                            InvConstants.sqlOfHtmlMap.put(cleanKey, getSql(key, text));
                        }
                    }
                }
            }
            size = elementStrs.size();
        } catch (Exception e) {
            log.error(">>>异常:", e);
        }
        return size;
    }

    /**
     * 获取页面字段-利润
     */
    private int getHtmlKey_lr(Document doc) {
        int size = 0;
        try {
            List<String> ids = Arrays.asList("lrb_qy", "lrb_qy_tb", "lrb_qy_hb", "lrb_yh", "lrb_yh_tb", "lrb_yh_hb", "lrb_qs", "lrb_qs_tb", "lrb_qs_hb", "lrb_bx", "lrb_bx_tb", "lrb_bx_hb");
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
                            InvConstants.keyOfHtmlSet.add(cleanKey);
                            InvConstants.sqlOfHtmlMap.put(cleanKey, getSql(key, text));
                        }
                    }
                }
            }
            size = elementStrs.size();
        } catch (Exception e) {
            log.error(">>>异常:", e);
        }
        return size;
    }

    /**
     * 获取页面字段-现金流量
     */
    private int getHtmlKey_xjll(Document doc) {
        int size = 0;
        try {
            List<String> ids = Arrays.asList("xjllb_qy", "xjllb_qy_tb", "xjllb_qy_hb", "xjllb_yh", "xjllb_yh_tb", "xjllb_yh_hb", "xjllb_qs", "xjllb_qs_tb", "xjllb_qs_hb", "xjllb_bx", "xjllb_bx_tb", "xjllb_bx_hb");
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
                            InvConstants.keyOfHtmlSet.add(cleanKey);
                            InvConstants.sqlOfHtmlMap.put(cleanKey, getSql(key, text));
                        }
                    }
                }
            }
            size = elementStrs.size();
        } catch (Exception e) {
            log.error(">>>异常:", e);
        }
        return size;
    }

    /**
     * 获取页面字段-百分比
     */
    private int getHtmlKey_bfb(Document doc) {
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
                            InvConstants.keyOfHtmlSet.add(cleanKey);
                            InvConstants.sqlOfHtmlMap.put(cleanKey, getSql(key, text));
                        }
                    }
                }
            }
            size = elementStrs.size();
        } catch (Exception e) {
            log.error(">>>异常:", e);
        }
        return size;
    }

    /**
     * 清洗KEY
     */
    private String cleanKey(String str) {
        if (StringUtils.isEmpty(str)) return null;

        List<String> replaceList = Arrays.asList("{{formatStr(", "{{toFixed(", "{{formatFixed(", "{{formatMoney(",
                "{{formatMoney(", "{{formatPercent(", "{{formatNumber(", "{{formatDate(",
                ", 4)}}", ", '%')}}", ", '')}}", ")}}", "value.", "jbzl.", "fxxg.", "*1e4", "&ensp;", ", '次'");

        for (String replace : replaceList) {
            str = str.replace(replace, "");
        }
        return str.trim();
    }

    /**
     * 清洗描述
     */
    private String cleanText(String str) {
        if (StringUtils.isEmpty(str)) return null;

        List<String> replaceList = Arrays.asList("&ensp;");

        for (String replace : replaceList) {
            str = str.replace(replace, "");
        }
        return str.trim();
    }

    /**
     * 获取sql
     */
    private String getSql(String key, String text) {
        if (StringUtils.isEmpty(key)) return null;

        text = cleanText(text);

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
}
