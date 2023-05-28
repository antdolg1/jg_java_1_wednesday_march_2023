package students.jegors_rutkovskis.lesson_9.level_4_5.shapes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    private Shape square;
    double delta = 0.01;
    @BeforeEach
    void setUp() {
        square = new Square("Square", 5);
    }

    @Test
    void calculateArea() {
        assertEquals(25, square.calculateArea(), delta);
    }

    @Test
    void calculatePerimeter() {
        assertEquals(20, square.calculatePerimeter(), delta);
    }
}