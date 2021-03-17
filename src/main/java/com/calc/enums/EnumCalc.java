package com.calc.enums;

public class EnumCalc {
    private static final String ADD_OPERATION = "PLUS";
    private static final String SUBTRACT_OPERATION = "MINUS";
    private static final String MULTIPLY_OPERATION = "MULTIPLY";
    private static final String DIVIDE_OPERATION = "DIVIDE";

    public int sum(int a, int b) {
        return binaryOperation(ADD_OPERATION, a, b);
    }

    public int subtract(int a, int b) {
        return binaryOperation(SUBTRACT_OPERATION, a, b);
    }

    public int multiply(int a, int b) {
        return binaryOperation(MULTIPLY_OPERATION, a, b);
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divide by Zero");
        }
        return binaryOperation(DIVIDE_OPERATION, a, b);
    }

    private int binaryOperation(String operation, int a, int b) {
        return MathOperation.valueOf(operation).getBinaryOperator().applyAsInt(a, b);
    }
}
