package students.edmund_zukovskis.lesson_9.level_4_5;

class Triangle extends Shape {

    private double side;

    Triangle(double side) {
        super("Triangle");
        this.side = side;
    }


    @Override
    double calculateArea() {
        return Math.sqrt(3) * Math.pow(side, 2) / 4;
    }

    @Override
    double calculatePerimeter() {
        return 3 * side;
    }
}
