package com.ruoyi.common.enums;

/**
 * 财务报告审计意见
 *
 * @author yangwenyang
 * @date 2022-10-18
 */
public enum OpinionTypeEnu {
    BZWBL("bzwbl", "标准无保留意见"),
    DJSXSMDWBL("djsxsmdwbl", "带解释性说明的无保留意见"),
    DQDSXDDWBL("dqdsxddwbl", "带强调事项段的无保留意见"),
    BL("bzwbl", "保留意见"),
    WFJJBS("wfjjbs", "无法(拒绝)表示意见"),
    FD("fd", "否定意见"),
    JSJ("jsj", "经审计"),
    WJSJ("wjsj", "未经审计");

    private final String code;
    private final String value;

    OpinionTypeEnu(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }
}
