package students.pavels_serikovs.lesson_5.level_4;

import java.util.Scanner;

class TaskTwentyEight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array length: ");
        int size = scan.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print("[" + i + "]" + array[i] + "\n");
        }
        int minNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
        }
        System.out.print("The min number is " + minNumber);
        scan.close();
    }
}
