package com.calc.base;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import static org.junit.Assert.assertEquals;

@RunWith(Suite.class)
@Suite.SuiteClasses({BaseCalcTest.Sum.class, BaseCalcTest.Subtract.class, BaseCalcTest.Multiply.class, BaseCalcTest.Divide.class})
public class BaseCalcTest {
    public static BaseCalc baseCalc = new BaseCalc();
    private static final double DELTA = 0.00000000000000001;

    public static class Sum {
        @Test
        public void shouldGetCorrectResultForSumOperationWithSmallPositiveNumbers() {
            int actual = baseCalc.sum(2, 3);
            int expected = 5;
            assertEquals(expected, actual);
        }

        @Test
        public void shouldGetCorrectResultForSumOperationWithLargePositiveNumbers() {
            int actual = baseCalc.sum(154_125_136, 1_554_453_223);
            int expected = 1_708_578_359;
            assertEquals(expected, actual);
        }

        @Test
        public void shouldGetCorrectResultForSumOperationWithSmallNegativeNumbers() {
            int actual = baseCalc.sum(-1, -9);
            int expected = -10;
            assertEquals(expected, actual);
        }

        @Test
        public void shouldGetCorrectResultForSumOperationWithLargeNegativeNumbers() {
            int actual = baseCalc.sum(-455_465_991, -1_554_453_223);
            int expected = -2_009_919_214;
            assertEquals(expected, actual);
        }

        @Test
        public void shouldGetCorrectResultForSumOperationWithSmallMixedNumbers() {
            int actual = baseCalc.sum(7, -10);
            int expected = -3;
            assertEquals(expected, actual);
        }

        @Test
        public void shouldGetCorrectResultForSumOperationWithLargeMixedNumbers() {
            int actual = baseCalc.sum(-982_933_974, 350_760_112);
            int expected = -632_173_862;
            assertEquals(expected, actual);
        }

        @Test
        public void shouldGetCorrectResultForSumOperationForTwoZeroes() {
            int actual = baseCalc.sum(0, 0);
            int expected = 0;
            assertEquals(expected, actual);
        }

        @Test
        public void shouldGetCorrectResultForSumOperationWithZeroAsFirstArg() {
            int actual = baseCalc.sum(0, 520);
            int expected = 520;
            assertEquals(expected, actual);
        }

        @Test
        public void shouldGetCorrectResultForSumOperationWithZeroAsSecondArg() {
            int actual = baseCalc.sum(998, 0);
            int expected = 998;
            assertEquals(expected, actual);
        }
    }

    public static class Subtract {
        @Test
        public void shouldGetCorrectResultForSubtractOperationWithSmallPositiveNumbers() {
            int actual = baseCalc.subtract(2, 3);
            int expected = -1;
            assertEquals(expected, actual);
        }

        @Test
        public void shouldGetCorrectResultForSubtractOperationWithLargePositiveNumbers() {
            int actual = baseCalc.subtract(154_125_136, 1_554_453_223);
            int expected = -1_400_328_087;
            assertEquals(expected, actual);
        }

        @Test
        public void shouldGetCorrectResultForSubtractOperationWithSmallNegativeNumbers() {
            int actual = baseCalc.subtract(-1, -9);
            int expected = 8;
            assertEquals(expected, actual);
        }

        @Test
        public void shouldGetCorrectResultForSubtractOperationWithLargeNegativeNumbers() {
            int actual = baseCalc.subtract(-455_465_991, -1_554_453_223);
            int expected = 1_098_987_232;
            assertEquals(expected, actual);
        }

        @Test
        public void shouldGetCorrectResultForSubtractOperationWithSmallMixedNumbers() {
            int actual = baseCalc.subtract(7, -10);
            int expected = 17;
            assertEquals(expected, actual);
        }

        @Test
        public void shouldGetCorrectResultForSubtractOperationWithLargeMixedNumbers() {
            int actual = baseCalc.subtract(-982_933_974, 350_760_112);
            int expected = -1_333_694_086;
            assertEquals(expected, actual);
        }

        @Test
        public void shouldGetCorrectResultForSubtractOperationForTwoZeroes() {
            int actual = baseCalc.subtract(0, 0);
            int expected = 0;
            assertEquals(expected, actual);
        }

        @Test
        public void shouldGetCorrectResultForSubtractOperationWithZeroAsFirstArg() {
            int actual = baseCalc.subtract(0, 520);
            int expected = -520;
            assertEquals(expected, actual);
        }

