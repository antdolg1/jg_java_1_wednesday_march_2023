package students.vladislav_antoniv.lesson_11.level_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookDatabaseImpl implements BookDatabase {
    private List<Book> bookList;
    private Long nextId;

    public BookDatabaseImpl() {
        this.bookList = new ArrayList<>();
        this.nextId = 1L;
    }

    @Override
    public Long save(Book book) {
        book.setId(nextId);
        bookList.add(book);
        nextId++;
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        for (Book book : bookList) {
            if (book.getId().equals(bookId)) {
                bookList.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        for (Book book1 : bookList) {
            if (book1.getAuthor().equals(book.getAuthor()) && book1.getTitle().equals(book.getTitle())) {
                bookList.remove(book1);
                return true;
            }
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : bookList) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getAuthor().equals(author)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getTitle().equals(title)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    @Override
    public int countAllBooks() {
        return bookList.size();
    }
}
