package com.itcast.demain;

import java.io.Serializable;

/**
 * @author: Lucifer
 * @create: 2018-09-23 23:18
 * @description:响应数据
 **/
public class WeatherResponse implements Serializable {

    private Weather data;
    private Integer status;
    private String desc;

    public Weather getData() {
        return data;
    }

    public void setData(Weather data) {
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
