package com.calc.operations;

import java.util.function.IntBinaryOperator;

public enum Operations implements IntBinaryOperator {
    PLUS("+", (l, r) -> l + r),
    MINUS("-", (l, r) -> l - r),
    MULTIPLY("*", (l, r) -> l * r),
    DIVIDE("/", (l, r) -> l / r);

    private final String symbol;
    private final IntBinaryOperator binaryOperator;

    Operations(final String symbol, final IntBinaryOperator binaryOperator) {
        this.symbol = symbol;
        this.binaryOperator = binaryOperator;
    }

    @Override
    public int applyAsInt(final int left, final int right) {
        return binaryOperator.applyAsInt(left, right);
    }
}
