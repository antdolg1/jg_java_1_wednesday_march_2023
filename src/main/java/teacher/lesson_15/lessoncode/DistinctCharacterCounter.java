package teacher.lesson_15.lessoncode;

import java.util.HashSet;
import java.util.Set;

public class DistinctCharacterCounter {

    public static int countDistinctCharacters(String str) {
        if (str == null || str.isBlank()) {
            return 0;
        }

        str = str.toLowerCase();
        Set<Character> distinctCharacters = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                distinctCharacters.add(ch);
            }
        }
        return distinctCharacters.size();
    }

    public static void main(String[] args) {
        String inputString = "Hello World!";
        System.out.println("Distinct chars count:" + countDistinctCharacters(inputString));
    }

}
