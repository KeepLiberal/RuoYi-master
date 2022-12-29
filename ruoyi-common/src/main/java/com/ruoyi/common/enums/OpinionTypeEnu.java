package com.ruoyi.common.enums;

/**
 * 财务报告审计意见
 *
 * @author yangwenyang
 * @date 2022-10-18
 */
public enum OpinionTypeEnu {
    BZWBL("标准无保留意见", "bzwbl"),
    DJSXSMDWBL("带解释性说明的无保留意见", "djsxsmdwbl"),
    DQDSXDDWBL("带强调事项段的无保留意见", "dqdsxddwbl"),
    BL("保留意见", "bzwbl"),
    WFJJBS("无法(拒绝)表示意见", "wfjjbs"),
    WFBS("无法表示意见", "wfjjbs"),
    JJBS("拒绝表示意见", "wfjjbs"),
    FD("否定意见", "fd"),
    JSJ("经审计", "jsj"),
    WJSJ("未经审计", "wjsj");

    private final String chineseStr;
    private final String dict;

    OpinionTypeEnu(String chineseStr, String dict) {
        this.chineseStr = chineseStr;
        this.dict = dict;
    }

    public String getChineseStr() {
        return chineseStr;
    }

    public String getDict() {
        return dict;
    }
}
