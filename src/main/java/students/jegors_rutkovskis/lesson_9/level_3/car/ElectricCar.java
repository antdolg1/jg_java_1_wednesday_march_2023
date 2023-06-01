package students.jegors_rutkovskis.lesson_9.level_3.car;

class ElectricCar extends Car {
    private int batteryCharge;
    @Override
    void accelerate() {
        batteryCharge--;
    }
}
