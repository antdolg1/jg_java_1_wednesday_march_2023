package students.jegors_rutkovskis.lesson_9.level_4_5.shapes;

import java.util.Random;

class ShapeUtil {
    Random random = new Random();
    Circle createRandomCircle() {
        return new Circle("Circle", random.nextDouble(1, 10));
    }

    Square createRandomSquare() {
        return new Square("Square", random.nextDouble(1, 10));
    }

    Rectangle createRandomRectangle() {
        double sideA = random.nextDouble(1, 20);
        double sideB = random.nextDouble(1, 20);
        return new Rectangle("Rectangle", sideA, sideB);
    }

    Triangle createRandomTriangle() {
        return new Triangle("Triangle", random.nextDouble(1, 20));
    }

    Shape createRandomShape() {
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
        double sumOfShapesAreas = 0;
        for (Shape shape : shapes) {
            sumOfShapesAreas += shape.calculateArea();
        }
        return sumOfShapesAreas;
    }

    double calculatePerimeter(Shape[] shapes) {
        double sumOfShapesPerimeters = 0;
        for (Shape shape : shapes) {
            sumOfShapesPerimeters += shape.calculatePerimeter();
        }
        return sumOfShapesPerimeters;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}
