package students.jegors_rutkovskis.lesson_12.level_5_6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * К названию продукта выдвигаются следующие требования:
 * - RULE-1: не должно быть пустым
 * - RULE-2: не должно быть короче 3 символов
 * - RULE-3: не должно быть длиннее 100 символов
 * - RULE-4: должно содержать только английские буквы и цифры, другие символы не допустимы
 * К цене продукта выдвигаются следующие требования:
 * - RULE-5: не должна быть пустой
 * - RULE-6: должна быть больше 0
 * К описанию продукта выдвигаются следующие требования:
 * - RULE-7: не должно быть длиннее 2000 символов
 * - RULE-8: должно содержать только английские буквы и цифры, другие символы не допустимы
 */

class ProductValidatorImplTest {
    private ProductValidator validator;
    private ProductTitleValidationRule titleValidationRule;
    private ProductPriceValidationRule priceValidationRule;
    private ProductDescriptionValidationRule descriptionValidationRule;
    private List<ValidationException> exceptions;
    private Product product;

    @BeforeEach
    void setUp() {
        titleValidationRule = new ProductTitleValidationRule();
        priceValidationRule = new ProductPriceValidationRule();
        descriptionValidationRule = new ProductDescriptionValidationRule();
        validator = new ProductValidatorImpl(titleValidationRule, priceValidationRule,
                descriptionValidationRule);
    }

    @Test
    void productTitleShouldNotBeEmpty_v1() {
        product = new Product(null, new BigDecimal(1), "product description");
        exceptions = validator.validate(product);

        assertEquals(1, exceptions.size());
        assertEquals("RULE-1", exceptions.get(0).getRuleName());
        assertEquals("title", exceptions.get(0).getFieldName());
        assertEquals("Title can not be empty", exceptions.get(0).getDescription());
    }
    @Test
    void productTitleShouldNotBeEmpty_v2() {
        product = new Product("", new BigDecimal(1), "product description");
        exceptions = validator.validate(product);

        assertEquals(1, exceptions.size());
        assertEquals("RULE-1", exceptions.get(0).getRuleName());
        assertEquals("title", exceptions.get(0).getFieldName());
        assertEquals("Title can not be empty", exceptions.get(0).getDescription());
    }

