package students.jegors_rutkovskis.lesson_7.level_1;
class WordService {
    public String findMostFrequentWord(String text) {
        String lowerCaseText = toLowerCase(text);
        String[] wordsArr = textToArray(lowerCaseText);
        return findMostFrequentWord(wordsArr);
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
    String toLowerCase(String text) {
        return text.toLowerCase();
    }
    String[] textToArray(String text) {
        return text.split("[^\\p{L}]+");
    }
}
