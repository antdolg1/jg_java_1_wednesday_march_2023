package students.igors_gergeleziu.lesson_10.level_1;

public interface MyList {
    public void clear();//Removes all of the elements from this list
    public void add(int index, Object element);//Inserts the specified element at the specified position in this list
    public boolean contains(Object o);//Returns true if this list contains the specified element
    public boolean equals(Object o);//Compares the specified object with this list for equality
    public Object get(int index);//Returns the element at the specified position in this list
    public int indexOf(Object o);//Returns the index of the first occurrence of the specified element in this list
    public void set(int index, Object element);//Replaces the element at the specified position in this list with the specified element

}
