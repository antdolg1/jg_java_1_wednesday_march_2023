package teacher.lesson_9.lessoncode.abstraction;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started!");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped!");
    }
}
