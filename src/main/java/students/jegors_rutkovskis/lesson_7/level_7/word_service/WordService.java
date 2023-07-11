package students.jegors_rutkovskis.lesson_7.level_7.word_service;

class WordService {
    public String findMostFrequentWord(String text) {

        String[] textArray = splitTextToArray(text);
        int[] wordCountArray = wordCounterArray(text);
        int maxIndex = 0;
        for (int i = 0; i < wordCountArray.length; i++) {
            if (wordCountArray[i] > wordCountArray[maxIndex]) {
                maxIndex = i;
            }
        }
        return textArray[maxIndex];
    }

    private int[] wordCounterArray(String text) {
        String[] textArray = splitTextToArray(text);
        int[] wordCountArray = new int[textArray.length];

        for (int i = 0; i < textArray.length; i++) {
            int wordCounter = 0;
            for (String word : textArray) {
                if (textArray[i].equals(word)) {
                    wordCounter++;
                }
            }
            wordCountArray[i] = wordCounter;
        }
        return wordCountArray;
    }
    private String[] splitTextToArray(String text) {
        return text.toLowerCase().split(" ");
    }
}
