package students.jegors_rutkovskis.lesson_9.level_3.car;

class PetrolCar extends Car {
    private double petrolTankCapacity;

    @Override
    void accelerate() {
        petrolTankCapacity--;
    }
}
