package students.vladislav_antoniv.lesson_11.level_1;

import java.util.List;
import java.util.ArrayList;

public class PrimitivesOrLinksInList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        System.out.println("Is numbers[0] non primitive?");
        System.out.println(numbers.get(0) instanceof Integer); //Integer не является примитивом, им является int

    }
}
