package students.jegors_rutkovskis.lesson_9.level_4_5.shapes;

class Square extends Shape {
    private double side;
    Square(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return Math.pow(side, 2);
    }

    @Override
    double calculatePerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square [" +
                "side=" + side +
                "] " + super.toString();
    }
}
