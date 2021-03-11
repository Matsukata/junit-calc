package com.function;

import com.operations.OperationType;

import java.util.Map;
import java.util.function.BinaryOperator;

public class FunctionBasedCalculator {
    Map<OperationType, BinaryOperator<Integer>> map = Map.of(OperationType.ADDITION, (x, y) -> x + y,
            OperationType.SUBTRACTION, (x, y) -> x - y,
            OperationType.MULTIPLICATION, (x, y) -> x * y,
            OperationType.DIVISION, (x, y) -> x / y);

    private int sum(int a, int b) {
        return a + b;
    }

    private int subtract(int a, int b) {
        return a - b;
    }

    private int multiply(int a, int b) {
        return a * b;
    }

    private double divide(int a, int b) {
        return (double) a / b;
    }
}
