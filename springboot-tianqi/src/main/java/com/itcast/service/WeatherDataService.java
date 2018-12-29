package com.itcast.service;

import com.itcast.demain.WeatherResponse;

public interface WeatherDataService {
    /**
     * 根据城市ID查询天气数据
     * @param CityId
     * @return
     */
    WeatherResponse getDataByCityId(String CityId);

    /**
     * 根据城市名称查询天气数据
     * @param cityName
     * @return
     */
    WeatherResponse getDataByCityName(String cityName);

}
