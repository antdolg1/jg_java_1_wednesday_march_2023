package students.vladislav_antoniv.lesson_2.level_2;
import java.util.Scanner;
public class HelloUserName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String userName = scan.nextLine();
        System.out.println("Hello " + userName + "!");
    }
}
