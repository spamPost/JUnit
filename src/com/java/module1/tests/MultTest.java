package com.java.module1.tests;

import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;

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
}