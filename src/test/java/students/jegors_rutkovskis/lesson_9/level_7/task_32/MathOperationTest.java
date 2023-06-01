package students.jegors_rutkovskis.lesson_9.level_7.task_32;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathOperationTest {
    private MathOperation addition, subtraction,
            multiply, division1, division2;
    private Argument arg0, arg1, arg2, arg3, arg4;
    private double delta = 0.01;

    @BeforeEach
    public void setUp() {
        arg0 = new Argument(5);
        arg1 = new Argument(10);
        arg2 = new Argument(20);
        arg3 = new Argument(30);
        arg4 = new Argument(40);
    }

    @Test // 10 + 20 = 30
    public void Addition() {
        addition = new Addition(arg1, arg2);
        assertEquals(30, addition.calculate(), delta);
    }
    @Test // 30 / 10 = 3
    public void Division() {
        division1 = new Division(arg3, arg1);
        assertEquals(3, division1.calculate(), delta);
    }

    @Test // (30 / 10) + (40 / 20) = 5
    public void TwoDivisionsWithFinalAddition() {
        division1 = new Division(arg3, arg1);
        division2 = new Division(arg4, arg2);
        addition = new Addition(division1, division2);
        assertEquals(5, addition.calculate(), delta);
    }

    @Test //(10 - 5) * (20 / 5) = 20
    public void subtractionDivisionWithFinalMultiplication() {
        subtraction = new Subtraction(arg1, arg0);
        division1 = new Division(arg2, arg0);
        multiply = new Multiply(subtraction, division1);
        assertEquals(20, multiply.calculate(), delta);
    }
}