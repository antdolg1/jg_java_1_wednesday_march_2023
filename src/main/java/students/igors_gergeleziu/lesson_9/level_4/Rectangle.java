package students.igors_gergeleziu.lesson_9.level_4;

class Rectangle extends Shape {
    private int sideOne;
    private int sideTwo;

    public Rectangle(int sideOne, int sideTwo, String title) {
        super(title);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    double calculateArea() {
        return sideOne * sideTwo;
    }

    @Override
    double calculatePerimeter() {
        return 2 * sideOne + 2 * sideTwo;
    }
}
