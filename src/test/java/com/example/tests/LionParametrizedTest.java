package com.example.tests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParametrizedTest {
    boolean expected;
    String sex;
    static Feline feline;

    public LionParametrizedTest(String sex, Feline feline, boolean expected) {
        this.sex = sex;
        this.feline = feline;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "Тестовые данные, где {0} - пол животного, {1} - атрибут для создания объекта, {2} - ожидаемый результат")
    public static Object[][] getMane() {
        return new Object[][]{
                {"Самец", feline, true},
                {"Самка", feline, false},
        };
    }

    @Test
    public void doesHaveMane() throws Exception {
        Lion lion = new Lion(sex, feline);
        assertEquals(expected, lion.doesHaveMane());

    }
}
