package students.jegors_rutkovskis.lesson_12.level_5_6;

import java.math.BigDecimal;

class ProductPriceValidationRule implements ProductValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        BigDecimal price = product.getProductPrice();

        if (isNull(price)) {
            throw new ValidationException("RULE-5", "Price can not be empty", "price");
        }
        if (!isGreaterThanZero(price)) {
                throw new ValidationException("RULE-6", "Price can not be less than 0", "price");
        }
    }

    private boolean isNull(BigDecimal price) {
        return price == null;
    }
    private boolean isGreaterThanZero(BigDecimal price) {
        return price.compareTo(BigDecimal.ZERO) > 0;
    }
}
