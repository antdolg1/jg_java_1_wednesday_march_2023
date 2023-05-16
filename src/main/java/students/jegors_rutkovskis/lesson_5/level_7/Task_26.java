package students.jegors_rutkovskis.lesson_5.level_7;

class Task_26 {
    public static void main(String[] args) {

        int[] numbers = ArrayUtil.createArray(ArrayUtil.getArrayLengthFromUser());

        ArrayUtil.fillArrayWithRandomNumbers(numbers, 101);

        ArrayUtil.printArrayToConsole(numbers);
    }
}
