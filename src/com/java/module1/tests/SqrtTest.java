package com.java.module1.tests;

import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class SqrtTest extends Assert {

    private double value;
    private double expectedResult;

    public SqrtTest(double value, double expectedResult) {
        this.value = value;
        this.expectedResult = expectedResult;
    }

    @Parameters
    public static List<Object> getTestData() {
        return new ArrayList<>(Arrays.asList(new Object[][]{
                {100, 10},
                {121, 11},
                {144, 12},
                {169, 13},
                {196, 14},
                {225, 15},
                {256, 16},
                {289, 17},
                {324, 18},
                {361, 19},
                {400, 20}
        }));
    }

    @Test
    public void sqrtTest() {
        double result = new Calculator().sqrt(value);
        assertEquals(expectedResult, result, 0);
    }
}