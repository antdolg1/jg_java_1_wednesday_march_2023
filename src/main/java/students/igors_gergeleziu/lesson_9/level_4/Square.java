package students.igors_gergeleziu.lesson_9.level_4;

class Square extends Shape {
    private int side;

    public Square(int side, String title) {
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
}
