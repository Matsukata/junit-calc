package com.calc.base;

import org.junit.Assume;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Enclosed.class)
public class BaseCalcParameterizedTest {

    private static BaseCalc baseCalc = new BaseCalc();

    @RunWith(Parameterized.class)
    public static class IntParameters {
        enum Type {SUBTRACT, ADD, MULTIPLICATION}

        @Parameterized.Parameters
        public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][]{
                    {Type.ADD, 2, 3, 5},
                    {Type.SUBTRACT, 5, 1, 4},
                    {Type.MULTIPLICATION, 5, 5, 25},
            });
        }

        private Type type;
        private final int first;
        private final int second;
        private final int expected;

        public IntParameters(Type type, int first, int second, int expected) {
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
    }

    @RunWith(Parameterized.class)
    public static class DoubleParameters {
        @Parameterized.Parameters
        public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][]{
                    {3, 2, 1.5}
            });
        }

        private final int first;
        private final int second;
        private final double expected;

        public DoubleParameters(int first, int second, double expected) {
            this.first = first;
            this.second = second;
            this.expected = expected;
        }

        @Test
        public void testDivision() {
            assertEquals(expected, baseCalc.divide(first, second), 0.00000001);
        }
    }
}