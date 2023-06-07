package students.edmund_zukovskis.lesson_7.level_1.task_1;

import java.util.Arrays;

public class WordServiceTest {
    public static void main(String[] args) {

        WordServiceTest test = new WordServiceTest();
        String[] splitText = test.string();
        test.amount(splitText);
        test.findMostRepeatWordIndex(splitText);
    }

    private String[] string() {
        String text = "Hello now feel Hello not Hello ";
        String[] splitText = text.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        return splitText;
    }

    public int[] amount(String[] splitText) {
        WordService word = new WordService();
        int[] amountOfWords = word.counterEachWord(splitText);
        int[] expectedResult = {3, 1, 1, 3, 1, 3};
        check(amountOfWords, expectedResult, " Amount words in array: ");
        return amountOfWords;
    }

    public int findMostRepeatWordIndex(String[] splitText) {
        WordService word = new WordService();
        int[] realResult = word.counterEachWord(splitText);
        int realIndex = word.findMostRepeatWord(realResult);
        int expectedIndex = 0;
        checkIndex(realIndex, expectedIndex, " Find most repeat word: ");
        return realIndex;

    }

    public void check(int[] realResult, int[] expectedResult, String nameText) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println("Test " + nameText + " is OK");
        } else {
            System.out.println("Test " + nameText + " is Fail");
        }
    }

    public void checkIndex(int realResult, int expectedResult, String nameText) {
        if (expectedResult == realResult) {
            System.out.println("Test " + nameText + " is OK");
        } else {
            System.out.println("Test " + nameText + " is Fail");
        }
    }

}

