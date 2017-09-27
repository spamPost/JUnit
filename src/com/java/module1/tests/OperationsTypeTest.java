package com.java.module1.tests;

import com.epam.tat.module4.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class OperationsTypeTest {

    private static Calculator calc = new Calculator();

    private double value;
    private double expectedResult;

    public OperationsTypeTest(double value, double expectedResult) {
        this.value = value;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static List<Object> getTestData() {
        return new ArrayList<>(Arrays.asList(new Object[][]{
                {calc.sum(10, 2), 12},
                {calc.sub(6, 0), 6},
                {calc.mult(10, 2), 20},
                {calc.mult(2.2, 2), 4.4},
                {calc.mult(5.2, 0), 0},
                {calc.div(10, 2), 5},
                {calc.cos(7), 0.9925},
                {calc.ctg(10), 5.671282}
        }));
    }

    @Test
    public void byOperationsType() {
        assertEquals(expectedResult, value, 0.001);
    }
}