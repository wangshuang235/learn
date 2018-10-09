package com.springdemo.dictionary;

/**
 * @Author: cool
 * @Date: 2018/9/11 17:29
 */
public enum RESULT {
    Success("0", "成功","succ"), Failure("1", "失败","fail"),EXCEPTION("-1", "异常", "exception");

    private String code;
    private String name;
    private String gv_code;

    private RESULT(String code, String name, String gv_code) {
        this.code = code;
        this.name = name;
        this.gv_code = gv_code;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getGv_code() {
        return gv_code;
    }
}
