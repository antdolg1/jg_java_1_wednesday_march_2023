package students.jegors_rutkovskis.lesson_6.level_4;

import java.util.Random;

class WhileInfiniteLoopBreak {
    public static void main(String[] args) {
        Random random = new Random();

        while (true) {
            int i = random.nextInt(0, 21);
            System.out.print(i + " ");

            if (i == 17) {
                break;
            }
        }
    }
}
