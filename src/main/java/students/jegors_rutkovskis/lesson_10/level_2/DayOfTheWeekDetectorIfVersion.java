package students.jegors_rutkovskis.lesson_10.level_2;

class DayOfTheWeekDetectorIfVersion implements DayOfTheWeekDetector {
    private String className = "if version";
    @Override
    public String detectDayName(int number) {
        if (number == 1) {
            return Days.MONDAY.getName();
        } else if (number == 2) {
            return Days.TUESDAY.getName();
        } else if (number == 3) {
            return Days.WEDNESDAY.getName();
        } else if (number == 4) {
            return Days.THURSDAY.getName();
        } else if (number == 5) {
            return Days.FRIDAY.getName();
        } else if (number == 6) {
            return Days.SATURDAY.getName();
        } else if (number == 7) {
            return Days.SUNDAY.getName();
        } else {
            return "Please input a valid number between 1 and 7";
        }
    }
    @Override
    public String getClassName() {
        return className;
    }
}
