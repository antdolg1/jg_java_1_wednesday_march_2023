package students.andrej_mihailicenko.lesson_10.level_3;

import students.andrej_mihailicenko.lesson_10.level_1.MyList;

import java.util.ArrayList;
import java.util.Optional;

class InMemoryDatabase implements ProductDatabase {
    private ArrayList<Product> products;

    public InMemoryDatabase() {
        this.products = new ArrayList<>();
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public Optional <Product> findByTitle(String productTitle) {
        for (Product product : products) {
            if (product.getTitle().equals(productTitle)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}
