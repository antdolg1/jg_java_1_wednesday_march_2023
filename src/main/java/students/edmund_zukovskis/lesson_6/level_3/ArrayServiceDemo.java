package students.edmund_zukovskis.lesson_6.level_3;

import java.util.Arrays;

public class ArrayServiceDemo {
    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();

        int[] myArray = {3, 1, 2, 4, 5};
        int numberToSearch = 3;
        int numberToReplace = 7;

        boolean containsNumber = arrayService.contains(myArray, numberToSearch);
        int occurrences = arrayService.countOccurrences(myArray, numberToSearch);
//        arrayService.replaceFirst(myArray, numberToSearch, numberToReplace);
//       arrayService.replaceAll(myArray, numberToSearch, numberToReplace);
//        arrayService.reverse(myArray);
        arrayService.sort(myArray);

        if (containsNumber) {
            System.out.println("Array contains number " + numberToSearch);
        } else {
            System.out.println("Array does not contain number " + numberToSearch);
        }
        System.out.println("Number " + numberToSearch + " appears in array " + occurrences + " times");
        //System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(myArray));
    }


}
