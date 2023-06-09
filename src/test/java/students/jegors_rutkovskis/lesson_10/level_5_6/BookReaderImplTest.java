package students.jegors_rutkovskis.lesson_10.level_5_6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookReaderImplTest {
    private BookReaderImpl bookList;
    private Book book1, book2, book3, book4;

    @BeforeEach
    void setUp() {
        bookList = new BookReaderImpl();
        book1 = new Book("Гарри Поттер", "Джоан Роулинг");
        book2 = new Book("Дневник Анны Франк", "Анна Франк");
        book3 = new Book("Над пропастью во ржи", "Джером Д. Сэлинджер");
        book4 = new Book("Гарри Поттер и философский камень",
                "Джоан Роулинг");
    }

    @Test
    void shouldAddBook() {
        bookList.addBook(book1);
        bookList.addBook(book2);
        bookList.addBook(book3);
        List<Book> expected = new ArrayList<>();
        expected.add(book1);
        expected.add(book2);
        expected.add(book3);
        assertEquals(expected, bookList.getBookList());
    }

    @Test
    void shouldReturnTrueIfBookAdded() {
        assertTrue(bookList.addBook(book1));
    }

    @Test
    void shouldReturnFalseIfBookAlreadyExist() {
        bookList.addBook(book1);
        assertFalse(bookList.addBook(book1));
    }

    @Test
    void shouldReturnFalseIfBookTitleIsInvalid() {
        Book invalidBook = new Book(" ", "Анна Франк");
        assertFalse(bookList.addBook(invalidBook));
    }
    @Test
    void shouldReturnFalseIfBookAuthorIsInvalid() {
        Book invalidBook = new Book("Дневник Анны Франк", "");
        assertFalse(bookList.addBook(invalidBook));
    }

    @Test
    void shouldReturnTrueIfBookIsRemoved() {
        bookList.addBook(book1);
        bookList.addBook(book2);
        bookList.addBook(book3);
        List<Book> expected = List.of(book1, book2);
        assertTrue(bookList.removeBook(book3));
        assertEquals(expected, bookList.getBookList());
    }
    @Test
    void shouldReturnFalseIfBookIsNotRemoved() {
        bookList.addBook(book1);
        bookList.addBook(book2);
        bookList.addBook(book3);
        Book newBook = new Book("John Doe", "John Doe");
        List<Book> expected = List.of(book1, book2, book3);
        assertFalse(bookList.removeBook(newBook));
        assertEquals(expected, bookList.getBookList());
    }

    @Test
    void shouldReturnBooksArrayWithValidFormat() {
        bookList.addBook(book1);
        bookList.addBook(book2);
        String[] expected = {
                "Гарри Поттер [Джоан Роулинг]",
                "Дневник Анны Франк [Анна Франк]"
        };
        assertArrayEquals(expected, bookList.getBooksArray());
    }

    @Test
    void shouldFindBookByAuthorExactMatch() {
        bookList.addBook(book1);
        bookList.addBook(book2);
        bookList.addBook(book3);
        Book actual = bookList.findByAuthorExactMatch("Анна Франк");
        assertEquals(book2, actual);
    }

    @Test
    void shouldReturnNullIfNotFoundByAuthorExactMatch() {
        bookList.addBook(book1);
        bookList.addBook(book2);
        assertNull(bookList.findByAuthorExactMatch("Анна"));
    }

    @Test
    void shouldFindByAuthor() {
        bookList.addBook(book1);
        bookList.addBook(book2);
        bookList.addBook(book3);
        bookList.addBook(book4);

        List<Book> expected = new ArrayList<>();
        expected.add(book2);
        assertEquals(expected, bookList.findByAuthor("анна"));

        expected.clear();
        expected.add(book1);
        expected.add(book4);
        assertEquals(expected, bookList.findByAuthor("джо"));
    }
    @Test
    void shouldFindBookByTitleExactMatch() {
        bookList.addBook(book1);
        bookList.addBook(book2);
        bookList.addBook(book3);
        Book actual = bookList.findByTitleExactMatch("Дневник Анны Франк");
        assertEquals(book2, actual);

        assertNull(bookList.findByTitleExactMatch("Clean code"));
    }
    @Test
    void shouldFindByTitle() {
        bookList.addBook(book1);
        bookList.addBook(book2);
        bookList.addBook(book3);
        bookList.addBook(book4);

        List<Book> expected = new ArrayList<>();
        expected.add(book2);
        assertEquals(expected, bookList.findByTitle("днев"));

        expected.clear();
        expected.add(book1);
        expected.add(book4);
        assertEquals(expected, bookList.findByTitle("гарри "));

        expected.clear();
        assertEquals(expected, bookList.findByTitle(" "));
    }
    @Test
    void shouldReturnTrueIfMarkedAsReadSuccess() {
        bookList.addBook(book1);
        bookList.addBook(book2);
        bookList.addBook(book3);
        assertTrue(bookList.markAsRead(book1));
        assertTrue(book1.isMarkedAsRead());
    }
    @Test
    void shouldReturnFalseIfMarkedAsReadFailure() {
        bookList.addBook(book1);
        bookList.addBook(book2);
        bookList.addBook(book3);
        assertFalse(bookList.markAsRead(book4));
        assertFalse(book4.isMarkedAsRead());
    }
    @Test
    void shouldReturnTrueIfMarkedAsUnReadSuccess() {
        bookList.addBook(book1);
        bookList.addBook(book2);
        bookList.addBook(book3);
        assertTrue(bookList.markAsUnread(book1));
        assertTrue(book1.isMarkedAsUnread());
    }
    @Test
    void shouldReturnFalseIfMarkedAsUnReadFailure() {
        bookList.addBook(book1);
        bookList.addBook(book2);
        bookList.addBook(book3);
        assertFalse(bookList.markAsUnread(book4));
        assertFalse(book4.isMarkedAsUnread());
    }

    @Test
    void shouldGetListBooksMarkedAsReadWithValidFormat() {
        bookList.addBook(book1);
        bookList.addBook(book2);
        bookList.addBook(book3);
        bookList.addBook(book4);
        List<String> expected = new ArrayList<>(Arrays.asList("Гарри Поттер [Джоан Роулинг]",
                "Гарри Поттер и философский камень [Джоан Роулинг]"));
        bookList.markAsRead(book1);
        bookList.markAsRead(book4);
        List<String> actual = bookList.getBooksMarkedAsRead();
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetListBooksMarkedAsUnReadWithValidFormat() {
        bookList.addBook(book1);
        bookList.addBook(book2);
        bookList.addBook(book3);
        bookList.addBook(book4);
        List<String> expected = new ArrayList<>(Arrays.asList("Гарри Поттер [Джоан Роулинг]",
                "Гарри Поттер и философский камень [Джоан Роулинг]"));
        bookList.markAsUnread(book1);
        bookList.markAsUnread(book4);
        List<String> actual = bookList.getBooksMarkedAsUnread();
        assertEquals(expected, actual);
    }
}