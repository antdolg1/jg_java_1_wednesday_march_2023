package students.edmund_zukovskis.lesson_10.level_3.task_7_8;

interface ProductDataBase {
    void save(Product product);

    Product findByTitle(String productTitle);
}
