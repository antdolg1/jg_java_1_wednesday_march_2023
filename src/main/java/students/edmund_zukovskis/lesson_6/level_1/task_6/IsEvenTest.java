package students.edmund_zukovskis.lesson_6.level_1.task_6;

public class IsEvenTest {
    public static void main(String[] args) {
        IsEvenTest test = new IsEvenTest();

        test.testIsEvenWithEvenNumber();
    }

    void testIsEvenWithEvenNumber() {
        NumberUtils numberUtils = new NumberUtils();

        int number = 4;
        boolean expected = true;
        boolean actualResult = NumberUtils.isEven(4);
        if (expected == actualResult) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

