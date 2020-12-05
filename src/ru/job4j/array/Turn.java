package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        boolean lenMas = (array.length) % 2 == 0; //проверка на четность длины массива
        if (lenMas) {
            for (int i = 1; i < array.length - i - 1; i++) {
                temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
        } else {
            for (int i = 1; i < array.length - i - 1; i++) {
                temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
        }
        return array;
    }
}
