package students.jegors_rutkovskis.lesson_9.level_4_5.shapes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    private Shape triangle;
    double delta = 0.01;

    @BeforeEach
    void setUp() {
        triangle = new Triangle("Triangle", 5);
    }

    @Test
    void calculateArea() {
        assertEquals(10.83, triangle.calculateArea(), delta);
    }

    @Test
    void calculatePerimeter() {
        assertEquals(15, triangle.calculatePerimeter());
    }
}