package students.jegors_rutkovskis.lesson_3.level_7;

class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Apples");
        product.setRegularPrice(1.39);
        product.setDiscount(15);

        product.printInformation();
    }
}
