package students.andrej_mihailicenko.lesson_4.level_7;

public class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.testLeapYear();
        leapYearTest.testNotLeapYear();
        leapYearTest.testCenturyLeapYear();
        leapYearTest.testCenturyNonLeapYear();
    }

    public void testLeapYear() {
        LeapYear leapYear = new LeapYear();
        boolean result = leapYear.isLeapYear(2020);
        if (result) {
            System.out.println("testLeapYear passed");
        } else {
            System.out.println("testLeapYear failed");
        }
    }

    public void testNotLeapYear() {
        LeapYear leapYear = new LeapYear();
        boolean result = leapYear.isLeapYear(2021);
        if (!result) {
            System.out.println("testNotLeapYear passed");
        } else {
            System.out.println("testNotLeapYear failed");
        }
    }

    public void testCenturyLeapYear() {
        LeapYear leapYear = new LeapYear();
        boolean result = leapYear.isLeapYear(2000);
        if (result) {
            System.out.println("testCenturyLeapYear passed");
        } else {
            System.out.println("testCenturyLeapYear failed");
        }
    }

    public void testCenturyNonLeapYear() {
        LeapYear leapYear = new LeapYear();
        boolean result = leapYear.isLeapYear(1700);
        if (!result) {
            System.out.println("testCenturyNonLeapYear passed");
        } else {
            System.out.println("testCenturyNonLeapYear failed");
        }
    }
}