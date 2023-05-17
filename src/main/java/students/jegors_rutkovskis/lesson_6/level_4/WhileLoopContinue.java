package students.jegors_rutkovskis.lesson_6.level_4;

class WhileLoopContinue {
    public static void main(String[] args) {
        int count = -10;

        while (count < 10) {
            count++;
            if (count == 0) {
                System.out.print("ZERO, ");
                continue;
            }
            System.out.print(count + ", ");
        }
    }
}
