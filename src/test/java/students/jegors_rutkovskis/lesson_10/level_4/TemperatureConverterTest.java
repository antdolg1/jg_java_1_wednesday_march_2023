package students.jegors_rutkovskis.lesson_10.level_4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    private TemperatureConverter kelvinConverter, fahrenheitConverter;

    @BeforeEach
    void setUp() {
        kelvinConverter = new KelvinConverter();
        fahrenheitConverter = new FahrenheitConverter();
    }

    @Test
    void shouldConvertCelsiusToKelvin() {
        assertEquals(293.15, kelvinConverter.convert(20));
    }

    @Test
    void shouldConvertCelsiusToFahrenheit() {
        assertEquals(68, fahrenheitConverter.convert(20));
    }
}