package students.igors_gergeleziu.lesson_10.level_2;

class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test= new DayOfTheWeekDetectorTest();
        test.dayOfTheWeekDetectorIfVersion();
        test.dayOfTheWeekDetectorSwitchVersion();
        test.dayOfTheWeekDetectorStringArrayVersion();
    }
    void dayOfTheWeekDetectorIfVersion(){
        DayOfTheWeekDetectorIfVersion day= new DayOfTheWeekDetectorIfVersion();
        System.out.println("If day: "+day.detectDayName(3));
    }
    void dayOfTheWeekDetectorSwitchVersion(){
        DayOfTheWeekDetectorSwitchVersion day= new DayOfTheWeekDetectorSwitchVersion();
        System.out.println("Switch day: "+day.detectDayName(3));
    }
    void dayOfTheWeekDetectorStringArrayVersion(){
        DayOfTheWeekDetectorStringArrayVersion day= new DayOfTheWeekDetectorStringArrayVersion();
        System.out.println("String array day: "+day.detectDayName(3));
    }
}
