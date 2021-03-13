package com.calc.base;

import static org.junit.Assert.*;

public class BaseCalcTest {
    BaseCalc baseCalc = new BaseCalc();

    @org.junit.Test
    public void sum() {
        int actual = baseCalc.sum(2, 3);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void subtract() {
        int actual = baseCalc.subtract(5, 3);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void multiply() {
        int actual = baseCalc.multiply(2, 3);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void divide() {
        double actual = baseCalc.divide(5, 2);
        double expected = 2.5;
        assertEquals(expected, actual, 0.00000000000000001);
    }
}
