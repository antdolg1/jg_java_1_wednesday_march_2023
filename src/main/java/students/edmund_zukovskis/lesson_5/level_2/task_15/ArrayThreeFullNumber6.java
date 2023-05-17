package students.edmund_zukovskis.lesson_5.level_2.task_15;

class ArrayThreeFullNumber6 {
    public static void main(String[] args) {

        int[] numbers = new int[3];
        numbers[0] = 3;
        numbers[1] = 5;
        numbers[2] = 7;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("[" + i + "] " + "= " + numbers[i]);
        }
        System.out.println("");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] + 2;
        }
        System.out.println("Updated array numbers are: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("[" + i + "] " + "= " + numbers[i]);
        }
    }
}
