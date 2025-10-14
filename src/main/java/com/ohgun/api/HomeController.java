package com.ohgun.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }
    
    @GetMapping("/auth/login.go")
    public String login() {
        return "auth/login";
    }
    
    @GetMapping("/auth/register")
    public String register() {
        return "auth/register";
    }

    @GetMapping("/calculator/plus")
    public String plus() {
        return "contents/calculator/plus";
    }

    @GetMapping("/calculator/minus")
    public String minus() {
        return "contents/calculator/minus";
    }

    @GetMapping("/calculator/nanum")
    public String nanum() {
        return "contents/calculator/nanum";
    }

    @GetMapping("/calculator/gob")
    public String gob() {
        return "contents/calculator/gob";
    }
}