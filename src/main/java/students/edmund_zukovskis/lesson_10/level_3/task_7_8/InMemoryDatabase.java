package students.edmund_zukovskis.lesson_10.level_3.task_7_8;

import java.util.Arrays;

class InMemoryDatabase implements ProductDataBase {

    private Product[] products;

    public InMemoryDatabase() {
        products = new Product[0];
    }

    @Override
    public void save(Product product) {
        int oldLength = products.length;
        Product[] newProducts = Arrays.copyOf(products, oldLength + 1);
        newProducts[oldLength] = product;

        products = newProducts;
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product product : products) {
            if (product.getTitle().equals(productTitle)) {
                return product;
            }
        }

        return null;
    }
}
