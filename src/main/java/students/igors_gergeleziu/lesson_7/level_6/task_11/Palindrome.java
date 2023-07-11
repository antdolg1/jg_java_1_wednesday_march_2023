package students.igors_gergeleziu.lesson_7.level_6.task_11;

import java.util.Arrays;

class Palindrome {
    boolean isPalindrome(String text) {
        String textLowerCase = text.toLowerCase();
        String textWithoutSymbols = textLowerCase.replaceAll("[/\\s@#$%.+^,!/g]*", "");
        char[] charArrayCopy = textWithoutSymbols.toCharArray();
        int sizeOfArray = charArrayCopy.length;
        char[] charArrayOriginal = Arrays.copyOf(charArrayCopy, sizeOfArray);

        for (int i = 0; i < sizeOfArray / 2; i++) {
            char temp = charArrayCopy[i];
            charArrayCopy[i] = charArrayCopy[sizeOfArray - i - 1];
            charArrayCopy[sizeOfArray - i - 1] = temp;
        }
        /*System.out.println("Original Array" + Arrays.toString(charArrayOriginal));
        System.out.println("Reverse Array" + Arrays.toString(charArrayCopy));*/
        if (Arrays.equals(charArrayCopy, charArrayOriginal) && !(isArrayEmptyOrContainsOneChar(charArrayCopy))) {
            /* System.out.println("Entered string is a palindrome");*/
            return true;
        } else {
            /* System.out.println("Entered string is not a palindrome");*/
            return false;
        }

    }

    boolean isArrayEmptyOrContainsOneChar(char[] array) {
        boolean isEmpty = false;
        if (array.length == 1 || array[0] == '\n') {
            isEmpty = true;
        }
        return isEmpty;
    }

}
