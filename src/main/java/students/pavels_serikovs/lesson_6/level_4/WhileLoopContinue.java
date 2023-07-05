package students.pavels_serikovs.lesson_6.level_4;

public class WhileLoopContinue {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            if (i == 4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
