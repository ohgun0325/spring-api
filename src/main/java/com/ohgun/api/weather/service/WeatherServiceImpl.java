package com.ohgun.api.weather.service;

import java.util.List;

import com.ohgun.api.common.domain.Messenger;
import com.ohgun.api.weather.domain.WeatherDTO;
import com.ohgun.api.weather.repository.WeatherRepository;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class WeatherServiceImpl implements WeatherService {
private final WeatherRepository weatherRepository;

    @Override
    public Messenger save(WeatherDTO weather) {
        return weatherRepository.save(weather);
    }

    @Override
    public Messenger delete(int date) {
       return weatherRepository.delete(date);
    }

    @Override
    public Messenger findById(int date) {
        return weatherRepository.findById(date);
    }

    @Override
    public Messenger update(WeatherDTO weather) {
        return weatherRepository.update(weather);
    }

    @Override
    public Messenger findAll() {
        return weatherRepository.findAll();
    }

    @Override
    public Messenger saveAll(List<WeatherDTO> weathers) {
        return weatherRepository.saveAll(weathers);
    }
    
}
