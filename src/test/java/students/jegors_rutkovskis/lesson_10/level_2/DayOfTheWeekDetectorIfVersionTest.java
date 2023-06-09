package students.jegors_rutkovskis.lesson_10.level_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayOfTheWeekDetectorIfVersionTest {
    private DayOfTheWeekDetectorIfVersion victim;
    @BeforeEach
    void setUp() {
        victim = new DayOfTheWeekDetectorIfVersion();
    }

    @Test
    void shouldReturnMonday() {
        assertEquals("Monday", victim.detectDayName(1));
    }
    @Test
    void shouldReturnWednesday() {
        assertEquals("Wednesday", victim.detectDayName(3));
    }
    @Test
    void shouldReturnSunday() {
        assertEquals("Sunday", victim.detectDayName(7));
    }
    @Test
    void shouldReturnWrong() {
        assertEquals("Please input a valid number between 1 and 7", victim.detectDayName(0));
    }
}