package ru.job4j.array;

public class ArrayLoop {

    public static void main(String[] args) {
        int[] nambers = new int[5];
        for (int i = 0; i < nambers.length; i++) {
            nambers[i] = i * 2 + 3;
        }
        for (int namber : nambers) {
            System.out.println(namber);
        }
    }
}
