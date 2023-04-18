package students.jegors_rutkovskis.lesson_4.level_1;

import java.util.Scanner;

class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number between 1 and 7: ");
        int dayOfTheWeek = sc.nextInt();

        switch (dayOfTheWeek){
            case 1 -> System.out.println("It's Monday!");
            case 2 -> System.out.println("It's Tuesday!");
            case 3 -> System.out.println("It's Wednesday!");
            case 4 -> System.out.println("It's Thursday!");
            case 5 -> System.out.println("It's Friday!");
            case 6 -> System.out.println("It's Saturday!");
            case 7 -> System.out.println("It's Sunday!");
            default -> System.out.println("Wrong day! Enter number between 1 and 7 !!!");
        }
    }
}
