package students.edmund_zukovskis.lesson_6.level_4.task_19;

public class ForInfiniteLoopBreak {
    public static void main(String[] args) {
        for (; ; ) {
            System.out.println("Infinite code");
            break;
        }
        System.out.println("Infinite code is over");
    }
}
