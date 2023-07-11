package students.jegors_rutkovskis.lesson_12.level_5_6;

class ProductDescriptionValidationRule implements ProductValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        String desc = product.getProductDescription();

        if (isGreaterThan2000Letters(desc)) {
            throw new ValidationException("RULE-7", "Description can not be greater than 2000", "description");
        }
        if (!containsOnlyEnglishLettersAndDigits(desc)) {
            throw new ValidationException("RULE-8", "Description can only contain digits and english letters",
                    "description");
        }
    }

    private boolean isGreaterThan2000Letters(String description) {
        return description.length() > 2000;
    }
    private boolean containsOnlyEnglishLettersAndDigits(String description) {
        return description.matches("[a-zA-Z0-9\\s]+");
    }
}
