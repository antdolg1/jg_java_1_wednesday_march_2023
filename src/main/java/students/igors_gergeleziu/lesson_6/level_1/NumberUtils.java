package students.igors_gergeleziu.lesson_6.level_1;

class NumberUtils {
    public static void main(String[] args) {
        NumberUtils test = new NumberUtils();
        System.out.println("Even test: ");
        test.shouldBeEvenTest1();
        test.shouldBeEvenTest2();
        test.shouldBeEvenTest3();
        test.shouldBeEvenTest4();
        test.shouldBeEvenTest5();
        test.shouldBeEvenTest6();
        System.out.println("Odd test: ");
        test.shouldBeOddTest1();
        test.shouldBeOddTest2();
        test.shouldBeOddTest3();
        test.shouldBeOddTest4();
        test.shouldBeOddTest5();
        test.shouldBeOddTest6();
    }

    boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEvenRemastered(int number) {
        return number % 2 == 0;
    }

    void shouldBeEvenTest1() {
        checkResults(isEven(4), "shouldBeEvenTest1");
    }

    void shouldBeEvenTest2() {
        checkResults(isEven(20), "shouldBeEvenTest2");
    }

    void shouldBeEvenTest3() {
        checkResults(isEven(-10), "shouldBeEvenTest3");
    }

    void shouldBeEvenTest4() {
        checkResults(isEvenRemastered(4), "shouldBeEvenTest4");
    }

    void shouldBeEvenTest5() {
        checkResults(isEvenRemastered(20), "shouldBeEvenTest5");
    }

    void shouldBeEvenTest6() {
        checkResults(isEvenRemastered(-10), "shouldBeEvenTest6");
    }

    void shouldBeOddTest1() {
        checkResults(!isEven(3), "shouldBeOddTest1");
    }

    void shouldBeOddTest2() {
        checkResults(!isEven(7), "shouldBeOddTest2");
    }

    void shouldBeOddTest3() {
        checkResults(!isEven(-9), "shouldBeOddTest3");
    }

    void shouldBeOddTest4() {
        checkResults(!isEvenRemastered(3), "shouldBeOddTest4");
    }

    void shouldBeOddTest5() {
        checkResults(!isEvenRemastered(7), "shouldBeOddTest5");
    }

    void shouldBeOddTest6() {
        checkResults(!isEvenRemastered(-9), "shouldBeOddTest6");
    }

    void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}

