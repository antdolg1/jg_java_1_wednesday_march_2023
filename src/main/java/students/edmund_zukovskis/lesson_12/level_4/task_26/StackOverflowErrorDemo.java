package students.edmund_zukovskis.lesson_12.level_4.task_26;

class StackOverflowErrorDemo {
    public static void recursiveMethod() {
        recursiveMethod();
    }

    public static void main(String[] args) {
        try {
            recursiveMethod();
        } catch (StackOverflowError e) {
            System.out.println("Error appeared StackOverflowError!");
            e.printStackTrace();
        }
    }
}
