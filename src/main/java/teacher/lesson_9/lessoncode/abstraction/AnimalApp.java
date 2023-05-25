package teacher.lesson_9.lessoncode.abstraction;

public class AnimalApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Sharik");
        dog.makeSound();
        dog.sleep();

        Cat cat = new Cat("Simka");
        cat.makeSound();
        cat.sleep();
    }
}
