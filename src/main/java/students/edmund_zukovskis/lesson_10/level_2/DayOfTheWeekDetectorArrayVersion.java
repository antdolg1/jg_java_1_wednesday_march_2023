package students.edmund_zukovskis.lesson_10.level_2;


class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {

    private String[] daysOfWeek = {"", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    @Override
    public String detectDayName(int number) {
        return (number >= 1 && number <= 7) ? this.daysOfWeek[number] :
                "Please input a valid number between 1 and 7";
    }
}
