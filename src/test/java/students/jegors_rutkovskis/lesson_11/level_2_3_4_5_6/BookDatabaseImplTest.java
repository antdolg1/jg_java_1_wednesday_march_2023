package students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
class BookDatabaseImplTest {
    private BookDatabaseImpl db;
    private SearchCriteria titleCriteria, authorCriteria, yearCriteria;
    private SearchCriteria orCriteria, andCriteria;
    private Book book1, book2, book3, book4, duplicatedBook;
    @BeforeEach
    void setUp() {
        book1 = new Book("A1", "B1", "1999");
        book2 = new Book("A2", "B2", "2000");
        book3 = new Book("A3", "B3", "2000");
        book4 = new Book("A3", "B4", "1999");
        duplicatedBook = new Book("A3", "B4", "1999");
        db = new BookDatabaseImpl();
        db.save(book1);
        db.save(book2);
        db.save(book3);
    }

    @Test
    void shouldDeleteBookFromListById() {
        assertTrue(db.delete(2L));
        List<Book> expectedBookList = new ArrayList<>();
        expectedBookList.add(book1);
        expectedBookList.add(book3);
        assertEquals(expectedBookList, db.getBookList());
    }

    @Test
    void shouldDeleteBookFromList() {
        assertTrue(db.delete(book2));
        List<Book> expectedBookList = new ArrayList<>();
        expectedBookList.add(book1);
        expectedBookList.add(book3);
        assertEquals(expectedBookList, db.getBookList());
    }

    @Test
    void shouldFindBookById() {
        assertEquals(Optional.of(book3), db.findById(3L));
    }

    @Test
    void shouldFindBooksByAuthor() {
        db.save(book4);
        List<Book> expected = new ArrayList<>();
        expected.add(book3);
        expected.add(book4);
        assertEquals(expected, db.findByAuthor("a3"));

        expected.clear();
        assertEquals(expected, db.findByAuthor("A5"));
    }

    @Test
    void shouldFindBooksByTitle() {
        db.save(book4);
        List<Book> expected = new ArrayList<>();
        expected.add(book3);
        assertEquals(expected, db.findByTitle("b3"));

        expected.clear();
        assertEquals(expected, db.findByTitle("B5"));
    }

    @Test
    void shouldCountAllBooks() {
        assertEquals(3, db.countAllBooks());
        db.save(book4);
        assertEquals(4, db.countAllBooks());
        db.delete(1L);
        assertEquals(3, db.countAllBooks());
    }

    @Test
    void shouldDeleteAllBooksByAuthor() {
        db.save(book4);
        List<Book> expected = new ArrayList<>();
        expected.add(book1);
        expected.add(book2);

        db.deleteByAuthor("a3");
        assertEquals(expected, db.getBookList());
    }
    @Test
    void shouldDeleteAllBooksByTitle() {
        List<Book> expected = new ArrayList<>();
        expected.add(book2);
        expected.add(book3);

        db.deleteByTitle("b1");
        assertEquals(expected, db.getBookList());
    }

    @Test
    void shouldFindBooksByCriteria() {
        db.save(book4);
        yearCriteria = new YearOfIssueSearchCriteria("2000");
        List<Book> expected = new ArrayList<>(Arrays.asList(book2, book3));
        assertEquals(expected, db.find(yearCriteria));

        authorCriteria = new AuthorSearchCriteria("a3");
        expected.clear();
        expected.add(book3);
        expected.add(book4);
        assertEquals(expected, db.find(authorCriteria));

        titleCriteria = new TitleSearchCriteria("b1");
        expected.clear();
        expected.add(book1);
        assertEquals(expected, db.find(titleCriteria));

        orCriteria = new OrSearchCriteria(yearCriteria, authorCriteria);
        expected.clear();
        expected.add(book2);
        expected.add(book3);
        expected.add(book4);
        assertEquals(expected, db.find(orCriteria));

        andCriteria = new AndSearchCriteria(yearCriteria, titleCriteria);
        expected.clear();
        assertEquals(expected, db.find(andCriteria));

        andCriteria = new AndSearchCriteria(yearCriteria, authorCriteria);
        expected.add(book3);
        assertEquals(expected, db.find(andCriteria));
    }

    @Test
    void shouldFindAllUniqueAuthors() {
        db.save(book4);
        Set<String> expected = new LinkedHashSet<>(Arrays.asList("A1", "A2", "A3"));
        assertEquals(expected, db.findUniqueAuthors());
    }
    @Test
    void shouldFindAllUniqueTitles() {
        db.save(book4);
        Set<String> expected = new LinkedHashSet<>(Arrays.asList("B1", "B2", "B3", "B4"));
        assertEquals(expected, db.findUniqueTitles());
    }

    @Test
    void shouldFindAllUniqueBooks() {
        db.save(book4);
        db.save(duplicatedBook);
        Set<Book> expected = new LinkedHashSet<>();
        expected.add(book1);
        expected.add(book2);
        expected.add(book3);
        expected.add(book4);
        assertEquals(expected, db.findUniqueBooks());
    }

    @Test
    void DatabaseContainsBookTest() {
        assertTrue(db.contains(book1));
        assertTrue(db.contains(book2));
        assertTrue(db.contains(book3));

        assertFalse(db.contains(book4));
    }

    @Test
    void getAuthorToBooksMapTest() {
        db.save(book4);
        Map<String, List<Book>> expected = new TreeMap<>();
        expected.put("A1", new ArrayList<>(List.of(book1)));
        expected.put("A2", new ArrayList<>(List.of(book2)));
        expected.put("A3", new ArrayList<>(List.of(book3, book4)));

        assertEquals(expected, db.getAuthorToBooksMap());
    }

    @Test
    void getEachAuthorBookCountTest() {
        db.save(book4);
        db.save(duplicatedBook);
        Map<String, Integer> expected = new TreeMap<>();
        expected.put("A1", 1);
        expected.put("A2", 1);
        expected.put("A3", 2);

        assertEquals(expected, db.getEachAuthorBookCount());
    }
}