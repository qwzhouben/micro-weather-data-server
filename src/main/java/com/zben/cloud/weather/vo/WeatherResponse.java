package com.zben.cloud.weather.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * Weather Response.
 *
 * @since 1.0.0 2017年11月21日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
@Data
public class WeatherResponse implements Serializable {

    private static final long serialVersionUID = 1L;
    private Weather data;
    private Integer status;
    private String desc;

}