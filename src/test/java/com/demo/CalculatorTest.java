
package com.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(15, calculator.add(10, 5));
    }

    @Test
    void testDivision() {
        assertEquals(5, calculator.divide(20, 4));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(
            ArithmeticException.class,
            () -> calculator.divide(10, 0)
        );
    }
}
