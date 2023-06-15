package students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearOfIssueSearchCriteriaTest {
    private Book book1, book2, book3, book4;

    @BeforeEach
    void setUp() {
        book1 = new Book("A1", "B1", "2000");
        book2 = new Book("A2", "B2", "2000");
        book3 = new Book("A3", "B3", "1999");
        book4 = new Book("A4", "B4", "1990");
    }

    @Test
    void matchTest() {
        SearchCriteria searchCriteria = new YearOfIssueSearchCriteria("2000");

        assertTrue(searchCriteria.match(book1));
        assertTrue(searchCriteria.match(book2));

        assertFalse(searchCriteria.match(book3));
        assertFalse(searchCriteria.match(book4));
    }
}