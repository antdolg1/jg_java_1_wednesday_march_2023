package students.vladislav_antoniv.lesson_4.level_2;
import java.util.Scanner;

public class IsNumbersEqualOrDifferent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = scan.nextInt();
        System.out.println("Enter second number");
        int secondNumber = scan.nextInt();

        if (firstNumber == secondNumber){
            System.out.println("Numbers are equal");
        }
        else{
            System.out.println("Numbers are different");
        }
    }
}
