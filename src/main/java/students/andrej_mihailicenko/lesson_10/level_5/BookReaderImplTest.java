package students.andrej_mihailicenko.lesson_10.level_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//I generate this test with AI
class BookReaderImplTest {
    private BookReaderImpl bookReader;

    @BeforeEach
    void setUp() {
        bookReader = new BookReaderImpl();
    }

    @Test
    void testAddBookToLibrary() {

        boolean added = bookReader.addBookToLibrary("John Doe", "Sample Book");
        Assertions.assertTrue(added);
    }

    @Test
    void testAddDuplicateBookToLibrary() {

        bookReader.addBookToLibrary("John Doe", "Sample Book");
        boolean added = bookReader.addBookToLibrary("John Doe", "Sample Book");
        Assertions.assertFalse(added);
    }

    @Test
    void testRemoveBookFromLibrary() {

        bookReader.addBookToLibrary("John Doe", "Sample Book");

        boolean removed = bookReader.removeBookFromLibrary("John Doe", "Sample Book");

        Assertions.assertTrue(removed);
    }

    @Test
    void testRemoveNonExistingBookFromLibrary() {

        boolean removed = bookReader.removeBookFromLibrary("John Doe", "Non-existing Book");


        Assertions.assertFalse(removed);
    }

    @Test
    void testBooksInLibrary() {

        bookReader.addBookToLibrary("John Doe", "Book 1");
        bookReader.addBookToLibrary("Jane Smith", "Book 2");

        String books = bookReader.booksInLibrary();

        Assertions.assertEquals("[Book{author='John Doe', title='Book 1'}, Book{author='Jane Smith', title='Book 2'}]", books);
    }

    @Test
    void testSearchByAuthor() {

        bookReader.addBookToLibrary("John Doe", "Book 1");
        bookReader.addBookToLibrary("John Doe", "Book 2");
        bookReader.addBookToLibrary("Jane Smith", "Book 3");

        String booksByAuthor = bookReader.searchByAuthor("John Doe");

        Assertions.assertEquals("[Book{author='John Doe', title='Book 1'}, Book{author='John Doe', title='Book 2'}]", booksByAuthor);
    }

    @Test
    void testSearchBooksByAuthorPrefix() {

        bookReader.addBookToLibrary("John Doe", "Book 1");
        bookReader.addBookToLibrary("Jane Smith", "Book 2");
        bookReader.addBookToLibrary("Jenny Johnson", "Book 3");

        String booksByAuthorPrefix = bookReader.searchBooksByAuthorPrefix("Jo");

        Assertions.assertEquals("[Book{author='John Doe', title='Book 1'}]", booksByAuthorPrefix);
    }
}