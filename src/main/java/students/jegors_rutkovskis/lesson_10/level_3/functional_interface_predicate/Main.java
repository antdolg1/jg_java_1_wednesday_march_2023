package students.jegors_rutkovskis.lesson_10.level_3.functional_interface_predicate;
import java.util.function.Predicate;
class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product("Apples"),
                new Product("Shoes"),
                new Product("Pineapples"),
                new Product("Coca-cola"),
                new Product("Antiperspirant")
        };

        print(products, product -> product.startsWith("A"));
    }
    private static void print(Product[] products, Predicate<Product> product) {
        for (Product p : products) {
            if (product.test(p)) {
                System.out.println(p.getTitle());
            }
        }
    }
}
