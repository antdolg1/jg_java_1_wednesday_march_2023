package teacher.lesson_10.lessoncode;

public class MathUtilsApp {
    public static void main(String[] args) {

        MathUtils math = new MathUtils();
        int sum1 = math.add(2, 3);
        double sum2 = math.add(2.5, 3.5);

        System.out.println(sum1);
        System.out.println(sum2);

    }
}
