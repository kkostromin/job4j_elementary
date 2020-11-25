package ru.job4j;

public class ArgMethod {
    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        String name = "Petr_Arsentev";
        //int age = 33;

        //ArgMethod.hello();

        //ArgMethod.hello(name, age);

        ArgMethod.hello(name);

        //ArgMethod.hello(name, name, name);
    }
}
