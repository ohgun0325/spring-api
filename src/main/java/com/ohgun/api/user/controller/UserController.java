package com.ohgun.api.user.controller;

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

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import com.ohgun.api.user.service.UserService;

import com.ohgun.api.common.domain.Messenger;

import com.ohgun.api.user.domain.UserDTO;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/all")
    public String saveAll(Model model) {
        try {
            // CSV 파일 경로
            String csvFilePath = "src/main/resources/static/csv/train.csv";

            // CSV 파일 읽기
            FileReader reader = new FileReader(csvFilePath);
            CSVParser parser = new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader());

            List<UserDTO> users = new ArrayList<>();
            int count = 0;

            // 처음 5명의 데이터만 읽기
            for (CSVRecord record : parser) {
                if (count >= 5)
                    break;

                UserDTO user = new UserDTO();
                user.setUserId(record.get("PassengerId"));
                user.setSurvived(record.get("Survived"));
                user.setPclass(record.get("Pclass"));
                user.setName(record.get("Name"));
                user.setGender(record.get("Sex"));
                user.setAge(record.get("Age"));
                user.setSibSp(record.get("SibSp"));
                user.setParch(record.get("Parch"));
                user.setTicket(record.get("Ticket"));
                user.setFare(record.get("Fare"));
                user.setCabin(record.get("Cabin"));
                user.setEmbarked(record.get("Embarked"));

                users.add(user);
                count++;
            }

            parser.close();
            reader.close();

            Messenger messenger = new Messenger();

            // 터미널 출력: Service -> Repository로 전달하여 상세 로그 출력
            userService.saveAll(users);

            model.addAttribute("messenger", messenger);
            model.addAttribute("users", users);
            return "user/list";

        } catch (IOException e) {
            Messenger messenger = new Messenger();
            messenger.setCode(500);
            messenger.setMessage("CSV 파일을 읽는 중 오류가 발생했습니다: " + e.getMessage());
            return "user/list";
        }
    }

    @DeleteMapping("/{id}")
    public String delete(String id, Model model) {
        Messenger messenger = userService.delete(id);
        model.addAttribute("messenger", messenger);
        return "user/list";
    }

    @GetMapping("/id/{id}")
    public String findById(String id, Model model) {
        Messenger messenger = userService.findById(id);
        model.addAttribute("messenger", messenger);
        return "user/list";
    }

    @PutMapping("/{id}")
    public String update(UserDTO user, Model model) {
        Messenger messenger = userService.update(user);
        model.addAttribute("messenger", messenger);
        return "user/list";
    }

    @GetMapping("/all")
    public String findAll(Model model) {
        Messenger messenger = userService.findAll();
        model.addAttribute("messenger", messenger);
        return "user/list";
    }

    @PostMapping("")
    public String save(UserDTO user, Model model) {
        Messenger messenger = userService.save(user);
        model.addAttribute("messenger", messenger);
        return "user/list";
    }

}