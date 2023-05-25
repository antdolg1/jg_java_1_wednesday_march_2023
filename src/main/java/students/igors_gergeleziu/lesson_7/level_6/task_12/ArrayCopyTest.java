package students.igors_gergeleziu.lesson_7.level_6.task_12;

class ArrayCopyTest {
    public static void main(String[] args) {
        ArrayCopy copy= new ArrayCopy();
        int[]array={1,2,3,4,5,6,7,8,9};
       copy.printArray(copy.copyInRange(array, 4,7));
    }
}
