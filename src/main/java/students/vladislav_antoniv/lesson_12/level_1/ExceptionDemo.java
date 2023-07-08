package students.vladislav_antoniv.lesson_12.level_1;

public class ExceptionDemo {
    public static void main(String[] args) {
        Exception exception1 = new Exception();

        Exception exception2 = new Exception("Text");

        Exception exception3 = new Exception("Text", new RuntimeException("Text"));


    }

}