package students.jegors_rutkovskis.lesson_6.level_2;

import java.util.Scanner;

class DayOfTheWeekDetector {
    int getDayNumberFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number between 1 and 7: ");
        return sc.nextInt();
    }
    String findDayOfTheWeek(int dayNumber) {
        switch (dayNumber){
            case 1 -> {return "It's Monday!";}
            case 2 -> {return  "It's Tuesday!";}
            case 3 -> {return  "It's Wednesday!";}
            case 4 -> {return  "It's Thursday!";}
            case 5 -> {return  "It's Friday!";}
            case 6 -> {return  "It's Saturday!";}
            case 7 -> {return  "It's Sunday!";}
        }
        return "Wrong day! Enter number between 1 and 7 !!!";
    }
}
