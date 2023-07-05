package teacher.lesson_15.lessoncode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxDifferenceCalculator {


    public static Integer calculateMaxDifference(int[] nums) {
        List<Integer> integerList = new ArrayList<>();

        for (int i : nums) {
            integerList.add(i);
        }

        Integer maxValue = Collections.max(integerList);
        Integer minValue = Collections.min(integerList);
        return maxValue - minValue;

    }

    public static void main(String[] args) {
        int[] nums = {2, 9, 5, 1, 7, 4, 8, 3};
        int maxDifference = calculateMaxDifference(nums);
        System.out.println("Max difference: " + maxDifference);
    }

}
