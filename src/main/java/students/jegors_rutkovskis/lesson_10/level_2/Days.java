package students.jegors_rutkovskis.lesson_10.level_2;

enum Days {
    MONDAY("Monday", 1),
    TUESDAY("Tuesday", 2),
    WEDNESDAY("Wednesday", 3),
    THURSDAY("Thursday", 4),
    FRIDAY("Friday", 5),
    SATURDAY("Saturday", 6),
    SUNDAY("Sunday", 7);

    private final String name;
    private final int dayNumber;

    Days(String name, int dayNumber) {
        this.name = name;
        this.dayNumber = dayNumber;
    }
    String getName() {
        return name;
    }
    int getDayNumber() {
        return dayNumber;
    }
}
