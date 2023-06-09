package students.jegors_rutkovskis.lesson_10.level_5_6;

import java.util.ArrayList;
import java.util.List;

class BookReaderImpl implements BookReader {
    private List<Book> bookList;
    private BookValidator validator = new BookValidator();

    BookReaderImpl() {
        bookList = new ArrayList<>();
    }

    @Override
    public boolean addBook(Book book) {
        if (!validator.isValidTitle(book)
                || !validator.isValidAuthor(book)) {
            return false;
        }
        if (!validator.containsBook(book, bookList)) {
            bookList.add(book);
            return true;
        }
        return false;
    }

    @Override
    public boolean removeBook(Book book) {
        for (Book b : bookList) {
            if (b.equals(book)) {
                bookList.remove(b);
                return true;
            }
        }
        return false;
    }

    @Override
    public String[] getBooksArray() {
        String[] booksArray = new String[bookList.size()];
        for (int i = 0; i < booksArray.length; i++) {
            String bookInfo = bookList.get(i).getTitle() + " [" + bookList.get(i).getAuthor() + "]";
            booksArray[i] = bookInfo;
        }
        return booksArray;
    }

    @Override
    public Book findByAuthorExactMatch(String author) {
        for (Book book : bookList) {
            if (author.equals(book.getAuthor())) {
                return book;
            }
        }
        return null;
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getAuthor().toLowerCase()
                    .startsWith(author.toLowerCase())) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    @Override
    public Book findByTitleExactMatch(String title) {
        for (Book book : bookList) {
            if (title.equals(book.getTitle())) {
                return book;
            }
        }
        return null;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getTitle().toLowerCase()
                    .startsWith(title.toLowerCase())) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    @Override
    public boolean markAsRead(Book book) {
        if (bookList.contains(book)) {
            book.setMarkedAsRead(true);
            return true;
        }
           return false;
    }

    @Override
    public boolean markAsUnread(Book book) {
        if (bookList.contains(book)) {
            book.setMarkedAsUnread(true);
            return true;
        }
        return false;
    }

    @Override
    public List<String> getBooksMarkedAsRead() {
        List<String> markedAsReadBookList = new ArrayList<>();
        for (Book book : bookList) {
            if (book.isMarkedAsRead()) {
                String bookInfo = book.getTitle() + " [" + book.getAuthor() + "]";
                markedAsReadBookList.add(bookInfo);
            }
        }
        return markedAsReadBookList;
    }

    @Override
    public List<String> getBooksMarkedAsUnread() {
        List<String> markedAsUnReadBookList = new ArrayList<>();
        for (Book book : bookList) {
            if (book.isMarkedAsUnread()) {
                String bookInfo = book.getTitle() + " [" + book.getAuthor() + "]";
                markedAsUnReadBookList.add(bookInfo);
            }
        }
        return markedAsUnReadBookList;
    }

    List<Book> getBookList() {
        return bookList;
    }
}
