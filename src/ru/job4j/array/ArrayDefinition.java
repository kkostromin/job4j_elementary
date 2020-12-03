package ru.job4j.array;

import java.sql.SQLOutput;

public class ArrayDefinition {

    public static void main(String[] args) {
        /*short[] ages = new short[10];
        String[] sernames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива равен: " + ages.length);
        System.out.println("Размер массива равен: " + sernames.length);
        System.out.println("Размер массива равен: " + prices.length);
        */
        String[] names = new String[4];

        names[0] = "Иван Петров";
        names[1] = "Иван1 Петров1";
        names[2] = "Иван2 Петров2";
        names[3] = "Иван3 Петров3";

        System.out.println("Ячейка 0: " + names[0]);
        System.out.println("Ячейка 1: " + names[1]);
        System.out.println("Ячейка 2: " + names[2]);
        System.out.println("Ячейка 3: " + names[3]);
    }
}
