package students.vladislav_antoniv.lesson_4.level_1;
import java.util.Scanner;
public class PositiveOrNegativeOrNull {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scan.nextInt();

        if (number > 0){
            System.out.println("Number is positive");
        }
        else if(number < 0){
            System.out.println("Number is negative");
        }
        else{
            System.out.println("Number is zero");
        }
    }
}
