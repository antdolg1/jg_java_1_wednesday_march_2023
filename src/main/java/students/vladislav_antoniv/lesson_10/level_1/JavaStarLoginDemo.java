package students.vladislav_antoniv.lesson_10.level_1;

import java.util.Scanner;

public class JavaStarLoginDemo extends JavaStarLoginServiceImpl {
    public static void main(String[] args) {
        JavaStarLoginServiceImpl login = new JavaStarLoginServiceImpl();
        Scanner scanner = new Scanner(System.in);
        login.setLogin(scanner.nextLine());
        login.setPassword(scanner.nextLine());
        if (login.canLogin(login.getLogin(), login.getPassword()) == true) {
            System.out.println("ACCESS GRANTED");
        } else {
            System.out.println("ACCESS DENIED");
        }
    }
}
