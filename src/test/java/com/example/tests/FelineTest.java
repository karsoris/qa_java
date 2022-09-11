package com.example.tests;

import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void getFamilyShouldReturnFeline() {

        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals("Некорректный результат вызова метода", expected, actual);
        System.out.println("Ожидаемый результат равен: " + expected);
        System.out.println("Фактический результат равен: " + actual);
    }

    @Test
    public void getKittensWithoutParameter() {

        int expected = 1;
        int actual = feline.getKittens();
        assertEquals("Получено некорректное значение", expected, actual);
        System.out.println("Ожидаемый результат равен: " + expected);
        System.out.println("Фактический результат равен: " + actual);
    }

    @Test
    public void getKittensWithParameter() {

        int expected = 12;
        int actual = feline.getKittens(12);
        assertEquals("Получено некорректное значение", expected, actual);
        System.out.println("Ожидаемый результат равен: " + expected);
        System.out.println("Фактический результат равен: " + actual);
    }

    @Test
    public void eatMeatShouldReturnPredatorFood() throws Exception {

        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        assertEquals("Некорректный результат вызова метода", expected, actual);
        System.out.println("Ожидаемый результат равен: " + expected);
        System.out.println("Фактический результат равен: " + actual);
    }

    @Test
    public void getFoodWhenReturnPredatorFood() throws Exception {

        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.getFood("Хищник");
        assertEquals("Получен некорректный список", expected, actual);
        System.out.println("Ожидаемый результат равен: " + expected);
        System.out.println("Фактический результат равен: " + actual);
    }

    @Test
    public void getFoodWhenReturnVeganFood() throws Exception {

        List<String> expected = List.of("Трава", "Различные растения");
        List<String> actual = feline.getFood("Травоядное");
        assertEquals("Получен некорректный список", expected, actual);
        System.out.println("Ожидаемый результат равен: " + expected);
        System.out.println("Фактический результат равен: " + actual);
    }
}

