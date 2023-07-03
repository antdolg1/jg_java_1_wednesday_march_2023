package students.edmund_zukovskis.lesson_10.level_3.task_7_8;

class Product {

    private String title;

    public Product(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
    /*
    Является ли следующий интерфейс функциональным?
    Yes, this interface is functional, since it contains only one abstract method findByTitle(),
    which returns an object of type Product for the given product title.
     */
}

