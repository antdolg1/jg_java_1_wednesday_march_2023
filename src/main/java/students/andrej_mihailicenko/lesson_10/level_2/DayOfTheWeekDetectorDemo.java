package students.andrej_mihailicenko.lesson_10.level_2;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {
    private final DayOfTheWeekDetector detector;

    DayOfTheWeekDetectorDemo(DayOfTheWeekDetector detector) {
        this.detector = detector;
    }

    void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input number: ");
        int number = scanner.nextInt();
        String dayName = detector.detectDayName(number);
        System.out.println("Day of the week: " + dayName);
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo detectWithSwitch = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        detectWithSwitch.run();

        DayOfTheWeekDetectorDemo detectWitchIf = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        detectWitchIf.run();
    }
}
