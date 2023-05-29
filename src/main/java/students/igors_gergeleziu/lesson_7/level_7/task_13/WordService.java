package students.igors_gergeleziu.lesson_7.level_7.task_13;

class WordService {
    public String findMostFrequentWord(String text) {
        String[] textArray;
        int[] wordCountArray;
        textArray = text.split(" ");
        wordCountArray = new int[textArray.length];
        wordCompareAndCount(wordCountArray, textArray);
        return textArray[mostFrequentWordIndex(wordCountArray)];
    }

    int mostFrequentWordIndex(int[] wordCountArray) {
        int max = 0;
        int maxIndex = 0;
        for (int count = 0; count < wordCountArray.length; count++) {
            if (wordCountArray[count] > max) {
                max = wordCountArray[count];
                maxIndex = count;
            }
        }
        return maxIndex;
    }

    void wordCompareAndCount(int[] wordCountArray, String[] textArray) {
        int wordCounter = 0;
        for (int wordCount = 0; wordCount < textArray.length; wordCount++) {
            for (String s : textArray) {
                if (textArray[wordCount].equals(s)) {
                    wordCounter++;
                }
            }
            wordCountArray[wordCount] = wordCounter;
            wordCounter = 0;
        }
    }

}
