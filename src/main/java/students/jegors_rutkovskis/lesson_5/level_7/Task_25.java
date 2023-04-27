package students.jegors_rutkovskis.lesson_5.level_7;

class Task_25 {
    public static void main(String[] args) {

        int[] numbers = ArrayUtil.createArray(ArrayUtil.getArrayLengthFromUser());

        ArrayUtil.fillArrayWithNumbersFromUser(numbers);

        ArrayUtil.printArrayToConsole(numbers);
    }
}
