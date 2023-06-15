package students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TitleSearchCriteriaTest {
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
        SearchCriteria searchCriteria = new TitleSearchCriteria("b2");

        assertTrue(searchCriteria.match(book2));
        assertTrue(searchCriteria.match(book3));

        assertFalse(searchCriteria.match(book1));
        assertFalse(searchCriteria.match(book4));
    }
}