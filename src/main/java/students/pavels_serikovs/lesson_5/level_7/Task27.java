package students.pavels_serikovs.lesson_5.level_7;

public class Task27 {

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.newArrayWithRandomLength();
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArray(array);
        int maxNumber = arrayUtil.findMaxInArray(array);
        System.out.println("Max number = " + maxNumber);
    }
}
