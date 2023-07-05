package students.vladislav_antoniv.lesson_10.level_2;

import java.util.Scanner;

public class DayOfTheWeekDetectorDemo {
    private DayOfTheWeekDetector dayOfTheWeekDetector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String dayOfWeek = dayOfTheWeekDetector.detectDayOfTheWeek(number);

        System.out.println(dayOfWeek);
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo demo1 = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        System.out.println("Switch version");
        demo1.run();
        DayOfTheWeekDetectorDemo demo2 = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        System.out.println("If version");
        demo2.run();
        DayOfTheWeekDetectorDemo demo3 = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorArrayVersion());
        System.out.println("Array version");
        demo3.run();
    }
}
