package students.jegors_rutkovskis.lesson_8.level_7.connect_four;

import java.util.Scanner;

class Board {
    private Player[][] board;
    private final int row = 6;
    private final int column = 7;

    public Board() {
        this.board = new Player[row][column];
    }

    void getNextMove(Player player) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter number of column: ");
            int column = scanner.nextInt();
            if (!isValidColumn(column)) {
                System.out.println("This column is full, choose another one");;
            } else {
                dropPiece(column, player);
                break;
            }
        }
    }
    boolean checkWin(Player player) {
        return checkWinHorizontal(player)
                || checkWinVertical(player)
                || checkWinDiagonalFromLeftToRight(player)
                || checkWinDiagonalFromRightToLeft(player);
    }
    boolean checkWinHorizontal(Player player) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column - 3; j++) {
                if (board[i][j] == player
                        && board[i][j + 1] == player
                        && board[i][j + 2] == player
                        && board[i][j + 3] == player) {
                    return true;
                }
            }
        }
        return false;
    }
    boolean checkWinVertical(Player player) {
        for (int i = 0; i < row - 3; i++) {
            for (int j = 0; j < column; j++) {
                if (board[i][j] == player
                        && board[i + 1][j] == player
                        && board[i + 2][j] == player
                        && board[i + 3][j] == player) {
                    return true;
                }
            }
        }
        return false;
    }
    boolean checkWinDiagonalFromLeftToRight(Player player) {
        for (int i = 0; i < row - 3; i++) {
            for (int j = 0; j < column - 3; j++) {
                if (board[i][j] == player
                        && board[i + 1][j + 1] == player
                        && board[i + 2][j + 2] == player
                        && board[i + 3][j + 3] == player) {
                    return true;
                }
            }
        }
        return false;
    }
    boolean checkWinDiagonalFromRightToLeft(Player player) {
        for (int i = 0; i < row - 3; i++) {
            for (int j = 3; j < column; j++) {
                if (board[i][j] == player
                        && board[i + 1][j - 1] == player
                        && board[i + 2][j - 2] == player
                        && board[i + 3][j - 3] == player) {
                    return true;
                }
            }
        }
        return false;
    }
    boolean dropPiece(int column, Player player) {
        if (isValidColumn(column)) {
            for (int row = board.length - 1; row >= 0 ; row--) {
                if (board[row][column] == null) {
                    board[row][column] = player;
                    return true;
                }
            }
        }
        return false;
    }
    boolean isFullBoard() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (board[i][j] == null) {
                    return false;
                }
            }
        }
        return true;
    }
    boolean isValidColumn(int column) {
        return column >= 0
                && column < this.column
                && board[0][column] == null;
    }
    public void printBoard() {
        BoardPrinter boardPrinter = new BoardPrinter();
        boardPrinter.printBoard(this);
    }
    public Player[][] getBoard() {
        return board;
    }

    public void setBoard(Player[][] board) {
        this.board = board;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
    public Player getCell(int row, int column) {
        return board[row][column];
    }
}
