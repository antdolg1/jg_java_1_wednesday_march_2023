package students.jegors_rutkovskis.lesson_10.level_7.temperature_converter;

enum Scale {
    CELSIUS("°C"),
    KELVIN("K"),
    FAHRENHEIT("F");

    private final String name;

    Scale(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}
