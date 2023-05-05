package students.jegors_rutkovskis.lesson_6.level_5_6;

import java.util.Scanner;

class TicTacToe {
    int[][] createField() {
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = -1;
            }
        }
        return arr;
    }
    boolean isWinPosition(int[][] field, int playerToCheck) {
        return isWinPositionForHorizontals(field, playerToCheck)
                || isWinPositionForVerticals(field, playerToCheck)
                || isWinPositionForDiagonals(field, playerToCheck);
    }
    boolean isDrawPosition(int[][] field) {
        for (int[] ints : field) {
            for (int j = 0; j < field.length; j++) {
                if (ints[j] == -1) {
                    return false;
                }
            }
        }
        if (isWinPosition(field, 1)) {
            return false;
        }
        if (isWinPosition(field, 0)) {
            return false;
        }
        return true;
    }
    boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int[] ints : field) {
            int count = 0;
            for (int j = 0; j < field.length; j++) {
                if (ints[j] == playerToCheck) {
                    count++;
                }
                if (count == 3) {
                    return true;
                }
            }
        }
        return false;
    }
    boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            int count = 0;
            for (int j = 0; j < field.length; j++) {
                if (field[j][i] == playerToCheck) {
                    count++;
                }
                if (count == 3) {
                    return true;
                }
            }
        }
        return false;
    }
    boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        int count = 0;
        for (int i = 0; i < field.length; i++) {
            if (field[i][i] == playerToCheck) {
                count++;
            }
            if (count == 3) {
                return true;
            }
        }
        count = 0;
        for (int i = 0; i < field.length; i++) {
            if (field[i][field.length - i - 1] == playerToCheck) {
                count++;
            }
            if (count == 3) {
                return true;
            }
        }

        return false;
    }
    void printFieldWithCoordinatesToConsole(int[][] field) {
        System.out.println("--------------");
        for (int i = 0; i < field.length; i++) {
            System.out.print("|");
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == -1) {
                    System.out.print("(" + i + "" + j + ")");
                } else if (field[i][j] == 0) {
                    System.out.print("O ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.print("| ");
            System.out.println();
        }
        System.out.println("--------------");
    }
    void printFieldToConsole(int[][] field) {
        System.out.println("---------");
        for (int i = 0; i < field.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == -1) {
                    System.out.print("  ");
                } else if (field[i][j] == 0) {
                    System.out.print("O ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.print("| ");
            System.out.println();
        }
        System.out.println("---------");
    }
    boolean isOccupiedCell(int[][] field, int x, int y) {
        return field[x][y] != -1;
    }
    Move getNextMove(int[][] field) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Enter coordinate x: ");
            int x = scanner.nextInt();
            System.out.print("Enter coordinate y: ");
            int y = scanner.nextInt();

            if (isOccupiedCell(field, x, y)) {
                System.out.println("This cell is already occupied. Please enter another cell.");
            } else {
                return new Move(x, y);
            }
        }
    }
    void play() {
        int[][] field = createField();
        AI ai = new AI();
        printFieldWithCoordinatesToConsole(field);
        while(true) {
            printFieldToConsole(field);
            Move move0 = getNextMove(field);
            field[move0.getX()][move0.getY()] = 0;
            if (isWinPosition(field, 0)) {
                printFieldToConsole(field);
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                printFieldToConsole(field);
                System.out.println("DRAW!");
                break;
            }
//          Move move1 = ai.getNextRandomMove(field);
            Move move1 = ai.getSmartMove(field, 1);
            field[move1.getX()][move1.getY()] = 1;
            if (isWinPosition(field, 1)) {
                printFieldToConsole(field);
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                printFieldToConsole(field);
                System.out.println("DRAW!");
                break;
            }
        }
    }
}
