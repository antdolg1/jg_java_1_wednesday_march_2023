package students.edmund_zukovskis.lesson_4.lessoncode;

public class IfElseStatement {
    public static void main(String[] args) {

        int number = 0;

        if (number == 7) {
            System.out.println("Number is seven!");
        }

        if (number == 7) {
            System.out.println("Number is seven!" );
        } else {
            System.out.println("Number is not seven!");
        }

        if (number > 1) {
            System.out.println("Number is greater than one!" );
        } else if (number == 0) {
            System.out.println("Number is zero!");
        } else if (number < 0){
            System.out.println("Number is less than zero!");
        }
    }
}
