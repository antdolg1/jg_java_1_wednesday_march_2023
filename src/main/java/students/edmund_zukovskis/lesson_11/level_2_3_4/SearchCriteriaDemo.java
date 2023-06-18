package students.edmund_zukovskis.lesson_11.level_2_3_4;

class SearchCriteriaDemo {
    public static void main(String[] args) {

        Book book1 = new Book("Kuper", "Zveroboi");
        book1.setYearOfIssue("2022");
        Book book2 = new Book("Kuper", "Some Other Title");
        book2.setYearOfIssue("1890");
        Book book3 = new Book("Another Author", "Random");
        book3.setYearOfIssue("1890");

        SearchCriteria authorCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria yearCriteria = new YearOfIssueSearchCriteria("1890");

        SearchCriteria criteria1 = new AndSearchCriteria(authorCriteria, titleCriteria);
        System.out.println(criteria1.match(book1));
        System.out.println(criteria1.match(book2));
        System.out.println(criteria1.match(book3));
        System.out.println();

        SearchCriteria criteria2 = new AndSearchCriteria(authorCriteria, yearCriteria);
        System.out.println(criteria2.match(book1));
        System.out.println(criteria2.match(book2));
        System.out.println(criteria2.match(book3));
        System.out.println();

        SearchCriteria criteria3 = new OrSearchCriteria(
                new OrSearchCriteria(authorCriteria, yearCriteria),
                titleCriteria
        );
        System.out.println(criteria3.match(book1));
        System.out.println(criteria3.match(book2));
        System.out.println(criteria3.match(book3));
    }
}
