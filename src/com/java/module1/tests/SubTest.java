package com.java.module1.tests;

import com.epam.tat.module4.Calculator;
import com.java.module1.categories.AddSubTestsCategories;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(AddSubTestsCategories.class)
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

    @Test
    public void subLargestValue() {
        long result = calc.sub(3, 8);
        assertEquals(-5, result);
    }

    @Test
    public void subZero() {
        long result = calc.sub(9, 0);
        assertEquals(9, result);
    }
}