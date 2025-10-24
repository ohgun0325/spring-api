package com.ohgun.api.weather.service;

import java.util.List;

import com.ohgun.api.common.domain.Messenger;
import com.ohgun.api.weather.domain.WeatherDTO;



public interface WeatherService {

    Messenger save(WeatherDTO weather);

    Messenger delete(int date);

    Messenger findById(int date);

    Messenger update(WeatherDTO weather);

    Messenger findAll();

    Messenger saveAll(List<WeatherDTO> weathers);
}