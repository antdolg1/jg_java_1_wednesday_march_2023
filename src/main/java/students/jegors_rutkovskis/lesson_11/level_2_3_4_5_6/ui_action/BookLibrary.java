package students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6.ui_action;

import students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6.BookDatabase;
import students.jegors_rutkovskis.lesson_11.level_2_3_4_5_6.BookDatabaseImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class BookLibrary {
    private Map<Integer, UIAction> menuNumberToActionMap;

    public BookLibrary() {
        BookDatabase bookDatabase = new BookDatabaseImpl();

        menuNumberToActionMap = new HashMap();
        menuNumberToActionMap.put(1, new SaveBookUIAction(bookDatabase));
        menuNumberToActionMap.put(2, new DeleteByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(3, new DeleteBooksByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(4, new DeleteBooksByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(5, new FindByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(6, new FindBookByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(7, new FindBooksByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(8, new CountBooksUIAction(bookDatabase));
        menuNumberToActionMap.put(9, new PrintBookListUIAction(bookDatabase));
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println(menuList());
        while (true) {
            System.out.print("Please enter menu number: ");
            try {
                int userSelectedMenuNumber = Integer.parseInt(sc.nextLine());
                if (userSelectedMenuNumber == 0) {
                    System.out.println("Thank you! Good bye!");
                    break;
                } else {
                    executeUIAction(userSelectedMenuNumber);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid menu number: ");
            }
        }
    }

    public StringBuilder menuList() {
        StringBuilder sb = new StringBuilder();
        sb.append("******************************\n");
        sb.append("0.  Exit program \n");
        sb.append("1.  Save book \n");
        sb.append("2.  Delete book by ID \n");
        sb.append("3.  Delete books by Author \n");
        sb.append("4.  Delete books by Title \n");
        sb.append("5.  Find book by ID \n");
        sb.append("6.  Find books by Author \n");
        sb.append("7.  Find books by Title \n");
        sb.append("8.  Count all books in library \n");
        sb.append("9.  Print all books in library \n");
        sb.append("*******************************");
        return sb;
    }

    private void executeUIAction(int userSelectedMenuNumber) {
        UIAction uiAction = menuNumberToActionMap.get(userSelectedMenuNumber);
        if (uiAction != null) {
            uiAction.execute();
        } else {
            System.out.println("Menu item not exist: " + userSelectedMenuNumber);
        }
    }
}
