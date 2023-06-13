package teacher.lesson_11.lessoncode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {

        List<String> names = new LinkedList<>();
        names.add("Alice");
        names.add("Aalice");
        names.add("Aalice");
        names.add("Aalice");
        names.add("Bob");
        names.add("Susan");
        names.add("Wolfgan");
        names.add("Guntar");

        String firstName = names.get(0);
        System.out.println("First name: " + firstName);

        names.set(1, "Eva");

        names.remove(2);

        int size = names.size();
        System.out.println("Number of names: " + size);

        for (String name : names) {
            System.out.println(name);
        }

        List<Integer> numbers = new LinkedList<>();
        numbers.add(32);
        numbers.add(3);
        numbers.add(265);
        numbers.add(12212);
        numbers.add(999);
        numbers.add(100);
        numbers.add(6);

        System.out.println("Numbers content: " + numbers);

        Collections.sort(numbers);
        System.out.println("Numbers content after sorting: " + numbers);

        Collections.sort(names);
        System.out.println("Names content after sorting: " + names);

    }
}
