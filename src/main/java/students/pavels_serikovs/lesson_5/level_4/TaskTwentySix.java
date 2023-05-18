package students.pavels_serikovs.lesson_5.level_4;

import java.util.Scanner;

public class TaskTwentySix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array length: ");
        int size = scan.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print("[" + i + "]" + array[i] + "\n");
        }
        scan.close();
    }
}
