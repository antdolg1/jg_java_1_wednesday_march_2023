package students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6.ui_action;
import students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6.Book;
import students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6.BookDatabase;

import java.util.Scanner;

public class SaveBookUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter book author: ");
            String bookAuthor = sc.nextLine();
            System.out.print("Enter book title: ");
            String bookTitle = sc.nextLine();
            System.out.print("Enter book year of issue: ");
            String yearOfIssue = sc.nextLine();

            Book newBook = new Book(bookAuthor, bookTitle, yearOfIssue);
            Long bookId = bookDatabase.save(newBook);
            System.out.println("The book is saved in the database with id: " + bookId);
    }
}
