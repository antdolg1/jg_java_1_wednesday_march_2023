package students.vladislav_antoniv.lesson_10.level_1;

public interface MyList {
    int[] createList(); //создать лист

    int[] addToList(int number);//добавить число к листу в конец

    int[] removeFromList();//убрать число из листа с конца

    int[] sortAscend();//отсортировать по возрастающей

    int[] sortDescend();//отсортировать по убывающей

    boolean isEmpty();//проверить является ли лист пустым

    int size();

    int[] clearList();//удалить все данные из листа

    boolean contains(int number);//проверить находится ли введённое число в листе

    int[] posOfSearched(int searched);//вернуть все позиции, на которых обнаружено искомое число
}
