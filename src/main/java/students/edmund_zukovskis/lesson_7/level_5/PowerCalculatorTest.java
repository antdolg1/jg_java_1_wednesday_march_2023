package students.edmund_zukovskis.lesson_7.level_5;

import teacher.lesson_4.homework.level_7_senior.solutions.super_task_3.Calculator;

public class PowerCalculatorTest {
    public static void main(String[] args) {

        PowerCalculatorTest test = new PowerCalculatorTest();
        test.powValueZero();
        test.powValuePositive();
        test.powValueNegative();
        test.valueZero();
        test.valueNegative();
    }

    public void powValueZero() {
        double expected = 1;
        double actual = PowerCalculator.calculatePower(2.0, 0);
        if (expected == actual) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }

    public void powValuePositive() {
        double expected = 32;
        double actual = PowerCalculator.calculatePower(2.0, 5);
        if (expected == actual) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }

    public void powValueNegative() {
        double expected = 0.125;
        double actual = PowerCalculator.calculatePower(2.0, -3);
        if (expected == actual) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }

    public void valueZero() {
        double expected = 0;
        double actual = PowerCalculator.calculatePower(0.0, 10);
        if (expected == actual) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }

    public void valueNegative() {
        double expected = -8;
        double actual = PowerCalculator.calculatePower(-2.0, 3);
        if (expected == actual) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }
}
