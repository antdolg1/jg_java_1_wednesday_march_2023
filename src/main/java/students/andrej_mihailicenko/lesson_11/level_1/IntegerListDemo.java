package students.andrej_mihailicenko.lesson_11.level_1;

import java.util.LinkedList;

public class IntegerListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> numbers= new LinkedList<>();
        numbers.add(11);
        numbers.add(12);
        numbers.add(19);
        numbers.add(13);
        numbers.add(28);

        numbers.addFirst(10); // Добавить первый элемент
        numbers.addLast(14); // Добавить последний элемент

        numbers.remove(3); // Удаление по индексу
        numbers.removeFirstOccurrence(28); // Удаление элемента

        numbers.isEmpty(); // Пустой ли список

        System.out.println("Элементы списка: ");
        for (Object elements : numbers) {
            System.out.println(elements);
        }

        System.out.println("Размер списка: " + numbers.size()); // Размер списка
        System.out.println("Пустой ли список: " + numbers.isEmpty()); // Пустой ли список

    }
}