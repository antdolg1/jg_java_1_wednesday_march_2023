package students.jegors_rutkovskis.lesson_3.level_7;

import java.text.DecimalFormat;

class Product {
    private String productName;
    private double regularPrice;
    private double discount;

    public Product(String productName) {
        this.productName = productName;
    }

    private double actualPrice(){
        double discountedPrice =
                (regularPrice * discount) / 100;
        return regularPrice - discountedPrice;
    }
    void printInformation(){
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Product: " + productName);
        System.out.println("Regular price is " + regularPrice);
        System.out.println("Discount is " + discount);
        System.out.println("Actual price is " + df.format(actualPrice()));
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
