package ru.job4j.condition;

/**
 *
 */
public class AlertDivByZero {
    /**
     * @param args string
     */
    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
        possibleDiv(-1);
    }

    /**
     * function for alert if the number divide by zero or number less 0
     * @param number - entering value
     */

    public static void possibleDiv(int number) {
        boolean result = number == 0;
        if (result) {
            System.out.println("Could not div by 0.");
        }
        boolean result2 = number < 0;
        if (result2) {
            System.out.println("This is negative numbers");
        }
    }
}