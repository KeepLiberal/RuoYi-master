package com.ruoyi.quartz.util;

import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.investment.domain.InvStock;
import com.ruoyi.quartz.task.RyTask;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 定时任务调度工具类
 *
 * @author yay
 */
public class TaskUtils {

    /**
     * 生成字段带有描述的sql文件
     */
    public static void writeSqlFileWithComment(List<InvStock> stockList, String interfaceCode) throws IOException {
        writeSqlFileWithoutComment(interfaceCode);

        File sqlFile = new File("/Users/yay/WorkSpace/RuoYi/RuoYi-Data/devFile/sql/dev-with-comment-"+interfaceCode+".sql");
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
        BufferedWriter bw = new BufferedWriter(new FileWriter(sqlFile));
        for (String sql : getSqlListWithComment(stockList, interfaceCode)) {
            bw.write(sql);
            bw.write(System.getProperty("line.separator"));
        }
        bw.flush();
        bw.close();
    }

    /**
     * 写出接口所有字段
     */
    private static void writeSqlFileWithoutComment(String interfaceCode) throws IOException {
        File sqlFile = new File("/Users/yay/WorkSpace/RuoYi/RuoYi-Data/devFile/sql/dev-without-comment-"+interfaceCode+".sql");
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
        BufferedWriter bw = new BufferedWriter(new FileWriter(sqlFile));
        for (String key : RyTask.keySet) {
            bw.write("`" + key + "` double default null comment ''," + "\r\n");
        }
        bw.flush();
        bw.close();

        RyTask.keySet.clear();
    }

    /**
     * 获取字段带描述的sql列表
     */
    private static List<String> getSqlListWithComment(List<InvStock> stockList, String interfaceCode) throws IOException {
        List<String> downloadHtmlList = new ArrayList<>();
        for (InvStock stock : stockList){
            File htmlFile = new File("/Users/yay/WorkSpace/RuoYi/RuoYi-Data/devFile/downloadHtml/html/"+interfaceCode+"/dev-" + stock.getCode() + ".html");
            downloadHtmlList.addAll(readDownloadHtmlFile(htmlFile));
        }

        File sqlFile = new File("/Users/yay/WorkSpace/RuoYi/RuoYi-Data/devFile/sql/dev-without-comment-"+interfaceCode+".sql");
        List<String> sqlWithoutCommentList = readSqlFileWithoutComment(sqlFile);

        List<String> sqlWithCommentList = new ArrayList<>();
        for (String sql : sqlWithoutCommentList) {
            String sqlKey = sql.replace("double","")
                    .replace("default","")
                    .replace("null","")
                    .replace("comment","")
                    .replace("`","")
                    .replace("'","")
                    .replace(",","").trim();
            sqlKey = "(value."+sqlKey.toUpperCase()+")";
            for (int i=0; i<downloadHtmlList.size(); i++) {
                String htmlKey = downloadHtmlList.get(i);
                if (htmlKey.contains(sqlKey)) {
                    String chinese = StringUtils.getChinese(downloadHtmlList.get(i-1));
                    if(sqlKey.contains("_YOY")){
                        sql = sql.replace("comment ''","comment '"+chinese+"(环比%)'");
                    }else{
                        sql = sql.replace("comment ''","comment '"+chinese+"'");
                    }
                    sqlWithCommentList.add(sql);
                    break;
                }
            }
        }
        return sqlWithCommentList;
    }

    /**
     * 读取程序生成的字段不带描述的sql文件
     */
    private static List<String> readSqlFileWithoutComment(File file) throws IOException {
        List<String> keyList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = null;
        while ((line = br.readLine()) != null) {
            if (line.contains("comment")){
                keyList.add(line);
            }
        }
        br.close();
        return keyList;
    }

    /**
     * 读取html文件获得字段名和描述
     */
    private static List<String> readDownloadHtmlFile(File file) throws IOException {
        List<String> keyList = new ArrayList<>();
        Set<String> keySet = new HashSet<>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = null;
        while ((line = br.readLine()) != null) {
            if (line.contains("(value.") || StringUtils.isContainChinese(line)){
                if (keySet.add(line)){
                    keyList.add(line);
                }
            }
        }
        br.close();
        return keyList;
    }

}
