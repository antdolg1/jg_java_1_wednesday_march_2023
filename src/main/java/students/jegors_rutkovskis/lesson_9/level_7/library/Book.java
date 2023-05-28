package students.jegors_rutkovskis.lesson_9.level_7.library;

class Book {
    private int id;
    private String title;
    private String author;
    private int issueYear;
    private String bookGenre;
    private boolean isReserved;
    private Reader reader;

    public Book(int id, String title, String author,
                int issueYear, String bookGenre) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.issueYear = issueYear;
        this.bookGenre = bookGenre;
    }

    public int getId() {
        return id;
    }

    public Book setId(int id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Book setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }

    public int getIssueYear() {
        return issueYear;
    }

    public Book setIssueYear(int issueYear) {
        this.issueYear = issueYear;
        return this;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public Book setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
        return this;
    }
}
