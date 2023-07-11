package students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6;

public class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }
    @Override
    public boolean match(Book book) {
        return book.getYearOfIssue().equalsIgnoreCase(this.yearOfIssueToSearch);
    }
}
