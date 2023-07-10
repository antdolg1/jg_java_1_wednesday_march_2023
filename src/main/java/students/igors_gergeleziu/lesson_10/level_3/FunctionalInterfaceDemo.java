package students.igors_gergeleziu.lesson_10.level_3;

import java.time.LocalDate;

class FunctionalInterfaceDemo implements FunctionalInterface{
    @Override
    public int calculateAge(int year) {
        return LocalDate.now().getYear()-year;
    }
}
