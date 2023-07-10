package students.igors_gergeleziu.lesson_10.level_2;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {
    private DayOfTheWeekDetector solution;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector solution) {
        this.solution = solution;
    }

    public DayOfTheWeekDetectorDemo() {
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo demo = new DayOfTheWeekDetectorDemo();
        demo.dayOfTheWeekIfSolution();
        demo.dayOfTheWeekSwitchSolution();
        demo.daYOfTheWeekStringArraySolution();
    }

    void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day of the week: ");
        System.out.println("Your day of the week is " + solution.detectDayName(scanner.nextInt()));
    }

    void dayOfTheWeekIfSolution() {
        DayOfTheWeekDetectorIfVersion solution1 = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetectorDemo demo1 = new DayOfTheWeekDetectorDemo(solution1);
        demo1.run();
    }

    void dayOfTheWeekSwitchSolution() {
        DayOfTheWeekDetectorSwitchVersion solution2 = new DayOfTheWeekDetectorSwitchVersion();
        DayOfTheWeekDetectorDemo demo2 = new DayOfTheWeekDetectorDemo(solution2);
        demo2.run();
    }

    void daYOfTheWeekStringArraySolution() {
        DayOfTheWeekDetectorStringArrayVersion solution3 = new DayOfTheWeekDetectorStringArrayVersion();
        DayOfTheWeekDetectorDemo demo3 = new DayOfTheWeekDetectorDemo(solution3);
        demo3.run();
    }
}
