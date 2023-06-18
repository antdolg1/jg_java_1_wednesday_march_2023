package students.edmund_zukovskis.lesson_11.level_1.task_5;

import java.util.ArrayList;
import java.util.List;

class BookListContainsDemo {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        Book book1 = new Book("Arnold", "Arnold in wonderland");
        Book book2 = new Book("Pikachu", "Pokemon and Pikachu story");

        books.add(book1);
        books.add(book2);

        Book bookInTheList = new Book("Arnold", "Arnold in wonderland");
        boolean containsBook = books.contains(bookInTheList);
        System.out.println(containsBook);

        Book bookNotInTheList = new Book("Phil", "Phil in Tokyo");
        boolean notContainsBook = books.contains(bookNotInTheList);
        System.out.println(notContainsBook);
    }
}
