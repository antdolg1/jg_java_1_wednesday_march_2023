package students.andrej_mihailicenko.lesson_15.level_2;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class QuadraticEqTest {

    @Test
    public void calcTest() {
        QuadraticEq quadraticEq = new QuadraticEq();

        quadraticEq.calc(1, -3, 2);
        quadraticEq.calc(1, -2, 1);
        quadraticEq.calc(1, 1, 1);

    }

    @Test
    public void discriminantGreaterThanZero() {
        QuadraticEq quadraticEq = new QuadraticEq();
        String expected = "x1 = " + -1.0 + ", x2 = " + 5.0;
        String actual = quadraticEq.calc(1, -4, -5);
        assertEquals(expected, actual);

    }

    @Test
    public void discriminantEqualsZero() {
        QuadraticEq quadraticEq = new QuadraticEq();
        String expected = "x = " + 3.0;
        String actual = quadraticEq.calc(1,-6,9);
        assertEquals(expected, actual);

    }

    @Test
    public void discriminantLessThanZero() {
        QuadraticEq quadraticEq = new QuadraticEq();
        String expected = "Equation has no roots";
        String actual = quadraticEq.calc(3,-4,2);
        assertEquals(expected, actual);

    }
}