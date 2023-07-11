package students.edmund_zukovskis.lesson_9.level_4_5;

class Square extends Shape {

    private double side;

    Square(double side) {
        super("Square");
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }

    @Override
    double calculatePerimeter() {
        return 4 * side;
    }
}
