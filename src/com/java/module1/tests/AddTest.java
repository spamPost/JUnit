package com.java.module1.tests;

import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class AddTest extends Assert {
    Calculator calc = new Calculator();

    @Test
    public void addOne() {
        long result = calc.sum(6, 1);
        assertTrue(7 == result);
    }

    @Test
    public void addItself() {
        long result = calc.sum(5, 5);
        assertEquals(10, result);
    }
}
