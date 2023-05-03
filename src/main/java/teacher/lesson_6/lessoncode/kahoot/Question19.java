package teacher.lesson_6.lessoncode.kahoot;

public class Question19 {

    static int[] a = {0, 2, 3, 4};

    public static int test (int v) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == v) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        System.out.println("test method return result when v = 3 is: " + test(1));

    }

}
