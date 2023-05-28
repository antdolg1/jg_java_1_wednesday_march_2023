package students.jegors_rutkovskis.lesson_9.level_4_5.shapes;

class Rectangle extends Shape {
    private double sideA;
    private double sideB;

    Rectangle(String title, double sideA, double sideB) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
    }


    @Override
    double calculateArea() {
        return sideA * sideB;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (sideA + sideB);
    }

    @Override
    public String toString() {
        return "Rectangle [" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                "] " + super.toString();
    }
}
