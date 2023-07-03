package teacher.lesson_13.lessoncode;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.Assert.*;

public class TaxCalculatorImplTest {

    private TaxCalculator calculator;

    @Before
    public void initialize() {
        calculator = new TaxCalculatorImpl();
    }

    @Test
    public void shouldReturn25PercentTax() {
        double realTaxResult = calculator.calculate25PercentTax(1000.0);
        assertEquals(250.0, realTaxResult);
    }

    @Test
    public void shouldReturnZeroTax_whenZeroIncomeGiven() {
        double taxResult = calculator.calculate25PercentTax(0.0);
        assertEquals(0.0, taxResult);
    }

}