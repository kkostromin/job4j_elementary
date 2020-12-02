package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MortgageTest {
    @Test
    public void when1Year() {
        int year = Mortgage.year(1000, 1200, 1);
        assertThat(year, is(1));
    }

    @Test
    public void when2Year() {
        int year = Mortgage.year(100, 120, 50);
        assertThat(year, is(2));
    }

    @Test
    public void when3Year() {
        int year = Mortgage.year(100, 80, 50);
        assertThat(year, is(3));
    }

    @Test
    public void when0Year1() {
        int year = Mortgage.year(100, 50, 50);
        assertThat(year, is(0));
    }

    @Test
    public void when0Year2() {
        int year = Mortgage.year(100, 49, 50);
        assertThat(year, is(0));
    }
}