package students.jegors_rutkovskis.lesson_9.level_4_5.shapes;

abstract class Shape {
    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();

    @Override
    public String toString() {
        return "Shape [" +
                "title='" + title + '\'' +
                ']';
    }
}
