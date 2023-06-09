package students.jegors_rutkovskis.lesson_10.level_5_6;

import java.util.List;

class BookValidator {
    boolean isValidTitle(Book book) {
        return book.getTitle().matches(".*[a-zA-Zа-яА-Я0-9].*");
    }
    boolean isValidAuthor(Book book) {
        return book.getAuthor().matches(".*[a-zA-Zа-яА-Я0-9].*");
    }
    boolean containsBook(Book book, List<Book> bookList) {
        for (Book b : bookList) {
            if (b.getTitle().equalsIgnoreCase(book.getTitle())
                    && b.getAuthor().equalsIgnoreCase(book.getAuthor())) {
                return true;
            }
        }
        return false;
    }
}
