package students.andrej_mihailicenko.lesson_9.level_4;

import java.util.Random;

class ShapeUtil {

    Circle createRandomCircle() {
        Random random = new Random();
        double radius = random.nextDouble();
        return new Circle("Cirkle", radius);
    }

    Square createRandomSquare() {
        Random random = new Random();
        double side = random.nextDouble();
        return new Square("Square", side);
    }

    Rectangle createRandomRectangle() {
        Random random = new Random();
        double width = random.nextDouble();
        double length = random.nextDouble();
        return new Rectangle("Rectangle", width, length);
    }

    Rectangle createRandomRectangleWithDiagonal() {
        Random random = new Random();
        double length = random.nextDouble();
        double diagonal = random.nextDouble();
        return new Rectangle(length, diagonal, "Diagonal Rectangle");
    }

    Triangle createRandomTriangle() {
        Random random = new Random();
        double sideLength = random.nextDouble();
        return new Triangle("Triangle", sideLength);
    }

    Shape createRandomShape() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(5);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else if (randomNumber == 2) {
            return createRandomRectangle();
        } else if (randomNumber == 3) {
            return createRandomRectangleWithDiagonal();
        } else {
            return createRandomTriangle();
        }
    }

    double calculateArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }

    double calculatePerimeter(Shape[] shapes) {
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