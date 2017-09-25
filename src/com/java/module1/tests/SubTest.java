package com.java.module1.tests;

import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class SubTest extends Assert {
    Calculator calc = new Calculator();

    @Test
    public void subOne() {
        long result = calc.sub(3, 1);
        assertEquals(2, result);
    }

    @Test
    public void subItself() {
        long result = calc.sub(4, 4);
        assertEquals(0, result);
    }
}
