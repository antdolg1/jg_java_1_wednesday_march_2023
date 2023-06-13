package students.andrej_mihailicenko.lesson_10.level_4;

public class FahrenheitConverter implements TemperatureConverter{

    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }
}
