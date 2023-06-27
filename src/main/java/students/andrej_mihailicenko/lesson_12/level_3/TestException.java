package students.andrej_mihailicenko.lesson_12.level_3;

class TestException extends Exception { }

class Main {
    public static void main(String args[]) {
        try {
            throw new TestException();
        } catch(TestException t) {
            System.out.println("Got the Test Exception");
        } finally {
            System.out.println("Inside finally block ");
        }
    }

//    Какой класс в Java является главным в иерархии классов ошибок?
//    - java.lang.Object
//    - java.lang.Throwable
//    - java.lang.Exception
//
//    Главный класс Throwable. Exception и Error наследуются от Throwable.
}
