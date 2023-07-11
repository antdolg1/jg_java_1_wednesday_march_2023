package students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6;

import java.util.Objects;
public class Book {
    private Long id;
    private String title;
    private String author;
    private String yearOfIssue;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }
    public Book(String author, String title, String yearOfIssue) {
        this.author = author;
        this.title = title;
        this.yearOfIssue = yearOfIssue;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getYearOfIssue() {
        return yearOfIssue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(yearOfIssue, book.yearOfIssue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, yearOfIssue);
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", TITLE: '" + title + '\'' +
                ", AUTHOR: '" + author + '\'' +
                ", YEAR OF ISSUE: '" + yearOfIssue + '\'';
    }
}
