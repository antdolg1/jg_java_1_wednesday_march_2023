package students.igors_gergeleziu.lesson_5.level_7;

class Task30 {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.generateArrayRandomSize();
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArrayToConsole(array);
        arrayUtil.printOddIntegersOfArray(array);
    }
}
