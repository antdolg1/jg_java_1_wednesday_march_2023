package students.edmund_zukovskis.lesson_11.level_1.task_3;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(4);
        list.add(6);
        list.add(1);
        list.add(2);
        list.add(5);
        System.out.println(list);

        list.add(0, 0);
        System.out.println(list);

        int size = list.size();
        System.out.println("List has " + size + " numbers.");

        list.remove(2);
        System.out.println(list);

        Integer listToRemove = Integer.valueOf(1);
        boolean removed = list.remove(listToRemove);

        boolean empty = list.isEmpty();

        for (Integer integer : list) {
            System.out.println(list);
        }
    }
}
