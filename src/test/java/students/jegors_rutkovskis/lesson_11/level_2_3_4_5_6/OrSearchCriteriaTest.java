package students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrSearchCriteriaTest {

    private Book book;

    @BeforeEach
    void setUp() {
        book = new Book("A1", "B1", "2000");
    }

    @Test
    void shouldReturnTrueIfBothConditionsMatch() {
        SearchCriteria author = new AuthorSearchCriteria("a1");
        SearchCriteria yearOfIssue = new YearOfIssueSearchCriteria("2000");
        SearchCriteria orCriteria = new OrSearchCriteria(author, yearOfIssue);

        assertTrue(orCriteria.match(book));
    }
    @Test
    void shouldReturnTrueIfOneOfConditionMatch() {
        SearchCriteria author = new AuthorSearchCriteria("a2");
        SearchCriteria yearOfIssue = new YearOfIssueSearchCriteria("2000");
        SearchCriteria orCriteria = new OrSearchCriteria(author, yearOfIssue);

        assertTrue(orCriteria.match(book));
    }

    @Test
    void shouldReturnFalseIfBothConditionsDoesNotMatch() {
        SearchCriteria author = new AuthorSearchCriteria("a2");
        SearchCriteria title = new TitleSearchCriteria("b2");
        SearchCriteria orCriteria = new OrSearchCriteria(author, title);

        assertFalse(orCriteria.match(book));
    }
}