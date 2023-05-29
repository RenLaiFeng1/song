package com.qf.bootair.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 用户表(Users)实体类
 *
 * @author makejava
 * @since 2023-05-29 19:06:19
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users implements Serializable {
    private static final long serialVersionUID = -58159357813054100L;
    /**
     * 主键ID
     */
    private Integer id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 邮箱
     */
    private String email;

}

