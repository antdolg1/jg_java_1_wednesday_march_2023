package students.jegors_rutkovskis.lesson_10.level_5_6;

import java.util.List;

interface BookReader {
    boolean addBook(Book book);

    boolean removeBook(Book book);

    String[] getBooksArray();

    Book findByAuthorExactMatch(String author);

    List<Book> findByAuthor(String author);

    Book findByTitleExactMatch(String title);

    List<Book> findByTitle(String title);

    boolean markAsRead(Book book);

    boolean markAsUnread(Book book);

    List<String> getBooksMarkedAsRead();

    List<String> getBooksMarkedAsUnread();
}
