package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort5() {
        int[] input = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort3() {
        int[] input = new int[]{8, 4, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{1, 4, 8};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort7() {
        int[] input = new int[]{8, 4, 1, 8, 9, 10000, 2};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{1, 2, 4, 8, 8, 9, 10000};
        assertThat(result, is(expect));
    }
}