package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class GameTTest {
    @Test
    public void checkGame() {
        int rsl = GameT.checkGame(0.2, 50, 9);
        assertThat(rsl, is(1));
    }

    @Test
    public void checkGameIs0() {
        int rsl = GameT.checkGame(0.9, 1, 2);
        assertThat(rsl, is(0));
    }
}