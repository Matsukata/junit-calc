package com.calc.function;

import com.calc.operations.OperationBasedCalc;

import java.util.Map;
import java.util.function.BinaryOperator;

public class FunctionBasedCalc {
    Map<OperationBasedCalc, BinaryOperator<Integer>> map = Map.of(OperationBasedCalc.SUM, Integer::sum,
            OperationBasedCalc.SUBTRACTION, (x, y) -> x - y,
            OperationBasedCalc.MULTIPLICATION, (x, y) -> x * y,
            OperationBasedCalc.DIVISION, (x, y) -> x / y);

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

    public Map<OperationBasedCalc, BinaryOperator<Integer>> getMap() {
        return map;
    }
}