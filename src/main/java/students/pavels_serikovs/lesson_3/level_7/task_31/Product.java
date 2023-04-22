package students.pavels_serikovs.lesson_3.level_7.task_31;

public class Product {
    String name;
    double regularPrice;
    double discount;

    public Product(String name, double regularPrice, double discount) {
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }

    double actualPrice() {
        return regularPrice * 0.01 * (100 - discount);
    }

    void printInformation() {
        System.out.println("The actual anorak's price is " + actualPrice());
    }
}
