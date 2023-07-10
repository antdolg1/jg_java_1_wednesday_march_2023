package students.igors_gergeleziu.lesson_10.level_2;

class DayOfTheWeekDetectorStringArrayVersion implements DayOfTheWeekDetector{
    @Override
    public String detectDayName(int number) {
        String daysOfTheWeek[]={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return daysOfTheWeek[number-1];
    }
}
