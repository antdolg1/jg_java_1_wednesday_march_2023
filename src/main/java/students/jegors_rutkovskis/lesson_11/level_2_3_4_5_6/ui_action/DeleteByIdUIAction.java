package students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6.ui_action;

import students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6.Book;
import students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6.BookDatabase;

import java.util.Optional;
import java.util.Scanner;

class DeleteByIdUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book id number to delete book: ");
        Long id = sc.nextLong();
        Optional<Book> bookOpt = bookDatabase.findById(id);
        String bookToDelete = "";
        if (bookOpt.isPresent()) {
            bookToDelete = bookOpt.get().toString();
        }
        boolean isDeleted = bookDatabase.delete(id);
        if (isDeleted) {
            System.out.println("The book '" + bookToDelete + "' was successfully deleted.");
        } else {
            System.err.println("The book " + bookToDelete + "was not found!");
        }
    }
}
