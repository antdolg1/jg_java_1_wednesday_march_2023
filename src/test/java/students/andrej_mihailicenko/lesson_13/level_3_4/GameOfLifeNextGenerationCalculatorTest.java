package students.andrej_mihailicenko.lesson_13.level_3_4;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class GameOfLifeNextGenerationCalculatorTest {

    @Test
    public void cellWithAllFalseAround() {

        boolean[][] currentGeneration = {
                {false, false, false},
                {false, true, false},
                {false, false, false}
        };

        boolean[][] expectedGeneration = {
                {false, false, false},
                {false, false, false},
                {false, false, false}
        };

        boolean[][] actualGeneration = GameOfLifeNextGenerationCalculator.calculate(currentGeneration);

        Assertions.assertArrayEquals(expectedGeneration, actualGeneration);
    }

    @Test
    public void cellWithTwoAliveAround() {

        boolean[][] currentGeneration = {
                {false, true, false},
                {false, true, false},
                {false, true, false}
        };

        boolean[][] expectedGeneration = {
                {false, false, false},
                {true, true, true},
                {false, false, false}
        };

        boolean[][] actualGeneration = GameOfLifeNextGenerationCalculator.calculate(currentGeneration);

        Assertions.assertArrayEquals(expectedGeneration, actualGeneration);
    }

    @Test
    public void cellWithThreeAliveAround() {

        boolean[][] currentGeneration = {

                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, true, false, false, false, false, false, false, false},
                {false, false, true, true, false, false, false, false, false, false},
                {false, false, true, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false}
        };

        boolean[][] expectedGeneration = {

                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, true, true, false, false, false, false, false, false},
                {false, true, true, true, false, false, false, false, false, false},
                {false, false, true, true, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false}

        };

        boolean[][] actualGeneration = GameOfLifeNextGenerationCalculator.calculate(currentGeneration);

        Assertions.assertArrayEquals(expectedGeneration, actualGeneration);

    }

    @Test
    public void cellWithMoreThanThreeAround() {

        boolean[][] currentGeneration = {

                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, true, false, false, false, false, false},
                {false, false, false, true, true, true, false, false, false, false},
                {false, false, false, false, true, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false}
        };

        boolean[][] expectedGeneration = {

                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, true, true, true, false, false, false, false},
                {false, false, false, true, false, true, false, false, false, false},
                {false, false, false, true, true, true, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false}

        };

        boolean[][] actualGeneration = GameOfLifeNextGenerationCalculator.calculate(currentGeneration);

        Assertions.assertArrayEquals(expectedGeneration, actualGeneration);

    }

    @Test
    public void deadCellWithThreeAliveAround() {

        boolean[][] currentGeneration = {

                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, true, false, false, false, false, false, false},
                {false, false, true, false, false, false, false, false, false, false},
                {false, false, false, true, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false}

        };

        boolean[][] expectedGeneration = {

                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, true, true, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false}

        };

        boolean[][] actualGeneration = GameOfLifeNextGenerationCalculator.calculate(currentGeneration);

        Assertions.assertArrayEquals(expectedGeneration, actualGeneration);

    }
}
