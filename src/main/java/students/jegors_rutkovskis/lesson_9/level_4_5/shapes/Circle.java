package students.jegors_rutkovskis.lesson_9.level_4_5.shapes;

class Circle extends Shape {
    private double radius;
    Circle(String title, double radius) {
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

    @Override
    public String toString() {
        return "Circle [" +
                "radius=" + radius +
                "] " + super.toString();
    }
}
