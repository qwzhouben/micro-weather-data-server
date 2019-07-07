package com.zben.cloud.weather.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 未来天气.
 *
 * @since 1.0.0 2017年11月21日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
@Data
public class Forecast implements Serializable {

    private static final long serialVersionUID = 1L;
    private String date;
    private String high;
    private String fengli;
    private String low;
    private String fengxiang;
    private String type;

}