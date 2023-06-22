package students.andrej_mihailicenko.lesson_11.level_1;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
//java.util.List может хранить ссылки на объекты.
// Примитивные типы данных не могут быть сохранены напрямую в List,
// но они могут быть автоматически упакованы в соответствующие оболочки, такие как Integer или Double,
// и сохранены как объекты.

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        int primitiveFive = 5;
        myList.add(primitiveFive);

        for (Object elements : myList) {
            System.out.println(elements);
        }

    }

}
