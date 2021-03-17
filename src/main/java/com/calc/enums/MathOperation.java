package com.calc.enums;

import java.util.function.IntBinaryOperator;

public enum MathOperation {
    PLUS(Integer::sum),
    MINUS((a, b) -> a - b),
    MULTIPLY((a, b) -> a * b),
    DIVIDE((a, b) -> a / b);

    private final IntBinaryOperator binaryOperator;

    MathOperation(final IntBinaryOperator binaryOperator) {
        this.binaryOperator = binaryOperator;
    }

    public IntBinaryOperator getBinaryOperator() {
        return binaryOperator;
    }
}
