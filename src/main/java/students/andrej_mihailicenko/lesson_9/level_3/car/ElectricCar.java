package students.andrej_mihailicenko.lesson_9.level_3.car;

class ElectricCar extends Car {

    private int batteryCharge;

    public ElectricCar(int batteryCharge){
        super();
        this.batteryCharge = batteryCharge;
    }

    @Override
    void accelerate() {
        System.out.println("Electric car accelerating");
        batteryCharge--;
    }
}
