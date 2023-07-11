package students.edmund_zukovskis.lesson_13.level_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GameOfLifeNextGenerationCalculatorTest {
    @Test
    void testUnderpopulation() {
        boolean[][] currentGeneration = {
                {false, false, false},
                {false, true, false},
                {false, false, false}
        };
        GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();
        boolean[][] nextGeneration = calculator.calculate(currentGeneration);
        Assertions.assertFalse(nextGeneration[1][1], "Cell is expected to die due to lack of neighbors");
    }

    @Test
    void testNoUnderpopulation() {
        boolean[][] currentGeneration = {
                {false, false, false},
                {true, true, true},
                {false, false, false}
        };
        GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();
        boolean[][] nextGeneration = calculator.calculate(currentGeneration);
        Assertions.assertTrue(nextGeneration[1][1], "The cell is expected to remain alive");
    }

    @Test
    void testOverpopulation() {
        boolean[][] currentGeneration = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();
        boolean[][] nextGeneration = calculator.calculate(currentGeneration);
        Assertions.assertFalse(nextGeneration[1][1], "The cell is expected to die due to overpopulation");
    }

    @Test
    void testNoOverpopulation() {
        boolean[][] currentGeneration = {
                {true, true, true},
                {false, true, false},
                {false, false, false}
        };
        GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();
        boolean[][] nextGeneration = calculator.calculate(currentGeneration);
        Assertions.assertTrue(nextGeneration[1][1], "The cell is expected to remain alive");
    }

    @Test
    void testSurvivalWithTwoNeighbors() {
        boolean[][] currentGeneration = {
                {false, false, false},
                {true, true, true},
                {false, false, false}
        };
        GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();
        boolean[][] nextGeneration = calculator.calculate(currentGeneration);
        Assertions.assertTrue(nextGeneration[1][1], "The cell is expected to remain alive");
    }

    @Test
    void testSurvivalWithThreeNeighbors() {
        boolean[][] currentGeneration = {
                {false, true, false},
                {true, true, true},
                {false, false, false}
        };
        GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();
        boolean[][] nextGeneration = calculator.calculate(currentGeneration);
        Assertions.assertTrue(nextGeneration[1][1], "The cell is expected to remain alive");
    }

    @Test
    void testDeadCellRevivalWithThreeNeighbors() {
        boolean[][] currentGeneration = {
                {false, true, false},
                {true, false, true},
                {false, false, false}
        };
        GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();
        boolean[][] nextGeneration = calculator.calculate(currentGeneration);

        Assertions.assertTrue(nextGeneration[1][1], "A dead cell is expected to come to life");
    }

    @Test
    void testNoRevivalWithTwoNeighbors() {
        boolean[][] currentGeneration = {
                {false, true, false},
                {true, false, true},
                {false, false, false}
        };
        GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();
        boolean[][] nextGeneration = calculator.calculate(currentGeneration);
        Assertions.assertFalse(nextGeneration[0][0], "A dead cell is not expected to come to life");
    }
    
}