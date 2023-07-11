package students.jegors_rutkovskis.lesson_12.level_5_6;

import java.util.ArrayList;
import java.util.List;

class ProductValidatorImpl implements ProductValidator {
    private List<ProductValidationRule> validationRules = new ArrayList<>();

    public ProductValidatorImpl(ProductTitleValidationRule titleValidationRule,
                                ProductPriceValidationRule priceValidationRule,
                                ProductDescriptionValidationRule descriptionValidationRule) {
        validationRules.add(titleValidationRule);
        validationRules.add(priceValidationRule);
        validationRules.add(descriptionValidationRule);
    }

    @Override
    public List<ValidationException> validate(Product product) {
        List<ValidationException> exceptions = new ArrayList<>();
        for (ProductValidationRule validationRule : validationRules) {
            try {
                validationRule.validate(product);
            } catch (ValidationException e) {
                exceptions.add(e);
            }
        }
        return exceptions;
    }


//    private ProductTitleValidationRule titleValidationRule;
//    private ProductPriceValidationRule priceValidationRule;
//    private ProductDescriptionValidationRule descriptionValidationRule;
//
//    public ProductValidatorImpl(ProductTitleValidationRule titleValidationRule,
//                                ProductPriceValidationRule priceValidationRule,
//                                ProductDescriptionValidationRule descriptionValidationRule) {
//        this.titleValidationRule = titleValidationRule;
//        this.priceValidationRule = priceValidationRule;
//        this.descriptionValidationRule = descriptionValidationRule;
//    }
//
//    @Override
//    public List<ValidationException> validate(Product product) {
//        List<ValidationException> exceptions = new ArrayList<>();
//        try {
//            titleValidationRule.validate(product);
//        } catch (ValidationException e) {
//            exceptions.add(e);
//        }
//        try {
//            priceValidationRule.validate(product);
//        } catch (ValidationException e) {
//            exceptions.add(e);
//        }
//        try {
//            descriptionValidationRule.validate(product);
//        } catch (ValidationException e) {
//            exceptions.add(e);
//        }
//
//        return exceptions;
//    }
}
