package students.andrej_mihailicenko.lesson_5.level_2;
import java.util.Scanner;

class ArrayOfThreeUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];

        System.out.println("Enter first number! ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number! ");
        int num2 = scanner.nextInt();
        System.out.println("Enter third number! ");
        int num3 = scanner.nextInt();

        numbers[0] = num1;
        numbers[1] = num2;
        numbers[2] = num3;

        System.out.println("Numbers in array is:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
