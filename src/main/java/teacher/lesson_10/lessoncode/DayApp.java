package teacher.lesson_10.lessoncode;

import java.time.LocalDate;

public class DayApp {

    public static void main(String[] args) {

        LocalDate todayDate = LocalDate.now();
        String todayAsStringFromLocalDate = todayDate.getDayOfWeek().toString();
        System.out.println(todayAsStringFromLocalDate);

        Day today = Day.WEDNESDAY;
        String todayAsString = today.name();

        System.out.println(today);

        if (todayAsStringFromLocalDate.equals(todayAsString)) {
            System.out.println("YESSS today is Wednesday");
        }

        if (today == Day.WEDNESDAY) {
            System.out.println("Today is Wednesday");
            System.out.println("Today is " + todayAsString);
            System.out.println("Сегодня " + today.getName());
            System.out.println(today.getName() + " является " + today.getOrder() + " днём недели!");
        }

        System.out.println();
        //iteration through enum values
        for (Day day : Day.values()) {
            System.out.println(day);
        }

    }

}
