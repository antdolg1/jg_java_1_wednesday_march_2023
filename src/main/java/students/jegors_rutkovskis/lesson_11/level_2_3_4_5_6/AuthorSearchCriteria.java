package students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6;

public class AuthorSearchCriteria implements SearchCriteria {
    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getAuthor().equalsIgnoreCase(this.authorToSearch);
    }
}
