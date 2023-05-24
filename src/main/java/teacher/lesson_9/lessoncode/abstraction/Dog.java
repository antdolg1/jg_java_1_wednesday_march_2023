package teacher.lesson_9.lessoncode.abstraction;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " woof woof!!!");
    }
}
