package students.edmund_zukovskis.lesson_12.level_3.task_21;

class TestException extends Exception {
}

class Main {
    public static void main(String args[]) {
        try {
            throw new TestException();
        } catch (TestException t) {
            System.out.println("Got the Test Exception");
        } finally {
            System.out.println("Inside finally block ");
        }
    }

    //Какой результат мы получим?
    //1. Got the Test Exception
    //   Inside finally block

    //The try block throws a TestException.
    //In the catch block, the exception is caught and the message "Got the Test Exception" is displayed.
    //The finally block is then executed anyway, regardless of whether an exception was thrown or not.
    // In this case, it outputs the message "Inside finally block".
}
