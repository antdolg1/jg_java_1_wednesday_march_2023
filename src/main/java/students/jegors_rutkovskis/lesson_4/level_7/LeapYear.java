package students.jegors_rutkovskis.lesson_4.level_7;

/**
 *       return true - если год високосный
 *       return false - если год обычный
 *          Если год не делится на 4, значит он обычный.
 *          Иначе надо проверить не делится ли год на 100.
 *          Если не делится, значит это не столетие и можно сделать вывод, что год високосный.
 *          Если делится на 100, значит это столетие и его следует проверить его делимость на 400.
 *          Если год делится на 400, то он високосный.
 *          Иначе год обычный.
 */
class LeapYear {
    public boolean isLeapYear(int year){
        if (!isDividedByFour(year)){
            return false;
        } else if (!isDividedByHundred(year)) {
            return true;
        } else if (isDividedByFourHundred(year)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isDividedByFour(int number){
        return number % 4 == 0;
    }
    private boolean isDividedByHundred(int number){
        return number % 100 == 0;
    }
    private boolean isDividedByFourHundred(int number){
        return number % 400 == 0;
    }
}
