package ru.job4j.condition;

/**
 * Нужно проверить, что ab + ac > bc и ac + bc > ab и ab + bc > ac - в этом случае треугольник существует.
 */
public class Triangle {

    /**
     * @param ab - длина сторны АБ
     * @param ac - длина стороны АС
     * @param bc - длина стороны БС
     * @return boolean value if triange exist
     */
    public static boolean exist(double ab, double ac, double bc) {
        return (ab + ac > bc) && (ac + bc > ab) && (ab + bc > ac);
    }
}
