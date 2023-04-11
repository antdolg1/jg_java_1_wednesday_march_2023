package students.edmund_zukovskis.lesson_3.level_7.task_31;

import java.text.DecimalFormat;

class Product {

    private String productName;
    private double regularPrice;
    private double discount;

    public Product (String productName) {
        this.productName = productName;
    }

    private double actualPrice() {
        double discountedPrice = (regularPrice * discount) / 100;
        return regularPrice - discountedPrice;
        }
    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
        }
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    void printAllInformation() {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        System.out.println("Product " + productName);
        System.out.println("Regular price is " + regularPrice);
        System.out.println("Discount is " + discount);
        System.out.println("Actual price is " + decimalFormat.format(actualPrice()));

    }
    }


