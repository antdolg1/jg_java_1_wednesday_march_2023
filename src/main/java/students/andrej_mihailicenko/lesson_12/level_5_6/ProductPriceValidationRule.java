package students.andrej_mihailicenko.lesson_12.level_5_6;

class ProductPriceValidationRule implements FieldValidationRule {

    public void validate(Product product) throws ValidationException {

        Integer price = product.getPrice();

        if (price == null) {
            throw new ValidationException("RULE-5",
                    "Product price must not be null",
                    "Product Price");
        }

        if (price <= 0) {
            throw new ValidationException("RULE-6",
                    "Product price must be greater than 0",
                    "Product Price");
        }

    }

}
