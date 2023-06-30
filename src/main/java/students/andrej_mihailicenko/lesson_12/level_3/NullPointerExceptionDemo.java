package students.andrej_mihailicenko.lesson_12.level_3;

class NullPointerExceptionDemo {
    public static void main(String[] args) {
    Integer number = null;

        System.out.println(number.toString());
        //java.lang.NullPointerException
        // в результате обращения к null;
    }
}
