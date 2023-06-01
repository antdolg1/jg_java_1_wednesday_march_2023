package students.jegors_rutkovskis.lesson_9.level_4_5.shapes;

class Triangle extends Shape {
    private double side;

    Triangle(String title, double side) {
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

    @Override
    public String toString() {
        return "Triangle [" +
                "side=" + side +
                "] " + super.toString();
    }
}
