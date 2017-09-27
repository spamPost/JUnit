package com.java.module1;

import com.epam.tat.module4.Calculator;
import org.junit.BeforeClass;

public class BaseCalculatorTest {

    protected static Calculator calc;

    @BeforeClass
    public static void init() {
        calc = new Calculator();
    }
}