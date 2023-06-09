package students.jegors_rutkovskis.lesson_10.level_5_6;

class Book {
    private String title;
    private String author;
    private boolean markedAsRead;
    private boolean markedAsUnread;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        markedAsRead = false;
        markedAsUnread = false;
    }
    String getTitle() {
        return title;
    }
    String getAuthor() {
        return author;
    }

    public boolean isMarkedAsRead() {
        return markedAsRead;
    }

    public boolean isMarkedAsUnread() {
        return markedAsUnread;
    }

    public void setMarkedAsRead(boolean markedAsRead) {
        this.markedAsRead = markedAsRead;
    }

    public void setMarkedAsUnread(boolean markedAsUnread) {
        this.markedAsUnread = markedAsUnread;
    }
}
