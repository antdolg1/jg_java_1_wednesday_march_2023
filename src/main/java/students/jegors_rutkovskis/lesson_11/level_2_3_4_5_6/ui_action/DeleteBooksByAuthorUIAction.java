package students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6.ui_action;

import students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6.Book;
import students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6.BookDatabase;


import java.util.List;
import java.util.Scanner;

class DeleteBooksByAuthorUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public DeleteBooksByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter author name to delete all books with this author: ");
        String author = sc.nextLine();
        List<Book> DeletedBookList = bookDatabase.findByAuthor(author);

        bookDatabase.deleteByAuthor(author);

        if (!DeletedBookList.isEmpty()) {
            System.out.println("All books with author '" + author + "':");
            printDeletedBooks(DeletedBookList);
            System.out.println("was deleted successfully...");
        } else {
            System.err.println("Author with name '" + author + "' was not found!");
        }
    }
    private void printDeletedBooks(List<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
