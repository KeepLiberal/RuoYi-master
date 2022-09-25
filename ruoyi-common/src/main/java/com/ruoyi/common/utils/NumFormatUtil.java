package com.ruoyi.common.utils;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NumFormatUtil {

    /**
     * @Title: toFloat
     * @Description:数据转换成标准格式
     * @author weny.yang
     * @date Apr 6, 2021
     */
    public static Integer toInteger(String strNum) {
        String reg = "[^\u4e00-\u9fa5]";// 中文正则
        Integer result = null;
        if(null==strNum || "".equals(strNum)){
            return result;
        }
        try {
            String newNum = strNum.replace(",", "").replace("%", "")
                    .replace("次", "").replace("天", "")
                    .replace("倍", "").replace("-", "").replace("--", "");
            if(!"".equals(newNum)){
                String chine = newNum.replaceAll(reg, "");
                Float fv = Float.valueOf(newNum.replace(chine, ""));
                if(!"".equals(chine)){
                    for (int i = 0; i < chine.length(); i++) {
                        String num = chine.substring(i, i + 1);
                        if ("亿".equals(num)) {
                            result = Integer.valueOf((int) (fv * 100000000));
                        } else if ("万".equals(num)) {
                            result = Integer.valueOf((int) (fv * 10000));
                        }
                    }
                }else{
                    result = Integer.valueOf(newNum.replace(chine, ""));
                }
            }
        } catch (Exception e) {
            log.error("调用NumFormatUtil.toInteger Exception, strNum=" + strNum, e);
        }

        return result;
    }



    /**
     * @Title: toDouble
     * @Description:数据转换成标准格式
     * @author weny.yang
     * @date Apr 6, 2021
     */
    public static Double toDouble(String strNum) {
        String reg = "[^\u4e00-\u9fa5]";// 中文正则
        Double result = null;
        if(null==strNum || "".equals(strNum)){
            return result;
        }
        try {
            String newNum = strNum.replace(",", "").replace("%", "")
                    .replace("次", "").replace("天", "")
                    .replace("倍", "").replace("-", "").replace("--", "");
            if(!"".equals(newNum)){
                String chine = newNum.replaceAll(reg, "");
                result = Double.valueOf(newNum.replace(chine, ""));
                for (int i = 0; i < chine.length(); i++) {
                    String num = chine.substring(i, i + 1);
                    if ("亿".equals(num)) {
                        result = result * 100000000;
                    } else if ("万".equals(num)) {
                        result = result * 10000;
                    }
                }
            }
        } catch (Exception e) {
            log.error("调用NumFormatUtil.toDouble Exception, strNum=" + strNum, e);
        }
        return result;
    }
}