package students.edmund_zukovskis.lesson_10.level_2;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {
    private final DayOfTheWeekDetector detector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector detector) {
        this.detector = detector;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number between 1 and 7: ");
        int number = scanner.nextInt();
        String dayOfWeekName = detector.detectDayName(number);
        System.out.println("The day of the week is: " + dayOfWeekName);
        scanner.close();
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorIfVersion detector1 = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetectorDemo demo1 = new DayOfTheWeekDetectorDemo(detector1);
        demo1.run();

//        DayOfTheWeekDetectorSwitchVersion detector2 = new DayOfTheWeekDetectorSwitchVersion();
//        DayOfTheWeekDetectorDemo demo2 = new DayOfTheWeekDetectorDemo(detector2);
//        demo2.run();

//        DayOfTheWeekDetectorArrayVersion detector3 = new DayOfTheWeekDetectorArrayVersion();
//       DayOfTheWeekDetectorDemo demo3 = new DayOfTheWeekDetectorDemo(detector3);
//       demo3.run();
    }
}

