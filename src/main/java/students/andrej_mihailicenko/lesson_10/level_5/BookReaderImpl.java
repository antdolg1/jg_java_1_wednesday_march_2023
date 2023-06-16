package students.andrej_mihailicenko.lesson_10.level_5;

import java.util.ArrayList;
import java.util.Set;

class BookReaderImpl implements BookReader {
    private ArrayList<Book> bookLibraries = new ArrayList<>();
    private ArrayList<String> readBooks = new ArrayList<String>();
    private ArrayList<Book> booksByAuthor = new ArrayList<>();
    private ArrayList<Book> booksByAuthorPrefix = new ArrayList<>();
    private ArrayList<Book> booksByTitlePrefix = new ArrayList<>();

    private ArrayList<Book> booksByTitle = new ArrayList<>();
    private ArrayList<String> unreadBooksList = new ArrayList<>();

    @Override
    public boolean addBookToLibrary(String authorBookToAdd, String titleBookToAdd) {

        if (authorBookToAdd.isEmpty() || titleBookToAdd.isEmpty()) {
            return false;
        }

        for (Book book : bookLibraries) {
            if (book.getAuthor().equalsIgnoreCase(authorBookToAdd) &&
                    book.getTitle().equalsIgnoreCase(titleBookToAdd)) {
                return false;
            }
        }

        bookLibraries.add(new Book(authorBookToAdd, titleBookToAdd));
        return true;
    }

    @Override
    public boolean removeBookFromLibrary(String authorBookToRemove, String titleBookToRemove) {

        for (Book book : bookLibraries) {
            if (book.getAuthor().equalsIgnoreCase(authorBookToRemove) &&
                    book.getTitle().equalsIgnoreCase(titleBookToRemove)) {

                bookLibraries.remove(new Book(authorBookToRemove, titleBookToRemove));
                return true;
            }
        }

        return false;
    }

    @Override
    public String booksInLibrary() {

        for (Book book : bookLibraries) {
            return bookLibraries.toString();
        }

        return null;
    }

    @Override
    public String searchByAuthor(String author) {

        for (Book book : bookLibraries) {
            if (author.equalsIgnoreCase(book.getAuthor())) {
                booksByAuthor.add(book);
            }
        }

        return booksByAuthor.toString();
    }

    @Override
    public String searchBooksByAuthorPrefix(String authorPrefix) {

        for (Book book : bookLibraries) {
            if (book.getAuthor().startsWith(authorPrefix)) {
                booksByAuthorPrefix.add(book);
            }
        }
        return booksByAuthorPrefix.toString();
    }

    @Override
    public String searchByTitle(String title) {

        for (Book book : bookLibraries) {
            if (title.equalsIgnoreCase(book.getTitle())) {
                booksByTitle.add(book);
            }
        }

        return booksByTitle.toString();
    }

    @Override
    public String searchBooksByTitlePrefix(String titlePrefix) {

        for (Book book : bookLibraries) {
            if (book.getTitle().startsWith(titlePrefix)) {
                booksByTitlePrefix.add(book);
            }
        }

        return booksByTitlePrefix.toString();
    }

    @Override
    public boolean markAsRead(String bookTitle) {

        for (Book book : bookLibraries) {
            if (book.getTitle().equalsIgnoreCase(bookTitle)) {
                readBooks.add(book.getTitle());
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean markAsUnread(String bookTitle) {

        for (Book book : bookLibraries) {
            if (book.getTitle().equalsIgnoreCase(bookTitle)) {
                readBooks.remove(book.getTitle());
                return true;

            }
        }
        return false;
    }

    public String[] getReadBooks() {
        String[] booksArray = new String[readBooks.size()];

        for (int i = 0; i < readBooks.size(); i++) {
            String bookTitle = readBooks.get(i);
            for (Book book : bookLibraries) {
                if (book.getTitle().equalsIgnoreCase(bookTitle)) {
                    String bookInfo = book.getTitle() + "[" + book.getAuthor() + "]";
                    booksArray[i] = bookInfo;
                    break;
                }
            }
        }

        return booksArray;
    }

    public String[] getUnreadBooks() {

        for (Book book : bookLibraries) {
            if (!readBooks.contains(book.getTitle())) {
                String bookInfo = book.getTitle() + "[" + book.getAuthor() + "]";
                unreadBooksList.add(bookInfo);
            }
        }

        String[] unreadBooksArray = new String[unreadBooksList.size()];
        return unreadBooksList.toArray(unreadBooksArray);
    }

    @Override
    public String toString() {
        return "BookReaderImpl{" +
                "bookLibraries=" + bookLibraries +
                '}';
    }
}