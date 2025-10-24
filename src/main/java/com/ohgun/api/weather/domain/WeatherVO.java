package com.ohgun.api.weather.domain;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor

public class WeatherVO {
    
    private int date;
    private int avgTemp;
    private int maxTemp;
    private int maxTempTime;
    private int minTemp;
    private int minTempTime;
    private int dailyRange;
    private int precipitation;
    
}

