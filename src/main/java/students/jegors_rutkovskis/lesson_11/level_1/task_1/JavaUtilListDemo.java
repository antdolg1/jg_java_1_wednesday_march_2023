package students.jegors_rutkovskis.lesson_11.level_1.task_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class JavaUtilListDemo {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Java.");
        arrayList.add("util.");
        arrayList.add("ArrayList demonstration");
        System.out.println("""
                 * ArrayList хранит элементы в массиве. Хорош тем,
                 * что имеет быстрый доступ к элементам в массиве.
                 * Но, при удалении или вставке элементов может потребоваться
                 * больше времени, чтобы сдвинуть все последующие элементы в массиве.""");
        System.out.println("*********************************");
        for (String element : arrayList) {
            System.out.print(element);
        }
        System.out.println("\n*********************************");

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add((int)20.0);
        linkedList.add(30);

        System.out.println("""
                 * LinkedList - хранит элементы в связанном списке, где каждый элемент
                 * ссылается на следующий и предыдущий элементы.
                 * В отличие от ArrayList, быстрее при вставке или удалении элементов
                 * из середины списка, но более медленный при доступе к элементам по индексу.""");

        for (Integer element : linkedList) {
            System.out.println("element " + linkedList.indexOf(element) + " = " + element);
        }
        System.out.println("**********************************");
    }
}
