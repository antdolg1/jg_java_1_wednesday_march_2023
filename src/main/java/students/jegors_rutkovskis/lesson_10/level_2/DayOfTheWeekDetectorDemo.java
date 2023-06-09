package students.jegors_rutkovskis.lesson_10.level_2;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {
    private static DayOfTheWeekDetectorDemo demo;
    DayOfTheWeekDetector detector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector detector) {
        this.detector = detector;
    }
    void run() {
        System.out.println("Using " + detector.getClassName());
        System.out.print("Enter number of the week day: ");
        int number = new Scanner(System.in).nextInt();
        String day = detector.detectDayName(number);
        System.out.println(day);
    }

    public static void main(String[] args) {
        demo = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorArrayVersion());
        demo.run();

        demo = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        demo.run();

        demo = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        demo.run();
    }
}
