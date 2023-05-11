package students.edmund_zukovskis.lesson_6.level_2;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {

        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        int dayNumber = detector.getDayNumberFromUser();
        String dayOfTheWeek = detector.findDayOfTheWeek(dayNumber);
        System.out.println(dayOfTheWeek);

    }
}
