package students.edmund_zukovskis.lesson_9.level_4_5;

import org.junit.Test;
import org.junit.Assert;

public class ShapeUtilTest {

    @Test
    public void calculateAreaTest() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(4);
        shapes[1] = new Square(4);
        shapes[2] = new Rectangle(4, 4);
        shapes[3] = new Triangle(4);

        double expectedTotalArea = Math.PI * 4 * 4 + 4 * 4 + 4 * 4 + Math.sqrt(6) * 2 * 2;
        double actualTotalArea = shapeUtil.calculateArea(shapes);

        Assert.assertEquals(expectedTotalArea, actualTotalArea, 0.001);
    }

    @Test
    public void calculatePerimeterTest() {
        Circle circle = new Circle(1);
        Square square = new Square(2);
        Rectangle rectangle = new Rectangle(2, 3);
        Triangle triangle = new Triangle(3);

        Shape[] shapes = {circle, square, rectangle, triangle};
        double expectedPerimeter = 2 * Math.PI + 8 + 10 + 12;
        double actualPerimeter = ShapeUtil.calculatePerimeter(shapes);

        Assert.assertEquals(expectedPerimeter, actualPerimeter, 0.001);
    }
}
