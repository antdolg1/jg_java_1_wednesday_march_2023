package students.pavels_serikovs.lesson_3.level_7.task_31;

public class ProductDemo {
    public static void main(String[] args) {
        Product myProduct = new Product("Anorak", 199, 30);
        String productName = myProduct.name;
        double productDiscount = myProduct.discount;
        double price = myProduct.regularPrice;
        double actualPrice = myProduct.actualPrice();
        myProduct.printInformation();
        System.out.println(productName + "'s " + " regular price is " + price + ". " + "Price with discount " + productDiscount + " % = " + actualPrice);
    }
}
