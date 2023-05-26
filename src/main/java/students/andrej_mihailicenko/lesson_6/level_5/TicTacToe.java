package students.andrej_mihailicenko.lesson_6.level_5;

import java.util.Scanner;

class TicTacToe {
    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (field[i][0] == playerToCheck && field[i][1] == playerToCheck && field[i][2] == playerToCheck) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (field[0][i] == playerToCheck && field[1][i] == playerToCheck && field[2][i] == playerToCheck) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if ((field[0][0] == playerToCheck && field[1][1] == playerToCheck && field[2][2] == playerToCheck) ||
                    (field[0][2] == playerToCheck && field[1][1] == playerToCheck && field[2][0] == playerToCheck)) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (isWinPositionForDiagonals(field, playerToCheck) || isWinPositionForHorizontals(field, playerToCheck) ||
                    isWinPositionForVerticals(field, playerToCheck)) {
                return true;
            }
        }
        return false;
    }

    public boolean isDrawPosition(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (field[i][j] == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public int[][] createField() {
        int[][] field = new int[3][3];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = -1;
            }
        }
        return field;
    }

    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, Enter x coordinate:");
        int x = scanner.nextInt();

        System.out.println("Please, Enter y coordinate:");
        int y = scanner.nextInt();

        return new Move(x, y);
    }

    public void printFieldToConsole(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == -1) {
                    System.out.print(" - ");
                } else if (field[i][j] == 0) {
                    System.out.print(" X ");
                } else if (field[i][j] == 1) {
                    System.out.print(" O ");
                }

                if (j != field[i].length - 1) {
                    System.out.print("|");
                }
            }

            System.out.println();

            if (i != field.length - 1) {
                System.out.println("---+---+---");
            }
        }
    }

    public void play() {
        int[][] field = createField();
        while (true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);
            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;
            printFieldToConsole(field);
            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }
}
