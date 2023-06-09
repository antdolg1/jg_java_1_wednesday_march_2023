package students.jegors_rutkovskis.lesson_10.level_7.strategy_pattern_2;

import java.time.DayOfWeek;
import java.time.LocalDate;

class CurrentDay {
    private DayOfWeek today = LocalDate.now().getDayOfWeek();

    int currentDayValue() {
        return today.getValue();
    }
}
