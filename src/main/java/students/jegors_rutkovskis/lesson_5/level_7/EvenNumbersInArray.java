package students.jegors_rutkovskis.lesson_5.level_7;

class EvenNumbersInArray {
    public static void main(String[] args) {

        int[] array = ArrayUtil.createArray(3);

        ArrayUtil.fillArrayWithRandomNumbers(array, -101, 101);

        ArrayUtil.printArrayToConsole(array);

        int[] evenArray = ArrayUtil.getEvenNumbers(array);

        if (evenArray.length > 0) {
            System.out.print("Even numbers in ");
            ArrayUtil.printArrayToConsole(evenArray);
        } else {
            System.err.println("There is no even numbers in array!");
        }

    }
}
