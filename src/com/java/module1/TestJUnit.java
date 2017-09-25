package com.java.module1;

import com.epam.tat.module4.Calculator;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

public class TestJUnit {

    private Calculator calculator = new Calculator();

    public static void main(String[] args) {

        @Category(Unit.class)
        @Test
        public void testIsEmpty(){}

//для запуска набора тестов
//        @Suite.SuiteClasses({Subtraction.class})
//        @RunWith(Suite.class)

//        Тест с ожидаемым исключением: @Test(expected = NullPointerException.class, timeout)
    }
}
