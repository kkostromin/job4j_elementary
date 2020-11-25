package ru.job4j.calculate;

import org.junit.Test;

import org.junit.Assert;

import static ru.job4j.calculate.X2.calc;

public class X2Test {

    @Test
    public void whenA10B9C0X2Then40() {
        /* Входные параметры. Их будет 4 штуки */
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        /* ожидаемое значение. Это всегда одна переменная. */
        int expected = 40;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */

        int rsl = calc(a, b, c, x);
        /* сравнение полученного значения с ожидаемым */
        Assert.assertEquals(expected, rsl);
    }

    // - a = 1, b = 1, c = 1, x = 1.
    // a * x * x + b * x + c
    @Test
    public void whenA1B1C1X1Then3() {
        /* Входные параметры. Их будет 4 штуки */
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        /* ожидаемое значение. Это всегда одна переменная. */
        int expected = 3;
        int rsl = calc(a, b, c, x);
        /* сравнение полученного значения с ожидаемым */
        Assert.assertEquals(expected, rsl);
    }

    // a = 0, b = 1, c = 1, x = 1
    // a * x * x + b * x + c
    @Test
    public void whenA0B1C1X1Then2() {
        /* Входные параметры. Их будет 4 штуки */
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        /* ожидаемое значение. Это всегда одна переменная. */
        int expected = 2;
        int rsl = calc(a, b, c, x);
        /* сравнение полученного значения с ожидаемым */
        Assert.assertEquals(expected, rsl);
    }

    // a = 1, b = 1, c = 0, x = 1
    // a * x * x + b * x + c
    @Test
    public void whenA1B1C0X1Then2() {
        /* Входные параметры. Их будет 4 штуки */
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        /* ожидаемое значение. Это всегда одна переменная. */
        int expected = 2;
        int rsl = calc(a, b, c, x);
        /* сравнение полученного значения с ожидаемым */
        Assert.assertEquals(expected, rsl);
    }

    //a = 1, b = 1, c = 1, x = 0
    // a * x * x + b * x + c
    @Test
    public void whenA1B1C0X0Then1() {
        /* Входные параметры. Их будет 4 штуки */
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        /* ожидаемое значение. Это всегда одна переменная. */
        int expected = 1;
        int rsl = calc(a, b, c, x);
        /* сравнение полученного значения с ожидаемым */
        Assert.assertEquals(expected, rsl);
    }
}