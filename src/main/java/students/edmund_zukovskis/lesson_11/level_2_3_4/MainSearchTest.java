package students.edmund_zukovskis.lesson_11.level_2_3_4;

class MainSearchTest {
    public static void main(String[] args) {

        Book book1 = new Book("A1", "T1");
        book1.setYearOfIssue("2020");
        Book book2 = new Book("A2", "T2");
        book2.setYearOfIssue("2022");
        Book book3 = new Book("A1", "T3");
        book3.setYearOfIssue("2023");

        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("A1");

        System.out.println(authorSearchCriteria.match(book1));
        System.out.println(authorSearchCriteria.match(book2));
        System.out.println(authorSearchCriteria.match(book3));
        System.out.println();

        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("T1");

        System.out.println(titleSearchCriteria.match(book1));
        System.out.println(titleSearchCriteria.match(book2));
        System.out.println(titleSearchCriteria.match(book3));
        System.out.println();

        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("2020");

        System.out.println(yearOfIssueSearchCriteria.match(book1));
        System.out.println(yearOfIssueSearchCriteria.match(book2));
        System.out.println(yearOfIssueSearchCriteria.match(book3));
        System.out.println();

        AndSearchCriteria searchCriteria3 = new AndSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);

        System.out.println(searchCriteria3.match(book1));
        System.out.println(searchCriteria3.match(book2));
        System.out.println(searchCriteria3.match(book3));
        System.out.println();

        OrSearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);

        System.out.println(orSearchCriteria.match(book1));
        System.out.println(orSearchCriteria.match(book2));
        System.out.println(orSearchCriteria.match(book3));
        System.out.println();
        

    }
}
