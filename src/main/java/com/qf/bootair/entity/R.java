package com.qf.bootair.entity;

import lombok.Data;

/**
 * @Date 2023/5/29 11:35
 * @Author 人来疯
 * Version v1.0
 */
@Data
public class R<T>{
    private static Integer SUCCESS=200;
    private static Integer FAIL=200;

    private Integer code;

    private String msg;

    private T data;

    public R(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> R<T> ok(Integer code,String msg, T data){
        return new R<T>(code, msg, data);
    }

    public static <T> R<T> ok(T data){
        return ok(SUCCESS,"请求成功",data);
    }

    public  static <T> R<T> ok(){
        return ok(null);
    }
    public static <T> R<T> fail(Integer code,String msg, T data){
        return new R<T>(code, msg, data);
    }

    public static <T> R<T> fail(T data){
        return ok(SUCCESS,"请求失败",data);
    }

    public  static <T> R<T> fail(){
        return ok(null);
    }
}
