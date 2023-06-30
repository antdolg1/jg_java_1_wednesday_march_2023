package students.andrej_mihailicenko.lesson_12.level_1;


class MyException4 extends Exception {
    public MyException4(String message) {
        super(message);
    }

    public static void main(String[] args) {
        try {
            throw new MyException4("Exception");
        } catch (MyException4 e) {
            System.out.println("Caught Exception " + e.getMessage());
        }
    }

}
