package students.slava_khl.lesson_6.level_1;

public class NumberUtilsTest {

    public static void main(String[] args) {
        NumberUtilsTest test = new NumberUtilsTest();

        test.testIsEvenForEvenNumber();
    }

    void testIsEvenForEvenNumber() {
        NumberUtils numberUtils = new NumberUtils();

        int number = 8;
        boolean expectedResult = true;
        boolean actualResult = NumberUtils.isEven(8);
        if (expectedResult == actualResult) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}