package students.pavels_serikovs.lesson_5.level_2;

class TaskThirteen {
    public static void main(String[] args) {
        int[] array = new int[3];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print("[" + i + "]" + array[i] + "\n");
            sum += array[i];
        }
        System.out.println("Arrays elements sum is " + sum);
    }
}
