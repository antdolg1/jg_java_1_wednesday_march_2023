package students.andrej_mihailicenko.lesson_13.level_3_4;

import java.util.Random;

public class GameOfLifeRandomFieldGenerator {

    public boolean[][] generate(int fieldWidth, int fieldHeight) {

        boolean[][] field = new boolean[fieldHeight][fieldWidth];
        Random random = new Random();

        for (int i = 0; i < fieldHeight; i++) {
            for (int j = 0; j < fieldWidth; j++) {
                field[i][j] = random.nextBoolean();
            }
        }
        return field;
    }
}
