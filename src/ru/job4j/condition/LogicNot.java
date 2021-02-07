package ru.job4j.condition;

public class LogicNot {
    /**
     * @param num - number of integer
     * @return value of boolean for the check the num is even number
     */
    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    /**
     * @param num - number of integer
     * @return value of boolean for the check the num is positive
     */
    public boolean isPositive(int num) {
        return num > 0;
    }

    /**
     * @param num - number of integer
     * @return value of boolean for the check the num is not even
     */
    public boolean notEven(int num) {
        return !isEven(num);
    }

    /**
     * @param num - number of integer
     * @return value of boolean for the check the num is not positive
     */
    public boolean notPositive(int num) {
        return !isPositive(num);
    }

    /**
     * @param num - number of integer
     * @return value of boolean for the check the num is positive and not even
     */
    public boolean notEvenAndPositive(int num) {
        return !isEven(num) && isPositive(num);
    }

    /**
     * @param num - number of integer
     * @return value of boolean for the check the num is not positive and even
     */
    public boolean evenOrNotPositive(int num) {
        return isEven(num) || !isPositive(num);
    }
}
