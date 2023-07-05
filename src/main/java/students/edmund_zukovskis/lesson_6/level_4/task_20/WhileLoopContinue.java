package students.edmund_zukovskis.lesson_6.level_4.task_20;

public class WhileLoopContinue {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            if (i == 5) {
                i++;
                continue;
            }
            System.out.println("Value: " + i);
            i++;
        }
    }
}
