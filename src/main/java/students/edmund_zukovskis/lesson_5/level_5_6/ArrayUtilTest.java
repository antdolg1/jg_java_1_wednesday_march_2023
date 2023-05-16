package students.edmund_zukovskis.lesson_5.level_5_6;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil result = new ArrayUtil();
        int expectResult = 5;
        int[] array = result.createArray(expectResult);
        int realResult = array.length;
        check(realResult, expectResult, "Create Array test");
    }

    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] result = {5, 20, 15};
        int maxExpected = 20;
        int maxReal = arrayUtil.findMaxNumber(result);
        check(maxReal, maxExpected, "Find max test");
    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] result = {5, 20, 15};
        int minExpected = 5;
        int minReal = arrayUtil.findMinNumber(result);
        check(minReal, minExpected, "Find min test");
    }

    public void check(int realResult, int expectResult, String nameTest) {
        if (realResult == expectResult) {
            System.out.println(nameTest + "= Ok");
        } else {
            System.out.println(nameTest + "= Fail");
        }
    }
}
