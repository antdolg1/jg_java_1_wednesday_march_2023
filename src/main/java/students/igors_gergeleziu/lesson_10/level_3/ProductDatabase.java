package students.igors_gergeleziu.lesson_10.level_3;

public interface ProductDatabase {
    void save(Product product);

    Product findByTitle(String productTitle);
}
