package students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6.ui_action;

import students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6.Book;
import students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6.BookDatabase;

import java.util.List;
import java.util.Scanner;

class FindBookByAuthorUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public FindBookByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter author name to find all books with this author: ");
        String author = sc.nextLine();
        List<Book> bookList = bookDatabase.findByAuthor(author);

        if (!bookList.isEmpty()) {
            System.out.println("All books with author '" + author + "':");
            printBooks(bookList);
        } else {
            System.err.println("Author with name '" + author + "' was not found!");
        }
    }
    private void printBooks(List<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
