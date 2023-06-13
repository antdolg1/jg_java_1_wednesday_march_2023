package students.andrej_mihailicenko.lesson_10.level_5;

import java.util.ArrayList;

class BookReaderImpl implements BookReader {
    private ArrayList<Book> bookLibraries = new ArrayList<>();

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
        ArrayList<Book> booksByAuthor = new ArrayList<>();
        for (Book book : bookLibraries) {
            if (author.equalsIgnoreCase(book.getAuthor())) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor.toString();
    }

    @Override
    public String searchBooksByAuthorPrefix(String authorPrefix) {
        ArrayList<Book> booksByAuthorPrefix = new ArrayList<>();
        for (Book book : bookLibraries) {
            if (book.getAuthor().startsWith(authorPrefix)) {
                booksByAuthorPrefix.add(book);
            }
        }
        return booksByAuthorPrefix.toString();
    }

    @Override
    public String toString() {
        return "BookReaderImpl{" +
                "bookLibraries=" + bookLibraries +
                '}';
    }
}