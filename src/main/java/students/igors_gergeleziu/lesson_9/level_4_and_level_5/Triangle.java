package students.igors_gergeleziu.lesson_9.level_4_and_level_5;

class Triangle extends Shape {
    private int side;

    public Triangle(int side, String title) {
        super(title);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return (Math.pow(side, 2) * Math.sqrt(3)) / 4;
    }

    @Override
    double calculatePerimeter() {
        return 3 * side;
    }
}
