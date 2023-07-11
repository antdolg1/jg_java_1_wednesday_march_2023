package students.edmund_zukovskis.lesson_9.level_4_5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    private final double DELTA = 0.0001;

    @Test
    public void testCalculateArea() {
        Rectangle rectangle = new Rectangle(5, 10);
        double expectedArea = 50;
        double actualArea = rectangle.calculateArea();
        assertEquals(expectedArea, actualArea, DELTA);
    }

    @Test
    public void testCalculatePerimeter() {
        Rectangle rectangle = new Rectangle(5, 10);
        double expectedPerimeter = 30;
        double actualPerimeter = rectangle.calculatePerimeter();
        assertEquals(expectedPerimeter, actualPerimeter, DELTA);
    }
}
