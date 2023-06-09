package students.jegors_rutkovskis.lesson_10.level_2;

class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {
    private String className = "array version";
    @Override
    public String detectDayName(int number) {
        for (Days day : Days.values()) {
            if (day.getDayNumber() == number) {
                return day.getName();
            }
        }
        return "Please input a valid number between 1 and 7";
    }
    @Override
    public String getClassName() {
        return className;
    }
}
