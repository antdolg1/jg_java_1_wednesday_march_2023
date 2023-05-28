package students.jegors_rutkovskis.lesson_9.level_4_5.shapes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CircleTest {
    private Shape circle;
    double delta = 0.01;
    @BeforeEach
    void setUp() {
       circle = new Circle("Circle", 7.0);
    }

    @Test
    void calculateArea() {
        assertEquals(153.94, circle.calculateArea(), delta);
    }

    @Test
    void calculatePerimeter() {
        assertEquals(43.98, circle.calculatePerimeter(), delta);
    }
}