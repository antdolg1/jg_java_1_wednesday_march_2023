package students.jegors_rutkovskis.lesson_4.level_3;

import java.util.Scanner;

class IncreaseOrDecreaseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter second: ");
        int secondNumber = sc.nextInt();
        System.out.print("Enter third: ");
        int thirdNumber = sc.nextInt();

        if (firstNumber < secondNumber && secondNumber < thirdNumber){
            System.out.println("increasing");
        } else if (firstNumber > secondNumber && secondNumber > thirdNumber) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
