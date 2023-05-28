package students.jegors_rutkovskis.lesson_9.level_3.animals;

class Snake extends Animal {
    private String name;

    Snake(String name, String kind) {
        super(kind);
        this.name = name;
    }
    @Override
    String makeSound() {
        return "Tsss";
    }
}
