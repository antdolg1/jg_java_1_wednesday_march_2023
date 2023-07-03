package students.edmund_zukovskis.lesson_6.level_5;

public class TicTacToeDemo {
    public static void main(String[] args) {

        TicTacToe game = new TicTacToe();
        int[][] field = {{0, 0, 1},
                {1, 1, 0},
                {0, 1, 0}
        };

        boolean isWinPositionHorizontal = game.isWinPositionForHorizontals(field, 0);
        System.out.println("Horizontal position wins: " + isWinPositionHorizontal);

        boolean isWinPositionVerticals = game.isWinPositionForVerticals(field, 0);
        System.out.println("Vertical position wins: " + isWinPositionVerticals);

        boolean isWinPositionDiagonals = game.isWinPositionForDiagonals(field, 0);
        System.out.println("Diagonal position wins: " + isWinPositionDiagonals);

        boolean isWinPosition = game.isWinPosition(field, 0);
        System.out.println(isWinPosition);

        boolean isDrawPosition = game.isDrawPosition(field);
        System.out.println("Draw: " + isDrawPosition);
    }
}
