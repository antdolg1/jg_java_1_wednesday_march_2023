package teacher.lesson_9.lessoncode.abstraction;

public interface Vehicle {
    void start();

    void stop();

    default void honk() {
        System.out.println("Beep beep!");
    }
}
