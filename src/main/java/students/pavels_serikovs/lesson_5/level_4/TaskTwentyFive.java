package students.pavels_serikovs.lesson_5.level_4;

import java.util.Scanner;

public class TaskTwentyFive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array length: ");
        int size = scan.nextInt();
        int array[] = new int[size];
        System.out.println("Please insert array elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("Inserted arrays elements: ");
        for (int i = 0; i < size; i++) {
            System.out.println("[" + i + "]" + array[i]);
        }
        scan.close();
    }
}
