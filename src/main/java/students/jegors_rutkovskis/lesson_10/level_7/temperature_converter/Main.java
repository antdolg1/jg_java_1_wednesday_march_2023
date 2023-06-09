package students.jegors_rutkovskis.lesson_10.level_7.temperature_converter;

import java.text.DecimalFormat;

class Main {
    public static void main(String[] args) {
        TemperatureConverterChoice temperatureConverterChoice = new TemperatureConverterChoice();
        double t = 20;
        DecimalFormat df = new DecimalFormat("#.00");

        for (Scale from : Scale.values()) {
            for (Scale to : Scale.values()) {
                TemperatureConverter temperatureConverter = temperatureConverterChoice.convert(from, to);
                Context context = new Context(temperatureConverter);
                double convertedTemp = context.executeConverter(t);
                System.out.println("From " + t + from.getName() + " to " + to.getName() + " = "
                        + df.format(convertedTemp) + to.getName());
            }
        }
    }
}
