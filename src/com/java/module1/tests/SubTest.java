package com.java.module1.tests;

import com.java.module1.BaseCalculatorTest;
import com.java.module1.categories.AddSubTestsCategories;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

@Category(AddSubTestsCategories.class)
public class SubTest extends BaseCalculatorTest {

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