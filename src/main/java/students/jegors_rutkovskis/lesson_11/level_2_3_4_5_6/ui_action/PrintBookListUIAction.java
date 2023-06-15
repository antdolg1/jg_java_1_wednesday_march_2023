package students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6.ui_action;

import students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6.Book;
import students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6.BookDatabase;


import java.util.Comparator;
import java.util.List;

class PrintBookListUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public PrintBookListUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        List<Book> books = bookDatabase.getBookList();
        books.sort(Comparator.comparing(Book::getAuthor));
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
