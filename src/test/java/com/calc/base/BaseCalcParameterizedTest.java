package com.calc.base;

import org.junit.Assume;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BaseCalcParameterizedTest {
    enum Type {SUBTRACT, ADD, MULTIPLICATION, DIVISION}

    private BaseCalc baseCalc = new BaseCalc();

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {Type.ADD, 2, 3, 5},
                {Type.SUBTRACT, 5, 1, 4},
                {Type.MULTIPLICATION, 5, 5, 25},
                {Type.DIVISION, 5, 2, 2}});
    }

    private Type type;
    private final int first;
    private final int second;
    private final int expected;

    public BaseCalcParameterizedTest(Type type, int first, int second, int expected) {
        this.type = type;
        this.first = first;
        this.second = second;
        this.expected = expected;
    }

    @Test
    public void testCorrectSum() {
        Assume.assumeTrue(type == Type.ADD);
        assertEquals(expected, baseCalc.sum(first, second));
    }

    @Test
    public void testSubtraction() {
        Assume.assumeTrue(type == Type.SUBTRACT);
        assertEquals(expected, baseCalc.subtract(first, second));
    }

    @Test
    public void testMultiplication() {
        Assume.assumeTrue(type == Type.MULTIPLICATION);
        assertEquals(expected, baseCalc.multiply(first, second));
    }

   /* @Test
    public void testDivision() {
        Assume.assumeTrue(type == Type.DIVISION);
        assertEquals(expected, baseCalc.divide(first, second), 0.00000001);
    }*/
}
