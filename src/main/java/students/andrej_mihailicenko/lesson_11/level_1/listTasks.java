package students.andrej_mihailicenko.lesson_11.level_1;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class listTasks {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        List<Double> vector = new Vector<>();
        Stack<String> stack = new Stack<>();
        List<Long> copyOnWriteArrayList = new CopyOnWriteArrayList<>();

        arrayList.add("Audi");
        arrayList.add("Bmw");
        arrayList.add("Volvo");

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        vector.add(32.2);
        vector.add(33.2);
        vector.add(null);

        stack.push("Andrey");
        stack.push("Mark");
        stack.push("Vlad");

        copyOnWriteArrayList.add(1234L);
        copyOnWriteArrayList.add(5678L);
        copyOnWriteArrayList.add(9876L);

        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
        System.out.println("Vector: " + vector);
        System.out.println("Stack: " + stack);
        System.out.println("CopyOnWriteArrayList: " + copyOnWriteArrayList);

    }
}
