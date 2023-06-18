package students.edmund_zukovskis.lesson_11.level_2_3_4;

import java.util.Set;

class UniqueWordFinderTest {
    public static void main(String[] args) {
        UniqueWordFinder wordFinder = new UniqueWordFinder();

        String text = "Hello my name is Edmund, Hello I am 25";
        Set<String> uniqueWords = wordFinder.find(text);

        System.out.println("Unique words: " + uniqueWords);
    }

}
