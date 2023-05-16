package students.igors_gergeleziu.lesson_6.level_5_and_level_6;

import java.util.Arrays;
import java.util.Scanner;

class TicTacToe {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

    boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        if (field[0][0] == playerToCheck && field[0][1] == playerToCheck && field[0][2] == playerToCheck) return true;
        else if (field[1][0] == playerToCheck && field[1][1] == playerToCheck && field[1][2] == playerToCheck)
            return true;
        else if (field[2][0] == playerToCheck && field[2][1] == playerToCheck && field[2][2] == playerToCheck)
            return true;
        else return false;
    }

    boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        if (field[0][0] == playerToCheck && field[1][0] == playerToCheck && field[2][0] == playerToCheck) return true;
        else if (field[0][1] == playerToCheck && field[1][1] == playerToCheck && field[2][1] == playerToCheck)
            return true;
        else if (field[0][2] == playerToCheck && field[1][2] == playerToCheck && field[2][2] == playerToCheck)
            return true;
        else return false;
    }

    boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        if (field[0][0] == playerToCheck && field[1][1] == playerToCheck && field[2][2] == playerToCheck) return true;
        else if (field[0][2] == playerToCheck && field[1][1] == playerToCheck && field[2][0] == playerToCheck)
            return true;
        else return false;
    }

    boolean isWinPosition(int[][] field, int playerToCheck) {
        if (isWinPositionForHorizontals(field, playerToCheck) || isWinPositionForVerticals(field, playerToCheck) || isWinPositionForDiagonals(field, playerToCheck)) {
            return true;
        } else return false;
    }

    boolean isDrawPosition(int[][] field) {
        if ((!isWinPosition(field, 1) && !isWinPosition(field, 0)) && !searchForEmptyCellsInArray(field)) {
            return true;
        } else return false;
    }


    boolean searchForEmptyCellsInArray(int[][] field) {
        boolean emptyCells = false;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == -1) emptyCells = true;
            }
        }
        return emptyCells;
    }

    int[][] createField() {
        int[][] field = new int[3][3];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = -1;
            }
        }
        return field;
    }

    Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row X value: ");
        int x = scanner.nextInt();
        System.out.println("Enter column Y value: ");
        int y = scanner.nextInt();
        Move move = new Move(x, y);
        return move;

    }

    void printFieldToConsole(int[][] field) {
        for (int[] row : field) {
            System.out.println(Arrays.toString(row));
        }
    }

    public void play() {
        int[][] field = createField();
        while (true) {
            printFieldToConsole(field);
            System.out.println("Player 0");
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            //printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
            System.out.println();
            printFieldToConsole(field);
            System.out.println("Player 1");
            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;
            //printFieldToConsole(field);
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
