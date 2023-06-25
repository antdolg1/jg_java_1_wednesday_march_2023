package students.jegors_rutkovskis.lesson_8.level_7.connect_four;
class GamePlay {
    void play() {
        Board board = new Board();
        Computer computer = new Computer();
        Player player1 = new Player("You", Color.BLACK);
        Player player2 = new Player("Bot", Color.WHITE);

        while(true) {
            board.printBoard();
            board.getNextMove(player1);
            if (board.checkWin(player1)) {
                board.printBoard();
                System.out.println("Player " + player1.getName() + " WIN!");
                break;
            }
            if (board.isFullBoard()) {
                board.printBoard();
                System.out.println("DRAW!");
                break;
            }

            board.printBoard();
            computer.randomMove(player2, board);
            if (board.checkWin(player2)) {
                board.printBoard();
                System.out.println("Player " + player2.getName() + " WIN!");
                break;
            }
            if (board.isFullBoard()) {
                board.printBoard();
                System.out.println("DRAW!");
                break;
            }
        }
    }
}
