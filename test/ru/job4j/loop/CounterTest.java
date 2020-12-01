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
    public void whenSumEvenNumbersFrom2To5Then6() {
        int rsl = Counter.sumByEven(2, 5);
        int expected = 6;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFrom5To10Then24() {
        int rsl = Counter.sumByEven(5, 10);
        int expected = 24;
        assertThat(rsl, is(expected));
    }
}