package students.jegors_rutkovskis.lesson_7.level_1;
class WordService {
    public String findMostFrequentWord(String text) {
        return findMostFrequentWord(text.toLowerCase()
                .split("[^\\p{L}]+"));
    }
    String findMostFrequentWord(String[] wordsArr) {
        String mostFrequent = wordsArr[0];
        int maxCount = 0;
        for (String word : wordsArr) {
            int count = getWordCount(wordsArr, word);
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = word;
            }
        }
        return mostFrequent;
    }
    int getWordCount(String[] wordsArr, String word) {
        int count = 0;
        for (String w : wordsArr) {
            if (word.equals(w)) {
                count++;
            }
        }
        return count;
    }
}
