package students.edmund_zukovskis.lesson_9.level_4_5;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {

    @Test
    public void calculateAreaTest() {
        Circle circle = new Circle(5);
        double expectedArea = Math.PI * Math.pow(5, 2);
        double actualArea = circle.calculateArea();
        double DELTA = 0.0001;
        assertEquals(expectedArea, actualArea, DELTA);
    }

    @Test
    public void calculatePerimeterTest() {
        Circle circle = new Circle(5);
        double expectedPerimeter = 2 * Math.PI * 5;
        double actualPerimeter = circle.calculatePerimeter();
        double DELTA = 0.0001;
        assertEquals(expectedPerimeter, actualPerimeter, DELTA);
    }
}
