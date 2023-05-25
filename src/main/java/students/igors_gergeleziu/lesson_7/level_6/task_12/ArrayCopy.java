package students.igors_gergeleziu.lesson_7.level_6.task_12;

class ArrayCopy {
    void printArray(int[] array) {
        for (int cell : array) {
            System.out.print(cell + " ");
        }
    }

    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int sizeOfArray = 0;
        int j = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] >= numberFrom && in[i] <= numberTo)
                sizeOfArray++;
        }
        int[] numbersInArray = new int[sizeOfArray];
        for (int i = 0; i < in.length; i++) {
            if (in[i] >= numberFrom && in[i] <= numberTo) {
                numbersInArray[j] = in[i];
                j++;
            }

        }
        return numbersInArray;
    }
}
