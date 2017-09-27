package com.java.module1.tests;

import com.java.module1.BaseCalculatorTest;
import com.java.module1.categories.MultDivTestsCategories;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@Category(MultDivTestsCategories.class)
public class MultTest extends BaseCalculatorTest{

    @Test
    public void multByOne() {
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
        double result = calc.mult(4, 4);
        assertTrue(16 == result);
    }

    @Test
    public void multDoubles() {
        double result = calc.mult(4.84, 3.05);
        assertTrue(14.762 == result);
    }
}