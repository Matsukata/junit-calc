package com.calc.base;

import org.junit.Test;

public class BaseCalcExceptionTest {
    private BaseCalc baseCalc = new BaseCalc();

    @Test(expected = ArithmeticException.class)
    public void divideByZero() {
        baseCalc.divide(5, 0);
    }
}
