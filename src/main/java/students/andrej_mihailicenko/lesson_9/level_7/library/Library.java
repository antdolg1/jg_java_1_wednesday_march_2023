package students.andrej_mihailicenko.lesson_9.level_7.library;

import java.util.ArrayList;

class Library {
    private ArrayList<Books> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public Books findBook(String title) {
        for (Books books : books) {
            if (books.getTitle().equals(title)) {
                return books;
            }
        }
        return null;
    }

}
