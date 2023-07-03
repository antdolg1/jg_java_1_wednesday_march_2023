package students.jegors_rutkovskis.lesson_13.level_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TaxCalculatorImplTest {
    private TaxCalculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new TaxCalculatorImpl();
    }

    @Test
    void shouldReturnTax_25_PercentIfIncomeEquals_20000() {
        var expected = new BigDecimal("5000.00");
        var actual = calculator.calculateTax(new BigDecimal(20_000));
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnZeroTaxIfIncomeIsZero() {
        BigDecimal expected = new BigDecimal("0.00");
        BigDecimal actual = calculator.calculateTax(BigDecimal.ZERO);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnTax_25_PercentIfIncomeLess_20000() {
        var expected = new BigDecimal("2500.00");
        var actual = calculator.calculateTax(new BigDecimal(10_000));
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnTax_25Percent_PlusTax_40PercentIfIncomeGreater_20000() {
        var expected = new BigDecimal("9000.00");
        var actual = calculator.calculateTax(new BigDecimal(30_000));
        assertEquals(expected, actual);
    }
}