package com.ohgun.api.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ohgun.api.calculator.domain.CalculatorDTO;
import com.ohgun.api.calculator.service.CalculatorService;

@Controller
public class CalculatorController {
    
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    
    @GetMapping("/calculator")
    public String calculator(@RequestParam String op,
                            @RequestParam int num1,
                            @RequestParam int num2) {
                            System.out.println("=== 계산기 컨트롤러로 들어옴 ===");
                            System.out.println("op: " + op);
                            System.out.println("num1: " + num1);
                            System.out.println("num2: " + num2);
                            System.out.println("==================");
                            CalculatorDTO calculatorDTO = new CalculatorDTO();
                            calculatorDTO.setOp(op);
                            calculatorDTO.setNum1(num1);
                            calculatorDTO.setNum2(num2);
                            
                            calculatorService.gob(calculatorDTO);
                            calculatorService.minus(calculatorDTO);
                            calculatorService.nanum(calculatorDTO);
                            calculatorService.plus(calculatorDTO);
                            
        System.out.println("계산기 컨트롤러로 들어옴");
        System.out.println("화면에서 컨트롤러로 전달된 op: " + op);
        System.out.println("화면에서 컨트롤러로 전달된 num1: " + num1);
        System.out.println("화면에서 컨트롤러로 전달된 num2: " + num2);
        System.out.println("==================");
                            
        return "calculator";
        }
}

