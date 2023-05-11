package teacher.lesson_6.lessoncode;

public class ArrayUtilsDemo {

    public static void main(String[] args) {
        int arrayLength = CustomArrayUtils.getArrayLengthFromUser();
        int arrayLength2 = CustomArrayUtils.getArrayLengthFromUser();
        int[] array1 = CustomArrayUtils.createArray(arrayLength);
        int[] array2 = CustomArrayUtils.createArray(arrayLength2);
//        CustomArrayUtils.fillArrayWithRandomNumbersWithLimit(array1, 101);
//        CustomArrayUtils.fillArrayWithRandomNumbers(array);
        CustomArrayUtils.fillArrayWithNumbersFromUser(array1);
        CustomArrayUtils.fillArrayWithNumbersFromUser(array2);
        CustomArrayUtils.printArrayToConsole(array1);
        CustomArrayUtils.printArrayToConsole(array2);
        System.out.println("Array1 and Array2 are the same? -" + CustomArrayUtils.arraysEqual(array1, array2));

    }
}
