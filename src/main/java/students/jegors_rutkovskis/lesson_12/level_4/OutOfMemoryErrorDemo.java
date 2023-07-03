package students.jegors_rutkovskis.lesson_12.level_4;

import java.util.ArrayList;
import java.util.List;

class OutOfMemoryErrorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        while (true) {
            try {
                list.add(new String());
            } catch (OutOfMemoryError error) {
                System.out.println(error.getMessage());
                break;
            }
        }
    }
}
