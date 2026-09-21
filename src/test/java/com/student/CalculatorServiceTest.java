package com.student;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {

    private CalculatorService service;

    @BeforeEach
    void setUp() {
        Calculator calculator = new SimpleCalculator();
        service = new CalculatorService(calculator);
    }
    @Test
void testPositiveNumbers() {
    assertEquals(8, service.calculator(5, 3));
}

@Test
void testNegativeNumbers() {
    assertEquals(-8, service.calculator(-5, -3));
}

@Test
void testZero() {
    assertEquals(5, service.calculator(5, 0));
}

@Test
void testNotEquals() {
    assertNotEquals(10, service.calculator(5, 3));
}

@Test
void testResultIsPositive() {
    assertTrue(service.calculator(5, 3) > 0);
}

@Test
void testAnotherAddition() {
    assertEquals(15, service.calculator(10, 5));
}
}