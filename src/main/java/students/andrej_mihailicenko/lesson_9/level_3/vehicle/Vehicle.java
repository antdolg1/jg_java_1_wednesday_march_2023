package students.andrej_mihailicenko.lesson_9.level_3.vehicle;

abstract class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public int getYear(){
        return year;
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public void setBrand(){
        this.brand = brand;
    }

    public void setModel(){
        this.model = model;
    }

    public void setYear(){
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
