package students.igors_gergeleziu.lesson_10.level_3;

import java.util.Arrays;

class InMemoryDatabase implements ProductDatabase {
    Product[] products= {new Product("Milk"), new Product("Bread"), new Product("Cheese")};

    @Override
    public void save(Product product) {
        Product[] newProducts = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            newProducts[i] = products[i];
        }
        newProducts[newProducts.length - 1] = new Product(product.getTitle());
        System.out.println("Recently saved product: " + product.getTitle());
        printArray(newProducts);
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product product : products) {
            if (productTitle.equals(product.getTitle())) {
                return product;
            }
        }
        return null;
    }
    void printArray(Product[] products){
        for (Product product : products){
            System.out.print(product.getTitle()+" ");
        }
        System.out.println();
    }
}
