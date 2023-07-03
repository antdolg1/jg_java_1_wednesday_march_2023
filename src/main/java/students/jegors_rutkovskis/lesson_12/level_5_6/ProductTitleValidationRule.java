package students.jegors_rutkovskis.lesson_12.level_5_6;

class ProductTitleValidationRule implements ProductValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {
        String title = product.getProductTitle();

        if (isNullOrEmpty(title)) {
            throw new ValidationException("RULE-1", "Title can not be empty", "title");
        }
        if (isLessThan3Symbols(title)) {
            throw new ValidationException("RULE-2", "Title can not be less than 3 symbols", "title");
        }
        if (isGreaterThan100Symbols(title)) {
            throw new ValidationException("RULE-3", "Title can not be greater than 100 symbols", "title");
        }
        if (!containsOnlyEnglishLettersAndDigits(title)) {
            throw new ValidationException("RULE-4", "Title should contain only english letters and digits", "title");
        }
    }

    private boolean isNullOrEmpty(String title) {
        return title == null || title.isBlank();
    }
    private boolean isLessThan3Symbols(String title) {
        return title.length() < 3;
    }
    private boolean isGreaterThan100Symbols(String title) {
        return title.length() > 100;
    }
    private boolean containsOnlyEnglishLettersAndDigits(String title) {
        return title.matches("[a-zA-Z0-9\\s]+");
    }

}
