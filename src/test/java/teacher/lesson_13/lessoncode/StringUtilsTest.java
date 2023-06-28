package teacher.lesson_13.lessoncode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @ParameterizedTest
    @CsvSource({ "Hello, 5", "JUnit, 5", "Testing, 7" })
    public void testStringLength(String str, int expectedLength) {
        int actualLength = StringUtils.getStringLength(str);
        assertEquals(expectedLength, actualLength);
    }

}