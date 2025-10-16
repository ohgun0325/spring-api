package com.ohgun.api.calculator.service;

import org.springframework.stereotype.Service;

import com.ohgun.api.calculator.domain.CalculatorDTO;

@Service
public class CalculatorService {

    public void gob(CalculatorDTO gobDTO) {
        System.out.println("서비스로 들어옴");
        System.out.println("DTO에서 서비스로 전달된 값: " + gobDTO.getNum1());
        System.out.println("DTO에서 서비스로 전달된 값: " + gobDTO.getNum2());

        int result = gobDTO.getNum1() * gobDTO.getNum2();
        System.out.println("곱하기 결과: " + result);

    }

    public void minus(CalculatorDTO minusDTO) {
        System.out.println("서비스로 들어옴");
        System.out.println("DTO에서 서비스로 전달된 값: " + minusDTO.getNum1());
        System.out.println("DTO에서 서비스로 전달된 값: " + minusDTO.getNum2());

        int result = minusDTO.getNum1() - minusDTO.getNum2();
        System.out.println("뺄셈 결과: " + result);

    }

    public void nanum(CalculatorDTO nanumDTO) {
        System.out.println("서비스로 들어옴");
        System.out.println("DTO에서 서비스로 전달된 값: " + nanumDTO.getNum1());
        System.out.println("DTO에서 서비스로 전달된 값: " + nanumDTO.getNum2());

        int result = nanumDTO.getNum1() / nanumDTO.getNum2();
        System.out.println("나눗셈 결과: " + result);

    }

    public void plus(CalculatorDTO plusDTO) {
        System.out.println("서비스로 들어옴");
        System.out.println("DTO에서 서비스로 전달된 값: " + plusDTO.getNum1());
        System.out.println("DTO에서 서비스로 전달된 값: " + plusDTO.getNum2());

        int result = plusDTO.getNum1() + plusDTO.getNum2();
        System.out.println("덧셈 결과: " + result);

    }
}
