package com.calc.operations;

public class EnumCalc {
    public int sum(int a, int b, String sum) {
        return binaryOperation(a, b, sum);
    }

    public int subtract(int a, int b, String subtraction) {
        return binaryOperation(a, b, subtraction);
    }

    public int multiply(int a, int b, String multiplication) {
        return binaryOperation(a, b, multiplication);
    }

    public double divide(int a, int b, String division) {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return binaryOperation(a, b, division);
    }

    public int binaryOperation(int a, int b, String operation) {
        return Operations.valueOf(operation).applyAsInt(a, b);
    }
}
