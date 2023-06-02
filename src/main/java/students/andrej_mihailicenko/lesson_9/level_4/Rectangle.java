package students.andrej_mihailicenko.lesson_9.level_4;

import java.text.DecimalFormat;

class Rectangle extends Shape {
    private double width;
    private double length;
    private double diagonal;

    Rectangle(String title, double width, double length) {
        super(title);
        this.width = width;
        this.length = length;
    }

    Rectangle(double length, double diagonal, String title) {
        super(title);
        this.width = width;
        this.length = length;
        this.diagonal = diagonal;
    }

    @Override
    double calculateArea() {
        if (length != 0 && width != 0) {
            return formatNumber(length * width);
        } else if (length != 0 && diagonal != 0) {
            double side2 = Math.sqrt(Math.pow(diagonal, 2) - Math.pow(length, 2));
            return formatNumber(length * side2);
        } else {
            return 0;
        }
    }

    @Override
    double calculatePerimeter() {
        if (length != 0 && width != 0) {
            return formatNumber(2 * (length + width));
        } else if (length != 0 && diagonal != 0) {
            double side2 = Math.sqrt(Math.pow(diagonal, 2) - Math.pow(length, 2));
            return formatNumber(2 * (length + side2));
        } else {
            return 0;
        }
    }

    private double formatNumber(double number) {
        DecimalFormat df = new DecimalFormat("#.#");
        return Double.parseDouble(df.format(number));
    }
}
