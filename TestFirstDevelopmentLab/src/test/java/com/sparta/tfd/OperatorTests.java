package com.sparta.tfd;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class OperatorTests {

    @ParameterizedTest
    @CsvSource({
            "5, 2, true",
            "2, 5, false",
            "5, 5, true"
    })
    @DisplayName("Given two numbers X and Y, greaterEqual returns whether X is greater than or equal to Y")
    public void givenTwoNumbersXY_GreaterEqual_ReturnsWhetherXIsGreaterOrEqualToY(int x, int y, boolean expResult)
    {
        Assertions.assertTrue(expResult == Methods.greaterEqual(x, y));
    }

    @ParameterizedTest
    @CsvSource({
            "-1, 1, false",
            "1, -1, true"
    })
    @DisplayName("Given two numbers X and Y, greaterEqual returns whether X is greater than or equal to Y")
    public void op_test_2(int x, int y, boolean expResult)
    {
        Assertions.assertTrue(expResult == Methods.greaterEqual(x, y));
    }

    @Test
    @DisplayName("Compare negative infinity with positive infinity, same types")
    public void op_test_3()
    {
        double d_n_inf = Double.NEGATIVE_INFINITY;
        double d_p_inf = Double.POSITIVE_INFINITY;

        Assertions.assertTrue(false == Methods.greaterEqual(d_n_inf, d_p_inf));
    }

    @Test
    @DisplayName("Compare negative infinity with positive infinity, diff types")
    public void op_test_4()
    {

        //  Seemingly float is automatically casted to double.
        float f_n_inf = Float.NEGATIVE_INFINITY;
        double d_p_inf = Double.POSITIVE_INFINITY;

        Assertions.assertTrue(false == Methods.greaterEqual(f_n_inf, d_p_inf));
    }

    @Test
    @DisplayName("Compare NaN with NaN.")
    public void op_test_5()
    {
        double nan = Double.NaN;

        Assertions.assertTrue(false == Methods.greaterEqual(nan, nan));
    }

    @ParameterizedTest
    @CsvSource({
            "0, 10.429",
            "10, 24.714"
    })
    @DisplayName("Given a number, BODMAS returns the expected result")
    public void givenNumber_BODMAS_ReturnsTheExpectedResult(int num, double expResult)
    {
        Assertions.assertEquals(expResult, Methods.BODMAS(num), 0.001);
    }

}