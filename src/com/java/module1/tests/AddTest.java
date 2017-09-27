package com.java.module1.tests;

import com.java.module1.BaseCalculatorTest;
import com.java.module1.categories.AddSubTestsCategories;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@Category(AddSubTestsCategories.class)
public class AddTest extends BaseCalculatorTest {

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

    @Test
    public void addZero() {
        long result = calc.sum(2, 0);
        assertEquals(2, result);
    }
}