package students.andrej_mihailicenko.lesson_9.level_7.library;

enum Books {
    BOOK1("Head First Java", "Kathy Sierra"),
    BOOK2("Effective Java", "Joshua Bloch"),
    BOOK3("Clean Code", "Robert Martin");
    private final String title;
    private final String author;
    private boolean available;

    Books(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
