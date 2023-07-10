package students.andrej_mihailicenko.lesson_15.level_1;

class WordsService {

    public int countRepetitions(String[] words, String targetWord) {
        int repetitionCounter = 0;
        for (String word : words) {
            if (word.equals(targetWord)) {
                repetitionCounter++;
            }
        }
        return repetitionCounter;
    }

}
