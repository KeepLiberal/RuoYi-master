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
        File sqlFile = new File("/Users/yay/WorkSpace/RuoYi/RuoYi-Data/devFile/sql/dev-"+interfaceCode+".sql");
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
     * 获取字段带描述的sql列表
     */
    private static List<String> getSqlListWithComment(List<InvStock> stockList, String interfaceCode) throws IOException {
        List<String> htmlLineList = new ArrayList<>();

        Set<String> set = new HashSet<>();
        for (InvStock stock : stockList){
            File htmlFile = new File("/Users/yay/WorkSpace/RuoYi/RuoYi-Data/devFile/downloadHtml/html/"+interfaceCode+"/dev-" + stock.getCode() + ".html");
            List<String> downloadHtmlFileList = readDownloadHtmlFile(htmlFile);
            for (String htmlLine : downloadHtmlFileList){
                if (set.add(htmlLine)){
                    htmlLineList.add(htmlLine);
                }
            }
        }

        List<String> sqlWithCommentList = new ArrayList<>();
        for (String key : RyTask.keySet) {
            for (int i=0; i<htmlLineList.size(); i++) {
                String htmlKey = htmlLineList.get(i);
                if (htmlKey.contains("(value."+key+")")) {
                    String chinese = StringUtils.getChinese(htmlLineList.get(i-1));
                    String sql = "";
                    if(key.endsWith("_YOY")){
                        sql = "`" + key + "` double default null comment '"+chinese+"(环比%)'";
                    }else{
                        sql = "`" + key + "` double default null comment '"+chinese+"'";
                    }
                    sqlWithCommentList.add(sql);
                    break;
                }
            }
        }
        return sqlWithCommentList;
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
