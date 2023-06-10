package students.edmund_zukovskis.lesson_10.level_1.task_3;

interface MyList<T> {
    /*
    to be able to know the size of list
     */
    int size();

    /*
    to be able to know if list is empty or not
     */
    boolean isEmpty();

    /*
    to get element by it index
     */
    T get(int index) throws IndexOutOfBoundsException;

    /*
    to be able to add element to the end of list
    */
    void add(T item);

    /*
    to be able to insert element in the list by index
    */
    void add(T item, int index) throws IndexOutOfBoundsException;

    /*
    to be able to remove element from the list by it index
    */
    T remove(int index) throws IndexOutOfBoundsException;

    /*
    to remove all elements from the list
    */
    void clear();
}
