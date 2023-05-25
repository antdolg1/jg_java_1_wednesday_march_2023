package students.jegors_rutkovskis.lesson_8.level_7.connect_four;

class BoardDemo {
    public static void main(String[] args) {
        Board board = new Board();
        Player player1 = new Player("John", Color.BLACK);
        Player player2 = new Player("Alex", Color.WHITE);

        board.dropPiece(0, player1);
        board.dropPiece(0, player1);

        board.dropPiece(3, player2);
        board.dropPiece(3, player2);
        board.dropPiece(3, player2);

        board.dropPiece(1, player2);
        board.dropPiece(1, player1);

        board.dropPiece(2, player1);
        board.dropPiece(2, player1);
        board.dropPiece(2, player1);

        board.dropPiece(3, player1);

        board.printBoard();
    }
}
