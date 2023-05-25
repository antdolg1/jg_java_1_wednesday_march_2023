package students.jegors_rutkovskis.lesson_8.level_7.connect_four;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    @Test
    void createBoardTest() {
        Board board = new Board();
        Player[][] expected = {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},

        };
        Player[][] actual = board.getBoard();

        assertArrayEquals(expected, actual);
    }

    @Test
    void checkIfDropPieceCorrect() {
        Board board = new Board();
        Player player1 = new Player("John", Color.BLACK);
        Player player2 = new Player("Alex", Color.WHITE);
        Player[][] expectedBoard = {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, player2, null, null, null},
                {player1, null, null, player2, null, null, null},
                {player1, null, null, player2, null, null, null}
        };
        board.dropPiece(0, player1);
        board.dropPiece(0, player1);

        board.dropPiece(3, player2);
        board.dropPiece(3, player2);
        board.dropPiece(3, player2);

        assertArrayEquals(expectedBoard, board.getBoard());
    }

    @Test
    void ifColumnIsFullShouldReturnFalseWhenDropPiece() {
        Board board = new Board();
        Player player = new Player("John", Color.BLACK);
        board.dropPiece(5, player);
        board.dropPiece(5, player);
        board.dropPiece(5, player);
        board.dropPiece(5, player);
        board.dropPiece(5, player);
        boolean actualTrue = board.dropPiece(5, player);
        assertTrue(actualTrue);

        boolean actualFalse = board.dropPiece(5, player);
        assertFalse(actualFalse);
    }

    @Test
    void returnsTrueIfBoardFull() {
        Board board = new Board();
        Player player = new Player("John", Color.BLACK);
        Player[][] fullBoard = {
                {player, player, player, player, player, player, player},
                {player, player, player, player, player, player, player},
                {player, player, player, player, player, player, player},
                {player, player, player, player, player, player, player},
                {player, player, player, player, player, player, player},
                {player, player, player, player, player, player, player}
        };
        board.setBoard(fullBoard);
        assertTrue(board.isFullBoard());
    }
    @Test
    void returnsFalseIfBoardIsNotFull() {
        Board board = new Board();
        Player player = new Player("John", Color.BLACK);
        Player[][] notFullBoard = {
                {player, player, null, player, player, player, player},
                {player, player, player, player, player, player, player},
                {player, player, player, player, player, player, player},
                {player, player, player, player, player, player, player},
                {player, player, player, player, player, player, player},
                {player, player, player, player, player, player, player}
        };
        board.setBoard(notFullBoard);
        assertFalse(board.isFullBoard());
    }

    @Test
    void checkIfBoardFilledCorrectly() {
        Board board = new Board();
        Player player1 = new Player("John", Color.BLACK);
        Player player2 = new Player("Alex", Color.WHITE);
        Player[][] expectedBoard = {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {player1, null, player2, player2, player2, player2, null},
                {player1, player1, player1, player2, player1, player2, null}

        };
        board.dropPiece(0, player1);
        board.dropPiece(0, player1);
        board.dropPiece(1, player1);
        board.dropPiece(2, player1);
        board.dropPiece(2, player2);
        board.dropPiece(3, player2);
        board.dropPiece(3, player2);
        board.dropPiece(4, player1);
        board.dropPiece(4, player2);
        board.dropPiece(5, player2);
        board.dropPiece(5, player2);
        Player[][] actualBoard = board.getBoard();

        assertArrayEquals(expectedBoard, actualBoard);
    }

    @Test
    void checkWinHorizontalTest() {
        Board board = new Board();
        Player player1 = new Player("John", Color.BLACK);
        Player player2 = new Player("Alex", Color.WHITE);

        board.dropPiece(0, player1);
        board.dropPiece(0, player1);
        board.dropPiece(1, player1);
        board.dropPiece(2, player1);
        board.dropPiece(2, player2);
        board.dropPiece(3, player2);
        board.dropPiece(3, player2);
        board.dropPiece(4, player1);
        board.dropPiece(4, player2);
        board.dropPiece(5, player2);
        board.dropPiece(5, player2);

        boolean actualPlayer2Win = board.checkWin(player2);
        boolean actualPlayer1Win = board.checkWin(player1);

        assertTrue(actualPlayer2Win);
        assertFalse(actualPlayer1Win);
    }

    @Test
    void checkWinVerticalTest() {
        Board board = new Board();
        Player player1 = new Player("John", Color.BLACK);
        Player player2 = new Player("Alex", Color.WHITE);

        board.dropPiece(6, player1);
        board.dropPiece(6, player1);
        board.dropPiece(6, player1);
        board.dropPiece(6, player1);

        board.dropPiece(1, player2);
        board.dropPiece(1, player2);
        board.dropPiece(1, player2);

        assertTrue(board.checkWin(player1));
        assertFalse(board.checkWin(player2));
    }
    @Test
    void checkWinDiagonalFromLeftToRightTest() {
        Board board = new Board();
        Player player1 = new Player("John", Color.BLACK);
        Player player2 = new Player("Alex", Color.WHITE);

        board.dropPiece(2, player2);
        board.dropPiece(2, player2);
        board.dropPiece(2, player2);
        board.dropPiece(2, player1);

        board.dropPiece(3, player2);
        board.dropPiece(3, player2);
        board.dropPiece(3, player1);

        board.dropPiece(4, player2);
        board.dropPiece(4, player1);

        board.dropPiece(5, player1);

        assertTrue(board.checkWin(player1));
        assertFalse(board.checkWin(player2));
    }
    @Test
    void checkWinDiagonalFromRightToLeftTest() {
        Board board = new Board();
        Player player1 = new Player("John", Color.BLACK);
        Player player2 = new Player("Alex", Color.WHITE);

        board.dropPiece(3, player2);
        board.dropPiece(3, player1);
        board.dropPiece(3, player1);
        board.dropPiece(3, player1);
        board.dropPiece(3, player2);
        board.dropPiece(3, player1);

        board.dropPiece(2, player1);
        board.dropPiece(2, player1);
        board.dropPiece(2, player2);
        board.dropPiece(2, player2);
        board.dropPiece(2, player1);

        board.dropPiece(1, player2);
        board.dropPiece(1, player1);
        board.dropPiece(1, player1);
        board.dropPiece(1, player1);

        board.dropPiece(0, player1);
        board.dropPiece(0, player2);
        board.dropPiece(0, player1);

        assertTrue(board.checkWin(player1));
        assertFalse(board.checkWin(player2));
    }
}