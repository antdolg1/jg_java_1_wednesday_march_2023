package students.edmund_zukovskis.lesson_9.level_4_5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    private final double DELTA = 0.0001;

    @Test
    public void testCalculateArea() {
        Triangle triangle = new Triangle(5);
        double expectedArea = Math.sqrt(3) * Math.pow(5, 2) / 4;
        double actualArea = triangle.calculateArea();
        assertEquals(expectedArea, actualArea, DELTA);
    }

    @Test
    public void testCalculatePerimeter() {
        Triangle triangle = new Triangle(5);
        double expectedPerimeter = 15;
        double actualPerimeter = triangle.calculatePerimeter();
        assertEquals(expectedPerimeter, actualPerimeter, DELTA);
    }
}
