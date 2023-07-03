package students.pavels_serikovs.lesson_5.level_2;

class TaskFifteen {
    public static void main(String[] args) {
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print("[" + i + "]" + array[i] + "\n");
        }
        System.out.println("Arrays update:");
        for (int i = 0; i < array.length; i++) {
            array[i] += 2;
            System.out.print("[" + i + "]" + array[i] + "\n");
        }
    }
}
