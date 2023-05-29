package students.edmund_zukovskis.lesson_9.level_4_5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {

    private final double DELTA = 0.0001;

    @Test
    public void calculateAreaTest() {
        Square square = new Square(5);
        double expectedArea = 25;
        double actualArea = square.calculateArea();
        assertEquals(expectedArea, actualArea, DELTA);
    }

    @Test
    public void calculatePerimeterTest() {
        Square square = new Square(5);
        double expectedPerimeter = 20;
        double actualPerimeter = square.calculatePerimeter();
        assertEquals(expectedPerimeter, actualPerimeter, DELTA);
    }
}
