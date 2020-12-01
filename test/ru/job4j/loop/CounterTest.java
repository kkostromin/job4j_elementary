package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFrom3To9Then18() {
        int rsl = Counter.sumByEven(3, 9);
        int expected = 18;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFrom2To12Then36() {
        int rsl = Counter.sumByEven(2, 12);
        int expected = 42;
        assertThat(rsl, is(expected));
    }

}