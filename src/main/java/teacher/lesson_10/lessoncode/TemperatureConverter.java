package teacher.lesson_10.lessoncode;

public class TemperatureConverter {

    public static double convertTemperature(double temperature, String fromUnit, String toUnit) {
        if (fromUnit.equalsIgnoreCase("celsius") && toUnit.equalsIgnoreCase("fahrenheit")) {
            return (temperature * 9 / 5) + 32;
        } else if (fromUnit.equalsIgnoreCase("fahrenheit") && toUnit.equalsIgnoreCase("celsius")) {
            return (temperature - 32) * 5 / 9;
        } else if (fromUnit.equalsIgnoreCase("celsius") && toUnit.equalsIgnoreCase("kelvin")) {
            return temperature + 273.15;
        } else if (fromUnit.equalsIgnoreCase("kelvin") && toUnit.equalsIgnoreCase("celsius")) {
            return temperature - 273.15;
        } else if (fromUnit.equalsIgnoreCase("fahrenheit") && toUnit.equalsIgnoreCase("kelvin")) {
            return (temperature + 459.67) * 5 / 9;
        } else if (fromUnit.equalsIgnoreCase("kelvin") && toUnit.equalsIgnoreCase("fahrenheit")) {
            return temperature * 9 / 5 - 459.67;
        } else {
            System.out.println("Invalid temperature units!");
            return 0;
        }
    }

    public static double convertTemperature(double temperature, String fromUnit) {
        return convertTemperature(temperature,fromUnit, "celsius");
    }

    public static void main(String[] args) {

        double celsius = 14.0;
        double fahrenheit = convertTemperature(celsius, "celsius", "fahrenheit");
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");

        double kelvin = convertTemperature(celsius, "celsius", "kelvin");
        System.out.println(celsius + " degrees Celsius is equal to " + kelvin + " degrees Kelvin.");

        double newCelsius = convertTemperature(fahrenheit, "fahrenheit", "celsius");
        System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + newCelsius + " degrees Celsius.");

        double newKelvin = convertTemperature(kelvin, "kelvin");
        System.out.println(kelvin + " degrees Kelvin is equal to " + newKelvin + " degrees Celsius.");
    }
}
