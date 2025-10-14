package com.ohgun.api.auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    
    @GetMapping("/login")
    public String Login(@RequestParam(required = false) String email,
                        @RequestParam(required = false) String password)  {

        System.out.println("=== 로그인 요청 ===");
        System.out.println("아이디: " + email);
        System.out.println("비밀번호: " + password);
        System.out.println("==================");
           
        // 로그인 조건 확인
        if ("a".equals(email) && "b".equals(password)) {
            System.out.println("로그인 성공! register.html로 이동");
            return "auth/register"; // template/auth/success.html 로 이동
        } else {
            System.out.println("로그인 실패! 다시 시도");
            return "auth/login"; // template/auth/login.html 로 이동
            }
        }
        
}
    
  

