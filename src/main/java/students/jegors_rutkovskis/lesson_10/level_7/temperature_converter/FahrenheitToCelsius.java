package students.jegors_rutkovskis.lesson_10.level_7.temperature_converter;

class FahrenheitToCelsius implements TemperatureConverter {
    @Override
    public double convert(double temperature) {
        return (temperature - 32) * 5/9;
    }
}
