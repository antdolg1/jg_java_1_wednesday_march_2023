package students.andrej_mihailicenko.lesson_13.level_1;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class TaxCalculatorImplTest {
    private TaxCalculatorImpl taxCalculatorImpl;

    @Before
    public void setUp() {
        taxCalculatorImpl = new TaxCalculatorImpl();
    }

    @Test
    public void calculate25percentTaxWith20000() {
        BigDecimal expected = new BigDecimal("5000.00");
        BigDecimal actual = taxCalculatorImpl.calculateTax(new BigDecimal("20000"));
        assertEquals(expected, actual);
    }

    @Test
    public void calculate25percentTaxLessThan20000() {
        BigDecimal expected = new BigDecimal("2500.00");
        BigDecimal actual = taxCalculatorImpl.calculateTax(new BigDecimal("10000"));
        assertEquals(expected, actual);
    }

    @Test
    public void calculate25percentTaxWithZero() {
        BigDecimal expected = new BigDecimal("0.00");
        BigDecimal actual = taxCalculatorImpl.calculateTax(new BigDecimal("0"));
        assertEquals(expected, actual);
    }

    @Test
    public void calculate40percentTaxWith30000() {
        BigDecimal expected = new BigDecimal("9000.00");
        BigDecimal actual = taxCalculatorImpl.calculateTax(new BigDecimal("30000"));
        assertEquals(expected, actual);
    }

    @Test
    public void name() {

    }
}