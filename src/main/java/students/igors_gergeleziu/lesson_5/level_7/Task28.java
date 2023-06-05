package students.igors_gergeleziu.lesson_5.level_7;

class Task28 {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.generateArrayRandomSize();
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArrayToConsole(array);
        int minNumber = arrayUtil.findMinNumber(array);
        System.out.println("Min number in array: " + minNumber);
    }
}
