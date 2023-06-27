package students.andrej_mihailicenko.lesson_12.level_4;

class OutOfMemoryErrorTask {

    public static void main(String[] args) {
        int[] array = new int[999999999];
        for (int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    //Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
    //	at students.andrej_mihailicenko.lesson_12.level_4.OutOfMemoryErrorTask.main(OutOfMemoryErrorTask.java:6)

}
