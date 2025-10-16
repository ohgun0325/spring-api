package com.ohgun.api.auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ohgun.api.auth.domain.LoginDTO;
import com.ohgun.api.auth.service.LoginService;

@Controller
public class LoginController {
    
    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }
    
    @GetMapping("/login")
    public String Login(@RequestParam(required = false) String email,
                        @RequestParam(required = false) String password)  {
                        System.out.println("=== 로그인 컨트롤러로 들어옴 ===");
                        System.out.println("email: " + email);
                        System.out.println("password: " + password);
                        System.out.println("==================");
                        LoginDTO loginDTO = new LoginDTO();
                        loginDTO.setEmail(email);
                        loginDTO.setPassword(password);

                        loginService.login(loginDTO);

        System.out.println("컨트롤러로 들어옴");
        System.out.println("화면에서 컨트롤러로 전달된 이메일: " + email);
        System.out.println("화면에서 컨트롤러로 전달된 비밀번호: " + password);
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
    
  

