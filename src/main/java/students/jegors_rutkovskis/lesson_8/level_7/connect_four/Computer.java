package students.jegors_rutkovskis.lesson_8.level_7.connect_four;

import java.util.Random;

class Computer {
    void randomMove(Player player, Board board) {
        Random random = new Random();
        int column;
        do {
            column = random.nextInt(0, board.getColumn());
        } while (!board.dropPiece(column, player));
    }
}
