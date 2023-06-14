package students.igors_gergeleziu.lesson_5.level_7;

class Task25 {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int arrayLength = arrayUtil.getArrayLengthFromUser();
        int[] array = arrayUtil.createArray(arrayLength);
        arrayUtil.fillArrayByUser(array);
        arrayUtil.printArrayToConsole(array);
    }
}
