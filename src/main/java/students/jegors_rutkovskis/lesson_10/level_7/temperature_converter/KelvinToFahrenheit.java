package students.jegors_rutkovskis.lesson_10.level_7.temperature_converter;

class KelvinToFahrenheit implements TemperatureConverter {
    @Override
    public double convert(double temperature) {
        return (temperature - 273.15) * 9/5 + 32;
    }
}
