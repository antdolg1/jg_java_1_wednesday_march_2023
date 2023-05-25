package students.igors_gergeleziu.lesson_7.level_7.task_13;

class WordService {
    public String findMostFrequentWord(String text) {
        String[] textArray;
        int[] wordCountArray;
        textArray = text.split(" ");
        wordCountArray = new int[textArray.length];

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

        int max = 0;
        for (int count =0; count < wordCountArray.length; count++) {
            if (wordCountArray[count] > max) {
                max = count;
            }
        }
        return textArray[max];
    }
}
