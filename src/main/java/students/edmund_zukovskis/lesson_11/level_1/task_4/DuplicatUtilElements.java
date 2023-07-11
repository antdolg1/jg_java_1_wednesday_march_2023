package students.edmund_zukovskis.lesson_11.level_1.task_4;

import java.util.ArrayList;
import java.util.List;

class DuplicatUtilElements {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("banana");

        System.out.println(fruits);
    }

}
