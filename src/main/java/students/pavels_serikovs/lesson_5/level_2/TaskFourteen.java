package students.pavels_serikovs.lesson_5.level_2;

public class TaskFourteen {
    public static void main(String[] args) {
        int[] array = new int[3];
        double sum = 0;
        double sumAverage = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print("[" + i + "]" + array[i] + "\n");
            sum += array[i];
            sumAverage = sum / array.length;
        }
        System.out.println("Arrays elements sum is " + sum);
        System.out.println("Arrays elements average number is " + sumAverage);
    }
}
