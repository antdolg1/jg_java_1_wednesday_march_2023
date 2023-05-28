package students.jegors_rutkovskis.lesson_9.level_4_5.shapes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShapeUtilTest {

    private ShapeUtil shapeUtil;
    private Shape[] shapes;

    @BeforeEach
    public void setUp() {
        shapeUtil = new ShapeUtil();
        shapes = new Shape[4];
        shapes[0] = new Circle("Circle", 4);
        shapes[1] = new Square("Square", 4);
        shapes[2] = new Rectangle("Rectangle", 4, 4);
        shapes[3] = new Triangle("Triangle", 4);
    }

    @Test
    public void shouldCalculateShapesAreas() {
        assertEquals(89.19, shapeUtil.calculateArea(shapes), 0.01);
    }

    @Test
    public void shouldCalculateShapesPerimeters() {
        assertEquals(69.13, shapeUtil.calculatePerimeter(shapes), 0.01);
    }
}