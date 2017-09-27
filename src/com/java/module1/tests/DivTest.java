package com.java.module1.tests;

import com.java.module1.BaseCalculatorTest;
import com.java.module1.categories.MultDivTestsCategories;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@Category(MultDivTestsCategories.class)
public class DivTest extends BaseCalculatorTest{

    @Test
    public void divByItself() {
        long result = calc.div(4, 4);
        assertEquals(1, result);
    }

    @Test
    public void divByOne() {
        long result = calc.div(10, 1);
        assertTrue(10 == result);
    }

    @Test(expected = ArithmeticException.class)
    public void divLongByZero() {
        calc.div(10, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void divDoubleByZero() {
        calc.div(2.4, 0);
    }
}