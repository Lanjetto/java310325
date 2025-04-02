package com.nexign.helloJava.day3;

public class Calculator {

    public double divide(double arg1, double arg2) throws ArithmeticException{
        if (arg2 == 0) {
            throw new DivisionByZero("Делить на ноль нельзя");
        }
        return arg1/arg2;
    }
}
