package ru.job4j.condition;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class SwitchWeekTest {

    @Test
    public void nameOfDay1() {
        String rsl = SwitchWeek.nameOfDay(1);
        assertThat(rsl, is("Понедельник"));
    }

    @Test
    public void nameOfDay2() {
        String rsl = SwitchWeek.nameOfDay(2);
        assertThat(rsl, is("Вторник"));
    }

    @Test
    public void nameOfDay0() {
        String rsl = SwitchWeek.nameOfDay(0);
        assertThat(rsl, is("Ошибка"));
    }

    @Test
    public void nameOfDay10() {
        String rsl = SwitchWeek.nameOfDay(10);
        assertThat(rsl, is("Ошибка"));
    }
}