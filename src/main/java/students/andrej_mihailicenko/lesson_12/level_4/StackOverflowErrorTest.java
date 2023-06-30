package students.andrej_mihailicenko.lesson_12.level_4;

class StackOverflowErrorTest {

    static int factorial(int n) {
        int result;

        result = factorial(n - 1) * n;
        return result;
    }

    public static void main(String[] args) {
        System.out.println( factorial(3));
    }

    //Exception in thread "main" java.lang.StackOverflowError

}
