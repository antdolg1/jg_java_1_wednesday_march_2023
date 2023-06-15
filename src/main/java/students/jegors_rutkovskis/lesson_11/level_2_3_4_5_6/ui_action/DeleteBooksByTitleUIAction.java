package students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6.ui_action;

import students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6.Book;
import students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6.BookDatabase;

import java.util.List;
import java.util.Scanner;

class DeleteBooksByTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteBooksByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter title name to delete all books with this title: ");
        String title = sc.nextLine();
        List<Book> DeletedBookList = bookDatabase.findByTitle(title);

        bookDatabase.deleteByTitle(title);

        if (!DeletedBookList.isEmpty()) {
            System.out.println("All books with title '" + title + "':");
            printDeletedBooks(DeletedBookList);
            System.out.println("was deleted successfully...");
        } else {
            System.err.println("Title: '" + title + "' was not found!");
        }
    }
    private void printDeletedBooks(List<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
