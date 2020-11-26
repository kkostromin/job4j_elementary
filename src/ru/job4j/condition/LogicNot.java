package ru.job4j.condition;

/*
- метод notEven(), проверяет, что число нечетное
- метод notPositive(), проверяет, что число не положительное
- метод notEvenAndPositive(), проверяет, что число нечетное и положительное
- метод evenOrNotPositive(), проверяет, что число четное или не положительное
 */
public class LogicNot {
    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public boolean isPositive(int num) {
        return num > 0;
    }

    public boolean notEven(int num) {
        return !isEven(num);
    }

    public boolean notPositive(int num) {
        return !isPositive(num);
    }

    public boolean notEvenAndPositive(int num) {
        return !isEven(num) && isPositive(num);
    }

    public boolean evenOrNotPositive(int num) {
        return isEven(num) || !isPositive(num);
    }
}
