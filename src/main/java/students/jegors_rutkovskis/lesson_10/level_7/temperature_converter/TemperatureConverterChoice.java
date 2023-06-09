package students.jegors_rutkovskis.lesson_10.level_7.temperature_converter;

class TemperatureConverterChoice {

    TemperatureConverter convert(Scale from, Scale to) {
        switch (from) {
            case CELSIUS -> {
                return switch (to) {
                    case CELSIUS -> new CelsiusToCelsius();
                    case FAHRENHEIT -> new CelsiusToFahrenheit();
                    case KELVIN -> new CelsiusToKelvin();
                };
            }
            case FAHRENHEIT -> {
                return switch (to) {
                    case FAHRENHEIT -> new FahrenheitToFahrenheit();
                    case KELVIN -> new FahrenheitToKelvin();
                    case CELSIUS -> new FahrenheitToCelsius();
                };
            }
            case KELVIN -> {
                return switch (to) {
                    case KELVIN -> new KelvinToKelvin();
                    case FAHRENHEIT -> new KelvinToFahrenheit();
                    case CELSIUS -> new KelvinToCelsius();
                };
            }
        }
        return null;
    }

//    TemperatureConverter convert(Scale from, Scale to) {
//        if (from == Scale.CELSIUS && to == Scale.CELSIUS) {
//            return new CelsiusToCelsius();
//        }
//        if (from == Scale.CELSIUS && to == Scale.FAHRENHEIT) {
//            return new CelsiusToFahrenheit();
//        }
//        if (from == Scale.CELSIUS && to == Scale.KELVIN) {
//            return new CelsiusToKelvin();
//        }
//        if (from == Scale.FAHRENHEIT && to == Scale.FAHRENHEIT) {
//            return new FahrenheitToFahrenheit();
//        }
//        if (from == Scale.FAHRENHEIT && to == Scale.KELVIN) {
//            return new FahrenheitToKelvin();
//        }
//        if (from == Scale.FAHRENHEIT && to == Scale.CELSIUS) {
//            return new FahrenheitToCelsius();
//        }
//        if (from == Scale.KELVIN && to == Scale.KELVIN) {
//            return new KelvinToKelvin();
//        }
//        if (from == Scale.KELVIN && to == Scale.FAHRENHEIT) {
//            return new KelvinToFahrenheit();
//        }
//        if (from == Scale.KELVIN && to == Scale.CELSIUS) {
//            return new KelvinToCelsius();
//        }
//        return null;
//    }
}