        @Test
        public void shouldGetCorrectResultForSubtractOperationWithZeroAsSecondArg() {
            int actual = baseCalc.subtract(998, 0);
            int expected = 998;
            assertEquals(expected, actual);
        }
    }

    public static class Multiply {
        @Test
        public void shouldGetCorrectResultForMultiplyOperationWithSmallPositiveNumbers() {
            int actual = baseCalc.multiply(2, 3);
            int expected = 6;
            assertEquals(expected, actual);
        }

        @Test
        public void shouldGetCorrectResultForMultiplyOperationWithLargePositiveNumbers() {
            int actual = baseCalc.multiply(154_125, 1_554);
            int expected = 239_510_250;
            assertEquals(expected, actual);
        }

        @Test
        public void shouldGetCorrectResultForMultiplyOperationWithSmallNegativeNumbers() {
            int actual = baseCalc.multiply(-1, -9);
            int expected = 9;
            assertEquals(expected, actual);
        }

        @Test
        public void shouldGetCorrectResultForMultiplyOperationWithLargeNegativeNumbers() {
            int actual = baseCalc.multiply(-455_465, -1_554);
            int expected = 707_792_610;
            assertEquals(expected, actual);
        }

        @Test
        public void shouldGetCorrectResultForMultiplyOperationWithSmallMixedNumbers() {
            int actual = baseCalc.multiply(7, -10);
            int expected = -70;
            assertEquals(expected, actual);
        }

        @Test
        public void shouldGetCorrectResultForMultiplyOperationWithLargeMixedNumbers() {
            int actual = baseCalc.multiply(-90000, 3000);
            int expected = -270_000_000;
            assertEquals(expected, actual);
        }

        @Test
        public void shouldGetCorrectResultForMultiplyOperationForTwoZeroes() {
            int actual = baseCalc.multiply(0, 0);
            int expected = 0;
            assertEquals(expected, actual);
        }

        @Test
        public void shouldGetCorrectResultForMultiplyOperationWithZeroAsFirstArg() {
            int actual = baseCalc.multiply(0, 520);
            int expected = 0;
            assertEquals(expected, actual);
        }

        @Test
        public void shouldGetCorrectResultForMultiplyOperationWithZeroAsSecondArg() {
            int actual = baseCalc.multiply(998, 0);
            int expected = 0;
            assertEquals(expected, actual);
        }
    }

    public static class Divide {
        @Test
        public void shouldGetCorrectResultForDivideOperationWithSmallPositiveNumbers() {
            double actual = baseCalc.divide(5, 2);
            double expected = 2.5;
            assertEquals(expected, actual, BaseCalcTest.DELTA);
        }

        @Test
        public void shouldGetCorrectResultForDivideOperationWithLargePositiveNumbers() {
            double actual = baseCalc.divide(154_125_136, 1_554_453_223);
            double expected = 0.0991507069621226;
            assertEquals(expected, actual, BaseCalcTest.DELTA);
        }

        @Test
        public void shouldGetCorrectResultForDivideOperationWithSmallNegativeNumbers() {
            double actual = baseCalc.divide(-1, -9);
            double expected = 0.1111111111111111;
            assertEquals(expected, actual, BaseCalcTest.DELTA);
        }

        @Test
        public void shouldGetCorrectResultForDivideOperationWithLargeNegativeNumbers() {
            double actual = baseCalc.divide(-455_465_991, -1_554_453_223);
            double expected = 0.293007202957821;
            assertEquals(expected, actual, BaseCalcTest.DELTA);
        }

        @Test
        public void shouldGetCorrectResultForDivideOperationWithSmallMixedNumbers() {
            double actual = baseCalc.divide(7, -10);
            double expected = -0.7;
            assertEquals(expected, actual, BaseCalcTest.DELTA);
        }

        @Test
        public void shouldGetCorrectResultForDivideOperationWithLargeMixedNumbers() {
            double actual = baseCalc.divide(-982_933_974, 350_760_112);
            double expected = -2.802296898570953;
            assertEquals(expected, actual, BaseCalcTest.DELTA);
        }

        @Test
        public void shouldGetCorrectResultForDivideOperationWithZeroAsFirstArg() {
            double actual = baseCalc.divide(0, 5);
            double expected = 0;
            assertEquals(expected, actual, BaseCalcTest.DELTA);
        }

        @Rule
        public final ExpectedException expectedEx = ExpectedException.none();

        @Test
        public void testArithmeticException() {
            expectedEx.expect(ArithmeticException.class);
            expectedEx.expectMessage("Divide by Zero");
            baseCalc.divide(5, 0);
        }
    }
}