package students.jegors_rutkovskis.lesson_11.level_1.task_5;

import java.util.ArrayList;
import java.util.List;

class BookListContainsDemo {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        Book book1 = new Book("A1", "B1");
        Book book2 = new Book("A2", "B2");

        books.add(book1);
        books.add(book2);

        Book bookInTheList = new Book("A1", "B1");
        boolean containsBook = books.contains(bookInTheList); // должно быть true
        // для сравнения, надо переопределить метод equals() в классе Book
        System.out.println(bookInTheList + "contains in the list? - " + containsBook);

        Book bookNotInTheList = new Book("A3", "B3");
        boolean notContainsBook = books.contains(bookNotInTheList); // должно быть false
        System.out.println(bookNotInTheList + "contains in the list? - " + notContainsBook);
    }
}
