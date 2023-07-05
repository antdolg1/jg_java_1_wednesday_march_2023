package students.igors_gergeleziu.lesson_9.level_5;

abstract class Shape {
    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();
}
