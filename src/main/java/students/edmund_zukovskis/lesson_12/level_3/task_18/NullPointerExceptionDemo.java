package students.edmund_zukovskis.lesson_12.level_3.task_18;

class NullPointerExceptionDemo {
    public static void main(String[] args) {

        String text = null;

        try {
            int length = text.length();
            System.out.println("Length of the line: " + length);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException appeared!");
            e.printStackTrace();
        }
    }

    /*
    NullPointerException appears when I try to call out length, but because I have null as a string it gives NullPointerException.
     */
}
