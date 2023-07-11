package students.pavels_serikovs.lesson_7.level_6;

public class ArrayCopy {
    public int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int count = 0;
        for (int num : in) {
            if (num >= numberFrom && num <= numberTo) {
                count++;
            }
        }

        int[] size = new int[count];
        int index = 0;
        for (int num : in) {
            if (num >= numberFrom && num <= numberTo) {
                size[index++] = num;
            }
        }
        return size;
    }
}
