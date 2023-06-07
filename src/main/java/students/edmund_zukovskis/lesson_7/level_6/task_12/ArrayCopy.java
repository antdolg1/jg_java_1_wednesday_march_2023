package students.edmund_zukovskis.lesson_7.level_6.task_12;

import java.util.Arrays;

public class ArrayCopy {
    public static int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int[] out = new int[in.length];
        int j = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] >= numberFrom && in[i] <= numberTo) {
                out[j++] = in[i];
            }
        }
        return Arrays.copyOfRange(out, 0, j);
    }
}
