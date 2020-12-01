package ru.job4j.condition;

public class GameT {
    public static int checkGame(double percent, int prize, int pay) {
        int o = 0;
        if ((percent * prize) > pay) {
            o = Math.abs((int) (pay - (percent * prize)));
        } else if (pay - (percent * prize) <= 0) {
            o = 0;
        }
        return o;
    }
}