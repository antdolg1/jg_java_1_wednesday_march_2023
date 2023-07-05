package students.andrej_mihailicenko.lesson_7.level_1;

import java.util.Scanner;

class WordService {
    public String findMostFrequentWord(String userText) {
        String[] words = userText.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        int[] counts = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    counts[i]++;
                }
            }
        }

        int maxCount = 0;
        int maxIndex = 0;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > maxCount) {
                maxCount = counts[i];
                maxIndex = i;
            }
        }
        return words[maxIndex];
    }

    public String getTextFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter you text: ");
        String userText = scanner.nextLine();
        return userText;
    }
}