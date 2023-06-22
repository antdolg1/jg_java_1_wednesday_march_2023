package students.andrej_mihailicenko.lesson_11.level_2_3_4_5;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordFinder {
    Set<String> find(String text) {
        Set<String> uniqueWords = new HashSet<>();
        String[] words = text.split("\\s+");
        for (String word : words) {
            uniqueWords.add(word.toLowerCase());
        }
        return uniqueWords;
    }
}