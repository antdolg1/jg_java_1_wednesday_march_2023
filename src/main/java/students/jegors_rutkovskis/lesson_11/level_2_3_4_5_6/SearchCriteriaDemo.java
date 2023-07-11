package students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6;

class SearchCriteriaDemo {
    public static void main(String[] args) {
        Book book = new Book("Kuper", "Zveroboi", "1890");

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1890");

        SearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria orSearchCriteria = new OrSearchCriteria(titleSearchCriteria, yearOfIssueSearchCriteria);

        System.out.println("Kuper and Zveroboi - " + andSearchCriteria.match(book));
        System.out.println("Zveroboi or 1890 - " + orSearchCriteria.match(book));
    }
}
