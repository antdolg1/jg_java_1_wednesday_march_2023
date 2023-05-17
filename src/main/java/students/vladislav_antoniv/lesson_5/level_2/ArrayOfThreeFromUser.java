package students.vladislav_antoniv.lesson_5.level_2;

import java.util.Scanner;

public class ArrayOfThreeFromUser {
    public static void main(String[] args) {
        int numbers[] = new int[3];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            numbers[i] = scan.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(numbers[i]);
        }
    }
}