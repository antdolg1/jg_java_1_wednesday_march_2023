package students.jegors_rutkovskis.lesson_4.level_3;

import java.util.Scanner;

class BiggestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter second: ");
        int secondNumber = sc.nextInt();
        System.out.print("Enter third: ");
        int thirdNumber = sc.nextInt();

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber){
            System.out.println("Biggest is the number " + firstNumber);
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            System.out.println("Biggest is the number " + secondNumber);
        } else {
            System.out.println("Biggest is the number " + thirdNumber);
        }
    }
}
