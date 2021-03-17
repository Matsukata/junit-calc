package com.calc.base;

import com.calc.enums.MathOperation;
import org.junit.Assume;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static com.calc.enums.MathOperation.DIVIDE;
import static com.calc.enums.MathOperation.MINUS;
import static com.calc.enums.MathOperation.MULTIPLY;
import static com.calc.enums.MathOperation.PLUS;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BaseCalcParameterizedTest {
    private static BaseCalc baseCalc;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {PLUS, 2, 3, 5},
                {MINUS, 5, 1, 4},
                {MULTIPLY, 5, 5, 25},
                {DIVIDE, 3, 2, 1.5}
        });
    }

    @Parameterized.Parameter
    public MathOperation type;

    @Parameterized.Parameter(1)
    public int first;

    @Parameterized.Parameter(2)
    public int second;

    @Parameterized.Parameter(3)
    public double expected;

    @BeforeClass
    public static void init() {
        baseCalc = new BaseCalc();
    }

    @Test
    public void testCorrectSum() {
        Assume.assumeTrue(type == PLUS);
        assertEquals((int) expected, baseCalc.sum(first, second));
    }

    @Test
    public void testSubtraction() {
        Assume.assumeTrue(type == MINUS);
        assertEquals((int) expected, baseCalc.subtract(first, second));
    }

    @Test
    public void testMultiplication() {
        Assume.assumeTrue(type == MULTIPLY);
        assertEquals((int) expected, baseCalc.multiply(first, second));
    }

    @Test
    public void testDivision() {
        Assume.assumeTrue(type == DIVIDE);
        assertEquals(expected, baseCalc.divide(first, second), 0.00000001);
    }
}