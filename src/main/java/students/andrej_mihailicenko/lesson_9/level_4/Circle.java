package students.andrej_mihailicenko.lesson_9.level_4;

import java.text.DecimalFormat;

class Circle extends Shape {

    private double radius;
    final double pi = Math.PI;

    Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        double circleArea = pi * (Math.pow(radius, 2));
        return formatNumber(circleArea);
    }

    @Override
    double calculatePerimeter() {
        double circlePerimeter = 2 * pi * radius;
        return formatNumber(circlePerimeter);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=" + pi +
                '}';
    }

    private double formatNumber(double number) {
        DecimalFormat df = new DecimalFormat("#.#");
        return Double.parseDouble(df.format(number));
    }
}
