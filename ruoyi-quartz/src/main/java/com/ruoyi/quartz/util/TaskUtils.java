package com.ruoyi.quartz.util;

import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.investment.domain.InvStock;
import com.ruoyi.quartz.task.RyTask;
import lombok.extern.slf4j.Slf4j;

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
@Slf4j
public class TaskUtils {

    /**
     * 生成字段不带有描述的SQL文件
     */
    public static void writeSqlFileWithoutComment(String fileName) throws IOException {
        File sqlFile = new File("/Users/yay/WorkSpace/RuoYi/RuoYi-master/devFile/sql/dev-without-" + fileName + ".sql");
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
            String sql = "";
            if (key.endsWith("_YOY")) {
                sql = "`" + key + "` double default null comment '(环比%)'";
            } else {
                sql = "`" + key + "` double default null comment ''";
            }
            bw.write(sql);
            bw.write(System.getProperty("line.separator"));
        }
        bw.flush();
        bw.close();
    }

    /**
     * 生成字段带有描述的SQL文件
     */
    public static void writeSqlFileWithComment(String fileName) throws IOException {
        File sqlFile = new File("/Users/yay/WorkSpace/RuoYi/RuoYi-master/devFile/sql/dev-y-" + fileName + ".sql");
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
        for (String sql : RyTask.sqlSet) {
            bw.write(sql);
            bw.write(System.getProperty("line.separator"));
        }
        bw.flush();
        bw.close();
    }


    /**
     * 读取HTML文件获得字段名和描述
     */
    public static List<String> readDownloadHtmlFile(File file) {
        List<String> keyList = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = null;
            Set<String> keySet = new HashSet<>();
            while ((line = br.readLine()) != null) {
                if (line.contains("(value.") || StringUtils.isContainChinese(line)) {
                    if (keySet.add(line)) {
                        keyList.add(line);
                    }
                }
            }
            br.close();
        } catch (Exception e) {
            log.error(">>>TaskUtils.readDownloadHtmlFile 异常:", e);
        }
        return keyList;
    }

}
