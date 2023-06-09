package students.jegors_rutkovskis.lesson_10.level_3.task_7;

/**
 * Данный интерфейс не является функциональным,
 * потому что имеет более 1 абстрактного метода
 */
interface ProductDatabase {
    void save(Product product);

    Product findByTitle(String productTitle);
}
