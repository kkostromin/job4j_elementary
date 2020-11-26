package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean condition = left > right;
        int result = condition ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int rst1 = Max.max(3, 1);
        int rst2 = Max.max(1, 2);
        int rst3 = Max.max(8, 8);

        System.out.println(rst1);
        System.out.println(rst2);
        System.out.println(rst3);
    }
}