package students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6;

import java.util.*;

public class UniqueWordFinder {
    public static void main(String[] args) {
        UniqueWordFinder finder = new UniqueWordFinder();
        String text = "Cat sleeping, cat playing, cat meowing";
        System.out.println(finder.find(text));
    }
    protected Set<String> find(String text) {
        return new TreeSet<>(List.of(text.toLowerCase().split("[^a-zA-Zа-яА-Я]+")));
    }
}
