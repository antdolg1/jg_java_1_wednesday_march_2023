package students.edmund_zukovskis.lesson_7.level_6.task_12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayCopyTest {
    @Test
    public void copyInRangeWithNoMatches() {
        int[] in = {1, 2, 3, 4, 5};
        int[] out = ArrayCopy.copyInRange(in, 6, 10);
        Assertions.assertArrayEquals(new int[]{}, out);
    }

    @Test
    public void copyInRangeWithAllMatches() {
        int[] in = {1, 2, 3, 4, 5};
        int[] out = ArrayCopy.copyInRange(in, 1, 5);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, out);
    }

    @Test
    public void copyInRangeWithSomeMatches() {
        int[] in = {1, 2, 3, 4, 5};
        int[] out = ArrayCopy.copyInRange(in, 2, 4);
        Assertions.assertArrayEquals(new int[]{2, 3, 4}, out);
    }
}
