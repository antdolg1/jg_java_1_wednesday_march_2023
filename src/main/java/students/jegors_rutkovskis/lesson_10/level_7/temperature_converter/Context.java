package students.jegors_rutkovskis.lesson_10.level_7.temperature_converter;

class Context {
    private TemperatureConverter temperatureConverter;

    public Context(TemperatureConverter temperatureConverter) {
        this.temperatureConverter = temperatureConverter;
    }

    double executeConverter(double t) {
        return temperatureConverter.convert(t);
    }
}
