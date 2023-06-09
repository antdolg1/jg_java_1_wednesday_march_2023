package students.jegors_rutkovskis.lesson_10.level_2;

class DayOfTheWeekDetectorSwitchVersion implements DayOfTheWeekDetector {
    private String className = "switch version";
    @Override
    public String detectDayName(int number) {
        return switch (number) {
            case 1 -> Days.MONDAY.getName();
            case 2 -> Days.TUESDAY.getName();
            case 3 -> Days.WEDNESDAY.getName();
            case 4 -> Days.THURSDAY.getName();
            case 5 -> Days.FRIDAY.getName();
            case 6 -> Days.SATURDAY.getName();
            case 7 -> Days.SUNDAY.getName();
            default -> "Please input a valid number between 1 and 7";
        };
    }
    @Override
    public String getClassName() {
        return className;
    }
}
