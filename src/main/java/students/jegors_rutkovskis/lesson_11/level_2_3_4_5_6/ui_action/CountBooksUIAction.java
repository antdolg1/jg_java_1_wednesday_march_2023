package students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6.ui_action;

import students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6.BookDatabase;

class CountBooksUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public CountBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println("Count of books in library is: " + bookDatabase.countAllBooks());
    }
}
