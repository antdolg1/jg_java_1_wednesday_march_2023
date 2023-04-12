package teacher.lesson_4.lessoncode;

public class IfElseStatementWithString {

    public static void main(String[] args) {

        String fruit = "pineapple";
        //if-elseif-else
//        if (fruit.equals("orange")) {
//            System.out.println("Orange");
//        } else if (fruit.equals("banana")) {
//            System.out.println("Yellow");
//        } else if (fruit.equals("apple")) {
//            System.out.println("red");
//        } else {
//            System.out.println("Unknown fruit!");
//        }

        //switch statement
        switch (fruit) {
            case "orange":
                System.out.println("Orange");
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
