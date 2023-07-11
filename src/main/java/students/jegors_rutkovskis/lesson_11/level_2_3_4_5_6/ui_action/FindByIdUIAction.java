package students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6.ui_action;

import students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6.Book;
import students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6.BookDatabase;

import java.util.Scanner;
import java.util.Optional;

public class FindByIdUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book id number for search: ");
        Long id = sc.nextLong();
        Optional<Book> bookOpt = bookDatabase.findById(id);
        String book = bookOpt.map(Object::toString).orElse("Book not found");
        System.out.println(book);
    }
}
