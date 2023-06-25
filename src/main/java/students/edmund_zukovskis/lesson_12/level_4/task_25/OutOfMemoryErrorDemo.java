package students.edmund_zukovskis.lesson_12.level_4.task_25;

import java.util.ArrayList;
import java.util.List;

class OutOfMemoryErrorDemo {
    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();

        try {
            while (true) {
                objects.add(new Object());
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Error appeared OutOfMemoryError!");
            e.printStackTrace();
        }
    }
}
