package students.igors_gergeleziu.lesson_6.level_3;

class ArrayService {
    boolean contains(int[] arr, int numberToSearch) {
        boolean doArrayContainsNumberToSearch = false;
        for (int arrayNumber : arr) {
            if (arrayNumber == numberToSearch) {
                doArrayContainsNumberToSearch = true;
            }
        }
        return doArrayContainsNumberToSearch;
    }

    int countOccurrences(int[] arr, int numberToSearch) {
        int countSearchingNumbersInArray = 0;
        for (int arrayNumber : arr) {
            if (arrayNumber == numberToSearch) {
                countSearchingNumbersInArray++;
            }
        }
        return countSearchingNumbersInArray;
    }

    boolean replaceFirst(int[] arr, int numberToReplace, int newNumber) {
        boolean isNumberInArray = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                isNumberInArray = true;
                break;
            }
        }
        return isNumberInArray;
    }

    int replaceAll(int[] arr, int numberToReplace, int newNumber) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                count++;
            }
        }
        return count;
    }

    void revert(int[] arr) {
        int[] arrayCopy = new int[arr.length];
        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            arrayCopy[j] = arr[i];
            j--;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arrayCopy[i];
        }
    }

    void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
}
