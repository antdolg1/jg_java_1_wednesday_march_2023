package students.edmund_zukovskis.lesson_9.level_4_5;

import java.util.Random;

public class ShapeUtil {

    public Circle createRandomCircle() {
        Random r = new Random();
        double radius = r.nextDouble() * 10;
        return new Circle(radius);
    }

    public Square createRandomSquare() {
        Random r = new Random();
        double side = r.nextDouble() * 10;
        return new Square(side);
    }

    public Rectangle createRandomRectangle() {
        Random r = new Random();
        double width = r.nextDouble() * 10;
        double length = r.nextDouble() * 10;
        return new Rectangle(width, length);
    }

    public Triangle createRandomTriangle() {
        Random r = new Random();
        double side = r.nextDouble() * 10;
        return new Triangle(side);
    }

    Shape createRadnomShape() {
        Random r = new Random();
        int randomNumber = r.nextInt(4);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else if (randomNumber == 2) {
            return createRandomRectangle();
        } else {
            return createRandomTriangle();
        }
    }

    public static double calculateArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }

    public static double calculatePerimeter(Shape[] shapes) {
        double totalPerimeter = 0;
        for (Shape shape : shapes) {
            totalPerimeter += shape.calculatePerimeter();
        }
        return totalPerimeter;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}
