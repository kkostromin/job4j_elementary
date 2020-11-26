package ru.job4j.calculator;

/*
Идеальный вес для мужчин = (рост в сантиметрах – 100) · 1,15.
Идеальный вес для женщин = (рост в сантиметрах – 110) · 1,15.
Результат вычисления метода записывается в переменную double man.
Дальше эту переменную мы выводим на консоль.
 */

public class Fit {

    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 180;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height);
        System.out.println("Man 180 is " + man); // вывод идеального веса для мужчины
        System.out.println("Woman 180 is " + woman); // вывод идеального веса для женщины
    }
}
