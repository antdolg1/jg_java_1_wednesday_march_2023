package students.edmund_zukovskis.lesson_12.level_1.task_5;

class ExceptionDemo {
    public static void main(String[] args) {
        try {
            Exception exception1 = new Exception();

            String message = "This is an exception.";
            Exception exception2 = new Exception(message);

            Throwable cause = new Throwable("This is the cause.");
            Exception exception3 = new Exception(message, cause);

            Exception exception4 = new Exception(cause);
            
            System.out.println("exception1: " + exception1);
            System.out.println("exception2: " + exception2);
            System.out.println("exception3: " + exception3);
            System.out.println("exception4: " + exception4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
