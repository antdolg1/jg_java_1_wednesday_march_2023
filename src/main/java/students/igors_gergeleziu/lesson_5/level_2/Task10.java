package students.igors_gergeleziu.lesson_5.level_2;

import java.util.Random;

class Task10 {
    public static void main(String[] args) {
        int[] array = new int[3];
        Random random = new Random();
        array[0] = random.nextInt(101);
        array[1] = random.nextInt(101);
        array[2] = random.nextInt(101);
        System.out.println("Array[0]= " + array[0]);
        System.out.println("Array[1]= " + array[1]);
        System.out.println("Array[2]= " + array[2]);
    }

}
