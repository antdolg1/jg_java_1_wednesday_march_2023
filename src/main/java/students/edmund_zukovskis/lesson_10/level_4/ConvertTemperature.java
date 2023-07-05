package students.edmund_zukovskis.lesson_10.level_4;

public class ConvertTemperature {

    public static double convertTemperature(double temperature, String fromUnit, String toUnit) {
        if (fromUnit.equalsIgnoreCase("celsius") && toUnit.equalsIgnoreCase("kelvin")) {
            return temperature + 273.15;
        } else if (fromUnit.equalsIgnoreCase("celsius") && toUnit.equalsIgnoreCase("fahrenheit")) {
            return (temperature * 9 / 5) + 32;
        } else {
            System.out.println("Invalid temperature units!");
            return 0;
        }
    }

    public static void main(String[] args) {

        double celsius = 15.0;
        double fahrenheit = convertTemperature(celsius, "celsius", "fahrenheit");
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");

        double kelvin = convertTemperature(celsius, "celsius", "kelvin");
        System.out.println(celsius + " degrees Celsius is equal to " + kelvin + " degrees Kelvin.");
    }
}
