package students.jegors_rutkovskis.lesson_10.level_3.task_8_10;

import java.util.Optional;

class InMemoryDatabase implements ProductDatabase {
    private Product[] products;
    private int size = 0;
    InMemoryDatabase() {
        this.products = new Product[size];
    }
    @Override
    public void save(Product product) {
        this.size++;
        Product[] temp = new Product[size];
        System.arraycopy(products, 0, temp, 0, products.length);
        temp[size - 1] = product;
        this.products = temp;
    }

    @Override
    public Optional<Product> findByTitle(String productTitle) {
        for (Product product : products) {
            if (product.getTitle().equalsIgnoreCase(productTitle)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }
    Product[] getProducts() {
        return products;
    }
}
