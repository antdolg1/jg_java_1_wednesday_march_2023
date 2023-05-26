package teacher.lesson_9.lessoncode.inheritance;

public class Cat extends Animal {
    private boolean isIndoor;

    public Cat(String name, int age, boolean isIndoor) {
        super(name, age);
        this.isIndoor = isIndoor;
    }

    public void purr() {
        System.out.println(getName() + " is purring.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " is meowing. Meow meow!");
    }
}
