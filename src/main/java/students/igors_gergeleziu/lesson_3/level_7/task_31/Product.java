package students.igors_gergeleziu.lesson_3.level_7.task_31;

class Product {
    String name;
    double regularPrice;
    double discount;

    Product(String name) {
        this.name = name;
    }

    void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    void setDiscount(double discount) {
        this.discount = discount;
    }

    double actualPrice() {
        return regularPrice - (regularPrice * (discount * 0.01));
    }

    void printInformation() {
        System.out.println("Product: name= \"" + name + "\", " + "regular price= " + regularPrice + " EUR, discount= " + (int) discount + "%, actual price= " + actualPrice() + " EUR");

    }
}
