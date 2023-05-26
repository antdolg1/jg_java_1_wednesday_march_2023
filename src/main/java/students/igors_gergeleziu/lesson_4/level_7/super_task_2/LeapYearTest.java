package students.igors_gergeleziu.lesson_4.level_7.super_task_2;

import teacher.lesson_4.homework.level_7_senior.solutions.super_task_2.LeapYear;

class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest test = new LeapYearTest();
        test.shouldBeRegularYearIfDividedBy4Test();
        test.shouldBeLeapYearIfDividedBy4AndDividedBy100();
        test.shouldBeLeapYearIfDividedBy4AndDividedBy100AndDividedBy400Test();
        test.shouldBeRegularYearIfNotDividedBy4AndNotDividedBy100AndNotDividedBy400Test();

    }

    void shouldBeRegularYearIfDividedBy4Test() {
        LeapYear leapYear = new LeapYear();
        checkResults(!leapYear.isLeapYear(3), "shouldBeRegularYearIfDividedBy4Test");
    }

    void shouldBeLeapYearIfDividedBy4AndDividedBy100() {
        LeapYear leapYear = new LeapYear();
        checkResults(leapYear.isLeapYear(40), "shouldBeLeapYearIfDividedBy4AndDividedBy100");
    }

    void shouldBeLeapYearIfDividedBy4AndDividedBy100AndDividedBy400Test() {
        LeapYear leapYear = new LeapYear();
        checkResults(leapYear.isLeapYear(400), "shouldBeLeapYearIfDividedBy4AndDividedBy100AndDividedBy400Test");
    }

    void shouldBeRegularYearIfNotDividedBy4AndNotDividedBy100AndNotDividedBy400Test() {
        LeapYear leapYear = new LeapYear();
        checkResults(!leapYear.isLeapYear(263), "shouldBeRegularYearIfNotDividedBy4AndNotDividedBy100AndNotDividedBy400Test");
    }

    void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
