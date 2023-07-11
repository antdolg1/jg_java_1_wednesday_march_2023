package students.andrej_mihailicenko.lesson_13.level_3_4;

class GameOfLifeNextGenerationCalculator {
    public static boolean[][] calculate(boolean[][] currentGeneration) {
        int rows = currentGeneration.length;
        int columns = currentGeneration[0].length;
        boolean[][] nextGeneration = new boolean[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int aliveNeighbors = countAliveNeighbors(currentGeneration, i, j);

                if (currentGeneration[i][j]) {
                    if (aliveNeighbors == 2 || aliveNeighbors == 3) {
                        nextGeneration[i][j] = true;
                    } else {
                        nextGeneration[i][j] = false;
                    }
                } else {
                    if (aliveNeighbors == 3) {
                        nextGeneration[i][j] = true;
                    } else {
                        nextGeneration[i][j] = false;
                    }
                }
            }
        }

        return nextGeneration;
    }

    private static int countAliveNeighbors(boolean[][] generation, int row, int col) {
        int count = 0;
        int rows = generation.length;
        int columns = generation[0].length;

        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i >= 0 && i < rows && j >= 0 && j < columns && generation[i][j]) {
                    if (i != row || j != col) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
