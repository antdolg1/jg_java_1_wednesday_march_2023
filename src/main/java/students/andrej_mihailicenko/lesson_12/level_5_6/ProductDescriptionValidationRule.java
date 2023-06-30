package students.andrej_mihailicenko.lesson_12.level_5_6;

class ProductDescriptionValidationRule implements FieldValidationRule {

    public void validate(Product product) throws ValidationException {

        String description = product.getDescription();

        if (description.length() > 2000) {
            throw new ValidationException("RULE-8",
                    "Product description cannot exceed 2000 characters",
                    "Product Description");
        }

        if (!description.matches("[a-zA-Z0-9]+")) {
            throw new ValidationException("RULE-9",
                    "Product description must contain only English letters and digits",
                    "Product Description");
        }

    }

}
