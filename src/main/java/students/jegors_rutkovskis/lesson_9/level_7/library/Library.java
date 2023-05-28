package students.jegors_rutkovskis.lesson_9.level_7.library;

import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> bookList;
    private List<Reader> readers;

    Library(List<Book> bookList) {
        this.bookList = bookList;
    }
    Library() {
        bookList = new ArrayList<>();
    }

    void addBook(Book book) {
        bookList.add(book);
    }

    void removeBook(Book book) {
        bookList.remove(book);
    }
    Book searchBook(String title, String author) {
        return null;
    }

    void registerReader(Reader reader) {

    }

    void unregisterReader(Reader reader) {

    }
    void takeBook(Book book, Reader reader) {

    }

    void returnBook(Book book) {

    }

    void reserveBook(Book book, Reader reader) {

    }

    List<Book> getBookList() {
        return bookList;
    }

    public Library setBookList(List<Book> bookList) {
        this.bookList = bookList;
        return this;
    }

    public List<Reader> getReaders() {
        return readers;
    }

    public Library setReaders(List<Reader> readers) {
        this.readers = readers;
        return this;
    }
}
