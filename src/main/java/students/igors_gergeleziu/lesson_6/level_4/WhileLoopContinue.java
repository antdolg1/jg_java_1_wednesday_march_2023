package students.igors_gergeleziu.lesson_6.level_4;

class WhileLoopContinue {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("Odd numbers: ");
        while (i < 50) {
            if (i % 2 == 0) {
                i++;
                continue;
            }
            System.out.print(i + " ");
            i++;
        }
    }
}
