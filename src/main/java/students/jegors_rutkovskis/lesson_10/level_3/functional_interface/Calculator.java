package students.jegors_rutkovskis.lesson_10.level_3.functional_interface;

/**
 * Функциональный интерфейс - это интерфейс,
 * который содержит только 1 абстрактный метод
 */
@FunctionalInterface
interface Calculator {
    double calculate(int a, int b);
}
