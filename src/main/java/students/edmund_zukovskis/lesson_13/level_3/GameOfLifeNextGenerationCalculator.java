package students.edmund_zukovskis.lesson_13.level_3;

class GameOfLifeNextGenerationCalculator {
    public boolean[][] calculate(boolean[][] currentGeneration) {
        int rows = currentGeneration.length;
        int cols = currentGeneration[0].length;
        boolean[][] nextGeneration = new boolean[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                int liveNeighbors = countLiveNeighbors(currentGeneration, row, col);
                boolean isAlive = currentGeneration[row][col];

                if (isAlive && (liveNeighbors < 2 || liveNeighbors > 3)) {
                    nextGeneration[row][col] = false;
                } else if (!isAlive && liveNeighbors == 3) {
                    nextGeneration[row][col] = true;
                } else {
                    nextGeneration[row][col] = currentGeneration[row][col];
                }
            }
        }
        return nextGeneration;
    }

    private int countLiveNeighbors(boolean[][] grid, int row, int col) {
        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        int[] offsets = {-1, 0, 1};
        for (int xOffset : offsets) {
            for (int yOffset : offsets) {
                if (xOffset == 0 && yOffset == 0) {
                    continue;
                }

                int neighborRow = row + xOffset;
                int neighborCol = col + yOffset;

                boolean isValidNeighbor = neighborRow >= 0 && neighborRow < rows &&
                        neighborCol >= 0 && neighborCol < cols;

                if (isValidNeighbor && grid[neighborRow][neighborCol]) {
                    count++;
                }
            }
        }
        return count;
    }
}
