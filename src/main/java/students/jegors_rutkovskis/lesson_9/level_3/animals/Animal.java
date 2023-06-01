package students.jegors_rutkovskis.lesson_9.level_3.animals;

abstract class Animal {
    private String kind;

    Animal(String kind) {
        this.kind = kind;
    }
    abstract String makeSound();
}
