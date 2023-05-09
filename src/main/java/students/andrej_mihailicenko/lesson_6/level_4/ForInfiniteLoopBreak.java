package students.andrej_mihailicenko.lesson_6.level_4;

class ForInfiniteLoopBreak {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i > 0; i++) {
            System.out.println("Infinite For");
            count++;
            if (count == 10) {
                break;
            }
        }
    }
}
