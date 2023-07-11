package students.edmund_zukovskis.lesson_11.level_2_3_4;

class BookDataBaseTest {
    public static void main(String[] args) {

        BookDatabase bookDB = new BookDatabaseImpl();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");

        long id1 = bookDB.save(book1);
        long id2 = bookDB.save(book2);

        bookDB.delete(3L);
        bookDB.delete(1L);
        bookDB.delete(1L);
    }
}
