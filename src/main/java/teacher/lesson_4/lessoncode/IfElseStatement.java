package teacher.lesson_4.lessoncode;

public class IfElseStatement {

    public static void main(String[] args) {

        int number = 0;

        //if statement
        if (number == 7) {
            System.out.println("Number is seven!");
        }

        System.out.println("______________________");

        //if-else statement
        if (number == 7) {
            System.out.println("Number is seven!");
        } else {
            System.out.println("Number is not seven!");
        }

        System.out.println("______________________");

        //if-elseif
        if (number > 1) {
            System.out.println("Number is greater than one!");
        } else if (number == 0) {
            System.out.println("Number is zero!");
        } else if (number < 0) {
            System.out.println("Number is less than zero!");
        }

        System.out.println("______________________");

        //if-elseif-else
        if (number > 0) {
            System.out.println("Number is positive!");
        } else if (number < 0) {
            System.out.println("Number is negative!");
        } else {
            System.out.println("Number is zero!");
        }
    }
}
