package students.jegors_rutkovskis.lesson_4.level_1;

import java.util.Scanner;

class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = sc.nextInt();

        if (number % 2 == 0){
            System.out.println("The number is even!");
        } else {
            System.out.println("The number is odd!");
        }
    }
}
