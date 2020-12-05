package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        /*if (amount / salary < 2) {
            System.out.print("Кредит не обеспечен");
        }*/
        while (amount > 0) {
            amount = (int) (amount + amount * percent / 100 - salary);
            year++;
        }
        return year;
    }
}