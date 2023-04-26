package teacher.lesson_5.lessoncode;

public class LoopDemoApp {

    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("Loop iteration finished!");

        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Loop iteration finished!");

    }
}
