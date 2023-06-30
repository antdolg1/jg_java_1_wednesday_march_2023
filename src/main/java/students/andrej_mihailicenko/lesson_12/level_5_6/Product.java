package students.andrej_mihailicenko.lesson_12.level_5_6;

import java.util.Objects;

class Product {

    private String title;
    private Integer price;
    private String description;

    public Product(Integer price, String title, String description) {
        this.price = price;
        this.title = title;
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setProductPrice(Integer productPrice) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + title + '\'' +
                ", productPrice=" + price +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(title, product.title) && Objects.equals(price, product.price) && Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, description);
    }
}
