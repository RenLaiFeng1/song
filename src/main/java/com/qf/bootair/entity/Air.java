package com.qf.bootair.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 空气质量表(Air)实体类
 *
 * @author makejava
 * @since 2023-05-29 10:33:30
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Air implements Serializable {
    private static final long serialVersionUID = -95986814037002473L;
    /**
     * 主键ID
     */
    private Integer id;
    /**
     * 区域ID
     */
    private Integer districtId;
    /**
     * 检测时间
     */
    private Date monitorTime;
    /**
     * PM10
     */
    private Integer pm10;
    /**
     * PM25
     */
    private Integer pm25;
    /**
     * 检测站
     */
    private String monitoringStation;
    /**
     * 更新时间
     */
    private Date lastModifyTime;

}

