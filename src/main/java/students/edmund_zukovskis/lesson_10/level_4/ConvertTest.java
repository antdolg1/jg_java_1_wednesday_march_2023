//package students.edmund_zukovskis.lesson_10.level_4;
//
//import org.junit.Test;
//
//import static org.junit.Assert.assertEquals;
//
//public class ConvertTest {
//
//    @Test
//    public void kelvinConvertTest() {
//        TemperatureConverter kelvinConverter = new KelvinConverter();
//
//        assertEquals(273.15, kelvinConverter.convert(0), 0.01);
//        assertEquals(0, kelvinConverter.convert(-273.15), 0.01);
//        assertEquals(373.15, kelvinConverter.convert(100), 0.01);
//    }
//
//    @Test
//    public void fahrenheitConverterTest() {
//        TemperatureConverter fahrenheitConverter = new FahrenheitConverter();
//
//        assertEquals(32, fahrenheitConverter.convert(0), 0.01);
//        assertEquals(-459.67, fahrenheitConverter.convert(-273.15), 0.01);
//        assertEquals(212, fahrenheitConverter.convert(100), 0.01);
//    }
//}
