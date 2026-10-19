package com.student;

public class SimpleCalculator implements Calculator {

    @Override
    public int add(int a, int b) {
        return a - b;
    }
}
