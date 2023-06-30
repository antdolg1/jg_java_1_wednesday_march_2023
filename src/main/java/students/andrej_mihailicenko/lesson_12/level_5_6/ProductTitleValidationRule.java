package students.andrej_mihailicenko.lesson_12.level_5_6;

class ProductTitleValidationRule implements FieldValidationRule {

    public void validate(Product product) throws ValidationException {

        String title = product.getTitle();

        if (title.isEmpty()) {
            throw new ValidationException("RULE-1", "Product title must not be empty", "Product Name");
        }

        if (title.length() < 3) {
            throw new ValidationException("RULE-2", "Product title must be at least 3 characters long", "Product Name");
        }

        if (title.length() > 100) {
            throw new ValidationException("RULE-3", "Product title cannot exceed 100 characters", "Product Name");
        }

        if (!title.matches("[a-zA-Z0-9]+")) {
            throw new ValidationException("RULE-4", "Product title must contain only English letters and digits", "Product Name");
        }
    }

}
