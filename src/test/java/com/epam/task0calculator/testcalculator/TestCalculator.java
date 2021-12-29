package com.epam.task0calculator.testcalculator;

import com.epam.task0calculator.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCalculator {

    @Test
    void testSumShouldSumWhenPositive() {
        //given
        Calculator calculator = new Calculator();
        //when
        double result = calculator.sum(2, 3);
        //then
        Assertions.assertEquals(5, result);
    }

    @Test
    void testSumShouldSumWhenNegative() {
        //given
        Calculator calculator = new Calculator();
        //when
        double result = calculator.sum(-2, -3);
        //then
        Assertions.assertEquals(-5, result);
    }

    @Test
    void testSubtractionShouldSubtractWhenPositive() {
        //given
        Calculator calculator = new Calculator();
        //when
        double result = calculator.subtraction(5, 3);
        //then
        Assertions.assertEquals(2, result);
    }

    @Test
    void testSubtractionShouldSubtractWhenNegative() {
        //given
        Calculator calculator = new Calculator();
        //when
        double result = calculator.subtraction(-7, -3);
        //then
        Assertions.assertEquals(-4, result);
    }

    @Test
    void testMultiplicationShouldMultiplyWhenPositive() {
        //given
        Calculator calculator = new Calculator();
        //when
        double result = calculator.multiplication(2, 3);
        //then
        Assertions.assertEquals(6, result);
    }

    @Test
    void testMultiplicationShouldMultiplyWhenNegative() {
        //given
        Calculator calculator = new Calculator();
        //when
        double result = calculator.multiplication(-2, -3);
        //then
        Assertions.assertEquals(6, result);
    }

    @Test
    void testDivisionShouldDivideWhenPositive() {
        //given
        Calculator calculator = new Calculator();
        //when
        double result = calculator.division(3, 2);
        //then
        Assertions.assertEquals(1.5, result);
    }

    @Test
    void testDivisionShouldDivideWhenNegative() {
        //given
        Calculator calculator = new Calculator();
        //when
        double result = calculator.division(-3, -2);
        //then
        Assertions.assertEquals(1.5, result);
    }

    @Test
    void testDivisionShouldReturnMessageAndZeroWhenDividerIsZero() {
        //given
        Calculator calculator = new Calculator();
        //when
        double result = calculator.division(15, 0);
        //then
        Assertions.assertEquals(0, result);
    }
}
