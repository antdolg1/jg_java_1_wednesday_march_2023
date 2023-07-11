package students.vladislav_antoniv.lesson_11.level_1;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Duplicates {
    public static void main(String[] args) {
        List<String> array = new ArrayList<>();
        List<Integer> linked = new LinkedList<>();
        array.add("Duplicate");
        array.add("Duplicate");
        linked.add(777);
        linked.add(777);
        for (String arr : array) {
            System.out.println(arr);
        }
        for (Integer link : linked) {
            System.out.println(link);
        }
    }
}
