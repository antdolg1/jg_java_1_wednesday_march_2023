package students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6.ui_action;

import students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6.Book;
import students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6.BookDatabase;

import java.util.List;
import java.util.Scanner;

class FindBooksByTitleUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public FindBooksByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book title to find all books with this title: ");
        String title = sc.nextLine();
        List<Book> bookList = bookDatabase.findByTitle(title);

        if (!bookList.isEmpty()) {
            System.out.println("All books with title '" + title + "':");
            printBooks(bookList);
        } else {
            System.err.println("Books with title '" + title + "' were not found!");
        }
    }
    private void printBooks(List<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
