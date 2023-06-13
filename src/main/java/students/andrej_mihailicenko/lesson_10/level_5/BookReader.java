package students.andrej_mihailicenko.lesson_10.level_5;

interface BookReader {

    public boolean addBookToLibrary(String authorBookToAdd, String titleBookToAdd);

    public boolean removeBookFromLibrary(String authorBookToRemove, String titleBookToRemove);

    public String booksInLibrary();

    public String searchByAuthor(String author);

    public String searchBooksByAuthorPrefix(String authorPrefix);

}
