package students.vladislav_antoniv.lesson_7;

import java.util.Scanner;

class WordService {

    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text");
        String text = scanner.nextLine();
        return text;
    }

    public static String findMostFrequentWord(String text) {
        int count = 0;
        int max = 0;
        String mostFrequentWord = "";
        String[] array = text.split(" ");
        for (int i = 0; i < array.length; i++) {
            count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    count++;
                    //System.out.println(count);
                }
            }
            if (count > max) {
                max = count;
                mostFrequentWord = array[i] + ";" + max;
            }
        }
        return mostFrequentWord;
    }

    public static void printResult(String mostFrequentWord) {
        String[] array = mostFrequentWord.split(";");
        System.out.println("The most frequent word in your text is: " + array[0] + ", it is used " + array[1] + " times");
    }

    public static void main(String[] args) {
        printResult(findMostFrequentWord(getInput()));
    }
}