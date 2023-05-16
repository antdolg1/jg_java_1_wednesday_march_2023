package students.igors_gergeleziu.lesson_6.level_2;

class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.shouldBeMondayTest();
        test.shouldBeTuesdayTest();
        test.shouldBeThursdayTest();
        test.shouldBeFridayTest();
        test.shouldBeSaturdayTest();
        test.shouldBeSundayTest();
        test.shouldBeIncorrectDayTest();

    }
    void shouldBeMondayTest(){
        DayOfTheWeekDetector detector=new DayOfTheWeekDetector();
        checkResult(detector.findDayOfTheWeek(1).equals("Monday"), "shouldBeMondayTest");
    }
    void shouldBeTuesdayTest(){
        DayOfTheWeekDetector detector=new DayOfTheWeekDetector();
        checkResult(detector.findDayOfTheWeek(2).equals("Tuesday"), "shouldBeTuesdayTest");
    }
    void shouldBeWednesdayTest(){
        DayOfTheWeekDetector detector=new DayOfTheWeekDetector();
        checkResult(detector.findDayOfTheWeek(3).equals("Wednesday"), "shouldBeWednesdayTest");
    }
    void shouldBeThursdayTest(){
        DayOfTheWeekDetector detector=new DayOfTheWeekDetector();
        checkResult(detector.findDayOfTheWeek(4).equals("Thursday"), "shouldBeThursdayTest");
    }
    void shouldBeFridayTest(){
        DayOfTheWeekDetector detector=new DayOfTheWeekDetector();
        checkResult(detector.findDayOfTheWeek(5).equals("Friday"), "shouldBeFridayTest");
    }
    void shouldBeSaturdayTest(){
        DayOfTheWeekDetector detector=new DayOfTheWeekDetector();
        checkResult(detector.findDayOfTheWeek(6).equals("Saturday"), "shouldBeSaturdayTest");
    }
    void shouldBeSundayTest(){
        DayOfTheWeekDetector detector=new DayOfTheWeekDetector();
        checkResult(detector.findDayOfTheWeek(7).equals("Sunday"), "shouldBeSundayTest");
    }
    void shouldBeIncorrectDayTest(){
        DayOfTheWeekDetector detector= new DayOfTheWeekDetector();
        checkResult(detector.findDayOfTheWeek(0).equals("Not correct day number"), "shouldBeIncorrectDayTest");
    }

    void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
