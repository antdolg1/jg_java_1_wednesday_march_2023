package students.igors_gergeleziu.lesson_6.level_3;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        System.out.println("Task 12");
        test.shouldFindNumberInArrayTest1();
        test.shouldFindNumberInArrayTest2();
        test.shouldFindNumberInArrayTest3();
        test.shouldNotFindNumberInArrayTest1();
        test.shouldNotFindNumberInArrayTest2();
        test.shouldNotFindNumberInArrayTest3();
        System.out.println("Task 13");
        test.shouldFindNumberInArray3TimesTest();
        test.shouldFindNumberInArray2TimesTest();
        test.shouldFindNumberInArray1TimeTest();
        test.shouldNotFindNumberInArrayTest4();
        System.out.println("Task 14");
        test.shouldReplaceFirstNumber3InArrayTest();
        test.shouldReplaceFirstNumber2InArrayTest();
        test.shouldNotReplaceNumberInArrayTest1();
        System.out.println("Task 15");
        test.shouldReplaceNumber2ThreeTimesTest();
        test.shouldReplaceNumber4TwoTimesTest();
        test.shouldNotReplaceNumberInArrayTest2();
        System.out.println("Task 16");
        test.shouldRevertArrayTest1();
        test.shouldRevertArrayTest2();
        test.shouldRevertArrayTest3();
        System.out.println("Task 17");
        test.shouldSortArrayTest1();
        test.shouldSortArrayTest2();
        test.shouldSortArrayTest3();


    }

    void shouldFindNumberInArrayTest1() {
        ArrayService service = new ArrayService();
        int[] arr = {1, 2, 3};
        checkResult(service.contains(arr, 1), "shouldFindNumberInArrayTest1");
    }

    void shouldFindNumberInArrayTest2() {
        ArrayService service = new ArrayService();
        int[] arr = {1, 2, 3};
        checkResult(service.contains(arr, 2), "shouldFindNumberInArrayTest2");
    }

    void shouldFindNumberInArrayTest3() {
        ArrayService service = new ArrayService();
        int[] arr = {1, 2, 3};
        checkResult(service.contains(arr, 3), "shouldFindNumberInArrayTest3");
    }

    void shouldNotFindNumberInArrayTest1() {
        ArrayService service = new ArrayService();
        int[] arr = {1, 2, 3};
        checkResult(!service.contains(arr, -1), "shouldNotFindNumberInArrayTest1");
    }

    void shouldNotFindNumberInArrayTest2() {
        ArrayService service = new ArrayService();
        int[] arr = {1, 2, 3};
        checkResult(!service.contains(arr, 4), "shouldNotFindNumberInArrayTest2");
    }

    void shouldNotFindNumberInArrayTest3() {
        ArrayService service = new ArrayService();
        int[] arr = {1, 2, 3};
        checkResult(!service.contains(arr, 0), "shouldNotFindNumberInArrayTest3");
    }

    void shouldFindNumberInArray3TimesTest() {
        ArrayService service = new ArrayService();
        int[] arr = {1, 2, 3, 3, 3};
        checkResult(service.countOccurrences(arr, 3) == 3, "shouldFindNumberInArray3TimesTest");
    }

    void shouldFindNumberInArray2TimesTest() {
        ArrayService service = new ArrayService();
        int[] arr = {1, 2, 2, 3};
        checkResult(service.countOccurrences(arr, 2) == 2, "shouldFindNumberInArray2TimesTest");
    }

    void shouldFindNumberInArray1TimeTest() {
        ArrayService service = new ArrayService();
        int[] arr = {1, 2, 3};
        checkResult(service.countOccurrences(arr, 1) == 1, "shouldFindNumberInArray1TimeTest");
    }

    void shouldNotFindNumberInArrayTest4() {
        ArrayService service = new ArrayService();
        int[] arr = {2, 3, 4, 5};
        checkResult(service.countOccurrences(arr, 1) == 0, "shouldNotFindNumberInArrayTest4");
    }

    void shouldReplaceFirstNumber2InArrayTest() {
        ArrayService service = new ArrayService();
        int[] arr = {1, 2, 2, 3, 4};
        service.replaceFirst(arr, 2, 3);
        checkResult(service.countOccurrences(arr, 2) == 1, "shouldReplaceFirstNumber2InArrayTest");
    }

    void shouldReplaceFirstNumber3InArrayTest() {
        ArrayService service = new ArrayService();
        int[] arr = {1, 2, 2, 3, 4};
        service.replaceFirst(arr, 3, 2);
        checkResult(service.countOccurrences(arr, 2) == 3, "shouldReplaceFirstNumber3InArrayTest");
    }

    void shouldNotReplaceNumberInArrayTest1() {
        ArrayService service = new ArrayService();
        int[] arr = {1, 2, 3, 4};
        checkResult(!service.replaceFirst(arr, 5, 4), "shouldNotReplaceNumberInArrayTest1");
    }

    void shouldReplaceNumber2ThreeTimesTest() {
        ArrayService service = new ArrayService();
        int[] arr = {1, 2, 2, 2, 3, 4};
        checkResult(service.replaceAll(arr, 2, 1) == 3, "shouldReplaceNumber2ThreeTimesTest");
    }

    void shouldReplaceNumber4TwoTimesTest() {
        ArrayService service = new ArrayService();
        int[] arr = {1, 2, 3, 4, 4};
        checkResult(service.replaceAll(arr, 4, 5) == 2, "shouldReplaceNumber4TwoTimesTest");
    }

    void shouldNotReplaceNumberInArrayTest2() {
        ArrayService service = new ArrayService();
        int[] arr = {1, 2, 3, 4, 5};
        checkResult(service.replaceAll(arr, 6, 7) == 0, "shouldNotReplaceNumberInArrayTest2");
    }

    void shouldRevertArrayTest1() {
        ArrayService service = new ArrayService();
        int[] arr = {1, 2, 3, 4};
        service.revert(arr);
        checkResult((arr[0] == 4 && arr[3] == 1), "shouldRevertArrayTest1");
    }

    void shouldRevertArrayTest2() {
        ArrayService service = new ArrayService();
        int[] arr = {4, 3, 2, 1};
        service.revert(arr);
        checkResult((arr[0] == 1 && arr[3] == 4), "shouldRevertArrayTest2");
    }

    void shouldRevertArrayTest3() {
        ArrayService service = new ArrayService();
        int[] arr = {43, 25, 31, 47, 13};
        service.revert(arr);
        checkResult((arr[0] == 13 && arr[4] == 43), "shouldRevertArrayTest3");
    }

    void shouldSortArrayTest1() {
        ArrayService service = new ArrayService();
        int[] arr = {24, 12, 3, 27, 2, 56};
        service.bubbleSort(arr);
        checkResult((arr[0] == 2 && arr[5] == 56), "shouldSortArrayTest1");
    }

    void shouldSortArrayTest2() {
        ArrayService service = new ArrayService();
        int[] arr = {6, 5, 4, 2, 2, 1};
        service.bubbleSort(arr);
        checkResult((arr[1] == 2 && arr[2] == 2), "shouldSortArrayTest2");
    }

    void shouldSortArrayTest3() {
        ArrayService service = new ArrayService();
        int[] arr = {100, 0, 0, 0, -1, 1};
        service.bubbleSort(arr);
        checkResult((arr[0] == -1 && arr[5] == 100), "shouldSortArrayTest3");
    }

    void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

}
