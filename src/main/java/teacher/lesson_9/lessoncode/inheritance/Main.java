package teacher.lesson_9.lessoncode.inheritance;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(4);
        vehicle.move();
        System.out.println("Number of wheels: " + vehicle.getWheels());

        Car car = new Car(4, "BMW");
        car.startEngine();
        car.move();
        System.out.println("Number of wheels: " + car.getWheels());
    }
}
