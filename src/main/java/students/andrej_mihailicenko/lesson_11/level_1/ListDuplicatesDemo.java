package students.andrej_mihailicenko.lesson_11.level_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListDuplicatesDemo {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        myList.add("Andrey");
        myList.add("Andrey");
        myList.add("Nikita");

        System.out.println("List with duplicates: " + myList);

        Set<String> set = new HashSet<>(myList);

        if (set.size() == myList.size()) {
            System.out.println("Список не содержит дубликатов");
        } else {
            System.out.println("Список содержит дубликаты");
        }
    }
}
