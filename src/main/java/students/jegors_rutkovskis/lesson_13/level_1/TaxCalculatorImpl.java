package students.jegors_rutkovskis.lesson_13.level_1;

import java.math.BigDecimal;

class TaxCalculatorImpl implements TaxCalculator {
    private static final BigDecimal UPPER_BOUND = new BigDecimal("20000");
    private static final BigDecimal TAX_RATE_FOR_LOWER_BOUND = new BigDecimal("0.25");
    private static final BigDecimal TAX_RATE_FOR_UPPER_BOUND = new BigDecimal("0.40");


    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        if (isIncomeLessOrEqualsTo_UPPER_BOUND(income)) {
            return calculateTaxForLowerBound(income);
        }
        return calculateTaxIfIncomeAboveUpperBound(income);
    }


    private boolean isIncomeLessOrEqualsTo_UPPER_BOUND(BigDecimal income) {
        return income.compareTo(new BigDecimal("20000")) <= 0;
    }
    private BigDecimal calculateTaxIfIncomeAboveUpperBound(BigDecimal income) {
        BigDecimal incomeAboveUpperBound = income.subtract(UPPER_BOUND);
        BigDecimal taxForLowerBound = UPPER_BOUND.multiply(TAX_RATE_FOR_LOWER_BOUND);
        BigDecimal taxForUpperBound = incomeAboveUpperBound.multiply(TAX_RATE_FOR_UPPER_BOUND);
        return taxForLowerBound.add(taxForUpperBound);
    }
    private BigDecimal calculateTaxForLowerBound(BigDecimal income) {
        return income.multiply(TAX_RATE_FOR_LOWER_BOUND);
    }
}
