package students.andrej_mihailicenko.lesson_9.level_4;

import java.text.DecimalFormat;

class Triangle extends Shape {
    private double sideLength;

    Triangle(String title, double sideLength) {
        super(title);
        this.sideLength = sideLength;
    }

    @Override
    double calculateArea() {
        double triangleArea = (sideLength * sideLength * Math.sqrt(3) / 4);
        return formatNumber(triangleArea);
    }

    @Override
    double calculatePerimeter() {
        double trianglePerimeter = (sideLength * 3);
        return formatNumber(trianglePerimeter);
    }

    private double formatNumber(double number) {
        DecimalFormat df = new DecimalFormat("#.#");
        return Double.parseDouble(df.format(number));
    }
}
