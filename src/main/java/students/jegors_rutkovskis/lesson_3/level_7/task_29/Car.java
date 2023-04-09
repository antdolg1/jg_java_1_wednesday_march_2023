package students.jegors_rutkovskis.lesson_3.level_7.task_29;

class Car {
    private String carBrand;
    private String carColor;
    private int fuelTank;
    private static final int MAX_FUEL_IN_TANK = 20;
    private int maxSpeed;
    private int currentSpeed;

    Car(String carBrand, String carColor, int maxSpeed) {
        this.carBrand = carBrand;
        this.carColor = carColor;
        this.maxSpeed = maxSpeed;
        fuelTank = MAX_FUEL_IN_TANK;
        currentSpeed = 0;
    }
    void accelerate(int speed){
        if (currentSpeed + speed <= maxSpeed){
            currentSpeed += speed;
            System.out.println(currentSpeed());
        }
        else {
            System.err.println("it is impossible to accelerate " +
                    "because the maximum speed has been reached");
        }
        decreaseFuel();
    }
    void brake(){
        currentSpeed = 0;
        System.out.println("Car is stopped...");
    }
    String currentSpeed(){
        return "Current speed is "
                + currentSpeed + "km/h";
    }
    String fuelStatus(){
        String status = "Fuel in tank now is "
                + fuelTank + "/" + MAX_FUEL_IN_TANK
                + " liters.";
        return status;
    }
    void refuel(int liters){
        int availableSpace = MAX_FUEL_IN_TANK - fuelTank;
        if (liters > availableSpace){
            fuelTank = MAX_FUEL_IN_TANK;
            System.out.println("Tank is full. Filled only " + (availableSpace) + " liters!");
            System.out.println(fuelStatus());
        }
        else {
            fuelTank += liters;
            System.out.println("You filled " + liters + " liters!");
            System.out.println(fuelStatus());
        }
    }
    void printCarState(){
        System.out.println("   **********");
        System.out.println(carColor + " " + carBrand);
        System.out.println(fuelStatus());
        System.out.println(currentSpeed());
        System.out.println("Maximal speed for this model is " + maxSpeed + "km/h");
        System.out.println("   **********");
    }
    void decreaseFuel(){
        fuelTank -= 5;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
}
