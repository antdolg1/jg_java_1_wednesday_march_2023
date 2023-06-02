package students.andrej_mihailicenko.lesson_9.level_4;

import java.text.DecimalFormat;

class Square extends Shape {
    private double side;

    Square(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    double calculateArea() {
        double squareArea = side * side;
        return formatNumber(squareArea);
    }

    @Override
    double calculatePerimeter() {
        double squarePerimeter = 4 * side;
        return formatNumber(squarePerimeter);
    }

    private double formatNumber(double number) {
        DecimalFormat df = new DecimalFormat("#.#");
        return Double.parseDouble(df.format(number));
    }
}
