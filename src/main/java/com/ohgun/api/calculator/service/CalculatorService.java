package com.ohgun.api.calculator.service;

import org.springframework.stereotype.Service;

import com.ohgun.api.calculator.domain.CalculatorDTO;

@Service
public interface CalculatorService {

    public int add(CalculatorDTO addDTO);
    public int subtract(CalculatorDTO subtractDTO);
    public int multiply(CalculatorDTO multiplyDTO);
    public int divide(CalculatorDTO divideDTO);
   

    
}

