package students.andrej_mihailicenko.lesson_10.level_5;

//I generate this test with AI

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookReaderImplTest {

    private BookReaderImpl bookReader;

    @BeforeEach
    void setUp() {
        bookReader = new BookReaderImpl();
        bookReader.addBookToLibrary("John Doe", "Book 1");
        bookReader.addBookToLibrary("Jane Smith", "Book 2");
        bookReader.addBookToLibrary("John Doe", "Book 3");
        bookReader.addBookToLibrary("Alice Johnson", "Book 4");
    }

    @Test
    void addBookToLibrary_WithValidInput_ReturnsTrue() {
        assertTrue(bookReader.addBookToLibrary("Author", "Title"));
    }

    @Test
    void addBookToLibrary_WithEmptyAuthor_ReturnsFalse() {
        assertFalse(bookReader.addBookToLibrary("", "Title"));
    }

    @Test
    void addBookToLibrary_WithEmptyTitle_ReturnsFalse() {
        assertFalse(bookReader.addBookToLibrary("Author", ""));
    }

    @Test
    void addBookToLibrary_WithExistingBook_ReturnsFalse() {
        assertFalse(bookReader.addBookToLibrary("John Doe", "Book 1"));
    }

    @Test
    void removeBookFromLibrary_WithExistingBook_ReturnsTrue() {
        assertTrue(bookReader.removeBookFromLibrary("John Doe", "Book 3"));
    }

    @Test
    void removeBookFromLibrary_WithNonExistingBook_ReturnsFalse() {
        assertFalse(bookReader.removeBookFromLibrary("John Doe", "Book 5"));
    }

    @Test
    void booksInLibrary_WithMultipleBooks_ReturnsAllBooks() {
        String expected = "[Book{author='John Doe', title='Book 1'}, " +
                "Book{author='Jane Smith', title='Book 2'}, " +
                "Book{author='John Doe', title='Book 3'}, " +
                "Book{author='Alice Johnson', title='Book 4'}]";
        assertEquals(expected, bookReader.booksInLibrary());
    }

    @Test
    void searchByAuthor_WithExistingAuthor_ReturnsMatchingBooks() {
        String expected = "[Book{author='John Doe', title='Book 1'}, " +
                "Book{author='John Doe', title='Book 3'}]";
        assertEquals(expected, bookReader.searchByAuthor("John Doe"));
    }

    @Test
    void searchByAuthor_WithNonExistingAuthor_ReturnsEmptyString() {
        assertEquals("", bookReader.searchByAuthor("Unknown Author"));
    }

    @Test
    void searchBooksByAuthorPrefix_WithExistingAuthorPrefix_ReturnsMatchingBooks() {
        String expected = "[Book{author='John Doe', title='Book 1'}, " +
                "Book{author='John Doe', title='Book 3'}]";
        assertEquals(expected, bookReader.searchBooksByAuthorPrefix("Jo"));
    }

    @Test
    void searchBooksByAuthorPrefix_WithNonExistingAuthorPrefix_ReturnsEmptyString() {
        assertEquals("", bookReader.searchBooksByAuthorPrefix("Unknown"));
    }

    @Test
    void searchByTitle_WithExistingTitle_ReturnsMatchingBooks() {
        String expected = "[Book{author='John Doe', title='Book 1'}]";
        assertEquals(expected, bookReader.searchByTitle("Book 1"));
    }

    @Test
    void searchByTitle_WithNonExistingTitle_ReturnsEmptyString() {
        assertEquals("", bookReader.searchByTitle("Unknown Title"));
    }

    @Test
    void searchBooksByTitlePrefix_WithExistingTitlePrefix_ReturnsMatchingBooks() {
        String expected = "[Book{author='John Doe', title='Book 1'}]";
        assertEquals(expected, bookReader.searchBooksByTitlePrefix("Boo"));
    }

    @Test
    void searchBooksByTitlePrefix_WithNonExistingTitlePrefix_ReturnsEmptyString() {
        assertEquals("", bookReader.searchBooksByTitlePrefix("Unknown"));
    }

    @Test
    void markAsRead_WithExistingBook_ReturnsTrue() {
        assertTrue(bookReader.markAsRead("Book 2"));
    }

    @Test
    void markAsRead_WithNonExistingBook_ReturnsFalse() {
        assertFalse(bookReader.markAsRead("Unknown Book"));
    }

    @Test
    void markAsUnread_WithExistingReadBook_ReturnsTrue() {
        assertTrue(bookReader.markAsUnread("Book 2"));
    }

    @Test
    void markAsUnread_WithNonExistingReadBook_ReturnsFalse() {
        assertFalse(bookReader.markAsUnread("Unknown Book"));
    }

    @Test
    void getReadBooks_WithReadBooks_ReturnsArrayOfReadBooks() {
        bookReader.markAsRead("Book 1");
        bookReader.markAsRead("Book 3");
        String[] expected = {"Book 1[John Doe]", "Book 3[John Doe]"};
        assertArrayEquals(expected, bookReader.getReadBooks());
    }

    @Test
    void getUnreadBooks_WithUnreadBooks_ReturnsArrayOfUnreadBooks() {
        bookReader.markAsRead("Book 1");
        bookReader.markAsRead("Book 3");
        String[] expected = {"Book 2[Jane Smith]", "Book 4[Alice Johnson]"};
        assertArrayEquals(expected, bookReader.getUnreadBooks());
    }
}
