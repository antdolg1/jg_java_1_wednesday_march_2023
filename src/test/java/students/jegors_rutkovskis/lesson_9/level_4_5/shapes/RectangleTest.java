package students.jegors_rutkovskis.lesson_9.level_4_5.shapes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    private Shape rectangle;
    double delta = 0.01;
    @BeforeEach
    void setUp() {
        rectangle = new Rectangle("Rectangle", 5, 10);
    }

    @Test
    void calculateArea() {
        assertEquals(50, rectangle.calculateArea(), delta);
    }

    @Test
    void calculatePerimeter() {
        assertEquals(30, rectangle.calculatePerimeter(), delta);
    }
}