package com.ohgun.api.auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.core.io.ClassPathResource;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

@Controller
public class RegisterController {

    @GetMapping("/register")
    public String register() {
        return "auth/register";
    }

    @GetMapping("/csv-test")
    public String csvTest() {
        try {
            // CSV 파일 읽기
            ClassPathResource resource = new ClassPathResource("static/csv/train.csv");
            InputStreamReader reader = new InputStreamReader(resource.getInputStream());

            CSVParser parser = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(reader);
            List<CSVRecord> records = parser.getRecords();

            System.out.println("=== 타이타닉 승객 데이터 (상위 5명) ===");
            System.out.println("총 승객 수: " + records.size());
            System.out.println();

            // List와 Map을 사용하여 데이터 처리
            List<Map<String, String>> passengerList = new ArrayList<>();

            // 상위 5명만 처리
            for (int i = 0; i < Math.min(5, records.size()); i++) {
                CSVRecord record = records.get(i);
                Map<String, String> passengerMap = new HashMap<>();

                // Map에 데이터 저장
                passengerMap.put("PassengerId", record.get("PassengerId"));
                passengerMap.put("Survived", record.get("Survived"));
                passengerMap.put("Pclass", record.get("Pclass"));
                passengerMap.put("Name", record.get("Name"));
                passengerMap.put("Sex", record.get("Sex"));
                passengerMap.put("Age", record.get("Age"));
                passengerMap.put("Fare", record.get("Fare"));

                passengerList.add(passengerMap);
            }

            // List와 Map을 사용하여 출력
            for (int i = 0; i < passengerList.size(); i++) {
                Map<String, String> passenger = passengerList.get(i);
                System.out.println("승객 " + (i + 1) + ":");

                // Map의 모든 키-값 쌍 출력
                for (Map.Entry<String, String> entry : passenger.entrySet()) {
                    System.out.println("  " + entry.getKey() + ": " + entry.getValue());
                }
                System.out.println();
            }

            parser.close();
            reader.close();

        } catch (IOException e) {
            System.err.println("CSV 파일 읽기 오류: " + e.getMessage());
        }

        return "";
    }
}
