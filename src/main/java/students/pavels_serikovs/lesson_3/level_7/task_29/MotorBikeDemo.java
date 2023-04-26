package students.pavels_serikovs.lesson_3.level_7.task_29;

public class MotorBikeDemo {
    public static void main(String[] args) {
        MotorBike myBike = new MotorBike("Ducati", 1000, 20);
        String bikeBrand = myBike.getBikeBrand();
        int bikeEngineSize = myBike.getBikeEngineSize();
        int bikeFuelCapacity = myBike.getBikeFuelCapacity();
        System.out.println("There's new motorbike " + bikeBrand + ".");
        System.out.println("Engine size = " + bikeEngineSize + " cc." + " Fuel capacity = " + bikeFuelCapacity + " l.");
    }
}
