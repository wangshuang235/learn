package com.springdemo.dto;

import com.springdemo.dictionary.RESULT;

/**
 * @Author: cool
 * @Date: 2018/9/11 17:30
 */
public class BaseResultDto {
    private String result_code;
    private String result_message;

    public String getResult_code() {
        return result_code;
    }

    public void setResult_code(String result_code) {
        this.result_code = result_code;
    }

    public String getResult_message() {
        return result_message;
    }

    public void setResult_message(String result_message) {
        this.result_message = result_message;
    }

    public BaseResultDto(String result_code, String result_message) {
        super();
        this.result_code = result_code;
        this.result_message = result_message;
    }

    public BaseResultDto() {
    }

    @Override
    public String toString() {
        return "BaseResultDto [result_code=" + result_code + ", result_message=" + result_message + "]";
    }

    public void success() {
        this.result_code = RESULT.Success.getCode();
        this.result_message = RESULT.Success.getName();

    }

    public void fail(String result_message) {
        this.result_code = RESULT.Failure.getCode();
        this.result_message = result_message;

    }

    public void fail() {
        fail(RESULT.Failure.getName());
    }
}
