package students.andrej_mihailicenko.lesson_10.level_5;

interface BookReader {

    boolean addBookToLibrary(String authorBookToAdd, String titleBookToAdd);

    boolean removeBookFromLibrary(String authorBookToRemove, String titleBookToRemove);

    String booksInLibrary();

    String searchByAuthor(String author);

    String searchBooksByAuthorPrefix(String authorPrefix);

    String searchByTitle(String title);

    String searchBooksByTitlePrefix(String titlePrefix);

    boolean markAsRead(String bookTitle);

    boolean markAsUnread(String bookTitle);

    String[] getReadBooks();

    String[] getUnreadBooks();

}
