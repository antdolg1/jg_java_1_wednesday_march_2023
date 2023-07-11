package students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorSearchCriteriaTest {
    private Book book1, book2, book3, book4;

    @BeforeEach
    void setUp() {
        book1 = new Book("A1", "B1");
        book2 = new Book("A2", "B2");
        book3 = new Book("A3", "B2");
        book4 = new Book("A1", "B5");
    }

    @Test
    void matchTest() {
        SearchCriteria searchCriteria = new AuthorSearchCriteria("a1");

        assertTrue(searchCriteria.match(book1));
        assertTrue(searchCriteria.match(book4));

        assertFalse(searchCriteria.match(book2));
        assertFalse(searchCriteria.match(book3));
    }
}