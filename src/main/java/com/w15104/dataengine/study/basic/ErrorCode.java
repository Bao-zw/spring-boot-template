package com.w15104.dataengine.study.basic;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/*
 *
 * @description 异常编码类
 *
 * @author w15104
 * @data: 2019-3-5
 *
 * @modified by:
 * @modified date:
 * @modified no:
 */
public enum ErrorCode {


    E_00000("未知错误", "unknown error"),

    E_00001("新增错误", "add error"),

    E_00002("删除错误", "delete error"),

    E_00003("查询错误", "qurry error"),

    E_00004("更新错误", "update error"),

    E_00005("下载错误", "download error"),
    ;

    /**
     * 中文描述
     */
    private String message_cn;

    /**
     * 英文描述
     */
    private String message_us;


    @Value("${exception.language.chinese:false}")
    private boolean isChinese;

    /**
     * 构造函数
     * @param message_cn 中文描述
     * @param message_us  英文描述
     */
    private ErrorCode(String message_cn, String  message_us){
        this.message_cn =message_cn;
        this.message_us=message_us;
    }

    /**
     * 获取错误信息
     * @return String
     */
    public String getMessage(){
        if(isChinese){
            return message_cn;
        }
        return message_us;
    }


    public String getMessage_cn() {
        return message_cn;
    }

    public String getMessage_us() {
        return message_us;
    }

    public void setMessage_cn(String message_cn) {
        this.message_cn = message_cn;
    }

    public void setMessage_us(String message_us) {
        this.message_us = message_us;
    }

}