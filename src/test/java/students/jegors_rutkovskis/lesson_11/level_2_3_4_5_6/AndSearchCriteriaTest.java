package students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AndSearchCriteriaTest {
    private Book book;

    @BeforeEach
    void setUp() {
        book = new Book("A1", "B1", "2000");
    }

    @Test
    void shouldReturnTrueIfBothConditionsMatch() {
        SearchCriteria author = new AuthorSearchCriteria("a1");
        SearchCriteria yearOfIssue = new YearOfIssueSearchCriteria("2000");
        SearchCriteria andCriteria = new AndSearchCriteria(author, yearOfIssue);

        assertTrue(andCriteria.match(book));
    }

    @Test
    void shouldReturnFalseIfOneConditionDoesNotMatch() {
        SearchCriteria author = new AuthorSearchCriteria("a1");
        SearchCriteria title = new TitleSearchCriteria("c1");
        SearchCriteria andCriteria = new AndSearchCriteria(author, title);

        assertFalse(andCriteria.match(book));
    }
}