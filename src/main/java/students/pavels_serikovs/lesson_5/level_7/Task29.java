package students.pavels_serikovs.lesson_5.level_7;

public class Task29 {

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.newArrayWithRandomLength();
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArray(array);
        arrayUtil.printEvenNumbersOfArray(array);
    }
}
