package students.andrej_mihailicenko.lesson_9.level_3.vehicle;


public class VehicleApp {
    public static void main(String[] args) {
        Car car = new Car("BMW", "e90", 2007, 4);
        System.out.println(car);

        Motorcycle motorcycle = new Motorcycle("Yamaha", "r6", 2005, 2);
        System.out.println(motorcycle);
    }
}
