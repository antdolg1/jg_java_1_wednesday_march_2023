package students.edmund_zukovskis.lesson_4.lessoncode;

public class IfElseStatementWithString {
    public static void main(String[] args) {

        String fruit = "pineapple";


        // switch statement
        switch (fruit) {
            case "orange":
                System.out.println("orange");
                break;
            case "banana":
                System.out.println("Yellow");
                break;
            case "apple":
                System.out.println("Red");
                break;
            default:
                System.out.println("Unknown fruit");
                break;
        }
    }
}
// String we only use equals not ==