package students.andrej_mihailicenko.lesson_10.level_3;

import java.util.Optional;

interface ProductDatabase {

    void save(Product product);

    Optional<Product> findByTitle(String productTitle);
// У functional interface может быть только один метод!
}
