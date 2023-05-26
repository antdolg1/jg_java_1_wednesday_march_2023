package students.pavels_serikovs.lesson_4.level_7.task_23;

class LeapYear {
    public boolean isLeapYear(int year) {
        if (!isDividedByFour(year)) {
            return false;
        }
        if (!isDividedByHundred(year)) {
            return true;
        }
        return isDividedByFourHundred(year);
    }

    private boolean isDividedByFour(int year) {
        return year % 4 == 0;
    }

    private boolean isDividedByHundred(int year) {
        return year % 100 == 0;
    }

    private boolean isDividedByFourHundred(int year) {
        return year % 400 == 0;
    }
}