    @Test
    void productTitleLengthShouldNotBeLess3Symbols() {
        product = new Product("pr", new BigDecimal(1), "product description");
        exceptions = validator.validate(product);

        assertEquals(1, exceptions.size());
        assertEquals("RULE-2", exceptions.get(0).getRuleName());
        assertEquals("title", exceptions.get(0).getFieldName());
        assertEquals("Title can not be less than 3 symbols", exceptions.get(0).getDescription());
    }
    @Test
    void productTitleLengthShouldNotBeGreater100Symbols() {
        product = new Product("a".repeat(101), new BigDecimal(1), "product description");
        exceptions = validator.validate(product);

        assertEquals(1, exceptions.size());
        assertEquals("RULE-3", exceptions.get(0).getRuleName());
        assertEquals("title", exceptions.get(0).getFieldName());
        assertEquals("Title can not be greater than 100 symbols", exceptions.get(0).getDescription());
    }
    @Test
    void productTitleShouldContainOnlyDigitsAndEnglishLetters_v1() {
        product = new Product("продукт", new BigDecimal(1), "product description");
        exceptions = validator.validate(product);

        assertEquals(1, exceptions.size());
        assertEquals("RULE-4", exceptions.get(0).getRuleName());
        assertEquals("title", exceptions.get(0).getFieldName());
        assertEquals("Title should contain only english letters and digits", exceptions.get(0).getDescription());
    }
    @Test
    void productTitleShouldContainOnlyDigitsAndEnglishLetters_v2() {
        product = new Product("$##", new BigDecimal(1), "product description");
        exceptions = validator.validate(product);

        assertEquals(1, exceptions.size());
        assertEquals("RULE-4", exceptions.get(0).getRuleName());
        assertEquals("title", exceptions.get(0).getFieldName());
        assertEquals("Title should contain only english letters and digits", exceptions.get(0).getDescription());
    }
    @Test
    void productPriceShouldNotBeEmpty() {
        product = new Product("product", null, "product description");
        exceptions = validator.validate(product);

        assertEquals(1, exceptions.size());
        assertEquals("RULE-5", exceptions.get(0).getRuleName());
        assertEquals("price", exceptions.get(0).getFieldName());
        assertEquals("Price can not be empty", exceptions.get(0).getDescription());
    }
    @Test
    void productPriceShouldNotBeLessThanZero() {
        product = new Product("product", new BigDecimal(-1), "product description");
        exceptions = validator.validate(product);

        assertEquals(1, exceptions.size());
        assertEquals("RULE-6", exceptions.get(0).getRuleName());
        assertEquals("price", exceptions.get(0).getFieldName());
        assertEquals("Price can not be less than 0", exceptions.get(0).getDescription());
    }
    @Test
    void productDescriptionShouldNotBeGreaterThan_2000() {
        product = new Product("product", new BigDecimal(1), "a".repeat(2001));
        exceptions = validator.validate(product);

        assertEquals(1, exceptions.size());
        assertEquals("RULE-7", exceptions.get(0).getRuleName());
        assertEquals("description", exceptions.get(0).getFieldName());
        assertEquals("Description can not be greater than 2000", exceptions.get(0).getDescription());
    }
    @Test
    void productDescriptionShouldContainOnlyDigitsAndEnglishLetters_v1() {
        product = new Product("product title", new BigDecimal(1), "описание");
        exceptions = validator.validate(product);

        assertEquals(1, exceptions.size());
        assertEquals("RULE-8", exceptions.get(0).getRuleName());
        assertEquals("description", exceptions.get(0).getFieldName());
        assertEquals("Description can only contain digits and english letters", exceptions.get(0).getDescription());
    }
    @Test
    void productDescriptionShouldContainOnlyDigitsAndEnglishLetters_v2() {
        product = new Product("product title", new BigDecimal(1), "$#$$#");
        exceptions = validator.validate(product);

        assertEquals(1, exceptions.size());
        assertEquals("RULE-8", exceptions.get(0).getRuleName());
        assertEquals("description", exceptions.get(0).getFieldName());
        assertEquals("Description can only contain digits and english letters", exceptions.get(0).getDescription());
    }

    @Test
    void productTitleAndPriceShouldNotBeEmpty() {
        product = new Product(null, null, "product description");
        exceptions = validator.validate(product);

        assertTrue(exceptions.contains(new ValidationException("RULE-1", "Title can not be empty", "title")));
        assertTrue(exceptions.contains(new ValidationException("RULE-5", "Price can not be empty", "price")));
    }

    @Test
    void productTitleShouldNotBeEmptyAndDescriptionShouldContainEnglishLetters() {
        product = new Product("", new BigDecimal(1), "описание");
        exceptions = validator.validate(product);

        assertTrue(exceptions.contains(new ValidationException("RULE-1", "Title can not be empty", "title")));
        assertTrue(exceptions.contains(new ValidationException("RULE-8", "Description can only contain digits and english letters",
                "description")));
    }

    @Test
    void productTitleAndPriceShouldNotBeEmptyAndDescriptionIsInvalid() {
        product = new Product("", null, "!");
        exceptions = validator.validate(product);

        assertTrue(exceptions.contains(new ValidationException("RULE-1", "Title can not be empty", "title")));
        assertTrue(exceptions.contains(new ValidationException("RULE-5", "Price can not be empty", "price")));
        assertTrue(exceptions.contains(new ValidationException("RULE-8",
                "Description can only contain digits and english letters", "description")));
    }

    @Test
    void productTitleAndPriceAndDescriptionAreInvalid() {
        product = new Product("!!!", new BigDecimal(-1), "описание");
        exceptions = validator.validate(product);

        assertTrue(exceptions.contains(new ValidationException("RULE-4",
                "Title should contain only english letters and digits", "title")));
        assertTrue(exceptions.contains(new ValidationException("RULE-6", "Price can not be less than 0", "price")));
        assertTrue(exceptions.contains(new ValidationException("RULE-8",
                "Description can only contain digits and english letters", "description")));
    }
}
