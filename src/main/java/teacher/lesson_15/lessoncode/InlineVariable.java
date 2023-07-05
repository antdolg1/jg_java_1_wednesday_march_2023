package teacher.lesson_15.lessoncode;

public class InlineVariable {

    boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEvenInlined(int number) {
        return number % 2 == 0;
    }

}
