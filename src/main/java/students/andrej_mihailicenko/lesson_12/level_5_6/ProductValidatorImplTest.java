package students.andrej_mihailicenko.lesson_12.level_5_6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ProductValidatorImplTest {

    private ProductValidator validator;

    @BeforeEach
    public void setup() {
        ProductTitleValidationRule titleValidationRule = new ProductTitleValidationRule();
        ProductPriceValidationRule priceValidationRule = new ProductPriceValidationRule();
        ProductDescriptionValidationRule descriptionValidationRule = new ProductDescriptionValidationRule();
        validator = new ProductValidatorImpl(titleValidationRule, priceValidationRule, descriptionValidationRule);
    }

    @Test
    public void testValidate_ValidProduct_ReturnsEmptyList() {
        Product product = new Product(12, "Valid Product", "aaa");
        List<ValidationException> exceptions = validator.validate(product);
        Assertions.assertTrue(exceptions.isEmpty());
    }

    @Test
    public void testValidate_EmptyTitle_ReturnsValidationException() {
        Product product = new Product(12, "", "aaa");
        List<ValidationException> exceptions = validator.validate(product);
        Assertions.assertFalse(exceptions.isEmpty());
        Assertions.assertEquals(1, exceptions.size());
        ValidationException exception = exceptions.get(0);
        Assertions.assertEquals("RULE-1", exception.getRuleName());
        Assertions.assertEquals("Product title must not be empty", exception.getExceptionDescription());
        Assertions.assertEquals("Product Name", exception.getFieldName());
    }

    @Test
    public void testValidate_ShortTitle_ReturnsValidationException() {
        Product product = new Product(12, "P", "aaa");
        List<ValidationException> exceptions = validator.validate(product);
        Assertions.assertFalse(exceptions.isEmpty());
        Assertions.assertEquals(1, exceptions.size());
        ValidationException exception = exceptions.get(0);
        Assertions.assertEquals("RULE-2", exception.getRuleName());
        Assertions.assertEquals("Product title must be at least 3 characters long", exception.getExceptionDescription());
        Assertions.assertEquals("Product Name", exception.getFieldName());
    }

    @Test
    public void testValidate_LongTitle_ReturnsValidationException() {
        String longTitle = "This is a very long title that exceeds the maximum allowed length of 100 characters.....................................................";
        Product product = new Product(12, longTitle, "aaa");
        List<ValidationException> exceptions = validator.validate(product);
        Assertions.assertFalse(exceptions.isEmpty());
        Assertions.assertEquals(1, exceptions.size());
        ValidationException exception = exceptions.get(0);
        Assertions.assertEquals("RULE-3", exception.getRuleName());
        Assertions.assertEquals("Product title cannot exceed 100 characters", exception.getExceptionDescription());
        Assertions.assertEquals("Product Name", exception.getFieldName());
    }

    @Test
    public void testValidate_InvalidCharactersInTitle_ReturnsValidationException() {
        Product product = new Product(12, "Invalid!", "aaa");
        List<ValidationException> exceptions = validator.validate(product);
        Assertions.assertFalse(exceptions.isEmpty());
        Assertions.assertEquals(1, exceptions.size());
        ValidationException exception = exceptions.get(0);
        Assertions.assertEquals("RULE-4", exception.getRuleName());
        Assertions.assertEquals("Product title must contain only English letters and digits", exception.getExceptionDescription());
        Assertions.assertEquals("Product Name", exception.getFieldName());
    }

    @Test
    public void testValidate_NullPrice_ReturnsValidationException() {
        Product product = new Product(null, "Valid Product", "aaa");
        List<ValidationException> exceptions = validator.validate(product);
        Assertions.assertFalse(exceptions.isEmpty());
        Assertions.assertEquals(1, exceptions.size());
        ValidationException exception = exceptions.get(0);
        Assertions.assertEquals("RULE-5", exception.getRuleName());
        Assertions.assertEquals("Product price must not be null", exception.getExceptionDescription());
        Assertions.assertEquals("Product Price", exception.getFieldName());
    }

    @Test
    public void testValidate_NegativePrice_ReturnsValidationException() {
        Product product = new Product(-10, "Valid Product", "aaa");
        List<ValidationException> exceptions = validator.validate(product);
        Assertions.assertFalse(exceptions.isEmpty());
        Assertions.assertEquals(1, exceptions.size());
        ValidationException exception = exceptions.get(0);
        Assertions.assertEquals("RULE-6", exception.getRuleName());
        Assertions.assertEquals("Product price must be greater than 0", exception.getExceptionDescription());
        Assertions.assertEquals("Product Price", exception.getFieldName());
    }

    @Test
    public void testValidate_LongDescription_ReturnsValidationException() {
        String longDescription = "This is a very long description that exceeds the maximum allowed length of 2000 characters..............................................";
        Product product = new Product(12, "Valid Product", longDescription);
        List<ValidationException> exceptions = validator.validate(product);
        Assertions.assertFalse(exceptions.isEmpty());
        Assertions.assertEquals(1, exceptions.size());
        ValidationException exception = exceptions.get(0);
        Assertions.assertEquals("RULE-8", exception.getRuleName());
        Assertions.assertEquals("Product description cannot exceed 2000 characters", exception.getExceptionDescription());
        Assertions.assertEquals("Product Description", exception.getFieldName());
    }

    @Test
    public void testValidate_InvalidCharactersInDescription_ReturnsValidationException() {
        Product product = new Product(12, "Valid Product", "Invalid!");
        List<ValidationException> exceptions = validator.validate(product);
        Assertions.assertFalse(exceptions.isEmpty());
        Assertions.assertEquals(1, exceptions.size());
        ValidationException exception = exceptions.get(0);
        Assertions.assertEquals("RULE-9", exception.getRuleName());
        Assertions.assertEquals("Product description must contain only English letters and digits", exception.getExceptionDescription());
        Assertions.assertEquals("Product Description", exception.getFieldName());
    }
}
