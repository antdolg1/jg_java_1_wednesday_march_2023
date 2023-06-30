package students.andrej_mihailicenko.lesson_12.level_1;

public class ExceptionDemo {
    Exception e1 = new Exception();

    Exception e2 = new Exception("Exception 1111");

    Exception e3 = new Exception("Exception1", new Throwable());

    Exception e4 = new Exception(new Throwable());

}
