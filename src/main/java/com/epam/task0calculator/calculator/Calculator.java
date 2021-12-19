package com.epam.task0calculator.calculator;

public class Calculator {
    public double sum(double firstArgument, double secondArgument) {
        return firstArgument + secondArgument;
    }

    public double subtraction(double firstArgument, double secondArgument) {
        return firstArgument - secondArgument;
    }

    public double multiplication(double firstArgument, double secondArgument) {
        return firstArgument * secondArgument;
    }

    public double division(double firstArgument, double secondArgument) {
        if (secondArgument != 0) {
            return firstArgument / secondArgument;
        }
        System.out.println("Divider = 0. Cannot be divided by zero");
        return 0;
    }


}
