package students.jegors_rutkovskis.lesson_10.level_1;

interface MyList {
    // Добавление элемента в конец списка
    void addElement(int[] array, int element);

    // Вставка элемента по индексу
    void addElementByIndex(int[] array, int element, int index);

    // Удаление элемента из списка
    void removeElementFromArray(int[] array, int element);

    // Поиск индекса элемента
    int findIndexOfElement(int[] array, int element);

    // Получение элемента по индексу
    int getElementByIndex(int[] array, int index);

    // Изменение длины массива
    int[] changeLengthOfArray(int[] array, int newLength);

    // Копирование массива
    int[] copy(int[] array, int newArrayLength);

    // Объединение массивов в один массив
    int[] addArray(int[] firstArray, int[] secondArray);

    // Очистить список
    void clearList();
}
