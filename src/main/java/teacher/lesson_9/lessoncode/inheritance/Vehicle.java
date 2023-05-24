package teacher.lesson_9.lessoncode.inheritance;

public class Vehicle {
    private int wheels;

    public Vehicle(int wheels) {
        this.wheels = wheels;
    }

    public void move() {
        System.out.println("The vehicle is moving.");
    }

    public int getWheels() {
        return wheels;
    }
}
