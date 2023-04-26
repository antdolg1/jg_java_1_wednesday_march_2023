package students.pavels_serikovs.lesson_3.level_7.task_29;

public class MotorBike {
    String bikeBrand;
    int bikeEngineSize;
    int bikeFuelCapacity;

    MotorBike(String brand, int engineSize, int fuelCapacity) {
        this.bikeBrand = brand;
        this.bikeEngineSize = engineSize;
        this.bikeFuelCapacity = fuelCapacity;
    }

    String getBikeBrand() {
        return this.bikeBrand;
    }

    public int getBikeEngineSize() {
        return bikeEngineSize;
    }

    public int getBikeFuelCapacity() {

        return bikeFuelCapacity;
    }
}
