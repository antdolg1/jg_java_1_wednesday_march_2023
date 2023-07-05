package students.igors_gergeleziu.lesson_9.level_4_and_level_5;

import java.util.Random;

class ShapeUtil {
    Shape createRandomShape() {
        Random random = new Random();
        int randomNumber = random.nextInt(4);
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

    double calculateArea(Shape[] shapes) {
        double sumArea = 0;
        for (Shape shape : shapes) {
            sumArea += shape.calculateArea();
        }
        return sumArea;
    }
    double calculatePerimeter(Shape[] shapes){
        double sumPerimeter = 0;
        for (Shape shape : shapes) {
            sumPerimeter += shape.calculatePerimeter();
        }
        return sumPerimeter;
    }
    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

    Circle createRandomCircle() {
        Random random = new Random();
        Circle circle = new Circle(random.nextInt(101), "Circle");
        return circle;
    }

    Square createRandomSquare() {
        Random random = new Random();
        Square square = new Square(random.nextInt(101), "Square");
        return square;
    }

    Rectangle createRandomRectangle() {
        Random random = new Random();
        Rectangle rectangle = new Rectangle(random.nextInt(101), random.nextInt(101), "Rectangle");
        return rectangle;
    }

    Triangle createRandomTriangle() {
        Random random = new Random();
        Triangle triangle = new Triangle(random.nextInt(101), "Triangle");
        return triangle;
    }
}
