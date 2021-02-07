package ru.job4j.calculator;

/**
 * Class Fit with method <b>manWeight</b> и <b>womanWeight</b>.
 *
 * @author Konstantin Kostromin
 * @version 1.1
 */
@SuppressWarnings("checkstyle:EmptyLineSeparator")
public class Fit {

    /**
     * Function calculate the ideal weight of man
     *
     * @param height - height of man
     * @return return ideal weight of man = (height in centimeters – 100) · 1,15.
     */

    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    /**
     * Function calculate the ideal weight of woman
     *
     * @param height - height of woman
     * @return return ideal weight of woman = (height in centimeters – 110) · 1,15.
     */

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    /**
     * Enter value and out calculate value on console
     *
     * @param args
     * @see Fit#manWeight(short)
     * @see Fit#womanWeight(short)
     */

    public static void main(String[] args) {
        short height = 180;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height);
        System.out.println("Man 180 is " + man); // вывод идеального веса для мужчины
        System.out.println("Woman 180 is " + woman); // вывод идеального веса для женщины
    }
}
