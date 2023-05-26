package students.andrej_mihailicenko.lesson_6.level_2;

class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Not correct day number"};
        for (int i = 1; i <= days.length; i++) {
            String expectedResult = days[i - 1];
            String realResult = new DayOfTheWeekDetector().findDayOfTheWeek(i);
            if (expectedResult.equals(realResult)) {
                System.out.println("Test " + expectedResult + " Passed");
            } else {
                System.out.println("Test " + expectedResult + " Failed");
            }
        }
    }
}