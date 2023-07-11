package students.pavels_serikovs.lesson_7.level_7;

public class WordServiceTwo {
    public String findMostFrequentWord(String text) {
        String[] words = text.split(" ");
        String mostFrequentWord = "";
        int maxCount = 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int count = 0;
            if (word.isEmpty()) {
                continue;
            }
            for (int j = i; j < words.length; j++) {
                if (word.equals(words[j])) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostFrequentWord = word;
            }
        }
        return mostFrequentWord;
    }
}
