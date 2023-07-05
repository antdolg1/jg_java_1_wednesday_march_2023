package students.pavels_serikovs.lesson_5.level_4;

import java.util.Scanner;

public class TaskThirteen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array length: ");
        int size = scan.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print("[" + i + "]" + array[i] + "\n");
        }
        for (int element : array) {
            if (element % 2 != 0) {
                System.out.print("Odd elements from array: " + element + "; \n");
            }
        }
        scan.close();
    }
}
