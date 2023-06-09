package students.jegors_rutkovskis.lesson_10.level_3.functional_interface_2;

class Product {
    private String title;
    Product(String title) {
        this.title = title;
    }
    boolean startsWith(String text) {
        return title.startsWith(text);
    }
    String getTitle() {
        return title;
    }
}
