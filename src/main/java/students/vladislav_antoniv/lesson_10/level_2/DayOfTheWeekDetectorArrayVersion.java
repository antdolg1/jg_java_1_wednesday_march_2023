package students.vladislav_antoniv.lesson_10.level_2;

public class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {
    private String[] daysOfWeek = {"Please input a valid number between 1 and 7", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    public String detectDayOfTheWeek(int number) {
        if (number >= 1 && number <= 7) {
            return daysOfWeek[number];
        } else {
            return daysOfWeek[0];
        }
    }
}
