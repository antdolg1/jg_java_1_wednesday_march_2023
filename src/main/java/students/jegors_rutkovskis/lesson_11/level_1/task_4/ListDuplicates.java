package students.jegors_rutkovskis.lesson_11.level_1.task_4;

import java.util.ArrayList;
import java.util.List;

class ListDuplicates {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Vasja");
        list.add("Stepan");
        list.add("Stepan");
        list.add("Stepan");
        /**
         * список может хранить дубликаты
         * список хранит разные ссылки на разные объекты,
         * даже если содержимое объектов одинаково.
         */
        System.out.println(list);
    }
}
