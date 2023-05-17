package students.andrej_mihailicenko.lesson_6.level_4;

class WhileLoopContinue {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            if (i == 5) {
                continue;
            }
            System.out.println("i: " + i);
        }
    }
}
