package students.jegors_rutkovskis.lesson_6.level_4;

class ForLoopContinue {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("number five is missing");
                continue;
            }
            System.out.println(i);
        }
    }
}
