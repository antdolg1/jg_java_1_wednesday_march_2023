package teacher.lesson_9.lessoncode.abstraction;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " Meow meow!");
    }
}
