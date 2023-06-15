package students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6;

public class TitleSearchCriteria implements SearchCriteria {
    private String titleToSearch;

    TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getTitle().equalsIgnoreCase(this.titleToSearch);
    }
}
