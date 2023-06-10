package students.edmund_zukovskis.lesson_10.level_2;


class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {

        DayOfTheWeekDetector detector1 = new DayOfTheWeekDetectorIfVersion();
        System.out.println(detector1.detectDayName(3)); //expected Wednesday

        DayOfTheWeekDetector detector2 = new DayOfTheWeekDetectorSwitchVersion();
        System.out.println(detector2.detectDayName(5)); //expected Friday

        DayOfTheWeekDetector detector3 = new DayOfTheWeekDetectorArrayVersion();
        System.out.println(detector3.detectDayName(7)); //expected Sunday
    }
}
