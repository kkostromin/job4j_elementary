package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void numberOfDay1() {
        int rsl = MultipleSwitchWeek.numberOfDay("Понедельник");
        assertThat(rsl, is(1));
    }

    @Test
    public void numberOfDay6() {
        int rsl = MultipleSwitchWeek.numberOfDay("Saturday");
        assertThat(rsl, is(6));
    }
}