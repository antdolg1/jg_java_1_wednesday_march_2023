package students.andrej_mihailicenko.lesson_6.level_3;

import java.util.Arrays;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.numberToSearchTrue();
        arrayServiceTest.numberToSearchFalse();
        arrayServiceTest.numberCountTwo();
        arrayServiceTest.numberCountZero();
        arrayServiceTest.replaceFirstNumberTrue();
        arrayServiceTest.replaceFirstNumberFalse();
        arrayServiceTest.replaceAllTrue();
        arrayServiceTest.revertArray();
        arrayServiceTest.sortArray();
    }

    public void numberToSearchTrue() {
        int[] arr = {11, 22, 33};
        checkTestResult(ArrayService.contains(arr, 11) == true, "numberToSearchTrue");
    }

    public void numberToSearchFalse() {
        int[] arr = {11, 22, 33};
        checkTestResult(ArrayService.contains(arr, 113) == false, "numberToSearchFalse");
    }

    public void numberCountTwo() {
        int[] arr = {1, 2, 3, 3};
        int numberToCount = 3;
        int count = ArrayService.countOccurrences(arr, numberToCount);
        checkTestResult(count == 2, "numberCountTwo");
    }

    public void numberCountZero() {
        int[] arr = {1, 2, 3, 3};
        int numberToCount = 6;
        int count = ArrayService.countOccurrences(arr, numberToCount);
        checkTestResult(count == 0, "numberCountZero");
    }

    public void replaceFirstNumberTrue() {
        int[] arr = {26, 345, 321, 566};
        boolean result = ArrayService.replaceFirst(arr, 26, 33);
        checkTestResult(result == true && arr[0] == 33, "replace number true");
    }

    public void replaceFirstNumberFalse() {
        int[] arr = {26, 345, 321, 566};
        boolean result = ArrayService.replaceFirst(arr, 600, 353);
        checkTestResult(result == false && arr[0] == 26, "replace number false");
    }

    public void replaceAllTrue() {
        int[] arr = {26, 345, 321, 566, 26};
        int result = ArrayService.replaceAll(arr, 26, 7);
        checkTestResult(arr[0] == 7 && arr[4] == 7, "replaceAllTrue");
    }

    public void revertArray() {
        int[] arr = {228, 227, 226, 225};
        int[] result = ArrayService.revert(arr);
        checkTestResult(arr[0] == 225 && arr[3] == 228, "revertArray");
    }

    public void sortArray() {
        int[] arr = {5, 2, 1, 6, 3, 4};
        int[] sortedArr = ArrayService.sort(arr);
        int[] expectedArr = {1, 2, 3, 4, 5, 6};
        checkTestResult(Arrays.equals(sortedArr, expectedArr), "sortedArr");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
