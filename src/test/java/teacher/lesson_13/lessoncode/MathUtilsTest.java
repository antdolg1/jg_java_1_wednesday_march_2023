package teacher.lesson_13.lessoncode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.assertEquals;

class MathUtilsTest {

    @ParameterizedTest
    @CsvSource({ "2, 3, 6", "5, 5, 25", "10, -2, -20", "0, 100, 0"})
    public void testMultiply(int a, int b, int expected) {
        int actual = MathUtils.multiply(a, b);
        assertEquals(expected, actual);
    }

}