package students.edmund_zukovskis.lesson_4.lessoncode;

public class IfStatement {
    public static void main(String[] args) {

        int number = 40;

        if (number > 30) {
            System.out.println("Number is greater than 30!" );
            System.out.println("Number is greater than 20!" );
        }
        /*
        if (number > 30)
            System.out.println("Number is greater than 30!");
            don't do this without {}
         */

        if (number < 20) {
            System.out.println("Number is less than 20!" );
        }

        int number2 = -2;

        if (number2 > 0) {
            System.out.println("Number2 is greater than zero!" );
        }
    }
}
