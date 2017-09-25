package com.java.module1.tests;

import com.epam.tat.module4.Calculator;
import com.java.module1.categories.MultDivTestsCategories;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(MultDivTestsCategories.class)
public class DivTest extends Assert{
    Calculator calc = new Calculator();

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
    public void divByZero() {
        calc.div(10, 0);
    }
}