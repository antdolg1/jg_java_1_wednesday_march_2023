package students.pavels_serikovs.lesson_5.level_2;

import java.util.Scanner;

class TaskEleven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = 3;
        int[] array = new int[3];
        System.out.println("Enter 3 elements of the array: ");
        for (int i = 0; i < number; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("Array elements you entered are: ");
        for (int i = 0; i < number; i++) {
            System.out.println("[" + i + "]" + array[i]);
        }
        scan.close();
    }
}
