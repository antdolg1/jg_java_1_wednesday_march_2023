package students.edmund_zukovskis.lesson_11.level_2_3_4;

import java.util.HashSet;
import java.util.Set;

class UniqueWordFinder {

    public Set<String> find(String text) {
        String[] words = text.split("\\s+"); // Разделение текста на слова
        Set<String> uniqueWords = new HashSet<>();

        for (String word : words) {
            uniqueWords.add(word.toLowerCase()); // Добавление слова в нижнем регистре во множество
        }

        return uniqueWords;
    }
}
