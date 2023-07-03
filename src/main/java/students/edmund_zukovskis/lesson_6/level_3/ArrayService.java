package students.edmund_zukovskis.lesson_6.level_3;

public class ArrayService {
    public boolean contains(int[] array, int numberToSearch) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    public int countOccurrences(int[] array, int numberToSearch) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToSearch) {
                count++;
            }
        }
        return count;
    }

    public void replaceFirst(int[] array, int numberToSearch, int numberToReplace) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToSearch) {
                array[i] = numberToReplace;
                break;
            }
        }
    }

    public void replaceAll(int[] array, int numberToSearch, int numberToReplace) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToSearch) {
                array[i] = numberToReplace;
            }
        }
    }

    public void reverse(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[i]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

}
