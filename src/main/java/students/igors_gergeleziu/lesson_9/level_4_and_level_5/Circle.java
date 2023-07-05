package students.igors_gergeleziu.lesson_9.level_4_and_level_5;

class Circle extends Shape {
    private double radius;

    Circle(double radius, String title) {
        super(title);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
