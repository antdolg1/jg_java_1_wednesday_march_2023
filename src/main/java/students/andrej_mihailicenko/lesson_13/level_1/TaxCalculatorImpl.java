package students.andrej_mihailicenko.lesson_13.level_1;

import java.math.BigDecimal;

import static java.math.BigDecimal.valueOf;

class TaxCalculatorImpl implements TaxCalculator {

    public BigDecimal calculateTax(BigDecimal income) {

        if (income.compareTo(new BigDecimal("20000")) <= 0) {
            return income.multiply(valueOf(0.25));
        } else {
            var incomeBiggerThen20000 = income.subtract(new BigDecimal("20000"));
            var taxAfter20000 = incomeBiggerThen20000.multiply(new BigDecimal("0.40"));
            var taxBefore20000 = new BigDecimal("20000").multiply(new BigDecimal("0.25"));
            return taxBefore20000.add(taxAfter20000);
        }

    }
}
