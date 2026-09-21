package com.student;

public class CalculatorService {

    private Calculator calculator;

    public CalculatorService(Calculator calculator) {
        this.calculator = calculator;
    }

    public int calculator(int a, int b) {
        return calculator.add(a, b);
    }
}