package students.jegors_rutkovskis.lesson_9.level_3.animals;

class Cat extends Animal {
    private String name;

    Cat(String name, String kind) {
        super(kind);
        this.name = name;
    }

    @Override
    String makeSound() {
        return "Meow";
    }
}
