package students.edmund_zukovskis.lesson_4.level_1.task_4;

import java.util.Scanner;

class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        System.out.print("Please input number: ");
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            if (number%2 == 0){
                System.out.println("Number" + " " + number + " " + "even number");
            } else {
                System.out.println("You entered odd number");
            }
        }
    }
}
