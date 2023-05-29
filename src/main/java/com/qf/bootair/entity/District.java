package com.qf.bootair.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (District)实体类
 *
 * @author makejava
 * @since 2023-05-29 10:33:29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class District implements Serializable {
    private static final long serialVersionUID = 848615195373314801L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 区域名称
     */
    private String name;

}

