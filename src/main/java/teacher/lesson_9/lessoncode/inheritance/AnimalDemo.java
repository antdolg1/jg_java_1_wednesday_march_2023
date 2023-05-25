package teacher.lesson_9.lessoncode.inheritance;

public class AnimalDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Jack", 3, "Labrador");
        dog.eat();
        dog.makeSound();
        dog.sleep();
        dog.wagTail();

        System.out.println();

        Cat cat = new Cat("Whiskas", 6, true);
        cat.eat();
        cat.makeSound();
        cat.sleep();
        cat.purr();
    }
}
