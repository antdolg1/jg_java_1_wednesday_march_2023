package students.jegors_rutkovskis.lesson_10.level_3.task_8_10;

import java.util.Optional;

interface ProductDatabase {
    void save(Product product);

    Optional<Product> findByTitle(String productTitle);
}
