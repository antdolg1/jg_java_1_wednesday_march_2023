package students.pavels_serikovs.lesson_7.level_1;

import java.util.Scanner;

public class WordService {
    public String findMostFrequentWord(String text) {
        String[] words = text.split(" ");
        int maxCount = 0;
        String frequentWord = "";

        for (int i = 0; i < words.length; i++) {
            int count = 1;

            if (words[i].equals("0")) {
                continue;
            }

            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }
            }

            if (count > maxCount) {
                maxCount = count;
                frequentWord = words[i];
            }
        }

        return frequentWord;
    }

    public String getTextFromUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter you text: ");
        String userText = scan.nextLine();
        return userText;
    }
}
