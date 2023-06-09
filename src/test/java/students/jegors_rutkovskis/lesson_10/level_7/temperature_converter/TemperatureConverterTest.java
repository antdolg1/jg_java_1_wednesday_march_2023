package students.jegors_rutkovskis.lesson_10.level_7.temperature_converter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    private TemperatureConverterChoice temperatureConverterChoice;
    private TemperatureConverter temperatureConverter;
    private double t;
    private double delta;
    @BeforeEach
    void setUp() {
        t = 20;
        temperatureConverterChoice = new TemperatureConverterChoice();
        delta = 0.01;
    }

    @Test
    void celsiusToKelvinTest() {
        temperatureConverter = temperatureConverterChoice.convert(Scale.CELSIUS, Scale.KELVIN);
        double expected = 293.15;
        double actual = new Context(temperatureConverter).executeConverter(t);
        assertEquals(expected, actual);
    }

    @Test
    void celsiusToCelsiusTest() {
        temperatureConverter = temperatureConverterChoice.convert(Scale.CELSIUS, Scale.CELSIUS);
        double expected = 20;
        double actual = new Context(temperatureConverter).executeConverter(t);
        assertEquals(expected, actual);
    }

    @Test
    void celsiusToFahrenheitTest() {
        temperatureConverter = temperatureConverterChoice.convert(Scale.CELSIUS, Scale.FAHRENHEIT);
        double expected = 68.0;
        double actual = new Context(temperatureConverter).executeConverter(t);
        assertEquals(expected, actual);
    }

    @Test
    void fahrenheitToCelsiusTest() {
        temperatureConverter = temperatureConverterChoice.convert(Scale.FAHRENHEIT, Scale.CELSIUS);
        double expected = -6.67;
        double actual = new Context(temperatureConverter).executeConverter(t);
        assertEquals(expected, actual, delta);
    }

    @Test
    void fahrenheitToKelvinTest() {
        temperatureConverter = temperatureConverterChoice.convert(Scale.FAHRENHEIT, Scale.KELVIN);
        double expected = 266.483;
        double actual = new Context(temperatureConverter).executeConverter(t);
        assertEquals(expected, actual, delta);
    }

    @Test
    void fahrenheitToFahrenheitTest() {
        temperatureConverter = temperatureConverterChoice.convert(Scale.FAHRENHEIT, Scale.FAHRENHEIT);
        double expected = 20;
        double actual = new Context(temperatureConverter).executeConverter(t);
        assertEquals(expected, actual);
    }

    @Test
    void kelvinToCelsiusTest() {
        temperatureConverter = temperatureConverterChoice.convert(Scale.KELVIN, Scale.CELSIUS);
        double expected = -253.15;
        double actual = new Context(temperatureConverter).executeConverter(t);
        assertEquals(expected, actual, delta);
    }

    @Test
    void kelvinToFahrenheitTest() {
        temperatureConverter = temperatureConverterChoice.convert(Scale.KELVIN, Scale.FAHRENHEIT);
        double expected = -423.67;
        double actual = new Context(temperatureConverter).executeConverter(t);
        assertEquals(expected, actual, delta);
    }

    @Test
    void kelvinToKelvinTest() {
        temperatureConverter = temperatureConverterChoice.convert(Scale.KELVIN, Scale.KELVIN);
        double expected = 20;
        double actual = new Context(temperatureConverter).executeConverter(t);
        assertEquals(expected, actual);
    }
}