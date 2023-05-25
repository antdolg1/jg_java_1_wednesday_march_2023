package students.jegors_rutkovskis.lesson_8.level_7.connect_four;

class BoardPrinter {
    void printBoard(Board board) {
        int rows = board.getRow();
        int columns = board.getColumn();

        for (int column = 0; column < columns; column++) {
            System.out.print("   " + column + "  ");
        }
        System.out.println();

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                System.out.print("|");
                Player player = board.getCell(row, column);
                if (player == null) {
                    System.out.print("     ");
                } else {
                    System.out.print(player.getPieceColor());
                }
            }
            System.out.println("|");
        }

        for (int column = 0; column < columns; column++) {
            System.out.print("------");
        }
        System.out.println();
    }
}
