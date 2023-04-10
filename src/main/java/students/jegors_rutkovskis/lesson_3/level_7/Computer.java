package students.jegors_rutkovskis.lesson_3.level_7;

class Computer {
    private String manufacturer;
    private String model;

    Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }
}
