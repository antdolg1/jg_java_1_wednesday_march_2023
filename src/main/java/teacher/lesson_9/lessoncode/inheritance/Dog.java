package teacher.lesson_9.lessoncode.inheritance;

public class Dog extends Animal {
    public String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void wagTail() {
        System.out.println(getName() + " is wagging its tail.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " is barking. Woof woof!");
    }
}
