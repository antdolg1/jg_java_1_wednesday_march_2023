package students.edmund_zukovskis.lesson_6.level_3;

public class ArrayServiceTest {
    public static void main(String[] args) {

        ArrayServiceTest test = new ArrayServiceTest();

        test.containsAskedNumber();


    }

    public void containsAskedNumber() {
        ArrayService contains = new ArrayService();
        int[] myArray = {1, 2, 3, 4, 5};
        int numberToSearch = 3;


    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
