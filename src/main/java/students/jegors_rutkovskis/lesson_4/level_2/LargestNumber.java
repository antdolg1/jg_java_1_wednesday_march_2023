package students.jegors_rutkovskis.lesson_4.level_2;

import java.util.Scanner;

class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = sc.nextInt();

        if (firstNumber > secondNumber){
            System.out.println("The number " + firstNumber + " is greater than the number " + secondNumber);
        } else {
            System.out.println("The number " + secondNumber + " is greater than the number " + firstNumber);
        }
    }
}
