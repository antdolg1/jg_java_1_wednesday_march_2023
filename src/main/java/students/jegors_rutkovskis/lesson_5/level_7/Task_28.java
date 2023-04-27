package students.jegors_rutkovskis.lesson_5.level_7;

class Task_28 {
    public static void main(String[] args) {

        int[] numbers = ArrayUtil.createArray(5);

        ArrayUtil.fillArrayWithRandomNumbers(numbers, -1000, 1000);

        ArrayUtil.printArrayToConsole(numbers);

        System.out.println("Min number in array = " + ArrayUtil.findMinNumber(numbers));

    }
}
