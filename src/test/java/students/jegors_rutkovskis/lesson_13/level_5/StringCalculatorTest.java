package students.jegors_rutkovskis.lesson_13.level_5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    private StringCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new StringCalculator();
    }

    @Test
    void shouldReturn_3_IfDataWith2Numbers_v1() {
        String data = "1,2";
        int actual = calculator.add(data);
        assertEquals(3, actual);
    }
    @Test
    void shouldReturn_3_IfDataWith2Numbers_v2() {
        String data = "1, 2";
        int actual = calculator.add(data);
        assertEquals(3, actual);
    }

    @Test
    void shouldReturn_12_IfDataWith1Number() {
        String data = "12";
        int actual = calculator.add(data);
        assertEquals(12, actual);
    }
    @Test
    void shouldReturn_0_IfDataIsEmptyString() {
        String data = "";
        int actual = calculator.add(data);
        assertEquals(0, actual);
    }
    @Test
    void shouldReturn_25_IfDataWith5Numbers() {
        String data = "5, 5, 5, 5, 5";
        int actual = calculator.add(data);
        assertEquals(25, actual);
    }
    @Test
    void shouldReturn_28_IfDataWithLineDelimiter() {
        String data = "1\n23,4";
        int actual = calculator.add(data);
        assertEquals(28, actual);
    }
    @Test
    void shouldReturn_0_IfDataWithLineDelimiter() {
        String data = "1\n";
        int actual = calculator.add(data);
        assertEquals(1, actual);
    }
}