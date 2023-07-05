package students.igors_gergeleziu.lesson_9.level_2;

class Child extends Father{
    private String name;

    public Child(String eyesColor, String surname, boolean badHabits, boolean conciseness, String name) {
        super(eyesColor, surname, badHabits, conciseness);
        this.name = name;
    }
}
