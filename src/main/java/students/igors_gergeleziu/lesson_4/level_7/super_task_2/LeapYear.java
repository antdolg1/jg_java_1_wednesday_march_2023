package students.igors_gergeleziu.lesson_4.level_7.super_task_2;

class LeapYear {
    boolean isLeapYear(int year) {
        if (!isDividedBy4(year)) {
            // System.out.println(year+" is not leap year");
            return false;
        } else if (!isDividedBy100(year)) {
            // System.out.println(year+" is leap year");
            return true;
        }
        return isDividedBy400(year);
    }

    boolean isDividedBy4(int year) {
        return year % 4 == 0;
    }

    boolean isDividedBy100(int year) {
        return year % 100 == 0;
    }

    boolean isDividedBy400(int year) {
        return year % 400 == 0;
    }
}
