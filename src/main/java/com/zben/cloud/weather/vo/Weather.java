package com.zben.cloud.weather.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 天气信息.
 *
 * @since 1.0.0 2017年11月21日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
@Data
public class Weather implements Serializable {

    private static final long serialVersionUID = 1L;

    private String city;
    private String aqi;
    private String ganmao;
    private String wendu;
    private Yesterday yesterday;
    private List<Forecast> forecast;

}