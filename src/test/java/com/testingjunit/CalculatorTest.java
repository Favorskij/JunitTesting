package com.testingjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void sum() {

        Calculator calculator = new Calculator();
        assertEquals(10, calculator.sum(5,5));

    }
}