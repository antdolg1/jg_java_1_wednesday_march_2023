package students.jegors_rutkovskis.lesson_6.level_5_6;

import java.util.Random;

class AI {
    Move getNextRandomMove(int[][] field) {
        Random random = new Random();
        int x;
        int y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (isOccupiedCell(field, x, y));
        System.out.println("I moved in random");
        return new Move(x, y);
    }

    Move getSmartMove(int[][] field, int aiPlayer) {
        TicTacToe ticTacToe = new TicTacToe();
        int opponent;
        if (aiPlayer == 1) {
            opponent = 0;
        } else {
            opponent = 1;
        }
        // проверяем, если центральная ячейка свободна, то делаем ход в неё
        if (!isCenterOccupied(field)) {
            System.out.println("I prefer move to the center");
            return new Move(1, 1);
        }
        // проверяем, есть ли возможность выиграть на следующем ходе
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == -1) {
                    field[i][j] = aiPlayer;
                    if (ticTacToe.isWinPosition(field, aiPlayer)) {
                        field[i][j] = -1;
                        System.out.println("found possibility to win...");
                        return new Move(i, j);
                    }
                    field[i][j] = -1;
                }
            }
        }
        // проверяем, есть ли возможность предотвратить победу противника на следующем ходе
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == -1) {
                    field[i][j] = opponent;
                    if (ticTacToe.isWinPosition(field, opponent)) {
                        field[i][j] = -1;
                        System.out.println("I blocked you :)");
                        return new Move(i, j);
                    }
                    field[i][j] = -1;
                }
            }
        }
        return getNextRandomMove(field);
    }
    boolean isCenterOccupied(int[][] field) {
        return field[1][1] != -1;
    }
    boolean isOccupiedCell(int[][] field, int x, int y) {
        return field[x][y] != -1;
    }

}
