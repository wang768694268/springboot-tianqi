package com.itcast.controller;

import com.itcast.demain.WeatherResponse;
import com.itcast.service.WeatherDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: Lucifer
 * @create: 2018-09-23 23:45
 * @description:
 **/
@RestController
@RequestMapping(value = "/weather")
public class WeatherController {

    @Resource
    private WeatherDataService weatherDataService;

    @GetMapping(value = "/cityId/{cityId}")
    public WeatherResponse getWeatherByCityId(@PathVariable("cityId") String cityId){
        return weatherDataService.getDataByCityId(cityId);
    }

    @GetMapping(value = "/cityName/{cityName}")
    public WeatherResponse getWeatherByCityName(@PathVariable("cityName") String cityName){
        return weatherDataService.getDataByCityName(cityName);
    }

}
