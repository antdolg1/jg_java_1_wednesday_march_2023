package students.jegors_rutkovskis.lesson_12.level_4;

class StackOverflowErrorDemo {
    public static void main(String[] args) {
        try {
            recursiveMethod();
        } catch (StackOverflowError e) {
            System.out.println("Error: " + e);
        }
    }
    static void recursiveMethod() {
        recursiveMethod();
    }
}
