package students.edmund_zukovskis.lesson_10.level_3.task_10;

import java.util.Optional;

interface ProductDatabase {
    void save(Product product);

    Optional<Product> findTitle(String productTitle);
}
