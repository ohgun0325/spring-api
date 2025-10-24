package com.ohgun.api.weather.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class WeatherDTO {

    private int date; // 일시
    private int avgTemp; // 평균기온(℃)
    private int maxTemp; // 최고기온(℃)
    private int maxTempTime; // 최고기온시각
    private int minTemp; // 최저기온(℃)
    private int minTempTime; // 최저기온시각
    private int dailyRange; // 일교차
    private int precipitation; // 강수량(mm)
}
