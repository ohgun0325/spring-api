package com.ohgun.api.weather.controller;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ohgun.api.weather.service.WeatherService;
import com.ohgun.api.common.domain.Messenger;
import com.ohgun.api.weather.domain.WeatherDTO;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/weathers")
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;

    @PostMapping("/all")
    public String saveAll(Model model) {
        try {
            // CSV 파일 경로
            String csvFilePath = "src/main/resources/static/csv/TRAIN_weather.csv-Grid view.csv";

            // CSV 파일 읽기
            FileReader reader = new FileReader(csvFilePath);
            CSVParser parser = new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader());

            List<WeatherDTO> weatherList = new ArrayList<>();

            // 전체 데이터 읽기
            for (CSVRecord record : parser) {
                WeatherDTO weather = new WeatherDTO();

                // CSV 컬럼명에 맞게 데이터 매핑
                weather.setDate(Integer.parseInt(record.get("일시").replace("-", "").substring(0, 8))); // YYYYMMDD 형식으로
                                                                                                      // 변환
                weather.setAvgTemp((int) Double.parseDouble(record.get("평균기온(℃)")));
                weather.setMaxTemp((int) Double.parseDouble(record.get("최고기온(℃)")));
                weather.setMaxTempTime(Integer.parseInt(record.get("최고기온시각").replace(":", ""))); // HHMM 형식으로 변환
                weather.setMinTemp((int) Double.parseDouble(record.get("최저기온(℃)")));
                weather.setMinTempTime(Integer.parseInt(record.get("최저기온시각").replace(":", ""))); // HHMM 형식으로 변환
                weather.setDailyRange((int) Double.parseDouble(record.get("일교차")));

                // 강수량은 빈 값일 수 있으므로 처리
                String precipitationStr = record.get("강수량(mm)");
                if (precipitationStr != null && !precipitationStr.trim().isEmpty()) {
                    weather.setPrecipitation((int) Double.parseDouble(precipitationStr));
                } else {
                    weather.setPrecipitation(0);
                }

                weatherList.add(weather);
            }

            parser.close();
            reader.close();

            Messenger messenger = new Messenger();

            // 터미널 출력: Service -> Repository로 전달하여 상세 로그 출력
            weatherService.saveAll(weatherList);

            model.addAttribute("messenger", messenger);
            model.addAttribute("weathers", weatherList);
            return "weather/list";

        } catch (IOException e) {
            Messenger messenger = new Messenger();
            messenger.setCode(500);
            messenger.setMessage("CSV 파일을 읽는 중 오류가 발생했습니다: " + e.getMessage());
            return "weather/list";
        }
    }

    @DeleteMapping("/{date}")
    public String delete(@PathVariable int date, Model model) {
        Messenger messenger = weatherService.delete(date);
        model.addAttribute("messenger", messenger);
        return "weather/list";
    }

    @GetMapping("/id/{date}")
    public String findById(@PathVariable int date, Model model) {
        Messenger messenger = weatherService.findById(date);
        model.addAttribute("messenger", messenger);
        return "weather/list";
    }

    @PutMapping("/{date}")
    public String update(WeatherDTO weather, Model model) {
        Messenger messenger = weatherService.update(weather);
        model.addAttribute("messenger", messenger);
        return "weather/list";
    }

    @GetMapping("/all")
    public String findAll(Model model) {
        Messenger messenger = weatherService.findAll();
        model.addAttribute("messenger", messenger);
        return "weather/list";
    }

    @PostMapping("")
    public String save(WeatherDTO weather, Model model) {
        Messenger messenger = weatherService.save(weather);
        model.addAttribute("messenger", messenger);
        return "weather/list";
    }

}
