package com.ohgun.api.calculator.domain;

public class CalculatorDTO {

    private String op; // 연산 종류: plus | minus | gob | nanum
    private int num1; // 첫 번째 입력값
    private int num2; // 두 번째 입력값
    private int result; // 계산 결과

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
