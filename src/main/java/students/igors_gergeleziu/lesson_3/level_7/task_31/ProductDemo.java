package students.igors_gergeleziu.lesson_3.level_7.task_31;

class ProductDemo {
    public static void main(String[] args) {
        Product milk= new Product("Milk");
        milk.setRegularPrice(0.80);
        milk.setDiscount(15);
        milk.printInformation();
        Product cheese=new Product("Cheese");
        cheese.setRegularPrice(1.20);
        cheese.setDiscount(20);
        cheese.printInformation();
        Product tomatoes=new Product("Tomatoes");
        tomatoes.setRegularPrice(0.75);
        tomatoes.setDiscount(10);
        tomatoes.printInformation();
    }
}
