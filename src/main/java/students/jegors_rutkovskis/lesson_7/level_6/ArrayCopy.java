package students.jegors_rutkovskis.lesson_7.level_6;

class ArrayCopy {
    int[] copyInRange(int[] input, int numberFrom, int numberTo) {
        int newArraySize = getNewArraySize(input, numberFrom, numberTo);
        int[] output = new int[newArraySize];
        int index = 0;
        for (int number : input) {
            if (number >= numberFrom && number <= numberTo) {
                output[index] = number;
                index++;
            }
        }
        return output;
    }
    private int getNewArraySize(int[] in, int numberFrom, int numberTo) {
        int size = 0;
        for (int j : in) {
            if (j >= numberFrom && j <= numberTo) {
                size++;
            }
        }
        return size;
    }
}
