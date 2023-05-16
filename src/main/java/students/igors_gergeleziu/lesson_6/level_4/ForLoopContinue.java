package students.igors_gergeleziu.lesson_6.level_4;

class ForLoopContinue {
    public static void main(String[] args) {
        System.out.println("Even numbers: ");
        for (int i = 0; i < 100; i++) {
            if (!(i % 2 == 0)) {
                i++;
                continue;
            }
            System.out.print(i+" ");
            i++;
        }
    }
}
