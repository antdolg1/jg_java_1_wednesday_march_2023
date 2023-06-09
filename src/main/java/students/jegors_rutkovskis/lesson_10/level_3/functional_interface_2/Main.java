package students.jegors_rutkovskis.lesson_10.level_3.functional_interface_2;

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
    private static void print(Product[] products, Iface iface) {
        for (Product product : products) {
            if (iface.test(product)) {
                System.out.println(product.getTitle());
            }
        }
    }
}
