package students.jegors_rutkovskis.lesson_11.level_1.task_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println("List contents: " + list);

        list.add(4);
        System.out.println("Adding element to the end of list: " + list);

        list.add(0, 4);
        System.out.println("Adding (by index) to the beginning of list: " + list);

        System.out.println("List size: " + list.size());

        list.remove((Integer) 1);
        System.out.println("Removing object from list: " + list);

        list.remove(0);
        System.out.println("Removing by index from list: " + list);

        System.out.println("Is list empty? - " + list.isEmpty());
        System.out.println("**********************");
        for (Integer e : list) {
            System.out.println("Element by index " + list.indexOf(e) + " = " + e);
        }
    }
}
