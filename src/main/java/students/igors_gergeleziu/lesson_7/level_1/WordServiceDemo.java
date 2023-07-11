package students.igors_gergeleziu.lesson_7.level_1;

import java.util.Scanner;

class WordServiceDemo {
    public static void main(String[] args) {
        WordService wordService = new WordService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your text: ");
        String text = scanner.nextLine();
        String textLowerCase = wordService.getTextToLowerCase(text);
        String textWithoutSymbols = wordService.getTextWithoutSymbols(textLowerCase);
        wordService.findMostFrequentWord(textWithoutSymbols);
    }
}
