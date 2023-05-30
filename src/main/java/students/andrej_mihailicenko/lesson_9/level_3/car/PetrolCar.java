package students.andrej_mihailicenko.lesson_9.level_3.car;

class PetrolCar extends Car {

    private double petrolTankCapacity;

    public PetrolCar(double petrolTankCapacity){
        super();
        this.petrolTankCapacity = petrolTankCapacity;
    }
    @Override
    void accelerate() {
        System.out.println("Petrol car accelerating");
        petrolTankCapacity--;
    }
}
