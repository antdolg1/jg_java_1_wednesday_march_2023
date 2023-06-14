package teacher.lesson_11.lessoncode;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        //Creating an ArrayList:
        List<String> fruits = new ArrayList<>();

        //Adding elements:
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Kiwi");

        //Accessing elements:
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        //Modifying elements:
        fruits.set(1, "Mango");
        String secondFruit = fruits.get(1);
        System.out.println("Second fruit: " + secondFruit);

        //Removing elements:
        fruits.remove(3);

        //Checking the size:
        int size = fruits.size();
        System.out.println("Number of fruits: " + size);

        //Iterating over elements:
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        //Clearing the list:
        fruits.clear();
        System.out.println("Number of fruits: " + fruits.size());
    }
}
