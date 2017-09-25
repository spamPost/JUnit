package com.java.module1.tests;

import com.epam.tat.module4.Calculator;
import com.java.module1.categories.MultDivTestsCategories;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(MultDivTestsCategories.class)
public class MultTest extends Assert{

    Calculator calc = new Calculator();

    @Test
    public void multByOneTest() {
        long result = calc.mult(5, 1);
        assertTrue(5 == result);
    }

    @Test
    public void multByZero() {
        long result = calc.mult(100, 0);
        assertEquals(0, result);
    }

    @Test
    public void multByItself() {
        double result = calc.mult(4.84, 3.05);
        assertTrue("result: " + result, 14.762 == result);
    }
}