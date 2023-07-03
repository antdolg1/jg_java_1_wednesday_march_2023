package teacher.lesson_13.lessoncode;

public class TaxCalculatorImpl implements TaxCalculator {

    @Override
    public double calculate25PercentTax(double income) {
        return income * 0.25;
    }
}
