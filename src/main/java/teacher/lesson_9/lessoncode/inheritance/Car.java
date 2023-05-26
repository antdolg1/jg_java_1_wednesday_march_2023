package teacher.lesson_9.lessoncode.inheritance;

public class Car extends Vehicle {
    private String brand;

    public Car(int wheels, String brand) {
        super(wheels);
        this.brand = brand;
    }

    public void startEngine() {
        System.out.println("The " + brand + " car's engine is is started.");
    }
}
