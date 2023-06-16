package students.andrej_mihailicenko.lesson_10.level_5;

class Book {
    private String author;
    private String title;

    Book (String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{author='" + author + "', title='" + title + "'}";
    }
}
