package students.vladislav_antoniv.lesson_11.level_1;

import java.util.List;
import java.util.ArrayList;

public class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);//Добавление в конец списка
        numbers.add(3);
        numbers.add(144);
        numbers.add(10);
        numbers.add(133);
        numbers.add(13333);
        numbers.add(11);
        numbers.add(0, 555);//Добавление в начало списка

        numbers.remove(5);//Удаление по индексу
        boolean isEmpty = numbers.isEmpty();
        System.out.println(isEmpty);

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
