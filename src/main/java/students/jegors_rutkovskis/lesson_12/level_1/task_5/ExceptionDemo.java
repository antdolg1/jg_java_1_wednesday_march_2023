package students.jegors_rutkovskis.lesson_12.level_1.task_5;

import java.util.Arrays;

class ExceptionDemo {
    public static void main(String[] args) {
        Exception messageException = new Exception("exception");
        System.out.println(messageException.getMessage());

        Exception exception = new Exception();
        System.out.println(Arrays.toString(exception.getStackTrace()));
    }

}
