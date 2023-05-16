package students.igors_gergeleziu.lesson_6.level_1;

class WhileDefinition4 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++; //Index increment should be inside while loop, preventing from infinite loop
        }

    }
}
