package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(120);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("120 rubles are " + dollar + " dollar."); /* вывод перевода рублей в доллары.*/

        int in = 140;
        int in2 = 120;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        int out2 = Converter.rubleToDollar(in2);
        boolean passed = out == expected;
        boolean passed2 = out2 == expected;
        System.out.println("140 rubles are 2. Test result : " + passed);
        System.out.println("120 rubles are 2. Test result : " + passed2);

    }
}
