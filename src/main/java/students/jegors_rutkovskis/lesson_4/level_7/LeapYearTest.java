package students.jegors_rutkovskis.lesson_4.level_7;

/**
 * Так, годы 1700, 1800 и 1900 не являются високосными,
 * так как они кратны 100 и не кратны 400.
 * Годы 1600 и 2000 — високосные, так как они кратны 400.
 * Годы 2100, 2200 и 2300 — невисокосные.
 * Невисокосные года:
 *                    1700
 *                    1800
 *                    1900
 *                    2022
 *                    2023
 *                    2100
 * Високосные года:
 *                  2000
 *                  1600
 *                  2024
 *                  2020
 */
class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest test = new LeapYearTest();

        test.shouldReturnTrueIfIsLeapYear(2000);
        test.shouldReturnTrueIfIsLeapYear(1600);
        test.shouldReturnTrueIfIsLeapYear(2024);
        test.shouldReturnTrueIfIsLeapYear(2020);

        test.shouldReturnFalseIfNotLeapYear(1700);
        test.shouldReturnFalseIfNotLeapYear(1800);
        test.shouldReturnFalseIfNotLeapYear(1900);
        test.shouldReturnFalseIfNotLeapYear(2022);
        test.shouldReturnFalseIfNotLeapYear(2023);
        test.shouldReturnFalseIfNotLeapYear(2100);
    }

    void shouldReturnTrueIfIsLeapYear(int year){
        result("If leap year", true,
                isLeapYear(year));
    }
    void shouldReturnFalseIfNotLeapYear(int year){
        result("If not leap year",
                false, isLeapYear(year));
    }
    private boolean isLeapYear(int year){
        LeapYear leapYear = new LeapYear();
        return leapYear.isLeapYear(year);
    }
    private void result(String testName, boolean expected,
                        boolean actual){
        if (expected == actual){
            System.out.println(testName + " - TEST PASSED!");
        } else {
            System.err.println(testName + " - TEST FAILED!");
        }
    }
}
