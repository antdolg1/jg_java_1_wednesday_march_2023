package students.igors_gergeleziu.lesson_7.level_6.task_12;

class ArrayCopy {
    void printArray(int[] array) {
        for (int cell : array) {
            System.out.print(cell + " ");
        }
    }

    int[] copyInRange(int[] array, int numberFrom, int numberTo) {
        int sizeOfArray = 0;
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= numberFrom && array[i] <= numberTo)
                sizeOfArray++;
        }
        int[] numbersInArray = new int[sizeOfArray];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= numberFrom && array[i] <= numberTo) {
                numbersInArray[j] = array[i];
                j++;
            }

        }
        return numbersInArray;
    }
}
