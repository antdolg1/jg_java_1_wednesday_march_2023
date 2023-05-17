package students.jegors_rutkovskis.lesson_6.level_4;

import java.util.Random;

class ForInfiniteLoopBreak {
    public static void main(String[] args) {

        Random random = new Random();

        for (;;) {
            int count = random.nextInt(100);
            System.out.print(count + " ");
            if (count == 10){
                break;
            }
        }
        System.out.println();
        System.out.println("Second loop starts ------>");

        for (int i = 5; i > 0; i++) {
            System.out.print(i + " ");
            i -= random.nextInt(0, 3);
            if (i < 0) {
                System.out.println(i + " less than 0");
                break;
            }
        }
        System.out.println("Third loop starts ------>");

        for (int i = 0; ; i++) {
            System.out.print(i + " ");
            if (i == 10) {
                break;
            }
        }


    }

}
