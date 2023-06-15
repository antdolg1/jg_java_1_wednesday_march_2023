package students.jegors_rutkovskis.lesson_11.level_1.task_2;

import java.util.ArrayList;
import java.util.List;

class PrimitiveOrReferenceTypes {
    public static void main(String[] args) {
        /**
         * при создании списка, задаём ссылочный тип данных
         */
        List<Integer> list = new ArrayList<>();
        /** добавляем примитивный тип данных в список -
         * Java сама их преобразует в объект Integer (autoboxing - "авто-упаковка")
         */
        list.add(1);
        list.add(2);
        list.add(3);

        int x = list.get(0); // получаем элемент списка как примитивный тип
        System.out.println("element 0 = " + x);

        Integer y = list.get(0); // получаем элемент списка как ссылку на объект Integer
        System.out.println("element 0 = " + y);

        System.out.println("List contents: " + list);
    }
}
