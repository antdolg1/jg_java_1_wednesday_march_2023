package students.jegors_rutkovskis.lesson_5.level_7;

class OddNumbersInArray {
    public static void main(String[] args) {

        int[] array = ArrayUtil.createArray(10);

        ArrayUtil.fillArrayWithRandomNumbers(array, -11, 11);

        ArrayUtil.printArrayToConsole(array);

        int[] oddArray = ArrayUtil.getOddNumbers(array);

        if (oddArray.length > 0) {
            System.out.print("Odd numbers in ");
            ArrayUtil.printArrayToConsole(oddArray);
        } else {
            System.err.println("There is no odd numbers in array!");
        }

    }
}
