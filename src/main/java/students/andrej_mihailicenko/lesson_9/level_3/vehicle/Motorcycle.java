package students.andrej_mihailicenko.lesson_9.level_3.vehicle;

class Motorcycle extends Vehicle {
    private int wheelsNumber;

    public Motorcycle(String brand, String model, int year, int wheelsNumber) {
        super(brand, model, year);
        this.wheelsNumber = wheelsNumber;
    }

    public int getWheelsNumber(){
        return wheelsNumber;
    }

    public void setWheelsNumber(){
        this.wheelsNumber = wheelsNumber;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() +
                ", wheelsNumber=" + wheelsNumber +
                '}';
    }
}
