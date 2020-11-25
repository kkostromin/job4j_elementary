package ru.job4j.condition;
/*
1. Вычесть аргументы x2 и x1.
2. Вычесть аргументы y2 и y1.
3. Возвести в степень 2 результат операции 1.
4. Возвести в степень 2 результат операции 2.
5. Сложить результаты операций 3 и 4.
6. Вычислить корень квадратный из результата операции 5.
 */
public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(0, 0, 4, 7);

        System.out.println("result (0, 0) to (2, 0) " + result1);
        System.out.println("result (0, 0) to (2, 0) " + result2);
    }
}