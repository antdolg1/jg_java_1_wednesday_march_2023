package students.andrej_mihailicenko.lesson_4.level_7;

public class LeapYear {
    public boolean isLeapYear(int year) {
        if (year % 4 != 0) { // Если год не делится на 4, значит он обычный.
            return false;
        } else if (year % 100 != 0) { // Иначе надо проверить не делится ли год на 100.
            return true;         // Если не делится, значит это не столетие и можно сделать вывод, что год високосный.
        } else if (year % 400 != 0) { // Если делится на 100, значит это столетие и его следует проверить его делимость на 400.
            return false; // Иначе год обычный.
        } else {
            return true; // Если год делится на 400, то он високосный.
        }
    }
}