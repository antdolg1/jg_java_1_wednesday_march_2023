package students.andrej_mihailicenko.lesson_2.level_3;
import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Test Data: ");
        System.out.println("Input a number: ");
        int n = in.nextInt();
        System.out.println();
        System.out.println("Expected Output : ");

        for (int i = 1; i <= 10; i++)
            System.out.println(n + "*" + i + " =" + (n * i));

    }
}
