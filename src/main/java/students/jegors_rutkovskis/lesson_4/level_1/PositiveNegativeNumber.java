package students.jegors_rutkovskis.lesson_4.level_1;

import java.util.Scanner;

class PositiveNegativeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter positive or negative number: ");
        int number = sc.nextInt();

        if (number > 0){
            System.out.println("Your number " + number + " is positive!");
        } else {
            System.out.println("Your number " + number + " is negative!");
        }
    }

}
