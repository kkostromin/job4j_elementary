package ru.job4j.condition;

import org.junit.Test;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        /*
        if (first == second && first > third) {
            result = first;
        } else if (third > first && third > second) {
            result = third;
        }
        if (first == third && first > second) {
            result = first;
        } else if (second > first && second > third) {
            result = second;
        }
        if (third == second && third > first) {
            result = third;
        } else if (first > third && first > second) {
            result = first;
        }
         */
        if (third >= first && third >= second) {
            result = third;
        }
        if (second >= first && second >= third) {
            result = second;
        }
        return result;
    }
}