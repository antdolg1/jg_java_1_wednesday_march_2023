package students.jegors_rutkovskis.lesson_6.level_2;

class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.shouldReturnMonday();
        test.shouldReturnTuesday();
        test.shouldReturnWednesday();
        test.shouldReturnThursday();
        test.shouldReturnFriday();
        test.shouldReturnSaturday();
        test.shouldReturnSunday();
        test.shouldReturnWrongDay();
    }
    void shouldReturnMonday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String expected = "It's Monday!";
        String actual = detector.findDayOfTheWeek(1);
        result(expected, actual, "shouldReturnMonday");
    }
    void shouldReturnTuesday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String expected = "It's Tuesday!";
        String actual = detector.findDayOfTheWeek(2);
        result(expected, actual, "shouldReturnTuesday");
    }
    void shouldReturnWednesday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String expected = "It's Wednesday!";
        String actual = detector.findDayOfTheWeek(3);
        result(expected, actual, "shouldReturnWednesday");
    }
    void shouldReturnThursday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String expected = "It's Thursday!";
        String actual = detector.findDayOfTheWeek(4);
        result(expected, actual, "shouldReturnThursday");
    }
    void shouldReturnFriday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String expected = "It's Friday!";
        String actual = detector.findDayOfTheWeek(5);
        result(expected, actual, "shouldReturnFriday");
    }
    void shouldReturnSaturday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String expected = "It's Saturday!";
        String actual = detector.findDayOfTheWeek(6);
        result(expected, actual, "shouldReturnSaturday");
    }
    void shouldReturnSunday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String expected = "It's Sunday!";
        String actual = detector.findDayOfTheWeek(7);
        result(expected, actual, "shouldReturnSunday");
    }
    void shouldReturnWrongDay() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String expected = "Wrong day! Enter number between 1 and 7 !!!";
        String actual = detector.findDayOfTheWeek(8);
        result(expected, actual, "shouldReturnWrongDay");
        String actual2 = detector.findDayOfTheWeek(0);
        result(expected, actual2, "shouldReturnWrongDay");
    }

    private void result(String expected, String actual, String testName) {
        if (expected.equals(actual)) {
            System.out.println(testName + " - PASSED");
        } else {
            System.err.println(testName + " - FAILED");
        }
    }
}
