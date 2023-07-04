package students.andrej_mihailicenko.lesson_13.level_3_4;

public class GameOfLifeConsoleUI {
    public void show(boolean[][] field) {
        int height = field.length;
        int width = field[0].length;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (field[i][j]) {
                    System.out.print("⬛");
                } else {
                    System.out.print("⬜");
                }
            }
            System.out.println();

        }
        System.out.println("");
        System.out.println("");
    }
}