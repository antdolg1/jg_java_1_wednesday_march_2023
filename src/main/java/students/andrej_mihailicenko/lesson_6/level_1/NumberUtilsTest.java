package students.andrej_mihailicenko.lesson_6.level_1;

class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtilsTest test = new NumberUtilsTest();
        test.testIsEvenWithEvenNumber();
        test.testIsEvenWithOddNumber();
        test.testIsEvenWithZeroNumber();
        test.testIsEvenWithNegativeEvenNumber();
        test.testIsEvenWithNegativeOddNumber();
    }

    public void testIsEvenWithEvenNumber() {
        NumberUtils numberUtils = new NumberUtils();
        int evenNumber = 4;
        boolean expectedResult = true;
        boolean realResult = numberUtils.isEven(evenNumber);
        if (expectedResult == realResult) {
            System.out.println("Even test with even number passed");
        } else {
            System.out.println("Even test with even number failed");
        }

    }

    public void testIsEvenWithOddNumber() {
        NumberUtils numberUtils = new NumberUtils();
        int oddNumber = 3;
        boolean expectedResult = false;
        boolean realResult = numberUtils.isEven(oddNumber);
        if (expectedResult == realResult) {
            System.out.println("Even test with odd number passed");
        } else {
            System.out.println("Even test with odd number failed");
        }

    }

    public void testIsEvenWithZeroNumber() {
        NumberUtils numberUtils = new NumberUtils();
        int zeroNumber = 0;
        boolean expectedResult = true;
        boolean realResult = numberUtils.isEven(zeroNumber);
        if (expectedResult == realResult) {
            System.out.println("Even test with zero passed");
        } else {
            System.out.println("Even test with zero failed");
        }

    }

    public void testIsEvenWithNegativeEvenNumber() {
        NumberUtils numberUtils = new NumberUtils();
        int negativeEvenNumber = -4;
        boolean expectedResult = true;
        boolean realResult = numberUtils.isEven(negativeEvenNumber);
        if (expectedResult == realResult) {
            System.out.println("Even test with negative even number passed");
        } else {
            System.out.println("Even test with negative even number failed");
        }

    }

    public void testIsEvenWithNegativeOddNumber() {
        NumberUtils numberUtils = new NumberUtils();
        int negativeOddNumber = -3;
        boolean expectedResult = false;
        boolean realResult = numberUtils.isEven(negativeOddNumber);
        if (expectedResult == realResult) {
            System.out.println("Even test with negative odd number passed");
        } else {
            System.out.println("Even test with negative odd number failed");
        }

    }
}

