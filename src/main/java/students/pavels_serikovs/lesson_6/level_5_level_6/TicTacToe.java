package students.pavels_serikovs.lesson_6.level_5_level_6;

import java.util.Scanner;

public class TicTacToe {
    public boolean winPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int[] row : field) {
            int count = 0;
            for (int col : row) {
                if (col == playerToCheck) {
                    count++;
                }
                if (count == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean winPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            int count = 0;
            for (int j = 0; j < field[i].length; j++) {
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

    public boolean winPositionForDiagonals(int[][] field, int playerToCheck) {
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

    public boolean winPosition(int[][] field, int playerToCheck) {
        return winPositionForHorizontals(field, playerToCheck) ||
                winPositionForVerticals(field, playerToCheck) || winPositionForDiagonals(field, playerToCheck);
    }

    public boolean drawPosition(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == -1) {
                    return false;
                }
            }
        }
        return !winPosition(field, 1) && !winPosition(field, 0);
    }

    int[][] createField() {
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = -1;
            }
        }
        return array;
    }

    void printFieldWithCoordinatesToConsole(int[][] field) {
        System.out.println("----------------");
        for (int i = 0; i < field.length; i++) {
            System.out.print("|");
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == -1) {
                    System.out.print("(" + i + "" + j + ")");
                } else if (field[i][j] == 0) {
                    System.out.print("O ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("----------------");
    }

    void printFieldToConsole(int[][] field) {
        System.out.println("----------------");
        for (int i = 0; i < field.length; i++) {
            System.out.print("|");
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == -1) {
                    System.out.print(" ");
                } else if (field[i][j] == 0) {
                    System.out.print("O ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("----------------");
    }

    boolean occupiedCell(int[][] field, int x, int y) {
        return field[x][y] != -1;
    }

    Move getNextMove(int[][] field) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter coordinate X: ");
            int x = scan.nextInt();
            System.out.println("Enter coordinate Y: ");
            int y = scan.nextInt();
            if (occupiedCell(field, x, y)) {
                System.out.println("This cell is already occupied. Please enter another cell...");
            } else {
                return new Move(x, y);
            }
        }
    }

    public void play() {
        int[][] field = createField();
        while (true) {
            printFieldWithCoordinatesToConsole(field);
            Move move0 = getNextMove(field);
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
            if (winPosition(field, 0)) {
                System.out.println("We have a winner Player 0! Congratulations!!!");
                break;
            }
            if (drawPosition(field)) {
                System.out.println("It's a DRAW!");
                break;
            }
            printFieldToConsole(field);
            Move move1 = getNextMove(field);
            field[move1.getX()][move1.getY()] = 1;
            printFieldToConsole(field);
            if (winPosition(field, 1)) {
                System.out.println("We have a winner Player 1! Congratulations!!!");
                break;
            }
            if (drawPosition(field)) {
                System.out.println("It's a DRAW!");
                break;
            }
        }
    }
}
